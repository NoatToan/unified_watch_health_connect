package com.xiaomi.hm.health.nfc.channel;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.xiaomi.hm.health.nfc.channel.TransportChannelImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J$\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R0\u0010\u001a\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R.\u0010\u001d\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u001b0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/nfc/channel/TransportChannelImpl;", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "", "requestAction", "responseAction", "Lcom/huami/watch/transport/DataBundle;", "data", "Lcom/huami/watch/transport/TransportDataItem;", GoogleApiAvailabilityLight.a, "sendAction", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/transport/Transporter;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/watch/transport/Transporter;", "transporter", "Lcom/huami/watch/transport/Transporter$DataListener;", "Lcom/huami/watch/transport/Transporter$DataListener;", "dataListener", "", "Lkotlin/Pair;", "Ljava/util/Map;", "actionMap", "Ljava/util/concurrent/CountDownLatch;", "e", "latchMap", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TransportChannelImpl implements TransportChannel {
    private static final long f = 60000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy transporter = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Transporter.DataListener dataListener = new Transporter.DataListener() { // from class: ty7
        @Override // com.huami.watch.transport.Transporter.DataListener
        public final void onDataReceived(TransportDataItem transportDataItem) {
            TransportChannelImpl.b(this.a, transportDataItem);
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<Pair<String, String>, TransportDataItem> actionMap = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<Pair<String, String>, CountDownLatch> latchMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "sendAction Exception: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/watch/transport/Transporter;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Transporter> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Transporter invoke() {
            Transporter transporter = Transporter.get(TransportChannelImpl.this.context, "com.huami.watch.companion");
            transporter.addDataListener(TransportChannelImpl.this.dataListener);
            transporter.connectTransportService();
            return transporter;
        }
    }

    public TransportChannelImpl(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TransportChannelImpl transportChannelImpl, TransportDataItem transportDataItem) {
        for (Map.Entry<Pair<String, String>, TransportDataItem> entry : transportChannelImpl.actionMap.entrySet()) {
            if (Intrinsics.areEqual(transportDataItem.getAction(), entry.getKey().getSecond())) {
                transportChannelImpl.actionMap.put(entry.getKey(), transportDataItem);
                CountDownLatch countDownLatch = transportChannelImpl.latchMap.get(entry.getKey());
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    private final Transporter c() {
        return (Transporter) this.transporter.getValue();
    }

    private final TransportDataItem d(String requestAction, String responseAction, DataBundle data) {
        Pair<String, String> pair = new Pair<>(requestAction, responseAction);
        this.actionMap.put(pair, null);
        c().send(requestAction, data);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.latchMap.put(pair, countDownLatch);
            countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            this.latchMap.remove(pair);
        } catch (Exception e) {
            LogcatKt.error$default(Logcat.INSTANCE, null, new a(e), 1, null);
        }
        return this.actionMap.remove(pair);
    }

    @Override // com.xiaomi.hm.health.nfc.channel.TransportChannel
    @Nullable
    public TransportDataItem sendAction(@NotNull String requestAction, @Nullable String responseAction, @NotNull DataBundle data) {
        if (responseAction != null) {
            return d(requestAction, responseAction, data);
        }
        c().send(requestAction, data);
        return null;
    }
}
