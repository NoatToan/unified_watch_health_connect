package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.TransactionElement;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00010\bH\u0087@¢\u0006\u0002\u0010\n\u001a?\u0010\u000b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001a:\u0010\r\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bH\u0087@¢\u0006\u0002\u0010\u0010\u001aB\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001e\b\u0004\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bH\u0082H¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001a\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007\u001a*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007\u001a\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020 H\u0007\u001a\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007\u001a\b\u0010(\u001a\u00020\u001dH\u0007\u001a\u0010\u0010)\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020 H\u0007¨\u0006*"}, d2 = {"performSuspending", "R", "db", "Landroidx/room/RoomDatabase;", "isReadOnly", "", "inTransaction", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performBlocking", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "performInTransactionSuspending", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compatCoroutineExecute", "compatCoroutineExecute$DBUtil__DBUtil_androidKt", "(Landroidx/room/RoomDatabase;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/room/RoomDatabase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "sqLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "maybeCopy", "signal", "Landroid/os/CancellationSignal;", "dropFtsSyncTriggers", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "foreignKeyCheck", "tableName", "", "readVersion", "", "databaseFile", "Ljava/io/File;", "createCancellationSignal", "toSQLiteConnection", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
@SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n108#1,2:247\n111#1:251\n48#2:249\n67#2:250\n1#3:252\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n*L\n52#1:247,2\n52#1:251\n53#1:249\n53#1:250\n*E\n"})
final /* synthetic */ class DBUtil__DBUtil_androidKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,246:1\n48#2:247\n67#2:248\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n*L\n74#1:247\n74#1:248\n*E\n"})
    public static final class AnonymousClass1<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<SQLiteConnection, R> $block;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(RoomDatabase roomDatabase, boolean z, boolean z2, Function1<? super SQLiteConnection, ? extends R> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$db = roomDatabase;
            this.$inTransaction = z;
            this.$isReadOnly = z2;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = !(this.$db.inCompatibilityMode$room_runtime_release() && this.$db.inTransaction()) && this.$inTransaction;
                RoomDatabase roomDatabase = this.$db;
                boolean z2 = this.$isReadOnly;
                DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(z, z2, roomDatabase, null, this.$block);
                this.label = 1;
                obj = roomDatabase.useConnection$room_runtime_release(z2, dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,246:1\n48#2:247\n67#2:248\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n91#1:247\n91#1:248\n*E\n"})
    public static final class AnonymousClass2<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$db = roomDatabase;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$db, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RoomDatabase roomDatabase = this.$db;
                DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(true, false, roomDatabase, null, this.$block);
                this.label = 1;
                obj = roomDatabase.useConnection$room_runtime_release(false, dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object invoke2(Continuation<? super R> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3", f = "DBUtil.android.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$3\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,246:1\n48#2:247\n67#2:248\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$3\n*L\n95#1:247\n95#1:248\n*E\n"})
    public static final class AnonymousClass3<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$db = roomDatabase;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$db, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RoomDatabase roomDatabase = this.$db;
                DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1(true, false, roomDatabase, null, this.$block);
                this.label = 1;
                obj = roomDatabase.useConnection$room_runtime_release(false, dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {1, 1, 1, 1}, l = {249, VibrateModeSetViewModel.DEFAULT_BBJI, VibrateModeSetViewModel.DEFAULT_BBJI}, m = "performSuspending", n = {"db", "block", "isReadOnly", "inTransaction"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
    public static final class C13051<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C13051(Continuation<? super C13051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performSuspending(null, false, false, null, this);
        }
    }

    private static final <R> Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(RoomDatabase roomDatabase, boolean z, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        if (roomDatabase.inCompatibilityMode$room_runtime_release() && roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
            return function1.invoke2(continuation);
        }
        InlineMarker.mark(0);
        Object coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z, continuation);
        InlineMarker.mark(1);
        DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 dBUtil__DBUtil_androidKt$compatCoroutineExecute$2 = new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(function1, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext((CoroutineContext) coroutineContext, dBUtil__DBUtil_androidKt$compatCoroutineExecute$2, continuation);
        InlineMarker.mark(1);
        return objWithContext;
    }

    @Deprecated(message = "Use constructor", replaceWith = @ReplaceWith(expression = "CancellationSignal()", imports = {"android.os.CancellationSignal"}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    @Deprecated(message = "Replaced by dropFtsSyncTriggers(connection: SQLiteConnection)")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        DBUtil.dropFtsSyncTriggers(new SupportSQLiteConnection(db));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@NotNull SupportSQLiteDatabase db, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        DBUtil.foreignKeyCheck(new SupportSQLiteConnection(db), tableName);
    }

    @Nullable
    public static final Object getCoroutineContext(@NotNull RoomDatabase roomDatabase, boolean z, @NotNull Continuation<? super CoroutineContext> continuation) {
        ContinuationInterceptor transactionDispatcher;
        CoroutineContext coroutineContextPlus;
        if (!roomDatabase.inCompatibilityMode$room_runtime_release()) {
            return roomDatabase.getCoroutineScope().getU();
        }
        TransactionElement transactionElement = (TransactionElement) continuation.getContext().get(TransactionElement.INSTANCE);
        if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null || (coroutineContextPlus = roomDatabase.getQueryContext().plus(transactionDispatcher)) == null) {
            return z ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext();
        }
        return coroutineContextPlus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(@NotNull RoomDatabase db, boolean z, boolean z2, @NotNull Function1<? super SQLiteConnection, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db.assertNotMainThread();
        db.assertNotSuspendingTransaction();
        return (R) RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(db, z2, z, block, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public static final <R> Object performInTransactionSuspending(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        return roomDatabase.inCompatibilityMode$room_runtime_release() ? RoomDatabaseKt.withTransactionContext(roomDatabase, new AnonymousClass2(roomDatabase, function1, null), continuation) : BuildersKt.withContext(roomDatabase.getCoroutineScope().getU(), new AnonymousClass3(roomDatabase, function1, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public static final <R> Object performSuspending(@NotNull RoomDatabase roomDatabase, boolean z, boolean z2, @NotNull Function1<? super SQLiteConnection, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        C13051 c13051;
        Function1<? super SQLiteConnection, ? extends R> function2;
        boolean z3;
        RoomDatabase roomDatabase2;
        boolean z4;
        if (continuation instanceof C13051) {
            c13051 = (C13051) continuation;
            int i = c13051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13051.label = i - Integer.MIN_VALUE;
            } else {
                c13051 = new C13051(continuation);
            }
        } else {
            c13051 = new C13051(continuation);
        }
        C13051 c13052 = c13051;
        Object objUseConnection$room_runtime_release = c13052.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13052.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    boolean z5 = c13052.Z$1;
                    boolean z6 = c13052.Z$0;
                    Function1<? super SQLiteConnection, ? extends R> function3 = (Function1) c13052.L$1;
                    RoomDatabase roomDatabase3 = (RoomDatabase) c13052.L$0;
                    ResultKt.throwOnFailure(objUseConnection$room_runtime_release);
                    z3 = z5;
                    z4 = z6;
                    function2 = function3;
                    roomDatabase2 = roomDatabase3;
                    DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(null, roomDatabase2, z4, z3, function2);
                    c13052.L$0 = null;
                    c13052.L$1 = null;
                    c13052.label = 3;
                    objUseConnection$room_runtime_release = BuildersKt.withContext((CoroutineContext) objUseConnection$room_runtime_release, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, c13052);
                    if (objUseConnection$room_runtime_release == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(objUseConnection$room_runtime_release);
        } else {
            ResultKt.throwOnFailure(objUseConnection$room_runtime_release);
            if (roomDatabase.inCompatibilityMode$room_runtime_release() && roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(z2, z, roomDatabase, null, function1);
                c13052.label = 1;
                objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, c13052);
                if (objUseConnection$room_runtime_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                c13052.L$0 = roomDatabase;
                c13052.L$1 = function1;
                c13052.Z$0 = z;
                c13052.Z$1 = z2;
                c13052.label = 2;
                Object coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z2, c13052);
                if (coroutineContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function2 = function1;
                z3 = z2;
                objUseConnection$room_runtime_release = coroutineContext;
                roomDatabase2 = roomDatabase;
                z4 = z;
                DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$2 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(null, roomDatabase2, z4, z3, function2);
                c13052.L$0 = null;
                c13052.L$1 = null;
                c13052.label = 3;
                objUseConnection$room_runtime_release = BuildersKt.withContext((CoroutineContext) objUseConnection$room_runtime_release, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$2, c13052);
                if (objUseConnection$room_runtime_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return objUseConnection$room_runtime_release;
    }

    @Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final Cursor query(@NotNull RoomDatabase db, @NotNull SupportSQLiteQuery sqLiteQuery, boolean z) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return DBUtil.query(db, sqLiteQuery, z, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(@NotNull File databaseFile) throws IOException {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            CloseableKt.closeFinally(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(channel, th);
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final SQLiteConnection toSQLiteConnection(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return new SupportSQLiteConnection(db);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final Cursor query(@NotNull RoomDatabase db, @NotNull SupportSQLiteQuery sqLiteQuery, boolean z, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db.query(sqLiteQuery, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
