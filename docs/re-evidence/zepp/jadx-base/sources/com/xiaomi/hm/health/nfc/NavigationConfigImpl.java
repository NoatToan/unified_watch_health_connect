package com.xiaomi.hm.health.nfc;

import android.os.Bundle;
import com.huami.wallet.common.config.NavigationConfig;
import com.xiaomi.hm.health.discovery.WebHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NavigationConfigImpl;", "Lcom/huami/wallet/common/config/NavigationConfig;", "", "url", "Landroid/os/Bundle;", "extras", "", "goToWeb", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NavigationConfigImpl implements NavigationConfig {
    @Override // com.huami.wallet.common.config.NavigationConfig
    public void goToWeb(@NotNull String url, @Nullable Bundle extras) {
        WebHelper.launch(url);
    }
}
