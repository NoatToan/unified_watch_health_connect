package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SupineLegAchieveType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jui extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, Bitmap> f39067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f39068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39069c;
    private Object d;
    private Handler e;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public jui(View view) {
        super(view);
        this.f39067a = new HashMap();
        this.f39069c = false;
        this.e = new e(Looper.getMainLooper(), this);
        if (view instanceof ImageView) {
            this.f39068b = (ImageView) view;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() {
        Bitmap bitmapC;
        if (this.f39069c) {
            return;
        }
        this.f39069c = true;
        this.f39067a.clear();
        for (SupineLegAchieveType supineLegAchieveType : SupineLegAchieveType.values()) {
            if (supineLegAchieveType != null && supineLegAchieveType.getPicPath() != null && (bitmapC = jcm.b().c(supineLegAchieveType.getPicPath())) != null) {
                this.f39067a.put(Integer.valueOf(supineLegAchieveType.getContinuesTimes()), bitmapC);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        ImageView imageView;
        super.startAnimation();
        LogUtil.a("Track_SupineLegEncourageAnimHelper", "startAnimation score:", this.d, Boolean.valueOf(this.f39068b == null));
        Bitmap bitmap = this.f39067a.get(this.d);
        if (bitmap == null || (imageView = this.f39068b) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
        this.f39068b.setVisibility(0);
        AnimatorSet animatorSetF = jqi.f();
        animatorSetF.setTarget(this.f39068b);
        animatorSetF.start();
        this.e.removeMessages(1);
        Handler handler = this.e;
        handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_SupineLegEncourageAnimHelper", "startAnimation input data is null, pls check.");
        } else {
            this.d = obj;
            startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView = this.f39068b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    static class e extends BaseHandler<jui> {
        e(Looper looper, jui juiVar) {
            super(looper, juiVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jui juiVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_SupineLegEncourageAnimHelper", "handleMessage message is null");
            } else if (message.what == 1) {
                juiVar.e();
            }
        }
    }
}
