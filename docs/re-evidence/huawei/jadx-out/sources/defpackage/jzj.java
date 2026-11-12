package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.basichealthmodel.cloud.HealthModelParamsFactory;
import com.huawei.basichealthmodel.service.SyncService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class jzj {
    private static String e() {
        return GRSManager.c(BaseApplication.b()).getUrl("marketingGateWayUrl") + "/healthFitnessPlan/app/v1/healthLifeVersion";
    }

    public static void c(final int i, final int i2, final ResponseCallback<List<fer>> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jzr
                @Override // java.lang.Runnable
                public final void run() {
                    jzj.c(i, i2, responseCallback);
                }
            });
            return;
        }
        boolean zA = CloudUtils.a();
        boolean zAb = CommonUtil.ab(BaseApplication.b());
        ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "queryHealthLifeVersion ifAllowLogin ", Boolean.valueOf(zA), " isNetworkConnected ", Boolean.valueOf(zAb));
        if (!zA || !zAb) {
            if (responseCallback != null) {
                responseCallback.onResponse(0, b(i, i2));
            }
        } else {
            HashMap map = new HashMap(2);
            map.put("startDay", String.valueOf(i));
            map.put("endDay", String.valueOf(i2));
            oet.d().e(e(), dlv.d(), map, jzf.class, new ResultCallback<jzf>() { // from class: jzj.3
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(jzf jzfVar) {
                    ResponseCallback responseCallback2;
                    LogUtil.a("HL_HealthLifeCloudUtil", "queryHealthLifeVersion onSuccess response ", jzfVar);
                    int iC = jzfVar.c();
                    if (iC != 0 && (responseCallback2 = responseCallback) != null) {
                        responseCallback2.onResponse(iC, Collections.EMPTY_LIST);
                        return;
                    }
                    List<fer> listA = jzfVar.a();
                    int iA = DateFormatUtil.a(System.currentTimeMillis());
                    if (i <= iA && iA <= i2) {
                        jzl.b(listA);
                    }
                    ResponseCallback responseCallback3 = responseCallback;
                    if (responseCallback3 == null) {
                        ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "queryHealthLifeVersion onSuccess callback is null");
                    } else {
                        responseCallback3.onResponse(iC, listA);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "queryHealthLifeVersion onFailure throwable ", ExceptionUtils.c(th));
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 == null) {
                        ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "queryHealthLifeVersion onFailure callback is null");
                    } else {
                        responseCallback2.onResponse(-1, Collections.EMPTY_LIST);
                    }
                }
            });
        }
    }

    private static List<fer> b(int i, int i2) {
        final List<fer> listB = jzl.b();
        ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "getHealthLifeVersionListByCache healthLifeVersionList ", listB);
        if (CollectionUtils.a(listB)) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> listA = lsl.a(i, i2);
        ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "getHealthLifeVersionListByCache dateList ", listA);
        if (CollectionUtils.a(listA)) {
            return listB;
        }
        listA.removeIf(new Predicate() { // from class: jzn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return jzj.c(listB, (Integer) obj);
            }
        });
        ArrayList arrayList = new ArrayList(listB);
        for (Integer num : listA) {
            if (num == null) {
                ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "getHealthLifeVersionListByCache integer is null");
            } else {
                fer ferVar = new fer();
                ferVar.d(num.intValue());
                ferVar.b(kad.d(num.intValue(), listB));
                arrayList.add(ferVar);
            }
        }
        ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "getHealthLifeVersionListByCache healthLifeVersionDTOList ", arrayList);
        return arrayList;
    }

    static /* synthetic */ boolean c(List list, Integer num) {
        if (num == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "getHealthLifeVersionListByCache integer is null");
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fer ferVar = (fer) it.next();
            if (ferVar != null) {
                return num.intValue() == ferVar.e();
            }
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "getHealthLifeVersionListByCache healthLifeVersionDTO is null");
        }
        return false;
    }

    public static void c(int i, ResponseCallback<String> responseCallback) {
        jyc.c().c(i == 0 ? 1 : 0);
        d(DateFormatUtil.a(System.currentTimeMillis()), i, responseCallback);
    }

    public static void d(final int i, final int i2, final ResponseCallback<String> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jzm
                @Override // java.lang.Runnable
                public final void run() {
                    jzj.d(i, i2, responseCallback);
                }
            });
            return;
        }
        if (Utils.k()) {
            ArrayList arrayList = new ArrayList(1);
            fer ferVar = new fer();
            ferVar.d(i);
            ferVar.b(i2 != 0 ? 0 : 1);
            arrayList.add(ferVar);
            jzl.b(arrayList);
            if (responseCallback != null) {
                qet qetVar = new qet();
                qetVar.b(0);
                responseCallback.onResponse(0, HiJsonUtil.d(qetVar));
            }
            ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion isOverseaNoCloud list:", arrayList);
            return;
        }
        HashMap map = new HashMap(3);
        map.put(ParsedFieldTag.RECORD_DAY, Integer.valueOf(i));
        map.put("sceneType", Integer.valueOf(i2));
        map.put("timeZone", lsl.q(System.currentTimeMillis()));
        String strC = ofe.c(new HealthModelParamsFactory(BaseApplication.b()).getBody(map));
        LogUtil.a("HL_HealthLifeCloudUtil", "setHealthLifeVersion recordDay ", Integer.valueOf(i), " sceneType ", Integer.valueOf(i2), " body ", strC);
        oet.d().c(e(), dlv.d(), strC, String.class, new AnonymousClass4(i2, responseCallback));
    }

    /* JADX INFO: renamed from: jzj$4, reason: invalid class name */
    class AnonymousClass4 implements ResultCallback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResponseCallback f39251a;
        final /* synthetic */ int d;

        AnonymousClass4(int i, ResponseCallback responseCallback) {
            this.d = i;
            this.f39251a = responseCallback;
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final int i = this.d;
            threadPoolManagerC.execute(new Runnable() { // from class: jzz
                @Override // java.lang.Runnable
                public final void run() {
                    jzj.e(i);
                }
            });
            jyc.c().i();
            ObserverManagerUtil.e(ObserveLabels.HEALTH_LIFE_VERSION, Integer.valueOf(this.d == 0 ? 1 : 0));
            cfb.e();
            ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion onSuccess response ", str);
            if (this.f39251a == null) {
                ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion onSuccess callback is null");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion onSuccess response is null");
                this.f39251a.onResponse(-1, "");
                return;
            }
            try {
                this.f39251a.onResponse(new JSONObject(str).optInt("resultCode"), str);
            } catch (JSONException e) {
                String strC = ExceptionUtils.c(e);
                ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion onSuccess exception ", strC);
                this.f39251a.onResponse(-1, strC);
            }
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            String strC = ExceptionUtils.c(th);
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion onFailure throwable ", strC);
            ResponseCallback responseCallback = this.f39251a;
            if (responseCallback == null) {
                ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "setHealthLifeVersion onFailure callback is null");
            } else {
                responseCallback.onResponse(-1, strC);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(int i) {
        final Map<Integer, cao> mapA = cfb.a();
        final cao caoVarA = cfb.a(mapA, 10);
        final cao caoVarA2 = cfb.a(mapA, 11);
        if (i == 0) {
            a(caoVarA.d());
            d(caoVarA2.d());
            c();
        } else {
            cee.b(new ResponseCallback() { // from class: jzx
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    jzj.a(caoVarA, mapA, i2, (Pair) obj);
                }
            });
            cee.a((ResponseCallback<Pair<Long, Boolean>>) new ResponseCallback() { // from class: jzt
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    jzj.d(caoVarA2, mapA, i2, (Pair) obj);
                }
            });
        }
    }

    static /* synthetic */ void a(cao caoVar, Map map, int i, Pair pair) {
        if (i != 0 || pair == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateAllReminders getDrinkWaterAlarm errorCode ", Integer.valueOf(i));
            return;
        }
        bwd bwdVar = (bwd) pair.second;
        if (bwdVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateAllReminders drinkWaterReminderBean is null");
        } else if (bwdVar.c() != caoVar.d()) {
            caoVar.d(bwdVar.c());
            map.put(10, caoVar);
            cfb.a((Map<Integer, cao>) map);
            SyncService.a();
        }
    }

    static /* synthetic */ void d(cao caoVar, Map map, int i, Pair pair) {
        if (i != 0 || pair == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateAllReminders getMedicationAlarm errorCode ", Integer.valueOf(i));
        } else if (((Boolean) pair.second).booleanValue() != caoVar.d()) {
            caoVar.d(((Boolean) pair.second).booleanValue());
            map.put(11, caoVar);
            cfb.a((Map<Integer, cao>) map);
            SyncService.a();
        }
    }

    private static void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jzp
            @Override // java.lang.Runnable
            public final void run() {
                jzj.a();
            }
        });
    }

    static /* synthetic */ void a() {
        Map<Integer, cao> mapA = cfb.a();
        if (CollectionUtils.c(mapA)) {
            return;
        }
        Iterator<cao> it = mapA.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (e(it.next())) {
                z = true;
            }
        }
        if (z) {
            cfb.a(mapA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b A[RETURN] */
    private static boolean e(cao caoVar) {
        boolean zD = caoVar.d();
        if (!zD && !CollectionUtils.a(caoVar.b())) {
            Iterator<ayx> it = caoVar.b().iterator();
            do {
                if (!it.hasNext()) {
                    if (zD) {
                        break;
                    }
                    return false;
                }
            } while (!it.next().h());
        } else if (zD) {
            return false;
        }
        caoVar.d(false);
        Iterator<ayx> it2 = caoVar.b().iterator();
        while (it2.hasNext()) {
            it2.next().b(false);
        }
        return true;
    }

    private static void a(final boolean z) {
        cee.b(new ResponseCallback() { // from class: jzv
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                jzj.e(z, i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void e(boolean z, int i, Pair pair) {
        if (i != 0) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateDrinkWaterReminder errorCode ", Integer.valueOf(i));
            return;
        }
        if (pair == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateDrinkWaterReminder result is null");
            return;
        }
        final bwd bwdVar = (bwd) pair.second;
        if (bwdVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateDrinkWaterReminder drinkWaterReminderBean is null");
        } else if (bwdVar.c() != z) {
            bwdVar.c(z);
            ThreadPoolManager.c().execute(new Runnable() { // from class: jzu
                @Override // java.lang.Runnable
                public final void run() {
                    cee.a(bwdVar, (ResponseCallback<Object>) new ResponseCallback() { // from class: jzw
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "disableDrinkWaterReminder resultCode ", Integer.valueOf(i2), " object ", obj);
                        }
                    });
                }
            });
        }
    }

    private static void d(final boolean z) {
        cee.a((ResponseCallback<Pair<Long, Boolean>>) new ResponseCallback() { // from class: jzs
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                jzj.a(z, i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void a(final boolean z, int i, Pair pair) {
        if (i != 0) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateTakeMedicineReminder errorCode ", Integer.valueOf(i));
        } else if (pair == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeCloudUtil", "migrateTakeMedicineReminder result is null");
        } else if (((Boolean) pair.second).booleanValue() != z) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jzq
                @Override // java.lang.Runnable
                public final void run() {
                    cee.e(z, (ResponseCallback<Object>) new ResponseCallback() { // from class: jzo
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            ReleaseLogUtil.c("R_HL_HealthLifeCloudUtil", "disableTakeMedicineReminder resultCode ", Integer.valueOf(i2), " object ", obj);
                        }
                    });
                }
            });
        }
    }
}
