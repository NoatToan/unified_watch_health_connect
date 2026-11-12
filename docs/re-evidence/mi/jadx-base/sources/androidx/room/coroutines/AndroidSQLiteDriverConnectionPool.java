package androidx.room.coroutines;

import androidx.room.Transactor;
import androidx.room.coroutines.AndroidSQLiteDriverConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import com.miui.tsmclient.util.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013H\u0096@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/room/coroutines/AndroidSQLiteDriverConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "driver", "Landroidx/sqlite/SQLiteDriver;", "fileName", "", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "androidConnection", "Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "getAndroidConnection", "()Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "androidConnection$delegate", "Lkotlin/Lazy;", "useConnection", "R", "isReadOnly", "", "block", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.EXTRA_CLOSE_TAI, "", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {

    /* JADX INFO: renamed from: androidConnection$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy androidConnection;

    @NotNull
    private final SQLiteDriver driver;

    @NotNull
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(@NotNull SQLiteDriver driver, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.androidConnection = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ta1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidSQLiteDriverConnectionPool.androidConnection_delegate$lambda$0(this.f34490a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection sQLiteConnectionOpen = androidSQLiteDriverConnectionPool.driver.open(androidSQLiteDriverConnectionPool.fileName);
        Intrinsics.checkNotNull(sQLiteConnectionOpen, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
        return new AndroidSQLiteDriverPooledConnection((AndroidSQLiteConnection) sQLiteConnectionOpen);
    }

    private final AndroidSQLiteDriverPooledConnection getAndroidConnection() {
        return (AndroidSQLiteDriverPooledConnection) this.androidConnection.getValue();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        getAndroidConnection().getDelegate().close();
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @Nullable
    public <R> Object useConnection(boolean z, @NotNull Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return function2.invoke(getAndroidConnection(), continuation);
    }
}
