package sc;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import e23.q;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BQ\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsc/c;", "", "K", "Lk23/d;", "clazz", "Lkotlin/Function1;", "clazzContentKey", "", "", TtmlNode.TAG_METADATA, "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Lk23/d;Le23/l;Ljava/util/Map;Le23/q;)V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class c<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<K> f158437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<K, Object> f158438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f158439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<K, m, Integer, Unit> f158440d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(k23.d<K> dVar, l<? super K, ? extends Object> lVar, Map<String, ? extends Object> map, q<? super K, ? super m, ? super Integer, Unit> qVar) {
        this.f158437a = dVar;
        this.f158438b = lVar;
        this.f158439c = map;
        this.f158440d = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f158437a, cVar.f158437a) && s.g(this.f158438b, cVar.f158438b) && s.g(this.f158439c, cVar.f158439c) && s.g(this.f158440d, cVar.f158440d);
    }

    public final int hashCode() {
        return this.f158440d.hashCode() + am.j.b(this.f158439c, q6.f.h(this.f158437a.hashCode() * 31, this.f158438b, 31), 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.f158437a + ", clazzContentKey=" + this.f158438b + ", metadata=" + this.f158439c + ", content=" + this.f158440d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
