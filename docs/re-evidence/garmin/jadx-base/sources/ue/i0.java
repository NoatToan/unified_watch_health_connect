package ue;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lue/i0;", "", "<init>", "()V", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f170088a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue/i0$b;", "", "<init>", "(Ljava/lang/String;I)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        NOT_APPLIED,
        /* JADX INFO: Fake field, exist only in values array */
        APPLIED_IMMEDIATELY,
        /* JADX INFO: Fake field, exist only in values array */
        APPLIED_FOR_NEXT_RUN
    }

    public final g0 a(String str, l lVar, x xVar) {
        str.getClass();
        lVar.getClass();
        xVar.getClass();
        return b(str, lVar, p13.w.c(xVar));
    }

    public abstract ve.c0 b(String str, l lVar, List list);

    public final y c(String str, l lVar, x xVar) {
        str.getClass();
        lVar.getClass();
        xVar.getClass();
        return new ve.c0((t0) this, str, lVar, p13.w.c(xVar)).a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue/i0$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static t0 a(Context context) {
            context.getClass();
            t0 t0VarG = t0.g(context);
            t0VarG.getClass();
            return t0VarG;
        }

        private a() {
        }
    }
}
