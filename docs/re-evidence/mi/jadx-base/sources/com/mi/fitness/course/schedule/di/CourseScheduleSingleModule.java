package com.mi.fitness.course.schedule.di;

import android.content.Context;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.mi.fitness.capability.export.model.CapabilityModel;
import com.mi.fitness.course.schecule.export.CourseScheduleHelper;
import com.mi.fitness.course.schecule.export.di.CourseScheduleExtKt;
import com.mi.fitness.course.schedule.di.CourseScheduleSingleModule;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import defpackage.tmi;
import defpackage.zyi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u008a\u0001\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014¢\u0006\u0002\b\u0019H\u0002¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/mi/fitness/course/schedule/di/CourseScheduleSingleModule;", "", "<init>", "()V", "provideCourseScheduleItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "provideCourseSchedule", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "createFeatureItem", "type", "", "icon", "title", Column.SUBTITLE, "more", "", "remind", "remindText", "", "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "itemVisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ExtensionFunctionType;", "(IIILjava/lang/Integer;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseScheduleSingleModule {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final TabContentItem createFeatureItem(int type, int icon, int title, Integer subtitle, boolean more, boolean remind, String remindText, Function1<? super Context, Unit> onClickListener, Function1<? super WearableDeviceModel, Boolean> itemVisible) {
        MutableLiveData<String> liveData;
        if (subtitle != null) {
            String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
            if (string != null) {
                liveData = StringExtKt.toLiveData(string);
            } else {
                liveData = null;
            }
        } else {
            liveData = null;
        }
        String string2 = ApplicationExtKt.getApplication().getString(title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TabContentItem(11, type, icon, StringExtKt.toLiveData(string2), liveData, more, new ObservableBoolean(remind), remindText != null ? StringExtKt.toLiveData(remindText) : null, null, onClickListener, itemVisible, null, null, 6400, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabContentItem createFeatureItem$default(CourseScheduleSingleModule courseScheduleSingleModule, int i, int i2, int i3, Integer num, boolean z, boolean z2, String str, Function1 function1, Function1 function2, int i4, Object obj) {
        return courseScheduleSingleModule.createFeatureItem(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? null : function1, (i4 & 256) != 0 ? null : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCourseScheduleItem$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CourseScheduleExtKt.getInstance(CourseScheduleHelper.INSTANCE).goCourseScheduleActivity(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideCourseScheduleItem$lambda$1(WearableDeviceModel createFeatureItem) {
        Intrinsics.checkNotNullParameter(createFeatureItem, "$this$createFeatureItem");
        return ((DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(createFeatureItem.getDid()) & 128) == 0 || AppUtil.INSTANCE.isPlayChannel()) ? false : true;
    }

    @NotNull
    public final CapabilityModel provideCourseSchedule() {
        return new CapabilityModel(128);
    }

    @NotNull
    public final TabContentItem provideCourseScheduleItem() {
        return createFeatureItem$default(this, 172, tmi.course_schedule_ic, zyi.course_schedule_title, null, false, false, null, new Function1() { // from class: hw4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CourseScheduleSingleModule.provideCourseScheduleItem$lambda$0((Context) obj);
            }
        }, new Function1() { // from class: iw4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CourseScheduleSingleModule.provideCourseScheduleItem$lambda$1((WearableDeviceModel) obj));
            }
        }, 120, null);
    }
}
