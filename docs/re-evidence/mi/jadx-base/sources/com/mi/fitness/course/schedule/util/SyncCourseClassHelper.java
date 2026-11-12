package com.mi.fitness.course.schedule.util;

import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.mi.fitness.course.schecule.export.CourseScheduleConstant;
import com.mi.fitness.course.schedule.bean.CourseScheduleData;
import com.mi.fitness.course.schedule.bean.CourseScheduleDefaultResult;
import com.mi.fitness.course.schedule.bean.CourseScheduleSectionTimesData;
import com.mi.fitness.course.schedule.bean.CourseScheduleSectionTimesDataWrapper;
import com.mi.fitness.course.schedule.bean.CourseScheduleSettingData;
import com.mi.fitness.course.schedule.request.CourseScheduleRequest;
import com.mi.fitness.course.schedule.util.SyncCourseClassHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
import defpackage.ecp;
import defpackage.jcp;
import defpackage.s7r;
import defpackage.t64;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001d\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mi/fitness/course/schedule/util/SyncCourseClassHelper;", "", "<init>", "()V", "TAG", "", "syncCourseSchedule", "", "forceCheckEngine", "", "syncCourseScheduleToDevice", "courseScheduleDefaultResult", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleDefaultResult;", "formatCourseSettingTime", "", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleSectionTimesDataWrapper;", "setting", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleSettingData;", "(Lcom/mi/fitness/course/schedule/bean/CourseScheduleSettingData;)[Lcom/mi/fitness/course/schedule/bean/CourseScheduleSectionTimesDataWrapper;", "getWeeksInt", "", "data", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleData;", "getDaysInt", "getSectionsInt", "getStartSemesterTimestamp", "", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSyncCourseClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCourseClassHelper.kt\ncom/mi/fitness/course/schedule/util/SyncCourseClassHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n37#2:193\n36#2,3:194\n37#2:197\n36#2,3:198\n*S KotlinDebug\n*F\n+ 1 SyncCourseClassHelper.kt\ncom/mi/fitness/course/schedule/util/SyncCourseClassHelper\n*L\n83#1:193\n83#1:194,3\n84#1:197\n84#1:198,3\n*E\n"})
public final class SyncCourseClassHelper {

    @NotNull
    public static final SyncCourseClassHelper INSTANCE = new SyncCourseClassHelper();

    @NotNull
    private static final String TAG = "SyncCourseClassHelper";

    private SyncCourseClassHelper() {
    }

