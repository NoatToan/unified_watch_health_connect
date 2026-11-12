package kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB%\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$a;", "a", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$a;", "data", "b", "Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "", "c", "Z", "isDefault", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 5, 1})
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Caller<M> caller;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isDefault;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"kotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$a", "", "Lkotlin/ranges/IntRange;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "Lkotlin/ranges/IntRange;", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "argumentRange", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final IntRange argumentRange;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Method[] unbox;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Method box;

        public a(@NotNull IntRange intRange, @NotNull Method[] methodArr, @Nullable Method method) {
            this.argumentRange = intRange;
            this.unbox = methodArr;
            this.box = method;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method[] getUnbox() {
            return this.unbox;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Method getBox() {
            return this.box;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineClassAwareCaller(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Caller<? extends M> caller, boolean z) {
        a aVar;
        Class<?> inlineClass;
        this.caller = caller;
        this.isDefault = z;
        Class<?> inlineClass2 = InlineClassAwareCallerKt.toInlineClass(callableMemberDescriptor.getReturnType());
        Method boxMethod = inlineClass2 != null ? InlineClassAwareCallerKt.getBoxMethod(inlineClass2, callableMemberDescriptor) : null;
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(callableMemberDescriptor)) {
            aVar = new a(IntRange.Companion.getEMPTY(), new Method[0], boxMethod);
        } else {
            int i = -1;
            if (!(caller instanceof CallerImpl.Method.BoundStatic)) {
                if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                    if (!(caller instanceof BoundCaller)) {
                        i = 0;
                    }
                } else if (callableMemberDescriptor.getDispatchReceiverParameter() == null || (caller instanceof BoundCaller) || InlineClassesUtilsKt.isInlineClass(callableMemberDescriptor.getContainingDeclaration())) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            int i2 = (z ? 2 : 0) + (((callableMemberDescriptor instanceof FunctionDescriptor) && ((FunctionDescriptor) callableMemberDescriptor).isSuspend()) ? 1 : 0);
            ArrayList arrayList = new ArrayList();
            ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                ClassDescriptor constructedClass = ((ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
                if (constructedClass.isInner()) {
                    DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                    Objects.requireNonNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((ClassDescriptor) containingDeclaration).getDefaultType());
                }
            } else {
                DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
                if ((containingDeclaration2 instanceof ClassDescriptor) && InlineClassesUtilsKt.isInlineClass(containingDeclaration2)) {
                    arrayList.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
                }
            }
            Iterator<T> it2 = callableMemberDescriptor.getValueParameters().iterator();
            while (it2.hasNext()) {
                arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
            }
            int size = arrayList.size() + i + i2;
            if (CallerKt.getArity(this) != size) {
                throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.getArity(this) + " != " + size + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + getParameterTypes() + ")\nDefault: " + this.isDefault);
            }
            IntRange intRangeUntil = e.until(Math.max(i, 0), arrayList.size() + i);
            Method[] methodArr = new Method[size];
            for (int i3 = 0; i3 < size; i3++) {
                methodArr[i3] = (!intRangeUntil.contains(i3) || (inlineClass = InlineClassAwareCallerKt.toInlineClass((KotlinType) arrayList.get(i3 - i))) == null) ? null : InlineClassAwareCallerKt.getUnboxMethod(inlineClass, callableMemberDescriptor);
            }
            aVar = new a(intRangeUntil, methodArr, boxMethod);
        }
        this.data = aVar;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) {
        Object objInvoke;
        a aVar = this.data;
        IntRange argumentRange = aVar.getArgumentRange();
        Method[] unbox = aVar.getUnbox();
        Method box = aVar.getBox();
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        Objects.requireNonNull(objArrCopyOf, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int first = argumentRange.getFirst();
        int last = argumentRange.getLast();
        if (first <= last) {
            while (true) {
                Method method = unbox[first];
                Object objInvoke2 = args[first];
                if (method != null) {
                    objInvoke2 = objInvoke2 != null ? method.invoke(objInvoke2, new Object[0]) : UtilKt.defaultPrimitiveValue(method.getReturnType());
                }
                objArrCopyOf[first] = objInvoke2;
                if (first == last) {
                    break;
                }
                first++;
            }
        }
        Object objCall = this.caller.call(objArrCopyOf);
        return (box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public M mo4291getMember() {
        return (M) this.caller.mo4291getMember();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
