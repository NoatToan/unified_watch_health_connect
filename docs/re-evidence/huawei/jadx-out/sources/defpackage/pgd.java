package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.R;
import com.huawei.pluginhealthzone.cloud.HttpDataCallback;
import com.huawei.pluginhealthzone.interactors.AbnormalDataInformationCallback;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class pgd {
    private static final Object d = new Object();

    private static int e(int i, int i2) {
        if (i == 3) {
            return 3;
        }
        if (i == 1 && i2 == 2) {
            return 3;
        }
        if (i == 2 && i2 == 1) {
            return 3;
        }
        return i == 0 ? i2 : i;
    }

    private pgd() {
    }

    public static void a(JSONObject jSONObject, final AbnormalDataInformationCallback abnormalDataInformationCallback) {
        try {
            final LongSparseArray longSparseArray = new LongSparseArray(10);
            JSONArray jSONArray = jSONObject.getJSONArray("abnormalData");
            for (int i = 0; i < jSONArray.length(); i++) {
                a((pgk) new Gson().fromJson(jSONArray.get(i).toString(), pgk.class), (LongSparseArray<pfy>) longSparseArray);
            }
            pfs.e().getMyFollowRelations(null, new HttpDataCallback() { // from class: pgd.5
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i2, String str) {
                    abnormalDataInformationCallback.onFailure(i2, str);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject2) {
                    pgd.c(jSONObject2, (LongSparseArray<pfy>) longSparseArray, abnormalDataInformationCallback);
                }
            });
        } catch (JsonSyntaxException | JSONException e) {
            LogUtil.e("HealthZonePushUtils", "getAbnormalDataString", LogAnonymous.b(e));
            abnormalDataInformationCallback.onFailure(1, LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(JSONObject jSONObject, LongSparseArray<pfy> longSparseArray, AbnormalDataInformationCallback abnormalDataInformationCallback) {
        try {
            e(jSONObject, longSparseArray, abnormalDataInformationCallback);
            ArrayList arrayList = new ArrayList(10);
            if (longSparseArray.size() == 0) {
                LogUtil.j("HealthZonePushUtils", "No abnormal information");
                abnormalDataInformationCallback.onSuccess(arrayList);
            }
        } catch (JSONException e) {
            abnormalDataInformationCallback.onFailure(1, LogAnonymous.b(e));
        }
    }

    private static void a(long j, final List<pfy> list, final LongSparseArray<pfy> longSparseArray, final AbnormalDataInformationCallback abnormalDataInformationCallback) {
        if (longSparseArray == null) {
            LogUtil.j("HealthZonePushUtils", "getUserDataFromSocial abnormalDataMap is null");
            return;
        }
        final pfy pfyVar = longSparseArray.get(j);
        if (pfyVar == null) {
            LogUtil.j("HealthZonePushUtils", "getUserDataFromSocial abnormalDataInformation is null");
        } else {
            HealthZoneUserManager.e().c(2, String.valueOf(j), new UserInfoCallback<gqd.c>() { // from class: pgd.1
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqd.c cVar) {
                    if (cVar == null) {
                        LogUtil.j("HealthZonePushUtils", "getUserDataFromSocial user is null.");
                    } else {
                        String strF = pfyVar.f();
                        String strI = pfyVar.i();
                        String strD = cVar.d();
                        if (BaseApplication.getContext().getString(R.string.IDS_hw_family_health_zone_unknown_name).equals(strF) || TextUtils.isEmpty(strF)) {
                            if (TextUtils.isEmpty(strD)) {
                                LogUtil.a("HealthZonePushUtils", "getUserDataFromSocial user has no nickname.");
                                pfyVar.b(CommonUtil.o(strI));
                            } else {
                                pfyVar.b(strD);
                            }
                        }
                    }
                    pgd.b(pfyVar, list, longSparseArray, abnormalDataInformationCallback);
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i) {
                    LogUtil.e("HealthZonePushUtils", "getUserDataFromSocial errorCode is ", Integer.valueOf(i));
                }
            });
        }
    }

    private static void e(JSONObject jSONObject, LongSparseArray<pfy> longSparseArray, AbnormalDataInformationCallback abnormalDataInformationCallback) throws JSONException, JsonSyntaxException {
        if (jSONObject == null) {
            LogUtil.j("HealthZonePushUtils", "setHealthZoneNickname data is null");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("authRelations");
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < jSONArray.length(); i++) {
            pfy pfyVar = (pfy) new Gson().fromJson(jSONArray.getString(i), pfy.class);
            if (longSparseArray.get(pfyVar.a()) != null) {
                pfy pfyVar2 = longSparseArray.get(pfyVar.a());
                if (pfyVar2 == null) {
                    LogUtil.j("HealthZonePushUtils", "abnormalDataInformation is null");
                    return;
                }
                long jA = pfyVar2.a();
                String strF = pfyVar.f();
                longSparseArray.get(pfyVar.a()).e(TextUtils.isEmpty(pfyVar.i()) ? "" : pfyVar.i());
                if (!TextUtils.isEmpty(strF)) {
                    pfyVar2.b(strF);
                    b(pfyVar2, arrayList, longSparseArray, abnormalDataInformationCallback);
                } else {
                    a(jA, arrayList, longSparseArray, abnormalDataInformationCallback);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final pfy pfyVar, final List<pfy> list, final LongSparseArray<pfy> longSparseArray, final AbnormalDataInformationCallback abnormalDataInformationCallback) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: pgf
            @Override // java.lang.Runnable
            public final void run() {
                pgd.d(pfyVar, list, longSparseArray, abnormalDataInformationCallback);
            }
        });
    }

    static /* synthetic */ void d(pfy pfyVar, List list, LongSparseArray longSparseArray, AbnormalDataInformationCallback abnormalDataInformationCallback) {
        e(pfyVar);
        synchronized (d) {
            list.add(pfyVar);
            if (list.size() == longSparseArray.size()) {
                abnormalDataInformationCallback.onSuccess(list);
            }
        }
    }

    private static void a(pgk pgkVar, LongSparseArray<pfy> longSparseArray) {
        long jD = pgkVar.d();
        Gson gson = new Gson();
        pgm pgmVar = (pgm) gson.fromJson(CommonUtil.ac(pgkVar.a()), pgm.class);
        int iE = pgkVar.e();
        if (longSparseArray.get(jD) != null) {
            pfy pfyVar = longSparseArray.get(jD);
            b(pgkVar, pfyVar);
            SparseArray<pgk> sparseArrayB = pfyVar.b();
            SparseIntArray sparseIntArrayJ = pfyVar.j();
            if (sparseArrayB == null || sparseIntArrayJ == null) {
                LogUtil.j("HealthZonePushUtils", "constructAbnormalDataMap firstPushRecordSdsDaoBeanSparseArray is null");
                return;
            }
            pgk pgkVar2 = sparseArrayB.get(iE);
            sparseIntArrayJ.append(iE, sparseIntArrayJ.get(iE) + 1);
            pfyVar.b(sparseIntArrayJ);
            long jC = pgmVar.c();
            if (pgkVar2 == null || ((pgm) gson.fromJson(CommonUtil.ac(pgkVar2.a()), pgm.class)).c() > jC) {
                sparseArrayB.append(iE, pgkVar);
                pfyVar.e(sparseArrayB);
            }
            SparseArray<pgk> sparseArrayG = pfyVar.g();
            if (sparseArrayG == null) {
                LogUtil.j("HealthZonePushUtils", "constructAbnormalDataMap lastPushRecordSdsDaoBeanSparseArray is null");
                return;
            }
            pgk pgkVar3 = sparseArrayG.get(iE);
            if (pgkVar3 == null || ((pgm) gson.fromJson(CommonUtil.ac(pgkVar3.a()), pgm.class)).c() < jC) {
                sparseArrayG.append(iE, pgkVar);
                pfyVar.a(sparseArrayG);
            }
            longSparseArray.append(jD, pfyVar);
            return;
        }
        e(pgkVar, jD, iE, longSparseArray);
    }

    private static void e(pgk pgkVar, long j, int i, LongSparseArray<pfy> longSparseArray) {
        pfy pfyVar = new pfy();
        b(pgkVar, pfyVar);
        pfyVar.b(j);
        SparseArray<pgk> sparseArray = new SparseArray<>(10);
        SparseArray<pgk> sparseArray2 = new SparseArray<>(10);
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        sparseArray.append(i, pgkVar);
        sparseArray2.append(i, pgkVar);
        sparseIntArray.append(i, 1);
        pfyVar.e(sparseArray);
        pfyVar.a(sparseArray2);
        pfyVar.b(sparseIntArray);
        longSparseArray.append(j, pfyVar);
    }

    private static void b(pgk pgkVar, pfy pfyVar) {
        try {
            JSONObject jSONObject = new JSONObject(((pgm) new Gson().fromJson(CommonUtil.ac(pgkVar.a()), pgm.class)).b());
            switch (pgkVar.e()) {
                case 24:
                    pfyVar.e(c(jSONObject.getDouble("BLOOD_PRESSURE_DIASTOLIC"), jSONObject.getDouble("BLOOD_PRESSURE_SYSTOLIC"), pfyVar.d()));
                    break;
                case 25:
                    pfyVar.b(c(jSONObject.getDouble(c(25, jSONObject)), pfyVar.c(), 7.0d, 4.4d));
                    break;
                case 26:
                    pfyVar.b(c(jSONObject.getDouble(c(26, jSONObject)), pfyVar.c(), 10.0d, 4.4d));
                    break;
                case 27:
                    pfyVar.b(c(jSONObject.getDouble(c(27, jSONObject)), pfyVar.c(), 7.0d, 3.9d));
                    break;
                default:
                    break;
            }
        } catch (JsonSyntaxException | JSONException e) {
            LogUtil.e("HealthZonePushUtils", "setPressureOrSugarStatus:", LogAnonymous.b(e));
        }
    }

    private static int c(double d2, double d3, int i) {
        int i2;
        if (d2 >= 90.000001d || d3 >= 140.000001d) {
            i2 = 1;
        } else {
            i2 = (d2 < 60.000001d || d3 < 90.000001d) ? 2 : 0;
        }
        return e(i, i2);
    }

    private static int c(double d2, int i, double d3, double d4) {
        int i2;
        if (d2 > d3) {
            i2 = 1;
        } else {
            i2 = d2 < d4 ? 2 : 0;
        }
        return e(i, i2);
    }

    private static void e(pfy pfyVar) {
        synchronized (pgd.class) {
            Context context = BaseApplication.getContext();
            if (context == null) {
                LogUtil.e("HealthZonePushUtils", "BaseApplication context is null");
                return;
            }
            SparseArray<pgk> sparseArrayB = pfyVar.b();
            SparseArray<pgk> sparseArrayG = pfyVar.g();
            String strF = pfyVar.f();
            if (strF == null) {
                LogUtil.j("HealthZonePushUtils", "nickname is null because huid is not in the list");
                return;
            }
            if (sparseArrayB == null || sparseArrayG == null) {
                LogUtil.j("HealthZonePushUtils", "constructAbnormalDataString firstPushRecordList or lastPushRecordList is null");
                return;
            }
            if (pfyVar.j() == null) {
                LogUtil.j("HealthZonePushUtils", "constructAbnormalDataString pushRecordCount is null");
                return;
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i = 21; i <= 39; i++) {
                try {
                    pgk pgkVar = sparseArrayB.get(i);
                    pgk pgkVar2 = sparseArrayG.get(i);
                    if (pgkVar == null || pgkVar2 == null) {
                        LogUtil.j("HealthZonePushUtils", "firstRecord or lastRecord is null");
                    } else {
                        String strC = c(context, i, strF);
                        if (!TextUtils.isEmpty(strC)) {
                            arrayList.add(strC);
                        }
                    }
                } catch (JsonSyntaxException e) {
                    LogUtil.e("HealthZonePushUtils", "constructAbnormalDataString:", LogAnonymous.b(e));
                }
            }
            pfyVar.e(arrayList);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    private static String c(Context context, int i, String str) {
        LogUtil.a("HealthZonePushUtils", "constructAbnormalDataString pushType is ", Integer.valueOf(i));
        String strValueOf = String.valueOf(i);
        strValueOf.hashCode();
        switch (strValueOf) {
            case "21":
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_heart_rate_reminder), str);
            case "22":
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_heart_rate_reminder), str);
            case "23":
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_blood_oxygen), str);
            case "24":
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_blood_pressure_reminder), str);
            case "25":
            case "26":
            case "27":
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_blood_sugar_reminder), str);
            case "28":
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_step_reminder), str);
            default:
                return a(context, i, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 2, list:
      (r0v0 int) from 0x000d: IF  (r0v0 int) != (1607 int)  -> B:4:0x000f A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (1629 int)  -> B:6:0x0013 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private static String a(Context context, int i, String str) {
        byte b2;
        String strValueOf = String.valueOf(i);
        strValueOf.hashCode();
        if (iHashCode != 1607) {
            if (iHashCode != 1629) {
                switch (strValueOf) {
                    case "32":
                        b2 = 2;
                        break;
                    case "33":
                        b2 = 3;
                        break;
                    case "34":
                        b2 = 4;
                        break;
                    case "35":
                        b2 = 5;
                        break;
                    case "36":
                        b2 = 6;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (strValueOf.equals(HealthZonePushReceiver.SLEEP_SCORE_NOTIFY)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strValueOf.equals(HealthZonePushReceiver.SLEEP_TIME_NOTIFY)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_sleep_duration), str);
            case 1:
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_sleep_score_low), str);
            case 2:
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_pressure_reminder), str);
            case 3:
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_blood_oxygen), str);
            case 4:
            case 5:
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_temperature_reminder), str);
            case 6:
                return String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_shared_message), str);
            default:
                return "";
        }
    }

    private static String c(int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        switch (i) {
            case 25:
                if (jSONObject.has("BLOOD_SUGAR_BF_BEFORE")) {
                    return "BLOOD_SUGAR_BF_BEFORE";
                }
                if (jSONObject.has("BLOOD_SUGAR_LC_BEFORE")) {
                    return "BLOOD_SUGAR_LC_BEFORE";
                }
                if (!jSONObject.has("BLOOD_SUGAR_DN_BEFORE")) {
                    return "";
                }
                return "BLOOD_SUGAR_DN_BEFORE";
            case 26:
                if (jSONObject.has("BLOOD_SUGAR_BF_AFTER")) {
                    return "BLOOD_SUGAR_BF_AFTER";
                }
                if (jSONObject.has("BLOOD_SUGAR_LC_AFTER")) {
                    return "BLOOD_SUGAR_LC_AFTER";
                }
                if (jSONObject.has("BLOOD_SUGAR_DN_AFTER")) {
                    return "BLOOD_SUGAR_DN_AFTER";
                }
                if (!jSONObject.has("BLOOD_SUGAR_SL_BEFORE")) {
                    return "";
                }
                return "BLOOD_SUGAR_SL_BEFORE";
            case 27:
                if (!jSONObject.has("BLOOD_SUGAR_BEFORE_DAWN")) {
                    return "";
                }
                return "BLOOD_SUGAR_BEFORE_DAWN";
            default:
                return "";
        }
    }
}
