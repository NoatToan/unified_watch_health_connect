package com.garmin.android.gncs.persistence;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import kd.a;
import vb.h;
import vd.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract class GNCSApplicationsDatabase extends b0 {
    private static final String DATABASE_NAME = "applications-database";
    private static volatile GNCSApplicationsDatabase instance;

    public static class Migration1To2 extends a {
        public Migration1To2() {
            super(1, 2);
        }

        @Override // kd.a
        public void migrate(c cVar) {
            cVar.k3("CREATE TABLE application_info_tmp (`packageName` TEXT NOT NULL, `enabled` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
            cVar.k3("INSERT OR REPLACE INTO application_info_tmp (`packageName`, `enabled`) SELECT `packageName`, `enabled` FROM application_info");
            cVar.k3("DROP TABLE application_info");
            cVar.k3("ALTER TABLE application_info_tmp RENAME TO application_info");
        }
    }

    public static GNCSApplicationsDatabase getInstance() {
        if (instance != null) {
            return instance;
        }
        h.z("Must call init before obtaining instance.");
        return null;
    }

    public static void init(Context context) {
        if (instance == null) {
            synchronized (GNCSApplicationsDatabase.class) {
                try {
                    if (instance == null) {
                        b0.a aVarA = x.a(context.getApplicationContext(), GNCSApplicationsDatabase.class, DATABASE_NAME);
                        aVarA.a(new Migration1To2());
                        aVarA.c();
                        instance = (GNCSApplicationsDatabase) aVarA.b();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public abstract GNCSApplicationsDAO applicationsDAO();
}
