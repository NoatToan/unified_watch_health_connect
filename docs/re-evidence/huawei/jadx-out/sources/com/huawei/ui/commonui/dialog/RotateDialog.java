package com.huawei.ui.commonui.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.RotateDialog;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class RotateDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f23469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnVisibleListenter f23470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23471c;
    private ImageView d;
    private final Context e;
    private LinearLayout f;
    private String g;
    private String h;
    private int i;
    private ImageView j;
    private View k;
    private boolean l;
    private long m;

    public interface OnVisibleListenter {
        void onVisible(boolean z, View view);
    }

    public RotateDialog(Context context) {
        super(context, R.style.CustomDialog, 0);
        this.i = 0;
        this.m = -1L;
        this.e = context;
        setCancelable(false);
        a();
    }

    public void b(final String str) {
        LogUtil.a("RotateDialog", "loadBackground start");
        if (d() || TextUtils.isEmpty(str)) {
            LogUtil.j("RotateDialog", "loadBackground activity is destoried or imgUrl is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46380c.c(str);
                }
            });
            LogUtil.a("RotateDialog", "loadBackground end");
        }
    }

    public /* synthetic */ void c(final String str) {
        if (d()) {
            LogUtil.j("RotateDialog", "loadBackground activity is destoried");
            return;
        }
        Drawable drawableB = qqf.b(BaseApplication.getContext(), str);
        LogUtil.a("RotateDialog", "loadBackground drawable is null ? ", Boolean.valueOf(this.f23469a == null));
        b(drawableB);
        HandlerExecutor.b(new Runnable() { // from class: qkk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        Context context = this.e;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing() || ((Activity) this.e).isDestroyed();
        }
        return false;
    }

    public void b(int i) {
        this.i = i;
    }

    public void e(String str) {
        this.h = str;
    }

    public void g(String str) {
        this.g = str;
    }

    public void d(String str) {
        this.f23471c = str;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void d(final View.OnClickListener onClickListener) {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: qkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(onClickListener, view);
            }
        });
    }

    public /* synthetic */ void d(View.OnClickListener onClickListener, View view) {
        e(2);
        onClickListener.onClick(view);
    }

    private void a() {
        View viewInflate = ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R.layout.commonui_dialog_rotate, (ViewGroup) null);
        this.k = viewInflate;
        this.f = (LinearLayout) viewInflate.findViewById(R.id.rotate_card_dialog);
        this.j = (ImageView) this.k.findViewById(R.id.rotate_input_image);
        ImageView imageView = (ImageView) this.k.findViewById(R.id.rotate_card_cancel_dialog);
        this.d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: qkh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        setContentView(this.k);
    }

    public /* synthetic */ void e(View view) {
        if (!TextUtils.isEmpty(this.h) && this.i != 0 && !TextUtils.isEmpty(this.g)) {
            e(4);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        HashMap map = new HashMap();
        map.put("resourceId", this.h);
        map.put("resourcePositionId", Integer.valueOf(this.i));
        map.put("resourceName", this.g);
        map.put("event", Integer.valueOf(i));
        if (i != 1) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.m));
        }
        map.put("algId", this.f23471c);
        map.put("smartRecommend", Boolean.valueOf(this.l));
        map.put("pullOrder", 1);
        lmf.d().c(this.e.getApplicationContext(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (d() || isShowing()) {
            return;
        }
        super.show();
        LogUtil.a("MarketingResourceSetting", "dialog.setBackground: dialog showed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f, "rotationY", 280.0f, 360.0f);
        long j = i;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f, "alpha", 0.1f, 1.0f);
        objectAnimatorOfFloat2.setStartDelay(50L);
        objectAnimatorOfFloat2.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f, "scaleY", 0.3f, 1.0f);
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f, "scaleX", 0.3f, 1.0f);
        objectAnimatorOfFloat3.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        animatorSet.setStartDelay(500L);
        animatorSet.setInterpolator(new Interpolator() { // from class: com.huawei.ui.commonui.dialog.RotateDialog.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) Math.sin((float) (((double) f) * 1.5707963267948966d));
            }
        });
        animatorSet.addListener(new c());
        animatorSet.start();
    }

    public static class c implements Animator.AnimatorListener {
        private final WeakReference<RotateDialog> e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        private c(RotateDialog rotateDialog) {
            this.e = new WeakReference<>(rotateDialog);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            final RotateDialog rotateDialog = this.e.get();
            if (rotateDialog == null) {
                return;
            }
            final int width = rotateDialog.j.getWidth();
            final int height = rotateDialog.j.getHeight();
            HandlerExecutor.b(new Runnable() { // from class: qkl
                @Override // java.lang.Runnable
                public final void run() {
                    RotateDialog.c.d(rotateDialog, width, height);
                }
            });
        }

        public static /* synthetic */ void d(RotateDialog rotateDialog, int i, int i2) {
            if (rotateDialog.d()) {
                LogUtil.a("RotateDialog", "RotateAnimatorListener dialog is null or destroy");
                return;
            }
            LogUtil.a("RotateDialog", "onAnimationEnd， imgWidth:", Integer.valueOf(i), " imgHeight:", Integer.valueOf(i2));
            if (i > 0 && i2 > 0) {
                rotateDialog.d.setVisibility(0);
            } else {
                rotateDialog.dismiss();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        super.configDialog();
        b(this.f23469a);
    }

    private void b(Drawable drawable) {
        int iMin;
        int i;
        int iMin2;
        LogUtil.a("RotateDialog", "showBitmapInDialog");
        if (d() || drawable == null) {
            LogUtil.j("RotateDialog", "showBitmapInDialog is destory or drawable is null");
            return;
        }
        this.f23469a = drawable;
        int i2 = qrs.i(getContext());
        int iG = qrs.g(getContext());
        LogUtil.a("RotateDialog", "showBitmapInDialog windowWidth=", Integer.valueOf(i2), " windowHeight=", Integer.valueOf(iG));
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.height = iG;
        layoutParams.width = i2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        LogUtil.a("RotateDialog", "showBitmapInDialog drawableW=", Integer.valueOf(intrinsicWidth), " drawableH=", Integer.valueOf(intrinsicHeight));
        int iB = iG - qre.b(R.dimen.health_common_44dp);
        boolean zAf = qrs.af(getContext());
        if (zAf) {
            int iS = qrs.s(getContext());
            LogUtil.a("RotateDialog", "showBitmapInDialog statusBarHeight = ", Integer.valueOf(iS));
            iB -= iS;
        }
        int iQ = qrs.ad(getContext()) ? qrs.q(getContext()) : 0;
        LogUtil.a("RotateDialog", "showBitmapInDialog navigationBarHeight = ", Integer.valueOf(iQ));
        int i3 = iB - iQ;
        int iB2 = i2 - qre.b(R.dimen.health_common_24dp);
        if (iB2 * intrinsicHeight >= i3 * intrinsicWidth) {
            if (zAf) {
                iMin2 = Math.min(intrinsicHeight, i3);
            } else {
                iMin2 = Math.min(qrs.d(getContext(), intrinsicHeight), i3);
            }
            i = (intrinsicWidth * iMin2) / intrinsicHeight;
        } else {
            if (zAf) {
                iMin = Math.min(intrinsicWidth, iB2);
            } else {
                iMin = Math.min(qrs.d(getContext(), intrinsicWidth), iB2);
            }
            int i4 = (intrinsicHeight * iMin) / intrinsicWidth;
            i = iMin;
            iMin2 = i4;
        }
        LogUtil.a("RotateDialog", "showBitmapInDialog imgWidth=", Integer.valueOf(i), " imgHeight=", Integer.valueOf(iMin2));
        ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = iMin2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        if (d()) {
            LogUtil.j("RotateDialog", "loadBackground activity is destoried");
        } else {
            qqf.c(str, new RequestOptions(), (RequestListener<Drawable>) new d(), this.j, false);
        }
    }

    public static class d implements RequestListener<Drawable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<RotateDialog> f23473b;

        private d(RotateDialog rotateDialog) {
            this.f23473b = new WeakReference<>(rotateDialog);
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
            LogUtil.a("RotateDialog", "loadBackground onResourceReady");
            final RotateDialog rotateDialog = this.f23473b.get();
            if (rotateDialog == null) {
                return false;
            }
            HandlerExecutor.b(new Runnable() { // from class: qkj
                @Override // java.lang.Runnable
                public final void run() {
                    RotateDialog.d.b(rotateDialog);
                }
            });
            return false;
        }

        public static /* synthetic */ void b(RotateDialog rotateDialog) {
            if (rotateDialog.d()) {
                LogUtil.a("RotateDialog", "RotateRequestListener dialogInner is null or destroy");
                return;
            }
            rotateDialog.show();
            rotateDialog.e(1);
            rotateDialog.d(400);
            rotateDialog.m = System.currentTimeMillis();
            if (rotateDialog.f23470b != null) {
                rotateDialog.f23470b.onVisible(true, rotateDialog.k);
            }
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            LogUtil.j("RotateDialog", "loadBackground onLoadFailed, ", ExceptionUtils.c(glideException));
            return false;
        }
    }
}
