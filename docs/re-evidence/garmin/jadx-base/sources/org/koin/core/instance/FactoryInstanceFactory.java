package org.koin.core.instance;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e23.l;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/koin/core/instance/FactoryInstanceFactory;", "T", "Lorg/koin/core/instance/InstanceFactory;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "isCreated", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/koin/core/instance/ResolutionContext;", "drop", "", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "dropAll", "get", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FactoryInstanceFactory<T> extends InstanceFactory<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactoryInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        beanDefinition.getClass();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(Scope scope) {
        l<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(null);
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(ResolutionContext context) {
        context.getClass();
        return create(context);
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(ResolutionContext context) {
        return false;
    }
}
