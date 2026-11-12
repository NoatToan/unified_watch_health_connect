package com.mi.fitness.course.schedule.component;

import com.mi.fitness.course.schedule.util.SyncCourseClassHelper;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/mi/fitness/course/schedule/component/CourseScheduleComponent;", "", "<init>", "()V", "initCourseScheduleComponent", "", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "course-schedule")
public final class CourseScheduleComponent {
    @ComponentTask
    public final void initCourseScheduleComponent() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(20, new DataHandlerWrapper() { // from class: com.mi.fitness.course.schedule.component.CourseScheduleComponent.initCourseScheduleComponent.1
            @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
            public boolean handlePacket(String did, int type, s7r packet) {
                Intrinsics.checkNotNullParameter(did, "did");
                if (packet == null || type != 20 || packet.f != 18) {
                    return false;
                }
                SyncCourseClassHelper.syncCourseSchedule$default(SyncCourseClassHelper.INSTANCE, false, 1, null);
                return true;
            }
        });
    }
}
