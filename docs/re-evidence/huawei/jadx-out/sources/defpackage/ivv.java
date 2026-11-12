package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes10.dex */
public class ivv {
    public static void a(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: ivv.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    LogUtil.j("Track_TrackJumpUtils", "gotoTrackDetail data is null");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("Track_TrackJumpUtils", "onResult !(data instanceof SparseArray)");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("Track_TrackJumpUtils", "gotoTrackDetail map size is 0");
                    return;
                }
                Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                if (njy.b(obj2, HiHealthData.class)) {
                    List list = (List) obj2;
                    if (njy.e(list)) {
                        LogUtil.j("Track_TrackJumpUtils", "gotoTrackDetail list is null");
                        return;
                    }
                    HiHealthData hiHealthData = (HiHealthData) list.get(0);
                    if (hiHealthData == null) {
                        LogUtil.j("Track_TrackJumpUtils", "gotoTrackDetail hiHealthData is null");
                        return;
                    }
                    MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
                    String strB = ntv.b(hiHealthData, motionPathSimplify);
                    ivv.a(motionPathSimplify, hiHealthData);
                    ive.c().init(BaseApplication.b());
                    if (motionPathSimplify.requestSportType() != 512) {
                        ive.c().b(strB, motionPathSimplify);
                    } else {
                        ive.c().b(strB, motionPathSimplify, ivv.a(motionPathSimplify));
                    }
                }
            }
        });
    }

    public static void c(long j, long j2, int i, int[] iArr) {
        LogUtil.a("Track_TrackJumpUtils", "startTime: ", Long.valueOf(j), ", endTime", Long.valueOf(j2), ", bigSportType", Integer.valueOf(i), ", subDataTypes", Arrays.toString(iArr));
        if (i == -1 || iArr == null) {
            ReleaseLogUtil.a("Track_TrackJumpUtils", "bigSportType or subDataTypes is not set");
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(0);
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).b(i).b();
        LogUtil.a("Track_TrackJumpUtils", "gotoMergeTrackDetail proOption: ", qqt.b(hiDataReadProOptionB));
        HiHealthManager.d(BaseApplication.b()).fetchSequenceDataProBySportType(hiDataReadProOptionB, new HiDataReadResultListener() { // from class: ivv.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                ivv.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_TrackJumpUtils", "gotoMergeTrackDetail data is null");
            return;
        }
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Track_TrackJumpUtils", "onResult !(data instanceof SparseArray)");
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0 || !(sparseArray.valueAt(0) instanceof List)) {
            LogUtil.j("Track_TrackJumpUtils", "gotoMergeTrackDetail map size is 0");
            return;
        }
        List list = (List) sparseArray.valueAt(0);
        if (njy.e(list) || !(list.get(0) instanceof HiHealthData)) {
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData == null) {
            LogUtil.j("Track_TrackJumpUtils", "gotoMergeTrackDetail hiHealthData is null");
            return;
        }
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        ntv.a(hiHealthData, motionPathSimplify);
        a(motionPathSimplify, hiHealthData);
        LogUtil.a("Track_TrackJumpUtils", "gotoMergeTrackDetail is success!");
        ive.c().init(BaseApplication.b());
        if (motionPathSimplify.requestTrackType() == 8) {
            List<jbv> listC = c(motionPathSimplify);
            listC.sort(Comparator.comparingLong(new ToLongFunction() { // from class: ivt
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj2) {
                    return ((jbv) obj2).b().requestStartTime();
                }
            }));
            Bundle bundle = new Bundle();
            bundle.putSerializable("simplifyDatakey", motionPathSimplify);
            bundle.putSerializable("subTrackDetail", (Serializable) listC);
            ive.c().b(bundle, motionPathSimplify);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(MotionPathSimplify motionPathSimplify, HiHealthData hiHealthData) {
        motionPathSimplify.saveDeviceType(hiHealthData.getInt("trackdata_deviceType"));
        motionPathSimplify.saveProductId(hiHealthData.getString("device_prodid"));
        motionPathSimplify.saveSubProductId(hiHealthData.getString("device_subprodid"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<jbv> a(MotionPathSimplify motionPathSimplify) {
        List<RelativeSportData> listRequestChildSportItems = motionPathSimplify.requestChildSportItems();
        ArrayList arrayList = new ArrayList(3);
        if (njy.e(listRequestChildSportItems) || listRequestChildSportItems.size() > 3) {
            ReleaseLogUtil.a("Track_TrackJumpUtils", "childSportItems is ", listRequestChildSportItems == null ? null : Integer.valueOf(listRequestChildSportItems.size()));
            return arrayList;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(listRequestChildSportItems.size());
        for (int i = 0; i < listRequestChildSportItems.size(); i++) {
            RelativeSportData relativeSportData = listRequestChildSportItems.get(i);
            if (relativeSportData == null) {
                countDownLatch.countDown();
            } else {
                final jbv jbvVar = new jbv();
                arrayList.add(jbvVar);
                LogUtil.a("Track_TrackJumpUtils", BleConstants.SPORT_TYPE, Integer.valueOf(relativeSportData.getSportType()), "HasDetailInfo", Boolean.valueOf(relativeSportData.isHasDetailInfo()));
                jbvVar.d(relativeSportData);
                if (!listRequestChildSportItems.get(i).isHasDetailInfo()) {
                    countDownLatch.countDown();
                } else {
                    jxh.a(relativeSportData.getStartTime(), relativeSportData.getEndTime(), new IBaseResponseCallback() { // from class: iwb
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i2, Object obj) {
                            ivv.a(countDownLatch, jbvVar, i2, obj);
                        }
                    });
                }
            }
        }
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
            return arrayList;
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("Track_TrackJumpUtils", "interrupted while waiting for requestData");
            return arrayList;
        }
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, jbv jbvVar, int i, Object obj) {
        LogUtil.a("Track_TrackJumpUtils", "onResponse ", Integer.valueOf(i));
        if (!(obj instanceof njd)) {
            LogUtil.j("Track_TrackJumpUtils", "objData is not instance of HWHealthDataManager.PathData");
            countDownLatch.countDown();
        } else {
            njd njdVar = (njd) obj;
            jbvVar.e(njdVar.b());
            jbvVar.a(njdVar.c());
            countDownLatch.countDown();
        }
    }

    public static List<jbv> c(MotionPathSimplify motionPathSimplify) {
        List<RelativeSportData> listRequestChildSportItems = motionPathSimplify.requestChildSportItems();
        final ArrayList arrayList = new ArrayList(10);
        if (njy.e(listRequestChildSportItems)) {
            ReleaseLogUtil.a("Track_TrackJumpUtils", "childSportItems is ", listRequestChildSportItems == null ? null : Integer.valueOf(listRequestChildSportItems.size()));
            return arrayList;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(listRequestChildSportItems.size());
        for (int i = 0; i < listRequestChildSportItems.size(); i++) {
            final RelativeSportData relativeSportData = listRequestChildSportItems.get(i);
            if (relativeSportData == null) {
                countDownLatch.countDown();
            } else {
                jxh.a(relativeSportData.getStartTime(), relativeSportData.getEndTime(), new IBaseResponseCallback() { // from class: ivy
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        ivv.c(countDownLatch, relativeSportData, arrayList, i2, obj);
                    }
                });
            }
        }
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
            return arrayList;
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("Track_TrackJumpUtils", "interrupted while waiting for request track data");
            return arrayList;
        }
    }

    static /* synthetic */ void c(CountDownLatch countDownLatch, RelativeSportData relativeSportData, List list, int i, Object obj) {
        LogUtil.a("Track_TrackJumpUtils", "getMergeTrackChildDetail onResponse ", Integer.valueOf(i));
        if (!(obj instanceof njd)) {
            countDownLatch.countDown();
            LogUtil.j("Track_TrackJumpUtils", "getMergeTrackChildDetail object is not instance of MotionPathData");
            return;
        }
        njd njdVar = (njd) obj;
        String strB = njdVar.b();
        MotionPathSimplify motionPathSimplifyC = njdVar.c();
        new jbv().d(relativeSportData);
        jbv jbvVar = new jbv();
        jbvVar.e(strB);
        jbvVar.a(motionPathSimplifyC);
        list.add(jbvVar);
        countDownLatch.countDown();
    }

    public static void a() {
        ive.c().init(BaseApplication.b());
        ive.c().x();
    }

    public static void d(Context context, int i, long j, long j2) {
        if (qrs.c(2000)) {
            LogUtil.a("Track_TrackJumpUtils", "isClickFast");
        } else if (i != 0) {
            e(context, i);
        } else {
            a(j, j2);
        }
    }

    public static void e(Context context, int i) {
        if (!(context instanceof Activity)) {
            ReleaseLogUtil.e("Track_TrackJumpUtils", "gotoFitnessResultActivity context error");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.e("Track_TrackJumpUtils", "gotoFitnessResultActivity courseApi == null");
            return;
        }
        WorkoutRecord workoutRecordAcquireWorkoutRecordByRecordId = courseApi.acquireWorkoutRecordByRecordId(i);
        if (workoutRecordAcquireWorkoutRecordByRecordId == null) {
            ReleaseLogUtil.e("Track_TrackJumpUtils", "gotoFitnessResultActivity record == null");
            return;
        }
        if (workoutRecordAcquireWorkoutRecordByRecordId.getRecordModeType() == 1 && workoutRecordAcquireWorkoutRecordByRecordId.acquireWearType() != 3) {
            String json = new Gson().toJson(workoutRecordAcquireWorkoutRecordByRecordId);
            LogUtil.a("Track_TrackJumpUtils", "jumpTo H5 AI_FITNESS_COURSE");
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addCustomizeArg("workoutRecord", json);
            builder.addPath("#/resultRecord?pullFrom=1");
            builder.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL));
            builder.enableImageCache();
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.ai-fitness-course", builder);
            return;
        }
        if (workoutRecordAcquireWorkoutRecordByRecordId.getRecordModeType() == 2) {
            LogUtil.a("Track_TrackJumpUtils", "jump to singleActionResultRecord");
            H5ProLaunchOption.Builder builder2 = new H5ProLaunchOption.Builder();
            builder2.addCustomizeArg("workoutRecord", new Gson().toJson(workoutRecordAcquireWorkoutRecordByRecordId));
            builder2.addPath("#/SingleActionResultRecord?pullFrom=1");
            builder2.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL));
            builder2.enableImageCache();
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.ai-fitness-course", builder2);
            return;
        }
        if (workoutRecordAcquireWorkoutRecordByRecordId.acquireWearType() == 3) {
            HashMap map = new HashMap(1);
            map.put("click", 1);
            lmf.d().c(context, AnalyticsValue.HEALTH_FITNESS_LOOK_TV_RECORD_2040086.value(), map, 0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("entrance", 1);
        bundle.putParcelable("workout_record", workoutRecordAcquireWorkoutRecordByRecordId);
        AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(bundle).b(context);
    }
}
