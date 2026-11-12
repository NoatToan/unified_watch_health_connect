package com.huami.device.core.agps.impl;

import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huami/device/core/agps/impl/MiFitHttpClient;", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "", "url", "get", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "a", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "appInfo", "<init>", "(Lcom/huami/device/core/agps/api/bean/AppInfo;)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class MiFitHttpClient implements AgpsHttpClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @Deprecated
    public static final Companion INSTANCE = new Companion(null);
    private static final String b = "MiFitHttpClient";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AppInfo appInfo;

    /* JADX INFO: renamed from: com.huami.device.core.agps.impl.MiFitHttpClient$a, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/device/core/agps/impl/MiFitHttpClient$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MiFitHttpClient(@NotNull AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.device.core.agps.api.AgpsHttpClient
    @Nullable
    public String get(@NotNull String url) throws InterruptedException {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.huami.device.core.agps.impl.MiFitHttpClient.get.1

            /* JADX INFO: renamed from: com.huami.device.core.agps.impl.MiFitHttpClient$get$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "request cancel by user.";
                }
            }

            /* JADX INFO: renamed from: com.huami.device.core.agps.impl.MiFitHttpClient$get$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class b extends Lambda implements Function0<String> {
                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "request APGS by type [" + MiFitHttpClient.this.appInfo.getFileType() + JsonLexerKt.END_LIST;
                }
            }

            /* JADX INFO: renamed from: com.huami.device.core.agps.impl.MiFitHttpClient$get$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            public static final class c extends Lambda implements Function0<String> {
                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "request APGS by type [" + MiFitHttpClient.this.appInfo.getFileType() + JsonLexerKt.END_LIST;
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                Companion unused = MiFitHttpClient.INSTANCE;
                HMLog.warn$default(MiFitHttpClient.b, null, a.a, 2, null);
                countDownLatch.countDown();
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                Companion unused = MiFitHttpClient.INSTANCE;
                HMLog.error$default(MiFitHttpClient.b, "", null, new b(), 4, null);
                countDownLatch.countDown();
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item) {
                Companion unused = MiFitHttpClient.INSTANCE;
                HMLog.warn$default(MiFitHttpClient.b, null, new c(), 2, null);
                countDownLatch.countDown();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@Nullable HMHttpResponseData item) {
                objectRef.element = item != null ? item.getResponseString(Charset.defaultCharset()) : 0;
                countDownLatch.countDown();
            }
        });
        countDownLatch.await(20L, TimeUnit.SECONDS);
        return (String) objectRef.element;
    }
}
