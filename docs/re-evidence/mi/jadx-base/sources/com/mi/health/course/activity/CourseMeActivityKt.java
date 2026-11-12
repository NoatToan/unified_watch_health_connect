package com.mi.health.course.activity;

import android.app.Application;
import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"TAG_L", "", "startMyCourse", "", "tag", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseMeActivityKt {

    @NotNull
    private static final String TAG_L = "CourseMeAcL";

    public static final void startMyCourse(@Nullable String str) {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) CourseMeActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(CourseCatalogActivityKt.KEY_COURSER_TAGS, str);
        app.startActivity(intent);
    }

    public static /* synthetic */ void startMyCourse$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        startMyCourse(str);
    }
}
