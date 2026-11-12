package com.xiaomi.wearable.wear.api;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.xiaomi.wearable.core.CoreExtKt;
import defpackage.lem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/wear/api/ProxyDataManager;", "", "Landroid/content/Intent;", "intent", "", "restoreProxyData", "(Landroid/content/Intent;)V", "", "hasProxyData", "()Z", "clearProxyData", "()V", "", "TAG", "Ljava/lang/String;", "Llem;", "proxyData", "Llem;", "getProxyData", "()Llem;", "setProxyData", "(Llem;)V", "<init>", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class ProxyDataManager {

    @NotNull
    public static final ProxyDataManager INSTANCE = new ProxyDataManager();

    @NotNull
    private static final String TAG = "ProxyDataManager";

    @Nullable
    private static lem proxyData;

    private ProxyDataManager() {
    }

    public final void clearProxyData() {
        proxyData = null;
    }

    @Nullable
    public final lem getProxyData() {
        return proxyData;
    }

    public final boolean hasProxyData() {
        boolean z = proxyData != null;
        CoreExtKt.getLogger().i(TAG, "hasProxyData() called " + z);
        return z;
    }

    public final void restoreProxyData(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        lem lemVar = new lem();
        lemVar.f24978a = (BluetoothDevice) intent.getParcelableExtra("device");
        lemVar.f24979b = intent.getIntExtra("status", 0);
        lemVar.c = intent.getIntExtra("newState", 0);
        lemVar.e = intent.getStringExtra("characterUuid");
        lemVar.d = intent.getStringExtra("serviceUuid");
        lemVar.g = intent.getIntExtra("mtu", 0);
        lemVar.h = intent.getIntExtra("rssi", 0);
        lemVar.i = intent.getByteArrayExtra("data");
        lemVar.j = intent.getLongExtra("time", 0L);
        CoreExtKt.getLogger().i(TAG, "restoreDataFromIntent: " + lemVar);
        proxyData = lemVar;
    }

    public final void setProxyData(@Nullable lem lemVar) {
        proxyData = lemVar;
    }
}
