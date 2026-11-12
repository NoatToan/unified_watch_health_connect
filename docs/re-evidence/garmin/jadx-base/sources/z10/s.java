package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel", f = "BaseConsentViewModel.kt", l = {128, 132}, m = "tryAddChildDefaultLivetrack", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f201232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f201234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f201235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f201236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f201235d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201234c = obj;
        this.f201236e |= Integer.MIN_VALUE;
        int i14 = j.f201057e;
        return this.f201235d.z4(0L, 0, this);
    }
}
