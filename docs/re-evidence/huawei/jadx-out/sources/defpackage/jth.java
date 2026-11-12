package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jth extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nue f39012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimationDrawable f39013c;
    private Handler d;
    private boolean e;
    private int f;
    private int g;
    private ImageView h;
    private int i;
    private ViewGroup j;
    private List<Drawable> m;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public jth(View view, View view2) {
        super(view);
        this.m = new ArrayList();
        this.f39011a = "zh-CN";
        this.e = false;
        this.d = new d(Looper.getMainLooper(), this);
        if (view instanceof ViewGroup) {
            this.j = (ViewGroup) view;
        }
        if (view2 instanceof ImageView) {
            this.h = (ImageView) view2;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.m.clear();
        this.m = d();
        Bitmap bitmapB = b("light_beam", "webp");
        Bitmap bitmapB2 = b("light_beam_bottom", "webp");
        ImageView imageView = (ImageView) this.j.findViewById(R.id.flexion_beam_animation_img);
        ImageView imageView2 = (ImageView) this.j.findViewById(R.id.flexion_beam_animation_img_bottom);
        if (imageView != null) {
            imageView.setImageBitmap(bitmapB);
            imageView2.setImageBitmap(bitmapB2);
        }
    }

    private List<Drawable> d() {
        Drawable drawableD;
        for (int i = 0; i < 35; i++) {
            Bitmap bitmapB = b("frame_light_ware_" + i, "png");
            if (bitmapB != null && (drawableD = qqf.d(bitmapB)) != null) {
                this.m.add(drawableD);
            }
        }
        return this.m;
    }

    private void e(View view) {
        if (view == null) {
            LogUtil.j("Track_LightAnimHelper", "animationDrawableForWare view == null");
            return;
        }
        AnimationDrawable animationDrawable = this.f39013c;
        if (animationDrawable != null) {
            animationDrawable.start();
            return;
        }
        this.f39013c = new AnimationDrawable();
        for (Drawable drawable : d()) {
            if (drawable != null) {
                this.f39013c.addFrame(drawable, 41);
            }
        }
        this.f39013c.setOneShot(false);
        view.setBackground(this.f39013c);
    }

    private Bitmap b(String str, String str2) {
        String strD = jcm.b().d(str, str2);
        LogUtil.a("Track_LightAnimHelper", "getSportExamBitmap() imagePath: ", strD);
        return jcm.b().b(strD);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        super.startAnimation();
        ImageView imageView = this.h;
        if (imageView == null || this.j == null) {
            LogUtil.j("Track_LightAnimHelper", "mLightWareView == null || mLightBeamView == null");
            return;
        }
        if (this.g >= 40) {
            e(imageView);
        }
        LogUtil.a("Track_LightAnimHelper", "width:", Integer.valueOf(this.j.getWidth()), "height:", Integer.valueOf(this.j.getHeight()), "top:", Integer.valueOf(this.j.getTop()), "left:", Integer.valueOf(this.j.getLeft()));
        ViewGroup viewGroup = this.j;
        viewGroup.setTranslationX(this.f - ((viewGroup.getWidth() / 2) + this.j.getLeft()));
        ViewGroup viewGroup2 = this.j;
        viewGroup2.setTranslationY(this.i - (viewGroup2.getHeight() + this.j.getTop()));
        this.h.setTranslationX(this.f - ((this.j.getWidth() / 2) + this.j.getLeft()));
        this.h.setTranslationY((this.i - (this.j.getTop() + (this.j.getHeight() / 2))) - 50);
        if (this.g >= 70) {
            c();
            return;
        }
        this.d.removeMessages(1);
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(1));
    }

    private void c() {
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            AnimatorSet animatorSetD = jqr.d();
            animatorSetD.setTarget(this.j);
            animatorSetD.start();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_LightAnimHelper", "startAnimation input data is null, pls check.");
            return;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            this.f39012b = (nue) pair.first;
            int iIntValue = ((Integer) pair.second).intValue();
            this.g = iIntValue;
            if (iIntValue >= 40) {
                this.h.setVisibility(0);
                e();
                startAnimation();
            } else {
                this.d.removeMessages(1);
                Handler handler = this.d;
                handler.sendMessage(handler.obtainMessage(1));
            }
        }
    }

    private void e() {
        nue nueVar = this.f39012b;
        if (nueVar == null) {
            LogUtil.j("Track_LightAnimHelper", "mBodyPoint is null");
            return;
        }
        this.f = (int) nueVar.f();
        int iH = (int) this.f39012b.h();
        this.i = iH;
        LogUtil.a("Track_LightAnimHelper", "initLightLocation mPositionX: ", Integer.valueOf(this.f), "mPositionY: ", Integer.valueOf(iH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        AnimationDrawable animationDrawable = this.f39013c;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            this.f39013c.stop();
        }
        ImageView imageView = this.h;
        if (imageView != null && this.g < 40) {
            imageView.setVisibility(4);
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup == null || this.g >= 70) {
            return;
        }
        viewGroup.setVisibility(4);
    }

    static class d extends BaseHandler<jth> {
        d(Looper looper, jth jthVar) {
            super(looper, jthVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jth jthVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_LightAnimHelper", "handleMessage message is null");
            } else if (message.what == 1) {
                jthVar.b();
            }
        }
    }

    public void a() {
        List<Drawable> list = this.m;
        if (list != null) {
            list.clear();
            this.m = null;
        }
        this.f39013c = null;
    }
}
