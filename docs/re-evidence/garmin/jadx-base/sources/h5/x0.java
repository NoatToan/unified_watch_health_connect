package h5;

import h4.r.c;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.m2;
import kotlin.u3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H¦\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lh5/x0;", "Lh4/r$c;", "N", "Lh4/r$b;", "", "<init>", "()V", "create", "()Lh4/r$c;", "node", "", "update", "(Lh4/r$c;)V", "Li5/m2;", "inspectableProperties", "(Li5/m2;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "_inspectorValues", "Li5/m2;", "getInspectorValues", "()Li5/m2;", "inspectorValues", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lc53/j;", "Li5/u3;", "getInspectableElements", "()Lc53/j;", "inspectableElements", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class x0<N extends h4.r.c> implements h4.r.b {
    public static final int $stable = 0;
    private m2 _inspectorValues;

    private final m2 getInspectorValues() {
        m2 m2Var = this._inspectorValues;
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2Var2 = new m2();
        m2Var2.f91341a = p005kotlin.jvm.internal.s0.f105811a.b(getClass()).D();
        inspectableProperties(m2Var2);
        this._inspectorValues = m2Var2;
        return m2Var2;
    }

    public abstract N create();

    public abstract boolean equals(Object other);

    public final c53.j<u3> getInspectableElements() {
        return getInspectorValues().f91343c;
    }

    public final String getNameFallback() {
        return getInspectorValues().f91341a;
    }

    public final Object getValueOverride() {
        return getInspectorValues().f91342b;
    }

    public abstract int hashCode();

    public void inspectableProperties(m2 m2Var) {
        List listY = p13.u.Y(getClass().getDeclaredFields(), new h4.c());
        int size = listY.size();
        for (int i14 = 0; i14 < size; i14++) {
            Field field = (Field) listY.get(i14);
            if (!field.getDeclaringClass().isAssignableFrom(x0.class)) {
                try {
                    field.setAccessible(true);
                    m2Var.f91343c.c(field.get(this), field.getName());
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }

    public abstract void update(N node);
}
