package com.huami.thirdparty.webauth;

import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/thirdparty/webauth/ShareSourceImpl;", "Lcom/huami/thirdparty/webauth/ShareSource;", "Lcom/huami/http/HttpKit;", "", "trackId", "deviceSource", "shareName", "", "shareSport", "<init>", "()V", "Companion", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class ShareSourceImpl implements ShareSource, HttpKit {
    private static final String a = "ShareSourceImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "shareSport-分享运动信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "shareSport-分享运动信息";
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.thirdparty.webauth.ShareSource
    public boolean shareSport(@NotNull String trackId, @NotNull String deviceSource, @NotNull String shareName) {
        try {
            HMLog.info(a, a.a);
            return HttpKitKtxKt.httpPost$default(this, Api.SHARE_REQUEST_URL, new FormBody.Builder().add("trackId", trackId).add("source", deviceSource).add("shareName", shareName).build(), null, null, 12, null).isSuccessful();
        } catch (Exception e) {
            HMLog.error$default(a, null, e, b.a, 2, null);
            return false;
        }
    }
}
