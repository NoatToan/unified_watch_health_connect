package defpackage;

import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes20.dex */
public class zcn extends zcl {
    public zcn(int i, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i, NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public zcn(int i, Class cls, String str, String str2, int i2) {
        super(i, NO_RECEIVER, cls, str, str2, i2);
    }

    public zcn(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
