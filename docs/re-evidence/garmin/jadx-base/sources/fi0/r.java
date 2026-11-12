package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.QuerySearchPagingSource", f = "QuerySearchPagingSource.kt", l = {53}, m = "convertToViewData", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f71740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f71741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f71741h = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71740g = obj;
        this.f71742i |= Integer.MIN_VALUE;
        return this.f71741h.f(null, this);
    }
}
