package d4;

import ch.qos.logback.core.joran.action.Action;
import f4.q;
import p005kotlin.Metadata;
import p3.a4;
import p3.p3;
import p3.t1;
import p3.x2;
import p3.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ld4/b;", "T", "Ld4/n;", "Lp3/y2;", "Ld4/k;", "", "saver", "Ld4/f;", "registry", "", Action.KEY_ATTRIBUTE, "value", "", "inputs", "<init>", "(Ld4/k;Ld4/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> implements n, y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k<T, Object> f57426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f57427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f57428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f57429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f57430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f.a f57431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cq0.g f57432g = new cq0.g(this, 8);

    public b(k<T, Object> kVar, f fVar, String str, T t7, Object[] objArr) {
        this.f57426a = kVar;
        this.f57427b = fVar;
        this.f57428c = str;
        this.f57429d = t7;
        this.f57430e = objArr;
    }

    @Override // d4.n
    public final boolean a(Object obj) {
        f fVar = this.f57427b;
        return fVar == null || fVar.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0042, please report this as an issue */
    public final void b() {
        String strA;
        f fVar = this.f57427b;
        if (this.f57431f != null) {
            androidx.core.view.j.s("entry(", this.f57431f, ") is not null");
            return;
        }
        if (fVar != null) {
            cq0.g gVar = this.f57432g;
            Object objInvoke = gVar.invoke();
            if (objInvoke == null || fVar.a(objInvoke)) {
                this.f57431f = fVar.f(this.f57428c, gVar);
                return;
            }
            if (objInvoke instanceof q) {
                q qVar = (q) objInvoke;
                p3<T> p3VarB = qVar.b();
                t1 t1Var = t1.f135313a;
                t1Var.getClass();
                if (p3VarB != t1Var) {
                    p3<T> p3VarB2 = qVar.b();
                    a4 a4Var = a4.f135041a;
                    a4Var.getClass();
                    if (p3VarB2 != a4Var) {
                        p3<T> p3VarB3 = qVar.b();
                        x2 x2Var = x2.f135386a;
                        x2Var.getClass();
                        if (p3VarB3 != x2Var) {
                            strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            strA = "MutableState containing " + qVar.getF182175a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        strA = "MutableState containing " + qVar.getF182175a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                    }
                } else {
                    strA = "MutableState containing " + qVar.getF182175a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                }
            } else {
                strA = a.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // p3.y2
    public final void onAbandoned() {
        f.a aVar = this.f57431f;
        if (aVar != null) {
            aVar.unregister();
        }
    }

    @Override // p3.y2
    public final void onForgotten() {
        f.a aVar = this.f57431f;
        if (aVar != null) {
            aVar.unregister();
        }
    }

    @Override // p3.y2
    public final void onRemembered() {
        b();
    }
}
