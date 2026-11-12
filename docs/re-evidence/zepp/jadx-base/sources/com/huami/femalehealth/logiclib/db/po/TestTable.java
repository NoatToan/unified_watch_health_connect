package com.huami.femalehealth.logiclib.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.huami.sleepassistant.apilib.utils.WebConst;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/TestTable;", "", "", "component1", "", "component2", "id", "name", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TestTable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    public TestTable(long j, @NotNull String str) {
        this.id = j;
        this.name = str;
    }

    public static /* synthetic */ TestTable copy$default(TestTable testTable, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = testTable.id;
        }
        if ((i & 2) != 0) {
            str = testTable.name;
        }
        return testTable.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final TestTable copy(long id, @NotNull String name) {
        return new TestTable(id, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestTable)) {
            return false;
        }
        TestTable testTable = (TestTable) other;
        return this.id == testTable.id && Intrinsics.areEqual(this.name, testTable.name);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (b.a(this.id) * 31) + this.name.hashCode();
    }

    public final void setId(long j) {
        this.id = j;
    }

    @NotNull
    public String toString() {
        return "TestTable(id=" + this.id + ", name=" + this.name + ')';
    }

    public /* synthetic */ TestTable(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str);
    }
}
