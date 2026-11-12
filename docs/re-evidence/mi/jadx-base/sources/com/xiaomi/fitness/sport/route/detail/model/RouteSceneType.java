package com.xiaomi.fitness.sport.route.detail.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "Unknown", "RouteSceneTypeAi", "RouteSceneTypeStyle", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum RouteSceneType {
    Unknown(-1),
    RouteSceneTypeAi(1),
    RouteSceneTypeStyle(2);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int code;

    RouteSceneType(int i) {
        this.code = i;
    }

    @NotNull
    public static EnumEntries<RouteSceneType> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }
}
