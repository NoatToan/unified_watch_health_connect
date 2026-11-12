package com.garmin.android.gncs.telephony;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.telecom.Call;
import android.telecom.InCallService;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\f\u0010\u0019\u001a\u00020\f*\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/gncs/telephony/GNCSInCallService;", "Landroid/telecom/InCallService;", "()V", "callStateListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/telecom/Call;", "Landroid/telecom/Call$Callback;", "answerCall", "", "disconnectCall", "findCallWithState", RemoteConfigConstants.ResponseFieldKey.STATE, "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCallAdded", "call", "onCallRemoved", "onUnbind", "", "rejectCall", "rejectMessage", "", "currentState", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GNCSInCallService extends InCallService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile GNCSInCallService instance;
    private final ConcurrentHashMap<Call, Call.Callback> callStateListeners = new ConcurrentHashMap<>();

    private final int currentState(Call call) {
        return Build.VERSION.SDK_INT >= 31 ? call.getDetails().getState() : call.getState();
    }

    private final void disconnectCall() {
        ih2.b.b("InCallService.disconnectCall -> Attempting to disconnect any active call.");
        Call callFindCallWithState = findCallWithState(4);
        if (callFindCallWithState == null) {
            ih2.b.b("InCallService.disconnectCall -> No active call");
        } else {
            callFindCallWithState.disconnect();
        }
    }

    private final Call findCallWithState(int state) {
        Object next;
        List<Call> calls = getCalls();
        calls.getClass();
        Iterator<T> it = calls.iterator();
        while (it.hasNext()) {
            next = it.next();
            Call call = (Call) next;
            call.getClass();
            if (currentState(call) == state) {
                return (Call) next;
            }
        }
        next = null;
        return (Call) next;
    }

    public static /* synthetic */ void rejectCall$default(GNCSInCallService gNCSInCallService, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        gNCSInCallService.rejectCall(str);
    }

    public final void answerCall() {
        ih2.b.b("InCallService.answerCall -> Attempting to answer call");
        Call callFindCallWithState = findCallWithState(2);
        if (callFindCallWithState == null) {
            ih2.b.b("InCallService.answerCall -> No active call");
        } else {
            callFindCallWithState.answer(0);
        }
    }

    @Override // android.telecom.InCallService, android.app.Service
    public IBinder onBind(Intent intent) {
        ih2.b.b("InCallService - onBind: " + (intent != null ? intent.getAction() : null));
        instance = this;
        return super.onBind(intent);
    }

    @Override // android.telecom.InCallService
    public void onCallAdded(Call call) {
        call.getClass();
        super.onCallAdded(call);
        ih2.b.b("InCallService.onCallAdded -> Added call  " + call.getDetails());
        Call.Callback callback = new Call.Callback() { // from class: com.garmin.android.gncs.telephony.GNCSInCallService$onCallAdded$callback$1
            @Override // android.telecom.Call.Callback
            public void onStateChanged(Call call2, int newState) {
                super.onStateChanged(call2, newState);
                ih2.b.b("Call state changed to " + newState + ": " + (call2 != null ? call2.getDetails() : null));
            }
        };
        this.callStateListeners.put(call, callback);
        call.registerCallback(callback);
    }

    @Override // android.telecom.InCallService
    public void onCallRemoved(Call call) {
        call.getClass();
        super.onCallRemoved(call);
        ih2.b.b("InCallService.onCallRemoved -> Removed call " + call.getDetails());
        Call.Callback callbackRemove = this.callStateListeners.remove(call);
        if (callbackRemove != null) {
            call.unregisterCallback(callbackRemove);
        }
    }

    @Override // android.telecom.InCallService, android.app.Service
    public boolean onUnbind(Intent intent) {
        ih2.b.b("InCallService - onUnbind: " + (intent != null ? intent.getAction() : null));
        instance = null;
        return super.onUnbind(intent);
    }

    public final void rejectCall(String rejectMessage) {
        ih2.b.b("InCallService.rejectCall -> Attempting to reject call with message: " + rejectMessage);
        Call callFindCallWithState = findCallWithState(2);
        if (callFindCallWithState == null) {
            ih2.b.b("InCallService.rejectCall -> No active call. Trying to disconnect any active call if exists.");
            disconnectCall();
        } else if (rejectMessage != null) {
            callFindCallWithState.reject(true, rejectMessage);
        } else if (Build.VERSION.SDK_INT >= 30) {
            callFindCallWithState.reject(1);
        } else {
            callFindCallWithState.reject(false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/gncs/telephony/GNCSInCallService$Companion;", "", "()V", "<set-?>", "Lcom/garmin/android/gncs/telephony/GNCSInCallService;", "instance", "getInstance", "()Lcom/garmin/android/gncs/telephony/GNCSInCallService;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final GNCSInCallService getInstance() {
            return GNCSInCallService.instance;
        }

        private Companion() {
        }
    }
}
