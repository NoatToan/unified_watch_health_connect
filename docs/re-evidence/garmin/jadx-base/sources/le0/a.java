package le0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.paging.AllDogActivitiesPagingSource", f = "AllDogActivitiesPagingSource.kt", l = {25}, m = "load", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f112037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f112037c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f112036b = obj;
        this.f112038d |= Integer.MIN_VALUE;
        return this.f112037c.e(null, this);
    }
}
