package ff0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgDataSource", f = "EcgDataSource.kt", l = {177}, m = "getFirstPageWithData", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f71058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f71059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f71061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f71062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f71062e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71061d = obj;
        this.f71063f |= Integer.MIN_VALUE;
        int i14 = c.f71034l;
        return this.f71062e.k(0, null, this);
    }
}
