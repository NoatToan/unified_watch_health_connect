package com.xiaomi.wearable.yrn.helper;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J4\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableRNPushHandler;", "Lcom/xiaomi/wearable/yrn/export/YRNPushHandler;", "<init>", "()V", "hasInit", "", "messages", "Ljava/util/LinkedList;", "Lcom/facebook/react/bridge/WritableMap;", "afterInit", "", "clearMessages", "handlePushRNPage", WearableRNPushHandler.KEY_PAGE_URL, "", "operationSource", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "handlePushMessage", "handleNotificationClick", "handleSchemeMessage", "dealPushMessage", "source", "nativePushType", "", "type", "sendJSEvent", "body", "realSendJSEvent", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableRNPushHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNPushHandler.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNPushHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1863#2,2:117\n*S KotlinDebug\n*F\n+ 1 WearableRNPushHandler.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNPushHandler\n*L\n110#1:117,2\n*E\n"})
public final class WearableRNPushHandler implements YRNPushHandler {

    @NotNull
    private static final String KEY_PAGE_URL = "pageUrl";

    @NotNull
    private static final String KEY_SOURCE = "source";

    @NotNull
    private static final String KEY_TYPE = "type";

    @NotNull
    private static final String TAG = "WearableRNPushHandler";
    private boolean hasInit;

    @NotNull
    private final LinkedList<WritableMap> messages = new LinkedList<>();

    private final WritableMap dealPushMessage(Uri uri, String source, int nativePushType) {
        String queryParameter = uri.getQueryParameter(KEY_PAGE_URL);
        String str = queryParameter == null ? "" : queryParameter;
        String queryParameter2 = uri.getQueryParameter("type");
        return dealPushMessage$default(this, str, queryParameter2 == null ? "" : queryParameter2, source, nativePushType, null, 16, null);
    }

    public static /* synthetic */ WritableMap dealPushMessage$default(WearableRNPushHandler wearableRNPushHandler, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        return wearableRNPushHandler.dealPushMessage(str, str2, str3, i, str4);
    }

    private final void realSendJSEvent() {
        Logger.i(TAG, "realSendJSEvent " + this.messages.size());
        if (!this.messages.isEmpty()) {
            Iterator<T> it = this.messages.iterator();
            while (it.hasNext()) {
                WearableRNManager.INSTANCE.sendJSEventMap("YRN_APP_INTERNAL_PUSH_MESSAGE", (WritableMap) it.next());
            }
            this.messages.clear();
        }
    }

    private final void sendJSEvent(WritableMap body) {
        this.messages.add(body);
        Logger.i(TAG, "sendJSEvent hasInit:" + this.hasInit);
        if (this.hasInit) {
            realSendJSEvent();
        }
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void afterInit() {
        this.hasInit = true;
        realSendJSEvent();
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void clearMessages() {
        this.messages.clear();
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void handleNotificationClick(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        sendJSEvent(dealPushMessage(uri, "Push", 2));
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void handlePushMessage(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        sendJSEvent(dealPushMessage(uri, "Push", 1));
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void handlePushRNPage(@NotNull String pageUrl, @Nullable String operationSource) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        sendJSEvent(dealPushMessage(pageUrl, "operation", "Internal", 5, operationSource));
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void handleSchemeMessage(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        sendJSEvent(dealPushMessage(uri, "AppLinks", 4));
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNPushHandler
    public void handlePushRNPage(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter(KEY_PAGE_URL);
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter("source");
        handlePushRNPage(queryParameter, queryParameter2 != null ? queryParameter2 : "");
    }

    private final WritableMap dealPushMessage(String pageUrl, String type, String source, int nativePushType, String operationSource) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", type);
        writableMapCreateMap.putString("source", source);
        writableMapCreateMap.putInt("__native_push_type", nativePushType);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString(KEY_PAGE_URL, pageUrl);
        if (operationSource == null) {
            operationSource = "";
        }
        writableMapCreateMap2.putString("operationSource", operationSource);
        writableMapCreateMap.putMap("message", writableMapCreateMap2);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
