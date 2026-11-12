package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.health.utils.vippage.BenefitHalfModeActivity;
import com.huawei.health.vip.VipInnerApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.MemberTypeInfo;
import com.huawei.health.vip.datatypes.PrivilegeIntroduction;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.health.vip.datatypes.VipActivityParam;
import com.huawei.health.vip.datatypes.VipPrivilegeBean;
import com.huawei.health.vip.view.EquityDialogActivity;
import com.huawei.health.vip.view.VipPayLayout;
import com.huawei.health.vip.view.VipPayViewActivity;
import com.huawei.health.vip.vipinfo.VipInfoManager;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.ble.BleConstants;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ApiDefine(uri = VipApi.class)
@H5ProService
public class irn implements VipApi {
    @Override // com.huawei.health.vip.api.VipApi
    public void destoryVipPayView(View view) {
    }

    @Override // com.huawei.health.vip.api.VipApi
    public Class<? extends JsBaseModule> getCommonJsModule(String str) {
        if ("VipInnerApi".equalsIgnoreCase(str)) {
            return VipInnerApi.class;
        }
        return JsBaseModule.class;
    }

    @Override // com.huawei.health.vip.api.VipApi
    @H5ProMethod
    public void getVipInfo(final VipCallback vipCallback) {
        LogUtil.a("VipImpl", "get user vip info");
        VipInfoManager.getInstance().getVipInfo(new IBaseResponseCallback() { // from class: irn.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("VipImpl", "getVipInfo errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof UserMemberInfo)) {
                    vipCallback.onSuccess(obj);
                } else {
                    LogUtil.a("VipImpl", "getVipInfo mUserMemberInfo fail");
                    vipCallback.onFailure(i, VastAttribute.ERROR);
                }
            }
        });
    }

    @Override // com.huawei.health.vip.api.VipApi
    public View getVipPayView(Activity activity, String str, String str2) {
        return new VipPayLayout(activity, str, str2);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public View getVipPayView(Activity activity, String str, String str2, Map<String, Object> map) {
        return new VipPayLayout(activity, str, str2, map);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void notifyActivityResult(View view, int i, int i2, Intent intent) {
        if (view instanceof VipPayLayout) {
            ((VipPayLayout) view).e(i, i2, intent);
        } else {
            LogUtil.j("VipImpl", "view is not VipPayLayout.");
        }
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void startEquityDialogActivity() {
        LogUtil.a("VipImpl", "start EquityDialogActivity.");
        Intent intent = new Intent();
        intent.setFlags(268500992);
        intent.setClass(BaseApplication.getContext(), EquityDialogActivity.class);
        LogUtil.a("VipImpl", "start EquityDialogActivity.");
        iov.d(BaseApplication.getContext(), intent);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void startVipPayViewActivity(Activity activity, String str) {
        LogUtil.a("VipImpl", "start VipPayViewActivity.");
        Intent intent = new Intent(com.huawei.haf.application.BaseApplication.b(), (Class<?>) VipPayViewActivity.class);
        try {
            VipActivityParam vipActivityParam = (VipActivityParam) new Gson().fromJson(str, VipActivityParam.class);
            if (vipActivityParam != null) {
                intent.putExtra("packageName", vipActivityParam.getPackageName());
                intent.putExtra(BleConstants.KEY_PATH, vipActivityParam.getPath());
            } else {
                LogUtil.j("VipImpl", "vipActivityParam is null.");
            }
        } catch (JsonSyntaxException e) {
            LogUtil.e("VipImpl", "get vipActivityParam error. message:", e.getMessage());
        }
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void getVipMessage(String str, IBaseResponseCallback iBaseResponseCallback) {
        VipInfoManager.getInstance().getVipMessage(str, iBaseResponseCallback);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void getVipMessageList(long j, long j2, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        VipInfoManager.getInstance().getVipMessageList(j, j2, iBaseResponseCallback, z);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void setVipMessageRead(List<String> list) {
        VipInfoManager.getInstance().setVipMessageRead(list);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void getVipTypePrivilege(final VipCallback vipCallback) {
        LogUtil.a("VipImpl", "get vip type");
        VipInfoManager.getInstance().getVipType(new IBaseResponseCallback() { // from class: irn.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("VipImpl", "getVipInfo errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof isd)) {
                    isd isdVar = (isd) obj;
                    new ArrayList();
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    if (njy.e(isdVar.c())) {
                        vipCallback.onFailure(i, VastAttribute.ERROR);
                        return;
                    }
                    List<MemberTypeInfo> listC = isdVar.c();
                    if (njy.e(listC)) {
                        vipCallback.onFailure(i, VastAttribute.ERROR);
                        return;
                    }
                    if (njy.e(listC.get(0).getPrivilegeIntroductions())) {
                        vipCallback.onFailure(i, VastAttribute.ERROR);
                        return;
                    }
                    Iterator<PrivilegeIntroduction> it = listC.get(0).getPrivilegeIntroductions().iterator();
                    while (it.hasNext()) {
                        arrayList.add((VipPrivilegeBean) qqt.e(it.next().getContent(), VipPrivilegeBean.class));
                    }
                    vipCallback.onSuccess(arrayList);
                    return;
                }
                LogUtil.a("VipImpl", "getVipInfo mUserMemberInfo fail");
                vipCallback.onFailure(i, VastAttribute.ERROR);
            }
        });
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void getVipTransferBenefits(final VipCallback vipCallback) {
        VipInfoManager.getInstance().getVipTransferBenefits(new IBaseResponseCallback() { // from class: irn.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof isf) {
                    vipCallback.onSuccess(((isf) obj).b());
                } else {
                    vipCallback.onFailure(-1, ParamConstants.CallbackMethod.ON_FAIL);
                }
            }
        });
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void showBenefitDialog(Context context, List<DeviceBenefitInfo> list, BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i) {
        if (context == null || baseDeviceBenefitInfo == null) {
            LogUtil.j("VipImpl", "showBenefitDialog params error");
            return;
        }
        boolean zC = irz.c(list);
        Intent intent = new Intent(context, (Class<?>) BenefitHalfModeActivity.class);
        if (baseDeviceBenefitInfo.getBenefitType() == 1 && zC) {
            intent.putExtra("needToConcatType", 1);
        } else {
            intent.putExtra("needToConcatType", 0);
        }
        intent.putExtra("benefitInfo", baseDeviceBenefitInfo);
        intent.putExtra("fromPage", i);
        iov.d(context, intent);
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void getVipType(final IBaseResponseCallback iBaseResponseCallback) {
        VipInfoManager.getInstance().getVipType(new IBaseResponseCallback() { // from class: irn.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof isd) {
                    iBaseResponseCallback.a(0, ((isd) obj).c());
                } else {
                    iBaseResponseCallback.a(-1, obj);
                }
            }
        });
    }

    @Override // com.huawei.health.vip.api.VipApi
    public void getVirtualResourceSummary(final IBaseResponseCallback iBaseResponseCallback) {
        VipInfoManager.getInstance().getVirtualResourceSummary(new IBaseResponseCallback() { // from class: irn.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof irv) {
                    iBaseResponseCallback.a(0, ((irv) obj).d());
                } else {
                    iBaseResponseCallback.a(-1, obj);
                }
            }
        });
    }
}
