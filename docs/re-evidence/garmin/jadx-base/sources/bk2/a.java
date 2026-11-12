package bk2;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbk2/a;", "", "", "deviceID", "", "eventID", "appID", "payload", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18500d;

    static {
        new C0268a(null);
    }

    public a(long j8, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f18497a = j8;
        this.f18498b = str;
        this.f18499c = str2;
        this.f18500d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18497a == aVar.f18497a && this.f18498b.equals(aVar.f18498b) && this.f18499c.equals(aVar.f18499c) && this.f18500d.equals(aVar.f18500d);
    }

    public final int hashCode() {
        return this.f18500d.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.f18497a) * 31, 31, this.f18498b), 31, this.f18499c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CIQMessage(deviceID=");
        sb3.append(this.f18497a);
        sb3.append(", eventID=");
        sb3.append(this.f18498b);
        sb3.append(", appID=");
        sb3.append(this.f18499c);
        sb3.append(", payload=");
        return a0.m(sb3, this.f18500d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX INFO: renamed from: bk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lbk2/a$a;", "", "<init>", "()V", "", "EXPIRATION", "Ljava/lang/String;", "GNS", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0268a {
        public /* synthetic */ C0268a(j jVar) {
            this();
        }

        private C0268a() {
        }
    }
}
