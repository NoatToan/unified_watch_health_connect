package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static final class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5752a = new ArrayList();

        public a(List<s> list) {
            for (s sVar : list) {
                if (!(sVar instanceof b)) {
                    this.f5752a.add(sVar);
                }
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void a(int i14) {
            Iterator it = this.f5752a.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(i14);
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void b(int i14, c0 c0Var) {
            Iterator it = this.f5752a.iterator();
            while (it.hasNext()) {
                ((s) it.next()).b(i14, c0Var);
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void c(int i14, u uVar) {
            Iterator it = this.f5752a.iterator();
            while (it.hasNext()) {
                ((s) it.next()).c(i14, uVar);
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void d(int i14) {
            Iterator it = this.f5752a.iterator();
            while (it.hasNext()) {
                ((s) it.next()).d(i14);
            }
        }
    }

    public static final class b extends s {
        @Override // androidx.camera.core.impl.s
        public final void b(int i14, c0 c0Var) {
        }

        @Override // androidx.camera.core.impl.s
        public final void c(int i14, u uVar) {
        }

        @Override // androidx.camera.core.impl.s
        public final void d(int i14) {
        }
    }

    private t() {
    }

    public static s a(s... sVarArr) {
        List listAsList = Arrays.asList(sVarArr);
        if (listAsList.isEmpty()) {
            return new b();
        }
        return listAsList.size() == 1 ? (s) listAsList.get(0) : new a(listAsList);
    }
}
