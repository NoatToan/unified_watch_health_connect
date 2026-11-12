package com.xiaomi.hm.health.starsky.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyActivity;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyRrInterval;
import com.xiaomi.hm.health.bt.model.starsky.StarSkySleep;
import com.xiaomi.hm.health.starsky.StartSkyDataCallback;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/starsky/api/FakeStarSkyApiImpl;", "Lcom/xiaomi/hm/health/starsky/api/StarSkyApi;", "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "callback", "", "registerDataCallback", MiPushClient.COMMAND_UNREGISTER, "a", "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "mCallback", "Landroid/os/Handler;", "b", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "mHandler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FakeStarSkyApiImpl implements StarSkyApi {
    private static final int c = 1;
    private static final long d = 60000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private StartSkyDataCallback mCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHandler = LazyKt__LazyJVMKt.lazy(new Function0<FakeStarSkyApiImpl$mHandler$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.starsky.api.FakeStarSkyApiImpl$mHandler$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.xiaomi.hm.health.starsky.api.FakeStarSkyApiImpl$mHandler$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            Looper mainLooper = Looper.getMainLooper();
            final FakeStarSkyApiImpl fakeStarSkyApiImpl = this.a;
            return new Handler(mainLooper) { // from class: com.xiaomi.hm.health.starsky.api.FakeStarSkyApiImpl$mHandler$2.1
                @Override // android.os.Handler
                public void dispatchMessage(@NotNull Message msg) {
                    super.dispatchMessage(msg);
                    if (msg.what == 1) {
                        fakeStarSkyApiImpl.a().sendEmptyMessageDelayed(1, 60000L);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        e.listOf(new StarSkyActivity(jCurrentTimeMillis, RandomKt.Random(100).nextInt()));
                        e.listOf(new StarSkySleep(jCurrentTimeMillis, 0.3f, 0.3f, 0.4f));
                        ArrayList arrayList = new ArrayList();
                        long j = jCurrentTimeMillis - 60000;
                        int i = 0;
                        do {
                            i++;
                            long j2 = 600;
                            long j3 = j + j2;
                            arrayList.add(new StarSkyRrInterval(j3, 600));
                            long j4 = j3 + j2;
                            arrayList.add(new StarSkyRrInterval(j4, 600));
                            j = j4 + ((long) 800);
                            arrayList.add(new StarSkyRrInterval(j, 800));
                        } while (i < 30);
                    }
                }
            };
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler a() {
        return (Handler) this.mHandler.getValue();
    }

    @Override // com.xiaomi.hm.health.starsky.api.StarSkyApi
    public void registerDataCallback(@NotNull StartSkyDataCallback callback) {
        this.mCallback = callback;
        a().sendEmptyMessageDelayed(1, 60000L);
    }

    @Override // com.xiaomi.hm.health.starsky.api.StarSkyApi
    public void unregister() {
        this.mCallback = null;
        a().removeMessages(1);
    }
}
