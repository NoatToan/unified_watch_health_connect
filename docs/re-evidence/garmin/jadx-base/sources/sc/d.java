package sc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.q;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsc/d;", "", "K", Action.KEY_ATTRIBUTE, "contentKey", "", "", TtmlNode.TAG_METADATA, "Lkotlin/Function1;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Le23/q;)V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class d<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f158441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f158442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f158443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<K, m, Integer, Unit> f158444d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(K k14, Object obj, Map<String, ? extends Object> map, q<? super K, ? super m, ? super Integer, Unit> qVar) {
        this.f158441a = k14;
        this.f158442b = obj;
        this.f158443c = map;
        this.f158444d = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f158441a, dVar.f158441a) && s.g(this.f158442b, dVar.f158442b) && s.g(this.f158443c, dVar.f158443c) && s.g(this.f158444d, dVar.f158444d);
    }

    public final int hashCode() {
        return this.f158444d.hashCode() + am.j.b(this.f158443c, (this.f158442b.hashCode() + (this.f158441a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "EntryProvider(key=" + this.f158441a + ", contentKey=" + this.f158442b + ", metadata=" + this.f158443c + ", content=" + this.f158444d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
