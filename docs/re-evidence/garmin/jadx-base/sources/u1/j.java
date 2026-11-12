package u1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu1/j;", "Lu1/s1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lg6/c;", "density", "Lo4/d0;", "glowColor", "Lc2/h2;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Lg6/c;JLc2/h2;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f167570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.c f167571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f167572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2.h2 f167573d;

    public /* synthetic */ j(Context context, g6.c cVar, long j8, c2.h2 h2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, cVar, (i14 & 4) != 0 ? k.f167579a : j8, (i14 & 8) != 0 ? k.f167580b : h2Var, null);
    }

    @Override // u1.s1
    public final i a() {
        return new i(this.f167570a, this.f167571b, this.f167572c, this.f167573d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f167570a, jVar.f167570a) && p005kotlin.jvm.internal.s.g(this.f167571b, jVar.f167571b) && o4.d0.d(this.f167572c, jVar.f167572c) && p005kotlin.jvm.internal.s.g(this.f167573d, jVar.f167573d);
    }

    public final int hashCode() {
        int iHashCode = (this.f167571b.hashCode() + (this.f167570a.hashCode() * 31)) * 31;
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return this.f167573d.hashCode() + q6.f.e(iHashCode, 31, this.f167572c);
    }

    public /* synthetic */ j(Context context, g6.c cVar, long j8, c2.h2 h2Var, p005kotlin.jvm.internal.j jVar) {
        this(context, cVar, j8, h2Var);
    }

    private j(Context context, g6.c cVar, long j8, c2.h2 h2Var) {
        this.f167570a = context;
        this.f167571b = cVar;
        this.f167572c = j8;
        this.f167573d = h2Var;
    }
}
