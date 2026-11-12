package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzoa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class m4 extends t3 {
    private String b;
    private Set<Integer> c;
    private Map<Integer, h4> d;
    private Long e;
    private Long f;

    public m4(zzks zzksVar) {
        super(zzksVar);
    }

    private final h4 c(Integer num) {
        if (this.d.containsKey(num)) {
            return this.d.get(num);
        }
        h4 h4Var = new h4(this, this.b, null);
        this.d.put(num, h4Var);
        return h4Var;
    }

    private final boolean d(int i, int i2) {
        h4 h4Var = this.d.get(Integer.valueOf(i));
        if (h4Var == null) {
            return false;
        }
        return h4Var.d.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02ac A[Catch: all -> 0x02e0, SQLiteException -> 0x02e3, LOOP:11: B:103:0x02ac->B:494:?, LOOP_START, TryCatch #0 {all -> 0x02e0, blocks: (B:101:0x02a6, B:103:0x02ac, B:105:0x02bd, B:106:0x02c5, B:109:0x02db, B:119:0x02eb), top: B:417:0x0296 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02bd A[Catch: all -> 0x02e0, SQLiteException -> 0x02e3, TryCatch #0 {all -> 0x02e0, blocks: (B:101:0x02a6, B:103:0x02ac, B:105:0x02bd, B:106:0x02c5, B:109:0x02db, B:119:0x02eb), top: B:417:0x0296 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02db A[Catch: all -> 0x02e0, SQLiteException -> 0x02e3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x02e0, blocks: (B:101:0x02a6, B:103:0x02ac, B:105:0x02bd, B:106:0x02c5, B:109:0x02db, B:119:0x02eb), top: B:417:0x0296 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0313  */
    /* JADX WARN: Code duplicated, block: B:127:0x032f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03df  */
    /* JADX WARN: Code duplicated, block: B:160:0x0404  */
    /* JADX WARN: Code duplicated, block: B:166:0x0419  */
    /* JADX WARN: Code duplicated, block: B:170:0x0433  */
    /* JADX WARN: Code duplicated, block: B:171:0x043c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0448  */
    /* JADX WARN: Code duplicated, block: B:181:0x045d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0495  */
    /* JADX WARN: Code duplicated, block: B:191:0x049e  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:196:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x0593  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:230:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:232:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:233:0x060a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0656  */
    /* JADX WARN: Code duplicated, block: B:242:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:249:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:251:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:260:0x0705 A[LOOP:8: B:243:0x06a4->B:260:0x0705, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x0710  */
    /* JADX WARN: Code duplicated, block: B:267:0x071a A[PHI: r0 r11 r13 r25 r28 r29
      0x071a: PHI (r0v97 java.util.Map) = (r0v99 java.util.Map), (r0v108 java.util.Map) binds: [B:282:0x0750, B:266:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r11v14 android.database.Cursor) = (r11v15 android.database.Cursor), (r11v17 android.database.Cursor) binds: [B:282:0x0750, B:266:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r13v12 java.lang.String) = (r13v13 java.lang.String), (r13v16 java.lang.String) binds: [B:282:0x0750, B:266:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r25v4 java.lang.String) = (r25v5 java.lang.String), (r25v7 java.lang.String) binds: [B:282:0x0750, B:266:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r28v7 java.lang.String) = (r28v8 java.lang.String), (r28v13 java.lang.String) binds: [B:282:0x0750, B:266:0x0716] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r29v7 java.lang.String) = (r29v8 java.lang.String), (r29v14 java.lang.String) binds: [B:282:0x0750, B:266:0x0716] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x075f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0775  */
    /* JADX WARN: Code duplicated, block: B:300:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:302:0x07d9 A[LOOP:10: B:298:0x07a4->B:302:0x07d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:306:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:313:0x081d  */
    /* JADX WARN: Code duplicated, block: B:316:0x082c  */
    /* JADX WARN: Code duplicated, block: B:318:0x083f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0883 A[Catch: SQLiteException -> 0x08ea, all -> 0x0911, LOOP:4: B:322:0x0883->B:337:0x08db, LOOP_START, PHI: r3
      0x0883: PHI (r3v26 java.util.Iterator<com.google.android.gms.internal.measurement.zzgh>) = 
      (r3v19 java.util.Iterator<com.google.android.gms.internal.measurement.zzgh>)
      (r3v28 java.util.Iterator<com.google.android.gms.internal.measurement.zzgh>)
     binds: [B:321:0x0881, B:337:0x08db] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #20 {SQLiteException -> 0x08ea, blocks: (B:320:0x087d, B:322:0x0883, B:323:0x0888, B:325:0x0899, B:327:0x08a9, B:329:0x08b4, B:331:0x08bb), top: B:445:0x087d }] */
    /* JADX WARN: Code duplicated, block: B:327:0x08a9 A[Catch: SQLiteException -> 0x08ea, all -> 0x0911, TryCatch #20 {SQLiteException -> 0x08ea, blocks: (B:320:0x087d, B:322:0x0883, B:323:0x0888, B:325:0x0899, B:327:0x08a9, B:329:0x08b4, B:331:0x08bb), top: B:445:0x087d }] */
    /* JADX WARN: Code duplicated, block: B:328:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:337:0x08db A[LOOP:4: B:322:0x0883->B:337:0x08db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x08de  */
    /* JADX WARN: Code duplicated, block: B:358:0x0919  */
    /* JADX WARN: Code duplicated, block: B:362:0x092d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0952  */
    /* JADX WARN: Code duplicated, block: B:368:0x0963  */
    /* JADX WARN: Code duplicated, block: B:370:0x097a  */
    /* JADX WARN: Code duplicated, block: B:372:0x098e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0997  */
    /* JADX WARN: Code duplicated, block: B:375:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:378:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:387:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:388:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:392:0x0a38 A[PHI: r68
      0x0a38: PHI (r68v3 java.util.Map) = (r68v4 java.util.Map), (r0v130 java.util.Map) binds: [B:391:0x0a36, B:389:0x0a2a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:398:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:403:0x0ac7 A[Catch: SQLiteException -> 0x0adb, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x0adb, blocks: (B:401:0x0abd, B:403:0x0ac7), top: B:426:0x0abd }] */
    /* JADX WARN: Code duplicated, block: B:468:0x0af2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x08d6 A[EDGE_INSN: B:473:0x08d6->B:336:0x08d6 BREAK  A[LOOP:4: B:322:0x0883->B:337:0x08db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x0943 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0a34 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0a0a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0810 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x06ff A[EDGE_INSN: B:484:0x06ff->B:259:0x06ff BREAK  A[LOOP:8: B:243:0x06a4->B:260:0x0705], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0799 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x078b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x07f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x03bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0555 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0457 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x020f A[EDGE_INSN: B:535:0x020f->B:74:0x020f BREAK  A[LOOP:20: B:63:0x01c3->B:75:0x0215], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0 A[Catch: SQLiteException -> 0x0220, all -> 0x0af7, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:423:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01be A[Catch: SQLiteException -> 0x0220, all -> 0x0af7, TRY_ENTER, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:423:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0215 A[LOOP:20: B:63:0x01c3->B:75:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0249  */
    /* JADX WARN: Code duplicated, block: B:94:0x025e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0269  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v45, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v41, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    @WorkerThread
    public final List<zzfk> b(String str, List<zzfo> list, List<zzgh> list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        ?? r5;
        Map map;
        Cursor cursor;
        String str2;
        Cursor cursorQuery;
        Map map2;
        Map map3;
        Iterator it2;
        int iIntValue;
        zzgd zzgdVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        List<com.google.android.gms.internal.measurement.zzej> list3;
        int i3;
        String str3;
        String str4;
        Iterator<zzgf> it3;
        zzgf next;
        Long lValueOf;
        String str5;
        ArrayMap arrayMap2;
        Map arrayMap3;
        ?? F;
        Cursor cursorRawQuery;
        Iterator it4;
        zzgd zzgdVar2;
        List<Integer> list4;
        Map map4;
        Integer numValueOf;
        List arrayList;
        String str6;
        String str7;
        String str8;
        zzu zzuVar;
        i4 i4Var;
        ArrayMap arrayMap4;
        Iterator<zzfo> it5;
        zzfo next2;
        zzfo zzfoVarA;
        d dVarZzi;
        String str9;
        String strZzh;
        g gVarL;
        g gVar;
        long j;
        String strZzh2;
        Map mapEmptyMap;
        String str10;
        String str11;
        Iterator it6;
        int iIntValue2;
        Set<Integer> set;
        Integer numValueOf2;
        Iterator it7;
        boolean zK;
        Map map5;
        Iterator it8;
        j4 j4Var;
        d dVarZzi2;
        String str12;
        ArrayMap arrayMap5;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str13;
        ArrayMap arrayMap6;
        Iterator<zzgh> it9;
        String strZzf;
        Map mapEmptyMap2;
        String str14;
        String str15;
        Iterator it10;
        int iIntValue3;
        Set<Integer> set2;
        Integer numValueOf4;
        Iterator it11;
        boolean zK2;
        zzes zzesVar;
        Integer numValueOf5;
        l4 l4Var;
        Integer numValueOf6;
        d dVarZzi3;
        String str16;
        ArrayMap arrayMap7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List list6;
        List arrayList3;
        String str17;
        ArrayList arrayList4;
        Iterator<Integer> it12;
        d dVarZzi4;
        String str18;
        ContentValues contentValues;
        ArrayMap arrayMap8;
        int i4;
        Cursor cursorQuery4;
        List arrayList5;
        String str19 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.b = str;
        this.c = new HashSet();
        this.d = new ArrayMap();
        this.e = l;
        this.f = l2;
        Iterator<zzfo> it13 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it13.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(it13.next().zzh())) {
                z = true;
                break;
            }
        }
        zzoa.zzc();
        boolean zZzs = this.zzs.zzf().zzs(this.b, zzdy.zzY);
        zzoa.zzc();
        boolean zZzs2 = this.zzs.zzf().zzs(this.b, zzdy.zzX);
        if (z) {
            d dVarZzi5 = this.zzf.zzi();
            String str20 = this.b;
            dVarZzi5.zzY();
            dVarZzi5.zzg();
            Preconditions.checkNotEmpty(str20);
            ContentValues contentValues2 = new ContentValues();
            ?? r6 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                r6 = new String[]{str20};
                dVarZzi5.F().update("events", contentValues2, "app_id = ?", r6);
                r5 = r6;
            } catch (SQLiteException e) {
                dVarZzi5.zzs.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzel.zzn(str20), e);
                r5 = r6;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str21 = "Failed to merge filter. appId";
        String str22 = "Database error querying filters. appId";
        String str23 = "data";
        String str24 = "audience_id";
        if (zZzs2 && zZzs) {
            d dVarZzi6 = this.zzf.zzi();
            String str25 = this.b;
            Preconditions.checkNotEmpty(str25);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = dVarZzi6.F().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str25}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzej zzejVarZzaA = ((zzei) zzku.s(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery4.getBlob(i2))).zzaA();
                                    if (zzejVarZzaA.zzo()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list7 = (List) arrayMap9.get(numValueOf8);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzejVarZzaA);
                                    }
                                } catch (IOException e2) {
                                    dVarZzi6.zzs.zzay().zzd().zzc("Failed to merge filter. appId", zzel.zzn(str25), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery4.close();
                            map = arrayMap9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        dVarZzi6.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzel.zzn(str25), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        d dVarZzi7 = this.zzf.zzi();
                        String str26 = this.b;
                        dVarZzi7.zzY();
                        dVarZzi7.zzg();
                        Preconditions.checkNotEmpty(str26);
                        cursorQuery = dVarZzi7.F().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str26}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i4), ((zzgc) zzku.s(zzgd.zzf(), cursorQuery.getBlob(1))).zzaA());
                                            str2 = str24;
                                        } catch (IOException e4) {
                                            str2 = str24;
                                            try {
                                                dVarZzi7.zzs.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzel.zzn(str26), Integer.valueOf(i4), e4);
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                str23 = str23;
                                                dVarZzi7.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzel.zzn(str26), e);
                                                Map mapEmptyMap4 = Collections.emptyMap();
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = mapEmptyMap4;
                                                if (!map2.isEmpty()) {
                                                    HashSet hashSet = new HashSet(map2.keySet());
                                                    if (z) {
                                                        str5 = this.b;
                                                        Preconditions.checkNotEmpty(str5);
                                                        Preconditions.checkNotNull(map2);
                                                        arrayMap2 = new ArrayMap();
                                                        if (!map2.isEmpty()) {
                                                            d dVarZzi8 = this.zzf.zzi();
                                                            dVarZzi8.zzY();
                                                            dVarZzi8.zzg();
                                                            Preconditions.checkNotEmpty(str5);
                                                            arrayMap3 = new ArrayMap();
                                                            F = dVarZzi8.F();
                                                            try {
                                                                try {
                                                                    cursorRawQuery = F.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str5, str5});
                                                                    try {
                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                            do {
                                                                                numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                arrayList = (List) arrayMap3.get(numValueOf);
                                                                                if (arrayList == null) {
                                                                                    arrayList = new ArrayList();
                                                                                    arrayMap3.put(numValueOf, arrayList);
                                                                                }
                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                            } while (cursorRawQuery.moveToNext());
                                                                        } else {
                                                                            arrayMap3 = Collections.emptyMap();
                                                                        }
                                                                    } catch (SQLiteException e6) {
                                                                        e = e6;
                                                                        dVarZzi8.zzs.zzay().zzd().zzc("Database error querying scoped filters. appId", zzel.zzn(str5), e);
                                                                        arrayMap3 = Collections.emptyMap();
                                                                        if (cursorRawQuery != null) {
                                                                        }
                                                                        it4 = map2.keySet().iterator();
                                                                        while (it4.hasNext()) {
                                                                            int iIntValue4 = ((Integer) it4.next()).intValue();
                                                                            Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                                            zzgdVar2 = (zzgd) map2.get(numValueOf9);
                                                                            list4 = (List) arrayMap3.get(numValueOf9);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = arrayMap3;
                                                                            arrayMap2.put(numValueOf9, zzgdVar2);
                                                                            arrayMap3 = map4;
                                                                            it4 = it4;
                                                                        }
                                                                        map3 = arrayMap2;
                                                                        it2 = hashSet.iterator();
                                                                        while (it2.hasNext()) {
                                                                            iIntValue = ((Integer) it2.next()).intValue();
                                                                            zzgdVar = (zzgd) map3.get(Integer.valueOf(iIntValue));
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            arrayMap = new ArrayMap();
                                                                            if (zzgdVar != null) {
                                                                                for (com.google.android.gms.internal.measurement.zzfm zzfmVar : zzgdVar.zzj()) {
                                                                                    if (zzfmVar.zzh()) {
                                                                                        Integer numValueOf10 = Integer.valueOf(zzfmVar.zza());
                                                                                        if (zzfmVar.zzg()) {
                                                                                            lValueOf = Long.valueOf(zzfmVar.zzb());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        arrayMap.put(numValueOf10, lValueOf);
                                                                                    }
                                                                                }
                                                                            }
                                                                            ArrayMap arrayMap10 = new ArrayMap();
                                                                            if (zzgdVar != null) {
                                                                                it3 = zzgdVar.zzm().iterator();
                                                                                while (it3.hasNext()) {
                                                                                    next = it3.next();
                                                                                    if (!next.zzi()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map6 = map3;
                                                                            if (zzgdVar != null) {
                                                                                i3 = 0;
                                                                                while (i3 < zzgdVar.zzd() * 64) {
                                                                                    if (zzku.C(zzgdVar.zzn(), i3)) {
                                                                                        str3 = str22;
                                                                                        str4 = str21;
                                                                                        this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                                                        bitSet2.set(i3);
                                                                                        if (zzku.C(zzgdVar.zzk(), i3)) {
                                                                                            bitSet.set(i3);
                                                                                        }
                                                                                        i3++;
                                                                                        str22 = str3;
                                                                                        str21 = str4;
                                                                                    } else {
                                                                                        str3 = str22;
                                                                                        str4 = str21;
                                                                                    }
                                                                                    arrayMap.remove(Integer.valueOf(i3));
                                                                                    i3++;
                                                                                    str22 = str3;
                                                                                    str21 = str4;
                                                                                }
                                                                            }
                                                                            String str27 = str22;
                                                                            String str28 = str21;
                                                                            Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                                            zzgd zzgdVar3 = (zzgd) map2.get(numValueOf11);
                                                                            if (!zZzs2) {
                                                                            }
                                                                            this.d.put(Integer.valueOf(iIntValue), new h4(this, this.b, zzgdVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                            map2 = map2;
                                                                            str22 = str27;
                                                                            map = map;
                                                                            map3 = map6;
                                                                            str21 = str28;
                                                                        }
                                                                        String str29 = str22;
                                                                        str6 = str21;
                                                                        str7 = str2;
                                                                        str8 = str23;
                                                                        zzuVar = null;
                                                                        if (!list.isEmpty()) {
                                                                            i4Var = new i4(this, zzuVar);
                                                                            arrayMap4 = new ArrayMap();
                                                                            it5 = list.iterator();
                                                                            while (it5.hasNext()) {
                                                                                next2 = it5.next();
                                                                                zzfoVarA = i4Var.a(this.b, next2);
                                                                                if (zzfoVarA != null) {
                                                                                    dVarZzi = this.zzf.zzi();
                                                                                    str9 = this.b;
                                                                                    strZzh = zzfoVarA.zzh();
                                                                                    gVarL = dVarZzi.L(str9, next2.zzh());
                                                                                    if (gVarL == null) {
                                                                                        dVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzel.zzn(str9), dVarZzi.zzs.zzj().zzd(strZzh));
                                                                                        gVar = new g(str9, next2.zzh(), 1L, 1L, 1L, next2.zzd(), 0L, null, null, null, null);
                                                                                    } else {
                                                                                        gVar = new g(gVarL.a, gVarL.b, gVarL.c + 1, gVarL.d + 1, gVarL.e + 1, gVarL.f, gVarL.g, gVarL.h, gVarL.i, gVarL.j, gVarL.k);
                                                                                    }
                                                                                    this.zzf.zzi().f(gVar);
                                                                                    j = gVar.c;
                                                                                    strZzh2 = zzfoVarA.zzh();
                                                                                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                                                    if (mapEmptyMap == null) {
                                                                                        dVarZzi2 = this.zzf.zzi();
                                                                                        str12 = this.b;
                                                                                        dVarZzi2.zzY();
                                                                                        dVarZzi2.zzg();
                                                                                        Preconditions.checkNotEmpty(str12);
                                                                                        Preconditions.checkNotEmpty(strZzh2);
                                                                                        arrayMap5 = new ArrayMap();
                                                                                        str7 = str7;
                                                                                        str8 = str8;
                                                                                        try {
                                                                                            try {
                                                                                                str10 = str19;
                                                                                                try {
                                                                                                    cursorQuery2 = dVarZzi2.F().query("event_filters", new String[]{str7, str8}, "app_id=? AND event_name=?", new String[]{str12, strZzh2}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                                str8 = str8;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzej zzejVarZzaA2 = ((zzei) zzku.s(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaA();
                                                                                                                            numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                            list5 = (List) arrayMap5.get(numValueOf3);
                                                                                                                            if (list5 == null) {
                                                                                                                                str7 = str7;
                                                                                                                                try {
                                                                                                                                    arrayList2 = new ArrayList();
                                                                                                                                    arrayMap5.put(numValueOf3, arrayList2);
                                                                                                                                } catch (SQLiteException e7) {
                                                                                                                                    e = e7;
                                                                                                                                    str11 = str6;
                                                                                                                                    dVarZzi2.zzs.zzay().zzd().zzc(str29, zzel.zzn(str12), e);
                                                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                                                    if (cursorQuery2 != null) {
                                                                                                                                        cursorQuery2.close();
                                                                                                                                    }
                                                                                                                                    arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                                                    it6 = mapEmptyMap.keySet().iterator();
                                                                                                                                    while (it6.hasNext()) {
                                                                                                                                        iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                                                                        set = this.c;
                                                                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                                                        if (set.contains(numValueOf2)) {
                                                                                                                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                                                        } else {
                                                                                                                                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                                                                            zK = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it7.hasNext()) {
                                                                                                                                                    map5 = mapEmptyMap;
                                                                                                                                                    it8 = it6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                                                                                j4Var = new j4(this, this.b, iIntValue2, zzejVar);
                                                                                                                                                map5 = mapEmptyMap;
                                                                                                                                                it8 = it6;
                                                                                                                                                zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar.zzb()));
                                                                                                                                                if (!zK) {
                                                                                                                                                    this.c.add(Integer.valueOf(iIntValue2));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                c(Integer.valueOf(iIntValue2)).c(j4Var);
                                                                                                                                                mapEmptyMap = map5;
                                                                                                                                                it6 = it8;
                                                                                                                                            }
                                                                                                                                            if (!zK) {
                                                                                                                                                this.c.add(Integer.valueOf(iIntValue2));
                                                                                                                                            }
                                                                                                                                            mapEmptyMap = map5;
                                                                                                                                            it6 = it8;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    it5 = it5;
                                                                                                                                    str6 = str11;
                                                                                                                                    i4Var = i4Var;
                                                                                                                                    str19 = str10;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                str7 = str7;
                                                                                                                                arrayList2 = list5;
                                                                                                                            }
                                                                                                                            arrayList2.add(zzejVarZzaA2);
                                                                                                                            str11 = str6;
                                                                                                                        } catch (IOException e8) {
                                                                                                                            str7 = str7;
                                                                                                                            str11 = str6;
                                                                                                                            dVarZzi2.zzs.zzay().zzd().zzc(str11, zzel.zzn(str12), e8);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            str6 = str11;
                                                                                                                            arrayMap5 = arrayMap5;
                                                                                                                            str7 = str7;
                                                                                                                        } catch (SQLiteException e9) {
                                                                                                                            e = e9;
                                                                                                                            dVarZzi2.zzs.zzay().zzd().zzc(str29, zzel.zzn(str12), e);
                                                                                                                            mapEmptyMap = Collections.emptyMap();
                                                                                                                            if (cursorQuery2 != null) {
                                                                                                                                cursorQuery2.close();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e10) {
                                                                                                                        e = e10;
                                                                                                                        str7 = str7;
                                                                                                                        str11 = str6;
                                                                                                                        dVarZzi2.zzs.zzay().zzd().zzc(str29, zzel.zzn(str12), e);
                                                                                                                        mapEmptyMap = Collections.emptyMap();
                                                                                                                        if (cursorQuery2 != null) {
                                                                                                                            cursorQuery2.close();
                                                                                                                        }
                                                                                                                        arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                                        it6 = mapEmptyMap.keySet().iterator();
                                                                                                                        while (it6.hasNext()) {
                                                                                                                            iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                                                            set = this.c;
                                                                                                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                                            if (set.contains(numValueOf2)) {
                                                                                                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                                            } else {
                                                                                                                                it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                                                                zK = true;
                                                                                                                                while (true) {
                                                                                                                                    if (!it7.hasNext()) {
                                                                                                                                        map5 = mapEmptyMap;
                                                                                                                                        it8 = it6;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                                                                    j4Var = new j4(this, this.b, iIntValue2, zzejVar2);
                                                                                                                                    map5 = mapEmptyMap;
                                                                                                                                    it8 = it6;
                                                                                                                                    zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar2.zzb()));
                                                                                                                                    if (!zK) {
                                                                                                                                        this.c.add(Integer.valueOf(iIntValue2));
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c(Integer.valueOf(iIntValue2)).c(j4Var);
                                                                                                                                    mapEmptyMap = map5;
                                                                                                                                    it6 = it8;
                                                                                                                                }
                                                                                                                                if (!zK) {
                                                                                                                                    this.c.add(Integer.valueOf(iIntValue2));
                                                                                                                                }
                                                                                                                                mapEmptyMap = map5;
                                                                                                                                it6 = it8;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        it5 = it5;
                                                                                                                        str6 = str11;
                                                                                                                        i4Var = i4Var;
                                                                                                                        str19 = str10;
                                                                                                                    }
                                                                                                                }
                                                                                                                cursorQuery2.close();
                                                                                                                mapEmptyMap = arrayMap5;
                                                                                                            } else {
                                                                                                                str8 = str8;
                                                                                                                str7 = str7;
                                                                                                                str11 = str6;
                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                        } catch (SQLiteException e11) {
                                                                                                            e = e11;
                                                                                                            str8 = str8;
                                                                                                        }
                                                                                                        arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        cursor2 = cursorQuery2;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e12) {
                                                                                                    e = e12;
                                                                                                    str11 = str6;
                                                                                                    cursorQuery2 = null;
                                                                                                    dVarZzi2.zzs.zzay().zzd().zzc(str29, zzel.zzn(str12), e);
                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                    if (cursorQuery2 != null) {
                                                                                                        cursorQuery2.close();
                                                                                                    }
                                                                                                    arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                    it6 = mapEmptyMap.keySet().iterator();
                                                                                                    while (it6.hasNext()) {
                                                                                                        iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                                        set = this.c;
                                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                        if (set.contains(numValueOf2)) {
                                                                                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                        } else {
                                                                                                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                                            zK = true;
                                                                                                            while (true) {
                                                                                                                if (!it7.hasNext()) {
                                                                                                                    map5 = mapEmptyMap;
                                                                                                                    it8 = it6;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzej zzejVar3 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                                                j4Var = new j4(this, this.b, iIntValue2, zzejVar3);
                                                                                                                map5 = mapEmptyMap;
                                                                                                                it8 = it6;
                                                                                                                zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar3.zzb()));
                                                                                                                if (!zK) {
                                                                                                                    this.c.add(Integer.valueOf(iIntValue2));
                                                                                                                    break;
                                                                                                                }
                                                                                                                c(Integer.valueOf(iIntValue2)).c(j4Var);
                                                                                                                mapEmptyMap = map5;
                                                                                                                it6 = it8;
                                                                                                            }
                                                                                                            if (!zK) {
                                                                                                                this.c.add(Integer.valueOf(iIntValue2));
                                                                                                            }
                                                                                                            mapEmptyMap = map5;
                                                                                                            it6 = it8;
                                                                                                        }
                                                                                                    }
                                                                                                    it5 = it5;
                                                                                                    str6 = str11;
                                                                                                    i4Var = i4Var;
                                                                                                    str19 = str10;
                                                                                                }
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                cursor2 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e13) {
                                                                                            e = e13;
                                                                                            str10 = str19;
                                                                                        }
                                                                                    } else {
                                                                                        str10 = str19;
                                                                                        str11 = str6;
                                                                                    }
                                                                                    it6 = mapEmptyMap.keySet().iterator();
                                                                                    while (it6.hasNext()) {
                                                                                        iIntValue2 = ((Integer) it6.next()).intValue();
                                                                                        set = this.c;
                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                        if (set.contains(numValueOf2)) {
                                                                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                        } else {
                                                                                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                            zK = true;
                                                                                            while (true) {
                                                                                                if (!it7.hasNext()) {
                                                                                                    map5 = mapEmptyMap;
                                                                                                    it8 = it6;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzej zzejVar4 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                                                j4Var = new j4(this, this.b, iIntValue2, zzejVar4);
                                                                                                map5 = mapEmptyMap;
                                                                                                it8 = it6;
                                                                                                zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar4.zzb()));
                                                                                                if (!zK) {
                                                                                                    this.c.add(Integer.valueOf(iIntValue2));
                                                                                                    break;
                                                                                                }
                                                                                                c(Integer.valueOf(iIntValue2)).c(j4Var);
                                                                                                mapEmptyMap = map5;
                                                                                                it6 = it8;
                                                                                            }
                                                                                            if (!zK) {
                                                                                                this.c.add(Integer.valueOf(iIntValue2));
                                                                                            }
                                                                                            mapEmptyMap = map5;
                                                                                            it6 = it8;
                                                                                        }
                                                                                    }
                                                                                    it5 = it5;
                                                                                    str6 = str11;
                                                                                    i4Var = i4Var;
                                                                                    str19 = str10;
                                                                                }
                                                                            }
                                                                        }
                                                                        str13 = str19;
                                                                        if (!list2.isEmpty()) {
                                                                            arrayMap6 = new ArrayMap();
                                                                            it9 = list2.iterator();
                                                                            while (it9.hasNext()) {
                                                                                zzgh next3 = it9.next();
                                                                                strZzf = next3.zzf();
                                                                                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                                                if (mapEmptyMap2 == null) {
                                                                                    dVarZzi3 = this.zzf.zzi();
                                                                                    str16 = this.b;
                                                                                    dVarZzi3.zzY();
                                                                                    dVarZzi3.zzg();
                                                                                    Preconditions.checkNotEmpty(str16);
                                                                                    Preconditions.checkNotEmpty(strZzf);
                                                                                    arrayMap7 = new ArrayMap();
                                                                                    str14 = str7;
                                                                                    str15 = str8;
                                                                                    try {
                                                                                        cursorQuery3 = dVarZzi3.F().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                                                                                        try {
                                                                                            try {
                                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            zzes zzesVarZzaA = ((com.google.android.gms.internal.measurement.zzer) zzku.s(zzes.zzc(), cursorQuery3.getBlob(1))).zzaA();
                                                                                                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                            list6 = (List) arrayMap7.get(numValueOf7);
                                                                                                            if (list6 == null) {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                arrayMap7.put(numValueOf7, arrayList3);
                                                                                                            } else {
                                                                                                                arrayList3 = list6;
                                                                                                            }
                                                                                                            arrayList3.add(zzesVarZzaA);
                                                                                                        } catch (IOException e14) {
                                                                                                            dVarZzi3.zzs.zzay().zzd().zzc("Failed to merge filter", zzel.zzn(str16), e14);
                                                                                                        }
                                                                                                        try {
                                                                                                            if (!cursorQuery3.moveToNext()) {
                                                                                                                break;
                                                                                                            }
                                                                                                            it9 = it9;
                                                                                                        } catch (SQLiteException e15) {
                                                                                                            e = e15;
                                                                                                            dVarZzi3.zzs.zzay().zzd().zzc(str29, zzel.zzn(str16), e);
                                                                                                            mapEmptyMap2 = Collections.emptyMap();
                                                                                                            if (cursorQuery3 != null) {
                                                                                                                cursorQuery3.close();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    cursorQuery3.close();
                                                                                                    mapEmptyMap2 = arrayMap7;
                                                                                                } else {
                                                                                                    it9 = it9;
                                                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                                                    cursorQuery3.close();
                                                                                                }
                                                                                            } catch (SQLiteException e16) {
                                                                                                e = e16;
                                                                                                it9 = it9;
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            cursor3 = cursorQuery3;
                                                                                            if (cursor3 != null) {
                                                                                                cursor3.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e17) {
                                                                                        e = e17;
                                                                                        it9 = it9;
                                                                                        cursorQuery3 = null;
                                                                                    } catch (Throwable th4) {
                                                                                        th = th4;
                                                                                        cursor3 = null;
                                                                                    }
                                                                                    arrayMap6.put(strZzf, mapEmptyMap2);
                                                                                } else {
                                                                                    it9 = it9;
                                                                                    str14 = str7;
                                                                                    str15 = str8;
                                                                                }
                                                                                it10 = mapEmptyMap2.keySet().iterator();
                                                                                while (it10.hasNext()) {
                                                                                    iIntValue3 = ((Integer) it10.next()).intValue();
                                                                                    set2 = this.c;
                                                                                    numValueOf4 = Integer.valueOf(iIntValue3);
                                                                                    if (set2.contains(numValueOf4)) {
                                                                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                                        break;
                                                                                    }
                                                                                    it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                                    zK2 = true;
                                                                                    while (true) {
                                                                                        if (it11.hasNext()) {
                                                                                            zzesVar = (zzes) it11.next();
                                                                                            if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                                                zzej zzejVarZzj = this.zzs.zzay().zzj();
                                                                                                Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                                                if (zzesVar.zzj()) {
                                                                                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                                                } else {
                                                                                                    numValueOf6 = null;
                                                                                                }
                                                                                                zzejVarZzj.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                                                this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().v(zzesVar));
                                                                                            }
                                                                                            if (zzesVar.zzj()) {
                                                                                            }
                                                                                            zzej zzejVarZzk = this.zzs.zzay().zzk();
                                                                                            Object objZzn = zzel.zzn(this.b);
                                                                                            if (zzesVar.zzj()) {
                                                                                                numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                                            } else {
                                                                                                numValueOf5 = null;
                                                                                            }
                                                                                            zzejVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf5));
                                                                                            this.c.add(Integer.valueOf(iIntValue3));
                                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                                        } else {
                                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                                        }
                                                                                        if (!zK2) {
                                                                                            this.c.add(Integer.valueOf(iIntValue3));
                                                                                        }
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                        c(Integer.valueOf(iIntValue3)).c(l4Var);
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                    }
                                                                                }
                                                                                it9 = it9;
                                                                                str8 = str15;
                                                                                str7 = str14;
                                                                            }
                                                                        }
                                                                        str17 = str7;
                                                                        arrayList4 = new ArrayList();
                                                                        Set<Integer> setKeySet = this.d.keySet();
                                                                        setKeySet.removeAll(this.c);
                                                                        it12 = setKeySet.iterator();
                                                                        while (it12.hasNext()) {
                                                                            int iIntValue5 = it12.next().intValue();
                                                                            Map<Integer, h4> map7 = this.d;
                                                                            Integer numValueOf13 = Integer.valueOf(iIntValue5);
                                                                            h4 h4Var = map7.get(numValueOf13);
                                                                            Preconditions.checkNotNull(h4Var);
                                                                            zzfk zzfkVarA = h4Var.a(iIntValue5);
                                                                            arrayList4.add(zzfkVarA);
                                                                            dVarZzi4 = this.zzf.zzi();
                                                                            str18 = this.b;
                                                                            zzgd zzgdVarZzd = zzfkVarA.zzd();
                                                                            dVarZzi4.zzY();
                                                                            dVarZzi4.zzg();
                                                                            Preconditions.checkNotEmpty(str18);
                                                                            Preconditions.checkNotNull(zzgdVarZzd);
                                                                            byte[] bArrZzbs = zzgdVarZzd.zzbs();
                                                                            contentValues = new ContentValues();
                                                                            contentValues.put("app_id", str18);
                                                                            contentValues.put(str17, numValueOf13);
                                                                            String str30 = str13;
                                                                            contentValues.put(str30, bArrZzbs);
                                                                            try {
                                                                                try {
                                                                                    if (dVarZzi4.F().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                        dVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzel.zzn(str18));
                                                                                    }
                                                                                } catch (SQLiteException e18) {
                                                                                    e = e18;
                                                                                    dVarZzi4.zzs.zzay().zzd().zzc("Error storing filter results. appId", zzel.zzn(str18), e);
                                                                                }
                                                                            } catch (SQLiteException e19) {
                                                                                e = e19;
                                                                            }
                                                                            str13 = str30;
                                                                        }
                                                                        return arrayList4;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    if (F != 0) {
                                                                        F.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e20) {
                                                                e = e20;
                                                                cursorRawQuery = null;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                F = 0;
                                                                if (F != 0) {
                                                                    F.close();
                                                                }
                                                                throw th;
                                                            }
                                                            cursorRawQuery.close();
                                                            it4 = map2.keySet().iterator();
                                                            while (it4.hasNext()) {
                                                                int iIntValue6 = ((Integer) it4.next()).intValue();
                                                                Integer numValueOf14 = Integer.valueOf(iIntValue6);
                                                                zzgdVar2 = (zzgd) map2.get(numValueOf14);
                                                                list4 = (List) arrayMap3.get(numValueOf14);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = arrayMap3;
                                                                arrayMap2.put(numValueOf14, zzgdVar2);
                                                                arrayMap3 = map4;
                                                                it4 = it4;
                                                            }
                                                        }
                                                        map3 = arrayMap2;
                                                    } else {
                                                        map3 = map2;
                                                    }
                                                    it2 = hashSet.iterator();
                                                    while (it2.hasNext()) {
                                                        iIntValue = ((Integer) it2.next()).intValue();
                                                        zzgdVar = (zzgd) map3.get(Integer.valueOf(iIntValue));
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        arrayMap = new ArrayMap();
                                                        if (zzgdVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (zzfmVar.zzh()) {
                                                                    Integer numValueOf15 = Integer.valueOf(zzfmVar.zza());
                                                                    if (zzfmVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzfmVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    arrayMap.put(numValueOf15, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        ArrayMap arrayMap11 = new ArrayMap();
                                                        if (zzgdVar != null) {
                                                            it3 = zzgdVar.zzm().iterator();
                                                            while (it3.hasNext()) {
                                                                next = it3.next();
                                                                if (!next.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        Map map8 = map3;
                                                        if (zzgdVar != null) {
                                                            i3 = 0;
                                                            while (i3 < zzgdVar.zzd() * 64) {
                                                                if (zzku.C(zzgdVar.zzn(), i3)) {
                                                                    str3 = str22;
                                                                    str4 = str21;
                                                                    this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                                    bitSet2.set(i3);
                                                                    if (zzku.C(zzgdVar.zzk(), i3)) {
                                                                        bitSet.set(i3);
                                                                    }
                                                                    i3++;
                                                                    str22 = str3;
                                                                    str21 = str4;
                                                                } else {
                                                                    str3 = str22;
                                                                    str4 = str21;
                                                                }
                                                                arrayMap.remove(Integer.valueOf(i3));
                                                                i3++;
                                                                str22 = str3;
                                                                str21 = str4;
                                                            }
                                                        }
                                                        String str210 = str22;
                                                        String str211 = str21;
                                                        Integer numValueOf16 = Integer.valueOf(iIntValue);
                                                        zzgd zzgdVar4 = (zzgd) map2.get(numValueOf16);
                                                        if (!zZzs2) {
                                                        }
                                                        this.d.put(Integer.valueOf(iIntValue), new h4(this, this.b, zzgdVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                        map2 = map2;
                                                        str22 = str210;
                                                        map = map;
                                                        map3 = map8;
                                                        str21 = str211;
                                                    }
                                                }
                                                String str212 = str22;
                                                str6 = str21;
                                                str7 = str2;
                                                str8 = str23;
                                                zzuVar = null;
                                                if (!list.isEmpty()) {
                                                    i4Var = new i4(this, zzuVar);
                                                    arrayMap4 = new ArrayMap();
                                                    it5 = list.iterator();
                                                    while (it5.hasNext()) {
                                                        next2 = it5.next();
                                                        zzfoVarA = i4Var.a(this.b, next2);
                                                        if (zzfoVarA != null) {
                                                            dVarZzi = this.zzf.zzi();
                                                            str9 = this.b;
                                                            strZzh = zzfoVarA.zzh();
                                                            gVarL = dVarZzi.L(str9, next2.zzh());
                                                            if (gVarL == null) {
                                                                dVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzel.zzn(str9), dVarZzi.zzs.zzj().zzd(strZzh));
                                                                gVar = new g(str9, next2.zzh(), 1L, 1L, 1L, next2.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                gVar = new g(gVarL.a, gVarL.b, gVarL.c + 1, gVarL.d + 1, gVarL.e + 1, gVarL.f, gVarL.g, gVarL.h, gVarL.i, gVarL.j, gVarL.k);
                                                            }
                                                            this.zzf.zzi().f(gVar);
                                                            j = gVar.c;
                                                            strZzh2 = zzfoVarA.zzh();
                                                            mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                            if (mapEmptyMap == null) {
                                                                dVarZzi2 = this.zzf.zzi();
                                                                str12 = this.b;
                                                                dVarZzi2.zzY();
                                                                dVarZzi2.zzg();
                                                                Preconditions.checkNotEmpty(str12);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                arrayMap5 = new ArrayMap();
                                                                str7 = str7;
                                                                str8 = str8;
                                                                str10 = str19;
                                                                cursorQuery2 = dVarZzi2.F().query("event_filters", new String[]{str7, str8}, "app_id=? AND event_name=?", new String[]{str12, strZzh2}, null, null, null);
                                                                if (cursorQuery2.moveToFirst()) {
                                                                    str8 = str8;
                                                                    while (true) {
                                                                        com.google.android.gms.internal.measurement.zzej zzejVarZzaA3 = ((zzei) zzku.s(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaA();
                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                        list5 = (List) arrayMap5.get(numValueOf3);
                                                                        if (list5 == null) {
                                                                            str7 = str7;
                                                                            arrayList2 = new ArrayList();
                                                                            arrayMap5.put(numValueOf3, arrayList2);
                                                                        } else {
                                                                            str7 = str7;
                                                                            arrayList2 = list5;
                                                                        }
                                                                        arrayList2.add(zzejVarZzaA3);
                                                                        str11 = str6;
                                                                        if (!cursorQuery2.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        str6 = str11;
                                                                        arrayMap5 = arrayMap5;
                                                                        str7 = str7;
                                                                    }
                                                                    cursorQuery2.close();
                                                                    mapEmptyMap = arrayMap5;
                                                                } else {
                                                                    str8 = str8;
                                                                    str7 = str7;
                                                                    str11 = str6;
                                                                    mapEmptyMap = Collections.emptyMap();
                                                                    cursorQuery2.close();
                                                                }
                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                            } else {
                                                                str10 = str19;
                                                                str11 = str6;
                                                            }
                                                            it6 = mapEmptyMap.keySet().iterator();
                                                            while (it6.hasNext()) {
                                                                iIntValue2 = ((Integer) it6.next()).intValue();
                                                                set = this.c;
                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                if (set.contains(numValueOf2)) {
                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                } else {
                                                                    it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                    zK = true;
                                                                    while (true) {
                                                                        if (!it7.hasNext()) {
                                                                            map5 = mapEmptyMap;
                                                                            it8 = it6;
                                                                            break;
                                                                        }
                                                                        com.google.android.gms.internal.measurement.zzej zzejVar5 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                                        j4Var = new j4(this, this.b, iIntValue2, zzejVar5);
                                                                        map5 = mapEmptyMap;
                                                                        it8 = it6;
                                                                        zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar5.zzb()));
                                                                        if (!zK) {
                                                                            this.c.add(Integer.valueOf(iIntValue2));
                                                                            break;
                                                                        }
                                                                        c(Integer.valueOf(iIntValue2)).c(j4Var);
                                                                        mapEmptyMap = map5;
                                                                        it6 = it8;
                                                                    }
                                                                    if (!zK) {
                                                                        this.c.add(Integer.valueOf(iIntValue2));
                                                                    }
                                                                    mapEmptyMap = map5;
                                                                    it6 = it8;
                                                                }
                                                            }
                                                            it5 = it5;
                                                            str6 = str11;
                                                            i4Var = i4Var;
                                                            str19 = str10;
                                                        }
                                                    }
                                                }
                                                str13 = str19;
                                                if (!list2.isEmpty()) {
                                                    arrayMap6 = new ArrayMap();
                                                    it9 = list2.iterator();
                                                    while (it9.hasNext()) {
                                                        zzgh next4 = it9.next();
                                                        strZzf = next4.zzf();
                                                        mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                        if (mapEmptyMap2 == null) {
                                                            dVarZzi3 = this.zzf.zzi();
                                                            str16 = this.b;
                                                            dVarZzi3.zzY();
                                                            dVarZzi3.zzg();
                                                            Preconditions.checkNotEmpty(str16);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            arrayMap7 = new ArrayMap();
                                                            str14 = str7;
                                                            str15 = str8;
                                                            cursorQuery3 = dVarZzi3.F().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    zzes zzesVarZzaA2 = ((com.google.android.gms.internal.measurement.zzer) zzku.s(zzes.zzc(), cursorQuery3.getBlob(1))).zzaA();
                                                                    numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list6 = (List) arrayMap7.get(numValueOf7);
                                                                    if (list6 == null) {
                                                                        arrayList3 = new ArrayList();
                                                                        arrayMap7.put(numValueOf7, arrayList3);
                                                                    } else {
                                                                        arrayList3 = list6;
                                                                    }
                                                                    arrayList3.add(zzesVarZzaA2);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it9 = it9;
                                                                }
                                                                cursorQuery3.close();
                                                                mapEmptyMap2 = arrayMap7;
                                                            } else {
                                                                it9 = it9;
                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                cursorQuery3.close();
                                                            }
                                                            arrayMap6.put(strZzf, mapEmptyMap2);
                                                        } else {
                                                            it9 = it9;
                                                            str14 = str7;
                                                            str15 = str8;
                                                        }
                                                        it10 = mapEmptyMap2.keySet().iterator();
                                                        while (it10.hasNext()) {
                                                            iIntValue3 = ((Integer) it10.next()).intValue();
                                                            set2 = this.c;
                                                            numValueOf4 = Integer.valueOf(iIntValue3);
                                                            if (set2.contains(numValueOf4)) {
                                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                break;
                                                                break;
                                                            }
                                                            it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                            zK2 = true;
                                                            while (true) {
                                                                if (it11.hasNext()) {
                                                                    zzesVar = (zzes) it11.next();
                                                                    if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                        zzej zzejVarZzj2 = this.zzs.zzay().zzj();
                                                                        Integer numValueOf17 = Integer.valueOf(iIntValue3);
                                                                        if (zzesVar.zzj()) {
                                                                            numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                        } else {
                                                                            numValueOf6 = null;
                                                                        }
                                                                        zzejVarZzj2.zzd("Evaluating filter. audience, filter, property", numValueOf17, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                        this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().v(zzesVar));
                                                                    }
                                                                    if (zzesVar.zzj()) {
                                                                    }
                                                                    zzej zzejVarZzk2 = this.zzs.zzay().zzk();
                                                                    Object objZzn2 = zzel.zzn(this.b);
                                                                    if (zzesVar.zzj()) {
                                                                        numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                    } else {
                                                                        numValueOf5 = null;
                                                                    }
                                                                    zzejVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf5));
                                                                    this.c.add(Integer.valueOf(iIntValue3));
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                } else {
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                }
                                                                if (!zK2) {
                                                                    this.c.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                c(Integer.valueOf(iIntValue3)).c(l4Var);
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                            }
                                                        }
                                                        it9 = it9;
                                                        str8 = str15;
                                                        str7 = str14;
                                                    }
                                                }
                                                str17 = str7;
                                                arrayList4 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.d.keySet();
                                                setKeySet2.removeAll(this.c);
                                                it12 = setKeySet2.iterator();
                                                while (it12.hasNext()) {
                                                    int iIntValue7 = it12.next().intValue();
                                                    Map<Integer, h4> map9 = this.d;
                                                    Integer numValueOf18 = Integer.valueOf(iIntValue7);
                                                    h4 h4Var2 = map9.get(numValueOf18);
                                                    Preconditions.checkNotNull(h4Var2);
                                                    zzfk zzfkVarA2 = h4Var2.a(iIntValue7);
                                                    arrayList4.add(zzfkVarA2);
                                                    dVarZzi4 = this.zzf.zzi();
                                                    str18 = this.b;
                                                    zzgd zzgdVarZzd2 = zzfkVarA2.zzd();
                                                    dVarZzi4.zzY();
                                                    dVarZzi4.zzg();
                                                    Preconditions.checkNotEmpty(str18);
                                                    Preconditions.checkNotNull(zzgdVarZzd2);
                                                    byte[] bArrZzbs2 = zzgdVarZzd2.zzbs();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str18);
                                                    contentValues.put(str17, numValueOf18);
                                                    String str31 = str13;
                                                    contentValues.put(str31, bArrZzbs2);
                                                    if (dVarZzi4.F().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        dVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzel.zzn(str18));
                                                    }
                                                    str13 = str31;
                                                }
                                                return arrayList4;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayMap8 = arrayMap8;
                                            str24 = str2;
                                            str23 = str23;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            dVarZzi7.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzel.zzn(str26), e);
                                            Map mapEmptyMap5 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap5;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = arrayMap8;
                                } else {
                                    Map mapEmptyMap6 = Collections.emptyMap();
                                    cursorQuery.close();
                                    map2 = mapEmptyMap6;
                                    str2 = "audience_id";
                                    str23 = "data";
                                }
                            } catch (SQLiteException e22) {
                                e = e22;
                                str2 = "audience_id";
                            }
                            if (!map2.isEmpty()) {
                                HashSet hashSet2 = new HashSet(map2.keySet());
                                if (z) {
                                    str5 = this.b;
                                    Preconditions.checkNotEmpty(str5);
                                    Preconditions.checkNotNull(map2);
                                    arrayMap2 = new ArrayMap();
                                    if (!map2.isEmpty()) {
                                        d dVarZzi9 = this.zzf.zzi();
                                        dVarZzi9.zzY();
                                        dVarZzi9.zzg();
                                        Preconditions.checkNotEmpty(str5);
                                        arrayMap3 = new ArrayMap();
                                        F = dVarZzi9.F();
                                        cursorRawQuery = F.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str5, str5});
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                arrayList = (List) arrayMap3.get(numValueOf);
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    arrayMap3.put(numValueOf, arrayList);
                                                }
                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            arrayMap3 = Collections.emptyMap();
                                        }
                                        cursorRawQuery.close();
                                        it4 = map2.keySet().iterator();
                                        while (it4.hasNext()) {
                                            int iIntValue8 = ((Integer) it4.next()).intValue();
                                            Integer numValueOf19 = Integer.valueOf(iIntValue8);
                                            zzgdVar2 = (zzgd) map2.get(numValueOf19);
                                            list4 = (List) arrayMap3.get(numValueOf19);
                                            if (list4 != null) {
                                            }
                                            map4 = arrayMap3;
                                            arrayMap2.put(numValueOf19, zzgdVar2);
                                            arrayMap3 = map4;
                                            it4 = it4;
                                        }
                                    }
                                    map3 = arrayMap2;
                                } else {
                                    map3 = map2;
                                }
                                it2 = hashSet2.iterator();
                                while (it2.hasNext()) {
                                    iIntValue = ((Integer) it2.next()).intValue();
                                    zzgdVar = (zzgd) map3.get(Integer.valueOf(iIntValue));
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    arrayMap = new ArrayMap();
                                    if (zzgdVar != null) {
                                        while (r2.hasNext()) {
                                            if (zzfmVar.zzh()) {
                                                Integer numValueOf110 = Integer.valueOf(zzfmVar.zza());
                                                if (zzfmVar.zzg()) {
                                                    lValueOf = Long.valueOf(zzfmVar.zzb());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                arrayMap.put(numValueOf110, lValueOf);
                                            }
                                        }
                                    }
                                    ArrayMap arrayMap12 = new ArrayMap();
                                    if (zzgdVar != null) {
                                        it3 = zzgdVar.zzm().iterator();
                                        while (it3.hasNext()) {
                                            next = it3.next();
                                            if (!next.zzi()) {
                                            }
                                        }
                                    }
                                    Map map10 = map3;
                                    if (zzgdVar != null) {
                                        i3 = 0;
                                        while (i3 < zzgdVar.zzd() * 64) {
                                            if (zzku.C(zzgdVar.zzn(), i3)) {
                                                str3 = str22;
                                                str4 = str21;
                                                this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                bitSet2.set(i3);
                                                if (zzku.C(zzgdVar.zzk(), i3)) {
                                                    bitSet.set(i3);
                                                }
                                                i3++;
                                                str22 = str3;
                                                str21 = str4;
                                            } else {
                                                str3 = str22;
                                                str4 = str21;
                                            }
                                            arrayMap.remove(Integer.valueOf(i3));
                                            i3++;
                                            str22 = str3;
                                            str21 = str4;
                                        }
                                    }
                                    String str213 = str22;
                                    String str214 = str21;
                                    Integer numValueOf111 = Integer.valueOf(iIntValue);
                                    zzgd zzgdVar5 = (zzgd) map2.get(numValueOf111);
                                    if (!zZzs2) {
                                    }
                                    this.d.put(Integer.valueOf(iIntValue), new h4(this, this.b, zzgdVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                                    map2 = map2;
                                    str22 = str213;
                                    map = map;
                                    map3 = map10;
                                    str21 = str214;
                                }
                            }
                            String str215 = str22;
                            str6 = str21;
                            str7 = str2;
                            str8 = str23;
                            zzuVar = null;
                            if (!list.isEmpty()) {
                                i4Var = new i4(this, zzuVar);
                                arrayMap4 = new ArrayMap();
                                it5 = list.iterator();
                                while (it5.hasNext()) {
                                    next2 = it5.next();
                                    zzfoVarA = i4Var.a(this.b, next2);
                                    if (zzfoVarA != null) {
                                        dVarZzi = this.zzf.zzi();
                                        str9 = this.b;
                                        strZzh = zzfoVarA.zzh();
                                        gVarL = dVarZzi.L(str9, next2.zzh());
                                        if (gVarL == null) {
                                            dVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzel.zzn(str9), dVarZzi.zzs.zzj().zzd(strZzh));
                                            gVar = new g(str9, next2.zzh(), 1L, 1L, 1L, next2.zzd(), 0L, null, null, null, null);
                                        } else {
                                            gVar = new g(gVarL.a, gVarL.b, gVarL.c + 1, gVarL.d + 1, gVarL.e + 1, gVarL.f, gVarL.g, gVarL.h, gVarL.i, gVarL.j, gVarL.k);
                                        }
                                        this.zzf.zzi().f(gVar);
                                        j = gVar.c;
                                        strZzh2 = zzfoVarA.zzh();
                                        mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                        if (mapEmptyMap == null) {
                                            dVarZzi2 = this.zzf.zzi();
                                            str12 = this.b;
                                            dVarZzi2.zzY();
                                            dVarZzi2.zzg();
                                            Preconditions.checkNotEmpty(str12);
                                            Preconditions.checkNotEmpty(strZzh2);
                                            arrayMap5 = new ArrayMap();
                                            str7 = str7;
                                            str8 = str8;
                                            str10 = str19;
                                            cursorQuery2 = dVarZzi2.F().query("event_filters", new String[]{str7, str8}, "app_id=? AND event_name=?", new String[]{str12, strZzh2}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                str8 = str8;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzej zzejVarZzaA4 = ((zzei) zzku.s(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaA();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) arrayMap5.get(numValueOf3);
                                                    if (list5 == null) {
                                                        str7 = str7;
                                                        arrayList2 = new ArrayList();
                                                        arrayMap5.put(numValueOf3, arrayList2);
                                                    } else {
                                                        str7 = str7;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(zzejVarZzaA4);
                                                    str11 = str6;
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    str6 = str11;
                                                    arrayMap5 = arrayMap5;
                                                    str7 = str7;
                                                }
                                                cursorQuery2.close();
                                                mapEmptyMap = arrayMap5;
                                            } else {
                                                str8 = str8;
                                                str7 = str7;
                                                str11 = str6;
                                                mapEmptyMap = Collections.emptyMap();
                                                cursorQuery2.close();
                                            }
                                            arrayMap4.put(strZzh2, mapEmptyMap);
                                        } else {
                                            str10 = str19;
                                            str11 = str6;
                                        }
                                        it6 = mapEmptyMap.keySet().iterator();
                                        while (it6.hasNext()) {
                                            iIntValue2 = ((Integer) it6.next()).intValue();
                                            set = this.c;
                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                            if (set.contains(numValueOf2)) {
                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                            } else {
                                                it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                                                zK = true;
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        map5 = mapEmptyMap;
                                                        it8 = it6;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.zzej zzejVar6 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                                    j4Var = new j4(this, this.b, iIntValue2, zzejVar6);
                                                    map5 = mapEmptyMap;
                                                    it8 = it6;
                                                    zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar6.zzb()));
                                                    if (!zK) {
                                                        this.c.add(Integer.valueOf(iIntValue2));
                                                        break;
                                                    }
                                                    c(Integer.valueOf(iIntValue2)).c(j4Var);
                                                    mapEmptyMap = map5;
                                                    it6 = it8;
                                                }
                                                if (!zK) {
                                                    this.c.add(Integer.valueOf(iIntValue2));
                                                }
                                                mapEmptyMap = map5;
                                                it6 = it8;
                                            }
                                        }
                                        it5 = it5;
                                        str6 = str11;
                                        i4Var = i4Var;
                                        str19 = str10;
                                    }
                                }
                            }
                            str13 = str19;
                            if (!list2.isEmpty()) {
                                arrayMap6 = new ArrayMap();
                                it9 = list2.iterator();
                                while (it9.hasNext()) {
                                    zzgh next5 = it9.next();
                                    strZzf = next5.zzf();
                                    mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                    if (mapEmptyMap2 == null) {
                                        dVarZzi3 = this.zzf.zzi();
                                        str16 = this.b;
                                        dVarZzi3.zzY();
                                        dVarZzi3.zzg();
                                        Preconditions.checkNotEmpty(str16);
                                        Preconditions.checkNotEmpty(strZzf);
                                        arrayMap7 = new ArrayMap();
                                        str14 = str7;
                                        str15 = str8;
                                        cursorQuery3 = dVarZzi3.F().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            while (true) {
                                                zzes zzesVarZzaA3 = ((com.google.android.gms.internal.measurement.zzer) zzku.s(zzes.zzc(), cursorQuery3.getBlob(1))).zzaA();
                                                numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                list6 = (List) arrayMap7.get(numValueOf7);
                                                if (list6 == null) {
                                                    arrayList3 = new ArrayList();
                                                    arrayMap7.put(numValueOf7, arrayList3);
                                                } else {
                                                    arrayList3 = list6;
                                                }
                                                arrayList3.add(zzesVarZzaA3);
                                                if (!cursorQuery3.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                it9 = it9;
                                            }
                                            cursorQuery3.close();
                                            mapEmptyMap2 = arrayMap7;
                                        } else {
                                            it9 = it9;
                                            mapEmptyMap2 = Collections.emptyMap();
                                            cursorQuery3.close();
                                        }
                                        arrayMap6.put(strZzf, mapEmptyMap2);
                                    } else {
                                        it9 = it9;
                                        str14 = str7;
                                        str15 = str8;
                                    }
                                    it10 = mapEmptyMap2.keySet().iterator();
                                    while (it10.hasNext()) {
                                        iIntValue3 = ((Integer) it10.next()).intValue();
                                        set2 = this.c;
                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                        if (set2.contains(numValueOf4)) {
                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                            break;
                                            break;
                                        }
                                        it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                        zK2 = true;
                                        while (true) {
                                            if (it11.hasNext()) {
                                                zzesVar = (zzes) it11.next();
                                                if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                    zzej zzejVarZzj3 = this.zzs.zzay().zzj();
                                                    Integer numValueOf112 = Integer.valueOf(iIntValue3);
                                                    if (zzesVar.zzj()) {
                                                        numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                    } else {
                                                        numValueOf6 = null;
                                                    }
                                                    zzejVarZzj3.zzd("Evaluating filter. audience, filter, property", numValueOf112, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                    this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().v(zzesVar));
                                                }
                                                if (zzesVar.zzj()) {
                                                }
                                                zzej zzejVarZzk3 = this.zzs.zzay().zzk();
                                                Object objZzn3 = zzel.zzn(this.b);
                                                if (zzesVar.zzj()) {
                                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                zzejVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf5));
                                                this.c.add(Integer.valueOf(iIntValue3));
                                                mapEmptyMap2 = mapEmptyMap2;
                                            } else {
                                                mapEmptyMap2 = mapEmptyMap2;
                                            }
                                            if (!zK2) {
                                                this.c.add(Integer.valueOf(iIntValue3));
                                            }
                                            mapEmptyMap2 = mapEmptyMap2;
                                            c(Integer.valueOf(iIntValue3)).c(l4Var);
                                            mapEmptyMap2 = mapEmptyMap2;
                                        }
                                    }
                                    it9 = it9;
                                    str8 = str15;
                                    str7 = str14;
                                }
                            }
                            str17 = str7;
                            arrayList4 = new ArrayList();
                            Set<Integer> setKeySet3 = this.d.keySet();
                            setKeySet3.removeAll(this.c);
                            it12 = setKeySet3.iterator();
                            while (it12.hasNext()) {
                                int iIntValue9 = it12.next().intValue();
                                Map<Integer, h4> map11 = this.d;
                                Integer numValueOf113 = Integer.valueOf(iIntValue9);
                                h4 h4Var3 = map11.get(numValueOf113);
                                Preconditions.checkNotNull(h4Var3);
                                zzfk zzfkVarA3 = h4Var3.a(iIntValue9);
                                arrayList4.add(zzfkVarA3);
                                dVarZzi4 = this.zzf.zzi();
                                str18 = this.b;
                                zzgd zzgdVarZzd3 = zzfkVarA3.zzd();
                                dVarZzi4.zzY();
                                dVarZzi4.zzg();
                                Preconditions.checkNotEmpty(str18);
                                Preconditions.checkNotNull(zzgdVarZzd3);
                                byte[] bArrZzbs3 = zzgdVarZzd3.zzbs();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str18);
                                contentValues.put(str17, numValueOf113);
                                String str32 = str13;
                                contentValues.put(str32, bArrZzbs3);
                                if (dVarZzi4.F().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    dVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzel.zzn(str18));
                                }
                                str13 = str32;
                            }
                            return arrayList4;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e23) {
                e = e23;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r5 = 0;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        d dVarZzi10 = this.zzf.zzi();
        String str216 = this.b;
        dVarZzi10.zzY();
        dVarZzi10.zzg();
        Preconditions.checkNotEmpty(str216);
        try {
            cursorQuery = dVarZzi10.F().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str216}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap7 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap7;
                str2 = "audience_id";
                str23 = "data";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i4), ((zzgc) zzku.s(zzgd.zzf(), cursorQuery.getBlob(1))).zzaA());
                    str2 = str24;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    arrayMap8 = arrayMap8;
                    str24 = str2;
                    str23 = str23;
                }
                cursorQuery.close();
                map2 = arrayMap8;
            }
        } catch (SQLiteException e24) {
            e = e24;
            str2 = "audience_id";
            str23 = "data";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            HashSet hashSet3 = new HashSet(map2.keySet());
            if (z) {
                str5 = this.b;
                Preconditions.checkNotEmpty(str5);
                Preconditions.checkNotNull(map2);
                arrayMap2 = new ArrayMap();
                if (!map2.isEmpty()) {
                    d dVarZzi11 = this.zzf.zzi();
                    dVarZzi11.zzY();
                    dVarZzi11.zzg();
                    Preconditions.checkNotEmpty(str5);
                    arrayMap3 = new ArrayMap();
                    F = dVarZzi11.F();
                    cursorRawQuery = F.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str5, str5});
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                            arrayList = (List) arrayMap3.get(numValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                arrayMap3.put(numValueOf, arrayList);
                            }
                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                        } while (cursorRawQuery.moveToNext());
                    } else {
                        arrayMap3 = Collections.emptyMap();
                    }
                    cursorRawQuery.close();
                    it4 = map2.keySet().iterator();
                    while (it4.hasNext()) {
                        int iIntValue10 = ((Integer) it4.next()).intValue();
                        Integer numValueOf114 = Integer.valueOf(iIntValue10);
                        zzgdVar2 = (zzgd) map2.get(numValueOf114);
                        list4 = (List) arrayMap3.get(numValueOf114);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap3;
                            arrayMap2.put(numValueOf114, zzgdVar2);
                            arrayMap3 = map4;
                            it4 = it4;
                        } else {
                            map4 = arrayMap3;
                            List<Long> listX = this.zzf.zzu().x(zzgdVar2.zzk(), list4);
                            if (listX.isEmpty()) {
                                arrayMap3 = map4;
                            } else {
                                zzgc zzgcVarZzbv = zzgdVar2.zzbv();
                                zzgcVarZzbv.zze();
                                zzgcVarZzbv.zzb(listX);
                                List<Long> listX2 = this.zzf.zzu().x(zzgdVar2.zzn(), list4);
                                zzgcVarZzbv.zzf();
                                zzgcVarZzbv.zzd(listX2);
                                for (int i5 = 0; i5 < zzgdVar2.zza(); i5++) {
                                    if (list4.contains(Integer.valueOf(zzgdVar2.zze(i5).zza()))) {
                                        zzgcVarZzbv.zzg(i5);
                                    }
                                }
                                for (int i6 = 0; i6 < zzgdVar2.zzc(); i6++) {
                                    if (list4.contains(Integer.valueOf(zzgdVar2.zzi(i6).zzb()))) {
                                        zzgcVarZzbv.zzh(i6);
                                    }
                                }
                                arrayMap2.put(Integer.valueOf(iIntValue10), zzgcVarZzbv.zzaA());
                                arrayMap3 = map4;
                                it4 = it4;
                            }
                        }
                    }
                }
                map3 = arrayMap2;
            } else {
                map3 = map2;
            }
            it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                iIntValue = ((Integer) it2.next()).intValue();
                zzgdVar = (zzgd) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zzgdVar != null && zzgdVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzfmVar.zzh()) {
                            Integer numValueOf115 = Integer.valueOf(zzfmVar.zza());
                            if (zzfmVar.zzg()) {
                                lValueOf = Long.valueOf(zzfmVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf115, lValueOf);
                        }
                    }
                }
                ArrayMap arrayMap13 = new ArrayMap();
                if (zzgdVar != null && zzgdVar.zzc() != 0) {
                    it3 = zzgdVar.zzm().iterator();
                    while (it3.hasNext()) {
                        next = it3.next();
                        if (!next.zzi() && next.zza() > 0) {
                            arrayMap13.put(Integer.valueOf(next.zzb()), Long.valueOf(next.zzc(next.zza() - 1)));
                            map3 = map3;
                            it3 = it3;
                        }
                    }
                }
                Map map12 = map3;
                if (zzgdVar != null) {
                    i3 = 0;
                    while (i3 < zzgdVar.zzd() * 64) {
                        if (zzku.C(zzgdVar.zzn(), i3)) {
                            str3 = str22;
                            str4 = str21;
                            this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzku.C(zzgdVar.zzk(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            str22 = str3;
                            str21 = str4;
                        } else {
                            str3 = str22;
                            str4 = str21;
                        }
                        arrayMap.remove(Integer.valueOf(i3));
                        i3++;
                        str22 = str3;
                        str21 = str4;
                    }
                }
                String str217 = str22;
                String str218 = str21;
                Integer numValueOf116 = Integer.valueOf(iIntValue);
                zzgd zzgdVar6 = (zzgd) map2.get(numValueOf116);
                if (!zZzs2 && zZzs && (list3 = (List) map.get(numValueOf116)) != null && this.f != null && this.e != null) {
                    for (com.google.android.gms.internal.measurement.zzej zzejVar7 : list3) {
                        int iZzb = zzejVar7.zzb();
                        long jLongValue = this.f.longValue() / 1000;
                        if (zzejVar7.zzm()) {
                            jLongValue = this.e.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf20)) {
                            arrayMap.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (arrayMap13.containsKey(numValueOf20)) {
                            arrayMap13.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.d.put(Integer.valueOf(iIntValue), new h4(this, this.b, zzgdVar6, bitSet, bitSet2, arrayMap, arrayMap13, null));
                map2 = map2;
                str22 = str217;
                map = map;
                map3 = map12;
                str21 = str218;
            }
        }
        String str219 = str22;
        str6 = str21;
        str7 = str2;
        str8 = str23;
        zzuVar = null;
        if (!list.isEmpty()) {
            i4Var = new i4(this, zzuVar);
            arrayMap4 = new ArrayMap();
            it5 = list.iterator();
            while (it5.hasNext()) {
                next2 = it5.next();
                zzfoVarA = i4Var.a(this.b, next2);
                if (zzfoVarA != null) {
                    dVarZzi = this.zzf.zzi();
                    str9 = this.b;
                    strZzh = zzfoVarA.zzh();
                    gVarL = dVarZzi.L(str9, next2.zzh());
                    if (gVarL == null) {
                        dVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzel.zzn(str9), dVarZzi.zzs.zzj().zzd(strZzh));
                        gVar = new g(str9, next2.zzh(), 1L, 1L, 1L, next2.zzd(), 0L, null, null, null, null);
                    } else {
                        gVar = new g(gVarL.a, gVarL.b, gVarL.c + 1, gVarL.d + 1, gVarL.e + 1, gVarL.f, gVarL.g, gVarL.h, gVarL.i, gVarL.j, gVarL.k);
                    }
                    this.zzf.zzi().f(gVar);
                    j = gVar.c;
                    strZzh2 = zzfoVarA.zzh();
                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                    if (mapEmptyMap == null) {
                        dVarZzi2 = this.zzf.zzi();
                        str12 = this.b;
                        dVarZzi2.zzY();
                        dVarZzi2.zzg();
                        Preconditions.checkNotEmpty(str12);
                        Preconditions.checkNotEmpty(strZzh2);
                        arrayMap5 = new ArrayMap();
                        str7 = str7;
                        str8 = str8;
                        str10 = str19;
                        cursorQuery2 = dVarZzi2.F().query("event_filters", new String[]{str7, str8}, "app_id=? AND event_name=?", new String[]{str12, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            str8 = str8;
                            while (true) {
                                com.google.android.gms.internal.measurement.zzej zzejVarZzaA5 = ((zzei) zzku.s(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaA();
                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) arrayMap5.get(numValueOf3);
                                if (list5 == null) {
                                    str7 = str7;
                                    arrayList2 = new ArrayList();
                                    arrayMap5.put(numValueOf3, arrayList2);
                                } else {
                                    str7 = str7;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(zzejVarZzaA5);
                                str11 = str6;
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                str6 = str11;
                                arrayMap5 = arrayMap5;
                                str7 = str7;
                            }
                            cursorQuery2.close();
                            mapEmptyMap = arrayMap5;
                        } else {
                            str8 = str8;
                            str7 = str7;
                            str11 = str6;
                            mapEmptyMap = Collections.emptyMap();
                            cursorQuery2.close();
                        }
                        arrayMap4.put(strZzh2, mapEmptyMap);
                    } else {
                        str10 = str19;
                        str11 = str6;
                    }
                    it6 = mapEmptyMap.keySet().iterator();
                    while (it6.hasNext()) {
                        iIntValue2 = ((Integer) it6.next()).intValue();
                        set = this.c;
                        numValueOf2 = Integer.valueOf(iIntValue2);
                        if (set.contains(numValueOf2)) {
                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                        } else {
                            it7 = ((List) mapEmptyMap.get(numValueOf2)).iterator();
                            zK = true;
                            while (true) {
                                if (!it7.hasNext()) {
                                    map5 = mapEmptyMap;
                                    it8 = it6;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzej zzejVar8 = (com.google.android.gms.internal.measurement.zzej) it7.next();
                                j4Var = new j4(this, this.b, iIntValue2, zzejVar8);
                                map5 = mapEmptyMap;
                                it8 = it6;
                                zK = j4Var.k(this.e, this.f, zzfoVarA, j, gVar, d(iIntValue2, zzejVar8.zzb()));
                                if (!zK) {
                                    this.c.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                c(Integer.valueOf(iIntValue2)).c(j4Var);
                                mapEmptyMap = map5;
                                it6 = it8;
                            }
                            if (!zK) {
                                this.c.add(Integer.valueOf(iIntValue2));
                            }
                            mapEmptyMap = map5;
                            it6 = it8;
                        }
                    }
                    it5 = it5;
                    str6 = str11;
                    i4Var = i4Var;
                    str19 = str10;
                }
            }
        }
        str13 = str19;
        if (!list2.isEmpty()) {
            arrayMap6 = new ArrayMap();
            it9 = list2.iterator();
            while (it9.hasNext()) {
                zzgh next6 = it9.next();
                strZzf = next6.zzf();
                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                if (mapEmptyMap2 == null) {
                    dVarZzi3 = this.zzf.zzi();
                    str16 = this.b;
                    dVarZzi3.zzY();
                    dVarZzi3.zzg();
                    Preconditions.checkNotEmpty(str16);
                    Preconditions.checkNotEmpty(strZzf);
                    arrayMap7 = new ArrayMap();
                    str14 = str7;
                    str15 = str8;
                    cursorQuery3 = dVarZzi3.F().query("property_filters", new String[]{str14, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            zzes zzesVarZzaA4 = ((com.google.android.gms.internal.measurement.zzer) zzku.s(zzes.zzc(), cursorQuery3.getBlob(1))).zzaA();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) arrayMap7.get(numValueOf7);
                            if (list6 == null) {
                                arrayList3 = new ArrayList();
                                arrayMap7.put(numValueOf7, arrayList3);
                            } else {
                                arrayList3 = list6;
                            }
                            arrayList3.add(zzesVarZzaA4);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it9 = it9;
                        }
                        cursorQuery3.close();
                        mapEmptyMap2 = arrayMap7;
                    } else {
                        it9 = it9;
                        mapEmptyMap2 = Collections.emptyMap();
                        cursorQuery3.close();
                    }
                    arrayMap6.put(strZzf, mapEmptyMap2);
                } else {
                    it9 = it9;
                    str14 = str7;
                    str15 = str8;
                }
                it10 = mapEmptyMap2.keySet().iterator();
                while (it10.hasNext()) {
                    iIntValue3 = ((Integer) it10.next()).intValue();
                    set2 = this.c;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it11 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zK2 = true;
                    while (true) {
                        if (it11.hasNext()) {
                            zzesVar = (zzes) it11.next();
                            if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                zzej zzejVarZzj4 = this.zzs.zzay().zzj();
                                Integer numValueOf117 = Integer.valueOf(iIntValue3);
                                if (zzesVar.zzj()) {
                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzejVarZzj4.zzd("Evaluating filter. audience, filter, property", numValueOf117, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().v(zzesVar));
                            }
                            if (zzesVar.zzj() || zzesVar.zza() > 256) {
                                zzej zzejVarZzk4 = this.zzs.zzay().zzk();
                                Object objZzn4 = zzel.zzn(this.b);
                                if (zzesVar.zzj()) {
                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzejVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, String.valueOf(numValueOf5));
                                this.c.add(Integer.valueOf(iIntValue3));
                                mapEmptyMap2 = mapEmptyMap2;
                            } else {
                                l4Var = new l4(this, this.b, iIntValue3, zzesVar);
                                zK2 = l4Var.k(this.e, this.f, next6, d(iIntValue3, zzesVar.zza()));
                                if (zK2) {
                                    c(Integer.valueOf(iIntValue3)).c(l4Var);
                                    mapEmptyMap2 = mapEmptyMap2;
                                } else {
                                    this.c.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        } else {
                            mapEmptyMap2 = mapEmptyMap2;
                        }
                        if (!zK2) {
                            this.c.add(Integer.valueOf(iIntValue3));
                        }
                        mapEmptyMap2 = mapEmptyMap2;
                    }
                }
                it9 = it9;
                str8 = str15;
                str7 = str14;
            }
        }
        str17 = str7;
        arrayList4 = new ArrayList();
        Set<Integer> setKeySet4 = this.d.keySet();
        setKeySet4.removeAll(this.c);
        it12 = setKeySet4.iterator();
        while (it12.hasNext()) {
            int iIntValue11 = it12.next().intValue();
            Map<Integer, h4> map13 = this.d;
            Integer numValueOf118 = Integer.valueOf(iIntValue11);
            h4 h4Var4 = map13.get(numValueOf118);
            Preconditions.checkNotNull(h4Var4);
            zzfk zzfkVarA4 = h4Var4.a(iIntValue11);
            arrayList4.add(zzfkVarA4);
            dVarZzi4 = this.zzf.zzi();
            str18 = this.b;
            zzgd zzgdVarZzd4 = zzfkVarA4.zzd();
            dVarZzi4.zzY();
            dVarZzi4.zzg();
            Preconditions.checkNotEmpty(str18);
            Preconditions.checkNotNull(zzgdVarZzd4);
            byte[] bArrZzbs4 = zzgdVarZzd4.zzbs();
            contentValues = new ContentValues();
            contentValues.put("app_id", str18);
            contentValues.put(str17, numValueOf118);
            String str33 = str13;
            contentValues.put(str33, bArrZzbs4);
            if (dVarZzi4.F().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                dVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzel.zzn(str18));
            }
            str13 = str33;
        }
        return arrayList4;
    }

    @Override // com.google.android.gms.measurement.internal.t3
    public final boolean zzb() {
        return false;
    }
}
