package z8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import java.time.Instant;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import wr.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz8/c;", "", "", "recordingMethod", "", TtmlNode.ATTR_ID, "Lz8/a;", "dataOrigin", "Ljava/time/Instant;", "lastModifiedTime", "clientRecordId", "", "clientRecordVersion", "Lz8/b;", "device", "<init>", "(ILjava/lang/String;Lz8/a;Ljava/time/Instant;Ljava/lang/String;JLz8/b;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f202966h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8.a f202969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Instant f202970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f202971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f202972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f202973g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(int i14, String str, z8.a aVar, Instant instant, String str2, long j8, b bVar, int i15, j jVar) {
        str = (i15 & 2) != 0 ? "" : str;
        aVar = (i15 & 4) != 0 ? new z8.a("") : aVar;
        if ((i15 & 8) != 0) {
            instant = Instant.EPOCH;
            instant.getClass();
        }
        this(i14, str, aVar, instant, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? 0L : j8, (i15 & 64) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f202968b, cVar.f202968b) && s.g(this.f202969c, cVar.f202969c) && s.g(this.f202970d, cVar.f202970d) && s.g(this.f202971e, cVar.f202971e) && this.f202972f == cVar.f202972f && s.g(this.f202973g, cVar.f202973g) && this.f202967a == cVar.f202967a;
    }

    public final int hashCode() {
        int iK = g.k(this.f202970d, g.j(this.f202968b.hashCode() * 31, 31, this.f202969c.f202962a), 31);
        String str = this.f202971e;
        int iE = f.e((iK + (str != null ? str.hashCode() : 0)) * 31, 31, this.f202972f);
        b bVar = this.f202973g;
        return Integer.hashCode(this.f202967a) + ((iE + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Metadata(id='");
        sb3.append(this.f202968b);
        sb3.append("', dataOrigin=");
        sb3.append(this.f202969c);
        sb3.append(", lastModifiedTime=");
        sb3.append(this.f202970d);
        sb3.append(", clientRecordId=");
        sb3.append(this.f202971e);
        sb3.append(", clientRecordVersion=");
        sb3.append(this.f202972f);
        sb3.append(", device=");
        sb3.append(this.f202973g);
        sb3.append(", recordingMethod=");
        return e0.j(sb3, this.f202967a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lz8/c$a;", "", "<init>", "()V", "", "EMPTY_ID", "Ljava/lang/String;", "", "RECORDING_METHOD_UNKNOWN", "I", "RECORDING_METHOD_ACTIVELY_RECORDED", "RECORDING_METHOD_AUTOMATICALLY_RECORDED", "RECORDING_METHOD_MANUAL_ENTRY", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(b bVar, String str) {
            str.getClass();
            return new c(2, null, null, null, str, 1L, bVar, 14, null);
        }

        private a() {
        }
    }

    public c(int i14, String str, z8.a aVar, Instant instant, String str2, long j8, b bVar) {
        str.getClass();
        aVar.getClass();
        instant.getClass();
        this.f202967a = i14;
        this.f202968b = str;
        this.f202969c = aVar;
        this.f202970d = instant;
        this.f202971e = str2;
        this.f202972f = j8;
        this.f202973g = bVar;
    }
}
