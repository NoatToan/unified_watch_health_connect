package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/core/impl/z2;", "", "<init>", "()V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b0.v f5882a;

    static {
        new z2();
    }

    private z2() {
    }

    public static final void a(k0 k0Var, b0.s0 s0Var, e0.c cVar) {
        androidx.camera.core.internal.a aVarQ;
        k0Var.getClass();
        b0.v vVar = f5882a;
        if (vVar == null) {
            vb.h.z("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String strQ = k0Var.q();
        strQ.getClass();
        l0 l0VarB = vVar.f14064a.b(strQ);
        c cVar2 = new c(l0VarB.c(), g0.f5557a);
        b0.a0 a0Var = b0.a0.f13841d;
        CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(l0VarB, null, cVar2, null, a0Var, a0Var, vVar.f14065b, vVar.f14067d, vVar.f14066c);
        b0.k1 k1Var = s0Var.f14124a;
        synchronized (cameraUseCaseAdapter.f5894l) {
            cameraUseCaseAdapter.f5890h = k1Var;
        }
        List<b0.l> list = s0Var.f14125b;
        synchronized (cameraUseCaseAdapter.f5894l) {
            cameraUseCaseAdapter.f5891i = list;
        }
        synchronized (cameraUseCaseAdapter.f5894l) {
        }
        Range<Integer> range = s0Var.f14126c;
        synchronized (cameraUseCaseAdapter.f5894l) {
            cameraUseCaseAdapter.f5892j = range;
        }
        List<b0.i1> list2 = s0Var.f14129f;
        Objects.toString(list2);
        Objects.toString(cVar);
        synchronized (cameraUseCaseAdapter.f5894l) {
            d dVar = cameraUseCaseAdapter.f5883a;
            e0 e0Var = cameraUseCaseAdapter.f5893k;
            dVar.f(e0Var);
            d dVar2 = cameraUseCaseAdapter.f5884b;
            if (dVar2 != null) {
                dVar2.f(e0Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(cameraUseCaseAdapter.f5887e);
            linkedHashSet.addAll(list2);
            HashMap mapL = CameraUseCaseAdapter.l(linkedHashSet, cVar);
            try {
                try {
                    aVarQ = cameraUseCaseAdapter.q(linkedHashSet, cameraUseCaseAdapter.f5884b != null);
                    CameraUseCaseAdapter.C(mapL);
                } catch (IllegalArgumentException e4) {
                    throw new CameraUseCaseAdapter.CameraException(e4);
                }
            } catch (Throwable th3) {
                CameraUseCaseAdapter.C(mapL);
                throw th3;
            }
        }
        aVarQ.getClass();
    }
}
