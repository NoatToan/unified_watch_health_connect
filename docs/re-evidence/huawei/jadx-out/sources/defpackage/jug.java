package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.StandFlexionAchieveType;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jug extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, Bitmap> f39059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f39060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39061c;
    private Object d;
    private ImageView e;
    private String i;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public jug(View view) {
        super(view);
        this.f39059a = new HashMap();
        this.i = "zh-CN";
        this.f39061c = false;
        this.f39060b = new e(Looper.getMainLooper(), this);
        if (view instanceof ImageView) {
            this.e = (ImageView) view;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        Bitmap bitmapD;
        if (a()) {
            this.f39061c = true;
            this.f39059a.clear();
            for (StandFlexionAchieveType standFlexionAchieveType : StandFlexionAchieveType.values()) {
                if (standFlexionAchieveType != null && standFlexionAchieveType.getPicPath() != null && (bitmapD = d(standFlexionAchieveType.getPicPath())) != null) {
                    this.f39059a.put(Integer.valueOf(standFlexionAchieveType.getScore()), bitmapD);
                }
            }
        }
    }

    private Bitmap d(String str) {
        String strD = jcm.b().d(str, "png");
        LogUtil.a("Track_StandFlexionEncourageAnimHelper", "getSportExamBitmap() imagePath: ", strD);
        return jcm.b().b(strD);
    }

    private boolean a() {
        String str = LanguageUtil.o(BaseApplication.b()) ? "zh-CN" : "en";
        if (this.f39061c && str.equals(this.i)) {
            return false;
        }
        this.i = str;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        ImageView imageView;
        super.startAnimation();
        LogUtil.a("Track_StandFlexionEncourageAnimHelper", "startAnimation score:", this.d, Boolean.valueOf(this.e == null));
        Bitmap bitmap = this.f39059a.get(this.d);
        if (bitmap != null && (imageView = this.e) != null) {
            imageView.setImageBitmap(bitmap);
            this.e.setVisibility(0);
            AnimatorSet animatorSetF = jqi.f();
            animatorSetF.setTarget(this.e);
            animatorSetF.start();
        }
        this.f39060b.removeMessages(1);
        Handler handler = this.f39060b;
        handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_StandFlexionEncourageAnimHelper", "startAnimation input data is null, pls check.");
        } else {
            this.d = obj;
            startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    static class e extends BaseHandler<jug> {
        e(Looper looper, jug jugVar) {
            super(looper, jugVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jug jugVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_StandFlexionEncourageAnimHelper", "handleMessage message is null");
            } else if (message.what == 1) {
                jugVar.b();
            }
        }
    }
}
