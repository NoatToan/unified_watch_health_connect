package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import o53.e2;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u0000 ¶\u00012\u00020\u0001:\f·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0007\u0010\nJ#\u0010\u0010\u001a\u00020\r2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00010\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\u00010\u0019H\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0011H\u0015¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H$¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u00020-H\u0000¢\u0006\u0004\b0\u0010/J)\u00102\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001b0\u0019H\u0015¢\u0006\u0004\b2\u00103J)\u00104\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u001b0\u0019H\u0015¢\u0006\u0004\b4\u00103J\u001d\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000505H\u0017¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t05H\u0017¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\rH'¢\u0006\u0004\b9\u0010\u0003J+\u0010?\u001a\u00020\r2\u0006\u0010;\u001a\u00020:2\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0<\"\u00020=H\u0005¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\rH\u0017¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010C\u001a\u00020\rH\u0017¢\u0006\u0004\bC\u0010\u0003JB\u0010J\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\u0006\u0010E\u001a\u00020:2\"\u0010I\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000H\u0012\u0006\u0012\u0004\u0018\u00010\u00010FH\u0087@¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020:H\u0007¢\u0006\u0004\bL\u0010MJ+\u0010N\u001a\u00020P2\u0006\u0010N\u001a\u00020=2\u0012\u0010O\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010<H\u0016¢\u0006\u0004\bN\u0010QJ#\u0010N\u001a\u00020P2\u0006\u0010N\u001a\u00020R2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010SH\u0017¢\u0006\u0004\bN\u0010UJ\u0017\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020=H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\rH\u0017¢\u0006\u0004\bZ\u0010\u0003J\u000f\u0010[\u001a\u00020\rH\u0017¢\u0006\u0004\b[\u0010\u0003J\u000f\u0010\\\u001a\u00020\rH\u0017¢\u0006\u0004\b\\\u0010\u0003J\u0017\u0010_\u001a\u00020\r2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J#\u0010_\u001a\u00028\u0000\"\u0004\b\u0000\u0010a2\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000bH\u0016¢\u0006\u0004\b_\u0010cJ\u0017\u0010f\u001a\u00020\r2\u0006\u0010e\u001a\u00020dH\u0015¢\u0006\u0004\bf\u0010gJ\u0017\u0010f\u001a\u00020\r2\u0006\u0010i\u001a\u00020hH\u0005¢\u0006\u0004\bf\u0010jJ\u000f\u0010k\u001a\u00020:H\u0016¢\u0006\u0004\bk\u0010MJ(\u0010m\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020!2\b\u0010l\u001a\u0004\u0018\u00010!H\u0082\b¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\rH\u0002¢\u0006\u0004\bo\u0010\u0003J\u000f\u0010p\u001a\u00020\rH\u0002¢\u0006\u0004\bp\u0010\u0003J\u000f\u0010q\u001a\u00020\rH\u0002¢\u0006\u0004\bq\u0010\u0003J#\u0010_\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000rH\u0002¢\u0006\u0004\b_\u0010sR\u001e\u0010t\u001a\u0004\u0018\u00010d8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bt\u0010u\u0012\u0004\bv\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010wR\u0016\u0010x\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u007f\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u008c\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008b\u0001\u0018\u00010\u001b8\u0004@\u0004X\u0085\u000e¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u0012\u0005\b\u008e\u0001\u0010\u0003R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R#\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u0092\u00018G¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R(\u0010\u0098\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R(\u0010\u009a\u0001\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u008a\u0001\u001a\u0005\b\u009b\u0001\u0010M\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010 \u0001\u001a\u0004\u0018\u00010=8G¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010£\u0001\u001a\u00020|8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¥\u0001\u001a\u00020|8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001R\u0016\u0010l\u001a\u00020!8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010«\u0001\u001a\u00030¨\u00018G¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u00ad\u0001\u001a\u00020'8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010)R0\u0010¯\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u001b0\u00198@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u00103R\u0016\u0010°\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010MR\u0016\u0010²\u0001\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010MR\u0016\u0010´\u0001\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010MR\u0016\u0010µ\u0001\u001a\u00020:8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010M¨\u0006½\u0001"}, d2 = {"Landroidx/room/b0;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lk23/d;", "(Lk23/d;)Ljava/lang/Object;", "kclass", "converter", "", "addTypeConverter$room_runtime", "(Lk23/d;Ljava/lang/Object;)V", "addTypeConverter", "Landroidx/room/c;", "configuration", "init", "(Landroidx/room/c;)V", "Landroidx/room/y;", "createConnectionManager$room_runtime", "(Landroidx/room/c;)Landroidx/room/y;", "createConnectionManager", "", "autoMigrationSpecs", "", "Lkd/a;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "createAutoMigrations", "config", "Lvd/d;", "createOpenHelper", "(Landroidx/room/c;)Lvd/d;", "Landroidx/room/j0;", "createOpenDelegate", "()Landroidx/room/j0;", "Landroidx/room/m;", "createInvalidationTracker", "()Landroidx/room/m;", "Lo53/b0;", "getCoroutineScope", "()Lo53/b0;", "Lt13/g;", "getQueryContext", "()Lt13/g;", "getTransactionContext$room_runtime", "getTransactionContext", "getRequiredTypeConverters", "()Ljava/util/Map;", "getRequiredTypeConverterClasses", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "getRequiredAutoMigrationSpecClasses", "clearAllTables", "", "hasForeignKeys", "", "", "tableNames", "performClear", "(Z[Ljava/lang/String;)V", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "R", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/u0;", "Lt13/d;", "block", "useConnection", "(ZLe23/p;Lt13/d;)Ljava/lang/Object;", "inCompatibilityMode", "()Z", SearchIntents.EXTRA_QUERY, "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lvd/f;", "Landroid/os/CancellationSignal;", "signal", "(Lvd/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Lvd/g;", "compileStatement", "(Ljava/lang/String;)Lvd/g;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", TtmlNode.TAG_BODY, "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lvd/c;", "db", "internalInitInvalidationTracker", "(Lvd/c;)V", "Lud/a;", "connection", "(Lud/a;)V", "inTransaction", "openHelper", "unwrapOpenHelper", "(Lvd/d;)Lvd/d;", "onClosed", "internalBeginTransaction", "internalEndTransaction", "Lkotlin/Function0;", "(Le23/a;)Ljava/lang/Object;", "mDatabase", "Lvd/c;", "getMDatabase$annotations", "Landroidx/room/c;", "coroutineScope", "Lo53/b0;", "transactionContext", "Lt13/g;", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "connectionManager", "Landroidx/room/y;", "internalTracker", "Landroidx/room/m;", "Lid/a;", "closeBarrier", "Lid/a;", "getCloseBarrier$room_runtime", "()Lid/a;", "allowMainThreadQueries", "Z", "Landroidx/room/b0$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "Lld/a;", "autoCloser", "Lld/a;", "Ljava/lang/ThreadLocal;", "suspendingTransactionContext", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionContext", "()Ljava/lang/ThreadLocal;", "", "typeConverters", "Ljava/util/Map;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime", "setUseTempTrackingTable$room_runtime", "(Z)V", "getPath", "()Ljava/lang/String;", "path", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Lvd/d;", "Lud/b;", "getDriver", "()Lud/b;", "driver", "getInvalidationTracker", "invalidationTracker", "getRequiredTypeConverterClassesMap$room_runtime", "requiredTypeConverterClassesMap", "isOpen", "isOpenInternal$room_runtime", "isOpenInternal", "isMainThread$room_runtime", "isMainThread", "isThreadInSuspendingTransaction", "Companion", "d", "a", JWKParameterNames.RSA_EXPONENT, "b", "f", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b0 {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private ld.a autoCloser;
    private c configuration;
    private y connectionManager;
    private o53.b0 coroutineScope;
    private Executor internalQueryExecutor;
    private m internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile vd.c mDatabase;
    private t13.g transactionContext;
    private final id.a closeBarrier = new id.a(new g(this));
    private final ThreadLocal<t13.g> suspendingTransactionContext = new ThreadLocal<>();
    private final Map<k23.d<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/b0$b;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {
        public void a(vd.c cVar) {
            cVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/b0$d;", "", "<init>", "(Ljava/lang/String;I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/b0$e;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f10747a = new LinkedHashMap();

        public final void a(kd.a aVar) {
            aVar.getClass();
            int i14 = aVar.startVersion;
            int i15 = aVar.endVersion;
            Integer numValueOf = Integer.valueOf(i14);
            LinkedHashMap linkedHashMap = this.f10747a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i15))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i15)));
                aVar.toString();
            }
            treeMap2.put(Integer.valueOf(i15), aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/b0$f;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public g(Object obj) {
            super(0, obj, b0.class, "onClosed", "onClosed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() throws Exception {
            ((b0) this.receiver).onClosed();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.p<e23.l<? super t13.d<? super Object>, ? extends Object>, t13.d<? super Object>, Object> {
        public h(Object obj) {
            super(2, obj, e0.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // e23.p
        public final Object invoke(e23.l<? super t13.d<? super Object>, ? extends Object> lVar, t13.d<? super Object> dVar) {
            return dh.b.o((b0) this.receiver, lVar, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class i extends p005kotlin.jvm.internal.q implements e23.p<e23.l<? super t13.d<? super Object>, ? extends Object>, t13.d<? super Object>, Object> {
        public i(Object obj) {
            super(2, obj, e0.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // e23.p
        public final Object invoke(e23.l<? super t13.d<? super Object>, ? extends Object> lVar, t13.d<? super Object> dVar) {
            return dh.b.o((b0) this.receiver, lVar, dVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {531}, m = "invokeSuspend")
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10748a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f10751d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/u0;", "connection", "", "<anonymous>", "(Landroidx/room/u0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {532, 533, 535, 541, 542, 543}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<u0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10752a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f10753b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f10754c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f10755d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String[] f10756e;

            /* JADX INFO: renamed from: androidx.room.b0$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/t0;", "", "<anonymous>", "(Landroidx/room/t0;)V"}, k = 3, mv = {2, 1, 0})
            @v13.e(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {537, 539}, m = "invokeSuspend")
            public static final class C0150a extends v13.i implements e23.p<t0<Unit>, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public String[] f10757a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f10758b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f10759c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f10760d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public /* synthetic */ Object f10761e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f10762f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String[] f10763g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0150a(boolean z14, String[] strArr, t13.d<? super C0150a> dVar) {
                    super(2, dVar);
                    this.f10762f = z14;
                    this.f10763g = strArr;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C0150a c0150a = new C0150a(this.f10762f, this.f10763g, dVar);
                    c0150a.f10761e = obj;
                    return c0150a;
                }

                @Override // e23.p
                public final Object invoke(t0<Unit> t0Var, t13.d<? super Unit> dVar) {
                    return ((C0150a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:17:0x004c  */
                /* JADX WARN: Code duplicated, block: B:21:0x0069  */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
                
                    if (androidx.room.v0.a(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
                
                    if (androidx.room.v0.a(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
                @Override // v13.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    t0 t0Var;
                    t0 t0Var2;
                    int length;
                    int i14;
                    String[] strArr;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = this.f10760d;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            t0Var = (t0) this.f10761e;
                            o13.r.b(obj);
                        } else {
                            if (i15 != 2) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            length = this.f10759c;
                            i14 = this.f10758b;
                            strArr = this.f10757a;
                            t0Var2 = (t0) this.f10761e;
                            o13.r.b(obj);
                        }
                        i14++;
                        if (i14 < length) {
                            return Unit.INSTANCE;
                        }
                        String strC = o2.c.c('`', "DELETE FROM `", strArr[i14]);
                        this.f10761e = t0Var2;
                        this.f10757a = strArr;
                        this.f10758b = i14;
                        this.f10759c = length;
                        this.f10760d = 2;
                    } else {
                        o13.r.b(obj);
                        t0Var = (t0) this.f10761e;
                        if (this.f10762f) {
                            this.f10761e = t0Var;
                            this.f10760d = 1;
                        }
                    }
                    String[] strArr2 = this.f10763g;
                    t0Var2 = t0Var;
                    length = strArr2.length;
                    i14 = 0;
                    strArr = strArr2;
                    if (i14 < length) {
                        return Unit.INSTANCE;
                    }
                    String strC2 = o2.c.c('`', "DELETE FROM `", strArr[i14]);
                    this.f10761e = t0Var2;
                    this.f10757a = strArr;
                    this.f10758b = i14;
                    this.f10759c = length;
                    this.f10760d = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0 b0Var, boolean z14, String[] strArr, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f10754c = b0Var;
                this.f10755d = z14;
                this.f10756e = strArr;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f10754c, this.f10755d, this.f10756e, dVar);
                aVar.f10753b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(u0 u0Var, t13.d<? super Unit> dVar) {
                return ((a) create(u0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x005e  */
            /* JADX WARN: Code duplicated, block: B:21:0x006e A[PHI: r1
              0x006e: PHI (r1v7 androidx.room.u0) = (r1v4 androidx.room.u0), (r1v4 androidx.room.u0), (r1v9 androidx.room.u0) binds: [B:17:0x005c, B:19:0x006b, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:24:0x0085 A[PHI: r1
              0x0085: PHI (r1v10 androidx.room.u0) = (r1v7 androidx.room.u0), (r1v12 androidx.room.u0) binds: [B:22:0x0082, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:27:0x0091 A[PHI: r1 r9
              0x0091: PHI (r1v13 androidx.room.u0) = (r1v10 androidx.room.u0), (r1v15 androidx.room.u0) binds: [B:25:0x008e, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
              0x0091: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:25:0x008e, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:29:0x0099  */
            /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[PHI: r1
              0x00a7: PHI (r1v16 androidx.room.u0) = (r1v13 androidx.room.u0), (r1v18 androidx.room.u0) binds: [B:30:0x00a4, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
            
                if (androidx.room.v0.a(r1, "VACUUM", r8) == r0) goto L34;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u0 u0Var;
                m invalidationTracker;
                u0.a aVar;
                C0150a c0150a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f10752a;
                b0 b0Var = this.f10754c;
                switch (i14) {
                    case 0:
                        o13.r.b(obj);
                        u0 u0Var2 = (u0) this.f10753b;
                        this.f10753b = u0Var2;
                        this.f10752a = 1;
                        Boolean boolD = u0Var2.d(this);
                        if (boolD != aVar2) {
                            u0Var = u0Var2;
                            obj = boolD;
                            if (((Boolean) obj).booleanValue()) {
                                aVar = u0.a.IMMEDIATE;
                                c0150a = new C0150a(this.f10755d, this.f10756e, null);
                                this.f10753b = u0Var;
                                this.f10752a = 3;
                                if (u0Var.b(aVar, c0150a, this) != aVar2) {
                                    this.f10753b = u0Var;
                                    this.f10752a = 4;
                                    obj = u0Var.d(this);
                                    if (obj != aVar2) {
                                        if (!((Boolean) obj).booleanValue()) {
                                            this.f10753b = u0Var;
                                            this.f10752a = 5;
                                            if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                                this.f10753b = null;
                                                this.f10752a = 6;
                                            }
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                invalidationTracker = b0Var.getInvalidationTracker();
                                this.f10753b = u0Var;
                                this.f10752a = 2;
                                if (invalidationTracker.d(this) != aVar2) {
                                    aVar = u0.a.IMMEDIATE;
                                    c0150a = new C0150a(this.f10755d, this.f10756e, null);
                                    this.f10753b = u0Var;
                                    this.f10752a = 3;
                                    if (u0Var.b(aVar, c0150a, this) != aVar2) {
                                        this.f10753b = u0Var;
                                        this.f10752a = 4;
                                        obj = u0Var.d(this);
                                        if (obj != aVar2) {
                                            if (!((Boolean) obj).booleanValue()) {
                                                this.f10753b = u0Var;
                                                this.f10752a = 5;
                                                if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                                    this.f10753b = null;
                                                    this.f10752a = 6;
                                                }
                                                break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 1:
                        u0Var = (u0) this.f10753b;
                        o13.r.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            invalidationTracker = b0Var.getInvalidationTracker();
                            this.f10753b = u0Var;
                            this.f10752a = 2;
                            if (invalidationTracker.d(this) != aVar2) {
                                aVar = u0.a.IMMEDIATE;
                                c0150a = new C0150a(this.f10755d, this.f10756e, null);
                                this.f10753b = u0Var;
                                this.f10752a = 3;
                                if (u0Var.b(aVar, c0150a, this) != aVar2) {
                                    this.f10753b = u0Var;
                                    this.f10752a = 4;
                                    obj = u0Var.d(this);
                                    if (obj != aVar2) {
                                        if (!((Boolean) obj).booleanValue()) {
                                            this.f10753b = u0Var;
                                            this.f10752a = 5;
                                            if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                                this.f10753b = null;
                                                this.f10752a = 6;
                                            }
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        } else {
                            aVar = u0.a.IMMEDIATE;
                            c0150a = new C0150a(this.f10755d, this.f10756e, null);
                            this.f10753b = u0Var;
                            this.f10752a = 3;
                            if (u0Var.b(aVar, c0150a, this) != aVar2) {
                                this.f10753b = u0Var;
                                this.f10752a = 4;
                                obj = u0Var.d(this);
                                if (obj != aVar2) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f10753b = u0Var;
                                        this.f10752a = 5;
                                        if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                            this.f10753b = null;
                                            this.f10752a = 6;
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        return aVar2;
                    case 2:
                        u0Var = (u0) this.f10753b;
                        o13.r.b(obj);
                        aVar = u0.a.IMMEDIATE;
                        c0150a = new C0150a(this.f10755d, this.f10756e, null);
                        this.f10753b = u0Var;
                        this.f10752a = 3;
                        if (u0Var.b(aVar, c0150a, this) != aVar2) {
                            this.f10753b = u0Var;
                            this.f10752a = 4;
                            obj = u0Var.d(this);
                            if (obj != aVar2) {
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f10753b = u0Var;
                                    this.f10752a = 5;
                                    if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                        this.f10753b = null;
                                        this.f10752a = 6;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar2;
                    case 3:
                        u0Var = (u0) this.f10753b;
                        o13.r.b(obj);
                        this.f10753b = u0Var;
                        this.f10752a = 4;
                        obj = u0Var.d(this);
                        if (obj != aVar2) {
                            if (!((Boolean) obj).booleanValue()) {
                                this.f10753b = u0Var;
                                this.f10752a = 5;
                                if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                    this.f10753b = null;
                                    this.f10752a = 6;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        return aVar2;
                    case 4:
                        u0Var = (u0) this.f10753b;
                        o13.r.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.f10753b = u0Var;
                            this.f10752a = 5;
                            if (v0.a(u0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                this.f10753b = null;
                                this.f10752a = 6;
                                break;
                            }
                            return aVar2;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        u0Var = (u0) this.f10753b;
                        o13.r.b(obj);
                        this.f10753b = null;
                        this.f10752a = 6;
                        break;
                    case 6:
                        o13.r.b(obj);
                        m invalidationTracker2 = b0Var.getInvalidationTracker();
                        invalidationTracker2.f10883e.e(invalidationTracker2.f10887i, invalidationTracker2.f10888j);
                        return Unit.INSTANCE;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z14, String[] strArr, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f10750c = z14;
            this.f10751d = strArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b0.this.new j(this.f10750c, this.f10751d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f10748a;
            if (i14 == 0) {
                o13.r.b(obj);
                b0 b0Var = b0.this;
                y yVar = b0Var.connectionManager;
                if (yVar == null) {
                    p005kotlin.jvm.internal.s.m("connectionManager");
                    throw null;
                }
                a aVar2 = new a(b0Var, this.f10750c, this.f10751d, null);
                this.f10748a = 1;
                if (yVar.f10993f.V1(false, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vd.d createConnectionManager$lambda$2(b0 b0Var, c cVar) {
        cVar.getClass();
        return b0Var.createOpenHelper(cVar);
    }

    @o13.e
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @o13.e
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        vd.c writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.D()) {
            m invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            jd.x.a(new p(invalidationTracker, null));
        }
        if (writableDatabase.j4()) {
            writableDatabase.g2();
        } else {
            writableDatabase.F();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().y3();
        if (inTransaction()) {
            return;
        }
        m invalidationTracker = getInvalidationTracker();
        invalidationTracker.f10883e.e(invalidationTracker.f10887i, invalidationTracker.f10888j);
    }

    private final boolean isThreadInSuspendingTransaction() {
        t13.g gVar = this.suspendingTransactionContext.get();
        return (gVar != null ? (r0) gVar.get(r0.f10943b) : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() throws Exception {
        o53.b0 b0Var = this.coroutineScope;
        if (b0Var == null) {
            p005kotlin.jvm.internal.s.m("coroutineScope");
            throw null;
        }
        o53.c0.c(b0Var, null);
        r rVar = getInvalidationTracker().f10891m;
        if (rVar != null) {
            rVar.a();
        }
        y yVar = this.connectionManager;
        if (yVar == null) {
            p005kotlin.jvm.internal.s.m("connectionManager");
            throw null;
        }
        yVar.f10993f.close();
        vd.d dVar = yVar.f10994g;
        if (dVar != null) {
            dVar.close();
        }
    }

    public static /* synthetic */ Cursor query$default(b0 b0Var, vd.f fVar, CancellationSignal cancellationSignal, int i14, Object obj) {
        if (obj != null) {
            org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i14 & 2) != 0) {
            cancellationSignal = null;
        }
        return b0Var.query(fVar, cancellationSignal);
    }

    private final <T> T runInTransaction(e23.a<? extends T> body) {
        if (!inCompatibilityMode()) {
            return (T) gl1.d.O(this, false, true, new a03.h0(body, 4));
        }
        beginTransaction();
        try {
            T tInvoke = body.invoke();
            setTransactionSuccessful();
            return tInvoke;
        } finally {
            endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(e23.a aVar, ud.a aVar2) {
        aVar2.getClass();
        return aVar.invoke();
    }

    private final <T extends vd.d> T unwrapOpenHelper(vd.d openHelper) {
        if (openHelper == null) {
            return null;
        }
        p005kotlin.jvm.internal.s.l();
        throw null;
    }

    public final void addTypeConverter$room_runtime(k23.d<?> kclass, Object converter) {
        kclass.getClass();
        converter.getClass();
        this.typeConverters.put(kclass, converter);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            vb.h.z("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode() && !inTransaction() && isThreadInSuspendingTransaction()) {
            vb.h.z("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @o13.e
    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public abstract void clearAllTables();

    public void close() {
        id.a aVar = this.closeBarrier;
        synchronized (aVar) {
            if (aVar.f92647c.compareAndSet(false, true)) {
                Unit unit = Unit.INSTANCE;
                while (aVar.f92646b.get() != 0) {
                }
                aVar.f92645a.invoke();
            }
        }
    }

    public vd.g compileStatement(String sql) {
        sql.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().C1(sql);
    }

    public List<kd.a> createAutoMigrations(Map<k23.d<Object>, Object> autoMigrationSpecs) {
        autoMigrationSpecs.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(dh.b.u((k23.d) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final y createConnectionManager$room_runtime(c configuration) {
        i0 i0Var;
        configuration.getClass();
        try {
            j0 j0VarCreateOpenDelegate = createOpenDelegate();
            j0VarCreateOpenDelegate.getClass();
            i0Var = (i0) j0VarCreateOpenDelegate;
        } catch (o13.o unused) {
            i0Var = null;
        }
        return i0Var == null ? new y(configuration, new a03.f(this, 15), new h(this)) : new y(configuration, i0Var, new i(this));
    }

    public abstract m createInvalidationTracker();

    public j0 createOpenDelegate() {
        throw new o13.o(null, 1, null);
    }

    @o13.e
    public vd.d createOpenHelper(c config) {
        config.getClass();
        throw new o13.o(null, 1, null);
    }

    @o13.e
    public void endTransaction() {
        internalEndTransaction();
    }

    @o13.e
    public List<kd.a> getAutoMigrations(Map<Class<Object>, Object> autoMigrationSpecs) {
        autoMigrationSpecs.getClass();
        return p13.j0.f134944a;
    }

    /* JADX INFO: renamed from: getCloseBarrier$room_runtime, reason: from getter */
    public final id.a getCloseBarrier() {
        return this.closeBarrier;
    }

    public final o53.b0 getCoroutineScope() {
        o53.b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        p005kotlin.jvm.internal.s.m("coroutineScope");
        throw null;
    }

    public final ud.b getDriver() {
        c cVar = this.configuration;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("configuration");
            throw null;
        }
        ud.b bVar = cVar.f10790u;
        if (bVar != null) {
            return bVar;
        }
        vb.h.z("No SQLiteDriver was configured with Room.");
        return null;
    }

    public m getInvalidationTracker() {
        m mVar = this.internalTracker;
        if (mVar != null) {
            return mVar;
        }
        p005kotlin.jvm.internal.s.m("internalTracker");
        throw null;
    }

    public vd.d getOpenHelper() {
        y yVar = this.connectionManager;
        if (yVar == null) {
            p005kotlin.jvm.internal.s.m("connectionManager");
            throw null;
        }
        vd.d dVar = yVar.f10994g;
        if (dVar != null) {
            return dVar;
        }
        vb.h.z("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final String getPath() {
        c cVar = this.configuration;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("configuration");
            throw null;
        }
        String str = cVar.f10771b;
        if (str == null) {
            return null;
        }
        if (cVar != null) {
            return cVar.f10770a.getDatabasePath(str).getPath();
        }
        p005kotlin.jvm.internal.s.m("configuration");
        throw null;
    }

    public final t13.g getQueryContext() {
        o53.b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            return b0Var.getF195311f();
        }
        p005kotlin.jvm.internal.s.m("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        p005kotlin.jvm.internal.s.m("internalQueryExecutor");
        throw null;
    }

    public Set<k23.d<Object>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(p13.y.r(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(dh.b.x((Class) it.next()));
        }
        return p13.h0.g1(arrayList);
    }

    @o13.e
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return p13.l0.f134950a;
    }

    public Map<k23.d<?>, List<k23.d<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        int iA = p13.t0.a(p13.y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            k23.d dVarX = dh.b.x(cls);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(dh.b.x((Class) it3.next()));
            }
            o13.p pVar = new o13.p(dVarX, arrayList);
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        return linkedHashMap;
    }

    public final Map<k23.d<?>, List<k23.d<?>>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }

    public final ThreadLocal<t13.g> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    public final t13.g getTransactionContext$room_runtime() {
        t13.g gVar = this.transactionContext;
        if (gVar != null) {
            return gVar;
        }
        p005kotlin.jvm.internal.s.m("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        p005kotlin.jvm.internal.s.m("internalTransactionExecutor");
        throw null;
    }

    @o13.e
    public <T> T getTypeConverter(Class<T> klass) {
        klass.getClass();
        return (T) this.typeConverters.get(p005kotlin.jvm.internal.s0.f105811a.b(klass));
    }

    /* JADX INFO: renamed from: getUseTempTrackingTable$room_runtime, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        y yVar = this.connectionManager;
        if (yVar != null) {
            return yVar.f10994g != null;
        }
        p005kotlin.jvm.internal.s.m("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().getWritableDatabase().D();
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x006a A[LOOP:0: B:3:0x0036->B:16:0x006a, LOOP_END] */
    public void init(c configuration) {
        Executor r0Var;
        t13.g f7937b;
        boolean zContainsKey;
        int i14;
        int i15;
        configuration.getClass();
        String str = configuration.f10771b;
        Intent intent = configuration.f10779j;
        t13.g gVar = configuration.f10791v;
        this.configuration = configuration;
        this.useTempTrackingTable = configuration.f10793x;
        this.connectionManager = createConnectionManager$room_runtime(configuration);
        this.internalTracker = createInvalidationTracker();
        e eVar = configuration.f10773d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<k23.d<Object>> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List<Object> list = configuration.f10788s;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator<k23.d<Object>> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i16 = -1;
            if (!it.hasNext()) {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i17 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            vb.h.s("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            return;
                        } else if (i17 < 0) {
                            break;
                        } else {
                            size2 = i17;
                        }
                    }
                }
                for (kd.a aVar : createAutoMigrations(linkedHashMap)) {
                    int i18 = aVar.startVersion;
                    int i19 = aVar.endVersion;
                    LinkedHashMap linkedHashMap2 = eVar.f10747a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i18))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i18));
                        if (map == null) {
                            map = p13.k0.f134949a;
                            map.getClass();
                        }
                        zContainsKey = map.containsKey(Integer.valueOf(i19));
                    } else {
                        zContainsKey = false;
                    }
                    if (!zContainsKey) {
                        eVar.a(aVar);
                    }
                }
                Map<k23.d<?>, List<k23.d<?>>> requiredTypeConverterClassesMap$room_runtime = getRequiredTypeConverterClassesMap$room_runtime();
                List<Object> list2 = configuration.f10787r;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry<k23.d<?>, List<k23.d<?>>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
                    k23.d<?> key = entry.getKey();
                    for (k23.d<?> dVar : entry.getValue()) {
                        int size3 = list2.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i24 = size3 - 1;
                            if (dVar.q(list2.get(size3))) {
                                zArr2[size3] = true;
                                break;
                            } else {
                                if (i24 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i24;
                            }
                        }
                        if (size3 < 0) {
                            androidx.core.view.j.z(dVar.getF16141b(), ") for ", key.getF16141b(), " is missing in the database configuration.", "A required type converter (");
                            return;
                        }
                        addTypeConverter$room_runtime(dVar, list2.get(size3));
                    }
                }
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i25 = size4 - 1;
                        if (!zArr2[size4]) {
                            vb.h.s(org.apache.commons.lang3.e.f("Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", list2.get(size4)));
                            return;
                        } else if (i25 < 0) {
                            break;
                        } else {
                            size4 = i25;
                        }
                    }
                }
                if (gVar != null) {
                    t13.g.a aVar2 = gVar.get(t13.e.f161746w0);
                    aVar2.getClass();
                    o53.z zVar = (o53.z) aVar2;
                    o53.c1 c1Var = zVar instanceof o53.c1 ? (o53.c1) zVar : null;
                    if (c1Var == null || (r0Var = c1Var.getExecutor()) == null) {
                        r0Var = new o53.r0(zVar);
                    }
                    this.internalQueryExecutor = r0Var;
                    this.internalTransactionExecutor = new s0(r0Var);
                    this.coroutineScope = o53.c0.a(gVar.plus(new e2((l1) gVar.get(l1.f129368i0))));
                    boolean zInCompatibilityMode = inCompatibilityMode();
                    o53.b0 b0Var = this.coroutineScope;
                    if (zInCompatibilityMode) {
                        if (b0Var == null) {
                            p005kotlin.jvm.internal.s.m("coroutineScope");
                            throw null;
                        }
                        f7937b = b0Var.getF195311f().plus(zVar.limitedParallelism(1));
                    } else {
                        if (b0Var == null) {
                            p005kotlin.jvm.internal.s.m("coroutineScope");
                            throw null;
                        }
                        f7937b = b0Var.getF195311f();
                    }
                    this.transactionContext = f7937b;
                } else {
                    this.internalQueryExecutor = configuration.f10777h;
                    this.internalTransactionExecutor = new s0(configuration.f10778i);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        p005kotlin.jvm.internal.s.m("internalQueryExecutor");
                        throw null;
                    }
                    u53.d dVarA = o53.c0.a(gl1.y.o(executor).plus(ge1.b.h()));
                    this.coroutineScope = dVarA;
                    t13.g gVar2 = dVarA.f168725a;
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        p005kotlin.jvm.internal.s.m("internalTransactionExecutor");
                        throw null;
                    }
                    this.transactionContext = gVar2.plus(gl1.y.o(executor2));
                }
                this.allowMainThreadQueries = configuration.f10775f;
                y yVar = this.connectionManager;
                if (yVar == null) {
                    p005kotlin.jvm.internal.s.m("connectionManager");
                    throw null;
                }
                vd.d delegate = yVar.f10994g;
                if (delegate == null) {
                    delegate = null;
                    break;
                }
                while (!(delegate instanceof ld.d)) {
                    if (!(delegate instanceof androidx.room.d)) {
                        delegate = null;
                        break;
                    }
                    delegate = ((androidx.room.d) delegate).getF112024f();
                }
                ld.d dVar2 = (ld.d) delegate;
                if (dVar2 != null) {
                    dVar2.f112025g = configuration;
                }
                y yVar2 = this.connectionManager;
                if (yVar2 == null) {
                    p005kotlin.jvm.internal.s.m("connectionManager");
                    throw null;
                }
                vd.d delegate2 = yVar2.f10994g;
                if (delegate2 == null) {
                    delegate2 = null;
                    break;
                }
                while (!(delegate2 instanceof ld.b)) {
                    if (!(delegate2 instanceof androidx.room.d)) {
                        delegate2 = null;
                        break;
                    }
                    delegate2 = ((androidx.room.d) delegate2).getF112024f();
                }
                ld.b bVar = (ld.b) delegate2;
                if (bVar != null) {
                    ld.a aVar3 = bVar.f112003b;
                    this.autoCloser = aVar3;
                    o53.b0 b0Var2 = this.coroutineScope;
                    if (b0Var2 == null) {
                        p005kotlin.jvm.internal.s.m("coroutineScope");
                        throw null;
                    }
                    aVar3.f111991c = b0Var2;
                    m invalidationTracker = getInvalidationTracker();
                    invalidationTracker.getClass();
                    invalidationTracker.f10886h = aVar3;
                    aVar3.f111992d = new o(invalidationTracker);
                }
                if (intent != null) {
                    if (str == null) {
                        vb.h.s("Required value was null.");
                        return;
                    }
                    m invalidationTracker2 = getInvalidationTracker();
                    Context context = configuration.f10770a;
                    invalidationTracker2.getClass();
                    context.getClass();
                    invalidationTracker2.f10890l = intent;
                    invalidationTracker2.f10891m = new r(context, str, invalidationTracker2);
                    return;
                }
                return;
            }
            k23.d<Object> next = it.next();
            int size5 = list.size() - 1;
            if (size5 >= 0) {
                while (true) {
                    int i26 = size5 - 1;
                    i14 = i16;
                    if (next.q(list.get(size5))) {
                        zArr[size5] = true;
                        i15 = size5;
                        break;
                    } else if (i26 >= 0) {
                        size5 = i26;
                        i16 = i14;
                    }
                }
                if (i15 >= 0) {
                    androidx.core.view.j.s("A required auto migration spec (", next.getF16141b(), ") is missing in the database configuration.");
                    return;
                }
                linkedHashMap.put(next, list.get(i15));
            } else {
                i14 = -1;
            }
            i15 = i14;
            if (i15 >= 0) {
                androidx.core.view.j.s("A required auto migration spec (", next.getF16141b(), ") is missing in the database configuration.");
                return;
            }
            linkedHashMap.put(next, list.get(i15));
        }
    }

    public final void internalInitInvalidationTracker(ud.a connection) {
        connection.getClass();
        m invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        x0 x0Var = invalidationTracker.f10883e;
        x0Var.getClass();
        ud.c cVarM0 = connection.M0("PRAGMA query_only");
        try {
            cVarM0.J0();
            boolean zP3 = cVarM0.P3();
            zf.b.h(cVarM0, null);
            if (!zP3) {
                oe2.f.o(connection, "PRAGMA temp_store = MEMORY");
                oe2.f.o(connection, "PRAGMA recursive_triggers = 1");
                oe2.f.o(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (x0Var.f10978d) {
                    oe2.f.o(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    oe2.f.o(connection, d53.u.v("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                s sVar = x0Var.f10982h;
                ReentrantLock reentrantLock = sVar.f10945a;
                reentrantLock.lock();
                try {
                    sVar.f10948d = true;
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            synchronized (invalidationTracker.f10892n) {
                try {
                    r rVar = invalidationTracker.f10891m;
                    if (rVar != null) {
                        Intent intent = invalidationTracker.f10890l;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (rVar.f10929e.compareAndSet(true, false)) {
                            rVar.f10927c.bindService(intent, rVar.f10935k, 1);
                            m mVar = rVar.f10926b;
                            r.b bVar = rVar.f10933i;
                            bVar.getClass();
                            mVar.a(bVar);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                zf.b.h(cVarM0, th5);
                throw th6;
            }
        }
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        ld.a aVar = this.autoCloser;
        if (aVar != null) {
            return !aVar.f111998j;
        }
        y yVar = this.connectionManager;
        if (yVar == null) {
            p005kotlin.jvm.internal.s.m("connectionManager");
            throw null;
        }
        vd.c cVar = yVar.f10995h;
        if (cVar != null) {
            return cVar.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal$room_runtime() {
        ld.a aVar = this.autoCloser;
        if (aVar != null) {
            vd.c cVar = aVar.f111997i;
            if (cVar != null) {
                return cVar.isOpen();
            }
            return false;
        }
        y yVar = this.connectionManager;
        if (yVar == null) {
            p005kotlin.jvm.internal.s.m("connectionManager");
            throw null;
        }
        vd.c cVar2 = yVar.f10995h;
        if (cVar2 != null) {
            return cVar2.isOpen();
        }
        return false;
    }

    public final void performClear(boolean hasForeignKeys, String... tableNames) {
        tableNames.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        jd.x.a(new j(hasForeignKeys, tableNames, null));
    }

    public Cursor query(vd.f query, CancellationSignal signal) {
        query.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return signal != null ? getOpenHelper().getWritableDatabase().I(query, signal) : getOpenHelper().getWritableDatabase().J1(query);
    }

    @o13.e
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().t3();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z14) {
        this.useTempTrackingTable = z14;
    }

    public final <R> Object useConnection(boolean z14, e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super R> dVar) {
        y yVar = this.connectionManager;
        if (yVar != null) {
            return yVar.f10993f.V1(z14, pVar, dVar);
        }
        p005kotlin.jvm.internal.s.m("connectionManager");
        throw null;
    }

    public final <T> T getTypeConverter(k23.d<T> klass) {
        klass.getClass();
        T t7 = (T) this.typeConverters.get(klass);
        t7.getClass();
        return t7;
    }

    public Cursor query(String query, Object[] args) {
        query.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().J1(new vd.a(query, args));
    }

    public <V> V runInTransaction(Callable<V> body) {
        body.getClass();
        return (V) runInTransaction(new a03.e(body, 17));
    }

    public void runInTransaction(Runnable body) {
        body.getClass();
        runInTransaction(new a03.e(body, 16));
    }

    public final Cursor query(vd.f fVar) {
        fVar.getClass();
        return query$default(this, fVar, null, 2, null);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B9\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB)\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/room/b0$a;", "Landroidx/room/b0;", "T", "", "Lk23/d;", "klass", "", "name", "Lkotlin/Function0;", "factory", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lk23/d;Ljava/lang/String;Le23/a;Landroid/content/Context;)V", "Ljava/lang/Class;", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a<T extends b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k23.d<T> f10723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f10724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.a<T> f10726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f10727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f10728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Executor f10729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Executor f10730h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public n00.b f10731i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f10732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final d f10733k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f10734l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final e f10735m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final LinkedHashSet f10736n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final LinkedHashSet f10737o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ArrayList f10738p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f10739q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f10740r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f10741s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f10742t;

        public a(Context context, Class<T> cls, String str) {
            context.getClass();
            cls.getClass();
            this.f10727e = new ArrayList();
            this.f10728f = new ArrayList();
            this.f10733k = d.AUTOMATIC;
            this.f10734l = -1L;
            this.f10735m = new e();
            this.f10736n = new LinkedHashSet();
            this.f10737o = new LinkedHashSet();
            this.f10738p = new ArrayList();
            this.f10739q = true;
            this.f10742t = true;
            this.f10723a = p005kotlin.jvm.internal.s0.f105811a.b(cls);
            this.f10724b = context;
            this.f10725c = str;
            this.f10726d = null;
        }

        public final void a(kd.a... aVarArr) {
            for (kd.a aVar : aVarArr) {
                Integer numValueOf = Integer.valueOf(aVar.startVersion);
                LinkedHashSet linkedHashSet = this.f10737o;
                linkedHashSet.add(numValueOf);
                linkedHashSet.add(Integer.valueOf(aVar.endVersion));
            }
            kd.a[] aVarArr2 = (kd.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            e eVar = this.f10735m;
            eVar.getClass();
            for (kd.a aVar2 : aVarArr2) {
                eVar.a(aVar2);
            }
        }

        public final T b() {
            String name;
            String str;
            T tInvoke;
            Executor executor = this.f10729g;
            if (executor == null && this.f10730h == null) {
                bv2.g gVar = n.a.f122012d;
                this.f10730h = gVar;
                this.f10729g = gVar;
            } else if (executor != null && this.f10730h == null) {
                this.f10730h = executor;
            } else if (executor == null) {
                this.f10729g = this.f10730h;
            }
            LinkedHashSet linkedHashSet = this.f10737o;
            linkedHashSet.getClass();
            LinkedHashSet linkedHashSet2 = this.f10736n;
            linkedHashSet2.getClass();
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                        vb.h.x(am.j.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                        return null;
                    }
                }
            }
            vd.d.c fVar = this.f10731i;
            if (fVar == null) {
                fVar = new wd.f();
            }
            vd.d.c cVar = fVar;
            if (this.f10734l > 0) {
                if (this.f10725c != null) {
                    vb.h.s("Required value was null.");
                    return null;
                }
                vb.h.s("Cannot create auto-closing database for an in-memory database.");
                return null;
            }
            boolean z14 = this.f10732j;
            d dVar = this.f10733k;
            dVar.getClass();
            Context context = this.f10724b;
            context.getClass();
            if (dVar == d.AUTOMATIC) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                dVar = (activityManager == null || activityManager.isLowRamDevice()) ? d.TRUNCATE : d.WRITE_AHEAD_LOGGING;
            }
            Executor executor2 = this.f10729g;
            if (executor2 == null) {
                vb.h.s("Required value was null.");
                return null;
            }
            Executor executor3 = this.f10730h;
            if (executor3 == null) {
                vb.h.s("Required value was null.");
                return null;
            }
            c cVar2 = new c(context, this.f10725c, cVar, this.f10735m, this.f10727e, z14, dVar, executor2, executor3, null, this.f10739q, this.f10740r, linkedHashSet2, null, null, null, null, this.f10728f, this.f10738p, this.f10741s, null, null);
            cVar2.f10793x = this.f10742t;
            e23.a<T> aVar = this.f10726d;
            if (aVar == null || (tInvoke = aVar.invoke()) == null) {
                Class clsU = dh.b.u(this.f10723a);
                Package r14 = clsU.getPackage();
                if (r14 == null || (name = r14.getName()) == null) {
                    name = "";
                }
                String canonicalName = clsU.getCanonicalName();
                canonicalName.getClass();
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strReplace = canonicalName.replace('.', '_');
                strReplace.getClass();
                String strConcat = strReplace.concat("_Impl");
                try {
                    if (name.length() == 0) {
                        str = strConcat;
                    } else {
                        str = name + '.' + strConcat;
                    }
                    Class<?> cls = Class.forName(str, true, clsU.getClassLoader());
                    cls.getClass();
                    tInvoke = (T) cls.getDeclaredConstructor(null).newInstance(null);
                } catch (ClassNotFoundException e4) {
                    a0.t("Cannot find implementation for ", clsU.getCanonicalName(), ". ", strConcat, " does not exist. Is Room annotation processor correctly configured?", e4);
                    return null;
                } catch (IllegalAccessException e14) {
                    androidx.core.view.j.u("Cannot access the constructor ", clsU.getCanonicalName(), e14);
                    return null;
                } catch (InstantiationException e15) {
                    androidx.core.view.j.u("Failed to create an instance of ", clsU.getCanonicalName(), e15);
                    return null;
                }
            }
            tInvoke.init(cVar2);
            return tInvoke;
        }

        @o13.e
        public final void c() {
            this.f10739q = false;
            this.f10740r = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(k23.d<T> dVar, String str, e23.a<? extends T> aVar, Context context) {
            dVar.getClass();
            context.getClass();
            this.f10727e = new ArrayList();
            this.f10728f = new ArrayList();
            this.f10733k = d.AUTOMATIC;
            this.f10734l = -1L;
            this.f10735m = new e();
            this.f10736n = new LinkedHashSet();
            this.f10737o = new LinkedHashSet();
            this.f10738p = new ArrayList();
            this.f10739q = true;
            this.f10742t = true;
            this.f10723a = dVar;
            this.f10724b = context;
            this.f10725c = str;
            this.f10726d = aVar;
        }
    }

    @o13.e
    public void internalInitInvalidationTracker(vd.c db3) {
        db3.getClass();
        internalInitInvalidationTracker(new xd.a(db3));
    }
}
