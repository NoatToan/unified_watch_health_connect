package com.xiaomi.hm.health.training.ui.activity.trainplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.fragment.app.FragmentManager;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.PlayState;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.ActionVideoPlayCommon;
import com.xiaomi.hm.health.training.ui.activity.trainplay.impl.OldTrainPlayView;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.training.ui.fragment.TrainingRestFragment;
import com.xiaomi.hm.health.training.ui.fragment.train.BlurBitmapCache;
import com.xiaomi.hm.health.training.ui.fragment.train.TrainingPauseFragment;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingKeeper;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingPlayActivity extends BaseFragmentActivity {
    public static final String TRAINING_COURSE_ITEM = "trainingCourseItem";
    public static final String TRAINING_DETAIL = "TrainingFullData";
    public static final String TRAINING_GAUSS_BLUR_BG_PIC = "training_gauss_blur_bg.jpg";
    public static final String TRAINING_PLAN_ID = "TrainingPlanId";
    public static final String TRAINING_RECORD = "TrainingRecord";
    public static final int TRAINING_REST_REQUEST_CODE = 3;
    private static final String e = "TrainingPlayActivity";
    private ITrainPlayView d;
    public String guassBlurFilePath;
    public TrainingPauseFragment pauseFragment;
    public TrainingPlayingFragment playingFragment;
    public TrainingRestFragment restFragment;
    public TrainingDetail trainingDetail;
    public boolean isBackGround = false;
    public PlayState playState = PlayState.PLAYING;
    private c a = new c();
    private d b = new d();
    private b c = new b();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PlayState.values().length];
            a = iArr;
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PlayState.REST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!intent.getAction().equals(AndroidManufacturerUtils.getAlarmAlertBroadcast())) {
                if (a.a[TrainingPlayActivity.this.playState.ordinal()] != 2) {
                    return;
                }
                TrainingPlayActivity.this.restFragment.restResume();
                return;
            }
            int i = a.a[TrainingPlayActivity.this.playState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                TrainingPlayActivity.this.restFragment.restPause();
            } else {
                TrainingPlayActivity.this.playingFragment.pauseVideo();
                TrainingPlayActivity trainingPlayActivity = TrainingPlayActivity.this;
                ArrayList<ActionContent> arrayList = (ArrayList) trainingPlayActivity.trainingDetail.content;
                TrainingPlayingFragment trainingPlayingFragment = trainingPlayActivity.playingFragment;
                trainingPlayActivity.showPause(arrayList, trainingPlayingFragment.trainingCostTimer, trainingPlayingFragment.finishedIndex);
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                TrainingPlayActivity trainingPlayActivity = TrainingPlayActivity.this;
                if (trainingPlayActivity.playState == PlayState.PLAYING) {
                    trainingPlayActivity.playingFragment.pauseVideo();
                    TrainingPlayActivity.this.playingFragment.pauseBgm();
                    TrainingPlayActivity trainingPlayActivity2 = TrainingPlayActivity.this;
                    ArrayList<ActionContent> arrayList = (ArrayList) trainingPlayActivity2.trainingDetail.content;
                    TrainingPlayingFragment trainingPlayingFragment = trainingPlayActivity2.playingFragment;
                    trainingPlayActivity2.showPause(arrayList, trainingPlayingFragment.trainingCostTimer, trainingPlayingFragment.finishedIndex);
                }
            }
        }
    }

    public class d extends BroadcastReceiver {

        public class a extends PhoneStateListener {
            public a() {
            }

            @Override // android.telephony.PhoneStateListener
            public void onCallStateChanged(int i, String str) {
                super.onCallStateChanged(i, str);
                if (i == 0) {
                    if (a.a[TrainingPlayActivity.this.playState.ordinal()] != 2) {
                        return;
                    }
                    TrainingPlayActivity.this.restFragment.restResume();
                    return;
                }
                if (i != 1) {
                    return;
                }
                int i2 = a.a[TrainingPlayActivity.this.playState.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    TrainingPlayActivity.this.restFragment.restPause();
                    return;
                }
                TrainingPlayingFragment trainingPlayingFragment = TrainingPlayActivity.this.playingFragment;
                if (trainingPlayingFragment != null) {
                    trainingPlayingFragment.pauseVideo();
                    TrainingPlayActivity.this.playingFragment.pauseBgm();
                    if (!TrainingPlayActivity.this.playingFragment.isYoga()) {
                        TrainingPlayActivity trainingPlayActivity = TrainingPlayActivity.this;
                        List<ActionContent> list = trainingPlayActivity.trainingDetail.content;
                        if (list != null && trainingPlayActivity.playingFragment.finishedIndex < list.size()) {
                            TrainingPlayActivity trainingPlayActivity2 = TrainingPlayActivity.this;
                            ActionContent actionContent = trainingPlayActivity2.trainingDetail.content.get(trainingPlayActivity2.playingFragment.finishedIndex);
                            List<ActionVideo> list2 = actionContent.videos;
                            if (list2 != null && list2.size() > 0) {
                                actionContent.actionVideo = list2.get(0);
                                if (list2.size() == 2 && actionContent.actionVideo.gender.intValue() != TrainingPlayActivity.this.playingFragment.trainer.gender) {
                                    actionContent.actionVideo = list2.get(1);
                                }
                            }
                        }
                    }
                    TrainingPlayActivity trainingPlayActivity3 = TrainingPlayActivity.this;
                    ArrayList<ActionContent> arrayList = (ArrayList) trainingPlayActivity3.trainingDetail.content;
                    TrainingPlayingFragment trainingPlayingFragment2 = trainingPlayActivity3.playingFragment;
                    trainingPlayActivity3.showPause(arrayList, trainingPlayingFragment2.trainingCostTimer, trainingPlayingFragment2.finishedIndex);
                }
            }
        }

        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TelephonyManager telephonyManager;
            try {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
            } catch (Exception e) {
                e.printStackTrace();
                telephonyManager = null;
            }
            if (telephonyManager == null) {
                return;
            }
            telephonyManager.listen(new a(), 32);
        }
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AndroidManufacturerUtils.getAlarmAlertBroadcast());
        intentFilter.addAction(AndroidManufacturerUtils.getAlarmDoneBroadcast());
        registerReceiver(this.c, intentFilter);
    }

    private void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        registerReceiver(this.a, intentFilter);
    }

    private void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(this.b, intentFilter);
    }

    private void initView() {
        long longExtra;
        TrainingCourseItem trainingCourseItemQueryTrainingCourseItem;
        Intent intent = getIntent();
        TrainingRecord trainingRecord = (TrainingRecord) intent.getSerializableExtra(TRAINING_RECORD);
        if (trainingRecord == null || trainingRecord.startTime.longValue() <= 0) {
            longExtra = intent.getLongExtra(TRAINING_PLAN_ID, 0L);
            this.trainingDetail = (TrainingDetail) intent.getSerializableExtra(TRAINING_DETAIL);
            trainingCourseItemQueryTrainingCourseItem = (TrainingCourseItem) intent.getSerializableExtra(TRAINING_COURSE_ITEM);
        } else {
            longExtra = trainingRecord.trainingPlanId.longValue();
            this.trainingDetail = TrainingDBUtils.queryTrainingDetail(trainingRecord.getTrainingId().longValue());
            trainingCourseItemQueryTrainingCourseItem = TrainingDBUtils.queryTrainingCourseItem(trainingRecord.getTrainingId().longValue());
        }
        this.guassBlurFilePath = FileUtils.getTrainingGaussBlurPath(TRAINING_GAUSS_BLUR_BG_PIC);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String str = TrainingPlayingFragment.TAG;
        TrainingPlayingFragment trainingPlayingFragment = (TrainingPlayingFragment) supportFragmentManager.findFragmentByTag(str);
        this.playingFragment = trainingPlayingFragment;
        if (trainingPlayingFragment == null) {
            this.playingFragment = new TrainingPlayingFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(TRAINING_RECORD, trainingRecord);
            bundle.putSerializable(TRAINING_DETAIL, this.trainingDetail);
            bundle.putSerializable(TRAINING_COURSE_ITEM, trainingCourseItemQueryTrainingCourseItem);
            bundle.putLong(TRAINING_PLAN_ID, longExtra);
            this.playingFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.root_view, this.playingFragment, str).commitAllowingStateLoss();
        }
        d();
        e();
        c();
        this.d = new OldTrainPlayView();
    }

    public static boolean startTrainingPlayActivity(Context context, TrainingDetail trainingDetail, long j, TrainingCourseItem trainingCourseItem, TrainingRecord trainingRecord) {
        List<ActionContent> list;
        boolean zEquals = trainingDetail != null ? "YOGA".equals(trainingDetail.trainingType) : trainingRecord != null ? "YOGA".equals(trainingRecord.trainingType) : false;
        if (!zEquals && (list = trainingDetail.content) != null && list.size() > 0) {
            for (ActionContent actionContent : list) {
                if (ParseJsonUtil.getLongByGender(actionContent.duration, ActionVideoPlayCommon.getTrainer()) == 0 || ParseJsonUtil.getLongByGender(actionContent.duration, ActionVideoPlayCommon.getTrainer()) == 1) {
                    List<ActionVideo> list2 = actionContent.videos;
                    if (list2 != null && list2.size() > 0 && actionContent.videos.get(0).getTime().intValue() > 0) {
                        String strValueOf = String.valueOf(actionContent.videos.get(0).getTime());
                        ParseJsonUtil.DivisionGender divisionGender = new ParseJsonUtil.DivisionGender();
                        divisionGender.female = strValueOf;
                        divisionGender.male = strValueOf;
                        actionContent.setDuration(ParseJsonUtil.divisionGenderToJson(divisionGender));
                    }
                }
            }
        }
        if (zEquals) {
            if (!NetUtil.isNetworkConnected(context)) {
                IconToast.showError(context, R.string.net_not_work);
                return false;
            }
        } else if (!MediaFileUtils.trainingCanPlay(trainingDetail)) {
            IconToast.showError(context, R.string.can_not_play_video);
            return false;
        }
        TrainingAnalytics.event(context, TrainingAnalytics.EventId.TRAININGCOURSES_OUT, "Start");
        if (trainingCourseItem != null) {
            TrainingKeeper.putCache("lastTrainingCourseItemId", trainingCourseItem.id.toString());
        }
        Intent intent = new Intent(context, (Class<?>) TrainingPlayActivity.class);
        Bundle bundle = new Bundle();
        intent.addFlags(268435456);
        bundle.putSerializable(TRAINING_DETAIL, trainingDetail);
        bundle.putSerializable(TRAINING_COURSE_ITEM, trainingCourseItem);
        bundle.putLong(TRAINING_PLAN_ID, j);
        bundle.putSerializable(TRAINING_RECORD, trainingRecord);
        intent.putExtras(bundle);
        context.startActivity(intent);
        return true;
    }

    public void dismissPause() {
        this.d.dismissPause(this);
    }

    public void dismissRest() {
        this.d.dismissRest(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 3) {
            return;
        }
        this.restFragment.restResume();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TrainingPlayingFragment trainingPlayingFragment = this.playingFragment;
        if (trainingPlayingFragment != null) {
            trainingPlayingFragment.closeVideo();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        HMLog.d(e, "onCreate()", new Object[0]);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(128);
        super.onCreate(bundle);
        setContentView(R.layout.activity_training_play);
        setVolumeControlStream(3);
        initView();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BlurBitmapCache.getInstance().clear();
        super.onDestroy();
        HMLog.d(e, "onDestroy()", new Object[0]);
        getWindow().clearFlags(128);
        unregisterReceiver(this.a);
        unregisterReceiver(this.b);
        unregisterReceiver(this.c);
        this.playingFragment = null;
        this.pauseFragment = null;
        this.restFragment = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HMLog.d(e, "onResume()", new Object[0]);
        this.d.onResume(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        HMLog.d(e, "onStop()", new Object[0]);
        this.d.onStop(this);
    }

    public void showPause(ArrayList<ActionContent> arrayList, long j, int i) {
        this.d.showPause(this, arrayList, j, i);
    }

    public void showRest(ArrayList<ActionContent> arrayList, long j, int i) {
        this.d.showRest(this, arrayList, j, i);
    }
}
