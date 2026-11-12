package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.OthersFollowerPagingSource", f = "OthersFollowerPagingSource.kt", l = {46}, m = "convertToViewData", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f71701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f71702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f71702h = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71701g = obj;
        this.f71703i |= Integer.MIN_VALUE;
        return this.f71702h.f(null, this);
    }
}
