package androidx.room;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/x;", "", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10972a = 0;

    static {
        new x();
    }

    private x() {
    }

    public static final <T extends b0> b0.a<T> a(Context context, Class<T> cls, String str) {
        context.getClass();
        if (d53.w.J(str)) {
            vb.h.s("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new b0.a<>(context, cls, str);
        }
        vb.h.s("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }
}
