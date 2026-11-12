package com.huami.utils.permissionx;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001d\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "getId", "(Ljava/util/List;)Ljava/lang/String;", "id", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class PermissionRationaleConfigKt {
    @NotNull
    public static final String getId(@NotNull List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = CollectionsKt___CollectionsKt.sorted(list).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
        return sb.toString();
    }
}
