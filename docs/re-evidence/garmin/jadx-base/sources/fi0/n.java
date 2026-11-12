package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.OthersFollowingPagingSource", f = "OthersFollowingPagingSource.kt", l = {46}, m = "convertToViewData", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f71716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f71717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f71717h = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71716g = obj;
        this.f71718i |= Integer.MIN_VALUE;
        return this.f71717h.f(null, this);
    }
}
