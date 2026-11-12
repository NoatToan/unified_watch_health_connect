package com.huawei.hms.scankit.p;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f15961c = "a1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15962a = "UNKNOWN";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15963b;

    public a1(Context context, boolean z) {
        this.f15963b = "UNKNOWN";
        a(context, z);
        this.f15963b = this.f15963b.toUpperCase(Locale.ENGLISH);
    }

    public String a() {
        return this.f15963b;
    }

    private void a(Context context, boolean z) {
        if (context != null) {
            try {
                this.f15963b = GrsApp.getInstance().getIssueCountryCode(context);
                if (b()) {
                    Logger.i(f15961c, "getCountryCode unknown");
                }
            } catch (NullPointerException unused) {
                Logger.w(f15961c, "get CountryCode error");
            } catch (Exception unused2) {
                Logger.w(f15961c, "get CountryCode error");
            }
        }
    }

    private boolean b() {
        return !"UNKNOWN".equals(this.f15963b);
    }
}
