package defpackage;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes3.dex */
public class zcv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zcs f53980a;
    private static final KClass[] d;

    static {
        zcs zcsVar;
        try {
            zcsVar = (zcs) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            zcsVar = null;
        }
        if (zcsVar == null) {
            zcsVar = new zcs();
        }
        f53980a = zcsVar;
        d = new KClass[0];
    }

    public static KDeclarationContainer d(Class cls) {
        return f53980a.e(cls, "");
    }

    public static KClass b(Class cls) {
        return f53980a.d(cls);
    }

    public static String c(Lambda lambda) {
        return f53980a.c(lambda);
    }

    public static String c(FunctionBase functionBase) {
        return f53980a.a(functionBase);
    }

    public static KFunction b(zcl zclVar) {
        return f53980a.e(zclVar);
    }

    public static KProperty0 b(PropertyReference0 propertyReference0) {
        return f53980a.a(propertyReference0);
    }

    public static KMutableProperty0 c(MutablePropertyReference0 mutablePropertyReference0) {
        return f53980a.b(mutablePropertyReference0);
    }

    public static KProperty1 c(PropertyReference1 propertyReference1) {
        return f53980a.d(propertyReference1);
    }

    public static KMutableProperty1 e(MutablePropertyReference1 mutablePropertyReference1) {
        return f53980a.a(mutablePropertyReference1);
    }

    public static KProperty2 a(PropertyReference2 propertyReference2) {
        return f53980a.d(propertyReference2);
    }

    public static KMutableProperty2 a(MutablePropertyReference2 mutablePropertyReference2) {
        return f53980a.a(mutablePropertyReference2);
    }
}
