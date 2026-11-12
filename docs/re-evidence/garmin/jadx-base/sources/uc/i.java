package uc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import tr2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luc/i;", "", "T", "Luc/c;", Action.KEY_ATTRIBUTE, "Lsc/h;", "entry", "", "previousEntries", "<init>", "(Ljava/lang/Object;Lsc/h;Ljava/util/List;)V", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class i<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f169931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc.h<T> f169932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<sc.h<T>> f169933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<sc.h<T>> f169934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z3.e f169935e = new z3.e(-322904035, true, new o(this, 5));

    public i(Object obj, sc.h<T> hVar, List<sc.h<T>> list) {
        this.f169931a = obj;
        this.f169932b = hVar;
        this.f169933c = list;
        this.f169934d = w.c(hVar);
    }

    @Override // uc.c
    public final List<sc.h<T>> a() {
        return this.f169933c;
    }

    @Override // uc.c
    public final List<sc.h<T>> c() {
        return this.f169934d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (s.g(this.f169931a, iVar.f169931a) && s.g(this.f169932b, iVar.f169932b) && s.g(this.f169933c, iVar.f169933c) && s.g(this.f169934d, iVar.f169934d)) {
                return true;
            }
        }
        return false;
    }

    @Override // uc.c
    /* JADX INFO: renamed from: getContent, reason: from getter */
    public final z3.e getF169935e() {
        return this.f169935e;
    }

    @Override // uc.c
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF169931a() {
        return this.f169931a;
    }

    public final int hashCode() {
        return (this.f169934d.hashCode() * 31) + (this.f169933c.hashCode() * 31) + (this.f169932b.hashCode() * 31) + (this.f169931a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SinglePaneScene(key=");
        sb3.append(this.f169931a);
        sb3.append(", entry=");
        sb3.append(this.f169932b);
        sb3.append(", previousEntries=");
        sb3.append(this.f169933c);
        sb3.append(", entries=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f169934d, sb3);
    }
}
