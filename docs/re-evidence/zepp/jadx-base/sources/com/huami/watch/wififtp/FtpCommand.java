package com.huami.watch.wififtp;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/watch/wififtp/FtpCommand;", "", "", "component1", "", "component2", "", "component3", "code", "msg", "isCommand", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "c", "Z", "()Z", "<init>", "(ILjava/lang/String;Z)V", "(Ljava/lang/String;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class FtpCommand {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String msg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isCommand;

    public FtpCommand(int i, @NotNull String str, boolean z) {
        this.code = i;
        this.msg = str;
        this.isCommand = z;
    }

    public static /* synthetic */ FtpCommand copy$default(FtpCommand ftpCommand, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ftpCommand.code;
        }
        if ((i2 & 2) != 0) {
            str = ftpCommand.msg;
        }
        if ((i2 & 4) != 0) {
            z = ftpCommand.isCommand;
        }
        return ftpCommand.copy(i, str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCommand() {
        return this.isCommand;
    }

    @NotNull
    public final FtpCommand copy(int code, @NotNull String msg, boolean isCommand) {
        return new FtpCommand(code, msg, isCommand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FtpCommand)) {
            return false;
        }
        FtpCommand ftpCommand = (FtpCommand) other;
        return this.code == ftpCommand.code && Intrinsics.areEqual(this.msg, ftpCommand.msg) && this.isCommand == ftpCommand.isCommand;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isCommand;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isCommand() {
        return this.isCommand;
    }

    @NotNull
    public String toString() {
        return "FtpCommand(code=" + this.code + ", msg=" + this.msg + ", isCommand=" + this.isCommand + ")";
    }

    public /* synthetic */ FtpCommand(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }

    public FtpCommand(@NotNull String str) {
        this(0, str, true);
    }
}
