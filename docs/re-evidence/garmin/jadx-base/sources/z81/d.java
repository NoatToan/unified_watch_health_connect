package z81;

import androidx.room.i0;
import com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz81/d;", "Landroidx/room/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GCMUserPersistenceDatabase_Impl f203095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GCMUserPersistenceDatabase_Impl gCMUserPersistenceDatabase_Impl) {
        super(11, "c54363dc3f382fccec636ede72739df7", "3853f950dd9aa445aa36ae87aa983aa8");
        this.f203095d = gCMUserPersistenceDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `open_web_page_requests` (`url` TEXT NOT NULL, `params` TEXT NOT NULL, `appName` TEXT, `dateReceived` INTEGER NOT NULL, PRIMARY KEY(`url`))", aVar, "CREATE TABLE IF NOT EXISTS `activity_types` (`typeId` INTEGER NOT NULL, `typeKey` TEXT NOT NULL, `parentTypeId` INTEGER, `sortOrder` INTEGER, `isHidden` INTEGER NOT NULL, `restricted` INTEGER NOT NULL, `trimmable` INTEGER NOT NULL, PRIMARY KEY(`typeId`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS `badges_unredeemed_rewards_table` (`badgeChallengeUUID` TEXT NOT NULL, `badgeId` INTEGER NOT NULL, `badgeKey` TEXT NOT NULL, `createdDate` TEXT, `badgeChallengeName` TEXT, `popupShown` INTEGER NOT NULL, PRIMARY KEY(`badgeChallengeUUID`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c54363dc3f382fccec636ede72739df7')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        h.v(aVar, aVar, "DROP TABLE IF EXISTS `open_web_page_requests`", aVar, "DROP TABLE IF EXISTS `activity_types`");
        f.o(aVar, "DROP TABLE IF EXISTS `badges_unredeemed_rewards_table`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = GCMUserPersistenceDatabase_Impl.f40311f;
        this.f203095d.internalInitInvalidationTracker(aVar);
    }

    @Override // androidx.room.i0
    public final void e(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void f(ud.a aVar) {
        aVar.getClass();
        gl1.d.s(aVar);
    }

    @Override // androidx.room.i0
    public final i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("url", new n.a("url", "TEXT", true, 1, null, 1));
        linkedHashMap.put("params", new n.a("params", "TEXT", true, 0, null, 1));
        linkedHashMap.put("appName", new n.a("appName", "TEXT", false, 0, null, 1));
        n nVar = new n("open_web_page_requests", linkedHashMap, h.j(linkedHashMap, "dateReceived", new n.a("dateReceived", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "open_web_page_requests");
        if (!nVar.equals(nVarA)) {
            return new i0.a(false, h.i("open_web_page_requests(com.garmin.android.apps.connectmobile.connectiq.requests.openwebpage.OpenWebPageRequest).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("typeId", new n.a("typeId", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("typeKey", new n.a("typeKey", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("parentTypeId", new n.a("parentTypeId", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("sortOrder", new n.a("sortOrder", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("isHidden", new n.a("isHidden", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("restricted", new n.a("restricted", "INTEGER", true, 0, null, 1));
        n nVar2 = new n("activity_types", linkedHashMap2, h.j(linkedHashMap2, "trimmable", new n.a("trimmable", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA2 = n.b.a(aVar, "activity_types");
        if (!nVar2.equals(nVarA2)) {
            return new i0.a(false, h.i("activity_types(com.garmin.android.apps.connectmobile.activities.model.TypeDTO).\n Expected:\n", nVar2, "\n Found:\n", nVarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("badgeChallengeUUID", new n.a("badgeChallengeUUID", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("badgeId", new n.a("badgeId", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("badgeKey", new n.a("badgeKey", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("createdDate", new n.a("createdDate", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("badgeChallengeName", new n.a("badgeChallengeName", "TEXT", false, 0, null, 1));
        n nVar3 = new n("badges_unredeemed_rewards_table", linkedHashMap3, h.j(linkedHashMap3, "popupShown", new n.a("popupShown", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA3 = n.b.a(aVar, "badges_unredeemed_rewards_table");
        return !nVar3.equals(nVarA3) ? new i0.a(false, h.i("badges_unredeemed_rewards_table(com.garmin.android.apps.connectmobile.badges.service.model.UnredeemedCodePopupDTO).\n Expected:\n", nVar3, "\n Found:\n", nVarA3)) : new i0.a(true, null);
    }
}
