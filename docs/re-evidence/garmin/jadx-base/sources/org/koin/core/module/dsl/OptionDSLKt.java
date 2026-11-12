package org.koin.core.module.dsl;

import e23.l;
import java.util.List;
import k23.d;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.OptionDslMarker;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\b\u0002\u0010\u0006\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\t\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a \u0010\f\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0086\b¢\u0006\u0004\b\f\u0010\u000e\u001a$\u0010\u000f\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0015\u0010\u000e\u001a=\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u001e\u0010\u0017\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00040\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0016¢\u0006\u0004\b\u0017\u0010\u0018*4\u0010\u0019\u001a\u0004\b\u0000\u0010\u0000\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"T", "Lorg/koin/core/definition/KoinDefinition;", "Lkotlin/Function1;", "Lorg/koin/core/definition/BeanDefinition;", "", "Lorg/koin/core/module/dsl/DefinitionOptions;", "options", "withOptions", "(Lorg/koin/core/definition/KoinDefinition;Le23/l;)Lorg/koin/core/definition/KoinDefinition;", "onOptions", "", "name", "named", "(Lorg/koin/core/definition/BeanDefinition;Ljava/lang/String;)V", "(Lorg/koin/core/definition/BeanDefinition;)V", "bind", "", "Lk23/d;", "classes", "binds", "(Lorg/koin/core/definition/BeanDefinition;Ljava/util/List;)V", "createdAtStart", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "(Lorg/koin/core/definition/BeanDefinition;Le23/l;)V", "DefinitionOptions", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OptionDSLKt {
    public static final <T> void bind(BeanDefinition<? extends T> beanDefinition) {
        beanDefinition.getClass();
        beanDefinition.getSecondaryTypes();
        s.l();
        throw null;
    }

    public static final void binds(BeanDefinition<?> beanDefinition, List<? extends d<?>> list) {
        beanDefinition.getClass();
        list.getClass();
        beanDefinition.setSecondaryTypes(h0.C0(beanDefinition.getSecondaryTypes(), list));
    }

    public static final void createdAtStart(BeanDefinition<?> beanDefinition) {
        beanDefinition.getClass();
        beanDefinition.set_createdAtStart(true);
    }

    public static final void named(BeanDefinition<?> beanDefinition, String str) {
        beanDefinition.getClass();
        str.getClass();
        beanDefinition.setQualifier(new StringQualifier(str));
    }

    public static final <T> void onClose(BeanDefinition<T> beanDefinition, l<? super T, Unit> lVar) {
        beanDefinition.getClass();
        lVar.getClass();
        beanDefinition.setCallbacks(new Callbacks<>(lVar));
    }

    public static final <T> KoinDefinition<T> onOptions(KoinDefinition<T> koinDefinition, l<? super BeanDefinition<T>, Unit> lVar) {
        koinDefinition.getClass();
        if (lVar != null) {
            BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
            Qualifier qualifier = beanDefinition.getQualifier();
            lVar.invoke(beanDefinition);
            if (!s.g(beanDefinition.getQualifier(), qualifier)) {
                koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
            }
            if (!beanDefinition.getSecondaryTypes().isEmpty()) {
                koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
            }
            if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
                koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
            }
        }
        return koinDefinition;
    }

    public static /* synthetic */ KoinDefinition onOptions$default(KoinDefinition koinDefinition, l lVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            lVar = null;
        }
        return onOptions(koinDefinition, lVar);
    }

    @OptionDslMarker
    public static final <T> KoinDefinition<T> withOptions(KoinDefinition<T> koinDefinition, l<? super BeanDefinition<T>, Unit> lVar) {
        koinDefinition.getClass();
        lVar.getClass();
        BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        Qualifier qualifier = beanDefinition.getQualifier();
        lVar.invoke(beanDefinition);
        if (!s.g(beanDefinition.getQualifier(), qualifier)) {
            koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
        }
        if (!beanDefinition.getSecondaryTypes().isEmpty()) {
            koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
        }
        if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
            koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
        }
        return koinDefinition;
    }

    public static final <T> void named(BeanDefinition<?> beanDefinition) {
        beanDefinition.getClass();
        s.l();
        throw null;
    }
}
