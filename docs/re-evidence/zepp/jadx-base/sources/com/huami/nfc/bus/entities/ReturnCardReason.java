package com.huami.nfc.bus.entities;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/bus/entities/ReturnCardReason;", "", "", "component1", "", "component2", "code", "title", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReturnCardReason {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("code")
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("desc")
    @NotNull
    private final String title;

    public ReturnCardReason(int i, @NotNull String str) {
        this.code = i;
        this.title = str;
    }

    public static /* synthetic */ ReturnCardReason copy$default(ReturnCardReason returnCardReason, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = returnCardReason.code;
        }
        if ((i2 & 2) != 0) {
            str = returnCardReason.title;
        }
        return returnCardReason.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final ReturnCardReason copy(int code, @NotNull String title) {
        return new ReturnCardReason(code, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCardReason)) {
            return false;
        }
        ReturnCardReason returnCardReason = (ReturnCardReason) other;
        return this.code == returnCardReason.code && Intrinsics.areEqual(this.title, returnCardReason.title);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.code * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReturnCardReason(code=" + this.code + ", title=" + this.title + ')';
    }
}
