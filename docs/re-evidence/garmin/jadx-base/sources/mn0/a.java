package mn0;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetDevicePulseOxSettingsNavArgsUseCase", f = "GetDevicePulseOxSettingsNavArgsUseCase.kt", l = {11}, m = "invoke-gIAlu-s", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f119690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f119692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f119692c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119691b = obj;
        this.f119693d |= Integer.MIN_VALUE;
        Object objA = this.f119692c.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
