package com.mi.health.course.config;

import android.content.Context;
import android.net.Uri;
import com.mi.health.course.activity.CourseInfoActivityKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.schema.export.PushConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/config/CourseScheme;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "Ljava/util/ArrayList;", "", "canHandle", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "pathList", "", "doProcess", "", "context", "Landroid/content/Context;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseScheme extends IntentSchemeHandle {

    @NotNull
    private ArrayList<String> parameterList = CollectionsKt__CollectionsKt.arrayListOf("course", "courseList");

    /* JADX WARN: Code duplicated, block: B:10:0x0060  */
    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ArrayList<String> arrayListParameterList = parameterList();
        List<String> listPathList = pathList();
        String queryParameter = uri.getQueryParameter("pageType");
        String path = uri.getPath();
        if (Intrinsics.areEqual(PushConstants.getSSchemeWearable(), uri.getScheme()) || Intrinsics.areEqual(PushConstants.getSSchemeMihealth(), uri.getScheme())) {
            if (Intrinsics.areEqual(getAUTHORITY(), uri.getAuthority())) {
                if (!CollectionsKt___CollectionsKt.contains(arrayListParameterList, queryParameter)) {
                }
                return true;
            }
            if (Intrinsics.areEqual(getAUTHORITY() + ".xiaomi.com", uri.getAuthority())) {
                if (!CollectionsKt___CollectionsKt.contains(arrayListParameterList, queryParameter) || CollectionsKt___CollectionsKt.contains(listPathList, path)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        String queryParameter;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual("courseList", uri.getQueryParameter("pageType"))) {
            CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), null, null, null, null, true, 15, null);
        } else {
            if (!Intrinsics.areEqual("coursedetail", uri.getQueryParameter("coursePage")) || (queryParameter = uri.getQueryParameter("id")) == null || (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(queryParameter)) == null) {
                return;
            }
            CourseInfoActivityKt.startCourseInfo$default(longOrNull.longValue(), null, 0, false, 10, null);
        }
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public ArrayList<String> parameterList() {
        return this.parameterList;
    }
}
