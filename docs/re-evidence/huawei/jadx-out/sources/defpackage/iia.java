package defpackage;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.taskplatform.impl.BaseImp;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class iia extends BaseImp {
    private String e() {
        return LoginInit.getInstance(null).getAccountInfo(1011);
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void createPlan(final qex qexVar, final ResponseCallback<qey> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ihz
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f37639a.a(responseCallback, qexVar);
            }
        });
    }

    /* synthetic */ void a(ResponseCallback responseCallback, qex qexVar) throws Throwable {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createPlan callback is null");
        } else if (qexVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createPlanReq is null");
            responseCallback.onResponse(-1, null);
        } else {
            d(qexVar, (ResponseCallback<qey>) responseCallback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r4 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(qex qexVar, ResponseCallback<qey> responseCallback) throws Throwable {
        boolean z;
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                String strE = e();
                qey qeyVarC = ijk.c(qexVar.b());
                if (qeyVarC == null) {
                    ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createPlan planDetail is null");
                    responseCallback.onResponse(-1, null);
                    if (z) {
                        igy.e().d();
                        return;
                    }
                    return;
                }
                qeyVarC.d(ijk.a(qeyVarC));
                qeyVarC.c(1);
                qeyVarC.e(qexVar.a());
                long jCurrentTimeMillis = System.currentTimeMillis();
                qeyVarC.d(jCurrentTimeMillis);
                qeyVarC.c(jCurrentTimeMillis);
                boolean zB = igy.e().b().b(qeyVarC, strE);
                ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "createPlan result is ", Boolean.valueOf(zB));
                if (!zB) {
                    responseCallback.onResponse(-1, null);
                    if (z) {
                        igy.e().d();
                        return;
                    }
                    return;
                }
                responseCallback.onResponse(0, qeyVarC);
            } catch (SQLiteException e) {
                e = e;
                try {
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "insertPlan Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    z = z2;
                    if (z) {
                        igy.e().d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                igy.e().d();
            }
            throw th;
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void queryPlan(final qev qevVar, final ResponseCallback<List<qey>> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iih
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.e.a(responseCallback, qevVar);
            }
        });
    }

    /* synthetic */ void a(ResponseCallback responseCallback, qev qevVar) throws Throwable {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "queryPlan callback is null");
        } else if (qevVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "queryPlanReq is null");
            responseCallback.onResponse(-1, null);
        } else {
            d(qevVar, (ResponseCallback<List<qey>>) responseCallback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    private void d(qev qevVar, ResponseCallback<List<qey>> responseCallback) throws Throwable {
        boolean z;
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                String strE = e();
                List<qey> listE = igy.e().b().e(qevVar, strE);
                if (qevVar.i()) {
                    for (qey qeyVar : listE) {
                        qeyVar.a(e(qeyVar.h(), qeyVar.m(), strE, qevVar.i()));
                    }
                }
                responseCallback.onResponse(0, listE);
                if (z) {
                    igy.e().d();
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "queryPlan Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    z = z2;
                    if (z) {
                        igy.e().d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                igy.e().d();
            }
            throw th;
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void updatePlanStatus(final qfb qfbVar, final ResponseCallback<String> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iii
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f37647a.d(responseCallback, qfbVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* synthetic */ void d(ResponseCallback responseCallback, qfb qfbVar) throws Throwable {
        boolean z;
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "updatePlan, callback is null");
            return;
        }
        if (qfbVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "updatePlan, req is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        String strE = e();
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                responseCallback.onResponse(0, String.valueOf(igy.e().b().a(qfbVar.d(), qfbVar.c(), strE)));
                if (z) {
                    igy.e().d();
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "updatePlanStatus Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    z = z2;
                    if (z) {
                        igy.e().d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                igy.e().d();
            }
            throw th;
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void createTask(final qfv qfvVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createTask callback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iil
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f37653a.a(qfvVar, responseCallback);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* synthetic */ void a(qfv qfvVar, ResponseCallback responseCallback) throws Throwable {
        boolean z;
        if (qfvVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createTasksReq is null");
            qgc qgcVar = new qgc();
            qgcVar.b(-1);
            qgcVar.a("createTasksReq is null");
            responseCallback.onResponse(-1, qgcVar);
            return;
        }
        String strE = e();
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                try {
                    List<String> listB = qfvVar.b();
                    b(listB, strE);
                    List<qfu> listI = qfvVar.i();
                    if (njy.e(listI)) {
                        ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createTask createTasks is empty");
                        b(qfvVar.d(), (Map<String, List<String>>) null, new ArrayList(10), listB, strE);
                        qgc qgcVar2 = new qgc();
                        qgcVar2.d((List<qfy>) null);
                        qgcVar2.d((String) null);
                        responseCallback.onResponse(0, qgcVar2);
                    } else {
                        a(qfvVar, strE, (ResponseCallback<qgc>) responseCallback);
                    }
                    if (njy.b(listI) || njy.b(listB)) {
                        d(qfvVar, strE);
                    }
                    if (z) {
                        igy.e().d();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                igy.e().d();
            }
            throw th;
        }
    }

    private void b(String str, Map<String, List<String>> map, List<String> list, List<String> list2, String str2) throws Throwable {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        qey qeyVarE = igy.e().b().e(str, str2);
        if (qeyVarE == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateHealthLifeTask, planDetail is null");
            return;
        }
        if (qeyVarE.e() != 0 || qeyVarE.k() != 3) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateHealthLifeTask, not healthy life plan");
            return;
        }
        qfc qfcVarD = igy.e().c().d(iA, lsl.q(System.currentTimeMillis()), str2);
        if (qfcVarD == null || qfcVarD.d() == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateHealthLifeTask healthLifeTask is empty");
            b(qeyVarE, iA, list, map, str2);
            return;
        }
        qfa qfaVarD = qfcVarD.d();
        if (qfaVarD.a() != null && njy.b(qfaVarD.a().get(str))) {
            List<String> list3 = qfaVarD.a().get(str);
            if (njy.b(list2)) {
                list3.removeAll(list2);
            }
            list.addAll(list3);
        }
        Map<String, List<String>> mapB = ijk.b(qfaVarD.b(), map);
        if (njy.e(mapB)) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateHealthLifeTask domainInfo is empty");
            return;
        }
        b(list2, mapB);
        List<String> list4 = (List) list.stream().distinct().collect(Collectors.toList());
        LogUtil.a("TaskPlatform_LocalImpl", "updateHealthLifeTask healthLifeTask newTaskIdList:", list4.toString());
        b(qeyVarE, iA, list4, mapB, str2);
    }

    private void b(List<String> list, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            return;
        }
        for (String str : map.keySet()) {
            List<String> list2 = map.get(str);
            if (!njy.e(list2)) {
                list2.removeAll(list);
                if (njy.e(list2)) {
                    arrayList.add(str);
                }
            }
        }
        if (njy.b(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                map.remove((String) it.next());
            }
        }
    }

    public void b(List<String> list, String str) throws Throwable {
        if (njy.e(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            igy.e().h().d(it.next(), str);
        }
    }

    private void a(qfv qfvVar, String str, ResponseCallback<qgc> responseCallback) throws Throwable {
        List<qfu> listI = qfvVar.i();
        String strD = qfvVar.d();
        ArrayList arrayList = new ArrayList(listI.size());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList(listI.size());
        for (qfu qfuVar : listI) {
            if (qfuVar != null) {
                qfy qfyVarB = ijk.b(qfuVar);
                long jCurrentTimeMillis = System.currentTimeMillis();
                qfyVarB.c(jCurrentTimeMillis);
                qfyVarB.d(jCurrentTimeMillis);
                if (!igy.e().f().c(qfyVarB, str)) {
                    ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createTask failure :", qfuVar.h());
                } else {
                    arrayList.add(qfuVar.h());
                    List<String> arrayList3 = map.get(qfuVar.o());
                    if (njy.e(arrayList3)) {
                        arrayList3 = new ArrayList<>(listI.size());
                    }
                    arrayList3.add(qfuVar.h());
                    map.put(qfuVar.o(), arrayList3);
                    ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "create taskSchedules");
                    qfyVarB.d(b(strD, qfuVar.h(), qfuVar.t(), str));
                    arrayList2.add(qfyVarB);
                    List<qfy> listA = a(strD, qfuVar.n(), str);
                    arrayList2.addAll(listA);
                    if (njy.b(qfuVar.n())) {
                        arrayList.addAll((Collection) listA.stream().map(new Function() { // from class: ihy
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((qfy) obj).h();
                            }
                        }).collect(Collectors.toList()));
                    }
                }
            }
        }
        b(strD, map, arrayList, qfvVar.b(), str);
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createTask callback is null");
            return;
        }
        qgc qgcVar = new qgc();
        qgcVar.d(arrayList2);
        qgcVar.d("");
        responseCallback.onResponse(0, qgcVar);
    }

    private List<qfk> b(String str, String str2, List<qff> list, String str3) throws Throwable {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createSchedules schedules is null");
            return arrayList;
        }
        for (qff qffVar : list) {
            if (qffVar != null) {
                qfk qfkVarE = ijk.e(qffVar);
                qfkVarE.g(str);
                qfkVarE.h(str2);
                qfkVarE.i(ijk.c());
                qfkVarE.c(System.currentTimeMillis());
                boolean zC = igy.e().h().c(str, qfkVarE.s(), qfkVarE, str3);
                ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createSchedules result：", Boolean.valueOf(zC));
                if (zC) {
                    arrayList.add(qfkVarE);
                }
            }
        }
        ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createSchedules scheduleDetailList size：", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private List<qfy> a(String str, List<qgb> list, String str2) {
        if (njy.e(list)) {
            LogUtil.j("TaskPlatform_LocalImpl", "createSubTask subTasks is empty");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "createSubTask");
        for (qgb qgbVar : list) {
            if (qgbVar != null) {
                if (TextUtils.isEmpty(qgbVar.h())) {
                    qgbVar.f(ijk.a());
                }
                qfy qfyVarB = ijk.b(qgbVar);
                qfyVarB.c(jCurrentTimeMillis);
                qfyVarB.d(jCurrentTimeMillis);
                if (!igy.e().f().c(qfyVarB, str2)) {
                    ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "createSubTask failed");
                } else {
                    ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "createTask subTaskSchedules");
                    qfyVarB.d(b(str, qgbVar.h(), qgbVar.t(), str2));
                    arrayList.add(qfyVarB);
                }
            }
        }
        return arrayList;
    }

    private void b(qey qeyVar, int i, List<String> list, Map<String, List<String>> map, String str) {
        if (njy.e(list) && njy.e(map)) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "insertHealthLifeTask, taskIdList and domainInfo is empty");
            return;
        }
        ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertHealthLifeTask");
        int iB = DateFormatUtil.a(System.currentTimeMillis()) == i ? qeyVar.b() : i;
        qfc qfcVar = new qfc();
        qfcVar.a(i);
        qfcVar.e(iB);
        qfcVar.d(0);
        qfcVar.b(lsl.q(System.currentTimeMillis()));
        qfa qfaVar = new qfa();
        HashMap map2 = new HashMap();
        map2.put(qeyVar.h(), list);
        qfaVar.e(map2);
        qfaVar.c(map);
        qfcVar.d(qfaVar);
        ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertHealthLifeTask result:", Boolean.valueOf(igy.e().c().e(qfcVar, str)));
    }

    private void d(qfv qfvVar, String str) throws Throwable {
        List<qfu> arrayList;
        String strD = qfvVar.d();
        qfp qfpVar = new qfp();
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<qfz> listE = e(DateFormatUtil.a(jCurrentTimeMillis), lsl.q(jCurrentTimeMillis), strD, (qfj) null);
        if (njy.e(listE)) {
            ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertSnapshot taskDetails is empty");
            arrayList = qfvVar.i();
        } else {
            arrayList = new ArrayList<>(listE.size());
            Iterator<qfz> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(ijk.e(it.next(), true));
            }
        }
        if (njy.e(arrayList)) {
            return;
        }
        qfpVar.d(strD);
        qfpVar.a(DateFormatUtil.a(jCurrentTimeMillis));
        qfpVar.e(lsl.q(jCurrentTimeMillis));
        qfpVar.c(jCurrentTimeMillis);
        qfpVar.c(UUID.randomUUID().toString());
        qfpVar.a(PhoneInfoUtils.getDeviceModel());
        qfpVar.b(HiJsonUtil.d(arrayList));
        qfpVar.b(0);
        boolean zA = igy.e().g().a(qfpVar, str);
        if (zA) {
            ijk.c(true);
        }
        ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertSnapshot result:", Boolean.valueOf(zA));
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void queryTask(final qga qgaVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "queryTask callback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iij
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f37650c.c(qgaVar, responseCallback);
                }
            });
        }
    }

    /* synthetic */ void c(qga qgaVar, ResponseCallback responseCallback) throws Throwable {
        if (qgaVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "queryTask queryTaskReq is null");
            qgc qgcVar = new qgc();
            qgcVar.b(-1);
            qgcVar.a("queryTaskReq is null");
            responseCallback.onResponse(-1, qgcVar);
            return;
        }
        List<qfy> listE = e(qgaVar.b(), qgaVar.a(), e(), qgaVar.c());
        qgc qgcVar2 = new qgc();
        qgcVar2.d(listE);
        qgcVar2.d("");
        responseCallback.onResponse(0, qgcVar2);
    }

    private List<qfy> e(String str, String str2, String str3, boolean z) throws Throwable {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        qfc qfcVarD = igy.e().c().d(iA, str2, str3);
        if (qfcVarD == null || qfcVarD.d() == null || qfcVarD.d().a() == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "queryTaskFromDb plan tasks is empty, planId:", str);
            return new ArrayList();
        }
        List<String> list = qfcVarD.d().a().get(str);
        List<qfy> listE = igy.e().f().e(list, str3);
        if (njy.e(listE)) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "queryTaskFromDb taskDetails is empty");
            return listE;
        }
        List<qfk> listE2 = igy.e().h().e(list, iA, str3);
        HashMap map = new HashMap(listE.size());
        if (!njy.e(listE2)) {
            for (qfk qfkVar : listE2) {
                if (qfkVar != null && !TextUtils.isEmpty(qfkVar.ab())) {
                    List arrayList = (List) map.get(qfkVar.ab());
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(qfkVar.ab(), arrayList);
                    }
                    arrayList.add(qfkVar);
                }
            }
        }
        for (qfy qfyVar : listE) {
            if (qfyVar != null) {
                qfyVar.d((List<qfk>) map.get(qfyVar.h()));
            }
        }
        if (z && !njy.e(listE2)) {
            d(str3, listE2, iA);
            ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "queryTaskFromDb taskDetails size = ", Integer.valueOf(listE.size()));
        }
        return listE;
    }

    private void d(String str, List<qfk> list, int i) {
        HashMap map;
        ArrayList arrayList = new ArrayList(list.size());
        for (qfk qfkVar : list) {
            if (qfkVar != null && !TextUtils.isEmpty(qfkVar.v())) {
                arrayList.add(qfkVar.v());
            }
        }
        List<qfl> listB = igy.e().i().b(i, arrayList, str);
        if (njy.e(listB)) {
            map = null;
        } else {
            map = new HashMap(arrayList.size());
            for (qfl qflVar : listB) {
                if (qflVar != null && !TextUtils.isEmpty(qflVar.i())) {
                    List arrayList2 = (List) map.get(qflVar.i());
                    if (njy.e(arrayList2)) {
                        arrayList2 = new ArrayList();
                        map.put(qflVar.i(), arrayList2);
                    }
                    arrayList2.add(qflVar);
                }
            }
        }
        for (qfk qfkVar2 : list) {
            if (qfkVar2 != null) {
                qfkVar2.c(map != null ? (List) map.get(qfkVar2.v()) : null);
            }
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void querySchedule(final qfn qfnVar, final ResponseCallback<qfj> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iik
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.d.d(responseCallback, qfnVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* synthetic */ void d(ResponseCallback responseCallback, qfn qfnVar) throws Throwable {
        boolean z;
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "querySchedule callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_LocalImpl", "querySchedule day : ", Integer.valueOf(qfnVar.b()));
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                qfj qfjVar = new qfj();
                e(qfnVar.b(), qfnVar.f(), qfnVar.a(), qfjVar);
                qep qepVar = new qep();
                qer qerVar = new qer();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(qerVar);
                qepVar.d(arrayList);
                qfjVar.h(HiJsonUtil.d(qepVar));
                responseCallback.onResponse(0, qfjVar);
                if (z) {
                    igy.e().d();
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "querySchedule Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    z = z2;
                    if (z) {
                        igy.e().d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                igy.e().d();
            }
            throw th;
        }
    }

    private List<qfz> e(int i, String str, String str2, qfj qfjVar) throws Throwable {
        String strE = e();
        qfc qfcVarD = igy.e().c().d(i, str, strE);
        if (qfcVarD == null || qfcVarD.d() == null || qfcVarD.d().a() == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "querySchedule healthLifeTask is empty");
            if (qfjVar != null) {
                qfjVar.b(-1);
                qfjVar.a("healthLifeTask is empty");
            }
            return new ArrayList();
        }
        List<String> list = qfcVarD.d().a().get(str2);
        List<qfk> listE = igy.e().h().e(list, i, strE);
        if (njy.e(listE)) {
            if (qfjVar != null) {
                qfjVar.b(-1);
                qfjVar.a("no taskSchedule");
            }
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(listE.size());
        HashMap map = new HashMap();
        for (qfk qfkVar : listE) {
            if (qfkVar != null && !TextUtils.isEmpty(qfkVar.v())) {
                arrayList.add(qfkVar.v());
                map.computeIfAbsent(qfkVar.ab(), new Function() { // from class: iid
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return iia.e((String) obj);
                    }
                }).add(qfkVar);
            }
        }
        Map<String, List<qfl>> mapA = a(i, arrayList, strE);
        for (qfk qfkVar2 : listE) {
            if (qfkVar2 != null) {
                qfkVar2.c(mapA.get(qfkVar2.v()));
            }
        }
        return a(list, strE, map, qfjVar);
    }

    static /* synthetic */ List e(String str) {
        return new ArrayList();
    }

    private static Map<String, List<qfl>> a(int i, List<String> list, String str) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            List<qfl> listB = igy.e().i().b(i, list, str);
            if (!njy.e(listB)) {
                for (qfl qflVar : listB) {
                    if (qflVar != null && !TextUtils.isEmpty(qflVar.i())) {
                        ((List) map.computeIfAbsent(qflVar.i(), new Function() { // from class: iie
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return iia.c((String) obj);
                            }
                        })).add(qflVar);
                    }
                }
            }
        }
        return map;
    }

    static /* synthetic */ List c(String str) {
        return new ArrayList();
    }

    private List<qfz> a(List<String> list, String str, Map<String, List<qfk>> map, qfj qfjVar) {
        List<qfz> listD = igy.e().f().d(list, str);
        if (njy.e(listD)) {
            if (qfjVar != null) {
                qfjVar.b(-1);
                qfjVar.a("no taskSchedules");
            }
            return new ArrayList();
        }
        HashMap map2 = new HashMap();
        for (qfz qfzVar : listD) {
            if (qfzVar != null) {
                qfzVar.a(map.get(qfzVar.g()));
                if (!TextUtils.isEmpty(qfzVar.e())) {
                    ((List) map2.computeIfAbsent(qfzVar.e(), new Function() { // from class: iig
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return iia.b((String) obj);
                        }
                    })).add(ijk.d(qfzVar));
                }
            }
        }
        ArrayList arrayList = new ArrayList(listD.size());
        for (qfz qfzVar2 : listD) {
            if (qfzVar2 != null) {
                List<qfq> list2 = (List) map2.get(qfzVar2.g());
                qfzVar2.b(list2);
                if (TextUtils.isEmpty(qfzVar2.e()) && (!njy.e(qfzVar2.j()) || !njy.e(list2))) {
                    arrayList.add(qfzVar2);
                }
            }
        }
        if (njy.e(arrayList)) {
            if (qfjVar != null) {
                qfjVar.b(-1);
                qfjVar.a("no taskSchedules");
            }
            return new ArrayList();
        }
        ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "getTaskSchedules taskSchedules size:", Integer.valueOf(arrayList.size()));
        if (qfjVar != null) {
            qfjVar.b(0);
            qfjVar.a("querySchedule success");
            qfjVar.b(arrayList);
        }
        return arrayList;
    }

    static /* synthetic */ List b(String str) {
        return new ArrayList();
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void updateSchedule(final qfo qfoVar, final ResponseCallback<qfr> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iic
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.e.b(responseCallback, qfoVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* synthetic */ void b(ResponseCallback responseCallback, qfo qfoVar) throws Throwable {
        boolean z;
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateSchedule callback is null");
            return;
        }
        if (qfoVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateSchedule scheduleResultCreateReq is null");
            qfr qfrVar = new qfr();
            qfrVar.b(-1);
            qfrVar.a("scheduleResultCreateReq is null");
            responseCallback.onResponse(-1, qfrVar);
            return;
        }
        String strE = e();
        List<qfm> listC = qfoVar.c();
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                for (qfm qfmVar : listC) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    qfl qflVarA = ijk.a(qfmVar);
                    qflVarA.d(jCurrentTimeMillis);
                    qflVarA.a(jCurrentTimeMillis);
                    igy.e().i().d(qflVarA.c(), qflVarA, strE);
                }
                qfr qfrVar2 = new qfr();
                qfrVar2.b(0);
                qfrVar2.a("updateSchedule end");
                responseCallback.onResponse(0, qfrVar2);
                if (z) {
                    igy.e().d();
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = z;
                    z = z2;
                    if (z) {
                        igy.e().d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                igy.e().d();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    public boolean a(qey qeyVar, String str) throws Throwable {
        boolean z;
        LogUtil.a("TaskPlatform_LocalImpl", "insertPlan, planId：", qeyVar.h());
        boolean z2 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    igy.e().a();
                    z = true;
                }
                try {
                    boolean zB = igy.e().b().b(qeyVar, str);
                    if (z) {
                        igy.e().d();
                    }
                    return zB;
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "insertPlan Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                igy.e().d();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    public void e(qfn qfnVar, qfj qfjVar) throws Throwable {
        boolean z;
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                igy.e().a();
                z = true;
            }
            try {
                try {
                    a(qfnVar, qfjVar);
                    if (z) {
                        igy.e().d();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "insertTaskSchedules Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                igy.e().d();
            }
            throw th;
        }
    }

    private void a(qfn qfnVar, qfj qfjVar) throws Throwable {
        if (qfjVar == null || qfnVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "insertTaskSchedule, querySchedulesResp is null");
            return;
        }
        String strA = qfnVar.a();
        ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertTaskSchedule");
        List<qfz> listI = qfjVar.i();
        if (njy.e(listI)) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "insertTaskSchedule, taskSchedules is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(listI.size());
        HashMap map = new HashMap(16);
        String accountInfo = LoginInit.getInstance(null).getAccountInfo(1011);
        for (qfz qfzVar : listI) {
            if (qfzVar != null) {
                qfy qfyVarA = ijk.a(qfzVar);
                qfyVarA.d((List<qfk>) null);
                igy.e().f().c(qfyVarA, accountInfo);
                arrayList.add(qfzVar.g());
                List<String> listA = a(qfzVar.g(), qfzVar.f(), qfnVar.b(), strA, accountInfo);
                if (njy.b(qfzVar.f())) {
                    arrayList.addAll(listA);
                }
                b(qfzVar.j(), qfnVar.b(), strA, accountInfo);
            }
        }
        ijk.c(qfjVar.b(), map, strA);
        qey qeyVarE = igy.e().b().e(strA, accountInfo);
        if (qeyVarE == null) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateHealthLifeTask, planDetail is null");
        } else if (qeyVarE.e() != 0 || qeyVarE.k() != 3) {
            ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "updateHealthLifeTask, not healthy life plan");
        } else {
            b(qeyVarE, qfnVar.b(), arrayList, map, accountInfo);
        }
    }

    private List<String> a(String str, List<qfq> list, int i, String str2, String str3) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertSubTaskSchedules");
            for (qfq qfqVar : list) {
                if (qfqVar != null) {
                    qfy qfyVarB = ijk.b(qfqVar);
                    qfyVarB.e(str);
                    qfyVarB.d((List<qfk>) null);
                    if (!igy.e().f().c(qfyVarB, str3)) {
                        ReleaseLogUtil.e("R_TaskPlatform_LocalImpl", "insertSubTaskSchedules failed, subTaskId : ", qfqVar.f());
                    } else {
                        b(qfqVar.g(), i, str2, str3);
                        arrayList.add(qfqVar.f());
                    }
                }
            }
        }
        return arrayList;
    }

    private void b(List<qfk> list, int i, String str, String str2) throws Throwable {
        if (njy.e(list)) {
            return;
        }
        ReleaseLogUtil.d("R_TaskPlatform_LocalImpl", "insertSchedules");
        for (qfk qfkVar : list) {
            if (qfkVar != null) {
                List<qfl> listY = qfkVar.y();
                qfkVar.c((List<qfl>) null);
                igy.e().h().c(str, i, qfkVar, str2);
                c(listY, str2);
            }
        }
    }

    public void b(qfr qfrVar) {
        if (qfrVar == null) {
            return;
        }
        final List<qfl> listD = qfrVar.d();
        if (njy.e(listD)) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: iif
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f37644c.b(listD);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* synthetic */ void b(List list) throws Throwable {
        boolean z;
        boolean z2 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    igy.e().a();
                    z = true;
                }
                try {
                    c((List<qfl>) list, LoginInit.getInstance(null).getAccountInfo(1011));
                    if (z) {
                        igy.e().d();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "insertResult Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                igy.e().d();
            }
            throw th;
        }
    }

    private void c(List<qfl> list, String str) {
        if (njy.e(list)) {
            return;
        }
        for (qfl qflVar : list) {
            if (qflVar != null) {
                igy.e().i().d(qflVar.c(), qflVar, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    public qfp b() throws Throwable {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z2 = false;
            } else {
                igy.e().a();
                z2 = true;
            }
            try {
                qfp qfpVarB = igy.e().g().b(LoginInit.getInstance(null).getAccountInfo(1011));
                if (z2) {
                    igy.e().d();
                }
                return qfpVarB;
            } catch (SQLiteException e) {
                z = z2;
                e = e;
                try {
                    ReleaseLogUtil.a("R_TaskPlatform_LocalImpl", "insertResult Exception:", LogAnonymous.b(e));
                    if (z) {
                        igy.e().d();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    z3 = z;
                    if (z3) {
                        igy.e().d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                z3 = z2;
                if (z3) {
                    igy.e().d();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
