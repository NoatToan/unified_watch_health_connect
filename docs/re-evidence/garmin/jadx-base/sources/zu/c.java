package zu;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.domain.AvailableBadgesListUseCaseCase", f = "AvailableBadgesListUseCaseCase.kt", l = {22, 33}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f207018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f207019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f207021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f207022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f207023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f207024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f207025h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f207024g = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207023f = obj;
        this.f207025h |= Integer.MIN_VALUE;
        return this.f207024g.a(null, null, 0, 0, false, this);
    }
}
