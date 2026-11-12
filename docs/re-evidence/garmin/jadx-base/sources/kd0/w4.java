package kd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkd0/w4;", "La31/e;", "Landroid/content/Context;", "applicationContext", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Landroid/content/Context;Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w4 implements a31.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f104413b;

    public w4(Context context, b31.f fVar) {
        context.getClass();
        fVar.getClass();
        this.f104412a = context;
        this.f104413b = fVar;
    }

    @Override // a31.e
    public final void a(long j8, e31.a aVar) {
        aVar.getClass();
        this.f104413b.a(j8, aVar);
    }

    @Override // a31.e
    public final void b(e31.a aVar) {
        aVar.getClass();
        this.f104413b.b(aVar);
    }

    @Override // a31.e
    public final void c() {
        FetchDevicesOnboardingWorker.f39672j.getClass();
        FetchDevicesOnboardingWorker.a.a(this.f104412a);
    }
}
