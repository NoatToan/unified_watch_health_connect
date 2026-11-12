package rk0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface v0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrk0/v0$a;", "Lrk0/v0;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f153281a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 547532923;
        }

        public final String toString() {
            return "FailedDelete";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrk0/v0$b;", "Lrk0/v0;", "Ljk0/j;", "collection", "", "Lqk0/h;", "conflictReplacements", "<init>", "(Ljk0/j;Ljava/util/List;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jk0.j f153282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<qk0.h> f153283b;

        public b(jk0.j jVar, List<qk0.h> list) {
            jVar.getClass();
            list.getClass();
            this.f153282a = jVar;
            this.f153283b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f153282a.equals(bVar.f153282a) && this.f153283b.equals(bVar.f153283b);
        }

        public final int hashCode() {
            return this.f153283b.hashCode() + (this.f153282a.hashCode() * 31);
        }

        public final String toString() {
            return "FailedEdit(collection=" + this.f153282a + ", conflictReplacements=" + this.f153283b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrk0/v0$c;", "Lrk0/v0;", "Ljava/util/ArrayList;", "Luk0/a;", "Lkotlin/collections/ArrayList;", "selectedGear", "<init>", "(Ljava/util/ArrayList;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<uk0.a> f153284a;

        public c(ArrayList<uk0.a> arrayList) {
            arrayList.getClass();
            this.f153284a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f153284a.equals(((c) obj).f153284a);
        }

        public final int hashCode() {
            return this.f153284a.hashCode();
        }

        public final String toString() {
            return "FailedSaveGear(selectedGear=" + this.f153284a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrk0/v0$d;", "Lrk0/v0;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f153285a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1445280613;
        }

        public final String toString() {
            return "InProgress";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrk0/v0$e;", "Lrk0/v0;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f153286a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 44779986;
        }

        public final String toString() {
            return "PartialEditFailure";
        }
    }
}
