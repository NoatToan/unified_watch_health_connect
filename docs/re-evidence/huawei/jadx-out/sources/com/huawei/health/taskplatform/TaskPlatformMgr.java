package com.huawei.health.taskplatform;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.taskplatform.impl.BaseImp;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.igx;
import defpackage.igy;
import defpackage.ihg;
import defpackage.ihl;
import defpackage.iia;
import defpackage.ijk;
import defpackage.njy;
import defpackage.qek;
import defpackage.qev;
import defpackage.qex;
import defpackage.qey;
import defpackage.qfb;
import defpackage.qfj;
import defpackage.qfn;
import defpackage.qfo;
import defpackage.qfp;
import defpackage.qfr;
import defpackage.qfs;
import defpackage.qft;
import defpackage.qfv;
import defpackage.qga;
import defpackage.qgc;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class TaskPlatformMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10233b;
    private final Map<Integer, BaseImp> e;

    /* JADX INFO: loaded from: classes31.dex */
    @FunctionalInterface
    public interface ApiExecutor<T> {
        void execute(BaseImp baseImp);
    }

    static class e {
        private static final TaskPlatformMgr d = new TaskPlatformMgr();
    }

    public static TaskPlatformMgr d() {
        return e.d;
    }

    private TaskPlatformMgr() {
        HashMap map = new HashMap();
        this.e = map;
        map.put(1, new ihg());
        map.put(2, new iia());
        map.put(0, new ihl());
    }

    public void b(final qex qexVar, final ResponseCallback<qey> responseCallback) {
        c(qexVar, responseCallback, (ApiExecutor<qex>) new ApiExecutor() { // from class: igp
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.createPlan(qexVar, responseCallback);
            }
        });
    }

    public void b(final qfb qfbVar, final ResponseCallback<String> responseCallback) {
        c(qfbVar, responseCallback, (ApiExecutor<qfb>) new ApiExecutor() { // from class: igm
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.updatePlanStatus(qfbVar, responseCallback);
            }
        });
    }

    public void b(final qev qevVar, final ResponseCallback<List<qey>> responseCallback) {
        c(qevVar, responseCallback, (ApiExecutor<qev>) new ApiExecutor() { // from class: ign
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.queryPlan(qevVar, responseCallback);
            }
        });
    }

    public void c(final qfv qfvVar, final ResponseCallback<qgc> responseCallback) {
        c(qfvVar, responseCallback, (ApiExecutor<qfv>) new ApiExecutor() { // from class: igl
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.createTask(qfvVar, responseCallback);
            }
        });
    }

    public void c(final qga qgaVar, final ResponseCallback<qgc> responseCallback) {
        c(qgaVar, responseCallback, (ApiExecutor<qga>) new ApiExecutor() { // from class: ige
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.queryTask(qgaVar, responseCallback);
            }
        });
    }

    public void a(final qfn qfnVar, final ResponseCallback<qfj> responseCallback) {
        c(qfnVar, responseCallback, (ApiExecutor<qfn>) new ApiExecutor() { // from class: igj
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.querySchedule(qfnVar, responseCallback);
            }
        });
    }

    public void a(final qfo qfoVar, final ResponseCallback<qfr> responseCallback) {
        c(qfoVar, responseCallback, (ApiExecutor<qfo>) new ApiExecutor() { // from class: igr
            @Override // com.huawei.health.taskplatform.TaskPlatformMgr.ApiExecutor
            public final void execute(BaseImp baseImp) {
                baseImp.updateSchedule(qfoVar, responseCallback);
            }
        });
    }

    public void e() {
        String strB;
        if (Utils.k() || !CommonUtil.ab(BaseApplication.b()) || ijk.b()) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformMgr", "no need to uploadSnapshots");
            return;
        }
        if (this.f10233b) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshots is uploading snapshot");
            return;
        }
        String accountInfo = LoginInit.getInstance(null).getAccountInfo(1011);
        List<qfp> listD = igy.e().g().d(accountInfo);
        if (njy.e(listD)) {
            ReleaseLogUtil.d("R_TaskPlatform_TaskPlatformMgr", "snapShotInfos is empty");
            return;
        }
        listD.sort(Comparator.comparingInt(new ToIntFunction() { // from class: igk
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((qfp) obj).a();
            }
        }));
        Iterator<qfp> it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                strB = "";
                break;
            }
            qfp next = it.next();
            if (next != null && !TextUtils.isEmpty(next.b())) {
                strB = next.b();
                break;
            }
        }
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshots planId is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(listD.size());
        qfs qfsVar = new qfs();
        qfsVar.e(strB);
        this.f10233b = true;
        int size = (listD.size() + 99) / 100;
        int i = 0;
        while (i < size) {
            int i2 = i * 100;
            int i3 = i + 1;
            b(listD.subList(i2, Math.min(100, listD.size() - i2) + i2), qfsVar, arrayList, accountInfo, i3 == size, true);
            i = i3;
        }
    }

    private void b(final List<qfp> list, final qfs qfsVar, final List<String> list2, final String str, final boolean z, final boolean z2) {
        qfsVar.d(list);
        igx.e().e(HiJsonUtil.d(qfsVar.b()), qfsVar.getUrl(), new ResponseCallback() { // from class: igs
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37600a.c(z, z2, qfsVar, list, list2, str, i, (String) obj);
            }
        });
    }

    public /* synthetic */ void c(boolean z, boolean z2, qfs qfsVar, List list, List list2, String str, int i, String str2) {
        LogUtil.a("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshots with data: ", str2);
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshots resp data is empty");
            if (z) {
                ReleaseLogUtil.d("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshotToCloud all finished");
                this.f10233b = false;
                return;
            }
            return;
        }
        qft qftVar = (qft) HiJsonUtil.d(str2, qft.class);
        if (qftVar == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshots resp is null");
            if (z) {
                ReleaseLogUtil.d("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshotToCloud all finished");
                this.f10233b = false;
                return;
            }
            return;
        }
        LogUtil.a("TaskPlatform_TaskPlatformMgr", "uploadSnapshotToCloud retryFlag:", Boolean.valueOf(z2));
        if (qftVar.e() == 28001 && z2) {
            qfsVar.e(qftVar.b());
            b(list, qfsVar, list2, str, z, false);
            return;
        }
        if (njy.b(qftVar.c())) {
            list2.addAll(qftVar.c());
        } else if (njy.e(qftVar.d()) && qftVar.e() != 0) {
            list2.addAll((Collection) list.stream().map(new Function() { // from class: igo
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((qfp) obj).c();
                }
            }).collect(Collectors.toList()));
        }
        if (z && njy.e(list2)) {
            LogUtil.a("TaskPlatform_TaskPlatformMgr", "failedSnapshotIds is:", list2);
            ijk.c(false);
        }
        LogUtil.a("TaskPlatform_TaskPlatformMgr", "successSnapshotIds is:", qftVar.d());
        if (njy.b(qftVar.d())) {
            igy.e().g().b(qftVar.d(), 1, str);
        }
        if (z) {
            ReleaseLogUtil.d("R_TaskPlatform_TaskPlatformMgr", "uploadSnapshotToCloud all finished");
            this.f10233b = false;
        }
    }

    private <T> void c(T t, ResponseCallback<?> responseCallback, ApiExecutor<T> apiExecutor) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_TaskPlatformMgr", "callback is null");
            return;
        }
        if (t == null) {
            ReleaseLogUtil.a("R_TaskPlatform_TaskPlatformMgr", "request is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            ReleaseLogUtil.a("R_TaskPlatform_TaskPlatformMgr", "isBrowseMode");
            responseCallback.onResponse(-1, null);
            return;
        }
        int iD = d(t);
        BaseImp baseImp = this.e.get(Integer.valueOf(iD));
        if (baseImp == null) {
            ReleaseLogUtil.a("R_TaskPlatform_TaskPlatformMgr", "Unsupported strategy: ", Integer.valueOf(iD));
            responseCallback.onResponse(-1, null);
        } else {
            apiExecutor.execute(baseImp);
        }
    }

    private int d(Object obj) {
        if (obj instanceof qek) {
            return ((qek) obj).e();
        }
        return 0;
    }
}
