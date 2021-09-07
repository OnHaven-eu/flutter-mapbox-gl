package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    flutterEngine.getPlugins().add(new com.lyokone.location.LocationPlugin());
    flutterEngine.getPlugins().add(new com.mapbox.mapboxgl.MapboxMapsPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
  }
}
