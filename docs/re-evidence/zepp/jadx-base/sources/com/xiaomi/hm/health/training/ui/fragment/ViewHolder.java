package com.xiaomi.hm.health.training.ui.fragment;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.loc.z;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.widget.RealTimeHrView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\u0007\u0010\u0092\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0093\u0001\u0010 R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010)\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\"\u00109\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\"\u0010=\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010E\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\"\u0010Q\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010,\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\"\u0010Y\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010\u001c\u001a\u0004\bW\u0010\u001e\"\u0004\bX\u0010 R\"\u0010]\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u001c\u001a\u0004\b[\u0010\u001e\"\u0004\b\\\u0010 R\"\u0010a\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010L\u001a\u0004\b_\u0010N\"\u0004\b`\u0010PR\"\u0010e\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010\u001c\u001a\u0004\bc\u0010\u001e\"\u0004\bd\u0010 R\"\u0010i\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010\u001c\u001a\u0004\bg\u0010\u001e\"\u0004\bh\u0010 R\"\u0010m\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010L\u001a\u0004\bk\u0010N\"\u0004\bl\u0010PR\"\u0010q\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010\u001c\u001a\u0004\bo\u0010\u001e\"\u0004\bp\u0010 R\"\u0010u\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010\u001c\u001a\u0004\bs\u0010\u001e\"\u0004\bt\u0010 R\"\u0010y\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010\u001c\u001a\u0004\bw\u0010\u001e\"\u0004\bx\u0010 R\"\u0010}\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bz\u0010,\u001a\u0004\b{\u0010.\"\u0004\b|\u00100R$\u0010\u0081\u0001\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b~\u0010,\u001a\u0004\b\u007f\u0010.\"\u0005\b\u0080\u0001\u00100R&\u0010\u0085\u0001\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010@\u001a\u0005\b\u0083\u0001\u0010B\"\u0005\b\u0084\u0001\u0010DR*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R&\u0010\u0091\u0001\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010\u001c\u001a\u0005\b\u008f\u0001\u0010\u001e\"\u0005\b\u0090\u0001\u0010 ¨\u0006\u0094\u0001"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/fragment/ViewHolder;", "", "Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;", "a", "Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;", "getAspectRatioFrame$trainingcomponent_midongRelease", "()Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;", "setAspectRatioFrame$trainingcomponent_midongRelease", "(Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;)V", "aspectRatioFrame", "Landroid/view/SurfaceView;", "b", "Landroid/view/SurfaceView;", "getVideoSurface$trainingcomponent_midongRelease", "()Landroid/view/SurfaceView;", "setVideoSurface$trainingcomponent_midongRelease", "(Landroid/view/SurfaceView;)V", "videoSurface", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "getBufferingProgress$trainingcomponent_midongRelease", "()Landroid/widget/ProgressBar;", "setBufferingProgress$trainingcomponent_midongRelease", "(Landroid/widget/ProgressBar;)V", "bufferingProgress", "Landroid/view/View;", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "getTopMask$trainingcomponent_midongRelease", "()Landroid/view/View;", "setTopMask$trainingcomponent_midongRelease", "(Landroid/view/View;)V", "topMask", "e", "getBottomMask$trainingcomponent_midongRelease", "setBottomMask$trainingcomponent_midongRelease", "bottomMask", "f", "getMiddleMask$trainingcomponent_midongRelease", "setMiddleMask$trainingcomponent_midongRelease", "middleMask", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "getTitle$trainingcomponent_midongRelease", "()Landroid/widget/TextView;", "setTitle$trainingcomponent_midongRelease", "(Landroid/widget/TextView;)V", "title", "h", "getBtnClose$trainingcomponent_midongRelease", "setBtnClose$trainingcomponent_midongRelease", "btnClose", "i", "getBtnSettings$trainingcomponent_midongRelease", "setBtnSettings$trainingcomponent_midongRelease", "btnSettings", z.j, "getBuyPrompt$trainingcomponent_midongRelease", "setBuyPrompt$trainingcomponent_midongRelease", "buyPrompt", "Landroid/widget/ImageView;", hl.k, "Landroid/widget/ImageView;", "getBtnPlay$trainingcomponent_midongRelease", "()Landroid/widget/ImageView;", "setBtnPlay$trainingcomponent_midongRelease", "(Landroid/widget/ImageView;)V", "btnPlay", "l", "getBtnLock$trainingcomponent_midongRelease", "setBtnLock$trainingcomponent_midongRelease", "btnLock", "Landroid/widget/SeekBar;", "m", "Landroid/widget/SeekBar;", "getVideoSeekBar$trainingcomponent_midongRelease", "()Landroid/widget/SeekBar;", "setVideoSeekBar$trainingcomponent_midongRelease", "(Landroid/widget/SeekBar;)V", "videoSeekBar", GoogleApiAvailabilityLight.b, "getCurrentTime$trainingcomponent_midongRelease", "setCurrentTime$trainingcomponent_midongRelease", "currentTime", "o", "getBrightnessHeader$trainingcomponent_midongRelease", "setBrightnessHeader$trainingcomponent_midongRelease", "brightnessHeader", com.google.android.exoplayer2.text.ttml.b.r, "getBrightnessMaxIcon$trainingcomponent_midongRelease", "setBrightnessMaxIcon$trainingcomponent_midongRelease", "brightnessMaxIcon", DTransferConstants.SEARCH_KEY, "getBrightnessSeekBar$trainingcomponent_midongRelease", "setBrightnessSeekBar$trainingcomponent_midongRelease", "brightnessSeekBar", "r", "getVolumeHeader$trainingcomponent_midongRelease", "setVolumeHeader$trainingcomponent_midongRelease", "volumeHeader", SOAP.XMLNS, "getVolumeMaxIcon$trainingcomponent_midongRelease", "setVolumeMaxIcon$trainingcomponent_midongRelease", "volumeMaxIcon", "t", "getVolumeSeekBar$trainingcomponent_midongRelease", "setVolumeSeekBar$trainingcomponent_midongRelease", "volumeSeekBar", "u", "getInterceptClickMask$trainingcomponent_midongRelease", "setInterceptClickMask$trainingcomponent_midongRelease", "interceptClickMask", "v", "getBtnReplay$trainingcomponent_midongRelease", "setBtnReplay$trainingcomponent_midongRelease", "btnReplay", "w", "getBtnNext$trainingcomponent_midongRelease", "setBtnNext$trainingcomponent_midongRelease", "btnNext", "x", "getBtnReplayText$trainingcomponent_midongRelease", "setBtnReplayText$trainingcomponent_midongRelease", "btnReplayText", "y", "getBtnNextText$trainingcomponent_midongRelease", "setBtnNextText$trainingcomponent_midongRelease", "btnNextText", "z", "getPost$trainingcomponent_midongRelease", "setPost$trainingcomponent_midongRelease", DataItem.HTTP_METHOD_POST, "Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView;", "getRealTimeHr$trainingcomponent_midongRelease", "()Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView;", "setRealTimeHr$trainingcomponent_midongRelease", "(Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView;)V", "realTimeHr", "B", "getHrInitialDesc$trainingcomponent_midongRelease", "setHrInitialDesc$trainingcomponent_midongRelease", "hrInitialDesc", ViewHierarchyConstants.VIEW_KEY, "<init>", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ViewHolder {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private RealTimeHrView realTimeHr;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private View hrInitialDesc;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private AspectRatioFrameLayout aspectRatioFrame;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private SurfaceView videoSurface;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ProgressBar bufferingProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private View topMask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private View bottomMask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private View middleMask;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private TextView title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private View btnClose;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private View btnSettings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private TextView buyPrompt;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private ImageView btnPlay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private ImageView btnLock;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private SeekBar videoSeekBar;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private TextView currentTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private View brightnessHeader;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private View brightnessMaxIcon;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private SeekBar brightnessSeekBar;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private View volumeHeader;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private View volumeMaxIcon;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private SeekBar volumeSeekBar;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private View interceptClickMask;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private View btnReplay;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private View btnNext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private TextView btnReplayText;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private TextView btnNextText;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private ImageView post;

    public ViewHolder(@NotNull View view) {
        this.aspectRatioFrame = (AspectRatioFrameLayout) view.findViewById(R.id.aspect_ratio_frame);
        this.videoSurface = (SurfaceView) view.findViewById(R.id.video_surface);
        this.bufferingProgress = (ProgressBar) view.findViewById(R.id.video_buffering_progress);
        this.topMask = view.findViewById(R.id.top_mask);
        this.bottomMask = view.findViewById(R.id.bottom_mask);
        this.middleMask = view.findViewById(R.id.middle_mask);
        this.title = (TextView) view.findViewById(R.id.title);
        this.btnClose = view.findViewById(R.id.btn_close);
        this.btnSettings = view.findViewById(R.id.btn_settings);
        this.buyPrompt = (TextView) view.findViewById(R.id.purchase_prompt);
        this.btnPlay = (ImageView) view.findViewById(R.id.btn_play);
        this.btnLock = (ImageView) view.findViewById(R.id.btn_lock);
        this.videoSeekBar = (SeekBar) view.findViewById(R.id.video_seek_bar);
        this.currentTime = (TextView) view.findViewById(R.id.current_time);
        this.brightnessHeader = view.findViewById(R.id.brightness_header);
        this.brightnessMaxIcon = view.findViewById(R.id.brightness_max_icon);
        this.brightnessSeekBar = (SeekBar) view.findViewById(R.id.brightness_seek_bar);
        this.volumeHeader = view.findViewById(R.id.volume_header);
        this.volumeMaxIcon = view.findViewById(R.id.volume_max_icon);
        this.volumeSeekBar = (SeekBar) view.findViewById(R.id.volume_seek_bar);
        this.interceptClickMask = view.findViewById(R.id.intercept_click_mask);
        this.btnReplay = view.findViewById(R.id.btn_replay);
        this.btnNext = view.findViewById(R.id.btn_next);
        this.btnReplayText = (TextView) view.findViewById(R.id.btn_replay_text);
        this.btnNextText = (TextView) view.findViewById(R.id.btn_next_text);
        this.post = (ImageView) view.findViewById(R.id.post);
        this.realTimeHr = (RealTimeHrView) view.findViewById(R.id.real_time_hr);
        this.hrInitialDesc = view.findViewById(R.id.hr_initial_desc);
    }

    @NotNull
    /* JADX INFO: renamed from: getAspectRatioFrame$trainingcomponent_midongRelease, reason: from getter */
    public final AspectRatioFrameLayout getAspectRatioFrame() {
        return this.aspectRatioFrame;
    }

    @NotNull
    /* JADX INFO: renamed from: getBottomMask$trainingcomponent_midongRelease, reason: from getter */
    public final View getBottomMask() {
        return this.bottomMask;
    }

    @NotNull
    /* JADX INFO: renamed from: getBrightnessHeader$trainingcomponent_midongRelease, reason: from getter */
    public final View getBrightnessHeader() {
        return this.brightnessHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: getBrightnessMaxIcon$trainingcomponent_midongRelease, reason: from getter */
    public final View getBrightnessMaxIcon() {
        return this.brightnessMaxIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: getBrightnessSeekBar$trainingcomponent_midongRelease, reason: from getter */
    public final SeekBar getBrightnessSeekBar() {
        return this.brightnessSeekBar;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnClose$trainingcomponent_midongRelease, reason: from getter */
    public final View getBtnClose() {
        return this.btnClose;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnLock$trainingcomponent_midongRelease, reason: from getter */
    public final ImageView getBtnLock() {
        return this.btnLock;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnNext$trainingcomponent_midongRelease, reason: from getter */
    public final View getBtnNext() {
        return this.btnNext;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnNextText$trainingcomponent_midongRelease, reason: from getter */
    public final TextView getBtnNextText() {
        return this.btnNextText;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnPlay$trainingcomponent_midongRelease, reason: from getter */
    public final ImageView getBtnPlay() {
        return this.btnPlay;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnReplay$trainingcomponent_midongRelease, reason: from getter */
    public final View getBtnReplay() {
        return this.btnReplay;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnReplayText$trainingcomponent_midongRelease, reason: from getter */
    public final TextView getBtnReplayText() {
        return this.btnReplayText;
    }

    @NotNull
    /* JADX INFO: renamed from: getBtnSettings$trainingcomponent_midongRelease, reason: from getter */
    public final View getBtnSettings() {
        return this.btnSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: getBufferingProgress$trainingcomponent_midongRelease, reason: from getter */
    public final ProgressBar getBufferingProgress() {
        return this.bufferingProgress;
    }

    @NotNull
    /* JADX INFO: renamed from: getBuyPrompt$trainingcomponent_midongRelease, reason: from getter */
    public final TextView getBuyPrompt() {
        return this.buyPrompt;
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentTime$trainingcomponent_midongRelease, reason: from getter */
    public final TextView getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    /* JADX INFO: renamed from: getHrInitialDesc$trainingcomponent_midongRelease, reason: from getter */
    public final View getHrInitialDesc() {
        return this.hrInitialDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: getInterceptClickMask$trainingcomponent_midongRelease, reason: from getter */
    public final View getInterceptClickMask() {
        return this.interceptClickMask;
    }

    @NotNull
    /* JADX INFO: renamed from: getMiddleMask$trainingcomponent_midongRelease, reason: from getter */
    public final View getMiddleMask() {
        return this.middleMask;
    }

    @NotNull
    /* JADX INFO: renamed from: getPost$trainingcomponent_midongRelease, reason: from getter */
    public final ImageView getPost() {
        return this.post;
    }

    @NotNull
    /* JADX INFO: renamed from: getRealTimeHr$trainingcomponent_midongRelease, reason: from getter */
    public final RealTimeHrView getRealTimeHr() {
        return this.realTimeHr;
    }

    @NotNull
    /* JADX INFO: renamed from: getTitle$trainingcomponent_midongRelease, reason: from getter */
    public final TextView getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: getTopMask$trainingcomponent_midongRelease, reason: from getter */
    public final View getTopMask() {
        return this.topMask;
    }

    @NotNull
    /* JADX INFO: renamed from: getVideoSeekBar$trainingcomponent_midongRelease, reason: from getter */
    public final SeekBar getVideoSeekBar() {
        return this.videoSeekBar;
    }

    @NotNull
    /* JADX INFO: renamed from: getVideoSurface$trainingcomponent_midongRelease, reason: from getter */
    public final SurfaceView getVideoSurface() {
        return this.videoSurface;
    }

    @NotNull
    /* JADX INFO: renamed from: getVolumeHeader$trainingcomponent_midongRelease, reason: from getter */
    public final View getVolumeHeader() {
        return this.volumeHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: getVolumeMaxIcon$trainingcomponent_midongRelease, reason: from getter */
    public final View getVolumeMaxIcon() {
        return this.volumeMaxIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: getVolumeSeekBar$trainingcomponent_midongRelease, reason: from getter */
    public final SeekBar getVolumeSeekBar() {
        return this.volumeSeekBar;
    }

    public final void setAspectRatioFrame$trainingcomponent_midongRelease(@NotNull AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.aspectRatioFrame = aspectRatioFrameLayout;
    }

    public final void setBottomMask$trainingcomponent_midongRelease(@NotNull View view) {
        this.bottomMask = view;
    }

    public final void setBrightnessHeader$trainingcomponent_midongRelease(@NotNull View view) {
        this.brightnessHeader = view;
    }

    public final void setBrightnessMaxIcon$trainingcomponent_midongRelease(@NotNull View view) {
        this.brightnessMaxIcon = view;
    }

    public final void setBrightnessSeekBar$trainingcomponent_midongRelease(@NotNull SeekBar seekBar) {
        this.brightnessSeekBar = seekBar;
    }

    public final void setBtnClose$trainingcomponent_midongRelease(@NotNull View view) {
        this.btnClose = view;
    }

    public final void setBtnLock$trainingcomponent_midongRelease(@NotNull ImageView imageView) {
        this.btnLock = imageView;
    }

    public final void setBtnNext$trainingcomponent_midongRelease(@NotNull View view) {
        this.btnNext = view;
    }

    public final void setBtnNextText$trainingcomponent_midongRelease(@NotNull TextView textView) {
        this.btnNextText = textView;
    }

    public final void setBtnPlay$trainingcomponent_midongRelease(@NotNull ImageView imageView) {
        this.btnPlay = imageView;
    }

    public final void setBtnReplay$trainingcomponent_midongRelease(@NotNull View view) {
        this.btnReplay = view;
    }

    public final void setBtnReplayText$trainingcomponent_midongRelease(@NotNull TextView textView) {
        this.btnReplayText = textView;
    }

    public final void setBtnSettings$trainingcomponent_midongRelease(@NotNull View view) {
        this.btnSettings = view;
    }

    public final void setBufferingProgress$trainingcomponent_midongRelease(@NotNull ProgressBar progressBar) {
        this.bufferingProgress = progressBar;
    }

    public final void setBuyPrompt$trainingcomponent_midongRelease(@NotNull TextView textView) {
        this.buyPrompt = textView;
    }

    public final void setCurrentTime$trainingcomponent_midongRelease(@NotNull TextView textView) {
        this.currentTime = textView;
    }

    public final void setHrInitialDesc$trainingcomponent_midongRelease(@NotNull View view) {
        this.hrInitialDesc = view;
    }

    public final void setInterceptClickMask$trainingcomponent_midongRelease(@NotNull View view) {
        this.interceptClickMask = view;
    }

    public final void setMiddleMask$trainingcomponent_midongRelease(@NotNull View view) {
        this.middleMask = view;
    }

    public final void setPost$trainingcomponent_midongRelease(@NotNull ImageView imageView) {
        this.post = imageView;
    }

    public final void setRealTimeHr$trainingcomponent_midongRelease(@NotNull RealTimeHrView realTimeHrView) {
        this.realTimeHr = realTimeHrView;
    }

    public final void setTitle$trainingcomponent_midongRelease(@NotNull TextView textView) {
        this.title = textView;
    }

    public final void setTopMask$trainingcomponent_midongRelease(@NotNull View view) {
        this.topMask = view;
    }

    public final void setVideoSeekBar$trainingcomponent_midongRelease(@NotNull SeekBar seekBar) {
        this.videoSeekBar = seekBar;
    }

    public final void setVideoSurface$trainingcomponent_midongRelease(@NotNull SurfaceView surfaceView) {
        this.videoSurface = surfaceView;
    }

    public final void setVolumeHeader$trainingcomponent_midongRelease(@NotNull View view) {
        this.volumeHeader = view;
    }

    public final void setVolumeMaxIcon$trainingcomponent_midongRelease(@NotNull View view) {
        this.volumeMaxIcon = view;
    }

    public final void setVolumeSeekBar$trainingcomponent_midongRelease(@NotNull SeekBar seekBar) {
        this.volumeSeekBar = seekBar;
    }
}
