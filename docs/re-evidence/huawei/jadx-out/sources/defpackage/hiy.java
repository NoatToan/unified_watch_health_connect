package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.Coordinate;
import com.huawei.pluginfitnessadvice.Cover;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hiy extends HealthPagerAdapter implements TextureView.SurfaceTextureListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f36791c;
    private List d;
    private LinearLayout e;
    private HealthTextView f;
    private int g;
    private MediaHelper h;
    private Motion i;
    private HealthTextView j;
    private TextureView k;
    private ImageView l;
    private ImageView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private Surface q;
    private HealthTextView r;
    private String s;
    private HealthTextView t;
    private SparseArray<View> v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36790b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f36789a = new Handler(Looper.getMainLooper());

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

    public hiy(List list, int i) {
        this.d = list;
        this.g = i;
        this.v = new SparseArray<>(list.size());
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (this.d.size() > 1) {
            return 1;
        }
        return this.d.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = this.v.get(i);
        if (viewInflate == null) {
            viewInflate = View.inflate(viewGroup.getContext(), this.g, null);
            b(viewInflate);
        }
        if (i == 0) {
            if (!(this.d.get(i) instanceof Motion)) {
                return viewInflate;
            }
            this.i = (Motion) this.d.get(i);
            e();
            a(viewGroup.getContext());
            e(viewGroup);
        } else {
            b(i);
        }
        this.v.put(i, viewInflate);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    private void b(int i) {
        this.k.setVisibility(8);
        this.m.setVisibility(0);
        if (njy.e(this.d, i)) {
            LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "setCoachPicImgDes position is out of mData.");
            return;
        }
        if (this.d.get(i) instanceof Cover) {
            Cover cover = (Cover) this.d.get(i);
            if (cover == null) {
                LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "setCoachPicImgDes cover is null.");
                return;
            }
            qqf.e(cover.getUrl(), this.m);
            this.e.setVisibility(8);
            List<Coordinate> coordinates = cover.getCoordinates();
            if (njy.e(coordinates)) {
                LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "setCoachPicImgDes coordinates is null.");
                return;
            }
            String string = "";
            int i2 = 0;
            while (i2 < coordinates.size()) {
                int i3 = i2 + 1;
                string = BaseApplication.getContext().getString(R.string.sug_coach_training_point_end, string, BaseApplication.getContext().getString(R.string.sug_coach_desc_content, UnitUtil.e(i3, 1, 0), coordinates.get(i2).getTip()));
                i2 = i3;
            }
            this.j.setText(string);
        }
    }

    private void e(ViewGroup viewGroup) {
        this.f.setText(this.i.acquireName());
        this.r.setText(gzx.c(viewGroup.getContext().getApplicationContext(), this.i.acquireDifficulty()));
        this.p.setText(gzx.d(this.i.getTrainingPoints()));
        this.t.setText(viewGroup.getContext().getResources().getString(R.string.sug_coach_intro_poing_content, gzx.d(this.i.getTrainingPoints())));
        List<Attribute> equipments = this.i.getEquipments();
        if (njy.e(equipments)) {
            this.n.setText(viewGroup.getContext().getResources().getString(R.string.sug_intro_qixie));
        } else {
            this.n.setText(gzx.a(equipments));
        }
        this.j.setText(gzx.e(viewGroup.getContext().getApplicationContext(), this.i.getDescription(), Constants.LINK, R.drawable.sug_coach_intro_point));
    }

    private void e() {
        if (this.f36790b) {
            this.k.setVisibility(0);
            this.k.setOutlineProvider(new idh(qqp.a(BaseApplication.getContext(), 8.0f)));
            this.k.setClipToOutline(true);
            this.k.setSurfaceTextureListener(this);
            MediaHelper mediaHelper = new MediaHelper();
            this.h = mediaHelper;
            mediaHelper.b(this.s);
            this.h.setSdSources(this.i.acquireMotionPath());
            return;
        }
        this.k.setVisibility(8);
        this.m.setVisibility(0);
        qqf.d(this.i.acquirePicUrl(), this.m);
        LogUtil.a("Suggestion_CoachVideoPlayPageAdapter", "instantiateItem2");
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = this.v.get(i);
        if (view != null) {
            viewGroup.removeView(view);
        }
    }

    private void b(View view) {
        this.m = (ImageView) view.findViewById(R.id.sug_coachi_iv_pic);
        this.l = (ImageView) view.findViewById(R.id.sug_iv_coach_intro_orign);
        this.o = (HealthTextView) view.findViewById(R.id.sug_coach_intro_orign_new_textview);
        this.e = (LinearLayout) view.findViewById(R.id.sug_coach_ll_first);
        this.k = (TextureView) view.findViewById(R.id.sug_coachi_sv_pic);
        this.f = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_actiontitle);
        this.r = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_traindif);
        this.t = (HealthTextView) view.findViewById(R.id.sug_tv_trainpoint);
        this.p = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_trainpoint);
        this.n = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_equipment);
        this.j = (HealthTextView) view.findViewById(R.id.sug_coachi_tv_des);
        this.f36791c = (LinearLayout) view.findViewById(R.id.sug_coachi_bottom);
        this.m.setOutlineProvider(new idh(qqp.a(BaseApplication.getContext(), 8.0f)));
        this.m.setClipToOutline(true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.a("Suggestion_CoachVideoPlayPageAdapter", "onSurfaceTextureAvailable");
        Surface surface = new Surface(surfaceTexture);
        this.q = surface;
        MediaHelper mediaHelper = this.h;
        if (mediaHelper == null) {
            LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "onSurfaceTextureAvailable mMediaHelper is null");
            return;
        }
        mediaHelper.d(surface);
        if (this.h.s() == null) {
            LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "onSurfaceTextureAvailable player is null");
            return;
        }
        this.h.s().setOnVideoSizeChangedListener(this);
        this.h.start();
        this.f36789a.postDelayed(new Runnable() { // from class: hja
            @Override // java.lang.Runnable
            public final void run() {
                this.f36793c.b();
            }
        }, 500L);
    }

    /* synthetic */ void b() {
        LogUtil.a("Suggestion_CoachVideoPlayPageAdapter", "mSugCoachImg.setVisibility(View.GONE);", Long.valueOf(System.currentTimeMillis()));
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogUtil.a("Suggestion_CoachVideoPlayPageAdapter", "onSurfaceTextureDestroyed");
        this.h.release();
        return false;
    }

    public void e(String str) {
        this.s = str;
    }

    private void a(Context context) {
        if (context == null) {
            LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "hideOrShowCoachOrigin context is null");
        } else {
            if (TextUtils.isEmpty(this.i.getOriginLogo())) {
                this.f36791c.setVisibility(4);
                return;
            }
            this.f36791c.setVisibility(0);
            this.o.setText(context.getApplicationContext().getString(R.string.sug_coach_intro_course_partner));
            qqf.d(this.i.getOriginLogo(), this.l);
        }
    }

    private void b(int i, int i2) {
        TextureView textureView = this.k;
        if (textureView == null) {
            LogUtil.j("Suggestion_CoachVideoPlayPageAdapter", "updateTextureViewSizeCenterCrop mSugCoachPic is null");
            return;
        }
        float f = i;
        float width = textureView.getWidth() / f;
        float f2 = i2;
        float height = this.k.getHeight() / f2;
        Matrix matrix = new Matrix();
        float fMax = Math.max(width, height);
        matrix.preTranslate((this.k.getWidth() - i) / 2.0f, (this.k.getHeight() - i2) / 2.0f);
        matrix.preScale(f / this.k.getWidth(), f2 / this.k.getHeight());
        matrix.postScale(fMax, fMax, this.k.getWidth() / 2.0f, this.k.getHeight() / 2.0f);
        this.k.setTransform(matrix);
        this.k.postInvalidate();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        b(i, i2);
    }
}
