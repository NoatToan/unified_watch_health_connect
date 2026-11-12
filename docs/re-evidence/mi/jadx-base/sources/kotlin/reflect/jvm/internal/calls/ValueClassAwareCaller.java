package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002&'B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\u001b\u0010\"\u001a\u0004\u0018\u00010#2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016¢\u0006\u0002\u0010%R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010!\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "oldCaller", "isDefault", "", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "caller", "member", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "data", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "slices", "", "Lkotlin/ranges/IntRange;", "[Lkotlin/ranges/IntRange;", "getRealSlicesOfParameters", "index", "", "hasMfvcParameters", "call", "", "args", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1755#2,3:388\n1557#2:391\n1628#2,3:392\n1755#2,3:400\n1628#2,3:403\n37#3,2:395\n37#3,2:398\n37#3,2:406\n1#4:397\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n*L\n45#1:388,3\n48#1:391\n48#1:392,3\n161#1:400,3\n179#1:403,3\n48#1:395,2\n150#1:398,2\n187#1:406,2\n*E\n"})
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    @NotNull
    private final Caller<M> caller;

    @NotNull
    private final BoxUnboxData data;
    private final boolean hasMfvcParameters;
    private final boolean isDefault;
    private final M member;

    @NotNull
    private final IntRange[] slices;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unboxParameters", "", "", "Ljava/lang/reflect/Method;", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getUnboxParameters", "()[Ljava/util/List;", "[Ljava/util/List;", "getBox", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BoxUnboxData {

        @NotNull
        private final IntRange argumentRange;

        @Nullable
        private final Method box;

        @NotNull
        private final List<Method>[] unboxParameters;

        public BoxUnboxData(@NotNull IntRange argumentRange, @NotNull List<Method>[] unboxParameters, @Nullable Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.argumentRange = argumentRange;
            this.unboxParameters = unboxParameters;
            this.box = method;
        }

        @NotNull
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        @Nullable
        public final Method getBox() {
            return this.box;
        }

        @NotNull
        public final List<Method>[] getUnboxParameters() {
            return this.unboxParameters;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0016¢\u0006\u0002\u0010#R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c¨\u0006$"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "constructorDesc", "", "originalParameters", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "constructorImpl", "Ljava/lang/reflect/Method;", "boxMethod", "parameterUnboxMethods", "member", "getMember", "()Ljava/lang/Void;", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "originalParametersGroups", "Ljava/lang/Class;", "getOriginalParametersGroups", "()Ljava/util/List;", "parameterTypes", "getParameterTypes", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,387:1\n1557#2:388\n1628#2,3:389\n1567#2:392\n1598#2,3:393\n1557#2:396\n1628#2,3:397\n1601#2:400\n1368#2:401\n1454#2,2:402\n1557#2:404\n1628#2,3:405\n1456#2,3:408\n37#3,2:411\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n*L\n219#1:388\n219#1:389,3\n227#1:392\n227#1:393,3\n229#1:396\n229#1:397,3\n227#1:400\n236#1:401\n236#1:402,2\n236#1:404\n236#1:405,3\n236#1:408,3\n236#1:411,2\n*E\n"})
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        @NotNull
        private final Method boxMethod;

        @NotNull
        private final Method constructorImpl;

        @NotNull
        private final List<List<Class<?>>> originalParametersGroups;

        @NotNull
        private final List<Type> parameterTypes;

        @NotNull
        private final List<List<Method>> parameterUnboxMethods;

        public MultiFieldValueClassPrimaryConstructorCaller(@NotNull FunctionDescriptor descriptor, @NotNull KDeclarationContainerImpl container, @NotNull String constructorDesc, @NotNull List<? extends ParameterDescriptor> originalParameters) {
            Collection collectionListOf;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method methodFindMethodBySignature = container.findMethodBySignature("constructor-impl", constructorDesc);
            Intrinsics.checkNotNull(methodFindMethodBySignature);
            this.constructorImpl = methodFindMethodBySignature;
            Method methodFindMethodBySignature2 = container.findMethodBySignature("box-impl", StringsKt__StringsKt.removeSuffix(constructorDesc, (CharSequence) "V") + ReflectClassUtilKt.getDesc(container.getJClass()));
            Intrinsics.checkNotNull(methodFindMethodBySignature2);
            this.boxMethod = methodFindMethodBySignature2;
            List<? extends ParameterDescriptor> list = originalParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                arrayList.add(ValueClassAwareCallerKt.getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType(type), descriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ClassifierDescriptor classifierDescriptorMo2180getDeclarationDescriptor = ((ParameterDescriptor) obj).getType().getConstructor().mo2180getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo2180getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo2180getDeclarationDescriptor;
                List<Method> list2 = this.parameterUnboxMethods.get(i);
                if (list2 != null) {
                    List<Method> list3 = list2;
                    collectionListOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        collectionListOf.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                    Intrinsics.checkNotNull(javaClass);
                    collectionListOf = CollectionsKt__CollectionsJVMKt.listOf(javaClass);
                }
                arrayList2.add(collectionListOf);
                i = i2;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = CollectionsKt__IterablesKt.flatten(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionListOf;
            Intrinsics.checkNotNullParameter(args, "args");
            List<Pair> listZip = ArraysKt___ArraysKt.zip(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listZip) {
                Object objComponent1 = pair.component1();
                List list = (List) pair.component2();
                if (list != null) {
                    List list2 = list;
                    collectionListOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionListOf.add(((Method) it.next()).invoke(objComponent1, new Object[0]));
                    }
                } else {
                    collectionListOf = CollectionsKt__CollectionsJVMKt.listOf(objComponent1);
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, collectionListOf);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Nullable
        public Void getMember() {
            return null;
        }

        @NotNull
        public final List<List<Class<?>>> getOriginalParametersGroups() {
            return this.originalParametersGroups;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public List<Type> getParameterTypes() {
            return this.parameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* JADX INFO: renamed from: getMember */
        public /* bridge */ /* synthetic */ Member mo2172getMember() {
            return (Member) getMember();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[LOOP:1: B:25:0x007c->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    public ValueClassAwareCaller(@NotNull CallableMemberDescriptor descriptor, @NotNull Caller<? extends M> oldCaller, boolean z) {
        Class inlineClass;
        int i;
        BoxUnboxData boxUnboxData;
        KotlinType kotlinTypeSubstitutedUnderlyingType;
        ArrayList arrayList;
        Iterator<T> it;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.isDefault = z;
        boolean z2 = false;
        if (oldCaller instanceof CallerImpl.Method.BoundStatic) {
            ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            extensionReceiverParameter = extensionReceiverParameter == null ? descriptor.getDispatchReceiverParameter() : extensionReceiverParameter;
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null && InlineClassesUtilsKt.needsMfvcFlattening(type)) {
                if (z) {
                    List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list = valueParameters;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                    List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(type));
                                    Intrinsics.checkNotNull(mfvcUnboxMethods);
                                    List<Method> list2 = mfvcUnboxMethods;
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) oldCaller).getBoundReceiver(), new Object[0]));
                                    }
                                    oldCaller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method) oldCaller).mo2172getMember(), arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    List<Method> mfvcUnboxMethods2 = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(type));
                    Intrinsics.checkNotNull(mfvcUnboxMethods2);
                    List<Method> list3 = mfvcUnboxMethods2;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) oldCaller).getBoundReceiver(), new Object[0]));
                    }
                    oldCaller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method) oldCaller).mo2172getMember(), arrayList.toArray(new Object[0]));
                }
            }
        }
        this.caller = (Caller<M>) oldCaller;
        this.member = (M) oldCaller.mo2172getMember();
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        boolean z3 = descriptor instanceof FunctionDescriptor;
        Method boxMethod = ((z3 && ((FunctionDescriptor) descriptor).isSuspend() && (kotlinTypeSubstitutedUnderlyingType = InlineClassesUtilsKt.substitutedUnderlyingType(returnType)) != null && KotlinBuiltIns.isPrimitiveType(kotlinTypeSubstitutedUnderlyingType)) || (inlineClass = ValueClassAwareCallerKt.toInlineClass(returnType)) == null) ? null : ValueClassAwareCallerKt.getBoxMethod(inlineClass, descriptor);
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            boxUnboxData = new BoxUnboxData(IntRange.Companion.getEMPTY(), new List[0], boxMethod);
        } else {
            int i2 = -1;
            if (!(oldCaller instanceof CallerImpl.Method.BoundStatic) && !(oldCaller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass)) {
                if (descriptor instanceof ConstructorDescriptor) {
                    if (!(oldCaller instanceof BoundCaller)) {
                        i2 = 0;
                    }
                } else if (descriptor.getDispatchReceiverParameter() == null || (oldCaller instanceof BoundCaller)) {
                    i2 = 0;
                } else {
                    DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
            }
            int i3 = oldCaller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? -oldCaller.getReceiverComponentsCount() : i2;
            List listMakeKotlinParameterTypes = ValueClassAwareCallerKt.makeKotlinParameterTypes(descriptor, oldCaller.mo2172getMember(), new Function1() { // from class: kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public Object invoke2(Object obj) {
                    return Boolean.valueOf(ValueClassAwareCaller.data$lambda$5$lambda$3((ClassDescriptor) obj));
                }
            });
            if (this.isDefault) {
                Iterator it3 = listMakeKotlinParameterTypes.iterator();
                int iData$lambda$5$typeSize = 0;
                while (it3.hasNext()) {
                    iData$lambda$5$typeSize += data$lambda$5$typeSize((KotlinType) it3.next());
                }
                i = ((iData$lambda$5$typeSize + 31) / 32) + 1;
            } else {
                i = 0;
            }
            int i4 = i + ((z3 && ((FunctionDescriptor) descriptor).isSuspend()) ? 1 : 0);
            Iterator it4 = listMakeKotlinParameterTypes.iterator();
            int iData$lambda$5$typeSize2 = 0;
            while (it4.hasNext()) {
                iData$lambda$5$typeSize2 += data$lambda$5$typeSize((KotlinType) it4.next());
            }
            int i5 = iData$lambda$5$typeSize2 + i3 + i4;
            ValueClassAwareCallerKt.checkParametersSize(this, i5, descriptor, this.isDefault);
            IntRange intRangeUntil = RangesKt___RangesKt.until(Math.max(i2, 0), listMakeKotlinParameterTypes.size() + i2);
            List[] listArr = new List[i5];
            int i6 = 0;
            while (i6 < i5) {
                listArr[i6] = (i6 > intRangeUntil.getLast() || intRangeUntil.getFirst() > i6) ? null : ValueClassAwareCallerKt.getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) listMakeKotlinParameterTypes.get(i6 - i2)), descriptor);
                i6++;
            }
            boxUnboxData = new BoxUnboxData(intRangeUntil, listArr, boxMethod);
        }
        this.data = boxUnboxData;
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Caller<M> caller = this.caller;
        int length = caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? ((CallerImpl.Method.BoundStaticMultiFieldValueClass) caller).getBoundReceiverComponents().length : caller instanceof CallerImpl.Method.BoundStatic ? 1 : 0;
        if (length > 0) {
            listCreateListBuilder.add(RangesKt___RangesKt.until(0, length));
        }
        List<Method>[] unboxParameters = boxUnboxData.getUnboxParameters();
        int length2 = unboxParameters.length;
        int i7 = 0;
        while (i7 < length2) {
            List<Method> list4 = unboxParameters[i7];
            int size = (list4 != null ? list4.size() : 1) + length;
            listCreateListBuilder.add(RangesKt___RangesKt.until(length, size));
            i7++;
            length = size;
        }
        this.slices = (IntRange[]) CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder).toArray(new IntRange[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it5 = argumentRange.iterator();
            while (it5.hasNext()) {
                List<Method> list5 = this.data.getUnboxParameters()[((IntIterator) it5).nextInt()];
                if (list5 != null && list5.size() > 1) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean data$lambda$5$lambda$3(ClassDescriptor makeKotlinParameterTypes) {
        Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return InlineClassesUtilsKt.isValueClass(makeKotlinParameterTypes);
    }

    private static final int data$lambda$5$typeSize(KotlinType kotlinType) {
        List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(kotlinType));
        if (mfvcUnboxMethods != null) {
            return mfvcUnboxMethods.size();
        }
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objDefaultPrimitiveValue;
        Object objDefaultPrimitiveValue2;
        Intrinsics.checkNotNullParameter(args, "args");
        IntRange argumentRange = this.data.getArgumentRange();
        List<Method>[] unboxParameters = this.data.getUnboxParameters();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(args.length);
                int first = argumentRange.getFirst();
                for (int i = 0; i < first; i++) {
                    listCreateListBuilder.add(args[i]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = unboxParameters[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listCreateListBuilder;
                                if (obj != null) {
                                    objDefaultPrimitiveValue2 = method.invoke(obj, new Object[0]);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objDefaultPrimitiveValue2 = UtilKt.defaultPrimitiveValue(returnType);
                                }
                                list2.add(objDefaultPrimitiveValue2);
                            }
                        } else {
                            listCreateListBuilder.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int lastIndex = ArraysKt___ArraysKt.getLastIndex(args);
                if (last2 <= lastIndex) {
                    while (true) {
                        listCreateListBuilder.add(args[last2]);
                        if (last2 == lastIndex) {
                            break;
                        }
                        last2++;
                    }
                }
                args = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int first3 = argumentRange.getFirst();
                    if (i2 > argumentRange.getLast() || first3 > i2) {
                        objDefaultPrimitiveValue = args[i2];
                    } else {
                        List<Method> list3 = unboxParameters[i2];
                        Method method2 = list3 != null ? (Method) CollectionsKt___CollectionsKt.single((List) list3) : null;
                        objDefaultPrimitiveValue = args[i2];
                        if (method2 != null) {
                            if (objDefaultPrimitiveValue != null) {
                                objDefaultPrimitiveValue = method2.invoke(objDefaultPrimitiveValue, new Object[0]);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objDefaultPrimitiveValue = UtilKt.defaultPrimitiveValue(returnType2);
                            }
                        }
                    }
                    objArr[i2] = objDefaultPrimitiveValue;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public M mo2172getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @NotNull
    public final IntRange getRealSlicesOfParameters(int index) {
        IntRange intRange;
        if (index >= 0) {
            IntRange[] intRangeArr = this.slices;
            if (index < intRangeArr.length) {
                return intRangeArr[index];
            }
        }
        IntRange[] intRangeArr2 = this.slices;
        if (intRangeArr2.length == 0) {
            intRange = new IntRange(index, index);
        } else {
            int length = (index - intRangeArr2.length) + ((IntRange) ArraysKt___ArraysKt.last(intRangeArr2)).getLast() + 1;
            intRange = new IntRange(length, length);
        }
        return intRange;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
