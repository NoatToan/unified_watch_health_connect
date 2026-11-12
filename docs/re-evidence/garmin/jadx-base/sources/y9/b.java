package y9;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.n0;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p005kotlin.jvm.internal.s0;
import p1.l1;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class b extends y9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f195250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f195251b;

    public static class a<D> extends y0<D> implements androidx.loader.content.b.InterfaceC0115b<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f195252l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f195253m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final androidx.loader.content.b<D> f195254n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public n0 f195255o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C3633b<D> f195256p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public androidx.loader.content.b<D> f195257q;

        public a(int i14, Bundle bundle, androidx.loader.content.b<D> bVar, androidx.loader.content.b<D> bVar2) {
            this.f195252l = i14;
            this.f195253m = bundle;
            this.f195254n = bVar;
            this.f195257q = bVar2;
            bVar.registerListener(i14, this);
        }

        @Override // androidx.lifecycle.s0
        public final void h() {
            this.f195254n.startLoading();
        }

        @Override // androidx.lifecycle.s0
        public final void i() {
            this.f195254n.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.s0
        public final void k(z0<? super D> z0Var) {
            super.k(z0Var);
            this.f195255o = null;
            this.f195256p = null;
        }

        @Override // androidx.lifecycle.s0
        public final void m(D d14) {
            super.m(d14);
            androidx.loader.content.b<D> bVar = this.f195257q;
            if (bVar != null) {
                bVar.reset();
                this.f195257q = null;
            }
        }

        public final androidx.loader.content.b<D> n(boolean z14) {
            androidx.loader.content.b<D> bVar = this.f195254n;
            bVar.cancelLoad();
            bVar.abandon();
            C3633b<D> c3633b = this.f195256p;
            if (c3633b != null) {
                k(c3633b);
                if (z14 && c3633b.f195260c) {
                    c3633b.f195259b.onLoaderReset(c3633b.f195258a);
                }
            }
            bVar.unregisterListener(this);
            if ((c3633b == null || c3633b.f195260c) && !z14) {
                return bVar;
            }
            bVar.reset();
            return this.f195257q;
        }

        public final void o() {
            n0 n0Var = this.f195255o;
            C3633b<D> c3633b = this.f195256p;
            if (n0Var == null || c3633b == null) {
                return;
            }
            super.k(c3633b);
            f(n0Var, c3633b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder(64);
            sb3.append("LoaderInfo{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" #");
            sb3.append(this.f195252l);
            sb3.append(" : ");
            k7.c.a(sb3, this.f195254n);
            sb3.append("}}");
            return sb3.toString();
        }
    }

    /* JADX INFO: renamed from: y9.b$b, reason: collision with other inner class name */
    public static class C3633b<D> implements z0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.loader.content.b<D> f195258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y9.a.InterfaceC3632a<D> f195259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f195260c = false;

        public C3633b(androidx.loader.content.b<D> bVar, y9.a.InterfaceC3632a<D> interfaceC3632a) {
            this.f195258a = bVar;
            this.f195259b = interfaceC3632a;
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(D d14) {
            this.f195259b.onLoadFinished(this.f195258a, d14);
            this.f195260c = true;
        }

        public final String toString() {
            return this.f195259b.toString();
        }
    }

    public static class c extends u1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f195261c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l1<a> f195262a = new l1<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f195263b = false;

        public static class a implements x1.c {
            @Override // androidx.lifecycle.x1.c
            public final <T extends u1> T create(Class<T> cls) {
                return new c();
            }
        }

        @Override // androidx.lifecycle.u1
        public final void onCleared() {
            super.onCleared();
            l1<a> l1Var = this.f195262a;
            int iF = l1Var.f();
            for (int i14 = 0; i14 < iF; i14++) {
                l1Var.g(i14).n(true);
            }
            int i15 = l1Var.f134767d;
            Object[] objArr = l1Var.f134766c;
            for (int i16 = 0; i16 < i15; i16++) {
                objArr[i16] = null;
            }
            l1Var.f134767d = 0;
            l1Var.f134764a = false;
        }
    }

    public b(n0 n0Var, y1 y1Var) {
        this.f195250a = n0Var;
        c.a aVar = c.f195261c;
        this.f195251b = (c) new x1(y1Var, c.f195261c).b(s0.f105811a.b(c.class));
    }

    @Override // y9.a
    public final androidx.loader.content.b b(int i14, y9.a.InterfaceC3632a interfaceC3632a) {
        c cVar = this.f195251b;
        if (cVar.f195263b) {
            h.z("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            h.z("initLoader must be called on the main thread");
            return null;
        }
        a aVarC = cVar.f195262a.c(i14);
        if (aVarC == null) {
            return c(i14, interfaceC3632a, null);
        }
        androidx.loader.content.b<D> bVar = aVarC.f195254n;
        C3633b<D> c3633b = new C3633b<>(bVar, interfaceC3632a);
        n0 n0Var = this.f195250a;
        aVarC.f(n0Var, c3633b);
        z0 z0Var = aVarC.f195256p;
        if (z0Var != null) {
            aVarC.k(z0Var);
        }
        aVarC.f195255o = n0Var;
        aVarC.f195256p = c3633b;
        return bVar;
    }

    public final androidx.loader.content.b c(int i14, y9.a.InterfaceC3632a interfaceC3632a, androidx.loader.content.b bVar) {
        c cVar = this.f195251b;
        try {
            cVar.f195263b = true;
            androidx.loader.content.b bVarOnCreateLoader = interfaceC3632a.onCreateLoader(i14, null);
            if (bVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(bVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarOnCreateLoader);
            }
            a aVar = new a(i14, null, bVarOnCreateLoader, bVar);
            cVar.f195262a.e(i14, aVar);
            cVar.f195263b = false;
            androidx.loader.content.b<D> bVar2 = aVar.f195254n;
            C3633b<D> c3633b = new C3633b<>(bVar2, interfaceC3632a);
            n0 n0Var = this.f195250a;
            aVar.f(n0Var, c3633b);
            z0 z0Var = aVar.f195256p;
            if (z0Var != null) {
                aVar.k(z0Var);
            }
            aVar.f195255o = n0Var;
            aVar.f195256p = c3633b;
            return bVar2;
        } catch (Throwable th3) {
            cVar.f195263b = false;
            throw th3;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        l1<a> l1Var = this.f195251b.f195262a;
        if (l1Var.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i14 = 0; i14 < l1Var.f(); i14++) {
                a aVarG = l1Var.g(i14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(l1Var.d(i14));
                printWriter.print(": ");
                printWriter.println(aVarG.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(aVarG.f195252l);
                printWriter.print(" mArgs=");
                printWriter.println(aVarG.f195253m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                androidx.loader.content.b<D> bVar = aVarG.f195254n;
                printWriter.println(bVar);
                bVar.dump(str2.concat("  "), fileDescriptor, printWriter, strArr);
                if (aVarG.f195256p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarG.f195256p);
                    C3633b<D> c3633b = aVarG.f195256p;
                    String strConcat = str2.concat("  ");
                    c3633b.getClass();
                    printWriter.print(strConcat);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c3633b.f195260c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(bVar.dataToString(aVarG.d()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarG.e());
            }
        }
    }

    public final androidx.loader.content.b e(SwingDetailsActivity swingDetailsActivity) {
        c cVar = this.f195251b;
        if (cVar.f195263b) {
            h.z("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a aVarC = cVar.f195262a.c(1);
            return c(1, swingDetailsActivity, aVarC != null ? aVarC.n(false) : null);
        }
        h.z("restartLoader must be called on the main thread");
        return null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append("LoaderManager{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" in ");
        k7.c.a(sb3, this.f195250a);
        sb3.append("}}");
        return sb3.toString();
    }
}
