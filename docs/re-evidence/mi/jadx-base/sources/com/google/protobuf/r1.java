package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public final class r1 implements q0 {
    public static final r1 c = new r1(Collections.emptyMap(), Collections.emptyMap());
    public static final d d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, c> f9738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, c> f9739b;

    public static final class b implements q0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<Integer, c> f9740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9741b;
        public c.a c;

        public static b f() {
            b bVar = new b();
            bVar.t();
            return bVar;
        }

        public b b(int i, c cVar) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.c != null && this.f9741b == i) {
                this.c = null;
                this.f9741b = 0;
            }
            if (this.f9740a.isEmpty()) {
                this.f9740a = new TreeMap();
            }
            this.f9740a.put(Integer.valueOf(i), cVar);
            return this;
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r1 build() {
            r1 r1Var;
            g(0);
            if (this.f9740a.isEmpty()) {
                r1Var = r1.c();
            } else {
                r1Var = new r1(Collections.unmodifiableMap(this.f9740a), Collections.unmodifiableMap(((TreeMap) this.f9740a).descendingMap()));
            }
            this.f9740a = null;
            return r1Var;
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r1 buildPartial() {
            return build();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b clone() {
            g(0);
            return r1.g().q(new r1(this.f9740a, Collections.unmodifiableMap(((TreeMap) this.f9740a).descendingMap())));
        }

        public final c.a g(int i) {
            c.a aVar = this.c;
            if (aVar != null) {
                int i2 = this.f9741b;
                if (i == i2) {
                    return aVar;
                }
                b(i2, aVar.g());
            }
            if (i == 0) {
                return null;
            }
            c cVar = this.f9740a.get(Integer.valueOf(i));
            this.f9741b = i;
            c.a aVarT = c.t();
            this.c = aVarT;
            if (cVar != null) {
                aVarT.i(cVar);
            }
            return this.c;
        }

        public boolean h(int i) {
            if (i != 0) {
                return i == this.f9741b || this.f9740a.containsKey(Integer.valueOf(i));
            }
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }

        public b i(int i, c cVar) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (h(i)) {
                g(i).i(cVar);
            } else {
                b(i, cVar);
            }
            return this;
        }

        public boolean j(int i, j jVar) throws IOException {
            int iA = WireFormat.a(i);
            int iB = WireFormat.b(i);
            if (iB == 0) {
                g(iA).f(jVar.y());
                return true;
            }
            if (iB == 1) {
                g(iA).c(jVar.u());
                return true;
            }
            if (iB == 2) {
                g(iA).e(jVar.q());
                return true;
            }
            if (iB == 3) {
                b bVarG = r1.g();
                jVar.w(iA, bVarG, s.g());
                g(iA).d(bVarG.build());
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            g(iA).b(jVar.t());
            return true;
        }

        public b k(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                j jVarNewCodedInput = byteString.newCodedInput();
                l(jVarNewCodedInput);
                jVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        public b l(j jVar) throws IOException {
            int iJ;
            do {
                iJ = jVar.J();
                if (iJ == 0) {
                    break;
                }
            } while (j(iJ, jVar));
            return this;
        }

        @Override // com.google.protobuf.q0.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws IOException {
            return l(jVar);
        }

        @Override // com.google.protobuf.q0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(q0 q0Var) {
            if (q0Var instanceof r1) {
                return q((r1) q0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public b q(r1 r1Var) {
            if (r1Var != r1.c()) {
                for (Map.Entry entry : r1Var.f9738a.entrySet()) {
                    i(((Integer) entry.getKey()).intValue(), (c) entry.getValue());
                }
            }
            return this;
        }

        @Override // com.google.protobuf.q0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            try {
                j jVarK = j.k(bArr);
                l(jVarK);
                jVarK.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
            }
        }

        public b s(int i, int i2) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            g(i).f(i2);
            return this;
        }

        public final void t() {
            this.f9740a = Collections.emptyMap();
            this.f9741b = 0;
            this.c = null;
        }
    }

    public static final class c {
        public static final c f = t().g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Long> f9742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Integer> f9743b;
        public List<Long> c;
        public List<ByteString> d;
        public List<r1> e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public c f9744a;

            public static a h() {
                a aVar = new a();
                aVar.f9744a = new c();
                return aVar;
            }

            public a b(int i) {
                if (this.f9744a.f9743b == null) {
                    this.f9744a.f9743b = new ArrayList();
                }
                this.f9744a.f9743b.add(Integer.valueOf(i));
                return this;
            }

            public a c(long j) {
                if (this.f9744a.c == null) {
                    this.f9744a.c = new ArrayList();
                }
                this.f9744a.c.add(Long.valueOf(j));
                return this;
            }

            public a d(r1 r1Var) {
                if (this.f9744a.e == null) {
                    this.f9744a.e = new ArrayList();
                }
                this.f9744a.e.add(r1Var);
                return this;
            }

            public a e(ByteString byteString) {
                if (this.f9744a.d == null) {
                    this.f9744a.d = new ArrayList();
                }
                this.f9744a.d.add(byteString);
                return this;
            }

            public a f(long j) {
                if (this.f9744a.f9742a == null) {
                    this.f9744a.f9742a = new ArrayList();
                }
                this.f9744a.f9742a.add(Long.valueOf(j));
                return this;
            }

            public c g() {
                if (this.f9744a.f9742a == null) {
                    this.f9744a.f9742a = Collections.emptyList();
                } else {
                    c cVar = this.f9744a;
                    cVar.f9742a = Collections.unmodifiableList(cVar.f9742a);
                }
                if (this.f9744a.f9743b == null) {
                    this.f9744a.f9743b = Collections.emptyList();
                } else {
                    c cVar2 = this.f9744a;
                    cVar2.f9743b = Collections.unmodifiableList(cVar2.f9743b);
                }
                if (this.f9744a.c == null) {
                    this.f9744a.c = Collections.emptyList();
                } else {
                    c cVar3 = this.f9744a;
                    cVar3.c = Collections.unmodifiableList(cVar3.c);
                }
                if (this.f9744a.d == null) {
                    this.f9744a.d = Collections.emptyList();
                } else {
                    c cVar4 = this.f9744a;
                    cVar4.d = Collections.unmodifiableList(cVar4.d);
                }
                if (this.f9744a.e == null) {
                    this.f9744a.e = Collections.emptyList();
                } else {
                    c cVar5 = this.f9744a;
                    cVar5.e = Collections.unmodifiableList(cVar5.e);
                }
                c cVar6 = this.f9744a;
                this.f9744a = null;
                return cVar6;
            }

            public a i(c cVar) {
                if (!cVar.f9742a.isEmpty()) {
                    if (this.f9744a.f9742a == null) {
                        this.f9744a.f9742a = new ArrayList();
                    }
                    this.f9744a.f9742a.addAll(cVar.f9742a);
                }
                if (!cVar.f9743b.isEmpty()) {
                    if (this.f9744a.f9743b == null) {
                        this.f9744a.f9743b = new ArrayList();
                    }
                    this.f9744a.f9743b.addAll(cVar.f9743b);
                }
                if (!cVar.c.isEmpty()) {
                    if (this.f9744a.c == null) {
                        this.f9744a.c = new ArrayList();
                    }
                    this.f9744a.c.addAll(cVar.c);
                }
                if (!cVar.d.isEmpty()) {
                    if (this.f9744a.d == null) {
                        this.f9744a.d = new ArrayList();
                    }
                    this.f9744a.d.addAll(cVar.d);
                }
                if (!cVar.e.isEmpty()) {
                    if (this.f9744a.e == null) {
                        this.f9744a.e = new ArrayList();
                    }
                    this.f9744a.e.addAll(cVar.e);
                }
                return this;
            }
        }

        public c() {
        }

        public static a t() {
            return a.h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Arrays.equals(o(), ((c) obj).o());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(o());
        }

        public List<Integer> l() {
            return this.f9743b;
        }

        public List<Long> m() {
            return this.c;
        }

        public List<r1> n() {
            return this.e;
        }

        public final Object[] o() {
            return new Object[]{this.f9742a, this.f9743b, this.c, this.d, this.e};
        }

        public List<ByteString> p() {
            return this.d;
        }

        public int q(int i) {
            Iterator<Long> it = this.f9742a.iterator();
            int iT = 0;
            while (it.hasNext()) {
                iT += CodedOutputStream.a0(i, it.next().longValue());
            }
            Iterator<Integer> it2 = this.f9743b.iterator();
            while (it2.hasNext()) {
                iT += CodedOutputStream.n(i, it2.next().intValue());
            }
            Iterator<Long> it3 = this.c.iterator();
            while (it3.hasNext()) {
                iT += CodedOutputStream.p(i, it3.next().longValue());
            }
            Iterator<ByteString> it4 = this.d.iterator();
            while (it4.hasNext()) {
                iT += CodedOutputStream.h(i, it4.next());
            }
            Iterator<r1> it5 = this.e.iterator();
            while (it5.hasNext()) {
                iT += CodedOutputStream.t(i, it5.next());
            }
            return iT;
        }

        public int r(int i) {
            Iterator<ByteString> it = this.d.iterator();
            int iL = 0;
            while (it.hasNext()) {
                iL += CodedOutputStream.L(i, it.next());
            }
            return iL;
        }

        public List<Long> s() {
            return this.f9742a;
        }

        public void u(int i, CodedOutputStream codedOutputStream) throws IOException {
            Iterator<ByteString> it = this.d.iterator();
            while (it.hasNext()) {
                codedOutputStream.O0(i, it.next());
            }
        }

        public final void v(int i, Writer writer) throws IOException {
            if (writer.B() != Writer.FieldOrder.DESCENDING) {
                Iterator<ByteString> it = this.d.iterator();
                while (it.hasNext()) {
                    writer.b(i, it.next());
                }
            } else {
                List<ByteString> list = this.d;
                ListIterator<ByteString> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    writer.b(i, listIterator.previous());
                }
            }
        }

        public void w(int i, CodedOutputStream codedOutputStream) throws IOException {
            Iterator<Long> it = this.f9742a.iterator();
            while (it.hasNext()) {
                codedOutputStream.d1(i, it.next().longValue());
            }
            Iterator<Integer> it2 = this.f9743b.iterator();
            while (it2.hasNext()) {
                codedOutputStream.w0(i, it2.next().intValue());
            }
            Iterator<Long> it3 = this.c.iterator();
            while (it3.hasNext()) {
                codedOutputStream.y0(i, it3.next().longValue());
            }
            Iterator<ByteString> it4 = this.d.iterator();
            while (it4.hasNext()) {
                codedOutputStream.q0(i, it4.next());
            }
            Iterator<r1> it5 = this.e.iterator();
            while (it5.hasNext()) {
                codedOutputStream.C0(i, it5.next());
            }
        }

        public void x(int i, Writer writer) throws IOException {
            writer.H(i, this.f9742a, false);
            writer.h(i, this.f9743b, false);
            writer.q(i, this.c, false);
            writer.u(i, this.d);
            if (writer.B() == Writer.FieldOrder.ASCENDING) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    writer.p(i);
                    this.e.get(i2).n(writer);
                    writer.r(i);
                }
                return;
            }
            for (int size = this.e.size() - 1; size >= 0; size--) {
                writer.r(i);
                this.e.get(size).n(writer);
                writer.p(i);
            }
        }
    }

    public static final class d extends com.google.protobuf.c<r1> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r1 parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            b bVarG = r1.g();
            try {
                bVarG.l(jVar);
                return bVarG.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(bVarG.buildPartial());
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(bVarG.buildPartial());
            }
        }
    }

    public r1() {
        this.f9738a = null;
        this.f9739b = null;
    }

    public static r1 c() {
        return c;
    }

    public static b g() {
        return b.f();
    }

    public static b h(r1 r1Var) {
        return g().q(r1Var);
    }

    public static r1 j(ByteString byteString) throws InvalidProtocolBufferException {
        return g().k(byteString).build();
    }

    public Map<Integer, c> b() {
        return this.f9738a;
    }

    @Override // defpackage.bsf, com.google.protobuf.s0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public r1 getDefaultInstanceForType() {
        return c;
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final d getParserForType() {
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.f9738a.equals(((r1) obj).f9738a);
    }

    public int f() {
        int iR = 0;
        for (Map.Entry<Integer, c> entry : this.f9738a.entrySet()) {
            iR += entry.getValue().r(entry.getKey().intValue());
        }
        return iR;
    }

    @Override // com.google.protobuf.q0
    public int getSerializedSize() {
        int iQ = 0;
        for (Map.Entry<Integer, c> entry : this.f9738a.entrySet()) {
            iQ += entry.getValue().q(entry.getKey().intValue());
        }
        return iQ;
    }

    public int hashCode() {
        return this.f9738a.hashCode();
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return g();
    }

    @Override // defpackage.bsf
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return g().q(this);
    }

    public void l(CodedOutputStream codedOutputStream) throws IOException {
        for (Map.Entry<Integer, c> entry : this.f9738a.entrySet()) {
            entry.getValue().u(entry.getKey().intValue(), codedOutputStream);
        }
    }

    public void m(Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            for (Map.Entry<Integer, c> entry : this.f9739b.entrySet()) {
                entry.getValue().v(entry.getKey().intValue(), writer);
            }
            return;
        }
        for (Map.Entry<Integer, c> entry2 : this.f9738a.entrySet()) {
            entry2.getValue().v(entry2.getKey().intValue(), writer);
        }
    }

    public void n(Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            for (Map.Entry<Integer, c> entry : this.f9739b.entrySet()) {
                entry.getValue().x(entry.getKey().intValue(), writer);
            }
            return;
        }
        for (Map.Entry<Integer, c> entry2 : this.f9738a.entrySet()) {
            entry2.getValue().x(entry2.getKey().intValue(), writer);
        }
    }

    @Override // com.google.protobuf.q0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamI0 = CodedOutputStream.i0(bArr);
            writeTo(codedOutputStreamI0);
            codedOutputStreamI0.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // com.google.protobuf.q0
    public ByteString toByteString() {
        try {
            ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(hVarNewCodedBuilder.b());
            return hVarNewCodedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return TextFormat.o().k(this);
    }

    @Override // com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (Map.Entry<Integer, c> entry : this.f9738a.entrySet()) {
            entry.getValue().w(entry.getKey().intValue(), codedOutputStream);
        }
    }

    public r1(Map<Integer, c> map, Map<Integer, c> map2) {
        this.f9738a = map;
        this.f9739b = map2;
    }
}
