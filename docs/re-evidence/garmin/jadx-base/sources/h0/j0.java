package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.w0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f80509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.l0.h f80510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.l0.h f80511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f80512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f80515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0 f80516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f80517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f80518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListenableFuture<Void> f80519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80520m;

    public j0(androidx.camera.core.impl.u0 u0Var, v0 v0Var, o0 o0Var, ListenableFuture<Void> listenableFuture, int i14) {
        this.f80520m = -1;
        this.f80508a = i14;
        this.f80509b = v0Var;
        this.f80510c = v0Var.g();
        this.f80511d = v0Var.i();
        this.f80514g = v0Var.e();
        this.f80513f = v0Var.h();
        this.f80512e = v0Var.c();
        this.f80515h = v0Var.j();
        this.f80516i = o0Var;
        this.f80517j = String.valueOf(u0Var.hashCode());
        this.f80518k = new ArrayList();
        List<w0> listA = u0Var.a();
        Objects.requireNonNull(listA);
        for (w0 w0Var : listA) {
            ArrayList arrayList = this.f80518k;
            w0Var.getClass();
            arrayList.add(0);
        }
        this.f80519l = listenableFuture;
    }

    public j0(androidx.camera.core.impl.u0 u0Var, v0 v0Var, o0 o0Var, ListenableFuture<Void> listenableFuture) {
        this(u0Var, v0Var, o0Var, listenableFuture, 0);
    }
}
