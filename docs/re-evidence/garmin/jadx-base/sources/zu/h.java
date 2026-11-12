package zu;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.domain.ConnectionBadgeDetailsUseCase", f = "ConnectionBadgeDetailsUseCase.kt", l = {13, 16}, m = "invoke", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f207036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f207037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f207038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f207039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f207040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f207039d = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207038c = obj;
        this.f207040e |= Integer.MIN_VALUE;
        return this.f207039d.a(0, null, this);
    }
}
