package defpackage;

import com.miot.provider.inject.bean.UserInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface atc {
    int getApiLevel();

    String getBusinessType();

    String getCurrentAccountId();

    int getSdkApiLevel();

    void getUserInfo(String str, ya3<UserInfo> ya3Var);

    boolean isInWhiteListHost(String str);
}
