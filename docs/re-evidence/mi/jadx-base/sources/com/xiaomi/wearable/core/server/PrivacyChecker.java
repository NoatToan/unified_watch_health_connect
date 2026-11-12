package com.xiaomi.wearable.core.server;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.xiaomi.wearable.core.CoreExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/core/server/PrivacyChecker;", "", "<init>", "()V", "TAG", "", "checkPrivacy", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrivacyChecker {

    @NotNull
    public static final PrivacyChecker INSTANCE = new PrivacyChecker();

    @NotNull
    private static final String TAG = "PrivacyChecker";

    private PrivacyChecker() {
    }

    public final boolean checkPrivacy() {
        CoreExtKt.getLogger().i(TAG, "checkMainAppPrivacy() called channel " + CoreExtKt.getChannel());
        if (CoreExtKt.getChannel() == null) {
            CoreExtKt.setChannel("com.mi.health");
        }
        try {
            Uri uri = Uri.parse("content://" + CoreExtKt.getChannel() + ".provider.main");
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append("/privacy#isPrivacyAgree");
            String string = sb.toString();
            if (Build.VERSION.SDK_INT < 29) {
                return true;
            }
            Bundle bundleCall = com.xiaomi.wearable.CoreExtKt.getContext().getContentResolver().call(uri, string, (String) null, (Bundle) null);
            CoreExtKt.getLogger().i(TAG, "checkMainAppPrivacy() called " + (bundleCall != null ? Boolean.valueOf(bundleCall.getBoolean("privacy_agree")) : null));
            if (bundleCall != null) {
                return bundleCall.getBoolean("privacy_agree", true);
            }
            return true;
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "checkHealthAppPrivacy() error ", e);
            return true;
        }
    }
}
