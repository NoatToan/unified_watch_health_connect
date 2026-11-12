package defpackage;

import android.content.Context;
import com.huawei.health.suggestion.customizecourse.manager.model.CourseConfig;
import com.huawei.health.suggestion.customizecourse.manager.model.CourseSetConfig;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f36459a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile hdj f36460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CourseSetConfig f36461c;
    private Map<Integer, CourseConfig> d = new HashMap();
    private Context e;

    private hdj(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e = context;
        d();
        LogUtil.a("Suggestion_CoursesConfigManager_TIME", "init cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static final hdj c(Context context) {
        hdj hdjVar;
        LogUtil.a("Suggestion_CoursesConfigManager", "getInstance()");
        synchronized (f36459a) {
            if (f36460b == null) {
                f36460b = new hdj(context.getApplicationContext());
            }
            hdjVar = f36460b;
        }
        return hdjVar;
    }

    public CourseConfig c(int i) {
        return this.d.get(Integer.valueOf(i));
    }

    private void d() {
        c();
        b();
    }

    private void b() {
        CourseSetConfig courseSetConfig = this.f36461c;
        if (courseSetConfig == null || njy.e(courseSetConfig.getCourseConfigs())) {
            LogUtil.j("Suggestion_CoursesConfigManager", "loadConfigToTypeMap () course config size error");
            return;
        }
        this.d.clear();
        for (CourseConfig courseConfig : this.f36461c.getCourseConfigs()) {
            if (courseConfig != null) {
                this.d.put(Integer.valueOf(courseConfig.getCourseType()), courseConfig);
            }
        }
        LogUtil.a("Suggestion_CoursesConfigManager", "loadConfigToTypeMap() mCourseConfigTypeMap size：", Integer.valueOf(this.d.size()));
    }

    private void c() {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("Suggestion_CoursesConfigManager", "loadDefaultCourseSetConfig failed with null context");
        } else if (this.f36461c == null) {
            try {
                this.f36461c = (CourseSetConfig) lls.a(context.getAssets().open("CustomCourseSetConfig.json"), CourseSetConfig.class);
            } catch (IOException unused) {
                LogUtil.e("Suggestion_CoursesConfigManager", "loadDefaultCourseSetConfig failed, ");
            }
            CourseSetConfig courseSetConfig = this.f36461c;
            LogUtil.a("Suggestion_CoursesConfigManager", "mDefaultConfig : ", courseSetConfig == null ? "" : courseSetConfig.getVersion());
        }
    }
}
