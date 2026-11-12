package yc;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/g1;", "", "T", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lyc/v2;", "parent", "Lyc/c;", "tracker", "<init>", "(Lo53/b0;Lyc/v2;Lyc/c;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f195983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2<T> f195984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<T> f195985c;

    public g1(o53.b0 b0Var, v2<T> v2Var, c cVar) {
        b0Var.getClass();
        v2Var.getClass();
        this.f195983a = b0Var;
        this.f195984b = v2Var;
        this.f195985c = new i<>(v2Var.f196538a, b0Var);
    }

    public /* synthetic */ g1(o53.b0 b0Var, v2 v2Var, c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, v2Var, (i14 & 4) != 0 ? null : cVar);
    }
}
