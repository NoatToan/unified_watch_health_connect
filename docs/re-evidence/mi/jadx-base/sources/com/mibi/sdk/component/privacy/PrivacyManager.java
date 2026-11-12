package com.mibi.sdk.component.privacy;

import android.content.SharedPreferences;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;

/* JADX INFO: loaded from: classes5.dex */
public class PrivacyManager {
    private static final String TAG = "PrivacyManager";

    public static void commitAgreePrivacy(Session session, boolean z) {
        SharedPreferences.Editor editorEdit = session.getUserPreferences(CommonConstants.KEY_AGREE_PRIVACY).edit();
        editorEdit.putBoolean(CommonConstants.KEY_AGREE_PRIVACY, z);
        editorEdit.apply();
    }

    public static boolean hasUploadAgreePrivacy(Session session) {
        return session.getUserPreferences(CommonConstants.KEY_AGREE_PRIVACY).getBoolean(CommonConstants.KEY_AGREE_PRIVACY, false);
    }

    public static void makePrivacyParam(Session session, String str, String str2) {
        MemoryStorage memoryStorage = session.getMemoryStorage();
        String userId = session.getUserId();
        memoryStorage.put(userId, "market", str);
        memoryStorage.put(userId, "entry", str2);
    }

    public static void uploadPrivacy(Session session) throws PaymentException {
        if (session == null) {
            throw new IllegalArgumentException("session should not be null when uploadPrivacy privacy info.");
        }
        if (hasUploadAgreePrivacy(session)) {
            return;
        }
        MemoryStorage memoryStorage = session.getMemoryStorage();
        String userId = session.getUserId();
        MibiLog.d(TAG, "upload privacy marketType = " + memoryStorage.getString(userId, "market", MibiPrivacyUtils.MIBI_MARKET_TYPE));
        memoryStorage.getString(userId, "entry", MibiPrivacyUtils.PRIVACY_HOME_PAGE_ENTRY);
        memoryStorage.getBoolean(userId, CommonConstants.KEY_AGREE, true);
        if (session.getAccountLoader() instanceof FakeAccountLoader) {
            return;
        }
        CommonConstants.getUrl(CommonConstants.PATH_GDPR_AGREE);
    }
}
