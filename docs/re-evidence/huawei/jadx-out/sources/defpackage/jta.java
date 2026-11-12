package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jta extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f38994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Drawable> f38995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f38996c;
    private Drawable d;
    private AnimationDrawable e;
    private Handler f;
    private nue g;
    private boolean h;
    private List<Drawable> i;
    private int j;
    private int l;
    private boolean m;
    private Drawable o;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public jta(View view) {
        super(view);
        this.i = new ArrayList();
        this.f38995b = new ArrayList();
        this.h = false;
        this.f = new c(Looper.getMainLooper(), this);
        this.l = 1;
        this.m = false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.i.clear();
        this.f38995b.clear();
        h();
        Bitmap bitmapD = d("frame_flexion_0");
        ImageView imageView = (ImageView) this.mAnimContainer.findViewById(R.id.flexion_knee_img);
        this.f38994a = imageView;
        imageView.setImageBitmap(bitmapD);
        i();
        ImageView imageView2 = (ImageView) this.mAnimContainer.findViewById(R.id.flexion_arrow_img);
        this.f38996c = imageView2;
        imageView2.setBackground(j());
    }

    private void h() {
        for (int i = 0; i < 48; i++) {
            Bitmap bitmapD = d("frame_flexion_" + i);
            if (bitmapD != null) {
                Drawable drawableD = qqf.d(bitmapD);
                if (drawableD != null) {
                    this.i.add(drawableD);
                }
                BitmapDrawable bitmapDrawableE = qqz.e(BaseApplication.b(), drawableD);
                if (bitmapDrawableE != null) {
                    this.f38995b.add(bitmapDrawableE);
                }
            }
        }
    }

    private void i() {
        Bitmap bitmapD = d("public_flexion_arrow");
        if (bitmapD == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "arrowBitmap == null");
            return;
        }
        Drawable drawableD = qqf.d(bitmapD);
        this.d = drawableD;
        this.o = qqz.e(BaseApplication.b(), drawableD);
    }

    private Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(270.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private Drawable j() {
        int i = this.j;
        if (i == 1) {
            return this.d;
        }
        if (i == 0) {
            return this.o;
        }
        return this.d;
    }

    private List<Drawable> f() {
        int i = this.j;
        if (i == 1) {
            return this.i;
        }
        if (i == 0) {
            return this.f38995b;
        }
        return this.i;
    }

    private void b() {
        if (this.f38994a == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "animationDrawableForBend view == null");
            return;
        }
        if (this.l == this.j && this.mAnimContainer.getVisibility() == 0) {
            return;
        }
        this.mAnimContainer.setVisibility(0);
        AnimationDrawable animationDrawable = this.e;
        if (animationDrawable != null && this.l == this.j) {
            animationDrawable.start();
            return;
        }
        k();
        this.e = null;
        this.e = new AnimationDrawable();
        this.l = this.j;
        for (Drawable drawable : f()) {
            if (drawable != null) {
                this.e.addFrame(drawable, 41);
            }
        }
        this.e.setOneShot(false);
        this.f38994a.setBackground(this.e);
        this.e.start();
    }

    private Bitmap d(String str) {
        String strD = jcm.b().d(str, "png");
        LogUtil.a("Track_BendSuggestionAnimHelper", "getSportExamBitmap() imagePath: ", strD);
        Bitmap bitmapB = jcm.b().b(strD);
        return this.m ? a(bitmapB) : bitmapB;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        super.startAnimation();
        if (this.mAnimContainer == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "mAnimContainer == null");
            return;
        }
        if (this.g == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "mBodyPoint == null");
            return;
        }
        c();
        e();
        b();
        final int iE = (int) this.g.e();
        final int iC = (int) this.g.c();
        if (this.m) {
            iE = (int) this.g.g();
            iC = (int) this.g.i();
        }
        this.f38994a.post(new Runnable() { // from class: jta.1
            @Override // java.lang.Runnable
            public void run() {
                jta.this.mAnimContainer.setTranslationX((iE - ((jta.this.mAnimContainer.getWidth() / 2) + jta.this.mAnimContainer.getLeft())) + (jta.this.m ? jta.this.f38994a.getWidth() / 2 : 0));
                jta.this.mAnimContainer.setTranslationY(iC - (jta.this.mAnimContainer.getTop() + jta.this.mAnimContainer.getHeight()));
            }
        });
    }

    private void c() {
        LogUtil.a("Track_BendSuggestionAnimHelper", "HipY:", Float.valueOf(this.g.i()), "AnkleY:", Float.valueOf(this.g.c()));
        if (this.m) {
            this.f38994a.getLayoutParams().height = -2;
            this.f38994a.getLayoutParams().width = (int) Math.abs(this.g.e() - this.g.g());
        } else {
            this.f38994a.getLayoutParams().height = (int) Math.abs(this.g.i() - this.g.c());
            this.f38994a.getLayoutParams().width = -2;
        }
        this.f38994a.requestLayout();
    }

    private void e() {
        if (!(this.mAnimContainer instanceof ConstraintLayout)) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "mAnimContainer not instanceof ConstraintLayout");
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone((ConstraintLayout) this.mAnimContainer);
        if (this.j == 1) {
            constraintSet.connect(R.id.flexion_arrow_img, 6, R.id.flexion_knee_img, 6);
        } else {
            constraintSet.connect(R.id.flexion_arrow_img, 6, R.id.flexion_knee_img, 7);
        }
        constraintSet.applyTo((ConstraintLayout) this.mAnimContainer);
    }

    private void k() {
        AnimatorSet animatorSetC = jqr.c(this.j, this.m);
        ImageView imageView = this.f38996c;
        if (imageView != null) {
            imageView.setBackground(j());
            animatorSetC.setTarget(this.f38996c);
            animatorSetC.start();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "startAnimation input data is null, pls check.");
        } else if (obj instanceof nue) {
            nue nueVar = (nue) obj;
            this.g = nueVar;
            this.j = nueVar.b();
            startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.mAnimContainer != null) {
            this.mAnimContainer.setVisibility(8);
        }
    }

    public void a() {
        Handler handler = this.f;
        if (handler == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "sendHideAnimLayoutMsg mHandler == null");
            return;
        }
        handler.removeMessages(1);
        Handler handler2 = this.f;
        handler2.sendMessage(handler2.obtainMessage(1));
    }

    static class c extends BaseHandler<jta> {
        c(Looper looper, jta jtaVar) {
            super(looper, jtaVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jta jtaVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_BendSuggestionAnimHelper", "handleMessage message is null");
            } else {
                if (message.what != 1) {
                    return;
                }
                jtaVar.g();
            }
        }
    }

    public void d() {
        List<Drawable> list = this.i;
        if (list != null) {
            list.clear();
            this.i = null;
        }
        List<Drawable> list2 = this.f38995b;
        if (list2 != null) {
            list2.clear();
            this.f38995b = null;
        }
        this.e = null;
    }

    public void c(boolean z) {
        this.m = z;
    }
}
