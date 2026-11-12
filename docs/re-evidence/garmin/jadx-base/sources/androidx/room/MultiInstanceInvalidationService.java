package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10707b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10708c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10709d = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/j$a;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j.a {
        public a() {
        }

        @Override // androidx.room.j
        public final void E(i iVar, int i14) {
            iVar.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f10708c) {
                multiInstanceInvalidationService.f10708c.unregister(iVar);
            }
        }

        @Override // androidx.room.j
        public final void c0(int i14, String[] strArr) {
            strArr.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f10708c) {
                try {
                    String str = (String) multiInstanceInvalidationService.f10707b.get(Integer.valueOf(i14));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.f10708c.beginBroadcast();
                    int i15 = 0;
                    while (true) {
                        b bVar = multiInstanceInvalidationService.f10708c;
                        if (i15 >= iBeginBroadcast) {
                            bVar.finishBroadcast();
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        try {
                            Object broadcastCookie = bVar.getBroadcastCookie(i15);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService.f10707b.get(num);
                            if (i14 != iIntValue && str.equals(str2)) {
                                try {
                                    multiInstanceInvalidationService.f10708c.getBroadcastItem(i15).H(strArr);
                                    Unit unit2 = Unit.INSTANCE;
                                } catch (RemoteException unused) {
                                }
                            }
                            i15++;
                        } catch (Throwable th3) {
                            multiInstanceInvalidationService.f10708c.finishBroadcast();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // androidx.room.j
        public final int y(i iVar, String str) {
            iVar.getClass();
            int i14 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f10708c) {
                try {
                    int i15 = multiInstanceInvalidationService.f10706a + 1;
                    multiInstanceInvalidationService.f10706a = i15;
                    if (multiInstanceInvalidationService.f10708c.register(iVar, Integer.valueOf(i15))) {
                        multiInstanceInvalidationService.f10707b.put(Integer.valueOf(i15), str);
                        i14 = i15;
                    } else {
                        multiInstanceInvalidationService.f10706a--;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return i14;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/i;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends RemoteCallbackList<i> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            ((i) iInterface).getClass();
            obj.getClass();
            MultiInstanceInvalidationService.this.f10707b.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f10709d;
    }
}
