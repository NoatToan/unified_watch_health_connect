package androidx.room;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/room/v;", "", "Landroidx/room/m$b;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/m$b;[I[Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.b f10967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f10969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f10970d;

    public v(m.b bVar, int[] iArr, String[] strArr) {
        bVar.getClass();
        iArr.getClass();
        strArr.getClass();
        this.f10967a = bVar;
        this.f10968b = iArr;
        this.f10969c = strArr;
        if (iArr.length == strArr.length) {
            this.f10970d = !(strArr.length == 0) ? p13.a1.b(strArr[0]) : p13.l0.f134950a;
        } else {
            vb.h.z("Check failed.");
            throw null;
        }
    }
}
