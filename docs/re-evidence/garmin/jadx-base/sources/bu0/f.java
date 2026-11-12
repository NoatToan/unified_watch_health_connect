package bu0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.domain.GetVo2MaxNotificationDetailsUseCase", f = "GetVo2MaxNotificationDetailsUseCase.kt", l = {24, 34}, m = "invoke", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f21199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f21201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f21201d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21200c = obj;
        this.f21202e |= Integer.MIN_VALUE;
        return this.f21201d.a(null, null, this);
    }
}
