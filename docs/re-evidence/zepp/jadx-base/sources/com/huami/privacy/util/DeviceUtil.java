package com.huami.privacy.util;

import android.content.ContentResolver;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.AndroidId;
import com.huami.privacy.plugin.PrivacyPlugin;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/privacy/util/DeviceUtil;", "", "Landroid/content/ContentResolver;", "resolver", "", "getAndroidId", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceUtil {

    @NotNull
    public static final DeviceUtil INSTANCE = new DeviceUtil();

    private DeviceUtil() {
    }

    @Deprecated(message = "此api已废弃，请勿使用", replaceWith = @ReplaceWith(expression = "PrivacyProvider.get<IsMainProcess>().value", imports = {"com.huami.privacy.PrivacyProvider", "com.huami.privacy.plugin.getAndroidId"}))
    @JvmStatic
    @Nullable
    public static final String getAndroidId(@NotNull ContentResolver resolver) throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("from deprecated getAndroidId".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), AndroidId.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.AndroidId");
                return ((AndroidId) obj).getValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
