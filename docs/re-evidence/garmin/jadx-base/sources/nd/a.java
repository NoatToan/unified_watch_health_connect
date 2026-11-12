package nd;

import am.j;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lnd/a;", "Landroidx/lifecycle/k0;", "Lnd/e;", "owner", "<init>", "(Lnd/e;)V", "b", "a", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f125380a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnd/a$b;", "Lnd/c$b;", "Lnd/c;", "registry", "<init>", "(Lnd/c;)V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f125381a;

        public b(c cVar) {
            cVar.getClass();
            this.f125381a = new LinkedHashSet();
            cVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // nd.c.b
        public final Bundle a() {
            p13.k0.f134949a.getClass();
            Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
            f.c("classes_to_restore", bundleA, h0.b1(this.f125381a));
            return bundleA;
        }
    }

    static {
        new C2415a(null);
    }

    public a(e eVar) {
        eVar.getClass();
        this.f125380a = eVar;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        if (aVar != b0.a.ON_CREATE) {
            h.q("Next event must be ON_CREATE");
            return;
        }
        n0Var.getF158016a().d(this);
        e eVar = this.f125380a;
        Bundle bundleA = eVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            h.z("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(c.a.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((c.a) objNewInstance).a(eVar);
                    } catch (Exception e4) {
                        q2.v(fb1.c.n("Failed to instantiate ", str), e4);
                        return;
                    }
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e14);
                }
            } catch (ClassNotFoundException e15) {
                q2.v(j.m("Class ", str, " wasn't found"), e15);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: nd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lnd/a$a;", "", "<init>", "()V", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2415a {
        public /* synthetic */ C2415a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2415a() {
        }
    }
}
