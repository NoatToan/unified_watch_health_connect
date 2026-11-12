package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.MediaMetadata;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.musicservice.api.AudioService;
import com.huawei.health.musicservice.api.IAudioPlayer;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInfoManager;
import com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f48375a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private CopyOnWriteArrayList<sma> ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private int ai;
    private String aj;
    private MediaController ak;
    private String al;
    private volatile MediaBrowser am;
    private int an;
    private List<gdy> ao;
    private Queue<Runnable> ap;
    private ConcurrentHashMap<String, Integer> aq;
    private final BroadcastReceiver ar;
    private float as;
    private List<snk> au;
    private List<MediaStatusSubscriber> aw;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f48376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48377c;
    private int d;
    private e e;
    private gdy f;
    private final ComponentCallbacks2 g;
    private Context h;
    private long i;
    private int j;
    private IAudioPlayer.PlayMode k;
    private volatile int l;
    private String m;
    private int n;
    private String o;
    private int p;
    private float q;
    private int r;
    private float s;
    private int t;
    private String u;
    private int v;
    private String w;
    private Handler x;
    private final Runnable y;
    private int z;

    /* synthetic */ void x() {
        c();
        this.l = 0;
        sne sneVarS = s();
        if (sneVarS == null) {
            sneVarS = new sne();
        }
        List<gdy> listB = sneVarS.b();
        if (njy.b(listB)) {
            this.f = listB.get(0);
        }
        Iterator<MediaStatusSubscriber> it = this.aw.iterator();
        while (it.hasNext()) {
            it.next().onMediaChanged(this.f, this.l);
        }
        this.af = true;
    }

    private smp() {
        this.as = 1.0f;
        this.h = BaseApplication.b();
        this.f = new gdy();
        this.ag = false;
        this.r = 0;
        this.p = 0;
        this.ai = 0;
        this.q = 0.0f;
        this.v = 0;
        this.s = 0.0f;
        this.i = 0L;
        this.t = 0;
        this.z = 0;
        this.f48377c = false;
        this.j = 0;
        this.u = "2";
        this.m = "2";
        this.n = 2;
        this.aw = new CopyOnWriteArrayList();
        this.ap = new ConcurrentLinkedDeque();
        this.ao = new CopyOnWriteArrayList();
        this.au = new CopyOnWriteArrayList();
        this.aq = new ConcurrentHashMap<>();
        this.f48376b = new ConcurrentHashMap<>();
        this.l = 0;
        this.ae = false;
        this.d = 0;
        this.an = 0;
        this.f48375a = new b();
        this.e = new e();
        this.aa = false;
        this.ac = false;
        this.ab = false;
        this.af = false;
        this.ah = false;
        this.ad = new CopyOnWriteArrayList<>();
        this.ar = new BroadcastReceiver() { // from class: smp.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (!TextUtils.equals(smp.b().p(), "headLine")) {
                    LogUtil.j("MediaCenter", "mNotificationReceiver, is not headline media");
                    return;
                }
                if (intent.getAction().equals("notification_removed")) {
                    smp.this.j(-4);
                    return;
                }
                if (intent.getAction().equals("notification_play_or_pause_btn_clicked")) {
                    health.compact.a.LogUtil.b("MediaCenter", "notification button clicked...");
                    if (smp.this.t == 3) {
                        smp.this.ac = true;
                        smp smpVar = smp.this;
                        smpVar.b(2, smpVar.t);
                        return;
                    } else {
                        smp.this.ab = true;
                        smp.this.h(11);
                        return;
                    }
                }
                health.compact.a.LogUtil.d("MediaCenter", "unknown event, this should NOT happen...");
            }
        };
        this.g = new ComponentCallbacks2() { // from class: smp.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i2) {
                LogUtil.a("MediaCenter", "ComponentCallbacks2 level is: ", Integer.valueOf(i2));
                if ((i2 == 5 || i2 == 10) && smp.this.t == 2) {
                    smp.this.c();
                    smp.this.ah = true;
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                LogUtil.a("MediaCenter", "ComponentCallbacks2 onLowMemory");
                if (smp.this.t == 2) {
                    smp.this.c();
                    smp.this.ah = true;
                }
            }
        };
        this.y = new Runnable() { // from class: sna
            @Override // java.lang.Runnable
            public final void run() {
                this.d.x();
            }
        };
        an();
        this.k = ak();
        this.as = SharedPreferenceManager.a("healthHeadLines", "playSpeed", 1.0f);
        HandlerExecutor.b(new Runnable() { // from class: snd
            @Override // java.lang.Runnable
            public final void run() {
                this.f48405a.v();
            }
        });
    }

    /* synthetic */ void v() {
        if (this.x == null) {
            this.x = new h();
            LogUtil.a("MediaCenter", "init handler");
        }
    }

    public static smp b() {
        return i.f48389c;
    }

    public void aa() {
        this.e = new e();
        this.r = 0;
        this.i = 0L;
        this.ao.clear();
        this.f = new gdy();
        this.l = 0;
        j("");
        this.ad.clear();
    }

    private void an() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("notification_removed");
        intentFilter.addAction("notification_play_or_pause_btn_clicked");
        BroadcastManagerUtil.d(this.h, this.ar, intentFilter, LocalBroadcast.f36595c, null);
    }

    public void a(final Consumer<Boolean> consumer) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: smp.5
                @Override // java.lang.Runnable
                public void run() {
                    smp.this.a(consumer);
                }
            });
            return;
        }
        if (this.am == null || !this.am.isConnected()) {
            ReleaseLogUtil.d("R_MediaCenter", "mediaBrowser start to connect");
            this.am = new MediaBrowser(this.h, new ComponentName(BaseApplication.b(), (Class<?>) AudioService.class), new c(consumer), null);
            this.am.connect();
            ag();
            return;
        }
        if (consumer != null) {
            consumer.accept(true);
            ReleaseLogUtil.d("R_MediaCenter", "mediaBrowser already connected before");
        } else {
            ReleaseLogUtil.a("R_MediaCenter", "init do nothing");
        }
    }

    public void z() {
        b(this.n);
    }

    public void c(final int i2) {
        List<gdy> list = this.ao;
        int size = list != null ? list.size() : 0;
        List<snk> list2 = this.au;
        LogUtil.a("MediaCenter", "playWithInitList audioItemList size = ", Integer.valueOf(size), ", detailList = ", Integer.valueOf(list2 != null ? list2.size() : 0));
        if (!c("playWithInitList")) {
            a(new Consumer<Boolean>() { // from class: smp.3
                @Override // androidx.core.util.Consumer
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void accept(Boolean bool) {
                    if (bool == null || !bool.booleanValue()) {
                        return;
                    }
                    if (!njy.e(smp.this.ao) && !njy.e(smp.this.au)) {
                        if (smp.this.af) {
                            sne sneVarS = smp.this.s();
                            if (sneVarS == null) {
                                return;
                            }
                            List<gdy> listB = sneVarS.b();
                            List<snk> listE = sneVarS.e();
                            if (njy.e(listB) || njy.e(listE)) {
                                LogUtil.e("MediaCenter", "playWithInitList failed cause play list is empty!");
                                return;
                            } else {
                                smp.this.d(new ArrayList(listB), new ArrayList(listE), 0, null);
                                smp.this.af = false;
                            }
                        } else {
                            smp.this.d(new ArrayList(smp.this.ao), new ArrayList(smp.this.au), smp.this.ah ? smp.this.l : 0, null);
                        }
                        smp.this.y();
                        if (smp.this.ah) {
                            smp smpVar = smp.this;
                            smpVar.c(smpVar.l);
                            smp.this.ah = false;
                            return;
                        }
                        smp.this.b(i2);
                        return;
                    }
                    LogUtil.e("MediaCenter", "playWithInitList failed cause play list is empty!");
                }
            });
            return;
        }
        this.ab = true;
        this.aa = false;
        this.f48377c = false;
        this.ak.getTransportControls().play();
        h(i2);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(final int i2) {
        LogUtil.a("MediaCenter", "play biFrom:", Integer.valueOf(i2));
        if (!c("play")) {
            this.ap.add(new Runnable() { // from class: snc
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(i2);
                }
            });
            a((Consumer<Boolean>) null);
            return;
        }
        this.ab = true;
        this.aa = false;
        this.f48377c = false;
        this.ak.getTransportControls().play();
        h(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2) {
        if (i2 != 0) {
            this.an = i2;
        }
        if (i2 == 11) {
            this.d = i2;
        }
        this.f48375a.a();
        this.e.c(i2, 1, this.r);
        this.j = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, int i3) {
        this.e.b(this.r);
        this.e.d(i3, i2, this.k);
        if (i3 == 3) {
            g(this.p);
        }
    }

    public void a(int i2) {
        if (!c("pause")) {
            if (this.t == 3) {
                LogUtil.a("MediaCenter", "pause while not connecting, add operation");
                this.ap.add(new Runnable() { // from class: smz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.ac();
                    }
                });
                return;
            }
            return;
        }
        this.ac = true;
        this.f48377c = true;
        int i3 = this.t;
        this.ak.getTransportControls().pause();
        b(i2, i3);
    }

    public void ac() {
        a(2);
    }

    public void j(int i2) {
        LogUtil.a("MediaCenter", "stop biEvent = ", Integer.valueOf(i2));
        int i3 = this.t;
        if (i3 == 1 || i3 == 0) {
            return;
        }
        if (!c("stop")) {
            this.ap.add(new Runnable() { // from class: smq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.aj();
                }
            });
            return;
        }
        this.aa = true;
        this.f48377c = true;
        int i4 = this.t;
        this.ak.getTransportControls().stop();
        this.t = 1;
        this.z = 1;
        this.j = 1;
        c(i2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        LogUtil.a("MediaCenter", "resetOnStop");
        this.e = new e();
        b bVar = new b();
        this.f48375a = bVar;
        bVar.f48382a = this.i;
        d(0, (int) this.i);
        this.ag = true;
        this.aa = false;
    }

    private void c(int i2, int i3) {
        this.e.b(this.r);
        this.e.d(i3, i2, this.k);
        this.ae = true;
        if (i2 == -3 || (this.k != IAudioPlayer.PlayMode.PLAY_ONCE && (i3 == 3 || i3 == 2))) {
            a(false);
            g(this.p);
            this.ai = 0;
        }
        this.ae = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        j(2);
    }

    public void ae() {
        if (!c("skipToNext")) {
            this.ap.add(new Runnable() { // from class: smv
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.ae();
                }
            });
            return;
        }
        this.ae = !TextUtils.isEmpty(this.f.h());
        this.ak.getTransportControls().skipToNext();
        this.f48377c = false;
        this.f48375a.a();
    }

    public void af() {
        if (!c("skipToPrev")) {
            this.ap.add(new Runnable() { // from class: smx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.af();
                }
            });
            return;
        }
        this.ae = !TextUtils.isEmpty(this.f.h());
        this.ak.getTransportControls().skipToPrevious();
        this.f48377c = false;
        this.f48375a.a();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final long j) {
        if (!c("seekTo")) {
            this.ap.add(new Runnable() { // from class: snb
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(j);
                }
            });
            return;
        }
        LogUtil.a("MediaCenter", "seekTo position = ", Long.valueOf(j), ", mCurrentItemDuration = ", Long.valueOf(this.i));
        this.ak.getTransportControls().seekTo(j);
        this.f48375a.c(this.r, j);
        this.e.d(this.r, j);
        d((int) j, (int) this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2, int i3) {
        float f = i2;
        float f2 = f / i3;
        this.q = f2;
        this.s = f2;
        this.r = i2;
        int iRound = Math.round(f / 1000.0f);
        this.p = iRound;
        this.v = iRound;
    }

    public void c(long j) {
        b(j, this.n);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final long j, final int i2) {
        if (!c("skipToItem")) {
            this.ap.add(new Runnable() { // from class: smy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48400b.b(j, i2);
                }
            });
            return;
        }
        this.ae = !TextUtils.isEmpty(this.f.h());
        LogUtil.a("MediaCenter", "skip to index = ", Long.valueOf(j), ", playList size = ", Integer.valueOf(this.ao.size()));
        this.ak.getTransportControls().skipToQueueItem(j);
        this.ak.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_CANCEL_AUTO_STOP, new Bundle());
        this.f48377c = false;
        if (i2 != 0) {
            this.an = i2;
        }
        this.f48375a.a();
        this.ab = true;
        if (this.z != 3) {
            this.e.c(i2, 1, 0L);
        }
        this.j = 3;
        this.aj = "headLine";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        this.e.b(!this.ae ? this.i : this.r);
        int i2 = this.z;
        boolean z = i2 == 9 || i2 == 10 || i2 == 11;
        if (i2 == 3 || z) {
            this.e.c();
        }
        this.e.c(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        String str;
        if (this.ag || TextUtils.isEmpty(this.f.h()) || this.i < 0) {
            this.ag = false;
            return;
        }
        this.f48375a.d(this.r);
        String strK = this.f.k();
        if (TextUtils.isEmpty(strK)) {
            str = null;
        } else {
            String[] strArrSplit = strK.split("\\s+");
            int length = strArrSplit.length;
            if (length <= 1) {
                LogUtil.e("MediaCenter", "length is less than 1");
                str = null;
            } else {
                int i2 = length - 1;
                LogUtil.a("MediaCenter", "teacher name: ", strArrSplit[i2]);
                str = strArrSplit[i2];
            }
        }
        String str2 = str;
        this.f48375a.f48382a = this.i;
        this.f48375a.e(this.d, this.f.o(), this.f.d(), this.w, str2);
        if (z) {
            return;
        }
        this.f48375a.c();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final IAudioPlayer.PlayMode playMode) {
        if (!c("setPlayMode")) {
            this.ap.add(new Runnable() { // from class: snh
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(playMode);
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(IAudioPlayer.ParameterKeys.AUDIO_PLAY_MODE, playMode.toString());
        this.ak.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_PLAY_MODE, bundle);
        this.k = playMode;
        String strName = playMode.name();
        LogUtil.a("MediaCenter", "setPlayMode ", strName);
        SharedPreferenceManager.c("healthHeadLines", "playMode", strName);
    }

    private IAudioPlayer.PlayMode ak() {
        IAudioPlayer.PlayMode playMode;
        String strB = SharedPreferenceManager.b("healthHeadLines", "playMode", "");
        if (IAudioPlayer.PlayMode.SEQUENCE_CIRCLE.name().equals(strB)) {
            playMode = IAudioPlayer.PlayMode.SEQUENCE_CIRCLE;
        } else if (IAudioPlayer.PlayMode.PLAY_ONCE.name().equals(strB)) {
            playMode = IAudioPlayer.PlayMode.PLAY_ONCE;
        } else if (IAudioPlayer.PlayMode.RANDOM_CIRCLE.name().equals(strB)) {
            playMode = IAudioPlayer.PlayMode.RANDOM_CIRCLE;
        } else {
            playMode = IAudioPlayer.PlayMode.SEQUENCE_PLAY;
        }
        LogUtil.a("MediaCenter", "restorePlayMode userPlayMode = ", strB, ", playMode = ", playMode.name());
        return playMode;
    }

    public void y() {
        b(ak());
        e(Float.valueOf(this.as));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(final Float f) {
        if (!c("setPlaySpeed")) {
            this.ap.add(new Runnable() { // from class: smu
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(f);
                }
            });
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putFloat(IAudioPlayer.ParameterKeys.AUDIO_PLAY_SPEED, f.floatValue());
            LogUtil.a("MediaCenter", "setPlaySpeed PlaySpeed : ", f);
            this.ak.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_PLAY_SPEED, bundle);
            this.as = f.floatValue();
            SharedPreferenceManager.c("healthHeadLines", "playSpeed", f.floatValue());
        } catch (Exception e2) {
            LogUtil.e("MediaCenter", "setPlaySpeed exception is :", ExceptionUtils.c(e2));
        }
    }

    public float l() {
        return this.as;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(final List<gdy> list, final List<snk> list2, final int i2, final Consumer<Boolean> consumer) {
        if (!(list instanceof Serializable)) {
            LogUtil.e("MediaCenter", "setPlayList failed cause audioItemList is not Serializable");
            return;
        }
        if (!c("setPlayList")) {
            this.ap.add(new Runnable() { // from class: sms
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48391a.d(list, list2, i2, consumer);
                }
            });
            a(consumer);
            LogUtil.e("MediaCenter", "setPlayList failed cause is not connected!");
            return;
        }
        this.ao.clear();
        this.aq.clear();
        if (njy.b(list)) {
            a(list);
            this.ao.addAll(list);
        }
        this.au.clear();
        if (njy.b(list2)) {
            this.au.addAll(list2);
        }
        this.l = i2;
        LogUtil.a("MediaCenter", "setPlayList audioItemList size = ", Integer.valueOf(list.size()));
        if (list.size() > 200) {
            d(list);
        } else {
            b(list);
        }
    }

    private void b(List<gdy> list) {
        if (njy.e(list)) {
            LogUtil.j("MediaCenter", "setAudioPlayList fail. audioItemList is empty.");
            return;
        }
        LogUtil.a("MediaCenter", "setAudioPlayList inputList size = ", Integer.valueOf(list.size()));
        Bundle bundle = new Bundle();
        bundle.putSerializable(IAudioPlayer.ParameterKeys.AUDIO_SET_PLAY_LIST, (Serializable) list);
        this.ak.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_SET_PLAY_LIST, bundle);
    }

    private void e(List<gdy> list) {
        if (njy.e(list)) {
            LogUtil.j("MediaCenter", "addAudioPlayList fail. appendPlayList is empty.");
            return;
        }
        LogUtil.a("MediaCenter", "addAudioPlayList appendPlayList size = ", Integer.valueOf(list.size()));
        Bundle bundle = new Bundle();
        bundle.putSerializable(IAudioPlayer.ParameterKeys.AUDIO_ADD_PLAY_LIST, (Serializable) list);
        this.ak.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_ADD_PLAY_LIST, bundle);
    }

    private void d(List<gdy> list) {
        if (njy.e(list)) {
            LogUtil.j("MediaCenter", "dealWithLargePlaylist fail. audioItemList is empty.");
            return;
        }
        int size = list.size() / 200;
        LogUtil.a("MediaCenter", "dealWithLargePlaylist audioItemList.size() = " + list.size(), " setPageNum = ", Integer.valueOf(size));
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == 0) {
                b(new ArrayList(list.subList(0, 200)));
            } else {
                int i3 = i2 * 200;
                e(new ArrayList(list.subList(i3, Math.min(i3 + 200, list.size()))));
            }
        }
    }

    public void e(final List<gdy> list, final List<snk> list2) {
        if (!c("appendPlayList")) {
            this.ap.add(new Runnable() { // from class: smw
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(list, list2);
                }
            });
            return;
        }
        if (njy.b(list)) {
            a(list);
            this.ao.addAll(list);
        }
        if (njy.b(list2)) {
            this.au.addAll(list2);
        }
        e(list);
    }

    /* synthetic */ void c(List list, List list2) {
        e((List<gdy>) list, (List<snk>) list2);
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iB = b(str);
        if (iB < 0) {
            LogUtil.e("MediaCenter", "removeAudioItemById failed, cause not found mediaId = ", str, " in list!");
        } else {
            d(this.ao.get(iB));
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final gdy gdyVar) {
        if (gdyVar == null) {
            return;
        }
        if (!c("removeAudioItem")) {
            this.ap.add(new Runnable() { // from class: smr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48390c.d(gdyVar);
                }
            });
            return;
        }
        int iIndexOf = this.ao.indexOf(gdyVar);
        if (iIndexOf < this.l) {
            this.l--;
        } else if (iIndexOf == this.l) {
            if (this.l >= this.ao.size() - 1) {
                this.l = 0;
            }
            this.ae = !TextUtils.isEmpty(this.f.h());
        } else {
            LogUtil.g("MediaCenter", "removeItemIndex = ", Integer.valueOf(iIndexOf), ", do nothing with it.");
        }
        this.ao.remove(gdyVar);
        if (njy.c(this.au, iIndexOf)) {
            this.au.get(iIndexOf).b(true);
        }
        this.aq.remove(gdyVar.h());
        for (String str : this.aq.keySet()) {
            int iB = b(str);
            if (iB >= 0 && iB > iIndexOf) {
                this.aq.put(str, Integer.valueOf(iB - 1));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(IAudioPlayer.ParameterKeys.AUDIO_DELETE_ITEM, gdyVar);
        this.ak.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_DELETE_ITEM, bundle);
    }

    public List<snk> d() {
        ArrayList arrayList = new ArrayList();
        for (snk snkVar : this.au) {
            if (snkVar != null && !snkVar.o()) {
                arrayList.add(snkVar);
            }
        }
        return arrayList;
    }

    boolean c(String str) {
        if (this.ak != null && this.am.isConnected()) {
            return true;
        }
        ReleaseLogUtil.a("R_MediaCenter", str, " checkConnected failed, mMediaController = ", this.ak, ", isConnected = ", Boolean.valueOf(this.am != null && this.am.isConnected()));
        return false;
    }

    public void c() {
        if (this.am != null && this.am.isConnected()) {
            ReleaseLogUtil.d("R_MediaCenter", "healthHeadLine mediaBrowser disconnect.");
            this.am.disconnect();
            ah();
        }
        this.am = null;
        this.ak = null;
        ReleaseLogUtil.d("R_MediaCenter", "healthHeadLine mediaBrowser set null.");
    }

    class c extends MediaBrowser.ConnectionCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Consumer<Boolean> f48385c;

        public c(Consumer<Boolean> consumer) {
            this.f48385c = consumer;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            if (smp.this.am != null) {
                if (!smp.this.am.isConnected()) {
                    LogUtil.e("MediaCenter", "mediaBrowser onConnected but media browser was disconnected before, abort!");
                    return;
                }
                LogUtil.a("MediaCenter", "mediaBrowser onConnected");
                smp.this.ak = new MediaController(smp.this.h, smp.this.am.getSessionToken());
                smp.this.ak.registerCallback(new g());
                while (!smp.this.ap.isEmpty()) {
                    Runnable runnable = (Runnable) smp.this.ap.peek();
                    if (runnable != null) {
                        runnable.run();
                        smp.this.ap.poll();
                    }
                }
                Consumer<Boolean> consumer = this.f48385c;
                if (consumer != null) {
                    consumer.accept(true);
                    this.f48385c = null;
                    return;
                }
                return;
            }
            LogUtil.e("MediaCenter", "mediaBrowser onConnected but media browser is null, abort!");
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            LogUtil.a("MediaCenter", "mediaBrowser onConnectionSuspended");
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            LogUtil.a("MediaCenter", "mediaBrowser onConnectionFailed");
            Consumer<Boolean> consumer = this.f48385c;
            if (consumer != null) {
                consumer.accept(false);
                this.f48385c = null;
            }
        }
    }

    class g extends MediaController.Callback {
        private g() {
        }

        private void b() {
            smp.this.a(false);
            smp.this.ai();
            j();
        }

        private void b(PlaybackState playbackState) {
            long position = playbackState.getPosition();
            if (position < 0) {
                LogUtil.j("MediaCenter", "currentTime is negative, reset to 0... actual:", Long.valueOf(position));
                position = 0;
            }
            LogUtil.a("MediaCenter", "progress changed: ", Long.valueOf(position));
            smp smpVar = smp.this;
            smpVar.d((int) position, (int) smpVar.i);
            Iterator it = smp.this.aw.iterator();
            while (it.hasNext()) {
                ((MediaStatusSubscriber) it.next()).onProgressChanged(smp.this.r, (int) smp.this.i, smp.this.q, smp.this.p);
            }
        }

        private void a() {
            if (!njy.e(smp.this.ad)) {
                for (sma smaVar : smp.this.ad) {
                    if (smaVar != null) {
                        LogUtil.a("MediaCenter", "mInnerApi = ", smaVar);
                        smaVar.d();
                    }
                }
                return;
            }
            LogUtil.a("MediaCenter", "mInnerApiList is empty. no need to hide miniPlayer.");
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            if (playbackState == null) {
                LogUtil.j("MediaCenter", "onPlaybackStateChanged, state is null ,this should NOT happen...");
                return;
            }
            if (playbackState.getExtras() != null) {
                Bundle extras = playbackState.getExtras();
                if (!"headLine".equals(extras.getString("category"))) {
                    LogUtil.j("MediaCenter", "onPlaybackStateChanged not headLine media");
                    smp.this.aj = extras.getString("category");
                    a();
                    return;
                }
            }
            int state = playbackState.getState();
            if (state != 3 || smp.this.z != 3) {
                if (state != 3 || !smp.this.f48377c) {
                    LogUtil.a("MediaCenter", "onPlaybackStateChanged：", playbackState);
                    boolean z = (smp.this.z == 0 || smp.this.z == 1) ? false : true;
                    smp.this.z = state;
                    if (smp.this.x == null) {
                        LogUtil.e("MediaCenter", "onPlaybackStateChanged delay long time task handle failed, cause handler is not init");
                    } else if (state == 2) {
                        smp.this.x.postDelayed(smp.this.y, 1800000L);
                    } else {
                        smp.this.x.removeCallbacks(smp.this.y);
                    }
                    boolean z2 = state == 9 || state == 10 || state == 11;
                    boolean z3 = smp.this.ao.size() == 1;
                    boolean z4 = smp.this.k == IAudioPlayer.PlayMode.SEQUENCE_PLAY && njy.c(smp.this.ao, smp.this.l) && smp.this.l == smp.this.ao.size() - 1 && state == 1 && !smp.this.f48377c;
                    boolean z5 = smp.this.k == IAudioPlayer.PlayMode.PLAY_ONCE && state == 1 && !z2;
                    if ((!z || !z3 || (!z2 && state != 1)) && !z4 && !z5) {
                        if (smp.this.t != 1 && state == 1) {
                            LogUtil.a("MediaCenter", "onPlaybackStateChanged not handle single media skip situation, go stop.", " mCurrentProgress = ", Float.valueOf(smp.this.q), "; mCurrentTimeInSec = ", Integer.valueOf(smp.this.p));
                            c();
                        }
                    } else {
                        LogUtil.a("MediaCenter", "onPlaybackStateChanged handle single media skip situation isSkipMedia = ", Boolean.valueOf(z2));
                        b();
                        int iA = (int) smp.this.f.a();
                        smp smpVar = smp.this;
                        if (z5) {
                            iA = smpVar.p;
                        }
                        smpVar.g(iA);
                        smp.this.ai = 0;
                        smp.this.am();
                    }
                    if (smp.this.t != 2 && state == 2) {
                        d();
                    }
                    if (smp.this.t != 3 && state == 3) {
                        e();
                    }
                    if (z2) {
                        smp.this.ae = false;
                    }
                    if (state == 2 || state == 1 || state == 3 || state == 6 || state == 7) {
                        smp.this.t = state;
                        smp.this.j = state;
                        Iterator it = smp.this.aw.iterator();
                        while (it.hasNext()) {
                            ((MediaStatusSubscriber) it.next()).onPlaybackStateChanged(playbackState);
                        }
                        return;
                    }
                    return;
                }
                LogUtil.a("MediaCenter", "receive PLAYING under ignore circumstance, mInnerCurrentStatue: ", Integer.valueOf(smp.this.z));
                smp.this.f48377c = false;
                return;
            }
            b(playbackState);
        }

        private void e() {
            if (smp.this.ab) {
                smp.this.ab = false;
            } else {
                smp.this.e.c(12, 1, 0L);
            }
        }

        private void c() {
            if (!smp.this.aa) {
                smp.this.a(false);
                if (smp.this.p > 0 && smp.this.q > 0.0f) {
                    smp smpVar = smp.this;
                    smpVar.g(smpVar.p);
                }
            } else {
                smp.this.aa = false;
            }
            smp.this.al();
        }

        private void d() {
            smp.this.a(true);
            if (smp.this.ac) {
                smp.this.ac = false;
                return;
            }
            smp smpVar = smp.this;
            smpVar.g(smpVar.p);
            smp.this.e.b(smp.this.r);
            smp.this.e.d(3, 2, smp.this.k);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (mediaMetadata == null) {
                return;
            }
            String string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID);
            ReleaseLogUtil.d("R_MediaCenter", "onMetadataChanged = ", mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE), "; mediaId = ", string);
            smp.this.j(string);
            if (!"headLine".equals(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE))) {
                LogUtil.j("MediaCenter", "onMetadataChanged not headLine media");
                smp.this.aj = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE);
                a();
                return;
            }
            if (!TextUtils.isEmpty(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI))) {
                LogUtil.a("MediaCenter", "It's the second time that onMetadataChanged callback, do not consider");
                return;
            }
            b();
            smp.this.am();
            int iA = (int) smp.this.f.a();
            int i = (!smp.this.ae && (iA - smp.this.p < 2)) ? iA : smp.this.p;
            LogUtil.a("MediaCenter", "currentProgressTime = ", Integer.valueOf(i), "; mIsUserSkipped = ", Boolean.valueOf(smp.this.ae), "; mCurrentTimeInSec = ", Integer.valueOf(smp.this.p), "; duration = ", Integer.valueOf(iA));
            if (i > 0) {
                smp.this.g(i);
            }
            if (TextUtils.isEmpty(smp.this.f.h())) {
                j();
            }
            if (!TextUtils.isEmpty(string)) {
                Object obj = smp.this.aq.get(string);
                if (obj == null) {
                    LogUtil.j("MediaCenter", "onMetadataChanged indexObj = ", obj);
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                ArrayList arrayList = new ArrayList(smp.this.ao);
                if (iIntValue >= 0 && iIntValue < arrayList.size()) {
                    smp.this.l = iIntValue;
                    smp.this.f = (gdy) arrayList.get(iIntValue);
                    smp.this.i = mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                    smp.this.v = 0;
                    smp.this.s = 0.0f;
                    smp.this.q = 0.0f;
                    smp.this.ai = 0;
                    for (MediaStatusSubscriber mediaStatusSubscriber : smp.this.aw) {
                        mediaStatusSubscriber.onMediaChanged(smp.this.f, smp.this.l);
                        LogUtil.a("MediaCenter", "onMetadataChanged subscriber = ", mediaStatusSubscriber, ", mCurrentItem = ", smp.this.f, ", mCurrentItemIndex = ", Integer.valueOf(smp.this.l), "; mPlayList.size() = ", Integer.valueOf(smp.this.ao.size()));
                    }
                    if (smp.this.ao.size() - smp.this.l <= 2) {
                        LogUtil.a("MediaCenter", "need to update playlist. type = ", Integer.valueOf(smp.this.n));
                        if (smp.this.n == 2 || smp.this.n == 6) {
                            skz.c();
                        }
                        if (smp.this.n == 8 || smp.this.n == 9) {
                            sky.e().b();
                            return;
                        }
                        return;
                    }
                    return;
                }
                LogUtil.j("MediaCenter", "onMetadataChanged index mismatch, list size: " + arrayList.size());
                return;
            }
            LogUtil.j("MediaCenter", "onMetadataChanged mediaId is empty: ", string);
        }

        private void j() {
            if (smp.this.f48375a.f48383c != 3) {
                if (smp.this.k != IAudioPlayer.PlayMode.SEQUENCE_PLAY && smp.this.k != IAudioPlayer.PlayMode.SEQUENCE_CIRCLE) {
                    if (smp.this.k != IAudioPlayer.PlayMode.RANDOM_CIRCLE) {
                        if (smp.this.k == IAudioPlayer.PlayMode.PLAY_ONCE) {
                            smp.this.f48375a.f48383c = 5;
                        } else {
                            LogUtil.g("mBiInfo1100056.nextPlayMode is ", Integer.valueOf(smp.this.f48375a.f48383c), ", do nothing with it.");
                        }
                    } else {
                        smp.this.f48375a.f48383c = 2;
                    }
                } else {
                    smp.this.f48375a.f48383c = 1;
                }
            }
            if (smp.this.an != 0) {
                if (smp.this.an == 3) {
                    int i = smp.this.d;
                    smp smpVar = smp.this;
                    smpVar.d = smpVar.an;
                    smp.this.an = i;
                } else {
                    smp smpVar2 = smp.this;
                    smpVar2.d = smpVar2.an;
                }
            }
            smp.this.f48375a.e = smp.this.f48375a.f48383c;
            smp.this.f48375a.f48383c = 0;
            smp smpVar3 = smp.this;
            smpVar3.w = smpVar3.al;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        if (this.ae) {
            return;
        }
        gdy gdyVar = this.f;
        if (gdyVar == null || !TextUtils.isEmpty(gdyVar.h())) {
            long j = this.i;
            if (j == 0 || (j / 1000) - ((long) this.p) >= 2) {
                return;
            }
            HashMap map = new HashMap(2);
            gdy gdyVar2 = this.f;
            map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, gdyVar2 != null ? gdyVar2.h() : null);
            LogUtil.a("MediaCenter", "Kaka bi report paramMap = ", map);
            ddq.d().finishKakaTask(this.h, 40012, map);
        }
    }

    public void ad() {
        skz.c((Consumer<Long>) new Consumer() { // from class: com.huawei.ui.homehealth.healthheadlinecard.MediaCenter$$ExternalSyntheticLambda13
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f25541c.a((Long) obj);
            }
        });
    }

    public /* synthetic */ void a(Long l) {
        HashMap map = new HashMap(2);
        map.put(KakaConstants.SLEEP_MUSIC_DURATION, l);
        LogUtil.a("MediaCenter", "reportDurationFinishKakaTask bi report paramMap = ", map);
        ddq.d().finishKakaTask(this.h, 40013, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        gdy gdyVar = this.f;
        if (gdyVar == null || TextUtils.isEmpty(gdyVar.h()) || this.i == 0) {
            LogUtil.j("MediaCenter", "first time play or wrong with current item, failed to postProgressToCloud");
            return;
        }
        int i3 = this.ai;
        int i4 = i3 >= i2 ? 0 : i2 - i3;
        LogUtil.a("MediaCenter", "postToCloud media: ", this.f.h(), ", title = ", this.f.o(), ", progressTimeInSec: ", Integer.valueOf(i2), ", progressInterval: ", Integer.valueOf(i4), ", mCurrentItemDuration = ", Long.valueOf(this.i), ", mLastPostTimeInSec = ", Integer.valueOf(this.ai));
        HealthHeadLinesInfoManager.d().a(this.f.h(), i2, i4);
        this.ai = i2;
    }

    public gdy j() {
        return this.f;
    }

    public void i(int i2) {
        this.t = i2;
    }

    public int q() {
        return this.t;
    }

    public int a() {
        return this.j;
    }

    public void c(gdy gdyVar) {
        LogUtil.a("MediaCenter", "setCurrentItem id = ", gdyVar.h());
        this.f = gdyVar;
    }

    public void e(MediaStatusSubscriber mediaStatusSubscriber) {
        this.aw.add(mediaStatusSubscriber);
    }

    public void ab() {
        if (njy.e(this.aw)) {
            LogUtil.j("MediaCenter", "SubscriberList is empty.");
            return;
        }
        Iterator<MediaStatusSubscriber> it = this.aw.iterator();
        while (it.hasNext()) {
            it.next().onMediaChanged(this.f, this.l);
        }
    }

    public void b(MediaStatusSubscriber mediaStatusSubscriber) {
        this.aw.remove(mediaStatusSubscriber);
    }

    private void a(List<gdy> list) {
        int size = this.ao.size();
        Iterator<gdy> it = list.iterator();
        while (it.hasNext()) {
            this.aq.put(it.next().h(), Integer.valueOf(size));
            size++;
        }
    }

    public List<gdy> u() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = new CopyOnWriteArrayList(this.ao);
        }
        return copyOnWriteArrayList;
    }

    public void b(List<gdy> list, List<snk> list2) {
        synchronized (this) {
            this.ao.clear();
            if (list != null) {
                this.ao.addAll(list);
            }
            this.au.clear();
            if (list2 != null) {
                this.au.addAll(list2);
            }
        }
    }

    public List<snk> w() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = new CopyOnWriteArrayList(this.au);
        }
        return copyOnWriteArrayList;
    }

    public void e(int i2) {
        LogUtil.a("MediaCenter", "setCurrentItemIndex = ", Integer.valueOf(i2));
        this.l = i2;
    }

    public int f() {
        return this.l;
    }

    public float o() {
        return this.q;
    }

    public long g() {
        return this.i;
    }

    public int r() {
        return this.v;
    }

    public float k() {
        return this.s;
    }

    public IAudioPlayer.PlayMode m() {
        return this.k;
    }

    public String t() {
        return this.u;
    }

    public void g(String str) {
        this.u = str;
    }

    public String i() {
        return this.m;
    }

    public void d(String str) {
        this.m = str;
    }

    public int h() {
        return this.n;
    }

    public void f(int i2) {
        this.n = i2;
        if (i2 != 8) {
            this.al = null;
        }
    }

    public void f(String str) {
        this.al = str;
    }

    public int b(String str) {
        Integer num = this.aq.get(str);
        if (num == null) {
            LogUtil.e("MediaCenter", "getIndexByMediaId failed, mediaId = ", str, " not in mPlayIndexMap = ", this.aq);
            return -1;
        }
        return num.intValue();
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f48387a;
        private long d;
        private int e;

        private e() {
            this.f48387a = new d("BiInfo1100055");
            this.d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(long j, long j2) {
            synchronized (this) {
                this.f48387a.a(j, j2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            synchronized (this) {
                this.d += this.f48387a.c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            synchronized (this) {
                this.f48387a.b(j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(long j) {
            synchronized (this) {
                this.f48387a.c(j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i, int i2, long j) {
            a(true, i, i2, null);
            c(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i, int i2, IAudioPlayer.PlayMode playMode) {
            if (i != 3) {
                LogUtil.j("MediaCenter", "lastState is not playing, so do not doBi");
            } else {
                a(false, this.e, i2, playMode);
                this.d = 0L;
            }
        }

        private void a(boolean z, int i, int i2, IAudioPlayer.PlayMode playMode) {
            int i3;
            HashMap map = new HashMap(16);
            map.put("click", "1");
            if (!z && playMode != null) {
                map.put(KakaConstants.SLEEP_MUSIC_DURATION, Integer.valueOf((int) ((this.d + this.f48387a.c()) / 1000)));
                if (playMode == IAudioPlayer.PlayMode.SEQUENCE_PLAY) {
                    i3 = 1;
                } else if (playMode == IAudioPlayer.PlayMode.RANDOM_CIRCLE) {
                    i3 = 2;
                } else if (playMode == IAudioPlayer.PlayMode.PLAY_ONCE) {
                    i3 = 5;
                } else if (playMode == IAudioPlayer.PlayMode.SEQUENCE_CIRCLE) {
                    i3 = 3;
                } else {
                    LogUtil.g("MediaCenter", "playMode is ", playMode, ", do nothing with it.");
                    i3 = 0;
                }
                map.put("playMode", Integer.valueOf(i3));
            }
            map.put("event", Integer.valueOf(i2));
            map.put("from", Integer.valueOf(i));
            LogUtil.a("MediaCenter", "HEALTH_HEADLINES_USE_1100055 healthHeadLinesMap = " + map);
            lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HEADLINES_USE_1100055.value(), map, 0);
            this.e = i;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f48382a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f48383c;
        private final d d;
        private int e;

        private b() {
            this.d = new d("BiInfo1100056");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            synchronized (this) {
                this.f48383c = 3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(long j, long j2) {
            synchronized (this) {
                this.d.a(j, j2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(long j) {
            synchronized (this) {
                this.d.b(j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            synchronized (this) {
                this.d.b();
            }
        }

        private long d() {
            return this.d.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i, String str, String str2, String str3, String str4) {
            synchronized (this) {
                if (this.f48382a == 0) {
                    LogUtil.e("MediaCenter", "totalDuration is zero, should not post 1100056");
                    return;
                }
                HashMap map = new HashMap(16);
                map.put("click", "1");
                map.put("playMode", Integer.valueOf(this.e));
                map.put("finishRate", Float.valueOf(d() / this.f48382a));
                map.put("resourceName", str);
                map.put("resourceDate", str2);
                if (i != 8) {
                    str3 = null;
                }
                map.put("topicName", str3);
                if (i != 7) {
                    str4 = null;
                }
                map.put("Presenter", str4);
                map.put("from", Integer.valueOf(i));
                LogUtil.a("MediaCenter", "HEALTH_HEADLINES_SINGLE_RESOURCE_END_1100056 healthHeadLinesMap = ", map, ", totalDuration = ", Long.valueOf(this.f48382a));
                lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HEADLINES_SINGLE_RESOURCE_END_1100056.value(), map, 0);
            }
        }
    }

    static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<a> f48386c = new ArrayList<a>() { // from class: smp.d.4
            {
                add(new a());
            }
        };
        private String d;

        public d(String str) {
            this.d = "";
            this.d = str;
        }

        public String toString() {
            return "{\"playIntervals\":" + this.f48386c + '}';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            b(j);
            this.f48386c.add(e(j2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            if (njy.e(this.f48386c)) {
                return;
            }
            List<a> list = this.f48386c;
            list.get(list.size() - 1).e = j;
        }

        private a e(long j) {
            a aVar = new a();
            aVar.d = j;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            c(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(long j) {
            this.f48386c.clear();
            a aVar = new a();
            aVar.d = j;
            this.f48386c.add(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            long j = 0;
            if (!njy.e(this.f48386c)) {
                ArrayList arrayList = new ArrayList(0);
                for (a aVar : this.f48386c) {
                    if (aVar.d < aVar.e) {
                        arrayList.add(aVar);
                    }
                }
                if (!njy.e(arrayList)) {
                    Collections.sort(arrayList, new Comparator<a>() { // from class: smp.d.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(a aVar2, a aVar3) {
                            return (int) (aVar2.d - aVar3.d);
                        }
                    });
                    ArrayList<a> arrayList2 = new ArrayList(0);
                    a aVar2 = (a) arrayList.get(0);
                    arrayList2.add(aVar2);
                    for (int i = 1; i < arrayList.size(); i++) {
                        a aVar3 = (a) arrayList.get(i);
                        if (aVar3.d <= aVar2.e) {
                            a aVar4 = new a(aVar2.d, Math.max(aVar3.e, aVar2.e));
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList2.add(aVar4);
                        } else {
                            arrayList2.add(aVar3);
                        }
                        aVar2 = (a) arrayList2.get(arrayList2.size() - 1);
                    }
                    LogUtil.a("MediaCenter", this.d, " user actual play duration intervals ", arrayList2);
                    for (a aVar5 : arrayList2) {
                        j += aVar5.e - aVar5.d;
                    }
                    return j;
                }
            }
            return 0L;
        }
    }

    static final class a {
        long d;
        long e;

        public a(long j, long j2) {
            this.d = j;
            this.e = j2;
        }

        public a() {
        }

        public String toString() {
            return "[" + this.d + ", " + this.e + ']';
        }
    }

    static class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final smp f48389c = new smp();
    }

    static class h extends BaseHandler<smp> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(smp smpVar, Message message) {
        }

        private h(smp smpVar) {
            super(smpVar);
        }
    }

    public void e(String str, String str2) {
        this.f48376b.put(str, str2);
    }

    public String a(String str) {
        String str2;
        return (str == null || (str2 = this.f48376b.get(str)) == null) ? "" : str2;
    }

    public void d(List<gdy> list, List<snk> list2) {
        ReleaseLogUtil.d("R_MediaCenter", "saveMediaInfo start");
        sne sneVar = new sne();
        sneVar.c(list);
        sneVar.b(list2);
        a(sneVar);
    }

    private void a(sne sneVar) {
        SharedPreferenceManager.c("healthHeadLines", "todayDailyMediaInfo", qqt.a(sneVar, new TypeToken<sne>() { // from class: com.huawei.ui.homehealth.healthheadlinecard.MediaCenter$5
        }.getType()));
    }

    public void e() {
        SharedPreferenceManager.b("healthHeadLines", "dailyMediaInfo");
    }

    public sne s() {
        return (sne) qqt.c(SharedPreferenceManager.b("healthHeadLines", "todayDailyMediaInfo", ""), new TypeToken<sne>() { // from class: com.huawei.ui.homehealth.healthheadlinecard.MediaCenter$6
        }.getType());
    }

    private void ag() {
        this.h.registerComponentCallbacks(this.g);
    }

    public void ah() {
        this.h.unregisterComponentCallbacks(this.g);
    }

    public String p() {
        return this.aj;
    }

    public String n() {
        return this.o;
    }

    public void j(String str) {
        this.o = str;
    }

    public void d(sma smaVar) {
        CopyOnWriteArrayList<sma> copyOnWriteArrayList = this.ad;
        if (copyOnWriteArrayList == null) {
            LogUtil.a("MediaCenter", "mInnerApiList is null. Fail to addInnerApi.");
        } else {
            copyOnWriteArrayList.add(smaVar);
            LogUtil.a("MediaCenter", "add mInnerApiList.size = ", Integer.valueOf(this.ad.size()));
        }
    }

    public void e(sma smaVar) {
        CopyOnWriteArrayList<sma> copyOnWriteArrayList = this.ad;
        if (copyOnWriteArrayList == null) {
            LogUtil.a("MediaCenter", "mInnerApiList is null. Fail to remove.");
        } else {
            copyOnWriteArrayList.remove(smaVar);
            LogUtil.a("MediaCenter", "remove mInnerApiList.size = ", Integer.valueOf(this.ad.size()));
        }
    }
}
