package androidx.room.util;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0003H\u0000\"\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006$"}, d2 = {"findAffinity", "", "type", "", "readTableInfo", "Landroidx/room/util/TableInfo;", "connection", "Landroidx/sqlite/SQLiteConnection;", "tableName", "readForeignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "readForeignKeyFieldMappings", "", "Landroidx/room/util/ForeignKeyWithSequence;", "stmt", "Landroidx/sqlite/SQLiteStatement;", "readColumns", "", "Landroidx/room/util/TableInfo$Column;", "readIndices", "Landroidx/room/util/TableInfo$Index;", "readIndex", "name", "unique", "", "readFtsColumns", "readFtsOptions", "FTS_OPTIONS", "", "[Ljava/lang/String;", "parseFtsOptions", "createStatement", "readViewInfo", "Landroidx/room/util/ViewInfo;", "viewName", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,378:1\n774#2:379\n865#2,2:380\n1863#2,2:382\n1053#2:384\n1557#2:385\n1628#2,3:386\n1053#2:389\n1557#2:390\n1628#2,3:391\n774#2:420\n865#2:421\n866#2:424\n1188#3,2:394\n1190#3:419\n108#4:396\n80#4,22:397\n12567#5,2:422\n*S KotlinDebug\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n*L\n94#1:379\n94#1:380,2\n95#1:382,2\n256#1:384\n256#1:385\n256#1:386,3\n257#1:389\n257#1:390\n257#1:391,3\n360#1:420\n360#1:421\n360#1:424\n328#1:394,2\n328#1:419\n348#1:396\n348#1:397,22\n360#1:422,2\n*E\n"})
public final class SchemaInfoUtilKt {

