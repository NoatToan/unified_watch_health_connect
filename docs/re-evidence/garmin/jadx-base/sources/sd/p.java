package sd;

import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lsd/p;", "T", "Li63/c;", "Landroid/util/SparseArray;", "elementSerializer", "<init>", "(Li63/c;)V", "a", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p<T> implements i63.c<SparseArray<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<a<T>> f158590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k63.e f158591b;

    public p(i63.c<T> cVar) {
        cVar.getClass();
        i63.c<a<T>> cVarSerializer = a.INSTANCE.serializer(cVar);
        this.f158590a = cVarSerializer;
        this.f158591b = cVarSerializer.getF158591b();
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        a aVar = (a) eVar.h(this.f158590a);
        List<Integer> list = aVar.f158594a;
        int size = list.size();
        List<T> list2 = aVar.f158595b;
        if (size != list2.size()) {
            vb.h.s("Failed requirement.");
            return null;
        }
        SparseArray sparseArray = new SparseArray(list.size());
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            sparseArray.append(list.get(i14).intValue(), list2.get(i14));
        }
        return sparseArray;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final k63.e getF158591b() {
        return this.f158591b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        sparseArray.getClass();
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i14)));
        }
        int size2 = sparseArray.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i15 = 0; i15 < size2; i15++) {
            arrayList2.add(sparseArray.valueAt(i15));
        }
        fVar.l(this.f158590a, new a(arrayList, arrayList2));
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u0000 \r*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lsd/p$a;", "T", "", "", "", UserMetadata.KEYDATA_FILENAME, "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i63.h
    public static final class a<T> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f158592c = {o13.m.a(o13.n.PUBLICATION, new o(0)), null};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m1 f158593d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f158594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<T> f158595b;

        static {
            m1 m1Var = new m1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            m1Var.j(UserMetadata.KEYDATA_FILENAME, false);
            m1Var.j("values", false);
            f158593d = m1Var;
        }

        public /* synthetic */ a(int i14, List list, List list2, u1 u1Var) {
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, f158593d);
                throw null;
            }
            this.f158594a = list;
            this.f158595b = list2;
        }

        /* JADX INFO: renamed from: sd.p$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsd/p$a$b;", "", "<init>", "()V", "T", "Li63/c;", "typeSerial0", "Lsd/p$a;", "serializer", "(Li63/c;)Li63/c;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final <T> i63.c<a<T>> serializer(i63.c<T> typeSerial0) {
                typeSerial0.getClass();
                return new C2994a(typeSerial0);
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<Integer> list, List<? extends T> list2) {
            list.getClass();
            list2.getClass();
            this.f158594a = list;
            this.f158595b = list2;
        }

        /* JADX INFO: renamed from: sd.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", "T", "Lm63/e0;", "Lsd/p$a;", "<init>", "()V", "Li63/c;", "typeSerial0", "(Li63/c;)V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C2994a<T> implements e0<a<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i63.c<?> f158596a;
            private final k63.e descriptor;

            private C2994a() {
                m1 m1Var = new m1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                m1Var.j(UserMetadata.KEYDATA_FILENAME, false);
                m1Var.j("values", false);
                this.descriptor = m1Var;
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{a.f158592c[0].getValue(), new m63.e(this.f158596a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = this.descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = a.f158592c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                List list = null;
                List list2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        list2 = (List) cVarC.l(eVar2, 1, new m63.e(this.f158596a), list2);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new a(i15, list, list2, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor, reason: from getter */
            public final k63.e getF158591b() {
                return this.descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                k63.e eVar = this.descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, a.f158592c[0].getValue(), aVar.f158594a);
                dVarC.e(eVar, 1, new m63.e(this.f158596a), aVar.f158595b);
                dVarC.b(eVar);
            }

            @Override // m63.e0
            public final i63.c<?>[] typeParametersSerializers() {
                return new i63.c[]{this.f158596a};
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2994a(i63.c<T> cVar) {
                this();
                cVar.getClass();
                this.f158596a = cVar;
            }
        }
    }
}
