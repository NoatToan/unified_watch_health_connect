package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    @NotNull
    private final NotNullLazyValue<b> b;
    private final boolean c;

    public final class a implements TypeConstructor {

        @NotNull
        private final KotlinTypeRefiner a;

        @NotNull
        private final Lazy b;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a$a, reason: collision with other inner class name */
        public static final class C1178a extends Lambda implements Function0<List<? extends KotlinType>> {
            public final /* synthetic */ AbstractTypeConstructor b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1178a(AbstractTypeConstructor abstractTypeConstructor) {
                super(0);
                this.b = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends KotlinType> invoke() {
                return KotlinTypeRefinerKt.refineTypes(a.this.a, this.b.getSupertypes());
            }
        }

        public a(KotlinTypeRefiner kotlinTypeRefiner) {
            this.a = kotlinTypeRefiner;
            this.b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C1178a(AbstractTypeConstructor.this));
        }

        private final List<KotlinType> b() {
            return (List) this.b.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<KotlinType> getSupertypes() {
            return b();
        }

        public boolean equals(@Nullable Object obj) {
            return AbstractTypeConstructor.this.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            return AbstractTypeConstructor.this.getBuiltIns();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo4298getDeclarationDescriptor() {
            return AbstractTypeConstructor.this.mo4298getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return AbstractTypeConstructor.this.getParameters();
        }

        public int hashCode() {
            return AbstractTypeConstructor.this.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return AbstractTypeConstructor.this.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            return AbstractTypeConstructor.this.refine(kotlinTypeRefiner);
        }

        @NotNull
        public String toString() {
            return AbstractTypeConstructor.this.toString();
        }
    }

    public static final class b {

        @NotNull
        private final Collection<KotlinType> a;

        @NotNull
        private List<? extends KotlinType> b = kotlin.collections.e.listOf(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES);

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Collection<? extends KotlinType> collection) {
            this.a = collection;
        }

        @NotNull
        public final Collection<KotlinType> a() {
            return this.a;
        }

        @NotNull
        public final List<KotlinType> b() {
            return this.b;
        }

        public final void c(@NotNull List<? extends KotlinType> list) {
            this.b = list;
        }
    }

    public static final class c extends Lambda implements Function0<b> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(AbstractTypeConstructor.this.computeSupertypes());
        }
    }

    public static final class d extends Lambda implements Function1<Boolean, b> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @NotNull
        public final b a(boolean z) {
            return new b(kotlin.collections.e.listOf(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    public static final class e extends Lambda implements Function1<b, Unit> {

        public static final class a extends Lambda implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {
            public final /* synthetic */ AbstractTypeConstructor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.a = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
                return this.a.b(typeConstructor, true);
            }
        }

        public static final class b extends Lambda implements Function1<KotlinType, Unit> {
            public final /* synthetic */ AbstractTypeConstructor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.a = abstractTypeConstructor;
            }

            public final void a(@NotNull KotlinType kotlinType) {
                this.a.reportScopesLoopError(kotlinType);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KotlinType kotlinType) {
                a(kotlinType);
                return Unit.INSTANCE;
            }
        }

        public static final class c extends Lambda implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {
            public final /* synthetic */ AbstractTypeConstructor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.a = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
                return this.a.b(typeConstructor, false);
            }
        }

        public static final class d extends Lambda implements Function1<KotlinType, Unit> {
            public final /* synthetic */ AbstractTypeConstructor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.a = abstractTypeConstructor;
            }

            public final void a(@NotNull KotlinType kotlinType) {
                this.a.reportSupertypeLoopError(kotlinType);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KotlinType kotlinType) {
                a(kotlinType);
                return Unit.INSTANCE;
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull b bVar) {
            Collection<KotlinType> collectionFindLoopsInSupertypesAndDisconnect = AbstractTypeConstructor.this.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(AbstractTypeConstructor.this, bVar.a(), new c(AbstractTypeConstructor.this), new d(AbstractTypeConstructor.this));
            if (collectionFindLoopsInSupertypesAndDisconnect.isEmpty()) {
                KotlinType kotlinTypeDefaultSupertypeIfEmpty = AbstractTypeConstructor.this.defaultSupertypeIfEmpty();
                collectionFindLoopsInSupertypesAndDisconnect = kotlinTypeDefaultSupertypeIfEmpty == null ? null : kotlin.collections.e.listOf(kotlinTypeDefaultSupertypeIfEmpty);
                if (collectionFindLoopsInSupertypesAndDisconnect == null) {
                    collectionFindLoopsInSupertypesAndDisconnect = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            if (AbstractTypeConstructor.this.getShouldReportCyclicScopeWithCompanionWarning()) {
                SupertypeLoopChecker supertypeLoopChecker = AbstractTypeConstructor.this.getSupertypeLoopChecker();
                AbstractTypeConstructor abstractTypeConstructor = AbstractTypeConstructor.this;
                supertypeLoopChecker.findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, collectionFindLoopsInSupertypesAndDisconnect, new a(abstractTypeConstructor), new b(AbstractTypeConstructor.this));
            }
            AbstractTypeConstructor abstractTypeConstructor2 = AbstractTypeConstructor.this;
            List<KotlinType> list = collectionFindLoopsInSupertypesAndDisconnect instanceof List ? (List) collectionFindLoopsInSupertypesAndDisconnect : null;
            if (list == null) {
                list = CollectionsKt___CollectionsKt.toList(collectionFindLoopsInSupertypesAndDisconnect);
            }
            bVar.c(abstractTypeConstructor2.processSupertypesWithoutCycles(list));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            a(bVar);
            return Unit.INSTANCE;
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        this.b = storageManager.createLazyValueWithPostCompute(new c(), d.a, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<KotlinType> b(TypeConstructor typeConstructor, boolean z) {
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        List listPlus = abstractTypeConstructor != null ? CollectionsKt___CollectionsKt.plus((Collection) abstractTypeConstructor.b.invoke().a(), (Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z)) : null;
        return listPlus == null ? typeConstructor.getSupertypes() : listPlus;
    }

    @NotNull
    public abstract Collection<KotlinType> computeSupertypes();

    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.c;
    }

    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    @NotNull
    public List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> list) {
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        return new a(kotlinTypeRefiner);
    }

    public void reportScopesLoopError(@NotNull KotlinType kotlinType) {
    }

    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<KotlinType> getSupertypes() {
        return this.b.invoke().b();
    }
}
