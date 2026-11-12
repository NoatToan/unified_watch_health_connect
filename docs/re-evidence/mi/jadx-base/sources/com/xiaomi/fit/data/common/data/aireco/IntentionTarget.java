package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionTarget;", "", "<init>", "()V", "implUniqueCode", "", "getImplUniqueCode", "()Ljava/lang/String;", "setImplUniqueCode", "(Ljava/lang/String;)V", "targetExposeType", "", "getTargetExposeType", "()I", "setTargetExposeType", "(I)V", "implType", "getImplType", "setImplType", "widgetImplInfo", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionWidgetInfo;", "getWidgetImplInfo", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionWidgetInfo;", "setWidgetImplInfo", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionWidgetInfo;)V", "mamlImplInfo", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionMamlInfo;", "getMamlImplInfo", "()Lcom/xiaomi/fit/data/common/data/aireco/IntentionMamlInfo;", "setMamlImplInfo", "(Lcom/xiaomi/fit/data/common/data/aireco/IntentionMamlInfo;)V", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionTarget {
    private int targetExposeType;

    @NotNull
    private String implUniqueCode = "";
    private int implType = 1;

    @NotNull
    private IntentionWidgetInfo widgetImplInfo = new IntentionWidgetInfo();

    @NotNull
    private IntentionMamlInfo mamlImplInfo = new IntentionMamlInfo();

    public final int getImplType() {
        return this.implType;
    }

    @NotNull
    public final String getImplUniqueCode() {
        return this.implUniqueCode;
    }

    @NotNull
    public final IntentionMamlInfo getMamlImplInfo() {
        return this.mamlImplInfo;
    }

    public final int getTargetExposeType() {
        return this.targetExposeType;
    }

    @NotNull
    public final IntentionWidgetInfo getWidgetImplInfo() {
        return this.widgetImplInfo;
    }

    public final void setImplType(int i) {
        this.implType = i;
    }

    public final void setImplUniqueCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.implUniqueCode = str;
    }

    public final void setMamlImplInfo(@NotNull IntentionMamlInfo intentionMamlInfo) {
        Intrinsics.checkNotNullParameter(intentionMamlInfo, "<set-?>");
        this.mamlImplInfo = intentionMamlInfo;
    }

    public final void setTargetExposeType(int i) {
        this.targetExposeType = i;
    }

    public final void setWidgetImplInfo(@NotNull IntentionWidgetInfo intentionWidgetInfo) {
        Intrinsics.checkNotNullParameter(intentionWidgetInfo, "<set-?>");
        this.widgetImplInfo = intentionWidgetInfo;
    }
}
