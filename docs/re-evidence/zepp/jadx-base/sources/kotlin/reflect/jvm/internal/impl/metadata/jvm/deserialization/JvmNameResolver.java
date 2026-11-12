package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class JvmNameResolver implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String e;

    @NotNull
    private static final List<String> f;

    @NotNull
    private static final Map<String, Integer> g;

    @NotNull
    private final JvmProtoBuf.StringTableTypes a;

    @NotNull
    private final String[] b;

    @NotNull
    private final Set<Integer> c;

    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        e = strJoinToString$default;
        List<String> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{Intrinsics.stringPlus(strJoinToString$default, "/Any"), Intrinsics.stringPlus(strJoinToString$default, "/Nothing"), Intrinsics.stringPlus(strJoinToString$default, "/Unit"), Intrinsics.stringPlus(strJoinToString$default, "/Throwable"), Intrinsics.stringPlus(strJoinToString$default, "/Number"), Intrinsics.stringPlus(strJoinToString$default, "/Byte"), Intrinsics.stringPlus(strJoinToString$default, "/Double"), Intrinsics.stringPlus(strJoinToString$default, "/Float"), Intrinsics.stringPlus(strJoinToString$default, "/Int"), Intrinsics.stringPlus(strJoinToString$default, "/Long"), Intrinsics.stringPlus(strJoinToString$default, "/Short"), Intrinsics.stringPlus(strJoinToString$default, "/Boolean"), Intrinsics.stringPlus(strJoinToString$default, "/Char"), Intrinsics.stringPlus(strJoinToString$default, "/CharSequence"), Intrinsics.stringPlus(strJoinToString$default, "/String"), Intrinsics.stringPlus(strJoinToString$default, "/Comparable"), Intrinsics.stringPlus(strJoinToString$default, "/Enum"), Intrinsics.stringPlus(strJoinToString$default, "/Array"), Intrinsics.stringPlus(strJoinToString$default, "/ByteArray"), Intrinsics.stringPlus(strJoinToString$default, "/DoubleArray"), Intrinsics.stringPlus(strJoinToString$default, "/FloatArray"), Intrinsics.stringPlus(strJoinToString$default, "/IntArray"), Intrinsics.stringPlus(strJoinToString$default, "/LongArray"), Intrinsics.stringPlus(strJoinToString$default, "/ShortArray"), Intrinsics.stringPlus(strJoinToString$default, "/BooleanArray"), Intrinsics.stringPlus(strJoinToString$default, "/CharArray"), Intrinsics.stringPlus(strJoinToString$default, "/Cloneable"), Intrinsics.stringPlus(strJoinToString$default, "/Annotation"), Intrinsics.stringPlus(strJoinToString$default, "/collections/Iterable"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableIterable"), Intrinsics.stringPlus(strJoinToString$default, "/collections/Collection"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableCollection"), Intrinsics.stringPlus(strJoinToString$default, "/collections/List"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableList"), Intrinsics.stringPlus(strJoinToString$default, "/collections/Set"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableSet"), Intrinsics.stringPlus(strJoinToString$default, "/collections/Map"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableMap"), Intrinsics.stringPlus(strJoinToString$default, "/collections/Map.Entry"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableMap.MutableEntry"), Intrinsics.stringPlus(strJoinToString$default, "/collections/Iterator"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableIterator"), Intrinsics.stringPlus(strJoinToString$default, "/collections/ListIterator"), Intrinsics.stringPlus(strJoinToString$default, "/collections/MutableListIterator")});
        f = listListOf;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(listListOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        g = linkedHashMap;
    }

    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes stringTableTypes, @NotNull String[] strArr) {
        this.a = stringTableTypes;
        this.b = strArr;
        List<Integer> localNameList = stringTableTypes.getLocalNameList();
        this.c = localNameList.isEmpty() ? y.emptySet() : CollectionsKt___CollectionsKt.toSet(localNameList);
        ArrayList arrayList = new ArrayList();
        List<JvmProtoBuf.StringTableTypes.Record> recordList = getTypes().getRecordList();
        arrayList.ensureCapacity(recordList.size());
        for (JvmProtoBuf.StringTableTypes.Record record : recordList) {
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        Unit unit = Unit.INSTANCE;
        this.d = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i) {
        String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.d.get(i);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = f;
            int size = list.size() - 1;
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex >= 0 && predefinedIndex <= size) {
                strSubstring = list.get(record.getPredefinedIndex());
            } else {
                strSubstring = this.b[i];
            }
        } else {
            strSubstring = this.b[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
            }
        }
        String strReplace$default = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            strReplace$default = m.replace$default(strReplace$default, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, (Object) null);
        }
        String strSubstring2 = strReplace$default;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i2 == 2) {
            return m.replace$default(strSubstring2, '$', '.', false, 4, (Object) null);
        }
        if (i2 != 3) {
            return strSubstring2;
        }
        if (strSubstring2.length() >= 2) {
            strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
        }
        return m.replace$default(strSubstring2, '$', '.', false, 4, (Object) null);
    }

    @NotNull
    public final JvmProtoBuf.StringTableTypes getTypes() {
        return this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.c.contains(Integer.valueOf(i));
    }
}
