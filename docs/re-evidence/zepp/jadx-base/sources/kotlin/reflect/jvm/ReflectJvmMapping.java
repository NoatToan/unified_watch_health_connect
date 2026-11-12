package kotlin.reflect.jvm;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\"\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001d\u0010\u000f\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001d\u0010\u0013\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"1\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00108F@\u0006¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001d\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!\"\u001d\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$\"/\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0014*\u00020&*\b\u0012\u0004\u0012\u00028\u00000\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Ljava/lang/reflect/Member;", "Lkotlin/reflect/KDeclarationContainer;", "a", "Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Constructor;", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "kotlinProperty", "getKotlinFunction", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinFunction", "", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "ReflectJvmMapping")
public final class ReflectJvmMapping {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final KDeclarationContainer a(Member member) throws InvocationTargetException {
        KotlinClassHeader classHeader;
        ReflectKotlinClass reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(member.getDeclaringClass());
        String str = null;
        Object[] objArr = 0;
        KotlinClassHeader.Kind kind = (reflectKotlinClassCreate == null || (classHeader = reflectKotlinClassCreate.getClassHeader()) == null) ? null : classHeader.getKind();
        if (kind == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        int i2 = 2;
        if (i == 1 || i == 2 || i == 3) {
            return new KPackageImpl(member.getDeclaringClass(), str, i2, objArr == true ? 1 : 0);
        }
        return null;
    }

    @Nullable
    public static final <T> Constructor<T> getJavaConstructor(@NotNull KFunction<? extends T> kFunction) {
        Caller<?> caller;
        KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kFunction);
        Member memberMo4291getMember = (kCallableImplAsKCallableImpl == null || (caller = kCallableImplAsKCallableImpl.getCaller()) == null) ? null : caller.mo4291getMember();
        return (Constructor) (memberMo4291getMember instanceof Constructor ? memberMo4291getMember : null);
    }

    public static /* synthetic */ void getJavaConstructor$annotations(KFunction kFunction) {
    }

    @Nullable
    public static final Field getJavaField(@NotNull KProperty<?> kProperty) {
        KPropertyImpl<?> kPropertyImplAsKPropertyImpl = UtilKt.asKPropertyImpl(kProperty);
        if (kPropertyImplAsKPropertyImpl != null) {
            return kPropertyImplAsKPropertyImpl.getJavaField();
        }
        return null;
    }

    @Nullable
    public static final Method getJavaGetter(@NotNull KProperty<?> kProperty) {
        return getJavaMethod(kProperty.getGetter());
    }

    @Nullable
    public static final Method getJavaMethod(@NotNull KFunction<?> kFunction) {
        Caller<?> caller;
        KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kFunction);
        Member memberMo4291getMember = (kCallableImplAsKCallableImpl == null || (caller = kCallableImplAsKCallableImpl.getCaller()) == null) ? null : caller.mo4291getMember();
        return (Method) (memberMo4291getMember instanceof Method ? memberMo4291getMember : null);
    }

    @Nullable
    public static final Method getJavaSetter(@NotNull KMutableProperty<?> kMutableProperty) {
        return getJavaMethod(kMutableProperty.getSetter());
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Type javaType = ((KTypeImpl) kType).getJavaType();
        return javaType != null ? javaType : TypesJVMKt.getJavaType(kType);
    }

    @Nullable
    public static final KFunction<?> getKotlinFunction(@NotNull Method method) throws InvocationTargetException {
        Object next;
        Method javaMethod;
        Object obj = null;
        if (Modifier.isStatic(method.getModifiers())) {
            KDeclarationContainer kDeclarationContainerA = a(method);
            if (kDeclarationContainerA != null) {
                Collection<KCallable<?>> members = kDeclarationContainerA.getMembers();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : members) {
                    if (obj2 instanceof KFunction) {
                        arrayList.add(obj2);
                    }
                }
                for (Object obj3 : arrayList) {
                    if (Intrinsics.areEqual(getJavaMethod((KFunction) obj3), method)) {
                        obj = obj3;
                        break;
                    }
                }
                return (KFunction) obj;
            }
            KClass<?> companionObject = KClasses.getCompanionObject(JvmClassMappingKt.getKotlinClass(method.getDeclaringClass()));
            if (companionObject != null) {
                Iterator<T> it2 = KClasses.getFunctions(companionObject).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    javaMethod = getJavaMethod((KFunction) next);
                } while (!(javaMethod != null && Intrinsics.areEqual(javaMethod.getName(), method.getName()) && Arrays.equals(javaMethod.getParameterTypes(), method.getParameterTypes()) && Intrinsics.areEqual(javaMethod.getReturnType(), method.getReturnType())));
                KFunction<?> kFunction = (KFunction) next;
                if (kFunction != null) {
                    return kFunction;
                }
            }
        }
        for (Object obj4 : KClasses.getFunctions(JvmClassMappingKt.getKotlinClass(method.getDeclaringClass()))) {
            if (Intrinsics.areEqual(getJavaMethod((KFunction) obj4), method)) {
                obj = obj4;
                break;
            }
        }
        return (KFunction) obj;
    }

    @Nullable
    public static final KProperty<?> getKotlinProperty(@NotNull Field field) throws InvocationTargetException {
        Object obj = null;
        if (field.isSynthetic()) {
            return null;
        }
        KDeclarationContainer kDeclarationContainerA = a(field);
        if (kDeclarationContainerA == null) {
            for (Object obj2 : KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(field.getDeclaringClass()))) {
                if (Intrinsics.areEqual(getJavaField((KProperty1) obj2), field)) {
                    obj = obj2;
                    break;
                }
            }
            return (KProperty) obj;
        }
        Collection<KCallable<?>> members = kDeclarationContainerA.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : members) {
            if (obj3 instanceof KProperty) {
                arrayList.add(obj3);
            }
        }
        for (Object obj4 : arrayList) {
            if (Intrinsics.areEqual(getJavaField((KProperty) obj4), field)) {
                obj = obj4;
                break;
            }
        }
        return (KProperty) obj;
    }

    @Nullable
    public static final <T> KFunction<T> getKotlinFunction(@NotNull Constructor<T> constructor) {
        T next;
        Iterator<T> it2 = JvmClassMappingKt.getKotlinClass(constructor.getDeclaringClass()).getConstructors().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(getJavaConstructor((KFunction) next), constructor)) {
                return (KFunction) next;
            }
        }
        next = null;
        return (KFunction) next;
    }
}
