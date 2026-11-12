package com.xiaomi.fitness.common.extensions;

import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J \u0010\u000b\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR,\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "", "<init>", "()V", "allGranted", "Lkotlin/Function0;", "", "getAllGranted", "()Lkotlin/jvm/functions/Function0;", "setAllGranted", "(Lkotlin/jvm/functions/Function0;)V", "denied", "Lkotlin/Function1;", "", "", "getDenied", "()Lkotlin/jvm/functions/Function1;", "setDenied", "(Lkotlin/jvm/functions/Function1;)V", "callback", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiplePermissionsBuilder {

    @NotNull
    private Function0<Unit> allGranted = new Function0() { // from class: qag
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    @NotNull
    private Function1<? super List<String>, Unit> denied = new Function1() { // from class: rag
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MultiplePermissionsBuilder.denied$lambda$1((List) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit denied$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void allGranted(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.allGranted = callback;
    }

    public final void denied(@NotNull Function1<? super List<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.denied = callback;
    }

    @NotNull
    public final Function0<Unit> getAllGranted() {
        return this.allGranted;
    }

    @NotNull
    public final Function1<List<String>, Unit> getDenied() {
        return this.denied;
    }

    public final void setAllGranted(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.allGranted = function0;
    }

    public final void setDenied(@NotNull Function1<? super List<String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.denied = function1;
    }
}
