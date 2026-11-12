package c12;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0007\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lc12/h;", "T", "", "Lc12/h$b;", "initialNavigationState", "<init>", "(Lc12/h$b;)V", "b", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22556c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f22557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f22558b;

    static {
        new a(null);
        f22556c = 8;
    }

    public h(b<T> bVar) {
        bVar.getClass();
        p2 p2VarA = q2.a(bVar);
        this.f22557a = p2VarA;
        this.f22558b = s.d(p2VarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        p2 p2Var;
        Object value;
        List<b.C0339b<T>> list = ((b) this.f22558b.f150540a.getValue()).f22561c;
        if (list.isEmpty()) {
            return;
        }
        b.C0339b c0339b = (b.C0339b) h0.m0(list);
        do {
            p2Var = this.f22557a;
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.b((b) value, c0339b, h0.V(1, list))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(T t7) {
        T next;
        Object value;
        b bVar;
        List listS0;
        Object value2;
        b bVar2 = (b) this.f22558b.f150540a.getValue();
        T t14 = bVar2.f22560b.f22562a;
        if (p005kotlin.jvm.internal.s.g(t7, t14)) {
            return;
        }
        List<b.C0339b<T>> list = bVar2.f22561c;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((b.C0339b) next).f22562a, t7));
        b.C0339b c0339b = next;
        p2 p2Var = this.f22557a;
        if (c0339b == null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, b.b((b) value2, new b.C0339b(t7, t14), h0.D0(list, bVar2.f22560b))));
            return;
        }
        do {
            value = p2Var.getValue();
            bVar = (b) value;
            if (!list.isEmpty()) {
                ListIterator<b.C0339b<T>> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listS0 = j0.f134944a;
                        break;
                    } else if (p005kotlin.jvm.internal.s.g(listIterator.previous(), c0339b)) {
                        listS0 = h0.S0(list, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listS0 = j0.f134944a;
                break;
            }
        } while (!p2Var.b(value, b.b(bVar, c0339b, h0.V(1, listS0))));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc12/h$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\nB5\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lc12/h$b;", "T", "Landroid/os/Parcelable;", "initialPageId", "Lc12/h$b$b;", "currentPage", "", "pageNavigationStack", "<init>", "(Ljava/lang/Object;Lc12/h$b$b;Ljava/util/List;)V", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> implements Parcelable {
        public static final Parcelable.Creator<b<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f22559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0339b<T> f22560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<C0339b<T>> f22561c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b<?>> {
            @Override // android.os.Parcelable.Creator
            public final b<?> createFromParcel(Parcel parcel) {
                parcel.getClass();
                Object value = parcel.readValue(b.class.getClassLoader());
                C0339b<?> c0339bCreateFromParcel = C0339b.CREATOR.createFromParcel(parcel);
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(C0339b.CREATOR, parcel, arrayList, iA, 1);
                }
                return new b<>(value, c0339bCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final b<?>[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX INFO: renamed from: c12.h$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc12/h$b$b;", "T", "Landroid/os/Parcelable;", "pageId", "previousPageId", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0339b<T> implements Parcelable {
            public static final Parcelable.Creator<C0339b<?>> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f22562a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final T f22563b;

            /* JADX INFO: renamed from: c12.h$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0339b<?>> {
                @Override // android.os.Parcelable.Creator
                public final C0339b<?> createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0339b<>(parcel.readValue(C0339b.class.getClassLoader()), parcel.readValue(C0339b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final C0339b<?>[] newArray(int i14) {
                    return new C0339b[i14];
                }
            }

            public C0339b(T t7, T t14) {
                this.f22562a = t7;
                this.f22563b = t14;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0339b)) {
                    return false;
                }
                C0339b c0339b = (C0339b) obj;
                return p005kotlin.jvm.internal.s.g(this.f22562a, c0339b.f22562a) && p005kotlin.jvm.internal.s.g(this.f22563b, c0339b.f22563b);
            }

            public final int hashCode() {
                T t7 = this.f22562a;
                int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
                T t14 = this.f22563b;
                return iHashCode + (t14 != null ? t14.hashCode() : 0);
            }

            public final String toString() {
                return "Page(pageId=" + this.f22562a + ", previousPageId=" + this.f22563b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeValue(this.f22562a);
                parcel.writeValue(this.f22563b);
            }
        }

        public b(Object obj, C0339b c0339b, List list, int i14, j jVar) {
            this(obj, (i14 & 2) != 0 ? new C0339b(obj, null) : c0339b, (i14 & 4) != 0 ? j0.f134944a : list);
        }

        public static b b(b bVar, C0339b c0339b, List list) {
            T t7 = bVar.f22559a;
            bVar.getClass();
            c0339b.getClass();
            list.getClass();
            return new b(t7, c0339b, list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f22559a, bVar.f22559a) && p005kotlin.jvm.internal.s.g(this.f22560b, bVar.f22560b) && p005kotlin.jvm.internal.s.g(this.f22561c, bVar.f22561c);
        }

        public final int hashCode() {
            T t7 = this.f22559a;
            return this.f22561c.hashCode() + ((this.f22560b.hashCode() + ((t7 == null ? 0 : t7.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NavigationState(initialPageId=");
            sb3.append(this.f22559a);
            sb3.append(", currentPage=");
            sb3.append(this.f22560b);
            sb3.append(", pageNavigationStack=");
            return z.c(sb3, this.f22561c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeValue(this.f22559a);
            this.f22560b.writeToParcel(parcel, i14);
            Iterator itE = kg.f.e(this.f22561c, parcel);
            while (itE.hasNext()) {
                ((C0339b) itE.next()).writeToParcel(parcel, i14);
            }
        }

        public b(T t7, C0339b<T> c0339b, List<C0339b<T>> list) {
            c0339b.getClass();
            list.getClass();
            this.f22559a = t7;
            this.f22560b = c0339b;
            this.f22561c = list;
        }
    }
}
