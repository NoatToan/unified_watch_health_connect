package com.huami.applet;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.applet.event.HMBleDeviceEvent;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/applet/AppletConfig;", "", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppletConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_DEVICE_SOURCE = 229;

    @Nullable
    private static HMBleDeviceEvent a;

    @Nullable
    private static String b;

    @NotNull
    private static final ReadWriteProperty<Object, Context> c;

    @Nullable
    private static HMBaseDevice d;

    @NotNull
    private static final ReadWriteProperty<Object, IMessageManager> e;

    @Nullable
    private static List<? extends Interceptor> f;

    @NotNull
    private static ThreadPoolExecutor g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010:R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010&\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/huami/applet/AppletConfig$Companion;", "", "Lcom/huami/applet/event/HMBleDeviceEvent;", "hmBleDeviceEvent", "Lcom/huami/applet/event/HMBleDeviceEvent;", "getHmBleDeviceEvent", "()Lcom/huami/applet/event/HMBleDeviceEvent;", "setHmBleDeviceEvent", "(Lcom/huami/applet/event/HMBleDeviceEvent;)V", "", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Landroid/content/Context;", "<set-?>", "appContext$delegate", "Lkotlin/properties/ReadWriteProperty;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "appContext", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getHmBaseDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "setHmBaseDevice", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Lcom/huami/applet/IMessageManager;", "messageManager$delegate", "getMessageManager", "()Lcom/huami/applet/IMessageManager;", "setMessageManager", "(Lcom/huami/applet/IMessageManager;)V", "messageManager", "", "Lokhttp3/Interceptor;", "interceptors", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "setInterceptors", "(Ljava/util/List;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setExecutor", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "", "DEFAULT_DEVICE_SOURCE", LogUtil.I, "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "appContext", "getAppContext()Landroid/content/Context;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "messageManager", "getMessageManager()Lcom/huami/applet/IMessageManager;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Context getAppContext() {
            return (Context) AppletConfig.c.getValue(this, a[0]);
        }

        @NotNull
        public final ThreadPoolExecutor getExecutor() {
            return AppletConfig.g;
        }

        @Nullable
        public final HMBaseDevice getHmBaseDevice() {
            return AppletConfig.d;
        }

        @Nullable
        public final HMBleDeviceEvent getHmBleDeviceEvent() {
            return AppletConfig.a;
        }

        @Nullable
        public final List<Interceptor> getInterceptors() {
            return AppletConfig.f;
        }

        @NotNull
        public final IMessageManager getMessageManager() {
            return (IMessageManager) AppletConfig.e.getValue(this, a[1]);
        }

        @Nullable
        public final String getUserId() {
            return AppletConfig.b;
        }

        public final void setAppContext(@NotNull Context context) {
            AppletConfig.c.setValue(this, a[0], context);
        }

        public final void setExecutor(@NotNull ThreadPoolExecutor threadPoolExecutor) {
            AppletConfig.g = threadPoolExecutor;
        }

        public final void setHmBaseDevice(@Nullable HMBaseDevice hMBaseDevice) {
            AppletConfig.d = hMBaseDevice;
        }

        public final void setHmBleDeviceEvent(@Nullable HMBleDeviceEvent hMBleDeviceEvent) {
            AppletConfig.a = hMBleDeviceEvent;
        }

        public final void setInterceptors(@Nullable List<? extends Interceptor> list) {
            AppletConfig.f = list;
        }

        public final void setMessageManager(@NotNull IMessageManager iMessageManager) {
            AppletConfig.e.setValue(this, a[1], iMessageManager);
        }

        public final void setUserId(@Nullable String str) {
            AppletConfig.b = str;
        }
    }

    static {
        Delegates delegates = Delegates.INSTANCE;
        c = delegates.notNull();
        e = delegates.notNull();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 8, 5000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.huami.applet.AppletConfig$Companion$executor$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String THREAD_NAME_STEM = "applet_%d";

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final AtomicInteger mThreadId = new AtomicInteger(0);

            @NotNull
            public final String getTHREAD_NAME_STEM() {
                return this.THREAD_NAME_STEM;
            }

            @Override // java.util.concurrent.ThreadFactory
            @NotNull
            public Thread newThread(@NotNull Runnable r) {
                Thread thread = new Thread(r);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                thread.setName(String.format(this.THREAD_NAME_STEM, Arrays.copyOf(new Object[]{Integer.valueOf(this.mThreadId.getAndIncrement())}, 1)));
                return thread;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        g = threadPoolExecutor;
    }
}
