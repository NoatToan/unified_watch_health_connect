package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.analytics.DbUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\fJ\b\u0010\u000e\u001a\u00020\tH\u0016J\u001a\u0010\u0014\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u0012R:\u0010\u0019\u001a&\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00028\u00000\u0015j\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00028\u0000`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lorg/koin/core/instance/ScopedInstanceFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/instance/InstanceFactory;", "Lorg/koin/core/instance/InstanceContext;", DbUtils.Const.Table.CONTEXT, "", "isCreated", "Lorg/koin/core/scope/Scope;", "scope", "", "drop", "create", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "get", "dropAll", "", "Lorg/koin/core/scope/ScopeID;", "scopeID", "", DefaultSettingsSpiCall.n, "refreshInstance", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "values", "Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class ScopedInstanceFactory<T> extends InstanceFactory<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HashMap<String, T> values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ScopedInstanceFactory<T> a;
        public final /* synthetic */ InstanceContext b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScopedInstanceFactory<T> scopedInstanceFactory, InstanceContext instanceContext) {
            super(0);
            this.a = scopedInstanceFactory;
            this.b = instanceContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a.isCreated(this.b)) {
                return;
            }
            ((ScopedInstanceFactory) this.a).values.put(this.b.getScope().getId(), this.a.create(this.b));
        }
    }

    public ScopedInstanceFactory(@NotNull BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        this.values = new HashMap<>();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T create(@NotNull InstanceContext context) {
        if (this.values.get(context.getScope().getId()) == null) {
            return (T) super.create(context);
        }
        T t = this.values.get(context.getScope().getId());
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(("Scoped instance not found for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void drop(@Nullable Scope scope) {
        if (scope == null) {
            return;
        }
        Function1<T, Unit> onClose = getBeanDefinition().getCallbacks().getOnClose();
        if (onClose != null) {
            onClose.invoke(this.values.get(scope.getId()));
        }
        this.values.remove(scope.getId());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public void dropAll() {
        this.values.clear();
    }

    @Override // org.koin.core.instance.InstanceFactory
    public T get(@NotNull InstanceContext context) {
        if (!Intrinsics.areEqual(context.getScope().getScopeQualifier(), getBeanDefinition().getScopeQualifier())) {
            throw new IllegalStateException(("Wrong Scope: trying to open instance for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
        }
        KoinPlatformTools.INSTANCE.m4495synchronized(this, new a(this, context));
        T t = this.values.get(context.getScope().getId());
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(("Scoped instance not found for " + context.getScope().getId() + " in " + getBeanDefinition()).toString());
    }

    @Override // org.koin.core.instance.InstanceFactory
    public boolean isCreated(@Nullable InstanceContext context) {
        Scope scope;
        HashMap<String, T> map = this.values;
        String id = null;
        if (context != null && (scope = context.getScope()) != null) {
            id = scope.getId();
        }
        return map.get(id) != null;
    }

    public final void refreshInstance(@NotNull String scopeID, @NotNull Object instance) {
        this.values.put(scopeID, instance);
    }
}
