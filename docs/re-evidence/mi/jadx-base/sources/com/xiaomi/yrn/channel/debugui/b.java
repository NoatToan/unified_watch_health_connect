package com.xiaomi.yrn.channel.debugui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import defpackage.bzr;
import defpackage.qyr;
import defpackage.xwr;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public YRNDebugTraceView f14530a;

    /* JADX INFO: renamed from: com.xiaomi.yrn.channel.debugui.b$b, reason: collision with other inner class name */
    public static class C0902b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14531a = new b();
    }

    public static b b() {
        return C0902b.f14531a;
    }

    public final boolean a(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return true;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        context.startActivity(intent);
        bzr.k("请开通悬浮窗权限");
        return false;
    }

    public void c() {
        YRNDebugTraceView yRNDebugTraceView = this.f14530a;
        if (yRNDebugTraceView != null) {
            yRNDebugTraceView.j();
        }
        xwr.c().e(this.f14530a);
    }

    public boolean d() {
        return xwr.c().f(this.f14530a);
    }

    public void e(Context context) {
        if (context == null || !a(context) || xwr.c().f(this.f14530a)) {
            return;
        }
        if (this.f14530a == null) {
            YRNDebugTraceView yRNDebugTraceView = new YRNDebugTraceView(context);
            this.f14530a = yRNDebugTraceView;
            yRNDebugTraceView.setAlpha(0.8f);
        }
        this.f14530a.i();
        this.f14530a.setOnDebugTraceListener(new YRNDebugTraceView.b() { // from class: txr
            @Override // com.xiaomi.yrn.channel.debugui.YRNDebugTraceView.b
            public final void a() {
                this.f35170a.c();
            }
        });
        xwr.c().g(context, this.f14530a, qyr.a(context, 260.0f), qyr.a(context, 300.0f));
    }

    public b() {
    }
}
