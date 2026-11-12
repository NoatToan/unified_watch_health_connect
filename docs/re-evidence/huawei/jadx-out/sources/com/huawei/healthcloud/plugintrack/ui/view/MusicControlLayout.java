package com.huawei.healthcloud.plugintrack.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.motion.widget.Key;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.jxk;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MusicControlLayout extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AutoTransition f11263a;
    private int aa;
    private jaq ab;
    private View ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f11264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11265c;
    private ImageView d;
    private Bitmap e;
    private boolean f;
    private Context g;
    private boolean h;
    private Handler i;
    private boolean j;
    private b k;
    private int l;
    private String m;
    private boolean n;
    private long o;
    private ImageView p;
    private AnimatorSet q;
    private RelativeLayout r;
    private AnimatorSet s;
    private ImageView t;
    private ImageView u;
    private Context v;
    private HealthTextView w;
    private ImageView x;
    private ImageView y;
    private SportMusicController z;

    public MusicControlLayout(Context context) {
        this(context, null);
    }

    public MusicControlLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MusicControlLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = false;
        this.j = false;
        this.f11265c = 1;
        this.g = BaseApplication.getContext();
        this.f = false;
        this.m = "";
        this.i = null;
        this.aa = 0;
        this.k = new b();
        this.h = false;
        c(context);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LogUtil.a("Track_MusicControlLayout", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        e();
    }

    public void e(final int i) {
        this.l = this.ab.h(this.aa);
        if (c()) {
            this.z.e();
            a(new IBaseResponseCallback() { // from class: jsf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.d.d(i, i2, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, int i2, Object obj) {
        if (this.z.a()) {
            this.z.e(i);
        }
    }

    public boolean c() {
        return jaa.f(this.g) && CommonUtil.bh() && this.l == 1 && izn.a(this.g) == 0;
    }

    private void i() {
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(1), Integer.toString(20002));
        this.ab = jaqVar;
        this.l = jaqVar.h(this.aa);
    }

    public jaq getTrackSharedPreferenceUtil() {
        return this.ab;
    }

    private void c(Context context) {
        i();
        if (context == null) {
            LogUtil.j("Track_MusicControlLayout", "context is  null");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.music_content_layout, this);
        this.ad = viewInflate;
        this.x = (ImageView) viewInflate.findViewById(R.id.music_previous);
        this.u = (ImageView) this.ad.findViewById(R.id.play_or_pause);
        this.r = (RelativeLayout) this.ad.findViewById(R.id.music_control_and_content);
        this.y = (ImageView) this.ad.findViewById(R.id.music_next);
        this.f11264b = (ImageView) this.ad.findViewById(R.id.music_collect);
        this.t = (ImageView) this.ad.findViewById(R.id.music_element);
        this.w = (HealthTextView) this.ad.findViewById(R.id.music_content);
        this.d = (ImageView) this.ad.findViewById(R.id.music_cancel);
        this.x.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.y.setOnClickListener(this);
        this.f11264b.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.z = SportMusicController.c();
        a();
        a((IBaseResponseCallback) null);
        q();
        if (jaa.f(this.g) && CommonUtil.bh() && this.l == 1) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
        if (this.h) {
            return;
        }
        setViewShowStatue(0);
    }

    private void a(IBaseResponseCallback iBaseResponseCallback) {
        this.z.d(iBaseResponseCallback);
        this.z.c(this.k);
        this.z.e(new a(this));
    }

    private void f() {
        LogUtil.a("Track_MusicControlLayout", "initControlLayout");
        l();
        k();
        if (LanguageUtil.ba(this.g)) {
            if (this.f) {
                g();
            } else {
                h();
            }
            this.w.setSpeed(3);
            return;
        }
        this.w.setSpeed(-3);
        if (this.f) {
            this.x.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.previous), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
            this.y.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.next), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
        } else {
            int iE = qre.e(this.v, R.color.healthTintColorPrimary);
            this.x.setImageDrawable(qqf.c(qre.c(R.drawable.previous), iE));
            this.y.setImageDrawable(qqf.c(qre.c(R.drawable.next), iE));
        }
    }

    private void h() {
        int iE = qre.e(this.v, R.color.healthTintColorPrimary);
        this.x.setImageDrawable(qqf.c(qre.c(R.drawable.next), iE));
        this.y.setImageDrawable(qqf.c(qre.c(R.drawable.previous), iE));
    }

    private void g() {
        this.x.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.next), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
        this.y.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.previous), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
    }

    public void b(Context context, boolean z, int i) {
        if (context == null) {
            context = this.g;
        }
        this.v = context;
        jxk.c(context, this.r, R.drawable.music_content_background);
        setSportTypeDrawable(z, i);
        q();
    }

    public void setSportTypeDrawable(boolean z, int i) {
        this.aa = i;
        this.f = z;
        if (this.r != null && z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.g.getResources().getColor(R.color.emui_card_bg_dark));
            gradientDrawable.setCornerRadius(qrs.d(this.g, 24.0f));
            gradientDrawable.setGradientType(0);
            this.r.setBackground(gradientDrawable);
        }
        jxk.e(this.v, this.w, R.color.textColorPrimary);
        HealthTextView healthTextView = this.w;
        if (healthTextView != null && this.f) {
            healthTextView.setTextColor(this.g.getResources().getColor(R.color.textColorPrimaryInverse));
        }
        if (this.w != null) {
            f();
        }
    }

    public void a() {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName(Key.ROTATION);
        objectAnimator.setFloatValues(0.0f, 360.0f);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setDuration(10000L);
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator.setRepeatMode(1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.q = animatorSet;
        animatorSet.play(objectAnimator.clone());
        this.q.setTarget(this.t);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s = animatorSet2;
        animatorSet2.play(objectAnimator.clone());
        ImageView imageView = this.p;
        if (imageView != null) {
            this.s.setTarget(imageView);
        }
        if (this.n && this.f11265c == 1) {
            this.q.start();
            this.s.start();
            this.f11265c = 3;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z = true;
        if (view.getId() == R.id.music_previous) {
            this.z.a(4, (String) null);
        } else if (view.getId() == R.id.play_or_pause) {
            if (this.n) {
                this.z.a(1, (String) null);
                SportMusicController.c().a(true);
            } else {
                this.z.a(2, (String) null);
                SportMusicController.c().a(false);
            }
        } else if (view.getId() == R.id.music_next) {
            this.z.a(3, (String) null);
        } else if (view.getId() == R.id.music_collect) {
            if (this.j) {
                this.z.a(5, "com.huawei.music.action.DISLIKE");
            } else {
                this.z.a(5, "com.huawei.music.action.LIKE");
            }
        } else {
            if (o()) {
                return;
            }
            if (this.t.getVisibility() == 0 && this.w.getVisibility() == 8) {
                j();
                LogUtil.a("Track_MusicControlLayout", "initExpand");
            } else {
                d();
                LogUtil.a("Track_MusicControlLayout", "gotoMusic");
                z = false;
            }
        }
        d(z);
    }

    public void d() {
        c(new HashMap(16));
    }

    private void c(Map<String, Object> map) {
        SportMusicController.c().d(this.ab.d(this.aa) == null ? 1 : 2, this.aa, true);
        map.put("sportMusicType", 0);
    }

    public void b() {
        SportMusicController.c();
        SportMusicController sportMusicController = this.z;
        if (sportMusicController == null) {
            return;
        }
        sportMusicController.j();
        if (this.z.b() != null) {
            this.w.setText(this.z.b().getString(MediaMetadataCompat.METADATA_KEY_TITLE));
        }
        PlaybackStateCompat playbackStateCompatH = this.z.h();
        this.n = playbackStateCompatH != null && playbackStateCompatH.getState() == 3;
        s();
        q();
        this.l = this.ab.h(this.aa);
        if (jaa.f(this.g) && CommonUtil.bh() && this.l == 1) {
            this.r.setVisibility(0);
            return;
        }
        this.r.setVisibility(8);
        jxk.b(this.v, this.p, R.drawable.track_ic_music);
        jxk.c(this.v, this.p, R.drawable.sport_button_view_bg);
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime(0L);
        }
    }

    private void s() {
        int iE = qre.e(this.v, R.color.healthTintColorPrimary);
        if (this.n) {
            if (this.f) {
                this.u.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.play), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
                return;
            } else {
                this.u.setImageDrawable(qqf.c(qre.c(R.drawable.play), iE));
                return;
            }
        }
        if (LanguageUtil.ba(this.g)) {
            if (this.f) {
                this.u.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.pause_rtl), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
                return;
            } else {
                this.u.setImageDrawable(qqf.c(qre.c(R.drawable.pause_rtl), iE));
                return;
            }
        }
        if (this.f) {
            this.u.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.pause), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
        } else {
            this.u.setImageDrawable(qqf.c(qre.c(R.drawable.pause), iE));
        }
    }

    private boolean o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (1000 > jCurrentTimeMillis - this.o) {
            LogUtil.a("Track_MusicControlLayout", "onClick", "click too fast");
            this.o = jCurrentTimeMillis;
            return true;
        }
        this.o = jCurrentTimeMillis;
        return false;
    }

    private void q() {
        qqf.a(this.ab.d(this.aa), new CustomTarget<Bitmap>() { // from class: com.huawei.healthcloud.plugintrack.ui.view.MusicControlLayout.1
            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                if (bitmap == null) {
                    MusicControlLayout.this.t.setImageDrawable(qre.c(qqs.e(MusicControlLayout.this.v) ? R.drawable.music_element_default_dark : R.drawable.music_element_default_light));
                } else {
                    MusicControlLayout.this.e = bitmap;
                    new d().execute(new Void[0]);
                }
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                LogUtil.a("Track_MusicControlLayout", "updateMusicElement onLoadCleared");
            }
        });
    }

    public void e() {
        SportMusicController sportMusicController = this.z;
        if (sportMusicController != null) {
            sportMusicController.f();
            this.z.d(this.k);
        }
    }

    class d extends AsyncTask<Void, Void, Bitmap> {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            float fD = qrs.d(MusicControlLayout.this.g, 40.0f) / Math.min(MusicControlLayout.this.e.getWidth(), MusicControlLayout.this.e.getHeight());
            Matrix matrix = new Matrix();
            matrix.postScale(fD, fD);
            return qqf.e(Bitmap.createBitmap(MusicControlLayout.this.e, 0, 0, MusicControlLayout.this.e.getWidth(), MusicControlLayout.this.e.getHeight(), matrix, true), qrs.d(MusicControlLayout.this.g, 20.0f));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (MusicControlLayout.this.t != null) {
                MusicControlLayout.this.t.setImageBitmap(bitmap);
            }
            if (MusicControlLayout.this.p != null) {
                MusicControlLayout.this.p.setImageTintList(null);
                MusicControlLayout.this.p.setImageBitmap(bitmap);
                MusicControlLayout.this.s.setTarget(MusicControlLayout.this.p);
            }
        }
    }

    class b extends MediaControllerCompat.Callback {
        private b() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            if (playbackStateCompat == null) {
                LogUtil.a("Track_MusicControlLayout", "onPlaybackStateChanged playbackState is null");
                return;
            }
            MusicControlLayout.this.n = playbackStateCompat.getState() == 3;
            MusicControlLayout.this.l();
            d();
        }

        private void d() {
            if (MusicControlLayout.this.n) {
                if (MusicControlLayout.this.f11265c == 1) {
                    MusicControlLayout.this.q.start();
                    MusicControlLayout.this.s.start();
                    MusicControlLayout.this.f11265c = 3;
                    return;
                } else {
                    if (MusicControlLayout.this.f11265c == 2) {
                        MusicControlLayout.this.q.resume();
                        MusicControlLayout.this.s.resume();
                        MusicControlLayout.this.w.a();
                        MusicControlLayout.this.f11265c = 3;
                        return;
                    }
                    return;
                }
            }
            if (MusicControlLayout.this.f11265c == 3) {
                MusicControlLayout.this.q.pause();
                MusicControlLayout.this.s.pause();
                MusicControlLayout.this.w.e();
                MusicControlLayout.this.f11265c = 2;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat == null) {
                return;
            }
            MusicControlLayout musicControlLayout = MusicControlLayout.this;
            musicControlLayout.m = musicControlLayout.m == null ? "" : MusicControlLayout.this.m;
            String string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
            LogUtil.a("Track_MusicControlLayout", "onMetadataChanged, mLastSongName = ", MusicControlLayout.this.m, ", currentSongName = ", string);
            if (MusicControlLayout.this.m.equals(string)) {
                return;
            }
            MusicControlLayout.this.w.c();
            MusicControlLayout.this.m = string;
            MusicControlLayout.this.w.setText(string);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            if (bundle == null) {
                LogUtil.e("Track_MusicControlLayout", "extras is null");
                return;
            }
            if ("com.huawei.music.action.LIKE_STATUS".equals(str) || "favoriteStateChange".equals(str)) {
                int i = bundle.getInt("result", 0);
                MusicControlLayout.this.j = i == 1;
                MusicControlLayout.this.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.j) {
            this.f11264b.setImageDrawable(qre.d(this.v, R.drawable.icon_collection_sel));
        } else if (this.f || qqs.e(this.v)) {
            this.f11264b.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.icon_no_collection), this.g.getResources().getColor(R.color.healthTintColorPrimaryDark)));
        } else {
            this.f11264b.setImageDrawable(getResources().getDrawable(R.drawable.icon_no_collection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int iE = qre.e(this.v, R.color.healthTintColorPrimary);
        if (this.n) {
            if (this.f) {
                this.u.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.play), getResources().getColor(R.color.healthTintColorPrimaryDark)));
                return;
            } else {
                this.u.setImageDrawable(qqf.c(qre.c(R.drawable.play), iE));
                return;
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            if (this.f) {
                this.u.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.pause_rtl), getResources().getColor(R.color.healthTintColorPrimaryDark)));
                return;
            } else {
                this.u.setImageDrawable(qqf.c(qre.c(R.drawable.pause_rtl), iE));
                return;
            }
        }
        if (this.f) {
            this.u.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.pause), getResources().getColor(R.color.healthTintColorPrimaryDark)));
        } else {
            this.u.setImageDrawable(qqf.c(qre.c(R.drawable.pause), iE));
        }
    }

    private void m() {
        this.i = new Handler() { // from class: com.huawei.healthcloud.plugintrack.ui.view.MusicControlLayout.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("Track_MusicControlLayout", "msg is null!");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                MusicControlLayout.this.n();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        setViewShowStatue(8);
        RelativeLayout relativeLayout = this.r;
        if (relativeLayout instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = qqp.a(this.g, 48.0f);
            layoutParams.addRule(11);
            this.r.setLayoutParams(layoutParams);
        }
        d(this.r);
    }

    private void j() {
        setViewShowStatue(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, qqp.a(this.g, 48.0f));
        layoutParams.setMargins(0, 0, 0, 0);
        this.r.setPadding(0, 0, 0, 0);
        this.r.setLayoutParams(layoutParams);
        d(this.r);
    }

    private void setViewShowStatue(int i) {
        this.w.setVisibility(i);
        this.f11264b.setVisibility(i);
        this.x.setVisibility(i);
        this.u.setVisibility(i);
        this.y.setVisibility(i);
    }

    private void d(ViewGroup viewGroup) {
        AutoTransition autoTransition = new AutoTransition();
        this.f11263a = autoTransition;
        autoTransition.setDuration(500L);
        TransitionManager.beginDelayedTransition(viewGroup, this.f11263a);
    }

    public void d(boolean z) {
        LogUtil.a("Track_MusicControlLayout", "setMsg isSend ", Boolean.valueOf(z));
        Handler handler = this.i;
        if (handler == null) {
            LogUtil.e("Track_MusicControlLayout", "sendAnimationMsg mHandler is null.");
            return;
        }
        handler.removeCallbacksAndMessages(null);
        LogUtil.a("Track_MusicControlLayout", "removeCallbacksAndMessages");
        if (z && this.h) {
            this.i.sendEmptyMessageDelayed(100, 5000L);
        }
    }

    public void setIsExpandAnimation(boolean z) {
        this.h = z;
        n();
    }

    public void setMusicPause() {
        PlaybackStateCompat playbackStateCompatH;
        SportMusicController sportMusicController = this.z;
        if (sportMusicController == null || (playbackStateCompatH = sportMusicController.h()) == null || playbackStateCompatH.getState() != 3) {
            return;
        }
        this.z.a(1, (String) null);
    }

    public void setMusicPlay() {
        PlaybackStateCompat playbackStateCompatH;
        SportMusicController sportMusicController = this.z;
        if (sportMusicController == null || (playbackStateCompatH = sportMusicController.h()) == null || playbackStateCompatH.getState() != 2) {
            return;
        }
        this.z.a(2, (String) null);
    }

    public ImageView getCancel() {
        return this.d;
    }

    public void setVisible() {
        a();
    }

    public ImageView getMusicButton() {
        return this.p;
    }

    public void setMusicButton(ImageView imageView) {
        this.p = imageView;
        this.s.setTarget(imageView);
    }

    static class a implements IBaseResponseCallback {
        private WeakReference<MusicControlLayout> e;

        public a(MusicControlLayout musicControlLayout) {
            this.e = new WeakReference<>(musicControlLayout);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MusicControlLayout musicControlLayout = this.e.get();
            if (musicControlLayout == null || musicControlLayout.z == null) {
                return;
            }
            musicControlLayout.z.d((IBaseResponseCallback) null);
        }
    }
}
