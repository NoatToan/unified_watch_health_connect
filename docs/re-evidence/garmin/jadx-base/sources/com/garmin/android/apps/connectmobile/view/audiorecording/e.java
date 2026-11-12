package com.garmin.android.apps.connectmobile.view.audiorecording;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r0.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/e;", "", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/e$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/view/audiorecording/e$a;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f47616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f47617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47620e;

    public interface a {
        void a(String str, int i14, long j8, boolean z14);
    }

    public e(a aVar) {
        aVar.getClass();
        this.f47616a = new Handler(Looper.getMainLooper());
        this.f47619d = 150L;
        this.f47620e = true;
        this.f47617b = new h(10, this, aVar);
    }

    public final void a() {
        h hVar = this.f47617b;
        if (hVar == null) {
            s.m("runnable");
            throw null;
        }
        this.f47616a.removeCallbacks(hVar);
        this.f47618c = 0L;
    }
}
