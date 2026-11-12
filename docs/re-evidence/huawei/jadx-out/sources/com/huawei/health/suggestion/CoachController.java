package com.huawei.health.suggestion;

import android.os.Bundle;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle;
import com.huawei.health.suggestion.protobuf.CourseProto;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.iee;
import defpackage.njy;
import defpackage.nsp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class CoachController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CourseProto.CourseStorageInfo.Builder f8845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CourseStateProto.CourseState.Builder f8847c;
    private int d;
    private float e;
    private int f;
    private boolean g;
    private int h;
    private boolean i;
    private int j;
    private boolean k;
    private nsp l;
    private boolean m;
    private long n;
    private List<ISportDataCallback> o;
    private Map<StatusSource, List<CourseLinkageLifecycle>> s;

    public enum StatusSource {
        NEW_LINK_WEAR,
        APP
    }

    private CoachController() {
        this.s = new HashMap();
        this.o = new CopyOnWriteArrayList();
        this.k = false;
        this.g = false;
        this.i = false;
        this.d = 0;
        this.m = false;
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final CoachController f8848a = new CoachController();
    }

    public static final CoachController c() {
        return b.f8848a;
    }

    public void c(StatusSource statusSource, CourseLinkageLifecycle courseLinkageLifecycle) {
        List<CourseLinkageLifecycle> arrayList;
        if (statusSource == null) {
            LogUtil.e("Suggestion_CoachController", "source null.");
            return;
        }
        LogUtil.a("Suggestion_CoachController", "registerStatusCallback.", statusSource.toString());
        if (!this.s.containsKey(statusSource)) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = this.s.get(statusSource);
        }
        if (arrayList == null || arrayList.contains(courseLinkageLifecycle)) {
            return;
        }
        arrayList.add(courseLinkageLifecycle);
        this.s.put(statusSource, arrayList);
    }

    public void c(StatusSource statusSource) {
        if (statusSource == null) {
            LogUtil.e("Suggestion_CoachController", "source null.");
        } else {
            LogUtil.a("Suggestion_CoachController", "unregisterStatusCallback.", statusSource.toString());
            this.s.remove(statusSource);
        }
    }

    public void b(ISportDataCallback iSportDataCallback) {
        List<ISportDataCallback> list = this.o;
        if (list != null) {
            list.add(iSportDataCallback);
        }
    }

    public void e() {
        this.n = 0L;
        this.m = false;
        this.l = null;
        this.h = 0;
        this.e = 0.0f;
        this.f8846b = 0.0f;
        this.j = -1;
        this.d = 0;
        this.i = false;
        this.f8847c = null;
    }

    public boolean d(StatusSource statusSource, int i) {
        if (!this.k) {
            LogUtil.a("Suggestion_CoachController", "not support fitness link.");
            return false;
        }
        if (b(statusSource, i)) {
            return e(statusSource, true);
        }
        LogUtil.a("Suggestion_CoachController", "updateCoachState coachState:", Integer.valueOf(i), "mCoachState:", Integer.valueOf(this.d));
        int i2 = this.d;
        if (i == i2 || i2 == 3) {
            LogUtil.a("Suggestion_CoachController", "coach state is same.", Integer.valueOf(i2));
            return true;
        }
        if (i == 1) {
            if (i2 == 0) {
                return e(statusSource);
            }
            return d(statusSource);
        }
        if (i == 2) {
            return a(statusSource);
        }
        if (i == 3) {
            return b(statusSource);
        }
        LogUtil.a("Suggestion_CoachController", "getCoachState other condition");
        return false;
    }

    private boolean b(StatusSource statusSource, int i) {
        if (statusSource != StatusSource.APP || i != 1 || !h()) {
            return false;
        }
        int courseSleepTime = a().getCourseSleepTime();
        LogUtil.a("Suggestion_CoachController", "isSleepResumeState courseSleepTime:", Integer.valueOf(courseSleepTime));
        return courseSleepTime > 0;
    }

    public int b() {
        return this.d;
    }

    public boolean e(StatusSource statusSource) {
        if (statusSource == null) {
            LogUtil.e("Suggestion_CoachController", "source null.");
            return false;
        }
        ReleaseLogUtil.d("Suggestion_CoachController", "start coach.", statusSource.toString());
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "startCoach coachStateCallbacks null.");
            return false;
        }
        CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
        builderNewBuilder.setCurrentVolume(iee.c());
        builderNewBuilder.setCourseIndex(0);
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null && this.d != 1) {
                Bundle bundle = new Bundle();
                bundle.putLong("startSportTime", this.n);
                bundle.putSerializable("CourseStateProto", builderNewBuilder.build());
                CourseProto.CourseStorageInfo.Builder builder = this.f8845a;
                if (builder != null) {
                    bundle.putSerializable("CourseProto", builder.build());
                }
                courseLinkageLifecycle.start(this.f, bundle);
            }
        }
        this.d = 1;
        return true;
    }

    public boolean a(StatusSource statusSource) {
        if (statusSource == null) {
            LogUtil.e("Suggestion_CoachController", "source null.");
            return false;
        }
        ReleaseLogUtil.d("Suggestion_CoachController", "pause coach.", statusSource.toString());
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return false;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null && this.d != 2) {
                courseLinkageLifecycle.pause(this.f);
            }
        }
        this.d = 2;
        return true;
    }

    public boolean e(StatusSource statusSource, boolean z) {
        if (statusSource == null) {
            LogUtil.e("Suggestion_CoachController", "source null.");
            return false;
        }
        ReleaseLogUtil.d("Suggestion_CoachController", "resume coach.", statusSource.toString());
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return false;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null && (this.d != 1 || z)) {
                courseLinkageLifecycle.resume(this.f);
            }
        }
        this.d = 1;
        return true;
    }

    public boolean d(StatusSource statusSource) {
        return e(statusSource, false);
    }

    public boolean b(StatusSource statusSource) {
        if (statusSource == null) {
            LogUtil.e("Suggestion_CoachController", "source null.");
            return false;
        }
        ReleaseLogUtil.d("Suggestion_CoachController", "stop coach.", statusSource.toString());
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return false;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null && this.d != 3) {
                courseLinkageLifecycle.stop(this.f);
            }
        }
        this.d = 3;
        return true;
    }

    public void a(Bundle bundle) {
        if (bundle == null || njy.e(this.o)) {
            LogUtil.e("Suggestion_CoachController", "coachInfo null.");
            return;
        }
        for (ISportDataCallback iSportDataCallback : this.o) {
            if (iSportDataCallback != null) {
                iSportDataCallback.getSportInfo(bundle);
            }
        }
    }

    public void c(nsp nspVar) {
        this.l = nspVar;
    }

    public Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(BleConstants.SPORT_TYPE, this.f);
        bundle.putInt("sportState", i);
        bundle.putLong("sportStartTime", this.n);
        bundle.putInt("duration", this.h);
        bundle.putInt("calorie", (int) Math.floor(this.e));
        bundle.putInt(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, (int) Math.floor(this.f8846b));
        bundle.putInt("distance", 0);
        nsp nspVar = this.l;
        if (nspVar != null) {
            bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, nspVar.j());
            bundle.putInt("aerobicExercise", this.l.a());
            bundle.putInt("anaerobicExercise", this.l.d());
            bundle.putInt("performanceIndicator", this.l.l());
            return bundle;
        }
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, this.j);
        return bundle;
    }

    public boolean f() {
        return this.k;
    }

    public void d(boolean z) {
        this.k = z;
    }

    public void a(long j) {
        this.n = j;
    }

    public void e(int i) {
        this.f = i;
    }

    public void a(float f) {
        this.e = f;
    }

    public void d(float f) {
        this.f8846b = f;
    }

    public int d() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public boolean i() {
        return this.m;
    }

    public void c(boolean z) {
        this.m = z;
    }

    public void a(int i) {
        this.j = i;
    }

    public boolean g() {
        return this.i;
    }

    public void e(boolean z) {
        this.i = z;
    }

    public void c(StatusSource statusSource, int i) {
        ReleaseLogUtil.d("Suggestion_CoachController", "Chapter Forward.", statusSource.toString());
        CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
        builderNewBuilder.setCourseIndex(i);
        this.f8847c = builderNewBuilder;
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null) {
                courseLinkageLifecycle.chapterForward(builderNewBuilder.build());
            }
        }
    }

    public void e(StatusSource statusSource, int i) {
        ReleaseLogUtil.d("Suggestion_CoachController", "Chapter Backward.", statusSource.toString());
        CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
        builderNewBuilder.setCourseIndex(i);
        this.f8847c = builderNewBuilder;
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null) {
                courseLinkageLifecycle.chapterBackward(builderNewBuilder.build());
            }
        }
    }

    public void c(StatusSource statusSource, CourseStateProto.CourseState courseState) {
        ReleaseLogUtil.d("Suggestion_CoachController", "Inter Chapter Break.", statusSource.toString());
        this.f8847c = courseState.toBuilder();
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null) {
                courseLinkageLifecycle.chapterBreak(courseState);
            }
        }
    }

    public void e(StatusSource statusSource, CourseStateProto.CourseState.Builder builder) {
        ReleaseLogUtil.d("Suggestion_CoachController", "volume Adjust.", statusSource.toString());
        List<CourseLinkageLifecycle> list = this.s.get(statusSource);
        if (njy.e(list)) {
            LogUtil.e("Suggestion_CoachController", "coachStateCallbacks null.");
            return;
        }
        for (CourseLinkageLifecycle courseLinkageLifecycle : list) {
            if (courseLinkageLifecycle != null) {
                courseLinkageLifecycle.volumeAdjust(builder.build());
            }
        }
    }

    public CourseStateProto.CourseState a() {
        CourseStateProto.CourseState.Builder builder = this.f8847c;
        if (builder != null) {
            builder.setCurrentVolume(iee.c());
            return this.f8847c.build();
        }
        CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
        builderNewBuilder.setCurrentVolume(iee.c());
        return builderNewBuilder.build();
    }

    public void c(CourseProto.CourseStorageInfo.Builder builder) {
        this.f8845a = builder;
    }

    public void c(CourseStateProto.CourseState.Builder builder) {
        this.f8847c = builder;
    }

    public boolean h() {
        return this.g;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void c(int i) {
        if (h()) {
            c(StatusSource.APP, i);
        } else {
            d(StatusSource.APP, 1);
        }
    }

    public void e(int i, int i2, int i3) {
        if (h()) {
            ReleaseLogUtil.d("Suggestion_CoachController", "enterRestingCommand tempCurrent:", Integer.valueOf(i));
            c(StatusSource.APP, iee.b(i, i2, i3).build());
        } else {
            d(StatusSource.APP, 2);
        }
    }
}
