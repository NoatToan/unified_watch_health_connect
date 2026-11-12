package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "org/koin/core/scope/Scope$declare$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class Koin$declare$$inlined$declare$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Scope a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Qualifier c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Koin$declare$$inlined$declare$1(Scope scope, Object obj, Qualifier qualifier, List list, boolean z) {
        super(0);
        this.a = scope;
        this.b = obj;
        this.c = qualifier;
        this.d = list;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        InstanceRegistry instanceRegistry = this.a.get_koin().getInstanceRegistry();
        final Object obj = this.b;
        Qualifier qualifier = this.c;
        List list = this.d;
        boolean z = this.e;
        Qualifier scopeQualifier = this.a.getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        Function2<Scope, ParametersHolder, T> function2 = new Function2<Scope, ParametersHolder, T>() { // from class: org.koin.core.Koin$declare$$inlined$declare$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (T) obj;
            }
        };
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
        InstanceRegistry.saveMapping$default(instanceRegistry, z, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
        Iterator<T> it2 = beanDefinition.getSecondaryTypes().iterator();
        while (it2.hasNext()) {
            InstanceRegistry.saveMapping$default(instanceRegistry, z, BeanDefinitionKt.indexKey((KClass) it2.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
        }
    }
}
