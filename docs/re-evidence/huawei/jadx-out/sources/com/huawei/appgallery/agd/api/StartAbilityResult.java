package com.huawei.appgallery.agd.api;

import android.content.Intent;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes23.dex */
public class StartAbilityResult extends BaseServiceResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5198a;
    private int e;
    private String h;

    interface StartResultCode {
        public static final int ABILITY_START_FAILED = 1;
        public static final int ABILITY_START_INVALID = -1;
        public static final int ABILITY_START_SUCCESS = 0;
    }

    public String toString() {
        return "StartAbilityResult{loadResult=" + this.d + ", startResult=" + this.e + ", bundleName='" + this.f5191b + "', moduleNameName='" + this.f5198a + "', abilityNameName='" + this.h + "', callerContext='" + this.f5192c + "'}";
    }

    public String getStartResultDesc() {
        int i = this.e;
        if (i == -1) {
            return "ABILITY_START_INVALID";
        }
        if (i == 0) {
            return "ABILITY_START_SUCCESS";
        }
        if (i == 1) {
            return "ABILITY_START_FAILED";
        }
        return "unknown result " + this.e;
    }

    public int getStartResult() {
        return this.e;
    }

    public String getModuleName() {
        return this.f5198a;
    }

    public String getAbilityName() {
        return this.h;
    }

    public static StartAbilityResult from(Intent intent) {
        if (intent == null) {
            return null;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        StartAbilityResult startAbilityResult = new StartAbilityResult();
        startAbilityResult.d = safeIntent.getIntExtra("loadResultCode", -1);
        startAbilityResult.e = safeIntent.getIntExtra("startResultCode", -1);
        startAbilityResult.f5191b = safeIntent.getStringExtra("bundleName");
        startAbilityResult.f5198a = safeIntent.getStringExtra("moduleName");
        startAbilityResult.h = safeIntent.getStringExtra("abilityName");
        startAbilityResult.f5192c = safeIntent.getStringExtra("callerContext");
        return startAbilityResult;
    }

    private StartAbilityResult() {
    }
}
