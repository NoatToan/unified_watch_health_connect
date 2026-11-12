package com.garmin.android.library.connectdatabase;

import android.content.Context;
import androidx.room.b0;
import androidx.room.k0;
import androidx.room.m;
import gl1.d;
import java.util.HashMap;
import java.util.HashSet;
import md.n;
import rd2.b;
import rd2.c;
import rd2.e;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class ConnectDatabase_Impl extends ConnectDatabase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f50138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f50139d;

    public class a extends k0.b {
        public a(int i14) {
            super(i14);
        }

        @Override // androidx.room.k0.b
        public final void createAllTables(vd.c cVar) {
            cVar.k3("CREATE TABLE IF NOT EXISTS `canned_text_reply` (`deviceUnitId` INTEGER NOT NULL, `replyText` TEXT NOT NULL, `replyType` INTEGER NOT NULL, `isOnDevice` INTEGER NOT NULL, `replySortOrder` INTEGER NOT NULL, PRIMARY KEY(`deviceUnitId`, `replyText`, `replyType`))");
            cVar.k3("CREATE TABLE IF NOT EXISTS `device_capabilities` (`unit_id` INTEGER NOT NULL, `mac_address` TEXT NOT NULL, `capabilities` BLOB NOT NULL, PRIMARY KEY(`unit_id`, `mac_address`))");
            cVar.k3("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.k3("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dacf464a6517d79ff19a64560244dda7')");
        }

        @Override // androidx.room.k0.b
        public final void dropAllTables(vd.c cVar) {
            cVar.k3("DROP TABLE IF EXISTS `canned_text_reply`");
            cVar.k3("DROP TABLE IF EXISTS `device_capabilities`");
        }

        @Override // androidx.room.k0.b
        public final void onCreate(vd.c cVar) {
            ConnectDatabase_Impl connectDatabase_Impl = ConnectDatabase_Impl.this;
            if (((b0) connectDatabase_Impl).mCallbacks != null) {
                int size = ((b0) connectDatabase_Impl).mCallbacks.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((b0.b) ((b0) connectDatabase_Impl).mCallbacks.get(i14)).getClass();
                    cVar.getClass();
                }
            }
        }

        @Override // androidx.room.k0.b
        public final void onOpen(vd.c cVar) {
            ConnectDatabase_Impl connectDatabase_Impl = ConnectDatabase_Impl.this;
            ((b0) connectDatabase_Impl).mDatabase = cVar;
            connectDatabase_Impl.internalInitInvalidationTracker(cVar);
            if (((b0) connectDatabase_Impl).mCallbacks != null) {
                int size = ((b0) connectDatabase_Impl).mCallbacks.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((b0.b) ((b0) connectDatabase_Impl).mCallbacks.get(i14)).a(cVar);
                }
            }
        }

        @Override // androidx.room.k0.b
        public final void onPostMigrate(vd.c cVar) {
        }

        @Override // androidx.room.k0.b
        public final void onPreMigrate(vd.c cVar) {
            cVar.getClass();
            d.s(new xd.a(cVar));
        }

        @Override // androidx.room.k0.b
        public final void validateMigration(vd.c cVar) {
            HashMap map = new HashMap(5);
            map.put("deviceUnitId", new n.a("deviceUnitId", "INTEGER", true, 1));
            map.put("replyText", new n.a("replyText", "TEXT", true, 2));
            map.put("replyType", new n.a("replyType", "INTEGER", true, 3));
            map.put("isOnDevice", new n.a("isOnDevice", "INTEGER", true, 0));
            map.put("replySortOrder", new n.a("replySortOrder", "INTEGER", true, 0));
            n nVar = new n("canned_text_reply", map, new HashSet(0), new HashSet(0));
            n nVarA = n.a(cVar, "canned_text_reply");
            if (!nVar.equals(nVarA)) {
                h.z(h.i("Migration didn't properly handle canned_text_reply(com.garmin.android.library.connectdatabase.dto.CannedTextReply).\n Expected:\n", nVar, "\n Found:\n", nVarA));
                return;
            }
            HashMap map2 = new HashMap(3);
            map2.put("unit_id", new n.a("unit_id", "INTEGER", true, 1));
            map2.put("mac_address", new n.a("mac_address", "TEXT", true, 2));
            map2.put("capabilities", new n.a("capabilities", "BLOB", true, 0));
            n nVar2 = new n("device_capabilities", map2, new HashSet(0), new HashSet(0));
            n nVarA2 = n.a(cVar, "device_capabilities");
            if (nVar2.equals(nVarA2)) {
                return;
            }
            h.z(h.i("Migration didn't properly handle device_capabilities(com.garmin.android.library.connectdatabase.dto.DeviceCapabilities).\n Expected:\n", nVar2, "\n Found:\n", nVarA2));
        }
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        super.assertNotMainThread();
        vd.c writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.k3("DELETE FROM `canned_text_reply`");
            writableDatabase.k3("DELETE FROM `device_capabilities`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.X3("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.D()) {
                writableDatabase.k3("VACUUM");
            }
        }
    }

    @Override // androidx.room.b0
    public final m createInvalidationTracker() {
        return new m(this, new HashMap(0), new HashMap(0), "canned_text_reply", "device_capabilities");
    }

    @Override // androidx.room.b0
    public final vd.d createOpenHelper(androidx.room.c cVar) {
        k0 k0Var = new k0(cVar, new a(5), "dacf464a6517d79ff19a64560244dda7", "f53826784f8ee3ffcb9a350054798ed0");
        Context context = cVar.f10770a;
        vd.d.b.f177135f.getClass();
        vd.d.b.a aVarA = vd.d.b.C3315b.a(context);
        aVarA.f177142b = cVar.f10771b;
        aVarA.f177143c = k0Var;
        return cVar.f10772c.b(aVarA.a());
    }

    @Override // com.garmin.android.library.connectdatabase.ConnectDatabase
    public final b e() {
        c cVar;
        if (this.f50138c != null) {
            return this.f50138c;
        }
        synchronized (this) {
            try {
                if (this.f50138c == null) {
                    this.f50138c = new c(this);
                }
                cVar = this.f50138c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }

    @Override // com.garmin.android.library.connectdatabase.ConnectDatabase
    public final rd2.d f() {
        e eVar;
        if (this.f50139d != null) {
            return this.f50139d;
        }
        synchronized (this) {
            try {
                if (this.f50139d == null) {
                    this.f50139d = new e(this);
                }
                eVar = this.f50139d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eVar;
    }
}
