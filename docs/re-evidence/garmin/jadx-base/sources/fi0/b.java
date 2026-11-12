package fi0;

import java.util.Collection;
import java.util.Iterator;
import li0.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.data.FollowRequestPagingSource", f = "FollowRequestPagingSource.kt", l = {29, 42}, m = "load", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f71646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f71647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f71648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f71649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f71652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f71653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f71654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f71655j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f71654i = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71653h = obj;
        this.f71655j |= Integer.MIN_VALUE;
        return this.f71654i.e(null, this);
    }
}
