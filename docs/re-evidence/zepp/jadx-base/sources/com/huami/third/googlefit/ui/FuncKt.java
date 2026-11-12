package com.huami.third.googlefit.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\"(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getGoogleFitAuthSuccessCallback", "()Lkotlin/jvm/functions/Function0;", "setGoogleFitAuthSuccessCallback", "(Lkotlin/jvm/functions/Function0;)V", "googleFitAuthSuccessCallback", "b", "getGoogleFitRevokeSuccessCallback", "setGoogleFitRevokeSuccessCallback", "googleFitRevokeSuccessCallback", "googlefit-ui_release"}, k = 2, mv = {1, 4, 1})
public final class FuncKt {

    @NotNull
    private static Function0<Unit> a = a.a;

    @NotNull
    private static Function0<Unit> b = b.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @NotNull
    public static final Function0<Unit> getGoogleFitAuthSuccessCallback() {
        return a;
    }

    @NotNull
    public static final Function0<Unit> getGoogleFitRevokeSuccessCallback() {
        return b;
    }

    public static final void setGoogleFitAuthSuccessCallback(@NotNull Function0<Unit> function0) {
        a = function0;
    }

    public static final void setGoogleFitRevokeSuccessCallback(@NotNull Function0<Unit> function0) {
        b = function0;
    }
}
