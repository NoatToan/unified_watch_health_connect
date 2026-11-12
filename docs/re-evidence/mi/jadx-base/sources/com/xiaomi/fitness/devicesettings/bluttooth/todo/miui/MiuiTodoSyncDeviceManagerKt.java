package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import com.google.gson.Gson;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManagerKt;
import defpackage.n64;
import defpackage.p14;
import defpackage.t64;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018\"\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"\"\u0014\u0010$\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoEntity;", "Lp14;", "toDeviceReminderInfo", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoEntity;)Lp14;", "", "str", "removeHighSurrogate", "(Ljava/lang/String;)Ljava/lang/String;", "", PluginDeviceInfo.FICONON, "", "isHighSurrogate", "(C)Z", "", "miuiMode", "", "miuiRemindTime", "transformMiuiRemindRepeatToDevice", "(IJ)I", "status", "transformDeviceTodoStatusToMiui", "(I)Z", "miuiFinishType", "transformMiuiToDeviceTodoStatus", "(I)I", "Ljava/util/Calendar;", "calendar$delegate", "Lkotlin/Lazy;", "getCalendar", "()Ljava/util/Calendar;", "calendar", "Lcom/google/gson/Gson;", "mGson$delegate", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "MAX_LENGTH", "I", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiuiTodoSyncDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiuiTodoSyncDeviceManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoSyncDeviceManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,290:1\n1872#2,3:291\n37#3:294\n36#3,3:295\n*S KotlinDebug\n*F\n+ 1 MiuiTodoSyncDeviceManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoSyncDeviceManagerKt\n*L\n231#1:291,3\n241#1:294\n241#1:295,3\n*E\n"})
public final class MiuiTodoSyncDeviceManagerKt {
    private static final int MAX_LENGTH = 30;

    @NotNull
    private static final Lazy calendar$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q6g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Calendar.getInstance();
        }
    });

    @NotNull
    private static final Lazy mGson$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r6g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiTodoSyncDeviceManagerKt.mGson_delegate$lambda$1();
        }
    });

    private static final Calendar getCalendar() {
        Object value = calendar$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    @NotNull
    public static final Gson getMGson() {
        return (Gson) mGson$delegate.getValue();
    }

    private static final boolean isHighSurrogate(char c) {
        return 55296 <= c && c < 56064;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$1() {
        return new Gson();
    }

    private static final String removeHighSurrogate(String str) {
        return (str == null || str.length() == 0 || !isHighSurrogate(str.charAt(StringsKt__StringsKt.getLastIndex(str)))) ? str : StringsKt___StringsKt.dropLast(str, 1);
    }

    @NotNull
    public static final p14 toDeviceReminderInfo(@NotNull MiuiTodoEntity miuiTodoEntity) {
        String content;
        String strSubstring;
        Intrinsics.checkNotNullParameter(miuiTodoEntity, "<this>");
        p14 p14Var = new p14();
        p14Var.c = miuiTodoEntity.getId();
        p14.a aVar = new p14.a();
        int iTransformMiuiRemindRepeatToDevice = transformMiuiRemindRepeatToDevice(miuiTodoEntity.getRemindRepeatType(), miuiTodoEntity.getRemindTimeMillis());
        aVar.e = iTransformMiuiRemindRepeatToDevice;
        if (iTransformMiuiRemindRepeatToDevice != 15) {
            getCalendar().setTimeInMillis(miuiTodoEntity.getRemindTimeMillis());
            getCalendar().setTimeZone(FitnessDateUtils.INSTANCE.getTimeZone(0));
            n64 n64Var = new n64();
            n64Var.c = getCalendar().get(1);
            n64Var.d = getCalendar().get(2) + 1;
            n64Var.e = getCalendar().get(5);
            aVar.c = n64Var;
            t64 t64Var = new t64();
            t64Var.c = getCalendar().get(11);
            t64Var.d = getCalendar().get(12);
            aVar.d = t64Var;
        } else {
            n64 n64Var2 = new n64();
            n64Var2.c = 0;
            n64Var2.d = 0;
            n64Var2.e = 0;
            aVar.c = n64Var2;
            t64 t64Var2 = new t64();
            t64Var2.c = 0;
            t64Var2.d = 0;
            aVar.d = t64Var2;
        }
        if (miuiTodoEntity.isSubTodo()) {
            SubTodoList getSubTodoList = miuiTodoEntity.getGetSubTodoList();
            List<SubTodoEntity> subTodoEntities = getSubTodoList != null ? getSubTodoList.getSubTodoEntities() : null;
            if (getSubTodoList == null || (strSubstring = getSubTodoList.getTitle()) == null) {
                strSubstring = "";
            }
            if (strSubstring.length() == 0) {
                strSubstring = ApplicationExtKt.getApplication().getString(wzi.u8);
            }
            boolean z = strSubstring.length() > 30;
            aVar.h = z;
            if (z) {
                strSubstring = strSubstring.substring(0, 30);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            aVar.g = strSubstring;
            aVar.g = removeHighSurrogate(strSubstring);
            ArrayList arrayList = new ArrayList();
            if (subTodoEntities != null) {
                int i = 0;
                for (Object obj : subTodoEntities) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    SubTodoEntity subTodoEntity = (SubTodoEntity) obj;
                    p14.d dVar = new p14.d();
                    String content2 = subTodoEntity.getContent();
                    if (content2 == null) {
                        content2 = "";
                    }
                    dVar.d = subTodoEntity.isFinish() ? 2 : 1;
                    boolean z2 = content2.length() > 30;
                    dVar.f = z2;
                    if (z2) {
                        content2 = content2.substring(0, 30);
                        Intrinsics.checkNotNullExpressionValue(content2, "substring(...)");
                    }
                    dVar.e = removeHighSurrogate(content2);
                    dVar.c = i;
                    ListExtKt.add(arrayList, dVar);
                    i = i2;
                }
            }
            aVar.l = (p14.d[]) arrayList.toArray(new p14.d[0]);
        } else {
            boolean z3 = miuiTodoEntity.getContent().length() > 30;
            aVar.h = z3;
            if (z3) {
                content = miuiTodoEntity.getContent().substring(0, 30);
                Intrinsics.checkNotNullExpressionValue(content, "substring(...)");
            } else {
                content = miuiTodoEntity.getContent();
            }
            aVar.g = content;
            aVar.g = removeHighSurrogate(content);
        }
        aVar.j = transformMiuiToDeviceTodoStatus(miuiTodoEntity.getFinishType());
        aVar.f29901k = miuiTodoEntity.getLastModifyTimeMillis() / 1000;
        aVar.i = 1;
        p14Var.d = aVar;
        return p14Var;
    }

    public static final boolean transformDeviceTodoStatusToMiui(int i) {
        return i == 2;
    }

    public static final int transformMiuiRemindRepeatToDevice(int i, long j) {
        if (j <= 0) {
            return 15;
        }
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
            default:
                return 15;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 7;
            case 8:
                return 8;
        }
    }

    public static final int transformMiuiToDeviceTodoStatus(int i) {
        return i == 1 ? 2 : 1;
    }
}
