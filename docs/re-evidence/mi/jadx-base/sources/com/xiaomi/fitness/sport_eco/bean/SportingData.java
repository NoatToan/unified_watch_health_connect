package com.xiaomi.fitness.sport_eco.bean;

import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/bean/SportingData;", "", "<init>", "()V", "list", "", "Lcom/xiaomi/fitness/sport_eco/bean/SportingItemData;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "map", "", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel$SportTitle;", "", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "sportDurtaion", "", "getSportDurtaion", "()J", "setSportDurtaion", "(J)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportingData {

    @NotNull
    private List<SportingItemData> list = new ArrayList();

    @NotNull
    private Map<CommonSportModel.SportTitle, String> map = new HashMap();
    private long sportDurtaion;

    @NotNull
    public final List<SportingItemData> getList() {
        return this.list;
    }

    @NotNull
    public final Map<CommonSportModel.SportTitle, String> getMap() {
        return this.map;
    }

    public final long getSportDurtaion() {
        return this.sportDurtaion;
    }

    public final void setList(@NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final void setMap(@NotNull Map<CommonSportModel.SportTitle, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    public final void setSportDurtaion(long j) {
        this.sportDurtaion = j;
    }
}
