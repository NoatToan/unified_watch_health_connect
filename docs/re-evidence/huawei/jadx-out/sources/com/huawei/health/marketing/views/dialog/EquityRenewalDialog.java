package com.huawei.health.marketing.views.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.media3.common.C;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.PopUpMemberTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxl;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes29.dex */
public class EquityRenewalDialog extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f8447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f8448c;
    private Context d;
    private Handler e;
    private PopUpMemberTemplate f;
    private long g;
    private RepeatResourceBenefitInfo h;
    private int i;
    private HealthButton j;
    private HealthTextView m;
    private ImageView n;

    public EquityRenewalDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.g = 0L;
        this.i = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.d = context;
    }

    public void b(int i, ResourceBriefInfo resourceBriefInfo, PopUpMemberTemplate popUpMemberTemplate) {
        LogUtil.a("EquityRenewalDialog", "payApi is null.");
        this.f8448c = resourceBriefInfo;
        this.i = i;
        this.f = popUpMemberTemplate;
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.huawei.health.servicesui.R.layout.commonui_dialog_equity_renewal, (ViewGroup) null);
        setContentView(viewInflate);
        this.n = (ImageView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_top_img);
        this.m = (HealthTextView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_title);
        this.f8447b = (HealthTextView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_description);
        this.j = (HealthButton) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_submit);
        this.f8446a = (ImageView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_close_dialog);
        qqf.d(popUpMemberTemplate.getPicture(), this.n);
        this.j.setText(popUpMemberTemplate.getButtonName());
        this.j.setOnClickListener(this);
        this.f8446a.setOnClickListener(this);
        c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MarketRouterApi marketRouterApi;
        if (qrs.e(view)) {
            return;
        }
        int id = view.getId();
        LogUtil.a("EquityRenewalDialog", "viewId", Integer.valueOf(id));
        if (id == com.huawei.health.servicesui.R.id.renewal_submit && (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) != null) {
            LogUtil.a("EquityRenewalDialog", "mTemplate.getLinkValue() :", this.f.getLinkValue());
            marketRouterApi.router(this.f.getLinkValue());
            MarketingBiUtils.c(this.i, this.f8448c, this.g);
        }
        dismiss();
        MarketingBiUtils.b(this.i, this.f8448c, this.g);
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (!a() || isShowing()) {
            return;
        }
        super.show();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        this.g = System.currentTimeMillis();
        MarketingBiUtils.e(this.i, this.f8448c);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    private boolean a() {
        Context context = this.d;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    private void c() {
        PayApi payApi = null;
        for (int i = 0; payApi == null && i < 2; i++) {
            payApi = (PayApi) Services.d("TradeService", PayApi.class);
        }
        if (payApi == null) {
            LogUtil.a("EquityRenewalDialog", "payApi is null.");
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: gaz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f34844a.a(i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i == 0 && (obj instanceof RepeatResourceBenefitInfo)) {
            this.h = (RepeatResourceBenefitInfo) obj;
            LogUtil.a("EquityRenewalDialog", "hasEquity");
            f();
        }
    }

    private void f() {
        LogUtil.a("EquityRenewalDialog", "MarketingResourceSetting-Drawable:3");
        this.e.post(new Runnable() { // from class: gbb
            @Override // java.lang.Runnable
            public final void run() {
                this.f34847a.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e() {
        LogUtil.a("EquityRenewalDialog", " setPopUpVipTemplate showDialog .");
        RepeatResourceBenefitInfo repeatResourceBenefitInfo = this.h;
        boolean z = this.f8448c.getContentType() == 68;
        long jLongValue = repeatResourceBenefitInfo.getExpireTime().longValue();
        long nowTime = repeatResourceBenefitInfo.getNowTime();
        if (!z || jLongValue - nowTime > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            long jC = fxl.c(repeatResourceBenefitInfo.getNowTime(), repeatResourceBenefitInfo.getExpireTime().longValue());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f.getTheme());
            if (!TextUtils.isEmpty(this.f.getThemePost())) {
                stringBuffer.append(jC);
                stringBuffer.append(this.f.getThemePost());
            }
            this.m.setText(stringBuffer.toString());
            stringBuffer.setLength(0);
            if (!TextUtils.isEmpty(this.f.getDescription()) || !TextUtils.isEmpty(this.f.getDescriptionPost())) {
                String description = this.f.getDescription();
                if (description == null) {
                    description = "";
                }
                stringBuffer.append(description);
                stringBuffer.append(DateFormatUtil.d(repeatResourceBenefitInfo.getExpireTime().longValue(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD_POINT));
                String descriptionPost = this.f.getDescriptionPost();
                stringBuffer.append(descriptionPost != null ? descriptionPost : "");
                this.f8447b.setText(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
            if (!a() || isShowing()) {
                return;
            }
            LogUtil.a("EquityRenewalDialog", " setPopUpVipTemplate show.");
            show();
        }
    }

    private void d() {
        this.m = null;
        this.f8447b = null;
        this.j = null;
        this.n = null;
        this.f8446a = null;
        this.f8448c = null;
        this.f = null;
    }
}
