package com.xiaomi.wearable.yrn.internal.imageload;

import com.facebook.common.memory.MemoryTrimType;
import defpackage.rpf;
import defpackage.spf;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/wearable/yrn/internal/imageload/FrescoMemoryTrimmableRegistry;", "Lspf;", "Lrpf;", "trimmable", "", "registerMemoryTrimmable", "(Lrpf;)V", "unregisterMemoryTrimmable", "Lcom/facebook/common/memory/MemoryTrimType;", "trimType", "trim", "(Lcom/facebook/common/memory/MemoryTrimType;)V", "", "trimmables", "Ljava/util/List;", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FrescoMemoryTrimmableRegistry implements spf {

    @Nullable
    private final List<rpf> trimmables = Collections.synchronizedList(new LinkedList());

    @Override // defpackage.spf
    public void registerMemoryTrimmable(@NotNull rpf trimmable) {
        Intrinsics.checkNotNullParameter(trimmable, "trimmable");
        List<rpf> list = this.trimmables;
        Intrinsics.checkNotNull(list);
        list.add(trimmable);
    }

    public final synchronized void trim(@Nullable MemoryTrimType trimType) {
        List<rpf> list = this.trimmables;
        if (list != null && list.size() > 0) {
            Iterator<rpf> it = this.trimmables.iterator();
            while (it.hasNext()) {
                it.next().d(trimType);
            }
        }
    }

    public void unregisterMemoryTrimmable(@NotNull rpf trimmable) {
        Intrinsics.checkNotNullParameter(trimmable, "trimmable");
        List<rpf> list = this.trimmables;
        Intrinsics.checkNotNull(list);
        list.remove(trimmable);
    }
}
