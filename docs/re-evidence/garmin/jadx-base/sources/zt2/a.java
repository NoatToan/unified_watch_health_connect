package zt2;

import am.j;
import android.util.Base64;
import com.google.gson.annotations.SerializedName;
import d53.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wr.g;
import yt2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzt2/a;", "", "", "eventType", "payload", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "b", "setPayload", "c", "J", "()J", "setTimestamp", "(J)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3859a f207007d = new C3859a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EventType")
    private String eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ZippedPayload")
    private String payload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TimeStamp")
    private long timestamp;

    public a(String str, String str2, long j8) {
        str.getClass();
        str2.getClass();
        this.eventType = str;
        this.payload = str2;
        this.timestamp = j8;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.eventType, aVar.eventType) && s.g(this.payload, aVar.payload) && this.timestamp == aVar.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + g.j(this.eventType.hashCode() * 31, 31, this.payload);
    }

    public final String toString() {
        return j.i(this.timestamp, ")", p6.b.i("GenericAnalyticEvent(eventType=", this.eventType, ", payload=", this.payload, ", timestamp="));
    }

    /* JADX INFO: renamed from: zt2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzt2/a$a;", "", "<init>", "()V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C3859a {
        public /* synthetic */ C3859a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(e eVar) throws IOException {
            eVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    byte[] bytes = eVar.f199667b.getBytes(c.f57666b);
                    bytes.getClass();
                    gZIPOutputStream.write(bytes);
                    gZIPOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    String strEncodeToString = Base64.encodeToString(byteArray, 0);
                    String str = eVar.f199666a;
                    strEncodeToString.getClass();
                    return new a(str, strEncodeToString, eVar.f199668c);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(gZIPOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(byteArrayOutputStream, th5);
                    throw th6;
                }
            }
        }

        private C3859a() {
        }
    }
}
