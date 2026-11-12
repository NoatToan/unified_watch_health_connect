package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.core.AivsConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PredefinedEnhancementInfoKt {

    @NotNull
    private static final JavaTypeQualifiers a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    @NotNull
    private static final JavaTypeQualifiers b;

    @NotNull
    private static final JavaTypeQualifiers c;

    @NotNull
    private static final Map<String, PredefinedFunctionEnhancementInfo> d;

    public static final class a extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class a0 extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(JvmPrimitiveType.BOOLEAN);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class b0 extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(JvmPrimitiveType.BOOLEAN);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ SignatureBuildingComponents a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SignatureBuildingComponents signatureBuildingComponents) {
            super(1);
            this.a = signatureBuildingComponents;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a.javaUtil("Spliterator"), PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(JvmPrimitiveType.BOOLEAN);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class m extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class o extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(JvmPrimitiveType.BOOLEAN);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class q extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.a, PredefinedEnhancementInfoKt.a);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class r extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class s extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c, PredefinedEnhancementInfoKt.a);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class t extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b);
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.c);
            functionEnhancementBuilder.parameter(this.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c, PredefinedEnhancementInfoKt.c, PredefinedEnhancementInfoKt.a);
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class u extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class v extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.c);
            functionEnhancementBuilder.returns(this.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class w extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.a);
            functionEnhancementBuilder.returns(this.b, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class x extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class y extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.parameter(this.a, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    public static final class z extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            functionEnhancementBuilder.returns(this.a, PredefinedEnhancementInfoKt.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            a(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }
    }

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents.javaLang("Object");
        String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaUtil("Iterator")).function("forEachRemaining", new a(strJavaFunction3));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaLang("Iterable")).function("spliterator", new g(signatureBuildingComponents));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaUtil("Collection"));
        classEnhancementBuilder.function("removeIf", new h(strJavaFunction));
        classEnhancementBuilder.function(AivsConfig.Tts.AUDIO_TYPE_STREAM, new i(strJavaUtil));
        classEnhancementBuilder.function("parallelStream", new j(strJavaUtil));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaUtil("List")).function("replaceAll", new k(strJavaFunction6));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME));
        classEnhancementBuilder2.function("forEach", new l(strJavaFunction5));
        classEnhancementBuilder2.function("putIfAbsent", new m(strJavaLang));
        classEnhancementBuilder2.function("replace", new n(strJavaLang));
        classEnhancementBuilder2.function("replace", new o(strJavaLang));
        classEnhancementBuilder2.function("replaceAll", new p(strJavaFunction4));
        classEnhancementBuilder2.function("compute", new q(strJavaLang, strJavaFunction4));
        classEnhancementBuilder2.function("computeIfAbsent", new r(strJavaLang, strJavaFunction2));
        classEnhancementBuilder2.function("computeIfPresent", new s(strJavaLang, strJavaFunction4));
        classEnhancementBuilder2.function("merge", new t(strJavaLang, strJavaFunction4));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = signatureEnhancementBuilder.new ClassEnhancementBuilder(strJavaUtil2);
        classEnhancementBuilder3.function("empty", new u(strJavaUtil2));
        classEnhancementBuilder3.function("of", new v(strJavaLang, strJavaUtil2));
        classEnhancementBuilder3.function("ofNullable", new w(strJavaLang, strJavaUtil2));
        classEnhancementBuilder3.function("get", new x(strJavaLang));
        classEnhancementBuilder3.function("ifPresent", new y(strJavaFunction3));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaLang("ref/Reference")).function("get", new z(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(strJavaFunction).function("test", new a0(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaFunction("BiPredicate")).function("test", new b0(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(strJavaFunction3).function("accept", new b(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(strJavaFunction5).function("accept", new c(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(strJavaFunction2).function("apply", new d(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(strJavaFunction4).function("apply", new e(strJavaLang));
        signatureEnhancementBuilder.new ClassEnhancementBuilder(signatureBuildingComponents.javaFunction("Supplier")).function("get", new f(strJavaLang));
        d = signatureEnhancementBuilder.b();
    }

    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return d;
    }
}
