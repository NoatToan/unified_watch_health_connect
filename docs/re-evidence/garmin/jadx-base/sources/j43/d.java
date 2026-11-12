package j43;

import org.apache.commons.text.StringSubstitutor;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.a f97045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t23.a aVar, n0 n0Var, g gVar) {
        super(n0Var, gVar);
        if (aVar == null) {
            c(0);
            throw null;
        }
        if (n0Var == null) {
            c(1);
            throw null;
        }
        this.f97045c = aVar;
    }

    public static /* synthetic */ void c(int i14) {
        String str = i14 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i14 != 2 ? 3 : 2];
        if (i14 == 1) {
            objArr[0] = "receiverType";
        } else if (i14 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i14 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i14 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i14 != 2) {
            if (i14 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i14 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f97045c + StringSubstitutor.DEFAULT_VAR_END;
    }
}
