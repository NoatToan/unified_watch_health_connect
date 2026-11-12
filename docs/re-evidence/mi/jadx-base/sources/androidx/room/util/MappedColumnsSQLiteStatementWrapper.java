package androidx.room.util;

import androidx.annotation.IntRange;
import androidx.sqlite.SQLiteStatement;
import com.miui.tsmclient.util.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J\u001b\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0016H\u0096\u0001J\u001b\u0010\u0017\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0018H\u0096\u0001J\u001b\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001aH\u0096\u0001J\u001b\u0010\u001b\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0096\u0001J\u001b\u0010\u001c\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001dH\u0096\u0001J\u0013\u0010\u001e\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u001b\u0010\u001f\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005H\u0096\u0001J\t\u0010 \u001a\u00020\u0011H\u0096\u0001J\t\u0010!\u001a\u00020\u0011H\u0096\u0001J\u0013\u0010\"\u001a\u00020\u00142\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010#\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\t\u0010$\u001a\u00020\rH\u0096\u0001J\u0013\u0010%\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096\u0001J\u0013\u0010(\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010)\u001a\u00020\u00182\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010*\u001a\u00020\u001a2\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010+\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010,\u001a\u00020\u001d2\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010-\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\u0013\u0010.\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0096\u0001J\t\u0010/\u001a\u00020\u0011H\u0096\u0001J\t\u00100\u001a\u00020\u0016H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Landroidx/room/util/MappedColumnsSQLiteStatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "columnNames", "", "", "mapping", "", "<init>", "(Landroidx/sqlite/SQLiteStatement;[Ljava/lang/String;[I)V", "[Ljava/lang/String;", "columnNameToIndexMap", "", "", "getColumnIndex", "name", "bindBlob", "", "index", "value", "", "bindBoolean", "", "bindDouble", "", "bindFloat", "", "bindInt", "bindLong", "", "bindNull", "bindText", "clearBindings", Constants.EXTRA_CLOSE_TAI, "getBlob", "getBoolean", "getColumnCount", "getColumnName", "getColumnNames", "", "getColumnType", "getDouble", "getFloat", "getInt", "getLong", "getText", "isNull", "reset", "step", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n1#2:113\n13467#3,3:114\n*S KotlinDebug\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n*L\n99#1:114,3\n*E\n"})
public final class MappedColumnsSQLiteStatementWrapper implements SQLiteStatement {

    @NotNull
    private final Map<String, Integer> columnNameToIndexMap;

    @NotNull
    private final String[] columnNames;

    @NotNull
    private final SQLiteStatement delegate;

    @NotNull
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(@NotNull SQLiteStatement delegate, @NotNull String[] columnNames, @NotNull int[] mapping) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        this.delegate = delegate;
        this.columnNames = columnNames;
        this.mapping = mapping;
        if (columnNames.length != mapping.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size".toString());
        }
        Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            mapCreateMapBuilder.put(columnNames[i], Integer.valueOf(this.mapping[i2]));
            i++;
            i2++;
        }
        int columnCount = getColumnCount();
        for (int i3 = 0; i3 < columnCount; i3++) {
            if (!mapCreateMapBuilder.containsKey(getColumnName(i3))) {
                mapCreateMapBuilder.put(getColumnName(i3), Integer.valueOf(i3));
            }
        }
        this.columnNameToIndexMap = MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* JADX INFO: renamed from: bindBlob */
    public void mo48bindBlob(@IntRange(from = 1) int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.mo48bindBlob(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@IntRange(from = 1) int index, boolean value) {
        this.delegate.bindBoolean(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* JADX INFO: renamed from: bindDouble */
    public void mo49bindDouble(@IntRange(from = 1) int index, double value) {
        this.delegate.mo49bindDouble(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@IntRange(from = 1) int index, float value) {
        this.delegate.bindFloat(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@IntRange(from = 1) int index, int value) {
        this.delegate.bindInt(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* JADX INFO: renamed from: bindLong */
    public void mo50bindLong(@IntRange(from = 1) int index, long value) {
        this.delegate.mo50bindLong(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* JADX INFO: renamed from: bindNull */
    public void mo51bindNull(@IntRange(from = 1) int index) {
        this.delegate.mo51bindNull(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* JADX INFO: renamed from: bindText */
    public void mo52bindText(@IntRange(from = 1) int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.mo52bindText(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* JADX INFO: renamed from: clearBindings */
    public void mo53clearBindings() {
        this.delegate.mo53clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public byte[] getBlob(@IntRange(from = 0) int index) {
        return this.delegate.getBlob(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@IntRange(from = 0) int index) {
        return this.delegate.getBoolean(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    public final int getColumnIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.columnNameToIndexMap.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public String getColumnName(@IntRange(from = 0) int index) {
        return this.delegate.getColumnName(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public List<String> getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(@IntRange(from = 0) int index) {
        return this.delegate.getColumnType(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(@IntRange(from = 0) int index) {
        return this.delegate.getDouble(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@IntRange(from = 0) int index) {
        return this.delegate.getFloat(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@IntRange(from = 0) int index) {
        return this.delegate.getInt(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(@IntRange(from = 0) int index) {
        return this.delegate.getLong(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public String getText(@IntRange(from = 0) int index) {
        return this.delegate.getText(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(@IntRange(from = 0) int index) {
        return this.delegate.isNull(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.delegate.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.delegate.step();
    }
}
