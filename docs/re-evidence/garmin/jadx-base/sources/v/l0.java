package v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f173908a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<androidx.camera.core.impl.o2> f173909b;

    public l0(c1 c1Var, List<androidx.camera.core.impl.o2> list) {
        k7.h.b(c1Var.f173728j == c1.a.OPENED, "CaptureSession state must be OPENED. Current state:" + c1Var.f173728j);
        this.f173909b = Collections.unmodifiableList(new ArrayList(list));
    }
}
