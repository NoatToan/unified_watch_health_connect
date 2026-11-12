package org.koin.core.instance;

import androidx.core.view.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e23.l;
import java.util.HashMap;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import vv0.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\tj\u0002`\n2\u0006\u0010\u001a\u001a\u00020\u001bR2\u0010\u0007\u001a&\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00028\u00000\bj\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00028\u0000`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/koin/core/instance/ScopedInstanceFactory;", "T", "Lorg/koin/core/instance/InstanceFactory;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "values", "Ljava/util/HashMap;", "", "Lorg/koin/core/scope/ScopeID;", "Lkotlin/collections/HashMap;", "isCreated", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/koin/core/instance/ResolutionContext;", "drop", "", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "create", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "get", "dropAll", "refreshInstance", "scopeID", "instance", "", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopedInstanceFactory<T> extends InstanceFactory<T> {
    private HashMap<String, T> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        beanDefinition.getClass();
        this.values = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit get$lambda$1(ScopedInstanceFactory scopedInstanceFactory, ResolutionContext resolutionContext) {
        if (!scopedInstanceFactory.isCreated(resolutionContext)) {
            scopedInstanceFactory.values.put(resolutionContext.getScope().getId(), (T) scopedInstanceFactory.create(resolutionContext));
        }
        return Unit.INSTANCE;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(ResolutionContext context) {
        context.getClass();
        if (this.values.get(context.getScope().getId()) == null) {
            return (T) super.create(context);
        }
        T t7 = this.values.get(context.getScope().getId());
        if (t7 != null) {
            return t7;
        }
        j.B("Scoped instance not found for ", context.getScope().getId(), " in ", getBeanDefinition());
        return null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(Scope scope) {
        if (scope != null) {
            l<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
            if (onClose != null) {
                onClose.invoke(this.values.get(scope.getId()));
            }
            this.values.remove(scope.getId());
        }
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        this.values.clear();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(ResolutionContext context) {
        context.getClass();
        if (!s.g(context.getScope().getScopeQualifier(), getBeanDefinition().getScopeQualifier())) {
            j.B("Wrong Scope: trying to open instance for ", context.getScope().getId(), " in ", getBeanDefinition());
            return null;
        }
        KoinPlatformTools.INSTANCE.m499synchronized(this, new n(18, this, context));
        T t7 = this.values.get(context.getScope().getId());
        if (t7 != null) {
            return t7;
        }
        j.B("Scoped instance not found for ", context.getScope().getId(), " in ", getBeanDefinition());
        return null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(ResolutionContext context) {
        Scope scope;
        return this.values.get((context == null || (scope = context.getScope()) == null) ? null : scope.getId()) != null;
    }

    public final void refreshInstance(String scopeID, Object instance) {
        scopeID.getClass();
        instance.getClass();
        this.values.put(scopeID, instance);
    }
}
