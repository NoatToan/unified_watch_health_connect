package com.huami.arch.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001R\u0019\u0010\u000b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/arch/core/Fail;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "", "other", "", "equals", "", "hashCode", "", "component1", "error", "copy", "", "toString", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "arch_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Fail<T> extends State<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Throwable error;

    public Fail(@NotNull Throwable th) {
        super(null);
        this.error = th;
    }

    public static /* synthetic */ Fail copy$default(Fail fail, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = fail.error;
        }
        return fail.copy(th);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    public final Fail<T> copy(@NotNull Throwable error) {
        return new Fail<>(error);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof Fail)) {
            return false;
        }
        Throwable th = ((Fail) other).error;
        return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(this.error.getClass()), Reflection.getOrCreateKotlinClass(th.getClass())) && Intrinsics.areEqual(this.error.getMessage(), th.getMessage()) && Intrinsics.areEqual(this.error.getStackTrace()[0], th.getStackTrace()[0]);
    }

    @NotNull
    public final Throwable getError() {
        return this.error;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Reflection.getOrCreateKotlinClass(this.error.getClass()), this.error.getMessage(), this.error.getStackTrace()[0]});
    }

    @NotNull
    public String toString() {
        return "Fail(error=" + this.error + ")";
    }
}
