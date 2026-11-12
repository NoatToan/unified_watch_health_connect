package com.huawei.hianalytics;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hianalytics.core.log.LogAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements LogAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11463a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11464b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11465c = "FormalHASDK";

    public static void a(int i, String str, String str2) {
        int length = str2.length();
        int i2 = 3000;
        int i3 = 0;
        for (int i4 = 0; i4 < (length / 3000) + 1; i4++) {
            if (length > i2) {
                if (i == 3) {
                    Log.d(str, str2.substring(i3, i2));
                } else if (i == 5) {
                    Log.w(str, str2.substring(i3, i2));
                } else if (i != 6) {
                    Log.i(str, str2.substring(i3, i2));
                } else {
                    Log.e(str, str2.substring(i3, i2));
                }
                int i5 = i2;
                i2 += 3000;
                i3 = i5;
            } else if (i == 3) {
                Log.d(str, str2.substring(i3, length));
            } else if (i == 5) {
                Log.w(str, str2.substring(i3, length));
            } else if (i != 6) {
                Log.i(str, str2.substring(i3, length));
            } else {
                Log.e(str, str2.substring(i3, length));
            }
        }
    }

    @Override // com.huawei.hianalytics.core.log.LogAdapter
    public final void init(int i, String str) {
        if (this.f11463a) {
            return;
        }
        this.f11464b = i;
        this.f11463a = true;
        this.f11465c = str;
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("======================================= ");
        sb.append(System.lineSeparator());
        sb.append(this.f11465c + "_3.2.14.504");
        sb.append(System.lineSeparator());
        sb.append("=======================================");
        Log.i(str, sb.toString());
    }

    @Override // com.huawei.hianalytics.core.log.LogAdapter
    public final boolean isLoggable(int i) {
        return this.f11463a && i >= this.f11464b;
    }

    @Override // com.huawei.hianalytics.core.log.LogAdapter
    public final void println(int i, String str, String str2) {
        String str3 = str + "==> " + str2;
        if (TextUtils.isEmpty(this.f11465c)) {
            a(i, "FormalHASDK", str3);
        } else {
            a(i, this.f11465c, str3);
        }
    }
}
