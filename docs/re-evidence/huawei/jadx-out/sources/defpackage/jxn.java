package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.motiontrack.model.RiskIdentifyResultEnum;
import com.huawei.health.plan.aicoach.AICoachFactory;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.commonui.dialog.CustomEditDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jxn {
    static /* synthetic */ void a(View view) {
    }

    public static void e(Context context) {
        if (context == null) {
            LogUtil.j("Track_TrackDetailDialogUtils", "showStepAbnormalDialog mContext is null");
            return;
        }
        LogUtil.a("Track_TrackDetailDialogUtils", "showStepAbnormalDialog");
        new CustomTextAlertDialog.Builder(context).a(R.string.IDS_service_area_notice_title).a(context.getString(R.string.IDS_trajectory_step_exception_tips)).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jxn.a(view);
            }
        }).b().show();
    }

    public static void b(final Context context, final long j, final long j2, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        String strA;
        int i;
        if (context == null) {
            LogUtil.j("Track_TrackDetailDialogUtils", "showEditRecordName mContext is null");
            return;
        }
        LogUtil.a("Track_TrackDetailDialogUtils", "showEditRecordName");
        if (Utils.o()) {
            i = 100;
            strA = qre.a(R.string.IDS_sport_max_enter_character, 100);
        } else {
            strA = qre.a(R.string.IDS_sport_max_enter_word, 20);
            i = 40;
        }
        new CustomEditDialog.Builder(context).e(qre.f(R.string.IDS_sport_change_record_name)).a(qre.f(R.string.IDS_sport_enter_record_name)).c(strA).b(i).e(new CustomEditDialog.Builder.OnTextConformListener() { // from class: jxp
            @Override // com.huawei.ui.commonui.dialog.CustomEditDialog.Builder.OnTextConformListener
            public final void onTextConform(String str, CustomEditDialog.Builder.EditTextTipListener editTextTipListener) {
                jxn.a(context, j, j2, z, iBaseResponseCallback, str, editTextTipListener);
            }
        }).a(new CustomEditDialog.Builder.CloseBtnListener() { // from class: jxt
            @Override // com.huawei.ui.commonui.dialog.CustomEditDialog.Builder.CloseBtnListener
            public final void onClick() {
                jxn.c(iBaseResponseCallback);
            }
        }).c().show();
    }

    static /* synthetic */ void a(Context context, long j, long j2, boolean z, IBaseResponseCallback iBaseResponseCallback, String str, CustomEditDialog.Builder.EditTextTipListener editTextTipListener) {
        LogUtil.d("Track_TrackDetailDialogUtils", "recordName ", str);
        if (Utils.o()) {
            a(context, str, j, j2, z, iBaseResponseCallback);
            editTextTipListener.setEditCheckTip(true, "", 0);
        } else {
            d(context, str, j, j2, z, iBaseResponseCallback, editTextTipListener);
        }
    }

    static /* synthetic */ void c(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final Context context, final String str, final long j, final long j2, final boolean z, final IBaseResponseCallback iBaseResponseCallback, final CustomEditDialog.Builder.EditTextTipListener editTextTipListener) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jxr
                @Override // java.lang.Runnable
                public final void run() {
                    jxn.d(context, str, j, j2, z, iBaseResponseCallback, editTextTipListener);
                }
            });
            return;
        }
        AICoachFactory aICoachFactory = new AICoachFactory(BaseApplication.getContext());
        gdu gduVar = new gdu();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        gduVar.d(arrayList);
        gduVar.a("modifySportRecordName");
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            editTextTipListener.setEditCheckTip(false, qre.f(R.string.IDS_sport_network_error), qre.e(R.color.change_record_name_tip));
            ReleaseLogUtil.d("Track_TrackDetailDialogUtils", "network disconnect ");
        } else {
            oet.d().c(gduVar.getUrl(), aICoachFactory.getHeaders(), ofe.c(aICoachFactory.getBody(gduVar)), gds.class, new ResultCallback<gds>() { // from class: jxn.1
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gds gdsVar) {
                    LogUtil.a("Track_TrackDetailDialogUtils", "textRiskIdentify success");
                    int iB = gdsVar.b();
                    if (iB != RiskIdentifyResultEnum.SUCCEED.getCode()) {
                        if (iB == RiskIdentifyResultEnum.FAIL.getCode()) {
                            editTextTipListener.setEditCheckTip(false, qre.f(R.string.IDS_sport_text_compliant), qre.e(R.color.change_record_name_tip));
                            ReleaseLogUtil.d("Track_TrackDetailDialogUtils", "wiseGuard check failed");
                            return;
                        } else {
                            editTextTipListener.setEditCheckTip(false, qre.f(R.string.IDS_sport_server_error), qre.e(R.color.change_record_name_tip));
                            ReleaseLogUtil.d("Track_TrackDetailDialogUtils", "reach max quota limit resultCode ", Integer.valueOf(iB));
                            return;
                        }
                    }
                    jxn.a(context, str, j, j2, z, iBaseResponseCallback);
                    editTextTipListener.setEditCheckTip(true, "", 0);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    editTextTipListener.setEditCheckTip(false, qre.f(R.string.IDS_sport_network_error), qre.e(R.color.change_record_name_tip));
                    ReleaseLogUtil.a("Track_TrackDetailDialogUtils", "textRiskIdentify onFailure:", ExceptionUtils.c(th));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Context context, final String str, final long j, final long j2, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        jxh.d(j, j2, z, new IBaseResponseCallback() { // from class: jxn.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    LogUtil.e("Track_TrackDetailDialogUtils", "scoreCard requestTrackDetailData not success, errorCode=", Integer.valueOf(i));
                    return;
                }
                if (obj == null) {
                    LogUtil.e("Track_TrackDetailDialogUtils", "scoreCard requestTrackDetailData objData null");
                    return;
                }
                if (!njy.b(obj, HiHealthData.class)) {
                    LogUtil.e("Track_TrackDetailDialogUtils", "scoreCard requestTrackDetailData objData not instanceof List");
                    return;
                }
                List list = (List) obj;
                if (list.isEmpty() || list.get(0) == null) {
                    LogUtil.e("Track_TrackDetailDialogUtils", "requestTrackDetailData list size 0.");
                } else {
                    jxn.d(context, (HiHealthData) list.get(0), str, j, j2, z, iBaseResponseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final Context context, HiHealthData hiHealthData, final String str, final long j, final long j2, boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        HiTrackMetaData hiTrackMetaDataD = d(hiHealthData.getMetaData());
        if (hiTrackMetaDataD == null) {
            LogUtil.e("Track_TrackDetailDialogUtils", "handleSaveTrackData hiTrackMetaData is null");
            return;
        }
        hiTrackMetaDataD.getExtendTrackMap().put("alias", str);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        if (z) {
            hiHealthData.setType(33001);
            hiHealthData.setSequenceData("{}");
        } else {
            hiHealthData.setType(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        }
        hiHealthData.setDeviceUuid(hiHealthData.getString("device_uniquecode"));
        hiHealthData.setMetaData(HiJsonUtil.d(hiTrackMetaDataD));
        hiHealthData.setSyncStatus(0);
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: jxl
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                jxn.a(iBaseResponseCallback, str, context, j, j2, i, obj);
            }
        });
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, String str, Context context, long j, long j2, int i, Object obj) {
        if (i == 0) {
            LogUtil.a("Track_TrackDetailDialogUtils", "The record name is changed successfully.");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, str);
            }
            a(context, str, j, j2);
            return;
        }
        ReleaseLogUtil.d("Track_TrackDetailDialogUtils", "The record name is changed fail errorCode ", Integer.valueOf(i));
    }

    private static void a(Context context, String str, long j, long j2) {
        Intent intent = new Intent("change_sport_record_name");
        intent.setAction("change_sport_record_name");
        intent.putExtra("startTime", j);
        intent.putExtra("endTime", j2);
        intent.putExtra("alias", str);
        BroadcastManagerUtil.a(context, intent);
    }

    private static HiTrackMetaData d(String str) {
        try {
            return (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Track_TrackDetailDialogUtils", "getHiTrackMetaData trackMetaData is not JSON");
            return null;
        }
    }
}
