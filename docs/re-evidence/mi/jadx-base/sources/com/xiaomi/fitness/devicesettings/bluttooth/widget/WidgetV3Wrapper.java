package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import defpackage.lyo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3Wrapper;", "", "Llyo;", "phraseWidgetV3", "()Llyo;", "", "minCount", "I", "getMinCount", "()I", "maxCount", "getMaxCount", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "builtinWidgets", "Ljava/util/List;", "getBuiltinWidgets", "()Ljava/util/List;", "setBuiltinWidgets", "(Ljava/util/List;)V", "widgetV3", "<init>", "(Llyo;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetV3Wrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetV3Wrapper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3Wrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,81:1\n11158#2:82\n11493#2,3:83\n1557#3:86\n1628#3,3:87\n37#4:90\n36#4,3:91\n*S KotlinDebug\n*F\n+ 1 WidgetV3Wrapper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3Wrapper\n*L\n21#1:82\n21#1:83,3\n30#1:86\n30#1:87,3\n32#1:90\n32#1:91,3\n*E\n"})
public final class WidgetV3Wrapper {

    @NotNull
    private List<NativeBuiltinWrapper> builtinWidgets;
    private final int maxCount;
    private final int minCount;

    public WidgetV3Wrapper(@NotNull lyo widgetV3) {
        Intrinsics.checkNotNullParameter(widgetV3, "widgetV3");
        this.minCount = widgetV3.d;
        this.maxCount = widgetV3.e;
        ArrayList arrayList = new ArrayList();
        this.builtinWidgets = arrayList;
        lyo.a[] builtinWidgets = widgetV3.c;
        if (builtinWidgets != null) {
            Intrinsics.checkNotNullExpressionValue(builtinWidgets, "builtinWidgets");
            ArrayList arrayList2 = new ArrayList(builtinWidgets.length);
            for (lyo.a aVar : builtinWidgets) {
                Intrinsics.checkNotNull(aVar);
                arrayList2.add(new NativeBuiltinWrapper(aVar));
            }
            arrayList.addAll(arrayList2);
        }
    }

    @NotNull
    public final List<NativeBuiltinWrapper> getBuiltinWidgets() {
        return this.builtinWidgets;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    @NotNull
    public final lyo phraseWidgetV3() {
        lyo lyoVar = new lyo();
        List<NativeBuiltinWrapper> list = this.builtinWidgets;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NativeBuiltinWrapper) it.next()).phraseNativeBuiltin());
        }
        lyoVar.c = (lyo.a[]) arrayList.toArray(new lyo.a[0]);
        return lyoVar;
    }

    public final void setBuiltinWidgets(@NotNull List<NativeBuiltinWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.builtinWidgets = list;
    }
}
