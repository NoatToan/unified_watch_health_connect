package wd;

import android.database.sqlite.SQLiteStatement;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd/h;", "Lwd/g;", "Lvd/g;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends g implements vd.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f184356b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.f184356b = sQLiteStatement;
    }

    @Override // vd.g
    public final int b2() {
        return this.f184356b.executeUpdateDelete();
    }

    @Override // vd.g
    public final void execute() {
        this.f184356b.execute();
    }

    @Override // vd.g
    public final long y1() {
        return this.f184356b.executeInsert();
    }
}
