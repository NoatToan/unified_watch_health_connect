package com.huami.device.core.agps.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&JD\u0010\f\u001a\u00020\u000b2:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H&¨\u0006\r"}, d2 = {"Lcom/huami/device/core/agps/api/UpgradeTarget;", "", "", "queryVersions", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "total", "progress", "", "onProgress", "", "upgrade", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public interface UpgradeTarget {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean upgrade$default(UpgradeTarget upgradeTarget, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upgrade");
            }
            if ((i & 1) != 0) {
                function2 = null;
            }
            return upgradeTarget.upgrade(function2);
        }
    }

    int queryVersions();

    boolean upgrade(@Nullable Function2<? super Integer, ? super Integer, Unit> onProgress);
}
