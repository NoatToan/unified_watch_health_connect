package j4;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj4/d;", "", "", TtmlNode.ATTR_ID, "", "timestamp", "Lj4/e;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ll5/e;", "structureCompat", "<init>", "(IJLj4/e;Ll5/e;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f96993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l5.e f96994d;

    public d(int i14, long j8, e eVar, l5.e eVar2) {
        this.f96991a = i14;
        this.f96992b = j8;
        this.f96993c = eVar;
        this.f96994d = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f96991a == dVar.f96991a && this.f96992b == dVar.f96992b && this.f96993c == dVar.f96993c && s.g(this.f96994d, dVar.f96994d);
    }

    public final int hashCode() {
        int iHashCode = (this.f96993c.hashCode() + q6.f.e(Integer.hashCode(this.f96991a) * 31, 31, this.f96992b)) * 31;
        l5.e eVar = this.f96994d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f96991a + ", timestamp=" + this.f96992b + ", type=" + this.f96993c + ", structureCompat=" + this.f96994d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
