package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, contextZzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131 A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:86:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x017f  */
    private final boolean zzs(int i14, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzp;
        boolean z14;
        boolean z15;
        Cursor cursorRawQuery;
        zzg();
        boolean z16 = false;
        z16 = false;
        if (!this.zzc) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzbb;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarZzh = zzalVarZzc.zzp(null, zzfxVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put(NotificationConstants.KEY_DATA_MIME_TYPE, Integer.valueOf(i14));
            contentValues.put("entry", bArr);
            if (zzicVar.zzc().zzp(null, zzfxVar) && zzrVarZzh != null) {
                contentValues.put("app_version", zzrVarZzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzh.zzj));
            }
            zzicVar.zzc();
            int i15 = 0;
            int i16 = 5;
            for (int i17 = 5; i15 < i17; i17 = 5) {
                try {
                    sQLiteDatabaseZzp = zzp();
                    if (sQLiteDatabaseZzp == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabaseZzp.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseZzp.rawQuery("select count(1) from messages", null);
                            long j8 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        j8 = cursorRawQuery.getLong(z16 ? 1 : 0);
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z14 = z16 ? 1 : 0;
                                    SystemClock.sleep(i16);
                                    i16 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i15++;
                                    z16 = z14;
                                } catch (SQLiteFullException e4) {
                                    e = e4;
                                    z14 = z16 ? 1 : 0;
                                    this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i15++;
                                    z16 = z14;
                                } catch (SQLiteException e14) {
                                    e = e14;
                                    z14 = z16 ? 1 : 0;
                                    z15 = true;
                                    if (sQLiteDatabaseZzp != null) {
                                        try {
                                            if (sQLiteDatabaseZzp.inTransaction()) {
                                                sQLiteDatabaseZzp.endTransaction();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = cursorRawQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                    this.zzc = z15;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i15++;
                                    z16 = z14;
                                }
                            }
                            if (j8 >= 100000) {
                                zzicVar.zzaV().zzb().zza("Data loss, local db full");
                                long j14 = 100001 - j8;
                                long jDelete = sQLiteDatabaseZzp.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j14)});
                                if (jDelete != j14) {
                                    zzgs zzgsVarZzb = zzicVar.zzaV().zzb();
                                    z14 = z16 ? 1 : 0;
                                    try {
                                        try {
                                            z15 = true;
                                            try {
                                                zzgsVarZzb.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j14), Long.valueOf(jDelete), Long.valueOf(j14 - jDelete));
                                            } catch (SQLiteFullException e15) {
                                                e = e15;
                                                this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                                this.zzc = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i15++;
                                                z16 = z14;
                                            } catch (SQLiteException e16) {
                                                e = e16;
                                                if (sQLiteDatabaseZzp != null) {
                                                    if (sQLiteDatabaseZzp.inTransaction()) {
                                                        sQLiteDatabaseZzp.endTransaction();
                                                    }
                                                }
                                                this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                                this.zzc = z15;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i15++;
                                                z16 = z14;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i16);
                                            i16 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            i15++;
                                            z16 = z14;
                                        }
                                    } catch (SQLiteFullException e17) {
                                        e = e17;
                                        this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i15++;
                                        z16 = z14;
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        z15 = true;
                                        if (sQLiteDatabaseZzp != null) {
                                            if (sQLiteDatabaseZzp.inTransaction()) {
                                                sQLiteDatabaseZzp.endTransaction();
                                            }
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                        this.zzc = z15;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i15++;
                                        z16 = z14;
                                    }
                                } else {
                                    z14 = z16 ? 1 : 0;
                                    z15 = true;
                                }
                            } else {
                                z14 = z16 ? 1 : 0;
                                z15 = true;
                            }
                            sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseZzp.setTransactionSuccessful();
                            sQLiteDatabaseZzp.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseZzp.close();
                            return z15;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z14 = z16 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e19) {
                            e = e19;
                            z14 = z16 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e24) {
                            e = e24;
                            z14 = z16 ? 1 : 0;
                            z15 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th4) {
                            th = th4;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.close();
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z14 = z16 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e25) {
                    e = e25;
                    z14 = z16 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e26) {
                    e = e26;
                    z14 = z16 ? 1 : 0;
                    z15 = true;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteDatabaseZzp = null;
                }
            }
            boolean z17 = z16 ? 1 : 0;
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return z17;
        }
        return z16;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp == null || (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e4) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e4);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpm.zza(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzicVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0333 A[Catch: all -> 0x0368, TryCatch #4 {all -> 0x0368, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x032d, B:183:0x0333, B:184:0x0336, B:191:0x0358, B:201:0x0374, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0278, B:149:0x0286, B:156:0x02c3, B:158:0x02e0, B:159:0x02ef), top: B:224:0x032d }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0348  */
    /* JADX WARN: Code duplicated, block: B:194:0x035f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0364 A[PHI: r6 r11 r13 r17 r19 r21
      0x0364: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x034b, B:204:0x0389, B:195:0x0362] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:187:0x034b, B:204:0x0389, B:195:0x0362] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:187:0x034b, B:204:0x0389, B:195:0x0362] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x034b, B:204:0x0389, B:195:0x0362] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:187:0x034b, B:204:0x0389, B:195:0x0362] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:187:0x034b, B:204:0x0389, B:195:0x0362] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x0386  */
    /* JADX WARN: Code duplicated, block: B:208:0x039b  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:224:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x038c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzal] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    public final List zzm(int i14) {
        Cursor cursor;
        ?? r14;
        ?? Zzp;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j8;
        ?? r17;
        ?? r16;
        long j14;
        String string;
        zzic zzicVar;
        int i15;
        int i16;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        String str = "entry";
        String str2 = NotificationConstants.KEY_DATA_MIME_TYPE;
        String str3 = "rowid";
        zzg();
        ?? r15 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i17 = 0;
        int i18 = 5;
        int i19 = 0;
        for (int i24 = 5; i19 < i24; i24 = 5) {
            try {
                Zzp = zzp();
                try {
                    if (Zzp == 0) {
                        this.zzc = true;
                        return r15;
                    }
                    try {
                        Zzp.beginTransaction();
                        try {
                            cursorQuery2 = Zzp.query("messages", new String[]{str3}, "type=?", new String[]{"3"}, null, null, "rowid desc", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                            try {
                                long j15 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j8 = cursorQuery2.getLong(i17);
                                    cursorQuery2.close();
                                } else {
                                    cursorQuery2.close();
                                    j8 = -1;
                                }
                                if (j8 != -1) {
                                    String[] strArr = new String[1];
                                    strArr[i17] = String.valueOf(j8);
                                    r16 = "rowid<?";
                                    r17 = strArr;
                                } else {
                                    ?? r18 = r15;
                                    r17 = r18;
                                    r16 = r18;
                                }
                                String[] strArr2 = {str3, str2, str};
                                zzic zzicVar2 = this.zzu;
                                ?? Zzc = zzicVar2.zzc();
                                int i25 = 1;
                                zzfx zzfxVar = zzfy.zzbb;
                                boolean zZzp = Zzc.zzp(r15, zzfxVar);
                                int i26 = 4;
                                int i27 = 3;
                                int i28 = 2;
                                if (zZzp) {
                                    strArr2 = new String[i24];
                                    strArr2[i17] = str3;
                                    strArr2[1] = str2;
                                    strArr2[2] = str;
                                    strArr2[3] = "app_version";
                                    strArr2[4] = "app_version_int";
                                }
                                String[] strArr3 = strArr2;
                                zzic zzicVar3 = zzicVar2;
                                cursorQuery = Zzp.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j15 = cursorQuery.getLong(i17);
                                        int i29 = cursorQuery.getInt(i25);
                                        byte[] blob = cursorQuery.getBlob(i28);
                                        try {
                                            if (zzicVar3.zzc().zzp(null, zzfxVar)) {
                                                string = cursorQuery.getString(i27);
                                                j14 = cursorQuery.getLong(i26);
                                            } else {
                                                j14 = 0;
                                                string = null;
                                            }
                                            String str4 = str;
                                            long j16 = j14;
                                            str2 = str2;
                                            if (i29 == 0) {
                                                try {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    zzicVar = zzicVar3;
                                                    try {
                                                        str3 = str3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                                parcelObtain.setDataPosition(0);
                                                                zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    if (zzbgVarCreateFromParcel != null) {
                                                                        arrayList.add(new zzgk(zzbgVarCreateFromParcel, string, j16));
                                                                    }
                                                                    str = str4;
                                                                    i16 = 2;
                                                                    i15 = 3;
                                                                    i17 = 0;
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str4;
                                                                    i17 = 0;
                                                                    SystemClock.sleep(i18);
                                                                    i18 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i19++;
                                                                    i17 = i17;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r15 = 0;
                                                                } catch (SQLiteFullException e4) {
                                                                    e = e4;
                                                                    str = str4;
                                                                    i17 = 0;
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i19++;
                                                                    i17 = i17;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r15 = 0;
                                                                } catch (SQLiteException e14) {
                                                                    e = e14;
                                                                    str = str4;
                                                                    i17 = 0;
                                                                    if (Zzp != 0) {
                                                                        try {
                                                                            if (Zzp.inTransaction()) {
                                                                                Zzp.endTransaction();
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            cursor = cursorQuery;
                                                                            r14 = Zzp;
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            if (r14 != 0) {
                                                                                r14.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i19++;
                                                                    i17 = i17;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r15 = 0;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                parcelObtain.recycle();
                                                                throw th;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused2) {
                                                            this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                            parcelObtain.recycle();
                                                        }
                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                        str3 = str3;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str3;
                                                } catch (SQLiteFullException e15) {
                                                    e = e15;
                                                    str3 = str3;
                                                } catch (SQLiteException e16) {
                                                    e = e16;
                                                    str3 = str3;
                                                }
                                            } else {
                                                zzicVar = zzicVar3;
                                                str3 = str3;
                                                if (i29 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                            parcelObtain2.setDataPosition(0);
                                                            zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (Throwable th6) {
                                                            parcelObtain2.recycle();
                                                            throw th6;
                                                        }
                                                    } catch (SafeParcelReader.ParseException unused5) {
                                                        this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                                        parcelObtain2.recycle();
                                                        zzplVarCreateFromParcel = null;
                                                    }
                                                    if (zzplVarCreateFromParcel != null) {
                                                        arrayList.add(new zzgk(zzplVarCreateFromParcel, string, j16));
                                                    }
                                                    str = str4;
                                                    i16 = 2;
                                                    i15 = 3;
                                                    i17 = 0;
                                                } else {
                                                    i16 = 2;
                                                    if (i29 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str = str4;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                        if (zzahVarCreateFromParcel != null) {
                                                                            arrayList.add(new zzgk(zzahVarCreateFromParcel, string, j16));
                                                                        }
                                                                        i15 = 3;
                                                                        i17 = 0;
                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                        i17 = 0;
                                                                        SystemClock.sleep(i18);
                                                                        i18 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i19++;
                                                                        i17 = i17;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r15 = 0;
                                                                    } catch (SQLiteFullException e17) {
                                                                        e = e17;
                                                                        i17 = 0;
                                                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                        this.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i19++;
                                                                        i17 = i17;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r15 = 0;
                                                                    } catch (SQLiteException e18) {
                                                                        e = e18;
                                                                        i17 = 0;
                                                                        if (Zzp != 0) {
                                                                            if (Zzp.inTransaction()) {
                                                                                Zzp.endTransaction();
                                                                            }
                                                                        }
                                                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                        this.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i19++;
                                                                        i17 = i17;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r15 = 0;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused7) {
                                                                    this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                                    parcelObtain3.recycle();
                                                                    zzahVarCreateFromParcel = null;
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                parcelObtain3.recycle();
                                                                throw th;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused8) {
                                                            str = str4;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            str = str4;
                                                        }
                                                    } else {
                                                        str = str4;
                                                        if (i29 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i17 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                            if (zzbeVarCreateFromParcel != null) {
                                                                                arrayList.add(new zzgk(zzbeVarCreateFromParcel, string, j16));
                                                                            }
                                                                            i15 = 3;
                                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                                            SystemClock.sleep(i18);
                                                                            i18 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i19++;
                                                                            i17 = i17;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r15 = 0;
                                                                        } catch (SQLiteFullException e19) {
                                                                            e = e19;
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i19++;
                                                                            i17 = i17;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r15 = 0;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            if (Zzp != 0) {
                                                                                if (Zzp.inTransaction()) {
                                                                                    Zzp.endTransaction();
                                                                                }
                                                                            }
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i19++;
                                                                            i17 = i17;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r15 = 0;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused10) {
                                                                        this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                                        parcelObtain4.recycle();
                                                                        zzbeVarCreateFromParcel = null;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    parcelObtain4.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused11) {
                                                                i17 = 0;
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } else {
                                                            i17 = 0;
                                                            zzic zzicVar4 = this.zzu;
                                                            i15 = 3;
                                                            if (i29 == 3) {
                                                                zzicVar4.zzaV().zzk().zza("Skipping app launch break");
                                                            } else {
                                                                zzicVar4.zzaV().zzb().zza("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i27 = i15;
                                            i17 = i17;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                            i25 = 1;
                                            i26 = 4;
                                            i28 = i16;
                                            zzicVar3 = zzicVar;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteFullException e25) {
                                            e = e25;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteException e26) {
                                            e = e26;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i17 = i17;
                                    } catch (SQLiteFullException e27) {
                                        e = e27;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i17 = i17;
                                    } catch (SQLiteException e28) {
                                        e = e28;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i17 = i17;
                                    }
                                }
                                if (Zzp.delete("messages", "rowid <= ?", new String[]{Long.toString(j15)}) < arrayList.size()) {
                                    this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                                }
                                Zzp.setTransactionSuccessful();
                                Zzp.endTransaction();
                                cursorQuery.close();
                                Zzp.close();
                                return arrayList;
                            } catch (Throwable th11) {
                                th = th11;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i18);
                                        i18 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i19++;
                                        i17 = i17;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r15 = 0;
                                    } catch (SQLiteFullException e29) {
                                        e = e29;
                                        Zzp = Zzp;
                                        cursorQuery = null;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i19++;
                                        i17 = i17;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r15 = 0;
                                    } catch (SQLiteException e34) {
                                        e = e34;
                                        Zzp = Zzp;
                                        cursorQuery = null;
                                        if (Zzp != 0) {
                                            if (Zzp.inTransaction()) {
                                                Zzp.endTransaction();
                                            }
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i19++;
                                        i17 = i17;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r15 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            cursorQuery2 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i17 = i17;
                    } catch (SQLiteFullException e35) {
                        e = e35;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i17 = i17;
                        Zzp = Zzp;
                    } catch (SQLiteException e36) {
                        e = e36;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i17 = i17;
                        Zzp = Zzp;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    cursor = null;
                    r14 = Zzp;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str;
                str2 = str2;
                str3 = str3;
                i17 = i17;
                Zzp = 0;
            } catch (SQLiteFullException e37) {
                e = e37;
                str = str;
                str2 = str2;
                str3 = str3;
                i17 = i17;
                Zzp = 0;
            } catch (SQLiteException e38) {
                e = e38;
                str = str;
                str2 = str2;
                str3 = str3;
                i17 = i17;
                Zzp = 0;
            } catch (Throwable th14) {
                th = th14;
                cursor = null;
                r14 = 0;
            }
        }
        a.q(this.zzu, "Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[PHI: r4
      0x0067: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:25:0x005e, B:32:0x007b, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i14 = 5;
            for (int i15 = 0; i15 < 5; i15++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseZzp = zzp();
                    if (sQLiteDatabaseZzp != null) {
                        sQLiteDatabaseZzp.beginTransaction();
                        sQLiteDatabaseZzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseZzp.setTransactionSuccessful();
                        sQLiteDatabaseZzp.endTransaction();
                        sQLiteDatabaseZzp.close();
                        return true;
                    }
                    this.zzc = true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i14);
                    i14 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e4) {
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e4);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e14) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th3;
                        }
                    }
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e14);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            a.q(this.zzu, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final SQLiteDatabase zzp() {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    public final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
