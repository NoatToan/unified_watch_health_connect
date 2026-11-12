package com.xiaomi.account.privacy_data.oaid;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.account.privacy_data.lib.IPrivacyDataGetter;
import com.xiaomi.account.privacy_data.lib.PrivacyDataException;
import com.xiaomi.account.privacy_data.oaid.impl.OAIDFactory;

/* JADX INFO: loaded from: classes6.dex */
public class OAIDGetter implements IPrivacyDataGetter {
    @Override // com.xiaomi.account.privacy_data.lib.IPrivacyDataGetter
    public String get(Context context, String... strArr) throws PrivacyDataException {
        final String[] strArr2 = new String[1];
        OAIDFactory.create(context).doGet(new IGetter() { // from class: com.xiaomi.account.privacy_data.oaid.OAIDGetter.1
            @Override // com.xiaomi.account.privacy_data.oaid.IGetter
            public void onOAIDGetComplete(String str) {
                strArr2[0] = str;
            }

            @Override // com.xiaomi.account.privacy_data.oaid.IGetter
            public void onOAIDGetError(Exception exc) {
            }
        });
        if (TextUtils.isEmpty(strArr2[0])) {
            throw new PrivacyDataException("get a empty OAID from 3rd sdk");
        }
        return strArr2[0];
    }
}
