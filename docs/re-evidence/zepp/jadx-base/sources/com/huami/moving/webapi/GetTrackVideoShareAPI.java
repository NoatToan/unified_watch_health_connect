package com.huami.moving.webapi;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/webapi/GetTrackVideoShareAPI;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GetTrackVideoShareAPI {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "v1/sport/shareRoute";

    @NotNull
    private static final String b = "trackId";

    @NotNull
    private static final String c = "source";

    @NotNull
    private static final String d = "avatar";

    @NotNull
    private static final String e = "username";

    @NotNull
    private static final String f = "sportType";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/huami/moving/webapi/GetTrackVideoShareAPI$Companion;", "", "", "trackId", "", "source", "", "sportType", "avatar", "username", "Lcom/huami/network/base/handler/IHMBasicHttpResponseHandler;", "handler", "", "getSportShareUrl", "PARAM_SHARE_AVATAR", "Ljava/lang/String;", "PARAM_SHARE_SOURCE", "PARAM_SHARE_SPORT_TYPE", "PARAM_SHARE_TRACK_ID", "PARAM_SHARE_USERNAME", "WEB_API_SPORT_SHARE", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void getSportShareUrl(long trackId, @NotNull String source, int sportType, @Nullable String avatar, @Nullable String username, @Nullable IHMBasicHttpResponseHandler handler) {
            String str = HMServerDef.getHost() + GetTrackVideoShareAPI.a;
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("trackId", Long.valueOf(trackId));
            systemParams.put("source", source);
            if (avatar != null) {
                systemParams.put("avatar", avatar);
            }
            if (username == null) {
                username = "";
            }
            systemParams.put("username", username);
            systemParams.put("sportType", Integer.valueOf(sportType));
            HMWebUtil.doRequest(str, systemParams, Support.RequestSupport.GET, handler);
        }
    }
}
