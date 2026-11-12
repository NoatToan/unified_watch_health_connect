package com.sina.weibo.sdk.web.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.b.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class d extends b {
    public WeiboMultiMessage aC;
    private byte[] aD;
    public String aE;
    public String ac;
    public String packageName;
    private String text;

    public d(AuthInfo authInfo) {
        super(authInfo, 1, null, null);
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final void a(Bundle bundle) {
        WeiboMultiMessage weiboMultiMessage = this.aC;
        if (weiboMultiMessage != null) {
            weiboMultiMessage.writeToBundle(bundle);
        }
        bundle.putString("token", this.ac);
        bundle.putString("packageName", this.packageName);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    @Override // com.sina.weibo.sdk.web.b.b
    public final void b(Bundle bundle) throws Throwable {
        byte[] bArr;
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        this.aC = weiboMultiMessage;
        weiboMultiMessage.readFromBundle(bundle);
        this.ac = bundle.getString("token");
        this.packageName = bundle.getString("packageName");
        StringBuilder sb = new StringBuilder();
        TextObject textObject = this.aC.textObject;
        if (textObject != null) {
            sb.append(textObject.text);
        }
        ImageObject imageObject = this.aC.imageObject;
        if (imageObject != null) {
            String str = imageObject.imagePath;
            if (TextUtils.isEmpty(str)) {
                bArr = imageObject.imageData;
                if (bArr != null) {
                    this.aD = e.b(bArr);
                }
            } else {
                File file = new File(str);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    byte[] bArr2 = new byte[(int) file.length()];
                    FileInputStream fileInputStream = null;
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(file);
                            try {
                                fileInputStream2.read(bArr2);
                                this.aD = e.b(bArr2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                bArr = imageObject.imageData;
                                if (bArr != null) {
                                    this.aD = e.b(bArr);
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    bArr = imageObject.imageData;
                    if (bArr != null && bArr.length > 0) {
                        this.aD = e.b(bArr);
                    }
                }
            }
        }
        this.text = sb.toString();
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final String getUrl() {
        Uri.Builder builderBuildUpon = Uri.parse("https://service.weibo.com/share/mobilesdk.php").buildUpon();
        builderBuildUpon.appendQueryParameter("title", this.text);
        builderBuildUpon.appendQueryParameter("version", "0041005000");
        String appKey = this.aA.b().getAppKey();
        if (!TextUtils.isEmpty(appKey)) {
            builderBuildUpon.appendQueryParameter("source", appKey);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            builderBuildUpon.appendQueryParameter("access_token", this.ac);
        }
        String strR = e.r();
        if (!TextUtils.isEmpty(strR)) {
            builderBuildUpon.appendQueryParameter("aid", strR);
        }
        if (!TextUtils.isEmpty(this.packageName)) {
            builderBuildUpon.appendQueryParameter("packagename", this.packageName);
        }
        if (!TextUtils.isEmpty(this.aE)) {
            builderBuildUpon.appendQueryParameter("picinfo", this.aE);
        }
        builderBuildUpon.appendQueryParameter("luicode", "10000360");
        builderBuildUpon.appendQueryParameter("lfid", "OP_".concat(String.valueOf(appKey)));
        return builderBuildUpon.build().toString();
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final boolean x() {
        byte[] bArr = this.aD;
        if (bArr == null || bArr.length <= 0) {
            return super.x();
        }
        return true;
    }

    public d(Context context) {
        this.context = context;
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final void a(final b.a aVar) {
        com.sina.weibo.sdk.a.b.a.K.a(new com.sina.weibo.sdk.a.d(this.context, new String(this.aD), this.aA.b().getAppKey(), this.ac, new com.sina.weibo.sdk.net.c<String>() { // from class: com.sina.weibo.sdk.web.b.d.1
            @Override // com.sina.weibo.sdk.net.c
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                com.sina.weibo.sdk.b.c.a("WbShareTag", "handle image result :".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.onError("处理图片，服务端返回null!");
                        return;
                    }
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    int iOptInt = jSONObject.optInt("code");
                    String strOptString = jSONObject.optString("data");
                    if (iOptInt != 1 || TextUtils.isEmpty(strOptString)) {
                        b.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.onError("图片内容不合适，禁止上传！");
                            return;
                        }
                        return;
                    }
                    d.this.aE = strOptString;
                    b.a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.onComplete();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    b.a aVar5 = aVar;
                    if (aVar5 != null) {
                        aVar5.onError("解析服务端返回的字符串时发生异常！");
                    }
                }
            }

            @Override // com.sina.weibo.sdk.net.c
            public final void onError(Throwable th) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onError(th.getMessage());
                }
            }
        }));
    }
}
