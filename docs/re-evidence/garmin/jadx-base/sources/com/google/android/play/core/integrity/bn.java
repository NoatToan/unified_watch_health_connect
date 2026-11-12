package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f53353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f53354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f53356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f53357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f53358f;

    public bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f53356d = taskCompletionSource;
        this.f53355c = context.getPackageName();
        this.f53354b = sVar;
        this.f53357e = atVar;
        this.f53358f = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", bo.f53359a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.h.b(iBinder);
            }
        }, null);
        this.f53353a = aeVar;
        aeVar.c().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j8, long j14, int i14) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f53355c);
        bundle.putLong("cloud.prj", j8);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j14);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j8, int i14) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f53355c);
        bundle.putLong("cloud.prj", j8);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i14) {
        return bnVar.f53356d.getTask().isSuccessful() && ((Integer) bnVar.f53356d.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.f53356d.getTask().isSuccessful() && ((Integer) bnVar.f53356d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i14 = bundle.getInt("dialog.intent.type");
        this.f53354b.d("requestAndShowDialog(%s)", Integer.valueOf(i14));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f53353a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i14), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j8, long j14, int i14) {
        this.f53354b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j14));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f53353a.t(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j8, j14, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j8, int i14) {
        this.f53354b.d("warmUpIntegrityToken(%s)", Long.valueOf(j8));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f53353a.t(new bf(this, taskCompletionSource, 0, j8, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
