package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.amap.api.mapcore.util.hl;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.huami.tools.analytics.DbUtils;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/facebook/share/internal/LikeStatusClient;", "Lcom/facebook/internal/PlatformServiceClient;", "Landroid/os/Bundle;", "data", "", "populateRequestBundle", "", hl.k, "Ljava/lang/String;", "objectId", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "applicationId", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class LikeStatusClient extends PlatformServiceClient {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String objectId;

    public LikeStatusClient(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        super(context, 65542, 65543, NativeProtocol.PROTOCOL_VERSION_20141001, str, null);
        this.objectId = str2;
    }

    @Override // com.facebook.internal.PlatformServiceClient
    public void populateRequestBundle(@NotNull Bundle data) {
        data.putString(ShareConstants.EXTRA_OBJECT_ID, this.objectId);
    }
}
