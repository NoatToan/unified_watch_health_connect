package com.huawei.health.suggestion.ui.fitness.helper;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.Coordinate;
import com.huawei.pluginfitnessadvice.Cover;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import defpackage.gzx;
import defpackage.idh;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class IntroPagerAdapter extends HealthPagerAdapter implements TextureView.SurfaceTextureListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f9320a;
    private HealthTextView aa;
    private MediaHelper ab;
    private Motion ac;
    private LinearLayout ad;
    private String ae;
    private Surface af;
    private int ag;
    private HealthTextView ah;
    private SparseArray<View> ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9322c;
    private ImageView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private TextureView i;
    private ImageView j;
    private LinearLayout k;
    private ImageView l;
    private List m;
    private LinearLayout n;
    private ConstraintLayout o;
    private int p;
    private LinearLayout q;
    private HealthTextView r;
    private IvDownLoadClick s;
    private int u;
    private RelativeLayout y;
    private boolean v = true;
    private Handler t = new Handler(Looper.getMainLooper());
    private boolean w = false;
    private String z = "";
    private boolean x = false;

    public interface HeadStatus {
        public static final int LOADING = 0;
        public static final int LOADING_SUCCESS = 3;
        public static final int LONG_VIDEO_LOADING = 5;
        public static final int LONG_VIDEO_READY = 6;
        public static final int NO_NET = 2;
        public static final int NO_WIFI = 1;
        public static final int RESET_STATUS = 4;

        void headStatus();
    }

    public interface IvDownLoadClick {
        void onIvDownLoadClick();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public IntroPagerAdapter(List list, int i) {
        this.m = list;
        this.u = i;
        this.ai = new SparseArray<>(list.size());
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (this.m.size() > 1) {
            return 1;
        }
        return this.m.size();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ImageView imageView;
        View viewInflate = this.ai.get(i);
        if (viewInflate == null) {
            viewInflate = View.inflate(viewGroup.getContext(), this.u, null);
            b(viewInflate);
        }
        if (this.w) {
            if (this.m.get(i) instanceof Motion) {
                this.ac = (Motion) this.m.get(i);
                d();
                d(viewGroup);
                this.ai.put(i, viewInflate);
                imageView = this.l;
                if (imageView != null) {
                    imageView.setOnClickListener(this);
                }
                viewGroup.addView(viewInflate);
                return viewInflate;
            }
            return viewInflate;
        }
        if (i == 0) {
            if (!njy.e(this.m, i) && (this.m.get(i) instanceof Motion)) {
                this.ac = (Motion) this.m.get(i);
                b();
                d(viewGroup);
            }
            return viewInflate;
        }
        a(i);
        this.ai.put(i, viewInflate);
        imageView = this.l;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    private void b() {
        if (this.v) {
            c();
            return;
        }
        this.i.setVisibility(8);
        this.d.setVisibility(0);
        qqf.d(this.ac.acquirePicUrl(), this.d);
        LogUtil.a("Suggestion_IntroPagerAdapter", "instantiateItem2");
    }

    private void c() {
        this.i.setVisibility(0);
        this.i.setSurfaceTextureListener(this);
        if (CommonUtil.ca()) {
            this.ab = new MediaHelper(BaseApplication.getContext());
        } else {
            this.ab = new MediaHelper();
        }
        this.ab.b(this.ae);
        this.ab.setSdSources(this.ac.acquireMotionPath());
    }

    private void a(int i) {
        Object obj;
        this.i.setVisibility(8);
        int i2 = 0;
        this.d.setVisibility(0);
        if (njy.c(this.m, i) && (obj = this.m.get(i)) != null && (obj instanceof Cover)) {
            Cover cover = (Cover) obj;
            qqf.e(cover.getUrl(), this.d);
            this.n.setVisibility(8);
            List<Coordinate> coordinates = cover.getCoordinates();
            if (coordinates == null) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (i2 < coordinates.size()) {
                int i3 = i2 + 1;
                stringBuffer.append(i3).append(":").append(coordinates.get(i2).getTip()).append("/n");
                i2 = i3;
            }
            this.f9320a.setText(stringBuffer);
        }
    }

    public void d() {
        this.i.setOutlineProvider(new idh(qqp.a(BaseApplication.getContext(), 8.0f)));
        this.i.setClipToOutline(true);
        this.i.setSurfaceTextureListener(this);
        LongMediaHelper longMediaHelper = new LongMediaHelper(this.i.getContext().getApplicationContext());
        this.ab = longMediaHelper;
        longMediaHelper.b(this.ae);
        if (TextUtils.isEmpty(this.z)) {
            return;
        }
        this.ab.setMediaSources(Uri.parse(this.z));
        d(this.ac);
    }

    private void d(final Motion motion) {
        MediaHelper mediaHelper = this.ab;
        if ((mediaHelper instanceof LongMediaHelper) || motion == null) {
            final LongMediaHelper longMediaHelper = (LongMediaHelper) mediaHelper;
            longMediaHelper.e(new PlayerHelper.OnPreparedListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter.3
                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onPrepared() {
                    VideoSegment videoSegment;
                    LogUtil.a("Suggestion_IntroPagerAdapter", "setMediaLongVideoListener onPrepared");
                    if (!IntroPagerAdapter.this.x) {
                        LogUtil.j("Suggestion_IntroPagerAdapter", "setMediaLongVideoListener--isActivityForGround:", false);
                        return;
                    }
                    if (njy.c(motion.getVideoSegments(), 0) && (videoSegment = motion.getVideoSegments().get(0)) != null) {
                        IntroPagerAdapter.this.ag = (int) videoSegment.getStartTime();
                        IntroPagerAdapter.this.p = (int) videoSegment.getEndTime();
                    }
                    IntroPagerAdapter introPagerAdapter = IntroPagerAdapter.this;
                    introPagerAdapter.b(longMediaHelper, introPagerAdapter.ag, IntroPagerAdapter.this.p);
                    LogUtil.a("Suggestion_IntroPagerAdapter", "setMediaLongVideoListener--isActivityForGround:", true);
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onBufferingStart() {
                    LogUtil.a("Suggestion_IntroPagerAdapter", "long Video buffering start", Long.valueOf(System.currentTimeMillis()));
                    if (!NetworkUtil.k()) {
                        IntroPagerAdapter.this.b(1);
                    } else {
                        IntroPagerAdapter.this.b(5);
                    }
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onBufferingEnd() {
                    LogUtil.a("Suggestion_IntroPagerAdapter", "long video buffering end", Long.valueOf(System.currentTimeMillis()));
                    IntroPagerAdapter.this.b(6);
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onSeekComplete() {
                    LogUtil.a("Suggestion_IntroPagerAdapter", "long video seek complete", Long.valueOf(System.currentTimeMillis()));
                    IntroPagerAdapter.this.b(6);
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onVideoError() {
                    LogUtil.e("Suggestion_IntroPagerAdapter", "onVideoError");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(LongMediaHelper longMediaHelper, int i, int i2) {
        longMediaHelper.start();
        longMediaHelper.a(i);
        c(longMediaHelper, i, i2);
    }

    private void c(final LongMediaHelper longMediaHelper, final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                int i3 = i2;
                if (i3 <= 0) {
                    return;
                }
                if (IntroPagerAdapter.this.b(longMediaHelper, i3)) {
                    longMediaHelper.a(i);
                }
                IntroPagerAdapter.this.t.postDelayed(this, 1000L);
            }
        };
        Handler handler = this.t;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(LongMediaHelper longMediaHelper, int i) {
        if (longMediaHelper == null || !longMediaHelper.o()) {
            return false;
        }
        return longMediaHelper.j() > i || longMediaHelper.j() == i;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = this.ai.get(i);
        if (view != null) {
            viewGroup.removeView(view);
        }
    }

    private void b(View view) {
        this.d = (ImageView) view.findViewById(R.id.sug_coachi_iv_pic);
        this.j = (ImageView) view.findViewById(R.id.sug_iv_coach_intro_orign);
        this.o = (ConstraintLayout) view.findViewById(R.id.sug_action_detail_banner);
        this.k = (LinearLayout) view.findViewById(R.id.sug_traindetail_content);
        this.g = (HealthTextView) view.findViewById(R.id.sug_coach_intro_orign_new_textview);
        this.n = (LinearLayout) view.findViewById(R.id.sug_coach_ll_first);
        this.i = (TextureView) view.findViewById(R.id.sug_coachi_sv_pic);
        this.f9322c = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_actiontitle);
        this.f = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_traindif);
        this.ah = (HealthTextView) view.findViewById(R.id.sug_tv_trainpoint);
        this.h = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_trainpoint);
        this.f9321b = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_equipment);
        this.f9320a = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_des);
        this.q = (LinearLayout) view.findViewById(R.id.sug_downloading);
        this.ad = (LinearLayout) view.findViewById(R.id.ll_nowifi);
        this.l = (ImageView) view.findViewById(R.id.iv_download);
        this.y = (RelativeLayout) view.findViewById(R.id.sug_headView);
        this.r = (HealthTextView) view.findViewById(R.id.tv_downloading_progress);
        this.e = (HealthTextView) view.findViewById(R.id.tv_audio_size);
        this.aa = (HealthTextView) view.findViewById(R.id.tv_no_wifi_msg);
        e();
    }

    public void e() {
        ConstraintLayout constraintLayout = this.o;
        if (constraintLayout == null) {
            LogUtil.j("Suggestion_IntroPagerAdapter", "initLayout, mConstraintLayout is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (qrs.af(BaseApplication.getContext())) {
            float fA = new HealthColumnSystem(BaseApplication.getContext(), 0).a(6);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) fA;
            } else {
                new ViewGroup.MarginLayoutParams(layoutParams).width = (int) fA;
            }
            this.o.setLayoutParams(layoutParams);
            this.k.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = BaseApplication.getContext().getResources().getDisplayMetrics().widthPixels;
        } else {
            new ViewGroup.MarginLayoutParams(layoutParams).width = BaseApplication.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        this.o.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int dimension = (int) BaseApplication.getContext().getResources().getDimension(com.huawei.ui.commonui.R.dimen.maxPaddingStart);
        layoutParams2.setMarginStart(dimension);
        layoutParams2.setMarginEnd(dimension);
        this.k.setLayoutParams(layoutParams2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.a("Suggestion_IntroPagerAdapter", "onSurfaceTextureAvailable");
        Surface surface = new Surface(surfaceTexture);
        this.af = surface;
        this.ab.d(surface);
        if (this.w) {
            return;
        }
        this.ab.start();
        LogUtil.a("Suggestion_IntroPagerAdapter", "setMediaLongVideoListener onSurfaceTextureAvailable IsActivityForGround start");
        this.t.postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Suggestion_IntroPagerAdapter", "mCoachImg.setVisibility(View.GONE);", Long.valueOf(System.currentTimeMillis()));
                IntroPagerAdapter.this.d.setVisibility(8);
                if (IntroPagerAdapter.this.y != null) {
                    IntroPagerAdapter.this.a();
                }
            }
        }, 500L);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogUtil.a("Suggestion_IntroPagerAdapter", "onSurfaceTextureDestroyed");
        this.ab.release();
        return false;
    }

    public void b(boolean z) {
        this.v = z;
    }

    public void b(int i) {
        if (i == 0) {
            RelativeLayout relativeLayout = this.y;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.q.setVisibility(0);
                this.ad.setVisibility(8);
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (i == 1) {
            RelativeLayout relativeLayout2 = this.y;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
                this.q.setVisibility(8);
                this.ad.setVisibility(0);
                this.aa.setVisibility(0);
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (i == 3) {
            LinearLayout linearLayout = this.q;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                this.ad.setVisibility(8);
                return;
            }
            return;
        }
        e(i);
    }

    private void e(int i) {
        if (i == 2) {
            RelativeLayout relativeLayout = this.y;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.q.setVisibility(8);
                this.ad.setVisibility(0);
                this.aa.setVisibility(8);
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (i == 4) {
            RelativeLayout relativeLayout2 = this.y;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
                this.d.setVisibility(0);
                this.d.setImageDrawable(new ColorDrawable(ContextCompat.getColor(BaseApplication.getContext(), com.huawei.ui.commonui.R.color.color_normal_titlebar_title)));
                return;
            }
            return;
        }
        if (i == 5) {
            if (f()) {
                this.y.setVisibility(0);
                this.q.setVisibility(0);
                this.ad.setVisibility(8);
                this.d.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 6) {
            if (f()) {
                this.i.setVisibility(0);
                this.y.setVisibility(8);
                this.q.setVisibility(8);
                this.ad.setVisibility(8);
                this.d.setVisibility(8);
                return;
            }
            return;
        }
        LogUtil.j("Suggestion_IntroPagerAdapter", "refreshHeadView headStatus is nothing");
    }

    private boolean f() {
        return (this.i == null || this.y == null || this.q == null || this.ad == null || this.d == null) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IvDownLoadClick ivDownLoadClick;
        if (view == null) {
            return;
        }
        int id = view.getId();
        ImageView imageView = this.l;
        if (imageView == null || id != imageView.getId() || (ivDownLoadClick = this.s) == null) {
            return;
        }
        ivDownLoadClick.onIvDownLoadClick();
    }

    public void a(IvDownLoadClick ivDownLoadClick) {
        this.s = ivDownLoadClick;
    }

    private void d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (TextUtils.isEmpty(FitWorkout.acquireComeFrom(this.ac.acquireWorkoutId()))) {
            this.g.setText(viewGroup.getContext().getApplicationContext().getString(R.string.sug_coach_intro_orign_new));
        } else {
            this.g.setText(viewGroup.getContext().getApplicationContext().getString(R.string.sug_coach_intro_orign_new_other));
        }
        i();
        this.f9322c.setText(this.ac.acquireName());
        this.f.setText(gzx.c(viewGroup.getContext().getApplicationContext(), this.ac.acquireDifficulty()));
        this.h.setText(gzx.d(this.ac.getTrainingPoints()));
        this.ah.setText(viewGroup.getContext().getResources().getString(R.string.sug_coach_intro_poing_content, gzx.d(this.ac.getTrainingPoints())));
        List<Attribute> equipments = this.ac.getEquipments();
        if (equipments.size() == 0) {
            this.f9321b.setText(viewGroup.getContext().getResources().getString(R.string.sug_intro_qixie));
        } else {
            this.f9321b.setText(gzx.a(equipments));
        }
        if (this.ac.getDescription() != null) {
            this.f9320a.setText(gzx.e(viewGroup.getContext().getApplicationContext(), this.ac.getDescription(), Constants.LINK, R.drawable.sug_coach_intro_point));
        }
    }

    private void i() {
        if (this.j != null && !TextUtils.isEmpty(this.ac.getOriginLogo())) {
            qqf.d(this.ac.getOriginLogo(), this.j);
            return;
        }
        HealthTextView healthTextView = this.g;
        if (healthTextView != null) {
            healthTextView.setVisibility(8);
        }
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void a(String str) {
        HealthTextView healthTextView = this.r;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public void b(String str) {
        HealthTextView healthTextView = this.e;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                LogUtil.a("Suggestion_IntroPagerAdapter", "mHeadView onAnimationEnd");
                IntroPagerAdapter.this.y.setVisibility(8);
            }
        });
        alphaAnimation.setDuration(150L);
        this.y.startAnimation(alphaAnimation);
    }
}
