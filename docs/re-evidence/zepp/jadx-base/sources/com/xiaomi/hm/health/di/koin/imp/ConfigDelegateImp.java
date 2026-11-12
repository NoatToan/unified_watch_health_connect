package com.xiaomi.hm.health.di.koin.imp;

import com.huami.account.IConfigDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/ConfigDelegateImp;", "Lcom/huami/account/IConfigDelegate;", "", "debug", "supportOverseaAccountBind", "supportSetServerHost", "isShowXiaomiAccountWhenFail", "allowSkipBindPhone", "", "userPropertyPrefix", "userPrivacyPagePath", "countryCode", "isShowUxAgreement", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ConfigDelegateImp implements IConfigDelegate {
    @Override // com.huami.account.IConfigDelegate
    public boolean allowSkipBindPhone() {
        return true;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean debug() {
        return false;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean enableEdmFeature() {
        return IConfigDelegate.DefaultImpls.enableEdmFeature(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean isAutoMutexLogin() {
        return IConfigDelegate.DefaultImpls.isAutoMutexLogin(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean isShowUxAgreement(@Nullable String countryCode) {
        return Intrinsics.areEqual(countryCode, "CN");
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean isShowXiaomiAccountWhenFail() {
        return false;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportNoAreaBindPhone() {
        return IConfigDelegate.DefaultImpls.supportNoAreaBindPhone(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportOverseaAccountBind() {
        return false;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportRegister() {
        return IConfigDelegate.DefaultImpls.supportRegister(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportSetServerHost() {
        return false;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportXiaomiConvertToken() {
        return IConfigDelegate.DefaultImpls.supportXiaomiConvertToken(this);
    }

    @Override // com.huami.account.IConfigDelegate
    @NotNull
    public String userPrivacyPagePath() {
        return "t/posts/watch?category=100&meta_key=tag&meta_value=privacy";
    }

    @Override // com.huami.account.IConfigDelegate
    @NotNull
    public String userPropertyPrefix() {
        return "huami.midong.user";
    }
}
