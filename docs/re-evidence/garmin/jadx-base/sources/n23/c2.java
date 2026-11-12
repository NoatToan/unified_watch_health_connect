package n23;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ln23/c2;", "", "<init>", "()V", "c", "b", "a", "d", "Ln23/c2$a;", "Ln23/c2$b;", "Ln23/c2$c;", "Ln23/c2$d;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c2 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/c2$a;", "Ln23/c2;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f122406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            field.getClass();
            this.f122406a = field;
        }

        @Override // n23.c2
        /* JADX INFO: renamed from: a */
        public final String getF122414f() {
            StringBuilder sb3 = new StringBuilder();
            Field field = this.f122406a;
            String name = field.getName();
            name.getClass();
            sb3.append(h33.b0.a(name));
            sb3.append("()");
            Class<?> type = field.getType();
            type.getClass();
            sb3.append(z23.f.b(type));
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln23/c2$b;", "Ln23/c2;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f122407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f122408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            method.getClass();
            this.f122407a = method;
            this.f122408b = method2;
        }

        @Override // n23.c2
        /* JADX INFO: renamed from: a */
        public final String getF122414f() {
            return gl.b.f(this.f122407a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln23/c2$c;", "Ln23/c2;", "Lt23/r0;", "descriptor", "Ls33/o;", "proto", "Lv33/a$d;", "signature", "Lu33/d;", "nameResolver", "Lu33/h;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t23.r0 f122409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s33.o f122410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v33.a.d f122411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u33.d f122412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final u33.h f122413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f122414f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
        public c(t23.r0 r0Var, s33.o oVar, v33.a.d dVar, u33.d dVar2, u33.h hVar) {
            String string;
            String strH;
            super(null);
            r0Var.getClass();
            oVar.getClass();
            dVar.getClass();
            dVar2.getClass();
            hVar.getClass();
            this.f122409a = r0Var;
            this.f122410b = oVar;
            this.f122411c = dVar;
            this.f122412d = dVar2;
            this.f122413e = hVar;
            if (dVar.d()) {
                strH = dVar2.getString(dVar.f175462e.f175449c).concat(dVar2.getString(dVar.f175462e.f175450d));
            } else {
                w33.g.f181902a.getClass();
                w33.d.a aVarB = w33.g.b(oVar, dVar2, hVar, true);
                if (aVarB == null) {
                    lc.u0.t(r0Var, "No field signature for property: ");
                    throw null;
                }
                String str = aVarB.f181893a;
                String str2 = aVarB.f181894b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(h33.b0.a(str));
                t23.l lVarD = r0Var.d();
                lVarD.getClass();
                if (p005kotlin.jvm.internal.s.g(r0Var.getVisibility(), t23.q.f162049d) && (lVarD instanceof n43.n)) {
                    s33.c cVar = ((n43.n) lVarD).f123654f;
                    z33.g.f<s33.c, Integer> fVar = v33.a.f175428g;
                    fVar.getClass();
                    Integer num = (Integer) u33.f.a(cVar, fVar);
                    string = "$".concat(x33.g.f188607a.f(num != null ? dVar2.getString(num.intValue()) : "main", "_"));
                } else if (p005kotlin.jvm.internal.s.g(r0Var.getVisibility(), t23.q.f162046a) && (lVarD instanceof t23.h0)) {
                    n43.v vVar = ((n43.g0) r0Var).P;
                    if (vVar instanceof q33.r) {
                        q33.r rVar = (q33.r) vVar;
                        if (rVar.f142523c != null) {
                            StringBuilder sb4 = new StringBuilder("$");
                            String strE = rVar.f142522b.e();
                            strE.getClass();
                            sb4.append(x33.f.e(d53.w.d0(IOUtils.DIR_SEPARATOR_UNIX, strE, strE)).b());
                            string = sb4.toString();
                        } else {
                            string = "";
                        }
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
                strH = v.e0.h(sb3, string, "()", str2);
            }
            this.f122414f = strH;
        }

        @Override // n23.c2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF122414f() {
            return this.f122414f;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln23/c2$d;", "Ln23/c2;", "Ln23/a2$e;", "getterSignature", "setterSignature", "<init>", "(Ln23/a2$e;Ln23/a2$e;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a2.e f122415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a2.e f122416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a2.e eVar, a2.e eVar2) {
            super(null);
            eVar.getClass();
            this.f122415a = eVar;
            this.f122416b = eVar2;
        }

        @Override // n23.c2
        /* JADX INFO: renamed from: a */
        public final String getF122414f() {
            return this.f122415a.f122392b;
        }
    }

    public /* synthetic */ c2(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF122414f();

    private c2() {
    }
}
