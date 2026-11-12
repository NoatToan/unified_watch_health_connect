package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jtb extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Drawable> f39000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimationDrawable f39001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39002c;
    private List<Drawable> d;
    private ImageView e;
    private int f;
    private String g;
    private Handler h;
    private boolean i;
    private int j;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public jtb(View view) {
        super(view);
        this.d = new ArrayList();
        this.f39000a = new ArrayList();
        this.g = "zh-CN";
        this.i = false;
        this.h = new c(Looper.getMainLooper(), this);
        this.f39002c = -1;
        this.j = 1;
        if (view instanceof ImageView) {
            this.e = (ImageView) view;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.d.clear();
        this.f39000a.clear();
        e();
    }

    private void e() {
        for (int i = 0; i < 16; i++) {
            Bitmap bitmapC = c("frame_bend_" + i);
            if (bitmapC != null) {
                Drawable drawableD = qqf.d(bitmapC);
                if (drawableD != null) {
                    this.d.add(drawableD);
                }
                BitmapDrawable bitmapDrawableE = qqz.e(BaseApplication.b(), drawableD);
                if (bitmapDrawableE != null) {
                    this.f39000a.add(bitmapDrawableE);
                }
            }
        }
    }

    private List<Drawable> b() {
        if (this.f39002c == 0) {
            return this.f39000a;
        }
        return this.d;
    }

    private void c(View view) {
        if (view == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "animationDrawableForBend view == null");
            return;
        }
        AnimationDrawable animationDrawable = this.f39001b;
        if (animationDrawable != null && this.j == this.f39002c) {
            animationDrawable.start();
            return;
        }
        this.f39001b = null;
        this.f39001b = new AnimationDrawable();
        this.j = this.f39002c;
        if (njy.e(b())) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "getOriginalRes null");
            return;
        }
        for (int i = 0; i < b().size(); i++) {
            Drawable drawable = b().get(i);
            if (drawable != null) {
                this.f39001b.addFrame(drawable, 66);
            }
        }
        this.f39001b.setOneShot(false);
        view.setBackground(this.f39001b);
        this.f39001b.start();
    }

    private Bitmap c(String str) {
        String strB = jcm.b().b(str, "png", this.g);
        LogUtil.a("Track_BendSuggestionAnimHelper", "getSportExamBitmap() imagePath: ", strB);
        return jcm.b().b(strB);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        super.startAnimation();
        ImageView imageView = this.e;
        if (imageView == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "mLightWareView == null || mLightBeamView == null");
        } else {
            if (this.f < 40) {
                c(imageView);
                return;
            }
            this.h.removeMessages(1);
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "startAnimation input data is null, pls check.");
            return;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            LogUtil.a("Track_BendSuggestionAnimHelper", "startAnimation mBodyDirection:", Integer.valueOf(this.f39002c));
            this.f39002c = ((Integer) pair.first).intValue();
            int iIntValue = ((Integer) pair.second).intValue();
            this.f = iIntValue;
            if (iIntValue < 40) {
                this.e.setVisibility(0);
                startAnimation();
            } else {
                this.h.removeMessages(1);
                Handler handler = this.h;
                handler.sendMessage(handler.obtainMessage(1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        AnimationDrawable animationDrawable = this.f39001b;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void d() {
        Handler handler = this.h;
        if (handler == null) {
            LogUtil.j("Track_BendSuggestionAnimHelper", "sendHideAnimLayoutMsg mHandler == null");
            return;
        }
        handler.removeMessages(1);
        Handler handler2 = this.h;
        handler2.sendMessage(handler2.obtainMessage(1));
    }

    static class c extends BaseHandler<jtb> {
        c(Looper looper, jtb jtbVar) {
            super(looper, jtbVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jtb jtbVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_BendSuggestionAnimHelper", "handleMessage message is null");
            } else if (message.what == 1) {
                jtbVar.c();
            }
        }
    }

    public void a() {
        List<Drawable> list = this.d;
        if (list != null) {
            list.clear();
            this.d = null;
        }
        List<Drawable> list2 = this.f39000a;
        if (list2 != null) {
            list2.clear();
            this.f39000a = null;
        }
        this.f39001b = null;
    }
}
