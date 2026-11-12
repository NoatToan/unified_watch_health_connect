package com.huami.watch.companion.usersettings;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.facestore.database.WactchFacesProvider;
import com.huami.watch.companion.settings.WatchSettings;
import com.huami.watch.util.StorageUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/companion/usersettings/BackupUriCompat;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "updateUriConfig", "a", "b", "c", "", "Ljava/lang/String;", "BACKUP_PACKAGE_NAME", "SUFFIX_SETTINGS", "SUFFIX_FILE", GoogleApiAvailabilityLight.a, "SUFFIX_WATCH_FACE", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class BackupUriCompat {

    @NotNull
    public static final BackupUriCompat INSTANCE = new BackupUriCompat();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String BACKUP_PACKAGE_NAME = "com.huami.app.amazfit";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String SUFFIX_SETTINGS = ".settings";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String SUFFIX_FILE = ".fileprovider";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String SUFFIX_WATCH_FACE = ".FACE_SOURCE";

    private BackupUriCompat() {
    }

    private final void a() {
        StorageUtil.setProviderAuth("com.huami.app.amazfit.fileprovider");
    }

    private final void b() {
        Uri uri = Uri.parse("content://com.huami.app.amazfit.settings");
        SettingsEntry.setUri(uri);
        WatchSettings.SettingsEntry.setUri(uri);
    }

    private final void c() {
        WactchFacesProvider.setUri(Uri.parse("content://com.huami.app.amazfit.FACE_SOURCE"));
    }

    @JvmStatic
    public static final void updateUriConfig(@NotNull Context context) {
        String packageName = context.getPackageName();
        BackupUriCompat backupUriCompat = INSTANCE;
        if (Intrinsics.areEqual(packageName, "com.huami.app.amazfit")) {
            backupUriCompat.b();
            backupUriCompat.a();
            backupUriCompat.c();
        }
    }
}
