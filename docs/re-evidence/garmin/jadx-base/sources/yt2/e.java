package yt2;

import am.j;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lyt2/e;", "", "", "eventType", "payload", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Lzk/a;", "event", "(Lzk/a;)V", "a", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f199664d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f199665e = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSZZZZZ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f199668c;

    public e(zk.a aVar) {
        aVar.getClass();
        String str = aVar.f205029a;
        fl.b.a aVar2 = fl.b.f71952c;
        List<zk.e> list = aVar.f205030b;
        int iA = t0.a(y.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (zk.e eVar : list) {
            linkedHashMap.put(eVar.f205040a, eVar.f205041b);
        }
        aVar2.getClass();
        String json = fl.b.f71953d.toJson(linkedHashMap);
        this(str, json == null ? "" : json, aVar.f205032d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f199666a, eVar.f199666a) && s.g(this.f199667b, eVar.f199667b) && this.f199668c == eVar.f199668c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f199668c) + wr.g.j(this.f199666a.hashCode() * 31, 31, this.f199667b);
    }

    public final String toString() {
        return j.i(this.f199668c, ")", p6.b.i("OmtAnalyticEvent(eventType=", this.f199666a, ", payload=", this.f199667b, ", timestamp="));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyt2/e$a;", "", "<init>", "()V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(String str, String str2, long j8) {
        str.getClass();
        str2.getClass();
        this.f199666a = str;
        this.f199667b = str2;
        this.f199668c = j8;
    }
}
