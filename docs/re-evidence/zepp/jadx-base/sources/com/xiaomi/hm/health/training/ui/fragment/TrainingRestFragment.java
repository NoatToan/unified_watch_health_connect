package com.xiaomi.hm.health.training.ui.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
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
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.baseui.TextLinkAdView;
import com.xiaomi.hm.health.baseutil.BlurBitmapUtil;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.TrainingRest;
import com.xiaomi.hm.health.training.ui.activity.ActionDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.ui.fragment.TrainingRestFragment;
import com.xiaomi.hm.health.training.ui.widget.TrainingPauseView;
import com.xiaomi.hm.health.training.utils.TrainingVideoPlayBackUtils;
import com.xiaomi.hm.health.traininglib.ad.TrainingAdManager;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingRestFragment extends Fragment {
    public static final String ALL_ACTION_CONTENT = "AllActionContent";
    public static final String REST_DURATION = "restDuration";
    public static final String TRAINING_ACTION_INDEX = "TrainingActionIndex";
    public static final String TRAINING_ID = "TRAINING_ID";
    private RelativeLayout a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextureView e;
    private TrainingPauseView f;
    private TextLinkAdView g;
    private TrainingPlayActivity h;
    private SimpleExoPlayer i;
    private TrainingVideoPlayBackUtils j;
    private ArrayList<ActionContent> k;
    private int l;
    private long m;

    public class a implements AdLoadListener<TextLinkEntity> {
        public a() {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(String str, TextLinkEntity textLinkEntity) {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TextLinkEntity textLinkEntity) {
            TrainingAdManager.getInstance().markHasShownAdToday(TrainingRestFragment.this.m, 3);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_BREAK_PROMOTION_VIEWNUM).addExtra("id", String.valueOf(textLinkEntity.id)).addExtra("name", textLinkEntity.summary));
            AdRepository.getInstance().requestMonitor(textLinkEntity.adMonitor, textLinkEntity.id, true);
        }

        @Override // com.huami.ad.AdLoadListener
        public void onLoading() {
        }
    }

    public class b implements AdLoadListener<TextLinkEntity> {
        public b() {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(String str, TextLinkEntity textLinkEntity) {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TextLinkEntity textLinkEntity) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_BREAK_PROMOTION_VIEWNUM).addExtra("id", String.valueOf(textLinkEntity.id)).addExtra("name", textLinkEntity.summary));
            AdRepository.getInstance().requestMonitor(textLinkEntity.adMonitor, textLinkEntity.id, true);
        }

        @Override // com.huami.ad.AdLoadListener
        public void onLoading() {
        }
    }

    public class c implements ViewTreeObserver.OnPreDrawListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            TrainingRestFragment.this.g.setY((((TrainingRestFragment.this.f.getTop() - TrainingRestFragment.this.e.getBottom()) / 2) - (TrainingRestFragment.this.g.getHeight() / 2)) + TrainingRestFragment.this.e.getBottom());
            TrainingRestFragment.this.g.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    private void h() {
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(requireContext()).build();
        this.i = simpleExoPlayerBuild;
        simpleExoPlayerBuild.setVideoTextureView(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_BREAK_OPERAT, TrainingAnalytics.ParamValue.TrainingBreakControl.SKIP);
        this.f.setInterrupted(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        TrainingAnalytics.event(getContext(), TrainingAnalytics.EventId.TRAINING_BREAK_OPERAT, "MovementDetail");
        ActionDetailActivity.startActionDetailActivityForResult(this.h, this.k, this.l);
    }

    public static TrainingRestFragment newInstance(long j, ArrayList<ActionContent> arrayList, long j2, int i) {
        TrainingRestFragment trainingRestFragment = new TrainingRestFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("AllActionContent", arrayList);
        bundle.putSerializable("TrainingActionIndex", Integer.valueOf(i));
        bundle.putLong(REST_DURATION, j2);
        bundle.putLong("TRAINING_ID", j);
        trainingRestFragment.setArguments(bundle);
        return trainingRestFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        this.m = arguments.getLong("TRAINING_ID", 0L);
        this.k = (ArrayList) arguments.getSerializable("AllActionContent");
        int i = arguments.getInt("TrainingActionIndex", 0);
        this.l = i;
        ActionContent actionContent = this.k.get(i);
        long j = arguments.getLong(REST_DURATION, -1L);
        this.a.setOnTouchListener(new View.OnTouchListener() { // from class: rx7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TrainingRestFragment.i(view, motionEvent);
            }
        });
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.h.guassBlurFilePath, options);
        if (bitmapDecodeFile != null) {
            this.b.setImageBitmap(BlurBitmapUtil.blurBitmap(getActivity(), bitmapDecodeFile));
        }
        if (j < 0) {
            this.c.setVisibility(8);
        } else {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            this.c.setText(getResources().getQuantityString(R.plurals.training_rest_interval_time, seconds, Integer.valueOf(seconds)));
        }
        this.d.setText(getString(R.string.training_rest_next_action) + actionContent.actionVideo.name);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: px7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        this.f.setPauseTotalTime(j >= 0 ? j : 0L);
        this.f.startRestCountdown();
        Context context = getContext();
        ActionVideo actionVideo = actionContent.actionVideo;
        TrainingVideoPlayBackUtils trainingVideoPlayBackUtils = new TrainingVideoPlayBackUtils(context, actionVideo.url, actionVideo.size.longValue(), this.i);
        this.j = trainingVideoPlayBackUtils;
        trainingVideoPlayBackUtils.prepareVideoRes();
        this.j.startPlayback();
        this.g.setVisibility(0);
        TextLinkEntity entity = (TrainingAdManager.getInstance().needShowAdToday(this.m, 3) ? new AdRequest(3, 0) : new AdRequest(4, 0)).getEntity(new a(), new b());
        if (entity != null) {
            this.g.loadAd(entity.hasBadge(), entity.isAd(), entity.summary, entity.mode, entity.target);
        }
        this.g.getViewTreeObserver().addOnPreDrawListener(new c());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_training_rest, viewGroup, false);
        this.h = (TrainingPlayActivity) getActivity();
        this.a = (RelativeLayout) viewInflate.findViewById(R.id.training_rest_root);
        this.b = (ImageView) viewInflate.findViewById(R.id.training_gauss_blur_bg);
        this.c = (TextView) viewInflate.findViewById(R.id.training_rest_time);
        this.d = (TextView) viewInflate.findViewById(R.id.training_action_name);
        this.e = (TextureView) viewInflate.findViewById(R.id.training_thumbnail);
        this.g = (TextLinkAdView) viewInflate.findViewById(R.id.ad_text);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: qx7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        TrainingPauseView trainingPauseView = (TrainingPauseView) viewInflate.findViewById(R.id.training_resume);
        this.f = trainingPauseView;
        trainingPauseView.setPauseType(1);
        EventBus.getDefault().register(this);
        h();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        this.j.stopPlayback();
    }

    public void onEventMainThread(TrainingRest trainingRest) {
        if (trainingRest.getCurrentRemainRestTime() == -1) {
            this.h.dismissRest();
        } else {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(trainingRest.getCurrentRemainRestTime());
            this.c.setText(getResources().getQuantityString(R.plurals.training_rest_interval_time, seconds, Integer.valueOf(seconds)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.i.setPlayWhenReady(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.i.setPlayWhenReady(true);
    }

    public void restPause() {
        TrainingPauseView trainingPauseView = this.f;
        if (trainingPauseView != null) {
            trainingPauseView.pause();
        }
    }

    public void restResume() {
        TrainingPauseView trainingPauseView = this.f;
        if (trainingPauseView != null) {
            trainingPauseView.resume();
        }
    }
}
