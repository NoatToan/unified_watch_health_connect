package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kww {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kvq f39571c;

    private boolean a(int i) {
        return i >= 44101 && i <= 44299;
    }

    private kww() {
        this.f39571c = kvq.d();
    }

    protected kww(kvq kvqVar) {
        this.f39571c = kvqVar;
    }

    static class a {
        private static final kww e = new kww();
    }

    public static kww c(Context context) {
        return a.e;
    }

    public long d(kuk kukVar) {
        return this.f39571c.insert(kvw.e(kukVar));
    }

    public int e(int i, int i2, int i3) {
        LogUtil.d("Debug_DataStatManager", "deleteStatDatas() no time limit");
        return this.f39571c.delete("stat_type >=? and stat_type <=? and client_id =? ", new String[]{Long.toString(i), Long.toString(i2), Long.toString(i3)});
    }

    public int b(int i, int i2, int i3, int i4, int i5) {
        return this.f39571c.delete("date =? and sync_status =? and stat_type >=? and stat_type <=? and client_id =? ", new String[]{Long.toString(i5), Long.toString(i4), Long.toString(i), Long.toString(i2), Long.toString(i3)});
    }

    public int e(long j, long j2, int i, int i2, int i3) {
        LogUtil.d("Debug_DataStatManager", "deleteStatDatas()");
        return this.f39571c.delete("date >=? and date <=? and stat_type >=? and stat_type <=? and client_id =? ", new String[]{Integer.toString(HiDateUtil.d(j)), Integer.toString(HiDateUtil.d(j2)), Long.toString(i), Long.toString(i2), Long.toString(i3)});
    }

    public List<kuk> a(long j, long j2, int[] iArr, List<Integer> list) {
        int length = iArr.length;
        int size = list.size() + length + 2;
        String[] strArr = new String[size];
        strArr[0] = Long.toString(HiDateUtil.d(j));
        strArr[1] = Long.toString(HiDateUtil.d(j2));
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("date >=? and date <=? ");
        kwb.d("stat_type", iArr, stringBuffer, strArr, 2);
        kwb.e("client_id", list, stringBuffer, strArr, length + 2);
        return kwf.ab(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public kuk b(int i, int i2, int i3) {
        return kwf.s(this.f39571c.query(d(), e(i, i2, i3, 2), null, null, null));
    }

    public List<kuk> c(int i, List<Integer> list, int i2) {
        StringBuffer stringBuffer = new StringBuffer("date =? and client_id =? and sync_status !=?  and stat_type in (");
        for (int i3 = 0; i3 < list.size(); i3++) {
            stringBuffer.append(list.get(i3));
            if (list.size() - 1 != i3) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(Constants.RIGHT_BRACKET_ONLY);
        String[] strArr = {Integer.toString(i), Integer.toString(i2), Integer.toString(2)};
        LogUtil.d("Debug_DataStatManager", "queryThreeCircleStat sql: " + ((Object) stringBuffer), ", selectionArgs=" + HiJsonUtil.d(strArr));
        return kwf.ab(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public kuk d(int i, int i2, int i3, int i4) {
        return kwf.s(this.f39571c.query(a(), d(i, i2, i3, i4, 2), null, null, null));
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, int i, int i2, kth kthVar) {
        String strC = kwb.c("date", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount());
        return kwf.y(this.f39571c.query(c(kthVar), new String[]{Integer.toString(HiDateUtil.d(hiDataReadOption.getStartTime())), Integer.toString(HiDateUtil.d(hiDataReadOption.getEndTime())), Integer.toString(i), Integer.toString(i2), Integer.toString(2)}, null, null, strC));
    }

    public List<HiHealthData> d(HiDataReadOption hiDataReadOption, int[] iArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[iArr.length + 4];
        stringBuffer.append("date >=? and date <=? and client_id =? and sync_status !=? ");
        strArr[0] = Integer.toString(HiDateUtil.d(hiDataReadOption.getStartTime()));
        strArr[1] = Integer.toString(HiDateUtil.d(hiDataReadOption.getEndTime()));
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        kwb.d("stat_type", iArr, stringBuffer, strArr, 4);
        return kwf.y(this.f39571c.query(stringBuffer.toString(), strArr, null, null, kwb.c("date", hiDataReadOption.getSortOrder(), hiDataReadOption.getAnchor(), hiDataReadOption.getCount())));
    }

    public List<HiHealthData> e(int i, int i2) {
        return kwf.y(this.f39571c.query("stat_type =? and client_id =? ", new String[]{Integer.toString(i), Integer.toString(i2)}, null, null, null));
    }

    public long c(kuk kukVar, kuk kukVar2) {
        int iUpdate;
        if (Double.compare(kukVar2.l(), kukVar.l()) == 0) {
            return 1L;
        }
        boolean z = false;
        if (kukVar.e() == HiDateUtil.d(System.currentTimeMillis())) {
            ReleaseLogUtil.d("HiH_DataStatManager", "updStatDt upload,statTable=", kukVar);
            kukVar.i(0);
        }
        ContentValues contentValuesC = kvw.c(kukVar);
        if (kukVar.h() == 1) {
            contentValuesC.remove("sync_status");
        }
        List<Integer> listE = HiHealthDictManager.a(BaseApplication.b()).e();
        if (!HiCommonUtil.b(listE) && listE.contains(Integer.valueOf(kukVar.b()))) {
            z = true;
        }
        if (kukVar.g() < 50 || z) {
            iUpdate = this.f39571c.update(contentValuesC, a(), d(kukVar.e(), kukVar.b(), kukVar.g(), kukVar.c(), 2));
        } else {
            iUpdate = this.f39571c.update(contentValuesC, d(), e(kukVar.e(), kukVar.g(), kukVar.c(), 2));
        }
        return iUpdate;
    }

    private long m(kuk kukVar) {
        ContentValues contentValuesC = kvw.c(kukVar);
        contentValuesC.put("date", Integer.valueOf(kukVar.e()));
        return this.f39571c.update(contentValuesC, "stat_type =? and client_id =? ", new String[]{Integer.toString(kukVar.g()), Integer.toString(kukVar.c())});
    }

    public boolean b(kuk kukVar) {
        return b(kukVar, false, kukVar.g() < 50);
    }

    private boolean c(kuk kukVar) {
        double dL = kukVar.l();
        int iG = kukVar.g();
        if (iG >= 47401 && iG <= 47406) {
            if (Double.compare(dL, 0.0d) < 0) {
                ReleaseLogUtil.e("HiH_DataStatManager", "insOrUpdStatDt menstrual data illegal");
                return false;
            }
        } else if ((iG < 44219 || iG > 44235) && iG != DicDataTypeUtil.DataType.MAX_ENV_TEMPERATURE.value() && iG != DicDataTypeUtil.DataType.MIN_ENV_TEMPERATURE.value() && iG != DicDataTypeUtil.DataType.AVG_ENV_TEMPERATURE.value() && Double.compare(dL, 0.0d) <= 0) {
            ReleaseLogUtil.e("HiH_DataStatManager", "insOrUpdStatDt newStVal<=0,tp=", Integer.valueOf(iG), ", newDt=", Integer.valueOf(kukVar.e()));
            return false;
        }
        return true;
    }

    public boolean a(kuk kukVar) {
        return i(kukVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0065: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:25:0x0065 */
    private boolean i(kuk kukVar) throws Throwable {
        Exception e;
        boolean zB;
        boolean z;
        boolean z2 = false;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), kukVar.g()) ? ljq.b(BaseApplication.b(), kukVar.g()) : false;
                try {
                    boolean zF = f(kukVar);
                    if (zB) {
                        ljq.g(BaseApplication.b(), kukVar.g());
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), kukVar.g());
                    }
                    return zF;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.e("HiH_DataStatManager", "insertOrUpdateVO2MaxDataSync: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), kukVar.g());
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    ljq.c(BaseApplication.b(), kukVar.g());
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                ljq.c(BaseApplication.b(), kukVar.g());
            }
            throw th;
        }
    }

    private boolean f(kuk kukVar) {
        LogUtil.d("Debug_DataStatManager", "insertOrUpdateVO2MaxData newStat =", kukVar);
        if (kukVar.d() <= 0) {
            kukVar.a(System.currentTimeMillis());
        }
        double dL = kukVar.l();
        kuk kukVarS = kwf.s(this.f39571c.query("stat_type =? and client_id =? ", new String[]{Integer.toString(kukVar.g()), Integer.toString(kukVar.c())}, null, null, null));
        LogUtil.d("Debug_DataStatManager", "insertOrUpdateVO2MaxData() oldStat =", kukVarS);
        if (kukVarS == null) {
            LogUtil.a("Debug_DataStatManager", "insertOrUpdateVO2MaxData a new stat comes , stat is ", kukVar);
            if (dL <= 0.0d) {
                LogUtil.j("Debug_DataStatManager", "insertOrUpdateVO2MaxData() newStat value <= 0 ! it is ", kukVar);
                return false;
            }
            return kwb.b(d(kukVar));
        }
        if (kxf.c(kukVarS, kukVar)) {
            return kwb.b(m(kukVar));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0064: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:25:0x0064 */
    public boolean b(kuk kukVar, boolean z, boolean z2) throws Throwable {
        boolean zB;
        boolean z3;
        boolean z4 = false;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), kukVar.g()) ? ljq.b(BaseApplication.b(), kukVar.g()) : false;
                try {
                    boolean zC = c(kukVar, z, z2);
                    if (zB) {
                        ljq.g(BaseApplication.b(), kukVar.g());
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), kukVar.g());
                    }
                    return zC;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.e("HiH_DataStatManager", "insertOrUpdateStatDataSync: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), kukVar.g());
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                z4 = z3;
                if (z4) {
                    ljq.c(BaseApplication.b(), kukVar.g());
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (z4) {
                ljq.c(BaseApplication.b(), kukVar.g());
            }
            throw th;
        }
    }

    private boolean c(kuk kukVar, boolean z, boolean z2) {
        kuk kukVarB;
        boolean z3 = (j(kukVar) || liq.h()) ? false : true;
        if (kukVar.d() <= 0) {
            kukVar.a(System.currentTimeMillis());
        }
        if (!c(kukVar)) {
            return false;
        }
        if (z2) {
            kukVarB = d(kukVar.e(), kukVar.b(), kukVar.g(), kukVar.c());
        } else {
            kukVarB = b(kukVar.e(), kukVar.g(), kukVar.c());
        }
        if (kukVarB == null) {
            if (z3 || a(kukVar.g())) {
                ReleaseLogUtil.d("HiH_DataStatManager", "insOrUpdStatDt:newDt=", Integer.valueOf(kukVar.e()), ",tp=", Integer.valueOf(kukVar.g()), ",", HiCommonUtil.c(Double.valueOf(kukVar.l())), ", old=null");
            }
            return kwb.b(d(kukVar));
        }
        boolean z4 = z || kxf.c(kukVarB, kukVar);
        if (z3 || a(kukVar.g())) {
            ReleaseLogUtil.d("HiH_DataStatManager", "insOrUpdStatDt:newDt=", Integer.valueOf(kukVar.e()), ",tp=", Integer.valueOf(kukVar.g()), ",", HiCommonUtil.c(Double.valueOf(kukVar.l())), ",old=", HiCommonUtil.c(Double.valueOf(kukVarB.l())), ",Upd=", Boolean.valueOf(z4));
        }
        if (!z4) {
            return true;
        }
        if (47401 == kukVar.g()) {
            long jA = HiDateUtil.a(HiDateUtil.e(System.currentTimeMillis(), 30));
            long jA2 = HiDateUtil.a(HiDateUtil.e(System.currentTimeMillis(), -30));
            long jA3 = HiDateUtil.a(kukVar.e());
            if (jA3 > jA && jA3 < jA2) {
                ReleaseLogUtil.d("HiH_DataStatManager", "insOrUpdStatDt:newDt=", Integer.valueOf(kukVar.e()), ",tp=", Integer.valueOf(kukVar.g()), ",", HiCommonUtil.c(Double.valueOf(kukVar.l())), ",old=", HiCommonUtil.c(Double.valueOf(kukVarB.l())), ",Upd=", Boolean.valueOf(z4));
            }
        }
        if (Double.compare(kukVarB.l(), kukVar.l()) != 0) {
            kukVar.i(0);
        }
        return kwb.b(c(kukVar, kukVarB));
    }

    public int e(int i, long j, int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", (Integer) 1);
        return this.f39571c.update(contentValues, "client_id =? and date =? and stat_type =? and sync_status !=? and modified_time <=? ", new String[]{Integer.toString(i), Integer.toString(HiDateUtil.d(j)), Integer.toString(i2), Integer.toString(2), Long.toString(j2)});
    }

    public List<Integer> c(int i, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[iArr.length + 2];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(0);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.d("stat_type", iArr, stringBuffer, strArr, 2);
        kwb.b(stringBuffer, "date");
        return kwf.v(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<Integer> a(int i, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[iArr.length + 2];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(2);
        stringBuffer.append("client_id =? and sync_status =? ");
        kwb.d("stat_type", iArr, stringBuffer, strArr, 2);
        kwb.b(stringBuffer, "date");
        return kwf.v(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int b(int i, long j, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", (Integer) 1);
        return this.f39571c.update(contentValues, "client_id =? and date =? and stat_type =? and sync_status !=? ", new String[]{Integer.toString(i), Integer.toString(HiDateUtil.d(j)), Integer.toString(i2), Integer.toString(2)});
    }

    public int e(int i, int i2, int i3, int i4, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", (Integer) 0);
        return this.f39571c.update(contentValues, "client_id =? and date =? and stat_type >=? and stat_type <=? and sync_status =? ", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3), Integer.toString(i4), Integer.toString(i5)});
    }

    private String d() {
        return "date =? and stat_type =? and client_id =? and sync_status !=? ";
    }

    private String a() {
        return "date =? and hihealth_type =? and stat_type =? and client_id =? and sync_status !=? ";
    }

    private String[] e(int i, int i2, int i3, int i4) {
        return new String[]{Integer.toString(i), Long.toString(i2), Integer.toString(i3), Integer.toString(i4)};
    }

    private String[] d(int i, int i2, int i3, int i4, int i5) {
        return new String[]{Integer.toString(i), Integer.toString(i2), Long.toString(i3), Integer.toString(i4), Integer.toString(i5)};
    }

    private String c(kth kthVar) {
        StringBuffer stringBuffer = new StringBuffer("date >=? and date <=? and stat_type =? and client_id =? and sync_status !=? ");
        if (kthVar != null && !TextUtils.isEmpty(kthVar.b())) {
            stringBuffer.append(kwb.c(kthVar.b()));
        }
        return stringBuffer.toString();
    }

    public List<kuk> a(int i, int i2, int i3, int i4) {
        return kwf.ab(this.f39571c.query("client_id =? ", new String[]{Integer.toString(i)}, null, null, kwb.c("date", i2, i3, i4)));
    }

    public boolean e(kuk kukVar) {
        if (kukVar.g() < 50) {
            return kwb.b(g(kukVar));
        }
        return kwb.b(h(kukVar));
    }

    public int a(long j) {
        return this.f39571c.delete("_id =? ", new String[]{Long.toString(j)});
    }

    private int h(kuk kukVar) {
        return this.f39571c.delete("date =? and stat_type =? and client_id =? ", new String[]{Integer.toString(kukVar.e()), Long.toString(kukVar.g()), Long.toString(kukVar.c())});
    }

    private int g(kuk kukVar) {
        return this.f39571c.delete("date =? and hihealth_type =? and stat_type =? and client_id =? ", new String[]{Integer.toString(kukVar.e()), Long.toString(kukVar.b()), Long.toString(kukVar.g()), Long.toString(kukVar.c())});
    }

    private boolean j(kuk kukVar) {
        return 47000 >= kukVar.g() && 46001 <= kukVar.g();
    }

    public boolean c() {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("stat_type =?  or stat_type =?  or stat_type =?  or stat_type =?  or stat_type =? ");
        return kwf.m(this.f39571c.query(stringBuffer.toString(), new String[]{Integer.toString(46016), Integer.toString(46017), Integer.toString(46019), Integer.toString(46018), Integer.toString(46020)}, null, null, null));
    }

    public List<Integer> c(int i) {
        return kwf.k(this.f39571c.query("stat_type =? and client_id =? ", new String[]{Integer.toString(44004), Integer.toString(i)}, null, null, kwb.c("date", 1, 0, 7)), "date");
    }

    public void d(int i, List<String> list, int i2) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("delete from hihealth_stat_day where date = ?  and stat_type < ?  and client_id = ").append(i2);
        int size = !njy.e(list) ? list.size() : 0;
        String[] strArr = new String[size + 2];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(50);
        if (size > 0) {
            stringBuffer.append(" and hihealth_type not in (");
            for (int i3 = 0; i3 < size; i3++) {
                stringBuffer.append("?");
                if (i3 < list.size() - 1) {
                    stringBuffer.append(",");
                } else {
                    stringBuffer.append(Constants.RIGHT_BRACKET_ONLY);
                }
                strArr[i3 + 2] = list.get(i3);
            }
        }
        this.f39571c.execSQL(stringBuffer.toString(), strArr);
    }

    public List<kuk> d(int i, int i2, List<Integer> list, int i3) {
        int size = list.size() + 2;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        strArr[1] = Integer.toString(i2);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("stat_type =? and sync_status =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 2);
        kwe.b(stringBuffer, 0, i3);
        return kwf.ab(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<kuk> c(int i, int i2, int i3, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[iArr.length + 4];
        stringBuffer.append("date =? and client_id =? and hihealth_type =? and sync_status !=? ");
        strArr[0] = Long.toString(i);
        strArr[1] = Integer.toString(i2);
        strArr[2] = Integer.toString(i3);
        strArr[3] = Integer.toString(2);
        kwb.d("stat_type", iArr, stringBuffer, strArr, 4);
        return kwf.ab(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<kuk> a(int i, int i2, int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[iArr.length + 3];
        stringBuffer.append("date =? and client_id =? and sync_status !=? ");
        strArr[0] = Long.toString(i);
        strArr[1] = Integer.toString(i2);
        strArr[2] = Integer.toString(2);
        kwb.d("stat_type", iArr, stringBuffer, strArr, 3);
        LogUtil.d("HiH_DataStatManager", "queryStatDataByTypes ", stringBuffer.toString());
        return kwf.ab(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public int c(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i2));
        return this.f39571c.update(contentValues, "_id =? ", new String[]{Integer.toString(i)});
    }

    public List<kuk> c(int i, List<Integer> list) {
        int size = list.size() + 1;
        String[] strArr = new String[size];
        strArr[0] = Integer.toString(i);
        StringBuffer stringBuffer = new StringBuffer((size * 2) + 32);
        stringBuffer.append("sync_status =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 1);
        kwe.b(stringBuffer, 0, 100);
        return kwf.ab(this.f39571c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<kuj> b() {
        return e(this.f39571c.rawQuery("select *, count(_id) as counts , max(_id) as maxId from hihealth_stat_day where date > 20240901 group by date, hihealth_type,stat_type, client_id  having counts>1;", null));
    }

    public static List<kuj> e(Cursor cursor) {
        if (cursor == null) {
            ReleaseLogUtil.e("HiH_DataStatManager", "parseDelDuplicatedStat() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                arrayList.add(a(cursor));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private static kuj a(Cursor cursor) {
        kuj kujVar = new kuj();
        kujVar.c(cursor.getInt(cursor.getColumnIndex("_id")));
        kujVar.d(cursor.getInt(cursor.getColumnIndex("date")));
        kujVar.b(cursor.getInt(cursor.getColumnIndex("hihealth_type")));
        kujVar.g(cursor.getInt(cursor.getColumnIndex("stat_type")));
        kujVar.e(cursor.getInt(cursor.getColumnIndex("client_id")));
        kujVar.a(cursor.getInt(cursor.getColumnIndex("maxId")));
        return kujVar;
    }

    public int e(kuj kujVar) {
        int iD = kujVar.d();
        int iB = kujVar.b();
        return this.f39571c.delete("date =? and hihealth_type =? and stat_type =? and client_id =? and _id <? ", new String[]{Integer.toString(kujVar.e()), Integer.toString(kujVar.a()), Integer.toString(kujVar.c()), Integer.toString(iB), Integer.toString(iD)});
    }
}
