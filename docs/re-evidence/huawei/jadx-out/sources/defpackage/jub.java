package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jub extends AnimBaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39046c;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public boolean isAnimRunning() {
        return false;
    }

    public jub(View view) {
        super(view);
        this.f39046c = false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void initResource() throws Throwable {
        if (this.f39046c) {
            return;
        }
        this.f39046c = true;
        if (this.mAnimContainer == null) {
            LogUtil.j("Track_SkipRippleAnimHelper", "initResource mAnimContainer is null, pls check.");
            return;
        }
        ImageView imageView = (ImageView) this.mAnimContainer.findViewById(R.id.skip_animation_img);
        String strB = jcp.d().b("pic_ripple_big", "png");
        LogUtil.a("Track_SkipRippleAnimHelper", "pic_ripple_big imagePath: ", strB);
        Bitmap bitmapD = jcp.d().d(strB);
        if (bitmapD == null || imageView == null) {
            return;
        }
        imageView.setImageBitmap(bitmapD);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation() {
        super.startAnimation();
        if (this.mAnimContainer == null) {
            LogUtil.j("Track_SkipRippleAnimHelper", "startAnimation mAnimContainer is null, pls check.");
            return;
        }
        this.mAnimContainer.setTranslationX(this.f39045b - ((this.mAnimContainer.getWidth() / 2) + this.mAnimContainer.getLeft()));
        this.mAnimContainer.setTranslationY(this.f39044a - ((this.mAnimContainer.getHeight() / 2) + this.mAnimContainer.getTop()));
        this.mAnimContainer.setVisibility(0);
        AnimatorSet animatorSetH = jqi.h();
        animatorSetH.setTarget(this.mAnimContainer);
        animatorSetH.start();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.AnimBaseHelper
    public void startAnimation(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            this.f39045b = ((Float) pair.first).intValue();
            this.f39044a = ((Float) pair.second).intValue();
            startAnimation();
        }
    }
}
