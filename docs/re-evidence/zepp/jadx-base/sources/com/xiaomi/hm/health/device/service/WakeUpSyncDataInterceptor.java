package com.xiaomi.hm.health.device.service;

import android.os.Handler;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.service.WakeUpSyncDataInterceptor;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001e\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/service/WakeUpSyncDataInterceptor;", "", "", GoogleApiAvailabilityLight.a, "Lkotlin/Function0;", "", "action", "e", "", "b", "runWithSyncStrategy", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "tag", "", LogUtil.I, "SYNC_DELAY_START_MILLIS", "c", "SYNC_DELAY_END_MILLIS", "SYNC_INTERVAL_NUMBER", "wakeUpCount", "Landroid/os/Handler;", "f", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WakeUpSyncDataInterceptor {

    @NotNull
    public static final WakeUpSyncDataInterceptor INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int SYNC_DELAY_START_MILLIS = 1000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int SYNC_DELAY_END_MILLIS = 59000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int SYNC_INTERVAL_NUMBER = 2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static int wakeUpCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy handler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Delay " + this.a + " to sync.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Handler> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler();
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
            return "Sync intercept,current wakeUpCount: " + WakeUpSyncDataInterceptor.wakeUpCount + ".";
        }
    }

    static {
        WakeUpSyncDataInterceptor wakeUpSyncDataInterceptor = new WakeUpSyncDataInterceptor();
        INSTANCE = wakeUpSyncDataInterceptor;
        tag = wakeUpSyncDataInterceptor.getClass().getSimpleName();
        handler = LazyKt__LazyJVMKt.lazy(b.a);
    }

    private WakeUpSyncDataInterceptor() {
    }

    private final long b() {
        int iRandom = kotlin.ranges.e.random(new IntRange(1000, SYNC_DELAY_END_MILLIS), Random.Default);
        HMLog.info(tag, new a(iRandom));
        return iRandom;
    }

    private final Handler c() {
        return (Handler) handler.getValue();
    }

    private final boolean d() {
        return wakeUpCount % 2 != 0;
    }

    private final void e(final Function0<Unit> action) {
        c().postDelayed(new Runnable() { // from class: tc8
            @Override // java.lang.Runnable
            public final void run() {
                WakeUpSyncDataInterceptor.f(action);
            }
        }, b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0) {
        function0.invoke();
    }

    public final void runWithSyncStrategy(@NotNull Function0<Unit> action) {
        wakeUpCount++;
        if (d()) {
            HMLog.info(tag, c.a);
        } else {
            e(action);
        }
    }
}
