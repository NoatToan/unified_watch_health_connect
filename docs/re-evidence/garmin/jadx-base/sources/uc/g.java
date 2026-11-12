package uc;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BS\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luc/g;", "", "T", "", "Lsc/h;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Luc/b;", "overlayScenes", "Luc/c;", "currentScene", "previousScenes", "<init>", "(Ljava/util/List;Ljava/util/List;Luc/c;Ljava/util/List;)V", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<sc.h<T>> f169926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b<T>> f169927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<T> f169928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c<T>> f169929d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<sc.h<T>> list, List<? extends b<T>> list2, c<T> cVar, List<? extends c<T>> list3) {
        this.f169926a = list;
        this.f169927b = list2;
        this.f169928c = cVar;
        this.f169929d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (s.g(this.f169926a, gVar.f169926a) && s.g(this.f169927b, gVar.f169927b) && s.g(this.f169928c, gVar.f169928c) && s.g(this.f169929d, gVar.f169929d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f169929d.hashCode() * 31) + (this.f169928c.hashCode() * 31) + (this.f169927b.hashCode() * 31) + (this.f169926a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SceneState(entries=");
        sb3.append(this.f169926a);
        sb3.append(", overlayScenes=");
        sb3.append(this.f169927b);
        sb3.append(", currentScene=");
        sb3.append(this.f169928c);
        sb3.append(", previousScenes=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f169929d, sb3);
    }
}
