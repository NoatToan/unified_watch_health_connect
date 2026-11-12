package com.huawei.appgallery.agd.api;

import android.content.Intent;
import com.huawei.appmarket.service.externalservice.distribution.opendetail.ModuleInfo;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class OpenDetailResult extends BaseServiceResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5194a;
    private List<ModuleInfo> e;

    interface DisplayResultCode {
        public static final int FA_DISPLAY_FAILED = 1;
        public static final int FA_DISPLAY_INVALID = -1;
        public static final int FA_DISPLAY_SUCCESS = 0;
        public static final int FA_FILTER_EMPTY = 2;
    }

    public String toString() {
        return "OpenDetailResult{loadResult=" + this.d + ", displayResult=" + this.f5194a + ", bundleName='" + this.f5191b + "', callerContext='" + this.f5192c + "', addToDeskModuleInfo=" + this.e + '}';
    }

    public List<ModuleInfo> getModules() {
        return this.e;
    }

    public String getDisplayResultDesc() {
        int i = this.f5194a;
        if (i == -1) {
            return "FA_DISPLAY_INVALID";
        }
        if (i == 0) {
            return "FA_DISPLAY_SUCCESS";
        }
        if (i == 1) {
            return "FA_DISPLAY_FAILED";
        }
        if (i == 2) {
            return "FA_FILTER_EMPTY";
        }
        return "unknown result " + this.f5194a;
    }

    public int getDisplayResult() {
        return this.f5194a;
    }

    public static OpenDetailResult from(Intent intent) {
        if (intent == null) {
            return null;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        OpenDetailResult openDetailResult = new OpenDetailResult();
        if (safeIntent.hasExtra("result")) {
            a(safeIntent, openDetailResult);
        } else {
            e(safeIntent, openDetailResult);
        }
        openDetailResult.f5191b = safeIntent.getStringExtra("bundleName");
        openDetailResult.f5192c = safeIntent.getStringExtra("callerContext");
        return openDetailResult;
    }

    private static void a(SafeIntent safeIntent, OpenDetailResult openDetailResult) {
        int i;
        openDetailResult.d = safeIntent.getIntExtra("result", -1);
        int i2 = openDetailResult.d;
        if (i2 != 100) {
            if (i2 == 101) {
                i = 1;
            } else {
                openDetailResult.f5194a = -1;
            }
            openDetailResult.e = safeIntent.getParcelableArrayListExtra("module_list");
        }
        i = 0;
        openDetailResult.f5194a = i;
        openDetailResult.e = safeIntent.getParcelableArrayListExtra("module_list");
    }

    private static void e(SafeIntent safeIntent, OpenDetailResult openDetailResult) {
        openDetailResult.d = safeIntent.getIntExtra("loadResultCode", -1);
        openDetailResult.f5194a = safeIntent.getIntExtra("displayResultCode", -1);
        openDetailResult.e = safeIntent.getParcelableArrayListExtra("moduleList");
    }

    private OpenDetailResult() {
    }
}
