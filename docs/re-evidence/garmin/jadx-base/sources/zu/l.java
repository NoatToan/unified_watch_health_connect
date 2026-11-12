package zu;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.domain.EarnedBadgesUseCaseCase", f = "EarnedBadgesUseCaseCase.kt", l = {21, 31}, m = "invoke", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f207049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f207050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f207052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f207053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f207054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f207053e = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207052d = obj;
        this.f207054f |= Integer.MIN_VALUE;
        return this.f207053e.a(null, null, 0, 0, this);
    }
}
