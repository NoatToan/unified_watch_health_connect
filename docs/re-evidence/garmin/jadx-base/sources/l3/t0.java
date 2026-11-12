package l3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll3/t0;", "T", "Lh4/r$c;", "Lh5/c0;", "Ly1/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function2;", "Lg6/m;", "Lg6/a;", "Lo13/p;", "Ly1/w0;", "anchors", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "<init>", "(Ly1/r;Le23/p;Ly1/b2;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0<T> extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p008y1.r<T> f109420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.p<? super g6.m, ? super g6.a, ? extends o13.p<? extends p008y1.w0<T>, ? extends T>> f109421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p008y1.b2 f109422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f109423d;

    public t0(p008y1.r<T> rVar, e23.p<? super g6.m, ? super g6.a, ? extends o13.p<? extends p008y1.w0<T>, ? extends T>> pVar, p008y1.b2 b2Var) {
        this.f109420a = rVar;
        this.f109421b = pVar;
        this.f109422c = b2Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        if (!b1Var.t1() || !this.f109423d) {
            long j14 = (((long) v1VarQ.f69145b) & 4294967295L) | (((long) v1VarQ.f69144a) << 32);
            g6.m.a aVar = g6.m.f76012b;
            o13.p<? extends p008y1.w0<T>, ? extends T> pVarInvoke = this.f109421b.invoke(g6.m.a(j14), g6.a.a(j8));
            p008y1.r rVar = (p008y1.r<T>) this.f109420a;
            p008y1.w0 w0Var = (p008y1.w0) pVarInvoke.f128594a;
            B b14 = pVarInvoke.f128595b;
            if (!p005kotlin.jvm.internal.s.g(rVar.b(), w0Var)) {
                rVar.f193591m.setValue(w0Var);
                if (!rVar.g(b14)) {
                    rVar.f193590l.setValue(b14);
                }
            }
        }
        this.f109423d = b1Var.t1() || this.f109423d;
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new k62.k(b1Var, 19, this, v1VarQ));
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f109423d = false;
    }
}
