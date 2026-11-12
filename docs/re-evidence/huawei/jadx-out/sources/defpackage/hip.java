package defpackage;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.Services;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class hip {
    public static void d(FitWorkout fitWorkout) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("DeleteFitnessCourseHelper", "deleteCourseCache: mCourseApi is null.");
            return;
        }
        boolean z = courseApi.getCourseUseCacheSize() > 1073741824;
        LogUtil.a("DeleteFitnessCourseHelper", "deleteCourseCache: isCacheAvailable is ", Boolean.valueOf(z));
        if (z) {
            courseApi.getUserCourseList(0, 50, 0, "FITNESS_COURSE", new e(courseApi.getMediaFiles(fitWorkout)));
        }
    }

    static class e extends UiCallback<List<Workout>> {
        private List<Media> d;

        e(List<Media> list) {
            this.d = list;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("DeleteFitnessCourseHelper", "DownloadFitnessCourseCallback onFailure ", Integer.valueOf(i));
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Workout> list) {
            if (list == null) {
                LogUtil.j("DeleteFitnessCourseHelper", "DownloadFitnessCourseCallback data is null");
                return;
            }
            final List<FitWorkout> listB = pea.b(list);
            if (listB == null) {
                LogUtil.j("DeleteFitnessCourseHelper", "DownloadFitnessCourseCallback fitWorkouts is null");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: his
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36782a.c(listB);
                    }
                });
            }
        }

        /* synthetic */ void c(List list) {
            FitWorkout fitWorkout;
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            ArrayList arrayList = new ArrayList(16);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FitWorkout fitWorkout2 = (FitWorkout) it.next();
                if (!fitWorkout2.isLongVideoCourse() && courseApi.getCourseMediaFilesLength(fitWorkout2.acquireId(), fitWorkout2.accquireVersion()) == 0 && (fitWorkout = courseApi.getFitWorkout(fitWorkout2.acquireId(), fitWorkout2.accquireVersion())) != null) {
                    fitWorkout.setIntervals(fitWorkout2.getIntervals());
                    arrayList.add(fitWorkout);
                }
            }
            hip.e(arrayList, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(List<FitWorkout> list, List<Media> list2) {
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        for (FitWorkout fitWorkout : list) {
            map2.put(fitWorkout.acquireId(), courseApi.getMediaFiles(fitWorkout));
        }
        HashSet hashSet = new HashSet(16);
        for (Media media : list2) {
            if (media != null) {
                hashSet.add(media.getUrl());
            }
        }
        for (FitWorkout fitWorkout2 : list) {
            Iterator it = ((List) map2.get(fitWorkout2.acquireId())).iterator();
            long jMax = 0;
            while (it.hasNext()) {
                File file = new File(((Media) it.next()).getPath());
                if (file.exists()) {
                    jMax = Math.max(jMax, file.lastModified());
                }
            }
            map.put(fitWorkout2.acquireId(), Long.valueOf(jMax));
        }
        e(list, map, hashSet, map2);
    }

    private static void e(List<FitWorkout> list, Map<String, Long> map, Set<String> set, Map<String, List<Media>> map2) {
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null && map.get(fitWorkout.acquireId()) != null && d(map.get(fitWorkout.acquireId()).longValue()) && a(fitWorkout)) {
                c(map2.get(fitWorkout.acquireId()), set);
            }
        }
    }

    private static void c(List<Media> list, Set<String> set) {
        if (njy.e(list)) {
            return;
        }
        for (Media media : list) {
            if (media != null && !set.contains(media.getUrl()) && !pee.c(new File(media.getPath()))) {
                LogUtil.a("DeleteFitnessCourseHelper", "deleteCache: delete file failed");
            }
        }
    }

    private static boolean d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -30);
        return j < calendar.getTimeInMillis();
    }

    private static boolean a(FitWorkout fitWorkout) {
        if (fitWorkout != null) {
            return fitWorkout.getIntervals() < 0 || fitWorkout.getIntervals() > 30;
        }
        LogUtil.j("DeleteFitnessCourseHelper", "ifExerciseInMonth: fitWorkout is null.");
        return false;
    }

    public static void e(final FitWorkout fitWorkout) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hio
            @Override // java.lang.Runnable
            public final void run() {
                hip.b(fitWorkout);
            }
        });
    }

    static /* synthetic */ void b(FitWorkout fitWorkout) {
        List<Media> mediaFiles = ((CourseApi) Services.d("CoursePlanService", CourseApi.class)).getMediaFiles(fitWorkout);
        if (njy.e(mediaFiles)) {
            LogUtil.j("DeleteFitnessCourseHelper", "refreshCourseTime: mediaList is Empty.");
            return;
        }
        FileTime fileTimeFromMillis = FileTime.fromMillis(System.currentTimeMillis());
        for (Media media : mediaFiles) {
            if (media != null) {
                File file = new File(media.getPath());
                if (file.exists()) {
                    try {
                        Files.setAttribute(file.toPath(), "lastAccessTime", fileTimeFromMillis, new LinkOption[0]);
                    } catch (IOException unused) {
                        LogUtil.j("DeleteFitnessCourseHelper", "refreshCourseTime: refresh time failed.");
                    }
                }
            }
        }
    }
}
