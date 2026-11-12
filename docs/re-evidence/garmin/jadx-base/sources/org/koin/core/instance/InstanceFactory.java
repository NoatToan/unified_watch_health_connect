package org.koin.core.instance;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import org.apache.commons.lang3.e;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\u0014\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0015\u001a\u00020\u0012H&R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", "T", "", "Lorg/koin/mp/Lockable;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "get", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/koin/core/instance/ResolutionContext;", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "create", "isCreated", "", "drop", "", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "dropAll", "Companion", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InstanceFactory<T> {
    public static final String ERROR_SEPARATOR = "\n\t";
    private final BeanDefinition<T> beanDefinition;

    public InstanceFactory(BeanDefinition<T> beanDefinition) {
        beanDefinition.getClass();
        this.beanDefinition = beanDefinition;
    }

    public static /* synthetic */ void drop$default(InstanceFactory instanceFactory, Scope scope, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: drop");
            return;
        }
        if ((i14 & 1) != 0) {
            scope = null;
        }
        instanceFactory.drop(scope);
    }

    public static /* synthetic */ boolean isCreated$default(InstanceFactory instanceFactory, ResolutionContext resolutionContext, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: isCreated");
            return false;
        }
        if ((i14 & 1) != 0) {
            resolutionContext = null;
        }
        return instanceFactory.isCreated(resolutionContext);
    }

    public T create(ResolutionContext context) throws InstanceCreationException {
        context.getClass();
        context.getLogger().debug("| (+) '" + this.beanDefinition + CoreConstants.SINGLE_QUOTE_CHAR);
        try {
            ParametersHolder parameters = context.getParameters();
            if (parameters == null) {
                parameters = ParametersHolderKt.emptyParametersHolder();
            }
            return this.beanDefinition.getDefinition().invoke(context.getScope(), parameters);
        } catch (Exception e4) {
            String stackTrace = KoinPlatformTools.INSTANCE.getStackTrace(e4);
            context.getLogger().error("* Instance creation error : could not create instance for '" + this.beanDefinition + "': " + stackTrace);
            throw new InstanceCreationException("Could not create instance for '" + this.beanDefinition + CoreConstants.SINGLE_QUOTE_CHAR, e4);
        }
    }

    public abstract void drop(Scope scope);

    public abstract void dropAll();

    public abstract T get(ResolutionContext context);

    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public abstract boolean isCreated(ResolutionContext context);
}
