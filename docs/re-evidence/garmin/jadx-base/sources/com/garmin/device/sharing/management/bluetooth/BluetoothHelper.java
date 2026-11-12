package com.garmin.device.sharing.management.bluetooth;

import an2.l;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import bn2.c;
import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/device/sharing/management/bluetooth/BluetoothHelper;", "Lbn2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "BTDisabledException", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BluetoothHelper implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f50935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bn2.a f50937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet<String> f50938e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/sharing/management/bluetooth/BluetoothHelper$BTDisabledException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BTDisabledException extends Exception {
        public BTDisabledException() {
            super("BT is unavailable");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50939a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            l.f4589a.getClass();
            return LoggerFactory.getLogger("DM#".concat("BluetoothHelper"));
        }
    }

    public BluetoothHelper(Context context) {
        context.getClass();
        this.f50934a = context;
        this.f50935b = m.b(a.f50939a);
        this.f50936c = new byte[0];
        this.f50938e = new CopyOnWriteArraySet<>();
    }

    @Override // bn2.c
    public final HashSet a() throws BTDisabledException {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            throw new BTDisabledException();
        }
        HashSet hashSet = new HashSet();
        Iterator<BluetoothDevice> it = defaultAdapter.getBondedDevices().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getAddress());
        }
        return hashSet;
    }

    @Override // bn2.c
    public final void b(an2.a.b bVar) {
        synchronized (this.f50936c) {
            try {
                bn2.a aVar = this.f50937d;
                if (aVar != null) {
                    Context context = this.f50934a;
                    if (aVar.f19081d) {
                        context.getApplicationContext().unregisterReceiver(aVar);
                        aVar.f19081d = false;
                    }
                }
                bn2.a aVar2 = new bn2.a(bVar);
                this.f50937d = aVar2;
                aVar2.a(this.f50934a);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bn2.c
    public final BluetoothDevice c(String str) {
        str.getClass();
        synchronized (this.f50938e) {
            if (this.f50938e.contains(str)) {
                ((Logger) this.f50935b.getValue()).debug("device has already been rejected, do not try to create system bond");
                return null;
            }
            Unit unit = Unit.INSTANCE;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
                if (remoteDevice.getBondState() == 10) {
                    return remoteDevice;
                }
            }
            return null;
        }
    }
}
