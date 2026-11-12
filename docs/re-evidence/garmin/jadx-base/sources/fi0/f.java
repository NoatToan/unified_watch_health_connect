package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.MyFollowingPagingSource", f = "MyFollowingPagingSource.kt", l = {40}, m = "convertToViewData", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f71677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f71678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f71678h = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71677g = obj;
        this.f71679i |= Integer.MIN_VALUE;
        return this.f71678h.f(null, this);
    }
}
