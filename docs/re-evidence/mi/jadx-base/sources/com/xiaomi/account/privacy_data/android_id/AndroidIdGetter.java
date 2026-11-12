package com.xiaomi.account.privacy_data.android_id;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.account.privacy_data.lib.IPrivacyDataGetter;
import com.xiaomi.account.privacy_data.lib.PrivacyDataException;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidIdGetter implements IPrivacyDataGetter {
    @Override // com.xiaomi.account.privacy_data.lib.IPrivacyDataGetter
    public String get(Context context, String... strArr) throws PrivacyDataException {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(string)) {
            throw new PrivacyDataException("get empty android-id from settings provider");
        }
        return string;
    }
}
