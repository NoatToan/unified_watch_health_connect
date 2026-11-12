package com.garmin.android.gncs.persistence;

import android.database.Cursor;
import androidx.room.b0;
import androidx.room.h;
import androidx.room.l0;
import androidx.room.q0;
import com.garmin.android.gncs.GNCSApplicationInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import gl1.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.a;
import vd.g;

/* JADX INFO: loaded from: classes11.dex */
public final class GNCSApplicationsDAO_Impl implements GNCSApplicationsDAO {
    private final b0 __db;
    private final GNCSConverters __gNCSConverters = new GNCSConverters();
    private final h<GNCSApplicationInfo> __insertionAdapterOfGNCSApplicationInfo;
    private final q0 __preparedStmtOfRemoveApplication;

    public GNCSApplicationsDAO_Impl(b0 b0Var) {
        this.__db = b0Var;
        this.__insertionAdapterOfGNCSApplicationInfo = new h<GNCSApplicationInfo>(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSApplicationsDAO_Impl.1
            @Override // androidx.room.h
            public void bind(g gVar, GNCSApplicationInfo gNCSApplicationInfo) {
                String str = gNCSApplicationInfo.packageName;
                if (str == null) {
                    gVar.u(1);
                } else {
                    gVar.r(1, str);
                }
                gVar.h(2, GNCSApplicationsDAO_Impl.this.__gNCSConverters.hasLargeIconToInt(gNCSApplicationInfo.enabled));
            }

            @Override // androidx.room.q0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `application_info` (`packageName`,`enabled`) VALUES (?,?)";
            }
        };
        this.__preparedStmtOfRemoveApplication = new q0(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSApplicationsDAO_Impl.2
            @Override // androidx.room.q0
            public String createQuery() {
                return "DELETE FROM application_info where packageName = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public List<String> disabledPackages() {
        l0 l0VarE = l0.e(0, "SELECT packageName FROM application_info WHERE enabled != 1");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            ArrayList arrayList = new ArrayList(cursorR.getCount());
            while (cursorR.moveToNext()) {
                arrayList.add(cursorR.isNull(0) ? null : cursorR.getString(0));
            }
            return arrayList;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public List<GNCSApplicationInfo> getAllApplications() {
        l0 l0VarE = l0.e(0, "SELECT * FROM application_info");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            int iA = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA2 = a.a(cursorR, "enabled");
            ArrayList arrayList = new ArrayList(cursorR.getCount());
            while (cursorR.moveToNext()) {
                arrayList.add(new GNCSApplicationInfo(cursorR.isNull(iA) ? null : cursorR.getString(iA), this.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(iA2))));
            }
            return arrayList;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public int getApplicationCount() {
        l0 l0VarE = l0.e(0, "SELECT COUNT(packageName) FROM application_info");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            return cursorR.moveToFirst() ? cursorR.getInt(0) : 0;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public GNCSApplicationInfo getApplicationInfo(String str) {
        l0 l0VarE = l0.e(1, "SELECT * FROM application_info WHERE packageName = ?");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            int iA = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA2 = a.a(cursorR, "enabled");
            GNCSApplicationInfo gNCSApplicationInfo = null;
            String string = null;
            if (cursorR.moveToFirst()) {
                if (!cursorR.isNull(iA)) {
                    string = cursorR.getString(iA);
                }
                gNCSApplicationInfo = new GNCSApplicationInfo(string, this.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(iA2)));
            }
            return gNCSApplicationInfo;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public void removeApplication(String str) {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfRemoveApplication.acquire();
        if (str == null) {
            gVarAcquire.u(1);
        } else {
            gVarAcquire.r(1, str);
        }
        this.__db.beginTransaction();
        try {
            gVarAcquire.b2();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveApplication.release(gVarAcquire);
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public void saveApplication(GNCSApplicationInfo gNCSApplicationInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGNCSApplicationInfo.insert(gNCSApplicationInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSApplicationsDAO
    public void saveApplications(List<GNCSApplicationInfo> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGNCSApplicationInfo.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
