package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import health.compact.a.Services;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
class qyv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f46971b = {R.string.IDS_device_pair_guide_b3_tip1_ex, R.string.IDS_device_pair_guide_b3_tip2_ex, R.string.IDS_device_pair_guide_b3_tip3};
    private final int[] e = {R.string.IDS_device_paring_type_le_des_info_21};
    private final int[] d = {R.string.IDS_select_device_connect_grus_change_tip_1, R.string.IDS_select_device_connect_grus_change_tip_2, R.string.IDS_device_pair_guide_b3_tip3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f46970a = {R.string.IDS_aw_binding_tips};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f46972c = BaseApplication.getContext();

    qyv() {
    }

    protected void e(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            LogUtil.j("DevicePairGuideShowManager", "showPairGuide, activity is null");
            return;
        }
        LogUtil.a("DevicePairGuideShowManager", "Enter showPairGuide(): mDeviceProductType is ", Integer.valueOf(devicePairGuideActivity.aq));
        devicePairGuideActivity.bj = false;
        if (lvi.n(devicePairGuideActivity.aq)) {
            if (devicePairGuideActivity.ag != null && devicePairGuideActivity.ag.i() != null) {
                e(devicePairGuideActivity.aq, devicePairGuideActivity);
            }
        } else {
            c(devicePairGuideActivity.aq, devicePairGuideActivity);
        }
        if (devicePairGuideActivity.aq != 10) {
            devicePairGuideActivity.bb.sendEmptyMessage(4);
        }
    }

    private void e(int i, DevicePairGuideActivity devicePairGuideActivity) {
        if (i == 16) {
            k(devicePairGuideActivity);
            return;
        }
        if (i != 32) {
            if (i != 23 && i != 24 && i != 44 && i != 45) {
                switch (i) {
                    case 18:
                    case 19:
                        break;
                    case 20:
                    case 21:
                        e(BaseApplication.getContext().getString(R.string.IDS_device_fortuna_pair_guide_tip1), devicePairGuideActivity);
                        return;
                    default:
                        switch (i) {
                            case 34:
                            case 35:
                                e(BaseApplication.getContext().getString(R.string.IDS_device_latona_pair_guide_tip1_new), devicePairGuideActivity);
                                break;
                            case 36:
                            case 37:
                                break;
                            default:
                                r(devicePairGuideActivity);
                                break;
                        }
                        return;
                }
            }
            t(devicePairGuideActivity);
            return;
        }
        q(devicePairGuideActivity);
    }

    private void c(int i, DevicePairGuideActivity devicePairGuideActivity) {
        if (i != 3) {
            if (i == 32) {
                f(devicePairGuideActivity);
                return;
            }
            if (i == 7) {
                g(devicePairGuideActivity);
                return;
            }
            if (i == 8) {
                m(devicePairGuideActivity);
                return;
            }
            switch (i) {
                case 10:
                    break;
                case 11:
                    a(devicePairGuideActivity);
                    break;
                case 12:
                    h(devicePairGuideActivity);
                    break;
                case 13:
                    n(devicePairGuideActivity);
                    break;
                case 14:
                    o(devicePairGuideActivity);
                    break;
                case 15:
                    l(devicePairGuideActivity);
                    break;
                default:
                    d(i, devicePairGuideActivity);
                    break;
            }
            return;
        }
        j(devicePairGuideActivity);
    }

    private void d(int i, DevicePairGuideActivity devicePairGuideActivity) {
        if (i == 23) {
            d(devicePairGuideActivity);
            return;
        }
        if (i == 24) {
            b(devicePairGuideActivity);
            return;
        }
        if (i == 34) {
            e(this.f46972c.getString(R.string.IDS_device_latona_pair_guide_tip1_new), devicePairGuideActivity);
            return;
        }
        if (i == 36) {
            i(devicePairGuideActivity);
        } else if (i == 37) {
            c(devicePairGuideActivity);
        } else {
            LogUtil.a("DevicePairGuideShowManager", "no support type : ", Integer.valueOf(i));
        }
    }

    private void k(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, devicePairGuideActivity.ag.i().aw()));
        devicePairGuideActivity.bt.setVisibility(0);
        devicePairGuideActivity.bt.setImageResource(R.drawable.janus_pair_guide_animation);
        devicePairGuideActivity.t = (AnimationDrawable) devicePairGuideActivity.bt.getDrawable();
        Iterator<String> it = devicePairGuideActivity.ag.i().ar().iterator();
        while (it.hasNext()) {
            devicePairGuideActivity.t.addFrame(new BitmapDrawable(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, it.next())), 100);
        }
        if (devicePairGuideActivity.t != null) {
            devicePairGuideActivity.t.start();
        } else {
            LogUtil.j("DevicePairGuideShowManager", "mB3PairGuideAnim is null");
        }
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(0);
        devicePairGuideActivity.cv.setVisibility(0);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ck.setText(this.f46972c.getString(R.string.IDS_device_janus_pair_guide_tip1));
        devicePairGuideActivity.cl.setText(this.f46972c.getString(R.string.IDS_device_latona_pair_guide_tip3, this.f46972c.getString(R.string.IDS_device_start_paring_title)));
    }

    private void t(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, devicePairGuideActivity.ag.i().aw()));
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(0);
        devicePairGuideActivity.ct.setText(this.f46972c.getString(this.e[0], devicePairGuideActivity.aj));
    }

    private void e(String str, DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity.ag != null) {
            devicePairGuideActivity.cb.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, devicePairGuideActivity.ag.i().aw()));
        } else {
            devicePairGuideActivity.cb.setImageResource(R.mipmap.device_icon_watch_default);
        }
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(0);
        devicePairGuideActivity.cv.setVisibility(0);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.cq.setText(String.format(Locale.ENGLISH, this.f46972c.getResources().getString(R.string.IDS_device_latona_pair_guide_01), this.f46972c.getResources().getString(R.string.IDS_device_start_paring_title).toUpperCase(Locale.getDefault())));
        devicePairGuideActivity.ck.setText(str);
        devicePairGuideActivity.cl.setText(this.f46972c.getString(R.string.IDS_device_latona_pair_guide_tip3, this.f46972c.getString(R.string.IDS_device_start_paring_title).toUpperCase(Locale.getDefault())));
    }

    private void q(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cu.setVisibility(0);
        devicePairGuideActivity.bw.setText(this.f46972c.getResources().getString(R.string.IDS_device_cassini_no_fond_device_content_first, 1));
        devicePairGuideActivity.by.setText(this.f46972c.getResources().getString(R.string.IDS_device_cassini_no_fond_device_content_second, 2));
    }

    private void r(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity.ag.i().i() == 1) {
            devicePairGuideActivity.cb.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, devicePairGuideActivity.ag.i().aw()));
            devicePairGuideActivity.bt.setVisibility(0);
            devicePairGuideActivity.bt.setImageResource(R.drawable.default_pair_guide_animation);
            devicePairGuideActivity.t = (AnimationDrawable) devicePairGuideActivity.bt.getDrawable();
            if (devicePairGuideActivity.ag.i() == null) {
                LogUtil.j("DevicePairGuideShowManager", "mDeviceInfoForPlugin.getWearDeviceInfo() is null");
                return;
            }
            Iterator<String> it = devicePairGuideActivity.ag.i().ar().iterator();
            while (it.hasNext()) {
                devicePairGuideActivity.t.addFrame(new BitmapDrawable(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, it.next())), 100);
            }
            if (devicePairGuideActivity.t != null) {
                devicePairGuideActivity.t.start();
            } else {
                LogUtil.j("DevicePairGuideShowManager", "mB3PairGuideAnim is null!");
            }
        } else {
            devicePairGuideActivity.cb.setImageBitmap(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(devicePairGuideActivity.ag, devicePairGuideActivity.ag.i().aw()));
        }
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(0);
        String strV = lvi.a(devicePairGuideActivity.aq).v();
        if ("".equals(strV)) {
            strV = this.f46972c.getString(this.e[0], devicePairGuideActivity.aj);
        }
        devicePairGuideActivity.ct.setText(strV);
    }

    private void h(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.ic_pic_a1_empty_bg);
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(0);
        devicePairGuideActivity.ct.setText(this.f46972c.getString(this.e[0], devicePairGuideActivity.aj));
    }

    private void m(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.img_honor_s1_pic1);
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(0);
        devicePairGuideActivity.ct.setText(this.f46972c.getString(this.e[0]));
    }

    private void f(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.img_honor_s1_pic1);
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        q(devicePairGuideActivity);
    }

    private void n(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.img_honor_nyx_pic1);
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(0);
        devicePairGuideActivity.ct.setText(this.f46972c.getString(this.e[0], devicePairGuideActivity.aj));
    }

    private void l(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.img_huawei_eris_pic1);
        devicePairGuideActivity.cn.setVisibility(8);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(0);
        devicePairGuideActivity.ct.setText(this.f46972c.getString(this.e[0], devicePairGuideActivity.aj));
    }

    private void g(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.img_huawei_b3_bg);
        devicePairGuideActivity.bt.setVisibility(0);
        devicePairGuideActivity.bt.setImageResource(R.drawable.b3_pair_guide_animation);
        devicePairGuideActivity.t = (AnimationDrawable) devicePairGuideActivity.bt.getDrawable();
        if (devicePairGuideActivity.bt.getDrawable() instanceof AnimationDrawable) {
            devicePairGuideActivity.t = (AnimationDrawable) devicePairGuideActivity.bt.getDrawable();
        }
        if (devicePairGuideActivity.t != null) {
            devicePairGuideActivity.t.start();
        } else {
            LogUtil.j("DevicePairGuideShowManager", "mB3PairGuideAnim is null!");
        }
        s(devicePairGuideActivity);
    }

    private void o(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setImageResource(R.mipmap.img_huawei_grus_bg);
        devicePairGuideActivity.bt.setVisibility(0);
        devicePairGuideActivity.bt.setImageResource(R.drawable.grus_pair_guide_animation);
        devicePairGuideActivity.t = (AnimationDrawable) devicePairGuideActivity.bt.getDrawable();
        if (devicePairGuideActivity.t != null) {
            devicePairGuideActivity.t.start();
        } else {
            LogUtil.j("DevicePairGuideShowManager", "mGRUSPairGuideAnim is null!");
        }
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(0);
        devicePairGuideActivity.cp.setVisibility(0);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ch.setText(this.d[2]);
        String string = this.f46972c.getResources().getString(this.d[0]);
        String string2 = this.f46972c.getResources().getString(this.d[1]);
        devicePairGuideActivity.ck.setText(string);
        devicePairGuideActivity.cl.setText(string2);
    }

    private void j(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity.be) {
            devicePairGuideActivity.bb.sendEmptyMessage(2);
            return;
        }
        devicePairGuideActivity.bb.sendEmptyMessage(1);
        devicePairGuideActivity.bb.sendEmptyMessage(4);
        devicePairGuideActivity.bb.sendEmptyMessage(5);
    }

    private void a(DevicePairGuideActivity devicePairGuideActivity) {
        String str;
        if ("HUAWEI CM-R1P".equals(devicePairGuideActivity.bo) || this.f46972c.getString(R.string.IDS_huawei_r1_pro_content).equals(devicePairGuideActivity.bo) || this.f46972c.getString(R.string.IDS_device_r1_pro_name_title).equals(devicePairGuideActivity.bo)) {
            devicePairGuideActivity.cb.setImageResource(R.mipmap.r1_pro_pairing);
        } else {
            devicePairGuideActivity.cb.setImageResource(R.mipmap.ic_pairing_guide_r1_01);
        }
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(0);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cm.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        if (qrs.ah(BaseApplication.getContext())) {
            str = String.format(Locale.ENGLISH, this.f46972c.getResources().getString(R.string.IDS_pad_device_paring_step1), new Object[0]);
        } else {
            str = String.format(Locale.ENGLISH, this.f46972c.getResources().getString(R.string.IDS_device_paring_type_r1_des_info_step1), new Object[0]);
        }
        devicePairGuideActivity.ck.setText(str);
        devicePairGuideActivity.cl.setText(R.string.IDS_device_paring_type_r1_des_info_guide_2);
    }

    private void d(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cm.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ck.setText(this.f46970a[0]);
    }

    private void b(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cm.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ck.setText(devicePairGuideActivity.o[0]);
    }

    private void i(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cm.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ck.setText(devicePairGuideActivity.o[0]);
    }

    private void c(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(8);
        devicePairGuideActivity.cp.setVisibility(8);
        devicePairGuideActivity.cm.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ck.setText(devicePairGuideActivity.o[0]);
    }

    private void s(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cn.setVisibility(0);
        devicePairGuideActivity.co.setVisibility(0);
        devicePairGuideActivity.cp.setVisibility(0);
        devicePairGuideActivity.cv.setVisibility(8);
        devicePairGuideActivity.cu.setVisibility(8);
        devicePairGuideActivity.cs.setVisibility(8);
        devicePairGuideActivity.ch.setText(this.f46971b[2]);
        Html.ImageGetter imageGetter = new Html.ImageGetter() { // from class: qyv.3
            @Override // android.text.Html.ImageGetter
            public Drawable getDrawable(String str) {
                int i;
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    LogUtil.a("DevicePairGuideShowManager", "NumberFormatException");
                    i = 0;
                }
                Drawable drawable = qyv.this.f46972c.getResources().getDrawable(i);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                return drawable;
            }
        };
        String string = this.f46972c.getResources().getString(this.f46971b[0]);
        String string2 = this.f46972c.getResources().getString(this.f46971b[1]);
        int iIndexOf = string.indexOf("%1$s");
        int iIndexOf2 = string2.indexOf("%1$s");
        if (iIndexOf > 0) {
            devicePairGuideActivity.ck.setText(string.substring(0, iIndexOf));
            devicePairGuideActivity.ck.append(Html.fromHtml("<img src='" + R.drawable.img_pairing_more_new + "'/>", imageGetter, null));
            devicePairGuideActivity.ck.append(string.substring(iIndexOf + 4));
        }
        if (iIndexOf2 > 0) {
            devicePairGuideActivity.cl.setText(string2.substring(0, iIndexOf2));
            devicePairGuideActivity.cl.append(Html.fromHtml("<img src='" + R.drawable.img_bluetooth_new + "'/>", imageGetter, null));
            devicePairGuideActivity.cl.append(string2.substring(iIndexOf2 + 4));
        }
    }
}
