package com.mi.health.course.activity;

import android.app.Application;
import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"KEY_COURSER_SCENE", "", "KEY_COURSER_TYPE", "KEY_COURSER_TAGS", "KEY_COURSE_TITLE", "TAG", "startCourseCatalog", "", "scene", "type", "", "tags", "sportName", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseCatalogActivityKt {

    @NotNull
    public static final String KEY_COURSER_SCENE = "course_scene";

    @NotNull
    public static final String KEY_COURSER_TAGS = "course_tags";

    @NotNull
    public static final String KEY_COURSER_TYPE = "course_type";

    @NotNull
    public static final String KEY_COURSE_TITLE = "course_title";

    @NotNull
    private static final String TAG = "CourseCatalogActivity";

    public static final void startCourseCatalog(@Nullable String str, @Nullable int[] iArr, @Nullable String str2, @Nullable String str3) {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) CourseCatalogActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(KEY_COURSER_SCENE, str);
        intent.putExtra(KEY_COURSER_TYPE, iArr);
        intent.putExtra(KEY_COURSER_TAGS, str2);
        intent.putExtra(KEY_COURSE_TITLE, str3);
        app.startActivity(intent);
    }
}
