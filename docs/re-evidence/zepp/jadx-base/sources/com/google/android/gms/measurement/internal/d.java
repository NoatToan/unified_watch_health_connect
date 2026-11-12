package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huami.wallet.datasource.cloud.Const;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class d extends t3 {
    private static final String[] d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    private static final String[] g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final c b;
    private final q3 c;

    public d(zzks zzksVar) {
        super(zzksVar);
        this.c = new q3(this.zzs.zzav());
        this.zzs.zzf();
        this.b = new c(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    @WorkerThread
    private final long A(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = F().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public static final void x(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @WorkerThread
    private final long z(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = F().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final long B(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzY();
        SQLiteDatabase sQLiteDatabaseF = F();
        sQLiteDatabaseF.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                long jA = A(sb.toString(), new String[]{str}, -1L);
                if (jA == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseF.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzel.zzn(str), "first_open_count");
                        return -1L;
                    }
                    jA = 0;
                    this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzel.zzn(str), "first_open_count", e);
                    return j2;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jA));
                    if (sQLiteDatabaseF.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzel.zzn(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseF.setTransactionSuccessful();
                    return jA;
                } catch (SQLiteException e2) {
                    e = e2;
                    j2 = jA;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } finally {
            sQLiteDatabaseF.endTransaction();
        }
    }

    @WorkerThread
    public final long C() {
        return A("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @WorkerThread
    public final long D() {
        return A("select max(timestamp) from raw_events", null, 0L);
    }

    public final long E(String str) {
        Preconditions.checkNotEmpty(str);
        return A("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase F() {
        zzg();
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzk().zzb("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    public final Bundle G(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzY();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = F().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzs.zzay().zzj().zza("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        zzfo zzfoVarZzaA = ((com.google.android.gms.internal.measurement.zzfn) zzku.s(zzfo.zze(), cursorRawQuery.getBlob(0))).zzaA();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfs> listZzi = zzfoVarZzaA.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : listZzi) {
                            String strZzg = zzfsVar.zzg();
                            if (zzfsVar.zzu()) {
                                bundle.putDouble(strZzg, zzfsVar.zza());
                            } else if (zzfsVar.zzv()) {
                                bundle.putFloat(strZzg, zzfsVar.zzb());
                            } else if (zzfsVar.zzy()) {
                                bundle.putString(strZzg, zzfsVar.zzh());
                            } else if (zzfsVar.zzw()) {
                                bundle.putLong(strZzg, zzfsVar.zzd());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e2) {
                        this.zzs.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzel.zzn(str), e2);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzs.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final j0 H(String str) {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        Cursor cursor = null;
        try {
            boolean z = true;
            cursorQuery = F().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    j0 j0Var = new j0(this.zzf.O(), str);
                    j0Var.i(cursorQuery.getString(0));
                    j0Var.y(cursorQuery.getString(1));
                    j0Var.H(cursorQuery.getString(2));
                    j0Var.D(cursorQuery.getLong(3));
                    j0Var.E(cursorQuery.getLong(4));
                    j0Var.C(cursorQuery.getLong(5));
                    j0Var.k(cursorQuery.getString(6));
                    j0Var.j(cursorQuery.getString(7));
                    j0Var.z(cursorQuery.getLong(8));
                    j0Var.t(cursorQuery.getLong(9));
                    j0Var.F(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    j0Var.s(cursorQuery.getLong(11));
                    j0Var.q(cursorQuery.getLong(12));
                    j0Var.p(cursorQuery.getLong(13));
                    j0Var.n(cursorQuery.getLong(14));
                    j0Var.m(cursorQuery.getLong(15));
                    j0Var.v(cursorQuery.getLong(16));
                    j0Var.l(cursorQuery.isNull(17) ? ParserMinimalBase.MIN_INT_L : cursorQuery.getInt(17));
                    j0Var.w(cursorQuery.getString(18));
                    j0Var.o(cursorQuery.getLong(19));
                    j0Var.r(cursorQuery.getLong(20));
                    j0Var.B(cursorQuery.getString(21));
                    long j2 = 0;
                    if (!this.zzs.zzf().zzs(null, zzdy.zzam)) {
                        j0Var.h(cursorQuery.isNull(22) ? 0L : cursorQuery.getLong(22));
                    }
                    if (!cursorQuery.isNull(23) && cursorQuery.getInt(23) == 0) {
                        z = false;
                    }
                    j0Var.g(z);
                    j0Var.f(cursorQuery.getString(24));
                    if (!cursorQuery.isNull(25)) {
                        j2 = cursorQuery.getLong(25);
                    }
                    j0Var.u(j2);
                    if (!cursorQuery.isNull(26)) {
                        j0Var.I(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzom.zzc();
                    if (this.zzs.zzf().zzs(str, zzdy.zzac)) {
                        j0Var.x(cursorQuery.getString(27));
                    }
                    j0Var.d();
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzel.zzn(str));
                    }
                    cursorQuery.close();
                    return j0Var;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzs.zzay().zzd().zzc("Error querying app. appId", zzel.zzn(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    @WorkerThread
    public final zzab I(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = F().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objO = O(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    zzku zzkuVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzat> creator = zzat.CREATOR;
                    zzab zzabVar = new zzab(str, str3, new zzkv(str2, cursorQuery.getLong(8), objO, str3), cursorQuery.getLong(6), z, string2, (zzat) zzkuVarZzu.p(blob, creator), j2, (zzat) this.zzf.zzu().p(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzat) this.zzf.zzu().p(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzel.zzn(str), this.zzs.zzj().zzf(str2));
                    }
                    cursorQuery.close();
                    return zzabVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzs.zzay().zzd().zzd("Error querying conditional property", zzel.zzn(str), this.zzs.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final zzah J(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return K(j2, str, 1L, false, false, z3, false, z5);
    }

    @WorkerThread
    public final zzah K(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        String[] strArr = {str};
        zzah zzahVar = new zzah();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseF = F();
                Cursor cursorQuery = sQLiteDatabaseF.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzel.zzn(str));
                    cursorQuery.close();
                    return zzahVar;
                }
                if (cursorQuery.getLong(0) == j2) {
                    zzahVar.b = cursorQuery.getLong(1);
                    zzahVar.a = cursorQuery.getLong(2);
                    zzahVar.c = cursorQuery.getLong(3);
                    zzahVar.d = cursorQuery.getLong(4);
                    zzahVar.e = cursorQuery.getLong(5);
                }
                if (z) {
                    zzahVar.b += j3;
                }
                if (z2) {
                    zzahVar.a += j3;
                }
                if (z3) {
                    zzahVar.c += j3;
                }
                if (z4) {
                    zzahVar.d += j3;
                }
                if (z5) {
                    zzahVar.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(zzahVar.a));
                contentValues.put("daily_events_count", Long.valueOf(zzahVar.b));
                contentValues.put("daily_conversions_count", Long.valueOf(zzahVar.c));
                contentValues.put("daily_error_events_count", Long.valueOf(zzahVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzahVar.e));
                sQLiteDatabaseF.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzahVar;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzel.zzn(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return zzahVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    @WorkerThread
    public final g L(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        Cursor cursor3 = null;
        try {
            Cursor cursorQuery = F().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                long j2 = cursorQuery.getLong(0);
                long j3 = cursorQuery.getLong(1);
                long j4 = cursorQuery.getLong(2);
                long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                }
                cursor2 = cursorQuery;
                try {
                    g gVar = new g(str, str2, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor2.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzel.zzn(str));
                    }
                    cursor2.close();
                    return gVar;
                } catch (SQLiteException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor2 = cursorQuery;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursorQuery;
            }
            cursor = cursor2;
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            this.zzs.zzay().zzd().zzd("Error querying events. appId", zzel.zzn(str), this.zzs.zzj().zzd(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    @WorkerThread
    public final b4 N(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = F().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j2 = cursorQuery.getLong(0);
                    Object objO = O(cursorQuery, 1);
                    if (objO == null) {
                        cursorQuery.close();
                        return null;
                    }
                    b4 b4Var = new b4(str, cursorQuery.getString(2), str2, j2, objO);
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzel.zzn(str));
                    }
                    cursorQuery.close();
                    return b4Var;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzs.zzay().zzd().zzd("Error querying user property. appId", zzel.zzn(str), this.zzs.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final Object O(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.zzs.zzay().zzd().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.zzs.zzay().zzd().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    @WorkerThread
    public final List<zzab> P(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return Q(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<zzab> Q(String str, String[] strArr) {
        zzg();
        zzY();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseF = F();
                String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                this.zzs.zzf();
                cursorQuery = sQLiteDatabaseF.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", Const.OrderStatus.DEDUCTED_BUT_OPEN_FAIL);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    int size = arrayList.size();
                    this.zzs.zzf();
                    if (size >= 1000) {
                        zzej zzejVarZzd = this.zzs.zzay().zzd();
                        this.zzs.zzf();
                        zzejVarZzd.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objO = O(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j2 = cursorQuery.getLong(6);
                    zzku zzkuVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzat> creator = zzat.CREATOR;
                    zzat zzatVar = (zzat) zzkuVarZzu.p(blob, creator);
                    arrayList.add(new zzab(string, string2, new zzkv(string3, cursorQuery.getLong(10), objO, string2), cursorQuery.getLong(8), z, string4, zzatVar, j2, (zzat) this.zzf.zzu().p(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzat) this.zzf.zzu().p(cursorQuery.getBlob(12), creator)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzb("Error querying conditional user property value", e2);
                List<zzab> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List<b4> R(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.zzs.zzf();
                cursorQuery = F().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = cursorQuery.getLong(2);
                    Object objO = O(cursorQuery, 3);
                    if (objO == null) {
                        this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzel.zzn(str));
                    } else {
                        arrayList.add(new b4(str, str2, string, j2, objO));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzel.zzn(str), e2);
                List<b4> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011d  */
    @WorkerThread
    public final List<b4> S(String str, String str2, String str3) {
        String string;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e2) {
                            e = e2;
                            this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzel.zzn(str), string, e);
                            List<b4> listEmptyList = Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(String.valueOf(str3).concat("*"));
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String string2 = sb.toString();
                    this.zzs.zzf();
                    cursorQuery = F().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", Const.OrderStatus.DEDUCTED_BUT_OPEN_FAIL);
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    do {
                        int size = arrayList.size();
                        this.zzs.zzf();
                        if (size >= 1000) {
                            zzej zzejVarZzd = this.zzs.zzay().zzd();
                            this.zzs.zzf();
                            zzejVarZzd.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                            break;
                        }
                        String string3 = cursorQuery.getString(0);
                        long j2 = cursorQuery.getLong(1);
                        Object objO = O(cursorQuery, 2);
                        string = cursorQuery.getString(3);
                        if (objO == null) {
                            this.zzs.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzel.zzn(str), string, str3);
                        } else {
                            arrayList.add(new b4(str, string, string3, j2, objO));
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e3) {
                    e = e3;
                    string = str2;
                    this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzel.zzn(str), string, e);
                    List<b4> listEmptyList2 = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList2;
                }
            } catch (SQLiteException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void T(List<Long> list) {
        Preconditions.checkNotNull(list);
        zzg();
        zzY();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i2).longValue());
        }
        sb.append(")");
        int iDelete = F().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            this.zzs.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void U(List<Long> list) {
        zzg();
        zzY();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (k()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (z(sb2.toString(), null) > 0) {
                this.zzs.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseF = F();
                StringBuilder sb3 = new StringBuilder(string.length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < ");
                sb3.append(Integer.MAX_VALUE);
                sb3.append(")");
                sQLiteDatabaseF.execSQL(sb3.toString());
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e2);
            }
        }
    }

    @WorkerThread
    public final void b(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        try {
            F().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzel.zzn(str), this.zzs.zzj().zzf(str2), e2);
        }
    }

    @WorkerThread
    public final void c(String str, List<com.google.android.gms.internal.measurement.zzeh> list) throws Throwable {
        Iterator<com.google.android.gms.internal.measurement.zzeh> it2;
        String str2;
        com.google.android.gms.internal.measurement.zzeg zzegVar;
        boolean z;
        String str3 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i2 = 0;
        while (i2 < list.size()) {
            com.google.android.gms.internal.measurement.zzeg zzegVarZzbv = list.get(i2).zzbv();
            if (zzegVarZzbv.zza() != 0) {
                zzegVar = zzegVarZzbv;
                int i3 = 0;
                while (i3 < zzegVar.zza()) {
                    zzei zzeiVarZzbv = zzegVar.zze(i3).zzbv();
                    zzei zzeiVarClone = zzeiVarZzbv.clone();
                    String strZzb = zzgs.zzb(zzeiVarZzbv.zze());
                    if (strZzb != null) {
                        zzeiVarClone.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < zzeiVarZzbv.zza()) {
                        com.google.android.gms.internal.measurement.zzel zzelVarZzd = zzeiVarZzbv.zzd(i4);
                        zzei zzeiVar = zzeiVarZzbv;
                        String str4 = str3;
                        String strZzb2 = zzig.zzb(zzelVarZzd.zze(), zzgt.zza, zzgt.zzb);
                        if (strZzb2 != null) {
                            zzek zzekVarZzbv = zzelVarZzd.zzbv();
                            zzekVarZzbv.zza(strZzb2);
                            zzeiVarClone.zzc(i4, zzekVarZzbv.zzaA());
                            z = true;
                        }
                        i4++;
                        zzeiVarZzbv = zzeiVar;
                        str3 = str4;
                    }
                    String str5 = str3;
                    if (z) {
                        zzegVar.zzc(i3, zzeiVarClone);
                        list.set(i2, zzegVarZzbv.zzaA());
                        zzegVar = zzegVarZzbv;
                    }
                    i3++;
                    str3 = str5;
                }
                str2 = str3;
            } else {
                str2 = str3;
                zzegVar = zzegVarZzbv;
            }
            if (zzegVar.zzb() != 0) {
                for (int i5 = 0; i5 < zzegVar.zzb(); i5++) {
                    zzes zzesVarZzf = zzegVar.zzf(i5);
                    String strZzb3 = zzig.zzb(zzesVarZzf.zze(), zzgu.zza, zzgu.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzer zzerVarZzbv = zzesVarZzf.zzbv();
                        zzerVarZzbv.zza(strZzb3);
                        zzegVar.zzd(i5, zzerVarZzbv);
                        list.set(i2, zzegVarZzbv.zzaA());
                        zzegVar = zzegVarZzbv;
                    }
                }
            }
            i2++;
            str3 = str2;
        }
        String str6 = str3;
        zzY();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseF = F();
        sQLiteDatabaseF.beginTransaction();
        try {
            zzY();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseF2 = F();
            sQLiteDatabaseF2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseF2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator<com.google.android.gms.internal.measurement.zzeh> it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh next = it3.next();
                zzY();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(next);
                if (next.zzk()) {
                    int iZza = next.zza();
                    Iterator<com.google.android.gms.internal.measurement.zzej> it4 = next.zzg().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (!it4.next().zzp()) {
                                this.zzs.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzel.zzn(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator<zzes> it5 = next.zzh().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    Iterator<com.google.android.gms.internal.measurement.zzej> it6 = next.zzg().iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            it2 = it3;
                                            Iterator<zzes> it7 = next.zzh().iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    it3 = it2;
                                                    break;
                                                }
                                                zzes next2 = it7.next();
                                                zzY();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                Preconditions.checkNotNull(next2);
                                                if (TextUtils.isEmpty(next2.zze())) {
                                                    this.zzs.zzay().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzel.zzn(str), Integer.valueOf(iZza), String.valueOf(next2.zzj() ? Integer.valueOf(next2.zza()) : null));
                                                } else {
                                                    byte[] bArrZzbs = next2.zzbs();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put("audience_id", Integer.valueOf(iZza));
                                                    contentValues.put("filter_id", next2.zzj() ? Integer.valueOf(next2.zza()) : null);
                                                    Iterator<zzes> it8 = it7;
                                                    contentValues.put("property_name", next2.zze());
                                                    contentValues.put("session_scoped", next2.zzk() ? Boolean.valueOf(next2.zzi()) : null);
                                                    contentValues.put("data", bArrZzbs);
                                                    try {
                                                        if (F().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            this.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", zzel.zzn(str));
                                                        } else {
                                                            it7 = it8;
                                                        }
                                                    } catch (SQLiteException e2) {
                                                        this.zzs.zzay().zzd().zzc("Error storing property filter. appId", zzel.zzn(str), e2);
                                                    }
                                                }
                                            }
                                        } else {
                                            com.google.android.gms.internal.measurement.zzej next3 = it6.next();
                                            zzY();
                                            zzg();
                                            Preconditions.checkNotEmpty(str);
                                            Preconditions.checkNotNull(next3);
                                            if (TextUtils.isEmpty(next3.zzg())) {
                                                this.zzs.zzay().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzel.zzn(str), Integer.valueOf(iZza), String.valueOf(next3.zzp() ? Integer.valueOf(next3.zzb()) : null));
                                                it2 = it3;
                                            } else {
                                                byte[] bArrZzbs2 = next3.zzbs();
                                                it2 = it3;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iZza));
                                                contentValues2.put("filter_id", next3.zzp() ? Integer.valueOf(next3.zzb()) : null);
                                                contentValues2.put("event_name", next3.zzg());
                                                contentValues2.put("session_scoped", next3.zzq() ? Boolean.valueOf(next3.zzn()) : null);
                                                contentValues2.put("data", bArrZzbs2);
                                                try {
                                                    if (F().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", zzel.zzn(str));
                                                    }
                                                    it3 = it2;
                                                } catch (SQLiteException e3) {
                                                    this.zzs.zzay().zzd().zzc("Error storing event filter. appId", zzel.zzn(str), e3);
                                                }
                                            }
                                        }
                                        zzY();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseF3 = F();
                                        String str7 = str6;
                                        sQLiteDatabaseF3.delete("property_filters", str7, new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseF3.delete("event_filters", str7, new String[]{str, String.valueOf(iZza)});
                                        str6 = str7;
                                        it3 = it2;
                                        break;
                                    }
                                }
                                if (!it5.next().zzj()) {
                                    this.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzel.zzn(str), Integer.valueOf(iZza));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    try {
                        this.zzs.zzay().zzk().zzb("Audience with no ID. appId", zzel.zzn(str));
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabaseF.endTransaction();
                        throw th;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.zzeh zzehVar : list) {
                arrayList.add(zzehVar.zzk() ? Integer.valueOf(zzehVar.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzY();
            zzg();
            SQLiteDatabase sQLiteDatabaseF4 = F();
            try {
                long jZ = z("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.zzs.zzf().zze(str, zzdy.zzE)));
                if (jZ > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseF4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e4) {
                this.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzel.zzn(str), e4);
            }
            sQLiteDatabaseF.setTransactionSuccessful();
            sQLiteDatabaseF.endTransaction();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @WorkerThread
    public final void d() {
        zzY();
        F().setTransactionSuccessful();
    }

    @WorkerThread
    public final void e(j0 j0Var) {
        Preconditions.checkNotNull(j0Var);
        zzg();
        zzY();
        String strE0 = j0Var.e0();
        Preconditions.checkNotNull(strE0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE0);
        contentValues.put("app_instance_id", j0Var.f0());
        contentValues.put("gmp_app_id", j0Var.k0());
        contentValues.put("resettable_device_id_hash", j0Var.b());
        contentValues.put("last_bundle_index", Long.valueOf(j0Var.Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(j0Var.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(j0Var.Y()));
        contentValues.put("app_version", j0Var.h0());
        contentValues.put("app_store", j0Var.g0());
        contentValues.put("gmp_version", Long.valueOf(j0Var.X()));
        contentValues.put("dev_cert_hash", Long.valueOf(j0Var.U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(j0Var.K()));
        contentValues.put("day", Long.valueOf(j0Var.T()));
        contentValues.put("daily_public_events_count", Long.valueOf(j0Var.R()));
        contentValues.put("daily_events_count", Long.valueOf(j0Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(j0Var.O()));
        contentValues.put("config_fetched_time", Long.valueOf(j0Var.N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(j0Var.W()));
        contentValues.put("app_version_int", Long.valueOf(j0Var.M()));
        contentValues.put("firebase_instance_id", j0Var.i0());
        contentValues.put("daily_error_events_count", Long.valueOf(j0Var.P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(j0Var.S()));
        contentValues.put("health_monitor_sample", j0Var.a());
        contentValues.put("android_id", Long.valueOf(j0Var.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(j0Var.J()));
        contentValues.put("admob_app_id", j0Var.c0());
        contentValues.put("dynamite_version", Long.valueOf(j0Var.V()));
        List<String> listC = j0Var.c();
        if (listC != null) {
            if (listC.size() == 0) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", strE0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listC));
            }
        }
        zzom.zzc();
        if (this.zzs.zzf().zzs(strE0, zzdy.zzac)) {
            contentValues.put("ga_app_id", j0Var.j0());
        }
        try {
            SQLiteDatabase sQLiteDatabaseF = F();
            if (sQLiteDatabaseF.update("apps", contentValues, "app_id = ?", new String[]{strE0}) == 0 && sQLiteDatabaseF.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzel.zzn(strE0));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzel.zzn(strE0), e2);
        }
    }

    @WorkerThread
    public final void f(g gVar) {
        Preconditions.checkNotNull(gVar);
        zzg();
        zzY();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.a);
        contentValues.put("name", gVar.b);
        contentValues.put("lifetime_count", Long.valueOf(gVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(gVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(gVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(gVar.g));
        contentValues.put("last_bundled_day", gVar.h);
        contentValues.put("last_sampled_complex_event_id", gVar.i);
        contentValues.put("last_sampling_rate", gVar.j);
        contentValues.put("current_session_count", Long.valueOf(gVar.e));
        Boolean bool = gVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (F().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzel.zzn(gVar.a));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzel.zzn(gVar.a), e2);
        }
    }

    @WorkerThread
    public final void g(String str, byte[] bArr, String str2) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (F().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzel.zzn(str));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzel.zzn(str), e2);
        }
    }

    public final boolean h() {
        return z("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean i() {
        return z("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean j() {
        return z("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean k() {
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        return contextZzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean l(String str, Long l, long j2, zzfo zzfoVar) {
        zzg();
        zzY();
        Preconditions.checkNotNull(zzfoVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrZzbs = zzfoVar.zzbs();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(bArrZzbs.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrZzbs);
        try {
            if (F().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzel.zzn(str));
            return false;
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzel.zzn(str), e2);
            return false;
        }
    }

    @WorkerThread
    public final boolean m(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zzY();
        String str = zzabVar.zza;
        Preconditions.checkNotNull(str);
        if (N(str, zzabVar.zzc.zzb) == null) {
            long jZ = z("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (jZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzabVar.zzb);
        contentValues.put("name", zzabVar.zzc.zzb);
        x(contentValues, "value", Preconditions.checkNotNull(zzabVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzabVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzabVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzabVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().D(zzabVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzabVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().D(zzabVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzabVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzabVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().D(zzabVar.zzk));
        try {
            if (F().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzel.zzn(str));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzel.zzn(str), e2);
        }
        return true;
    }

    @WorkerThread
    public final boolean n(b4 b4Var) {
        Preconditions.checkNotNull(b4Var);
        zzg();
        zzY();
        if (N(b4Var.a, b4Var.c) == null) {
            if (zzkz.y(b4Var.c)) {
                if (z("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{b4Var.a}) >= this.zzs.zzf().zzf(b4Var.a, zzdy.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(b4Var.c)) {
                long jZ = z("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{b4Var.a, b4Var.b});
                this.zzs.zzf();
                if (jZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b4Var.a);
        contentValues.put("origin", b4Var.b);
        contentValues.put("name", b4Var.c);
        contentValues.put("set_timestamp", Long.valueOf(b4Var.d));
        x(contentValues, "value", b4Var.e);
        try {
            if (F().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzel.zzn(b4Var.a));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzel.zzn(b4Var.a), e2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0231: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:99:0x0231 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void w(String str, long j2, long j3, a4 a4Var) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        String str2;
        Cursor cursorRawQuery;
        String string;
        String str3;
        String[] strArr;
        Preconditions.checkNotNull(a4Var);
        zzg();
        zzY();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseF = F();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        String[] strArr2 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                        str2 = j3 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str2.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str2);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseF.rawQuery(sb.toString(), strArr2);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null};
                        str2 = j3 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str2);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseF.rawQuery(sb2.toString(), strArr3);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    String str4 = string;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseF.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str4}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.zzs.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzel.zzn(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                try {
                                    zzfy zzfyVarZzaA = ((zzfx) zzku.s(zzfy.zzu(), cursorQuery.getBlob(0))).zzaA();
                                    if (cursorQuery.moveToNext()) {
                                        this.zzs.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzel.zzn(string2));
                                    }
                                    cursorQuery.close();
                                    Preconditions.checkNotNull(zzfyVarZzaA);
                                    a4Var.a = zzfyVarZzaA;
                                    if (j3 != -1) {
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, str4, String.valueOf(j3)};
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, str4};
                                    }
                                    Cursor cursorQuery2 = sQLiteDatabaseF.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.zzs.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzel.zzn(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j4 = cursorQuery2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) zzku.s(zzfo.zze(), cursorQuery2.getBlob(3));
                                            zzfnVar.zzi(cursorQuery2.getString(1));
                                            zzfnVar.zzm(cursorQuery2.getLong(2));
                                            if (!a4Var.a(j4, zzfnVar.zzaA())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e2) {
                                            this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzel.zzn(string2), e2);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                } catch (IOException e3) {
                                    this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzel.zzn(string2), e3);
                                    cursorQuery.close();
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                IsEmpty = cursorQuery;
                                this.zzs.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzel.zzn(string2), e);
                                if (IsEmpty != 0) {
                                    IsEmpty.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursorQuery;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        IsEmpty = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e8) {
            e = e8;
            IsEmpty = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @WorkerThread
    public final int y(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        try {
            return F().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzel.zzn(str), this.zzs.zzj().zzf(str2), e2);
            return 0;
        }
    }

    @WorkerThread
    public final void zzA() {
        zzg();
        zzY();
        if (k()) {
            long jZza = this.zzf.zzs().zza.zza();
            long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            this.zzs.zzf();
            if (jAbs > zzdy.zzx.zza(null).longValue()) {
                this.zzf.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                zzY();
                if (k()) {
                    SQLiteDatabase sQLiteDatabaseF = F();
                    this.zzs.zzf();
                    int iDelete = sQLiteDatabaseF.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzs.zzav().currentTimeMillis()), String.valueOf(zzaf.zzA())});
                    if (iDelete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.t3
    public final boolean zzb() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @WorkerThread
    public final String zzr() throws Throwable {
        SQLiteException e2;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseF = F();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseF.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e3) {
                    e2 = e3;
                    this.zzs.zzay().zzd().zzb("Database error getting next bundle app id", e2);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = sQLiteDatabaseF;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzw() {
        zzY();
        F().beginTransaction();
    }

    @WorkerThread
    public final void zzy() {
        zzY();
        F().endTransaction();
    }
}
