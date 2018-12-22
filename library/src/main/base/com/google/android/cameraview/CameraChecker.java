package com.google.android.cameraview;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Jessewo on 2017/7/14.
 */

public class CameraChecker {

    /**
     * 判断是否支持闪光灯
     *
     * @param context
     * @return
     */
    public static boolean isSupportFlashLight(Context context) {
        //        return camera != null && camera.getParameters().getSupportedFlashModes() != null;//部分手机失效
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    }

    /**
     * 是否支持自动对焦
     *
     * @param context
     * @return
     */
    public static boolean isSupportAutoFocus(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_AUTOFOCUS);
    }

    /**
     * 是否支持前置镜头
     *
     * @param context
     * @return
     */
    public static boolean isHaveCameraFront(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);
    }
}
