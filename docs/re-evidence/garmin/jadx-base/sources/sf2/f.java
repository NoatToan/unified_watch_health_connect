package sf2;

import am.j;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDataTypes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import rf2.l;
import vf2.p;
import zf2.g;
import zf2.h;
import zf2.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lsf2/f;", "", "<init>", "()V", "d", "a", "c", "b", "Lsf2/f$a;", "Lsf2/f$b;", "Lsf2/f$c;", "Lsf2/f$d;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsf2/f$a;", "Lsf2/f;", "Ljava/util/UUID;", "uuid", "Lrs2/c;", "deviceInfo", "Lzf2/a;", "activityMetadata", "Lzf2/i;", "workoutIdentifier", "", "workoutName", "Lyf2/a;", "valueEstimationType", "", "showEnableLocationPermission", "<init>", "(Ljava/util/UUID;Lrs2/c;Lzf2/a;Lzf2/i;Ljava/lang/String;Lyf2/a;Z)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rs2.c f158988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zf2.a f158989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i f158990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f158991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final yf2.a f158992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f158993g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UUID uuid, rs2.c cVar, zf2.a aVar, i iVar, String str, yf2.a aVar2, boolean z14) {
            super(null);
            uuid.getClass();
            cVar.getClass();
            aVar.getClass();
            this.f158987a = uuid;
            this.f158988b = cVar;
            this.f158989c = aVar;
            this.f158990d = iVar;
            this.f158991e = str;
            this.f158992f = aVar2;
            this.f158993g = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f158987a, aVar.f158987a) && s.g(this.f158988b, aVar.f158988b) && s.g(this.f158989c, aVar.f158989c) && s.g(this.f158990d, aVar.f158990d) && s.g(this.f158991e, aVar.f158991e) && this.f158992f == aVar.f158992f && this.f158993g == aVar.f158993g;
        }

        public final int hashCode() {
            int iHashCode = (this.f158989c.hashCode() + ((this.f158988b.hashCode() + (this.f158987a.hashCode() * 31)) * 31)) * 31;
            i iVar = this.f158990d;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.f158991e;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            yf2.a aVar = this.f158992f;
            return Boolean.hashCode(this.f158993g) + ((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AppInitiatedStartSupportedSport(uuid=");
            sb3.append(this.f158987a);
            sb3.append(", deviceInfo=");
            sb3.append(this.f158988b);
            sb3.append(", activityMetadata=");
            sb3.append(this.f158989c);
            sb3.append(", workoutIdentifier=");
            sb3.append(this.f158990d);
            sb3.append(", workoutName=");
            sb3.append(this.f158991e);
            sb3.append(", valueEstimationType=");
            sb3.append(this.f158992f);
            sb3.append(", showEnableLocationPermission=");
            return hb.a.k(sb3, this.f158993g, ")");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsf2/f$c;", "Lsf2/f;", "Ljava/util/UUID;", "uuid", "Lrs2/c;", "deviceInfo", "Lzf2/a;", "activityMetadata", "Lrf2/l;", "workoutSessionType", "Lvf2/p;", "workoutData", "Lzf2/h;", "liveActivityUserZones", "Lzf2/g;", "powerData", "", "showEnableLocationPermission", "", "workoutName", "<init>", "(Ljava/util/UUID;Lrs2/c;Lzf2/a;Lrf2/l;Lvf2/p;Lzf2/h;Lzf2/g;ZLjava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f159005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rs2.c f159006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zf2.a f159007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l f159008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p f159009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final h f159010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final g f159011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f159012h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f159013i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UUID uuid, rs2.c cVar, zf2.a aVar, l lVar, p pVar, h hVar, g gVar, boolean z14, String str) {
            super(null);
            uuid.getClass();
            cVar.getClass();
            aVar.getClass();
            hVar.getClass();
            this.f159005a = uuid;
            this.f159006b = cVar;
            this.f159007c = aVar;
            this.f159008d = lVar;
            this.f159009e = pVar;
            this.f159010f = hVar;
            this.f159011g = gVar;
            this.f159012h = z14;
            this.f159013i = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f159005a, cVar.f159005a) && s.g(this.f159006b, cVar.f159006b) && s.g(this.f159007c, cVar.f159007c) && s.g(this.f159008d, cVar.f159008d) && s.g(this.f159009e, cVar.f159009e) && s.g(this.f159010f, cVar.f159010f) && s.g(this.f159011g, cVar.f159011g) && this.f159012h == cVar.f159012h && s.g(this.f159013i, cVar.f159013i);
        }

        public final int hashCode() {
            int iHashCode = (this.f159007c.hashCode() + ((this.f159006b.hashCode() + (this.f159005a.hashCode() * 31)) * 31)) * 31;
            l lVar = this.f159008d;
            int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            p pVar = this.f159009e;
            int iHashCode3 = (this.f159010f.hashCode() + ((iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31;
            g gVar = this.f159011g;
            int iG = q6.f.g((iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f159012h);
            String str = this.f159013i;
            return iG + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RequestStartSupportedSport(uuid=");
            sb3.append(this.f159005a);
            sb3.append(", deviceInfo=");
            sb3.append(this.f159006b);
            sb3.append(", activityMetadata=");
            sb3.append(this.f159007c);
            sb3.append(", workoutSessionType=");
            sb3.append(this.f159008d);
            sb3.append(", workoutData=");
            sb3.append(this.f159009e);
            sb3.append(", liveActivityUserZones=");
            sb3.append(this.f159010f);
            sb3.append(", powerData=");
            sb3.append(this.f159011g);
            sb3.append(", showEnableLocationPermission=");
            sb3.append(this.f159012h);
            sb3.append(", workoutName=");
            return j.o(this.f159013i, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/f$d;", "Lsf2/f;", "Ljava/util/UUID;", "uuid", "Lzf2/a;", "activityMetadata", "<init>", "(Ljava/util/UUID;Lzf2/a;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f159014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zf2.a f159015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UUID uuid, zf2.a aVar) {
            super(null);
            uuid.getClass();
            aVar.getClass();
            this.f159014a = uuid;
            this.f159015b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f159014a, dVar.f159014a) && s.g(this.f159015b, dVar.f159015b);
        }

        public final int hashCode() {
            return this.f159015b.hashCode() + (this.f159014a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestStartUnsupportedSport(uuid=" + this.f159014a + ", activityMetadata=" + this.f159015b + ")";
        }
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsf2/f$b;", "Lsf2/f;", "Ljava/util/UUID;", "uuid", "Lsf2/f$b$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lrs2/c;", "deviceInfo", "<init>", "(Ljava/util/UUID;Lsf2/f$b$a;Lrs2/c;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f158994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f158995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f158996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f158997d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UUID uuid, a aVar, rs2.c cVar) {
            super(null);
            uuid.getClass();
            aVar.getClass();
            cVar.getClass();
            this.f158994a = aVar;
            this.f158995b = cVar.getF172494b();
            this.f158996c = cVar.getF172495c();
            this.f158997d = cVar.getF172497e();
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsf2/f$b$a;", "", "<init>", "()V", "f", "c", "a", JWKParameterNames.RSA_EXPONENT, "d", "g", "b", "Lsf2/f$b$a$a;", "Lsf2/f$b$a$b;", "Lsf2/f$b$a$c;", "Lsf2/f$b$a$d;", "Lsf2/f$b$a$e;", "Lsf2/f$b$a$f;", "Lsf2/f$b$a$g;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class a {

            /* JADX INFO: renamed from: sf2.f$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/f$b$a$a;", "Lsf2/f$b$a;", "Lcom/garmin/proto/generated/GDIDataTypes$UUID;", "malformedUUID", "<init>", "(Lcom/garmin/proto/generated/GDIDataTypes$UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class C3006a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GDIDataTypes.UUID f158998a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3006a(GDIDataTypes.UUID uuid) {
                    super(null);
                    uuid.getClass();
                    this.f158998a = uuid;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3006a) && s.g(this.f158998a, ((C3006a) obj).f158998a);
                }

                public final int hashCode() {
                    return this.f158998a.hashCode();
                }

                public final String toString() {
                    return "malformedSessionUuid";
                }
            }

            /* JADX INFO: renamed from: sf2.f$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/f$b$a$b;", "Lsf2/f$b$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class C3007b extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C3007b f158999a = new C3007b();

                private C3007b() {
                    super(null);
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3007b);
                }

                public final int hashCode() {
                    return -1052153713;
                }

                public final String toString() {
                    return "missingSessionConfigProvider";
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/f$b$a$c;", "Lsf2/f$b$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class c extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f159000a = new c();

                private c() {
                    super(null);
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -582161417;
                }

                public final String toString() {
                    return "missingSessionUuid";
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/f$b$a$d;", "Lsf2/f$b$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class d extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final d f159001a = new d();

                private d() {
                    super(null);
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 1244853347;
                }

                public final String toString() {
                    return "missingSportFitSubType";
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/f$b$a$e;", "Lsf2/f$b$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class e extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final e f159002a = new e();

                private e() {
                    super(null);
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return -1012573935;
                }

                public final String toString() {
                    return "missingSportFitType";
                }
            }

            /* JADX INFO: renamed from: sf2.f$b$a$f, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/f$b$a$f;", "Lsf2/f$b$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class C3008f extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C3008f f159003a = new C3008f();

                private C3008f() {
                    super(null);
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3008f);
                }

                public final int hashCode() {
                    return -473906225;
                }

                public final String toString() {
                    return "missingSportProfile";
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/f$b$a$g;", "Lsf2/f$b$a;", "Lcom/garmin/gfdi/protobuf/ProtobufException;", "exception", "<init>", "(Lcom/garmin/gfdi/protobuf/ProtobufException;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class g extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProtobufException f159004a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(ProtobufException protobufException) {
                    super(null);
                    protobufException.getClass();
                    this.f159004a = protobufException;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && s.g(this.f159004a, ((g) obj).f159004a);
                }

                public final int hashCode() {
                    return this.f159004a.hashCode();
                }

                public final String toString() {
                    return "protobufException";
                }
            }

            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(UUID uuid, a aVar, rs2.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                uuid = UUID.randomUUID();
                uuid.getClass();
            }
            this(uuid, aVar, cVar);
        }
    }

    private f() {
    }
}
