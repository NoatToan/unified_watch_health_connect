package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class jvo extends wuo.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<wuo.a> f23191a;

    public jvo(List<wuo.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f23191a = arrayList;
        arrayList.addAll(list);
    }

    public static wuo.a u(wuo.a... aVarArr) {
        return new jvo(Arrays.asList(aVarArr));
    }

    @Override // wuo.a
    public void m(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().m(wuoVar);
        }
    }

    @Override // wuo.a
    @RequiresApi(api = 26)
    public void n(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().n(wuoVar);
        }
    }

    @Override // wuo.a
    public void o(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().o(wuoVar);
        }
    }

    @Override // wuo.a
    public void p(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().p(wuoVar);
        }
    }

    @Override // wuo.a
    public void q(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().q(wuoVar);
        }
    }

    @Override // wuo.a
    public void r(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().r(wuoVar);
        }
    }

    @Override // wuo.a
    public void s(wuo wuoVar) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().s(wuoVar);
        }
    }

    @Override // wuo.a
    @RequiresApi(api = 23)
    public void t(wuo wuoVar, Surface surface) {
        Iterator<wuo.a> it = this.f23191a.iterator();
        while (it.hasNext()) {
            it.next().t(wuoVar, surface);
        }
    }

    @RequiresApi(21)
    public static class a extends wuo.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f23192a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f23192a = stateCallback;
        }

        @Override // wuo.a
        public void m(wuo wuoVar) {
            this.f23192a.onActive(wuoVar.f().c());
        }

        @Override // wuo.a
        @RequiresApi(api = 26)
        public void n(wuo wuoVar) {
            xd1.b(this.f23192a, wuoVar.f().c());
        }

        @Override // wuo.a
        public void o(wuo wuoVar) {
            this.f23192a.onClosed(wuoVar.f().c());
        }

        @Override // wuo.a
        public void p(wuo wuoVar) {
            this.f23192a.onConfigureFailed(wuoVar.f().c());
        }

        @Override // wuo.a
        public void q(wuo wuoVar) {
            this.f23192a.onConfigured(wuoVar.f().c());
        }

        @Override // wuo.a
        public void r(wuo wuoVar) {
            this.f23192a.onReady(wuoVar.f().c());
        }

        @Override // wuo.a
        public void s(wuo wuoVar) {
        }

        @Override // wuo.a
        @RequiresApi(api = 23)
        public void t(wuo wuoVar, Surface surface) {
            vd1.a(this.f23192a, wuoVar.f().c(), surface);
        }

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(sf3.a(list));
        }
    }
}
