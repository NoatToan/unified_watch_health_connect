package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cdx {
    public static void e(final String str, final ResponseCallback<SparseArray<List<osg>>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HL_KakaUtils", "getTaskInfoList callback is null");
            return;
        }
        Context contextB = BaseApplication.b();
        if (!CommonUtil.ab(contextB)) {
            ReleaseLogUtil.d("HL_KakaUtils", "getTaskInfoList not connected to the network");
            responseCallback.onResponse(-1, new SparseArray<>(16));
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelKakaList_" + str, new Runnable() { // from class: cdv
                @Override // java.lang.Runnable
                public final void run() {
                    cdx.e(str, responseCallback);
                }
            });
            return;
        }
        Task<List<osg>> taskInfoList = ddq.d().getTaskInfoList(contextB, 1);
        if (taskInfoList == null) {
            ReleaseLogUtil.d("HL_KakaUtils", "getTaskInfoList task is null");
            responseCallback.onResponse(-1, new SparseArray<>(16));
        } else {
            taskInfoList.addOnSuccessListener(new OnSuccessListener() { // from class: cdt
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    cdx.d(responseCallback, str, (List) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: cdw
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    cdx.a(responseCallback, exc);
                }
            });
        }
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, String str, List list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("HL_KakaUtils", "getTaskInfoList kakaTaskInfoList ", list);
            responseCallback.onResponse(-1, new SparseArray(16));
        } else {
            LogUtil.a("HL_KakaUtils", "getTaskInfoList kakaTaskInfoList ", list);
            a("HealthModelKakaList_" + str, list, responseCallback);
        }
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, Exception exc) {
        ReleaseLogUtil.d("HL_KakaUtils", "getTaskInfoList addOnFailureListener consecutiveDays ", Integer.valueOf(cbg.a(false)));
        responseCallback.onResponse(-1, new SparseArray(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final String str, final List<osg> list, final ResponseCallback<SparseArray<List<osg>>> responseCallback) {
        String strH;
        int iE;
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), str, new Runnable() { // from class: cdu
                @Override // java.lang.Runnable
                public final void run() {
                    cdx.a(str, list, responseCallback);
                }
            });
            return;
        }
        List<osg> listB = b(list);
        String strQ = cbg.q();
        List<HealthLifeBean> listB2 = b(1, strQ);
        List<HealthLifeBean> listB3 = b(2, strQ);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (osg osgVar : listB) {
            if (osgVar != null && !"2".equals(osgVar.t()) && (iE = e((strH = osgVar.h()), listB2, listB3)) >= 0) {
                osgVar.e(iE);
                if ("4414136".equals(strH) || "4587804".equals(strH)) {
                    if (!arrayList2.contains(osgVar)) {
                        arrayList2.add(osgVar);
                    }
                } else if (!arrayList.contains(osgVar)) {
                    arrayList.add(osgVar);
                }
            }
        }
        if (njy.b(arrayList)) {
            osg osgVar2 = new osg();
            osgVar2.b("2332598");
            arrayList.add(0, osgVar2);
        }
        SparseArray<List<osg>> sparseArray = new SparseArray<>();
        sparseArray.append(0, arrayList);
        sparseArray.append(1, arrayList2);
        responseCallback.onResponse(0, sparseArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    private static List<osg> b(List<osg> list) {
        byte b2;
        ArrayList arrayList = new ArrayList();
        for (osg osgVar : list) {
            if (osgVar == null) {
                ReleaseLogUtil.d("HL_KakaUtils", "getKakaTaskInfoListForGrowthValue kakaTaskInfo is null");
            } else {
                String strH = osgVar.h();
                if (TextUtils.isEmpty(strH)) {
                    ReleaseLogUtil.d("HL_KakaUtils", "getKakaTaskInfoListForGrowthValue taskId ", strH);
                } else {
                    strH.hashCode();
                    switch (strH) {
                        case "4018400":
                            b2 = 0;
                            break;
                        case "4142595":
                            b2 = 1;
                            break;
                        case "4267785":
                            b2 = 2;
                            break;
                        case "4304180":
                            b2 = 3;
                            break;
                        case "4414136":
                            b2 = 4;
                            break;
                        case "4587804":
                            b2 = 5;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5) {
                        arrayList.add(osgVar);
                        ccy.a("health_model_kaka_task_reward_" + strH, String.valueOf(osgVar.m()));
                        ccy.a("health_model_kaka_continuous_" + strH, String.valueOf(osgVar.w()));
                    }
                }
            }
        }
        return arrayList;
    }

    private static int e(String str, List<HealthLifeBean> list, List<HealthLifeBean> list2) {
        byte b2 = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 326722737) {
            if (iHashCode != 441117393) {
                if (iHashCode == 476307196 && str.equals("4587804")) {
                    b2 = 2;
                }
            } else if (str.equals("4414136")) {
                b2 = 1;
            }
        } else if (str.equals("4018400")) {
            b2 = 0;
        }
        if (b2 == 0) {
            int iA = cbg.a(true);
            LogUtil.a("HL_KakaUtils", "getTaskStatus consecutiveDays ", Integer.valueOf(iA));
            return Integer.compare(iA, 2);
        }
        if (b2 == 1 || b2 == 2) {
            return 0;
        }
        return b(str, list, list2);
    }

    private static List<HealthLifeBean> b(int i, String str) {
        int iA = byu.c().a(DateFormatUtil.a(System.currentTimeMillis()));
        int iA2 = DateFormatUtil.a(lsl.c(DateFormatUtil.d(iA), -i));
        LogUtil.a("HL_KakaUtils", "getTaskRecordBeanList day ", Integer.valueOf(iA2), ",recordDay=", Integer.valueOf(iA));
        return bxc.b(iA2, iA2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int b(String str, List<HealthLifeBean> list, List<HealthLifeBean> list2) {
        int iA = a(str);
        int i = -1;
        int i2 = 1;
        while (i2 <= 2) {
            boolean z = i2 == 1 ? 1 : 0;
            boolean zB = cbg.b(z != 0 ? list : list2, iA);
            LogUtil.a("HL_KakaUtils", "getTaskStatus isYesterday ", Boolean.valueOf(z), " isCompleted ", Boolean.valueOf(zB), " type ", Integer.valueOf(iA));
            if (!zB) {
                LogUtil.j("HL_KakaUtils", "getTaskStatus taskStatus ", Integer.valueOf(i));
                break;
            }
            i = !z;
            i2++;
        }
        return i;
    }

    private static int a(String str) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_KakaUtils", "getTaskType taskId ", str);
            return -1;
        }
        str.hashCode();
        switch (str) {
            case "3279864":
                b2 = 0;
                break;
            case "3368659":
                b2 = 1;
                break;
            case "3428891":
                b2 = 2;
                break;
            case "4142595":
                b2 = 3;
                break;
            case "4267785":
                b2 = 4;
                break;
            case "4304180":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 != 5) {
                                return -1;
                            }
                        }
                    }
                }
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
