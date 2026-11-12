package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.SearchFriendPagingSource", f = "SearchFriendPagingSource.kt", l = {31, 40}, m = "load", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f71757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f71758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f71759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f71760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f71759i = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71758h = obj;
        this.f71760j |= Integer.MIN_VALUE;
        return this.f71759i.e(null, this);
    }
}
