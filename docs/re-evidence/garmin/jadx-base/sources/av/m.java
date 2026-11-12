package av;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.retrofit.BadgesRepo", f = "BadgesRepo.kt", l = {77, 92}, m = "fetchNewBadgeRewardsUnredeemedCode", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f13105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f13109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f13109e = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13108d = obj;
        this.f13110f |= Integer.MIN_VALUE;
        return this.f13109e.a(this);
    }
}
