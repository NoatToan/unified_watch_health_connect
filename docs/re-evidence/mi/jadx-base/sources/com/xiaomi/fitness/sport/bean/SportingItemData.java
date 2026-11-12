package com.xiaomi.fitness.sport.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "data", "", "dataDes", "other", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getDataDes", "setDataDes", "getOther", "setOther", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportingItemData extends BaseSportItemBean {

    @NotNull
    private String data;

    @Nullable
    private String dataDes;

    @NotNull
    private String other;

    public /* synthetic */ SportingItemData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getDataDes() {
        return this.dataDes;
    }

    @NotNull
    public final String getOther() {
        return this.other;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setDataDes(@Nullable String str) {
        this.dataDes = str;
    }

    public final void setOther(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.other = str;
    }

    public SportingItemData(@NotNull String data, @Nullable String str, @NotNull String other) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(other, "other");
        this.data = data;
        this.dataDes = str;
        this.other = other;
    }
}
