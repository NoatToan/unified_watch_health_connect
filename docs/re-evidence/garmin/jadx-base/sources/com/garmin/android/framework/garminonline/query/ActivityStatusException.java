package com.garmin.android.framework.garminonline.query;

import com.google.mlkit.common.MlKitException;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
public class ActivityStatusException extends QueryException {
    private final int mActivityStatus;

    public ActivityStatusException(int i14) {
        super(e0.f(i14, "Bad activity status [", "]"), getErrorCode(i14));
        this.mActivityStatus = i14;
    }

    public static int getErrorCode(int i14) {
        if (i14 == 1) {
            return 201;
        }
        if (i14 == 2) {
            return 202;
        }
        if (i14 == 10) {
            return MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE;
        }
        if (i14 == 11) {
            return MlKitException.CODE_SCANNER_TASK_IN_PROGRESS;
        }
        if (i14 == 20) {
            return MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
        }
        if (i14 == 25) {
            return MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR;
        }
        if (i14 != 35) {
            return i14 != 45 ? 200 : 208;
        }
        return MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
    }

    public int getActivityStatus() {
        return this.mActivityStatus;
    }
}
