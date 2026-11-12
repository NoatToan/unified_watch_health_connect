package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0014\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000e\u001a\u00020\fH&R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/core/instance/InstanceContext;", DbUtils.Const.Table.CONTEXT, "get", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "create", "", "isCreated", "Lorg/koin/core/scope/Scope;", "scope", "", "drop", "dropAll", "Lorg/koin/core/definition/BeanDefinition;", "a", "Lorg/koin/core/definition/BeanDefinition;", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1})
public abstract class InstanceFactory<T> {

    @NotNull
    public static final String ERROR_SEPARATOR = "\n\t";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BeanDefinition<T> beanDefinition;

    public InstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        this.beanDefinition = beanDefinition;
    }

    public static /* synthetic */ void drop$default(InstanceFactory instanceFactory, Scope scope, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i & 1) != 0) {
            scope = null;
        }
        instanceFactory.drop(scope);
    }

    public static /* synthetic */ boolean isCreated$default(InstanceFactory instanceFactory, InstanceContext instanceContext, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i & 1) != 0) {
            instanceContext = null;
        }
        return instanceFactory.isCreated(instanceContext);
    }

    public T create(@NotNull InstanceContext context) throws InstanceCreationException {
        Koin koin = context.getKoin();
        if (koin.getLogger().isAt(Level.DEBUG)) {
            koin.getLogger().debug(Intrinsics.stringPlus("| create instance for ", this.beanDefinition));
        }
        try {
            ParametersHolder parameters = context.getParameters();
            if (parameters == null) {
                parameters = ParametersHolderKt.emptyParametersHolder();
            }
            return this.beanDefinition.getDefinition().invoke(context.getScope(), parameters);
        } catch (Exception e) {
            String stackTrace = KoinPlatformTools.INSTANCE.getStackTrace(e);
            koin.getLogger().error("Instance creation error : could not create instance for " + this.beanDefinition + ": " + stackTrace);
            throw new InstanceCreationException(Intrinsics.stringPlus("Could not create instance for ", this.beanDefinition), e);
        }
    }

    public abstract void drop(@Nullable Scope scope);

    public abstract void dropAll();

    public abstract T get(@NotNull InstanceContext context);

    @NotNull
    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public abstract boolean isCreated(@Nullable InstanceContext context);
}
