package cf;

import androidx.work.OverwritingInputMerger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import r1.q2;
import ue.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003+,-B\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*¨\u0006."}, d2 = {"Lcf/t;", "", "", TtmlNode.ATTR_ID, "Lue/h0$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "workerClassName", "inputMergerClassName", "Landroidx/work/c;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Lue/f;", "constraints", "", "runAttemptCount", "Lue/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Lue/b0;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Lue/h0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLue/f;ILue/a;JJJJZLue/b0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Lcf/t;)V", "b", "c", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f26940z = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0.c f26942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.c f26945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.work.c f26946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f26949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ue.f f26950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f26951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ue.a f26952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f26954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f26955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f26956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f26957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ue.b0 f26958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f26959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f26960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f26961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f26963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f26964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f26965y;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcf/t$b;", "", "", TtmlNode.ATTR_ID, "Lue/h0$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Ljava/lang/String;Lue/h0$c;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0.c f26967b;

        public b(String str, h0.c cVar) {
            str.getClass();
            cVar.getClass();
            this.f26966a = str;
            this.f26967b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26966a.equals(bVar.f26966a) && this.f26967b == bVar.f26967b;
        }

        public final int hashCode() {
            return this.f26967b.hashCode() + (this.f26966a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f26966a + ", state=" + this.f26967b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        ue.u.b("WorkSpec");
    }

    public /* synthetic */ t(String str, h0.c cVar, String str2, String str3, androidx.work.c cVar2, androidx.work.c cVar3, long j8, long j14, long j15, ue.f fVar, int i14, ue.a aVar, long j16, long j17, long j18, long j19, boolean z14, ue.b0 b0Var, int i15, int i16, long j24, int i17, int i18, String str4, Boolean bool, int i19, p005kotlin.jvm.internal.j jVar) {
        this(str, (i19 & 2) != 0 ? h0.c.ENQUEUED : cVar, str2, (i19 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i19 & 16) != 0 ? androidx.work.c.f11465c : cVar2, (i19 & 32) != 0 ? androidx.work.c.f11465c : cVar3, (i19 & 64) != 0 ? 0L : j8, (i19 & 128) != 0 ? 0L : j14, (i19 & 256) != 0 ? 0L : j15, (i19 & 512) != 0 ? ue.f.f170042j : fVar, (i19 & 1024) != 0 ? 0 : i14, (i19 & 2048) != 0 ? ue.a.EXPONENTIAL : aVar, (i19 & 4096) != 0 ? 30000L : j16, (i19 & 8192) != 0 ? -1L : j17, (i19 & 16384) == 0 ? j18 : 0L, (32768 & i19) != 0 ? -1L : j19, (65536 & i19) != 0 ? false : z14, (131072 & i19) != 0 ? ue.b0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : b0Var, (262144 & i19) != 0 ? 0 : i15, (524288 & i19) != 0 ? 0 : i16, (1048576 & i19) != 0 ? Long.MAX_VALUE : j24, (2097152 & i19) != 0 ? 0 : i17, (4194304 & i19) != 0 ? -256 : i18, (8388608 & i19) != 0 ? null : str4, (i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }

    public static t b(t tVar, String str, h0.c cVar, androidx.work.c cVar2, int i14, long j8, int i15, int i16, long j14, int i17, int i18) {
        String str2 = (i18 & 1) != 0 ? tVar.f26941a : str;
        h0.c cVar3 = (i18 & 2) != 0 ? tVar.f26942b : cVar;
        String str3 = (i18 & 4) != 0 ? tVar.f26943c : "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        String str4 = tVar.f26944d;
        androidx.work.c cVar4 = (i18 & 16) != 0 ? tVar.f26945e : cVar2;
        androidx.work.c cVar5 = tVar.f26946f;
        long j15 = tVar.f26947g;
        long j16 = tVar.f26948h;
        long j17 = tVar.f26949i;
        ue.f fVar = tVar.f26950j;
        int i19 = (i18 & 1024) != 0 ? tVar.f26951k : i14;
        ue.a aVar = tVar.f26952l;
        long j18 = tVar.f26953m;
        long j19 = (i18 & 8192) != 0 ? tVar.f26954n : j8;
        long j24 = tVar.f26955o;
        long j25 = tVar.f26956p;
        boolean z14 = tVar.f26957q;
        ue.b0 b0Var = tVar.f26958r;
        int i24 = (i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? tVar.f26959s : i15;
        int i25 = (i18 & 524288) != 0 ? tVar.f26960t : i16;
        long j26 = (i18 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? tVar.f26961u : j14;
        int i26 = (i18 & 2097152) != 0 ? tVar.f26962v : i17;
        int i27 = tVar.f26963w;
        String str5 = tVar.f26964x;
        Boolean bool = tVar.f26965y;
        str2.getClass();
        cVar3.getClass();
        str3.getClass();
        str4.getClass();
        cVar4.getClass();
        cVar5.getClass();
        fVar.getClass();
        aVar.getClass();
        b0Var.getClass();
        return new t(str2, cVar3, str3, str4, cVar4, cVar5, j15, j16, j17, fVar, i19, aVar, j18, j19, j24, j25, z14, b0Var, i24, i25, j26, i26, i27, str5, bool);
    }

    public final long a() {
        boolean z14 = this.f26942b == h0.c.ENQUEUED && this.f26951k > 0;
        ue.a aVar = this.f26952l;
        long j8 = this.f26953m;
        long j14 = this.f26954n;
        boolean zC = c();
        long j15 = this.f26947g;
        long j16 = this.f26949i;
        long j17 = this.f26948h;
        long j18 = this.f26961u;
        f26940z.getClass();
        return a.a(z14, this.f26951k, aVar, j8, j14, this.f26959s, zC, j15, j16, j17, j18);
    }

    public final boolean c() {
        return this.f26948h != 0;
    }

    public final void d(long j8) {
        if (j8 < 900000) {
            ue.u.a().getClass();
        }
        long j14 = j8 < 900000 ? 900000L : j8;
        if (j8 < 900000) {
            j8 = 900000;
        }
        e(j14, j8);
    }

    public final void e(long j8, long j14) {
        if (j8 < 900000) {
            ue.u.a().getClass();
        }
        if (j8 < 900000) {
            j8 = 900000;
        }
        this.f26948h = j8;
        if (j14 < 300000) {
            ue.u.a().getClass();
        }
        if (j14 > this.f26948h) {
            ue.u.a().getClass();
        }
        this.f26949i = j23.t.g(j14, 300000L, this.f26948h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f26941a, tVar.f26941a) && this.f26942b == tVar.f26942b && p005kotlin.jvm.internal.s.g(this.f26943c, tVar.f26943c) && p005kotlin.jvm.internal.s.g(this.f26944d, tVar.f26944d) && p005kotlin.jvm.internal.s.g(this.f26945e, tVar.f26945e) && p005kotlin.jvm.internal.s.g(this.f26946f, tVar.f26946f) && this.f26947g == tVar.f26947g && this.f26948h == tVar.f26948h && this.f26949i == tVar.f26949i && p005kotlin.jvm.internal.s.g(this.f26950j, tVar.f26950j) && this.f26951k == tVar.f26951k && this.f26952l == tVar.f26952l && this.f26953m == tVar.f26953m && this.f26954n == tVar.f26954n && this.f26955o == tVar.f26955o && this.f26956p == tVar.f26956p && this.f26957q == tVar.f26957q && this.f26958r == tVar.f26958r && this.f26959s == tVar.f26959s && this.f26960t == tVar.f26960t && this.f26961u == tVar.f26961u && this.f26962v == tVar.f26962v && this.f26963w == tVar.f26963w && p005kotlin.jvm.internal.s.g(this.f26964x, tVar.f26964x) && p005kotlin.jvm.internal.s.g(this.f26965y, tVar.f26965y);
    }

    public final int hashCode() {
        int iD = q2.d(this.f26963w, q2.d(this.f26962v, q6.f.e(q2.d(this.f26960t, q2.d(this.f26959s, (this.f26958r.hashCode() + q6.f.g(q6.f.e(q6.f.e(q6.f.e(q6.f.e((this.f26952l.hashCode() + q2.d(this.f26951k, (this.f26950j.hashCode() + q6.f.e(q6.f.e(q6.f.e((this.f26946f.hashCode() + ((this.f26945e.hashCode() + wr.g.j(wr.g.j((this.f26942b.hashCode() + (this.f26941a.hashCode() * 31)) * 31, 31, this.f26943c), 31, this.f26944d)) * 31)) * 31, 31, this.f26947g), 31, this.f26948h), 31, this.f26949i)) * 31, 31)) * 31, 31, this.f26953m), 31, this.f26954n), 31, this.f26955o), 31, this.f26956p), 31, this.f26957q)) * 31, 31), 31), 31, this.f26961u), 31), 31);
        String str = this.f26964x;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f26965y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("{WorkSpec: "), this.f26941a, CoreConstants.CURLY_RIGHT);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR,\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcf/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SCHEDULE_NOT_REQUESTED_YET", "J", "Lp/a;", "", "Lcf/t$c;", "Lue/h0;", "WORK_INFO_MAPPER", "Lp/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(boolean z14, int i14, ue.a aVar, long j8, long j14, int i15, boolean z15, long j15, long j16, long j17, long j18) {
            aVar.getClass();
            if (j18 != Long.MAX_VALUE && z15) {
                if (i15 != 0) {
                    long j19 = j14 + 900000;
                    if (j18 < j19) {
                        return j19;
                    }
                }
                return j18;
            }
            if (z14) {
                long jScalb = aVar == ue.a.LINEAR ? j8 * ((long) i14) : (long) Math.scalb(j8, i14 - 1);
                if (jScalb > 18000000) {
                    jScalb = 18000000;
                }
                return j14 + jScalb;
            }
            if (z15) {
                long j24 = i15 == 0 ? j14 + j15 : j14 + j17;
                return (j16 == j17 || i15 != 0) ? j24 : (j17 - j16) + j24;
            }
            if (j14 == -1) {
                return Long.MAX_VALUE;
            }
            return j14 + j15;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcf/t$c;", "", "", TtmlNode.ATTR_ID, "Lue/h0$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/c;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Lue/f;", "constraints", "", "runAttemptCount", "Lue/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Lue/h0$c;Landroidx/work/c;JJJLue/f;ILue/a;JJIIJILjava/util/List;Ljava/util/List;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0.c f26969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.work.c f26970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f26972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f26973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ue.f f26974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f26975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ue.a f26976i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f26977j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f26978k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f26979l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f26980m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f26981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f26982o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final List<String> f26983p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final List<androidx.work.c> f26984q;

        public /* synthetic */ c(String str, h0.c cVar, androidx.work.c cVar2, long j8, long j14, long j15, ue.f fVar, int i14, ue.a aVar, long j16, long j17, int i15, int i16, long j18, int i17, List list, List list2, int i18, p005kotlin.jvm.internal.j jVar) {
            this(str, cVar, cVar2, (i18 & 8) != 0 ? 0L : j8, (i18 & 16) != 0 ? 0L : j14, (i18 & 32) != 0 ? 0L : j15, fVar, i14, (i18 & 256) != 0 ? ue.a.EXPONENTIAL : aVar, (i18 & 512) != 0 ? 30000L : j16, (i18 & 1024) != 0 ? 0L : j17, (i18 & 2048) != 0 ? 0 : i15, i16, j18, i17, list, list2);
        }

        public final h0 a() {
            long jA;
            List<androidx.work.c> list = this.f26984q;
            androidx.work.c cVar = !list.isEmpty() ? list.get(0) : androidx.work.c.f11465c;
            UUID uuidFromString = UUID.fromString(this.f26968a);
            uuidFromString.getClass();
            HashSet hashSet = new HashSet(this.f26983p);
            long j8 = this.f26972e;
            h0.b bVar = j8 != 0 ? new h0.b(j8, this.f26973f) : null;
            h0.c cVar2 = h0.c.ENQUEUED;
            h0.c cVar3 = this.f26969b;
            if (cVar3 == cVar2) {
                a aVar = t.f26940z;
                boolean z14 = cVar3 == cVar2 && this.f26975h > 0;
                long j14 = this.f26972e;
                boolean z15 = j14 != 0;
                aVar.getClass();
                jA = a.a(z14, this.f26975h, this.f26976i, this.f26977j, this.f26978k, this.f26979l, z15, this.f26971d, this.f26973f, j14, this.f26981n);
            } else {
                jA = Long.MAX_VALUE;
            }
            return new h0(uuidFromString, this.f26969b, hashSet, this.f26970c, cVar, this.f26975h, this.f26980m, this.f26974g, this.f26971d, bVar, jA, this.f26982o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f26968a, cVar.f26968a) && this.f26969b == cVar.f26969b && p005kotlin.jvm.internal.s.g(this.f26970c, cVar.f26970c) && this.f26971d == cVar.f26971d && this.f26972e == cVar.f26972e && this.f26973f == cVar.f26973f && p005kotlin.jvm.internal.s.g(this.f26974g, cVar.f26974g) && this.f26975h == cVar.f26975h && this.f26976i == cVar.f26976i && this.f26977j == cVar.f26977j && this.f26978k == cVar.f26978k && this.f26979l == cVar.f26979l && this.f26980m == cVar.f26980m && this.f26981n == cVar.f26981n && this.f26982o == cVar.f26982o && p005kotlin.jvm.internal.s.g(this.f26983p, cVar.f26983p) && p005kotlin.jvm.internal.s.g(this.f26984q, cVar.f26984q);
        }

        public final int hashCode() {
            return this.f26984q.hashCode() + u0.b(q2.d(this.f26982o, q6.f.e(q2.d(this.f26980m, q2.d(this.f26979l, q6.f.e(q6.f.e((this.f26976i.hashCode() + q2.d(this.f26975h, (this.f26974g.hashCode() + q6.f.e(q6.f.e(q6.f.e((this.f26970c.hashCode() + ((this.f26969b.hashCode() + (this.f26968a.hashCode() * 31)) * 31)) * 31, 31, this.f26971d), 31, this.f26972e), 31, this.f26973f)) * 31, 31)) * 31, 31, this.f26977j), 31, this.f26978k), 31), 31), 31, this.f26981n), 31), 31, this.f26983p);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WorkInfoPojo(id=");
            sb3.append(this.f26968a);
            sb3.append(", state=");
            sb3.append(this.f26969b);
            sb3.append(", output=");
            sb3.append(this.f26970c);
            sb3.append(", initialDelay=");
            sb3.append(this.f26971d);
            sb3.append(", intervalDuration=");
            sb3.append(this.f26972e);
            sb3.append(", flexDuration=");
            sb3.append(this.f26973f);
            sb3.append(", constraints=");
            sb3.append(this.f26974g);
            sb3.append(", runAttemptCount=");
            sb3.append(this.f26975h);
            sb3.append(", backoffPolicy=");
            sb3.append(this.f26976i);
            sb3.append(", backoffDelayDuration=");
            sb3.append(this.f26977j);
            sb3.append(", lastEnqueueTime=");
            sb3.append(this.f26978k);
            sb3.append(", periodCount=");
            sb3.append(this.f26979l);
            sb3.append(", generation=");
            sb3.append(this.f26980m);
            sb3.append(", nextScheduleTimeOverride=");
            sb3.append(this.f26981n);
            sb3.append(", stopReason=");
            sb3.append(this.f26982o);
            sb3.append(", tags=");
            sb3.append(this.f26983p);
            sb3.append(", progress=");
            return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f26984q, sb3);
        }

        public c(String str, h0.c cVar, androidx.work.c cVar2, long j8, long j14, long j15, ue.f fVar, int i14, ue.a aVar, long j16, long j17, int i15, int i16, long j18, int i17, List<String> list, List<androidx.work.c> list2) {
            str.getClass();
            cVar.getClass();
            cVar2.getClass();
            fVar.getClass();
            aVar.getClass();
            list.getClass();
            list2.getClass();
            this.f26968a = str;
            this.f26969b = cVar;
            this.f26970c = cVar2;
            this.f26971d = j8;
            this.f26972e = j14;
            this.f26973f = j15;
            this.f26974g = fVar;
            this.f26975h = i14;
            this.f26976i = aVar;
            this.f26977j = j16;
            this.f26978k = j17;
            this.f26979l = i15;
            this.f26980m = i16;
            this.f26981n = j18;
            this.f26982o = i17;
            this.f26983p = list;
            this.f26984q = list2;
        }
    }

    public t(String str, h0.c cVar, String str2, String str3, androidx.work.c cVar2, androidx.work.c cVar3, long j8, long j14, long j15, ue.f fVar, int i14, ue.a aVar, long j16, long j17, long j18, long j19, boolean z14, ue.b0 b0Var, int i15, int i16, long j24, int i17, int i18, String str4, Boolean bool) {
        str.getClass();
        cVar.getClass();
        str2.getClass();
        str3.getClass();
        cVar2.getClass();
        cVar3.getClass();
        fVar.getClass();
        aVar.getClass();
        b0Var.getClass();
        this.f26941a = str;
        this.f26942b = cVar;
        this.f26943c = str2;
        this.f26944d = str3;
        this.f26945e = cVar2;
        this.f26946f = cVar3;
        this.f26947g = j8;
        this.f26948h = j14;
        this.f26949i = j15;
        this.f26950j = fVar;
        this.f26951k = i14;
        this.f26952l = aVar;
        this.f26953m = j16;
        this.f26954n = j17;
        this.f26955o = j18;
        this.f26956p = j19;
        this.f26957q = z14;
        this.f26958r = b0Var;
        this.f26959s = i15;
        this.f26960t = i16;
        this.f26961u = j24;
        this.f26962v = i17;
        this.f26963w = i18;
        this.f26964x = str4;
        this.f26965y = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(String str, t tVar) {
        this(str, tVar.f26942b, tVar.f26943c, tVar.f26944d, new androidx.work.c(tVar.f26945e), new androidx.work.c(tVar.f26946f), tVar.f26947g, tVar.f26948h, tVar.f26949i, new ue.f(tVar.f26950j), tVar.f26951k, tVar.f26952l, tVar.f26953m, tVar.f26954n, tVar.f26955o, tVar.f26956p, tVar.f26957q, tVar.f26958r, tVar.f26959s, 0, tVar.f26961u, tVar.f26962v, tVar.f26963w, tVar.f26964x, tVar.f26965y, 524288, null);
        str.getClass();
        tVar.getClass();
    }
}
