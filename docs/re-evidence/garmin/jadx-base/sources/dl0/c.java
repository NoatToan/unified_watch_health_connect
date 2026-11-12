package dl0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.badge.BadgeScorecardsPagingSource", f = "BadgeScorecardsPagingSource.kt", l = {27}, m = "load", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f60274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f60275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f60275d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60274c = obj;
        this.f60276e |= Integer.MIN_VALUE;
        return this.f60275d.e(null, this);
    }
}
