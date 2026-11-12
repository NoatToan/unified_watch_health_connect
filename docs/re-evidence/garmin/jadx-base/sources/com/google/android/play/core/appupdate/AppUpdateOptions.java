package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AppUpdateOptions {

    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z14);

        public abstract Builder setAppUpdateType(@AppUpdateType int i14);
    }

    public static AppUpdateOptions defaultOptions(@AppUpdateType int i14) {
        return newBuilder(i14).build();
    }

    public static Builder newBuilder(@AppUpdateType int i14) {
        zzv zzvVar = new zzv();
        zzvVar.setAppUpdateType(i14);
        zzvVar.setAllowAssetPackDeletion(false);
        return zzvVar;
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
