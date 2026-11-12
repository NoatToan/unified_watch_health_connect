package bd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.DeviceConnectionWorker;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbd0/d0;", "Lfm2/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends fm2.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17553e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f17554d = o13.m.b(new b4.b(13));

    @Override // fm2.c
    public final void b(String str, ma2.j jVar) {
        str.getClass();
        if (jVar instanceof ma2.k) {
            super.b(str, jVar);
            return;
        }
        da2.d.c(g()).f58886a.d(str, new cm2.b.a.C0429a(str, 0, jVar, this.f72121b, 2, null));
    }

    @Override // fm2.c
    public final Class<? extends AbstractDeviceConnectionWorker> i() {
        return DeviceConnectionWorker.class;
    }

    @Override // fm2.c
    public final String k(String str) {
        Object next;
        str.getClass();
        Iterator<T> it = ((pc0.i) this.f17554d.getValue()).a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g((String) next, str));
        String strK = (String) next;
        if (strK == null) {
            strK = super.k(str);
        }
        if (strK == null) {
            a2 a2Var = a2.DEVICES;
            String strM = am.j.m("isSupportedDeviceModel() productNumber[", str, "] not supported");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GCMPairingGdiAdapter", strM);
        }
        return strK;
    }

    @Override // fm2.c
    public final void p(da2.j jVar, String str, yl2.e eVar, String str2) {
        hk0.a.EnumC1667a enumC1667a;
        jVar.getClass();
        str.getClass();
        f17553e.getClass();
        int i14 = a.C0249a.f17555a[jVar.ordinal()];
        if (i14 == 1) {
            enumC1667a = hk0.a.EnumC1667a.STARTED;
        } else if (i14 == 2) {
            enumC1667a = hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS;
        } else if (i14 != 3) {
            enumC1667a = i14 != 4 ? hk0.a.EnumC1667a.SKIPPED : hk0.a.EnumC1667a.SKIPPED;
        } else {
            enumC1667a = hk0.a.EnumC1667a.FINISHED_WITH_FAILURE;
        }
        hk0.a.f().m(enumC1667a, str, eVar, str2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbd0/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: bd0.d0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0249a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17555a;

            static {
                int[] iArr = new int[da2.j.values().length];
                try {
                    iArr[da2.j.STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[da2.j.FINISHED_WITH_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[da2.j.FINISHED_WITH_FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[da2.j.SKIPPED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f17555a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
