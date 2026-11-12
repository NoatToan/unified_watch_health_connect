package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class UtilsKt {
    private static final KotlinType a(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String b(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        c(Intrinsics.stringPlus("type: ", typeConstructor), sb);
        c(Intrinsics.stringPlus("hashCode: ", Integer.valueOf(typeConstructor.hashCode())), sb);
        c(Intrinsics.stringPlus("javaClass: ", typeConstructor.getClass().getCanonicalName()), sb);
        for (DeclarationDescriptor declarationDescriptorMo4298getDeclarationDescriptor = typeConstructor.mo4298getDeclarationDescriptor(); declarationDescriptorMo4298getDeclarationDescriptor != null; declarationDescriptorMo4298getDeclarationDescriptor = declarationDescriptorMo4298getDeclarationDescriptor.getContainingDeclaration()) {
            c(Intrinsics.stringPlus("fqName: ", DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo4298getDeclarationDescriptor)), sb);
            c(Intrinsics.stringPlus("javaClass: ", declarationDescriptorMo4298getDeclarationDescriptor.getClass().getCanonicalName()), sb);
        }
        return sb.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb) {
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    @Nullable
    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new a(kotlinType, null));
        TypeConstructor constructor = kotlinType2.getConstructor();
        while (!arrayDeque.isEmpty()) {
            a aVar = (a) arrayDeque.poll();
            KotlinType kotlinTypeB = aVar.b();
            TypeConstructor constructor2 = kotlinTypeB.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = kotlinTypeB.isMarkedNullable();
                for (a aVarA = aVar.a(); aVarA != null; aVarA = aVarA.a()) {
                    KotlinType kotlinTypeB2 = aVarA.b();
                    List<TypeProjection> arguments = kotlinTypeB2.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it2 = arguments.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            if (((TypeProjection) it2.next()).getProjectionKind() != Variance.INVARIANT) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    kotlinTypeB = z ? a(CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(kotlinTypeB2), false, 1, null).buildSubstitutor().safeSubstitute(kotlinTypeB, Variance.INVARIANT)) : TypeConstructorSubstitution.Companion.create(kotlinTypeB2).buildSubstitutor().safeSubstitute(kotlinTypeB, Variance.INVARIANT);
                    zIsMarkedNullable = zIsMarkedNullable || kotlinTypeB2.isMarkedNullable();
                }
                TypeConstructor constructor3 = kotlinTypeB.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(kotlinTypeB, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(constructor3) + ", \n\nsupertype: " + b(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            Iterator<KotlinType> it3 = constructor2.getSupertypes().iterator();
            while (it3.hasNext()) {
                arrayDeque.add(new a(it3.next(), aVar));
            }
        }
        return null;
    }
}
