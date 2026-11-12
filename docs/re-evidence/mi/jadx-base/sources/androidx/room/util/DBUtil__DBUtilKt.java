package androidx.room.util;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.room.InvalidationTracker;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0080H¢\u0006\u0002\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"internalPerform", "R", "Landroidx/room/RoomDatabase;", "isReadOnly", "", "inTransaction", "block", "Lkotlin/Function2;", "Landroidx/room/PooledConnection;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dropFtsSyncTriggers", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "foreignKeyCheck", "db", "tableName", "", "processForeignKeyCheckFailure", "stmt", "Landroidx/sqlite/SQLiteStatement;", "processForeignKeyCheckFailure$DBUtil__DBUtilKt", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1863#2,2:169\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n106#1:169,2\n*E\n"})
final /* synthetic */ class DBUtil__DBUtilKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtilKt$internalPerform$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", f = "DBUtil.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 65}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    public static final class AnonymousClass2<R> extends SuspendLambda implements Function2<Transactor, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<PooledConnection, Continuation<? super R>, Object> $block;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        final /* synthetic */ RoomDatabase $this_internalPerform;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, boolean z2, RoomDatabase roomDatabase, Function2<? super PooledConnection, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$inTransaction = z;
            this.$isReadOnly = z2;
            this.$this_internalPerform = roomDatabase;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor transactor, Continuation<? super R> continuation) {
            return ((AnonymousClass2) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Transactor.SQLiteTransactionType sQLiteTransactionType;
            Transactor transactor;
            Transactor transactor2;
            Transactor.SQLiteTransactionType sQLiteTransactionType2;
            Object objInTransaction;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Transactor transactor3 = (Transactor) this.L$0;
                if (!this.$inTransaction) {
                    Function2<PooledConnection, Continuation<? super R>, Object> function2 = this.$block;
                    this.label = 5;
                    Object objInvoke = function2.invoke(transactor3, this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                }
                boolean z = this.$isReadOnly;
                sQLiteTransactionType = z ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
                if (z) {
                    transactor = transactor3;
                } else {
                    this.L$0 = transactor3;
                    this.L$1 = sQLiteTransactionType;
                    this.label = 1;
                    Object objInTransaction2 = transactor3.inTransaction(this);
                    if (objInTransaction2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                    transactor2 = transactor3;
                    obj = objInTransaction2;
                    sQLiteTransactionType2 = sQLiteTransactionType3;
                }
                DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                objInTransaction = transactor.inTransaction(this);
                if (objInTransaction == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                obj = objInTransaction;
                if (!((Boolean) obj).booleanValue()) {
                    this.$this_internalPerform.getInvalidationTracker().refreshAsync();
                }
                return obj2;
            }
            if (i == 1) {
                sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
                transactor2 = (Transactor) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
                transactor2 = (Transactor) this.L$0;
                ResultKt.throwOnFailure(obj);
                Transactor transactor4 = transactor2;
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor4;
                DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$2 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                objInTransaction = transactor.inTransaction(this);
                if (objInTransaction == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                obj = objInTransaction;
            } else if (i == 3) {
                transactor = (Transactor) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                objInTransaction = transactor.inTransaction(this);
                if (objInTransaction == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                obj = objInTransaction;
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.$this_internalPerform.getInvalidationTracker().refreshAsync();
            }
            return obj2;
            if (!((Boolean) obj).booleanValue()) {
                InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
                this.L$0 = transactor2;
                this.L$1 = sQLiteTransactionType2;
                this.label = 2;
                if (invalidationTracker.sync$room_runtime_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Transactor transactor5 = transactor2;
            sQLiteTransactionType = sQLiteTransactionType2;
            transactor = transactor5;
            DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$3 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!this.$isReadOnly) {
                return obj;
            }
            this.L$0 = obj;
            this.label = 4;
            objInTransaction = transactor.inTransaction(this);
            if (objInTransaction == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            obj = objInTransaction;
            if (!((Boolean) obj).booleanValue()) {
                this.$this_internalPerform.getInvalidationTracker().refreshAsync();
            }
            return obj2;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Transactor transactor = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                return this.$block.invoke(transactor, this);
            }
            boolean z = this.$isReadOnly;
            Transactor.SQLiteTransactionType sQLiteTransactionType = z ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!z) {
                InlineMarker.mark(0);
                Object objInTransaction = transactor.inTransaction(this);
                InlineMarker.mark(1);
                if (!((Boolean) objInTransaction).booleanValue()) {
                    InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
                    InlineMarker.mark(0);
                    invalidationTracker.sync$room_runtime_release(this);
                    InlineMarker.mark(1);
                }
            }
            DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null);
            InlineMarker.mark(0);
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
            InlineMarker.mark(1);
            if (this.$isReadOnly) {
                return objWithTransaction;
            }
            InlineMarker.mark(0);
            Object objInTransaction2 = transactor.inTransaction(this);
            InlineMarker.mark(1);
            if (((Boolean) objInTransaction2).booleanValue()) {
                return objWithTransaction;
            }
            this.$this_internalPerform.getInvalidationTracker().refreshAsync();
            return objWithTransaction;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@NotNull SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (sQLiteStatementPrepare.step()) {
            try {
                listCreateListBuilder.add(sQLiteStatementPrepare.getText(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
        for (String str : CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)) {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "room_fts_content_sync_", false, 2, null)) {
                SQLite.execSQL(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@NotNull SQLiteConnection db, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        SQLiteStatement sQLiteStatementPrepare = db.prepare("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (sQLiteStatementPrepare.step()) {
                throw new SQLException(processForeignKeyCheckFailure$DBUtil__DBUtilKt(sQLiteStatementPrepare));
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    @Nullable
    public static final <R> Object internalPerform(@NotNull RoomDatabase roomDatabase, boolean z, boolean z2, @NotNull Function2<? super PooledConnection, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return roomDatabase.useConnection$room_runtime_release(z, new AnonymousClass2(z2, z, roomDatabase, function2, null), continuation);
    }

    private static final <R> Object internalPerform$$forInline(RoomDatabase roomDatabase, boolean z, boolean z2, Function2<? super PooledConnection, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(z2, z, roomDatabase, function2, null);
        InlineMarker.mark(0);
        Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z, anonymousClass2, continuation);
        InlineMarker.mark(1);
        return objUseConnection$room_runtime_release;
    }

    private static final String processForeignKeyCheckFailure$DBUtil__DBUtilKt(SQLiteStatement sQLiteStatement) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            if (i == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(sQLiteStatement.getText(0));
                sb.append("'.\n");
            }
            String text = sQLiteStatement.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, sQLiteStatement.getText(2));
            }
            i++;
        } while (sQLiteStatement.step());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(i);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        return sb.toString();
    }
}
