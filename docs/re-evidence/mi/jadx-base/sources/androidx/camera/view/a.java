package androidx.camera.view;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.CameraInternal;
import androidx.lifecycle.MutableLiveData;
import defpackage.cb3;
import defpackage.ch3;
import defpackage.dh3;
import defpackage.fl1;
import defpackage.jua;
import defpackage.kua;
import defpackage.lhe;
import defpackage.li3;
import defpackage.m4h;
import defpackage.oua;
import defpackage.we3;
import defpackage.ye3;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class a implements m4h.a<CameraInternal.State> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dh3 f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData<PreviewView.StreamState> f1848b;

    @GuardedBy("this")
    public PreviewView.StreamState c;
    public final c d;
    public lhe<Void> e;
    public boolean f = false;

    /* JADX INFO: renamed from: androidx.camera.view.a$a, reason: collision with other inner class name */
    public class C0015a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f1849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ch3 f1850b;

        public C0015a(List list, ch3 ch3Var) {
            this.f1849a = list;
            this.f1850b = ch3Var;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            a.this.e = null;
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            a.this.e = null;
            if (this.f1849a.isEmpty()) {
                return;
            }
            Iterator it = this.f1849a.iterator();
            while (it.hasNext()) {
                ((dh3) this.f1850b).d((we3) it.next());
            }
            this.f1849a.clear();
        }
    }

    public class b extends we3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f1851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ch3 f1852b;

        public b(cb3.a aVar, ch3 ch3Var) {
            this.f1851a = aVar;
            this.f1852b = ch3Var;
        }

        @Override // defpackage.we3
        public void b(ye3 ye3Var) {
            this.f1851a.c(null);
            ((dh3) this.f1852b).d(this);
        }
    }

    public a(dh3 dh3Var, MutableLiveData<PreviewView.StreamState> mutableLiveData, c cVar) {
        this.f1847a = dh3Var;
        this.f1848b = mutableLiveData;
        this.d = cVar;
        synchronized (this) {
            this.c = mutableLiveData.getValue();
        }
    }

    public final void e() {
        lhe<Void> lheVar = this.e;
        if (lheVar != null) {
            lheVar.cancel(false);
            this.e = null;
        }
    }

    public void f() {
        e();
    }

    public final /* synthetic */ lhe g(Void r1) throws Exception {
        return this.d.i();
    }

    public final /* synthetic */ Void h(Void r1) {
        l(PreviewView.StreamState.STREAMING);
        return null;
    }

    public final /* synthetic */ Object i(ch3 ch3Var, List list, cb3.a aVar) throws Exception {
        b bVar = new b(aVar, ch3Var);
        list.add(bVar);
        ((dh3) ch3Var).c(li3.a(), bVar);
        return "waitForCaptureResult";
    }

    @Override // m4h.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(CameraInternal.State state) {
        if (state == CameraInternal.State.CLOSING || state == CameraInternal.State.CLOSED || state == CameraInternal.State.RELEASING || state == CameraInternal.State.RELEASED) {
            l(PreviewView.StreamState.IDLE);
            if (this.f) {
                this.f = false;
                e();
                return;
            }
            return;
        }
        if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !this.f) {
            k(this.f1847a);
            this.f = true;
        }
    }

    public final void k(ch3 ch3Var) {
        l(PreviewView.StreamState.IDLE);
        ArrayList arrayList = new ArrayList();
        kua kuaVarD = kua.a(m(ch3Var, arrayList)).e(new fl1() { // from class: a8i
            @Override // defpackage.fl1
            public final lhe apply(Object obj) {
                return this.f769a.g((Void) obj);
            }
        }, li3.a()).d(new Function() { // from class: b8i
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f3923a.h((Void) obj);
            }
        }, li3.a());
        this.e = kuaVarD;
        oua.b(kuaVarD, new C0015a(arrayList, ch3Var), li3.a());
    }

    public void l(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.c.equals(streamState)) {
                    return;
                }
                this.c = streamState;
                zpe.a("StreamStateObserver", "Update Preview stream state to " + streamState);
                this.f1848b.postValue(streamState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final lhe<Void> m(final ch3 ch3Var, final List<we3> list) {
        return cb3.a(new cb3.c() { // from class: z7i
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f40986a.i(ch3Var, list, aVar);
            }
        });
    }

    @Override // m4h.a
    public void onError(Throwable th) {
        f();
        l(PreviewView.StreamState.IDLE);
    }
}
