package com.huami.account.ui.simplify;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.IAccountDelegate;
import com.huami.account.ICommonDelegate;
import com.huami.account.IConfigDelegate;
import com.huami.account.ui.simplify.external.DefaultExternalInitializer;
import com.huami.account.ui.simplify.external.ExternalInitializer;
import com.huami.account.utils.AppChannel;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0010\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/huami/account/ui/simplify/AccountInitParams;", "", "Lcom/huami/account/IAccountDelegate;", "component1", "Lcom/huami/account/ICommonDelegate;", "component2", "Lcom/huami/account/IConfigDelegate;", "component3", "Lcom/huami/account/utils/AppChannel;", "component4", "Lcom/huami/account/ui/simplify/external/ExternalInitializer;", "component5", "delegate", NavigateContent.TOPIC_COMMON_TYPE, "config", "flavor", "externalInitializer", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/account/IAccountDelegate;", "getDelegate", "()Lcom/huami/account/IAccountDelegate;", "b", "Lcom/huami/account/ICommonDelegate;", "getCommon", "()Lcom/huami/account/ICommonDelegate;", "c", "Lcom/huami/account/IConfigDelegate;", "getConfig", "()Lcom/huami/account/IConfigDelegate;", GoogleApiAvailabilityLight.a, "Lcom/huami/account/utils/AppChannel;", "getFlavor", "()Lcom/huami/account/utils/AppChannel;", "e", "Lcom/huami/account/ui/simplify/external/ExternalInitializer;", "getExternalInitializer", "()Lcom/huami/account/ui/simplify/external/ExternalInitializer;", "<init>", "(Lcom/huami/account/IAccountDelegate;Lcom/huami/account/ICommonDelegate;Lcom/huami/account/IConfigDelegate;Lcom/huami/account/utils/AppChannel;Lcom/huami/account/ui/simplify/external/ExternalInitializer;)V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class AccountInitParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final IAccountDelegate delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ICommonDelegate common;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final IConfigDelegate config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final AppChannel flavor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final ExternalInitializer externalInitializer;

    public AccountInitParams(@NotNull IAccountDelegate iAccountDelegate, @NotNull ICommonDelegate iCommonDelegate, @NotNull IConfigDelegate iConfigDelegate, @NotNull AppChannel appChannel, @NotNull ExternalInitializer externalInitializer) {
        this.delegate = iAccountDelegate;
        this.common = iCommonDelegate;
        this.config = iConfigDelegate;
        this.flavor = appChannel;
        this.externalInitializer = externalInitializer;
    }

    public static /* synthetic */ AccountInitParams copy$default(AccountInitParams accountInitParams, IAccountDelegate iAccountDelegate, ICommonDelegate iCommonDelegate, IConfigDelegate iConfigDelegate, AppChannel appChannel, ExternalInitializer externalInitializer, int i, Object obj) {
        if ((i & 1) != 0) {
            iAccountDelegate = accountInitParams.delegate;
        }
        if ((i & 2) != 0) {
            iCommonDelegate = accountInitParams.common;
        }
        ICommonDelegate iCommonDelegate2 = iCommonDelegate;
        if ((i & 4) != 0) {
            iConfigDelegate = accountInitParams.config;
        }
        IConfigDelegate iConfigDelegate2 = iConfigDelegate;
        if ((i & 8) != 0) {
            appChannel = accountInitParams.flavor;
        }
        AppChannel appChannel2 = appChannel;
        if ((i & 16) != 0) {
            externalInitializer = accountInitParams.externalInitializer;
        }
        return accountInitParams.copy(iAccountDelegate, iCommonDelegate2, iConfigDelegate2, appChannel2, externalInitializer);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IAccountDelegate getDelegate() {
        return this.delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ICommonDelegate getCommon() {
        return this.common;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IConfigDelegate getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppChannel getFlavor() {
        return this.flavor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ExternalInitializer getExternalInitializer() {
        return this.externalInitializer;
    }

    @NotNull
    public final AccountInitParams copy(@NotNull IAccountDelegate delegate, @NotNull ICommonDelegate common, @NotNull IConfigDelegate config, @NotNull AppChannel flavor, @NotNull ExternalInitializer externalInitializer) {
        return new AccountInitParams(delegate, common, config, flavor, externalInitializer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountInitParams)) {
            return false;
        }
        AccountInitParams accountInitParams = (AccountInitParams) other;
        return Intrinsics.areEqual(this.delegate, accountInitParams.delegate) && Intrinsics.areEqual(this.common, accountInitParams.common) && Intrinsics.areEqual(this.config, accountInitParams.config) && Intrinsics.areEqual(this.flavor, accountInitParams.flavor) && Intrinsics.areEqual(this.externalInitializer, accountInitParams.externalInitializer);
    }

    @NotNull
    public final ICommonDelegate getCommon() {
        return this.common;
    }

    @NotNull
    public final IConfigDelegate getConfig() {
        return this.config;
    }

    @NotNull
    public final IAccountDelegate getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final ExternalInitializer getExternalInitializer() {
        return this.externalInitializer;
    }

    @NotNull
    public final AppChannel getFlavor() {
        return this.flavor;
    }

    public int hashCode() {
        IAccountDelegate iAccountDelegate = this.delegate;
        int iHashCode = (iAccountDelegate != null ? iAccountDelegate.hashCode() : 0) * 31;
        ICommonDelegate iCommonDelegate = this.common;
        int iHashCode2 = (iHashCode + (iCommonDelegate != null ? iCommonDelegate.hashCode() : 0)) * 31;
        IConfigDelegate iConfigDelegate = this.config;
        int iHashCode3 = (iHashCode2 + (iConfigDelegate != null ? iConfigDelegate.hashCode() : 0)) * 31;
        AppChannel appChannel = this.flavor;
        int iHashCode4 = (iHashCode3 + (appChannel != null ? appChannel.hashCode() : 0)) * 31;
        ExternalInitializer externalInitializer = this.externalInitializer;
        return iHashCode4 + (externalInitializer != null ? externalInitializer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccountInitParams(delegate=" + this.delegate + ", common=" + this.common + ", config=" + this.config + ", flavor=" + this.flavor + ", externalInitializer=" + this.externalInitializer + ")";
    }

    public /* synthetic */ AccountInitParams(IAccountDelegate iAccountDelegate, ICommonDelegate iCommonDelegate, IConfigDelegate iConfigDelegate, AppChannel appChannel, ExternalInitializer externalInitializer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iAccountDelegate, (i & 2) != 0 ? new SimpleCommonDelegate() : iCommonDelegate, (i & 4) != 0 ? new SimpleAccountConfig() : iConfigDelegate, (i & 8) != 0 ? AppChannel.Unknown : appChannel, (i & 16) != 0 ? new DefaultExternalInitializer() : externalInitializer);
    }
}
