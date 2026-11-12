package com.xiaomi.hm.health.device.assistant.schedule;

import android.app.Activity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.AndroidPermissions;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.device.assistant.schedule.SchedulePermission;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/SchedulePermission;", "", "Landroid/app/Activity;", DbUtils.Const.Table.CONTEXT, "", "", "requirePermission", "Lkotlin/Function0;", "", "onSmsGrand", "onCalendarGrand", "Lio/reactivex/disposables/Disposable;", "askForGrandPermission", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SchedulePermission {

    @NotNull
    public static final SchedulePermission INSTANCE = new SchedulePermission();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    private SchedulePermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0, Function0 function1, Permission permission) {
        if (Intrinsics.areEqual(permission.name, "android.permission.READ_SMS") && permission.granted) {
            function0.invoke();
        }
        if (Intrinsics.areEqual(permission.name, "android.permission.READ_CALENDAR") && permission.granted) {
            function1.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    @Nullable
    public final Disposable askForGrandPermission(@NotNull Activity context, @NotNull final Function0<Unit> onSmsGrand, @NotNull final Function0<Unit> onCalendarGrand) {
        Object[] array = requirePermission(context).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        if (strArr.length == 0) {
            return null;
        }
        return new RxPermissions(context).requestEach((String[]) Arrays.copyOf(strArr, strArr.length)).subscribe(new Consumer() { // from class: vi6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SchedulePermission.c(onSmsGrand, onCalendarGrand, (Permission) obj);
            }
        }, new Consumer() { // from class: wi6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SchedulePermission.d((Throwable) obj);
            }
        });
    }

    @NotNull
    public final List<String> requirePermission(@NotNull Activity context) {
        ArrayList arrayList = new ArrayList();
        if (!AndroidPermissions.checkGranted(context, "android.permission.READ_SMS")) {
            arrayList.add("android.permission.READ_SMS");
        }
        if (!AndroidPermissions.checkGranted(context, "android.permission.READ_CALENDAR")) {
            arrayList.add("android.permission.READ_CALENDAR");
        }
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            arrayList.add("android.permission.WRITE_CALENDAR");
        }
        return arrayList;
    }
}
