package f33;

import c33.t;
import d33.m;
import d33.o;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p13.s;
import s33.v;
import u33.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f68703a = new b(null);

    public static final class g extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Metadata metadata, boolean z14) {
            super(null);
            metadata.getClass();
            new f33.c(metadata.mv());
            metadata.xi();
        }
    }

    public /* synthetic */ e(j jVar) {
        this();
    }

    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    private e() {
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f68705b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(Metadata metadata, boolean z14) {
            this(s.c(metadata.d1()), new f33.c(metadata.mv()), metadata.xi());
            metadata.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> list, f33.c cVar, int i14) {
            super(null);
            list.getClass();
            cVar.getClass();
            this.f68705b = list;
        }
    }

    public static final class c extends e {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(Metadata metadata, boolean z14) {
            this(g33.g.b(metadata), new f33.c(metadata.mv()), metadata.xi());
            metadata.getClass();
            g33.g.f75724a.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, f33.c cVar, int i14) {
            super(null);
            tVar.getClass();
            cVar.getClass();
        }
    }

    /* JADX INFO: renamed from: f33.e$e, reason: collision with other inner class name */
    public static final class C1421e extends e {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C1421e(Metadata metadata, boolean z14) {
            this(g33.g.b(metadata), metadata.xs(), new f33.c(metadata.mv()), metadata.xi());
            metadata.getClass();
            g33.g.f75724a.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1421e(t tVar, String str, f33.c cVar, int i14) {
            super(null);
            tVar.getClass();
            str.getClass();
            cVar.getClass();
        }
    }

    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c33.f f68704b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Metadata metadata, boolean z14) throws InvalidProtocolBufferException {
            metadata.getClass();
            g33.g.f75724a.getClass();
            p<w33.e, s33.c> pVarF = w33.g.f(dh.b.O(metadata), metadata.d2());
            this(o.c(pVarF.f128595b, pVarF.f128594a, g33.g.a(metadata), 4), new f33.c(metadata.mv()), metadata.xi());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c33.f fVar, f33.c cVar, int i14) {
            super(null);
            fVar.getClass();
            cVar.getClass();
            this.f68704b = fVar;
        }
    }

    public static final class f extends e {
        public f(Metadata metadata, boolean z14) {
            metadata.getClass();
            g33.g.f75724a.getClass();
            String[] strArrD1 = metadata.d1();
            c33.s sVar = null;
            strArrD1 = strArrD1.length == 0 ? null : strArrD1;
            if (strArrD1 != null) {
                p<w33.e, s33.j> pVarG = w33.g.g(strArrD1, metadata.d2());
                w33.e eVar = pVarG.f128594a;
                s33.j jVar = pVarG.f128595b;
                boolean zA = g33.g.a(metadata);
                jVar.getClass();
                eVar.getClass();
                c33.s sVar2 = new c33.s();
                v vVar = jVar.f156696q;
                vVar.getClass();
                h hVar = new h(vVar);
                u33.j.f168343b.getClass();
                o.e(jVar, new m(eVar, hVar, u33.j.f168344c, zA, null, null, 48, null));
                sVar = sVar2;
            }
            this(sVar, new f33.c(metadata.mv()), metadata.xi());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c33.s sVar, f33.c cVar, int i14) {
            super(null);
            cVar.getClass();
        }
    }
}
