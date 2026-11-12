package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BuiltinSpecialProperties {

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    @NotNull
    private static final Map<FqName, Name> a;

    @NotNull
    private static final Map<Name, List<Name>> b;

    @NotNull
    private static final Set<FqName> c;

    @NotNull
    private static final Set<Name> d;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        FqName fqName = StandardNames.FqNames.map;
        Map<FqName, Name> mapMapOf = r.mapOf(TuplesKt.to(BuiltinSpecialPropertiesKt.b(fqNameUnsafe, "name"), Name.identifier("name")), TuplesKt.to(BuiltinSpecialPropertiesKt.b(fqNameUnsafe, "ordinal"), Name.identifier("ordinal")), TuplesKt.to(BuiltinSpecialPropertiesKt.a(StandardNames.FqNames.collection, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.a(fqName, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.b(StandardNames.FqNames.charSequence, SessionDescription.p), Name.identifier(SessionDescription.p)), TuplesKt.to(BuiltinSpecialPropertiesKt.a(fqName, "keys"), Name.identifier("keySet")), TuplesKt.to(BuiltinSpecialPropertiesKt.a(fqName, "values"), Name.identifier("values")), TuplesKt.to(BuiltinSpecialPropertiesKt.a(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES), Name.identifier("entrySet")));
        a = mapMapOf;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapMapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.getSecond();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt___CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Set<FqName> setKeySet = a.keySet();
        c = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((FqName) it3.next()).shortName());
        }
        d = CollectionsKt___CollectionsKt.toSet(arrayList3);
    }

    private BuiltinSpecialProperties() {
    }

    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return a;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name) {
        List<Name> list = b.get(name);
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return c;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return d;
    }
}
