package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "maxClientId", "I", "getMaxClientId$room_runtime_release", "()I", "setMaxClientId$room_runtime_release", "(I)V", "", "", "clientNames", "Ljava/util/Map;", "getClientNames$room_runtime_release", "()Ljava/util/Map;", "Landroid/os/RemoteCallbackList;", "Landroidx/room/a;", "callbackList", "Landroid/os/RemoteCallbackList;", "getCallbackList$room_runtime_release", "()Landroid/os/RemoteCallbackList;", "Landroidx/room/b$a;", "binder", "Landroidx/room/b$a;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0})
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;

    @NotNull
    private final Map<Integer, String> clientNames = new LinkedHashMap();

    @NotNull
    private final RemoteCallbackList<a> callbackList = new RemoteCallbackList<a>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(a callback, Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            this.this$0.getClientNames$room_runtime_release().remove((Integer) cookie);
        }
    };

    @NotNull
    private final b.a binder = new b.a() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.b
        public void broadcastInvalidation(int clientId, String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList<a> callbackList$room_runtime_release = this.this$0.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (callbackList$room_runtime_release) {
                try {
                    String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(clientId));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i);
                            Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(num);
                            if (clientId != iIntValue && Intrinsics.areEqual(str, str2)) {
                                try {
                                    ((a) multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i)).onInvalidation(tables);
                                    Unit unit = Unit.INSTANCE;
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.room.b
        public int registerCallback(a callback, String name) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<a> callbackList$room_runtime_release = this.this$0.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (callbackList$room_runtime_release) {
                try {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId), name);
                        i = maxClientId;
                    } else {
                        multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // androidx.room.b
        public void unregisterCallback(a callback, int clientId) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList<a> callbackList$room_runtime_release = this.this$0.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(clientId));
            }
        }
    };

    @NotNull
    public final RemoteCallbackList<a> getCallbackList$room_runtime_release() {
        return this.callbackList;
    }

    @NotNull
    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.clientNames;
    }

    /* JADX INFO: renamed from: getMaxClientId$room_runtime_release, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }

    public final void setMaxClientId$room_runtime_release(int i) {
        this.maxClientId = i;
    }
}
