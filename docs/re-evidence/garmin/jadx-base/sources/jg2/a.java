package jg2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Ljg2/a;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;)V", "b", "a", "Ljg2/a$a;", "Ljg2/a$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljg2/a$b;", "Ljg2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f98731a = new b();

        private b() {
            super("default", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1417512353;
        }

        public final String toString() {
            return "Default";
        }
    }

    public /* synthetic */ a(String str, j jVar) {
        this(str);
    }

    private a(String str) {
    }

    /* JADX INFO: renamed from: jg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljg2/a$a;", "Ljg2/a;", "Ljg2/c;", "uiMode", "<init>", "(Ljg2/c;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1897a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f98730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1897a(c cVar) {
            super("activity_recording", null);
            cVar.getClass();
            this.f98730a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1897a) && this.f98730a == ((C1897a) obj).f98730a;
        }

        public final int hashCode() {
            return this.f98730a.hashCode();
        }

        public final String toString() {
            return "ActivityRecording(uiMode=" + this.f98730a + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1897a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ C1897a(c cVar, int i14, j jVar) {
            this((i14 & 1) != 0 ? c.LIMITED : cVar);
        }
    }
}
