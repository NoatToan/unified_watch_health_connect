package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper;
import com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface;
import com.huawei.health.suggestion.ui.view.ActionDetailView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Video;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class hkz extends BaseActionDetailPlayerStrategy implements PlayerHelper.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LongMediaHelper f36867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ActionDetailView f36869c;
    private SurfaceTexture d;
    private AtomicAction e;

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onBufferingEnd() {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onBufferingStart() {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onSeekComplete() {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onVideoError() {
    }

    static class e implements Runnable {
        private WeakReference<hkz> e;

        e(hkz hkzVar) {
            this.e = new WeakReference<>(hkzVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            hkz hkzVar = this.e.get();
            if (hkzVar != null) {
                hkzVar.d();
                LongMediaHelper longMediaHelper = hkzVar.f36867a;
                if (longMediaHelper != null) {
                    ActionDetailView actionDetailView = hkzVar.f36869c;
                    if (actionDetailView != null) {
                        int iL = longMediaHelper.l();
                        int iM = longMediaHelper.m();
                        ReleaseLogUtil.d("Suggestion_ActionDetailPlayerActionLibraryStrategy", "width: height:", Integer.valueOf(iL), ": ", Integer.valueOf(iM));
                        actionDetailView.e(iL, iM);
                        return;
                    }
                    return;
                }
                LogUtil.j("Suggestion_ActionDetailPlayerActionLibraryStrategy", "hideLoading mMediaHelper == null ");
            }
        }
    }

    public hkz(HeaderViewInterface headerViewInterface, AtomicAction atomicAction) {
        super(headerViewInterface);
        this.e = atomicAction;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void initMediaPlayer() {
        if (this.f36867a == null) {
            this.f36867a = new LongMediaHelper(btx.c());
            setSurfaceTextureListener(this);
        }
        if (isNetWorkConnected()) {
            if (!isDisplayedNoWifi() && !wifiOrNot()) {
                setIsDisplayedNoWifi(true);
            } else {
                refreshHeaderView(5);
                b(this.e.getExtendPropertyList("actionVideo", Video[].class));
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void startPlayer() {
        LongMediaHelper longMediaHelper = this.f36867a;
        if (longMediaHelper == null) {
            return;
        }
        longMediaHelper.start();
        setIsDisplayedNoWifi(true);
        setIsMediaPlayerStarted(true);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void pauseVideo() {
        super.pauseVideo();
        if (this.f36867a.o() && isMediaPlayerStarted()) {
            this.f36867a.pause();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void onResume() {
        if (this.f36867a != null && !getIsShowMediaPlayer()) {
            startPlayer();
            return;
        }
        LongMediaHelper longMediaHelper = this.f36867a;
        if (longMediaHelper == null || longMediaHelper.o()) {
            return;
        }
        this.f36867a.videoContinue();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy
    public void releasePlayer() {
        super.releasePlayer();
        this.d = null;
        if (this.f36867a != null) {
            setIsMediaPlayerStarted(false);
            this.f36867a.release();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ActionDetailView actionDetailView;
        SurfaceTexture surfaceTexture2 = this.d;
        if (surfaceTexture2 == null || (actionDetailView = this.f36869c) == null) {
            this.d = surfaceTexture;
            this.f36867a.d(new Surface(this.d));
        } else {
            actionDetailView.setVideoTextureView(surfaceTexture2);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        setIsMediaPlayerStarted(false);
        this.d = surfaceTexture;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (getHeaderView() == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerActionLibraryStrategy", " headerView is null");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: hkz.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (hkz.this.getHeaderView() != null) {
                    hkz.this.getHeaderView().setVisibility(8);
                }
            }
        });
        alphaAnimation.setDuration(150L);
        getHeaderView().startAnimation(alphaAnimation);
    }

    private void b(List<Video> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_ActionDetailPlayerActionLibraryStrategy", "getVideo videos can not null");
            return;
        }
        int iB = b();
        for (Video video : list) {
            if (video != null && video.getGender() == iB) {
                this.f36868b = video.getUrl();
                break;
            }
        }
        if (TextUtils.isEmpty(this.f36868b)) {
            Video video2 = list.get(0);
            if (video2 == null) {
                LogUtil.j("Suggestion_ActionDetailPlayerActionLibraryStrategy", "getVideo video can not null");
                return;
            }
            this.f36868b = video2.getUrl();
        }
        this.f36867a.setMediaSources(Uri.parse(this.f36868b));
        this.f36867a.a(true);
        this.f36867a.e(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private int b() {
        int iE;
        AtomicAction atomicAction = this.e;
        if (atomicAction != null) {
            String extendPropertyString = atomicAction.getExtendPropertyString("courseAttr");
            ReleaseLogUtil.d("Suggestion_ActionDetailPlayerActionLibraryStrategy", "getVideo courseAttr", extendPropertyString);
            if (TextUtils.isEmpty(extendPropertyString)) {
                iE = 2;
            } else {
                iE = CommonUtil.e(extendPropertyString, 2);
            }
        } else {
            iE = 2;
        }
        return iE != 2 ? iE : ied.e();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
    public void onPrepared() {
        startPlayer();
        getHandler().postDelayed(new e(this), 500L);
    }

    public void c(ActionDetailView actionDetailView) {
        if (actionDetailView == null) {
            LogUtil.j("Suggestion_ActionDetailPlayerActionLibraryStrategy", "setActionDetailView actionDetailView can not null");
        } else {
            this.f36869c = actionDetailView;
        }
    }
}
