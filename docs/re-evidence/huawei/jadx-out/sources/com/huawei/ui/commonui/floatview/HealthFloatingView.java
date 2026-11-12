package com.huawei.ui.commonui.floatview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.lmf;
import defpackage.qkz;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qso;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class HealthFloatingView extends FloatingSidingView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f23512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23514c;
    private String d;
    private boolean e;
    private String f;
    private final ImageView g;
    private int h;
    private OnCompleteListener i;
    private String j;
    private boolean n;
    private long o;

    public HealthFloatingView(Context context) {
        this(context, R.layout.commonui_custom_floating_view);
    }

    public HealthFloatingView(Context context, int i) {
        super(context, null);
        this.e = false;
        this.f23514c = false;
        this.h = 0;
        this.o = -1L;
        this.i = new OnCompleteListener() { // from class: com.huawei.ui.commonui.floatview.HealthFloatingView.5
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task task) {
                if (HealthFloatingView.this.e) {
                    HealthFloatingView.this.setVisibility(8);
                } else {
                    HealthFloatingView.this.setVisibility(0);
                }
            }
        };
        inflate(context, i, this);
        this.f23513b = context;
        this.g = (ImageView) findViewById(R.id.icon);
        this.f23512a = (ImageView) findViewById(R.id.close);
        i();
        setCompleteListener(this.i);
    }

    public void setPositionId(int i) {
        this.h = i;
    }

    public void setResourceId(String str) {
        this.f = str;
    }

    public void setResourceName(String str) {
        this.j = str;
    }

    public void setAlgId(String str) {
        this.d = str;
    }

    public void setSmartRecommend(boolean z) {
        this.n = z;
    }

    public boolean f() {
        return this.e;
    }

    public void setIconImage(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    public void setIconImage(Drawable drawable, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2) {
        this.f23512a.setLayoutParams(layoutParams2);
        this.g.setLayoutParams(layoutParams);
        this.g.setImageDrawable(drawable);
    }

    public void setIconImage(Bitmap bitmap) {
        this.g.setImageBitmap(bitmap);
    }

    public void setIconImage(String str) {
        LogUtil.a("HealthFloatingView", "setIconImage imgUrl=", str);
        if (m()) {
            return;
        }
        qqf.c(str, new RequestOptions(), new RequestListener<Drawable>() { // from class: com.huawei.ui.commonui.floatview.HealthFloatingView.1
            @Override // com.bumptech.glide.request.RequestListener
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                LogUtil.a("HealthFloatingView", "setIconImage onResourceReady resource=", drawable);
                HealthFloatingView.this.f23512a.setVisibility(0);
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                LogUtil.a("HealthFloatingView", "setIconImage onLoadFailed ", ExceptionUtils.c(glideException));
                return false;
            }
        }, this.g, false);
    }

    private boolean m() {
        Context context = this.f23513b;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing() || ((Activity) this.f23513b).isDestroyed();
        }
        return false;
    }

    private void i() {
        this.f23512a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.floatview.HealthFloatingView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TextUtils.isEmpty(HealthFloatingView.this.f) && HealthFloatingView.this.h != 0 && !TextUtils.isEmpty(HealthFloatingView.this.f)) {
                    HealthFloatingView.this.o();
                }
                HealthFloatingView.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        HashMap map = new HashMap();
        map.put("resourceId", this.f);
        map.put("resourcePositionId", Integer.valueOf(this.h));
        map.put("event", 4);
        map.put("resourceName", this.j);
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.o));
        map.put("algId", this.d);
        map.put("smartRecommend", Boolean.valueOf(this.n));
        map.put("pullOrder", 1);
        lmf.d().c(this.f23513b.getApplicationContext(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    private boolean e(Activity activity) {
        return e(c(activity));
    }

    private boolean e(FrameLayout frameLayout) {
        if (frameLayout != null && a(frameLayout)) {
            LogUtil.a("HealthFloatingView", "decorView EXSIT.");
            frameLayout.addView(this);
            this.f23514c = true;
        }
        return this.f23514c;
    }

    private boolean a(FrameLayout frameLayout) {
        int i = this.h;
        if (i == 0) {
            LogUtil.a("HealthFloatingView", "mPositionId = 0.");
            return true;
        }
        LogUtil.a("HealthFloatingView", "mPositionId = ", Integer.valueOf(i));
        View viewFindViewById = frameLayout.findViewById(this.h);
        HealthFloatingView healthFloatingView = viewFindViewById instanceof HealthFloatingView ? (HealthFloatingView) viewFindViewById : null;
        if (healthFloatingView == null) {
            LogUtil.a("HealthFloatingView", "floatingView == null");
        } else {
            LogUtil.a("HealthFloatingView", "floatingView exsit. positionId: ", Integer.valueOf(this.h));
        }
        return healthFloatingView == null;
    }

    private FrameLayout c(Activity activity) {
        return (FrameLayout) activity.getWindow().getDecorView().findViewById(android.R.id.content);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("HealthFloatingView", "onConfig");
        super.onConfigurationChanged(configuration);
        l();
    }

    private FrameLayout.LayoutParams getParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, (int) this.f23513b.getResources().getDimension(R.dimen.defaultPaddingEnd), layoutParams.bottomMargin);
        return layoutParams;
    }

    public void d() {
        LogUtil.a("HealthFloatingView", "add box: ", Integer.valueOf(this.h));
        if (this.f23514c) {
            LogUtil.a("HealthFloatingView", "floatingview mIsAdd. no repeat.");
        } else {
            if (m()) {
                return;
            }
            e(this.f23513b);
        }
    }

    public void b(FrameLayout.LayoutParams layoutParams) {
        LogUtil.a("HealthFloatingView", "add box with layoutParams");
        if (this.f23514c || m()) {
            return;
        }
        setLayoutParams(layoutParams);
        e((Activity) this.f23513b);
    }

    private void e(Context context) {
        LogUtil.a("HealthFloatingView", "addFloatingView: ", Integer.valueOf(this.h));
        l();
        if (!e((Activity) context)) {
            LogUtil.a("HealthFloatingView", "floating view already attached: ", Integer.valueOf(this.h));
        } else {
            qkz.c(this.h, this);
            qkz.c(this.h);
        }
    }

    private void l() {
        setLayoutParams(getParams());
        float fA = qqp.a(this.f23513b, getResources().getConfiguration().screenHeightDp - 280);
        LogUtil.a("HealthFloatingView", "floatY: ", Float.valueOf(fA));
        setY(fA);
    }

    public void g() {
        if (!m() && this.f23514c) {
            qkz.b(this.h);
            b(this.f23513b);
        }
    }

    private void b(Context context) {
        FrameLayout frameLayoutC = c((Activity) context);
        if (frameLayoutC != null) {
            frameLayoutC.removeView(this);
        }
    }

    public void setlistener(View.OnClickListener onClickListener) {
        setClickListener(onClickListener);
    }

    public void setCloseBtnlistener(View.OnClickListener onClickListener) {
        this.f23512a.setOnClickListener(onClickListener);
    }

    public void c() {
        LogUtil.a("HealthFloatingView", "hideView: ", Integer.valueOf(this.h));
        if (!this.e) {
            e();
        }
        qso.d().a((View) this, true);
        this.e = true;
    }

    public void h() {
        LogUtil.a("HealthFloatingView", "showView: ", Integer.valueOf(this.h));
        if (this.e) {
            setVisibility(0);
            a();
        }
        qso.d().a((View) this, true);
        this.e = false;
    }

    public void c(boolean z) {
        if (z) {
            this.f23512a.setVisibility(0);
        } else {
            this.f23512a.setVisibility(8);
        }
    }

    public void j() {
        if (this.e) {
            setVisibility(0);
        }
        this.e = false;
    }

    public void b() {
        if (!this.e) {
            setVisibility(8);
        }
        this.e = true;
    }
}
