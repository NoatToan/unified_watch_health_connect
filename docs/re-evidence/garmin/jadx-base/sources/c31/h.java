package c31;

import androidx.room.i0;
import com.garmin.android.apps.connectmobile.onboarding.data.local.OnboardingDatabase_Impl;
import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc31/h;", "Landroidx/room/i0;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnboardingDatabase_Impl f24092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OnboardingDatabase_Impl onboardingDatabase_Impl) {
        super(1, "1e404b4c54971bfcec06e52dba46c99d", "c1c0a89b2949e619681c0c6cde35599c");
        this.f24092d = onboardingDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        vb.h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `device_onboarding_items` (`deviceId` INTEGER NOT NULL, `deviceRegistrationSortOrder` INTEGER NOT NULL, `deviceName` TEXT, `deviceProductNumber` TEXT, `sortOrder` INTEGER NOT NULL, `type` TEXT NOT NULL, `associationType` TEXT NOT NULL, `status` TEXT NOT NULL, `coreItem` INTEGER NOT NULL, `reminderDate` TEXT, `deviceImageUrl` TEXT, PRIMARY KEY(`deviceId`, `type`))", aVar, "CREATE TABLE IF NOT EXISTS `prompt_onboarding_items` (`type` TEXT NOT NULL, `status` TEXT NOT NULL, `reminderDate` TEXT, `badgeKey` TEXT, `badgePk` INTEGER, `badgeUUID` TEXT, `challengeCategory` INTEGER, `sharedImagePk` INTEGER, PRIMARY KEY(`type`))");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oe2.f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1e404b4c54971bfcec06e52dba46c99d')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        vb.h.v(aVar, aVar, "DROP TABLE IF EXISTS `device_onboarding_items`", aVar, "DROP TABLE IF EXISTS `prompt_onboarding_items`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = OnboardingDatabase_Impl.f39659e;
        this.f24092d.internalInitInvalidationTracker(aVar);
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
        linkedHashMap.put("deviceId", new n.a("deviceId", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("deviceRegistrationSortOrder", new n.a("deviceRegistrationSortOrder", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("deviceName", new n.a("deviceName", "TEXT", false, 0, null, 1));
        linkedHashMap.put("deviceProductNumber", new n.a("deviceProductNumber", "TEXT", false, 0, null, 1));
        linkedHashMap.put("sortOrder", new n.a("sortOrder", "INTEGER", true, 0, null, 1));
        linkedHashMap.put(NotificationConstants.KEY_DATA_MIME_TYPE, new n.a(NotificationConstants.KEY_DATA_MIME_TYPE, "TEXT", true, 2, null, 1));
        linkedHashMap.put("associationType", new n.a("associationType", "TEXT", true, 0, null, 1));
        linkedHashMap.put("status", new n.a("status", "TEXT", true, 0, null, 1));
        linkedHashMap.put("coreItem", new n.a("coreItem", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("reminderDate", new n.a("reminderDate", "TEXT", false, 0, null, 1));
        n nVar = new n("device_onboarding_items", linkedHashMap, vb.h.j(linkedHashMap, "deviceImageUrl", new n.a("deviceImageUrl", "TEXT", false, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "device_onboarding_items");
        if (!nVar.equals(nVarA)) {
            return new i0.a(false, vb.h.i("device_onboarding_items(com.garmin.android.apps.connectmobile.onboarding.data.local.model.DeviceOnboardingItem).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(NotificationConstants.KEY_DATA_MIME_TYPE, new n.a(NotificationConstants.KEY_DATA_MIME_TYPE, "TEXT", true, 1, null, 1));
        linkedHashMap2.put("status", new n.a("status", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("reminderDate", new n.a("reminderDate", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("badgeKey", new n.a("badgeKey", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("badgePk", new n.a("badgePk", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("badgeUUID", new n.a("badgeUUID", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("challengeCategory", new n.a("challengeCategory", "INTEGER", false, 0, null, 1));
        n nVar2 = new n("prompt_onboarding_items", linkedHashMap2, vb.h.j(linkedHashMap2, "sharedImagePk", new n.a("sharedImagePk", "INTEGER", false, 0, null, 1)), new LinkedHashSet());
        n nVarA2 = n.b.a(aVar, "prompt_onboarding_items");
        return !nVar2.equals(nVarA2) ? new i0.a(false, vb.h.i("prompt_onboarding_items(com.garmin.android.apps.connectmobile.onboarding.data.local.model.PromptOnboardingItem).\n Expected:\n", nVar2, "\n Found:\n", nVarA2)) : new i0.a(true, null);
    }
}
