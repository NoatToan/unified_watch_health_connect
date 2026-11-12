package p007l6;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll6/x;", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/Object;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110509a;

    public x(Object obj) {
        this.f110509a = obj;
        new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Object getF110509a() {
        return this.f110509a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && s.g(getF110509a(), ((x) obj).getF110509a());
    }

    public final int hashCode() {
        return getF110509a().hashCode();
    }
}
