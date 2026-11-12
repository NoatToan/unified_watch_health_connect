package com.xiaomi.hm.health.smalltool;

import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¨\u0006\u0005"}, d2 = {"", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "tools", "", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ToolMyToolsAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(List<? extends Tool> list, List<? extends Tool> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        if (size <= 0) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!Intrinsics.areEqual(list.get(i).getKey(), list2.get(i).getKey())) {
                return false;
            }
            if (i2 >= size) {
                return true;
            }
            i = i2;
        }
    }
}
