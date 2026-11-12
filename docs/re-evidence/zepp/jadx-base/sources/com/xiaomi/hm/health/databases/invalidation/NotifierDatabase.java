package com.xiaomi.hm.health.databases.invalidation;

import android.database.Cursor;
import com.tekartik.sqflite.Constant;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ+\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J+\u0010\u0017\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0018\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0016\u0010\u001f\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/NotifierDatabase;", "Lorg/greenrobot/greendao/database/Database;", "", "", "tableNames", "", "createInvalidationTracker", "([Ljava/lang/String;)V", "Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker;", "getInvalidationTracker", Constant.PARAM_SQL, "selectionArgs", "Landroid/database/Cursor;", "rawQuery", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "setTransactionSuccessful", "Lorg/greenrobot/greendao/database/DatabaseStatement;", "compileStatement", "", "isDbLockedByCurrentThread", "beginTransaction", "endTransaction", Constant.PARAM_IN_TRANSACTION, "execSQL", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getRawDatabase", "close", "a", "Lorg/greenrobot/greendao/database/Database;", "delegate", "Ljava/util/concurrent/locks/ReentrantLock;", "b", "Ljava/util/concurrent/locks/ReentrantLock;", "closeLock", "c", "Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker;", "invalidationTracker", "<init>", "(Lorg/greenrobot/greendao/database/Database;)V", "database_release"}, k = 1, mv = {1, 5, 1})
public final class NotifierDatabase implements Database {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Database delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ReentrantLock closeLock = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InvalidationTracker invalidationTracker;

    public NotifierDatabase(@NotNull Database database) {
        this.delegate = database;
    }

    @Override // org.greenrobot.greendao.database.Database
    public void beginTransaction() {
        InvalidationTracker invalidationTracker = this.invalidationTracker;
        Objects.requireNonNull(invalidationTracker);
        invalidationTracker.syncTriggers();
        this.delegate.beginTransaction();
    }

    @Override // org.greenrobot.greendao.database.Database
    public void close() {
        try {
            this.closeLock.lock();
            this.delegate.close();
        } finally {
            this.closeLock.unlock();
        }
    }

    @Override // org.greenrobot.greendao.database.Database
    @NotNull
    public DatabaseStatement compileStatement(@Nullable String sql) {
        return this.delegate.compileStatement(sql);
    }

    public final void createInvalidationTracker(@NotNull String[] tableNames) {
        this.invalidationTracker = new InvalidationTracker(this.delegate, this.closeLock, tableNames);
    }

    @Override // org.greenrobot.greendao.database.Database
    public void endTransaction() {
        this.delegate.endTransaction();
        if (inTransaction()) {
            return;
        }
        InvalidationTracker invalidationTracker = this.invalidationTracker;
        Objects.requireNonNull(invalidationTracker);
        invalidationTracker.refreshVersionsAsync();
    }

    @Override // org.greenrobot.greendao.database.Database
    public void execSQL(@Nullable String sql) {
        this.delegate.execSQL(sql);
    }

    @NotNull
    public final InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.invalidationTracker;
        Objects.requireNonNull(invalidationTracker);
        return invalidationTracker;
    }

    @Override // org.greenrobot.greendao.database.Database
    @NotNull
    public Object getRawDatabase() {
        return this.delegate.getRawDatabase();
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // org.greenrobot.greendao.database.Database
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.Database
    @NotNull
    public Cursor rawQuery(@Nullable String sql, @Nullable String[] selectionArgs) {
        return this.delegate.rawQuery(sql, selectionArgs);
    }

    @Override // org.greenrobot.greendao.database.Database
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.Database
    public void execSQL(@Nullable String sql, @Nullable Object[] bindArgs) {
        this.delegate.execSQL(sql, bindArgs);
    }
}
