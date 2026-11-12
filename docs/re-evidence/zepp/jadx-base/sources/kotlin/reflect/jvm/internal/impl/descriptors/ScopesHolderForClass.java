package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    @NotNull
    private final ClassDescriptor a;

    @NotNull
    private final Function1<KotlinTypeRefiner, T> b;

    @NotNull
    private final KotlinTypeRefiner c;

    @NotNull
    private final NotNullLazyValue d;
    public static final /* synthetic */ KProperty<Object>[] e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T extends MemberScope> ScopesHolderForClass<T> create(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> function1) {
            return new ScopesHolderForClass<>(classDescriptor, storageManager, function1, kotlinTypeRefiner, null);
        }
    }

    public static final class a extends Lambda implements Function0<T> {
        public final /* synthetic */ ScopesHolderForClass<T> a;
        public final /* synthetic */ KotlinTypeRefiner b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScopesHolderForClass<T> scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
            super(0);
            this.a = scopesHolderForClass;
            this.b = kotlinTypeRefiner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((ScopesHolderForClass) this.a).b.invoke(this.b);
        }
    }

    public static final class b extends Lambda implements Function0<T> {
        public final /* synthetic */ ScopesHolderForClass<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScopesHolderForClass<T> scopesHolderForClass) {
            super(0);
            this.a = scopesHolderForClass;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((ScopesHolderForClass) this.a).b.invoke(((ScopesHolderForClass) this.a).c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1<? super KotlinTypeRefiner, ? extends T> function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.a = classDescriptor;
        this.b = function1;
        this.c = kotlinTypeRefiner;
        this.d = storageManager.createLazyValue(new b(this));
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }

    private final T a() {
        return (T) StorageKt.getValue(this.d, this, (KProperty<?>) e[0]);
    }

    @NotNull
    public final T getScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(this.a)) && kotlinTypeRefiner.isRefinementNeededForTypeConstructor(this.a.getTypeConstructor())) {
            return (T) kotlinTypeRefiner.getOrPutScopeForClass(this.a, new a(this, kotlinTypeRefiner));
        }
        return (T) a();
    }
}
