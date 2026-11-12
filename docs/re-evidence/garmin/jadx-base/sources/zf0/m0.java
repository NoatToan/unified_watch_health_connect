package zf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel", f = "RaceAndEventBaseViewModel.kt", l = {546}, m = "fetchEventDetailedDTOIfNecessary", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f204436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f204438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f204438c = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204437b = obj;
        this.f204439d |= Integer.MIN_VALUE;
        return this.f204438c.z4(null, this);
    }
}
