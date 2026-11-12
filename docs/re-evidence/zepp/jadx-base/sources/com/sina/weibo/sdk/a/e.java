package com.sina.weibo.sdk.a;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes18.dex */
public final class e extends c<Void, Void, String> {
    private com.sina.weibo.sdk.net.c<String> Z;
    private Throwable aa;
    private Oauth2AccessToken ad;
    private String appKey;

    public e(String str, Oauth2AccessToken oauth2AccessToken, com.sina.weibo.sdk.net.c<String> cVar) {
        this.appKey = str;
        this.ad = oauth2AccessToken;
        this.Z = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sina.weibo.sdk.a.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String o() {
        try {
            com.sina.weibo.sdk.net.e.a aVar = new com.sina.weibo.sdk.net.e.a();
            aVar.i = "https://api.weibo.com/oauth2/access_token";
            return new com.sina.weibo.sdk.net.b().a(aVar.b("client_id", this.appKey).b("appKey", this.appKey).b("grant_type", "refresh_token").b("refresh_token", this.ad.getRefreshToken()).h()).i();
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
