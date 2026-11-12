package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.healthcloud.plugintrack.ui.viewholder.ExplodeAnimationHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SkipAchieveType;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class juc extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExplodeAnimationHelper f39047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f39048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f39049c;
    private Map<Integer, Bitmap> d;
    private ImageView e;
    private String f;
    private boolean g;
    private Handler h;
    private List<List<Bitmap>> i;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public juc(View view, View view2) {
        super(view);
        this.d = new HashMap();
        this.i = new ArrayList();
        this.f = "zh-CN";
        this.g = false;
        this.h = new d(Looper.getMainLooper(), this);
        if (view instanceof ImageView) {
            this.e = (ImageView) view;
        }
        if (view2 instanceof ViewGroup) {
            this.f39049c = (ViewGroup) view2;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        Bitmap bitmapA;
        if (b()) {
            this.g = true;
            this.d.clear();
            for (SkipAchieveType skipAchieveType : SkipAchieveType.values()) {
                if (skipAchieveType != null && skipAchieveType.getPicPath() != null && (bitmapA = a(skipAchieveType.getPicPath())) != null) {
                    this.d.put(Integer.valueOf(skipAchieveType.getLevel()), bitmapA);
                }
            }
            this.i.clear();
            this.i.add(e("particle1_00000", "particle1_00001", "particle1_00002", "particle1_00003", "particle1_00004"));
            this.i.add(e("particle2_00000", "particle2_00001", "particle2_00002", "particle2_00003", "particle2_00004"));
            this.i.add(e("particle3_00000"));
            this.i.add(e("particle4_00000"));
            ExplodeAnimationHelper explodeAnimationHelper = new ExplodeAnimationHelper(this.i, this.f39049c, new PointF(qqv.d(BaseApplication.b()) / 2.0f, qqv.b(BaseApplication.b()) / 2.0f), null);
            this.f39047a = explodeAnimationHelper;
            explodeAnimationHelper.d(new Size(60, 60));
        }
    }

    private List<Bitmap> e(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Bitmap bitmapA = a(str);
            if (bitmapA != null) {
                arrayList.add(bitmapA);
            }
        }
        return arrayList;
    }

    private Bitmap a(String str) {
        String strD = jcp.d().d(str, "png", this.f);
        LogUtil.a("Track_SkipEncourageAnimHelper", "getSkipBitmap() imagePath: ", strD);
        return jcp.d().d(strD);
    }

    private boolean b() {
        String str = LanguageUtil.o(BaseApplication.b()) ? "zh-CN" : "en";
        if (this.g && str.equals(this.f)) {
            return false;
        }
        this.f = str;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        ImageView imageView;
        super.startAnimation();
        Bitmap bitmap = this.d.get(this.f39048b);
        if (bitmap == null || (imageView = this.e) == null || this.f39049c == null) {
            LogUtil.j("Track_SkipEncourageAnimHelper", "startAnimation encourage bitmap or mEncourageImg or mExplodeAnimation is null, pls check. bitmap:", bitmap, " mEncourageImg:", this.e, " mExplodeAnimation:", this.f39049c);
            return;
        }
        imageView.setImageBitmap(bitmap);
        this.e.setVisibility(0);
        AnimatorSet animatorSetF = jqi.f();
        animatorSetF.setTarget(this.e);
        animatorSetF.start();
        this.f39047a.d();
        this.f39047a.d(this.f39049c);
        this.h.removeMessages(4);
        Handler handler = this.h;
        handler.sendMessageDelayed(handler.obtainMessage(4), 2000L);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_SkipEncourageAnimHelper", "startAnimation input data is null, pls check.");
        } else {
            this.f39048b = obj;
            startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    static class d extends BaseHandler<juc> {
        d(Looper looper, juc jucVar) {
            super(looper, jucVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(juc jucVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_SkipEncourageAnimHelper", "handleMessage message is null");
            } else {
                if (message.what != 4) {
                    return;
                }
                jucVar.d();
            }
        }
    }
}
