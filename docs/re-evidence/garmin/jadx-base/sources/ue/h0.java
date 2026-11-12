package ue;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Set;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lue/h0;", "", "Ljava/util/UUID;", TtmlNode.ATTR_ID, "Lue/h0$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "", "tags", "Landroidx/work/c;", "outputData", "progress", "", "runAttemptCount", "generation", "Lue/f;", "constraints", "", "initialDelayMillis", "Lue/h0$b;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Lue/h0$c;Ljava/util/Set;Landroidx/work/c;Landroidx/work/c;IILue/f;JLue/h0$b;JI)V", "c", "b", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f170066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f170067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f170068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.c f170069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.c f170070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f170071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f170072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f170073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f170074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f170075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f170076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f170077l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lue/h0$b;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f170078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f170079b;

        public b(long j8, long j14) {
            this.f170078a = j8;
            this.f170079b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (bVar.f170078a == this.f170078a && bVar.f170079b == this.f170079b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f170079b) + (Long.hashCode(this.f170078a) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb3.append(this.f170078a);
            sb3.append(", flexIntervalMillis=");
            return androidx.room.a0.l(sb3, this.f170079b, CoreConstants.CURLY_RIGHT);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue/h0$c;", "", "<init>", "(Ljava/lang/String;I)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ h0(UUID uuid, c cVar, Set set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15, f fVar, long j8, b bVar, long j14, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(uuid, cVar, set, (i17 & 8) != 0 ? androidx.work.c.f11465c : cVar2, (i17 & 16) != 0 ? androidx.work.c.f11465c : cVar3, (i17 & 32) != 0 ? 0 : i14, (i17 & 64) != 0 ? 0 : i15, (i17 & 128) != 0 ? f.f170042j : fVar, (i17 & 256) != 0 ? 0L : j8, (i17 & 512) != 0 ? null : bVar, (i17 & 1024) != 0 ? Long.MAX_VALUE : j14, (i17 & 2048) != 0 ? -256 : i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h0.class.equals(obj.getClass())) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f170071f == h0Var.f170071f && this.f170072g == h0Var.f170072g && p005kotlin.jvm.internal.s.g(this.f170066a, h0Var.f170066a) && this.f170067b == h0Var.f170067b && p005kotlin.jvm.internal.s.g(this.f170069d, h0Var.f170069d) && p005kotlin.jvm.internal.s.g(this.f170073h, h0Var.f170073h) && this.f170074i == h0Var.f170074i && p005kotlin.jvm.internal.s.g(this.f170075j, h0Var.f170075j) && this.f170076k == h0Var.f170076k && this.f170077l == h0Var.f170077l && p005kotlin.jvm.internal.s.g(this.f170068c, h0Var.f170068c)) {
            return p005kotlin.jvm.internal.s.g(this.f170070e, h0Var.f170070e);
        }
        return false;
    }

    public final int hashCode() {
        int iE = q6.f.e((this.f170073h.hashCode() + ((((((this.f170070e.hashCode() + ((this.f170068c.hashCode() + ((this.f170069d.hashCode() + ((this.f170067b.hashCode() + (this.f170066a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f170071f) * 31) + this.f170072g) * 31)) * 31, 31, this.f170074i);
        b bVar = this.f170075j;
        return Integer.hashCode(this.f170077l) + q6.f.e((iE + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f170076k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f170066a + "', state=" + this.f170067b + ", outputData=" + this.f170069d + ", tags=" + this.f170068c + ", progress=" + this.f170070e + ", runAttemptCount=" + this.f170071f + ", generation=" + this.f170072g + ", constraints=" + this.f170073h + ", initialDelayMillis=" + this.f170074i + ", periodicityInfo=" + this.f170075j + ", nextScheduleTimeMillis=" + this.f170076k + "}, stopReason=" + this.f170077l;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lue/h0$a;", "", "<init>", "()V", "", "STOP_REASON_FOREGROUND_SERVICE_TIMEOUT", "I", "STOP_REASON_NOT_STOPPED", "STOP_REASON_UNKNOWN", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_PREEMPT", "STOP_REASON_TIMEOUT", "STOP_REASON_DEVICE_STATE", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_QUOTA", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_APP_STANDBY", "STOP_REASON_USER", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2) {
        this(uuid, cVar, set, cVar2, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3) {
        this(uuid, cVar, set, cVar2, cVar3, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14) {
        this(uuid, cVar, set, cVar2, cVar3, i14, 0, null, 0L, null, 0L, 0, 4032, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15) {
        this(uuid, cVar, set, cVar2, cVar3, i14, i15, null, 0L, null, 0L, 0, 3968, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15, f fVar) {
        this(uuid, cVar, set, cVar2, cVar3, i14, i15, fVar, 0L, null, 0L, 0, 3840, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
        fVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15, f fVar, long j8) {
        this(uuid, cVar, set, cVar2, cVar3, i14, i15, fVar, j8, null, 0L, 0, 3584, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
        fVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15, f fVar, long j8, b bVar) {
        this(uuid, cVar, set, cVar2, cVar3, i14, i15, fVar, j8, bVar, 0L, 0, 3072, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
        fVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15, f fVar, long j8, b bVar, long j14) {
        this(uuid, cVar, set, cVar2, cVar3, i14, i15, fVar, j8, bVar, j14, 0, 2048, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
        fVar.getClass();
    }

    public h0(UUID uuid, c cVar, Set<String> set, androidx.work.c cVar2, androidx.work.c cVar3, int i14, int i15, f fVar, long j8, b bVar, long j14, int i16) {
        uuid.getClass();
        cVar.getClass();
        set.getClass();
        cVar2.getClass();
        cVar3.getClass();
        fVar.getClass();
        this.f170066a = uuid;
        this.f170067b = cVar;
        this.f170068c = set;
        this.f170069d = cVar2;
        this.f170070e = cVar3;
        this.f170071f = i14;
        this.f170072g = i15;
        this.f170073h = fVar;
        this.f170074i = j8;
        this.f170075j = bVar;
        this.f170076k = j14;
        this.f170077l = i16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(UUID uuid, c cVar, Set<String> set) {
        this(uuid, cVar, set, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        uuid.getClass();
        cVar.getClass();
        set.getClass();
    }
}
