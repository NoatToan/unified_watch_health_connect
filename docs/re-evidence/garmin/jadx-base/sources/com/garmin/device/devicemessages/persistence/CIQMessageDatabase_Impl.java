package com.garmin.device.devicemessages.persistence;

import android.content.Context;
import androidx.room.b0;
import androidx.room.k0;
import androidx.room.m;
import ck2.b;
import gl1.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.n;
import vb.h;
import vd.c;

/* JADX INFO: loaded from: classes11.dex */
public final class CIQMessageDatabase_Impl extends CIQMessageDatabase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b f50720d;

    public class a extends k0.b {
        public a(int i14) {
            super(i14);
        }

        @Override // androidx.room.k0.b
        public final void createAllTables(c cVar) {
            cVar.k3("CREATE TABLE IF NOT EXISTS `device_messages` (`device_id` INTEGER NOT NULL, `posted` INTEGER NOT NULL, `expiration` INTEGER NOT NULL, `event_id` TEXT NOT NULL, `app_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `delivery_attempts` INTEGER NOT NULL, PRIMARY KEY(`device_id`, `event_id`))");
            cVar.k3("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.k3("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c88ba42d8f3549853526f87c2a98463')");
        }

        @Override // androidx.room.k0.b
        public final void dropAllTables(c cVar) {
            cVar.k3("DROP TABLE IF EXISTS `device_messages`");
            CIQMessageDatabase_Impl cIQMessageDatabase_Impl = CIQMessageDatabase_Impl.this;
            if (((b0) cIQMessageDatabase_Impl).mCallbacks != null) {
                int size = ((b0) cIQMessageDatabase_Impl).mCallbacks.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((b0.b) ((b0) cIQMessageDatabase_Impl).mCallbacks.get(i14)).getClass();
                }
            }
        }

        @Override // androidx.room.k0.b
        public final void onCreate(c cVar) {
            CIQMessageDatabase_Impl cIQMessageDatabase_Impl = CIQMessageDatabase_Impl.this;
            if (((b0) cIQMessageDatabase_Impl).mCallbacks != null) {
                int size = ((b0) cIQMessageDatabase_Impl).mCallbacks.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((b0.b) ((b0) cIQMessageDatabase_Impl).mCallbacks.get(i14)).getClass();
                    cVar.getClass();
                }
            }
        }

        @Override // androidx.room.k0.b
        public final void onOpen(c cVar) {
            CIQMessageDatabase_Impl cIQMessageDatabase_Impl = CIQMessageDatabase_Impl.this;
            ((b0) cIQMessageDatabase_Impl).mDatabase = cVar;
            cIQMessageDatabase_Impl.internalInitInvalidationTracker(cVar);
            if (((b0) cIQMessageDatabase_Impl).mCallbacks != null) {
                int size = ((b0) cIQMessageDatabase_Impl).mCallbacks.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((b0.b) ((b0) cIQMessageDatabase_Impl).mCallbacks.get(i14)).a(cVar);
                }
            }
        }

        @Override // androidx.room.k0.b
        public final void onPostMigrate(c cVar) {
        }

        @Override // androidx.room.k0.b
        public final void onPreMigrate(c cVar) {
            cVar.getClass();
            d.s(new xd.a(cVar));
        }

        @Override // androidx.room.k0.b
        public final k0.c onValidateSchema(c cVar) {
            HashMap map = new HashMap(7);
            map.put("device_id", new n.a("device_id", "INTEGER", true, 1, null, 1));
            map.put("posted", new n.a("posted", "INTEGER", true, 0, null, 1));
            map.put("expiration", new n.a("expiration", "INTEGER", true, 0, null, 1));
            map.put("event_id", new n.a("event_id", "TEXT", true, 2, null, 1));
            map.put("app_id", new n.a("app_id", "TEXT", true, 0, null, 1));
            map.put("payload", new n.a("payload", "TEXT", true, 0, null, 1));
            map.put("delivery_attempts", new n.a("delivery_attempts", "INTEGER", true, 0, null, 1));
            n nVar = new n("device_messages", map, new HashSet(0), new HashSet(0));
            n nVarA = n.a(cVar, "device_messages");
            return !nVar.equals(nVarA) ? new k0.c(false, h.i("device_messages(com.garmin.device.devicemessages.persistence.CIQMessageDB).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new k0.c(true, null);
        }
    }

    @Override // androidx.room.b0
    public final void clearAllTables() {
        super.assertNotMainThread();
        c writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.k3("DELETE FROM `device_messages`");
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
        return new m(this, new HashMap(0), new HashMap(0), "device_messages");
    }

    @Override // androidx.room.b0
    public final vd.d createOpenHelper(androidx.room.c cVar) {
        k0 k0Var = new k0(cVar, new a(2), "6c88ba42d8f3549853526f87c2a98463", "ea966e0d57f90171a7e5f7d7dd16014e");
        Context context = cVar.f10770a;
        vd.d.b.f177135f.getClass();
        vd.d.b.a aVarA = vd.d.b.C3315b.a(context);
        aVarA.f177142b = cVar.f10771b;
        aVarA.f177143c = k0Var;
        return cVar.f10772c.b(aVarA.a());
    }

    @Override // com.garmin.device.devicemessages.persistence.CIQMessageDatabase
    public final ck2.a e() {
        b bVar;
        if (this.f50720d != null) {
            return this.f50720d;
        }
        synchronized (this) {
            try {
                if (this.f50720d == null) {
                    this.f50720d = new b(this);
                }
                bVar = this.f50720d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    @Override // androidx.room.b0
    public final List<kd.a> getAutoMigrations(Map<Class<Object>, Object> map) {
        return Arrays.asList(new kd.a[0]);
    }

    @Override // androidx.room.b0
    public final Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b0
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ck2.a.class, Collections.EMPTY_LIST);
        return map;
    }
}
