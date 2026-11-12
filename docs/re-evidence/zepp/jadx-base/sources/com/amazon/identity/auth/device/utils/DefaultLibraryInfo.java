package com.amazon.identity.auth.device.utils;

import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.authorization.Stage;
import com.amazon.identity.auth.map.device.utils.MAPLog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultLibraryInfo {
    private static final String TAG = "com.amazon.identity.auth.device.utils.DefaultLibraryInfo";
    private static Stage stage = Stage.PROD;
    private static Region region = Region.AUTO;

    public static synchronized Region getLibraryRegion() {
        return region;
    }

    public static synchronized Stage getOverrideLibraryStage() {
        return stage;
    }

    public static synchronized boolean isDevo() {
        return !isProd();
    }

    public static synchronized boolean isProd() {
        return stage == Stage.PROD;
    }

    public static synchronized void setLibraryRegion(Region region2) {
        region = region2;
        MAPLog.i(TAG, "App Region overwritten : " + region.toString());
    }

    public static synchronized void setOverrideAppStage(Stage stage2) {
        stage = stage2;
        MAPLog.i(TAG, "App Stage overwritten : " + stage.toString());
    }
}
