package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty<Object>[] e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    @NotNull
    private final DeserializationContext a;

    @NotNull
    private final a b;

    @NotNull
    private final NotNullLazyValue c;

    @NotNull
    private final NullableLazyValue d;

    public final class OptimizedImplementation implements a {
        public static final /* synthetic */ KProperty<Object>[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        @NotNull
        private final Map<Name, byte[]> a;

        @NotNull
        private final Map<Name, byte[]> b;

        @NotNull
        private final Map<Name, byte[]> c;

        @NotNull
        private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> d;

        @NotNull
        private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> e;

        @NotNull
        private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f;

        @NotNull
        private final NotNullLazyValue g;

        @NotNull
        private final NotNullLazyValue h;

        public static final class a extends Lambda implements Function0<Set<? extends Name>> {
            public final /* synthetic */ DeserializedMemberScope b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.b = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                return z.plus((Set) OptimizedImplementation.this.a.keySet(), (Iterable) this.b.getNonDeclaredFunctionNames());
            }
        }

        public static final class b extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
                return OptimizedImplementation.this.i(name);
            }
        }

        public static final class c extends Lambda implements Function1<Name, Collection<? extends PropertyDescriptor>> {
            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<PropertyDescriptor> invoke(@NotNull Name name) {
                return OptimizedImplementation.this.j(name);
            }
        }

        public static final class d extends Lambda implements Function1<Name, TypeAliasDescriptor> {
            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TypeAliasDescriptor invoke(@NotNull Name name) {
                return OptimizedImplementation.this.k(name);
            }
        }

        public static final class e extends Lambda implements Function0<Set<? extends Name>> {
            public final /* synthetic */ DeserializedMemberScope b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.b = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                return z.plus((Set) OptimizedImplementation.this.b.keySet(), (Iterable) this.b.getNonDeclaredVariableNames());
            }
        }

        public OptimizedImplementation(@NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) throws IOException {
            Map<Name, byte[]> mapEmptyMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Name name = NameResolverUtilKt.getName(DeserializedMemberScope.this.a.getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.a = l(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope.a.getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(name2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(name2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.b = l(linkedHashMap2);
            if (DeserializedMemberScope.this.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                DeserializedMemberScope deserializedMemberScope2 = DeserializedMemberScope.this;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    Name name3 = NameResolverUtilKt.getName(deserializedMemberScope2.a.getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(name3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(name3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapEmptyMap = l(linkedHashMap3);
            } else {
                mapEmptyMap = r.emptyMap();
            }
            this.c = mapEmptyMap;
            this.d = DeserializedMemberScope.this.getC().getStorageManager().createMemoizedFunction(new b());
            this.e = DeserializedMemberScope.this.getC().getStorageManager().createMemoizedFunction(new c());
            this.f = DeserializedMemberScope.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new d());
            this.g = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new a(DeserializedMemberScope.this));
            this.h = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new e(DeserializedMemberScope.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<SimpleFunctionDescriptor> i(Name name) {
            List list;
            Map<Name, byte[]> map = this.a;
            Parser<ProtoBuf.Function> parser = ProtoBuf.Function.PARSER;
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            byte[] bArr = map.get(name);
            if (bArr == null) {
                list = null;
            } else {
                list = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(parser, new ByteArrayInputStream(bArr), DeserializedMemberScope.this)));
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) it2.next());
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList);
            return CollectionsKt.compact(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<PropertyDescriptor> j(Name name) {
            List list;
            Map<Name, byte[]> map = this.b;
            Parser<ProtoBuf.Property> parser = ProtoBuf.Property.PARSER;
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            byte[] bArr = map.get(name);
            if (bArr == null) {
                list = null;
            } else {
                list = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(parser, new ByteArrayInputStream(bArr), DeserializedMemberScope.this)));
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PropertyDescriptor propertyDescriptorLoadProperty = deserializedMemberScope.getC().getMemberDeserializer().loadProperty((ProtoBuf.Property) it2.next());
                if (propertyDescriptorLoadProperty != null) {
                    arrayList.add(propertyDescriptorLoadProperty);
                }
            }
            deserializedMemberScope.computeNonDeclaredProperties(name, arrayList);
            return CollectionsKt.compact(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TypeAliasDescriptor k(Name name) {
            ProtoBuf.TypeAlias delimitedFrom;
            byte[] bArr = this.c.get(name);
            if (bArr == null || (delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), DeserializedMemberScope.this.getC().getComponents().getExtensionRegistryLite())) == null) {
                return null;
            }
            return DeserializedMemberScope.this.getC().getMemberDeserializer().loadTypeAlias(delimitedFrom);
        }

        private final Map<Name, byte[]> l(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    ((AbstractMessageLite) it3.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void a(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                Set<Name> variableNames = getVariableNames();
                ArrayList arrayList = new ArrayList();
                for (Name name : variableNames) {
                    if (function1.invoke(name).booleanValue()) {
                        arrayList.addAll(getContributedVariables(name, lookupLocation));
                    }
                }
                g.sortWith(arrayList, MemberComparator.NameAndTypeMemberComparator.INSTANCE);
                collection.addAll(arrayList);
            }
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                Set<Name> functionNames = getFunctionNames();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : functionNames) {
                    if (function1.invoke(name2).booleanValue()) {
                        arrayList2.addAll(getContributedFunctions(name2, lookupLocation));
                    }
                }
                g.sortWith(arrayList2, MemberComparator.NameAndTypeMemberComparator.INSTANCE);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @Nullable
        public TypeAliasDescriptor b(@NotNull Name name) {
            return this.f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> c() {
            return this.c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return !getFunctionNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return !getVariableNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.g, this, (KProperty<?>) j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.h, this, (KProperty<?>) j[1]);
        }
    }

    public interface a {
        void a(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation);

        @Nullable
        TypeAliasDescriptor b(@NotNull Name name);

        @NotNull
        Set<Name> c();

        @NotNull
        Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        Set<Name> getFunctionNames();

        @NotNull
        Set<Name> getVariableNames();
    }

    public final class b implements a {
        public static final /* synthetic */ KProperty<Object>[] o = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        @NotNull
        private final List<ProtoBuf.Function> a;

        @NotNull
        private final List<ProtoBuf.Property> b;

        @NotNull
        private final List<ProtoBuf.TypeAlias> c;

        @NotNull
        private final NotNullLazyValue d;

        @NotNull
        private final NotNullLazyValue e;

        @NotNull
        private final NotNullLazyValue f;

        @NotNull
        private final NotNullLazyValue g;

        @NotNull
        private final NotNullLazyValue h;

        @NotNull
        private final NotNullLazyValue i;

        @NotNull
        private final NotNullLazyValue j;

        @NotNull
        private final NotNullLazyValue k;

        @NotNull
        private final NotNullLazyValue l;

        @NotNull
        private final NotNullLazyValue m;

        public static final class a extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends SimpleFunctionDescriptor> invoke() {
                return CollectionsKt___CollectionsKt.plus((Collection) b.this.z(), (Iterable) b.this.p());
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$b$b, reason: collision with other inner class name */
        public static final class C1177b extends Lambda implements Function0<List<? extends PropertyDescriptor>> {
            public C1177b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends PropertyDescriptor> invoke() {
                return CollectionsKt___CollectionsKt.plus((Collection) b.this.A(), (Iterable) b.this.q());
            }
        }

        public static final class c extends Lambda implements Function0<List<? extends TypeAliasDescriptor>> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends TypeAliasDescriptor> invoke() {
                return b.this.v();
            }
        }

        public static final class d extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends SimpleFunctionDescriptor> invoke() {
                return b.this.r();
            }
        }

        public static final class e extends Lambda implements Function0<List<? extends PropertyDescriptor>> {
            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends PropertyDescriptor> invoke() {
                return b.this.u();
            }
        }

        public static final class f extends Lambda implements Function0<Set<? extends Name>> {
            public final /* synthetic */ DeserializedMemberScope b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.b = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                b bVar = b.this;
                List list = bVar.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.a.getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it2.next())).getName()));
                }
                return z.plus((Set) linkedHashSet, (Iterable) this.b.getNonDeclaredFunctionNames());
            }
        }

        public static final class g extends Lambda implements Function0<Map<Name, ? extends List<? extends SimpleFunctionDescriptor>>> {
            public g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Name, ? extends List<? extends SimpleFunctionDescriptor>> invoke() {
                List listW = b.this.w();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listW) {
                    Name name = ((SimpleFunctionDescriptor) obj).getName();
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        public static final class h extends Lambda implements Function0<Map<Name, ? extends List<? extends PropertyDescriptor>>> {
            public h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Name, ? extends List<? extends PropertyDescriptor>> invoke() {
                List listX = b.this.x();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listX) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        public static final class i extends Lambda implements Function0<Map<Name, ? extends TypeAliasDescriptor>> {
            public i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Name, ? extends TypeAliasDescriptor> invoke() {
                List listY = b.this.y();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listY, 10)), 16));
                for (Object obj : listY) {
                    linkedHashMap.put(((TypeAliasDescriptor) obj).getName(), obj);
                }
                return linkedHashMap;
            }
        }

        public static final class j extends Lambda implements Function0<Set<? extends Name>> {
            public final /* synthetic */ DeserializedMemberScope b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.b = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                b bVar = b.this;
                List list = bVar.b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.a.getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it2.next())).getName()));
                }
                return z.plus((Set) linkedHashSet, (Iterable) this.b.getNonDeclaredVariableNames());
            }
        }

        public b(@NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
            this.a = list;
            this.b = list2;
            this.c = DeserializedMemberScope.this.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? list3 : CollectionsKt__CollectionsKt.emptyList();
            this.d = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new d());
            this.e = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new e());
            this.f = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new c());
            this.g = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new a());
            this.h = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new C1177b());
            this.i = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new i());
            this.j = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new g());
            this.k = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new h());
            this.l = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new f(DeserializedMemberScope.this));
            this.m = DeserializedMemberScope.this.getC().getStorageManager().createLazyValue(new j(DeserializedMemberScope.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> A() {
            return (List) StorageKt.getValue(this.e, this, (KProperty<?>) o[1]);
        }

        private final Map<Name, Collection<SimpleFunctionDescriptor>> B() {
            return (Map) StorageKt.getValue(this.j, this, (KProperty<?>) o[6]);
        }

        private final Map<Name, Collection<PropertyDescriptor>> C() {
            return (Map) StorageKt.getValue(this.k, this, (KProperty<?>) o[7]);
        }

        private final Map<Name, TypeAliasDescriptor> D() {
            return (Map) StorageKt.getValue(this.i, this, (KProperty<?>) o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> p() {
            Set<Name> nonDeclaredFunctionNames = DeserializedMemberScope.this.getNonDeclaredFunctionNames();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = nonDeclaredFunctionNames.iterator();
            while (it2.hasNext()) {
                kotlin.collections.h.addAll(arrayList, s((Name) it2.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> q() {
            Set<Name> nonDeclaredVariableNames = DeserializedMemberScope.this.getNonDeclaredVariableNames();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = nonDeclaredVariableNames.iterator();
            while (it2.hasNext()) {
                kotlin.collections.h.addAll(arrayList, t((Name) it2.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> r() {
            List<ProtoBuf.Function> list = this.a;
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.a.getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it2.next()));
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            return arrayList;
        }

        private final List<SimpleFunctionDescriptor> s(Name name) {
            List<SimpleFunctionDescriptor> listZ = z();
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listZ) {
                if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<PropertyDescriptor> t(Name name) {
            List<PropertyDescriptor> listA = A();
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.computeNonDeclaredProperties(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> u() {
            List<ProtoBuf.Property> list = this.b;
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                PropertyDescriptor propertyDescriptorLoadProperty = deserializedMemberScope.a.getMemberDeserializer().loadProperty((ProtoBuf.Property) ((MessageLite) it2.next()));
                if (propertyDescriptorLoadProperty != null) {
                    arrayList.add(propertyDescriptorLoadProperty);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<TypeAliasDescriptor> v() {
            List<ProtoBuf.TypeAlias> list = this.c;
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorLoadTypeAlias = deserializedMemberScope.a.getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it2.next()));
                if (typeAliasDescriptorLoadTypeAlias != null) {
                    arrayList.add(typeAliasDescriptorLoadTypeAlias);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> w() {
            return (List) StorageKt.getValue(this.g, this, (KProperty<?>) o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> x() {
            return (List) StorageKt.getValue(this.h, this, (KProperty<?>) o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<TypeAliasDescriptor> y() {
            return (List) StorageKt.getValue(this.f, this, (KProperty<?>) o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> z() {
            return (List) StorageKt.getValue(this.d, this, (KProperty<?>) o[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void a(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                for (Object obj : x()) {
                    if (function1.invoke(((PropertyDescriptor) obj).getName()).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (Object obj2 : w()) {
                    if (function1.invoke(((SimpleFunctionDescriptor) obj2).getName()).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @Nullable
        public TypeAliasDescriptor b(@NotNull Name name) {
            return D().get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> c() {
            List<ProtoBuf.TypeAlias> list = this.c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.a.getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it2.next())).getName()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            Collection<SimpleFunctionDescriptor> collection;
            return (getFunctionNames().contains(name) && (collection = B().get(name)) != null) ? collection : CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            Collection<PropertyDescriptor> collection;
            return (getVariableNames().contains(name) && (collection = C().get(name)) != null) ? collection : CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.l, this, (KProperty<?>) o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.m, this, (KProperty<?>) o[9]);
        }
    }

    public static final class c extends Lambda implements Function0<Set<? extends Name>> {
        public final /* synthetic */ Function0<Collection<Name>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<? extends Collection<Name>> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return CollectionsKt___CollectionsKt.toSet(this.a.invoke());
        }
    }

    public static final class d extends Lambda implements Function0<Set<? extends Name>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Set<? extends Name> invoke() {
            Set<Name> nonDeclaredClassifierNames = DeserializedMemberScope.this.getNonDeclaredClassifierNames();
            if (nonDeclaredClassifierNames == null) {
                return null;
            }
            return z.plus((Set) z.plus((Set) DeserializedMemberScope.this.getClassNames$deserialization(), (Iterable) DeserializedMemberScope.this.b.c()), (Iterable) nonDeclaredClassifierNames);
        }
    }

    public DeserializedMemberScope(@NotNull DeserializationContext deserializationContext, @NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, @NotNull List<ProtoBuf.TypeAlias> list3, @NotNull Function0<? extends Collection<Name>> function0) {
        this.a = deserializationContext;
        this.b = a(list, list2, list3);
        this.c = deserializationContext.getStorageManager().createLazyValue(new c(function0));
        this.d = deserializationContext.getStorageManager().createNullableLazyValue(new d());
    }

    private final a a(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.a.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new b(list, list2, list3) : new OptimizedImplementation(list, list2, list3);
    }

    private final ClassDescriptor b(Name name) {
        return this.a.getComponents().deserializeClass(createClassId(name));
    }

    private final Set<Name> c() {
        return (Set) StorageKt.getValue(this.d, this, (KProperty<?>) e[1]);
    }

    private final TypeAliasDescriptor d(Name name) {
        return this.b.b(name);
    }

    public abstract void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    public final Collection<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (descriptorKindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, function1);
        }
        this.b.a(arrayList, descriptorKindFilter, function1, lookupLocation);
        if (descriptorKindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (function1.invoke(name).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, b(name));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : this.b.c()) {
                if (function1.invoke(name2).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, this.b.b(name2));
                }
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    public void computeNonDeclaredFunctions(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> list) {
    }

    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull List<PropertyDescriptor> list) {
    }

    @NotNull
    public abstract ClassId createClassId(@NotNull Name name);

    @NotNull
    public final DeserializationContext getC() {
        return this.a;
    }

    @NotNull
    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.c, this, (KProperty<?>) e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4299getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        if (hasClass(name)) {
            return b(name);
        }
        if (this.b.c().contains(name)) {
            return d(name);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return this.b.getContributedFunctions(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return this.b.getContributedVariables(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.b.getFunctionNames();
    }

    @Nullable
    public abstract Set<Name> getNonDeclaredClassifierNames();

    @NotNull
    public abstract Set<Name> getNonDeclaredFunctionNames();

    @NotNull
    public abstract Set<Name> getNonDeclaredVariableNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.b.getVariableNames();
    }

    public boolean hasClass(@NotNull Name name) {
        return getClassNames$deserialization().contains(name);
    }

    public boolean isDeclaredFunctionAvailable(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        return true;
    }
}
