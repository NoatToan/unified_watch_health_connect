package defpackage;

import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes46.dex */
public class zcu extends PropertyReference1 {
    public zcu(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public zcu(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public zcu(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
