package c62;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDeviceDisconnectedException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c2<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0<g3<b>> f24706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f24707b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24708a;

        static {
            int[] iArr = new int[q52.b.values().length];
            try {
                iArr[q52.b.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q52.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q52.b.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q52.b.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24708a = iArr;
        }
    }

    public c2(androidx.lifecycle.w0<g3<b>> w0Var, b bVar) {
        this.f24706a = w0Var;
        this.f24707b = bVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        int i14 = a.f24708a[((q52.b) obj).ordinal()];
        b bVar = this.f24707b;
        androidx.lifecycle.w0<g3<b>> w0Var = this.f24706a;
        if (i14 == 1) {
            g3.f35298f.getClass();
            w0Var.j(g3.a.b(bVar));
        } else if (i14 == 2) {
            g3.f35298f.getClass();
            w0Var.j(g3.a.d(bVar));
        } else if (i14 == 3) {
            w0Var.j(g3.a.a(g3.f35298f, "Error loading adaptive coach workout on device", null, null, null, 14));
        } else {
            if (i14 != 4) {
                lc.u0.r();
                return null;
            }
            w0Var.j(g3.a.a(g3.f35298f, null, new WorkoutDeviceDisconnectedException(bVar.f24684b, "Device disconnected"), null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