    private final CourseScheduleSectionTimesDataWrapper[] formatCourseSettingTime(CourseScheduleSettingData setting) {
        List listD = xpd.d(setting.getSectionTimes(), CourseScheduleSectionTimesData.class);
        List list = listD;
        if (list == null || list.isEmpty()) {
            return new CourseScheduleSectionTimesDataWrapper[0];
        }
        CourseScheduleSectionTimesDataWrapper[] courseScheduleSectionTimesDataWrapperArr = new CourseScheduleSectionTimesDataWrapper[listD.size()];
        try {
            int size = listD.size();
            for (int i = 0; i < size; i++) {
                CourseScheduleSectionTimesData courseScheduleSectionTimesData = (CourseScheduleSectionTimesData) listD.get(i);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) courseScheduleSectionTimesData.getS(), new String[]{":"}, false, 0, 6, (Object) null);
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) courseScheduleSectionTimesData.getE(), new String[]{":"}, false, 0, 6, (Object) null);
                courseScheduleSectionTimesDataWrapperArr[courseScheduleSectionTimesData.getI() - 1] = new CourseScheduleSectionTimesDataWrapper(Integer.parseInt((String) listSplit$default.get(0)), Integer.parseInt((String) listSplit$default.get(1)), Integer.parseInt((String) listSplit$default2.get(0)), Integer.parseInt((String) listSplit$default2.get(1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courseScheduleSectionTimesDataWrapperArr;
    }

    private final int getDaysInt(CourseScheduleData data) {
        if (data == null) {
            return 0;
        }
        return 1 << (data.getDay() - 1);
    }

    private final int getSectionsInt(CourseScheduleData data) {
        int i = 0;
        if (data == null) {
            return 0;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data.getSections(), new String[]{","}, false, 0, 6, (Object) null);
        List list = listSplit$default;
        if (list != null && !list.isEmpty()) {
            try {
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    i |= 1 << (Integer.parseInt((String) it.next()) - 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    private final long getStartSemesterTimestamp(CourseScheduleSettingData setting) {
        String startSemester = setting.getStartSemester();
        if (startSemester != null && startSemester.length() != 0 && Long.parseLong(setting.getStartSemester()) > 0) {
            return Long.parseLong(setting.getStartSemester()) / ((long) 1000);
        }
        if (setting.getPresentWeek() >= 99) {
            return -1L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(jCurrentTimeMillis);
        gregorianCalendar.setFirstDayOfWeek(2);
        gregorianCalendar.add(7, 1 - gregorianCalendar.get(7));
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return (gregorianCalendar.getTimeInMillis() / ((long) 1000)) - ((long) ((setting.getPresentWeek() - 1) * BaseSyncBiz.RECORD_MAX_LIFETIME));
    }

    private final int getWeeksInt(CourseScheduleData data) {
        int i = 0;
        if (data == null) {
            return 0;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data.getWeeks(), new String[]{","}, false, 0, 6, (Object) null);
        List list = listSplit$default;
        if (list != null && !list.isEmpty()) {
            try {
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    i |= 1 << (Integer.parseInt((String) it.next()) - 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static /* synthetic */ void syncCourseSchedule$default(SyncCourseClassHelper syncCourseClassHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        syncCourseClassHelper.syncCourseSchedule(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncCourseSchedule$lambda$0(CourseScheduleDefaultResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getAllCourseSchedule: " + it);
        INSTANCE.syncCourseScheduleToDevice(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncCourseSchedule$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getAllCourseSchedule fail: " + it);
        return Unit.INSTANCE;
    }

    private final void syncCourseScheduleToDevice(CourseScheduleDefaultResult courseScheduleDefaultResult) {
        long startSemesterTimestamp = getStartSemesterTimestamp(courseScheduleDefaultResult.getSetting());
        Logger.i(TAG, "startSemester: " + startSemesterTimestamp);
        if (startSemesterTimestamp < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!courseScheduleDefaultResult.getCourses().isEmpty()) {
            for (CourseScheduleData courseScheduleData : courseScheduleDefaultResult.getCourses()) {
                if (courseScheduleData != null && (courseScheduleDefaultResult.getSetting().isWeekend() != 0 || courseScheduleData.getDay() <= 5)) {
                    ecp.a aVar = new ecp.a();
                    aVar.c = courseScheduleData.getName();
                    SyncCourseClassHelper syncCourseClassHelper = INSTANCE;
                    aVar.d = syncCourseClassHelper.getWeeksInt(courseScheduleData);
                    aVar.e = syncCourseClassHelper.getDaysInt(courseScheduleData);
                    aVar.f = syncCourseClassHelper.getSectionsInt(courseScheduleData);
                    aVar.g = courseScheduleData.getTeacher();
                    aVar.h = courseScheduleData.getPosition();
                    arrayList.add(aVar);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (courseScheduleDefaultResult.getSetting().getSectionTimes().length() > 0) {
            CourseScheduleSectionTimesDataWrapper[] courseSettingTime = formatCourseSettingTime(courseScheduleDefaultResult.getSetting());
            int length = courseSettingTime.length;
            for (int i = 0; i < length; i++) {
                CourseScheduleSectionTimesDataWrapper courseScheduleSectionTimesDataWrapper = courseSettingTime[i];
                ecp.b bVar = new ecp.b();
                t64 t64Var = new t64();
                t64Var.c = courseScheduleSectionTimesDataWrapper != null ? courseScheduleSectionTimesDataWrapper.getStartHour() : 0;
                t64Var.d = courseScheduleSectionTimesDataWrapper != null ? courseScheduleSectionTimesDataWrapper.getStartMinute() : 0;
                bVar.c = t64Var;
                t64 t64Var2 = new t64();
                t64Var2.c = courseScheduleSectionTimesDataWrapper != null ? courseScheduleSectionTimesDataWrapper.getEndHour() : 0;
                t64Var2.d = courseScheduleSectionTimesDataWrapper != null ? courseScheduleSectionTimesDataWrapper.getEndMinute() : 0;
                bVar.d = t64Var2;
                arrayList2.add(bVar);
            }
        }
        ecp ecpVar = new ecp();
        ecpVar.c = startSemesterTimestamp;
        ecpVar.d = courseScheduleDefaultResult.getSetting().getTotalWeek();
        ecpVar.f = (ecp.a[]) arrayList.toArray(new ecp.a[0]);
        ecpVar.e = (ecp.b[]) arrayList2.toArray(new ecp.b[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 19;
        jcp jcpVar = new jcp();
        jcpVar.C(ecpVar);
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public final void syncCourseSchedule(boolean forceCheckEngine) {
        String did;
        if (forceCheckEngine && CourseScheduleConstant.INSTANCE.getAivs_engine_status() != 2) {
            Logger.e(TAG, "aivs engine not ready, wait");
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        String authorization = AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).getAuthorization(did);
        if (authorization.length() > 0) {
            new CourseScheduleRequest().getAllCourseSchedule(authorization, new Function1() { // from class: nso
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SyncCourseClassHelper.syncCourseSchedule$lambda$0((CourseScheduleDefaultResult) obj);
                }
            }, new Function1() { // from class: oso
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SyncCourseClassHelper.syncCourseSchedule$lambda$1((ApiException) obj);
                }
            });
        }
    }
}
