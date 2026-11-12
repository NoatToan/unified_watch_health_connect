package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends z33.g.d<e> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f156587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f156588l = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.c f156589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f156590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<w> f156592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<Integer> f156593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<d> f156594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<s33.b> f156595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f156596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156597j;

    public static class a extends z33.b<e> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new e(dVar, eVar);
        }
    }

    public static final class b extends z33.g.c<e, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f156598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f156599e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<w> f156600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<Integer> f156601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<d> f156602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<s33.b> f156603i;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f156600f = list;
            this.f156601g = list;
            this.f156602h = list;
            this.f156603i = list;
        }

        public static b h() {
            return new b();
        }

        @Override // z33.g.c, z33.g.b, z33.a.AbstractC3766a
        public final z33.a.AbstractC3766a b() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        @Override // z33.a.AbstractC3766a, z33.n.a
        public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
            k(dVar, eVar);
            return this;
        }

        @Override // z33.n.a
        public final z33.n build() {
            e eVarI = i();
            if (eVarI.isInitialized()) {
                return eVarI;
            }
            throw new UninitializedMessageException(eVarI);
        }

        @Override // z33.a.AbstractC3766a
        /* JADX INFO: renamed from: c */
        public final /* bridge */ /* synthetic */ z33.a.AbstractC3766a b1(z33.d dVar, z33.e eVar) throws Throwable {
            k(dVar, eVar);
            return this;
        }

        @Override // z33.g.c, z33.g.b, z33.a.AbstractC3766a
        /* JADX INFO: renamed from: clone */
        public final Object b() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        @Override // z33.g.c, z33.g.b
        /* JADX INFO: renamed from: d */
        public final z33.g.b b() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        @Override // z33.g.b
        public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
            j((e) gVar);
            return this;
        }

        @Override // z33.g.c
        /* JADX INFO: renamed from: f */
        public final z33.g.c clone() {
            b bVar = new b();
            bVar.j(i());
            return bVar;
        }

        public final e i() {
            e eVar = new e(this);
            int i14 = this.f156598d;
            int i15 = (i14 & 1) != 1 ? 0 : 1;
            eVar.f156591d = this.f156599e;
            if ((i14 & 2) == 2) {
                this.f156600f = Collections.unmodifiableList(this.f156600f);
                this.f156598d &= -3;
            }
            eVar.f156592e = this.f156600f;
            if ((this.f156598d & 4) == 4) {
                this.f156601g = Collections.unmodifiableList(this.f156601g);
                this.f156598d &= -5;
            }
            eVar.f156593f = this.f156601g;
            if ((this.f156598d & 8) == 8) {
                this.f156602h = Collections.unmodifiableList(this.f156602h);
                this.f156598d &= -9;
            }
            eVar.f156594g = this.f156602h;
            if ((this.f156598d & 16) == 16) {
                this.f156603i = Collections.unmodifiableList(this.f156603i);
                this.f156598d &= -17;
            }
            eVar.f156595h = this.f156603i;
            eVar.f156590c = i15;
            return eVar;
        }

        public final void j(e eVar) {
            if (eVar == e.f156587k) {
                return;
            }
            if ((eVar.f156590c & 1) == 1) {
                int i14 = eVar.f156591d;
                this.f156598d = 1 | this.f156598d;
                this.f156599e = i14;
            }
            if (!eVar.f156592e.isEmpty()) {
                if (this.f156600f.isEmpty()) {
                    this.f156600f = eVar.f156592e;
                    this.f156598d &= -3;
                } else {
                    if ((this.f156598d & 2) != 2) {
                        this.f156600f = new ArrayList(this.f156600f);
                        this.f156598d |= 2;
                    }
                    this.f156600f.addAll(eVar.f156592e);
                }
            }
            if (!eVar.f156593f.isEmpty()) {
                if (this.f156601g.isEmpty()) {
                    this.f156601g = eVar.f156593f;
                    this.f156598d &= -5;
                } else {
                    if ((this.f156598d & 4) != 4) {
                        this.f156601g = new ArrayList(this.f156601g);
                        this.f156598d |= 4;
                    }
                    this.f156601g.addAll(eVar.f156593f);
                }
            }
            if (!eVar.f156594g.isEmpty()) {
                if (this.f156602h.isEmpty()) {
                    this.f156602h = eVar.f156594g;
                    this.f156598d &= -9;
                } else {
                    if ((this.f156598d & 8) != 8) {
                        this.f156602h = new ArrayList(this.f156602h);
                        this.f156598d |= 8;
                    }
                    this.f156602h.addAll(eVar.f156594g);
                }
            }
            if (!eVar.f156595h.isEmpty()) {
                if (this.f156603i.isEmpty()) {
                    this.f156603i = eVar.f156595h;
                    this.f156598d &= -17;
                } else {
                    if ((this.f156598d & 16) != 16) {
                        this.f156603i = new ArrayList(this.f156603i);
                        this.f156598d |= 16;
                    }
                    this.f156603i.addAll(eVar.f156595h);
                }
            }
            g(eVar);
            this.f202188a = this.f202188a.b(eVar.f156589b);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void k(z33.d dVar, z33.e eVar) throws Throwable {
            e eVar2 = null;
            try {
                try {
                    j((e) e.f156588l.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    e eVar3 = (e) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        eVar2 = eVar3;
                        if (eVar2 != null) {
                            j(eVar2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (eVar2 != null) {
                    j(eVar2);
                }
                throw th;
            }
        }
    }

    static {
        e eVar = new e(true);
        f156587k = eVar;
        eVar.f156591d = 6;
        List list = Collections.EMPTY_LIST;
        eVar.f156592e = list;
        eVar.f156593f = list;
        eVar.f156594g = list;
        eVar.f156595h = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private e(z33.d dVar, z33.e eVar) {
        this.f156596i = (byte) -1;
        this.f156597j = -1;
        this.f156591d = 6;
        List list = Collections.EMPTY_LIST;
        this.f156592e = list;
        this.f156593f = list;
        this.f156594g = list;
        this.f156595h = list;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        int i14 = 0;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.f156590c |= 1;
                            this.f156591d = dVar.l();
                        } else if (iO == 18) {
                            if ((i14 & 2) != 2) {
                                this.f156592e = new ArrayList();
                                i14 |= 2;
                            }
                            this.f156592e.add((w) dVar.h(w.f156972o, eVar));
                        } else if (iO == 26) {
                            if ((i14 & 16) != 16) {
                                this.f156595h = new ArrayList();
                                i14 |= 16;
                            }
                            this.f156595h.add((s33.b) dVar.h(s33.b.f156458h, eVar));
                        } else if (iO == 248) {
                            if ((i14 & 4) != 4) {
                                this.f156593f = new ArrayList();
                                i14 |= 4;
                            }
                            this.f156593f.add(Integer.valueOf(dVar.l()));
                        } else if (iO == 250) {
                            int iE = dVar.e(dVar.l());
                            if ((i14 & 4) != 4 && dVar.b() > 0) {
                                this.f156593f = new ArrayList();
                                i14 |= 4;
                            }
                            while (dVar.b() > 0) {
                                this.f156593f.add(Integer.valueOf(dVar.l()));
                            }
                            dVar.d(iE);
                        } else if (iO == 258) {
                            if ((i14 & 8) != 8) {
                                this.f156594g = new ArrayList();
                                i14 |= 8;
                            }
                            this.f156594g.add((d) dVar.h(d.f156577h, eVar));
                        } else if (!k(dVar, codedOutputStreamJ, eVar, iO)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if ((i14 & 2) == 2) {
                        this.f156592e = Collections.unmodifiableList(this.f156592e);
                    }
                    if ((i14 & 16) == 16) {
                        this.f156595h = Collections.unmodifiableList(this.f156595h);
                    }
                    if ((i14 & 4) == 4) {
                        this.f156593f = Collections.unmodifiableList(this.f156593f);
                    }
                    if ((i14 & 8) == 8) {
                        this.f156594g = Collections.unmodifiableList(this.f156594g);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f156589b = bVarI.e();
                    }
                    h();
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if ((i14 & 2) == 2) {
            this.f156592e = Collections.unmodifiableList(this.f156592e);
        }
        if ((i14 & 16) == 16) {
            this.f156595h = Collections.unmodifiableList(this.f156595h);
        }
        if ((i14 & 4) == 4) {
            this.f156593f = Collections.unmodifiableList(this.f156593f);
        }
        if ((i14 & 8) == 8) {
            this.f156594g = Collections.unmodifiableList(this.f156594g);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f156589b = bVarI.e();
        }
        h();
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        z33.g.d<MessageType>.a aVarI = i();
        if ((this.f156590c & 1) == 1) {
            codedOutputStream.m(1, this.f156591d);
        }
        for (int i14 = 0; i14 < this.f156592e.size(); i14++) {
            codedOutputStream.o(2, this.f156592e.get(i14));
        }
        for (int i15 = 0; i15 < this.f156595h.size(); i15++) {
            codedOutputStream.o(3, this.f156595h.get(i15));
        }
        for (int i16 = 0; i16 < this.f156593f.size(); i16++) {
            codedOutputStream.m(31, this.f156593f.get(i16).intValue());
        }
        for (int i17 = 0; i17 < this.f156594g.size(); i17++) {
            codedOutputStream.o(32, this.f156594g.get(i17));
        }
        aVarI.a(19000, codedOutputStream);
        codedOutputStream.r(this.f156589b);
    }

    @Override // z33.o
    public final z33.n getDefaultInstanceForType() {
        return f156587k;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        List<Integer> list;
        int i14 = this.f156597j;
        if (i14 != -1) {
            return i14;
        }
        int iB = (this.f156590c & 1) == 1 ? CodedOutputStream.b(1, this.f156591d) : 0;
        for (int i15 = 0; i15 < this.f156592e.size(); i15++) {
            iB += CodedOutputStream.d(2, this.f156592e.get(i15));
        }
        for (int i16 = 0; i16 < this.f156595h.size(); i16++) {
            iB += CodedOutputStream.d(3, this.f156595h.get(i16));
        }
        int i17 = 0;
        int iC = 0;
        while (true) {
            int size = this.f156593f.size();
            list = this.f156593f;
            if (i17 >= size) {
                break;
            }
            iC += CodedOutputStream.c(list.get(i17).intValue());
            i17++;
        }
        int iC2 = org.apache.commons.lang3.e.c(2, iB + iC, list);
        for (int i18 = 0; i18 < this.f156594g.size(); i18++) {
            iC2 += CodedOutputStream.d(32, this.f156594g.get(i18));
        }
        int size2 = this.f156589b.size() + e() + iC2;
        this.f156597j = size2;
        return size2;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f156596i;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        for (int i14 = 0; i14 < this.f156592e.size(); i14++) {
            if (!this.f156592e.get(i14).isInitialized()) {
                this.f156596i = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f156594g.size(); i15++) {
            if (!this.f156594g.get(i15).isInitialized()) {
                this.f156596i = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f156595h.size(); i16++) {
            if (!this.f156595h.get(i16).isInitialized()) {
                this.f156596i = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f156596i = (byte) 1;
            return true;
        }
        this.f156596i = (byte) 0;
        return false;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return b.h();
    }

    @Override // z33.n
    public final z33.n.a toBuilder() {
        b bVarH = b.h();
        bVarH.j(this);
        return bVarH;
    }

    private e(z33.g.c<e, ?> cVar) {
        super(cVar);
        this.f156596i = (byte) -1;
        this.f156597j = -1;
        this.f156589b = cVar.f202188a;
    }

    private e(boolean z14) {
        this.f156596i = (byte) -1;
        this.f156597j = -1;
        this.f156589b = z33.c.f202161a;
    }
}
