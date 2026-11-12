package com.huami.tools.crashreport;

import android.content.Context;
import android.net.Uri;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.transdata.transport.Actions;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.acra.config.CoreConfiguration;
import org.acra.data.StringFormat;
import org.acra.sender.HttpSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0080\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0014¨\u0006\u001d"}, d2 = {"Lcom/huami/tools/crashreport/HuamiHttpSender;", "Lorg/acra/sender/HttpSender;", "Lorg/acra/config/CoreConfiguration;", "configuration", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lorg/acra/sender/HttpSender$Method;", "method", "", CameraActivity.KEY_CONTENT_TYPE, "login", "password", "", "connectionTimeOut", "socketTimeOut", "", Actions.KEY_HEADERS, "content", "Ljava/net/URL;", "url", "", "Landroid/net/Uri;", "attachments", "", "sendHttpRequests", "config", "<init>", "(Lorg/acra/config/CoreConfiguration;)V", "Companion", "crash-report_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiHttpSender extends HttpSender {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String HOST_PROD = "https://app-analytics.huami.com/";

    @NotNull
    public static final String HOST_TEST = "https://api-analytics-test.huami.com/";
    private static final String h = "api/v5/exception/android";
    private static final String i = "appid";
    private static final String j = "encrypt";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/tools/crashreport/HuamiHttpSender$Companion;", "", "", "host", "getReportUrl", "appId", "", "getConstantHeaders", "HEADER_APP_ID", "Ljava/lang/String;", "HEADER_ENCRYPT", "HOST_PROD", "HOST_TEST", "PATH_EXCEPTION", "<init>", "()V", "crash-report_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Map<String, String> getConstantHeaders(@NotNull String appId) {
            HashMap map = new HashMap(1);
            map.put("appid", appId);
            return map;
        }

        @NotNull
        public final String getReportUrl(@NotNull String host) {
            return host + HuamiHttpSender.h;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HuamiHttpSender(@NotNull CoreConfiguration coreConfiguration) {
        super(coreConfiguration, HttpSender.Method.POST, StringFormat.JSON);
    }

    @Override // org.acra.sender.HttpSender
    public void sendHttpRequests(@NotNull CoreConfiguration configuration, @NotNull Context context, @NotNull HttpSender.Method method, @NotNull String contentType, @Nullable String login, @Nullable String password, int connectionTimeOut, int socketTimeOut, @Nullable Map<String, String> headers, @NotNull String content, @NotNull URL url, @NotNull List<? extends Uri> attachments) throws IOException {
        String strC = a.b().c(content);
        HashMap map = new HashMap(2);
        map.put(j, strC);
        if (headers != null) {
            map.putAll(headers);
        }
        super.sendHttpRequests(configuration, context, method, contentType, login, password, connectionTimeOut, socketTimeOut, map, content, url, attachments);
    }
}
