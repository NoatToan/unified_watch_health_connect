package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportLegsUpdateLogicHandler", f = "MultisportLegsUpdateLogicHandler.kt", l = {139}, m = "divideLegByDuration", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f198308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f198309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f198310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f198309c = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198308b = obj;
        this.f198310d |= Integer.MIN_VALUE;
        return this.f198309c.d(0, 0, null, this);
    }
}
