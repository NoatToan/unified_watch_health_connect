package androidx.collection;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001EB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bJ\u0006\u0010\f\u001a\u00020\tJS\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u000028\u0010\u000f\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00010\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0018J'\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010!\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0086\nJ\u0017\u0010!\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\nJ\u001e\u0010!\u001a\u00020\t2\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000&H\u0086\n¢\u0006\u0002\u0010'J\u0017\u0010!\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\nJ\u0017\u0010!\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0086\nJ\u001d\u0010*\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\nJ*\u0010*\u001a\u00020\t2\u001a\u0010,\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0&H\u0086\n¢\u0006\u0002\u0010.J\u001d\u0010*\u001a\u00020\t2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0086\nJ#\u0010*\u001a\u00020\t2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0(H\u0086\nJ\u001d\u0010*\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0086\nJ#\u0010*\u001a\u00020\t2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0)H\u0086\nJ\u001d\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0002\u00102J\u001a\u00103\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J'\u00103\u001a\u00020\t2\u001a\u0010,\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0&¢\u0006\u0002\u0010.J \u00103\u001a\u00020\t2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0(J\u001a\u00103\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100J \u00103\u001a\u00020\t2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0)J\u0015\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u00105J\u001b\u00104\u001a\u0002062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0002\u00107J\b\u00108\u001a\u00020\tH\u0002J&\u00109\u001a\u00020\t2\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002060\u0010H\u0086\bø\u0001\u0000J\u0017\u0010;\u001a\u0004\u0018\u00018\u00012\u0006\u0010<\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u001e\u0010@\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020\u0005J\u0019\u0010C\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020DH\u0082\bR\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "asMutableMap", "", CervicalMucusRecord.Appearance.CLEAR, "compute", "key", "computeBlock", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "findFirstAvailableSlot", "hash1", "findInsertIndex", "(Ljava/lang/Object;)I", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "pair", "", LifecycleConstantKt.ACTION_PUT, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeDeletedMarkers", "removeIf", "predicate", "removeValueAt", "index", "(I)Ljava/lang/Object;", "resizeStorage", "newCapacity", CourseConfigModel.DevCmd.CMD_ACTION_SET, "(Ljava/lang/Object;Ljava/lang/Object;)V", "trim", "writeMetadata", "", "MutableMapWrapper", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1850:1\n1284#1,2:2019\n1288#1,5:2027\n1284#1,2:2058\n1288#1,5:2066\n1284#1,2:2083\n1288#1,5:2091\n1284#1,2:2097\n1288#1,5:2105\n1#2:1851\n1672#3,6:1852\n1826#3:1870\n1688#3:1874\n1605#3,3:1887\n1619#3:1891\n1615#3:1894\n1795#3,3:1899\n1809#3,3:1903\n1733#3:1907\n1721#3:1909\n1715#3:1910\n1728#3:1915\n1818#3:1917\n1605#3,3:1927\n1619#3:1931\n1615#3:1934\n1795#3,3:1939\n1809#3,3:1943\n1733#3:1947\n1721#3:1949\n1715#3:1950\n1728#3:1955\n1818#3:1957\n1826#3:1972\n1688#3:1976\n1826#3:1997\n1688#3:2001\n1672#3,6:2021\n1672#3,6:2032\n1605#3,3:2038\n1615#3:2041\n1619#3:2042\n1795#3,3:2043\n1809#3,3:2046\n1733#3:2049\n1721#3:2050\n1715#3:2051\n1728#3:2052\n1818#3:2053\n1682#3:2054\n1661#3:2055\n1680#3:2056\n1661#3:2057\n1672#3,6:2060\n1795#3,3:2071\n1826#3:2074\n1715#3:2075\n1685#3:2076\n1661#3:2077\n1605#3,3:2078\n1615#3:2081\n1619#3:2082\n1672#3,6:2085\n1661#3:2096\n1672#3,6:2099\n1672#3,6:2110\n1672#3,6:2116\n215#4,2:1858\n391#5,4:1860\n363#5,6:1864\n373#5,3:1871\n376#5,2:1875\n396#5,2:1877\n379#5,6:1879\n398#5:1885\n633#5:1886\n634#5:1890\n636#5,2:1892\n638#5,4:1895\n642#5:1902\n643#5:1906\n644#5:1908\n645#5,4:1911\n651#5:1916\n652#5,8:1918\n633#5:1926\n634#5:1930\n636#5,2:1932\n638#5,4:1935\n642#5:1942\n643#5:1946\n644#5:1948\n645#5,4:1951\n651#5:1956\n652#5,8:1958\n363#5,6:1966\n373#5,3:1973\n376#5,9:1977\n267#6,4:1986\n237#6,7:1990\n248#6,3:1998\n251#6,2:2002\n272#6,2:2004\n254#6,6:2006\n274#6:2012\n305#7,6:2013\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2019,2\n1113#1:2027,5\n1180#1:2058,2\n1180#1:2066,5\n1254#1:2083,2\n1254#1:2091,5\n1270#1:2097,2\n1270#1:2105,5\n848#1:1852,6\n972#1:1870\n972#1:1874\n1021#1:1887,3\n1021#1:1891\n1021#1:1894\n1021#1:1899,3\n1021#1:1903,3\n1021#1:1907\n1021#1:1909\n1021#1:1910\n1021#1:1915\n1021#1:1917\n1033#1:1927,3\n1033#1:1931\n1033#1:1934\n1033#1:1939,3\n1033#1:1943,3\n1033#1:1947\n1033#1:1949\n1033#1:1950\n1033#1:1955\n1033#1:1957\n1047#1:1972\n1047#1:1976\n1093#1:1997\n1093#1:2001\n1113#1:2021,6\n1129#1:2032,6\n1145#1:2038,3\n1146#1:2041\n1147#1:2042\n1154#1:2043,3\n1155#1:2046,3\n1156#1:2049\n1157#1:2050\n1157#1:2051\n1161#1:2052\n1164#1:2053\n1173#1:2054\n1173#1:2055\n1179#1:2056\n1179#1:2057\n1180#1:2060,6\n1195#1:2071,3\n1196#1:2074\n1198#1:2075\n1249#1:2076\n1249#1:2077\n1251#1:2078,3\n1252#1:2081\n1254#1:2082\n1254#1:2085,6\n1268#1:2096\n1270#1:2099,6\n1285#1:2110,6\n1291#1:2116,6\n963#1:1858,2\n972#1:1860,4\n972#1:1864,6\n972#1:1871,3\n972#1:1875,2\n972#1:1877,2\n972#1:1879,6\n972#1:1885\n1021#1:1886\n1021#1:1890\n1021#1:1892,2\n1021#1:1895,4\n1021#1:1902\n1021#1:1906\n1021#1:1908\n1021#1:1911,4\n1021#1:1916\n1021#1:1918,8\n1033#1:1926\n1033#1:1930\n1033#1:1932,2\n1033#1:1935,4\n1033#1:1942\n1033#1:1946\n1033#1:1948\n1033#1:1951,4\n1033#1:1956\n1033#1:1958,8\n1047#1:1966,6\n1047#1:1973,3\n1047#1:1977,9\n1093#1:1986,4\n1093#1:1990,7\n1093#1:1998,3\n1093#1:2002,2\n1093#1:2004,2\n1093#1:2006,6\n1093#1:2012\n1102#1:2013,6\n*E\n"})
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001f\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00112\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aR&\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Landroidx/collection/MutableScatterMap$MutableMapWrapper;", "Landroidx/collection/ScatterMap$MapWrapper;", "Landroidx/collection/ScatterMap;", "", "(Landroidx/collection/MutableScatterMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", Constants.KEY_RECHARGE_VALUES, "", "getValues", "()Ljava/util/Collection;", CervicalMucusRecord.Appearance.CLEAR, "", LifecycleConstantKt.ACTION_PUT, "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1850:1\n215#2,2:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1590#1:1851,2\n*E\n"})
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, KMutableMap {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @Nullable
        public V put(K key, V value) {
            return MutableScatterMap.this.put(key, value);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(@NotNull Map<? extends K, ? extends V> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @Nullable
        public V remove(Object key) {
            return MutableScatterMap.this.remove(key);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this._capacity <= 8 || Long.compareUnsigned(ULong.m1060constructorimpl(ULong.m1060constructorimpl(this._size) * 32), ULong.m1060constructorimpl(ULong.m1060constructorimpl(this._capacity) * 25)) > 0) {
            resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            resizeStorage(this._capacity);
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new Object[iMax];
        this.values = new Object[iMax];
    }

    private final void removeDeletedMarkers() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 >> 3;
            int i5 = (i3 & 7) << 3;
            if (((jArr[i4] >> i5) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i4] = (128 << i5) | (jArr2[i4] & (~(255 << i5)));
                int i6 = this._capacity;
                int i7 = ((i3 - 7) & i6) + (i6 & 7);
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                jArr2[i8] = ((~(255 << i9)) & jArr2[i8]) | (128 << i9);
                i2++;
            }
        }
        this.growthLimit += i2;
    }

    private final void resizeStorage(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i2 = this._capacity;
        initializeStorage(newCapacity);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i4 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4 >>> 7);
                long j = i4 & 127;
                long[] jArr2 = this.metadata;
                int i5 = iFindFirstAvailableSlot >> 3;
                int i6 = (iFindFirstAvailableSlot & 7) << 3;
                i = i3;
                jArr2[i5] = (jArr2[i5] & (~(255 << i6))) | (j << i6);
                int i7 = this._capacity;
                int i8 = ((iFindFirstAvailableSlot - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr2[i9] = (jArr2[i9] & (~(255 << i10))) | (j << i10);
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i];
            } else {
                i = i3;
            }
            i3 = i + 1;
        }
    }

    private final void writeMetadata(int index, long value) {
        long[] jArr = this.metadata;
        int i = index >> 3;
        int i2 = (index & 7) << 3;
        jArr[i] = (jArr[i] & (~(255 << i2))) | (value << i2);
        int i3 = this._capacity;
        int i4 = ((index - 7) & i3) + (i3 & 7);
        int i5 = i4 >> 3;
        int i6 = (i4 & 7) << 3;
        jArr[i5] = (value << i6) | (jArr[i5] & (~(255 << i6)));
    }

    @NotNull
    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt___ArraysJvmKt.fill(this.values, (Object) null, 0, this._capacity);
        ArraysKt___ArraysJvmKt.fill(this.keys, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K key, @NotNull Function2<? super K, ? super V, ? extends V> computeBlock) {
        Intrinsics.checkNotNullParameter(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(key);
        boolean z = iFindInsertIndex < 0;
        V vInvoke = computeBlock.invoke(key, z ? null : this.values[iFindInsertIndex]);
        if (z) {
            int i = ~iFindInsertIndex;
            this.keys[i] = key;
            this.values[i] = vInvoke;
        } else {
            this.values[iFindInsertIndex] = vInvoke;
        }
        return vInvoke;
    }

    @PublishedApi
    public final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j5 & (~(255 << i12))) | (j2 << i12);
                int i13 = this._capacity;
                int i14 = ((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return ~iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final V getOrPut(K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = get(key);
        if (v != null) {
            return v;
        }
        V vInvoke = defaultValue.invoke();
        set(key, vInvoke);
        return vInvoke;
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    @Nullable
    public final V put(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = key;
        objArr[iFindInsertIndex] = value;
        return v;
    }

    public final void putAll(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    @Nullable
    public final V remove(K key) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return removeValueAt(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void removeIf(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (predicate.invoke(this.keys[i4], this.values[i4]).booleanValue()) {
                            removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @PublishedApi
    @Nullable
    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = index >> 3;
        int i2 = (index & 7) << 3;
        jArr[i] = (jArr[i] & (~(255 << i2))) | (254 << i2);
        int i3 = this._capacity;
        int i4 = ((index - 7) & i3) + (i3 & 7);
        int i5 = i4 >> 3;
        int i6 = (i4 & 7) << 3;
        jArr[i5] = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[index];
        objArr[index] = null;
        return v;
    }

    public final void set(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final int trim() {
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k2 : keys) {
            remove(k2);
        }
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean remove(K key, V value) {
        int iNumberOfTrailingZeros;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.values[iNumberOfTrailingZeros], value)) {
            return false;
        }
        removeValueAt(iNumberOfTrailingZeros);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(objArr[i4], objArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }
}
