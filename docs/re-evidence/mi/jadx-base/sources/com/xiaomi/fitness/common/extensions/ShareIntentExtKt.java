package com.xiaomi.fitness.common.extensions;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"getExcludeComponentNameArray", "", "Landroid/content/ComponentName;", "Landroid/content/Intent;", "(Landroid/content/Intent;)[Landroid/content/ComponentName;", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareIntentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareIntentExt.kt\ncom/xiaomi/fitness/common/extensions/ShareIntentExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,20:1\n774#2:21\n865#2,2:22\n1557#2:24\n1628#2,3:25\n37#3:28\n36#3,3:29\n*S KotlinDebug\n*F\n+ 1 ShareIntentExt.kt\ncom/xiaomi/fitness/common/extensions/ShareIntentExtKt\n*L\n17#1:21\n17#1:22,2\n18#1:24\n18#1:25,3\n19#1:28\n19#1:29,3\n*E\n"})
public final class ShareIntentExtKt {
    @NotNull
    public static final ComponentName[] getExcludeComponentNameArray(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        List<ResolveInfo> listQueryIntentActivities = ApplicationExtKt.getApplication().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivities) {
            if (Intrinsics.areEqual(((ResolveInfo) obj).activityInfo.packageName, packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ComponentName(packageName, ((ResolveInfo) it.next()).activityInfo.name));
        }
        return (ComponentName[]) arrayList2.toArray(new ComponentName[0]);
    }
}
