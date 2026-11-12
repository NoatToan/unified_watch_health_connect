package com.huami.watch.companion.watchface.cloud;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.account.service.AccountService;
import com.huami.account.service.model.Area;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.AccountManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.loc.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\u001a5\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\"\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r\"\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\r\"\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\r\"\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\r\"\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\r\"\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\r\"\u0016\u0010!\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\r\"\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\r¨\u0006&"}, d2 = {"", "deviceKey", "page", "", "diy", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "getWatchSkins", "(IIZLandroid/content/Context;)[Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "", "a", "Ljava/lang/String;", "TAG", "b", "URL_WATCH_SKIN_LIST", "c", "KEY_DIY", GoogleApiAvailabilityLight.a, "KEY_DEVICE", "e", "KEY_IDS", "f", "KEY_PAGE", "g", "KEY_PER_PAGE", "h", "KEY_USER_COUNTRY", "i", "KEY_USER_REGION", z.j, LogUtil.I, "DEFAULT_PER_PAGE", hl.k, "VALUE_ENABLE", "l", "VALUE_DISABLE", "companion_release"}, k = 2, mv = {1, 5, 1})
public final class WatchSkinAPIKt {

    @NotNull
    private static final String a = "WatchSkinAPI";

    @NotNull
    private static final String b = "market/watch/apps/1";

    @NotNull
    private static final String c = "customizable";

    @NotNull
    private static final String d = "device";

    @NotNull
    private static final String e = "ids";

    @NotNull
    private static final String f = "page";

    @NotNull
    private static final String g = "per_page";

    @NotNull
    private static final String h = "user_country";

    @NotNull
    private static final String i = "user_region";
    private static final int j = 36;

    @NotNull
    private static final String k = "enable";

    @NotNull
    private static final String l = "disable";

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final WatchSkinBean[] getWatchSkins(int i2, int i3, boolean z, @NotNull Context context) {
        Area userArea;
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        Koin orNull = GlobalContext.INSTANCE.getOrNull();
        String value = null;
        AccountService accountService = orNull == null ? null : (AccountService) orNull.getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
        systemParams.put(c, z ? "enable" : "disable");
        systemParams.put("device", Integer.valueOf(i2));
        systemParams.put("page", Integer.valueOf(i3));
        systemParams.put(g, 36);
        if (accountService != null && (userArea = accountService.getUserArea()) != null) {
            value = userArea.getValue();
        }
        systemParams.put("user_country", value);
        systemParams.put("user_region", AccountManager.getDefault(context.getApplicationContext()).getCurrentRegion());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HMWebUtil.doRequest(HMServerDef.getUrl(b), systemParams, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.huami.watch.companion.watchface.cloud.WatchSkinAPIKt.getWatchSkins.1

            /* JADX INFO: renamed from: com.huami.watch.companion.watchface.cloud.WatchSkinAPIKt$getWatchSkins$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "item: " + this.a.getResponseString();
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.companion.watchface.cloud.WatchSkinAPIKt$getWatchSkins$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "item: " + this.a.getResponseString();
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinAPIKt.a, new a(item));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info(WatchSkinAPIKt.a, new b(item));
                if (item.isSuccess()) {
                    objectRef.element = new Gson().fromJson(item.getResponseString(), WatchSkinBean[].class);
                }
            }
        });
        return (WatchSkinBean[]) objectRef.element;
    }
}
