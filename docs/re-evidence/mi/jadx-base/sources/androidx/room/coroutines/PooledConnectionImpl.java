package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.miui.tsmclient.util.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003678B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00190\u001dH\u0096@¢\u0006\u0002\u0010\u001fJK\u0010 \u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010!\u001a\u00020\"2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'H\u0096@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020,JM\u0010-\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\b\u0010!\u001a\u0004\u0018\u00010\"2-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'H\u0082@¢\u0006\u0002\u0010(J\u0016\u0010.\u001a\u00020,2\u0006\u0010!\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u00102J\"\u00103\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001904H\u0082H¢\u0006\u0002\u00105R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u00069"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "delegate", "Landroidx/room/coroutines/ConnectionWithLock;", "isReadOnly", "", "<init>", "(Landroidx/room/coroutines/ConnectionWithLock;Z)V", "getDelegate", "()Landroidx/room/coroutines/ConnectionWithLock;", "()Z", "transactionStack", "Lkotlin/collections/ArrayDeque;", "Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "_isRecycled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecycled", "rawConnection", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "usePrepared", "R", "sql", "", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "type", "Landroidx/room/Transactor$SQLiteTransactionType;", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inTransaction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markRecycled", "", "transaction", "beginTransaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endTransaction", "success", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateCheck", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TransactionItem", "TransactionImpl", "StatementWrapper", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n462#1,11:538\n462#1,11:559\n462#1,11:570\n120#2,8:549\n129#2:558\n120#2,10:581\n120#2,10:591\n1#3:557\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n*L\n341#1:538,11\n350#1:559,11\n352#1:570,11\n342#1:549,8\n342#1:558\n401#1:581,10\n418#1:591,10\n*E\n"})
final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {

    @NotNull
    private final AtomicBoolean _isRecycled;

    @NotNull
    private final ConnectionWithLock delegate;
    private final boolean isReadOnly;

    @NotNull
    private final ArrayDeque<TransactionItem> transactionStack;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\"\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#H\u0082\b¢\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$StatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;Landroidx/sqlite/SQLiteStatement;)V", "threadId", "", "bindBlob", "", "index", "", "value", "", "bindDouble", "", "bindLong", "bindText", "", "bindNull", "getBlob", "getDouble", "getLong", "getText", "isNull", "", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "clearBindings", Constants.EXTRA_CLOSE_TAI, "withStateCheck", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$StatementWrapper\n*L\n1#1,537:1\n524#1,10:538\n524#1,10:548\n524#1,10:558\n524#1,10:568\n524#1,10:578\n524#1,10:588\n524#1,10:598\n524#1,10:608\n524#1,10:618\n524#1,10:628\n524#1,10:638\n524#1,10:648\n524#1,10:658\n524#1,10:668\n524#1,10:678\n524#1,10:688\n524#1,10:698\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$StatementWrapper\n*L\n481#1:538,10\n485#1:548,10\n489#1:558,10\n493#1:568,10\n497#1:578,10\n499#1:588,10\n501#1:598,10\n503#1:608,10\n505#1:618,10\n507#1:628,10\n509#1:638,10\n511#1:648,10\n513#1:658,10\n515#1:668,10\n517#1:678,10\n519#1:688,10\n521#1:698,10\n*E\n"})
    public final class StatementWrapper implements SQLiteStatement {

        @NotNull
        private final SQLiteStatement delegate;
        final /* synthetic */ PooledConnectionImpl this$0;
        private final long threadId;

        public StatementWrapper(@NotNull PooledConnectionImpl pooledConnectionImpl, SQLiteStatement delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = pooledConnectionImpl;
            this.delegate = delegate;
            this.threadId = ThreadLocal_jvmAndroidKt.currentThreadId();
        }

        private final <R> R withStateCheck(Function0<? extends R> block) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return block.invoke();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo48bindBlob(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo48bindBlob(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo49bindDouble(int index, double value) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo49bindDouble(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo50bindLong(int index, long value) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo50bindLong(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo51bindNull(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo51bindNull(index);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo52bindText(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo52bindText(index, value);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo53clearBindings() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo53clearBindings();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.close();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getBlob(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnCount();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnName(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnType(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getDouble(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getLong(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getText(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.isNull(index);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.reset();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            if (this.this$0.isRecycled()) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.step();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u000b0\u000fH\u0096@¢\u0006\u0002\u0010\u0011J>\u0010\u0012\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b2(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl;", "T", "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;)V", "rawConnection", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "usePrepared", "R", "sql", "", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withNestedTransaction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rollback", "", "result", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$TransactionImpl\n+ 2 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,537:1\n462#2,11:538\n462#2,11:549\n120#3,10:560\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$TransactionImpl\n*L\n450#1:538,11\n452#1:549,11\n456#1:560,10\n*E\n"})
    public final class TransactionImpl<T> implements TransactionScope<T>, RawConnectionAccessor {
        public TransactionImpl() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        @NotNull
        public SQLiteConnection getRawConnection() {
            return PooledConnectionImpl.this.getRawConnection();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.room.TransactionScope
        @Nullable
        public Object rollback(T t, @NotNull Continuation<?> continuation) throws ConnectionPool.RollbackException {
            PooledConnectionImpl$TransactionImpl$rollback$1 pooledConnectionImpl$TransactionImpl$rollback$1;
            Object obj;
            PooledConnectionImpl pooledConnectionImpl;
            Mutex mutex;
            if (continuation instanceof PooledConnectionImpl$TransactionImpl$rollback$1) {
                pooledConnectionImpl$TransactionImpl$rollback$1 = (PooledConnectionImpl$TransactionImpl$rollback$1) continuation;
                int i = pooledConnectionImpl$TransactionImpl$rollback$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pooledConnectionImpl$TransactionImpl$rollback$1.label = i - Integer.MIN_VALUE;
                } else {
                    pooledConnectionImpl$TransactionImpl$rollback$1 = new PooledConnectionImpl$TransactionImpl$rollback$1(this, continuation);
                }
            } else {
                pooledConnectionImpl$TransactionImpl$rollback$1 = new PooledConnectionImpl$TransactionImpl$rollback$1(this, continuation);
            }
            Object obj2 = pooledConnectionImpl$TransactionImpl$rollback$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = pooledConnectionImpl$TransactionImpl$rollback$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                PooledConnectionImpl pooledConnectionImpl2 = PooledConnectionImpl.this;
                if (pooledConnectionImpl2.isRecycled()) {
                    SQLite.throwSQLiteException(21, "Connection is recycled");
                    throw new KotlinNothingValueException();
                }
                ConnectionElement connectionElement = (ConnectionElement) pooledConnectionImpl$TransactionImpl$rollback$1.getContext().get(ConnectionElement.INSTANCE);
                if (connectionElement == null || connectionElement.getConnectionWrapper() != pooledConnectionImpl2) {
                    SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
                    throw new KotlinNothingValueException();
                }
                if (pooledConnectionImpl2.transactionStack.isEmpty()) {
                    throw new IllegalStateException("Not in a transaction".toString());
                }
                ConnectionWithLock delegate = pooledConnectionImpl2.getDelegate();
                pooledConnectionImpl$TransactionImpl$rollback$1.L$0 = t;
                pooledConnectionImpl$TransactionImpl$rollback$1.L$1 = pooledConnectionImpl2;
                pooledConnectionImpl$TransactionImpl$rollback$1.L$2 = delegate;
                pooledConnectionImpl$TransactionImpl$rollback$1.label = 1;
                if (delegate.lock(null, pooledConnectionImpl$TransactionImpl$rollback$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = t;
                pooledConnectionImpl = pooledConnectionImpl2;
                mutex = delegate;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) pooledConnectionImpl$TransactionImpl$rollback$1.L$2;
                pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$TransactionImpl$rollback$1.L$1;
                obj = pooledConnectionImpl$TransactionImpl$rollback$1.L$0;
                ResultKt.throwOnFailure(obj2);
            }
            try {
                ((TransactionItem) pooledConnectionImpl.transactionStack.last()).setShouldRollback(true);
                Unit unit = Unit.INSTANCE;
                throw new ConnectionPool.RollbackException(obj);
            } finally {
                mutex.unlock(null);
            }
        }

        @Override // androidx.room.PooledConnection
        @Nullable
        public <R> Object usePrepared(@NotNull String str, @NotNull Function1<? super SQLiteStatement, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
            return PooledConnectionImpl.this.usePrepared(str, function1, continuation);
        }

        @Override // androidx.room.TransactionScope
        @Nullable
        public <R> Object withNestedTransaction(@NotNull Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
            PooledConnectionImpl pooledConnectionImpl = PooledConnectionImpl.this;
            if (pooledConnectionImpl.isRecycled()) {
                SQLite.throwSQLiteException(21, "Connection is recycled");
                throw new KotlinNothingValueException();
            }
            ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(ConnectionElement.INSTANCE);
            if (connectionElement != null && connectionElement.getConnectionWrapper() == pooledConnectionImpl) {
                return pooledConnectionImpl.transaction(null, function2, continuation);
            }
            SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "", "id", "", "shouldRollback", "", "<init>", "(IZ)V", "getId", "()I", "getShouldRollback", "()Z", "setShouldRollback", "(Z)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransactionItem {
        private final int id;
        private boolean shouldRollback;

        public TransactionItem(int i, boolean z) {
            this.id = i;
            this.shouldRollback = z;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }

        public final void setShouldRollback(boolean z) {
            this.shouldRollback = z;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {543}, m = "beginTransaction", n = {"this", "type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.beginTransaction(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$endTransaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {543}, m = "endTransaction", n = {"this", "$this$withLock_u24default$iv", "success"}, s = {"L$0", "L$1", "Z$0"})
    public static final class C12901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C12901(Continuation<? super C12901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.endTransaction(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$transaction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 1, 1, 4}, l = {376, 380, 393, 393, 393}, m = "transaction", n = {"this", "block", "this", "success", "exception"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0"})
    public static final class C12911<R> extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12911(Continuation<? super C12911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.transaction(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PooledConnectionImpl$usePrepared$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0, 0}, l = {554}, m = "usePrepared", n = {"this", "sql", "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C12921<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12921(Continuation<? super C12921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.usePrepared(null, null, this);
        }
    }

    public PooledConnectionImpl(@NotNull ConnectionWithLock delegate, boolean z) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.isReadOnly = z;
        this.transactionStack = new ArrayDeque<>();
        this._isRecycled = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object beginTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        PooledConnectionImpl pooledConnectionImpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.delegate;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = sQLiteTransactionType;
            anonymousClass1.L$2 = mutex;
            anonymousClass1.label = 1;
            if (mutex.lock(null, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) anonymousClass1.L$2;
            Transactor.SQLiteTransactionType sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) anonymousClass1.L$1;
            pooledConnectionImpl = (PooledConnectionImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            sQLiteTransactionType = sQLiteTransactionType2;
        }
        try {
            int size = pooledConnectionImpl.transactionStack.size();
            if (pooledConnectionImpl.transactionStack.isEmpty()) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                if (i3 == 1) {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i3 == 2) {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SQLite.execSQL(pooledConnectionImpl.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                SQLite.execSQL(pooledConnectionImpl.delegate, "SAVEPOINT '" + size + '\'');
            }
            pooledConnectionImpl.transactionStack.addLast(new TransactionItem(size, false));
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object endTransaction(boolean z, Continuation<? super Unit> continuation) {
        C12901 c12901;
        PooledConnectionImpl pooledConnectionImpl;
        Mutex mutex;
        if (continuation instanceof C12901) {
            c12901 = (C12901) continuation;
            int i = c12901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12901.label = i - Integer.MIN_VALUE;
            } else {
                c12901 = new C12901(continuation);
            }
        } else {
            c12901 = new C12901(continuation);
        }
        Object obj = c12901.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ConnectionWithLock connectionWithLock = this.delegate;
            c12901.L$0 = this;
            c12901.L$1 = connectionWithLock;
            c12901.Z$0 = z;
            c12901.label = 1;
            if (connectionWithLock.lock(null, c12901) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
            mutex = connectionWithLock;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c12901.Z$0;
            mutex = (Mutex) c12901.L$1;
            pooledConnectionImpl = (PooledConnectionImpl) c12901.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (pooledConnectionImpl.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction".toString());
            }
            TransactionItem transactionItem = (TransactionItem) CollectionsKt__MutableCollectionsKt.removeLast(pooledConnectionImpl.transactionStack);
            if (!z || transactionItem.getShouldRollback()) {
                if (pooledConnectionImpl.transactionStack.isEmpty()) {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "ROLLBACK TRANSACTION");
                } else {
                    SQLite.execSQL(pooledConnectionImpl.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + transactionItem.getId() + '\'');
                }
            } else if (pooledConnectionImpl.transactionStack.isEmpty()) {
                SQLite.execSQL(pooledConnectionImpl.delegate, "END TRANSACTION");
            } else {
                SQLite.execSQL(pooledConnectionImpl.delegate, "RELEASE SAVEPOINT '" + transactionItem.getId() + '\'');
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return unit;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRecycled() {
        return this._isRecycled.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4 A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #3 {, blocks: (B:50:0x00b0, B:52:0x00b4), top: B:77:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final <R> Object transaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        C12911 c12911;
        PooledConnectionImpl pooledConnectionImpl;
        PooledConnectionImpl pooledConnectionImpl2;
        ConnectionPool.RollbackException th;
        int i;
        Throwable th2;
        Object result;
        boolean z;
        if (continuation instanceof C12911) {
            c12911 = (C12911) continuation;
            int i2 = c12911.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c12911.label = i2 - Integer.MIN_VALUE;
            } else {
                c12911 = new C12911(continuation);
            }
        } else {
            c12911 = new C12911(continuation);
        }
        Object objInvoke = c12911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c12911.label;
        ConnectionPool.RollbackException rollbackException = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                if (sQLiteTransactionType == null) {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
                }
                c12911.L$0 = this;
                c12911.L$1 = function2;
                c12911.label = 1;
                if (beginTransaction(sQLiteTransactionType, c12911) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pooledConnectionImpl = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            Object obj = c12911.L$0;
                            ResultKt.throwOnFailure(objInvoke);
                            return obj;
                        }
                        if (i3 == 4) {
                            Object obj2 = c12911.L$0;
                            ResultKt.throwOnFailure(objInvoke);
                            return obj2;
                        }
                        if (i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) c12911.L$1;
                        th2 = (Throwable) c12911.L$0;
                        try {
                            ResultKt.throwOnFailure(objInvoke);
                        } catch (SQLException e) {
                            e = e;
                            if (th2 != null) {
                                throw e;
                            }
                            ExceptionsKt__ExceptionsKt.addSuppressed(th2, e);
                        }
                        throw th;
                    }
                    i = c12911.I$0;
                    pooledConnectionImpl2 = (PooledConnectionImpl) c12911.L$0;
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        z = i != 0;
                        c12911.L$0 = objInvoke;
                        c12911.label = 3;
                        if (pooledConnectionImpl2.endTransaction(z, c12911) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objInvoke;
                    } catch (Throwable th3) {
                        th = th3;
                        if (!(th instanceof ConnectionPool.RollbackException)) {
                            result = th.getResult();
                            c12911.L$0 = result;
                            c12911.L$1 = null;
                            c12911.label = 4;
                            if (pooledConnectionImpl2.endTransaction(false, c12911) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return result;
                        }
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            rollbackException = th;
                            th = th4;
                            c12911.L$0 = rollbackException;
                            c12911.L$1 = th;
                            c12911.label = 5;
                            if (pooledConnectionImpl2.endTransaction(false, c12911) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th;
                        }
                        try {
                            c12911.L$0 = rollbackException;
                            c12911.L$1 = th;
                            c12911.label = 5;
                            if (pooledConnectionImpl2.endTransaction(false, c12911) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (SQLException e2) {
                            e = e2;
                            th2 = rollbackException;
                            if (th2 != null) {
                                throw e;
                            }
                            ExceptionsKt__ExceptionsKt.addSuppressed(th2, e);
                        }
                        throw th;
                    }
                }
                function2 = (Function2) c12911.L$1;
                pooledConnectionImpl = (PooledConnectionImpl) c12911.L$0;
                ResultKt.throwOnFailure(objInvoke);
            }
            TransactionImpl transactionImpl = pooledConnectionImpl.new TransactionImpl();
            c12911.L$0 = pooledConnectionImpl;
            c12911.L$1 = null;
            c12911.I$0 = 1;
            c12911.label = 2;
            objInvoke = function2.invoke(transactionImpl, c12911);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl2 = pooledConnectionImpl;
            i = 1;
            if (i != 0) {
            }
            c12911.L$0 = objInvoke;
            c12911.label = 3;
            if (pooledConnectionImpl2.endTransaction(z, c12911) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        } catch (Throwable th5) {
            pooledConnectionImpl2 = pooledConnectionImpl;
            th = th5;
            if (!(th instanceof ConnectionPool.RollbackException)) {
                throw th;
            }
            result = th.getResult();
            c12911.L$0 = result;
            c12911.L$1 = null;
            c12911.label = 4;
            if (pooledConnectionImpl2.endTransaction(false, c12911) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return result;
            c12911.L$0 = rollbackException;
            c12911.L$1 = th;
            c12911.label = 5;
            if (pooledConnectionImpl2.endTransaction(false, c12911) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th;
        }
    }

    private final <R> Object withStateCheck(Function0<? extends R> function0, Continuation<? super R> continuation) {
        if (isRecycled()) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        InlineMarker.mark(3);
        throw null;
    }

    @NotNull
    public final ConnectionWithLock getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    @NotNull
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    @Nullable
    public Object inTransaction(@NotNull Continuation<? super Boolean> continuation) {
        if (isRecycled()) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(ConnectionElement.INSTANCE);
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return Boxing.boxBoolean(!this.transactionStack.isEmpty());
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: isReadOnly, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void markRecycled() {
        if (this._isRecycled.compareAndSet(false, true)) {
            try {
                SQLite.execSQL(this.delegate, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.PooledConnection
    @Nullable
    public <R> Object usePrepared(@NotNull String str, @NotNull Function1<? super SQLiteStatement, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        C12921 c12921;
        Mutex mutex;
        PooledConnectionImpl pooledConnectionImpl;
        if (continuation instanceof C12921) {
            c12921 = (C12921) continuation;
            int i = c12921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12921.label = i - Integer.MIN_VALUE;
            } else {
                c12921 = new C12921(continuation);
            }
        } else {
            c12921 = new C12921(continuation);
        }
        Object obj = c12921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c12921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (isRecycled()) {
                SQLite.throwSQLiteException(21, "Connection is recycled");
                throw new KotlinNothingValueException();
            }
            ConnectionElement connectionElement = (ConnectionElement) c12921.getContext().get(ConnectionElement.INSTANCE);
            if (connectionElement == null || connectionElement.getConnectionWrapper() != this) {
                SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
                throw new KotlinNothingValueException();
            }
            mutex = this.delegate;
            c12921.L$0 = this;
            c12921.L$1 = str;
            c12921.L$2 = function1;
            c12921.L$3 = mutex;
            c12921.label = 1;
            if (mutex.lock(null, c12921) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c12921.L$3;
            function1 = (Function1) c12921.L$2;
            String str2 = (String) c12921.L$1;
            pooledConnectionImpl = (PooledConnectionImpl) c12921.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            str = str2;
        }
        try {
            StatementWrapper statementWrapper = new StatementWrapper(pooledConnectionImpl, pooledConnectionImpl.delegate.prepare(str));
            try {
                R rInvoke2 = function1.invoke2(statementWrapper);
                AutoCloseableKt.closeFinally(statementWrapper, null);
                mutex.unlock(null);
                return rInvoke2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(statementWrapper, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            mutex.unlock(null);
            throw th3;
        }
    }

    @Override // androidx.room.Transactor
    @Nullable
    public <R> Object withTransaction(@NotNull Transactor.SQLiteTransactionType sQLiteTransactionType, @NotNull Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        if (isRecycled()) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new KotlinNothingValueException();
        }
        ConnectionElement connectionElement = (ConnectionElement) continuation.getContext().get(ConnectionElement.INSTANCE);
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return transaction(sQLiteTransactionType, function2, continuation);
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new KotlinNothingValueException();
    }
}
