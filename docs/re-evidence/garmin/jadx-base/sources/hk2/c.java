package hk2;

import android.bluetooth.BluetoothDevice;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p13.h0;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.device.discovery.probe.DiscoveryProbeManager$startProbing$3", f = "DiscoveryProbeManager.kt", l = {275}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f84243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f84244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f84245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f84246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList<o13.p<b.d, BluetoothDevice>> f84248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f84249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f84250h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((b.d) ((o13.p) t7).f128594a, (b.d) ((o13.p) t14).f128594a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList<o13.p<b.d, BluetoothDevice>> arrayList, d dVar, b bVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f84248f = arrayList;
        this.f84249g = dVar;
        this.f84250h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f84248f, this.f84249g, this.f84250h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        d dVar;
        b bVar;
        p0 p0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84247e;
        if (i14 == 0) {
            r.b(obj);
            p0 p0Var2 = new p0();
            it = h0.N0(this.f84248f, new a()).iterator();
            dVar = this.f84249g;
            bVar = this.f84250h;
            p0Var = p0Var2;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.f84246d;
            bVar = this.f84245c;
            dVar = this.f84244b;
            p0Var = this.f84243a;
            r.b(obj);
        }
        while (it.hasNext()) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) ((o13.p) it.next()).f128595b;
            String address = bluetoothDevice.getAddress();
            address.getClass();
            dVar.c(bluetoothDevice, new b.C1669b(bVar, address));
            int i15 = p0Var.f105807a;
            p0Var.f105807a = i15 + 1;
            long j8 = i15 < 4 ? 300L : 600L;
            this.f84243a = p0Var;
            this.f84244b = dVar;
            this.f84245c = bVar;
            this.f84246d = it;
            this.f84247e = 1;
            if (m0.b(j8, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
