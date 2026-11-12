package com.xiaomi.wearable.yrn.internal.imageload;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.wearable.yrn.internal.imageload.FrescoConfigUtils;
import defpackage.hpf;
import defpackage.hy6;
import defpackage.i7h;
import defpackage.k5d;
import defpackage.qyo;
import defpackage.tpo;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/wearable/yrn/internal/imageload/FrescoConfigUtils;", "", "Landroid/content/Context;", "context", "", "getMaxCacheSize", "(Landroid/content/Context;)I", "Lcom/xiaomi/wearable/yrn/internal/imageload/FrescoMemoryTrimmableRegistry;", "frescoMemoryTrimmableRegistry", "Lk5d;", "getDefaultConfig", "(Landroid/content/Context;Lcom/xiaomi/wearable/yrn/internal/imageload/FrescoMemoryTrimmableRegistry;)Lk5d;", "", "TAG", "Ljava/lang/String;", "MAX_CACHE_ENTRIES_SIZE", "I", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FrescoConfigUtils {

    @NotNull
    public static final FrescoConfigUtils INSTANCE = new FrescoConfigUtils();
    public static final int MAX_CACHE_ENTRIES_SIZE = 192;

    @NotNull
    public static final String TAG = "Fresco";

    private FrescoConfigUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hpf getDefaultConfig$lambda$0(int i) {
        return new hpf(i, 192, 192, 192, i);
    }

    private final int getMaxCacheSize(Context context) {
        Object systemService = context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(((ActivityManager) systemService).getMemoryClass() * EventRecurrence.TH, Integer.MAX_VALUE);
        if (iCoerceAtMost < 33554432) {
            return 4194304;
        }
        if (iCoerceAtMost < 67108864) {
            return 6291456;
        }
        return iCoerceAtMost / 5;
    }

    @NotNull
    public final k5d getDefaultConfig(@NotNull Context context, @Nullable FrescoMemoryTrimmableRegistry frescoMemoryTrimmableRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashSet hashSet = new HashSet();
        hashSet.add(new qyo());
        k5d.b bVarK = i7h.a(context.getApplicationContext(), new OkHttpClient()).G(true).L(true).F(Bitmap.Config.RGB_565).I(frescoMemoryTrimmableRegistry).K(hashSet);
        final int maxCacheSize = getMaxCacheSize(context);
        bVarK.E(new tpo() { // from class: dpa
            @Override // defpackage.tpo
            public final Object get() {
                return FrescoConfigUtils.getDefaultConfig$lambda$0(maxCacheSize);
            }
        });
        if (Build.VERSION.SDK_INT < 28) {
            bVarK.H(hy6.m(context).n(4194304L).m());
        }
        k5d k5dVarD = bVarK.D();
        Intrinsics.checkNotNullExpressionValue(k5dVarD, "build(...)");
        return k5dVarD;
    }
}
