package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class re3 implements wok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk3 f32460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<tyl> f32461b;
    public volatile boolean c = false;
    public volatile SessionConfig d;

    public re3(lk3 lk3Var, List<tyl> list) {
        g6i.b(lk3Var.l == lk3.d.OPENED, "CaptureSession state must be OPENED. Current state:" + lk3Var.l);
        this.f32460a = lk3Var;
        this.f32461b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        this.c = true;
    }

    public void b(SessionConfig sessionConfig) {
        this.d = sessionConfig;
    }
}
