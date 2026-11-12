package com.mi.health.course.export.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"parseTime", "", "str", "", "parseConcernData", "", "course-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseAllInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseAllInfo.kt\ncom/mi/health/course/export/data/CourseAllInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1872#2,3:70\n774#2:73\n865#2,2:74\n*S KotlinDebug\n*F\n+ 1 CourseAllInfo.kt\ncom/mi/health/course/export/data/CourseAllInfoKt\n*L\n15#1:70,3\n24#1:73\n24#1:74,2\n*E\n"})
public final class CourseAllInfoKt {
    @NotNull
    public static final List<String> parseConcernData(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"|"}, false, 0, 6, (Object) null);
        List listSubList = listSplit$default.subList(0, Math.min(5, listSplit$default.size()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            if (CourseConfigModel.DeviceLinkage.DATA_SET.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final long parseTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        double d = 0.0d;
        int i = 0;
        for (Object obj : CollectionsKt___CollectionsKt.reversed(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null))) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            d += ((double) Integer.parseInt((String) obj)) * Math.pow(60.0d, i);
            i = i2;
        }
        return (long) (d * ((double) 1000));
    }
}
