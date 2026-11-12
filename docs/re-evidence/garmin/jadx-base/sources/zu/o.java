package zu;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.domain.MyBadgeDetailsUseCase", f = "MyBadgeDetailsUseCase.kt", l = {20, 24, 32}, m = "invoke", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f207059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zy0.p f207061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f207062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f207063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f207064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f207065h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f207064g = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207063f = obj;
        this.f207065h |= Integer.MIN_VALUE;
        return this.f207064g.a(0, 0, false, this);
    }
}
