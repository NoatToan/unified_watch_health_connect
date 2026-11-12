package com.huami.core.device.wifi_settings.ui;

import android.content.DialogInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/MenuClickListener;", "", "Landroid/content/DialogInterface;", "dialog", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment$MenuBean;", "menu", "", "onClickMenu", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public interface MenuClickListener {
    void onClickMenu(@NotNull DialogInterface dialog, @NotNull CenterDialogFragment.MenuBean menu);
}
