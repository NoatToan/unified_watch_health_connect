package org.koin.android.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
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
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jd\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007J[\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lorg/koin/android/compat/ScopeCompat;", "", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "scope", "Landroidx/lifecycle/ViewModelStoreOwner;", DataCacher.o, "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/LazyThreadSafetyMode;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "viewModel", "getViewModel", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "<init>", "()V", "koin-android-compat_release"}, k = 1, mv = {1, 5, 1})
public final class ScopeCompat {

    @NotNull
    public static final ScopeCompat INSTANCE = new ScopeCompat();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewModelOwner> {
        public final /* synthetic */ ViewModelStoreOwner a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner) {
            super(0);
            this.a = viewModelStoreOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelOwner invoke() {
            return ViewModelOwner.INSTANCE.from(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Scope a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Class<T> c;
        public final /* synthetic */ Function0<ParametersHolder> d;
        public final /* synthetic */ ViewModelStoreOwner e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ViewModelOwner> {
            public final /* synthetic */ ViewModelStoreOwner a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewModelStoreOwner viewModelStoreOwner) {
                super(0);
                this.a = viewModelStoreOwner;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Scope scope, Qualifier qualifier, Class<T> cls, Function0<? extends ParametersHolder> function0, ViewModelStoreOwner viewModelStoreOwner) {
            super(0);
            this.a = scope;
            this.b = qualifier;
            this.c = cls;
            this.d = function0;
            this.e = viewModelStoreOwner;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            return ScopeExtKt.getViewModel$default(this.a, this.b, new a(this.e), JvmClassMappingKt.getKotlinClass(this.c), null, this.d, 8, null);
        }
    }

    private ScopeCompat() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls) {
        return (T) getViewModel$default(scope, viewModelStoreOwner, cls, null, null, 24, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls, @Nullable Qualifier qualifier) {
        return (T) getViewModel$default(scope, viewModelStoreOwner, cls, qualifier, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner owner, @NotNull Class<T> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return (T) ScopeExtKt.getViewModel$default(scope, qualifier, new a(owner), JvmClassMappingKt.getKotlinClass(clazz), null, parameters, 8, null);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            qualifier = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        return getViewModel(scope, viewModelStoreOwner, cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls) {
        return viewModel$default(scope, viewModelStoreOwner, cls, null, null, null, 56, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls, @Nullable Qualifier qualifier) {
        return viewModel$default(scope, viewModelStoreOwner, cls, qualifier, null, null, 48, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls, @Nullable Qualifier qualifier, @NotNull LazyThreadSafetyMode lazyThreadSafetyMode) {
        return viewModel$default(scope, viewModelStoreOwner, cls, qualifier, lazyThreadSafetyMode, null, 32, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull Scope scope, @NotNull ViewModelStoreOwner owner, @NotNull Class<T> clazz, @Nullable Qualifier qualifier, @NotNull LazyThreadSafetyMode mode, @Nullable Function0<? extends ParametersHolder> parameters) {
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new b(scope, qualifier, clazz, parameters, owner));
    }

    public static /* synthetic */ Lazy viewModel$default(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        Qualifier qualifier2 = (i & 8) != 0 ? null : qualifier;
        if ((i & 16) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        return viewModel(scope, viewModelStoreOwner, cls, qualifier2, lazyThreadSafetyMode, (i & 32) != 0 ? null : function0);
    }
}
