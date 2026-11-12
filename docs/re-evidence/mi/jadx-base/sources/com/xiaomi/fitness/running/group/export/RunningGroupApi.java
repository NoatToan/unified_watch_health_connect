package com.xiaomi.fitness.running.group.export;

import android.content.Intent;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.running.group.export.data.RunningGroupEntranceResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/running/group/export/RunningGroupApi;", "", "getRunningGroupEntrance", "", TSMAuthContants.PARAM_CITYCODE, "", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceResult;", "getRunningGroupDetailIntent", "Landroid/content/Intent;", "srcIntent", "running-group-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RunningGroupApi {
    @Nullable
    Intent getRunningGroupDetailIntent(@Nullable Intent srcIntent);

    void getRunningGroupEntrance(@NotNull String cityCode, @NotNull Function1<? super RunningGroupEntranceResult, Unit> callback);
}
