/**
 * 
 */
package com.lzf.ArcGIS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//以下导入用于将底图添加到地图并将该地图显示到地图视图。
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

/**
 * @author MJCoder
 *
 */
public class MyMapApp extends Application {

	// 添加一个用于地图视图的私有变量，以便在应用程序完成时处理它。
	private MapView mapView;

	@Override
	public void start(Stage stage) throws Exception {

		// create stack pane and application scene
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane);

		// 打开以为“Display Map Sample”标题的空窗口。
		// set title, size, and add scene to stage
		stage.setTitle("Display Map Sample");
		stage.setWidth(800);
		stage.setHeight(700);
		stage.setScene(scene);
		stage.show();

		// 创建一个ArcGISMap实例，该类定义地图的内容。
		// create a ArcGISMap with the a Basemap instance with an Imagery base layer
		ArcGISMap map = new ArcGISMap(Basemap.createImagery());
		// set the map to be displayed in this view
		// 创建链接到Map类的MapView JavaFX可视组件。
		mapView = new MapView();
		// 将ArcGISMap的实例map添加到用于地图视图mapView。
		mapView.setMap(map);
		// 使用StackPane布局将MapView添加到JavaFX应用程序。
		// add the map view to stack pane
		stackPane.getChildren().addAll(mapView);
	}

	/**
	 * 覆盖停止方法以在应用程序关闭时处理应用程序资源。
	 * 
	 * Stops and releases all resources used in application.
	 */
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}

	/**
	 * Opens and runs application.
	 *
	 * @param args
	 *            arguments passed to this application
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}
}