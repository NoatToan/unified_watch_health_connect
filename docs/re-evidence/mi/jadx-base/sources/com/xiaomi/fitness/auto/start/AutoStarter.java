package com.xiaomi.fitness.auto.start;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0002\b\u000eH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/auto/start/AutoStarter;", "", "canAutoStart", "", "context", "Landroid/content/Context;", "setAutoStart", "", "enableByUser", "key", "", "result", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "Lkotlin/ExtensionFunctionType;", "getAutoStartByWho", "", "isAppNeedAutoStart", "openAutoStartOnce", "auto-start_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AutoStarter {
    boolean canAutoStart(@NotNull Context context);

    @NotNull
    List<String> getAutoStartByWho();

    boolean isAppNeedAutoStart();

    void openAutoStartOnce(@NotNull Context context);

    void setAutoStart(@NotNull Context context, boolean enableByUser, @NotNull String key, @Nullable Function1<? super PermissionBuilder, Unit> result);
}
