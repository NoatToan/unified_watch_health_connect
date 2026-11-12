package com.xiaomi.fitness.detail.video.share.holder;

import android.media.MediaPlayer;
import android.media.VolumeShaper;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.maps.AMap;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.detail.video.share.holder.SwitchMusicPanelHolder;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.KeyboardUtil;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.view.SportTraceDataView;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.hqp;
import defpackage.okp;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u001a\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0#\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0#¢\u0006\u0004\bC\u0010DJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0010\u001a\u00020\u00052!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\tJ\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\tR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "", "Landroid/media/MediaPlayer;", "", "isLoop", "", StatConstants.PARAM_START, "(Landroid/media/MediaPlayer;Z)V", "initHolder", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeId", "callback", "setOnTraceStyleItemClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "refreshMusicList", "reset", "", "duration", "playMusic", "(ZJ)V", "stopMusic", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lhqp;", "mBinding", "Lhqp;", "getMBinding", "()Lhqp;", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "curtProgressLiveData", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "Landroid/widget/ImageView;", "backBtn", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;", "traceStyleHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;", "getTraceStyleHolder", "()Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;", "setTraceStyleHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;)V", "Landroid/media/VolumeShaper;", "volumeShaper", "Landroid/media/VolumeShaper;", "getVolumeShaper", "()Landroid/media/VolumeShaper;", "setVolumeShaper", "(Landroid/media/VolumeShaper;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lhqp;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SwitchMusicPanelHolder {

    @Nullable
    private ImageView backBtn;

    @NotNull
    private final BaseActivity context;

    @NotNull
    private final MutableLiveData<Float> curtProgressLiveData;

    @NotNull
    private final hqp mBinding;

    @Nullable
    private MediaPlayer mediaPlayer;

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData;
    public MusicStyleHolder traceStyleHolder;

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData;

    @Nullable
    private VolumeShaper volumeShaper;

    public SwitchMusicPanelHolder(@NotNull BaseActivity context, @NotNull hqp mBinding, @NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData, @NotNull MutableLiveData<Float> curtProgressLiveData, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(traceDataMapLiveData, "traceDataMapLiveData");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        this.context = context;
        this.mBinding = mBinding;
        this.traceDataMapLiveData = traceDataMapLiveData;
        this.curtProgressLiveData = curtProgressLiveData;
        this.traceStyleResModeLiveData = traceStyleResModeLiveData;
        this.backBtn = mBinding.N.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$0(SwitchMusicPanelHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        TabLayout tabLayout = this$0.mBinding.O.A;
        tabLayout.F(tabLayout.x(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$1(SwitchMusicPanelHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ConstraintLayout editPanel = this$0.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
        ViewExtKt.gone(editPanel);
        SportTraceDataView sportTrackDataView = this$0.mBinding.L;
        Intrinsics.checkNotNullExpressionValue(sportTrackDataView, "sportTrackDataView");
        ViewExtKt.visible(sportTrackDataView);
        this$0.mBinding.G.setVisibility(0);
        KeyboardUtil.INSTANCE.showSoftInputMethod(this$0.context, this$0.mBinding.B, false);
        this$0.stopMusic();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void playMusic$default(SwitchMusicPanelHolder switchMusicPanelHolder, boolean z, long j, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            j = -1;
        }
        switchMusicPanelHolder.playMusic(z, j);
    }

    private final void start(MediaPlayer mediaPlayer, boolean z) throws IOException {
        mediaPlayer.setDataSource(getTraceStyleHolder().getSelectMusic());
        try {
            mediaPlayer.prepare();
            if (z) {
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: rro
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        SwitchMusicPanelHolder.start$lambda$5(mediaPlayer2);
                    }
                });
            }
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$5(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    @NotNull
    public final BaseActivity getContext() {
        return this.context;
    }

    @NotNull
    public final hqp getMBinding() {
        return this.mBinding;
    }

    @Nullable
    public final MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    @NotNull
    public final MusicStyleHolder getTraceStyleHolder() {
        MusicStyleHolder musicStyleHolder = this.traceStyleHolder;
        if (musicStyleHolder != null) {
            return musicStyleHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("traceStyleHolder");
        return null;
    }

    @Nullable
    public final VolumeShaper getVolumeShaper() {
        return this.volumeShaper;
    }

    public final void initHolder() {
        BaseActivity baseActivity = this.context;
        AMap map = this.mBinding.D.getMap();
        Intrinsics.checkNotNullExpressionValue(map, "getMap(...)");
        okp traceStyle = this.mBinding.N.F;
        Intrinsics.checkNotNullExpressionValue(traceStyle, "traceStyle");
        ImageView done = this.mBinding.N.C;
        Intrinsics.checkNotNullExpressionValue(done, "done");
        ConstraintLayout editPanel = this.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
        setTraceStyleHolder(new MusicStyleHolder(baseActivity, map, traceStyle, done, editPanel, this.traceStyleResModeLiveData));
        getTraceStyleHolder().initHolder(this);
        getTraceStyleHolder().defaultDownload();
        ImageView imageView = this.backBtn;
        if (imageView != null) {
            ViewExtKt.clickWithTrigger$default(imageView, 0L, new Function1() { // from class: pro
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SwitchMusicPanelHolder.initHolder$lambda$0(this.f30686a, (ImageView) obj);
                }
            }, 1, null);
        }
        ViewExtKt.clickWithTrigger$default(this.mBinding.N.C, 0L, new Function1() { // from class: qro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchMusicPanelHolder.initHolder$lambda$1(this.f31781a, (ImageView) obj);
            }
        }, 1, null);
        this.mBinding.N.E.setText("音乐");
    }

    public final void playMusic(boolean isLoop, long duration) throws IOException {
        if (getTraceStyleHolder().getSelectMusic().length() == 0) {
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            start(mediaPlayer2, isLoop);
            this.mediaPlayer = mediaPlayer2;
        } else {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer3 = this.mediaPlayer;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.stop();
                }
                MediaPlayer mediaPlayer4 = this.mediaPlayer;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.seekTo(0);
                }
            }
            MediaPlayer mediaPlayer5 = this.mediaPlayer;
            if (mediaPlayer5 != null) {
                start(mediaPlayer5, isLoop);
            }
        }
        if (duration != -1) {
            VolumeShaper.Configuration configurationBuild = new VolumeShaper.Configuration.Builder().setDuration(duration).setCurve(new float[]{0.0f, 0.91f, 0.92f, 0.93f, 0.94f, 0.95f, 0.96f, 0.97f, 1.0f}, new float[]{1.0f, 0.9f, 0.8f, 0.7f, 0.6f, 0.5f, 0.4f, 0.3f, 0.3f}).setInterpolatorType(1).build();
            Intrinsics.checkNotNullExpressionValue(configurationBuild, "build(...)");
            MediaPlayer mediaPlayer6 = this.mediaPlayer;
            if (mediaPlayer6 != null) {
                VolumeShaper volumeShaperCreateVolumeShaper = mediaPlayer6.createVolumeShaper(configurationBuild);
                this.volumeShaper = volumeShaperCreateVolumeShaper;
                Intrinsics.checkNotNull(volumeShaperCreateVolumeShaper);
                volumeShaperCreateVolumeShaper.apply(VolumeShaper.Operation.PLAY);
            }
        }
    }

    public final void refreshMusicList() {
        getTraceStyleHolder().refreshMusicList();
    }

    public final void reset() {
        getTraceStyleHolder().reset();
    }

    public final void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public final void setOnTraceStyleItemClickCallback(@NotNull Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getTraceStyleHolder().initAdapterOnClickCallback(callback);
    }

    public final void setTraceStyleHolder(@NotNull MusicStyleHolder musicStyleHolder) {
        Intrinsics.checkNotNullParameter(musicStyleHolder, "<set-?>");
        this.traceStyleHolder = musicStyleHolder;
    }

    public final void setVolumeShaper(@Nullable VolumeShaper volumeShaper) {
        this.volumeShaper = volumeShaper;
    }

    public final void stopMusic() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.mediaPlayer = null;
        getTraceStyleHolder().setSelectMusicId(0);
        VolumeShaper volumeShaper = this.volumeShaper;
        if (volumeShaper != null) {
            volumeShaper.close();
        }
    }
}
