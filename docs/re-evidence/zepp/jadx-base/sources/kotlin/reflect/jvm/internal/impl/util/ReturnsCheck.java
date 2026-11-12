package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ReturnsCheck implements Check {

    @NotNull
    private final String a;

    @NotNull
    private final Function1<KotlinBuiltIns, KotlinType> b;

    @NotNull
    private final String c;

    public static final class ReturnsBoolean extends ReturnsCheck {

        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        public static final class a extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                return kotlinBuiltIns.getBooleanType();
            }
        }

        private ReturnsBoolean() {
            super("Boolean", a.a, null);
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        public static final class a extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                return kotlinBuiltIns.getIntType();
            }
        }

        private ReturnsInt() {
            super("Int", a.a, null);
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        public static final class a extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                return kotlinBuiltIns.getUnitType();
            }
        }

        private ReturnsUnit() {
            super("Unit", a.a, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.a = str;
        this.b = function1;
        this.c = Intrinsics.stringPlus("must return ", str);
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        return Intrinsics.areEqual(functionDescriptor.getReturnType(), this.b.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
