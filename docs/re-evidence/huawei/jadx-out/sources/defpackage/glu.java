package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.Data;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Comment;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class glu {

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35643a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35644c;
        private boolean d;
        private boolean e;

        public boolean d() {
            return this.f35643a;
        }

        public void e(boolean z) {
            this.f35643a = z;
        }

        public int a() {
            return this.f35644c;
        }

        public void c(int i) {
            this.f35644c = i;
        }

        public boolean c() {
            return this.d;
        }

        public void b(boolean z) {
            this.d = z;
        }

        public boolean e() {
            return this.e;
        }

        public void a(boolean z) {
            this.e = z;
        }
    }

    public static d c(FitWorkout fitWorkout, boolean z, boolean z2) {
        d dVar = new d();
        dVar.b(z);
        dVar.a(z2);
        if (z2) {
            dVar.c(a(fitWorkout));
            dVar.e(d(fitWorkout));
        }
        return dVar;
    }

    public static boolean d(String str) {
        return new File(xkf.g(str)).exists();
    }

    public static int e(FitWorkout fitWorkout) {
        return a(fitWorkout, null, false);
    }

    public static int d(FitWorkout fitWorkout, int i) {
        if (fitWorkout == null) {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "getMediaFileLength fitWorkout==null");
            return 0;
        }
        HashMap map = new HashMap(16);
        List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
        if (!njy.c(listAcquireWorkoutActions, i)) {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "getMediaFileLength checkList(workoutActions)");
            return 0;
        }
        return gmj.d(listAcquireWorkoutActions.get(i), map, (List<Media>) null, c(fitWorkout, false, true));
    }

    public static int a(FitWorkout fitWorkout, List<Media> list, boolean z) {
        int iD = 0;
        if (fitWorkout == null) {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "getTotalLength null != fitWorkout");
            return 0;
        }
        HashMap map = new HashMap(16);
        ArrayList<WorkoutAction> arrayList = new ArrayList(16);
        if (fitWorkout.acquireWarmUpRunAction() != null) {
            arrayList.add(fitWorkout.acquireWarmUpRunAction());
        }
        if (fitWorkout.acquireWorkoutActions() != null) {
            arrayList.addAll(fitWorkout.acquireWorkoutActions());
        }
        if (fitWorkout.acquireCoolDownRunAction() != null) {
            arrayList.add(fitWorkout.acquireCoolDownRunAction());
        }
        d dVarC = c(fitWorkout, z, true);
        if (!njy.b(arrayList)) {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "getTotalLength CollectionUtils.isNotEmpty(workoutActions)");
        } else {
            for (WorkoutAction workoutAction : arrayList) {
                iD = iD + d(workoutAction, map, list, dVarC) + gmj.c(workoutAction, map, list, dVarC);
            }
        }
        if (z) {
            return iD;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iD2 = iD + d(list, fitWorkout);
        LogUtil.d("Suggestion_DataMediaFilesHelper", "parseMultiLanguageLength time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return iD2;
    }

    private static boolean d(FitWorkout fitWorkout) {
        return (fitWorkout.isLongVideoCourse() || fitWorkout.isRunModelCourse()) ? false : true;
    }

    private static int a(FitWorkout fitWorkout) {
        int iE = ied.e();
        LogUtil.a("Suggestion_DataMediaFilesHelper", "getGender: ", Integer.valueOf(iE));
        return fitWorkout.getCourseAttr() != 2 ? fitWorkout.getCourseAttr() : iE;
    }

    public static int d(FitWorkout fitWorkout, List<Media> list, int i) {
        if (fitWorkout == null) {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "saveListMediaFiles fitWorkout==null");
            return 0;
        }
        HashMap map = new HashMap(16);
        List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
        if (!njy.c(listAcquireWorkoutActions, i)) {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "saveListMediaFiles checkList(workoutActions)");
            return 0;
        }
        d dVarC = c(fitWorkout, false, true);
        WorkoutAction workoutAction = listAcquireWorkoutActions.get(i);
        LogUtil.a("Suggestion_DataMediaFilesHelper", "workoutAction:", workoutAction);
        return gmj.d(workoutAction, map, list, dVarC);
    }

    private static int d(List<Media> list, FitWorkout fitWorkout) {
        String strAcquireComeFrom;
        if (fitWorkout.getCourseDefineType() == 1) {
            strAcquireComeFrom = "R";
        } else {
            strAcquireComeFrom = fitWorkout.acquireComeFrom();
        }
        if (!d(strAcquireComeFrom)) {
            return 10485760;
        }
        List<Data> listC = gmj.c(xkf.g(strAcquireComeFrom));
        int iAcquireSize = 0;
        if (njy.e(listC)) {
            return 0;
        }
        for (Data data : listC) {
            if (data != null) {
                String strE = xkf.e(data.acquireFileName());
                if (!xkf.b(data.acquireFileName(), d(data), data.acquireUrl())) {
                    iAcquireSize = (int) (((long) iAcquireSize) + data.acquireSize());
                    if (list != null) {
                        Media media = new Media();
                        media.setUrl(data.acquireUrl());
                        media.setPath(strE);
                        media.setLength(data.acquireSize());
                        media.setType(3);
                        list.add(media);
                    }
                }
            }
        }
        return iAcquireSize;
    }

    private static long d(Data data) {
        long jM = xkf.m(xkf.e(data.acquireFileName()));
        return jM == 0 ? xkf.m(xkf.a(data.acquireFileName())) : jM;
    }

    private static int d(WorkoutAction workoutAction, Map<String, Object> map, List<Media> list, d dVar) {
        List<Comment> commentaryTraining = workoutAction.getCommentaryTraining();
        int iD = 0;
        if (njy.b(commentaryTraining)) {
            iD = d(map, list, 0, commentaryTraining, dVar);
        } else {
            ReleaseLogUtil.a("Suggestion_DataMediaFilesHelper", "workoutAction.getCommentaryTraining() == null");
        }
        if (workoutAction.getActionMusic() == null) {
            return iD;
        }
        String url = workoutAction.getActionMusic().getUrl();
        if (TextUtils.isEmpty(url)) {
            LogUtil.e("Suggestion_DataMediaFilesHelper", "musicUrl is null or empty", url);
            return iD;
        }
        long jE = e(url);
        if (a(dVar) && xkf.d(url, jE)) {
            LogUtil.j("Suggestion_DataMediaFilesHelper", "action music has exist and no need update.", url);
            return iD;
        }
        int length = workoutAction.getActionMusic().getLength();
        if (list != null) {
            Media media = new Media();
            media.setUrl(url);
            media.setLength(workoutAction.getActionMusic().getLength());
            media.setPath(xkf.b(media.getUrl()));
            media.setType(2);
            LogUtil.a("Suggestion_DataMediaFilesHelper", "music url:", media.getUrl(), " path:", media.getPath());
            list.add(media);
        }
        return iD + length;
    }

    private static int d(Map<String, Object> map, List<Media> list, int i, List<Comment> list2, d dVar) {
        for (Comment comment : list2) {
            long jE = e(comment.acquireName());
            if (!map.containsKey(comment.acquireName()) && (!a(dVar) || !xkf.d(comment.acquireName(), jE))) {
                map.put(comment.acquireName(), null);
                i += comment.getLength();
                if (list != null) {
                    Media media = new Media();
                    media.setUrl(comment.acquireName());
                    media.setPath(xkf.b(media.getUrl()));
                    media.setLength(comment.getLength());
                    media.setType(2);
                    LogUtil.a("Suggestion_DataMediaFilesHelper", "comment url:", media.getUrl(), " path:", media.getPath());
                    list.add(media);
                }
            }
        }
        return i;
    }

    public static List<Media> c(FitWorkout fitWorkout, boolean z) {
        if (fitWorkout == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(16);
        a(fitWorkout, arrayList, z);
        return arrayList;
    }

    public static long e(String str) {
        long jM = xkf.m(xkf.a(str));
        if (jM != 0 || !xkf.p(str)) {
            return jM;
        }
        xkf.c(str, buh.e(xkf.a(str)));
        return xkf.m(xkf.a(str));
    }

    public static boolean a(d dVar) {
        if (dVar == null) {
            return true;
        }
        return !dVar.c();
    }
}
