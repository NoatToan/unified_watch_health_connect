package org.koin.java;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007JF\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007JE\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0007¨\u0006\u0015"}, d2 = {"Lorg/koin/java/KoinJavaComponent;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "inject", "injectOrNull", "get", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "Lorg/koin/core/Koin;", "getKoin", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class KoinJavaComponent {

    @NotNull
    public static final KoinJavaComponent INSTANCE = new KoinJavaComponent();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Class<?> a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ParametersHolder> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Class<?> cls, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.a = cls;
            this.b = qualifier;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) KoinJavaComponent.get(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Class<?> a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ParametersHolder> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Class<?> cls, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.a = cls;
            this.b = qualifier;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            return (T) KoinJavaComponent.getOrNull(this.a, this.b, this.c);
        }
    }

    private KoinJavaComponent() {
    }

    @JvmStatic
    @JvmOverloads
    public static final <T> T get(@NotNull Class<?> cls) {
        return (T) get$default(cls, null, null, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final <T> T get(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        return (T) get$default(cls, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final <T> T get(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return (T) getKoin().get(JvmClassMappingKt.getKotlinClass(clazz), qualifier, parameters);
    }

    public static /* synthetic */ Object get$default(Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return get(cls, qualifier, function0);
    }

    @JvmStatic
    @NotNull
    public static final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> cls) {
        return (T) getOrNull$default(cls, null, null, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        return (T) getOrNull$default(cls, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return (T) getKoin().getOrNull(JvmClassMappingKt.getKotlinClass(clazz), qualifier, parameters);
    }

    public static /* synthetic */ Object getOrNull$default(Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return getOrNull(cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> inject(@NotNull Class<?> cls) {
        return inject$default(cls, null, null, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> inject(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        return inject$default(cls, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> inject(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new a(clazz, qualifier, parameters));
    }

    public static /* synthetic */ Lazy inject$default(Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return inject(cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> injectOrNull(@NotNull Class<?> cls) {
        return injectOrNull$default(cls, null, null, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> injectOrNull(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        return injectOrNull$default(cls, qualifier, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T> Lazy<T> injectOrNull(@NotNull Class<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return LazyKt__LazyJVMKt.lazy(new b(clazz, qualifier, parameters));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return injectOrNull(cls, qualifier, function0);
    }
}
