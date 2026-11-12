package ao;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.data.ActivitiesPagingSource", f = "ActivitiesPagingSource.kt", l = {54}, m = "load", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f11508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f11508d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11507c = obj;
        this.f11509e |= Integer.MIN_VALUE;
        return this.f11508d.e(null, this);
    }
}
