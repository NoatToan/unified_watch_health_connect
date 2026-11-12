package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class v8i<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<c, List<b<P>>> f36618a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b<P> f36619b;
    public final Class<P> c;

    public static final class b<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P f36620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f36621b;
        public final KeyStatusType c;
        public final OutputPrefixType d;
        public final int e;

        public b(P p, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i) {
            this.f36620a = p;
            this.f36621b = Arrays.copyOf(bArr, bArr.length);
            this.c = keyStatusType;
            this.d = outputPrefixType;
            this.e = i;
        }

        public final byte[] a() {
            byte[] bArr = this.f36621b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public OutputPrefixType b() {
            return this.d;
        }

        public P c() {
            return this.f36620a;
        }

        public KeyStatusType d() {
            return this.c;
        }
    }

    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f36622a;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            byte[] bArr = this.f36622a;
            int length = bArr.length;
            byte[] bArr2 = cVar.f36622a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.f36622a;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b2 = bArr3[i];
                byte b3 = cVar.f36622a[i];
                if (b2 != b3) {
                    return b2 - b3;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.f36622a, ((c) obj).f36622a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f36622a);
        }

        public String toString() {
            return j7c.b(this.f36622a);
        }

        public c(byte[] bArr) {
            this.f36622a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public v8i(Class<P> cls) {
        this.c = cls;
    }

    public static <P> v8i<P> f(Class<P> cls) {
        return new v8i<>(cls);
    }

    public b<P> a(P p, com.google.crypto.tink.proto.a.c cVar) throws GeneralSecurityException {
        if (cVar.K() != KeyStatusType.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        b<P> bVar = new b<>(p, r45.a(cVar), cVar.K(), cVar.J(), cVar.I());
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        c cVar2 = new c(bVar.a());
        List<b<P>> listPut = this.f36618a.put(cVar2, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(bVar);
            this.f36618a.put(cVar2, Collections.unmodifiableList(arrayList2));
        }
        return bVar;
    }

    public b<P> b() {
        return this.f36619b;
    }

    public List<b<P>> c(byte[] bArr) {
        List<b<P>> list = this.f36618a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> d() {
        return this.c;
    }

    public List<b<P>> e() {
        return c(r45.f32167a);
    }

    public void g(b<P> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (bVar.d() != KeyStatusType.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if (c(bVar.a()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f36619b = bVar;
    }
}
