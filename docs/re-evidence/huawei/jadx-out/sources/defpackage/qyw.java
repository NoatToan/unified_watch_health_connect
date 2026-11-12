package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import health.compact.a.LanguageUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
class qyw {
    qyw() {
    }

    void d(DevicePairGuideActivity devicePairGuideActivity) {
        LogUtil.a("DevicePairGuideViewHelper", "Enter initView():");
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.aa = new CompatibilityInteractor();
        devicePairGuideActivity.ae = (CustomTitleBar) qsp.a(devicePairGuideActivity, R.id.pair_guide_custom_title);
        devicePairGuideActivity.cb = (ImageView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_img);
        devicePairGuideActivity.an = (HealthScrollView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_sl);
        DevicePairGuideActivity.cancelLayoutById(devicePairGuideActivity.an);
        devicePairGuideActivity.bt = (ImageView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_b3_anim_img);
        devicePairGuideActivity.bt.setVisibility(8);
        devicePairGuideActivity.n = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.aw70_pair_progress);
        devicePairGuideActivity.l = (ImageView) qsp.a(devicePairGuideActivity, R.id.aw70_pair_progress_img);
        qrs.d(devicePairGuideActivity.n, 2);
        devicePairGuideActivity.r = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.aw70_pair_progress_big);
        devicePairGuideActivity.k = (ImageView) qsp.a(devicePairGuideActivity, R.id.aw70_pair_progress_img_big);
        qrs.d(devicePairGuideActivity.r, 2);
        devicePairGuideActivity.s = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.aw70_pair_result_device_show_txt);
        devicePairGuideActivity.ab = (ImageView) qsp.a(devicePairGuideActivity, R.id.pair_guide_left_image);
        devicePairGuideActivity.cq = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_janus_pair_b5_describe);
        devicePairGuideActivity.cq.setText(String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_device_janus_pair_guide_01), devicePairGuideActivity.getResources().getString(R.string.IDS_device_start_paring_title)));
        devicePairGuideActivity.bn = (ImageView) qsp.a(devicePairGuideActivity, R.id.pair_guide_right_image);
        if (LanguageUtil.ba(devicePairGuideActivity)) {
            LogUtil.a("DevicePairGuideViewHelper", "isRTLLanguage!!!");
            devicePairGuideActivity.ab.setImageResource(R.drawable.ic_arrows_right_black);
            devicePairGuideActivity.bn.setImageResource(R.mipmap.ic_arrows_left_black);
            LogUtil.a("DevicePairGuideViewHelper", "isRTLLanguage!!!!!!!");
        }
        devicePairGuideActivity.aw = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.ear_phone_pair_error);
        e(devicePairGuideActivity);
    }

    private void e(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.am = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips);
        devicePairGuideActivity.cv = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_b5);
        devicePairGuideActivity.cu = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_cassini);
        devicePairGuideActivity.bw = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_cassini_pair_first_describe);
        devicePairGuideActivity.by = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_cassini_pair_second_describe);
        devicePairGuideActivity.cn = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_1);
        devicePairGuideActivity.co = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_2);
        devicePairGuideActivity.cp = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_3);
        devicePairGuideActivity.cm = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_4);
        devicePairGuideActivity.cs = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_text_tips_single);
        devicePairGuideActivity.ck = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_txt_1);
        devicePairGuideActivity.cl = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_txt_2);
        devicePairGuideActivity.ch = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_txt_3);
        devicePairGuideActivity.ct = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_single);
        devicePairGuideActivity.ce = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_num_text_1);
        devicePairGuideActivity.cd = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_num_text_2);
        devicePairGuideActivity.cj = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_num_text_3);
        devicePairGuideActivity.ci = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_num_text_4);
        lvb.e().b("deleteDevice", new DeviceInfo(), 0, String.valueOf(true));
        c(devicePairGuideActivity);
    }

    private void c(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.bz = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.pair_guide_left_cancel_layout);
        devicePairGuideActivity.cc = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.pair_guide_right_btn_layout);
        devicePairGuideActivity.v = (HealthColumnLinearLayout) qsp.a(devicePairGuideActivity, R.id.cancel_button_layout);
        devicePairGuideActivity.au = (HealthColumnLinearLayout) qsp.a(devicePairGuideActivity, R.id.got_it_button_layout);
        devicePairGuideActivity.ac = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.connecting_device_name_layout);
        devicePairGuideActivity.ad = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.connecting_device_name);
        devicePairGuideActivity.da = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.pair_result_device_progress_img);
        devicePairGuideActivity.y = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.device_pairing_guide_bottom_arrow_layout);
        devicePairGuideActivity.dk = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.right_arrow_txt);
        devicePairGuideActivity.dk.setText(devicePairGuideActivity.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(Locale.ENGLISH));
        devicePairGuideActivity.cf = (ImageView) qsp.a(devicePairGuideActivity, R.id.device_pair_guide_progress_anim);
        if (devicePairGuideActivity.cf.getDrawable() instanceof AnimationDrawable) {
            devicePairGuideActivity.d = (AnimationDrawable) devicePairGuideActivity.cf.getDrawable();
        }
        devicePairGuideActivity.cz = (ImageView) qsp.a(devicePairGuideActivity, R.id.pair_result_device_img);
        devicePairGuideActivity.ba = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.ll_icon_pair);
        qrs.d(devicePairGuideActivity.da, 3);
        devicePairGuideActivity.dc = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.pair_result_device_show_txt);
        devicePairGuideActivity.cr = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_progress_guide_single_note);
        devicePairGuideActivity.ds = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.device_pairing_progress_leo_failure);
        devicePairGuideActivity.u = (HealthButton) qsp.a(devicePairGuideActivity, R.id.cancel_button);
        devicePairGuideActivity.u.setOnClickListener(devicePairGuideActivity);
        devicePairGuideActivity.u.setVisibility(8);
        devicePairGuideActivity.df = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.pair_result_device_privacy_txt);
        devicePairGuideActivity.bs = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.pair_result_ear_privacy_txt);
        devicePairGuideActivity.bs.setVisibility(8);
        devicePairGuideActivity.db = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.pair_result_device_privacy_txt2);
        String string = devicePairGuideActivity.getString(R.string.IDS_device_paring_success_descommon_info_new);
        if (qrs.ah(BaseApplication.getContext())) {
            string = devicePairGuideActivity.getString(R.string.IDS_pad_paring_descommon);
        }
        devicePairGuideActivity.df.setText(string);
        devicePairGuideActivity.ak = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.device_pair_result_img_text);
        devicePairGuideActivity.cx = (ImageView) qsp.a(devicePairGuideActivity, R.id.pair_result_device_show_img);
        devicePairGuideActivity.cw = (RelativeLayout) qsp.a(devicePairGuideActivity, R.id.pair_text_layout);
        devicePairGuideActivity.bc.f();
        b(devicePairGuideActivity);
    }

    private void b(final DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.at = (HealthProgressBar) qsp.a(devicePairGuideActivity, R.id.download_progress);
        devicePairGuideActivity.at.b(devicePairGuideActivity, R.color.colorBackground, R.color.emui_accent);
        devicePairGuideActivity.at.setProgress(0);
        devicePairGuideActivity.br = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.device_error_bad_layout);
        devicePairGuideActivity.di = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.device_download_bad_layout);
        devicePairGuideActivity.ax = (HealthButton) qsp.a(devicePairGuideActivity, R.id.cancel_res_button);
        devicePairGuideActivity.av = (HealthColumnLinearLayout) qsp.a(devicePairGuideActivity, R.id.cancel_res_layout);
        devicePairGuideActivity.dj = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.resource_error);
        devicePairGuideActivity.ax.setOnClickListener(new View.OnClickListener() { // from class: qyw.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                devicePairGuideActivity.finish();
            }
        });
        a(devicePairGuideActivity);
    }

    private void a(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.bx = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.ll_pairing_guide_choose);
        devicePairGuideActivity.dg = (HealthButton) qsp.a(devicePairGuideActivity, R.id.pair_guide_again);
        devicePairGuideActivity.dl = (HealthButton) qsp.a(devicePairGuideActivity, R.id.skip_pair_guide);
    }
}
