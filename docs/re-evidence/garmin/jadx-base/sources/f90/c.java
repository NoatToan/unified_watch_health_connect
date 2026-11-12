package f90;

import p005kotlin.Metadata;
import q92.v;
import q92.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.consent.CheckConsentUseCase", f = "CheckConsentUseCase.kt", l = {21, 23, 28}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f69965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f69966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f69968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f69969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f69969e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69968d = obj;
        this.f69970f |= Integer.MIN_VALUE;
        return this.f69969e.a(null, false, this);
    }
}
