package com.huami.watch.wififtp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/watch/wififtp/MalformedServerReplyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "component1", "msg", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class MalformedServerReplyException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String msg;

    /* JADX WARN: Multi-variable type inference failed */
    public MalformedServerReplyException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MalformedServerReplyException(@Nullable String str) {
        super(str);
        this.msg = str;
    }

    public static /* synthetic */ MalformedServerReplyException copy$default(MalformedServerReplyException malformedServerReplyException, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = malformedServerReplyException.msg;
        }
        return malformedServerReplyException.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final MalformedServerReplyException copy(@Nullable String msg) {
        return new MalformedServerReplyException(msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof MalformedServerReplyException) && Intrinsics.areEqual(this.msg, ((MalformedServerReplyException) other).msg);
        }
        return true;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        String str = this.msg;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "MalformedServerReplyException(msg=" + this.msg + ")";
    }

    public /* synthetic */ MalformedServerReplyException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
