package com.mi.health.course.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010 \u001a\u00020\tJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tJ\u0006\u0010&\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/mi/health/course/util/CoursePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "IS_SHOW_INFO_DIALOG", "getIS_SHOW_INFO_DIALOG", "()Z", "setIS_SHOW_INFO_DIALOG", "(Z)V", "IS_SHOW_INFO_DIALOG$delegate", "Lkotlin/properties/ReadWriteProperty;", "SHOW_LINKED_TIP", "getSHOW_LINKED_TIP", "setSHOW_LINKED_TIP", "SHOW_LINKED_TIP$delegate", "SHOW_COURSE_INFO", "getSHOW_COURSE_INFO", "setSHOW_COURSE_INFO", "SHOW_COURSE_INFO$delegate", "", "VIDEO_RESOLUTION", "getVIDEO_RESOLUTION", "()I", "setVIDEO_RESOLUTION", "(I)V", "VIDEO_RESOLUTION$delegate", "isShowUserInfoDialog", "setShowUserInfoDialog", "", "isShow", "isShowLinkTip", "setShowLinkTip", "isShowCourseInfoFragment", "setShowCourseInfoFragment", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoursePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoursePreference.kt\ncom/mi/health/course/util/CoursePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,36:1\n135#2,6:37\n135#2,6:43\n135#2,6:49\n135#2,6:55\n*S KotlinDebug\n*F\n+ 1 CoursePreference.kt\ncom/mi/health/course/util/CoursePreference\n*L\n14#1:37,6\n15#1:43,6\n16#1:49,6\n17#1:55,6\n*E\n"})
public final class CoursePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CoursePreference.class, "IS_SHOW_INFO_DIALOG", "getIS_SHOW_INFO_DIALOG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CoursePreference.class, "SHOW_LINKED_TIP", "getSHOW_LINKED_TIP()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CoursePreference.class, "SHOW_COURSE_INFO", "getSHOW_COURSE_INFO()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CoursePreference.class, "VIDEO_RESOLUTION", "getVIDEO_RESOLUTION()I", 0))};

    @NotNull
    public static final CoursePreference INSTANCE;

    /* JADX INFO: renamed from: IS_SHOW_INFO_DIALOG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SHOW_INFO_DIALOG;

    /* JADX INFO: renamed from: SHOW_COURSE_INFO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_COURSE_INFO;

    /* JADX INFO: renamed from: SHOW_LINKED_TIP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_LINKED_TIP;

    /* JADX INFO: renamed from: VIDEO_RESOLUTION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty VIDEO_RESOLUTION;

    static {
        CoursePreference coursePreference = new CoursePreference();
        INSTANCE = coursePreference;
        Boolean bool = Boolean.FALSE;
        IS_SHOW_INFO_DIALOG = coursePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.mi.health.course.util.CoursePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        SHOW_LINKED_TIP = coursePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.mi.health.course.util.CoursePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.TRUE, null, true);
        SHOW_COURSE_INFO = coursePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.mi.health.course.util.CoursePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, true);
        VIDEO_RESOLUTION = coursePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.course.util.CoursePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), Integer.valueOf(HMSedentaryConfig.INGORE_START_INDEX), null, true);
    }

    private CoursePreference() {
    }

    public final boolean getIS_SHOW_INFO_DIALOG() {
        return ((Boolean) IS_SHOW_INFO_DIALOG.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getSHOW_COURSE_INFO() {
        return ((Boolean) SHOW_COURSE_INFO.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getSHOW_LINKED_TIP() {
        return ((Boolean) SHOW_LINKED_TIP.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "course_sp";
    }

    public final int getVIDEO_RESOLUTION() {
        return ((Number) VIDEO_RESOLUTION.getValue(this, $$delegatedProperties[3])).intValue();
    }

    public final boolean isShowCourseInfoFragment() {
        return getSHOW_COURSE_INFO();
    }

    public final boolean isShowLinkTip() {
        return getSHOW_LINKED_TIP();
    }

    public final boolean isShowUserInfoDialog() {
        return getIS_SHOW_INFO_DIALOG();
    }

    public final void setIS_SHOW_INFO_DIALOG(boolean z) {
        IS_SHOW_INFO_DIALOG.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setSHOW_COURSE_INFO(boolean z) {
        SHOW_COURSE_INFO.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setSHOW_LINKED_TIP(boolean z) {
        SHOW_LINKED_TIP.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setShowCourseInfoFragment(boolean isShow) {
        setSHOW_COURSE_INFO(isShow);
    }

    public final void setShowLinkTip(boolean isShow) {
        setSHOW_LINKED_TIP(isShow);
    }

    public final void setShowUserInfoDialog(boolean isShow) {
        setIS_SHOW_INFO_DIALOG(isShow);
    }

    public final void setVIDEO_RESOLUTION(int i) {
        VIDEO_RESOLUTION.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }
}
