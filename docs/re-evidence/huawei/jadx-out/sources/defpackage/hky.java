package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper;
import com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class hky extends BaseActionDetailPlayerStrategy implements PlayerHelper.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36864c;
    private Motion d;

    public hky(HeaderViewInterface headerViewInterface, Motion motion, String str) {
        super(headerViewInterface);
        this.d = motion;
        this.f36864c = str;
        initMediaPlayer();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void startPlayer() {
        Motion motion = this.d;
        if (motion == null) {
            return;
        }
        if (njy.c(motion.getVideoSegments(), 0)) {
            if (this.d.getVideoSegments().get(0) == null) {
                return;
            }
            this.f36862a = (int) this.d.getVideoSegments().get(0).getStartTime();
            this.f36863b = (int) this.d.getVideoSegments().get(0).getEndTime();
        }
        if (this.mMediaHelper instanceof LongMediaHelper) {
            LongMediaHelper longMediaHelper = (LongMediaHelper) this.mMediaHelper;
            longMediaHelper.start();
            longMediaHelper.a(this.f36862a);
            b(longMediaHelper, this.f36862a, this.f36863b);
            setIsMediaPlayerStarted(true);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void pauseVideo() {
        super.pauseVideo();
        if (this.mMediaHelper.o() && isMediaPlayerStarted()) {
            this.mMediaHelper.pause();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void onResume() {
        super.onResume();
        if (this.mMediaHelper == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "onResume mMediaHelper is null");
        } else if (!getIsShowMediaPlayer()) {
            startPlayer();
        } else {
            if (this.mMediaHelper.o()) {
                return;
            }
            this.mMediaHelper.videoContinue();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void initMediaPlayer() {
        if (this.mMediaHelper == null) {
            this.mMediaHelper = new LongMediaHelper(BaseApplication.getContext());
            setSurfaceTextureListener(this);
        }
        if (!isNetWorkConnected()) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "initializationMediaPlayer no network connected");
            return;
        }
        if (!isDisplayedNoWifi() && !wifiOrNot()) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "initializationMediaPlayer no wifi connected");
            setIsDisplayedNoWifi(true);
            return;
        }
        refreshHeaderView(5);
        if (TextUtils.isEmpty(this.f36864c)) {
            return;
        }
        this.mMediaHelper.setMediaSources(Uri.parse(this.f36864c));
        a();
    }

    private void a() {
        if (!(this.mMediaHelper instanceof LongMediaHelper)) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "setMediaLongVideoListener mMediaHelper is null");
        } else {
            ((LongMediaHelper) this.mMediaHelper).e(this);
        }
    }

    private void b(final LongMediaHelper longMediaHelper, final int i, final int i2) {
        if (getHandler() == null) {
            return;
        }
        getHandler().post(new Runnable() { // from class: hky.4
            @Override // java.lang.Runnable
            public void run() {
                int i3 = i2;
                if (i3 <= 0) {
                    return;
                }
                if (hky.this.d(longMediaHelper, i3)) {
                    longMediaHelper.a(i);
                }
                hky.this.getHandler().postDelayed(this, 1000L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(LongMediaHelper longMediaHelper, int i) {
        return longMediaHelper != null && longMediaHelper.j() >= i && longMediaHelper.o();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.a("Suggestion_ActionDetailPlayerLongVideoStrategy", "onSurfaceTextureAvailable start");
        if (this.mMediaHelper == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "onSurfaceTextureAvailable mMediaHelper is null");
        } else {
            this.mMediaHelper.d(new Surface(surfaceTexture));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.mMediaHelper == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "onSurfaceTextureDestroyed mMediaHelper is null");
            return false;
        }
        setIsMediaPlayerStarted(false);
        this.mMediaHelper.release();
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void releasePlayer() {
        super.releasePlayer();
        setIsMediaPlayerStarted(false);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onPrepared() {
        LogUtil.a("Suggestion_ActionDetailPlayerLongVideoStrategy", "setMediaLongVideoListener onPrepared");
        if (!getIsForeGround()) {
            LogUtil.j("Suggestion_ActionDetailPlayerLongVideoStrategy", "setMediaLongVideoListener--isActivityForGround:", false);
        } else {
            startPlayer();
            LogUtil.a("Suggestion_ActionDetailPlayerLongVideoStrategy", "setMediaLongVideoListener--isActivityForGround:", true);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onBufferingStart() {
        LogUtil.a("Suggestion_ActionDetailPlayerLongVideoStrategy", "long Video buffering start");
        refreshHeaderView(5);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onBufferingEnd() {
        LogUtil.a("Suggestion_ActionDetailPlayerLongVideoStrategy", "long video buffering end");
        refreshHeaderView(6);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onSeekComplete() {
        LogUtil.a("Suggestion_ActionDetailPlayerLongVideoStrategy", "long video seek complete");
        if (this.f36862a == 0) {
            refreshHeaderView(6);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onVideoError() {
        LogUtil.e("Suggestion_ActionDetailPlayerLongVideoStrategy", "onVideoError");
    }
}
