package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import defpackage.RESUMED;
import defpackage.probeCoroutineCreated;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zga;
import defpackage.zgf;
import defpackage.zho;
import defpackage.zjn;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "()V", "Companion", "room-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private CoroutinesRoom() {
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\r\u0012\t\u0012\u0007H\u0005¢\u0006\u0002\b\u00060\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010J=\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J5\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "()V", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "R", "Lkotlin/jvm/JvmSuppressWildcards;", "db", "Landroidx/room/RoomDatabase;", "inTransaction", "", "tableNames", "", "", "callable", "Ljava/util/concurrent/Callable;", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/Flow;", "execute", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
            CoroutineDispatcher transactionDispatcher;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getF54257c().get(TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return zga.d(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), continuation);
        }

        @JvmStatic
        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, final CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
            CoroutineDispatcher transactionDispatcher;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getF54257c().get(TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            zgf zgfVar = new zgf(zbg.c(continuation), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            final Job jobB = RESUMED.b(zho.f54106b, transactionDispatcher, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, zgfVar2, null), 2, null);
            zgfVar2.invokeOnCancellation(new Function1<Throwable, yzc>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
                    invoke2(th);
                    return yzc.e;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal);
                    Job.b.c(jobB, null, 1, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            return objB;
        }

        @JvmStatic
        public final <R> Flow<R> createFlow(RoomDatabase db, boolean inTransaction, String[] tableNames, Callable<R> callable) {
            zcp.c(db, "");
            zcp.c(tableNames, "");
            zcp.c(callable, "");
            return zjn.e(new CoroutinesRoom$Companion$createFlow$1(inTransaction, db, tableNames, callable, null));
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, callable, continuation);
    }

    @JvmStatic
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, cancellationSignal, callable, continuation);
    }

    @JvmStatic
    public static final <R> Flow<R> createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
        return INSTANCE.createFlow(roomDatabase, z, strArr, callable);
    }
}
