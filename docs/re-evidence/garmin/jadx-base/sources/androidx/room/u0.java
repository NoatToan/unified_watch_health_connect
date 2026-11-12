package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface u0 extends w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/u0$a;", "", "<init>", "(Ljava/lang/String;I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        DEFERRED,
        IMMEDIATE,
        EXCLUSIVE
    }

    Object b(a aVar, e23.p pVar, v13.i iVar);

    Boolean d(t13.d dVar);
}
