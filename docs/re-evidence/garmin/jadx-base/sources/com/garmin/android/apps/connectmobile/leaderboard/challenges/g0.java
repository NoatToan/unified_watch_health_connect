package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/g0;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37556a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.leaderboard.model.w.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.AD_HOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_AD_HOC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.VIVOKID_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.leaderboard.model.w.BADGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37556a = iArr;
        }
    }

    static {
        new g0();
    }

    private g0() {
    }

    public static final void a(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        a0Var.getClass();
        switch (a.f37556a[a0Var.G().ordinal()]) {
            case 1:
                String uuid = a0Var.getUuid();
                if (uuid == null) {
                    String str = "No uuid for " + a0Var.G();
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.p(a2Var, "LeaderboardChallengesClickListenerUtils", str);
                } else {
                    mVar.startActivityForResult(AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, mVar, uuid, a0Var.getInviteId(), 8), 7);
                }
                break;
            case 2:
                String uuid2 = a0Var.getUuid();
                if (uuid2 == null) {
                    String str2 = "No uuid for " + a0Var.G();
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.p(a2Var2, "LeaderboardChallengesClickListenerUtils", str2);
                } else {
                    AdHocChallengeDetailsActivity.a aVar3 = AdHocChallengeDetailsActivity.f37168h;
                    String inviteId = a0Var.getInviteId();
                    boolean zG0 = a0Var.g0();
                    boolean zI0 = a0Var.i0();
                    aVar3.getClass();
                    AdHocChallengeDetailsActivity.a.d(mVar, uuid2, inviteId, zG0, zI0);
                }
                break;
            case 3:
                String uuid3 = a0Var.getUuid();
                if (uuid3 == null) {
                    String str3 = "No uuid for " + a0Var.G();
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.p(a2Var3, "LeaderboardChallengesClickListenerUtils", str3);
                } else {
                    TeamChallengeActivity.a aVar5 = TeamChallengeActivity.f37278g;
                    String inviteId2 = a0Var.getInviteId();
                    boolean zG1 = a0Var.g0();
                    boolean zI1 = a0Var.i0();
                    aVar5.getClass();
                    TeamChallengeActivity.a.c(mVar, uuid3, inviteId2, zG1, zI1);
                }
                break;
            case 4:
                AutoChallengeActivity.a aVar6 = AutoChallengeActivity.f37184c;
                boolean z14 = a0Var.D() == com.garmin.android.apps.connectmobile.leaderboard.model.v.STARTED || a0Var.D() == com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED;
                aVar6.getClass();
                Intent intent = new Intent(mVar, (Class<?>) AutoChallengeActivity.class);
                intent.putExtra("GCM_show_current_challenge", z14);
                mVar.startActivityForResult(intent, 7);
                break;
            case 5:
                kt0.a aVar7 = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
                if (a0Var.D() != com.garmin.android.apps.connectmobile.leaderboard.model.v.READY) {
                    String uuid4 = a0Var.getUuid();
                    if (uuid4 == null) {
                        String str4 = "No uuid for " + a0Var.G();
                        i2.a aVar8 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar8.getClass();
                        i2.a.p(a2Var4, "LeaderboardChallengesClickListenerUtils", str4);
                    } else {
                        aVar7.k(mVar, uuid4);
                    }
                } else {
                    aVar7.j(mVar, a0Var);
                }
                break;
            case 6:
                BadgeChallengeDetailsActivity.a aVar9 = BadgeChallengeDetailsActivity.f37204e;
                String uuid5 = a0Var.getUuid();
                aVar9.getClass();
                mVar.startActivityForResult(BadgeChallengeDetailsActivity.a.a(mVar, uuid5), 7);
                break;
            default:
                i2.a aVar10 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar10.getClass();
                i2.a.b(a2Var5, "LeaderboardChallengesClickListenerUtils", "No handling challenge type");
                break;
        }
    }
}
