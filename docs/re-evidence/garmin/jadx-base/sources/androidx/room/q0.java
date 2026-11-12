package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/room/q0;", "", "Landroidx/room/b0;", "database", "<init>", "(Landroidx/room/b0;)V", "Lvd/g;", "createNewStatement", "()Lvd/g;", "", "canUseCached", "getStmt", "(Z)Lvd/g;", "", "createQuery", "()Ljava/lang/String;", "", "assertNotMainThread", "()V", "acquire", "statement", "release", "(Lvd/g;)V", "Landroidx/room/b0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "Lo13/l;", "stmt", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class q0 {
    private final b0 database;
    private final AtomicBoolean lock;

    /* JADX INFO: renamed from: stmt$delegate, reason: from kotlin metadata */
    private final o13.l stmt;

    public q0(b0 b0Var) {
        b0Var.getClass();
        this.database = b0Var;
        this.lock = new AtomicBoolean(false);
        this.stmt = o13.m.b(new a03.e(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vd.g createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final vd.g getStmt(boolean canUseCached) {
        return canUseCached ? getStmt() : createNewStatement();
    }

    public vd.g acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(vd.g statement) {
        statement.getClass();
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final vd.g getStmt() {
        return (vd.g) this.stmt.getValue();
    }
}
