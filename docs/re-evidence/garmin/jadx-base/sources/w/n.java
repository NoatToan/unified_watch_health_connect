package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f180987a;

    public interface b {
    }

    public n(int i14, List<h> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f180987a = new a(i14, list, executor, stateCallback);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        return this.f180987a.equals(((n) obj).f180987a);
    }

    public final int hashCode() {
        return this.f180987a.hashCode();
    }

    private n(b bVar) {
        this.f180987a = bVar;
    }

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f180988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<h> f180989b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f180988a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList = new ArrayList(outputConfigurations.size());
            Iterator<OutputConfiguration> it = outputConfigurations.iterator();
            while (it.hasNext()) {
                arrayList.add(h.a(it.next()));
            }
            this.f180989b = Collections.unmodifiableList(arrayList);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.f180988a, ((a) obj).f180988a);
        }

        public final int hashCode() {
            return this.f180988a.hashCode();
        }

        public a(int i14, List<h> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<h> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((OutputConfiguration) it.next().f180969a.g());
            }
            this(new SessionConfiguration(i14, arrayList, executor, stateCallback));
        }
    }
}
