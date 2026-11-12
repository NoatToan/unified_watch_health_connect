package com.huami.passport.data.repository;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.ErrorCode;
import com.huami.passport.data.entity.ErrorEntity;
import com.huami.passport.data.entity.TokenEntity;
import com.huami.passport.data.entity.mapper.TokenEntityDataMapper;
import com.huami.passport.data.net.AccountRestApi;
import com.huami.passport.data.net.ApiResponse;
import com.huami.passport.data.repository.datasource.AccountDataStore;
import com.huami.passport.data.repository.datasource.AccountDataStoreFactory;
import com.huami.passport.domain.AccountCallback;
import com.huami.passport.domain.model.Resource;
import com.huami.passport.domain.model.TokenInfo;
import com.huami.passport.domain.repository.AccountRepository;
import com.huami.passport.domain.utils.AccountResult;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.entity.Device;
import com.huami.passport.utils.AccountExecutors;
import com.huami.passport.utils.Utils;

/* JADX INFO: loaded from: classes12.dex */
public class AccountDataRepository implements AccountRepository {
    private AppInfo appInfo;
    private Context context;
    private AccountDataStoreFactory dataStoreFactory;
    private AccountDataStore diskDataStore;
    private AccountExecutors executors;
    private AccountRestApi restApi;

    public AccountDataRepository(Context context, AccountExecutors accountExecutors, AccountDataStoreFactory accountDataStoreFactory, AppInfo appInfo, AccountRestApi accountRestApi) {
        this.context = context;
        this.executors = accountExecutors;
        this.dataStoreFactory = accountDataStoreFactory;
        this.appInfo = appInfo;
        this.restApi = accountRestApi;
        this.diskDataStore = accountDataStoreFactory.createDiskDataStore();
    }

    @Override // com.huami.passport.domain.repository.AccountRepository
    public void authorize(final String str, final String str2, final boolean z, final String str3, final String str4, final AccountCallback<Resource<TokenInfo, String>> accountCallback) {
        this.executors.networkIO().execute(new Runnable() { // from class: com.huami.passport.data.repository.AccountDataRepository.1
            @Override // java.lang.Runnable
            public void run() {
                if (accountCallback == null) {
                    return;
                }
                String deviceModel = str3;
                String deviceid = str4;
                String appId = str;
                String loginToken = str2;
                if (z) {
                    Device deviceCache = Utils.getDeviceCache(AccountDataRepository.this.context);
                    if (TextUtils.isEmpty(str3)) {
                        deviceModel = deviceCache.getDeviceModel();
                    }
                    if (TextUtils.isEmpty(str4)) {
                        deviceid = deviceCache.getDeviceid();
                    }
                }
                String str5 = deviceModel;
                String str6 = deviceid;
                if (TextUtils.isEmpty(appId)) {
                    appId = Utils.getAppInfo(AccountDataRepository.this.context).getAppId();
                }
                if (TextUtils.isEmpty(loginToken)) {
                    loginToken = AccountDataRepository.this.diskDataStore.getLoginToken();
                    if (TextUtils.isEmpty(loginToken)) {
                        AccountResult.onCallback(accountCallback, Resource.error(ErrorCode.NO_LOGIN_ERROR));
                        return;
                    }
                }
                AccountResult.onCallback(accountCallback, Resource.loading(null));
                ApiResponse<TokenEntity, ErrorEntity> apiResponseAuthorize = AccountDataRepository.this.restApi.authorize(appId, loginToken, z, str5, str6);
                if (!apiResponseAuthorize.isSuccessful()) {
                    AccountResult.onCallback(accountCallback, Resource.error(apiResponseAuthorize.getError().getErrorCode()));
                    return;
                }
                TokenEntity body = apiResponseAuthorize.getBody();
                if (TextUtils.equals(AccountDataRepository.this.appInfo.getAppId(), appId) && !z) {
                    AccountDataRepository.this.diskDataStore.putTokenEntity(body);
                }
                AccountResult.onCallback(accountCallback, Resource.success(TokenEntityDataMapper.transform(body)));
            }
        });
    }

    @Override // com.huami.passport.domain.repository.AccountRepository
    public void authorize(String str, String str2, AccountCallback<Resource<TokenInfo, String>> accountCallback) {
        authorize(str, str2, false, "", "", accountCallback);
    }
}
