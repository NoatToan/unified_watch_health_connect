package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class SubstitutingScope implements MemberScope {

    @NotNull
    private final MemberScope a;

    @NotNull
    private final TypeSubstitutor b;

    @Nullable
    private Map<DeclarationDescriptor, DeclarationDescriptor> c;

    @NotNull
    private final Lazy d = LazyKt__LazyJVMKt.lazy(new a());

    public static final class a extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<DeclarationDescriptor> invoke() {
            SubstitutingScope substitutingScope = SubstitutingScope.this;
            return substitutingScope.b(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.a, null, null, 3, null));
        }
    }

    public SubstitutingScope(@NotNull MemberScope memberScope, @NotNull TypeSubstitutor typeSubstitutor) {
        this.a = memberScope;
        this.b = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(typeSubstitutor.getSubstitution(), false, 1, null).buildSubstitutor();
    }

    private final Collection<DeclarationDescriptor> a() {
        return (Collection) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends DeclarationDescriptor> Collection<D> b(Collection<? extends D> collection) {
        if (this.b.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(c((DeclarationDescriptor) it2.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }

    private final <D extends DeclarationDescriptor> D c(D d) {
        if (this.b.isEmpty()) {
            return d;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.c;
        DeclarationDescriptor declarationDescriptorSubstitute = map.get(d);
        if (declarationDescriptorSubstitute == null) {
            if (!(d instanceof Substitutable)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Unknown descriptor in scope: ", d).toString());
            }
            declarationDescriptorSubstitute = ((Substitutable) d).substitute(this.b);
            if (declarationDescriptorSubstitute == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            map.put(d, declarationDescriptorSubstitute);
        }
        return (D) declarationDescriptorSubstitute;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return this.a.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4299getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier = this.a.mo4299getContributedClassifier(name, lookupLocation);
        if (classifierDescriptorMo4299getContributedClassifier == null) {
            return null;
        }
        return (ClassifierDescriptor) c(classifierDescriptorMo4299getContributedClassifier);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        return a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return b(this.a.getContributedFunctions(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return b(this.a.getContributedVariables(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.a.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.a.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }
}
