package com.xiaomi.fitness.devicesettings.export;

import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"settingsPageUtil", "Lcom/xiaomi/fitness/devicesettings/export/SettingsPageUtil;", "getSettingsPageUtil", "()Lcom/xiaomi/fitness/devicesettings/export/SettingsPageUtil;", "settingsPageUtil$delegate", "Lkotlin/Lazy;", "offline_map_storage_dir_uri", "Landroid/net/Uri;", "getOffline_map_storage_dir_uri", "()Landroid/net/Uri;", "setOffline_map_storage_dir_uri", "(Landroid/net/Uri;)V", "device-settings-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SettingsPageUtilExtKt {

    @Nullable
    private static Uri offline_map_storage_dir_uri;

    @NotNull
    private static final Lazy settingsPageUtil$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e2m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingsPageUtilExtKt.settingsPageUtil_delegate$lambda$0();
        }
    });

    @Nullable
    public static final Uri getOffline_map_storage_dir_uri() {
        return offline_map_storage_dir_uri;
    }

    @NotNull
    public static final SettingsPageUtil getSettingsPageUtil() {
        return (SettingsPageUtil) settingsPageUtil$delegate.getValue();
    }

    public static final void setOffline_map_storage_dir_uri(@Nullable Uri uri) {
        offline_map_storage_dir_uri = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SettingsPageUtil settingsPageUtil_delegate$lambda$0() {
        return ((SettingsPageUtilPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SettingsPageUtilPoint.class)).getSettingsPageUtil();
    }
}