    @NotNull
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int findAffinity(@Nullable String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
            return 3;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
            return 2;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
            return 5;
        }
        return (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    @NotNull
    public static final Set<String> parseFtsOptions(@NotNull String createStatement) {
        Character ch;
        Character ch2;
        Intrinsics.checkNotNullParameter(createStatement, "createStatement");
        if (createStatement.length() == 0) {
            return SetsKt__SetsKt.emptySet();
        }
        String strSubstring = createStatement.substring(StringsKt__StringsKt.indexOf$default((CharSequence) createStatement, '(', 0, false, 6, (Object) null) + 1, StringsKt__StringsKt.lastIndexOf$default((CharSequence) createStatement, ')', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i2);
            int i4 = i3 + 1;
            if (cCharAt == '\"' || cCharAt == '\'') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.addFirst(Character.valueOf(cCharAt));
                } else {
                    ch = (Character) arrayDeque.firstOrNull();
                    if (ch != null && ch.charValue() == cCharAt) {
                        CollectionsKt__MutableCollectionsKt.removeLast(arrayDeque);
                    }
                }
            } else if (cCharAt != ',') {
                if (cCharAt != '[') {
                    if (cCharAt != ']') {
                        if (cCharAt == '`') {
                            if (arrayDeque.isEmpty()) {
                                arrayDeque.addFirst(Character.valueOf(cCharAt));
                            } else {
                                ch = (Character) arrayDeque.firstOrNull();
                                if (ch != null) {
                                    CollectionsKt__MutableCollectionsKt.removeLast(arrayDeque);
                                }
                            }
                        }
                    } else if (!arrayDeque.isEmpty() && (ch2 = (Character) arrayDeque.firstOrNull()) != null && ch2.charValue() == '[') {
                        CollectionsKt__MutableCollectionsKt.removeLast(arrayDeque);
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayDeque.addFirst(Character.valueOf(cCharAt));
                }
            } else if (arrayDeque.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i + 1, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                int length = strSubstring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = Intrinsics.compare((int) strSubstring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i5++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        String strSubstring3 = strSubstring.substring(i + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        arrayList.add(StringsKt__StringsKt.trim((CharSequence) strSubstring3).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            for (String str2 : FTS_OPTIONS) {
                if (StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null)) {
                    arrayList2.add(obj);
                    break;
                }
            }
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList2);
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            String str2 = null;
            if (!sQLiteStatementPrepare.step()) {
                Map<String, TableInfo.Column> mapEmptyMap = MapsKt__MapsKt.emptyMap();
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                return mapEmptyMap;
            }
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "name");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "type");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "notnull");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "pk");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "dflt_value");
            Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
            while (true) {
                String text = sQLiteStatementPrepare.getText(iColumnIndexOf);
                mapCreateMapBuilder.put(text, new TableInfo.Column(text, sQLiteStatementPrepare.getText(iColumnIndexOf2), sQLiteStatementPrepare.getLong(iColumnIndexOf3) != 0, (int) sQLiteStatementPrepare.getLong(iColumnIndexOf4), sQLiteStatementPrepare.isNull(iColumnIndexOf5) ? str2 : sQLiteStatementPrepare.getText(iColumnIndexOf5), 2));
                if (!sQLiteStatementPrepare.step()) {
                    Map<String, TableInfo.Column> mapBuild = MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
                    AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                    return mapBuild;
                }
                str2 = null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
        int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
        int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "from");
        int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "to");
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        while (sQLiteStatement.step()) {
            listCreateListBuilder.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iColumnIndexOf), (int) sQLiteStatement.getLong(iColumnIndexOf2), sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4)));
        }
        return CollectionsKt___CollectionsKt.sorted(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "id");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "seq");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "table");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "on_delete");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "on_update");
            List<ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(sQLiteStatementPrepare);
            sQLiteStatementPrepare.reset();
            Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.getLong(iColumnIndexOf2) == 0) {
                    int i = (int) sQLiteStatementPrepare.getLong(iColumnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setCreateSetBuilder.add(new TableInfo.ForeignKey(sQLiteStatementPrepare.getText(iColumnIndexOf3), sQLiteStatementPrepare.getText(iColumnIndexOf4), sQLiteStatementPrepare.getText(iColumnIndexOf5), arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setBuild = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return setBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final Set<String> readFtsColumns(@NotNull SQLiteConnection connection, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "name");
                do {
                    setCreateSetBuilder.add(sQLiteStatementPrepare.getText(iColumnIndexOf));
                } while (sQLiteStatementPrepare.step());
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final Set<String> readFtsOptions(@NotNull SQLiteConnection connection, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
        try {
            String text = sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getText(SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "sql")) : "";
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return parseFtsOptions(text);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "seqno");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "cid");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "name");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "desc");
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1 && iColumnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (sQLiteStatementPrepare.step()) {
                    if (((int) sQLiteStatementPrepare.getLong(iColumnIndexOf2)) >= 0) {
                        int i = (int) sQLiteStatementPrepare.getLong(iColumnIndexOf);
                        String text = sQLiteStatementPrepare.getText(iColumnIndexOf3);
                        String str2 = sQLiteStatementPrepare.getLong(iColumnIndexOf4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), text);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it = listSortedWith.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List list = CollectionsKt___CollectionsKt.toList(arrayList);
                List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith2, 10));
                Iterator it2 = listSortedWith2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z, list, CollectionsKt___CollectionsKt.toList(arrayList2));
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                return index;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final Set<TableInfo.Index> readIndices(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
        try {
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "name");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "origin");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatementPrepare, "unique");
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1) {
                Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                while (sQLiteStatementPrepare.step()) {
                    if (Intrinsics.areEqual(PluginDeviceInfo.FICONON, sQLiteStatementPrepare.getText(iColumnIndexOf2))) {
                        TableInfo.Index index = readIndex(sQLiteConnection, sQLiteStatementPrepare.getText(iColumnIndexOf), sQLiteStatementPrepare.getLong(iColumnIndexOf3) == 1);
                        if (index == null) {
                            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                            return null;
                        }
                        setCreateSetBuilder.add(index);
                    }
                }
                Set<TableInfo.Index> setBuild = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                return setBuild;
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final TableInfo readTableInfo(@NotNull SQLiteConnection connection, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new TableInfo(tableName, readColumns(connection, tableName), readForeignKeys(connection, tableName), readIndices(connection, tableName));
    }

    @NotNull
    public static final ViewInfo readViewInfo(@NotNull SQLiteConnection connection, @NotNull String viewName) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
        try {
            ViewInfo viewInfo = sQLiteStatementPrepare.step() ? new ViewInfo(sQLiteStatementPrepare.getText(0), sQLiteStatementPrepare.getText(1)) : new ViewInfo(viewName, null);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return viewInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
