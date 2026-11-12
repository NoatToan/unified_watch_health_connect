package i20;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.messaging.Constants;
import f20.c0;
import f20.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m20.m0;
import m20.n0;
import m20.p0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li20/r;", "Landroidx/lifecycle/u1;", "Lf20/e0;", "phonePrefixProvider", "", "initialContent", "Ll20/d;", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Lf20/e0;Ljava/lang/String;Ll20/d;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l20.d f87184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<l> f87185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<g3<o13.p<p0, l20.a>>> f87186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<String> f87187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f87188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f87189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f87190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f87191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f87192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f87193j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodViewModel$validatePhoneNumber$1", f = "EditContactMethodViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87194a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f87196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l20.a f87197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, l20.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f87196c = str;
            this.f87197d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new a(this.f87196c, this.f87197d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87194a;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                rVar.f87186c.j(g3.a.c(g3.f35298f));
                n0 n0Var = (n0) rVar.f87188e.getValue();
                this.f87194a = 1;
                n0Var.getClass();
                objJ = f0.J(n0Var, new m0(this.f87196c, n0Var, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objJ = obj;
            }
            v2 v2Var = (v2) objJ;
            boolean z14 = v2Var instanceof v2.b;
            l20.a aVar2 = this.f87197d;
            if (z14) {
                y0<g3<o13.p<p0, l20.a>>> y0Var = rVar.f87186c;
                g3.a aVar3 = g3.f35298f;
                o13.p pVar = new o13.p(((v2.b) v2Var).f47386a, aVar2);
                aVar3.getClass();
                y0Var.j(g3.a.d(pVar));
            } else {
                rVar.f87186c.j(g3.a.a(g3.f35298f, null, null, new o13.p(new p0(null, null, null, null, null, null, null, 127, null), aVar2), null, 11));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    public r(e0 e0Var, String str, l20.d dVar) {
        Object next;
        Iterator it;
        Object next2;
        c0 c0Var;
        Object next3;
        List<String> list;
        Object obj;
        str.getClass();
        dVar.getClass();
        this.f87184a = dVar;
        this.f87185b = new y0<>(l.a.f87169a);
        this.f87186c = new y0<>();
        this.f87187d = new y0<>(str);
        this.f87188e = o13.m.b(new i01.j(7));
        this.f87189f = (e0Var == null || (obj = e0Var.f68384a) == null) ? j0.f134944a : obj;
        boolean z14 = this.f87184a instanceof l20.p;
        this.f87193j = z14;
        if (!z14) {
            this.f87191h = str;
            return;
        }
        if (e0Var != null) {
            ArrayList arrayList = e0Var.f68384a;
            Iterator it3 = e0Var.f68385b.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!e0.b((String) ((Map.Entry) next).getKey(), str));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                c0Var = (c0) entry.getValue();
                Iterator it4 = arrayList.iterator();
                loop1: while (true) {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                    c0 c0Var2 = (c0) next3;
                    boolean zB = e0.b(c0Var2.f68362c, str);
                    String strO = d53.w.O(str, c0Var2.f68362c);
                    if (zB && (list = c0Var2.f68363d) != null && !list.isEmpty()) {
                        Iterator<T> it5 = list.iterator();
                        while (it5.hasNext()) {
                            if (e0.b((String) it5.next(), strO)) {
                                break loop1;
                            }
                        }
                    }
                }
                c0 c0Var3 = (c0) next3;
                c0Var = c0Var3 != null ? c0Var3 : c0Var;
                if (c0Var == null) {
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!e0.b(((c0) next2).f68362c, str));
                    c0Var = (c0) next2;
                }
            } else {
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!e0.b(((c0) next2).f68362c, str));
                c0Var = (c0) next2;
            }
            if (c0Var != null) {
                this.f87190g = c0Var;
                str = d53.w.O(str, c0Var.f68362c);
            } else {
                Object objB0 = h0.b0(this.f87189f);
                this.f87190g = (c0) (d53.w.J(str) ? objB0 : null);
            }
        } else {
            Object objB1 = h0.b0(this.f87189f);
            this.f87190g = (c0) (d53.w.J(str) ? objB1 : null);
        }
        this.f87191h = str;
    }

    public final void x4(String str, l20.a aVar) {
        ge1.b.T(v1.a(this), null, null, new a(str, aVar, null), 3);
    }

    public /* synthetic */ r(e0 e0Var, String str, l20.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : e0Var, str, dVar);
    }
}
