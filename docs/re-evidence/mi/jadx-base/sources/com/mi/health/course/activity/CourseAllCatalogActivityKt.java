package com.mi.health.course.activity;

import android.app.Application;
import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG", "", "startCourseAllCatalog", "", "scene", "type", "", "tags", "sportName", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseAllCatalogActivityKt {

    @NotNull
    private static final String TAG = "CourseAllCatalogActivity";

    public static final void startCourseAllCatalog(@Nullable String str, @Nullable int[] iArr, @Nullable String str2, @Nullable String str3) {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) CourseAllCatalogActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(CourseCatalogActivityKt.KEY_COURSER_SCENE, str);
        intent.putExtra(CourseCatalogActivityKt.KEY_COURSER_TYPE, iArr);
        intent.putExtra(CourseCatalogActivityKt.KEY_COURSER_TAGS, str2);
        intent.putExtra(CourseCatalogActivityKt.KEY_COURSE_TITLE, str3);
        app.startActivity(intent);
    }
}
