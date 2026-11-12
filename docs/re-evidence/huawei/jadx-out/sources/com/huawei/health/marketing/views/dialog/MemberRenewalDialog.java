package com.huawei.health.marketing.views.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.PopUpMemberTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.Services;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes29.dex */
public class MemberRenewalDialog extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile List<WeakReference<MemberRenewalDialog>> f8463a = new ArrayList(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResourceBriefInfo f8464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicInteger f8465c;
    private HealthTextView d;
    private Context e;
    private long f;
    private HealthButton g;
    private UserMemberInfo h;
    private int i;
    private Handler j;
    private HealthTextView k;
    private ImageView m;
    private PopUpMemberTemplate o;

    public MemberRenewalDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.f = 0L;
        this.i = 0;
        this.f8465c = new AtomicInteger(0);
        this.j = new Handler(Looper.getMainLooper());
        this.e = context;
        a();
    }

    public void a(int i, ResourceBriefInfo resourceBriefInfo, PopUpMemberTemplate popUpMemberTemplate) {
        this.f8464b = resourceBriefInfo;
        this.i = i;
        this.o = popUpMemberTemplate;
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.huawei.health.servicesui.R.layout.commonui_dialog_vip_renewal, (ViewGroup) null);
        setContentView(viewInflate);
        this.m = (ImageView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_top_img);
        this.k = (HealthTextView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_title);
        this.d = (HealthTextView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_description);
        this.g = (HealthButton) viewInflate.findViewById(com.huawei.health.servicesui.R.id.renewal_submit);
        qqf.c(getContext(), popUpMemberTemplate.getPicture(), new RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC), new e(this));
        this.g.setText(popUpMemberTemplate.getButtonName());
        this.g.setOnClickListener(this);
        b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MarketRouterApi marketRouterApi;
        if (qrs.e(view)) {
            return;
        }
        if (view.getId() == com.huawei.health.servicesui.R.id.renewal_submit && (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) != null) {
            marketRouterApi.router(this.o.getLinkValue());
            MarketingBiUtils.c(this.i, this.f8464b, this.f);
        }
        dismiss();
        MarketingBiUtils.b(this.i, this.f8464b, this.f);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (!d() || isShowing()) {
            return;
        }
        setCanceledOnTouchOutside(true);
        super.show();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f = System.currentTimeMillis();
        MarketingBiUtils.e(this.i, this.f8464b);
    }

    private void a() {
        List<WeakReference<MemberRenewalDialog>> list = f8463a;
        if (njy.b(list)) {
            Iterator<WeakReference<MemberRenewalDialog>> it = list.iterator();
            while (it.hasNext()) {
                MemberRenewalDialog memberRenewalDialog = it.next().get();
                boolean z = memberRenewalDialog != null && memberRenewalDialog.isShowing();
                if (z || memberRenewalDialog == null) {
                    it.remove();
                }
                if (z) {
                    memberRenewalDialog.dismiss();
                }
            }
        }
        f8463a.add(new WeakReference<>(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        List<WeakReference<MemberRenewalDialog>> list = f8463a;
        if (njy.b(list)) {
            Iterator<WeakReference<MemberRenewalDialog>> it = list.iterator();
            while (it.hasNext()) {
                MemberRenewalDialog memberRenewalDialog = it.next().get();
                if (memberRenewalDialog == this || memberRenewalDialog == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        Context context = this.e;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    private void b() {
        VipApi vipApi = null;
        for (int i = 0; vipApi == null && i < 2; i++) {
            vipApi = (VipApi) Services.d("vip", VipApi.class);
        }
        if (vipApi == null) {
            LogUtil.a("MemeberRenewalDialog", " setPopUpVipTemplate instantiation VipApi failed .");
        } else {
            vipApi.getVipInfo(new c(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f8465c.incrementAndGet();
        LogUtil.a("MemeberRenewalDialog", "MarketingResourceSetting-Drawable:3");
        if (this.f8465c.get() >= 2) {
            LogUtil.a("MemeberRenewalDialog", "MarketingResourceSetting-Drawable:4");
            this.j.post(new Runnable() { // from class: gbl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34863b.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e() {
        LogUtil.a("MemeberRenewalDialog", " setPopUpVipTemplate showDialog .");
        UserMemberInfo userMemberInfo = this.h;
        boolean z = this.f8464b.getContentType() == 68;
        long expireTime = userMemberInfo.getExpireTime();
        long nowTime = userMemberInfo.getNowTime();
        if (!z || expireTime - nowTime > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            long jC = fxl.c(userMemberInfo.getNowTime(), userMemberInfo.getExpireTime());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.o.getTheme());
            if (!TextUtils.isEmpty(this.o.getThemePost())) {
                stringBuffer.append(jC);
                stringBuffer.append(this.o.getThemePost());
            }
            this.k.setText(stringBuffer.toString());
            stringBuffer.setLength(0);
            if (!TextUtils.isEmpty(this.o.getDescription()) || !TextUtils.isEmpty(this.o.getDescriptionPost())) {
                String description = this.o.getDescription();
                if (description == null) {
                    description = "";
                }
                stringBuffer.append(description);
                stringBuffer.append(DateFormatUtil.d(userMemberInfo.getExpireTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MINUTE));
                String descriptionPost = this.o.getDescriptionPost();
                stringBuffer.append(descriptionPost != null ? descriptionPost : "");
                this.d.setText(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
            if (!d() || isShowing()) {
                return;
            }
            LogUtil.a("MemeberRenewalDialog", " setPopUpVipTemplate show.");
            show();
        }
    }

    static final class c implements VipCallback {
        private final SoftReference<MemberRenewalDialog> e;

        c(MemberRenewalDialog memberRenewalDialog) {
            this.e = new SoftReference<>(memberRenewalDialog);
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            MemberRenewalDialog memberRenewalDialog = this.e.get();
            LogUtil.a("MemeberRenewalDialog", " MemberVipCallback getVipInfo successed.");
            if (memberRenewalDialog != null && memberRenewalDialog.d() && (obj instanceof UserMemberInfo)) {
                LogUtil.a("MemeberRenewalDialog", "MarketingResourceSetting-Drawable:2");
                memberRenewalDialog.h = (UserMemberInfo) obj;
                memberRenewalDialog.j();
            }
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
            LogUtil.a("MemeberRenewalDialog", " MemberVipCallback getVipInfo failed . Then errCode = ", Integer.valueOf(i));
        }
    }

    static class e implements RequestListener<Drawable> {
        private final SoftReference<MemberRenewalDialog> d;

        e(MemberRenewalDialog memberRenewalDialog) {
            this.d = new SoftReference<>(memberRenewalDialog);
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            LogUtil.a("MemeberRenewalDialog", "MarketingResourceSetting-Drawable: failed");
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
            MemberRenewalDialog memberRenewalDialog = this.d.get();
            LogUtil.a("MemeberRenewalDialog", "MarketingResourceSetting-Drawable:", Boolean.valueOf(drawable != null));
            if (memberRenewalDialog != null && memberRenewalDialog.d() && memberRenewalDialog.o != null) {
                LogUtil.a("MemeberRenewalDialog", "MarketingResourceSetting-Drawable:1");
                qqf.e(memberRenewalDialog.o.getPicture(), memberRenewalDialog.m);
                memberRenewalDialog.j();
            }
            return false;
        }
    }
}
