package com.mi.health.course.ext;

import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.mi.health.course.data.Resolution;
import com.mi.health.course.data.Resolution1080;
import com.mi.health.course.data.Resolution4K;
import com.mi.health.course.data.Resolution720;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.HrCourseConfigModel;
import com.mi.health.course.ext.CourseExtKt;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import defpackage.bli;
import defpackage.czi;
import defpackage.xmi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\b*\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\t\u001a\f\u0010\f\u001a\u00020\u0004*\u0004\u0018\u00010\r\u001a\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0001\u001a\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020\u0001\u001a\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u001a\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000b\u001a\u0006\u0010#\u001a\u00020\u0004\u001a\b\u0010$\u001a\u00020\u0004H\u0002\u001a\n\u0010%\u001a\u00020\u0004*\u00020\u0014\u001a\f\u0010&\u001a\u0004\u0018\u00010\u0001*\u00020\u0014\u001a\n\u0010'\u001a\u00020(*\u00020\u0014\u001a\u0012\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0019*\u00020\u0014\u001a\u0014\u0010+\u001a\u0004\u0018\u00010\u0001*\u00020,2\u0006\u0010%\u001a\u00020\u0004\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00142\u0006\u0010.\u001a\u00020/\u001a\u0012\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0019*\u00020\u0014\u001a \u00102\u001a\u000203*\b\u0012\u0004\u0012\u00020\u000b042\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b\u001a\u0012\u00107\u001a\u00020\u000b*\u0002082\u0006\u00109\u001a\u00020\u000b\u001a\u0012\u0010:\u001a\u00020\u000b*\u0002082\u0006\u00109\u001a\u00020\u000b\u001a\u0012\u0010?\u001a\u000203*\u00020@2\u0006\u0010A\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010;\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"SHARE_URL", "", "SHARE_SERIES_URL", "TEST", "", "getTEST", "()Z", "getDifficult", "Lkotlin/Pair;", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "getCalorie", "", "supportLink", "Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "getAudioContentImg", "type", "courseType", "opFloat", "", "deviceMatch", "Lcom/mi/health/course/export/data/CourseAllInfo;", "model", "getProperProduct", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getPrefixProducts", "", "prefix", "getEcoPrefixProducts", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "getEcoPrefixProductsList", "getSportMachineList", "getEcoProperProduct", "getEcoSportMachineList", "validCoach", "value", "isSexMale", "isCoachMale", "coachSelectable", "videoUrl", "mediaSize", "", "getSegments", "Lcom/mi/health/course/export/data/CourseConfigModel$VideoSegment;", "getImgUrl", "Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;", "getTvUrl", "resolution", "Lcom/mi/health/course/data/Resolution;", "getCmdSet", "Lcom/mi/health/course/export/data/CourseConfigModel$DevCmd;", "addDataWithinCapacity", "", "Ljava/util/LinkedList;", "data", "capacity", "getMinBpm", "Lcom/mi/health/course/export/data/HrCourseConfigModel$HrDetailStage;", "maxHr", "getMaxBpm", "TAG_COURSE_HIDE", "TAG_COURSE_FREE", "TAG_COURSE_VIP", "TAG_COURSE_SERIES", "showCourseTag", "Landroid/widget/TextView;", "tag", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseExt.kt\ncom/mi/health/course/ext/CourseExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1#2:266\n1863#3,2:267\n*S KotlinDebug\n*F\n+ 1 CourseExt.kt\ncom/mi/health/course/ext/CourseExtKt\n*L\n110#1:267,2\n*E\n"})
public final class CourseExtKt {

    @NotNull
    public static final String SHARE_SERIES_URL = "https://watch.iot.mi.com/libai/course-abm.html?course_id=";

    @NotNull
    public static final String SHARE_URL = "https://watch.iot.mi.com/libai/course-info.html?course_id=";
    public static final int TAG_COURSE_FREE = 1;
    public static final int TAG_COURSE_HIDE = 0;
    public static final int TAG_COURSE_SERIES = 3;
    public static final int TAG_COURSE_VIP = 2;
    private static final boolean TEST = false;

    public static final void addDataWithinCapacity(@NotNull LinkedList<Integer> linkedList, int i, int i2) {
        Intrinsics.checkNotNullParameter(linkedList, "<this>");
        if (linkedList.size() == i2 - 1) {
            linkedList.removeFirst();
        }
        linkedList.add(Integer.valueOf(i));
    }

