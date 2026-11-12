package com.huami.applet.jsengine;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.bluetooth.core.HMAppletProtocolProxyKt;
import com.huami.applet.bluetooth.store.StoreProtocolProxyKt;
import com.huami.applet.extension.JsEngineExtKt;
import com.huami.applet.jsengine.engine.JsEngine;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/applet/jsengine/AppleManager;", "", "", "a", "start", "destroy", "", LogUtil.I, "storeFlag", "Lcom/huami/applet/jsengine/engine/JsEngine;", "b", "Lcom/huami/applet/jsengine/engine/JsEngine;", "dispatchContainer", "", "c", "Z", SnoreMonitorActivity.PAGE_STARTED, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppleManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int storeFlag = 2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JsEngine dispatchContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean started;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("启动服务-蓝牙接收器绑定成功：", AppletConfig.INSTANCE.getHmBaseDevice());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
            if (ByteBuffer.wrap(bArr).get() == AppleManager.this.storeFlag) {
                StoreProtocolProxyKt.getStoreProtocol().dispatchResult(bArr);
            } else {
                JsEngineExtKt.onBlueMessage(AppleManager.this.dispatchContainer, bArr);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "伴生服务启动完成";
        }
    }

    public AppleManager(@NotNull Context context) {
        this.dispatchContainer = ContainerFactoryKt.defaultEngineContainer("main", context);
    }

    private final void a() {
        HMLog.info(ConstantKt.TAG_APPLET, a.a);
        HMAppletProtocolProxyKt.getHMAppletProtocolProxy().onMessage(new b());
        HMLog.info(ConstantKt.TAG_APPLET, c.a);
    }

    public final void destroy() {
        this.started = false;
        this.dispatchContainer.destroy();
    }

    public final void start() {
        a();
        StoreProtocolProxyKt.getStoreProtocol().clearContainer();
    }
}
