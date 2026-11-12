package defpackage;

import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
class qyx {
    qyx() {
    }

    protected boolean b(DevicePairGuideActivity devicePairGuideActivity) {
        LogUtil.a("DevicePairGuideMidWareSetting", "isShowMidWare activity:", devicePairGuideActivity);
        if (devicePairGuideActivity == null) {
            return false;
        }
        if (c(devicePairGuideActivity)) {
            if (!devicePairGuideActivity.bk) {
                LogUtil.a("DevicePairGuideMidWareSetting", "isShowMidWare mIsSkipShowMidWare is false");
                return true;
            }
        } else {
            devicePairGuideActivity.cg.setVisibility(8);
        }
        return false;
    }

    protected boolean c(DevicePairGuideActivity devicePairGuideActivity) {
        boolean z = false;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DevicePairGuideMidWareSetting", "isSupportMidWare() activity is null");
            return false;
        }
        if (mgb.d(devicePairGuideActivity.ai) == 2) {
            return false;
        }
        if (lvi.m(devicePairGuideActivity.aq) && eei.a()) {
            z = true;
        }
        ReleaseLogUtil.d("DEVMGR_DevicePairGuideMidWareSetting", "isSupportMidWare() isSupportMidWare:", Boolean.valueOf(z));
        return z;
    }

    protected void d(final DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.cg = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.ll_pairing_guide_mid_ware);
        devicePairGuideActivity.x = (HealthButton) qsp.a(devicePairGuideActivity, R.id.btn_pairing_guide_mid_ware_sure);
        devicePairGuideActivity.w = (HealthButton) qsp.a(devicePairGuideActivity, R.id.btn_pairing_guide_mid_ware_cancel);
        c(devicePairGuideActivity, devicePairGuideActivity.x);
        c(devicePairGuideActivity, devicePairGuideActivity.w);
        devicePairGuideActivity.x.setOnClickListener(new View.OnClickListener() { // from class: qyx.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("DEVMGR_DevicePairGuideMidWareSetting", "mButtonPairGuideMidWareSure onclick");
                qyx.this.a(devicePairGuideActivity, true);
            }
        });
        devicePairGuideActivity.w.setOnClickListener(new View.OnClickListener() { // from class: qyx.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("DEVMGR_DevicePairGuideMidWareSetting", "mButtonPairGuideMidWareCancel onclick");
                qyx.this.a(devicePairGuideActivity, false);
            }
        });
    }

    private void c(DevicePairGuideActivity devicePairGuideActivity, HealthButton healthButton) {
        if (Utils.h() && CommonUtil.j(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) == 7) {
            healthButton.setBackgroundResource(R.drawable.hwbutton_default_emui);
            healthButton.setTextColor(devicePairGuideActivity.getColor(R.color.common_colorAccent));
        }
    }

    protected void a(DevicePairGuideActivity devicePairGuideActivity, boolean z) {
        if (devicePairGuideActivity == null) {
            return;
        }
        eei.b(Boolean.valueOf(z));
        mir.c(z);
        eei.b(nio.e(devicePairGuideActivity.ai), true);
        devicePairGuideActivity.bk = true;
        devicePairGuideActivity.cg.setVisibility(8);
        if (devicePairGuideActivity.bf) {
            i(devicePairGuideActivity);
        } else {
            devicePairGuideActivity.bb.sendEmptyMessage(1);
            e(devicePairGuideActivity);
        }
    }

    protected void e(DevicePairGuideActivity devicePairGuideActivity, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("is_support_special_midware", false);
        LogUtil.a("DevicePairGuideMidWareSetting", "onActivityForResult: isSupportSpecialMidWare:", Boolean.valueOf(booleanExtra));
        b(devicePairGuideActivity, booleanExtra);
    }

    protected void b(DevicePairGuideActivity devicePairGuideActivity, boolean z) {
        if (!c(devicePairGuideActivity) && !z) {
            devicePairGuideActivity.cg.setVisibility(8);
            e(devicePairGuideActivity);
        } else {
            a(devicePairGuideActivity);
        }
    }

    protected boolean c(int i, int i2) {
        boolean z = !lvi.m(i) && lvi.m(i2) && eei.a();
        LogUtil.a("DevicePairGuideMidWareSetting", "receiverPairRequest: isSupportSpecialMidWare:", Boolean.valueOf(z));
        return z;
    }

    private void e(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            LogUtil.j("DevicePairGuideMidWareSetting", "receiverPairRequest activity is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 13;
        messageObtain.obj = true;
        devicePairGuideActivity.bb.sendMessage(messageObtain);
    }

    private void i(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.b();
        devicePairGuideActivity.d();
    }

    protected void a(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        LogUtil.a("DevicePairGuideMidWareSetting", "showMidWareLayout() activity:", devicePairGuideActivity);
        devicePairGuideActivity.bj = true;
        devicePairGuideActivity.cb.setVisibility(8);
        devicePairGuideActivity.bt.setVisibility(8);
        devicePairGuideActivity.am.setVisibility(8);
        devicePairGuideActivity.y.setVisibility(8);
        devicePairGuideActivity.da.setVisibility(0);
        devicePairGuideActivity.ak.setVisibility(0);
        devicePairGuideActivity.cf.setVisibility(0);
        devicePairGuideActivity.d.start();
        devicePairGuideActivity.du.setVisibility(8);
        devicePairGuideActivity.i.setVisibility(8);
        devicePairGuideActivity.j.setVisibility(8);
        devicePairGuideActivity.cy.setVisibility(8);
        devicePairGuideActivity.cx.setVisibility(8);
        devicePairGuideActivity.cg.setVisibility(0);
        devicePairGuideActivity.dc.setVisibility(0);
        devicePairGuideActivity.dc.setText(devicePairGuideActivity.getString(R.string.IDS_device_midware_authority_title));
        String string = devicePairGuideActivity.getString(R.string.IDS_blite_guide_paire_opt_title);
        devicePairGuideActivity.cr.setVisibility(8);
        devicePairGuideActivity.cr.setText(string);
        String string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_device_midware_authority_text_frame);
        if (qrs.ah(BaseApplication.getContext())) {
            string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_pad_authority_text_frame);
        }
        String str = String.format(Locale.ENGLISH, string2, BaseApplication.getContext().getResources().getString(R.string.IDS_device_midware_authority_networking), BaseApplication.getContext().getResources().getString(R.string.IDS_device_midware_authority_subtext));
        LogUtil.a("DevicePairGuideMidWareSetting", "processNote:", str);
        devicePairGuideActivity.df.setVisibility(0);
        devicePairGuideActivity.df.setGravity(GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
        devicePairGuideActivity.df.setText(str);
    }

    public void e(DevicePairGuideActivity devicePairGuideActivity, boolean z) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.bk = z;
    }
}
