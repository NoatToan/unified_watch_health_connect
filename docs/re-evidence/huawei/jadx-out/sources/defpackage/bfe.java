package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class bfe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<c> f1060c;

    public bfe() {
        this.f1060c = Collections.EMPTY_LIST;
    }

    public bfe(List<c> list) {
        this.f1060c = Collections.EMPTY_LIST;
        this.f1060c = (List) list.stream().sorted(new Comparator() { // from class: bfd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bfe.e((bfe.c) obj, (bfe.c) obj2);
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ int e(c cVar, c cVar2) {
        return -Float.compare(cVar.d, cVar2.d);
    }

    public List<c> c() {
        return this.f1060c;
    }

    public String toString() {
        return this.f1060c.toString();
    }

    public static class c {
        private final float d;
        private final String e;

        public c(String str, float f) {
            this.e = str;
            this.d = f;
        }

        public String d() {
            return this.e;
        }

        public String toString() {
            return "{label='" + this.e + "', prob=" + this.d + '}';
        }
    }
}
