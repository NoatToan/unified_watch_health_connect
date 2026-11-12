package pt0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.EarnedBadgeChallengeViewModel", f = "EarnedBadgeChallengeViewModel.kt", l = {36, 40}, m = "getSocialChallengesFilteredByBadgeV2", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f140646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f140647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f140648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f140649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f140650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f140651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f140650e = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f140649d = obj;
        this.f140651f |= Integer.MIN_VALUE;
        return e0.x4(this.f140650e, null, 0, 0, this);
    }
}
