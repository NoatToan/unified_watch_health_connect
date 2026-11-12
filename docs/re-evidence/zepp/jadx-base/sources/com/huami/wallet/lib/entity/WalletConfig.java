package com.huami.wallet.lib.entity;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010\u000bR.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0082\u0001\u0010\u001c\u001a\\\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRZ\u0010(\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010\u000b\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/wallet/lib/entity/WalletConfig;", "", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "isShowMessage", "()Lkotlin/jvm/functions/Function0;", "setShowMessage", "(Lkotlin/jvm/functions/Function0;)V", "isShowMessage$annotations", "()V", "Lkotlin/Function4;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "fromActivity", "", "feedbackInfo", "checkedAppLog", "checkedDevicesLog", "b", "Lkotlin/jvm/functions/Function4;", "getOnErrorToFeedback", "()Lkotlin/jvm/functions/Function4;", "setOnErrorToFeedback", "(Lkotlin/jvm/functions/Function4;)V", "getOnErrorToFeedback$annotations", "onErrorToFeedback", "Lkotlin/Function2;", "url", "Landroid/os/Bundle;", "extras", "c", "Lkotlin/jvm/functions/Function2;", "getOnOpenWebUrl", "()Lkotlin/jvm/functions/Function2;", "setOnOpenWebUrl", "(Lkotlin/jvm/functions/Function2;)V", "getOnOpenWebUrl$annotations", "onOpenWebUrl", "<init>", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final class WalletConfig {

    @NotNull
    public static final WalletConfig INSTANCE = new WalletConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static Function0<Boolean> isShowMessage = a.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static Function4<? super Context, ? super String, ? super Boolean, ? super Boolean, Boolean> onErrorToFeedback = b.a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static Function2<? super String, ? super Bundle, Boolean> onOpenWebUrl = c.a;

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
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function4<Context, String, Boolean, Boolean, Boolean> {
        public static final b a = new b();

        public b() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<String, Bundle, Boolean> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        public final boolean a(@NotNull String str, @Nullable Bundle bundle) {
            return false;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, Bundle bundle) {
            return Boolean.valueOf(a(str, bundle));
        }
    }

    private WalletConfig() {
    }

    @NotNull
    public static final Function4<Context, String, Boolean, Boolean, Boolean> getOnErrorToFeedback() {
        return onErrorToFeedback;
    }

    @JvmStatic
    public static /* synthetic */ void getOnErrorToFeedback$annotations() {
    }

    @NotNull
    public static final Function2<String, Bundle, Boolean> getOnOpenWebUrl() {
        return onOpenWebUrl;
    }

    @JvmStatic
    public static /* synthetic */ void getOnOpenWebUrl$annotations() {
    }

    @NotNull
    public static final Function0<Boolean> isShowMessage() {
        return isShowMessage;
    }

    @JvmStatic
    public static /* synthetic */ void isShowMessage$annotations() {
    }

    public static final void setOnErrorToFeedback(@NotNull Function4<? super Context, ? super String, ? super Boolean, ? super Boolean, Boolean> function4) {
        onErrorToFeedback = function4;
    }

    public static final void setOnOpenWebUrl(@NotNull Function2<? super String, ? super Bundle, Boolean> function2) {
        onOpenWebUrl = function2;
    }

    public static final void setShowMessage(@NotNull Function0<Boolean> function0) {
        isShowMessage = function0;
    }
}
