package com.xiaomi.hm.health.training.ui.fragment.train;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.huami.ad.AdLoadListener;
import com.huami.ad.AdRepository;
import com.huami.ad.AdRequest;
import com.huami.ad.entity.TextLinkEntity;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.TextLinkAdView;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.ActionDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.utils.TrainingVideoPlayBackUtils;
import com.xiaomi.hm.health.traininglib.ad.TrainingAdManager;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import rx.Emitter;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingPauseFragment extends Fragment {
    public static final String ALL_ACTION_CONTENT = "AllActionContent";
    public static final String IS_YOGA = "IS_YOGA";
    public static final String TRAINING_ACTION_INDEX = "TrainingActionIndex";
    public static final String TRAINING_COSTTIME = "TrainingCostTime";
    public static final String TRAINING_ID = "TRAINING_ID";
    private RelativeLayout a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextureView e;
    private View f;
    private TextLinkAdView g;
    private SimpleExoPlayer h;
    private TrainingVideoPlayBackUtils i;
    private ArrayList<ActionContent> j;
    private int k;
    private long l;
    private long m;
    private boolean n;
    private BroadcastReceiver o = new f();
    public TrainingPlayActivity trainingPlayActivity;

    public class a implements Observer<Bitmap> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
            return true;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            if (bitmap != null) {
                TrainingPauseFragment.this.b.setImageBitmap(bitmap);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            TrainingPauseFragment.this.a.setOnTouchListener(new View.OnTouchListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.train.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return TrainingPauseFragment.a.b(view, motionEvent);
                }
            });
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class b implements Action1<Emitter<Bitmap>> {
        public final /* synthetic */ TrainingPauseFragment a;
        public final /* synthetic */ ILoadBlurBitmap b;

        public b(TrainingPauseFragment trainingPauseFragment, ILoadBlurBitmap iLoadBlurBitmap) {
            this.a = trainingPauseFragment;
            this.b = iLoadBlurBitmap;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Emitter<Bitmap> emitter) {
            if (this.a.getActivity() == null || !(this.a.getActivity() instanceof TrainingPlayActivity)) {
                emitter.onCompleted();
            } else {
                emitter.onNext(this.b.load((TrainingPlayActivity) this.a.getActivity()));
                emitter.onCompleted();
            }
        }
    }

    public class c implements AdLoadListener<TextLinkEntity> {
        public c() {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(String str, TextLinkEntity textLinkEntity) {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TextLinkEntity textLinkEntity) {
            TrainingAdManager.getInstance().markHasShownAdToday(TrainingPauseFragment.this.l, 2);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_PAUSE_PROMOTION_VIEWNUM).addExtra("id", String.valueOf(textLinkEntity.id)).addExtra("name", textLinkEntity.summary));
            AdRepository.getInstance().requestMonitor(textLinkEntity.adMonitor, textLinkEntity.id, true);
        }

        @Override // com.huami.ad.AdLoadListener
        public void onLoading() {
        }
    }

    public class d implements AdLoadListener<TextLinkEntity> {
        public d() {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(String str, TextLinkEntity textLinkEntity) {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TextLinkEntity textLinkEntity) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_PAUSE_PROMOTION_VIEWNUM).addExtra("id", String.valueOf(textLinkEntity.id)).addExtra("name", textLinkEntity.summary));
            AdRepository.getInstance().requestMonitor(textLinkEntity.adMonitor, textLinkEntity.id, true);
        }

        @Override // com.huami.ad.AdLoadListener
        public void onLoading() {
        }
    }

    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            TrainingPauseFragment.this.g.setY((((TrainingPauseFragment.this.f.getTop() - TrainingPauseFragment.this.e.getBottom()) / 2) - (TrainingPauseFragment.this.g.getHeight() / 2)) + TrainingPauseFragment.this.e.getBottom());
            TrainingPauseFragment.this.g.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION) && TrainingPauseFragment.this.n && !NetUtil.isNetworkConnected(context)) {
                IconToast.showError(context, R.string.net_not_work);
            }
        }
    }

    private void j() {
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(requireContext()).build();
        this.h = simpleExoPlayerBuild;
        simpleExoPlayerBuild.setVideoTextureView(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_PAUSE_OPERAT, "MovementDetail");
        ActionDetailActivity.startActionDetailActivity(this.trainingPlayActivity, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_PAUSE_OPERAT, "Resume");
        this.trainingPlayActivity.dismissPause();
    }

    private void m() {
        Bundle arguments = getArguments();
        this.l = arguments.getLong("TRAINING_ID", 0L);
        this.j = (ArrayList) arguments.getSerializable("AllActionContent");
        this.k = arguments.getInt("TrainingActionIndex", 0);
        this.m = arguments.getLong(TRAINING_COSTTIME, -1L);
        this.n = arguments.getBoolean(IS_YOGA, false);
    }

    private void n() {
        if (this.n) {
            return;
        }
        ActionContent actionContent = this.j.get(this.k);
        this.d.setText(String.format(Locale.getDefault(), "%s%s", actionContent.actionVideo.name, getString(R.string.training_action_essential)));
        List<ActionVideo> list = actionContent.videos;
        if (list != null && list.size() > 0) {
            actionContent.actionVideo = list.get(0);
            if (list.size() == 2 && actionContent.actionVideo.gender.intValue() != TrainerInfo.get().gender) {
                actionContent.actionVideo = list.get(1);
            }
        }
        Context context = getContext();
        ActionVideo actionVideo = actionContent.actionVideo;
        TrainingVideoPlayBackUtils trainingVideoPlayBackUtils = new TrainingVideoPlayBackUtils(context, actionVideo.url, actionVideo.size.longValue(), this.h);
        this.i = trainingVideoPlayBackUtils;
        trainingVideoPlayBackUtils.prepareVideoRes();
        this.i.startPlayback();
    }

    public static TrainingPauseFragment newInstanceForSingleTraining(long j, ArrayList<ActionContent> arrayList, long j2, int i) {
        TrainingPauseFragment trainingPauseFragment = new TrainingPauseFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(IS_YOGA, false);
        bundle.putSerializable("AllActionContent", arrayList);
        bundle.putInt("TrainingActionIndex", i);
        bundle.putLong(TRAINING_COSTTIME, j2);
        bundle.putLong("TRAINING_ID", j);
        trainingPauseFragment.setArguments(bundle);
        return trainingPauseFragment;
    }

    public static TrainingPauseFragment newInstanceForYoga(long j, long j2) {
        TrainingPauseFragment trainingPauseFragment = new TrainingPauseFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(IS_YOGA, true);
        bundle.putLong(TRAINING_COSTTIME, j2);
        bundle.putLong("TRAINING_ID", j);
        trainingPauseFragment.setArguments(bundle);
        return trainingPauseFragment;
    }

    private void o(ILoadBlurBitmap iLoadBlurBitmap) {
        Observable.create(new b(this, iLoadBlurBitmap), Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    private void p() {
        this.g.setVisibility(0);
        TextLinkEntity entity = (TrainingAdManager.getInstance().needShowAdToday(this.l, 2) ? new AdRequest(1, 0) : new AdRequest(2, 0)).getEntity(new c(), new d());
        if (entity != null) {
            this.g.loadAd(entity.hasBadge(), entity.isAd(), entity.summary, entity.mode, entity.target);
        }
        this.g.getViewTreeObserver().addOnPreDrawListener(new e());
    }

    private void q() {
        long j = this.m;
        if (j < 0) {
            this.c.setVisibility(8);
        } else if (j < 60000) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            this.c.setText(getResources().getQuantityString(R.plurals.training_consume_time_sec, seconds, Integer.valueOf(seconds)));
        } else {
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
            this.c.setText(getResources().getQuantityString(R.plurals.training_consume_time_min, minutes, Integer.valueOf(minutes)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        n();
        setBlurBg();
        q();
        p();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.trainingPlayActivity = (TrainingPlayActivity) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_training_pause, viewGroup, false);
        this.a = (RelativeLayout) viewInflate.findViewById(R.id.training_pause_root);
        this.b = (ImageView) viewInflate.findViewById(R.id.training_gauss_blur_bg);
        this.c = (TextView) viewInflate.findViewById(R.id.training_cost_time);
        this.d = (TextView) viewInflate.findViewById(R.id.training_action_name);
        this.g = (TextLinkAdView) viewInflate.findViewById(R.id.ad_text);
        TextureView textureView = (TextureView) viewInflate.findViewById(R.id.training_thumbnail);
        this.e = textureView;
        textureView.setOnClickListener(new View.OnClickListener() { // from class: jx7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        View viewFindViewById = viewInflate.findViewById(R.id.training_resume);
        this.f = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ix7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        if (this.n) {
            this.e.setVisibility(8);
            this.d.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.removeRule(12);
            layoutParams.addRule(13);
            this.f.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = (int) ViewUtils.dp2px(getContext(), 20.0f);
            this.g.setLayoutParams(layoutParams2);
        } else {
            j();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        TrainingVideoPlayBackUtils trainingVideoPlayBackUtils = this.i;
        if (trainingVideoPlayBackUtils != null) {
            trainingVideoPlayBackUtils.stopPlayback();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SimpleExoPlayer simpleExoPlayer = this.h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getActivity().registerReceiver(this.o, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getActivity().unregisterReceiver(this.o);
    }

    public void setBlurBg() {
        if (this.n) {
            o(new YogaLoadBitmap());
        } else {
            o(new OtherLoadBitmap());
        }
    }
}
