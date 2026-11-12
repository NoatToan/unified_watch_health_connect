package com.xiaomi.hm.health.smalltool.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\n"}, d2 = {"", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "", "a", "", "b", "([Lcom/xiaomi/hm/health/smalltool/model/Tool;)Ljava/util/List;", "Ljava/lang/String;", "TAG", "MY_TOOL_SORT_KEY", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ToolManagerKt {

    @NotNull
    private static final String a = "SmallTool-Manager";

    @NotNull
    private static final String b = "huami.mifit.user.settings.home.tools.order";

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> a(List<? extends Tool> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Tool) it2.next()).getKey());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> b(Tool[] toolArr) {
        return a(ArraysKt___ArraysKt.toList(toolArr));
    }
}
