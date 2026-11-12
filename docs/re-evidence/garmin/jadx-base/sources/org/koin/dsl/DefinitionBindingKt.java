package org.koin.dsl;

import ch.qos.logback.core.CoreConstants;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import k23.d;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.OptionDslMarker;
import org.koin.core.qualifier.Qualifier;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0007\u001a.\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\bH\u0087\u0004¢\u0006\u0004\b\n\u0010\u000b\u001aF\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00028\u0000`\u000fH\u0087\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "S", "Lorg/koin/core/definition/KoinDefinition;", "Lk23/d;", "clazz", "bind", "(Lorg/koin/core/definition/KoinDefinition;Lk23/d;)Lorg/koin/core/definition/KoinDefinition;", "(Lorg/koin/core/definition/KoinDefinition;)Lorg/koin/core/definition/KoinDefinition;", "", "classes", "binds", "(Lorg/koin/core/definition/KoinDefinition;[Lk23/d;)Lorg/koin/core/definition/KoinDefinition;", "T", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "(Lorg/koin/core/definition/KoinDefinition;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DefinitionBindingKt {
    @OptionDslMarker
    public static final <S> KoinDefinition<? extends S> bind(KoinDefinition<? extends S> koinDefinition, d<S> dVar) {
        String value;
        koinDefinition.getClass();
        dVar.getClass();
        koinDefinition.getFactory().getBeanDefinition().setSecondaryTypes(h0.D0(koinDefinition.getFactory().getBeanDefinition().getSecondaryTypes(), dVar));
        Qualifier qualifier = koinDefinition.getFactory().getBeanDefinition().getQualifier();
        Qualifier scopeQualifier = koinDefinition.getFactory().getBeanDefinition().getScopeQualifier();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(KClassExtKt.getFullName(dVar));
        sb3.append(CoreConstants.COLON_CHAR);
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        sb3.append(value);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(scopeQualifier);
        koinDefinition.getModule().saveMapping(sb3.toString(), koinDefinition.getFactory());
        return koinDefinition;
    }

    @OptionDslMarker
    public static final KoinDefinition<?> binds(KoinDefinition<?> koinDefinition, d<?>[] dVarArr) {
        String value;
        koinDefinition.getClass();
        dVarArr.getClass();
        BeanDefinition<?> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        List<d<?>> secondaryTypes = beanDefinition.getSecondaryTypes();
        secondaryTypes.getClass();
        ArrayList arrayList = new ArrayList(secondaryTypes.size() + dVarArr.length);
        arrayList.addAll(secondaryTypes);
        d0.w(arrayList, dVarArr);
        beanDefinition.setSecondaryTypes(arrayList);
        for (d<?> dVar : dVarArr) {
            Qualifier qualifier = koinDefinition.getFactory().getBeanDefinition().getQualifier();
            Qualifier scopeQualifier = koinDefinition.getFactory().getBeanDefinition().getScopeQualifier();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(KClassExtKt.getFullName(dVar));
            sb3.append(CoreConstants.COLON_CHAR);
            if (qualifier == null || (value = qualifier.getValue()) == null) {
                value = "";
            }
            sb3.append(value);
            sb3.append(CoreConstants.COLON_CHAR);
            sb3.append(scopeQualifier);
            koinDefinition.getModule().saveMapping(sb3.toString(), koinDefinition.getFactory());
        }
        return koinDefinition;
    }

    @OptionDslMarker
    public static final <T> KoinDefinition<T> onClose(KoinDefinition<T> koinDefinition, l<? super T, Unit> lVar) {
        koinDefinition.getClass();
        lVar.getClass();
        koinDefinition.getFactory().getBeanDefinition().setCallbacks(new Callbacks<>(lVar));
        return koinDefinition;
    }

    @OptionDslMarker
    public static final <S> KoinDefinition<? extends S> bind(KoinDefinition<? extends S> koinDefinition) {
        koinDefinition.getClass();
        s.l();
        throw null;
    }
}
