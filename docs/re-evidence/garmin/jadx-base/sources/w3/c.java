package w3;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw3/c;", "K", "V", "Lw3/b;", "", "Lw3/i;", "parentIterator", Action.KEY_ATTRIBUTE, "value", "<init>", "(Lw3/i;Ljava/lang/Object;Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, f23.d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<K, V> f181783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f181784d;

    public c(i<K, V> iVar, K k14, V v14) {
        super(k14, v14);
        this.f181783c = iVar;
        this.f181784d = v14;
    }

    @Override // w3.b, java.util.Map.Entry
    public final V getValue() {
        return this.f181784d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // w3.b, java.util.Map.Entry
    public final V setValue(V v14) {
        V v15 = this.f181784d;
        this.f181784d = v14;
        g<K, V, Map.Entry<K, V>> gVar = this.f181783c.f181803a;
        f<K, V> fVar = gVar.f181798d;
        K k14 = this.f181781a;
        if (!fVar.containsKey(k14)) {
            return v15;
        }
        boolean z14 = gVar.f181791c;
        if (!z14) {
            fVar.put(k14, v14);
        } else {
            if (!z14) {
                c22.t.g();
                return null;
            }
            u uVar = gVar.f181789a[gVar.f181790b];
            Object obj = uVar.f181817a[uVar.f181819c];
            fVar.put(k14, v14);
            gVar.c(obj != null ? obj.hashCode() : 0, fVar.f181794c, obj, 0);
        }
        gVar.f181801g = fVar.f181796e;
        return v15;
    }
}
