package com.facebook.internal.logging.dumpsys;

import android.content.res.Resources;
import com.huami.watch.ota.UpdateUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/ResourcesUtil;", "", "Landroid/content/res/Resources;", "r", "", "resourceId", "", "getIdStringQuietly", "getIdString", "a", "id", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ResourcesUtil {

    @NotNull
    public static final ResourcesUtil INSTANCE = new ResourcesUtil();

    private ResourcesUtil() {
    }

    private final String a(int resourceId) {
        return UpdateUtils.CMD_FILTER + Integer.toHexString(resourceId);
    }

    private final int b(int id) {
        return (id >>> 24) & 255;
    }

    @JvmStatic
    @NotNull
    public static final String getIdString(@Nullable Resources r, int resourceId) throws Resources.NotFoundException {
        String str;
        if (r == null) {
            return INSTANCE.a(resourceId);
        }
        String resourcePackageName = "";
        if (INSTANCE.b(resourceId) != 127) {
            resourcePackageName = r.getResourcePackageName(resourceId);
            str = ":";
        } else {
            str = "";
        }
        String resourceTypeName = r.getResourceTypeName(resourceId);
        String resourceEntryName = r.getResourceEntryName(resourceId);
        StringBuilder sb = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(resourcePackageName);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(resourceEntryName);
        return sb.toString();
    }

    @JvmStatic
    @NotNull
    public static final String getIdStringQuietly(@Nullable Resources r, int resourceId) {
        try {
            return getIdString(r, resourceId);
        } catch (Resources.NotFoundException unused) {
            return INSTANCE.a(resourceId);
        }
    }
}
