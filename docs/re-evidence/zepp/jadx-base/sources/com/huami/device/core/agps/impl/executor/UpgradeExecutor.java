package com.huami.device.core.agps.impl.executor;

import com.facebook.appevents.UserDataStore;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/device/core/agps/impl/executor/UpgradeExecutor;", "", "Lkotlin/Function0;", "", UserDataStore.FIRST_NAME, Constant.METHOD_EXECUTE, "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public interface UpgradeExecutor {
    void execute(@NotNull Function0<Unit> fn);
}
