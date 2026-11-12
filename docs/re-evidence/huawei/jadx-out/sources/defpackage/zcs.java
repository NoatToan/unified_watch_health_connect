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
public class zcs {
    public KMutableProperty1 a(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KMutableProperty2 a(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public KProperty0 a(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KMutableProperty0 b(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KProperty1 d(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KProperty2 d(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public KFunction e(zcl zclVar) {
        return zclVar;
    }

    public KDeclarationContainer e(Class cls, String str) {
        return new zcr(cls, str);
    }

    public KClass d(Class cls) {
        return new zci(cls);
    }

    public String c(Lambda lambda) {
        return a(lambda);
    }

    public String a(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
