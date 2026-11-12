package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.DbManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dsb extends HwBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f32292a = {IndoorEquipManagerApi.KEY_HEART_RATE, "resistanceLeftArmRightArm", "resistanceLeftArmLeftLeg", "resistanceLeftArmRightLeg", "resistanceRightArmLeftLeg", "resistanceRightArmRightLeg", "resistanceLeftLegRightLeg", "resistanceFreq", "resistanceLeftArmRightArmHf", "resistanceLeftArmLeftLegHf", "resistanceLeftArmRightLegHf", "resistanceRightArmLeftLegHf", "resistanceRightArmRightLegHf", "resistanceLeftLegRightLegHf"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32293b = "WeightDataDBManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile dsb f32294c = null;
    private static volatile boolean e = false;

    private dsb(Context context) {
        super(context);
        a();
    }

    public static dsb b(Context context) {
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager getInstance!");
        if (f32294c == null) {
            LogUtil.j("WeightDataDBManager", "WeightDataDBManager getInstance mDBProvider is null!");
            synchronized (dsb.class) {
                if (f32294c == null) {
                    f32294c = new dsb(context);
                }
            }
        }
        return f32294c;
    }

    private void a() {
        if (d()) {
            LogUtil.d("WeightDataDBManager", "WeightDataDBManager data base has been initialized");
        } else {
            LogUtil.a("WeightDataDBManager", "init dataBase");
            e(new Runnable() { // from class: dsb.4
                @Override // java.lang.Runnable
                public void run() {
                    dsb.this.c();
                }
            });
        }
    }

    public void c(final dol dolVar) {
        e(new Runnable() { // from class: dsb.3
            @Override // java.lang.Runnable
            public void run() {
                dsb.this.d(dolVar);
            }
        });
    }

    public void a(final dso dsoVar, final IBaseResponseCallback iBaseResponseCallback) {
        e(new Runnable() { // from class: dsb.2
            @Override // java.lang.Runnable
            public void run() {
                dsb.this.a(dsoVar);
                iBaseResponseCallback.a(0, null);
            }
        });
    }

    public void e(String str, long j) {
        final String[] strArr = {str, j + ""};
        e(new Runnable() { // from class: dsb.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("WeightDataDBManager", "WeightDataDBManager weight offline data delete resultCode ", Integer.valueOf(dsb.this.deleteStorageData("hihealth_weightData", 1, "uid=? and measure_time=?", strArr)));
            }
        });
    }

    public ArrayList<dso> c(String str) {
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager start query weightData uid==" + str);
        ArrayList<dso> arrayList = new ArrayList<>(16);
        if (str == null) {
            LogUtil.e("WeightDataDBManager", "WeightDataDBManager query data uid is null");
            return arrayList;
        }
        String str2 = "select * from " + getTableFullName("hihealth_weightData") + " where uid = ?";
        String[] strArr = {str};
        if (d() && e(f32292a)) {
            Cursor cursorRawQueryStorageData = rawQueryStorageData(1, str2, strArr);
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    arrayList.add(b(cursorRawQueryStorageData));
                }
                cursorRawQueryStorageData.close();
                LogUtil.a("WeightDataDBManager", "WeightDataDBManager query weightData done; resultBeansList.size==" + arrayList.size());
            }
            return arrayList;
        }
        LogUtil.e("WeightDataDBManager", "WeightDataDBManager query weightData table not exist");
        return arrayList;
    }

    private dso b(Cursor cursor) {
        dso dsoVar = new dso();
        dsoVar.setBodyFatRat(cursor.getFloat(cursor.getColumnIndex("body_fat")));
        dsoVar.setWeight(cursor.getFloat(cursor.getColumnIndex("weight")));
        dsoVar.h(cursor.getDouble(cursor.getColumnIndex(IndoorEquipManagerApi.KEY_HEART_RATE)));
        dsoVar.setStartTime(cursor.getLong(cursor.getColumnIndex("measure_time")));
        dsoVar.setEndTime(cursor.getLong(cursor.getColumnIndex("measure_time")));
        dsoVar.g(cursor.getDouble(cursor.getColumnIndex("resistance")));
        dsoVar.e(1, cursor.getDouble(cursor.getColumnIndex("resistanceLeftArmRightArm")));
        dsoVar.e(2, cursor.getDouble(cursor.getColumnIndex("resistanceLeftArmLeftLeg")));
        dsoVar.e(3, cursor.getDouble(cursor.getColumnIndex("resistanceLeftArmRightLeg")));
        dsoVar.e(4, cursor.getDouble(cursor.getColumnIndex("resistanceRightArmLeftLeg")));
        dsoVar.e(5, cursor.getDouble(cursor.getColumnIndex("resistanceRightArmRightLeg")));
        dsoVar.e(0, cursor.getDouble(cursor.getColumnIndex("resistanceLeftLegRightLeg")));
        dsoVar.c(cursor.getInt(cursor.getColumnIndex("resistanceFreq")));
        dsoVar.b(1, cursor.getDouble(cursor.getColumnIndex("resistanceLeftArmRightArmHf")));
        dsoVar.b(2, cursor.getDouble(cursor.getColumnIndex("resistanceLeftArmLeftLegHf")));
        dsoVar.b(3, cursor.getDouble(cursor.getColumnIndex("resistanceLeftArmRightLegHf")));
        dsoVar.b(4, cursor.getDouble(cursor.getColumnIndex("resistanceRightArmLeftLegHf")));
        dsoVar.b(5, cursor.getDouble(cursor.getColumnIndex("resistanceRightArmRightLegHf")));
        dsoVar.b(0, cursor.getDouble(cursor.getColumnIndex("resistanceLeftLegRightLegHf")));
        if (cursor.getInt(cursor.getColumnIndex("isSuspectedData")) == 1) {
            dsoVar.e(true);
            return dsoVar;
        }
        dsoVar.e(false);
        return dsoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (d()) {
            return;
        }
        LogUtil.a("WeightDataDBManager", "createTable | create new table: ", getTableFullName("hihealth_weightData"));
        StringBuilder sb = new StringBuilder(16);
        d(sb, "uid");
        d(sb, "weight");
        c(sb, "body_fat");
        c(sb, IndoorEquipManagerApi.KEY_HEART_RATE);
        e(sb, "measure_time");
        e(sb, "resistance");
        c(sb, "resistanceLeftArmRightArm");
        c(sb, "resistanceLeftArmLeftLeg");
        c(sb, "resistanceLeftArmRightLeg");
        c(sb, "resistanceRightArmLeftLeg");
        c(sb, "resistanceRightArmRightLeg");
        c(sb, "resistanceLeftLegRightLeg");
        c(sb, "resistanceFreq");
        c(sb, "resistanceLeftArmRightArmHf");
        c(sb, "resistanceLeftArmLeftLegHf");
        c(sb, "resistanceLeftArmRightLegHf");
        c(sb, "resistanceRightArmLeftLegHf");
        c(sb, "resistanceRightArmRightLegHf");
        c(sb, "resistanceLeftLegRightLegHf");
        e(sb, "isSuspectedData");
        d(sb, "productId");
        d(sb, "device_uuid");
        d(sb, "device_id");
        e(sb, "_status");
        e(sb, "_type");
        d(sb, "_remarks");
        sb.append("primary key(");
        sb.append("uid");
        sb.append(",");
        sb.append("measure_time");
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        LogUtil.d("WeightDataDBManager", "createTable | create new table sql = ", sb.toString());
        if (createStorageDataTable("hihealth_weightData", 1, sb.toString()) != 0) {
            LogUtil.j("WeightDataDBManager", "database is bad.");
            if (!deleteDatabase()) {
                return;
            } else {
                createStorageDataTable("hihealth_weightData", 1, sb.toString());
            }
        }
        if (d() && !e(f32292a)) {
            e();
        }
        LogUtil.a("WeightDataDBManager", "createTable | create table end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(dol dolVar) {
        if (dolVar == null) {
            LogUtil.d("WeightDataDBManager", "WeightDataDBManager inster resultBean is null");
            return;
        }
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager start inster weightData into weightDB...");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uid", dolVar.h());
        contentValues.put("body_fat", Float.valueOf(dolVar.a()));
        contentValues.put("weight", Float.valueOf(dolVar.j()));
        contentValues.put("measure_time", Long.valueOf(a(dolVar)));
        contentValues.put("resistance", Integer.valueOf(dolVar.i()));
        contentValues.put("isSuspectedData", Boolean.valueOf(dolVar.o()));
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager inster weightData result ", Long.valueOf(insertStorageData("hihealth_weightData", 1, contentValues)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(dso dsoVar) {
        if (dsoVar == null) {
            LogUtil.j("WeightDataDBManager", "WeightDataDBManager insert() resultBean is null");
            return;
        }
        if (!e(f32292a)) {
            LogUtil.j("WeightDataDBManager", "WeightDataDBManager hygride new columns not exist");
            return;
        }
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager start insert hagrid data : ", Long.valueOf(dsoVar.getStartTime()));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uid", dsoVar.o());
        contentValues.put("body_fat", Float.valueOf(dsoVar.getBodyFatRat()));
        contentValues.put("weight", Float.valueOf(dsoVar.getWeight()));
        contentValues.put("measure_time", Long.valueOf(dsoVar.getStartTime()));
        contentValues.put("resistanceLeftArmRightArm", Double.valueOf(dsoVar.d(1)));
        contentValues.put("resistanceLeftArmLeftLeg", Double.valueOf(dsoVar.d(2)));
        contentValues.put("resistanceLeftArmRightLeg", Double.valueOf(dsoVar.d(3)));
        contentValues.put("resistanceRightArmLeftLeg", Double.valueOf(dsoVar.d(4)));
        contentValues.put("resistanceRightArmRightLeg", Double.valueOf(dsoVar.d(5)));
        contentValues.put("resistanceLeftLegRightLeg", Double.valueOf(dsoVar.d(0)));
        contentValues.put("resistanceFreq", Integer.valueOf(dsoVar.h()));
        contentValues.put("resistanceLeftArmRightArmHf", Double.valueOf(dsoVar.b(1)));
        contentValues.put("resistanceLeftArmLeftLegHf", Double.valueOf(dsoVar.b(2)));
        contentValues.put("resistanceLeftArmRightLegHf", Double.valueOf(dsoVar.b(3)));
        contentValues.put("resistanceRightArmLeftLegHf", Double.valueOf(dsoVar.b(4)));
        contentValues.put("resistanceRightArmRightLegHf", Double.valueOf(dsoVar.b(5)));
        contentValues.put("resistanceLeftLegRightLegHf", Double.valueOf(dsoVar.b(0)));
        contentValues.put("isSuspectedData", Boolean.valueOf(dsoVar.s()));
        contentValues.put(IndoorEquipManagerApi.KEY_HEART_RATE, Double.valueOf(dsoVar.i()));
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager insert weightData result = ", Long.valueOf(insertStorageData("hihealth_weightData", 1, contentValues)));
    }

    private static void e(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" integer,");
    }

    private static void d(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" text,");
    }

    private static void c(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" real,");
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return Integer.valueOf(PrebakedEffectId.RT_HEARTBEAT);
    }

    private long a(dol dolVar) {
        try {
            Date date = new SimpleDateFormat("yyyy-M-d HH:mm:ss").parse(dolVar.f() + com.huawei.openalliance.ad.constant.Constants.LINK + dolVar.d() + com.huawei.openalliance.ad.constant.Constants.LINK + dolVar.c() + " " + dolVar.e() + ":" + dolVar.b() + ":" + dolVar.g());
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException unused) {
            LogUtil.e("WeightDataDBManager", "dateToTimeStamp() ParseException");
            return 0L;
        }
    }

    private boolean e(String[] strArr) {
        Cursor cursorQueryStorageData = queryStorageData("hihealth_weightData", 1, null);
        boolean z = false;
        for (String str : strArr) {
            z = (cursorQueryStorageData == null || cursorQueryStorageData.getColumnIndex(str) == -1) ? false : true;
            if (!z) {
                LogUtil.j("WeightDataDBManager", "WeightDataDBManager hygride columns not exist");
                break;
            }
        }
        if (cursorQueryStorageData != null) {
            cursorQueryStorageData.close();
        }
        LogUtil.j("WeightDataDBManager", "WeightDataDBManager hygride new columns exist");
        return z;
    }

    private void e() {
        LogUtil.a("WeightDataDBManager", "WeightDataDBManager begin to add new columns");
        for (String str : f32292a) {
            LogUtil.a("WeightDataDBManager", "WeightDataDBManager add column ", str);
            alterStorageDataTable("hihealth_weightData", 1, "ADD COLUMN " + str + " real default null");
        }
    }

    private void e(Runnable runnable) {
        if (runnable == null) {
            LogUtil.j("WeightDataDBManager", "serialExcute command is null");
        } else {
            ThreadPoolManager.c().b(f32293b, runnable);
        }
    }

    private boolean d() {
        if (e) {
            return true;
        }
        List<String> listE = DbManager.e(String.valueOf(getModuleId()));
        if (listE == null || !listE.contains(getTableFullName("hihealth_weightData"))) {
            return false;
        }
        e = true;
        return true;
    }
}
