package zd0;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager", f = "PromosProvider.kt", l = {492, 496, 574, 580}, m = "createPromoMapFromPromos", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f204182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f204183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f204184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f204185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f204186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f204187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f204188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u0 u0Var, t13.d<? super v0> dVar) {
        super(dVar);
        this.f204187f = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204186e = obj;
        this.f204188g |= Integer.MIN_VALUE;
        int i14 = u0.f204141p;
        return this.f204187f.y(null, this);
    }
}
