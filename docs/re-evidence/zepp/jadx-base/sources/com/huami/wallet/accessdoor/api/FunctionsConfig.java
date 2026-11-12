package com.huami.wallet.accessdoor.api;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\"(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"|\u0010\u0018\u001a\\\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\"=\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\"(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007\"(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0003\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007¨\u0006)"}, d2 = {"Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getSupportNfcTag", "()Lkotlin/jvm/functions/Function0;", "setSupportNfcTag", "(Lkotlin/jvm/functions/Function0;)V", "supportNfcTag", "Lkotlin/Function4;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "fromActivity", "", "feedbackInfo", "checkedAppLog", "checkedDevicesLog", "b", "Lkotlin/jvm/functions/Function4;", "getOnErrorToFeedback", "()Lkotlin/jvm/functions/Function4;", "setOnErrorToFeedback", "(Lkotlin/jvm/functions/Function4;)V", "onErrorToFeedback", "Lkotlin/Function1;", "url", "", "c", "Lkotlin/jvm/functions/Function1;", "getOpenWebUrl", "()Lkotlin/jvm/functions/Function1;", "setOpenWebUrl", "(Lkotlin/jvm/functions/Function1;)V", "openWebUrl", GoogleApiAvailabilityLight.a, "isShowDetailMessage", "setShowDetailMessage", "e", "isMiFit", "setMiFit", "access-door_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "FunctionsConfig")
public final class FunctionsConfig {

    @NotNull
    private static Function0<Boolean> a = e.a;

    @NotNull
    private static Function4<? super Context, ? super String, ? super Boolean, ? super Boolean, Boolean> b = c.a;

    @NotNull
    private static Function1<? super String, Unit> c = d.a;

    @NotNull
    private static Function0<Boolean> d = b.a;

    @NotNull
    private static Function0<Boolean> e = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function4<Context, String, Boolean, Boolean, Boolean> {
        public static final c a = new c();

        public c() {
            super(4);
        }

        public final boolean a(@NotNull Context context, @NotNull String str, boolean z, boolean z2) {
            return false;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Boolean invoke(Context context, String str, Boolean bool, Boolean bool2) {
            return Boolean.valueOf(a(context, str, bool.booleanValue(), bool2.booleanValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<String, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Boolean> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @NotNull
    public static final Function4<Context, String, Boolean, Boolean, Boolean> getOnErrorToFeedback() {
        return b;
    }

    @NotNull
    public static final Function1<String, Unit> getOpenWebUrl() {
        return c;
    }

    @NotNull
    public static final Function0<Boolean> getSupportNfcTag() {
        return a;
    }

    @NotNull
    public static final Function0<Boolean> isMiFit() {
        return e;
    }

    @NotNull
    public static final Function0<Boolean> isShowDetailMessage() {
        return d;
    }

    public static final void setMiFit(@NotNull Function0<Boolean> function0) {
        e = function0;
    }

    public static final void setOnErrorToFeedback(@NotNull Function4<? super Context, ? super String, ? super Boolean, ? super Boolean, Boolean> function4) {
        b = function4;
    }

    public static final void setOpenWebUrl(@NotNull Function1<? super String, Unit> function1) {
        c = function1;
    }

    public static final void setShowDetailMessage(@NotNull Function0<Boolean> function0) {
        d = function0;
    }

    public static final void setSupportNfcTag(@NotNull Function0<Boolean> function0) {
        a = function0;
    }
}
