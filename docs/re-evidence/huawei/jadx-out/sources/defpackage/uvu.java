package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class uvu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f50618a;

    public uvu(Activity activity) {
        this.f50618a = activity;
    }

    public List<HiTimeInterval> b(String str) {
        ArrayList arrayList = new ArrayList(31);
        List<dnb> list = WeightDataManager.INSTANCE.getUserWeightDataMap().get(str);
        if (list != null) {
            for (dnb dnbVar : list) {
                HiTimeInterval hiTimeInterval = new HiTimeInterval();
                hiTimeInterval.setStartTime(dnbVar.ax());
                hiTimeInterval.setEndTime(dnbVar.ax());
                arrayList.add(hiTimeInterval);
            }
        }
        return arrayList;
    }

    public void c(dnj dnjVar, View view) {
        if (view == null) {
            LogUtil.j("AddUserOrEditWeightUserInteractor", "deleteLayout is null");
        } else if (dnjVar == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    public void d(String str, CustomTitleBar customTitleBar) {
        if (customTitleBar == null || this.f50618a == null) {
            LogUtil.j("AddUserOrEditWeightUserInteractor", "tvTitle or mActivity is null");
        } else if (TextUtils.isEmpty(str)) {
            customTitleBar.setTitleText(this.f50618a.getResources().getString(R.string.IDS_hw_base_health_weight_add_user));
        } else {
            customTitleBar.setTitleText(this.f50618a.getResources().getString(R.string.IDS_hw_base_health_weight_edit_user));
        }
    }

    public void a(dnj dnjVar, HealthTextView healthTextView, boolean z) {
        if (healthTextView == null || this.f50618a == null) {
            LogUtil.j("AddUserOrEditWeightUserInteractor", "userHeightText or mActivity is null");
            return;
        }
        int iE = dnjVar == null ? 0 : dnjVar.e();
        if (z && dnjVar == null) {
            healthTextView.setText(this.f50618a.getString(R.string.IDS_device_wifi_userinfo_please_select));
            return;
        }
        if (UnitUtil.f()) {
            int[] iArrG = {5, 3};
            if (iE > 30) {
                iArrG = UnitUtil.g(((double) iE) / 100.0d);
            }
            healthTextView.setText(this.f50618a.getString(R.string.IDS_ft_string, new Object[]{UnitUtil.e(iArrG[0], 1, 0)}) + " " + this.f50618a.getString(R.string.IDS_ins_string, new Object[]{UnitUtil.e(iArrG[1], 1, 0)}));
            return;
        }
        healthTextView.setText(this.f50618a.getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, new Object[]{UnitUtil.e(dnjVar == null ? 160 : dnjVar.e(), 1, 0)}));
    }

    public dnj c(dnj dnjVar, int i) {
        if (dnjVar == null) {
            dnjVar = new dnj();
            dnjVar.d(UUID.randomUUID().toString().replace(Constants.LINK, ""));
            dnjVar.a(true);
            dnjVar.a(2);
        } else {
            dnjVar.a(true);
        }
        dnjVar.e((byte) i);
        return dnjVar;
    }

    public dnj b(dnj dnjVar) {
        if (dnjVar == null) {
            LogUtil.j("AddUserOrEditWeightUserInteractor", "user is null");
            return dnjVar;
        }
        String strI = dnjVar.i();
        String sid = MultiUsersManager.INSTANCE.getSid(strI);
        dnjVar.b(sid);
        MultiUsersManager.INSTANCE.setUuidBySid(sid, strI);
        return dnjVar;
    }

    public void c(dnj dnjVar, int i, IBaseResponseCallback iBaseResponseCallback) {
        if (UnitUtil.f()) {
            LogUtil.a("AddUserOrEditWeightUserInteractor", "enter showInchDialog");
            vbs.a(this.f50618a, dnjVar, i, iBaseResponseCallback);
        } else {
            LogUtil.a("AddUserOrEditWeightUserInteractor", "enter showValueSetDialog()");
            vbs.a(this.f50618a, i, iBaseResponseCallback);
        }
    }
}
