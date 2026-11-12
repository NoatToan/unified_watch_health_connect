package defpackage;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class ijk {
    public static void c(int i, List<String> list, qfj qfjVar, ResponseCallback<qfo> responseCallback) {
        if (qfjVar == null || responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "buildScheduleResult resp ", qfjVar, " callback ", responseCallback);
            return;
        }
        List<qfz> listI = qfjVar.i();
        if (CollectionUtils.a(listI)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "buildScheduleResult list ", listI);
            responseCallback.onResponse(-1, null);
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(listI.size());
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (qfz qfzVar : listI) {
            if (qfzVar == null) {
                countDownLatch.countDown();
            } else {
                List<qfk> listJ = qfzVar.j();
                b(i, list, CollectionUtils.a(listJ) ? null : listJ.get(0), copyOnWriteArrayList, countDownLatch);
                a(i, list, qfzVar.f(), qfzVar, copyOnWriteArrayList, countDownLatch);
            }
        }
        try {
            ReleaseLogUtil.d("R_TaskPlatform_TaskPlatformUtils", "buildScheduleResult await ", Boolean.valueOf(countDownLatch.await(500L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("R_TaskPlatform_TaskPlatformUtils", "buildScheduleResult exception ", ExceptionUtils.c(e));
        }
        responseCallback.onResponse(0, d(copyOnWriteArrayList, i, qfjVar));
    }

    private static void b(int i, List<String> list, qfk qfkVar, final CopyOnWriteArrayList<String> copyOnWriteArrayList, final CountDownLatch countDownLatch) {
        if (qfkVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "buildScheduleDetail scheduleDetail is null");
            return;
        }
        BaseTask baseTaskD = ijg.d(qfkVar.ab());
        if (baseTaskD == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "buildScheduleDetail task is null");
            countDownLatch.countDown();
        } else {
            baseTaskD.getTaskValue(i, list, qfkVar, new ResponseCallback() { // from class: ijn
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    ijk.d(copyOnWriteArrayList, countDownLatch, i2, (List) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(CopyOnWriteArrayList copyOnWriteArrayList, CountDownLatch countDownLatch, int i, List list) {
        LogUtil.a("TaskPlatform_TaskPlatformUtils", "buildScheduleDetail onResponse errorCode ", Integer.valueOf(i), " resultScheduleIdList ", list);
        if (!CollectionUtils.a(list)) {
            copyOnWriteArrayList.addAll(list);
        }
        countDownLatch.countDown();
    }

    private static void a(int i, List<String> list, List<qfq> list2, qfz qfzVar, final CopyOnWriteArrayList<String> copyOnWriteArrayList, final CountDownLatch countDownLatch) {
        if (CollectionUtils.a(list2)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "buildSubTasks list ", list2);
            return;
        }
        BaseTask baseTaskD = ijg.d(qfzVar.g());
        if (baseTaskD == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "buildSubTasks task is null taskSchedule ", qfzVar);
        } else {
            baseTaskD.getTaskValue(i, list, list2, new ResponseCallback() { // from class: ijp
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    ijk.c(copyOnWriteArrayList, countDownLatch, i2, (List) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(CopyOnWriteArrayList copyOnWriteArrayList, CountDownLatch countDownLatch, int i, List list) {
        LogUtil.a("TaskPlatform_TaskPlatformUtils", "buildSubTasks list onResponse errorCode ", Integer.valueOf(i), " resultScheduleIdList ", list);
        if (!CollectionUtils.a(list)) {
            copyOnWriteArrayList.addAll(list);
        }
        countDownLatch.countDown();
    }

    private static qfo d(CopyOnWriteArrayList<String> copyOnWriteArrayList, int i, qfj qfjVar) {
        copyOnWriteArrayList.removeIf(new Predicate() { // from class: ijm
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return TextUtils.isEmpty((String) obj);
            }
        });
        if (CollectionUtils.a(copyOnWriteArrayList)) {
            return null;
        }
        if (qfjVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getScheduleResultCreateReq querySchedulesResp is null");
            return null;
        }
        List<qfz> listI = qfjVar.i();
        if (CollectionUtils.a(listI)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getScheduleResultCreateReq list ", listI);
            return null;
        }
        String strQ = lsl.q(DateFormatUtil.d(i));
        ArrayList arrayList = new ArrayList();
        for (qfz qfzVar : listI) {
            if (qfzVar != null) {
                e(copyOnWriteArrayList, arrayList, qfzVar.j(), qfzVar.g(), i, strQ);
                d(copyOnWriteArrayList, arrayList, qfzVar.f(), i, strQ);
            }
        }
        if (CollectionUtils.a(arrayList)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getScheduleResultCreateReq scheduleResultCreateList ", arrayList);
            return null;
        }
        qfo qfoVar = new qfo();
        qfoVar.c(arrayList);
        LogUtil.a("TaskPlatform_TaskPlatformUtils", "getScheduleResultCreateReq scheduleResultCreateList ", HiJsonUtil.d(arrayList));
        return qfoVar;
    }

    private static void e(CopyOnWriteArrayList<String> copyOnWriteArrayList, List<qfm> list, List<qfk> list2, String str, int i, String str2) {
        if (CollectionUtils.a(list2)) {
            return;
        }
        for (qfk qfkVar : list2) {
            if (qfkVar != null) {
                List<qfh> listW = qfkVar.w();
                if (!CollectionUtils.a(listW)) {
                    String strV = qfkVar.v();
                    if (copyOnWriteArrayList.contains(strV)) {
                        qfm qfmVar = new qfm(ffv.a(), strV, str, i, str2);
                        qfmVar.d(qfkVar.p());
                        qfmVar.a(listW);
                        list.add(qfmVar);
                    }
                }
            }
        }
    }

    private static void d(CopyOnWriteArrayList<String> copyOnWriteArrayList, List<qfm> list, List<qfq> list2, int i, String str) {
        if (CollectionUtils.a(list2)) {
            return;
        }
        for (qfq qfqVar : list2) {
            if (qfqVar != null) {
                List<qfk> listG = qfqVar.g();
                if (!CollectionUtils.a(listG)) {
                    for (qfk qfkVar : listG) {
                        if (qfkVar != null) {
                            List<qfh> listW = qfkVar.w();
                            if (!CollectionUtils.a(listW)) {
                                String strV = qfkVar.v();
                                if (copyOnWriteArrayList.contains(strV)) {
                                    qfm qfmVar = new qfm(ffv.a(), strV, qfkVar.ab(), i, str);
                                    qfmVar.a(qfkVar.u());
                                    qfmVar.d(qfkVar.p());
                                    qfmVar.a(listW);
                                    list.add(qfmVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static List<Integer> a(qfj qfjVar) {
        BaseTask baseTaskD;
        if (qfjVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getSubscribeTypeList querySchedulesResp is null");
            return Collections.EMPTY_LIST;
        }
        List<qfz> listI = qfjVar.i();
        if (CollectionUtils.a(listI)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getSubscribeTypeList taskScheduleList ", listI);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (qfz qfzVar : listI) {
            if (qfzVar != null && (baseTaskD = ijg.d(qfzVar.g())) != null) {
                List<Integer> subscribeType = baseTaskD.getSubscribeType();
                if (!CollectionUtils.a(subscribeType)) {
                    for (Integer num : subscribeType) {
                        if (num != null && !arrayList.contains(num)) {
                            arrayList.add(num);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<String> d(qfj qfjVar, int i) {
        String strG;
        BaseTask baseTaskD;
        if (qfjVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getTaskIdListBySubscribeType querySchedulesResp is null");
            return Collections.EMPTY_LIST;
        }
        List<qfz> listI = qfjVar.i();
        if (CollectionUtils.a(listI)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformUtils", "getTaskIdListBySubscribeType taskScheduleList ", listI);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (qfz qfzVar : listI) {
            if (qfzVar != null && (baseTaskD = ijg.d((strG = qfzVar.g()))) != null && baseTaskD.isSubscribeType(i)) {
                arrayList.add(strG);
            }
        }
        return arrayList;
    }

    public static qey c(qeu qeuVar) {
        if (qeuVar == null) {
            return null;
        }
        qey qeyVar = new qey();
        qeyVar.c(qeuVar.a());
        qeyVar.b(qeuVar.b());
        qeyVar.d(qeuVar.e());
        qeyVar.a(qeuVar.c());
        qeyVar.j(qeuVar.i());
        qeyVar.e(qeuVar.d());
        qeyVar.b(qeuVar.h());
        qeyVar.a(qeuVar.f());
        qeyVar.e(qeuVar.g());
        return qeyVar;
    }

    public static qfy b(qfx qfxVar) {
        if (qfxVar == null) {
            return null;
        }
        qfy qfyVar = new qfy();
        qfyVar.f(qfxVar.h());
        qfyVar.g(qfxVar.i());
        qfyVar.d(qfxVar.l());
        qfyVar.e(qfxVar.e());
        qfyVar.d(qfxVar.c());
        qfyVar.c(qfxVar.b());
        qfyVar.i(qfxVar.g());
        qfyVar.a(qfxVar.a());
        qfyVar.c(qfxVar.k());
        qfyVar.a(qfxVar.m());
        qfyVar.e(qfxVar.d());
        qfyVar.b(qfxVar.j());
        qfyVar.j(qfxVar.f());
        return qfyVar;
    }

    public static qfy a(qfz qfzVar) {
        if (qfzVar == null) {
            return null;
        }
        qfy qfyVar = new qfy();
        qfyVar.f(qfzVar.g());
        qfyVar.d(qfzVar.d());
        qfyVar.i(qfzVar.h());
        qfyVar.e(qfzVar.c());
        qfyVar.d(qfzVar.i());
        qfyVar.h(qfzVar.b());
        qfyVar.a(qfzVar.l());
        qfyVar.c(qfzVar.m());
        qfyVar.e(qfzVar.e());
        qfyVar.a(qfzVar.a());
        qfyVar.d(qfzVar.o());
        qfyVar.d(qfzVar.j());
        List<qfq> listF = qfzVar.f();
        if (!CollectionUtils.a(listF)) {
            ArrayList arrayList = new ArrayList(listF.size());
            Iterator<qfq> it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f());
            }
            qfyVar.a(arrayList);
        }
        return qfyVar;
    }

    public static qfk e(qff qffVar) {
        if (qffVar == null) {
            return null;
        }
        qfk qfkVar = new qfk();
        qfkVar.c(qffVar.o());
        qfkVar.d(qffVar.b());
        qfkVar.b(qffVar.n());
        qfkVar.j(qffVar.k());
        qfkVar.a(qffVar.t());
        qfkVar.b(qffVar.f());
        qfkVar.a(qffVar.e());
        qfkVar.h(qffVar.s());
        qfkVar.d(qffVar.h());
        qfkVar.e(qffVar.q());
        qfkVar.b(qffVar.i());
        qfkVar.e(qffVar.a());
        qfkVar.c(qffVar.c());
        qfkVar.b(qffVar.r());
        qfkVar.a(qffVar.l());
        qfkVar.a(qffVar.g());
        return qfkVar;
    }

    public static qff a(qfk qfkVar) {
        if (qfkVar == null) {
            return null;
        }
        qff qffVar = new qff();
        qffVar.c(qfkVar.o());
        qffVar.d(qfkVar.b());
        qffVar.b(qfkVar.n());
        qffVar.j(qfkVar.k());
        qffVar.a(qfkVar.t());
        qffVar.b(qfkVar.f());
        qffVar.a(qfkVar.e());
        qffVar.h(qfkVar.s());
        qffVar.d(qfkVar.h());
        qffVar.e(qfkVar.q());
        qffVar.b(qfkVar.i());
        qffVar.e(qfkVar.a());
        qffVar.c(qfkVar.c());
        qffVar.b(qfkVar.r());
        qffVar.a(qfkVar.l());
        qffVar.a(qfkVar.g());
        qffVar.a(qfkVar.d());
        if (qffVar.d() == null) {
            qffVar.a(new qfi("DAILY"));
        }
        return qffVar;
    }

    public static qfl a(qfm qfmVar) {
        if (qfmVar == null) {
            return null;
        }
        qfl qflVar = new qfl();
        qflVar.b(qfmVar.h());
        qflVar.c(qfmVar.c());
        qflVar.e(qfmVar.g());
        qflVar.b(qfmVar.i());
        qflVar.b(qfmVar.b());
        qflVar.e(qfmVar.f());
        qflVar.d(qfmVar.j());
        qflVar.a(qfmVar.e());
        qflVar.d(qfmVar.d());
        qflVar.a(qfmVar.a());
        return qflVar;
    }

    public static qfq d(qfz qfzVar) {
        qfq qfqVar = new qfq();
        qfqVar.d(qfzVar.g());
        qfqVar.e(qfzVar.d());
        qfqVar.b(qfzVar.h());
        qfqVar.c(qfzVar.c());
        qfqVar.d(qfzVar.i());
        qfqVar.b(qfzVar.j());
        qfqVar.a(qfzVar.e());
        return qfqVar;
    }

    public static qfy b(qfq qfqVar) {
        qfy qfyVar = new qfy();
        qfyVar.f(qfqVar.f());
        qfyVar.d(qfqVar.a());
        qfyVar.i(qfqVar.j());
        qfyVar.e(qfqVar.e());
        qfyVar.d(qfqVar.h());
        qfyVar.d(qfqVar.g());
        return qfyVar;
    }

    public static qfu e(qfz qfzVar, boolean z) {
        qfu qfuVar = new qfu();
        qfuVar.f(qfzVar.g());
        qfuVar.d(qfzVar.d());
        qfuVar.i(qfzVar.h());
        qfuVar.e(qfzVar.c());
        qfuVar.d(qfzVar.i());
        qfuVar.a(true);
        qfuVar.c(qfzVar.m());
        qfuVar.h(qfzVar.b());
        qfuVar.a(qfzVar.a());
        List<qfk> listJ = qfzVar.j();
        if (!CollectionUtils.a(listJ)) {
            ArrayList arrayList = new ArrayList(listJ.size());
            Iterator<qfk> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            qfuVar.a(arrayList);
        }
        List<qfq> listF = qfzVar.f();
        if (!CollectionUtils.a(listF)) {
            ArrayList arrayList2 = new ArrayList(listF.size());
            Iterator<qfq> it2 = listF.iterator();
            while (it2.hasNext()) {
                qgb qgbVarE = e(it2.next());
                if (z) {
                    qgbVarE.f(null);
                }
                arrayList2.add(qgbVarE);
            }
            qfuVar.d(arrayList2);
            return qfuVar;
        }
        qfuVar.c(true);
        return qfuVar;
    }

    private static qgb e(qfq qfqVar) {
        qgb qgbVar = new qgb();
        qgbVar.f(qfqVar.f());
        qgbVar.d(qfqVar.a());
        qgbVar.i(qfqVar.j());
        qgbVar.e(qfqVar.e());
        qgbVar.d(qfqVar.h());
        qgbVar.c(true);
        qgbVar.a(true);
        qgbVar.e(qfqVar.d());
        List<qfk> listG = qfqVar.g();
        if (!CollectionUtils.a(listG)) {
            ArrayList arrayList = new ArrayList(listG.size());
            Iterator<qfk> it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            qgbVar.a(arrayList);
        }
        return qgbVar;
    }

    public static Map<String, List<String>> b(Map<String, List<String>> map, Map<String, List<String>> map2) {
        if (CollectionUtils.c(map)) {
            return map2;
        }
        if (!CollectionUtils.c(map2)) {
            for (String str : map.keySet()) {
                if (map2.containsKey(str)) {
                    List<String> list = map2.get(str);
                    if (!CollectionUtils.a(list)) {
                        map.put(str, a(map.get(str), list));
                    }
                }
            }
        }
        return map;
    }

    private static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            list = list2;
        } else {
            list.addAll(list2);
        }
        return (List) list.stream().distinct().collect(Collectors.toList());
    }

    public static void c(String str, Map<String, List<String>> map, String str2) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("TaskPlatform_TaskPlatformUtils", "parseMetadata, metadataStr is empty");
            return;
        }
        qep qepVar = (qep) HiJsonUtil.d(str, qep.class);
        if (qepVar == null) {
            ReleaseLogUtil.e("TaskPlatform_TaskPlatformUtils", "parseMetadata, metaData is null");
            return;
        }
        List<qes> listC = qepVar.c();
        if (njy.e(listC)) {
            ReleaseLogUtil.e("TaskPlatform_TaskPlatformUtils", "parseMetadata, healthLifeConfs is empty");
            return;
        }
        for (qes qesVar : listC) {
            if (qesVar != null && !TextUtils.isEmpty(qesVar.c())) {
                try {
                    Map map2 = (Map) HiJsonUtil.d(qesVar.c(), new TypeToken<Map<String, List<String>>>() { // from class: com.huawei.health.taskplatform.utils.TaskPlatformUtils$1
                    }.getType());
                    for (String str3 : map2.keySet()) {
                        e((List) map2.get(str3), str3, map, str2);
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("TaskPlatform_TaskPlatformUtils", "JsonSyntaxException");
                }
            }
        }
    }

    private static void e(List<String> list, String str, Map<String, List<String>> map, String str2) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("TaskPlatform_TaskPlatformUtils", "parseDimension, values is empty");
            return;
        }
        for (String str3 : list) {
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.split(":");
                if (strArrSplit.length >= 2 && TextUtils.equals(strArrSplit[0], str2) && !TextUtils.isEmpty(strArrSplit[1])) {
                    List<String> arrayList = map.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(16);
                    }
                    arrayList.add(strArrSplit[1]);
                    map.put(str, arrayList);
                }
            }
        }
    }

    public static void c(boolean z) {
        lua.d(String.valueOf(10105), "TASK_SNAPSHOT", z);
    }

    public static boolean e() {
        return lua.a(String.valueOf(10105), "TASK_SNAPSHOT", false);
    }

    public static boolean b() {
        ioi ioiVarD = ioi.d();
        return ("true".equals(ioiVarD.c(2)) && "true".equals(ioiVarD.c(3)) && "true".equals(ioiVarD.c(7))) ? false : true;
    }

    public static String a(qey qeyVar) {
        String str;
        if (qeyVar.e() == 0 && qeyVar.k() == 3) {
            str = "P-life-local-";
        } else {
            str = "P-local-";
        }
        return str + UUID.randomUUID().toString();
    }

    public static String c() {
        return ExifInterface.LATITUDE_SOUTH + UUID.randomUUID().toString();
    }

    public static String a() {
        return ExifInterface.GPS_DIRECTION_TRUE + UUID.randomUUID().toString();
    }
}
