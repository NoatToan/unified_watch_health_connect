package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.overlay.OverlayTemplate;
import com.huawei.health.marketing.datatype.overlay.SpEffect;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fxl;
import defpackage.fxq;
import defpackage.gbo;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class OverlayLayout extends FrameLayout implements ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResourceBriefInfo f8388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, String> f8389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f8390c;
    private int[] d;
    private int e;
    private OverlayTemplate f;
    private c i;

    public OverlayLayout(Context context) {
        super(context);
        this.d = new int[2];
    }

    public void a(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        if (!(baseTemplate instanceof OverlayTemplate)) {
            LogUtil.j("OverlayLayout", "template is not OverlayTemplate");
            setVisibility(8);
            return;
        }
        this.e = i;
        this.f = (OverlayTemplate) baseTemplate;
        this.f8388a = resourceBriefInfo;
        LogUtil.a("OverlayLayout", "template:", baseTemplate.toString());
        e();
        if (this.i == null) {
            this.i = new c(this);
        }
        qsp.a(this.f8390c, this.i);
    }

    private void e() {
        HealthImageView healthImageView = (HealthImageView) LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.layout_overlay, this).findViewById(R.id.overlay_image);
        this.f8390c = healthImageView;
        healthImageView.setVisibility(8);
        this.f8389b = fxq.b(this.f.getPictureList());
        setBgImage(qrs.af(getContext()));
        this.f8390c.setOnClickListener(new View.OnClickListener() { // from class: fzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
        b();
    }

    public /* synthetic */ void a(View view) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.j("OverlayLayout", "overlay click network not connected");
            qpx.e(getContext(), R.string.IDS_network_connect_error);
            return;
        }
        if (this.f.getInteractiveEffect() == 0) {
            fxq.d(this.f.getLinkValue(), this.e, this.f8388a);
        } else if (this.f.getInteractiveEffect() == 2) {
            d(fxq.b(this.f.getSpEffectId(), this.f.getSpEffectMap()));
        }
        setBiEvent(2);
        c();
    }

    private void b() {
        if (this.f.getInteractiveEffect() == 2) {
            fxq.d(fxq.b(this.f.getSpEffectId(), this.f.getSpEffectMap()), (ResponseCallback<Boolean>) new ResponseCallback() { // from class: gaa
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f34803a.e(i, (Boolean) obj);
                }
            });
        }
    }

    public /* synthetic */ void e(int i, final Boolean bool) {
        HandlerExecutor.b(new Runnable() { // from class: fzs
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(bool);
            }
        });
    }

    public /* synthetic */ void c(Boolean bool) {
        this.f8390c.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    private void setBgImage(boolean z) {
        final String str;
        if (CollectionUtils.c(this.f8389b)) {
            LogUtil.j("OverlayLayout", "setBgImage mImgUrls is empty");
            setVisibility(8);
            return;
        }
        if (!z) {
            str = "";
        } else if (this.f8389b.containsKey(1)) {
            str = this.f8389b.get(1);
        } else {
            str = this.f8389b.get(2);
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f8389b.get(0);
        }
        LogUtil.a("OverlayLayout", "setBgImage isWidthScreen：", Boolean.valueOf(z), "  imgUrl is:", str);
        if (TextUtils.isEmpty(str)) {
            setVisibility(8);
        } else if (str.endsWith(MetaCreativeType.GIF)) {
            qqf.a(str, new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.RESOURCE).fitCenter(), this.f8390c, (Drawable) null, new RequestListener<GifDrawable>() { // from class: com.huawei.health.marketing.views.OverlayLayout.1
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<GifDrawable> target, boolean z2) {
                    LogUtil.e("OverlayLayout", "setBgImage resource load failed, exception = ", ExceptionUtils.c(glideException));
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public boolean onResourceReady(GifDrawable gifDrawable, Object obj, Target<GifDrawable> target, DataSource dataSource, boolean z2) {
                    LogUtil.a("OverlayLayout", "setBgImage resource ready for resource = ", gifDrawable, ", url = ", str, ", isFirstResource = ", Boolean.valueOf(z2));
                    return false;
                }
            });
        } else {
            qqf.a(str, new RequestOptions().fitCenter(), this.f8390c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LogUtil.a("OverlayLayout", "onDetachedFromWindow");
        qsp.c(this.f8390c, this.i);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.f8388a == null || !resourceBriefInfo.getResourceId().equals(this.f8388a.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.f8388a;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        int[] iArr = this.d;
        if (i == iArr[0] && i2 == iArr[1]) {
            return;
        }
        setBgImage(new HealthColumnSystem(getContext(), 1).j() >= 8);
        int[] iArr2 = this.d;
        iArr2[0] = i;
        iArr2[1] = i2;
    }

    private void d(SpEffect spEffect) {
        if (spEffect == null) {
            LogUtil.j("OverlayLayout", "showOverlayAnimate spEffect is null");
            return;
        }
        gbo gboVar = new gbo(getContext(), spEffect);
        gboVar.b(this.e, this.f8388a, this.f);
        gboVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiEvent(int i) {
        if (this.f8388a == null) {
            LogUtil.a("OverlayLayout", "resourceBriefInfo is null. return.");
        } else {
            LogUtil.a("OverlayLayout", "setBiEvent PositionId: ", Integer.valueOf(this.e));
            MarketingBiUtils.a(i, this.e, this.f8388a, null);
        }
    }

    private void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fzy
            @Override // java.lang.Runnable
            public final void run() {
                this.f34801c.d();
            }
        });
    }

    public /* synthetic */ void d() {
        ResourceBriefInfo resourceBriefInfo = this.f8388a;
        if (resourceBriefInfo == null || resourceBriefInfo.getMarketingRule() == null) {
            LogUtil.j("OverlayLayout", "mBriefInfo is null or no rule");
        } else {
            if (this.f8388a.getMarketingRule().getTriggerCycle() == null) {
                LogUtil.j("OverlayLayout", "cycleRuleBase is null");
                return;
            }
            LogUtil.a("OverlayLayout", "saveClickEventToDB ResourceName :", this.f8388a.getResourceName());
            fxl.b(this.e, 1, this.f8388a);
            HandlerExecutor.b(new Runnable() { // from class: fzv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34799a.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        setVisibility(8);
        this.f8389b.clear();
    }

    static class c implements ViewTreeObserver.OnScrollChangedListener {
        private final WeakReference<OverlayLayout> d;

        public c(OverlayLayout overlayLayout) {
            this.d = new WeakReference<>(overlayLayout);
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            OverlayLayout overlayLayout = this.d.get();
            if (overlayLayout != null) {
                if (MarketingBiUtils.c(overlayLayout.f8390c)) {
                    overlayLayout.setBiEvent(1);
                    qsp.c(overlayLayout.f8390c, this);
                    return;
                }
                return;
            }
            LogUtil.j("OverlayLayout", "onScrollChanged layout is null");
        }
    }
}
