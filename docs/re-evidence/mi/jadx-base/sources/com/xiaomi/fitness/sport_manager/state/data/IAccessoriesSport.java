package com.xiaomi.fitness.sport_manager.state.data;

import defpackage.fv2;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00020\fj\b\u0012\u0004\u0012\u00020\u0002`\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/data/IAccessoriesSport;", "", "", "did", "", "accessoriesRemove", "(Ljava/lang/String;)V", "", "Lfv2;", "accessoriesGet", "()Ljava/util/Map;", "switchMode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSwitchModeList", "()Ljava/util/ArrayList;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface IAccessoriesSport {
    @Nullable
    Map<String, fv2> accessoriesGet();

    void accessoriesRemove(@NotNull String did);

    @NotNull
    ArrayList<String> getSwitchModeList();

    void switchMode(@NotNull String did);
}
