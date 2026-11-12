package com.garmin.android.gncs.persistence;

import android.content.Context;
import androidx.room.b0;
import androidx.room.k0;
import androidx.room.m;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.n;
import vb.h;
import vd.c;
import vd.d;
import xd.a;

/* JADX INFO: loaded from: classes11.dex */
public final class GNCSApplicationsDatabase_Impl extends GNCSApplicationsDatabase {
    private volatile GNCSApplicationsDAO _gNCSApplicationsDAO;

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDatabase
    public GNCSApplicationsDAO applicationsDAO() {
        GNCSApplicationsDAO gNCSApplicationsDAO;
        if (this._gNCSApplicationsDAO != null) {
            return this._gNCSApplicationsDAO;
        }
        synchronized (this) {
            try {
                if (this._gNCSApplicationsDAO == null) {
                    this._gNCSApplicationsDAO = new GNCSApplicationsDAO_Impl(this);
                }
                gNCSApplicationsDAO = this._gNCSApplicationsDAO;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gNCSApplicationsDAO;
    }

    @Override // androidx.room.b0
    public void clearAllTables() {
        super.assertNotMainThread();
        c writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.k3("DELETE FROM `application_info`");
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
    public m createInvalidationTracker() {
        return new m(this, new HashMap(0), new HashMap(0), "application_info");
    }

    @Override // androidx.room.b0
    public d createOpenHelper(androidx.room.c cVar) {
        k0 k0Var = new k0(cVar, new k0.b(2) { // from class: com.garmin.android.gncs.persistence.GNCSApplicationsDatabase_Impl.1
            @Override // androidx.room.k0.b
            public void createAllTables(c cVar2) {
                cVar2.k3("CREATE TABLE IF NOT EXISTS `application_info` (`packageName` TEXT NOT NULL, `enabled` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
                cVar2.k3("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar2.k3("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8abdadbb68b32735a33af8cc678999b6')");
            }

            @Override // androidx.room.k0.b
            public void dropAllTables(c cVar2) {
                cVar2.k3("DROP TABLE IF EXISTS `application_info`");
                if (((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks != null) {
                    int size = ((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((b0.b) ((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks.get(i14)).getClass();
                    }
                }
            }

            @Override // androidx.room.k0.b
            public void onCreate(c cVar2) {
                if (((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks != null) {
                    int size = ((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((b0.b) ((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks.get(i14)).getClass();
                        cVar2.getClass();
                    }
                }
            }

            @Override // androidx.room.k0.b
            public void onOpen(c cVar2) {
                ((b0) GNCSApplicationsDatabase_Impl.this).mDatabase = cVar2;
                GNCSApplicationsDatabase_Impl.this.internalInitInvalidationTracker(cVar2);
                if (((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks != null) {
                    int size = ((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((b0.b) ((b0) GNCSApplicationsDatabase_Impl.this).mCallbacks.get(i14)).a(cVar2);
                    }
                }
            }

            @Override // androidx.room.k0.b
            public void onPostMigrate(c cVar2) {
            }

            @Override // androidx.room.k0.b
            public void onPreMigrate(c cVar2) {
                cVar2.getClass();
                gl1.d.s(new a(cVar2));
            }

            @Override // androidx.room.k0.b
            public k0.c onValidateSchema(c cVar2) {
                HashMap map = new HashMap(2);
                map.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, new n.a(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "TEXT", true, 1, null, 1));
                map.put("enabled", new n.a("enabled", "INTEGER", true, 0, null, 1));
                n nVar = new n("application_info", map, new HashSet(0), new HashSet(0));
                n nVarA = n.a(cVar2, "application_info");
                return !nVar.equals(nVarA) ? new k0.c(false, h.i("application_info(com.garmin.android.gncs.GNCSApplicationInfo).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new k0.c(true, null);
            }
        }, "8abdadbb68b32735a33af8cc678999b6", "e1153d86fc68b1b88d829e987407296e");
        Context context = cVar.f10770a;
        d.b.f177135f.getClass();
        d.b.a aVarA = d.b.C3315b.a(context);
        aVarA.f177142b = cVar.f10771b;
        aVarA.f177143c = k0Var;
        return cVar.f10772c.b(aVarA.a());
    }

    @Override // androidx.room.b0
    public List<kd.a> getAutoMigrations(Map<Class<Object>, Object> map) {
        return Arrays.asList(new kd.a[0]);
    }

    @Override // androidx.room.b0
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(GNCSApplicationsDAO.class, GNCSApplicationsDAO_Impl.getRequiredConverters());
        return map;
    }
}
