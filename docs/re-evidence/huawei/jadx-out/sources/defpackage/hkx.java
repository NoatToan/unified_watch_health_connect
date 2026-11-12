package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class hkx extends BaseActionDetailPlayerStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Motion f36860a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36861c;

    public hkx(HeaderViewInterface headerViewInterface, String str, Motion motion) {
        super(headerViewInterface);
        this.f36861c = str;
        this.f36860a = motion;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void initMediaPlayer() {
        if (getIsShowMediaPlayer()) {
            d();
            return;
        }
        refreshHeaderView(0);
        showCoachImage();
        LogUtil.a("Suggestion_ActionDetailPlayerShortVideoStrategy", "initializationMediaPlayer video not ready");
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void startPlayer() {
        if (this.mMediaHelper == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerShortVideoStrategy", "startPlayer mMediaHelper is null");
        } else {
            this.mMediaHelper.start();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.mMediaHelper == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerShortVideoStrategy", "onSurfaceTextureAvailable mMediaHelper is null");
            return;
        }
        this.mMediaHelper.d(new Surface(surfaceTexture));
        startPlayer();
        LogUtil.a("Suggestion_ActionDetailPlayerShortVideoStrategy", "setMediaLongVideoListener onSurfaceTextureAvailable IsActivityForGround start");
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.mMediaHelper == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerShortVideoStrategy", "onSurfaceTextureDestroyed mMediaHelper is null");
            return false;
        }
        this.mMediaHelper.release();
        return false;
    }

    private void d() {
        refreshHeaderView(7);
        setSurfaceTextureListener(this);
        this.mMediaHelper = new MediaHelper();
        this.mMediaHelper.b(this.f36861c);
        this.mMediaHelper.setSdSources(this.f36860a.acquireMotionPath());
    }
}
