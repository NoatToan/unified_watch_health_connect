package b9;

import java.time.Instant;
import java.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB9\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lb9/a;", "", "Ljava/time/Instant;", "startTime", "endTime", "Ljava/time/LocalDateTime;", "localStartTime", "localEndTime", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0234a f16934e = new C0234a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f16935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f16936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f16937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime f16938d;

    public /* synthetic */ a(Instant instant, Instant instant2, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : instant, (i14 & 2) != 0 ? null : instant2, (i14 & 4) != 0 ? null : localDateTime, (i14 & 8) != 0 ? null : localDateTime2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f16935a, aVar.f16935a) && s.g(this.f16936b, aVar.f16936b) && s.g(this.f16937c, aVar.f16937c) && s.g(this.f16938d, aVar.f16938d);
    }

    public final int hashCode() {
        Instant instant = this.f16935a;
        int iHashCode = (instant != null ? instant.hashCode() : 0) * 31;
        Instant instant2 = this.f16936b;
        int iHashCode2 = (iHashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31;
        LocalDateTime localDateTime = this.f16937c;
        int iHashCode3 = (iHashCode2 + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31;
        LocalDateTime localDateTime2 = this.f16938d;
        return iHashCode3 + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: b9.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb9/a$a;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0234a {
        public /* synthetic */ C0234a(j jVar) {
            this();
        }

        public static a a(Instant instant, Instant instant2) {
            if (!instant.isBefore(instant2)) {
                h.s("end time needs be after start time");
                return null;
            }
            return new a(instant, instant2, null, null, 12, null);
        }

        private C0234a() {
        }
    }

    public a(Instant instant, Instant instant2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f16935a = instant;
        this.f16936b = instant2;
        this.f16937c = localDateTime;
        this.f16938d = localDateTime2;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
