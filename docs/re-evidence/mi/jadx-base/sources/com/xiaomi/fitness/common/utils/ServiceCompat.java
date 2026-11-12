package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.content.Intent;
import defpackage.ni4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ServiceCompat;", "", "<init>", "()V", "startForegroundService", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceCompat {

    @NotNull
    public static final ServiceCompat INSTANCE = new ServiceCompat();

    private ServiceCompat() {
    }

    public final void startForegroundService(@Nullable Context context, @Nullable Intent intent) {
        try {
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNull(intent);
            ni4.o(context, intent);
        } catch (Exception unused) {
        }
    }
}
