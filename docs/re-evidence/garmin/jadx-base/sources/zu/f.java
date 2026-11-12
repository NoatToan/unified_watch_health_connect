package zu;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.domain.CompareBadgesUseCase", f = "CompareBadgesUseCase.kt", l = {13, 16}, m = "invoke", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f207030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f207031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f207032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f207033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f207032c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207031b = obj;
        this.f207033d |= Integer.MIN_VALUE;
        return this.f207032c.a(null, this);
    }
}
