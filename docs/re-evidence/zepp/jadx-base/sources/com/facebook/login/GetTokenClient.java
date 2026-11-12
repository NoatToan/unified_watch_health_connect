package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/facebook/login/GetTokenClient;", "Lcom/facebook/internal/PlatformServiceClient;", "Landroid/os/Bundle;", "data", "", "populateRequestBundle", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/facebook/login/LoginClient$Request;", "request", "<init>", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class GetTokenClient extends PlatformServiceClient {
    public GetTokenClient(@NotNull Context context, @NotNull LoginClient.Request request) {
        super(context, 65536, 65537, NativeProtocol.PROTOCOL_VERSION_20121101, request.a(), request.getNonce());
    }

    @Override // com.facebook.internal.PlatformServiceClient
    public void populateRequestBundle(@NotNull Bundle data) {
    }
}
