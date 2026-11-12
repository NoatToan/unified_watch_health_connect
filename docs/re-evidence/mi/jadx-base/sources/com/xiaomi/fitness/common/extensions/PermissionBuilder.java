package com.xiaomi.fitness.common.extensions;

import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005J)\u0010\u000f\u001a\u00020\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005R5\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "", "<init>", "()V", "granted", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "permission", "", "getGranted", "()Lkotlin/jvm/functions/Function1;", "setGranted", "(Lkotlin/jvm/functions/Function1;)V", "denied", "getDenied", "setDenied", "callback", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionBuilder {

    @NotNull
    private Function1<? super String, Unit> granted = new Function1() { // from class: qrh
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PermissionBuilder.granted$lambda$0((String) obj);
        }
    };

    @NotNull
    private Function1<? super String, Unit> denied = new Function1() { // from class: rrh
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PermissionBuilder.denied$lambda$1((String) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit denied$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit granted$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void denied(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.denied = callback;
    }

    @NotNull
    public final Function1<String, Unit> getDenied() {
        return this.denied;
    }

    @NotNull
    public final Function1<String, Unit> getGranted() {
        return this.granted;
    }

    public final void granted(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.granted = callback;
    }

    public final void setDenied(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.denied = function1;
    }

    public final void setGranted(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.granted = function1;
    }
}
