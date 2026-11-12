package kotlin.reflect.jvm.internal.impl.load.java;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.y;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class SpecialGenericSignatures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<Companion.NameAndSignature> a;

    @NotNull
    private static final List<String> b;

    @NotNull
    private static final List<String> c;

    @NotNull
    private static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> d;

    @NotNull
    private static final Map<String, TypeSafeBarrierDescription> e;

    @NotNull
    private static final Set<Name> f;

    @NotNull
    private static final Set<String> g;

    @NotNull
    private static final Companion.NameAndSignature h;

    @NotNull
    private static final Map<Companion.NameAndSignature, Name> i;

    @NotNull
    private static final Map<String, Name> j;

    @NotNull
    private static final List<Name> k;

    @NotNull
    private static final Map<Name, List<Name>> l;

    public static final class Companion {

        public static final class NameAndSignature {

            @NotNull
            private final Name a;

            @NotNull
            private final String b;

            public NameAndSignature(@NotNull Name name, @NotNull String str) {
                this.a = name;
                this.b = str;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.areEqual(this.a, nameAndSignature.a) && Intrinsics.areEqual(this.b, nameAndSignature.b);
            }

            @NotNull
            public final Name getName() {
                return this.a;
            }

            @NotNull
            public final String getSignature() {
                return this.b;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            @NotNull
            public String toString() {
                return "NameAndSignature(name=" + this.a + ", signature=" + this.b + ')';
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NameAndSignature a(String str, String str2, String str3, String str4) {
            return new NameAndSignature(Name.identifier(str2), SignatureBuildingComponents.INSTANCE.signature(str, str2 + '(' + str3 + ')' + str4));
        }

        @NotNull
        public final List<Name> getBuiltinFunctionNamesByJvmName(@NotNull Name name) {
            List<Name> list = getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }

        @NotNull
        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.b;
        }

        @NotNull
        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.f;
        }

        @NotNull
        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.g;
        }

        @NotNull
        public final Map<Name, List<Name>> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.l;
        }

        @NotNull
        public final List<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.k;
        }

        @NotNull
        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.h;
        }

        @NotNull
        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.e;
        }

        @NotNull
        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.j;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name) {
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        @NotNull
        public final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull String str) {
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(str)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) MapsKt.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), str)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private final boolean isObjectReplacedWithTypeParameter;

        @Nullable
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {

        @Nullable
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES = a();

        public static final class a extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(String str, int i) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        private TypeSafeBarrierDescription(String str, int i, Object obj) {
            super(str, i);
            this.defaultValue = obj;
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] a() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }
    }

    static {
        Set of = y.setOf((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10));
        Iterator it2 = of.iterator();
        while (it2.hasNext()) {
            arrayList.add(Companion.a("java/util/Collection", (String) it2.next(), "Ljava/util/Collection;", JvmPrimitiveType.BOOLEAN.getDesc()));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it3.next()).getSignature());
        }
        b = arrayList2;
        List<Companion.NameAndSignature> list = a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it4.next()).getName().asString());
        }
        c = arrayList3;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion = Companion;
        String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        Companion.NameAndSignature nameAndSignatureA = companion.a(strJavaUtil, SearchCriteria.CONTAINS, "Ljava/lang/Object;", jvmPrimitiveType.getDesc());
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Companion.NameAndSignature nameAndSignatureA2 = companion.a(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        Companion.NameAndSignature nameAndSignatureA3 = companion.a(strJavaUtil2, "indexOf", "Ljava/lang/Object;", jvmPrimitiveType2.getDesc());
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapMapOf = r.mapOf(TuplesKt.to(nameAndSignatureA, typeSafeBarrierDescription), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil("Collection"), "remove", "Ljava/lang/Object;", jvmPrimitiveType.getDesc()), typeSafeBarrierDescription), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME), "containsKey", "Ljava/lang/Object;", jvmPrimitiveType.getDesc()), typeSafeBarrierDescription), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME), "containsValue", "Ljava/lang/Object;", jvmPrimitiveType.getDesc()), typeSafeBarrierDescription), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME), "remove", "Ljava/lang/Object;Ljava/lang/Object;", jvmPrimitiveType.getDesc()), typeSafeBarrierDescription), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), TuplesKt.to(nameAndSignatureA2, typeSafeBarrierDescription2), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil(AIApiConstants.Map.NAME), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), TuplesKt.to(nameAndSignatureA3, typeSafeBarrierDescription3), TuplesKt.to(companion.a(signatureBuildingComponents.javaUtil("List"), "lastIndexOf", "Ljava/lang/Object;", jvmPrimitiveType2.getDesc()), typeSafeBarrierDescription3));
        d = mapMapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(mapMapOf.size()));
        Iterator<T> it5 = mapMapOf.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry = (Map.Entry) it5.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        e = linkedHashMap;
        Set setPlus = z.plus((Set) d.keySet(), (Iterable) a);
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it6 = setPlus.iterator();
        while (it6.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it6.next()).getName());
        }
        f = CollectionsKt___CollectionsKt.toSet(arrayList4);
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it7 = setPlus.iterator();
        while (it7.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it7.next()).getSignature());
        }
        g = CollectionsKt___CollectionsKt.toSet(arrayList5);
        Companion companion2 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        Companion.NameAndSignature nameAndSignatureA4 = companion2.a("java/util/List", "removeAt", jvmPrimitiveType3.getDesc(), "Ljava/lang/Object;");
        h = nameAndSignatureA4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        Map<Companion.NameAndSignature, Name> mapMapOf2 = r.mapOf(TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang(StatEvent.Key.NUMBER), "toByte", "", JvmPrimitiveType.BYTE.getDesc()), Name.identifier("byteValue")), TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang(StatEvent.Key.NUMBER), "toShort", "", JvmPrimitiveType.SHORT.getDesc()), Name.identifier("shortValue")), TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang(StatEvent.Key.NUMBER), "toInt", "", jvmPrimitiveType3.getDesc()), Name.identifier("intValue")), TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang(StatEvent.Key.NUMBER), "toLong", "", JvmPrimitiveType.LONG.getDesc()), Name.identifier("longValue")), TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang(StatEvent.Key.NUMBER), "toFloat", "", JvmPrimitiveType.FLOAT.getDesc()), Name.identifier("floatValue")), TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang(StatEvent.Key.NUMBER), "toDouble", "", JvmPrimitiveType.DOUBLE.getDesc()), Name.identifier("doubleValue")), TuplesKt.to(nameAndSignatureA4, Name.identifier("remove")), TuplesKt.to(companion2.a(signatureBuildingComponents2.javaLang("CharSequence"), "get", jvmPrimitiveType3.getDesc(), JvmPrimitiveType.CHAR.getDesc()), Name.identifier("charAt")));
        i = mapMapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q.mapCapacity(mapMapOf2.size()));
        Iterator<T> it8 = mapMapOf2.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it8.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        j = linkedHashMap2;
        Set<Companion.NameAndSignature> setKeySet = i.keySet();
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it9 = setKeySet.iterator();
        while (it9.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it9.next()).getName());
        }
        k = arrayList6;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = i.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it10 = setEntrySet.iterator();
        while (it10.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it10.next();
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry3.getKey()).getName(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Pair pair : arrayList7) {
            Name name = (Name) pair.getSecond();
            Object arrayList8 = linkedHashMap3.get(name);
            if (arrayList8 == null) {
                arrayList8 = new ArrayList();
                linkedHashMap3.put(name, arrayList8);
            }
            ((List) arrayList8).add((Name) pair.getFirst());
        }
        l = linkedHashMap3;
    }
}
