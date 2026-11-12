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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "", "Llyo$b;", "phraseNativeBuiltinGroup", "()Llyo$b;", "", "id", "I", "getId", "()I", "", "kotlin.jvm.PlatformType", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "builtinWidgets", "Ljava/util/List;", "getBuiltinWidgets", "()Ljava/util/List;", "nativeBuiltinGroup", "<init>", "(Llyo$b;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetV3Wrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetV3Wrapper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,81:1\n11158#2:82\n11493#2,3:83\n1557#3:86\n1628#3,3:87\n37#4:90\n36#4,3:91\n*S KotlinDebug\n*F\n+ 1 WidgetV3Wrapper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup\n*L\n60#1:82\n60#1:83,3\n68#1:86\n68#1:87,3\n70#1:90\n70#1:91,3\n*E\n"})
public final class WidgetV3NativeBuiltinGroup {

    @NotNull
    private final List<NativeBuiltinWrapper> builtinWidgets;
    private final int id;
    private final String name;

    public WidgetV3NativeBuiltinGroup(@NotNull lyo.b nativeBuiltinGroup) {
        Intrinsics.checkNotNullParameter(nativeBuiltinGroup, "nativeBuiltinGroup");
        this.id = nativeBuiltinGroup.c;
        this.name = nativeBuiltinGroup.d;
        lyo.a[] builtinWidgets = nativeBuiltinGroup.e;
        Intrinsics.checkNotNullExpressionValue(builtinWidgets, "builtinWidgets");
        ArrayList arrayList = new ArrayList(builtinWidgets.length);
        for (lyo.a aVar : builtinWidgets) {
            Intrinsics.checkNotNull(aVar);
            arrayList.add(new NativeBuiltinWrapper(aVar));
        }
        this.builtinWidgets = arrayList;
    }

    @NotNull
    public final List<NativeBuiltinWrapper> getBuiltinWidgets() {
        return this.builtinWidgets;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final lyo.b phraseNativeBuiltinGroup() {
        lyo.b bVar = new lyo.b();
        bVar.c = this.id;
        bVar.d = this.name;
        List<NativeBuiltinWrapper> list = this.builtinWidgets;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NativeBuiltinWrapper) it.next()).phraseNativeBuiltin());
        }
        bVar.e = (lyo.a[]) arrayList.toArray(new lyo.a[0]);
        return bVar;
    }
}
