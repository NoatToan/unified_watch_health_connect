package org.koin.android.compat;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.koin.KoinExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013JR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007JS\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lorg/koin/android/compat/ViewModelCompat;", "", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModelStoreOwner;", DataCacher.o, "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "viewModel", "getViewModel", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "<init>", "()V", "koin-android-compat_release"}, k = 1, mv = {1, 5, 1})
public final class ViewModelCompat {

    @NotNull
    public static final ViewModelCompat INSTANCE = new ViewModelCompat();

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
        public final /* synthetic */ ViewModelStoreOwner a;
        public final /* synthetic */ Class<T> b;
        public final /* synthetic */ Qualifier c;
        public final /* synthetic */ Function0<ParametersHolder> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.a = viewModelStoreOwner;
            this.b = cls;
            this.c = qualifier;
            this.d = function0;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            return ViewModelCompat.getViewModel(this.a, this.b, this.c, this.d);
        }
    }

    private ViewModelCompat() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls) {
        return (T) getViewModel$default(viewModelStoreOwner, cls, null, null, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls, @Nullable Qualifier qualifier) {
        return (T) getViewModel$default(viewModelStoreOwner, cls, qualifier, null, 8, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull ViewModelStoreOwner owner, @NotNull Class<T> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return (T) KoinExtKt.getViewModel(GlobalContext.INSTANCE.get(), qualifier, new a(owner), JvmClassMappingKt.getKotlinClass(clazz), parameters);
    }

    public static /* synthetic */ ViewModel getViewModel$default(ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return getViewModel(viewModelStoreOwner, cls, qualifier, function0);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls) {
        return viewModel$default(viewModelStoreOwner, cls, null, null, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Class<T> cls, @Nullable Qualifier qualifier) {
        return viewModel$default(viewModelStoreOwner, cls, qualifier, null, 8, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final <T extends ViewModel> Lazy<T> viewModel(@NotNull ViewModelStoreOwner owner, @NotNull Class<T> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return LazyKt__LazyJVMKt.lazy(new b(owner, clazz, qualifier, parameters));
    }

    public static /* synthetic */ Lazy viewModel$default(ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return viewModel(viewModelStoreOwner, cls, qualifier, function0);
    }
}
