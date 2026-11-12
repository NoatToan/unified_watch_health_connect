package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AnnotationUtilKt {

    @NotNull
    private static final Name a = Name.identifier("message");

    @NotNull
    private static final Name b = Name.identifier("replaceWith");

    @NotNull
    private static final Name c = Name.identifier(FirebaseAnalytics.Param.LEVEL);

    @NotNull
    private static final Name d = Name.identifier("expression");

    @NotNull
    private static final Name e = Name.identifier("imports");

    public static final class a extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
        public final /* synthetic */ KotlinBuiltIns a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KotlinBuiltIns kotlinBuiltIns) {
            super(1);
            this.a = kotlinBuiltIns;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
            return moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, this.a.getStringType());
        }
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.deprecated, r.mapOf(TuplesKt.to(a, new StringValue(str)), TuplesKt.to(b, new AnnotationValue(new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, r.mapOf(TuplesKt.to(d, new StringValue(str2)), TuplesKt.to(e, new ArrayValue(CollectionsKt__CollectionsKt.emptyList(), new a(kotlinBuiltIns))))))), TuplesKt.to(c, new EnumValue(ClassId.topLevel(StandardNames.FqNames.deprecationLevel), Name.identifier(str3)))));
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3);
    }
}
