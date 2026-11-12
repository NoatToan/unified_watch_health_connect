package tv0;

import p005kotlin.Metadata;
import pv0.a0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase", f = "SaveBehaviourChangesUseCase.kt", l = {218, 223}, m = "setTrackedBehaviours", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b63.o f166635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f166636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f166637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f166638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f166639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i iVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f166638d = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166637c = obj;
        this.f166639e |= Integer.MIN_VALUE;
        int i14 = i.f166561f;
        return this.f166638d.h(null, null, this);
    }
}
