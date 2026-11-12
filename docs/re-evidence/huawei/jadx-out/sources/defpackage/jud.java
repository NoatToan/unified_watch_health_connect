package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jud extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimationSet f39051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39052c;
    private ViewGroup d;
    private boolean e;
    private int f;
    private String g;
    private int h;
    private boolean i;
    private String j;
    private Map<String, Bitmap> m;
    private int n;

    public jud(View view) {
        super(view);
        this.m = new HashMap();
        this.g = "zh-CN";
        this.e = false;
        this.i = false;
        if (view instanceof ViewGroup) {
            this.d = (ViewGroup) view;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        if (d()) {
            this.e = true;
            c();
            e();
        }
    }

    private void e() {
        this.m.clear();
        for (int i = 0; i < 10; i++) {
            Bitmap bitmapE = e("pic_num_" + i);
            if (bitmapE != null) {
                this.m.put(String.valueOf(i), bitmapE);
            }
        }
        Bitmap bitmapE2 = e("pic_x");
        if (bitmapE2 != null) {
            this.m.put("x", bitmapE2);
        }
        Bitmap bitmapE3 = e("pic_continuity");
        if (bitmapE3 != null) {
            this.m.put(HwExerciseConstants.JSON_NAME_LONGEST_STREAK, bitmapE3);
        }
    }

    private Bitmap e(String str) {
        String strD = jcp.d().d(str, "png", this.g);
        LogUtil.a("Track_SkipContinuesAnimHelper", "getSkipBitmap() imagePath: ", strD);
        return jcp.d().d(strD);
    }

    private void c() {
        if ("zh-CN".equals(this.g)) {
            this.f39052c = -24;
            this.n = -34;
            this.f = -40;
            this.f39050a = 96;
            return;
        }
        this.f39052c = -16;
        this.n = -22;
        this.f = -24;
        this.f39050a = 60;
    }

    private boolean d() {
        String str = LanguageUtil.o(BaseApplication.b()) ? "zh-CN" : "en";
        if (this.e && str.equals(this.g)) {
            return false;
        }
        this.g = str;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        ViewGroup.MarginLayoutParams marginLayoutParamsD;
        super.startAnimation();
        ViewGroup viewGroup = this.d;
        if (viewGroup == null || this.j == null) {
            LogUtil.j("Track_SkipContinuesAnimHelper", "mContainerViewGroup or mNumStr is null, pls check.");
            return;
        }
        viewGroup.removeAllViews();
        ImageView imageViewC = c(this.d.getContext());
        Bitmap bitmap = this.m.get(HwExerciseConstants.JSON_NAME_LONGEST_STREAK);
        if (bitmap == null) {
            LogUtil.j("Track_SkipContinuesAnimHelper", "longestStreakBitmap is null, pls check.");
            return;
        }
        imageViewC.setImageBitmap(bitmap);
        this.d.addView(imageViewC, d(0, this.h));
        ImageView imageViewC2 = c(this.d.getContext());
        Bitmap bitmap2 = this.m.get("x");
        if (bitmap2 == null) {
            LogUtil.j("Track_SkipContinuesAnimHelper", "joinerBitmap is null, pls check.");
            return;
        }
        imageViewC2.setImageBitmap(bitmap2);
        ViewGroup viewGroup2 = this.d;
        viewGroup2.addView(imageViewC2, d(qrs.d(viewGroup2.getContext(), this.f39052c), this.h));
        for (int i = 0; i < this.j.length(); i++) {
            char cCharAt = this.j.charAt(i);
            ImageView imageViewC3 = c(this.d.getContext());
            Bitmap bitmap3 = this.m.get(cCharAt + "");
            if (bitmap3 == null) {
                LogUtil.j("Track_SkipContinuesAnimHelper", "numBitmap is null, pls check. key:", Character.valueOf(cCharAt));
                return;
            }
            imageViewC3.setImageBitmap(bitmap3);
            if (i == 0) {
                marginLayoutParamsD = d(qrs.d(this.d.getContext(), this.n), this.h);
            } else {
                marginLayoutParamsD = d(qrs.d(this.d.getContext(), this.f), this.h);
            }
            this.d.addView(imageViewC3, marginLayoutParamsD);
        }
        this.d.setVisibility(0);
        this.d.startAnimation(b());
    }

    private ImageView c(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setMaxHeight(this.h);
        imageView.setMaxWidth(this.h * 5);
        return imageView;
    }

    private ViewGroup.MarginLayoutParams d(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, i2);
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(0);
        return marginLayoutParams;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj instanceof String) {
            this.j = (String) obj;
        }
        String str = this.j;
        if (str != null && str.length() > 4) {
            this.h = qrs.d(BaseApplication.b(), (this.f39050a * 2.0f) / 3.0f);
        } else {
            this.h = qrs.d(BaseApplication.b(), this.f39050a);
        }
        startAnimation();
    }

    private AnimationSet b() {
        if (this.f39051b == null) {
            AnimationSet animationSetC = jqi.c();
            this.f39051b = animationSetC;
            animationSetC.setAnimationListener(new Animation.AnimationListener() { // from class: jud.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    jud.this.i = true;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    jud.this.i = false;
                    jud.this.d.setVisibility(8);
                }
            });
        }
        return this.f39051b;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return this.i;
    }
}
