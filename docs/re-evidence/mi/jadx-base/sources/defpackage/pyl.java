package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class pyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30903a;

    @RequiresApi(21)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<jeh> f30906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f30907b;
        public final Executor c;
        public int d;
        public sad e = null;
        public CaptureRequest f = null;

        public b(int i, List<jeh> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.d = i;
            this.f30906a = Collections.unmodifiableList(new ArrayList(list));
            this.f30907b = stateCallback;
            this.c = executor;
        }

        @Override // pyl.c
        public sad a() {
            return this.e;
        }

        @Override // pyl.c
        public CameraCaptureSession.StateCallback b() {
            return this.f30907b;
        }

        @Override // pyl.c
        public Executor c() {
            return this.c;
        }

        @Override // pyl.c
        public List<jeh> d() {
            return this.f30906a;
        }

        @Override // pyl.c
        public Object e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.e, bVar.e) && this.d == bVar.d && this.f30906a.size() == bVar.f30906a.size()) {
                    for (int i = 0; i < this.f30906a.size(); i++) {
                        if (!this.f30906a.get(i).equals(bVar.f30906a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // pyl.c
        public int f() {
            return this.d;
        }

        @Override // pyl.c
        public void g(CaptureRequest captureRequest) {
            this.f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f30906a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            sad sadVar = this.e;
            int iHashCode2 = (sadVar == null ? 0 : sadVar.hashCode()) ^ i;
            return this.d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public interface c {
        sad a();

        CameraCaptureSession.StateCallback b();

        Executor c();

        List<jeh> d();

        Object e();

        int f();

        void g(CaptureRequest captureRequest);
    }

    public pyl(int i, List<jeh> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f30903a = new b(i, list, executor, stateCallback);
        } else {
            this.f30903a = new a(i, list, executor, stateCallback);
        }
    }

    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<OutputConfiguration> g(List<jeh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<jeh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().d());
        }
        return arrayList;
    }

    @RequiresApi(24)
    public static List<jeh> h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(jeh.e(it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f30903a.c();
    }

    public sad b() {
        return this.f30903a.a();
    }

    public List<jeh> c() {
        return this.f30903a.d();
    }

    public int d() {
        return this.f30903a.f();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f30903a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof pyl) {
            return this.f30903a.equals(((pyl) obj).f30903a);
        }
        return false;
    }

    public void f(CaptureRequest captureRequest) {
        this.f30903a.g(captureRequest);
    }

    public int hashCode() {
        return this.f30903a.hashCode();
    }

    public Object i() {
        return this.f30903a.e();
    }

    @RequiresApi(28)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f30904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<jeh> f30905b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f30904a = sessionConfiguration;
            this.f30905b = Collections.unmodifiableList(pyl.h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // pyl.c
        public sad a() {
            return sad.b(this.f30904a.getInputConfiguration());
        }

        @Override // pyl.c
        public CameraCaptureSession.StateCallback b() {
            return this.f30904a.getStateCallback();
        }

        @Override // pyl.c
        public Executor c() {
            return this.f30904a.getExecutor();
        }

        @Override // pyl.c
        public List<jeh> d() {
            return this.f30905b;
        }

        @Override // pyl.c
        public Object e() {
            return this.f30904a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f30904a, ((a) obj).f30904a);
            }
            return false;
        }

        @Override // pyl.c
        public int f() {
            return this.f30904a.getSessionType();
        }

        @Override // pyl.c
        public void g(CaptureRequest captureRequest) {
            this.f30904a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f30904a.hashCode();
        }

        public a(int i, List<jeh> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, pyl.g(list), executor, stateCallback));
        }
    }
}
