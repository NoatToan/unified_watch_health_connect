package fl1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.GetFavoriteRecordableActivitiesUseCase", f = "GetFavoriteRecordableActivitiesUseCase.kt", l = {49}, m = "mapKeysToActivityTypes", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f72013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f72014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f72015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f72016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f72016d = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72015c = obj;
        this.f72017e |= Integer.MIN_VALUE;
        return g.a(this.f72016d, 0L, null, this);
    }
}
