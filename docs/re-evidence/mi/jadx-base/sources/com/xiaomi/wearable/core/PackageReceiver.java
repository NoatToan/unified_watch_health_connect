package com.xiaomi.wearable.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.wearable.core.client.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u001c\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/core/PackageReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "receivers", "Ljava/util/ArrayList;", "Lcom/xiaomi/wearable/core/PackageReceiver$PackageChangeReceiver;", "registerPackageReceiver", "", "unregisterPackageReceiver", "addPackageChangeReceiver", "receiver", "removePackageChangeReceiver", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notifyPackageReceivers", "action", "", "TAG", "PackageChangeReceiver", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPackageReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageReceiver.kt\ncom/xiaomi/wearable/core/PackageReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1863#2,2:89\n*S KotlinDebug\n*F\n+ 1 PackageReceiver.kt\ncom/xiaomi/wearable/core/PackageReceiver\n*L\n82#1:89,2\n*E\n"})
public final class PackageReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "PackageReceiver";

    @NotNull
    public static final PackageReceiver INSTANCE = new PackageReceiver();

    @NotNull
    private static final ArrayList<PackageChangeReceiver> receivers = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/core/PackageReceiver$PackageChangeReceiver;", "", "onPackageChange", "", "action", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PackageChangeReceiver {
        void onPackageChange(@NotNull String action);
    }

    private PackageReceiver() {
    }

    private final void notifyPackageReceivers(String action) {
        Logger logger = CoreExtKt.getLogger();
        ArrayList<PackageChangeReceiver> arrayList = receivers;
        logger.i(TAG, "notifyPackageReceivers() called with: action = " + action + ", receivers " + arrayList.size());
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            ((PackageChangeReceiver) it.next()).onPackageChange(action);
        }
    }

    public final void addPackageChangeReceiver(@NotNull PackageChangeReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        receivers.add(receiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action;
        if (intent == null) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (schemeSpecificPart == null || schemeSpecificPart.length() == 0 || (action = intent.getAction()) == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode == -810471698) {
            if (action.equals("android.intent.action.PACKAGE_REPLACED") && com.xiaomi.wearable.CoreExtKt.isLyraApp(schemeSpecificPart)) {
                notifyPackageReceivers("android.intent.action.PACKAGE_REPLACED");
                return;
            }
            return;
        }
        if (iHashCode == 525384130 && action.equals("android.intent.action.PACKAGE_REMOVED") && com.xiaomi.wearable.CoreExtKt.isHealthApp(schemeSpecificPart)) {
            notifyPackageReceivers("android.intent.action.PACKAGE_REMOVED");
        }
    }

    public final void registerPackageReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(this, intentFilter, 2);
            } else {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(this, intentFilter);
            }
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "PackageReceiver register error", e);
        }
    }

    public final void removePackageChangeReceiver(@NotNull PackageChangeReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        receivers.remove(receiver);
    }

    public final void unregisterPackageReceiver() {
        try {
            com.xiaomi.wearable.CoreExtKt.getContext().unregisterReceiver(this);
        } catch (Exception e) {
            CoreExtKt.getLogger().e(TAG, "PackageReceiver unregister error", e);
        }
    }
}
