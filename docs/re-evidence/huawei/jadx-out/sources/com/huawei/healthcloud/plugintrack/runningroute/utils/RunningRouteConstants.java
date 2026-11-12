package com.huawei.healthcloud.plugintrack.runningroute.utils;

import defpackage.jpg;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jpg f10567a = new jpg(39.908722d, 116.397499d);

    public enum BiFromActivity {
        INVALID(0),
        FROM_LIST(1),
        FROM_MAP(2),
        FROM_DEEPLINK(3),
        FROM_HISTORY(5),
        FROM_SPORT_RECORD(6),
        FROM_RECORD_LIST_DIALOG(7),
        FROM_RECORD_DIALOG(8);

        private int mIndex;

        BiFromActivity(int i) {
            this.mIndex = i;
        }

        public int getIndex() {
            return this.mIndex;
        }
    }
}
