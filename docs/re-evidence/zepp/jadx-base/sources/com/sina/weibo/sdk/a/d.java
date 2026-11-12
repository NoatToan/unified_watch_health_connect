package com.sina.weibo.sdk.a;

import android.content.Context;
import com.sina.weibo.sdk.net.HttpManager;
import com.tencent.open.SocialConstants;
import com.twitter.sdk.android.core.internal.oauth.OAuthConstants;

/* JADX INFO: loaded from: classes18.dex */
public final class d extends c<Void, Void, String> {
    private com.sina.weibo.sdk.net.c<String> Z;
    private Throwable aa;
    private String ab;
    private String ac;
    private String appKey;
    private Context context;

    public d(Context context, String str, String str2, String str3, com.sina.weibo.sdk.net.c<String> cVar) {
        this.context = context;
        this.ab = str;
        this.appKey = str2;
        this.ac = str3;
        this.Z = cVar;
    }

    private String e(String str) {
        return HttpManager.a(this.context, com.sina.weibo.sdk.b.e.r(), this.ac, this.appKey, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sina.weibo.sdk.a.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String o() {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            com.sina.weibo.sdk.net.e.a aVar = new com.sina.weibo.sdk.net.e.a();
            aVar.i = "https://service.weibo.com/share/mobilesdk_uppic.php";
            return new com.sina.weibo.sdk.net.b().a(aVar.a("aid", com.sina.weibo.sdk.b.e.r()).a(OAuthConstants.PARAM_TIMESTAMP, strValueOf).a("oauth_sign", e(strValueOf)).b("appKey", this.appKey).b("aid", com.sina.weibo.sdk.b.e.r()).b(OAuthConstants.PARAM_TIMESTAMP, strValueOf).b("oauth_sign", e(strValueOf)).b(SocialConstants.PARAM_IMG_URL, this.ab).h()).i();
        } catch (Throwable th) {
            th.printStackTrace();
            this.aa = th;
            return null;
        }
    }

    @Override // com.sina.weibo.sdk.a.c
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        Throwable th = this.aa;
        if (th != null) {
            com.sina.weibo.sdk.net.c<String> cVar = this.Z;
            if (cVar != null) {
                cVar.onError(th);
                return;
            }
            return;
        }
        com.sina.weibo.sdk.net.c<String> cVar2 = this.Z;
        if (cVar2 != null) {
            cVar2.a(str2);
        }
    }
}
