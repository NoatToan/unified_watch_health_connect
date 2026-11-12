package yj1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
public interface d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyj1/d$b;", "Lyj1/d;", "Lyj1/b;", "features", "<init>", "(Lyj1/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yj1.b f197530a;

        public b(yj1.b bVar) {
            bVar.getClass();
            this.f197530a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f197530a.equals(((b) obj).f197530a);
        }

        public final int hashCode() {
            return this.f197530a.hashCode();
        }

        public final String toString() {
            return "SingleDevice(features=" + this.f197530a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyj1/d$a;", "Lyj1/d;", "", "Lyj1/c;", "devices", "<init>", "(Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c> f197529a;

        public a(List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? j0.f134944a : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f197529a, ((a) obj).f197529a);
        }

        public final int hashCode() {
            return this.f197529a.hashCode();
        }

        public final String toString() {
            return tn.k.h("MultipleDevice(devices=", ")", this.f197529a);
        }

        public a(List<c> list) {
            list.getClass();
            this.f197529a = list;
        }

        public a() {
            this(null, 1, null);
        }
    }
}
