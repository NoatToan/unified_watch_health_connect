package com.huami.passport.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class LoginToken extends Entity {

    @SerializedName("data")
    private Data data;

    @SerializedName("domain")
    private Domain domain;

    @SerializedName(Configs.Params.DOMAINS)
    private List<HttpDNS> domains;

    @SerializedName("provider")
    private String provider;

    @SerializedName(Configs.Params.REGIST_INFO)
    private UserInfo.RegistInfo registInfo;

    @SerializedName(Configs.Params.TOKEN_INFO)
    private TokenInfo tokenInfo;

    @SerializedName(Configs.Params.THIRDPARTY_INFO)
    private UserInfo userInfo;

    public Data getData() {
        return this.data;
    }

    public Domain getDomain() {
        return this.domain;
    }

    public List<HttpDNS> getDomains() {
        return this.domains;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getRegion() {
        UserInfo userInfo = getUserInfo();
        return (userInfo == null || userInfo.getRegistInfo() == null) ? "cn" : userInfo.getRegistInfo().getRegion();
    }

    public UserInfo.RegistInfo getRegistInfo() {
        return this.registInfo;
    }

    public TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public boolean isLogin() {
        TokenInfo tokenInfo = this.tokenInfo;
        return (tokenInfo == null || TextUtils.isEmpty(tokenInfo.getAppToken()) || TextUtils.isEmpty(this.tokenInfo.getLoginToken())) ? false : true;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public void setDomains(List<HttpDNS> list) {
        this.domains = list;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setRegistInfo(UserInfo.RegistInfo registInfo) {
        this.registInfo = registInfo;
    }

    public void setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoginToken{tokenInfo=");
        sb.append(this.tokenInfo);
        sb.append(", provider='");
        sb.append(this.provider);
        sb.append('\'');
        sb.append(", registInfo=");
        sb.append(this.registInfo);
        sb.append(", userInfo=");
        sb.append(this.userInfo);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", domains=");
        List<HttpDNS> list = this.domains;
        sb.append(list != null ? Integer.valueOf(list.size()) : "");
        sb.append(", user_id=");
        sb.append(getUserId());
        sb.append('}');
        return sb.toString();
    }
}
