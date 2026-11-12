package com.mi.health.course.export.perference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/mi/health/course/export/perference/CourseVipSharePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_COURSE_VIP_DATE", "getKEY_COURSE_VIP_DATE", "setKEY_COURSE_VIP_DATE", "(Ljava/lang/String;)V", "KEY_COURSE_VIP_DATE$delegate", "Lkotlin/properties/ReadWriteProperty;", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseVipSharePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVipSharePreference.kt\ncom/mi/health/course/export/perference/CourseVipSharePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,13:1\n135#2,6:14\n*S KotlinDebug\n*F\n+ 1 CourseVipSharePreference.kt\ncom/mi/health/course/export/perference/CourseVipSharePreference\n*L\n10#1:14,6\n*E\n"})
public final class CourseVipSharePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CourseVipSharePreference.class, "KEY_COURSE_VIP_DATE", "getKEY_COURSE_VIP_DATE()Ljava/lang/String;", 0))};

    @NotNull
    public static final CourseVipSharePreference INSTANCE;

    /* JADX INFO: renamed from: KEY_COURSE_VIP_DATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_COURSE_VIP_DATE;

    static {
        CourseVipSharePreference courseVipSharePreference = new CourseVipSharePreference();
        INSTANCE = courseVipSharePreference;
        KEY_COURSE_VIP_DATE = courseVipSharePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.mi.health.course.export.perference.CourseVipSharePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
    }

    private CourseVipSharePreference() {
    }

    @NotNull
    public final String getKEY_COURSE_VIP_DATE() {
        return (String) KEY_COURSE_VIP_DATE.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "course_vip";
    }

    public final void setKEY_COURSE_VIP_DATE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_COURSE_VIP_DATE.setValue(this, $$delegatedProperties[0], str);
    }
}
