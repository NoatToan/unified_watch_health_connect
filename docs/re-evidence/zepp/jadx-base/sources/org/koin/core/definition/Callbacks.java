package org.koin.core.definition;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005HÆ\u0003J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003R5\u0010\u0007\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lorg/koin/core/definition/Callbacks;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "component1", "onClose", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/jvm/functions/Function1;", "getOnClose", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Callbacks<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function1<T, Unit> onClose;

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks(@Nullable Function1<? super T, Unit> function1) {
        this.onClose = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Callbacks copy$default(Callbacks callbacks, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = callbacks.onClose;
        }
        return callbacks.copy(function1);
    }

    @Nullable
    public final Function1<T, Unit> component1() {
        return this.onClose;
    }

    @NotNull
    public final Callbacks<T> copy(@Nullable Function1<? super T, Unit> onClose) {
        return new Callbacks<>(onClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Callbacks) && Intrinsics.areEqual(this.onClose, ((Callbacks) other).onClose);
    }

    @Nullable
    public final Function1<T, Unit> getOnClose() {
        return this.onClose;
    }

    public int hashCode() {
        Function1<T, Unit> function1 = this.onClose;
        if (function1 == null) {
            return 0;
        }
        return function1.hashCode();
    }

    @NotNull
    public String toString() {
        return "Callbacks(onClose=" + this.onClose + ')';
    }

    public /* synthetic */ Callbacks(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }
}
