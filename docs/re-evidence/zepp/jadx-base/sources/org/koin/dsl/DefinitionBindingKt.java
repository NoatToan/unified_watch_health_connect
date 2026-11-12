package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Callbacks;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.module.Module;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0004\u001a5\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\u0086\b\u001aF\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00002\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\n\u001aW\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0000\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00002\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00028\u0000`\rH\u0086\u0004¨\u0006\u000f"}, d2 = {"Lkotlin/Pair;", "Lorg/koin/core/module/Module;", "Lorg/koin/core/instance/InstanceFactory;", "Lkotlin/reflect/KClass;", "clazz", "bind", ExifInterface.GPS_DIRECTION_TRUE, "", "classes", "binds", "(Lkotlin/Pair;[Lkotlin/reflect/KClass;)Lkotlin/Pair;", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class DefinitionBindingKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Pair<Module, InstanceFactory<?>> bind(@NotNull Pair<Module, ? extends InstanceFactory<?>> pair, @NotNull KClass<?> kClass) {
        ((InstanceFactory) pair.getSecond()).getBeanDefinition().setSecondaryTypes(CollectionsKt___CollectionsKt.plus((Collection<? extends KClass<?>>) ((InstanceFactory) pair.getSecond()).getBeanDefinition().getSecondaryTypes(), kClass));
        ((Module) pair.getFirst()).saveMapping(BeanDefinitionKt.indexKey(kClass, ((InstanceFactory) pair.getSecond()).getBeanDefinition().getQualifier(), ((InstanceFactory) pair.getSecond()).getBeanDefinition().getScopeQualifier()), (InstanceFactory) pair.getSecond(), true);
        return pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Pair<Module, InstanceFactory<?>> binds(@NotNull Pair<Module, ? extends InstanceFactory<?>> pair, @NotNull KClass<?>[] kClassArr) {
        ((InstanceFactory) pair.getSecond()).getBeanDefinition().setSecondaryTypes(CollectionsKt___CollectionsKt.plus((Collection) ((InstanceFactory) pair.getSecond()).getBeanDefinition().getSecondaryTypes(), (Object[]) kClassArr));
        for (KClass<?> kClass : kClassArr) {
            ((Module) pair.getFirst()).saveMapping(BeanDefinitionKt.indexKey(kClass, ((InstanceFactory) pair.getSecond()).getBeanDefinition().getQualifier(), ((InstanceFactory) pair.getSecond()).getBeanDefinition().getScopeQualifier()), (InstanceFactory) pair.getSecond(), true);
        }
        return pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Pair<Module, InstanceFactory<T>> onClose(@NotNull Pair<Module, ? extends InstanceFactory<T>> pair, @NotNull Function1<? super T, Unit> function1) {
        ((InstanceFactory) pair.getSecond()).getBeanDefinition().setCallbacks(new Callbacks<>(function1));
        return pair;
    }

    public static final /* synthetic */ <T> Pair<Module, InstanceFactory<?>> bind(Pair<Module, ? extends InstanceFactory<?>> pair) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return bind(pair, Reflection.getOrCreateKotlinClass(Object.class));
    }
}
