package pj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.BaseSafetyFeaturesViewModel", f = "BaseSafetyFeaturesViewModel.kt", l = {98, 100, 113}, m = "getUserECCContacts", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f137927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f137928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f137929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f137930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f137929c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137928b = obj;
        this.f137930d |= Integer.MIN_VALUE;
        int i14 = e.f137898o;
        return this.f137929c.E4(this);
    }
}
