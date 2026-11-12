package xs;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activityrecording.domain.SaveFavoriteActivitiesUseCaseImpl", f = "SaveFavoriteActivitiesUseCaseImpl.kt", l = {22, 33}, m = "invoke", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f192057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f192058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f192059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f192060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f192061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f192060d = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192059c = obj;
        this.f192061e |= Integer.MIN_VALUE;
        return this.f192060d.a(0L, null, null, this);
    }
}
