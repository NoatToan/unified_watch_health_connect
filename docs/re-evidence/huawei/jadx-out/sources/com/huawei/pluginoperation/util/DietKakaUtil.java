package com.huawei.pluginoperation.util;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.pluginoperation.util.DietKakaUtil;
import defpackage.ddq;
import defpackage.njy;
import defpackage.osd;
import defpackage.osg;
import defpackage.osj;
import defpackage.vgo;
import defpackage.vgw;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DietKakaUtil extends JsModuleBase {
    private static final String BREAKFAST_TASK_ID = "3509119";
    private static final String DINNER_TASK_ID = "3793654";
    private static final String FULL_MEAL_TASK_ID = "3904161";
    private static final String LAUNCH_TASK_ID = "3658543";
    private static final String TAG = "KAKA_DietKakaUtil";
    private static final int TASK_STATUS_FAILURE = 0;
    private static final int TASK_STATUS_REPEATS = 1;
    private static final int TASK_STATUS_SUCCESS = 2;
    private Context mContext;
    private H5ProJsCbkInvoker<Object> mJsCbkInvoker;

    /* JADX INFO: loaded from: classes14.dex */
    public interface DietKakaTaskCheckCallback {
        void onFailure(String str);

        void onSuccess(osg osgVar);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface DietKakaTaskUpdateCallback {
        void onFailure(String str);

        void onSuccess(osd osdVar);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onMount(Context context, H5ProInstance h5ProInstance) {
        this.mContext = context;
        this.mJsCbkInvoker = h5ProInstance.getJsCbkInvoker();
    }

    @JavascriptInterface
    public void updateDietKakaTask(final long j, String str) {
        LogUtil.b(TAG, "updateDietKakaTask start");
        dietKakaTaskCheck(str, new DietKakaTaskCheckCallback() { // from class: com.huawei.pluginoperation.util.DietKakaUtil.2
            @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskCheckCallback
            public void onFailure(String str2) {
                LogUtil.b(DietKakaUtil.TAG, "updateDietKakaTask onFailure");
                DietKakaUtil.this.mJsCbkInvoker.onFailure(0, str2, j);
            }

            @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskCheckCallback
            public void onSuccess(osg osgVar) {
                LogUtil.b(DietKakaUtil.TAG, "updateDietKakaTask onSuccess");
                if (TextUtils.equals(osgVar.t(), String.valueOf(2))) {
                    DietKakaUtil.this.mJsCbkInvoker.onSuccess(1, j);
                } else {
                    DietKakaUtil.updateDietKakaTask(DietKakaUtil.this.mContext, osgVar.h(), new DietKakaTaskUpdateCallback() { // from class: com.huawei.pluginoperation.util.DietKakaUtil.2.3
                        @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskUpdateCallback
                        public void onFailure(String str2) {
                            LogUtil.b(DietKakaUtil.TAG, "updateDietKakaTask onSuccess onFailure");
                            DietKakaUtil.this.mJsCbkInvoker.onFailure(0, str2, j);
                        }

                        @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskUpdateCallback
                        public void onSuccess(osd osdVar) {
                            LogUtil.b(DietKakaUtil.TAG, "updateDietKakaTask onSuccess onSuccess");
                            DietKakaUtil.this.mJsCbkInvoker.onSuccess(2, j);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateDietKakaTask(Context context, String str, final DietKakaTaskUpdateCallback dietKakaTaskUpdateCallback) {
        LogUtil.b(TAG, "inner updateDietKakaTask start");
        osj osjVar = new osj();
        osjVar.d(str);
        osjVar.c(2);
        osjVar.d(0);
        osjVar.b(CommonUtil.ak());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(osjVar);
        Task<osd> taskUpdateKakaTasks = ddq.d().updateKakaTasks(context, arrayList);
        final String str2 = "Failed to update the task.";
        if (taskUpdateKakaTasks == null) {
            dietKakaTaskUpdateCallback.onFailure("Failed to update the task.");
        } else {
            taskUpdateKakaTasks.addOnSuccessListener(new OnSuccessListener() { // from class: pjh
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    DietKakaUtil.lambda$updateDietKakaTask$0(dietKakaTaskUpdateCallback, str2, (osd) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: pji
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    dietKakaTaskUpdateCallback.onFailure(str2);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$updateDietKakaTask$0(DietKakaTaskUpdateCallback dietKakaTaskUpdateCallback, String str, osd osdVar) {
        if (osdVar == null) {
            dietKakaTaskUpdateCallback.onFailure(str);
        } else if (TextUtils.equals(osdVar.e(), "0")) {
            dietKakaTaskUpdateCallback.onSuccess(osdVar);
        } else {
            dietKakaTaskUpdateCallback.onFailure(str);
        }
    }

    public static void completeMeal(final Context context, vgo vgoVar, vgw vgwVar) {
        final boolean zContainsAll;
        LogUtil.b(TAG, "completeMeal meal ", HiJsonUtil.d(vgwVar), " dietRecord ", HiJsonUtil.d(vgoVar));
        if (vgoVar == null || vgwVar == null || vgwVar.b() != DateFormatUtil.a(System.currentTimeMillis())) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<vgw> it = vgoVar.a().iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().i()));
        }
        HashSet hashSet2 = new HashSet(Arrays.asList(10, 20, 30));
        if (hashSet.containsAll(hashSet2)) {
            zContainsAll = false;
        } else {
            hashSet.add(Integer.valueOf(vgwVar.i()));
            zContainsAll = hashSet.containsAll(hashSet2);
        }
        final String dietKakaTaskId = getDietKakaTaskId(vgwVar);
        dietKakaTaskCheck(dietKakaTaskId, new DietKakaTaskCheckCallback() { // from class: com.huawei.pluginoperation.util.DietKakaUtil.5
            @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskCheckCallback
            public void onFailure(String str) {
                LogUtil.e(DietKakaUtil.TAG, "completeMealKaka meal task has done!");
            }

            @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskCheckCallback
            public void onSuccess(osg osgVar) {
                LogUtil.b(DietKakaUtil.TAG, "completeMealKaka meal task can complete!");
                DietKakaTaskUpdateCallback dietKakaTaskUpdateCallback = new DietKakaTaskUpdateCallback() { // from class: com.huawei.pluginoperation.util.DietKakaUtil.5.1
                    @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskUpdateCallback
                    public void onFailure(String str) {
                        LogUtil.d(DietKakaUtil.TAG, "completeMealKaka complete task error, msg=" + str);
                    }

                    @Override // com.huawei.pluginoperation.util.DietKakaUtil.DietKakaTaskUpdateCallback
                    public void onSuccess(osd osdVar) {
                        LogUtil.b(DietKakaUtil.TAG, "completeMealKaka complete task success, " + osdVar.c());
                    }
                };
                DietKakaUtil.updateDietKakaTask(context, dietKakaTaskId, dietKakaTaskUpdateCallback);
                if (zContainsAll) {
                    DietKakaUtil.updateDietKakaTask(context, DietKakaUtil.FULL_MEAL_TASK_ID, dietKakaTaskUpdateCallback);
                }
            }
        });
    }

    private static String getDietKakaTaskId(vgw vgwVar) {
        if (vgwVar == null) {
            return "";
        }
        int i = vgwVar.i();
        if (i == 10) {
            return BREAKFAST_TASK_ID;
        }
        if (i == 20) {
            return LAUNCH_TASK_ID;
        }
        if (i != 30) {
            return "";
        }
        return DINNER_TASK_ID;
    }

    private static void dietKakaTaskCheck(final String str, final DietKakaTaskCheckCallback dietKakaTaskCheckCallback) {
        LogUtil.b(TAG, "dietKakaTaskCheck get start");
        Task<List<osg>> taskInfoList = ddq.d().getTaskInfoList(BaseApplication.getContext(), 2);
        if (taskInfoList == null) {
            dietKakaTaskCheckCallback.onFailure("No task of this type exists.");
        } else {
            taskInfoList.addOnSuccessListener(new OnSuccessListener() { // from class: pjj
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    DietKakaUtil.dietKakaTaskCheck(str, (List) obj, dietKakaTaskCheckCallback);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: pjf
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    dietKakaTaskCheckCallback.onFailure("Failed to query the task.");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dietKakaTaskCheck(String str, List<osg> list, DietKakaTaskCheckCallback dietKakaTaskCheckCallback) {
        LogUtil.b(TAG, "dietKakaTaskCheck Check start");
        if (njy.e(list)) {
            dietKakaTaskCheckCallback.onFailure("The task list is empty.");
            return;
        }
        for (osg osgVar : list) {
            if (TextUtils.equals(str, osgVar.h())) {
                LogUtil.b(TAG, "dietKakaTaskCheck Check true");
                dietKakaTaskCheckCallback.onSuccess(osgVar);
                return;
            }
        }
        dietKakaTaskCheckCallback.onFailure("Failed to match the task.");
    }
}
