package yi2;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lyi2/a;", "", "", TtmlNode.ATTR_ID, "name", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197355c;

    /* JADX INFO: renamed from: yi2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyi2/a$a;", "", "<init>", "()V", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C3697a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f197356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f197357b;
    }

    public a(String str, String str2, String str3) {
        this.f197353a = str;
        this.f197354b = str2;
        this.f197355c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f197353a, aVar.f197353a) && s.g(this.f197354b, aVar.f197354b) && s.g(this.f197355c, aVar.f197355c);
    }

    public final int hashCode() {
        String str = this.f197353a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f197354b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f197355c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Calendar(id=");
        sb3.append(this.f197353a);
        sb3.append(", name=");
        sb3.append(this.f197354b);
        sb3.append(", color=");
        return a0.m(sb3, this.f197355c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
