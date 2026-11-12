package com.xiaomi.hm.health.training.ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.danikula.videocache.CacheListener;
import com.danikula.videocache.HttpProxyCacheServer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.material.timepicker.TimeModel;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.BgMusic;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.NewTrainingDb;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.media.PlayState;
import com.xiaomi.hm.health.training.media.PlaybackControl;
import com.xiaomi.hm.health.training.media.TrainingFinish;
import com.xiaomi.hm.health.training.media.TrainingProgressEnd;
import com.xiaomi.hm.health.training.media.TrainingSoundPool;
import com.xiaomi.hm.health.training.media.TrainingStartCountDownFinish;
import com.xiaomi.hm.health.training.media.factory.PlayActionVideoOptions;
import com.xiaomi.hm.health.training.media.factory.PlayActionVideoStrategyFactory;
import com.xiaomi.hm.health.training.ui.activity.TrainingHistoryActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.ui.listener.BlockMultiClickListener;
import com.xiaomi.hm.health.training.ui.widget.TrainingActionBarProgressView;
import com.xiaomi.hm.health.training.ui.widget.TrainingHrIndicatorView;
import com.xiaomi.hm.health.training.ui.widget.progress.TrainingActionRingProgressView;
import com.xiaomi.hm.health.training.utils.BitmapUtils;
import com.xiaomi.hm.health.training.utils.HttpProxyCacheServerHolder;
import com.xiaomi.hm.health.traininglib.event.EventFinishCurrentTraining;
import com.xiaomi.hm.health.traininglib.hr.service.TrainingHrService;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.model.TrainingPause;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import de.greenrobot.event.EventBus;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingPlayingFragment extends Fragment {
    public static final String BEATHE_PAUSE_ACTION = "com.huami.sleep.breathonpause";
    public static final String TAG = TrainingPlayingFragment.class.getSimpleName();
    public static final int TIMER_CANCEL = 2;
    public static final int TIMER_PAUSE = 1;
    public static final int TIMER_WORK = 0;
    private List<HaveDoneAction> A;
    private TrainingPlayActivity B;
    private boolean C;
    private TextView D;
    private n E;
    private TrainingSoundPool F;
    private TrainingHrIndicatorView G;
    private View H;
    private View I;
    private View J;
    private PlayActionVideoOptions K;
    private TrainingHrService M;

    @Nullable
    private HttpProxyCacheServer Q;
    private File R;
    private AudioManager S;
    private FrameLayout a;
    private SurfaceView b;
    private RelativeLayout c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    public int finishedIndex;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private MediaPlayer j;
    private boolean l;
    private SimpleExoPlayer m;
    private boolean n;
    private LoopingMediaSource o;
    private TrainingCourseItem p;
    private long q;
    private View r;
    private View s;
    private SeekBar t;
    public TrainingActionRingProgressView trainingArcProgress;
    public TrainingActionBarProgressView trainingBarProgress;
    public TrainingDetail trainingDetail;
    private View u;
    private TextView v;
    private ProgressBar w;
    private View x;
    private PlaybackControl y;
    private TrainingRecord z;
    private boolean k = true;
    private DeviceHrEvent L = new DeviceHrEvent(-1);
    private ServiceConnection N = new d();
    public TrainerInfo trainer = TrainerInfo.get();
    private boolean O = false;
    private boolean P = false;
    private int T = 0;
    public long trainingCostTimer = 0;
    public long calTime = 0;
    public long actionAlltime = 0;
    private TrainingPause U = new TrainingPause();
    public m V = new m(this);
    private CacheListener W = new CacheListener() { // from class: nx7
        @Override // com.danikula.videocache.CacheListener
        public final void onCacheAvailable(File file, String str, int i2) {
            this.a.I(file, str, i2);
        }
    };
    private final o X = new o(this);
    private Player.EventListener Y = new b();
    private BroadcastReceiver Z = new c();
    private AudioManager.OnAudioFocusChangeListener m0 = new AudioManager.OnAudioFocusChangeListener() { // from class: mx7
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i2) {
            this.a.J(i2);
        }
    };

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TrainingPlayingFragment.this.s.setRotationY(270.0f);
            TrainingPlayingFragment.this.I.setVisibility(8);
            TrainingPlayingFragment.this.G.setShowContent(true);
        }
    }

    public class b implements Player.EventListener {
        public b() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            m0.a(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            m0.b(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            m0.c(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            m0.d(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
            m0.f(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            m0.g(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            m0.h(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            m0.i(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            m0.k(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            m0.l(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            m0.m(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            m0.n(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 4) {
                EventBus.getDefault().post(new TrainingFinish());
            }
            if (i == 2) {
                TrainingPlayingFragment.this.w.setVisibility(0);
            } else {
                TrainingPlayingFragment.this.w.setVisibility(8);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            m0.p(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            m0.q(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            m0.r(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            m0.t(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            m0.u(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            m0.v(this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            m0.w(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            m0.x(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            m0.y(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION) && TrainingPlayingFragment.this.isYoga() && !NetUtil.isNetworkConnected(context)) {
                IconToast.showError(context, R.string.net_not_work);
            }
        }
    }

    public class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            System.out.println("开启服务....");
            TrainingPlayingFragment.this.M = ((TrainingHrService.TrainingHrBinder) iBinder).getService();
            TrainingPlayingFragment.this.M.start(TrainingPlayingFragment.this.trainingDetail.getTrainingId().longValue(), TrainingPlayingFragment.this.q, TrainingPlayingFragment.this.z.getStartTime().longValue());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            System.out.println("服务解绑....");
            TrainingPlayingFragment.this.M = null;
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TrainingPlayingFragment.this.l) {
                TrainingPlayingFragment.this.l = true;
                TrainingPlayingFragment.this.c.setVisibility(0);
            } else {
                TrainingAnalytics.event(TrainingPlayingFragment.this.getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, TrainingAnalytics.ParamValue.TrainingPlayControl.HIDDEN);
                TrainingPlayingFragment.this.l = false;
                TrainingPlayingFragment.this.c.setVisibility(8);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingPlayingFragment.this.configBgm();
            TrainingPlayingFragment.this.z();
        }
    }

    public class g extends BlockMultiClickListener {
        public g() {
        }

        @Override // com.xiaomi.hm.health.training.ui.listener.BlockMultiClickListener
        public void singleClick(View view) {
            TrainingPlayingFragment.this.onPauseVideo();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
            TrainingPlayingFragment.this.closeVideo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(DialogInterface dialogInterface) {
            if (TrainingPlayingFragment.this.C) {
                return;
            }
            TrainingPlayingFragment.this.B.playState = PlayState.PLAYING;
            TrainingPlayingFragment.this.resumeVideo();
            TrainingPlayingFragment.this.resumeBgm();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingAnalytics.event(TrainingPlayingFragment.this.getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, "Quit");
            TrainingPlayingFragment.this.pauseVideo();
            TrainingPlayingFragment.this.pauseBgm();
            TrainingPlayingFragment.this.B.playState = PlayState.CLOSE;
            new AlertDialogFragment.Builder(TrainingPlayingFragment.this.B).setNegativeButton(TrainingPlayingFragment.this.getString(R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(TrainingPlayingFragment.this.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.c(dialogInterface, i);
                }
            }).setMessage(TrainingPlayingFragment.this.getString(R.string.training_close_dialog_title)).setCancelable(true).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.a.d(dialogInterface);
                }
            }).create().show(TrainingPlayingFragment.this.B.getSupportFragmentManager());
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingAnalytics.event(TrainingPlayingFragment.this.getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, TrainingAnalytics.ParamValue.TrainingPlayControl.FAST_FORWARD);
            TrainingPlayingFragment.this.y.endActionPlayer();
            TrainingPlayingFragment.this.trainingArcProgress.stop();
            TrainingPlayingFragment.this.trainingBarProgress.stop();
            TrainingPlayingFragment.this.y.startNext();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingAnalytics.event(TrainingPlayingFragment.this.getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, TrainingAnalytics.ParamValue.TrainingPlayControl.FAST_REWIND);
            TrainingPlayingFragment.this.y.endActionPlayer();
            TrainingPlayingFragment.this.trainingArcProgress.stop();
            TrainingPlayingFragment.this.trainingBarProgress.stop();
            TrainingPlayingFragment.this.y.startPrev();
        }
    }

    public class k implements SeekBar.OnSeekBarChangeListener {
        public k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            TrainingPlayingFragment.this.m.seekTo((TrainingPlayingFragment.this.m.getDuration() * ((long) seekBar.getProgress())) / 100);
        }
    }

    public class l extends AnimatorListenerAdapter {
        public l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TrainingPlayingFragment.this.r.setRotationY(270.0f);
            TrainingPlayingFragment.this.H.setVisibility(8);
            TrainingPlayingFragment.this.D.setVisibility(0);
            TrainingPlayingFragment.this.trainingArcProgress.setShowContent(true);
        }
    }

    public static class m extends Handler {
        private WeakReference<TrainingPlayingFragment> a;

        public m(TrainingPlayingFragment trainingPlayingFragment) {
            this.a = new WeakReference<>(trainingPlayingFragment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean e(TrainingPlayingFragment trainingPlayingFragment) throws Exception {
            TrainingDBUtils.insertTrainingRecord(trainingPlayingFragment.z);
            TrainingDBUtils.insertTrainingDetail(trainingPlayingFragment.trainingDetail);
            TrainingCourseItem trainingCourseItem = trainingPlayingFragment.p;
            if (trainingCourseItem != null) {
                TrainingDBUtils.updateTrainingCourseItemIsFinished(trainingCourseItem, true);
                NewTrainingDb.INSTANCE.finishPlanTraining(trainingCourseItem.trainingId.longValue(), trainingCourseItem.dayIndex.intValue(), true);
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(TrainingPlayingFragment trainingPlayingFragment, Boolean bool) {
            TrainingHistoryActivity.launch(trainingPlayingFragment.B, trainingPlayingFragment.z.getTrainingId().longValue(), trainingPlayingFragment.z.getStartTime().longValue());
            EventBus.getDefault().post(new EventFinishCurrentTraining(trainingPlayingFragment.z));
            TrainingAnalytics.event(trainingPlayingFragment.getContext(), TrainingAnalytics.EventId.TRAINING_FINISHED_OPERAT);
            trainingPlayingFragment.B.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object g() {
            return "训练播放结束更新数据库出错";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void h(Throwable th) {
            Loggers.getLogger().w(TrainingPlayingFragment.TAG, th, new Supplier() { // from class: com.xiaomi.hm.health.training.ui.fragment.d
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return TrainingPlayingFragment.m.g();
                }
            });
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int iIntValue;
            final TrainingPlayingFragment trainingPlayingFragment = this.a.get();
            int i = message.what;
            if (i == 0) {
                trainingPlayingFragment.trainingCostTimer += 1000;
                trainingPlayingFragment.D.setText(TrainingPlayingFragment.getConsumeTime(trainingPlayingFragment.trainingCostTimer));
                return;
            }
            if (i != 2) {
                return;
            }
            trainingPlayingFragment.P = true;
            if (trainingPlayingFragment.trainer.hasHrDevice) {
                trainingPlayingFragment.stopHrService();
            }
            trainingPlayingFragment.z.setDuration(Long.valueOf(trainingPlayingFragment.trainingCostTimer));
            trainingPlayingFragment.z.setStatus(0);
            trainingPlayingFragment.z.setTrainingType(trainingPlayingFragment.trainingDetail.trainingType);
            if (trainingPlayingFragment.isYoga()) {
                iIntValue = Math.round(trainingPlayingFragment.trainingCostTimer * ((trainingPlayingFragment.trainingDetail.consumption.intValue() * 1.0f) / ParseJsonUtil.getLongByGender(trainingPlayingFragment.trainingDetail.time, trainingPlayingFragment.trainer)));
            } else {
                long j = trainingPlayingFragment.actionAlltime;
                double d = j > 0 ? trainingPlayingFragment.calTime / j : 0.0d;
                iIntValue = d > 1.0d ? trainingPlayingFragment.trainingDetail.consumption.intValue() : (int) Math.ceil(d * ((double) trainingPlayingFragment.trainingDetail.consumption.intValue()));
            }
            trainingPlayingFragment.z.setConsumption(Integer.valueOf(iIntValue));
            trainingPlayingFragment.z.setEndTime(Long.valueOf(System.currentTimeMillis()));
            Observable.fromCallable(new Callable() { // from class: com.xiaomi.hm.health.training.ui.fragment.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TrainingPlayingFragment.m.e(trainingPlayingFragment);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: com.xiaomi.hm.health.training.ui.fragment.f
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    TrainingPlayingFragment.m.f(trainingPlayingFragment, (Boolean) obj);
                }
            }, new Action1() { // from class: com.xiaomi.hm.health.training.ui.fragment.g
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    TrainingPlayingFragment.m.h((Throwable) obj);
                }
            });
        }
    }

    public class n implements Runnable {
        public Object a = new Object();
        public boolean b;
        public boolean c;

        public n() {
        }

        public void a() {
            this.b = true;
        }

        public void b() {
            synchronized (this.a) {
                this.c = false;
                this.a.notify();
            }
        }

        public void c() {
            this.c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.b) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.c) {
                    synchronized (this.a) {
                        try {
                            this.a.wait();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                TrainingPlayingFragment.this.V.sendEmptyMessage(0);
            }
            TrainingPlayingFragment.this.V.sendEmptyMessage(2);
        }
    }

    public static final class o extends Handler {
        private WeakReference<TrainingPlayingFragment> a;

        public o(TrainingPlayingFragment trainingPlayingFragment) {
            this.a = new WeakReference<>(trainingPlayingFragment);
        }

        public void a() {
            sendEmptyMessage(0);
        }

        public void b() {
            removeMessages(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.a.get().M();
            sendEmptyMessageDelayed(0, 500L);
        }
    }

    private void A() {
        if (isYoga()) {
            this.e.setVisibility(8);
            return;
        }
        this.e.setVisibility(0);
        BgMusic bgMusic = this.trainingDetail.bgMusic;
        File medialFromCacheByUri = bgMusic != null ? MediaFileUtils.getMedialFromCacheByUri(bgMusic.getUrl(), this.trainingDetail.bgMusic.getSize()) : null;
        if (medialFromCacheByUri != null) {
            this.j = MediaPlayer.create(getContext(), Uri.fromFile(medialFromCacheByUri));
        } else {
            this.j = MediaPlayer.create(getContext(), R.raw.training_bg);
        }
        this.j.setLooping(true);
        if (!TrainingConfig.getTrainingBgmEnable()) {
            this.e.setImageResource(R.drawable.icon_training_video_bgm_off);
            this.k = false;
        } else {
            this.e.setImageResource(R.drawable.icon_training_video_bgm);
            playBgm();
            this.k = true;
        }
    }

    private void B() {
        TrainingSoundPool trainingSoundPool = new TrainingSoundPool(this.B);
        this.F = trainingSoundPool;
        this.trainingArcProgress.setTrainingSoundPool(trainingSoundPool);
    }

    private void C() {
        if (this.trainer.hasHrDevice) {
            this.B.bindService(new Intent(this.B, (Class<?>) TrainingHrService.class), this.N, 1);
            this.O = true;
        }
    }

    private void D() {
        if (!isYoga()) {
            PlaybackControl playbackControl = new PlaybackControl(this.finishedIndex, this.m, this.trainingDetail, this);
            this.y = playbackControl;
            playbackControl.playbackLoopVideo(this.trainingDetail.content.get(this.finishedIndex), 0);
            this.y.startPlayback();
            return;
        }
        HttpProxyCacheServer httpProxyCacheServer = this.Q;
        String proxyUrl = httpProxyCacheServer != null ? httpProxyCacheServer.getProxyUrl(this.trainingDetail.yogaUrl) : "";
        this.m.setMediaSource(new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory(requireContext(), Util.getUserAgent(requireContext(), "com.xiaomi.hm.health"), DefaultBandwidthMeter.getSingletonInstance(requireContext()))).createMediaSource(new MediaItem.Builder().setUri(Uri.parse(proxyUrl)).build()));
        this.m.prepare();
        this.m.addListener(this.Y);
        playVideo();
    }

    private void E() {
        if (!isYoga()) {
            getActionVideoOptions().getBottomProgressStrategy().initBottomProgress(this);
            return;
        }
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.r.setVisibility(8);
        this.trainingBarProgress.setVisibility(8);
        boolean z = false;
        this.u.setVisibility(0);
        HttpProxyCacheServer httpProxyCacheServer = this.Q;
        if (httpProxyCacheServer != null && httpProxyCacheServer.isCached(this.trainingDetail.yogaUrl)) {
            z = true;
        }
        if (z) {
            this.t.setSecondaryProgress(100);
        }
        this.t.setOnSeekBarChangeListener(new k());
    }

    private void F() {
        this.E = new n();
        new Thread(this.E).start();
    }

    private void G() {
        TrainingRecord trainingRecord = (TrainingRecord) getArguments().getSerializable(TrainingPlayActivity.TRAINING_RECORD);
        if (trainingRecord == null || trainingRecord.startTime.longValue() <= 0) {
            TrainingRecord trainingRecord2 = new TrainingRecord();
            this.z = trainingRecord2;
            TrainingDetail trainingDetail = this.trainingDetail;
            Integer numValueOf = Integer.valueOf(trainingDetail.finishNumber.intValue() + 1);
            trainingDetail.finishNumber = numValueOf;
            trainingRecord2.setFinishNumber(numValueOf);
            this.z.setTrainingId(this.trainingDetail.getTrainingId());
            this.z.setDetailsPageIllustrated(this.trainingDetail.getDetailsPageIllustrated());
            this.z.setTrainingPlanId(Long.valueOf(this.q));
            this.z.setName(this.trainingDetail.name);
            this.z.setHasBoundHrDevice(Boolean.valueOf(this.trainer.hasHrDevice));
            TrainingCourseItem trainingCourseItem = this.p;
            if (trainingCourseItem != null) {
                this.z.setTrainingPlanDayIndex(trainingCourseItem.dayIndex);
            }
            this.z.setStartTime(Long.valueOf(System.currentTimeMillis()));
            this.z.generateTrainingRecordId();
            this.z.setStatus(-1);
            this.A = new ArrayList();
            this.finishedIndex = 0;
            this.trainingCostTimer = 0L;
            this.calTime = 0L;
            if (isYoga()) {
                TrainingDBUtils.insertTrainingRecord(this.z);
                return;
            }
            return;
        }
        this.z = trainingRecord;
        List<HaveDoneAction> list = trainingRecord.actions;
        this.A = list;
        if (list == null || list.size() <= 0) {
            this.A = new ArrayList();
            this.calTime = 0L;
            this.finishedIndex = 0;
        } else {
            Iterator<HaveDoneAction> it2 = this.A.iterator();
            while (it2.hasNext()) {
                this.calTime += (long) Integer.parseInt(ParseJsonUtil.getStringByGender(it2.next().duration, this.trainer));
            }
            List<HaveDoneAction> list2 = this.A;
            HaveDoneAction haveDoneAction = list2.get(list2.size() - 1);
            int i2 = -1;
            for (int i3 = 0; i3 < this.trainingDetail.content.size(); i3++) {
                ActionContent actionContent = this.trainingDetail.content.get(i3);
                if (haveDoneAction.getRound().intValue() == actionContent.getRound().intValue() && haveDoneAction.getGroup().intValue() == actionContent.getGroup().intValue()) {
                    i2 = i3;
                }
            }
            if (i2 == -1 || i2 == this.trainingDetail.content.size() - 1) {
                this.finishedIndex = 0;
            } else {
                this.finishedIndex = i2 + 1;
            }
        }
        this.trainingCostTimer = this.z.getDuration().longValue();
        recordPauseStartTimeWhenRecvoer(this.z.startTime.longValue() + this.z.getDuration().longValue());
        recordPauseEndTime();
    }

    private void H() {
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(requireContext()).build();
        this.m = simpleExoPlayerBuild;
        simpleExoPlayerBuild.setVideoSurfaceView(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(File file, String str, int i2) {
        HMLog.d(TAG, "cacheFile:" + file + "\nurl:" + str + "\npercentsAvailable:" + i2, new Object[0]);
        this.R = file;
        this.t.setSecondaryProgress(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(int i2) {
        this.T = i2;
    }

    private void K() {
        this.B = (TrainingPlayActivity) getActivity();
        Bundle arguments = getArguments();
        this.trainingDetail = (TrainingDetail) arguments.getSerializable(TrainingPlayActivity.TRAINING_DETAIL);
        this.p = (TrainingCourseItem) arguments.getSerializable(TrainingPlayActivity.TRAINING_COURSE_ITEM);
        this.q = arguments.getLong(TrainingPlayActivity.TRAINING_PLAN_ID);
    }

    private String L(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j2);
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j2) - (60 * minutes)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        long currentPosition = this.m.getCurrentPosition();
        long duration = this.m.getDuration();
        if (duration <= 0 || currentPosition <= 0) {
            return;
        }
        this.t.setProgress((int) ((100 * currentPosition) / duration));
        this.v.setText(String.format(Locale.getDefault(), "%s/%s", L(currentPosition), L(duration)));
    }

    private Bitmap N() {
        File medialFromCacheByUri = MediaFileUtils.getMedialFromCacheByUri(this.trainingDetail.content.get(this.finishedIndex).actionVideo.url, this.trainingDetail.content.get(this.finishedIndex).actionVideo.size.longValue());
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(medialFromCacheByUri.getAbsolutePath());
        return mediaMetadataRetriever.getFrameAtTime(3L);
    }

    public static String getConsumeTime(long j2) {
        if (j2 < 0) {
            return "00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = simpleDateFormat.getCalendar();
        calendar.setTimeInMillis(j2);
        int i2 = calendar.get(11) + ((((int) j2) / ((int) 86400000)) * 24);
        int i3 = calendar.get(12);
        int i4 = calendar.get(13);
        if (j2 < 3600000) {
            return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3)) + ":" + String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i4));
        }
        return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2)) + ":" + String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3)) + ":" + String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i4));
    }

    private void y() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setStartDelay(1000L);
        this.trainingArcProgress.setShowContent(false);
        this.D.setVisibility(8);
        if (!isYoga()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.r, (Property<View, Float>) View.ROTATION_Y, 0.0f, 90.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.addListener(new l());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.r, (Property<View, Float>) View.ROTATION_Y, 270.0f, 360.0f);
            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat2.setDuration(500L);
            animatorSet2.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        if (this.s.getVisibility() == 0) {
            this.G.setShowContent(false);
            animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.s, (Property<View, Float>) View.ROTATION_Y, 0.0f, 90.0f);
            objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat3.setDuration(500L);
            objectAnimatorOfFloat3.addListener(new a());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.s, (Property<View, Float>) View.ROTATION_Y, 270.0f, 360.0f);
            objectAnimatorOfFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat4.setDuration(500L);
            animatorSet.playSequentially(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        } else {
            animatorSet = null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.J, (Property<View, Float>) View.ROTATION_Y, 0.0f, 90.0f).setDuration(500L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.r, (Property<View, Float>) View.ROTATION_Y, 270.0f, 360.0f).setDuration(500L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(duration, duration2);
        if (animatorSet != null) {
            animatorSet3.playTogether(animatorSet2, animatorSet, animatorSet4);
        } else {
            animatorSet3.playTogether(animatorSet2, animatorSet4);
        }
        animatorSet3.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (!this.k) {
            this.S.abandonAudioFocus(this.m0);
        } else {
            if (isYoga()) {
                return;
            }
            this.S.requestAudioFocus(this.m0, 3, 1);
        }
    }

    public void closeVideo() {
        this.C = true;
        if (this.trainer.hasHrDevice && !this.L.isDisconnected()) {
            stopHrService();
        }
        if (!isYoga()) {
            this.y.endActionPlayer();
            this.trainingArcProgress.stop();
            this.trainingBarProgress.stop();
        }
        HMDaoManager.getInstance().getDaoSession().getTrainingRecordDao().delete(this.z);
        this.B.playState = PlayState.END;
        TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_QUIT_OPERAT);
        this.B.finish();
    }

    public void configBgm() {
        if (isYoga()) {
            return;
        }
        if (this.k) {
            this.j.pause();
            TrainingConfig.setTrainingBgmEnable(false);
            this.e.setImageResource(R.drawable.icon_training_video_bgm_off);
            TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, TrainingAnalytics.ParamValue.TrainingPlayControl.BGM_OFF);
        } else {
            this.j.start();
            TrainingConfig.setTrainingBgmEnable(true);
            this.e.setImageResource(R.drawable.icon_training_video_bgm);
            TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, TrainingAnalytics.ParamValue.TrainingPlayControl.BGM_ON);
        }
        this.k = !this.k;
    }

    public void generateGaussBlur() {
        if (isYoga()) {
            return;
        }
        BitmapUtils.saveBitmapToFile(new File(FileUtils.getTrainingDir(), TrainingPlayActivity.TRAINING_GAUSS_BLUR_BG_PIC).getAbsolutePath(), N(), 100);
    }

    public PlayActionVideoOptions getActionVideoOptions() {
        if (this.K == null) {
            this.K = PlayActionVideoStrategyFactory.create(this.trainingDetail);
        }
        return this.K;
    }

    public PlaybackControl getPlaybackControl() {
        return this.y;
    }

    public TrainingSoundPool getSoundPool() {
        return this.F;
    }

    public boolean isFinished() {
        return this.P;
    }

    public boolean isYoga() {
        return "YOGA".equals(this.trainingDetail.trainingType);
    }

    public void notifyBottomProgress(ActionContent actionContent, int i2) {
        getActionVideoOptions().getBottomProgressStrategy().notifyBottomProgress(this, actionContent, i2);
    }

    public void notifyCircleProgress(ActionContent actionContent, int i2) {
        getActionVideoOptions().getCircleProgressStrategy().notifyCircleProgress(this, actionContent, i2);
    }

    public void notifyShowControlButton(int i2) {
        List<ActionContent> list = this.trainingDetail.content;
        if (list == null || list.size() <= 0) {
            return;
        }
        if (i2 == 0) {
            this.g.setEnabled(false);
            this.g.setAlpha(0.4f);
        } else {
            this.g.setEnabled(true);
            this.g.setAlpha(1.0f);
        }
        if (i2 == this.trainingDetail.content.size() - 1) {
            this.h.setEnabled(false);
            this.h.setAlpha(0.4f);
        } else {
            this.h.setEnabled(true);
            this.h.setAlpha(1.0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        HMLog.d(TAG, "onActivityCreated", new Object[0]);
        B();
        A();
        H();
        G();
        F();
        E();
        D();
        C();
        y();
        if (isYoga()) {
            this.f.setText(this.trainingDetail.name);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        HMLog.d(TAG, "onCreate", new Object[0]);
        K();
        if (isYoga()) {
            HttpProxyCacheServer proxy = HttpProxyCacheServerHolder.getProxy(getContext());
            this.Q = proxy;
            if (proxy != null) {
                proxy.registerCacheListener(this.W, this.trainingDetail.yogaUrl);
            }
        }
        this.S = (AudioManager) getContext().getSystemService("audio");
        Intent intent = new Intent();
        intent.setAction("com.huami.sleep.breathonpause");
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_training_playing, viewGroup, false);
        this.a = (FrameLayout) viewInflate.findViewById(R.id.video_container);
        this.b = (SurfaceView) viewInflate.findViewById(R.id.video_surface);
        this.w = (ProgressBar) viewInflate.findViewById(R.id.video_buffering_progress);
        this.u = viewInflate.findViewById(R.id.seek_bar_container);
        this.v = (TextView) viewInflate.findViewById(R.id.video_current_time);
        this.H = viewInflate.findViewById(R.id.training_timer_desc);
        this.I = viewInflate.findViewById(R.id.training_hr_desc);
        this.J = viewInflate.findViewById(R.id.invisible_placeholder);
        this.x = viewInflate.findViewById(R.id.bottom_area);
        this.c = (RelativeLayout) viewInflate.findViewById(R.id.video_control);
        this.d = (ImageView) viewInflate.findViewById(R.id.video_close);
        this.e = (ImageView) viewInflate.findViewById(R.id.video_bgm);
        this.f = (TextView) viewInflate.findViewById(R.id.current_action);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.video_prev);
        this.g = imageView;
        TintUtils.tintDrawable(imageView, -1);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.video_next);
        this.h = imageView2;
        TintUtils.tintDrawable(imageView2, -1);
        this.i = (ImageView) viewInflate.findViewById(R.id.video_pause);
        this.trainingArcProgress = (TrainingActionRingProgressView) viewInflate.findViewById(R.id.trainingArcProgress);
        this.r = viewInflate.findViewById(R.id.training_timer);
        this.s = viewInflate.findViewById(R.id.training_hr);
        this.trainingBarProgress = (TrainingActionBarProgressView) viewInflate.findViewById(R.id.trainingBarProgress);
        this.t = (SeekBar) viewInflate.findViewById(R.id.online_video_progress);
        this.G = (TrainingHrIndicatorView) viewInflate.findViewById(R.id.trainingHrIndicatorView);
        if (!this.trainer.hasHrDevice) {
            this.s.setVisibility(8);
        }
        this.D = (TextView) viewInflate.findViewById(R.id.training_cost_time);
        this.a.setOnClickListener(new e());
        this.e.setOnClickListener(new f());
        this.i.setOnClickListener(new g());
        this.d.setOnClickListener(new h());
        this.h.setOnClickListener(new i());
        this.g.setOnClickListener(new j());
        EventBus.getDefault().register(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HMLog.d(TAG, "onDestroy", new Object[0]);
        if (isYoga()) {
            HttpProxyCacheServer httpProxyCacheServer = this.Q;
            if (httpProxyCacheServer != null) {
                httpProxyCacheServer.unregisterCacheListener(this.W);
            }
            this.m.removeListener(this.Y);
        }
        this.trainingArcProgress.stop();
        this.trainingBarProgress.stop();
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.j = null;
        }
        SimpleExoPlayer simpleExoPlayer = this.m;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
            this.m = null;
        }
        this.F.release();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(TrainingProgressEnd trainingProgressEnd) {
        HaveDoneAction haveDoneAction = new HaveDoneAction();
        ActionContent actionContent = this.trainingDetail.content.get(this.finishedIndex);
        haveDoneAction.setType(actionContent.actionVideo.getType());
        haveDoneAction.setRepeatNumber(actionContent.repeatNumber);
        haveDoneAction.setDuration(actionContent.getDuration());
        this.calTime += (long) Integer.parseInt(ParseJsonUtil.getStringByGender(haveDoneAction.duration, this.trainer));
        haveDoneAction.setName(actionContent.actionVideo.name);
        haveDoneAction.setTrainingStartTime(this.z.getStartTime());
        haveDoneAction.setActionAudioId(actionContent.audio.audioId);
        haveDoneAction.setTrainingId(this.trainingDetail.getTrainingId());
        haveDoneAction.setTrainingPlanId(Long.valueOf(this.q));
        haveDoneAction.setRound(actionContent.round);
        haveDoneAction.setGroup(actionContent.group);
        this.A.add(haveDoneAction);
        this.z.setActions(this.A);
        this.z.setDuration(Long.valueOf(this.trainingCostTimer));
        TrainingDBUtils.insertTrainingDoneActions(this.A);
        TrainingDBUtils.insertTrainingRecord(this.z);
        this.F.play(101);
        if (actionContent.nextRestTime.longValue() == 0 || this.finishedIndex >= this.trainingDetail.content.size() - 1) {
            if (this.finishedIndex == this.trainingDetail.content.size() - 1) {
                this.F.play(100);
            }
            this.y.startNext();
        } else {
            generateGaussBlur();
            int i2 = this.finishedIndex + 1;
            this.finishedIndex = i2;
            this.B.showRest((ArrayList) this.trainingDetail.content, actionContent.nextRestTime.longValue(), i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        HMLog.d(TAG, "onPause()", new Object[0]);
    }

    public void onPauseVideo() {
        TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_PLAY_OPERATE, "Pause");
        if (this.n) {
            pauseVideo();
            this.B.showPause((ArrayList) this.trainingDetail.content, this.trainingCostTimer, this.finishedIndex);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HMLog.d(TAG, "onResume()", new Object[0]);
        if (isYoga()) {
            this.X.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        HMLog.d(TAG, "onStart()", new Object[0]);
        z();
        getActivity().registerReceiver(this.Z, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        HMLog.d(TAG, "onStop()", new Object[0]);
        if (this.T == 1) {
            this.S.abandonAudioFocus(this.m0);
        }
        getActivity().unregisterReceiver(this.Z);
        if (isYoga()) {
            this.X.b();
        }
    }

    public void onlyShowPlayerView(boolean z) {
        this.w.setVisibility((z || this.m.getPlaybackState() != 2) ? 8 : 0);
        this.c.setVisibility(!z ? 0 : 8);
        this.x.setVisibility(z ? 8 : 0);
    }

    public void pauseBgm() {
        if (!isYoga() && this.k) {
            this.j.pause();
        }
    }

    public void pauseHr() {
        TrainingHrService trainingHrService;
        if (!this.trainer.hasHrDevice || (trainingHrService = this.M) == null) {
            return;
        }
        trainingHrService.pause();
    }

    public void pauseVideo() {
        this.E.c();
        if (!isYoga()) {
            this.trainingArcProgress.pause();
            this.trainingBarProgress.pause();
            this.y.pause();
        }
        this.m.setPlayWhenReady(false);
        this.n = false;
        this.i.setBackgroundResource(R.drawable.icon_training_video_play);
    }

    public void playBgm() {
        this.j.start();
        this.e.setImageResource(R.drawable.icon_training_video_bgm);
    }

    public void playVideo() {
        this.m.setPlayWhenReady(true);
        this.n = true;
    }

    public void recordPauseEndTime() {
        this.U.setEndTime(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(this.z.getPause() == null ? "" : this.z.getPause());
        sb.append(this.U.generateCsvStr());
        this.z.setPause(sb.toString());
        this.U.reset();
    }

    public void recordPauseStartTime() {
        this.U.setStartTime(System.currentTimeMillis(), this.trainingCostTimer);
    }

    public void recordPauseStartTimeWhenRecvoer(long j2) {
        this.U.setStartTime(j2, this.trainingCostTimer);
    }

    public void resumeBgm() {
        if (!isYoga() && this.k) {
            this.j.start();
        }
    }

    public void resumeHr() {
        TrainingHrService trainingHrService;
        if (!this.trainer.hasHrDevice || (trainingHrService = this.M) == null) {
            return;
        }
        trainingHrService.resume();
    }

    public void resumeVideo() {
        this.E.b();
        this.m.setPlayWhenReady(true);
        this.n = true;
        this.i.setBackgroundResource(R.drawable.icon_training_video_pause);
        if (isYoga()) {
            return;
        }
        this.trainingArcProgress.resume();
        this.trainingBarProgress.resume();
        this.y.resume();
    }

    public void setCurrentAction(String str, int i2, String str2) {
        if ("TIME".equals(str2)) {
            this.f.setText(str + getResources().getQuantityString(R.plurals.training_playing_title_time, i2, Integer.valueOf(i2)));
            return;
        }
        this.f.setText(str + getResources().getQuantityString(R.plurals.training_playing_title_times, i2, Integer.valueOf(i2)));
    }

    public void startCountDown() {
        this.trainingArcProgress.startPeriodicRefresh();
    }

    public void startNext() {
        this.y.startNext();
    }

    public void stopHrService() {
        TrainingHrService trainingHrService = this.M;
        if (trainingHrService != null) {
            trainingHrService.stop();
        }
        if (this.O) {
            this.B.unbindService(this.N);
            this.O = false;
        }
    }

    public void stopVideo() {
        this.m.stop();
        this.m.release();
    }

    public void onEventMainThread(TrainingFinish trainingFinish) {
        this.trainingDetail.setFinishNumber(this.z.getFinishNumber());
        this.E.a();
    }

    public void onEventMainThread(TrainingStartCountDownFinish trainingStartCountDownFinish) {
        getActionVideoOptions().getBottomProgressStrategy().onEventMainThread(this.trainingDetail.content.get(this.finishedIndex), this.y, this.trainingBarProgress);
    }

    public void onEventMainThread(DeviceHrEvent deviceHrEvent) {
        if (deviceHrEvent != null) {
            this.G.setHr(deviceHrEvent);
            this.L = deviceHrEvent;
        }
    }
}
