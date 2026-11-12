package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import defpackage.lyo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3SupportedList;", "", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "builtinGroups", "Ljava/util/List;", "getBuiltinGroups", "()Ljava/util/List;", "Llyo$c;", "supportedList", "<init>", "(Llyo$c;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetV3Wrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetV3Wrapper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3SupportedList\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,81:1\n11158#2:82\n11493#2,3:83\n*S KotlinDebug\n*F\n+ 1 WidgetV3Wrapper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3SupportedList\n*L\n77#1:82\n77#1:83,3\n*E\n"})
public final class WidgetV3SupportedList {

    @NotNull
    private final List<WidgetV3NativeBuiltinGroup> builtinGroups;

    public WidgetV3SupportedList(@NotNull lyo.c supportedList) {
        Intrinsics.checkNotNullParameter(supportedList, "supportedList");
        lyo.b[] builtinGroups = supportedList.c;
        Intrinsics.checkNotNullExpressionValue(builtinGroups, "builtinGroups");
        ArrayList arrayList = new ArrayList(builtinGroups.length);
        for (lyo.b bVar : builtinGroups) {
            Intrinsics.checkNotNull(bVar);
            arrayList.add(new WidgetV3NativeBuiltinGroup(bVar));
        }
        this.builtinGroups = arrayList;
    }

    @NotNull
    public final List<WidgetV3NativeBuiltinGroup> getBuiltinGroups() {
        return this.builtinGroups;
    }
}
