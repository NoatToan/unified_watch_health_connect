package com.huami.passport.data.repository.datasource;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.Keeper;
import com.huami.passport.data.entity.TokenEntity;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.UserInfo;

/* JADX INFO: loaded from: classes12.dex */
public class DiskAccountDataStore implements AccountDataStore {
    private Context context;

    public DiskAccountDataStore(Context context) {
        this.context = context;
    }

    @Override // com.huami.passport.data.repository.datasource.AccountDataStore
    public String getLoginToken() {
        TokenInfo tokenInfo;
        LoginToken tokenCache = Keeper.getTokenCache(this.context);
        if (tokenCache == null || (tokenInfo = tokenCache.getTokenInfo()) == null) {
            return null;
        }
        return tokenInfo.getLoginToken();
    }

    @Override // com.huami.passport.data.repository.datasource.AccountDataStore
    public TokenEntity getTokenEntity() {
        TokenInfo tokenInfo;
        LoginToken tokenCache = Keeper.getTokenCache(this.context);
        if (tokenCache == null || (tokenInfo = tokenCache.getTokenInfo()) == null) {
            return null;
        }
        TokenEntity tokenEntity = new TokenEntity();
        tokenEntity.setUserId(tokenInfo.getUserId());
        tokenEntity.setLoginToken(tokenInfo.getLoginToken());
        tokenEntity.setAppToken(tokenInfo.getAppToken());
        tokenEntity.setAppTtl(tokenInfo.getAppTtl());
        tokenEntity.setTtl(tokenInfo.getTtl());
        tokenEntity.setRegion(tokenCache.getRegion());
        tokenEntity.setLastUpdateAppTtl(tokenInfo.getLastUpdateAppTtl());
        tokenEntity.setLastUpdateTtl(tokenInfo.getLastUpdateTtl());
        return tokenEntity;
    }

    @Override // com.huami.passport.data.repository.datasource.AccountDataStore
    public boolean putTokenEntity(TokenEntity tokenEntity) {
        TokenInfo tokenInfo;
        LoginToken tokenCache = Keeper.getTokenCache(this.context);
        if (tokenCache == null || (tokenInfo = tokenCache.getTokenInfo()) == null) {
            return false;
        }
        String loginToken = tokenEntity.getLoginToken();
        if (!TextUtils.isEmpty(loginToken)) {
            tokenInfo.setLoginToken(loginToken);
        }
        String appToken = tokenEntity.getAppToken();
        if (!TextUtils.isEmpty(appToken)) {
            tokenInfo.setAppToken(appToken);
        }
        long appTtl = tokenEntity.getAppTtl();
        if (appTtl != 0) {
            tokenInfo.setAppTtl(appTtl);
        }
        long ttl = tokenEntity.getTtl();
        if (ttl != 0) {
            tokenInfo.setTtl(ttl);
        }
        String region = tokenEntity.getRegion();
        UserInfo.RegistInfo registInfo = tokenCache.getRegistInfo();
        if (registInfo != null && !TextUtils.isEmpty(region)) {
            registInfo.setRegion(region);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        tokenInfo.setLastUpdateAppTtl(jCurrentTimeMillis);
        tokenInfo.setLastUpdateTtl(jCurrentTimeMillis);
        return Keeper.saveToken(this.context, tokenCache);
    }
}
