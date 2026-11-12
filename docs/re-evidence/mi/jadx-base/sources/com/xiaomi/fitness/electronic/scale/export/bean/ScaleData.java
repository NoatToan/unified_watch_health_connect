package com.xiaomi.fitness.electronic.scale.export.bean;

import com.google.gson.Gson;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "Ljava/io/Serializable;", "resp", "", "<init>", "(Ljava/lang/String;)V", "getResp", "()Ljava/lang/String;", "setResp", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScaleData implements Serializable {

    @NotNull
    private String resp;

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScaleData copy$default(ScaleData scaleData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scaleData.resp;
        }
        return scaleData.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResp() {
        return this.resp;
    }

    @NotNull
    public final ScaleData copy(@NotNull String resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        return new ScaleData(resp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScaleData) && Intrinsics.areEqual(this.resp, ((ScaleData) other).resp);
    }

    @NotNull
    public final String getResp() {
        return this.resp;
    }

    public int hashCode() {
        return this.resp.hashCode();
    }

    public final void setResp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.resp = str;
    }

    @NotNull
    public String toString() {
        String json = new Gson().toJson(this.resp);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public ScaleData(@NotNull String resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        this.resp = resp;
    }

    public /* synthetic */ ScaleData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
