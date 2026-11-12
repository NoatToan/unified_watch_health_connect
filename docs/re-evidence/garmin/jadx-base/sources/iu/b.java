package iu;

import com.garmin.proto.generated.GDIAudioPromptsProto;
import i3.e5;
import java.util.concurrent.atomic.AtomicLong;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Liu/b;", "", "Lcom/garmin/proto/generated/GDIAudioPromptsProto$AudioPromptsService;", "request", "", "priority", "", "replaceKey", "", "preemptNow", "identifier", "", "deviceId", "seq", "<init>", "(Lcom/garmin/proto/generated/GDIAudioPromptsProto$AudioPromptsService;ILjava/lang/String;ZLjava/lang/String;JJ)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Comparable<b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f94993h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GDIAudioPromptsProto.AudioPromptsService f94994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f94998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f94999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f95000g;

    static {
        new a(null);
        f94993h = new AtomicLong(0L);
    }

    public /* synthetic */ b(GDIAudioPromptsProto.AudioPromptsService audioPromptsService, int i14, String str, boolean z14, String str2, long j8, long j14, int i15, j jVar) {
        this(audioPromptsService, i14, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? false : z14, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? -1L : j8, (i15 & 64) != 0 ? f94993h.incrementAndGet() : j14);
    }

    public static b a(b bVar, String str, long j8) {
        GDIAudioPromptsProto.AudioPromptsService audioPromptsService = bVar.f94994a;
        int i14 = bVar.f94995b;
        String str2 = bVar.f94996c;
        boolean z14 = bVar.f94997d;
        long j14 = bVar.f95000g;
        audioPromptsService.getClass();
        return new b(audioPromptsService, i14, str2, z14, str, j8, j14);
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        int iH = s.h(this.f94995b, bVar2.f94995b);
        return iH != 0 ? iH : s.i(this.f95000g, bVar2.f95000g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f94994a, bVar.f94994a) && this.f94995b == bVar.f94995b && s.g(this.f94996c, bVar.f94996c) && this.f94997d == bVar.f94997d && s.g(this.f94998e, bVar.f94998e) && this.f94999f == bVar.f94999f && this.f95000g == bVar.f95000g;
    }

    public final int hashCode() {
        int iD = q2.d(this.f94995b, this.f94994a.hashCode() * 31, 31);
        String str = this.f94996c;
        int iG = f.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94997d);
        String str2 = this.f94998e;
        return Long.hashCode(this.f95000g) + f.e((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f94999f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Prompt(request=");
        sb3.append(this.f94994a);
        sb3.append(", priority=");
        sb3.append(this.f94995b);
        sb3.append(", replaceKey=");
        h.C(this.f94996c, ", preemptNow=", ", identifier=", sb3, this.f94997d);
        e5.s(this.f94999f, this.f94998e, ", deviceId=", sb3);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f95000g, ", seq=", ")", sb3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liu/b$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicLong;", "SEQ", "Ljava/util/concurrent/atomic/AtomicLong;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(GDIAudioPromptsProto.AudioPromptsService audioPromptsService, int i14, String str, boolean z14, String str2, long j8, long j14) {
        audioPromptsService.getClass();
        this.f94994a = audioPromptsService;
        this.f94995b = i14;
        this.f94996c = str;
        this.f94997d = z14;
        this.f94998e = str2;
        this.f94999f = j8;
        this.f95000g = j14;
    }
}
