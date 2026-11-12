package com.huami.passport.api;

import android.content.Context;
import com.huami.passport.IAccount;
import com.huami.passport.data.net.AccountRestApiImpl;
import com.huami.passport.data.repository.AccountDataRepository;
import com.huami.passport.data.repository.datasource.AccountDataStoreFactory;
import com.huami.passport.domain.AccountCallback;
import com.huami.passport.domain.model.Resource;
import com.huami.passport.domain.model.Status;
import com.huami.passport.domain.model.TokenInfo;
import com.huami.passport.utils.AccountExecutors;
import com.huami.passport.utils.Utils;

/* JADX INFO: loaded from: classes12.dex */
public class TokenHelper {
    public static void authorize(Context context, String str, String str2, boolean z, String str3, String str4, final IAccount.Callback<TokenInfo, String> callback) {
        if (callback == null) {
            return;
        }
        new AccountDataRepository(context, new AccountExecutors(), new AccountDataStoreFactory(context), Utils.getAppInfo(context), new AccountRestApiImpl(context)).authorize(str, str2, z, str3, str4, new AccountCallback<Resource<TokenInfo, String>>() { // from class: com.huami.passport.api.TokenHelper.1
            @Override // com.huami.passport.domain.AccountCallback
            public void onResult(Resource<TokenInfo, String> resource) {
                if (resource.status == Status.SUCCESS) {
                    callback.onSuccess(resource.data);
                }
                if (resource.status == Status.ERROR) {
                    callback.onError(resource.error);
                }
            }
        });
    }

    public static void authorize(Context context, String str, String str2, boolean z, IAccount.Callback<TokenInfo, String> callback) {
        authorize(context, str, str2, z, null, null, callback);
    }

    public static void authorize(Context context, String str, String str2, IAccount.Callback<TokenInfo, String> callback) {
        authorize(context, str, str2, false, null, null, callback);
    }

    public static void authorize(Context context, String str, IAccount.Callback<TokenInfo, String> callback) {
        authorize(context, str, null, false, null, null, callback);
    }

    public static void authorize(Context context, IAccount.Callback<TokenInfo, String> callback) {
        authorize(context, null, null, false, null, null, callback);
    }

    public static void authorize(Context context, boolean z, IAccount.Callback<TokenInfo, String> callback) {
        authorize(context, null, null, z, null, null, callback);
    }
}
