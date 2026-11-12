package ru;

import androidx.room.b0;
import androidx.room.g;
import com.garmin.android.apps.connectmobile.badges.service.model.u;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import rk0.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/c;", "Lru/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "d", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements ru.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f154570e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f154571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f154572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f154573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2928c f154574d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ru/c$a", "Landroidx/room/g;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/u;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<u> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, u uVar) {
            u uVar2 = uVar;
            cVar.getClass();
            uVar2.getClass();
            cVar.q3(1, uVar2.getBadgeChallengeUUID());
            cVar.h(2, uVar2.getBadgeId());
            cVar.q3(3, uVar2.getBadgeKey());
            String createdDate = uVar2.getCreatedDate();
            if (createdDate == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, createdDate);
            }
            String badgeChallengeName = uVar2.getBadgeChallengeName();
            if (badgeChallengeName == null) {
                cVar.u(5);
            } else {
                cVar.q3(5, badgeChallengeName);
            }
            cVar.h(6, uVar2.getPopupShown() ? 1L : 0L);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `badges_unredeemed_rewards_table` (`badgeChallengeUUID`,`badgeId`,`badgeKey`,`createdDate`,`badgeChallengeName`,`popupShown`) VALUES (?,?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ru/c$b", "Landroidx/room/e;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/u;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.room.e<u> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, u uVar) {
            u uVar2 = uVar;
            cVar.getClass();
            uVar2.getClass();
            cVar.q3(1, uVar2.getBadgeChallengeUUID());
        }

        @Override // androidx.room.e
        public final String b() {
            return "DELETE FROM `badges_unredeemed_rewards_table` WHERE `badgeChallengeUUID` = ?";
        }
    }

    /* JADX INFO: renamed from: ru.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ru/c$c", "Landroidx/room/e;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/u;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2928c extends androidx.room.e<u> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, u uVar) {
            u uVar2 = uVar;
            cVar.getClass();
            uVar2.getClass();
            cVar.q3(1, uVar2.getBadgeChallengeUUID());
            cVar.h(2, uVar2.getBadgeId());
            cVar.q3(3, uVar2.getBadgeKey());
            String createdDate = uVar2.getCreatedDate();
            if (createdDate == null) {
                cVar.u(4);
            } else {
                cVar.q3(4, createdDate);
            }
            String badgeChallengeName = uVar2.getBadgeChallengeName();
            if (badgeChallengeName == null) {
                cVar.u(5);
            } else {
                cVar.q3(5, badgeChallengeName);
            }
            cVar.h(6, uVar2.getPopupShown() ? 1L : 0L);
            cVar.q3(7, uVar2.getBadgeChallengeUUID());
        }

        @Override // androidx.room.e
        public final String b() {
            return "UPDATE OR REPLACE `badges_unredeemed_rewards_table` SET `badgeChallengeUUID` = ?,`badgeId` = ?,`badgeKey` = ?,`createdDate` = ?,`badgeChallengeName` = ?,`popupShown` = ? WHERE `badgeChallengeUUID` = ?";
        }
    }

    public c(b0 b0Var) {
        b0Var.getClass();
        this.f154571a = b0Var;
        this.f154572b = new a();
        this.f154573c = new b();
        this.f154574d = new C2928c();
    }

    @Override // ru.a
    public final void a(ArrayList arrayList) {
        gl1.d.O(this.f154571a, false, true, new rk0.g(7, this, arrayList));
    }

    @Override // ru.a
    public final u b() {
        return (u) gl1.d.O(this.f154571a, true, false, new n(23));
    }

    @Override // ru.a
    public final List<u> c() {
        return (List) gl1.d.O(this.f154571a, true, false, new n(24));
    }

    @Override // ru.a
    public final void d(u uVar) {
        gl1.d.O(this.f154571a, false, true, new ru.b(this, uVar, 0));
    }

    @Override // ru.a
    public final void e() {
        gl1.d.O(this.f154571a, false, true, new n(22));
    }

    @Override // ru.a
    public final void f(u uVar) {
        uVar.getClass();
        gl1.d.O(this.f154571a, false, true, new ru.b(this, uVar, 1));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/c$d;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(j jVar) {
            this();
        }

        private d() {
        }
    }
}
