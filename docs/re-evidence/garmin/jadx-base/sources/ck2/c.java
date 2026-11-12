package ck2;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import q6.f;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lck2/c;", "", "", "deviceID", "posted", "expiration", "", "eventID", "appID", "payload", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27920g;

    public c(long j8, long j14, long j15, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f27914a = j8;
        this.f27915b = j14;
        this.f27916c = j15;
        this.f27917d = str;
        this.f27918e = str2;
        this.f27919f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27914a == cVar.f27914a && this.f27915b == cVar.f27915b && this.f27916c == cVar.f27916c && this.f27917d.equals(cVar.f27917d) && this.f27918e.equals(cVar.f27918e) && this.f27919f.equals(cVar.f27919f);
    }

    public final int hashCode() {
        return this.f27919f.hashCode() + g.j(g.j(f.e(f.e(Long.hashCode(this.f27914a) * 31, 31, this.f27915b), 31, this.f27916c), 31, this.f27917d), 31, this.f27918e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CIQMessageDB(deviceID=");
        sb3.append(this.f27914a);
        sb3.append(", posted=");
        sb3.append(this.f27915b);
        sb3.append(", expiration=");
        sb3.append(this.f27916c);
        sb3.append(", eventID=");
        sb3.append(this.f27917d);
        sb3.append(", appID=");
        sb3.append(this.f27918e);
        sb3.append(", payload=");
        return a0.m(sb3, this.f27919f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
