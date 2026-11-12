package v;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.s0 f174086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<b0.u> f174087b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174088a;

        static {
            int[] iArr = new int[androidx.camera.core.impl.l0.a.values().length];
            f174088a = iArr;
            try {
                iArr[androidx.camera.core.impl.l0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f174088a[androidx.camera.core.impl.l0.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public u0(androidx.camera.core.impl.s0 s0Var) {
        this.f174086a = s0Var;
        androidx.lifecycle.y0<b0.u> y0Var = new androidx.lifecycle.y0<>();
        this.f174087b = y0Var;
        y0Var.j(new b0.d(b0.u.b.CLOSED, null));
    }

    public final void a(androidx.camera.core.impl.l0.a aVar, b0.u.a aVar2) {
        b0.d dVar;
        if (aVar2 == null || aVar2.b() != 8) {
            switch (a.f174088a[aVar.ordinal()]) {
                case 1:
                    androidx.camera.core.impl.s0 s0Var = this.f174086a;
                    synchronized (s0Var.f5740b) {
                        Iterator it = s0Var.f5743e.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dVar = new b0.d(b0.u.b.PENDING_OPEN, null);
                            } else if (((androidx.camera.core.impl.s0.a) ((Map.Entry) it.next()).getValue()).f5745a == androidx.camera.core.impl.l0.a.CLOSING) {
                                dVar = new b0.d(b0.u.b.OPENING, null);
                            }
                        }
                    }
                    break;
                case 2:
                    dVar = new b0.d(b0.u.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    dVar = new b0.d(b0.u.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    dVar = new b0.d(b0.u.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    dVar = new b0.d(b0.u.b.CLOSED, aVar2);
                    break;
                default:
                    com.google.firebase.messaging.l.n(aVar, "Unknown internal camera state: ");
                    return;
            }
        } else {
            dVar = new b0.d(b0.u.b.CLOSED, aVar2);
        }
        dVar.toString();
        Objects.toString(aVar);
        Objects.toString(aVar2);
        if (Objects.equals(this.f174087b.d(), dVar)) {
            return;
        }
        dVar.toString();
        this.f174087b.j(dVar);
    }
}
