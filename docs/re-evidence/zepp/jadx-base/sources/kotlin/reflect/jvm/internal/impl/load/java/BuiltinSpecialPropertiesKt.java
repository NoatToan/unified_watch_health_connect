package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes23.dex */
public final class BuiltinSpecialPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName a(FqName fqName, String str) {
        return fqName.child(Name.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName b(FqNameUnsafe fqNameUnsafe, String str) {
        return fqNameUnsafe.child(Name.identifier(str)).toSafe();
    }
}
