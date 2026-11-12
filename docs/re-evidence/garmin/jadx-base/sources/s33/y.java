package s33;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends z33.g implements z33.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f157023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f157024f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z33.c f157025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<x> f157026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f157027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f157028d;

    public static class a extends z33.b<y> {
        @Override // z33.p
        public final Object a(z33.d dVar, z33.e eVar) {
            return new y(dVar, eVar);
        }
    }

    public static final class b extends z33.g.b<y, b> implements z33.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f157029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<x> f157030c = Collections.EMPTY_LIST;

        private b() {
        }

        public static b f() {
            return new b();
        }

        @Override // z33.g.b, z33.a.AbstractC3766a
        public final z33.a.AbstractC3766a b() {
            b bVar = new b();
            bVar.h(g());
            return bVar;
        }

        @Override // z33.a.AbstractC3766a, z33.n.a
        public final /* bridge */ /* synthetic */ z33.n.a b1(z33.d dVar, z33.e eVar) throws Throwable {
            i(dVar, eVar);
            return this;
        }

        @Override // z33.n.a
        public final z33.n build() {
            y yVarG = g();
            if (yVarG.isInitialized()) {
                return yVarG;
            }
            throw new UninitializedMessageException(yVarG);
        }

        @Override // z33.a.AbstractC3766a
        /* JADX INFO: renamed from: c */
        public final /* bridge */ /* synthetic */ z33.a.AbstractC3766a b1(z33.d dVar, z33.e eVar) throws Throwable {
            i(dVar, eVar);
            return this;
        }

        @Override // z33.g.b, z33.a.AbstractC3766a
        /* JADX INFO: renamed from: clone */
        public final Object b() {
            b bVar = new b();
            bVar.h(g());
            return bVar;
        }

        @Override // z33.g.b
        /* JADX INFO: renamed from: d */
        public final z33.g.b b() {
            b bVar = new b();
            bVar.h(g());
            return bVar;
        }

        @Override // z33.g.b
        public final /* bridge */ /* synthetic */ z33.g.b e(z33.g gVar) {
            h((y) gVar);
            return this;
        }

        public final y g() {
            y yVar = new y(this);
            if ((this.f157029b & 1) == 1) {
                this.f157030c = Collections.unmodifiableList(this.f157030c);
                this.f157029b &= -2;
            }
            yVar.f157026b = this.f157030c;
            return yVar;
        }

        public final void h(y yVar) {
            if (yVar == y.f157023e) {
                return;
            }
            if (!yVar.f157026b.isEmpty()) {
                if (this.f157030c.isEmpty()) {
                    this.f157030c = yVar.f157026b;
                    this.f157029b &= -2;
                } else {
                    if ((this.f157029b & 1) != 1) {
                        this.f157030c = new ArrayList(this.f157030c);
                        this.f157029b |= 1;
                    }
                    this.f157030c.addAll(yVar.f157026b);
                }
            }
            this.f202188a = this.f202188a.b(yVar.f157025a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001b  */
        public final void i(z33.d dVar, z33.e eVar) throws Throwable {
            y yVar = null;
            try {
                try {
                    h((y) y.f157024f.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e4) {
                    y yVar2 = (y) e4.getUnfinishedMessage();
                    try {
                        throw e4;
                    } catch (Throwable th3) {
                        th = th3;
                        yVar = yVar2;
                        if (yVar != null) {
                            h(yVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (yVar != null) {
                    h(yVar);
                }
                throw th;
            }
        }
    }

    static {
        y yVar = new y(true);
        f157023e = yVar;
        yVar.f157026b = Collections.EMPTY_LIST;
    }

    private y(z33.d dVar, z33.e eVar) {
        this.f157027c = (byte) -1;
        this.f157028d = -1;
        this.f157026b = Collections.EMPTY_LIST;
        z33.c.b bVarI = z33.c.i();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarI, 1);
        boolean z14 = false;
        boolean z15 = false;
        while (!z14) {
            try {
                try {
                    int iO = dVar.o();
                    if (iO != 0) {
                        if (iO == 10) {
                            if (!z15) {
                                this.f157026b = new ArrayList();
                                z15 = true;
                            }
                            this.f157026b.add((x) dVar.h(x.f156995l, eVar));
                        } else if (!dVar.r(iO, codedOutputStreamJ)) {
                        }
                    }
                    z14 = true;
                } catch (Throwable th3) {
                    if (z15) {
                        this.f157026b = Collections.unmodifiableList(this.f157026b);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } finally {
                        this.f157025a = bVarI.e();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e4) {
                throw e4.setUnfinishedMessage(this);
            } catch (IOException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (z15) {
            this.f157026b = Collections.unmodifiableList(this.f157026b);
        }
        try {
            codedOutputStreamJ.i();
        } catch (IOException unused2) {
        } finally {
            this.f157025a = bVarI.e();
        }
    }

    @Override // z33.n
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i14 = 0; i14 < this.f157026b.size(); i14++) {
            codedOutputStream.o(1, this.f157026b.get(i14));
        }
        codedOutputStream.r(this.f157025a);
    }

    public final b d() {
        b bVarF = b.f();
        bVarF.h(this);
        return bVarF;
    }

    @Override // z33.n
    public final int getSerializedSize() {
        int i14 = this.f157028d;
        if (i14 != -1) {
            return i14;
        }
        int iD = 0;
        for (int i15 = 0; i15 < this.f157026b.size(); i15++) {
            iD += CodedOutputStream.d(1, this.f157026b.get(i15));
        }
        int size = this.f157025a.size() + iD;
        this.f157028d = size;
        return size;
    }

    @Override // z33.o
    public final boolean isInitialized() {
        byte b14 = this.f157027c;
        if (b14 == 1) {
            return true;
        }
        if (b14 == 0) {
            return false;
        }
        this.f157027c = (byte) 1;
        return true;
    }

    @Override // z33.n
    public final z33.n.a newBuilderForType() {
        return b.f();
    }

    @Override // z33.n
    public final z33.n.a toBuilder() {
        b bVarF = b.f();
        bVarF.h(this);
        return bVarF;
    }

    private y(z33.g.b bVar) {
        super(bVar);
        this.f157027c = (byte) -1;
        this.f157028d = -1;
        this.f157025a = bVar.f202188a;
    }

    private y(boolean z14) {
        this.f157027c = (byte) -1;
        this.f157028d = -1;
        this.f157025a = z33.c.f202161a;
    }
}
