package com.huami.account.ui.simplify.external;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.account.HMLogoutManager;
import com.huami.web.container.IWeb;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/huami/account/ui/simplify/external/WebImpl;", "Lcom/huami/web/container/IWeb;", "", "startRunning", "", SOAP.XMLNS, "downloadSuccessStrKeeper", "", "id", "keepDownloadApkId", "name", "downloadManagerPut", "logoutByExpire", "mutexTime", "mutex", AbstractJSONTokenResponse.RESPONSE, "dealWebActivityLoginInvalid", "<init>", "()V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public final class WebImpl implements IWeb {
    @Override // com.huami.web.container.IWeb
    public void dealWebActivityLoginInvalid(@Nullable String response) {
        HMLogoutManager.dealWebActivityLoginInvalid(response);
    }

    @Override // com.huami.web.container.IWeb
    public void downloadManagerPut(long id, @NotNull String name) {
    }

    @Override // com.huami.web.container.IWeb
    public void downloadSuccessStrKeeper(@NotNull String s) {
    }

    @Override // com.huami.web.container.IWeb
    public void keepDownloadApkId(long id) {
    }

    @Override // com.huami.web.container.IWeb
    public void logoutByExpire() {
        HMLogoutManager.logout(2);
    }

    @Override // com.huami.web.container.IWeb
    public void mutex(long mutexTime) {
        HMLogoutManager.mutex(mutexTime);
    }

    @Override // com.huami.web.container.IWeb
    public void startRunning() {
    }
}
