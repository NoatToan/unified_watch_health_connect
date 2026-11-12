package com.alipay.sdk.m.l0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.agconnect.common.aaid.AaidUtils;
import defpackage.mo;
import defpackage.mv;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        mo moVar;
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        mv.a("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
        if (intExtra == 1) {
            if (!TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                return;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra == null || !stringArrayListExtra.contains(context.getPackageName())) {
                return;
            }
        } else if (intExtra != 0) {
            return;
        }
        String stringExtra = intent.getStringExtra("openIdType");
        mv mvVarC = mv.c();
        if ("oaid".equals(stringExtra)) {
            moVar = mvVarC.e;
        } else if ("vaid".equals(stringExtra)) {
            moVar = mvVarC.g;
        } else if (AaidUtils.f4803a.equals(stringExtra)) {
            moVar = mvVarC.f42478c;
        } else {
            moVar = "udid".equals(stringExtra) ? mvVarC.f42477a : null;
        }
        if (moVar == null) {
            return;
        }
        moVar.d();
    }
}
