package kd;

import o13.o;
import p005kotlin.Metadata;
import vd.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkd/a;", "", "", "startVersion", "endVersion", "<init>", "(II)V", "Lvd/c;", "db", "", "migrate", "(Lvd/c;)V", "Lud/a;", "connection", "(Lud/a;)V", "I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {
    public final int endVersion;
    public final int startVersion;

    public a(int i14, int i15) {
        this.startVersion = i14;
        this.endVersion = i15;
    }

    public void migrate(ud.a connection) {
        connection.getClass();
        if (!(connection instanceof xd.a)) {
            throw new o("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        migrate(((xd.a) connection).f189967a);
    }

    public void migrate(c db3) {
        db3.getClass();
        throw new o("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
