package oe;

import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loe/l;", "", "", "Loe/a;", "displayFeatures", "<init>", "(Ljava/util/List;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f131239a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends a> list) {
        list.getClass();
        this.f131239a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.class.equals(obj.getClass())) {
            return false;
        }
        return this.f131239a.equals(((l) obj).f131239a);
    }

    public final int hashCode() {
        return this.f131239a.hashCode();
    }

    public final String toString() {
        return h0.k0(this.f131239a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
