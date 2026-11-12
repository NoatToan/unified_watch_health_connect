package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class idm implements kci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21031a;

    public static class b implements c {
        public b() {
        }

        @Override // idm.c
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // idm.c
        public int b() {
            return 0;
        }
    }

    public interface c {
        List<Integer> a();

        int b();
    }

    public idm() {
        this(new b());
    }

    @Override // defpackage.kci
    public int a(int i) {
        List<Integer> listA = this.f21031a.a();
        if (listA == null || listA.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < listA.size(); i2++) {
            if (listA.get(i2).intValue() > i) {
                return listA.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kci
    public tfi b(int i) {
        return z6d.d(i, i >= this.f21031a.b(), false);
    }

    public idm(c cVar) {
        this.f21031a = (c) b6i.g(cVar);
    }
}
