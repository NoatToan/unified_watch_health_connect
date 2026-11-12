package com.huawei.healthcloud.plugintrack.trackanimation.retrackengine;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.MarkerBuilder;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapMarkerClickCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jeq;
import defpackage.jer;
import defpackage.jes;
import defpackage.jfa;
import defpackage.jgs;
import defpackage.jgt;
import defpackage.jgx;
import defpackage.jhb;
import defpackage.jho;
import defpackage.jpg;
import defpackage.jpk;
import defpackage.jpq;
import defpackage.jre;
import defpackage.jrm;
import defpackage.jrr;
import defpackage.jrs;
import defpackage.jrt;
import defpackage.jrv;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qsp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ReTrackDisplay extends ReTrackEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pair<Float, Float> f10675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pair<Float, Float> f10676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pair<Float, Float> f10677c;
    private static final Pair<Float, Float> e;
    private InterfaceMapStatusChangeCallback aa;
    private jeq ab;
    private MapTypeDescription ac;
    private byte[] ad;
    private ArrayList<Integer> ae;
    private MarkerBuilder af;
    private e ag;
    private int ah;
    private List<Double> ai;
    private d aj;
    private VideoView ak;
    private List<Integer> al;
    private jrr am;
    private int an;
    private int ao;
    private long ap;
    private int aq;
    private InterfaceUpdateReTrack ar;
    private List<Pair<Integer, Integer>> d;
    private AlphaAnimation f;
    private AnimatorSet g;
    private List<Pair<Integer, List<jpg>>> h;
    private SparseIntArray i;
    private Map<Integer, String> j;
    private HashMap<Integer, Integer> k;
    private boolean l;
    private HashMap<Integer, Integer> m;
    private Map<Integer, List<Bitmap>> n;
    private Map<Integer, ArrayList<VideoModel>> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private long u;
    private List<jpg> v;
    private InterfaceMapLoadedCallback w;
    private b x;
    private volatile boolean y;
    private InterfaceMapMarkerClickCallback z;

    enum KeyExerciseType {
        MAX_HEART_RATE,
        MAX_SPEED,
        MAX_ALTITUDE
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setScreenHeight(int i) {
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f10675a = new Pair<>(fValueOf, fValueOf);
        f10676b = new Pair<>(fValueOf, Float.valueOf(1.0f));
        Float fValueOf2 = Float.valueOf(0.9f);
        f10677c = new Pair<>(fValueOf, fValueOf2);
        e = new Pair<>(Float.valueOf(0.3f), fValueOf2);
    }

    private TrackAnimationControl f() {
        int iE = jaa.e(this.mContext);
        if (iE == 1) {
            return new jgt(this.mTrackData, this.mLensData, this.mTrackSimplify);
        }
        if (iE == 3) {
            return new jhb(this.mTrackData, this.mLensData, this.mTrackSimplify);
        }
        if (iE == 2) {
            return new jgs(this.mTrackData, this.mLensData, this.mTrackSimplify);
        }
        return new jgt(this.mTrackData, this.mLensData, this.mTrackSimplify);
    }

    private void m() {
        Context context = this.mContext;
        Context context2 = this.mContext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("retrack_file", 0);
        if ("retrack_mode_simple".equals(sharedPreferences.getString("retrack_mode_key", "retrack_mode_complex"))) {
            this.mStrength = TrackAnimationControl.Strength.LOW;
        } else {
            this.mStrength = TrackAnimationControl.Strength.HIGH;
        }
        this.mIsSupportArea = sharedPreferences.getBoolean("retrack_area_key", true);
        if (this.mMapEngine.getMapEngineType() == 1) {
            this.mIsSupportArea = false;
        }
    }

    public ReTrackDisplay(Handler handler, ArrayList<LatLong> arrayList, ArrayList<LenLatLong> arrayList2, ReTrackSimplify reTrackSimplify) {
        super(handler, arrayList, arrayList2, reTrackSimplify);
        this.ah = -1;
        this.h = null;
        this.v = null;
        this.ai = null;
        this.d = null;
        this.q = false;
        this.ad = null;
        this.ac = null;
        this.am = null;
        this.aj = new d();
        this.ag = new e();
        this.x = new b();
        this.af = new MarkerBuilder();
        this.ab = null;
        this.s = false;
        this.y = false;
        this.t = false;
        this.n = new HashMap();
        this.o = new HashMap();
        this.j = new HashMap();
        this.g = new AnimatorSet();
        this.f = null;
        this.ae = new ArrayList<>();
        this.k = new HashMap<>();
        this.m = new HashMap<>();
        this.al = new ArrayList();
        this.i = new SparseIntArray();
        this.z = new InterfaceMapMarkerClickCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.1
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapMarkerClickCallback
            public void onMarkerClick(int i) {
                int i2;
                if (i == -1 || (i2 = ReTrackDisplay.this.i.get(i, -1)) == -1) {
                    return;
                }
                ReTrackDisplay.this.mMsgHandler.sendMessage(ReTrackDisplay.this.mMsgHandler.obtainMessage(129, Integer.valueOf(i2)));
            }
        };
        this.ao = 0;
        this.aq = 0;
        this.l = false;
        this.r = false;
        this.w = new InterfaceMapLoadedCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.8
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback
            public void onMapLoaded() {
                if (ReTrackDisplay.this.mReTrackStateManager.b() == -1 || ReTrackDisplay.this.mMapEngine == null) {
                    LogUtil.e("Track_ReTrackDisplay", "in loaded,track engine is error");
                    return;
                }
                if ((ReTrackDisplay.this.mContext instanceof Activity) && ((Activity) ReTrackDisplay.this.mContext).isFinishing()) {
                    LogUtil.j("Track_ReTrackDisplay", "Activity is finishing in onMapLoaded");
                    return;
                }
                ReTrackDisplay.this.t();
                ReTrackDisplay.this.mMapEngine.showPureMap();
                ReTrackDisplay.this.mReTrackStateManager.e(1);
                ReTrackDisplay.this.q();
            }
        };
        this.ar = new g();
        this.aa = new InterfaceMapStatusChangeCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.10
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback
            public void onMapStatusChange(jrr jrrVar) {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback
            public void onMapStatusChangeFinish(jrr jrrVar) {
                ReTrackDisplay.this.p = true;
                ReTrackDisplay.this.q();
            }
        };
    }

    public ReTrackDisplay c(boolean z) {
        this.q = !z;
        return this;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setIsHideKmMarker(boolean z) {
        this.r = z;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    public ReTrackEngine setContext(Context context) {
        this.af = new MarkerBuilder(context);
        return super.setContext(context);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addStartMarker() {
        jrv jrvVar = new jrv();
        jrvVar.d(this.mTrackData.get(0).getLatLng());
        if (this.ab == null) {
            jrvVar.d(f10677c);
            jrvVar.e(this.af.d(MarkerBuilder.KeyInfoType.START_Marker, this.mTrackSimplify.getSportType(), j()));
            jrvVar.c(this.af.b(MarkerBuilder.KeyInfoType.START_Marker, this.mTrackSimplify.getSportType(), j()));
        } else {
            jrvVar.d(new Pair<>(Float.valueOf(0.5f), Float.valueOf(0.5f)));
            jrvVar.c(jho.c(this.mContext, this.ab.f()));
        }
        this.i.append(this.mMapEngine.addMarker(jrvVar, null), 0);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addEndMarker() {
        if (this.ah != -1) {
            this.mMapEngine.hideMarker(this.ah, null);
            this.ah = -1;
        }
        jrv jrvVar = new jrv();
        if (this.mTrackData.size() > 0) {
            jrvVar.d(this.mTrackData.get(this.mTrackData.size() - 1).getLatLng());
        }
        if (this.ab == null) {
            jrvVar.d(f10677c);
            jrvVar.e(this.af.d(MarkerBuilder.KeyInfoType.END_Marker, this.mTrackSimplify.getSportType(), j()));
            Bitmap bitmapB = izt.b(this.mCustomMarkerList);
            if (bitmapB == null) {
                jrvVar.c(this.af.b(MarkerBuilder.KeyInfoType.END_Marker, this.mTrackSimplify.getSportType(), j()));
            } else {
                jrvVar.c(bitmapB);
            }
        } else {
            jrvVar.d(new Pair<>(Float.valueOf(0.5f), Float.valueOf(0.5f)));
            jrvVar.c(jho.c(this.mContext, this.ab.d()));
        }
        this.i.append(this.mMapEngine.addMarker(jrvVar, null), this.mTrackData.size() - 1);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addMoveMarker() {
        jrv jrvVar = new jrv();
        jrvVar.d(f10675a);
        jrvVar.d(this.mTrackData.get(0).getLatLng());
        jrvVar.e(this.af.d(MarkerBuilder.KeyInfoType.ADVANCE_Marker, this.mTrackSimplify.getSportType(), j()));
        jrvVar.c(this.af.b(MarkerBuilder.KeyInfoType.ADVANCE_Marker, this.mTrackSimplify.getSportType(), j()));
        this.ah = this.mMapEngine.addMarker(jrvVar, null);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addMarker(LatLong latLong, Bitmap bitmap) {
        jrv jrvVar = new jrv();
        jrvVar.d(f10676b);
        jrvVar.d(latLong.getLatLng());
        jrvVar.c(bitmap);
        this.mMapEngine.addMarker(jrvVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GrowAnimationBuilder.MarkerType e(int i) {
        if (i == 1) {
            return GrowAnimationBuilder.MarkerType.KM_MARKER;
        }
        if (i == 3) {
            return GrowAnimationBuilder.MarkerType.KEYDATA_MARKER;
        }
        if (i == 4) {
            return GrowAnimationBuilder.MarkerType.ALBUM_MARKER;
        }
        if (i == 5) {
            return GrowAnimationBuilder.MarkerType.VIDEO_MARKER;
        }
        return GrowAnimationBuilder.MarkerType.KM_MARKER;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addGrowAnimationMarker(jrv jrvVar, int i, final int i2) {
        ReleaseLogUtil.d("Track_ReTrackDisplay", "addGrowAnimationMarker: type is ", Integer.valueOf(i));
        GrowAnimationBuilder growAnimation = this.mMapEngine.getGrowAnimation();
        growAnimation.setType(e(i));
        growAnimation.setFrictionAnimationDuration(400L);
        if (i == 3) {
            this.mMsgHandler.postDelayed(new Runnable() { // from class: jgi
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(i2);
                }
            }, 410L);
        }
        this.d.add(new Pair<>(Integer.valueOf(i), Integer.valueOf(this.mMapEngine.addMarker(jrvVar, growAnimation))));
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(int i) {
        if (!this.aj.c() || this.n.containsKey(Integer.valueOf(i)) || this.j.containsKey(Integer.valueOf(i)) || this.o.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.aj.h();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addMarkerAnimation(LatLong latLong, final int i, final int i2, InterfaceUpdateReTrack.MarkerType markerType) {
        LogUtil.a("Track_ReTrackDisplay", "addMarkerAnimation: ");
        jrv jrvVar = new jrv();
        jrvVar.d(f10677c);
        jrvVar.d(latLong.getLatLng());
        if (b(markerType, jrvVar)) {
            return;
        }
        GrowAnimationBuilder growAnimation = this.mMapEngine.getGrowAnimation();
        growAnimation.setType(e(i));
        growAnimation.setFrictionAnimationDuration(400L);
        int iAddMarker = this.mMapEngine.addMarker(jrvVar, growAnimation);
        this.mMsgHandler.postDelayed(new Runnable() { // from class: jgq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(i, i2);
            }
        }, 410L);
        this.mAlbumMarkers.put(Integer.valueOf(i2), markerType);
        this.k.put(Integer.valueOf(i2), Integer.valueOf(iAddMarker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i, int i2) {
        LogUtil.a("Track_ReTrackDisplay", "onFinish: addMarkerAnimation type is ", Integer.valueOf(i), " index = ", Integer.valueOf(i2));
        Message messageObtainMessage = this.mMsgHandler.obtainMessage();
        Map<Integer, List<Bitmap>> map = this.n;
        if (map != null && map.containsKey(Integer.valueOf(i2))) {
            messageObtainMessage.what = AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
            messageObtainMessage.obj = Integer.valueOf(i2);
            this.mMsgHandler.sendMessage(messageObtainMessage);
            return;
        }
        Map<Integer, ArrayList<VideoModel>> map2 = this.o;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2))) {
            messageObtainMessage.what = 130;
            messageObtainMessage.obj = Integer.valueOf(i2);
            this.mMsgHandler.sendMessage(messageObtainMessage);
        } else {
            this.ag.b();
            this.aj.h();
        }
    }

    private boolean b(InterfaceUpdateReTrack.MarkerType markerType, jrv jrvVar) {
        Bitmap bitmapO;
        int i = AnonymousClass7.f10700b[markerType.ordinal()];
        if (i == 1) {
            jrvVar.e(this.af.a());
            bitmapO = this.af.o();
        } else if (i == 2) {
            jrvVar.e(this.af.b());
            bitmapO = this.af.j();
        } else if (i != 3) {
            bitmapO = null;
        } else {
            jrvVar.e(this.af.c());
            bitmapO = this.af.m();
        }
        if (bitmapO == null) {
            return true;
        }
        jrvVar.c(bitmapO);
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addAlbumAnimation(final int i) {
        if (this.mIsExitReTrack) {
            return;
        }
        this.g = new AnimatorSet();
        List<Bitmap> list = this.n.get(Integer.valueOf(i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null) {
                this.mTrackPhotoList.get(i2).setImageBitmap(list.get(i2));
            }
        }
        this.g.playTogether(e(this.mTrackPhotoList.get(0)), a(this.mTrackPhotoBackound));
        this.g.addListener(new Animator.AnimatorListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.9
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ReTrackDisplay.this.mTrackPhotoBackound.setVisibility(0);
                ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(121);
                ReTrackDisplay.this.mTrackPhotoList.get(0).setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ReTrackDisplay reTrackDisplay = ReTrackDisplay.this;
                reTrackDisplay.d(0, (List<Bitmap>) reTrackDisplay.n.get(Integer.valueOf(i)));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ReTrackDisplay.this.mTrackPhotoList.get(0).setVisibility(8);
                ReTrackDisplay.this.mTrackPhotoBackound.setVisibility(8);
            }
        });
        if (this.j.containsKey(Integer.valueOf(i))) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 117;
            messageObtain.obj = this.j.get(Integer.valueOf(i));
            this.mMsgHandler.sendMessage(messageObtain);
        }
        this.g.start();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    public void playVideo(int i) {
        LogUtil.a("Track_ReTrackDisplay", "playVideo: ", Integer.valueOf(i));
        Map<Integer, ArrayList<VideoModel>> map = this.o;
        if (map == null || !map.containsKey(Integer.valueOf(i)) || njy.e(this.o.get(Integer.valueOf(i)))) {
            LogUtil.j("Track_ReTrackDisplay", "playVideo: mIndexOfVideoPath ==null or not containsKey");
            this.aj.h();
            return;
        }
        if (this.o.get(Integer.valueOf(i)).get(0) == null || TextUtils.isEmpty(this.o.get(Integer.valueOf(i)).get(0).getVideoPath())) {
            LogUtil.j("Track_ReTrackDisplay", "playVideo: mIndexOfVideoPath ==null or VideoPath is empty");
            this.aj.h();
            return;
        }
        VideoView videoView = this.ak;
        if (videoView == null) {
            LogUtil.j("Track_ReTrackDisplay", "playVideo: playeView is null");
            l();
            return;
        }
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: jgj
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.d.c(mediaPlayer);
            }
        });
        this.ak.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: jgo
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            }
        });
        try {
            String videoPath = this.o.get(Integer.valueOf(i)).get(0).getVideoPath();
            LogUtil.a("Track_ReTrackDisplay", "playVideo: videoPath is ", videoPath);
            this.ak.setVideoPath(videoPath);
            this.mTrackPhotoBackound.setAlpha(0.6f);
            this.mTrackPhotoBackound.setVisibility(0);
            this.ak.start();
            this.ak.setVisibility(0);
        } catch (IllegalStateException e2) {
            LogUtil.j("Track_ReTrackDisplay", "playVideo: ", e2.toString());
            l();
        }
        if (this.j.containsKey(Integer.valueOf(i))) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 117;
            messageObtain.obj = this.j.get(Integer.valueOf(i));
            this.mMsgHandler.sendMessage(messageObtain);
            this.mMsgHandler.sendEmptyMessageDelayed(120, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MediaPlayer mediaPlayer) {
        LogUtil.a("Track_ReTrackDisplay", "playVideo: Completion");
        l();
    }

    private void l() {
        this.ak.setVisibility(8);
        this.mTrackPhotoBackound.setVisibility(8);
        this.mTrackPhotoBackound.setAlpha(1.0f);
        this.aj.h();
    }

    private Animator e(ImageView imageView) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(350L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new jre(0.2f, 0.0f, 0.2f, 1.0f));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private Animator a(FrameLayout frameLayout) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.6f));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new jre(0.2f, 0.0f, 0.2f, 1.0f));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final List<Bitmap> list) {
        LogUtil.a("Track_ReTrackDisplay", "numberOfPhotos:", String.valueOf(i));
        if (this.mIsExitReTrack) {
            this.mTrackPhotoBackound.setVisibility(8);
            this.mMsgHandler.sendEmptyMessage(120);
            this.mMsgHandler.sendEmptyMessage(128);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.95f);
        this.f = alphaAnimation;
        alphaAnimation.setDuration(800L);
        this.f.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.13
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (ReTrackDisplay.this.mIsExitReTrack) {
                    ReTrackDisplay.this.mTrackPhotoBackound.setVisibility(8);
                    ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(120);
                    ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(128);
                    return;
                }
                ReTrackDisplay.this.a(i, (List<Bitmap>) list);
            }
        });
        if (njy.c(this.mTrackPhotoList, i)) {
            this.mTrackPhotoList.get(i).startAnimation(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final List<Bitmap> list) {
        this.g = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.mTrackPhotoList.get(i)));
        int i2 = i + 1;
        if (i2 < list.size()) {
            this.mTrackPhotoList.get(i2).setVisibility(0);
            arrayList.add(b(this.mTrackPhotoList.get(i2)));
        }
        this.g.setDuration(500L);
        this.g.setInterpolator(new jre(0.2f, 0.0f, 0.2f, 1.0f));
        this.g.playTogether(arrayList);
        this.g.addListener(new Animator.AnimatorListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.15
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i3;
                ReTrackDisplay.this.mTrackPhotoList.get(i).setVisibility(8);
                ReTrackDisplay.this.mTrackPhotoList.get(i).setTranslationX(0.0f);
                if (i != list.size() - 1 && (i3 = i) != 2) {
                    ReTrackDisplay.this.d(i3 + 1, (List<Bitmap>) list);
                    return;
                }
                ReTrackDisplay.this.ag.b();
                ReTrackDisplay.this.aj.h();
                ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(120);
                ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(128);
                ReTrackDisplay.this.mTrackPhotoBackound.setVisibility(8);
            }
        });
        this.g.start();
    }

    private Animator a(ImageView imageView) {
        return ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("translationX", 0.0f, -this.an));
    }

    private Animator b(ImageView imageView) {
        return ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("translationX", this.an, 0.0f));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay$14] */
    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void hideAnimationMarker() {
        new Thread("Track_ReTrackDisplay") { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.14
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (ReTrackDisplay.this.d == null || ReTrackDisplay.this.d.size() < 1) {
                    ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(32);
                    return;
                }
                if (ReTrackDisplay.this.mIsExitReTrack) {
                    return;
                }
                a aVar = new a();
                for (int i = 0; i < ReTrackDisplay.this.d.size(); i++) {
                    aVar.c(i);
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                        LogUtil.j("Track_ReTrackDisplay", "error in thread sleep");
                    }
                }
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException unused2) {
                    LogUtil.j("Track_ReTrackDisplay", "error in thread sleep");
                }
            }
        }.start();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void drawLine(LatLong latLong, LatLong latLong2) {
        int color;
        jrt jrtVar = new jrt();
        jeq jeqVar = this.ab;
        if (jeqVar == null) {
            color = latLong.getLineStatus() == -1 ? ReTrackEngine.a.e : ReTrackEngine.a.f10719c;
        } else {
            color = Color.parseColor(jeqVar.g());
        }
        jrtVar.d(latLong.getLineStatus() == -1).b(latLong.getLatLng()).e(latLong2.getLatLng()).a(true).c(color).b(jer.d(4.0f));
        this.mMapEngine.drawLine(jrtVar);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void drawLines(List<LatLong> list) {
        if (list == null || list.size() < 2) {
            return;
        }
        int i = 0;
        while (i < list.size() - 1) {
            LatLong latLong = list.get(i);
            i++;
            drawLine(latLong, list.get(i));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void moveMarker(LatLong latLong) {
        if (this.ah != -1) {
            this.mMapEngine.moveMarker(this.ah, latLong.getLatLng());
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void initialZoomAnimation(float f2) {
        jrr jrrVar = new jrr();
        jrr jrrVarA = jrrVar.d(this.mTrackData.get(0).getLatLng()).a(f2);
        Float fValueOf = Float.valueOf(0.0f);
        jrrVarA.b(0.0f).c(0.0f);
        ReleaseLogUtil.d("Track_ReTrackDisplay", "inititalZoomAnimation zoom:", Float.valueOf(f2), " bearing:", fValueOf, " tilt:", fValueOf, " duration:", 1000L);
        this.mCameraId++;
        final long j = this.mCameraId;
        this.mMapEngine.animateCamera(jrrVar, 1000L, new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.12
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "initialZoomAnimation finish");
                Message messageObtain = Message.obtain();
                messageObtain.what = 49;
                messageObtain.obj = Float.valueOf(ReTrackDisplay.this.mTrackAnimationControl.getRunTiltAngle());
                ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void initialWhirlAnimation(float f2) {
        float angle;
        if (!this.mLensData.get(0).isTurnState()) {
            angle = 0.0f;
        } else if (this.mMapEngine.isClockwise()) {
            angle = 360.0f - ((float) this.mLensData.get(0).getAngle());
        } else {
            angle = (float) this.mLensData.get(0).getAngle();
        }
        jrr mapStatus = this.mMapEngine.getMapStatus();
        mapStatus.b(angle).c(f2);
        LogUtil.a("Track_ReTrackDisplay", "initialWhirlAnimation bearing:", Float.valueOf(angle), " tilt:", Float.valueOf(f2), " duration:", 500L);
        this.mCameraId++;
        final long j = this.mCameraId;
        this.mMapEngine.animateCamera(mapStatus, 500L, new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.11
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "initialWhirlAnimation finish");
                ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(64);
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void finalZoomAnimation(final float f2) {
        jrr jrrVar = new jrr();
        jrr jrrVarA = jrrVar.d(this.mTrackSimplify.getCenterPoint().getLatLng()).a(f2);
        Float fValueOf = Float.valueOf(0.0f);
        jrrVarA.b(0.0f).c(0.0f);
        ReleaseLogUtil.d("Track_ReTrackDisplay", "finalZoomAnimation bearing:", fValueOf, " tilt:", fValueOf, " duration:", 1000L);
        this.mCameraId++;
        final long j = this.mCameraId;
        this.mMapEngine.animateCamera(jrrVar, 1000L, new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.17
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "finalZoomAnimation finish");
                ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(114);
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mMapEngine.getMapZoom() - f2 > 1.0E-6d || ReTrackDisplay.this.mMapEngine.getMapEngineType() != 3) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "retry finalZoomAnimation");
                ReTrackDisplay.this.finalZoomAnimation(f2);
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void finalWhirlAnimation(final float f2) {
        jrr mapStatus = this.mMapEngine.getMapStatus();
        mapStatus.b(0.0f).c(f2);
        LogUtil.a("Track_ReTrackDisplay", "finalWhirlAnimation bearing:", Float.valueOf(0.0f), " tilt:", Float.valueOf(f2), " duration:", 500L);
        this.mCameraId++;
        final long j = this.mCameraId;
        this.mMapEngine.animateCamera(mapStatus, 500L, new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.3
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "finalWhirlAnimation finish");
                Message messageObtain = Message.obtain();
                messageObtain.what = 50;
                messageObtain.obj = Float.valueOf(ReTrackDisplay.this.am.e());
                ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mMapEngine.getMapTilt() - f2 > 1.0E-6d || ReTrackDisplay.this.mMapEngine.getMapEngineType() != 3) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "retry finalWhirlAnimation");
                ReTrackDisplay.this.finalWhirlAnimation(f2);
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addGpsTrackLine() {
        addStartMarker();
        addEndMarker();
        Set<Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType>> setEntrySet = this.mAlbumMarkers.entrySet();
        if (njy.b(setEntrySet)) {
            for (Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType> entry : setEntrySet) {
                InterfaceUpdateReTrack.MarkerType value = entry.getValue();
                if (value != null) {
                    addAlbumMarker(entry.getKey().intValue(), value);
                }
            }
        }
        a();
        for (int i = 0; i < this.h.size(); i++) {
            jrs jrsVar = new jrs();
            jrsVar.a((List<jpg>) this.h.get(i).second);
            jeq jeqVar = this.ab;
            if (jeqVar == null) {
                jrsVar.c(((Integer) this.h.get(i).first).intValue() > 0 ? ReTrackEngine.a.f10719c : ReTrackEngine.a.e);
            } else {
                jrsVar.c(Color.parseColor(jeqVar.g()));
            }
            jrsVar.d(((Integer) this.h.get(i).first).intValue() <= 0);
            jrsVar.b(jer.d(4.0f));
            this.mMapEngine.drawLines(jrsVar);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addUnpaintedGpsTrackLine() {
        addStartMarker();
        addEndMarker();
        Set<Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType>> setEntrySet = this.mAlbumMarkers.entrySet();
        if (njy.b(setEntrySet)) {
            for (Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType> entry : setEntrySet) {
                InterfaceUpdateReTrack.MarkerType value = entry.getValue();
                if (value != null) {
                    Integer key = entry.getKey();
                    addAlbumMarker(key.intValue(), value);
                    LogUtil.a("Track_ReTrackDisplay", "mAlbumMarkers:", String.valueOf(key));
                }
            }
        }
        a();
        for (int i = 0; i < this.h.size(); i++) {
            jrs jrsVar = new jrs();
            jrsVar.a((List<jpg>) this.h.get(i).second);
            jrsVar.c(((Integer) this.h.get(i).first).intValue() > 0 ? ReTrackEngine.a.f10717a : ReTrackEngine.a.f10718b);
            jrsVar.d(((Integer) this.h.get(i).first).intValue() <= 0);
            jrsVar.b(jer.d(4.0f));
            this.mMapEngine.drawLines(jrsVar);
        }
    }

    private void a() {
        if (this.h == null) {
            ArrayList arrayList = new ArrayList();
            this.h = new ArrayList();
            this.ai = new ArrayList();
            int i = 1;
            int i2 = 0;
            for (int i3 = 0; i3 < this.mTrackData.size(); i3++) {
                int lineStatus = this.mTrackData.get(i3).getLineStatus();
                if (lineStatus > 0) {
                    this.ai.add(Double.valueOf(1.0d));
                    i2++;
                } else {
                    this.ai.add(Double.valueOf(-1.0d));
                }
                arrayList.add(this.mTrackData.get(i3).getLatLng());
                if (i * lineStatus < 0) {
                    if (arrayList.size() > 0) {
                        this.h.add(new Pair<>(Integer.valueOf(i), arrayList));
                    }
                    arrayList = new ArrayList();
                    arrayList.add(this.mTrackData.get(i3).getLatLng());
                    i = lineStatus;
                }
            }
            if (arrayList.size() > 0) {
                this.h.add(new Pair<>(Integer.valueOf(i), arrayList));
            }
            new c().a(i2);
            this.x.b();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addLenTrackLine() {
        if (this.q) {
            if (this.v == null) {
                this.v = new ArrayList();
                for (int i = 0; i < this.mLensData.size(); i++) {
                    this.v.add(this.mLensData.get(i).getLatLng());
                }
            }
            jrs jrsVar = new jrs();
            jrsVar.a(this.v);
            jrsVar.c(ReTrackEngine.a.d);
            jrsVar.d(false);
            jrsVar.b(jer.d(4.0f));
            this.mMapEngine.drawLines(jrsVar);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void addCustomMarkerList() {
        if (njy.e(this.mCustomMarkerList)) {
            LogUtil.j("Track_ReTrackDisplay", "mMarkersList is empty.");
            return;
        }
        for (int i = 1; i < this.mCustomMarkerList.size() - 1; i++) {
            jpk jpkVar = this.mCustomMarkerList.get(i);
            if (jpkVar == null) {
                ReleaseLogUtil.a("Track_ReTrackDisplay", "hiHealthMarker is null.");
            } else {
                jrv jrvVar = new jrv();
                jrvVar.d(jpkVar.e()).c(jpkVar.c(), jpkVar.a()).c(qqf.a(jpkVar.b()));
                this.mMapEngine.addMarker(jrvVar, null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay$2] */
    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void trackMoveLooper() {
        new Thread("Track_ReTrackDisplay") { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                ReTrackDisplay.this.addStartMarker();
                ReTrackDisplay.this.addMoveMarker();
                f fVar = new f();
                ReTrackDisplay.this.d = new ArrayList();
                ReTrackDisplay.this.aj.b();
                ReTrackDisplay.this.ag.c();
                ReTrackDisplay.this.ap = 0L;
                int i = 0;
                ReTrackDisplay.this.s = false;
                ReTrackDisplay.this.y = false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (!ReTrackDisplay.this.mIsExitReTrack) {
                    if (!ReTrackDisplay.this.aj.d()) {
                        if (i < ReTrackDisplay.this.mTrackData.size()) {
                            fVar.c(i);
                            fVar.d(i);
                            fVar.g(i);
                            fVar.a(i);
                            fVar.f(i);
                            fVar.h(i);
                            fVar.i(i);
                            fVar.b(i);
                            fVar.i();
                            if (i == 0) {
                                ReTrackDisplay.this.s();
                            }
                            fVar.e(jCurrentTimeMillis);
                            i++;
                        } else {
                            fVar.d();
                            ReTrackDisplay.this.addEndMarker();
                            fVar.e();
                            fVar.c();
                            return;
                        }
                    }
                }
            }
        }.start();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void updateAnimation(LenLatLong lenLatLong) {
        if (this.mIsExitReTrack || this.mReTrackStateManager.b() == 2 || this.aj.b(lenLatLong) || lenLatLong.isStopState()) {
            return;
        }
        if (lenLatLong.isTurnState()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 82;
            messageObtain.obj = lenLatLong;
            this.mMsgHandler.sendMessage(messageObtain);
            return;
        }
        if (lenLatLong.isStraightState()) {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 81;
            if (njy.c(this.mLensData, lenLatLong.getIndex() + 1)) {
                messageObtain2.obj = new Pair(lenLatLong, this.mLensData.get(lenLatLong.getIndex() + 1));
            }
            this.mMsgHandler.sendMessage(messageObtain2);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void moveCamera(final LenLatLong lenLatLong, final LenLatLong lenLatLong2) {
        final int lenMoveDuration = ((int) this.mTrackAnimationControl.getLenMoveDuration(lenLatLong.getDistance())) + 1;
        jrr mapStatus = this.mMapEngine.getMapStatus();
        mapStatus.d(lenLatLong2.getLatLng());
        LogUtil.a("Track_ReTrackDisplay", "moveCamera bearing:", Float.valueOf(mapStatus.c()), " tilt:", Float.valueOf(mapStatus.d()), " duration:", Integer.valueOf(lenMoveDuration));
        this.mCameraId++;
        final long j = this.mCameraId;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        long jE = e(jCurrentTimeMillis);
        long j2 = lenMoveDuration;
        if (this.y) {
            return;
        }
        long jMin = Math.min(j2, 100L);
        if (this.aj.b(lenLatLong)) {
            c(lenLatLong, lenLatLong2);
        } else {
            this.mMapEngine.animateCamera(mapStatus, Math.max(j2 - jE, jMin), new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.4
                @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
                public void onFinish() {
                    if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                        return;
                    }
                    LogUtil.a("Track_ReTrackDisplay", "moveCamera finish");
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 80;
                    messageObtain.obj = lenLatLong2;
                    ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
                    ReTrackDisplay.this.aj.c(lenLatLong2);
                    ReTrackDisplay.this.ap += (long) lenMoveDuration;
                }

                @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
                public void onCancel() {
                    if (ReTrackDisplay.this.mIsExitReTrack) {
                        return;
                    }
                    LenLatLong lenLatLong3 = new LenLatLong(ReTrackDisplay.this.mMapEngine.getMapStatus().a().d, ReTrackDisplay.this.mMapEngine.getMapStatus().a().f38787a);
                    lenLatLong3.setIndex(lenLatLong.getIndex());
                    lenLatLong3.setDistance(jfa.b(lenLatLong3, lenLatLong2));
                    lenLatLong3.setLineStatus(lenLatLong.getLineStatus());
                    lenLatLong3.setState(1);
                    ReTrackDisplay.this.aj.c(lenLatLong3);
                    ReTrackDisplay.this.ap += System.currentTimeMillis() - jCurrentTimeMillis;
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void spinCamera(final LenLatLong lenLatLong) {
        double angle;
        jrr mapStatus = this.mMapEngine.getMapStatus();
        float fC = mapStatus.c();
        if (this.mMapEngine.isClockwise()) {
            angle = 360.0d - lenLatLong.getAngle();
        } else {
            angle = lenLatLong.getAngle();
        }
        float f2 = (float) angle;
        mapStatus.d(lenLatLong.getLatLng()).b(f2);
        final int spinDuration = ((int) this.mTrackAnimationControl.getSpinDuration(fC, f2)) + 1;
        LogUtil.a("Track_ReTrackDisplay", "spinCamera bearing:", Float.valueOf(mapStatus.c()), " tilt:", Float.valueOf(mapStatus.d()), " duration:", Integer.valueOf(spinDuration));
        this.mCameraId++;
        final long j = this.mCameraId;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.y) {
            return;
        }
        this.mMapEngine.animateCamera(mapStatus, spinDuration, new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.5
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                    return;
                }
                LogUtil.a("Track_ReTrackDisplay", "spinCamera Finish");
                Message messageObtain = Message.obtain();
                messageObtain.what = 81;
                if (njy.c(ReTrackDisplay.this.mLensData, lenLatLong.getIndex() + 1)) {
                    messageObtain.obj = new Pair(lenLatLong, ReTrackDisplay.this.mLensData.get(lenLatLong.getIndex() + 1));
                }
                ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
                ReTrackDisplay.this.ap += (long) spinDuration;
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
                if (ReTrackDisplay.this.mIsExitReTrack) {
                    return;
                }
                ReTrackDisplay.this.aj.c(lenLatLong);
                ReTrackDisplay.this.ap += System.currentTimeMillis() - jCurrentTimeMillis;
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void zoomCamera(float f2) {
        jrr mapStatus = this.mMapEngine.getMapStatus();
        mapStatus.a(f2);
        Float fValueOf = Float.valueOf(0.0f);
        LogUtil.a("Track_ReTrackDisplay", "zoomCamera zoom:", Float.valueOf(f2), " bearing:", fValueOf, " tilt:", fValueOf, " duration:", 1000L);
        this.mCameraId++;
        final long j = this.mCameraId;
        this.mMapEngine.animateCamera(mapStatus, Math.max(1000 - e(System.currentTimeMillis()), 100L), new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.6
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                if (ReTrackDisplay.this.mIsExitReTrack || ReTrackDisplay.this.mCameraId != j) {
                    return;
                }
                ReTrackDisplay.this.aj.h();
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void stopCamera() {
        LogUtil.a("Track_ReTrackDisplay", "stop camera");
        this.mMapEngine.stopAnimation();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    public ReTrackEngine setTrackVideo(VideoView videoView) {
        this.ak = videoView;
        return this;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine
    protected void firstFrameAwait() {
        this.mMapEngine.clear();
        this.i.clear();
        Message messageObtain = Message.obtain();
        messageObtain.what = 48;
        messageObtain.obj = Float.valueOf(this.mTrackAnimationControl.getRunZoomLevel());
        this.mMsgHandler.sendMessage(messageObtain);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void startReTrack() {
        if (this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.mIsExitReTrack = false;
        this.mMsgHandler.sendEmptyMessageDelayed(52, 300L);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void reset() {
        if (this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.mMapEngine.stopAnimation();
        this.mIsExitReTrack = true;
        for (int i = 0; i < this.mTrackPhotoList.size(); i++) {
            if (this.mTrackPhotoList.get(i).getVisibility() == 0) {
                this.mTrackPhotoList.get(i).clearAnimation();
                this.mTrackPhotoList.get(i).setVisibility(8);
            }
        }
        this.mTrackPhotoBackound.setVisibility(8);
        qsp.c((View) this.ak, 8);
        jrr jrrVar = this.am;
        if (jrrVar == null || this.l) {
            return;
        }
        jrr jrrVarB = jrr.b(jrrVar);
        jrrVarB.d(this.mTrackSimplify.getCenterPoint().getLatLng());
        this.mMapEngine.animateCamera(jrrVarB, -1L, (InterfaceMapCallback) null);
        this.mMapEngine.clear();
        this.i.clear();
        addGpsTrackLine();
        addLenTrackLine();
        addCustomMarkerList();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void resetLine() {
        if (this.mMapEngine == null) {
            return;
        }
        this.mMapEngine.clear();
        this.i.clear();
        addGpsTrackLine();
        addLenTrackLine();
        addCustomMarkerList();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setCustomMarkInfo(jeq jeqVar) {
        this.ab = jeqVar;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public long getTotalDuration() {
        if (this.mTrackAnimationControl != null) {
            return this.mTrackAnimationControl.getDurationMs();
        }
        return 0L;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void onCreate(Bundle bundle) {
        if (this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.af = new MarkerBuilder(this.mContext);
        this.mMapEngine.onCreatePurely(bundle);
        this.mMapEngine.setMapLoadedCallback(this.w);
        this.mMapEngine.setCameraChangeCallback(this.aa);
        this.mMapEngine.setLogoPadding(jer.d(4.0f), 0, 0, jer.d(4.0f));
        this.mMapEngine.disableAllGestures();
        this.mMapEngine.disableMarkerClick();
        this.mMapEngine.showPureMap();
        i();
        this.mMapEngine.changeMapType(c(this.mMapType), null);
        b(this.mMapType);
        if (this.mMapEngine.getMapEngineType() == 2 || this.mMapEngine.getMapEngineType() == 3) {
            t();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void onResume() {
        if (this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.mIsExitReTrack = false;
        this.mMapEngine.onResumePurely();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void onPause() {
        if (this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.mIsExitReTrack = true;
        for (int i = 0; i < this.mTrackPhotoList.size(); i++) {
            if (this.mTrackPhotoList.get(i).getVisibility() == 0) {
                this.mTrackPhotoList.get(i).clearAnimation();
                this.mTrackPhotoList.get(i).setVisibility(8);
            }
        }
        this.mTrackPhotoBackound.setVisibility(8);
        qsp.c((View) this.ak, 8);
        this.g.end();
        this.mMapEngine.onPausePurely();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void onDestroy() {
        if (this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.mIsExitReTrack = true;
        for (int i = 0; i < this.mTrackPhotoList.size(); i++) {
            if (this.mTrackPhotoList.get(i).getVisibility() == 0) {
                this.mTrackPhotoList.get(i).clearAnimation();
                this.mTrackPhotoList.get(i).setVisibility(8);
            }
        }
        this.mTrackPhotoBackound.setVisibility(8);
        this.g.end();
        this.mMapEngine.stopAnimation();
        this.mMapEngine.onDestroyPurely();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void changeMapType(MapTypeDescription.MapType mapType, jes jesVar) {
        if (mapType == null || this.mReTrackStateManager.b() == -1 || this.mMapEngine == null) {
            return;
        }
        this.mMapType = mapType;
        this.mMapEngine.changeMapType(c(mapType), jesVar);
        b(this.mMapType);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setAutoMatchPhotos(HashMap<Integer, List<Bitmap>> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<Integer, List<Bitmap>> entry : map.entrySet()) {
            if (jgx.b(entry.getValue(), Bitmap.class)) {
                this.n.put(entry.getKey(), entry.getValue());
                LogUtil.a("Track_ReTrackDisplay", "automatchindex:", String.valueOf(entry.getKey()));
                Message messageObtain = Message.obtain();
                messageObtain.what = Constants.MAX_PRO_BOTTOM_MARGIN_PAD;
                messageObtain.obj = new Pair(entry.getKey(), InterfaceUpdateReTrack.MarkerType.Image_type);
                this.mMsgHandler.sendMessage(messageObtain);
            }
        }
    }

    private void c(LenLatLong lenLatLong, LenLatLong lenLatLong2) {
        LenLatLong lenLatLong3 = new LenLatLong(this.mMapEngine.getMapStatus().a().d, this.mMapEngine.getMapStatus().a().f38787a);
        lenLatLong3.setIndex(lenLatLong.getIndex());
        lenLatLong3.setDistance(jfa.b(lenLatLong, lenLatLong2));
        lenLatLong3.setLineStatus(lenLatLong.getLineStatus());
        lenLatLong3.setState(1);
        this.aj.c(lenLatLong3);
    }

    private void n() {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = this.mContext.getAssets().open("style.data");
            byte[] bArr = new byte[inputStreamOpen.available()];
            this.ad = bArr;
            if (inputStreamOpen.read(bArr) <= 0) {
                LogUtil.e("Track_ReTrackDisplay", "read map style data fail.");
            }
        } catch (IOException e2) {
            LogUtil.e("Track_ReTrackDisplay", e2.getMessage());
        } finally {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e3) {
                    LogUtil.e("Track_ReTrackDisplay", e3.getMessage());
                }
            }
        }
    }

    private MapTypeDescription c(MapTypeDescription.MapType mapType) {
        if (this.ad == null) {
            n();
        }
        if (this.ac == null) {
            MapTypeDescription mapTypeDescription = new MapTypeDescription();
            this.ac = mapTypeDescription;
            mapTypeDescription.e(this.ad);
        }
        this.ac.e(mapType);
        int i = AnonymousClass7.d[mapType.ordinal()];
        if (i == 1) {
            this.ac.e(true);
        } else if (i != 2 && i != 3 && i == 4) {
            this.ac.e(false);
        } else {
            this.ac.e(false);
        }
        return this.ac;
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10700b;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[MapTypeDescription.MapType.values().length];
            d = iArr;
            try {
                iArr[MapTypeDescription.MapType.MAP_TYPE_SATELLITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[MapTypeDescription.MapType.MAP_TYPE_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[MapTypeDescription.MapType.MAP_TYPE_NIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[MapTypeDescription.MapType.MAP_TYPE_NAVI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[InterfaceUpdateReTrack.MarkerType.values().length];
            f10700b = iArr2;
            try {
                iArr2[InterfaceUpdateReTrack.MarkerType.Text_type.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10700b[InterfaceUpdateReTrack.MarkerType.Image_type.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10700b[InterfaceUpdateReTrack.MarkerType.Video_type.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.mLensData.size() < 2) {
            LogUtil.j("Track_ReTrackDisplay", "mLensData.size less 2");
            return;
        }
        LenLatLong lenLatLong = new LenLatLong(this.mLensData.get(0).getLatLng().d, this.mLensData.get(0).getLatLng().f38787a);
        lenLatLong.setIndex(0);
        lenLatLong.setDistance(this.mLensData.get(0).getDistance());
        lenLatLong.setLineStatus(this.mLensData.get(0).getLineStatus());
        lenLatLong.setState(1);
        this.u = System.currentTimeMillis();
        if (this.aj.b(lenLatLong)) {
            return;
        }
        LogUtil.a("Track_ReTrackDisplay", "start Lens Move");
        Message messageObtain = Message.obtain();
        messageObtain.what = 81;
        messageObtain.obj = new Pair(this.mLensData.get(0), this.mLensData.get(1));
        this.mMsgHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        return this.mMapType == MapTypeDescription.MapType.MAP_TYPE_SATELLITE || this.mMapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT;
    }

    private long e(long j) {
        long j2 = (j - this.u) - this.ap;
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    private void i() {
        if (qqs.e(this.mContext) && !o() && k()) {
            this.mMapType = MapTypeDescription.MapType.MAP_TYPE_NIGHT;
            a(true);
        } else if (qqs.e(this.mContext) && o() && k()) {
            h();
        } else {
            h();
            a(false);
        }
    }

    private boolean k() {
        return this.mMapEngine.getMapEngineType() == 1 || this.mMapEngine.getMapEngineType() == 2 || this.mMapEngine.getMapEngineType() == 3;
    }

    private void h() {
        Context context = this.mContext;
        Context context2 = this.mContext;
        this.mMapType = jho.d(context.getSharedPreferences("retrack_file", 0).getString(jho.d(this.mMapEngine.getMapEngineType()), jho.a(this.mMapEngine.getMapEngineType())));
    }

    private void b(MapTypeDescription.MapType mapType) {
        String strD = jho.d(mapType);
        Context context = this.mContext;
        Context context2 = this.mContext;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("retrack_file", 0).edit();
        editorEdit.putString(jho.d(this.mMapEngine.getMapEngineType()), strD);
        editorEdit.commit();
    }

    private boolean o() {
        Context context = this.mContext;
        Context context2 = this.mContext;
        return context.getSharedPreferences("retrack_file", 0).getBoolean(g(), false);
    }

    private void a(boolean z) {
        Context context = this.mContext;
        Context context2 = this.mContext;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("retrack_file", 0).edit();
        editorEdit.putBoolean(g(), z);
        editorEdit.commit();
    }

    private String g() {
        if (this.mMapEngine.getMapEngineType() == 1) {
            return "map_type_init_by_dark_mode_done";
        }
        return "map_type_init_by_dark_mode_done" + this.mMapEngine.getMapEngineType();
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f10713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f10714b;
        private boolean d;
        private double e;
        private double g;
        private double h;
        private Deque<LatLong> j;

        private f() {
            this.f10713a = 0.0d;
            this.f10714b = 0.0d;
            this.h = 0.0d;
            this.e = 0.0d;
            this.g = 0.0d;
            this.j = new LinkedList();
            this.d = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i) {
            if (i >= ReTrackDisplay.this.mTrackData.size()) {
                return;
            }
            if (i == 0) {
                LinkedList linkedList = new LinkedList();
                this.j = linkedList;
                linkedList.offerLast(ReTrackDisplay.this.mTrackData.get(i));
                this.j.offerLast(ReTrackDisplay.this.mTrackData.get(i));
                this.h = 0.0d;
                this.f10713a = 0.0d;
                this.f10714b = 0.0d;
            } else {
                this.j.offerLast(ReTrackDisplay.this.mTrackData.get(i));
                double lineDrawDuration = ReTrackDisplay.this.mTrackAnimationControl.getLineDrawDuration(ReTrackDisplay.this.mTrackData.get(i - 1).getDistance());
                this.h += lineDrawDuration;
                a(lineDrawDuration);
            }
            this.d = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i) {
            String str;
            if (i >= ReTrackDisplay.this.mTrackData.size()) {
                LogUtil.j("Track_ReTrackDisplay", "updateAlbum: index >= track data size");
                return;
            }
            int size = 0;
            ReTrackDisplay.this.t = false;
            if (ReTrackDisplay.this.n.containsKey(Integer.valueOf(i)) || ReTrackDisplay.this.j.containsKey(Integer.valueOf(i)) || ReTrackDisplay.this.o.containsKey(Integer.valueOf(i))) {
                ReTrackDisplay.this.t = true;
                ReTrackDisplay.this.aj.e();
                ReTrackDisplay.this.aj.a();
                ReTrackDisplay.this.ag.a();
                InterfaceUpdateReTrack.MarkerType markerTypeE = e(i);
                Message messageObtain = Message.obtain();
                messageObtain.what = 115;
                messageObtain.obj = new Pair(new Pair(ReTrackDisplay.this.mTrackData.get(i), 4), new Pair(Integer.valueOf(i), markerTypeE));
                ReTrackDisplay.this.mMsgHandler.sendMessageDelayed(messageObtain, 300L);
                long jC = 0;
                if (!ReTrackDisplay.this.n.containsKey(Integer.valueOf(i))) {
                    if (!ReTrackDisplay.this.o.containsKey(Integer.valueOf(i))) {
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = 117;
                        if (!ReTrackDisplay.this.j.containsKey(Integer.valueOf(i))) {
                            str = "";
                        } else {
                            str = (String) ReTrackDisplay.this.j.get(Integer.valueOf(i));
                        }
                        messageObtain2.obj = str;
                        ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain2);
                        ReTrackDisplay.this.mMsgHandler.sendEmptyMessageDelayed(120, 2000L);
                    } else {
                        jC = ReTrackDisplay.this.c(i);
                    }
                } else {
                    size = ((List) ReTrackDisplay.this.n.get(Integer.valueOf(i))).size();
                }
                double d = this.g;
                long j = ((long) size) * TrackAnimationControl.DISPLAY_PHOTO_DURATION;
                this.g = d + 600.0d + 150.0d + 250.0d + j + jC;
                ReTrackDisplay reTrackDisplay = ReTrackDisplay.this;
                reTrackDisplay.ap = reTrackDisplay.ap + 1000 + j + jC;
                this.d = true;
            }
        }

        private InterfaceUpdateReTrack.MarkerType e(int i) {
            if (ReTrackDisplay.this.n.containsKey(Integer.valueOf(i))) {
                return InterfaceUpdateReTrack.MarkerType.Image_type;
            }
            if (ReTrackDisplay.this.o.containsKey(Integer.valueOf(i))) {
                return InterfaceUpdateReTrack.MarkerType.Video_type;
            }
            return InterfaceUpdateReTrack.MarkerType.Text_type;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(final int i) {
            if (i >= ReTrackDisplay.this.mTrackData.size() || ReTrackDisplay.this.r) {
                return;
            }
            double dDoubleValue = ((Double) ReTrackDisplay.this.ai.get(i)).doubleValue();
            if (dDoubleValue < 0.0d) {
                Bitmap bitmapD = ReTrackDisplay.this.af.d(Math.abs(dDoubleValue));
                final jrv jrvVar = new jrv();
                jrvVar.d(ReTrackDisplay.f10676b);
                jrvVar.d(ReTrackDisplay.this.mTrackData.get(i).getLatLng());
                jrvVar.c(ReTrackDisplay.this.mIs3dMarker);
                jrvVar.e(ReTrackDisplay.this.af.e(Math.abs(dDoubleValue)));
                jrvVar.c(bitmapD);
                ReTrackDisplay.this.mMsgHandler.post(new Runnable() { // from class: jgr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.d(jrvVar, i);
                    }
                });
                this.d = true;
                ReTrackDisplay.this.ag.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(jrv jrvVar, int i) {
            ReTrackDisplay.this.addGrowAnimationMarker(jrvVar, 1, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(final int i) {
            if (i >= ReTrackDisplay.this.mTrackData.size()) {
                return;
            }
            if (ReTrackDisplay.this.mTrackSimplify.getHiHealthMarkerMap() == null) {
                LogUtil.a("Track_ReTrackDisplay", "no HiHealth Marker Map");
                return;
            }
            if (ReTrackDisplay.this.mTrackSimplify.getHiHealthMarkerMap().containsKey(Integer.valueOf(i))) {
                jpk jpkVar = ReTrackDisplay.this.mTrackSimplify.getHiHealthMarkerMap().get(Integer.valueOf(i));
                if (jpkVar == null) {
                    ReleaseLogUtil.a("Track_ReTrackDisplay", "hiHealthMarker is null.");
                    return;
                }
                Bitmap bitmapA = qqf.a(jpkVar.b());
                final jrv jrvVar = new jrv();
                jrvVar.c(jpkVar.c(), jpkVar.a()).d(jpkVar.e()).c(bitmapA);
                ReTrackDisplay.this.mMsgHandler.post(new Runnable() { // from class: jgn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38578c.e(jrvVar, i);
                    }
                });
                this.d = true;
                ReTrackDisplay.this.ag.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(jrv jrvVar, int i) {
            ReTrackDisplay.this.addGrowAnimationMarker(jrvVar, 1, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i) {
            if (ReTrackDisplay.this.mIsSupportArea && i < ReTrackDisplay.this.mTrackData.size() && !ReTrackDisplay.this.aj.c() && ReTrackDisplay.this.s != ReTrackDisplay.this.mTrackData.get(i).getIsInArea()) {
                ReTrackDisplay reTrackDisplay = ReTrackDisplay.this;
                reTrackDisplay.s = !reTrackDisplay.s;
                ReTrackDisplay.this.aj.e();
                ReTrackDisplay.this.aj.a();
                float newZoomLevel = ReTrackDisplay.this.s ? ReTrackDisplay.this.mTrackAnimationControl.getNewZoomLevel((float) ReTrackDisplay.this.mTrackData.get(i).getAreaFraction()) : ReTrackDisplay.this.mTrackAnimationControl.getRunZoomLevel();
                Message messageObtain = Message.obtain();
                messageObtain.what = 83;
                messageObtain.obj = Float.valueOf(newZoomLevel);
                ReTrackDisplay.this.mMsgHandler.sendMessageDelayed(messageObtain, 300L);
                this.g = this.g + 1000.0d + 600.0d;
                ReTrackDisplay.this.ap += TrackAnimationControl.DISPLAY_PHOTO_DURATION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(final int i) {
            if (i < ReTrackDisplay.this.mTrackData.size() && ReTrackDisplay.this.x.e(i)) {
                if (!ReTrackDisplay.this.n.containsKey(Integer.valueOf(i)) && !ReTrackDisplay.this.j.containsKey(Integer.valueOf(i))) {
                    ReTrackDisplay.this.aj.e();
                    ReTrackDisplay.this.aj.a();
                }
                ReTrackDisplay.this.ag.a();
                Bitmap bitmapA = ReTrackDisplay.this.af.a(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(i)), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType());
                final jrv jrvVar = new jrv();
                jrvVar.d(ReTrackDisplay.f10676b);
                jrvVar.d(ReTrackDisplay.this.mTrackData.get(i).getLatLng());
                jrvVar.e(ReTrackDisplay.this.af.e(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(i)), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType()));
                jrvVar.c(bitmapA);
                ReTrackDisplay.this.mMsgHandler.postDelayed(new Runnable() { // from class: jgp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b(jrvVar, i);
                    }
                }, 200L);
                this.d = true;
                Message messageObtain = Message.obtain();
                messageObtain.what = 97;
                messageObtain.obj = new Pair(Integer.valueOf(ReTrackDisplay.this.x.a(ReTrackDisplay.this.x.a(i))), Double.valueOf(ReTrackDisplay.this.x.b(ReTrackDisplay.this.x.a(i))));
                ReTrackDisplay.this.mMsgHandler.sendMessageDelayed(messageObtain, 200L);
                if (ReTrackDisplay.this.n.containsKey(Integer.valueOf(i)) || ReTrackDisplay.this.j.containsKey(Integer.valueOf(i))) {
                    return;
                }
                this.g = this.g + 600.0d + 150.0d + 250.0d;
                ReTrackDisplay.this.ap += 1000;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(jrv jrvVar, int i) {
            ReTrackDisplay.this.addGrowAnimationMarker(jrvVar, 3, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            this.e = 0.0d;
            if (this.d || this.h >= 15.0d) {
                a();
                this.d = false;
            }
        }

        private void a() {
            LatLong latLongPeekLast = this.j.peekLast();
            if (latLongPeekLast == null) {
                return;
            }
            LatLong latLongPollFirst = this.j.pollFirst();
            ArrayList arrayList = new ArrayList();
            while (latLongPollFirst != null) {
                arrayList.add(latLongPollFirst);
                latLongPollFirst = this.j.pollFirst();
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 65;
            messageObtain.obj = arrayList;
            ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
            this.j.offerLast(latLongPeekLast);
            double d = this.h;
            this.e = d >= 15.0d ? d : 15.0d;
            this.g += d;
            this.h = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i) {
            if (i >= ReTrackDisplay.this.mTrackData.size()) {
                return;
            }
            if (ReTrackDisplay.this.t || this.f10713a >= 45.0d || i >= ReTrackDisplay.this.mTrackData.size() - 1) {
                double dAbs = Math.abs(((Double) ReTrackDisplay.this.ai.get(i)).doubleValue());
                Message messageObtain = Message.obtain();
                messageObtain.what = 96;
                messageObtain.obj = jpq.b(dAbs);
                ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
            }
        }

        public void a(int i) {
            if (i >= ReTrackDisplay.this.mTrackData.size()) {
                return;
            }
            if (this.f10714b >= 15.0d || i == ReTrackDisplay.this.mTrackData.size() - 1 || i == 0 || ReTrackDisplay.this.x.e(i)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 99;
                messageObtain.obj = Integer.valueOf(i);
                ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.g = 0.0d;
            ReTrackDisplay.this.y = true;
            Message messageObtain = Message.obtain();
            messageObtain.what = 51;
            messageObtain.obj = Float.valueOf(0.0f);
            ReTrackDisplay.this.mMsgHandler.sendMessage(messageObtain);
            ReTrackDisplay.this.mReTrackStateManager.e(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (ReTrackDisplay.this.mMapEngine.getMapEngineType() == 1) {
                ReTrackDisplay.this.mMapEngine.onPause();
                h();
                ReTrackDisplay.this.mMapEngine.onResume();
                return;
            }
            h();
        }

        private void h() {
            try {
                Thread.sleep(ReTrackDisplay.this.ag.d());
            } catch (InterruptedException unused) {
                LogUtil.j("Track_ReTrackDisplay", "some error in threadSyncMarker");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            if (ReTrackDisplay.this.mMapEngine.getMapEngineType() == 1) {
                ReTrackDisplay.this.mMapEngine.onPause();
                b();
                ReTrackDisplay.this.mMapEngine.onResume();
                return;
            }
            b();
        }

        private void b() {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                LogUtil.j("Track_ReTrackDisplay", "some error in threadSyncLens");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(long j) {
            if (this.e >= 15.0d && System.currentTimeMillis() - j <= this.g) {
                try {
                    Thread.sleep((int) (this.e + 0.5d));
                } catch (InterruptedException unused) {
                    LogUtil.j("Track_ReTrackDisplay", "some error in threadSleep");
                }
            }
        }

        private void a(double d) {
            if (this.f10713a >= 45.0d) {
                this.f10713a = 0.0d;
            }
            if (this.f10714b >= 15.0d) {
                this.f10714b = 0.0d;
            }
            this.f10713a += d;
            this.f10714b += d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long c(int i) {
        if (njy.e(this.o.get(Integer.valueOf(i))) || this.o.get(Integer.valueOf(i)).get(0) == null) {
            return 0L;
        }
        return this.o.get(Integer.valueOf(i)).get(0).getDuration();
    }

    class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i) {
            if (i >= ReTrackDisplay.this.d.size()) {
                return;
            }
            GrowAnimationBuilder growAnimation = ReTrackDisplay.this.mMapEngine.getGrowAnimation();
            ReTrackDisplay reTrackDisplay = ReTrackDisplay.this;
            growAnimation.setType(reTrackDisplay.e(((Integer) ((Pair) reTrackDisplay.d.get(i)).first).intValue()));
            growAnimation.setFrictionAnimationDuration(400L);
            ReTrackDisplay.this.mMapEngine.hideMarker(((Integer) ((Pair) ReTrackDisplay.this.d.get(i)).second).intValue(), growAnimation);
            if (i == ReTrackDisplay.this.d.size() - 1) {
                ReTrackDisplay.this.mMsgHandler.sendEmptyMessageDelayed(32, 410L);
            }
        }
    }

    class c {
        private c() {
        }

        public void a(int i) {
            if (i <= 1) {
                return;
            }
            double validTotalDistance = ReTrackDisplay.this.mTrackSimplify.getValidTotalDistance();
            double d = i - 1;
            double d2 = validTotalDistance / d;
            double kmMarkerSpace = ReTrackDisplay.this.mTrackAnimationControl.getKmMarkerSpace();
            int i2 = (int) ((d * kmMarkerSpace) / validTotalDistance);
            double d3 = 0.0d;
            int i3 = 0;
            ReTrackDisplay.this.ai.set(0, Double.valueOf(0.0d));
            int i4 = 1;
            double d4 = 0.0d;
            double d5 = 0.0d;
            while (i4 < ReTrackDisplay.this.ai.size() - 1) {
                if (((Double) ReTrackDisplay.this.ai.get(i4)).doubleValue() > d3) {
                    i3++;
                    d4 += d2;
                    if (i2 == 0 || i3 % i2 != 0) {
                        ReTrackDisplay.this.ai.set(i4, Double.valueOf(d4));
                    } else {
                        d5 += kmMarkerSpace;
                        if (d5 <= validTotalDistance) {
                            ReTrackDisplay.this.ai.set(i4, Double.valueOf((-1.0d) * d5));
                        } else {
                            ReTrackDisplay.this.ai.set(i4, Double.valueOf(d4));
                        }
                    }
                } else {
                    ReTrackDisplay.this.ai.set(i4, Double.valueOf(d4));
                }
                i4++;
                d3 = 0.0d;
            }
            if (i2 == 0 || (i3 + 1) % i2 != 0) {
                ReTrackDisplay.this.ai.set(ReTrackDisplay.this.ai.size() - 1, Double.valueOf(validTotalDistance));
            } else {
                ReTrackDisplay.this.ai.set(ReTrackDisplay.this.ai.size() - 1, Double.valueOf(validTotalDistance * (-1.0d)));
            }
        }
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LenLatLong f10709c;
        private final Object e;

        private d() {
            this.e = new Object();
            this.f10707a = false;
            this.f10708b = false;
            this.f10709c = null;
        }

        public boolean c() {
            boolean z;
            synchronized (this.e) {
                z = this.f10707a;
            }
            return z;
        }

        public boolean b(LenLatLong lenLatLong) {
            boolean z;
            synchronized (this.e) {
                z = this.f10707a;
                if (z) {
                    this.f10709c = lenLatLong;
                }
            }
            return z;
        }

        public boolean d() {
            boolean z;
            synchronized (this.e) {
                z = this.f10708b;
            }
            return z;
        }

        public void e() {
            synchronized (this.e) {
                this.f10709c = null;
                this.f10707a = true;
                if (System.currentTimeMillis() - ReTrackDisplay.this.mLastCameraStartTime <= 30) {
                    ReTrackDisplay.this.mMsgHandler.sendEmptyMessageDelayed(84, 30L);
                } else {
                    ReTrackDisplay.this.mMsgHandler.sendEmptyMessage(84);
                }
            }
        }

        public void b() {
            synchronized (this.e) {
                this.f10707a = false;
                this.f10708b = false;
                this.f10709c = null;
            }
        }

        public void a() {
            synchronized (this.e) {
                this.f10708b = true;
            }
        }

        public void c(LenLatLong lenLatLong) {
            synchronized (this.e) {
                this.f10709c = lenLatLong;
            }
        }

        public void h() {
            synchronized (this.e) {
                this.f10707a = false;
                ReTrackDisplay.this.mMsgHandler.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay.d.4
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (d.this.e) {
                            d.this.f10708b = false;
                        }
                    }
                }, 300L);
                if (this.f10709c == null) {
                    return;
                }
                Message messageObtainMessage = ReTrackDisplay.this.mMsgHandler.obtainMessage(80);
                messageObtainMessage.obj = this.f10709c;
                ReTrackDisplay.this.mMsgHandler.sendMessageDelayed(messageObtainMessage, 300L);
                this.f10709c = null;
            }
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<Integer, KeyExerciseType> f10705a;

        private b() {
            this.f10705a = new HashMap();
        }

        public boolean e(int i) {
            return this.f10705a.containsKey(Integer.valueOf(i));
        }

        public KeyExerciseType a(int i) {
            return this.f10705a.get(Integer.valueOf(i));
        }

        public double b(KeyExerciseType keyExerciseType) {
            int iOrdinal = keyExerciseType.ordinal();
            if (iOrdinal == 0) {
                return ((Double) ReTrackDisplay.this.mTrackSimplify.getMaxHeartRate().second).doubleValue();
            }
            if (iOrdinal == 1) {
                return ((Double) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().second).doubleValue();
            }
            if (iOrdinal != 2) {
                return 0.0d;
            }
            return ((Double) ReTrackDisplay.this.mTrackSimplify.getMaxAltitude().second).doubleValue();
        }

        public int a(KeyExerciseType keyExerciseType) {
            int iOrdinal = keyExerciseType.ordinal();
            if (iOrdinal != 0) {
                return (iOrdinal == 1 || iOrdinal != 2) ? 3 : 1;
            }
            return 2;
        }

        public MarkerBuilder.KeyExerciseInfoType e(KeyExerciseType keyExerciseType) {
            int iOrdinal = keyExerciseType.ordinal();
            if (iOrdinal == 0) {
                return MarkerBuilder.KeyExerciseInfoType.HeartRate_Marker;
            }
            if (iOrdinal == 1) {
                return MarkerBuilder.KeyExerciseInfoType.Speed_Marker;
            }
            if (iOrdinal == 2) {
                return MarkerBuilder.KeyExerciseInfoType.Altitude_Marker;
            }
            return MarkerBuilder.KeyExerciseInfoType.HeartRate_Marker;
        }

        public void b() {
            if (ReTrackDisplay.this.mTrackData == null || ReTrackDisplay.this.mTrackSimplify == null) {
                LogUtil.j("Track_ReTrackDisplay", "ReTrack data is null");
                return;
            }
            this.f10705a.clear();
            if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxAltitude().first).intValue() != -1) {
                this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxAltitude().first, KeyExerciseType.MAX_ALTITUDE);
            }
            if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxHeartRate().first).intValue() != -1) {
                this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxHeartRate().first, KeyExerciseType.MAX_HEART_RATE);
            }
            if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().first).intValue() != -1) {
                this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().first, KeyExerciseType.MAX_SPEED);
            }
            switch (ReTrackDisplay.this.mTrackSimplify.getCurveType()) {
                case 32:
                case 34:
                case 35:
                    if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().first).intValue() != -1) {
                        this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().first, KeyExerciseType.MAX_SPEED);
                    }
                    break;
                case 33:
                    if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxAltitude().first).intValue() != -1) {
                        this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxAltitude().first, KeyExerciseType.MAX_ALTITUDE);
                    }
                    break;
                case 36:
                    if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxHeartRate().first).intValue() != -1) {
                        this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxHeartRate().first, KeyExerciseType.MAX_HEART_RATE);
                    }
                    break;
                default:
                    if (((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().first).intValue() != -1) {
                        this.f10705a.put((Integer) ReTrackDisplay.this.mTrackSimplify.getMaxSpeed().first, KeyExerciseType.MAX_SPEED);
                    }
                    break;
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setAlgorithmStrength(TrackAnimationControl.Strength strength) {
        this.mTrackAnimationControl.setAlgorithmStrength(strength).update();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setIsSupportArea(boolean z) {
        this.mIsSupportArea = z;
        this.mTrackAnimationControl.setIsSupportArea(z);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10711a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f10712c;

        private e() {
            this.f10711a = 0;
            this.f10712c = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            synchronized (this.f10712c) {
                this.f10711a = 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            synchronized (this.f10712c) {
                this.f10711a++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            synchronized (this.f10712c) {
                this.f10711a--;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            long j;
            synchronized (this.f10712c) {
                j = this.f10711a > 0 ? 400L : 0L;
            }
            return j;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public InterfaceUpdateReTrack obtainInterfaceUpdateReTrack() {
        return this.ar;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void addAlbumMarker(int i, InterfaceUpdateReTrack.MarkerType markerType) {
        if (this.mMapEngine == null) {
            LogUtil.j("Track_ReTrackDisplay", " mMapEngine is null in addAlbumMarker");
            return;
        }
        LogUtil.a("Track_ReTrackDisplay", "addAlbumMarkerPoint:", String.valueOf(i));
        jrv jrvVar = new jrv();
        jrvVar.d(f10677c);
        if (njy.e(this.mTrackData, i)) {
            LogUtil.j("Track_ReTrackDisplay", "addAlbumMarker index is out of bounds");
            return;
        }
        jrvVar.d(this.mTrackData.get(i).getLatLng());
        if (b(markerType, jrvVar)) {
            return;
        }
        int iAddMarker = this.mMapEngine.addMarker(jrvVar, null);
        this.i.append(iAddMarker, i);
        this.mAlbumMarkers.put(Integer.valueOf(i), markerType);
        this.k.put(Integer.valueOf(i), Integer.valueOf(iAddMarker));
        LogUtil.a("Track_ReTrackDisplay", "addAlbumMarkerId", String.valueOf(iAddMarker));
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void deleteAlbumMarker(int i) {
        if (!this.k.containsKey(Integer.valueOf(i)) || this.k.get(Integer.valueOf(i)) == null) {
            return;
        }
        LogUtil.a("Track_ReTrackDisplay", "deleteAlbumMarker:", Integer.valueOf(i));
        this.mMapEngine.hideMarker(this.k.get(Integer.valueOf(i)).intValue(), null);
        this.i.delete(this.k.get(Integer.valueOf(i)).intValue());
        this.mAlbumMarkers.remove(Integer.valueOf(i));
        this.k.remove(Integer.valueOf(i));
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void deleteMarkerIndex(int i) {
        if (this.ae.contains(Integer.valueOf(i))) {
            this.ae.remove(Integer.valueOf(i));
            this.mTrackAnimationControl.setMarkersNumber(this.ae.size());
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void updateTrackAnimationControl() {
        this.mTrackAnimationControl.update();
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setSumPhotosNumber(int i) {
        this.ao = i;
        this.mTrackAnimationControl.setPhotosNumber(this.ao);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void setScreenWidth(int i) {
        this.an = i;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void addMarkerIndex(int i) {
        if (this.ae.contains(Integer.valueOf(i))) {
            return;
        }
        this.ae.add(Integer.valueOf(i));
        this.mTrackAnimationControl.setMarkersNumber(this.ae.size());
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public double getCurrentDistance(int i) {
        if (njy.e(this.ai, i)) {
            LogUtil.j("Track_ReTrackDisplay", "getCurrentDistance index is out of bounds");
            return 0.0d;
        }
        return this.ai.get(i).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.mMapEngine.setPreviewStatus(new jrm(this.mTrackSimplify.getMinBoundary().getLatLng(), this.mTrackSimplify.getMaxBoundary().getLatLng()), jer.d(54.0f), jer.d(54.0f), jer.d(238.5f), jer.d(238.5f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.p && this.mReTrackStateManager.b() == 1) {
            this.am = this.mMapEngine.getMapStatus();
            if (this.mTrackAnimationControl == null) {
                this.mTrackAnimationControl = f();
            }
            m();
            this.mTrackAnimationControl.setAlgorithmStrength(this.mStrength);
            this.mTrackAnimationControl.setIsSupportArea(this.mIsSupportArea);
            this.mTrackAnimationControl.setOrgZoomLevel(this.am.e()).setMaxZoomLevel(this.mMapEngine.getMaxZoomLevel()).update();
            this.mMsgHandler.sendEmptyMessage(16);
            this.mReTrackStateManager.e(0);
            this.p = false;
            reset();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack
    public void changeEditStatus(boolean z) {
        this.l = z;
        if (z) {
            this.mMapEngine.setAllGesturesEnabled(true);
            jpg latLng = this.mTrackSimplify.getMinBoundary().getLatLng();
            jpg latLng2 = this.mTrackSimplify.getMaxBoundary().getLatLng();
            Point screenLocation = this.mMapEngine.getScreenLocation(new jpg(latLng2.d + ((latLng.d - latLng2.d) / 2.0d), latLng2.f38787a + ((latLng.f38787a - latLng2.f38787a) / 2.0d)));
            if (screenLocation == null) {
                screenLocation = new Point(0, 0);
            }
            screenLocation.set(screenLocation.x, (int) (screenLocation.y * 1.5f));
            this.mMapEngine.moveCameraByLatLng(this.mMapEngine.getLatLngByScreenPoint(screenLocation));
            this.mMapEngine.addMarkerClickListener(this.z);
            return;
        }
        this.mMapEngine.setAllGesturesEnabled(false);
        jrr jrrVar = this.am;
        if (jrrVar == null) {
            return;
        }
        jrr jrrVarB = jrr.b(jrrVar);
        jrrVarB.d(this.mTrackSimplify.getCenterPoint().getLatLng());
        this.mMapEngine.animateCamera(jrrVarB, -1L, (InterfaceMapCallback) null);
        this.mMapEngine.disableMarkerClick();
    }

    class g implements InterfaceUpdateReTrack {
        private g() {
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void addText(int i, String str) {
            if (str == null || str.length() <= 0) {
                ReTrackDisplay.this.j.remove(Integer.valueOf(i));
            } else {
                ReTrackDisplay.this.j.put(Integer.valueOf(i), str);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void addPhotosList(Map<Integer, List<Bitmap>> map) {
            ReTrackDisplay.this.n = map;
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void addMarker(int i, InterfaceUpdateReTrack.MarkerType markerType) {
            if (ReTrackDisplay.this.mAlbumMarkers.containsKey(Integer.valueOf(i))) {
                if (ReTrackDisplay.this.mAlbumMarkers.get(Integer.valueOf(i)) == markerType || ReTrackDisplay.this.mAlbumMarkers.get(Integer.valueOf(i)) == InterfaceUpdateReTrack.MarkerType.Video_type || ReTrackDisplay.this.mAlbumMarkers.get(Integer.valueOf(i)) == InterfaceUpdateReTrack.MarkerType.Image_type) {
                    return;
                }
                ReTrackDisplay.this.deleteAlbumMarker(i);
                ReTrackDisplay.this.deleteMarkerIndex(i);
            }
            if (ReTrackDisplay.this.m.containsKey(Integer.valueOf(i)) && !ReTrackDisplay.this.al.contains(Integer.valueOf(i))) {
                ReTrackDisplay.this.mMapEngine.hideMarker(((Integer) ReTrackDisplay.this.m.get(Integer.valueOf(i))).intValue(), null);
                ReTrackDisplay.this.i.delete(((Integer) ReTrackDisplay.this.m.get(Integer.valueOf(i))).intValue());
                ReTrackDisplay.this.al.add(Integer.valueOf(i));
                jrv jrvVar = new jrv();
                jrvVar.d(ReTrackDisplay.e);
                jrvVar.d(ReTrackDisplay.this.mTrackData.get(i).getLatLng());
                String strD = ReTrackDisplay.this.af.d(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(i)), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType());
                if (!TextUtils.isEmpty(strD)) {
                    jrvVar.e(strD);
                }
                Bitmap bitmapC = ReTrackDisplay.this.af.c(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(i)), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType());
                if (bitmapC != null) {
                    jrvVar.c(bitmapC);
                }
                int iAddMarker = ReTrackDisplay.this.mMapEngine.addMarker(jrvVar, null);
                ReTrackDisplay.this.i.append(iAddMarker, i);
                ReTrackDisplay.this.m.put(Integer.valueOf(i), Integer.valueOf(iAddMarker));
            }
            ReTrackDisplay.this.addAlbumMarker(i, markerType);
            ReTrackDisplay.this.addMarkerIndex(i);
            ReTrackDisplay.this.updateTrackAnimationControl();
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void clearMarker(int i) {
            if (i >= 0) {
                ReTrackDisplay.this.deleteAlbumMarker(i);
                ReTrackDisplay.this.deleteMarkerIndex(i);
                if (ReTrackDisplay.this.al.contains(Integer.valueOf(i)) && ReTrackDisplay.this.m.containsKey(Integer.valueOf(i))) {
                    ReTrackDisplay.this.mMapEngine.hideMarker(((Integer) ReTrackDisplay.this.m.get(Integer.valueOf(i))).intValue(), null);
                    ReTrackDisplay.this.i.delete(((Integer) ReTrackDisplay.this.m.get(Integer.valueOf(i))).intValue());
                    ReTrackDisplay.this.al.remove(Integer.valueOf(i));
                    Bitmap bitmapA = ReTrackDisplay.this.af.a(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(i)), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType());
                    if (bitmapA == null) {
                        return;
                    }
                    jrv jrvVar = new jrv();
                    jrvVar.d(ReTrackDisplay.f10677c);
                    if (njy.e(ReTrackDisplay.this.mTrackData, i)) {
                        LogUtil.j("Track_ReTrackDisplay", "clearMarker index is out of bounds");
                        return;
                    }
                    jrvVar.d(ReTrackDisplay.this.mTrackData.get(i).getLatLng());
                    jrvVar.c(bitmapA);
                    int iAddMarker = ReTrackDisplay.this.mMapEngine.addMarker(jrvVar, null);
                    ReTrackDisplay.this.i.append(iAddMarker, i);
                    ReTrackDisplay.this.m.put(Integer.valueOf(i), Integer.valueOf(iAddMarker));
                }
                ReTrackDisplay.this.updateTrackAnimationControl();
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public int addCurMarker(int i, InterfaceUpdateReTrack.MarkerType markerType) {
            Bitmap bitmapH;
            if (ReTrackDisplay.this.mMapEngine == null) {
                LogUtil.j("Track_ReTrackDisplay", "mMapEngine is null in addCurMarker");
                return -1;
            }
            jrv jrvVar = new jrv();
            jrvVar.d(ReTrackDisplay.f10677c);
            if (njy.e(ReTrackDisplay.this.mTrackData, i)) {
                return -1;
            }
            jrvVar.d(ReTrackDisplay.this.mTrackData.get(i).getLatLng());
            int i2 = AnonymousClass7.f10700b[markerType.ordinal()];
            if (i2 == 2) {
                bitmapH = ReTrackDisplay.this.af.h();
                jrvVar.e(ReTrackDisplay.this.af.e());
            } else if (i2 != 3) {
                bitmapH = ReTrackDisplay.this.af.i();
                jrvVar.e(ReTrackDisplay.this.af.d());
            } else {
                bitmapH = ReTrackDisplay.this.af.g();
                jrvVar.e(ReTrackDisplay.this.af.f());
            }
            if (bitmapH == null) {
                return -1;
            }
            jrvVar.c(bitmapH);
            int iAddMarker = ReTrackDisplay.this.mMapEngine.addMarker(jrvVar, null);
            ReTrackDisplay.this.i.append(iAddMarker, i);
            return iAddMarker;
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void clearCurMarker(int i) {
            if (i >= 0) {
                ReTrackDisplay.this.mMapEngine.hideMarker(i, null);
                ReTrackDisplay.this.i.delete(i);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void resetDismiss() {
            ReTrackDisplay.this.mMapEngine.clear();
            ReTrackDisplay.this.i.clear();
            ReTrackDisplay.this.addGpsTrackLine();
            ReTrackDisplay.this.addLenTrackLine();
            ReTrackDisplay.this.addCustomMarkerList();
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void resetShow() {
            if (ReTrackDisplay.this.mMapEngine != null) {
                ReTrackDisplay.this.mMapEngine.clear();
                ReTrackDisplay.this.i.clear();
            }
            for (Integer num : ReTrackDisplay.this.x.f10705a.keySet()) {
                if (njy.e(ReTrackDisplay.this.mTrackData, num.intValue())) {
                    LogUtil.j("Track_ReTrackDisplay", "resetShow index is out of bounds");
                    return;
                }
                if (ReTrackDisplay.this.al.contains(num)) {
                    Bitmap bitmapC = ReTrackDisplay.this.af.c(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(num.intValue())), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType());
                    if (bitmapC == null) {
                        return;
                    }
                    jrv jrvVarB = b(num, bitmapC);
                    jrvVarB.d(ReTrackDisplay.e);
                    int iAddMarker = ReTrackDisplay.this.mMapEngine.addMarker(jrvVarB, null);
                    ReTrackDisplay.this.i.append(iAddMarker, num.intValue());
                    ReTrackDisplay.this.m.put(num, Integer.valueOf(iAddMarker));
                } else {
                    Bitmap bitmapA = ReTrackDisplay.this.af.a(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(num.intValue())), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType());
                    if (bitmapA == null) {
                        return;
                    }
                    jrv jrvVarB2 = b(num, bitmapA);
                    jrvVarB2.d(ReTrackDisplay.f10677c);
                    int iAddMarker2 = ReTrackDisplay.this.mMapEngine.addMarker(jrvVarB2, null);
                    ReTrackDisplay.this.i.append(iAddMarker2, num.intValue());
                    ReTrackDisplay.this.m.put(num, Integer.valueOf(iAddMarker2));
                }
            }
            ReTrackDisplay.this.addUnpaintedGpsTrackLine();
            ReTrackDisplay.this.addLenTrackLine();
            ReTrackDisplay.this.addCustomMarkerList();
        }

        private jrv b(Integer num, Bitmap bitmap) {
            jrv jrvVar = new jrv();
            jrvVar.e(ReTrackDisplay.this.af.e(ReTrackDisplay.this.x.e(ReTrackDisplay.this.x.a(num.intValue())), ReTrackDisplay.this.mTrackSimplify.getMaxSpeedType()));
            jrvVar.d(ReTrackDisplay.this.mTrackData.get(num.intValue()).getLatLng());
            jrvVar.c(bitmap);
            return jrvVar;
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void moveMarkerToCurrent(int i) {
            if (njy.c(ReTrackDisplay.this.mTrackData, i)) {
                ReTrackDisplay reTrackDisplay = ReTrackDisplay.this;
                reTrackDisplay.moveMarker(reTrackDisplay.mTrackData.get(i));
                ReTrackDisplay.this.i.append(ReTrackDisplay.this.ah, i);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void addMoveMarker(int i) {
            jrv jrvVar = new jrv();
            jrvVar.d(ReTrackDisplay.f10675a);
            if (njy.e(ReTrackDisplay.this.mTrackData, i)) {
                LogUtil.j("Track_ReTrackDisplay", "addMoveMarker index is out of bounds");
                return;
            }
            jrvVar.d(ReTrackDisplay.this.mTrackData.get(i).getLatLng());
            jrvVar.c(ReTrackDisplay.this.af.b(MarkerBuilder.KeyInfoType.ADVANCE_Marker, ReTrackDisplay.this.mTrackSimplify.getSportType(), ReTrackDisplay.this.j()));
            ReTrackDisplay reTrackDisplay = ReTrackDisplay.this;
            reTrackDisplay.ah = reTrackDisplay.mMapEngine.addMarker(jrvVar, null);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void deleteMoveMarker() {
            ReTrackDisplay.this.mMapEngine.hideMarker(ReTrackDisplay.this.ah, null);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void updateTrack(int i, int i2) {
            if (i < i2) {
                for (int i3 = i + 1; i3 <= i2; i3++) {
                    jrt jrtVar = new jrt();
                    jrtVar.d(ReTrackDisplay.this.mTrackData.get(i3).getLineStatus() < 0).a(true).b(jer.d(4.0f)).b(ReTrackDisplay.this.mTrackData.get(i3 - 1).getLatLng()).e(ReTrackDisplay.this.mTrackData.get(i3).getLatLng());
                    if (ReTrackDisplay.this.ab == null) {
                        jrtVar.c(ReTrackEngine.a.f10719c);
                    } else {
                        jrtVar.c(Color.parseColor(ReTrackDisplay.this.ab.g()));
                    }
                    ReTrackDisplay.this.mMapEngine.addLinePoint(jrtVar);
                }
                return;
            }
            while (true) {
                i--;
                if (i < i2) {
                    return;
                } else {
                    ReTrackDisplay.this.mMapEngine.removeLinePoint();
                }
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public ReTrackSimplify obtainSimlify() {
            return ReTrackDisplay.this.mTrackSimplify;
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public int getTrackNumber() {
            return ReTrackDisplay.this.mTrackData.size();
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void setPhotosNumber(int i) {
            ReTrackDisplay.this.setSumPhotosNumber(i);
            ReTrackDisplay.this.updateTrackAnimationControl();
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void setVideoNumber(int i) {
            LogUtil.a("Track_ReTrackDisplay", "setVideoNumber: ", Integer.valueOf(i));
            ReTrackDisplay.this.aq = i;
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack
        public void addVideoPath(Map<Integer, ArrayList<VideoModel>> map) {
            LogUtil.a("Track_ReTrackDisplay", "addVideoPath: ");
            ReTrackDisplay.this.o = map;
        }
    }
}
