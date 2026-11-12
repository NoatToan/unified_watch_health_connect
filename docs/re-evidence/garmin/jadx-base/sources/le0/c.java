package le0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.paging.DogActivitiesPagingSource", f = "DogActivitiesPagingSource.kt", l = {63}, m = "attachPolylines", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f112040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f112042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f112042c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f112041b = obj;
        this.f112043d |= Integer.MIN_VALUE;
        return this.f112042c.f(null, this);
    }
}
