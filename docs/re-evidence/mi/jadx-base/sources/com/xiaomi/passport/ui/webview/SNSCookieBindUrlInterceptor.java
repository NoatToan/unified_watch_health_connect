package com.xiaomi.passport.ui.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.CookieManager;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.snscorelib.internal.entity.PassportSnsConstant;
import com.xiaomi.passport.utils.HttpCookies;
import com.xiaomi.passport.webview.UrlInterceptor;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class SNSCookieBindUrlInterceptor implements UrlInterceptor {
    public static final Parcelable.Creator<SNSCookieBindUrlInterceptor> CREATOR = new Parcelable.Creator<SNSCookieBindUrlInterceptor>() { // from class: com.xiaomi.passport.ui.webview.SNSCookieBindUrlInterceptor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SNSCookieBindUrlInterceptor createFromParcel(Parcel parcel) {
            return new SNSCookieBindUrlInterceptor(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SNSCookieBindUrlInterceptor[] newArray(int i) {
            return new SNSCookieBindUrlInterceptor[i];
        }
    };
    public static final String EXTRA_PARCEL_ACCOUNT_INFO = "account_info";
    public final Boolean hasLocalChannel;

    public SNSCookieBindUrlInterceptor(Boolean bool) {
        this.hasLocalChannel = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.xiaomi.passport.webview.UrlInterceptor
    public void release() {
    }

    @Override // com.xiaomi.passport.webview.UrlInterceptor
    public boolean shouldIntercept(Context context, String str) {
        Map<String, String> map = HttpCookies.parse(CookieManager.getInstance().getCookie(str));
        if (!map.containsKey("sns-bind-step")) {
            return false;
        }
        String str2 = map.get("sns-bind-step");
        if (!PassportSnsConstant.SNS_BIND_FINISH.equals(str2) && !PassportSnsConstant.SNS_BIND_CANCEL.equals(str2)) {
            return false;
        }
        AccountInfo accountInfoBuild = new AccountInfo.Builder().userId(map.get("userId")).passToken(map.get("passToken")).hasLocalChannel(this.hasLocalChannel).build();
        XiaomiAccountManager.get(context).addAccountOrUpdatePassToken(accountInfoBuild);
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        Intent intent = new Intent();
        intent.putExtra("account_info", accountInfoBuild);
        activity.setResult(-1, intent);
        activity.finish();
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.hasLocalChannel);
    }

    public SNSCookieBindUrlInterceptor(Parcel parcel) {
        this.hasLocalChannel = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
    }
}
