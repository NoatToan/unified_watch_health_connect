package com.xiaomi.fitness.baseui.view;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J)\u0010\u0004\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/ViewModelCreator;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "initViewModel", CardInfo.KEY_OWNER, "Landroidx/lifecycle/ViewModelStoreOwner;", "vm", "Lkotlin/reflect/KClass;", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;)Lcom/xiaomi/fitness/baseui/AbsViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ViewModelCreator<VM extends AbsViewModel> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <VM extends AbsViewModel> VM initViewModel(@NotNull ViewModelCreator<VM> viewModelCreator, @Nullable ViewModelStoreOwner viewModelStoreOwner, @Nullable KClass<VM> kClass) throws IllegalAccessException {
            Class javaClass;
            if (kClass == null) {
                Class<?> superclass = viewModelCreator.getClass();
                int i = 0;
                Type genericSuperclass = null;
                javaClass = null;
                while (true) {
                    boolean z = genericSuperclass instanceof ParameterizedType;
                    genericSuperclass = superclass != null ? superclass.getGenericSuperclass() : null;
                    superclass = superclass != null ? superclass.getSuperclass() : null;
                    if (genericSuperclass != null && (genericSuperclass instanceof ParameterizedType)) {
                        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                        Iterator it = ArrayIteratorKt.iterator(parameterizedType.getActualTypeArguments());
                        int i2 = 0;
                        while (it.hasNext()) {
                            Type type = (Type) it.next();
                            StringBuilder sb = new StringBuilder();
                            sb.append(type);
                            String string = sb.toString();
                            if (StringsKt__StringsJVMKt.endsWith$default(string, "ViewModel", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(string, "VM", false, 2, null)) {
                                Type type2 = parameterizedType.getActualTypeArguments()[i2];
                                Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type java.lang.Class<VM of com.xiaomi.fitness.baseui.view.ViewModelCreator>");
                                javaClass = (Class) type2;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (javaClass != null || i == 4) {
                        break;
                    }
                    i++;
                }
            } else {
                javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
            }
            Intrinsics.checkNotNull(viewModelStoreOwner);
            ViewModelProvider.Factory viewModelFactory = viewModelCreator.getViewModelFactory();
            Intrinsics.checkNotNull(viewModelFactory);
            ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOwner, viewModelFactory);
            if (javaClass != null) {
                return (VM) viewModelProvider.get(javaClass);
            }
            throw new IllegalAccessException("必须在泛型中设置ViewModel的具体子类类型");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbsViewModel initViewModel$default(ViewModelCreator viewModelCreator, ViewModelStoreOwner viewModelStoreOwner, KClass kClass, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initViewModel");
            }
            if ((i & 2) != 0) {
                kClass = null;
            }
            return viewModelCreator.initViewModel(viewModelStoreOwner, kClass);
        }
    }

    @Nullable
    ViewModelProvider.Factory getViewModelFactory();

    @NotNull
    VM initViewModel(@Nullable ViewModelStoreOwner owner, @Nullable KClass<VM> vm);
}
