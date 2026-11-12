package com.huawei.hms.hatool;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13465a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13466b = 4;

    public boolean b(int i) {
        return this.f13465a && i >= this.f13466b;
    }

    public void b(int i, String str, String str2) {
        a(i, "FormalHASDK", str + "=> " + str2);
    }

    public void a(int i, String str, String str2) {
        if (i == 3) {
            Log.d(str, str2);
            return;
        }
        if (i == 5) {
            Log.w(str, str2);
        } else if (i != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public void a(int i) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.f13466b = i;
        this.f13465a = true;
    }

    private static String a() {
        return "FormalHASDK_2.2.0.315" + p.a();
    }
}
