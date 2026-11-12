package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jtj extends AnimBaseHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39014c = qrs.d(BaseApplication.b(), 80.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimationSet f39016b;
    private ViewGroup d;
    private boolean e;
    private final Map<String, Bitmap> f;
    private boolean g;
    private String h;

    public jtj(View view) {
        super(view);
        this.f = new HashMap();
        this.e = false;
        this.f39015a = false;
        this.g = false;
        if (view instanceof ViewGroup) {
            this.d = (ViewGroup) view;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        if (this.e) {
            return;
        }
        this.e = true;
        d();
    }

    private void d() {
        String str;
        this.f.clear();
        for (int i = 0; i < 10; i++) {
            Bitmap bitmapC = jcm.b().c("pic_num_" + i);
            if (bitmapC != null) {
                this.f.put(String.valueOf(i), bitmapC);
            }
        }
        if (this.g) {
            str = "public_cm";
        } else {
            str = "pic_x";
        }
        Bitmap bitmapC2 = jcm.b().c(str);
        if (bitmapC2 != null) {
            this.f.put(str, bitmapC2);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        Bitmap bitmap;
        super.startAnimation();
        ViewGroup viewGroup = this.d;
        if (viewGroup == null || this.h == null) {
            LogUtil.j("Track_NumberAnimHelper", "mContainerViewGroup or mNumStr is null, pls check.");
            return;
        }
        viewGroup.removeAllViews();
        ImageView imageViewB = b(this.d.getContext());
        if (this.g) {
            bitmap = this.f.get("public_cm");
        } else {
            bitmap = this.f.get("pic_x");
        }
        if (bitmap == null) {
            LogUtil.j("Track_NumberAnimHelper", "joinerBitmap is null, pls check.");
            return;
        }
        imageViewB.setImageBitmap(bitmap);
        if (!this.g) {
            this.d.addView(imageViewB, a());
        }
        for (int i = 0; i < this.h.length(); i++) {
            char cCharAt = this.h.charAt(i);
            ImageView imageViewB2 = b(this.d.getContext());
            Bitmap bitmap2 = this.f.get(String.valueOf(cCharAt));
            if (bitmap2 == null) {
                LogUtil.j("Track_NumberAnimHelper", "numBitmap is null, pls check. key:", Character.valueOf(cCharAt));
            } else {
                imageViewB2.setImageBitmap(bitmap2);
                this.d.addView(imageViewB2, a());
            }
        }
        b(imageViewB);
        this.d.setVisibility(0);
        this.d.startAnimation(c());
    }

    private void b(ImageView imageView) {
        if (this.g) {
            this.d.addView(imageView, b(qrs.d(BaseApplication.b(), 50.0f)));
            if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.gravity = 80;
                imageView.setLayoutParams(layoutParams);
            }
        }
    }

    private ImageView b(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        int i = f39014c;
        imageView.setMaxHeight(i);
        imageView.setMaxWidth(i);
        return imageView;
    }

    private ViewGroup.MarginLayoutParams a() {
        return b(f39014c);
    }

    private ViewGroup.MarginLayoutParams b(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, i);
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        return marginLayoutParams;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj instanceof String) {
            this.h = (String) obj;
        }
        startAnimation();
    }

    private AnimationSet c() {
        if (this.f39016b == null) {
            b();
            this.f39016b.setAnimationListener(new Animation.AnimationListener() { // from class: jtj.5
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    jtj.this.f39015a = true;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    jtj.this.f39015a = false;
                    jtj.this.d.setVisibility(8);
                }
            });
        }
        return this.f39016b;
    }

    private void b() {
        if (this.g) {
            this.f39016b = jqr.b(-100);
        } else {
            this.f39016b = jqi.c();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return this.f39015a;
    }

    public void c(boolean z) {
        this.g = z;
    }
}
