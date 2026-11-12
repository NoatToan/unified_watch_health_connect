package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import com.huawei.common.Constant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityCertUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.vippage.dataauthority.HealthDataAuthorityActivity;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.ChallengeInfo;
import com.huawei.trade.datatype.DeviceBenefitProductInfo;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.trade.datatype.SubscriptionPromotion;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class fbb extends BaseDialog {
    private boolean aa;
    private boolean ab;
    private volatile boolean ac;
    private HealthTextView ad;
    private String ae;
    private ProductInfo af;
    private int ag;
    private HealthProgressBar ah;
    private String f;
    private String h;
    private int i;
    private boolean j;
    private HealthImageView k;
    private BaseDeviceBenefitInfo l;
    private boolean m;
    private DeviceBenefitQueryParam n;
    private int o;
    private TextView p;
    private ConstraintLayout q;
    private Context r;
    private String s;
    private HealthButton t;
    private TextView u;
    private TextView v;
    private TextView w;
    private int x;
    private String y;
    private TextView z;
    private static final Integer g = 1;
    private static final Integer e = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer f33803c = 3;
    private static final Integer d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer f33801a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer f33802b = 3;

    public fbb(Context context, int i, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i2) {
        super(context, R.style.BenefitHalfModeStyle, 0);
        this.ag = 0;
        this.i = 0;
        this.af = new ProductInfo();
        this.y = "";
        this.ae = "";
        this.o = 0;
        this.ab = false;
        this.aa = false;
        this.m = false;
        this.s = "";
        this.j = false;
        this.ac = false;
        this.r = context;
        this.ag = i;
        this.x = i2;
        o(baseDeviceBenefitInfo);
        ReleaseLogUtil.c("BenefitRedemptionDialog", " BenefitRedemptionDialog init benefitInfo is ", baseDeviceBenefitInfo.toString());
        ThreadPoolManager.c().execute(new Runnable() { // from class: fbs
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(baseDeviceBenefitInfo);
            }
        });
    }

    /* synthetic */ void d(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        DeviceBenefitQueryParam deviceBenefitQueryParamA = a(baseDeviceBenefitInfo);
        this.n = deviceBenefitQueryParamA;
        e(deviceBenefitQueryParamA, baseDeviceBenefitInfo);
    }

    private void o(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        LogUtil.a("BenefitRedemptionDialog", "initView");
        this.mView = ((LayoutInflater) this.r.getSystemService("layout_inflater")).inflate(R.layout.benefit_redemption_dialog, (ViewGroup) null);
        this.k = (HealthImageView) this.mView.findViewById(R.id.benefit_redemption_image);
        this.q = (ConstraintLayout) this.mView.findViewById(R.id.container);
        aa();
        this.w = (TextView) this.mView.findViewById(R.id.instruction_text);
        this.z = (TextView) this.mView.findViewById(R.id.instruction_two_text);
        this.p = (TextView) this.mView.findViewById(R.id.body_content);
        this.v = (TextView) this.mView.findViewById(R.id.default_text_content);
        this.u = (TextView) this.mView.findViewById(R.id.device_propagation_name_text);
        this.ad = (HealthTextView) this.mView.findViewById(R.id.more_benefit);
        this.ah = (HealthProgressBar) this.mView.findViewById(R.id.state_progressBar);
        this.l = baseDeviceBenefitInfo;
        h(baseDeviceBenefitInfo);
        i(baseDeviceBenefitInfo);
        n();
        k(baseDeviceBenefitInfo);
        g(baseDeviceBenefitInfo);
        setContentView(this.mView);
    }

    private void aa() {
        final float fA = qre.a(R.dimen.emui_corner_radius_dialog);
        this.q.setOutlineProvider(new ViewOutlineProvider() { // from class: fbb.5
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (qrs.af(fbb.this.r)) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), fA);
                    return;
                }
                int width = view.getWidth();
                int height = view.getHeight();
                float f = fA;
                outline.setRoundRect(0, 0, width, height + ((int) (2.0f * f)), f);
            }
        });
        this.q.setClipToOutline(true);
    }

    private void h(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String strD;
        if (baseDeviceBenefitInfo == null) {
            LogUtil.a("BenefitRedemptionDialog", " initParams benefitInfo is null ");
            return;
        }
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            if (baseDeviceBenefitInfo.getBenefitType() == 1) {
                this.i = d.intValue();
            } else if (baseDeviceBenefitInfo.getBenefitType() == 2) {
                this.i = f33801a.intValue();
            }
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) baseDeviceBenefitInfo;
            if (njy.b(deviceInboxInfo.getOtherServiceList())) {
                this.aa = true;
            }
            strD = irx.e(deviceInboxInfo);
        } else if (!(baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo)) {
            strD = "";
        } else {
            this.i = f33802b.intValue();
            DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) baseDeviceBenefitInfo;
            int autoRenew = devicePerfPurchaseInfo.getAutoRenew();
            this.o = autoRenew;
            LogUtil.a("BenefitRedemptionDialog", "BenefitRedemptionDialog mAutoRenew is ", Integer.valueOf(autoRenew));
            e(devicePerfPurchaseInfo);
            if (njy.b(devicePerfPurchaseInfo.getOtherServiceList())) {
                this.aa = true;
            }
            this.af = new ProductInfo();
            strD = irx.d(devicePerfPurchaseInfo);
        }
        this.h = irz.b(strD);
        this.f = DateFormatUtil.d(baseDeviceBenefitInfo.getEffectiveEndTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD);
    }

    private void e(DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        if (devicePerfPurchaseInfo == null) {
            LogUtil.a("BenefitRedemptionDialog", "getPurchasePrice benefitInfo is null");
            return;
        }
        if (this.o == 0) {
            if (!TextUtils.isEmpty(devicePerfPurchaseInfo.getSubscriptionPromotionId()) && devicePerfPurchaseInfo.getSubscriptionPromotion() != null) {
                this.ae = fca.c(devicePerfPurchaseInfo.getSubscriptionPromotion().getMicroPrice(), "#.##");
            } else {
                if (devicePerfPurchaseInfo.getSubscribeProductInfo() == null) {
                    LogUtil.a("BenefitRedemptionDialog", "getPurchasePrice ProductInfo error ");
                    return;
                }
                this.ae = fca.c(devicePerfPurchaseInfo.getSubscribeProductInfo().getMicroPrice(), "#.##");
            }
            this.s = devicePerfPurchaseInfo.getSubscribeProductInfo().getCurrency();
            return;
        }
        if (devicePerfPurchaseInfo.getProductInfo() == null) {
            LogUtil.a("BenefitRedemptionDialog", "getPurchasePrice ProductInfo error ");
        } else {
            this.s = devicePerfPurchaseInfo.getProductInfo().getCurrency();
            this.ae = fca.c(devicePerfPurchaseInfo.getProductInfo().getMicroPrice(), "#.##");
        }
    }

    private void n() {
        UserMemberInfo userMemberInfoA = irz.a();
        boolean z = userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1;
        this.j = z;
        ReleaseLogUtil.c("BenefitRedemptionDialog", "checkVipHistory isHistoryNoVip :", Boolean.valueOf(z));
    }

    private boolean ah() {
        String strE = SharedPreferenceManager.e(this.r, Integer.toString(1004), "cloud_user_privacy16");
        LogUtil.a("BenefitRedemptionDialog", "isHealthDataSwitchClosed healthDataSwitchValue = ", strE);
        return TextUtils.isEmpty(strE) || "false".equals(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        if (this.ac) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "showHealthDataAuthorityDialog isHealthDataDialogShown true.");
            d();
            return;
        }
        if (!this.j) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "showHealthDataAuthorityDialog isHistoryNoVip false.");
            d();
            return;
        }
        if (Utils.o()) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "showHealthDataAuthorityDialog isOversea.");
            d();
            return;
        }
        if (!ah()) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "showHealthDataAuthorityDialog switch opened.");
            d();
            return;
        }
        if (this.x == 1) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "showHealthDataAuthorityDialog from annual card.");
            d();
        } else {
            if (this.r instanceof Activity) {
                this.ac = true;
                Activity activity = (Activity) this.r;
                Intent intent = new Intent(this.r, (Class<?>) HealthDataAuthorityActivity.class);
                intent.putExtra("fromPage", this.x);
                activity.startActivityForResult(intent, 1001);
                return;
            }
            ReleaseLogUtil.b("BenefitRedemptionDialog", "showHealthDataAuthorityDialog error.");
            d();
        }
    }

    private void i(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String cardUrl;
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            if (qrs.af(this.r)) {
                cardUrl = baseDeviceBenefitInfo.getLargeCardUrl();
            } else {
                cardUrl = ((DeviceInboxInfo) baseDeviceBenefitInfo).getCardUrl();
            }
        } else if (!(baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo)) {
            cardUrl = "";
        } else if (qrs.af(this.r)) {
            cardUrl = baseDeviceBenefitInfo.getLargeCardUrl();
        } else {
            cardUrl = ((DevicePerfPurchaseInfo) baseDeviceBenefitInfo).getCardUrl();
        }
        if (TextUtils.isEmpty(cardUrl)) {
            y();
        } else {
            c(cardUrl);
        }
    }

    private void c(final String str) {
        int iB;
        int i = qrs.i(this.r);
        this.k.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        if (qrs.af(this.r)) {
            if (i <= qre.b(R.dimen.health_common_480dp)) {
                iB = i - (qre.b(R.dimen.health_common_32dp) * 2);
            } else {
                iB = qre.b(R.dimen.health_common_480dp);
            }
            this.k.setLayoutParams(new ViewGroup.LayoutParams(iB, (qre.b(R.dimen.health_common_360dp) / qre.b(R.dimen.health_common_480dp)) * iB));
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: fbh
            @Override // java.lang.Runnable
            public final void run() {
                this.f33817c.d(str);
            }
        });
    }

    /* synthetic */ void d(String str) {
        final Drawable drawableB = qqf.b(this.r, str);
        if (drawableB == null) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "loadImage drawable is null ");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: fbz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33838a.c(drawableB);
                }
            });
        }
    }

    /* synthetic */ void c(Drawable drawable) {
        HealthImageView healthImageView = this.k;
        if (healthImageView == null) {
            ReleaseLogUtil.b("BenefitRedemptionDialog", "loadImage mBackgroundImageView is null ");
        } else {
            healthImageView.setImageDrawable(drawable);
        }
    }

    private void y() {
        int iAd;
        int i = this.i;
        if (i != 1) {
            if (i == 2) {
                iAd = w();
            } else {
                iAd = ad();
                LogUtil.e("BenefitRedemptionDialog", "default image error");
            }
        } else if (this.ag == 1) {
            iAd = z();
        } else {
            iAd = ad();
        }
        if (iAd == 0) {
            return;
        }
        this.k.setImageResource(iAd);
    }

    private int w() {
        Context context = this.r;
        if (context == null) {
            LogUtil.j("BenefitRedemptionDialog", "mContext is null, return default exclusive image");
            return R.drawable.ic_inbox_exclusive_default_china;
        }
        if (qrs.af(context)) {
            return R.drawable.ic_inbox_exclusive_wide_default_china;
        }
        return R.drawable.ic_inbox_exclusive_default_china;
    }

    private int ad() {
        if (this.r == null) {
            LogUtil.j("BenefitRedemptionDialog", "mContext is null, return default vip image");
            return R.drawable.ic_inbox_vip_default_china;
        }
        boolean zO = Utils.o();
        boolean zAf = qrs.af(this.r);
        if (zO) {
            if (zAf) {
                return R.drawable.ic_inbox_vip_wide_default_oversea;
            }
            return R.drawable.ic_inbox_vip_default_oversea;
        }
        if (zAf) {
            return R.drawable.ic_inbox_vip_wide_default_china;
        }
        return R.drawable.ic_inbox_vip_default_china;
    }

    private int z() {
        if (this.r == null) {
            LogUtil.j("BenefitRedemptionDialog", "mContext is null, return default smart image");
            return R.drawable.ic_inbox_smart_default_china;
        }
        boolean zO = Utils.o();
        boolean zAf = qrs.af(this.r);
        if (zO) {
            if (zAf) {
                return R.drawable.ic_inbox_smart_wide_default_oversea;
            }
            return R.drawable.ic_inbox_smart_default_oversea;
        }
        if (zAf) {
            return R.drawable.ic_inbox_smart_wide_default_china;
        }
        return R.drawable.ic_inbox_smart_default_china;
    }

    private void k(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        f(baseDeviceBenefitInfo);
        c(baseDeviceBenefitInfo);
        v();
        u();
        ab();
    }

    private void ab() {
        String string;
        if (this.i == d.intValue() && this.ag == 1) {
            string = this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_smart_instruction);
        } else {
            string = "";
        }
        this.z.setText(string);
    }

    private void u() {
        String strA = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_window_agreement));
        String strA2 = qre.a(R.string.IDS_huawei_member_protocol, qre.f(com.huawei.ui.commonui.R.string.IDS_benefit_safety_agreement));
        String strA3 = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_renewal_agreement));
        b bVar = new b(this.r, g.intValue(), this.l, this.x);
        b bVar2 = new b(this.r, e.intValue(), this.l, this.x);
        b bVar3 = new b(this.r, f33803c.intValue(), this.l, this.x);
        String strC = c(strA, strA2, strA3);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("BenefitRedemptionDialog", "handleInstructionText baseText is empty");
            return;
        }
        SpannableString spannableString = new SpannableString(strC);
        b(strA, spannableString, bVar);
        b(strA2, spannableString, bVar2);
        b(strA3, spannableString, bVar3);
        this.w.setText(spannableString);
        this.w.setMovementMethod(LinkMovementMethod.getInstance());
        this.w.setLongClickable(false);
        this.w.setClickable(true);
        this.w.setFocusable(true);
    }

    private String c(String str, String str2, String str3) {
        LogUtil.a("BenefitRedemptionDialog", "generateBaseText benefitType is ", Integer.valueOf(this.i));
        if (this.i == d.intValue()) {
            if (!(this.l instanceof DeviceInboxInfo)) {
                LogUtil.j("BenefitRedemptionDialog", "generateBaseText benefitInfo is not DeviceInboxInfo");
                return "";
            }
            return b(str);
        }
        if (this.i == f33801a.intValue()) {
            if (!(this.l instanceof DeviceInboxInfo)) {
                LogUtil.j("BenefitRedemptionDialog", "generateBaseText benefitInfo is not DeviceInboxInfo");
                return "";
            }
            return c(str, str2);
        }
        if (this.i == f33802b.intValue()) {
            return e(str, str3);
        }
        LogUtil.j("BenefitRedemptionDialog", "generateBaseText benefitType error");
        return "";
    }

    private String b(String str) {
        DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) this.l;
        if (deviceInboxInfo.isAutoActivate()) {
            return qre.a(R.string.IDS_benefit_smart_and_inboxvip_instruction, e(deviceInboxInfo.getAutoActivateDelay()), str);
        }
        return qre.a(R.string.IDS_benefit_packaged_goods_purchase_instruction, str);
    }

    private String c(String str, String str2) {
        DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) this.l;
        if (deviceInboxInfo.isAutoActivate()) {
            return qre.a(R.string.IDS_benefit_exclusive_instruction, e(deviceInboxInfo.getAutoActivateDelay()), str, str2);
        }
        return qre.a(R.string.IDS_benefit_automatic_renewal_type_purchase_instruction, str, str2);
    }

    private String e(String str, String str2) {
        if (this.o == 0) {
            return qre.a(R.string.IDS_benefit_automatic_renewal_type_purchase_instruction, str, str2);
        }
        return qre.a(R.string.IDS_benefit_packaged_goods_purchase_instruction, str);
    }

    private String e(int i) {
        int iMax = Math.max(i, 7);
        return qre.e(R.plurals.IDS_user_profile_achieve_num_day, iMax, UnitUtil.e(iMax, 1, 0));
    }

    private void b(String str, SpannableString spannableString, b bVar) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.b(), R.color.hw_show_benefit_dialog));
        qri.a(spannableString, str, bVar);
        qri.a(spannableString, str, CharacterStyle.wrap(foregroundColorSpan));
    }

    private void v() {
        String string;
        if (this.i == d.intValue()) {
            if (this.ag == 1) {
                string = this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_smart_body_content, this.h, this.f);
            } else {
                string = this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_inbox_vip_body_content, this.h, this.f);
            }
        } else if (this.i == f33801a.intValue()) {
            string = this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_inbox_exclusive_body_content, this.h, this.f);
        } else if (this.i != f33802b.intValue()) {
            string = "";
        } else {
            string = this.r.getString(R.string.IDS_benefit_purchase_body_content, d(this.s, this.ae), this.f);
        }
        this.p.setText(string);
    }

    private void c(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String string;
        if (this.i == d.intValue()) {
            if (this.ag == 1) {
                string = this.r.getString(R.string.IDS_benefit_intelligent_training_default, this.h);
            } else {
                string = this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_inbox_vip_default, this.h);
            }
        } else if (this.i == f33801a.intValue()) {
            string = this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_inbox_exclusive_default, this.h);
        } else if (this.i != f33802b.intValue()) {
            string = "";
        } else {
            string = this.r.getString(R.string.IDS_benefit_purchase_default, d(this.s, this.ae));
        }
        if (!TextUtils.isEmpty(baseDeviceBenefitInfo.getPageDesc())) {
            string = baseDeviceBenefitInfo.getPageDesc();
        }
        this.v.setText(string);
    }

    private void f(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        this.u.setText(this.r.getString(com.huawei.ui.commonui.R.string.IDS_benefit_redemption, baseDeviceBenefitInfo.getDeviceName()));
    }

    private void g(final BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        ImageView imageView = (ImageView) this.mView.findViewById(R.id.benefit_redemption_cancel);
        imageView.setBackground(this.r.getResources().getDrawable(R.drawable.semi_modal_cancle));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fbb.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("BenefitRedemptionDialog", "click cancel");
                fbb.this.dismiss();
                faw.a(baseDeviceBenefitInfo, "m3", fbb.this.x);
            }
        });
        if (this.aa) {
            j(baseDeviceBenefitInfo);
        }
        this.t = (HealthButton) this.mView.findViewById(R.id.benefit_redemption_button);
        if (this.i == f33802b.intValue()) {
            this.t.setText(qre.f(R.string.IDS_purchase_active_button_text));
        }
        if (!TextUtils.isEmpty(baseDeviceBenefitInfo.getButtonName())) {
            this.t.setText(baseDeviceBenefitInfo.getButtonName());
        }
        this.t.setOnClickListener(new View.OnClickListener() { // from class: fbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(baseDeviceBenefitInfo, view);
            }
        });
    }

    /* synthetic */ void b(BaseDeviceBenefitInfo baseDeviceBenefitInfo, View view) {
        LogUtil.a("BenefitRedemptionDialog", "click claim now");
        faw.a(baseDeviceBenefitInfo, faw.c(baseDeviceBenefitInfo), this.x);
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("BenefitRedemptionDialog", "click button network is not connected");
            c(-110, baseDeviceBenefitInfo);
        } else {
            if (this.i == f33802b.intValue()) {
                if (this.o == 0 && !this.ab) {
                    ai();
                    return;
                } else {
                    g();
                    return;
                }
            }
            e(baseDeviceBenefitInfo);
        }
    }

    private void j(final BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        this.ad.setVisibility(0);
        this.ad.setOnClickListener(new View.OnClickListener() { // from class: fbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33824b.e(baseDeviceBenefitInfo, view);
            }
        });
    }

    /* synthetic */ void e(BaseDeviceBenefitInfo baseDeviceBenefitInfo, View view) {
        faw.a(baseDeviceBenefitInfo, "m7", this.x);
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("BenefitRedemptionDialog", "click button network is not connected");
            c(-110, baseDeviceBenefitInfo);
        } else if (a(baseDeviceBenefitInfo) == null) {
            LogUtil.j("BenefitRedemptionDialog", "getActiveParams is null");
            c(Constant.MORE_BENEFITS_ACTIVE_DEVICE_NO_CONNECT, baseDeviceBenefitInfo);
        } else {
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath("#/Coupons");
            ddv.b().loadH5ProApp(BaseApplication.b(), "com.huawei.health.h5.assets", builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g() {
        DeviceBenefitProductInfo productInfo;
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fbq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33826a.g();
                }
            });
            return;
        }
        SubscriptionPromotion subscriptionPromotion = ((DevicePerfPurchaseInfo) this.l).getSubscriptionPromotion();
        if (this.o == 0) {
            productInfo = ((DevicePerfPurchaseInfo) this.l).getSubscribeProductInfo();
        } else {
            productInfo = ((DevicePerfPurchaseInfo) this.l).getProductInfo();
        }
        DeviceBenefitQueryParam deviceBenefitQueryParamA = a(this.l);
        if (deviceBenefitQueryParamA == null) {
            c(-100, this.l);
            LogUtil.j("BenefitRedemptionDialog", "getActiveParams is null");
            return;
        }
        if (productInfo == null) {
            LogUtil.j("BenefitRedemptionDialog", "deviceBenefitProductInfo is null");
            return;
        }
        if (subscriptionPromotion == null) {
            LogUtil.j("BenefitRedemptionDialog", "subscriptionPromotion is null");
        }
        b(productInfo, subscriptionPromotion, deviceBenefitQueryParamA);
        HashMap<String, Object> map = new HashMap<>();
        if (this.l.getValidateType() == 2) {
            a(this.l, deviceBenefitQueryParamA, map);
        } else {
            LogUtil.a("BenefitRedemptionDialog", "claimedPurchase mPurchaseProductInfo is ", this.af.toString());
            fca.c((Activity) this.r, this.af);
        }
    }

    private void b(DeviceBenefitProductInfo deviceBenefitProductInfo, SubscriptionPromotion subscriptionPromotion, DeviceBenefitQueryParam deviceBenefitQueryParam) {
        if (this.af == null || deviceBenefitProductInfo == null || deviceBenefitQueryParam == null) {
            LogUtil.e("BenefitRedemptionDialog", "mPurchaseProductInfo deviceBenefitProductInfo activeParams has null ");
            return;
        }
        if (!TextUtils.isEmpty(deviceBenefitProductInfo.getProductName())) {
            this.af.setProductName(deviceBenefitProductInfo.getProductName());
        }
        if (!TextUtils.isEmpty(deviceBenefitProductInfo.getProductId())) {
            this.af.setProductId(deviceBenefitProductInfo.getProductId());
        }
        if (subscriptionPromotion != null && !TextUtils.isEmpty(subscriptionPromotion.getPromotionId())) {
            this.af.setPromotionId(subscriptionPromotion.getPromotionId());
        }
        if (subscriptionPromotion != null && !TextUtils.isEmpty(subscriptionPromotion.getPromotionPolicyId())) {
            this.af.setPromotionPolicyId(subscriptionPromotion.getPromotionPolicyId());
        }
        if (!TextUtils.isEmpty(((DevicePerfPurchaseInfo) this.l).getDevicePerfPurchaseId())) {
            this.af.setDevicePerfPurchaseId(((DevicePerfPurchaseInfo) this.l).getDevicePerfPurchaseId());
        }
        if (!TextUtils.isEmpty(String.valueOf(deviceBenefitProductInfo.getPurchasePolicy()))) {
            this.af.setPurchasePolicy(deviceBenefitProductInfo.getPurchasePolicy());
        }
        if (!TextUtils.isEmpty(this.l.getDeviceSn())) {
            this.af.setDeviceSn(this.l.getDeviceSn());
        }
        if (!TextUtils.isEmpty(deviceBenefitQueryParam.getDeviceType())) {
            this.af.setDeviceType(deviceBenefitQueryParam.getDeviceType());
        }
        if (deviceBenefitQueryParam.getDeviceSnType() != 0) {
            this.af.setDeviceSnType(deviceBenefitQueryParam.getDeviceSnType());
        }
        if (!TextUtils.isEmpty(deviceBenefitQueryParam.getDeviceNumber())) {
            this.af.setDeviceNumber(eeq.d(deviceBenefitQueryParam.getDeviceNumber()));
        }
        if (!TextUtils.isEmpty(deviceBenefitQueryParam.getDeviceUdid())) {
            this.af.setDeviceUdid(deviceBenefitQueryParam.getDeviceUdid());
        }
        if (!TextUtils.isEmpty(deviceBenefitQueryParam.getSalt())) {
            this.af.setSalt(eeq.d(deviceBenefitQueryParam.getSalt()));
        }
        if (deviceBenefitQueryParam.getDeviceCategory() != 0) {
            this.af.setDeviceCategory(deviceBenefitQueryParam.getDeviceCategory());
        }
        this.af.setClientVersion(fod.e(BaseApplication.b()));
        this.af.setTrigResName("新用户1元权益引导开通");
        this.af.setTrigResType(BleConstants.CODE_AUTHORIZED_FAIL);
    }

    private void e(final BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            if (!irz.d(baseDeviceBenefitInfo)) {
                c(-2, baseDeviceBenefitInfo);
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: fbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b(baseDeviceBenefitInfo);
                    }
                });
            }
        }
    }

    /* synthetic */ void b(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        DeviceBenefitQueryParam deviceBenefitQueryParamA = a(baseDeviceBenefitInfo);
        if (deviceBenefitQueryParamA == null) {
            LogUtil.j("BenefitRedemptionDialog", "getActiveParams is null");
            c(-100, baseDeviceBenefitInfo);
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (this.l.getValidateType() == 2) {
            a(baseDeviceBenefitInfo, deviceBenefitQueryParamA, map);
        } else {
            b(deviceBenefitQueryParamA, baseDeviceBenefitInfo, map);
        }
    }

    private void a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, DeviceBenefitQueryParam deviceBenefitQueryParam, HashMap<String, Object> map) {
        k();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c(baseDeviceBenefitInfo, deviceBenefitQueryParam, map, countDownLatch);
        try {
            boolean zAwait = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            LogUtil.a("BenefitRedemptionDialog", "DeviceConfigInit create isOnTime:", Boolean.valueOf(zAwait));
            if (!zAwait) {
                c(Constant.BENEFITS_ACTIVE_CERTIFICATE_CHAIN_TIME_OUT, this.l);
                return;
            }
            if (this.i == d.intValue() || this.i == f33801a.intValue()) {
                b(deviceBenefitQueryParam, baseDeviceBenefitInfo, map);
            } else {
                LogUtil.a("BenefitRedemptionDialog", "claimedPurchase mPurchaseProductInfo is ", this.af.toString());
                fca.c((Activity) this.r, this.af);
            }
        } catch (InterruptedException unused) {
            LogUtil.e("BenefitRedemptionDialog", "DeviceConfigInit create catch InterruptedException");
        } finally {
            m();
        }
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k() {
        LogUtil.a("BenefitRedemptionDialog", "showLoading");
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: fbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33815c.k();
                }
            });
            return;
        }
        HealthProgressBar healthProgressBar = this.ah;
        if (healthProgressBar == null) {
            return;
        }
        healthProgressBar.setVisibility(0);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m() {
        LogUtil.a("BenefitRedemptionDialog", "hideLoading");
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: fbi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33818c.m();
                }
            });
            return;
        }
        HealthProgressBar healthProgressBar = this.ah;
        if (healthProgressBar == null) {
            return;
        }
        healthProgressBar.setVisibility(8);
    }

    private void ai() {
        String strA = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_window_agreement));
        String strA2 = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_renewal_agreement));
        String strA3 = qre.a(R.string.IDS_purchase_check_dialog_text, strA, strA2);
        b bVar = new b(this.r, g.intValue(), this.l, this.x);
        b bVar2 = new b(this.r, f33803c.intValue(), this.l, this.x);
        SpannableString spannableString = new SpannableString(strA3);
        b(strA, spannableString, bVar);
        b(strA2, spannableString, bVar2);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.r).e(spannableString).a(true).b(R.string.IDS_purchase_check_dialog_conform, R.color.hw_show_benefit_dialog, new DialogInterface.OnClickListener() { // from class: fbk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f33821a.d(dialogInterface, i);
            }
        }).a(R.string.dialog_cancel, R.color.hw_show_benefit_dialog, new DialogInterface.OnClickListener() { // from class: fbg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.c(dialogInterface, i);
            }
        }).a(true).b();
        customAlertDialogB.show();
        TextView textView = (TextView) customAlertDialogB.findViewById(com.huawei.ui.commonui.R.id.dialog_tv_message);
        if (textView != null) {
            textView.setGravity(17);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setPadding(0, qre.d(R.dimen.health_common_24dp), 0, 0);
            View view = (View) textView.getParent();
            if (view != null) {
                view.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        this.ab = true;
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("BenefitRedemptionDialog", "click button network is not connected");
            c(-110, this.l);
        } else {
            g();
        }
    }

    /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.ab = false;
    }

    private void c(final BaseDeviceBenefitInfo baseDeviceBenefitInfo, final DeviceBenefitQueryParam deviceBenefitQueryParam, final HashMap<String, Object> map, final CountDownLatch countDownLatch) {
        ((PayApi) Services.b("TradeService", PayApi.class)).getChallenge(new IBaseResponseCallback() { // from class: fbu
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.c(baseDeviceBenefitInfo, deviceBenefitQueryParam, map, countDownLatch, i, obj);
            }
        });
    }

    /* synthetic */ void c(BaseDeviceBenefitInfo baseDeviceBenefitInfo, DeviceBenefitQueryParam deviceBenefitQueryParam, HashMap map, CountDownLatch countDownLatch, int i, Object obj) {
        LogUtil.a("BenefitRedemptionDialog", "getChallenge onResponse errorCode: ", Integer.valueOf(i));
        if (i == 0) {
            LogUtil.d("BenefitRedemptionDialog", "getChallenge onResponse objData: ", qqt.b(obj));
            a(baseDeviceBenefitInfo, deviceBenefitQueryParam, ((ChallengeInfo) obj).getChallenge(), map, countDownLatch);
        } else {
            countDownLatch.countDown();
        }
    }

    private void a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, DeviceBenefitQueryParam deviceBenefitQueryParam, String str, HashMap<String, Object> map, CountDownLatch countDownLatch) {
        if (TextUtils.equals(baseDeviceBenefitInfo.getDeviceSn(), this.y)) {
            LogUtil.a("BenefitRedemptionDialog", "phone getCert");
            a(str, map, countDownLatch);
        } else {
            LogUtil.a("BenefitRedemptionDialog", "device getCert");
            c(baseDeviceBenefitInfo, deviceBenefitQueryParam, str, map, countDownLatch);
        }
    }

    private void c(BaseDeviceBenefitInfo baseDeviceBenefitInfo, DeviceBenefitQueryParam deviceBenefitQueryParam, String str, final HashMap<String, Object> map, final CountDownLatch countDownLatch) {
        if (baseDeviceBenefitInfo.getValidateType() == 2) {
            eer.c().e(deviceBenefitQueryParam.getDeviceInfo(), new int[]{1}, str, new IBaseResponseCallback() { // from class: fbe
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.e(map, countDownLatch, i, obj);
                }
            });
            return;
        }
        countDownLatch.countDown();
    }

    /* synthetic */ void e(HashMap map, CountDownLatch countDownLatch, int i, Object obj) {
        LogUtil.d("BenefitRedemptionDialog", "getDeviceCertificateChain objData = ", qqt.b(obj));
        a(i, obj, (HashMap<String, Object>) map);
        countDownLatch.countDown();
    }

    private void a(String str, HashMap<String, Object> map, CountDownLatch countDownLatch) {
        try {
            X509Certificate[] x509CertificateArrC = SecurityCertUtils.c(this.r, new int[]{-65535}, str.getBytes(StandardCharsets.UTF_8));
            if (x509CertificateArrC != null && x509CertificateArrC.length == 4) {
                byte[] bArrC = new byte[0];
                for (X509Certificate x509Certificate : x509CertificateArrC) {
                    bArrC = c(bArrC, x509Certificate.getEncoded());
                }
                map.put("certChain", qqt.b(Base64.b(bArrC)));
                if (this.i == f33802b.intValue()) {
                    this.af.setCertChainType("1");
                    this.af.setCertChain(qqt.b(Base64.b(bArrC)));
                }
                countDownLatch.countDown();
                return;
            }
            countDownLatch.countDown();
        } catch (NumberFormatException | CertificateEncodingException e2) {
            LogUtil.j("BenefitRedemptionDialog", e2.getMessage());
        }
    }

    private void a(int i, Object obj, HashMap<String, Object> map) {
        boolean z;
        if (i == -1 || !(((z = obj instanceof String)) || (obj instanceof List))) {
            map.put("certChain", null);
            LogUtil.j("BenefitRedemptionDialog", "getDeviceCertificateChain cert is null or error");
            return;
        }
        if (z) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("BenefitRedemptionDialog", "getDeviceCertificateChain cert is null");
                map.put("certChain", null);
                return;
            }
            map.put("certChain", qqt.b(str));
            map.put("certChainType", "1");
            if (this.i == f33802b.intValue()) {
                this.af.setCertChain(qqt.b(str));
                this.af.setCertChainType("1");
                return;
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("BenefitRedemptionDialog", "getDeviceCertificateChain cert list is null");
                map.put("certChainList", null);
                return;
            }
            map.put("certChainList", list);
            map.put("certChainType", "2");
            if (this.i == f33802b.intValue()) {
                this.af.setCertChainList((ArrayList) list);
                this.af.setCertChainType("2");
            }
        }
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private DeviceBenefitQueryParam a(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String strC = qhu.c(this.r);
        this.y = strC;
        LogUtil.a("BenefitRedemptionDialog", "deviceSn is empty :", Boolean.valueOf(TextUtils.isEmpty(strC)));
        if (TextUtils.equals(baseDeviceBenefitInfo.getDeviceSn(), this.y)) {
            LogUtil.a("BenefitRedemptionDialog", "phone getActiveParams");
            return new DeviceBenefitQueryParam.Builder().setDeviceType(PhoneInfoUtils.getDeviceModel()).setDeviceSn(this.y).setBenefitType(DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_PERF_PURCHASE).setDeviceCategory(DeviceBenefitQueryParam.DeviceCategory.DEVICE_CATEGORY_PHONE.getCategory()).setDeviceSnType(DeviceBenefitQueryParam.DeviceSnType.DEVICE_SN_TYPE_UDID.getSnType()).setNeedProductInfo(true).build();
        }
        LogUtil.a("BenefitRedemptionDialog", "device getActiveParams");
        for (DeviceBenefitQueryParam deviceBenefitQueryParam : qhu.d("BenefitRedemptionDialog", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL)) {
            if (TextUtils.equals(deviceBenefitQueryParam.getDeviceSn(), baseDeviceBenefitInfo.getDeviceSn())) {
                return deviceBenefitQueryParam;
            }
        }
        return null;
    }

    private void b(DeviceBenefitQueryParam deviceBenefitQueryParam, final BaseDeviceBenefitInfo baseDeviceBenefitInfo, HashMap<String, Object> map) {
        ((PayApi) Services.b("TradeService", PayApi.class)).deviceInboxActive(deviceBenefitQueryParam, (DeviceInboxInfo) baseDeviceBenefitInfo, map, new IBaseResponseCallback() { // from class: fbr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f33827a.d(baseDeviceBenefitInfo, i, obj);
            }
        });
    }

    /* synthetic */ void d(final BaseDeviceBenefitInfo baseDeviceBenefitInfo, final int i, Object obj) {
        if (i != 0) {
            ReleaseLogUtil.e("BenefitRedemptionDialog", "activeInboxBenefit error", Integer.valueOf(i));
            HandlerExecutor.c(new Runnable() { // from class: fbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(i, baseDeviceBenefitInfo);
                }
            });
        } else {
            r();
            faw.d(baseDeviceBenefitInfo, this.x, this.ag);
        }
    }

    private void r() {
        if (this.i == d.intValue()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fbt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33830a.h();
                }
            });
        } else if (this.i == f33801a.intValue()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fby
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.j();
                }
            });
        } else {
            LogUtil.e("BenefitRedemptionDialog", "benefitType is error benefitType is ", Integer.valueOf(this.i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j() {
        ((PayApi) Services.b("TradeService", PayApi.class)).queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: fbf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.c(i, obj);
            }
        });
    }

    /* synthetic */ void c(int i, Object obj) {
        if (i != 0 || !(obj instanceof RepeatResourceBenefitInfo)) {
            ReleaseLogUtil.e("BenefitRedemptionDialog", "handleActiveInboxSuccess get RepeatResourceBenefitInfo error", Integer.valueOf(i));
            return;
        }
        LogUtil.a("BenefitRedemptionDialog", "handleActiveInboxSuccess get RepeatResourceBenefitInfo onSuccess: result ", obj);
        b(((RepeatResourceBenefitInfo) obj).getExpireTime());
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void i() {
        this.m = false;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: fbb.3
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                LogUtil.a("BenefitRedemptionDialog", "handleActiveInboxSuccess get UserMemberInfo onSuccess: result ", obj);
                countDownLatch.countDown();
                if (obj instanceof UserMemberInfo) {
                    fbb.this.b(Long.valueOf(((UserMemberInfo) obj).getExpireTime()));
                    faw.b(fbb.this.l);
                    fbb.this.ae();
                } else {
                    LogUtil.e("BenefitRedemptionDialog", "result is not UserMemberInfo");
                    fbb.this.ac();
                }
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("BenefitRedemptionDialog", "handleActiveInboxSuccess get UserMemberInfo error", Integer.valueOf(i));
                countDownLatch.countDown();
                fbb.this.ac();
            }
        });
        try {
            if (countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                return;
            }
            LogUtil.j("BenefitRedemptionDialog", "getPurchaseResult: wait timeout 3000ms");
            ac();
        } catch (InterruptedException e2) {
            LogUtil.j("BenefitRedemptionDialog", "functionAuth: wait interrupted", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (this.m) {
            LogUtil.j("BenefitRedemptionDialog", "handleVipInfoFail: already retrying, skip");
            c(Constant.BENEFITS_PURCHASE_TAKE_EFFECT_TIME_OUT, this.l);
            d();
        } else {
            this.m = true;
            LogUtil.a("BenefitRedemptionDialog", "handleVipInfoFail: start retry get VIP info");
            ag();
        }
    }

    private void ag() {
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: fbb.2
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                LogUtil.a("BenefitRedemptionDialog", "handleActiveInboxSuccess get UserMemberInfo onSuccess: result ", obj);
                if (obj instanceof UserMemberInfo) {
                    fbb.this.b(Long.valueOf(((UserMemberInfo) obj).getExpireTime()));
                    faw.b(fbb.this.l);
                    fbb.this.ae();
                } else {
                    LogUtil.e("BenefitRedemptionDialog", "result is not UserMemberInfo");
                    fbb fbbVar = fbb.this;
                    fbbVar.c(Constant.BENEFITS_PURCHASE_TAKE_EFFECT_TIME_OUT, fbbVar.l);
                    fbb.this.d();
                }
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("BenefitRedemptionDialog", "handleActiveInboxSuccess get UserMemberInfo error", Integer.valueOf(i));
                fbb fbbVar = fbb.this;
                fbbVar.c(Constant.BENEFITS_PURCHASE_TAKE_EFFECT_TIME_OUT, fbbVar.l);
                fbb.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h() {
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: fbb.1
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                LogUtil.a("BenefitRedemptionDialog", "handleActiveInboxSuccess get UserMemberInfo onSuccess: result ", obj);
                if (obj instanceof UserMemberInfo) {
                    fbb.this.b(Long.valueOf(((UserMemberInfo) obj).getExpireTime()));
                    fbb.this.ae();
                } else {
                    LogUtil.e("BenefitRedemptionDialog", "result is not UserMemberInfo");
                }
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("BenefitRedemptionDialog", "handleActiveInboxSuccess get UserMemberInfo error", Integer.valueOf(i));
            }
        });
    }

    public void d() {
        AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&path=MemberCenter&currentBenefit=1&benefitList=%5B1%5D")).b(this.r);
        dismiss();
    }

    private void t() {
        AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&path=ExclusiveGuardService")).b(this.r);
        dismiss();
    }

    private void e(DeviceBenefitQueryParam deviceBenefitQueryParam, final BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (deviceBenefitQueryParam == null || baseDeviceBenefitInfo == null) {
            LogUtil.j("BenefitRedemptionDialog", "getDeviceBenefit activeParams or benefitInfo is null");
        } else {
            ((PayApi) Services.b("TradeService", PayApi.class)).getDeviceBenefits(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: fbj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f33819a.e(baseDeviceBenefitInfo, i, obj);
                }
            });
        }
    }

    /* synthetic */ void e(BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i, Object obj) {
        if (i != 0) {
            LogUtil.j("BenefitRedemptionDialog", "getDeviceBenefit errorCode", Integer.valueOf(i));
            return;
        }
        if (!(obj instanceof DeviceBenefits)) {
            LogUtil.j("BenefitRedemptionDialog", "getDeviceBenefit objData is error");
            return;
        }
        DeviceBenefits deviceBenefits = (DeviceBenefits) obj;
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) baseDeviceBenefitInfo;
            List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
            if (njy.e(inboxInfos)) {
                LogUtil.a("BenefitRedemptionDialog", "getDeviceBenefit deviceInboxInfos is empty");
                return;
            } else {
                d(inboxInfos, deviceInboxInfo.getDeviceInboxId());
                return;
            }
        }
        if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) baseDeviceBenefitInfo;
            List<DevicePerfPurchaseInfo> perfPurchaseInfos = deviceBenefits.getPerfPurchaseInfos();
            if (njy.e(perfPurchaseInfos)) {
                LogUtil.a("BenefitRedemptionDialog", "getDeviceBenefit perfPurchaseInfos is empty");
            } else {
                d(perfPurchaseInfos, devicePerfPurchaseInfo.getDevicePerfPurchaseId());
            }
        }
    }

    private <T> void d(List<T> list, String str) {
        BaseDeviceBenefitInfo baseDeviceBenefitInfo;
        String devicePerfPurchaseId;
        for (T t : list) {
            if (t != null) {
                if (t instanceof DeviceInboxInfo) {
                    DeviceInboxInfo deviceInboxInfo = (DeviceInboxInfo) t;
                    devicePerfPurchaseId = deviceInboxInfo.getDeviceInboxId();
                    baseDeviceBenefitInfo = deviceInboxInfo;
                } else if (!(t instanceof DevicePerfPurchaseInfo)) {
                    baseDeviceBenefitInfo = null;
                    devicePerfPurchaseId = "";
                } else {
                    DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) t;
                    devicePerfPurchaseId = devicePerfPurchaseInfo.getDevicePerfPurchaseId();
                    baseDeviceBenefitInfo = devicePerfPurchaseInfo;
                }
                if (baseDeviceBenefitInfo == null) {
                    LogUtil.j("BenefitRedemptionDialog", "benefitInfo is null");
                    return;
                } else if (TextUtils.equals(str, devicePerfPurchaseId)) {
                    if (baseDeviceBenefitInfo.getActiveStatus() == 2) {
                        LogUtil.a("BenefitRedemptionDialog", "benefitInfo has active");
                        x();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final Long l) {
        String strA;
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: fbm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33823a.b(l);
                }
            });
            return;
        }
        String strD = DateFormatUtil.d(l.longValue(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        if (this.i == d.intValue()) {
            strA = qre.a(R.string.IDS_benefit_active_success_vip, strD);
        } else if (this.i == f33801a.intValue()) {
            strA = qre.a(R.string.IDS_benefit_active_success_exclusive, this.h, strD);
        } else if (this.i != f33802b.intValue()) {
            strA = "";
        } else {
            strA = qre.a(R.string.IDS_purchase_benefit_active_success_vip, strD);
        }
        qpx.e(this.r, strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void c(final int i, final BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        String strF;
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: fbv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33834b.c(i, baseDeviceBenefitInfo);
                }
            });
            return;
        }
        if (this.r == null) {
            LogUtil.j("BenefitRedemptionDialog", "handleActiveInboxFail context is null");
            return;
        }
        if (i == -10086) {
            strF = qre.f(R.string.IDS_purchase_benefit_active_delay_toast);
        } else if (i != -130) {
            if (i == -120) {
                strF = qre.a(R.string.IDS_more_benefits_device_toast, this.l.getDeviceName());
            } else if (i == -110) {
                strF = qre.f(R.string.IDS_device_wifi_not_network);
            } else if (i == -100) {
                strF = qre.a(R.string.IDS_benefit_active_fail_not_connect_device, baseDeviceBenefitInfo.getDeviceName());
            } else if (i == -2) {
                strF = qre.f(com.huawei.ui.commonui.R.string.IDS_benefit_active_outtime);
            } else if (i == 3040022) {
                strF = qre.a(com.huawei.ui.commonui.R.string.IDS_member_period_exceed_limit, qre.e(R.plurals.IDS_benefit_year, 10, 10));
            } else if (i == 3130012) {
                strF = qre.f(com.huawei.ui.commonui.R.string.IDS_benefits_claimed);
            } else if (i == 3130030) {
                strF = qre.f(com.huawei.ui.commonui.R.string.IDS_activation_exceeds_limit);
            } else {
                strF = qre.f(com.huawei.ui.commonui.R.string.IDS_membership_gift_card_received_failed);
            }
        } else if (this.i == d.intValue() || this.i == f33801a.intValue()) {
            strF = qre.f(R.string.IDS_membership_gift_card_received_failed);
        } else {
            strF = qre.f(R.string.IDS_update_server_bussy);
        }
        qpx.e(this.r, strF);
    }

    public void c(int i) {
        LogUtil.a("BenefitRedemptionDialog", "handlePurchaseResult intExtra is ", Integer.valueOf(i));
        if (i == 0) {
            x();
            ThreadPoolManager.c().execute(new Runnable() { // from class: fbn
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.i();
                }
            });
            faw.d(this.l, this.x, this.ag);
        } else if (i == 3130012 || i == 3130014 || i == 3040022 || i == 3130030) {
            ReleaseLogUtil.e("BenefitRedemptionDialog", "handlePurchaseResult intExtra is ", Integer.valueOf(i));
            c(i, this.l);
        }
    }

    private void x() {
        HandlerExecutor.c(new Runnable() { // from class: fbc
            @Override // java.lang.Runnable
            public final void run() {
                this.e.f();
            }
        });
    }

    /* synthetic */ void f() {
        this.t.setText(R.string.IDS_benefit_already_active);
        this.t.setClickable(false);
        this.t.setBackgroundResource(R.drawable.btn_rounded_disable);
        this.t.setTextColor(Color.parseColor("#66F2C261"));
    }

    private static String d(String str, String str2) {
        return com.huawei.hwcommonmodel.application.BaseApplication.getContext().getResources().getString(R.string.IDS_currency_money, qhu.d(str), str2);
    }

    static class b extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33811a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f33812c;
        private int d;
        private BaseDeviceBenefitInfo e;

        public b(Context context, int i, BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i2) {
            this.f33811a = i;
            this.f33812c = context;
            this.e = baseDeviceBenefitInfo;
            this.d = i2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            lsy.a(new Runnable() { // from class: fbw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33836a.e();
                }
            });
        }

        /* synthetic */ void e() {
            String strC;
            if (this.f33811a != fbb.g.intValue()) {
                if (this.f33811a != fbb.e.intValue()) {
                    if (this.f33811a == fbb.f33803c.intValue()) {
                        strC = fca.c();
                        faw.c(this.e, "auto_renewal", this.d);
                    } else {
                        LogUtil.j("BenefitRedemptionDialog", "agreementType is error");
                        strC = "";
                    }
                } else {
                    strC = fca.e();
                    faw.c(this.e, "pingan_services", this.d);
                }
            } else {
                strC = fca.b();
                faw.c(this.e, "member_services", this.d);
            }
            c(this.f33812c, strC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Context context, final String str) {
            if (!HandlerExecutor.d()) {
                HandlerExecutor.c(new Runnable() { // from class: fbb.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b bVar = b.this;
                        bVar.c(bVar.f33812c, str);
                    }
                });
                return;
            }
            LogUtil.a("BenefitRedemptionDialog", "jump ", " url: ", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (context == null) {
                LogUtil.j("BenefitRedemptionDialog", "context error");
            } else {
                ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(str);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        aa();
        af();
    }

    private void af() {
        LogUtil.j("BenefitRedemptionDialog", "setCenterCardLayout() ");
        i(this.l);
        Window window = getWindow();
        if (window == null || this.r == null) {
            LogUtil.j("BenefitRedemptionDialog", "setCenterCardLayout() window or mContext is null.");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (qrs.af(this.r)) {
            int i = qrs.i(this.r);
            attributes.height = (int) (((double) Math.min(i, qrs.g(this.r))) * 0.9d);
            attributes.width = qre.b(R.dimen.health_common_480dp);
            if (i <= attributes.width) {
                attributes.width = i - (qre.b(R.dimen.health_common_32dp) * 2);
            }
            attributes.gravity = 17;
        } else {
            attributes.height = -1;
            attributes.width = -1;
            attributes.gravity = 80;
        }
        window.setAttributes(attributes);
        if (this.mView == null) {
            LogUtil.j("BenefitRedemptionDialog", "setCenterCardLayout() mView is null.");
            return;
        }
        if (this.mView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mView.getLayoutParams();
            if (qrs.af(this.r)) {
                layoutParams.topMargin = qre.b(R.dimen.health_common_0dp);
            } else {
                layoutParams.topMargin = qre.b(R.dimen.health_common_8dp);
            }
            this.mView.setLayoutParams(layoutParams);
        }
    }
}
