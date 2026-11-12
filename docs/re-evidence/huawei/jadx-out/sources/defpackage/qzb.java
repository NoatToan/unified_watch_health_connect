package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
class qzb implements EarPhoneResponseCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f47013b;
    private DevicePairGuideActivity e;
    private String h;
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47012a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f47014c = new Handler(Looper.getMainLooper()) { // from class: qzb.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == -2) {
                ReleaseLogUtil.e("DEVMGR_EarPhonePairManager", "pair time out");
                xjt.m("earphone pair time out ");
                lxb.c().e(qzb.this.f47013b);
                qzb.this.g();
                return;
            }
            if (i == -1) {
                ReleaseLogUtil.d("DEVMGR_EarPhonePairManager", "handleMessage, pair fail");
                removeMessages(-2);
                qzb.this.g();
                return;
            }
            if (i == 1) {
                ReleaseLogUtil.d("DEVMGR_EarPhonePairManager", "handleMessage, pair success");
                removeMessages(-2);
                qzb.this.n();
                return;
            }
            if (i == 4) {
                ReleaseLogUtil.d("DEVMGR_EarPhonePairManager", "handleMessage, get info success");
                qzb.this.a(message);
                return;
            }
            if (i == 5) {
                ReleaseLogUtil.d("DEVMGR_EarPhonePairManager", "handleMessage, device skip pair");
                removeMessages(-2);
                if (qzb.this.d) {
                    return;
                }
                qzb.this.i();
                return;
            }
            if (i == 6) {
                ReleaseLogUtil.d("DEVMGR_EarPhonePairManager", "handleMessage, device retry pair");
                removeMessages(-2);
                if (qzb.this.d) {
                    return;
                }
                qzb.this.e();
                return;
            }
            c(message.what);
        }

        private void c(int i) {
            if (i == 0) {
                ReleaseLogUtil.e("DEVMGR_EarPhonePairManager", "earphone is ou side");
                removeMessages(-2);
                qzb.this.d();
            } else if (i == 2) {
                ReleaseLogUtil.e("DEVMGR_EarPhonePairManager", "device ignore pair");
                qzb.this.m();
            } else {
                LogUtil.j("EarPhonePairManager", "other status");
            }
        }
    };

    qzb() {
    }

    void a(DeviceInfo deviceInfo, DevicePairGuideActivity devicePairGuideActivity) {
        this.f47013b = deviceInfo;
        this.e = devicePairGuideActivity;
        c();
        lxb.c().e(this);
        h();
    }

    private void c() {
        this.e.dl.setOnClickListener(new View.OnClickListener() { // from class: qzb.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qzb.this.i();
            }
        });
        this.e.dg.setOnClickListener(new View.OnClickListener() { // from class: qzb.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qzb.this.e();
            }
        });
    }

    private void h() {
        ReleaseLogUtil.d("EarPhonePairManager", "enter startPair");
        this.f47014c.sendEmptyMessageDelayed(-2, 90000L);
        j();
        if (this.f47013b == null) {
            LogUtil.j("EarPhonePairManager", "mCurrentDeviceInfo is null");
        } else {
            lxb.c().d(this.f47013b);
        }
    }

    private void j() {
        DevicePairGuideActivity devicePairGuideActivity = this.e;
        if (devicePairGuideActivity == null) {
            return;
        }
        this.d = true;
        devicePairGuideActivity.cz.setVisibility(0);
        this.e.cz.setImageResource(R.drawable.icon_pair_watch_earphone);
        this.e.cf.setVisibility(0);
        this.e.cx.setVisibility(8);
        this.e.cr.setVisibility(8);
        this.e.bx.setVisibility(8);
        if (this.e.cf.getDrawable() instanceof AnimationDrawable) {
            DevicePairGuideActivity devicePairGuideActivity2 = this.e;
            devicePairGuideActivity2.d = (AnimationDrawable) devicePairGuideActivity2.cf.getDrawable();
        }
        this.e.d.start();
        this.e.ad.setVisibility(0);
        this.e.cx.setVisibility(8);
        this.e.dc.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.e.v.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message.obj instanceof edj) {
            j();
            edj edjVar = (edj) message.obj;
            String strC = edjVar.c();
            this.h = edjVar.d();
            if (TextUtils.isEmpty(strC)) {
                this.e.ad.setText("");
            } else {
                this.e.ad.setText(this.e.getResources().getString(R.string.IDS_blite_guide_paire_current_device, strC));
            }
            if (!b(edjVar)) {
                xjt.m("earphone and watch is not connect");
                d();
                return;
            }
            if (TextUtils.isEmpty(this.h) || !BluetoothAdapter.checkBluetoothAddress(this.h)) {
                g();
                lxb.c().e(this.f47013b);
                this.f47014c.removeMessages(-2);
            } else if (d(edjVar) || this.f47012a) {
                LogUtil.a("EarPhonePairManager", "start pair");
                lxb.c().a(this.f47013b);
            } else {
                LogUtil.a("EarPhonePairManager", "waite device ignore");
                this.e.cr.setVisibility(0);
                this.e.cr.setText(R.string.IDS_ear_phone_pair_guide_note);
            }
        }
    }

    private boolean b(edj edjVar) {
        return (edjVar.b() & 1) != 0;
    }

    private boolean d(edj edjVar) {
        int iE = edjVar.e();
        int iA = edjVar.a();
        int iG = edjVar.g();
        LogUtil.a("EarPhonePairManager", "earphone status is: ", Integer.valueOf(iE), " earCloseStatus: ", Integer.valueOf(iA), " earphoneIgnore: ", Integer.valueOf(iG));
        if (iE == 3 && iA == 1) {
            return true;
        }
        return iG == 1 && iA == 1 && iE != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        DevicePairGuideActivity devicePairGuideActivity = this.e;
        if (devicePairGuideActivity == null) {
            return;
        }
        this.f47012a = true;
        devicePairGuideActivity.cr.setVisibility(8);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        DevicePairGuideActivity devicePairGuideActivity = this.e;
        if (devicePairGuideActivity == null) {
            return;
        }
        this.d = false;
        devicePairGuideActivity.cb.setVisibility(8);
        this.e.bt.setVisibility(8);
        this.e.am.setVisibility(8);
        this.e.da.setVisibility(0);
        this.e.cr.setVisibility(8);
        this.e.n.setVisibility(8);
        this.e.l.setVisibility(8);
        this.e.r.setVisibility(8);
        this.e.k.setVisibility(8);
        this.e.cf.setVisibility(8);
        this.e.s.setVisibility(8);
        this.e.d.stop();
        this.e.cf.setVisibility(8);
        this.e.ad.setVisibility(8);
        this.e.cx.setVisibility(0);
        this.e.cx.setImageResource(R.drawable.ic_pairing_result_failure);
        this.e.dc.setText(R.string.IDS_ear_phone_pair_guide_error);
        this.e.cr.setVisibility(0);
        this.e.cr.setText(R.string.IDS_ear_phone_pair_guide_error_note);
        this.e.bx.setVisibility(0);
        this.e.v.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.e == null) {
            return;
        }
        this.d = false;
        LogUtil.a("EarPhonePairManager", "updatePairSuccessView");
        this.e.bx.setVisibility(8);
        this.e.e = false;
        this.e.bc.d(R.string.IDS_blite_guide_paire_completed);
        this.e.cz.setImageResource(R.drawable.icon_pair_watch_earphone);
        f();
        b();
    }

    private void f() {
        this.e.bs.setVisibility(0);
        String string = this.e.getResources().getString(R.string.IDS_ear_privacy_context);
        String string2 = this.e.getResources().getString(R.string.IDS_hw_common_ui_xlistview_footer_hint_normal);
        String string3 = this.e.getResources().getString(R.string.IDS_device_pair_minute_and_second, string, string2);
        SpannableString spannableString = new SpannableString(string3);
        int length = string3.length() - string2.length();
        spannableString.setSpan(new ClickableSpan() { // from class: qzb.4
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Intent intent = new Intent(qzb.this.e, (Class<?>) ServiceItemActivity.class);
                intent.putExtra("Agreement_key", "SagaPrivacyStatement");
                intent.putExtra("Is_show_cancel_key", true);
                if (qzb.this.f47013b != null) {
                    intent.putExtra("product_type", qzb.this.f47013b.getProductType());
                }
                intent.addFlags(268435456);
                qzb.this.e.startActivity(intent);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(qzb.this.e.getColor(R.color.colorAccent));
                textPaint.setUnderlineText(false);
            }
        }, length, spannableString.toString().length(), 18);
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), length, spannableString.toString().length(), 33);
        this.e.bs.setMovementMethod(LinkMovementMethod.getInstance());
        this.e.bs.setHighlightColor(this.e.getResources().getColor(android.R.color.transparent));
        this.e.bs.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        lxb.c().c(this.f47013b);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        lxb.c().b(this.f47013b);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.e == null) {
            return;
        }
        Handler handler = this.f47014c;
        if (handler != null) {
            handler.removeMessages(-2);
        }
        this.e.aw.setVisibility(0);
        this.e.aw.setText(String.format(Locale.ROOT, this.e.getResources().getString(R.string.IDS_ear_phone_pair_guid_error_tips), this.e.getResources().getString(R.string.IDS_wear_home_device_earphone)));
        this.e.bx.setVisibility(8);
        this.e.bc.d(R.string.IDS_ear_phone_pair_error_result);
        this.e.e = false;
        f();
        b();
    }

    protected void a() {
        xjt.m("user cancel pair");
        lxb.c().d(this.f47013b, this.h);
        d();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
    public void onResponse(int i, edj edjVar) {
        LogUtil.a("EarPhonePairManager", "executeResponse, errCode: ", Integer.valueOf(i));
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = edjVar;
        this.f47014c.sendMessage(messageObtain);
    }

    public void b() {
        LogUtil.a("EarPhonePairManager", "destroyInstance() start.");
        lxb.c().b(this);
        Handler handler = this.f47014c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
