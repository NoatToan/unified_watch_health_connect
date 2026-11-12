package yl0;

import androidx.room.i0;
import com.garmin.android.apps.connectmobile.googlehealthconnect.data.database.GoogleHealthConnectDatabase_Impl;
import gl1.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyl0/a;", "Landroidx/room/i0;", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GoogleHealthConnectDatabase_Impl f197651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GoogleHealthConnectDatabase_Impl googleHealthConnectDatabase_Impl) {
        super(1, "e76ca4df8363b29ec21fec8fb51eed74", "479b8949c2db8aedba41202614236c97");
        this.f197651d = googleHealthConnectDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `google_health_connect_record_entity` (`keyId` TEXT NOT NULL, `json` TEXT NOT NULL, PRIMARY KEY(`keyId`))", aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e76ca4df8363b29ec21fec8fb51eed74')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        aVar.getClass();
        f.o(aVar, "DROP TABLE IF EXISTS `google_health_connect_record_entity`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = GoogleHealthConnectDatabase_Impl.f36057c;
        this.f197651d.internalInitInvalidationTracker(aVar);
    }

    @Override // androidx.room.i0
    public final void e(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void f(ud.a aVar) {
        aVar.getClass();
        d.s(aVar);
    }

    @Override // androidx.room.i0
    public final i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("keyId", new n.a("keyId", "TEXT", true, 1, null, 1));
        n nVar = new n("google_health_connect_record_entity", linkedHashMap, h.j(linkedHashMap, "json", new n.a("json", "TEXT", true, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "google_health_connect_record_entity");
        return !nVar.equals(nVarA) ? new i0.a(false, h.i("google_health_connect_record_entity(com.garmin.android.apps.connectmobile.googlehealthconnect.data.database.GoogleHealthConnectRecordEntity).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new i0.a(true, null);
    }
}