    public static final boolean coachSelectable(@NotNull CourseAllInfo courseAllInfo) {
        Intrinsics.checkNotNullParameter(courseAllInfo, "<this>");
        CourseModel.CourseData basicInfo = courseAllInfo.getBasicInfo();
        return basicInfo != null && basicInfo.coachType == 1;
    }

    public static final boolean deviceMatch(@Nullable CourseAllInfo courseAllInfo, @NotNull String model) {
        CourseConfigModel.DeviceLinkage deviceLinkage;
        Intrinsics.checkNotNullParameter(model, "model");
        Set<String> set = (courseAllInfo == null || (deviceLinkage = courseAllInfo.getDeviceLinkage()) == null) ? null : deviceLinkage.models;
        if (set == null || set.isEmpty()) {
            return false;
        }
        return set.contains(model);
    }

    public static final int getAudioContentImg(int i, int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                return xmi.course_audio_1;
            }
            if (i != 1) {
                return i != 2 ? xmi.course_hr_relax : xmi.course_hr_train;
            }
            return xmi.course_hr_warm;
        }
        switch (i) {
            case 1:
                return xmi.course_audio_1;
            case 2:
                return xmi.course_audio_2;
            case 3:
                return xmi.course_audio_3;
            case 4:
                return xmi.course_audio_4;
            case 5:
                return xmi.course_audio_5;
            case 6:
                return xmi.course_audio_6;
            case 7:
                return xmi.course_audio_7;
            case 8:
                return xmi.course_audio_8;
            default:
                return xmi.course_audio_9;
        }
    }

    public static final int getCalorie(@NotNull CourseModel.CourseData courseData) {
        Intrinsics.checkNotNullParameter(courseData, "<this>");
        return isSexMale() ? courseData.maleCalories : courseData.femaleCalories;
    }

    @Nullable
    public static final List<CourseConfigModel.DevCmd> getCmdSet(@NotNull CourseAllInfo courseAllInfo) {
        Intrinsics.checkNotNullParameter(courseAllInfo, "<this>");
        CourseConfigModel.DeviceLinkage deviceLinkage = courseAllInfo.getDeviceLinkage();
        if (deviceLinkage == null) {
            return null;
        }
        if (coachSelectable(courseAllInfo)) {
            return isCoachMale() ? deviceLinkage.maleCmd : deviceLinkage.femaleCmd;
        }
        return deviceLinkage.commonCmd;
    }

    @NotNull
    public static final Pair<String, String> getDifficult(@NotNull CourseModel.CourseData courseData) {
        String str;
        Intrinsics.checkNotNullParameter(courseData, "<this>");
        String courseLevelStr = CourseApiKt.getCourseApi().getCourseLevelStr(courseData.difficulty);
        int i = courseData.difficulty;
        if (1 > i || i >= 5) {
            str = "D5";
        } else {
            str = "D" + i;
        }
        return TuplesKt.to(courseLevelStr, str);
    }

    @Nullable
    public static final List<EcoProduct> getEcoPrefixProducts(@NotNull final String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductList(new Function1() { // from class: sq4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CourseExtKt.getEcoPrefixProducts$lambda$2(prefix, (EcoProduct) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getEcoPrefixProducts$lambda$2(String prefix, EcoProduct it) {
        Intrinsics.checkNotNullParameter(prefix, "$prefix");
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.contains$default((CharSequence) prefix, (CharSequence) StringsKt__StringsKt.split$default((CharSequence) it.getModel(), new char[]{'.'}, false, 0, 6, (Object) null).get(1), false, 2, (Object) null);
    }

    @Nullable
    public static final List<Product> getEcoPrefixProductsList(@NotNull String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        List<EcoProduct> ecoPrefixProducts = getEcoPrefixProducts(prefix);
        ArrayList arrayList = new ArrayList();
        if (ecoPrefixProducts != null) {
            Iterator<T> it = ecoPrefixProducts.iterator();
            while (it.hasNext()) {
                ListExtKt.add(arrayList, EcoProductExtKt.toDeviceProduct((EcoProduct) it.next()));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final EcoProduct getEcoProperProduct(@NotNull String model) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator<T> it = getEcoSportMachineList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((EcoProduct) next).getModel(), model)) {
                return (EcoProduct) next;
            }
        }
        next = null;
        return (EcoProduct) next;
    }

    @NotNull
    public static final List<EcoProduct> getEcoSportMachineList() {
        return EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductList(new Function1() { // from class: pq4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CourseExtKt.getEcoSportMachineList$lambda$6((EcoProduct) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getEcoSportMachineList$lambda$6(EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccessType() == 1 && (it.getStatus() == 3 || it.getStatus() == 1);
    }

    @Nullable
    public static final String getImgUrl(@NotNull CourseConfigModel.Exercise exercise, boolean z) {
        Intrinsics.checkNotNullParameter(exercise, "<this>");
        if (z) {
            return isCoachMale() ? exercise.malePreviewImage : exercise.femalePreviewImage;
        }
        return exercise.commonPreviewImage;
    }

    public static final int getMaxBpm(@NotNull HrCourseConfigModel.HrDetailStage hrDetailStage, int i) {
        Intrinsics.checkNotNullParameter(hrDetailStage, "<this>");
        return (hrDetailStage.maxHrPercent * i) / 100;
    }

    public static final int getMinBpm(@NotNull HrCourseConfigModel.HrDetailStage hrDetailStage, int i) {
        Intrinsics.checkNotNullParameter(hrDetailStage, "<this>");
        return (hrDetailStage.minHrPercent * i) / 100;
    }

    @Nullable
    public static final List<Product> getPrefixProducts(@NotNull final String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductList(new Function1() { // from class: qq4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CourseExtKt.getPrefixProducts$lambda$1(prefix, (WearableProduct) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPrefixProducts$lambda$1(String prefix, WearableProduct it) {
        Intrinsics.checkNotNullParameter(prefix, "$prefix");
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.contains$default((CharSequence) prefix, (CharSequence) StringsKt__StringsKt.split$default((CharSequence) it.getModel(), new char[]{'.'}, false, 0, 6, (Object) null).get(1), false, 2, (Object) null);
    }

    @Nullable
    public static final Product getProperProduct(@NotNull String model) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator<T> it = getSportMachineList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Product) next).getModel(), model)) {
                return (Product) next;
            }
        }
        next = null;
        return (Product) next;
    }

    @Nullable
    public static final List<CourseConfigModel.VideoSegment> getSegments(@NotNull CourseAllInfo courseAllInfo) {
        Intrinsics.checkNotNullParameter(courseAllInfo, "<this>");
        CourseConfigModel.VideoInfo videoInfo = courseAllInfo.getVideoInfo();
        if (videoInfo == null) {
            return null;
        }
        if (coachSelectable(courseAllInfo)) {
            return isCoachMale() ? videoInfo.maleSegments : videoInfo.femaleSegments;
        }
        return videoInfo.commonSegments;
    }

    @NotNull
    public static final List<Product> getSportMachineList() {
        return DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductList(new Function1() { // from class: rq4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CourseExtKt.getSportMachineList$lambda$4((WearableProduct) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSportMachineList$lambda$4(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccessType() == 1 && (it.getStatus() == 3 || it.getStatus() == 1);
    }

    public static final boolean getTEST() {
        return TEST;
    }

    @NotNull
    public static final String getTvUrl(@NotNull CourseAllInfo courseAllInfo, @NotNull Resolution resolution) {
        String str;
        Intrinsics.checkNotNullParameter(courseAllInfo, "<this>");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        CourseConfigModel.VideoInfo videoInfo = courseAllInfo.getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        if (coachSelectable(courseAllInfo)) {
            if (isCoachMale()) {
                if (Intrinsics.areEqual(resolution, Resolution1080.INSTANCE)) {
                    str = videoInfo.tvMale1080Url;
                } else if (Intrinsics.areEqual(resolution, Resolution4K.INSTANCE)) {
                    str = videoInfo.tvMale4kUrl;
                } else {
                    if (!Intrinsics.areEqual(resolution, Resolution720.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = videoInfo.tvMale720Url;
                }
            } else if (Intrinsics.areEqual(resolution, Resolution1080.INSTANCE)) {
                str = videoInfo.tvFemale1080Url;
            } else if (Intrinsics.areEqual(resolution, Resolution4K.INSTANCE)) {
                str = videoInfo.tvFemale4KUrl;
            } else {
                if (!Intrinsics.areEqual(resolution, Resolution720.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = videoInfo.tvFemale720Url;
            }
        } else if (Intrinsics.areEqual(resolution, Resolution1080.INSTANCE)) {
            str = videoInfo.tvCommon1080Url;
        } else if (Intrinsics.areEqual(resolution, Resolution4K.INSTANCE)) {
            str = videoInfo.tvCommon4KUrl;
        } else {
            if (!Intrinsics.areEqual(resolution, Resolution720.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = videoInfo.tvCommon720Url;
        }
        Intrinsics.checkNotNullExpressionValue(str, "run(...)");
        return str;
    }

    private static final boolean isCoachMale() {
        return AboutManagerExtKt.getInstance(AboutManager.INSTANCE).isCoachMale();
    }

    public static final boolean isSexMale() {
        return Intrinsics.areEqual("male", UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex());
    }

    public static final long mediaSize(@NotNull CourseAllInfo courseAllInfo) {
        long j;
        Intrinsics.checkNotNullParameter(courseAllInfo, "<this>");
        if (courseAllInfo.getType() == 2) {
            CourseConfigModel.AudioInfo audioInfo = courseAllInfo.getAudioInfo();
            if (audioInfo != null) {
                return audioInfo.audioSize;
            }
            return 0L;
        }
        CourseConfigModel.VideoInfo videoInfo = courseAllInfo.getVideoInfo();
        if (videoInfo == null) {
            return 0L;
        }
        if (coachSelectable(courseAllInfo)) {
            j = isCoachMale() ? videoInfo.maleVideoSize : videoInfo.femaleVideoSize;
        } else {
            j = videoInfo.commonVideoSize;
        }
        return j;
    }

    @NotNull
    public static final String opFloat(float f) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removeSuffix(str, (CharSequence) "0"), (CharSequence) "0"), (CharSequence) ".");
    }

    public static final void showCourseTag(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (i == 1) {
            ExtUtilsKt.setVisible(textView, true);
            textView.setText(czi.course_tag_free);
            textView.setTextColor(ExtUtilsKt.getColor(bli.m));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ExtUtilsKt.getColor(bli.h));
            gradientDrawable.setCornerRadius(ExtUtilsKt.getDp(4));
            textView.setBackground(gradientDrawable);
            return;
        }
        if (i == 2) {
            ExtUtilsKt.setVisible(textView, true);
            textView.setText(czi.course_tag_vip);
            textView.setTextColor(ExtUtilsKt.getColor(bli.f4340b));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(ExtUtilsKt.getColor(bli.f4339a));
            gradientDrawable2.setCornerRadius(ExtUtilsKt.getDp(4));
            textView.setBackground(gradientDrawable2);
            return;
        }
        if (i != 3) {
            ExtUtilsKt.setVisible(textView, false);
            return;
        }
        ExtUtilsKt.setVisible(textView, true);
        textView.setText(czi.course_tag_series);
        textView.setTextColor(ExtUtilsKt.getColor(bli.m));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(ExtUtilsKt.getColor(bli.course_tag_series_bg));
        gradientDrawable3.setCornerRadius(ExtUtilsKt.getDp(4));
        textView.setBackground(gradientDrawable3);
    }

    public static final boolean supportLink(@Nullable CourseConfigModel.DeviceLinkage deviceLinkage) {
        return deviceLinkage != null && deviceLinkage.supportLink == 1;
    }

    public static final boolean validCoach(int i) {
        return i == 2 || i == 1;
    }

    @Nullable
    public static final String videoUrl(@NotNull CourseAllInfo courseAllInfo) {
        Intrinsics.checkNotNullParameter(courseAllInfo, "<this>");
        CourseConfigModel.VideoInfo videoInfo = courseAllInfo.getVideoInfo();
        if (videoInfo == null) {
            return null;
        }
        if (coachSelectable(courseAllInfo)) {
            return isCoachMale() ? videoInfo.maleVideoUrl : videoInfo.femaleVideoUrl;
        }
        return videoInfo.commonVideoUrl;
    }
}
