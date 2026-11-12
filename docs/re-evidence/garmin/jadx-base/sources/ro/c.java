package ro;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.activities.map.domain.validators.PromosGCMaps3DValidatorImpl", f = "PromosGCMaps3DValidatorImpl.kt", l = {121}, m = "getMap3DActivities", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f153738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f153739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f153739b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153738a = obj;
        this.f153740c |= Integer.MIN_VALUE;
        int i14 = a.f153725p;
        return this.f153739b.f(null, null, this);
    }
}
