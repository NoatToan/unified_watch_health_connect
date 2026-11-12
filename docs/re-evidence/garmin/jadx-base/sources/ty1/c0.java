package ty1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f167082a;

    public c0(boolean z14) {
        this.f167082a = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        fg0.i iVar = (fg0.i) t14;
        boolean sportingEventCapable = iVar.getSportingEventCapable();
        boolean z14 = false;
        boolean z15 = this.f167082a;
        Boolean boolValueOf = Boolean.valueOf(sportingEventCapable && (!z15 || p005kotlin.jvm.internal.s.g(iVar.getGcj02CourseCapable(), Boolean.TRUE)));
        fg0.i iVar2 = (fg0.i) t7;
        if (iVar2.getSportingEventCapable() && (!z15 || p005kotlin.jvm.internal.s.g(iVar2.getGcj02CourseCapable(), Boolean.TRUE))) {
            z14 = true;
        }
        return r13.a.b(boolValueOf, Boolean.valueOf(z14));
    }
}
