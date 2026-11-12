package com.huami.account.ui.simplify;

import com.huami.account.IConfigDelegate;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/account/ui/simplify/SimpleAccountConfig;", "Lcom/huami/account/IConfigDelegate;", "", "debug", "supportOverseaAccountBind", "supportSetServerHost", "<init>", "()V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public class SimpleAccountConfig implements IConfigDelegate {
    @Override // com.huami.account.IConfigDelegate
    public boolean allowSkipBindPhone() {
        return IConfigDelegate.DefaultImpls.allowSkipBindPhone(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean debug() {
        return true;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean isShowXiaomiAccountWhenFail() {
        return IConfigDelegate.DefaultImpls.isShowXiaomiAccountWhenFail(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportOverseaAccountBind() {
        return true;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportRegister() {
        return IConfigDelegate.DefaultImpls.supportRegister(this);
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportSetServerHost() {
        return true;
    }

    @Override // com.huami.account.IConfigDelegate
    public boolean supportXiaomiConvertToken() {
        return IConfigDelegate.DefaultImpls.supportXiaomiConvertToken(this);
    }
}
