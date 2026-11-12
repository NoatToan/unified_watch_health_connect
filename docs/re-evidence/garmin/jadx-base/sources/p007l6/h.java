package p007l6;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p6.g;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Ll6/h;", "", "Lp6/g;", "extendFrom", "<init>", "(Lp6/g;)V", "()V", "a", "b", "c", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f110470a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll6/h$a;", "", TtmlNode.ATTR_ID, "Ll6/x;", "reference", "<init>", "(Ljava/lang/Object;Ll6/x;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f110472b;

        public a(Object obj, x xVar) {
            this.f110471a = obj;
            this.f110472b = xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f110471a, aVar.f110471a) && s.g(this.f110472b, aVar.f110472b);
        }

        public final int hashCode() {
            return this.f110472b.hashCode() + (this.f110471a.hashCode() * 31);
        }

        public final String toString() {
            return "BaselineAnchor(id=" + this.f110471a + ", reference=" + this.f110472b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll6/h$b;", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.INDEX, "Ll6/x;", "reference", "<init>", "(Ljava/lang/Object;ILl6/x;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f110474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x f110475c;

        public b(Object obj, int i14, x xVar) {
            this.f110473a = obj;
            this.f110474b = i14;
            this.f110475c = xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f110473a, bVar.f110473a) && this.f110474b == bVar.f110474b && s.g(this.f110475c, bVar.f110475c);
        }

        public final int hashCode() {
            return this.f110475c.hashCode() + q2.d(this.f110474b, this.f110473a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HorizontalAnchor(id=" + this.f110473a + ", index=" + this.f110474b + ", reference=" + this.f110475c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll6/h$c;", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.INDEX, "Ll6/x;", "reference", "<init>", "(Ljava/lang/Object;ILl6/x;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f110476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f110477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x f110478c;

        public c(Object obj, int i14, x xVar) {
            this.f110476a = obj;
            this.f110477b = i14;
            this.f110478c = xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f110476a, cVar.f110476a) && this.f110477b == cVar.f110477b && s.g(this.f110478c, cVar.f110478c);
        }

        public final int hashCode() {
            return this.f110478c.hashCode() + q2.d(this.f110477b, this.f110476a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VerticalAnchor(id=" + this.f110476a + ", index=" + this.f110477b + ", reference=" + this.f110478c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public h(g gVar) {
        new ArrayList();
        this.f110470a = gVar != null ? gVar.clone() : new g(new char[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return s.g(this.f110470a, ((h) obj).f110470a);
    }

    public final int hashCode() {
        return this.f110470a.hashCode();
    }

    public h() {
        this(null);
    }
}
