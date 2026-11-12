package le0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.paging.DogActivitiesPagingSource", f = "DogActivitiesPagingSource.kt", l = {30, 39}, m = "load", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f112044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f112046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f112047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f112047d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f112046c = obj;
        this.f112048e |= Integer.MIN_VALUE;
        return this.f112047d.e(null, this);
    }
}
