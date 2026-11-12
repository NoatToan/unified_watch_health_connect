package com.xiaomi.hm.health.training.ui.activity.trainplay.impl;

import android.media.MediaPlayer;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.PlayState;
import com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.training.ui.fragment.TrainingRestFragment;
import com.xiaomi.hm.health.training.ui.fragment.train.TrainingPauseFragment;
import java.util.ArrayList;
import rx.Emitter;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class OldTrainPlayView implements ITrainPlayView {

    public class a implements Observer<Object> {
        public final /* synthetic */ TrainingPlayActivity a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ int d;

        public a(TrainingPlayActivity trainingPlayActivity, long j, ArrayList arrayList, int i) {
            this.a = trainingPlayActivity;
            this.b = j;
            this.c = arrayList;
            this.d = i;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.a.playingFragment.isYoga()) {
                TrainingPlayActivity trainingPlayActivity = this.a;
                trainingPlayActivity.pauseFragment = TrainingPauseFragment.newInstanceForYoga(trainingPlayActivity.trainingDetail.getTrainingId().longValue(), this.b);
            } else {
                TrainingPlayActivity trainingPlayActivity2 = this.a;
                trainingPlayActivity2.pauseFragment = TrainingPauseFragment.newInstanceForSingleTraining(trainingPlayActivity2.trainingDetail.getTrainingId().longValue(), this.c, this.b, this.d);
            }
            this.a.getSupportFragmentManager().beginTransaction().add(R.id.root_view, this.a.pauseFragment).commitAllowingStateLoss();
            TrainingPlayActivity trainingPlayActivity3 = this.a;
            trainingPlayActivity3.playState = PlayState.PAUSE;
            trainingPlayActivity3.playingFragment.pauseBgm();
            this.a.playingFragment.recordPauseStartTime();
            this.a.playingFragment.pauseHr();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    }

    public class b implements Action1<Emitter<Object>> {
        public final /* synthetic */ TrainingPlayActivity a;

        public b(TrainingPlayActivity trainingPlayActivity) {
            this.a = trainingPlayActivity;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Emitter<Object> emitter) {
            this.a.playingFragment.generateGaussBlur();
            emitter.onCompleted();
        }
    }

    public class c implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ TrainingPlayActivity a;

        public c(TrainingPlayActivity trainingPlayActivity) {
            this.a = trainingPlayActivity;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            this.a.playingFragment.startNext();
            this.a.playState = PlayState.PLAYING;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PlayState.values().length];
            a = iArr;
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PlayState.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PlayState.REST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView
    public void dismissPause(TrainingPlayActivity trainingPlayActivity) {
        if (trainingPlayActivity.playingFragment.isYoga()) {
            trainingPlayActivity.playingFragment.onlyShowPlayerView(false);
        }
        trainingPlayActivity.getSupportFragmentManager().beginTransaction().remove(trainingPlayActivity.pauseFragment).commitAllowingStateLoss();
        trainingPlayActivity.playingFragment.resumeVideo();
        trainingPlayActivity.playState = PlayState.PLAYING;
        trainingPlayActivity.playingFragment.resumeBgm();
        trainingPlayActivity.playingFragment.recordPauseEndTime();
        trainingPlayActivity.playingFragment.resumeHr();
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView
    public void dismissRest(TrainingPlayActivity trainingPlayActivity) {
        trainingPlayActivity.getSupportFragmentManager().beginTransaction().remove(trainingPlayActivity.restFragment).commitAllowingStateLoss();
        trainingPlayActivity.playingFragment.getSoundPool().play(105, new c(trainingPlayActivity));
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView
    public void onResume(TrainingPlayActivity trainingPlayActivity) {
        if (trainingPlayActivity.isBackGround) {
            int i = d.a[trainingPlayActivity.playState.ordinal()];
            if (i == 1) {
                trainingPlayActivity.playingFragment.resumeVideo();
                trainingPlayActivity.playingFragment.resumeBgm();
                trainingPlayActivity.playingFragment.recordPauseEndTime();
                trainingPlayActivity.playingFragment.resumeHr();
            } else if (i == 3) {
                trainingPlayActivity.restFragment.restResume();
                trainingPlayActivity.playingFragment.resumeBgm();
            }
            trainingPlayActivity.isBackGround = false;
        }
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView
    public void onStop(TrainingPlayActivity trainingPlayActivity) {
        int i = d.a[trainingPlayActivity.playState.ordinal()];
        if (i == 1) {
            trainingPlayActivity.playingFragment.pauseVideo();
            trainingPlayActivity.playingFragment.pauseBgm();
            if (!trainingPlayActivity.playingFragment.isFinished()) {
                ArrayList<ActionContent> arrayList = (ArrayList) trainingPlayActivity.trainingDetail.content;
                TrainingPlayingFragment trainingPlayingFragment = trainingPlayActivity.playingFragment;
                trainingPlayActivity.showPause(arrayList, trainingPlayingFragment.trainingCostTimer, trainingPlayingFragment.finishedIndex);
            }
            trainingPlayActivity.playingFragment.recordPauseStartTime();
            trainingPlayActivity.playingFragment.pauseHr();
        } else if (i == 3) {
            trainingPlayActivity.restFragment.restPause();
            trainingPlayActivity.playingFragment.pauseBgm();
        }
        trainingPlayActivity.isBackGround = true;
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView
    public void showPause(TrainingPlayActivity trainingPlayActivity, ArrayList<ActionContent> arrayList, long j, int i) {
        if (trainingPlayActivity.playingFragment.isYoga()) {
            trainingPlayActivity.playingFragment.onlyShowPlayerView(true);
        }
        Observable.create(new b(trainingPlayActivity), Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(trainingPlayActivity, j, arrayList, i));
    }

    @Override // com.xiaomi.hm.health.training.ui.activity.trainplay.ITrainPlayView
    public void showRest(TrainingPlayActivity trainingPlayActivity, ArrayList<ActionContent> arrayList, long j, int i) {
        trainingPlayActivity.playingFragment.getSoundPool().play(104);
        trainingPlayActivity.restFragment = TrainingRestFragment.newInstance(trainingPlayActivity.trainingDetail.getTrainingId().longValue(), arrayList, j, i);
        trainingPlayActivity.getSupportFragmentManager().beginTransaction().add(R.id.root_view, trainingPlayActivity.restFragment).commitAllowingStateLoss();
        trainingPlayActivity.playState = PlayState.REST;
    }
}
