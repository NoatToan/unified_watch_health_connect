package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.MyFollowerPagingSource", f = "MyFollowerPagingSource.kt", l = {40}, m = "convertToViewData", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f71662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f71663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f71663h = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71662g = obj;
        this.f71664i |= Integer.MIN_VALUE;
        return this.f71663h.f(null, this);
    }
}
