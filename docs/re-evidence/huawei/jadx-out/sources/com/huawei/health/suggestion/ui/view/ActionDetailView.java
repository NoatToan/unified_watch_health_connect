package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxl;
import defpackage.hkx;
import defpackage.hky;
import defpackage.hkz;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ActionDetailView extends LinearLayout implements HeaderViewInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActionDetailContentView f10161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConstraintLayout f10162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f10163c;
    private ImageView d;
    private HealthTextView e;
    private HealthTextView f;
    private ImageView g;
    private RelativeLayout h;
    private LinearLayout i;
    private String j;
    private boolean k;
    private ViewGroup.MarginLayoutParams l;
    private ViewGroup.LayoutParams m;
    private boolean n;
    private RelativeLayout o;
    private HealthTextView p;
    private LinearLayout q;
    private HealthTextView r;
    private TextureView s;
    private BaseActionDetailPlayerStrategy t;
    private String w;
    private LinearLayout x;

    /* JADX INFO: loaded from: classes31.dex */
    public interface HeadStatus {
        public static final int LOADING = 0;
        public static final int LOADING_SUCCESS = 3;
        public static final int LONG_VIDEO_LOADING = 5;
        public static final int LONG_VIDEO_READY = 6;
        public static final int NO_NET = 2;
        public static final int NO_NETWORK = 8;
        public static final int NO_WIFI = 1;
        public static final int RESET_STATUS = 4;
        public static final int SHORT_VIDEO_READY = 7;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public void showCoachImage() {
    }

    public ActionDetailView(Context context) {
        super(context, null);
        this.n = true;
        this.k = true;
        c(context);
    }

    public ActionDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.k = true;
        c(context);
    }

    private void c(Context context) {
        LayoutInflater.from(context).inflate(R.layout.sug_action_detail, (ViewGroup) this, true);
        c();
    }

    private void c() {
        this.f10161a = (ActionDetailContentView) findViewById(R.id.sug_action_detail_content);
        this.h = (RelativeLayout) findViewById(R.id.sug_action_headView);
        this.s = (TextureView) findViewById(R.id.sug_action_video);
        this.d = (ImageView) findViewById(R.id.sug_action_close);
        this.i = (LinearLayout) findViewById(R.id.sug_downloading);
        this.q = (LinearLayout) findViewById(R.id.ll_nowifi);
        this.g = (ImageView) findViewById(R.id.iv_download);
        this.f = (HealthTextView) findViewById(R.id.tv_downloading_progress);
        this.e = (HealthTextView) findViewById(R.id.tv_audio_size);
        this.r = (HealthTextView) findViewById(R.id.tv_no_wifi_msg);
        this.f10163c = (ImageView) findViewById(R.id.sug_ation_video_pic);
        this.p = (HealthTextView) findViewById(R.id.tv_no_network_msg);
        this.o = (RelativeLayout) findViewById(R.id.sug_action_header_layout);
        this.f10162b = (ConstraintLayout) findViewById(R.id.sug_action_detail_layout);
        this.x = (LinearLayout) findViewById(R.id.sug_wound_blast_detail);
        t();
        fxl.e(10003, this.x);
    }

    private void t() {
        RelativeLayout relativeLayout;
        if (this.f10162b == null || (relativeLayout = this.o) == null) {
            LogUtil.j("Suggestion_ActionDetailView", "tahitiAdaptation mActionDetailLayout or mHeaderLayout is null");
            return;
        }
        this.m = relativeLayout.getLayoutParams();
        if (qrs.af(BaseApplication.getContext())) {
            setMarginParams(5);
        } else if (EnvironmentInfo.m()) {
            setMarginParams(3);
        } else {
            i();
        }
        this.o.setLayoutParams(this.m);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f10162b);
        constraintSet.connect(this.o.getId(), 6, this.f10162b.getId(), 6);
        constraintSet.connect(this.o.getId(), 7, this.f10162b.getId(), 7);
        constraintSet.applyTo(this.f10162b);
    }

    private void setMarginParams(int i) {
        float fA = new HealthColumnSystem(BaseApplication.getContext(), 0).a(i);
        ViewGroup.LayoutParams layoutParams = this.m;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.l = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            this.l = new ViewGroup.MarginLayoutParams(this.m);
        }
        this.l.width = (int) fA;
    }

    private void i() {
        ViewGroup.LayoutParams layoutParams = this.m;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.l = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            this.l = new ViewGroup.MarginLayoutParams(this.m);
        }
        this.l.width = BaseApplication.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    public void a() {
        t();
        ActionDetailContentView.d(this.f10161a.getContentLayout());
    }

    public View getDownloadView() {
        return this.g;
    }

    public View getCloseView() {
        return this.d;
    }

    public void setFitnessType(String str) {
        this.j = str;
    }

    public void a(AtomicAction atomicAction, int i, Motion motion) {
        if (i != 0 && motion != null && atomicAction == null) {
            atomicAction = a(motion);
        }
        this.f10161a.setContent(atomicAction);
        d(i, motion, atomicAction);
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.sug_action_detail_layout);
        constraintSet.clone(constraintLayout);
        if (motion != null) {
            constraintSet.setDimensionRatio(R.id.sug_action_header_layout, e(motion.acquireMotionPath()));
        }
        constraintSet.applyTo(constraintLayout);
        requestLayout();
    }

    public String e(String str) {
        if (str == null) {
            LogUtil.j("Suggestion_ActionDetailView", "getVideoRatio url null");
            return "h,16:9";
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (strExtractMetadata != null && !strExtractMetadata.equals(strExtractMetadata2)) {
                f();
                if (CommonUtil.j(strExtractMetadata) > 0 && CommonUtil.j(strExtractMetadata2) > 0) {
                    LogUtil.a("Suggestion_ActionDetailView", "getVideoRatio width:", strExtractMetadata, " height:", strExtractMetadata2);
                    String str2 = "h," + strExtractMetadata + ":" + strExtractMetadata2;
                    try {
                        return str2;
                    } catch (IOException e) {
                        return str2;
                    }
                }
            }
            try {
                return "w,1:1";
            } catch (IOException e2) {
                return "w,1:1";
            }
        } catch (IllegalArgumentException e3) {
            LogUtil.e("Suggestion_ActionDetailView", "MediaMetadataRetriever exception" + e3);
            try {
                return "w,1:1";
            } catch (IOException e4) {
                return "w,1:1";
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e5) {
                LogUtil.e("Suggestion_ActionDetailView", "getVideoRatio release exception:", ExceptionUtils.c(e5));
            }
        }
    }

    private void f() {
        ConstraintLayout constraintLayout = this.f10162b;
        if (constraintLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        e(layoutParams).setMargins(0, qrs.s(BaseApplication.getActivity()), 0, 0);
        this.f10162b.setLayoutParams(layoutParams);
    }

    public void e(int i, int i2) {
        String str;
        if (i == i2 || i == 0 || i2 == 0) {
            return;
        }
        f();
        if (i > 0 && i2 > 0) {
            LogUtil.a("Suggestion_ActionDetailView", "getVideoRatio width:", Integer.valueOf(i), " height:", Integer.valueOf(i2));
            str = "h," + i + ":" + i2;
        } else {
            str = "w,1:1";
        }
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.sug_action_detail_layout);
        if (constraintLayout == null) {
            LogUtil.j("Suggestion_ActionDetailView", "updateDimensionRatio constraintLayout == null");
            return;
        }
        constraintSet.clone(constraintLayout);
        constraintSet.setDimensionRatio(R.id.sug_action_header_layout, str);
        constraintSet.applyTo(constraintLayout);
        requestLayout();
    }

    private ViewGroup.MarginLayoutParams e(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    private AtomicAction a(Motion motion) {
        AtomicAction atomicAction = new AtomicAction();
        if (motion == null) {
            return atomicAction;
        }
        atomicAction.setName(motion.acquireName());
        atomicAction.putExtendProperty("actionStep", motion.getActionStep());
        atomicAction.putExtendProperty("introduceLyric", motion.getIntroduceLyric());
        atomicAction.putExtendProperty("breath", motion.getBreath());
        atomicAction.putExtendProperty("feeling", motion.getFeeling());
        atomicAction.putExtendProperty("commonError", motion.getCommonError());
        atomicAction.putExtendProperty("pictures", motion.getPictures());
        atomicAction.putExtendProperty("actionVideo", c(motion.getOriginLogo()));
        return atomicAction;
    }

    private List<Video> c(String str) {
        ArrayList arrayList = new ArrayList(1);
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        Video video = new Video();
        video.saveLogoImgUrl(str);
        arrayList.add(video);
        return arrayList;
    }

    private void d(int i, Motion motion, AtomicAction atomicAction) {
        if (i == 0) {
            e(atomicAction);
            return;
        }
        if (i == 1) {
            b(motion);
        } else if (i == 2) {
            e(motion);
        } else {
            LogUtil.j("Suggestion_ActionDetailView", "initializationPlayer videoType Not defined");
        }
    }

    private void e(AtomicAction atomicAction) {
        if (atomicAction == null) {
            LogUtil.j("Suggestion_ActionDetailView", "initActionLibraryPlayer mVideoPlayerStrategy or actionInfo is null");
            return;
        }
        hkz hkzVar = new hkz(this, atomicAction);
        this.t = hkzVar;
        if (hkzVar instanceof hkz) {
            hkzVar.c(this);
        }
    }

    public BaseActionDetailPlayerStrategy getVideoPlayerStrategy() {
        return this.t;
    }

    public void d() {
        BaseActionDetailPlayerStrategy baseActionDetailPlayerStrategy = this.t;
        if (baseActionDetailPlayerStrategy == null) {
            LogUtil.j("Suggestion_ActionDetailView", "onPause mVideoPlayerStrategy is null");
        } else {
            this.n = false;
            baseActionDetailPlayerStrategy.pauseVideo();
        }
    }

    public void b() {
        BaseActionDetailPlayerStrategy baseActionDetailPlayerStrategy = this.t;
        if (baseActionDetailPlayerStrategy == null) {
            LogUtil.j("Suggestion_ActionDetailView", "onResume mVideoPlayerStrategy is null");
        } else {
            this.n = true;
            baseActionDetailPlayerStrategy.onResume();
        }
    }

    private void b(Motion motion) {
        hkx hkxVar = new hkx(this, this.j, motion);
        this.t = hkxVar;
        hkxVar.initMediaPlayer();
        this.d.setVisibility(8);
    }

    private void e(Motion motion) {
        this.t = new hky(this, motion, this.w);
        this.d.setVisibility(8);
    }

    public void setLongVideoUrl(String str) {
        this.w = str;
    }

    public void setTvDownLoadingProgress(String str) {
        HealthTextView healthTextView = this.f;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public void setVideoTextureView(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        if (surfaceTexture == null || (textureView = this.s) == null) {
            LogUtil.j("Suggestion_ActionDetailView", "setVideoTextureView surfaceTexture or mVideoTextureView can not null");
        } else {
            textureView.setSurfaceTexture(surfaceTexture);
        }
    }

    public void setAudioSize(String str) {
        HealthTextView healthTextView = this.e;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    private boolean j() {
        return (this.s == null || this.f10163c == null || this.p == null || !(this.h != null && this.i != null && this.q != null)) ? false : true;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public void refreshHeaderView(int i) {
        if (j()) {
            LogUtil.a("Suggestion_ActionDetailView", "refreshHeaderView headStatus is: ", Integer.valueOf(i));
            switch (i) {
                case 0:
                    g();
                    break;
                case 1:
                    k();
                    break;
                case 2:
                    r();
                    break;
                case 3:
                    h();
                    break;
                case 4:
                    l();
                    break;
                case 5:
                    m();
                    break;
                case 6:
                case 7:
                    n();
                    break;
                case 8:
                    o();
                    break;
                default:
                    LogUtil.j("Suggestion_ActionDetailView", "refreshHeadView headStatus is nothing");
                    break;
            }
        }
    }

    private void n() {
        this.s.setVisibility(0);
        this.h.setVisibility(8);
        this.f10163c.setVisibility(8);
        this.p.setVisibility(8);
    }

    private void h() {
        this.i.setVisibility(8);
        this.q.setVisibility(8);
        this.p.setVisibility(8);
    }

    private void l() {
        this.h.setVisibility(8);
        this.f10163c.setVisibility(0);
        this.f10163c.setImageDrawable(new ColorDrawable(ContextCompat.getColor(BaseApplication.getContext(), com.huawei.ui.commonui.R.color.color_normal_titlebar_title)));
        this.p.setVisibility(8);
    }

    private void r() {
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.q.setVisibility(0);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        this.f10163c.setVisibility(0);
    }

    private void m() {
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.q.setVisibility(8);
        this.f10163c.setVisibility(8);
        this.p.setVisibility(8);
    }

    private void o() {
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.q.setVisibility(0);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        this.p.setVisibility(0);
        this.f10163c.setVisibility(0);
    }

    private void k() {
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.q.setVisibility(0);
        this.p.setVisibility(8);
        this.r.setVisibility(0);
        this.f10163c.setVisibility(0);
    }

    private void g() {
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        this.f10163c.setVisibility(0);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (this.s == null) {
            return;
        }
        LogUtil.j("Suggestion_ActionDetailView", "setSurfaceTextureListener:textureListener is:", surfaceTextureListener == null ? Constants.NULL : "not null");
        this.s.setSurfaceTextureListener(surfaceTextureListener);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public ImageView getCoachImageView() {
        return this.f10163c;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public View getHeaderView() {
        return this.h;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public boolean getIsShowMediaPlayer() {
        return this.k;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.HeaderViewInterface
    public boolean getIsForeGround() {
        return this.n;
    }

    public void setOnDownLoadViewClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.g;
        if (imageView == null || onClickListener == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnCloseImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void e() {
        BaseActionDetailPlayerStrategy baseActionDetailPlayerStrategy = this.t;
        if (baseActionDetailPlayerStrategy != null) {
            baseActionDetailPlayerStrategy.releasePlayer();
            this.t = null;
        }
    }

    public void setShowMedia(boolean z) {
        this.k = z;
    }
}
