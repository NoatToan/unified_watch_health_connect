package kotlin.reflect.jvm.internal;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bI\u0010JJ%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0017\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R0\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR0\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u001b*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e0\u001e0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR$\u0010!\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010 0 0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR0\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" \u001b*\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00190\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u001a\u0010(\u001a\u0006\u0012\u0002\b\u00030%8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0016\u0010.\u001a\u00020+8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u00020/8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0016\u00109\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00103R\u0018\u0010@\u001a\u0004\u0018\u00010=8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00101R\u0016\u0010B\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00101R\u0016\u0010C\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00101R\u0016\u0010D\u001a\u00020/8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\bD\u00101R\u0016\u0010H\u001a\u00020E8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "", "Lkotlin/reflect/KParameter;", "", "args", "a", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "b", "Ljava/lang/reflect/Type;", "c", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/Continuation;", "continuationArgument", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callDefaultMethod", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "_annotations", "Ljava/util/ArrayList;", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", GoogleApiAvailabilityLight.a, "_typeParameters", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "isBound", "()Z", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 5, 1})
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal<List<Annotation>> _annotations = ReflectProperties.lazySoft(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _parameters = ReflectProperties.lazySoft(new Function0<ArrayList<KParameter>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ParameterDescriptor> {
            public final /* synthetic */ ReceiverParameterDescriptor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ReceiverParameterDescriptor receiverParameterDescriptor) {
                super(0);
                this.a = receiverParameterDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ParameterDescriptor invoke() {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<ParameterDescriptor> {
            public final /* synthetic */ ReceiverParameterDescriptor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ReceiverParameterDescriptor receiverParameterDescriptor) {
                super(0);
                this.a = receiverParameterDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ParameterDescriptor invoke() {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<ParameterDescriptor> {
            public final /* synthetic */ CallableMemberDescriptor a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CallableMemberDescriptor callableMemberDescriptor, int i) {
                super(0);
                this.a = callableMemberDescriptor;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ParameterDescriptor invoke() {
                return this.a.getValueParameters().get(this.b);
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<KParameter> invoke() {
            int i;
            CallableMemberDescriptor descriptor = this.a.getDescriptor();
            ArrayList<KParameter> arrayList = new ArrayList<>();
            int i2 = 0;
            if (this.a.isBound()) {
                i = 0;
            } else {
                ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
                if (instanceReceiverParameter != null) {
                    arrayList.add(new KParameterImpl(this.a, 0, KParameter.Kind.INSTANCE, new a(instanceReceiverParameter)));
                    i = 1;
                } else {
                    i = 0;
                }
                ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
                if (extensionReceiverParameter != null) {
                    arrayList.add(new KParameterImpl(this.a, i, KParameter.Kind.EXTENSION_RECEIVER, new b(extensionReceiverParameter)));
                    i++;
                }
            }
            int size = descriptor.getValueParameters().size();
            while (i2 < size) {
                arrayList.add(new KParameterImpl(this.a, i, KParameter.Kind.VALUE, new c(descriptor, i2)));
                i2++;
                i++;
            }
            if (this.a.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                g.sortWith(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$$special$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(((KParameter) t).getName(), ((KParameter) t2).getName());
                    }
                });
            }
            arrayList.trimToSize();
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal<KTypeImpl> _returnType = ReflectProperties.lazySoft(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters = ReflectProperties.lazySoft(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends Annotation>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return UtilKt.computeAnnotations(KCallableImpl.this.getDescriptor());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/KTypeImpl;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<KTypeImpl> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Type> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type typeC = KCallableImpl.this.c();
                return typeC != null ? typeC : KCallableImpl.this.getCaller().getReturnType();
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KTypeImpl invoke() {
            return new KTypeImpl(KCallableImpl.this.getDescriptor().getReturnType(), new a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeParameterImpl> invoke() {
            List<TypeParameterDescriptor> typeParameters = KCallableImpl.this.getDescriptor().getTypeParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
            Iterator<T> it2 = typeParameters.iterator();
            while (it2.hasNext()) {
                arrayList.add(new KTypeParameterImpl(KCallableImpl.this, (TypeParameterDescriptor) it2.next()));
            }
            return arrayList;
        }
    }

    private final R a(Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException {
        Object objB;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                objB = args.get(kParameter);
                if (objB == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.isOptional()) {
                objB = null;
            } else {
                if (!kParameter.isVararg()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                objB = b(kParameter.getType());
            }
            arrayList.add(objB);
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller == null) {
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
        }
        try {
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                return (R) defaultCaller.call(array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    private final Object b(KType type) {
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(type));
        if (javaClass.isArray()) {
            return Array.newInstance(javaClass.getComponentType(), 0);
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + javaClass.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type c() {
        Type[] lowerBounds;
        CallableMemberDescriptor descriptor = getDescriptor();
        if (!(descriptor instanceof FunctionDescriptor)) {
            descriptor = null;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) descriptor;
        if (functionDescriptor == null || !functionDescriptor.isSuspend()) {
            return null;
        }
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) getCaller().getParameterTypes());
        if (!(objLastOrNull instanceof ParameterizedType)) {
            objLastOrNull = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) objLastOrNull;
        if (!Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
            return null;
        }
        Object objSingle = ArraysKt.single(parameterizedType.getActualTypeArguments());
        if (!(objSingle instanceof WildcardType)) {
            objSingle = null;
        }
        WildcardType wildcardType = (WildcardType) objSingle;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) ArraysKt.first(lowerBounds);
    }

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) throws IllegalCallableAccessException {
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        return isAnnotationConstructor() ? a(args) : callDefaultMethod$kotlin_reflection(args, null);
    }

    public final R callDefaultMethod$kotlin_reflection(@NotNull Map<KParameter, ? extends Object> args, @Nullable Continuation<?> continuationArgument) throws IllegalCallableAccessException {
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<KParameter> it2 = parameters.iterator();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (continuationArgument != null) {
                    arrayList.add(continuationArgument);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i2));
                Caller<?> defaultCaller = getDefaultCaller();
                if (defaultCaller == null) {
                    throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
                }
                arrayList.addAll(arrayList2);
                arrayList.add(null);
                try {
                    Object[] array2 = arrayList.toArray(new Object[0]);
                    if (array2 != null) {
                        return (R) defaultCaller.call(array2);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            KParameter next = it2.next();
            if (i != 0 && i % 32 == 0) {
                arrayList2.add(Integer.valueOf(i2));
                i2 = 0;
            }
            if (args.containsKey(next)) {
                arrayList.add(args.get(next));
            } else if (next.isOptional()) {
                arrayList.add(UtilKt.isInlineClassType(next.getType()) ? null : UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(next.getType())));
                i2 = (1 << (i % 32)) | i2;
                z = true;
            } else {
                if (!next.isVararg()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                arrayList.add(b(next.getType()));
            }
            if (next.getKind() == KParameter.Kind.VALUE) {
                i++;
            }
        }
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return this._annotations.invoke();
    }

    @NotNull
    public abstract Caller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        return this._parameters.invoke();
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        return this._returnType.invoke();
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        return this._typeParameters.invoke();
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        return UtilKt.toKVisibility(getDescriptor().getVisibility());
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    public final boolean isAnnotationConstructor() {
        return Intrinsics.areEqual(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    public abstract boolean isBound();

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }
}
