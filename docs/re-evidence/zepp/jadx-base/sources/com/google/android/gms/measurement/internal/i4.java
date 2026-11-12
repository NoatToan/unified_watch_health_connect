package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class i4 {
    private zzfo a;
    private Long b;
    private long c;
    public final /* synthetic */ m4 d;

    public /* synthetic */ i4(m4 m4Var, zzu zzuVar) {
        this.d = m4Var;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01df: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x01df */
    public final zzfo a(String str, zzfo zzfoVar) {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strZzh = zzfoVar.zzh();
        List<com.google.android.gms.internal.measurement.zzfs> listZzi = zzfoVar.zzi();
        this.d.zzf.zzu();
        Long l = (Long) zzku.e(zzfoVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.d.zzf.zzu();
                String str2 = (String) zzku.e(zzfoVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.d.zzs.zzay().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    d dVarZzi = this.d.zzf.zzi();
                    dVarZzi.zzg();
                    dVarZzi.zzY();
                    try {
                        try {
                            cursorRawQuery = dVarZzi.F().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create(((com.google.android.gms.internal.measurement.zzfn) zzku.s(zzfo.zze(), cursorRawQuery.getBlob(0))).zzaA(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        dVarZzi.zzs.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzel.zzn(str), l, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                } else {
                                    dVarZzi.zzs.zzay().zzj().zza("Main event not found");
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                dVarZzi.zzs.zzay().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.d.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                        this.d.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.a = (zzfo) obj;
                    this.c = ((Long) pairCreate.second).longValue();
                    this.d.zzf.zzu();
                    this.b = (Long) zzku.e(this.a, "_eid");
                }
                long j = this.c - 1;
                this.c = j;
                if (j <= 0) {
                    d dVarZzi2 = this.d.zzf.zzi();
                    dVarZzi2.zzg();
                    dVarZzi2.zzs.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        dVarZzi2.F().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        dVarZzi2.zzs.zzay().zzd().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.d.zzf.zzi().l(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfs zzfsVar : this.a.zzi()) {
                    this.d.zzf.zzu();
                    if (zzku.d(zzfoVar, zzfsVar.zzg()) == null) {
                        arrayList.add(zzfsVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.d.zzs.zzay().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.b = l;
                this.a = zzfoVar;
                this.d.zzf.zzu();
                Object objE = zzku.e(zzfoVar, "_epc");
                long jLongValue = ((Long) (objE != null ? objE : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    this.d.zzs.zzay().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.d.zzf.zzi().l(str, (Long) Preconditions.checkNotNull(l), this.c, zzfoVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfn zzfnVarZzbv = zzfoVar.zzbv();
        zzfnVarZzbv.zzi(strZzh);
        zzfnVarZzbv.zzg();
        zzfnVarZzbv.zzd(listZzi);
        return zzfnVarZzbv.zzaA();
    }
}
