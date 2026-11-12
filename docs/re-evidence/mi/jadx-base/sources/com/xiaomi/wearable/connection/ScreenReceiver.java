package com.xiaomi.wearable.connection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.connection.ScreenReceiver;
import com.xiaomi.wearable.core.CoreExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u001a\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/wearable/connection/ScreenReceiver;", "", "<init>", "()V", "receiver", "Lcom/xiaomi/wearable/connection/ScreenReceiver$Receiver;", "getReceiver", "()Lcom/xiaomi/wearable/connection/ScreenReceiver$Receiver;", "receiver$delegate", "Lkotlin/Lazy;", "receiverList", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "", "", LoginPreferenceConfig.TYPE_REGISTER, "addReceiver", "removeReceiver", "notifyScreenEvent", "event", "TAG", "Receiver", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenReceiver.kt\ncom/xiaomi/wearable/connection/ScreenReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1863#2,2:54\n*S KotlinDebug\n*F\n+ 1 ScreenReceiver.kt\ncom/xiaomi/wearable/connection/ScreenReceiver\n*L\n37#1:54,2\n*E\n"})
public final class ScreenReceiver {

    @NotNull
    private static final String TAG = "ScreenReceiver";

    @NotNull
    public static final ScreenReceiver INSTANCE = new ScreenReceiver();

    /* JADX INFO: renamed from: receiver$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy receiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qgl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScreenReceiver.receiver_delegate$lambda$0();
        }
    });

    @NotNull
    private static final ArrayList<Function1<String, Unit>> receiverList = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/connection/ScreenReceiver$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            String action;
            CoreExtKt.getLogger().i(ScreenReceiver.TAG, "onReceive() called with: context = " + context + ", intent = " + intent);
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            ScreenReceiver.INSTANCE.notifyScreenEvent(action);
        }
    }

    private ScreenReceiver() {
    }

    private final Receiver getReceiver() {
        return (Receiver) receiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyScreenEvent(String event) {
        Iterator<T> it = receiverList.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Receiver receiver_delegate$lambda$0() {
        return new Receiver();
    }

    public final void addReceiver(@NotNull Function1<? super String, Unit> receiver2) {
        Intrinsics.checkNotNullParameter(receiver2, "receiver");
        ArrayList<Function1<String, Unit>> arrayList = receiverList;
        if (arrayList.contains(receiver2)) {
            return;
        }
        arrayList.add(receiver2);
    }

    public final void register() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        try {
            com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getReceiver(), intentFilter);
        } catch (Exception unused) {
        }
    }

    public final void removeReceiver(@NotNull Function1<? super String, Unit> receiver2) {
        Intrinsics.checkNotNullParameter(receiver2, "receiver");
        receiverList.remove(receiver2);
    }
}
