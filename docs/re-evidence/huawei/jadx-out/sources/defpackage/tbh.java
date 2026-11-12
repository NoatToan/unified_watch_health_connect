package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.ui.homehealth.threecirclecard.IAnimationCompletedCallback;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes17.dex */
public class tbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f48929a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f48930c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48931b;
    private String e;
    private LinearLayout f;
    private HealthSwipeRefreshLayout g;
    private ImageView h;
    private ImageView i;
    private WeakReference<Context> j;
    private Bitmap k;
    private Bitmap m;
    private int n;
    private ImageView o;
    private int q;
    private int r;
    private int t;
    private int u;
    private PathInterpolator p = new PathInterpolator(0.3f, 0.0f, 0.5f, 0.0f);
    private PathInterpolator s = new PathInterpolator(0.0f, 0.3f, 0.0f, 0.5f);
    private float l = c().getResources().getDimensionPixelOffset(R.dimen.health_common_16dp);
    private int v = qqp.a(c(), 12.0f);
    private int d = qqp.a(c(), 12.0f);

    public tbh(Context context, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ImageView imageView3, HealthSwipeRefreshLayout healthSwipeRefreshLayout) {
        this.j = new WeakReference<>(context);
        this.h = imageView;
        this.i = imageView2;
        this.o = imageView3;
        this.f = linearLayout;
        this.g = healthSwipeRefreshLayout;
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        this.u = dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue();
        this.f48931b = dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue();
    }

    public void b(HealthRecycleView healthRecycleView, tcw tcwVar, int i, IAnimationCompletedCallback iAnimationCompletedCallback) {
        Bitmap bitmapB = b(healthRecycleView, 1);
        if (bitmapB == null) {
            LogUtil.c("StepsSwitchAnimateManager", "bitmap is null");
            e(tcwVar);
            return;
        }
        Bitmap bitmapB2 = b(a(bitmapB));
        this.m = bitmapB2;
        this.q = bitmapB2.getWidth();
        int height = this.m.getHeight();
        this.r = height;
        c(this.q, height, i);
        this.o.setVisibility(0);
        this.o.setImageBitmap(this.m);
        d(this.q, this.r, i);
        this.h.setAlpha(1.0f);
        this.h.setImageBitmap(null);
        this.h.setBackground(null);
        this.h.setVisibility(0);
        a();
        this.i.setVisibility(0);
        iAnimationCompletedCallback.onCompleted(null);
    }

    public void c(final HealthRecycleView healthRecycleView, final tcw tcwVar, final int i, String str) {
        LogUtil.a("StepsSwitchAnimateManager", "startAnimator");
        this.e = str;
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        this.o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tbh.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                tbh.this.o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                tbh.this.b(countDownLatch, tcwVar, i, healthRecycleView);
            }
        });
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tbh.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                tbh.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                tbh.this.b(countDownLatch, tcwVar, i, healthRecycleView);
            }
        });
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tbh.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                tbh.this.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                tbh.this.b(countDownLatch, tcwVar, i, healthRecycleView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context c() {
        WeakReference<Context> weakReference = this.j;
        if (weakReference == null) {
            return BaseApplication.b();
        }
        Context context = weakReference.get();
        return context == null ? BaseApplication.b() : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CountDownLatch countDownLatch, tcw tcwVar, int i, HealthRecycleView healthRecycleView) {
        countDownLatch.countDown();
        if (countDownLatch.getCount() == 0) {
            e(tcwVar, i, healthRecycleView);
        }
    }

    private void e(final tcw tcwVar, final int i, final HealthRecycleView healthRecycleView) {
        Bitmap bitmap = this.m;
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.d("StepsSwitchAnimateManager", "startPreAnimator mPreBitmap is null or recycled");
            return;
        }
        Bitmap bitmapC = c(this.m);
        int i2 = this.q;
        int i3 = this.r;
        ImageView imageViewA = a(a(bitmapC, i2, i3, i3), i);
        d(this.f, imageViewA);
        imageViewA.setCameraDistance(qrs.j(c()) * 10000.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewA, "rotationX", 180.0f, 90.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageViewA, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.i, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(this.p);
        objectAnimatorOfFloat2.setInterpolator(this.p);
        objectAnimatorOfFloat3.setInterpolator(this.p);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: tbh.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LogUtil.a("StepsSwitchAnimateManager", "startAnimator onAnimationStart");
                HandlerExecutor.c(new Runnable() { // from class: tbh.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        tbh.this.c(tcwVar);
                        if (tbh.this.d(tcwVar, healthRecycleView)) {
                            tbh.this.c(tbh.this.t, tbh.this.n, i);
                            LogUtil.a("StepsSwitchAnimateManager", "startPreAnimator nextBitmapHeight=", Integer.valueOf(tbh.this.n));
                            tbh.this.h.setBackground(tbh.this.c().getResources().getDrawable(R.drawable.three_circle_animator_bg));
                            tbh.this.o.setBackground(tbh.this.c().getResources().getDrawable(R.drawable.three_circle_animator_bg_whole));
                            tbh.this.o.setImageBitmap(null);
                            return;
                        }
                        LogUtil.d("StepsSwitchAnimateManager", "startPreAnimator getNextBitmapFail. return");
                    }
                }, 50L);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LogUtil.a("StepsSwitchAnimateManager", "startAnimator onAnimationEnd");
                tbh.this.c(tcwVar, i, healthRecycleView);
            }
        });
        objectAnimatorOfFloat.setDuration(500L).start();
        objectAnimatorOfFloat2.setDuration(500L).start();
        objectAnimatorOfFloat3.setDuration(500L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(tcw tcwVar, HealthRecycleView healthRecycleView) {
        Bitmap bitmapB = b(healthRecycleView, 1);
        if (bitmapB == null) {
            LogUtil.c("StepsSwitchAnimateManager", "bitmap is null");
            e(tcwVar);
            return false;
        }
        Bitmap bitmapB2 = b(a(bitmapB));
        this.k = bitmapB2;
        this.t = bitmapB2.getWidth();
        this.n = this.k.getHeight();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(tcw tcwVar) {
        if (tcwVar == null) {
            LogUtil.d("StepsSwitchAnimateManager", "notifyCardChanged twoModelCardData is null");
        } else if ("threeCircleCard".equals(this.e)) {
            tcwVar.e("threeLeafCard", false);
        } else {
            tcwVar.e("threeCircleCard", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final tcw tcwVar, int i, HealthRecycleView healthRecycleView) {
        LogUtil.a("StepsSwitchAnimateManager", "startNextAnimator");
        if (this.k == null && !d(tcwVar, healthRecycleView)) {
            LogUtil.d("StepsSwitchAnimateManager", "getNextBitmapFail. return");
            return;
        }
        c(this.t, this.n, i);
        d(this.t, this.n, i);
        LogUtil.a("StepsSwitchAnimateManager", "startNextAnimator nextBitmapHeight=", Integer.valueOf(this.n));
        ImageView imageViewA = a(e(this.k), i);
        d(this.f, imageViewA);
        imageViewA.setCameraDistance(qrs.j(c()) * 10000.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewA, "rotationX", 90.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageViewA, "alpha", 0.01f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.h, "alpha", 0.01f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(this.s);
        objectAnimatorOfFloat2.setInterpolator(this.s);
        objectAnimatorOfFloat3.setInterpolator(this.s);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: tbh.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LogUtil.a("StepsSwitchAnimateManager", "startNextAnimator onAnimationStart");
                tbh.this.h.setAlpha(0.01f);
                if (!tbh.this.k.isRecycled()) {
                    tbh.this.d();
                    tbh.this.i.setAlpha(1.0f);
                    tbh.this.i.setImageBitmap(null);
                    tbh.this.i.setBackground(tbh.this.c().getResources().getDrawable(R.drawable.three_circle_animator_bg_bottom));
                    return;
                }
                LogUtil.d("StepsSwitchAnimateManager", "onAnimationStart reset");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LogUtil.a("StepsSwitchAnimateManager", "startNextAnimator onAnimationEnd");
                tbh.this.e(tcwVar);
            }
        });
        objectAnimatorOfFloat.setDuration(800L).start();
        objectAnimatorOfFloat2.setDuration(800L).start();
        objectAnimatorOfFloat3.setDuration(800L).start();
    }

    public void e(tcw tcwVar) {
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.f.setVisibility(8);
        this.o.setVisibility(8);
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = this.g;
        if (healthSwipeRefreshLayout != null) {
            healthSwipeRefreshLayout.setInterceptTouchEvent(false);
        }
        if (tcwVar != null) {
            tcwVar.n();
        }
        d(this.m);
        d(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i = this.t;
        int i2 = (int) (this.n / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(this.k, new Rect(0, 0, i, i2), new Rect(0, 0, i, i2), (Paint) null);
        this.h.setImageBitmap(bitmapCreateBitmap);
    }

    private void a() {
        int i = this.q;
        int i2 = (int) (this.r / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (this.m.isRecycled()) {
            LogUtil.d("StepsSwitchAnimateManager", "drawBitmapToImageView2 mPreBitmap has been recycled.");
        } else {
            canvas.drawBitmap(this.m, new Rect(0, i2, i, i2 * 2), new Rect(0, 0, i, i2), (Paint) null);
            this.i.setImageBitmap(bitmapCreateBitmap);
        }
    }

    private Bitmap b(HealthRecycleView healthRecycleView, int i) {
        if (healthRecycleView == null) {
            LogUtil.d("StepsSwitchAnimateManager", "getFirstBitmap recyclerView is null");
            return null;
        }
        RecyclerView.LayoutManager layoutManager = healthRecycleView.getLayoutManager();
        if (layoutManager == null) {
            LogUtil.c("StepsSwitchAnimateManager", "layoutManager is null");
            return null;
        }
        View viewFindViewByPosition = layoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            LogUtil.c("StepsSwitchAnimateManager", "item is null");
            return null;
        }
        viewFindViewByPosition.setDrawingCacheEnabled(true);
        Bitmap drawingCache = viewFindViewByPosition.getDrawingCache();
        if (drawingCache == null) {
            LogUtil.c("StepsSwitchAnimateManager", "drawingCache is null");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
        viewFindViewByPosition.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    private Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(bitmapShader);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f = this.l;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.restore();
        d(bitmap);
        return bitmapCreateBitmap;
    }

    private ImageView a(Bitmap bitmap, int i) {
        ImageView imageView = new ImageView(c());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight());
        layoutParams.setMargins(this.u, i + this.v, this.f48931b, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }

    private void d(ViewGroup viewGroup, ImageView imageView) {
        viewGroup.removeAllViews();
        viewGroup.requestLayout();
        viewGroup.addView(imageView);
        viewGroup.invalidate();
        viewGroup.setVisibility(0);
    }

    private void d(int i, int i2, int i3) {
        a(this.h, i, i2, true, i3);
        a(this.i, i, i2, false, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.height = i2;
            layoutParams2.setMargins(this.u, this.v + i3, this.f48931b, this.d);
            this.o.setLayoutParams(layoutParams2);
        }
    }

    private void a(ImageView imageView, int i, int i2, boolean z, int i3) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.height = (int) (i2 / 2.0f);
            if (z) {
                layoutParams2.setMargins(this.u, this.v + i3, this.f48931b, 0);
            } else {
                layoutParams2.setMargins(this.u, qqp.a(c(), 0.0f), this.f48931b, 0);
            }
            imageView.setLayoutParams(layoutParams2);
        }
    }

    private Bitmap c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        canvas.drawBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true), new Rect(0, 0, width, height), new Rect(0, 0, width, height), (Paint) null);
        return bitmapCreateBitmap;
    }

    private Bitmap a(Bitmap bitmap, int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (i > bitmap.getWidth()) {
            i = bitmap.getWidth();
        }
        if (i2 > bitmap.getHeight()) {
            i2 = bitmap.getHeight();
        }
        canvas.drawBitmap(bitmap, new Rect(0, (int) (i2 / 2.0f), i, i2), new Rect(0, (int) (i3 / 2.0f), i, i3), (Paint) null);
        return bitmapCreateBitmap;
    }

    private Bitmap a(Bitmap bitmap) {
        int height = (bitmap.getHeight() - this.v) - this.d;
        int width = (bitmap.getWidth() - this.u) - this.f48931b;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        int i = this.u;
        int i2 = this.v;
        canvas.drawBitmap(bitmap, new Rect(i, i2, i + width, i2 + height), new Rect(0, 0, width, height), (Paint) null);
        canvas.restore();
        d(bitmap);
        return bitmapCreateBitmap;
    }

    private void d(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    private Bitmap e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        if (bitmap.isRecycled()) {
            LogUtil.c("StepsSwitchAnimateManager", "getBottomHalfBitmap failed, cause bitmap is recycled!");
            return bitmapCreateBitmap;
        }
        int i = (int) (height / 2.0f);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, new Rect(0, i, width, height), new Rect(0, i, width, height), (Paint) null);
        return bitmapCreateBitmap;
    }
}
