package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportLegsUpdateLogicHandler", f = "MultisportLegsUpdateLogicHandler.kt", l = {163}, m = "divideLegByDistance", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f198304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f198305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f198306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f198305c = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198304b = obj;
        this.f198306d |= Integer.MIN_VALUE;
        return this.f198305c.c(0, 0, null, this);
    }
}
