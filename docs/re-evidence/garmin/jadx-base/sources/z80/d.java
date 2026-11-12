package z80;

import d53.w;
import i3.e5;
import j20.x;
import java.util.List;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f BÏ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018BÃ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001c¨\u0006!"}, d2 = {"Lz80/d;", "", "", "applicationKey", "", "bluetoothClassicDevice", "bluetoothLowEnergyDevice", "", "deviceCategories", "deviceId", "deviceName", "Lz80/d$c;", "deviceTutorialImages", "excludeCountries", "imageURL", "includeCountries", "", "minGCMAndroidVersion", "minGCMHarmonyVersion", "minGCMiOSVersion", "partNumber", "productSKU", "serialNumber", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lz80/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lz80/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "c", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f202984q = {null, null, null, o13.m.a(o13.n.PUBLICATION, new z41.j(17)), null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f202986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f202987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f202988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f202989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f202990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f202991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f202992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f202993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f202994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f202995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f202996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f202997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f202998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f202999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f203000p;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0015"}, d2 = {"Lz80/d$c;", "", "Lz80/d$c$c;", "cableImage", "defaultWatchFaceBlankImage", "defaultWatchFaceImage", "option1Image", "option2Image", "option3Image", "sideProfileImage", "<init>", "(Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lz80/d$c$c;Lm63/u1;)V", "Companion", "c", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3786c f203002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3786c f203003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C3786c f203004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C3786c f203005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C3786c f203006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C3786c f203007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C3786c f203008g;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/data/model/DeviceGeneralInfoDTO.DeviceTutorialImages.$serializer", "Lm63/e0;", "Lz80/d$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f203009a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f203009a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.data.model.DeviceGeneralInfoDTO.DeviceTutorialImages", aVar, 7);
                m1Var.j("cableImage", true);
                m1Var.j("defaultWatchFaceBlankImage", true);
                m1Var.j("defaultWatchFaceImage", true);
                m1Var.j("option1Image", true);
                m1Var.j("option2Image", true);
                m1Var.j("option3Image", true);
                m1Var.j("sideProfileImage", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                C3786c.a aVar = C3786c.a.f203014a;
                return new i63.c[]{j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                C3786c c3786c = null;
                C3786c c3786c2 = null;
                C3786c c3786c3 = null;
                C3786c c3786c4 = null;
                C3786c c3786c5 = null;
                C3786c c3786c6 = null;
                C3786c c3786c7 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            break;
                        case 0:
                            c3786c = (C3786c) cVarC.v(eVar2, 0, C3786c.a.f203014a, c3786c);
                            i15 |= 1;
                            break;
                        case 1:
                            c3786c2 = (C3786c) cVarC.v(eVar2, 1, C3786c.a.f203014a, c3786c2);
                            i15 |= 2;
                            break;
                        case 2:
                            c3786c3 = (C3786c) cVarC.v(eVar2, 2, C3786c.a.f203014a, c3786c3);
                            i15 |= 4;
                            break;
                        case 3:
                            c3786c4 = (C3786c) cVarC.v(eVar2, 3, C3786c.a.f203014a, c3786c4);
                            i15 |= 8;
                            break;
                        case 4:
                            c3786c5 = (C3786c) cVarC.v(eVar2, 4, C3786c.a.f203014a, c3786c5);
                            i15 |= 16;
                            break;
                        case 5:
                            c3786c6 = (C3786c) cVarC.v(eVar2, 5, C3786c.a.f203014a, c3786c6);
                            i15 |= 32;
                            break;
                        case 6:
                            c3786c7 = (C3786c) cVarC.v(eVar2, 6, C3786c.a.f203014a, c3786c7);
                            i15 |= 64;
                            break;
                        default:
                            hb.a.o(iE);
                            return null;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, c3786c, c3786c2, c3786c3, c3786c4, c3786c5, c3786c6, c3786c7, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF116202c() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                C3786c c3786c = cVar.f203008g;
                C3786c c3786c2 = cVar.f203007f;
                C3786c c3786c3 = cVar.f203006e;
                C3786c c3786c4 = cVar.f203005d;
                C3786c c3786c5 = cVar.f203004c;
                C3786c c3786c6 = cVar.f203003b;
                C3786c c3786c7 = cVar.f203002a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || c3786c7 != null) {
                    dVarC.d(eVar, 0, C3786c.a.f203014a, c3786c7);
                }
                if (dVarC.C(eVar) || c3786c6 != null) {
                    dVarC.d(eVar, 1, C3786c.a.f203014a, c3786c6);
                }
                if (dVarC.C(eVar) || c3786c5 != null) {
                    dVarC.d(eVar, 2, C3786c.a.f203014a, c3786c5);
                }
                if (dVarC.C(eVar) || c3786c4 != null) {
                    dVarC.d(eVar, 3, C3786c.a.f203014a, c3786c4);
                }
                if (dVarC.C(eVar) || c3786c3 != null) {
                    dVarC.d(eVar, 4, C3786c.a.f203014a, c3786c3);
                }
                if (dVarC.C(eVar) || c3786c2 != null) {
                    dVarC.d(eVar, 5, C3786c.a.f203014a, c3786c2);
                }
                if (dVarC.C(eVar) || c3786c != null) {
                    dVarC.d(eVar, 6, C3786c.a.f203014a, c3786c);
                }
                dVarC.b(eVar);
            }
        }

        public /* synthetic */ c(int i14, C3786c c3786c, C3786c c3786c2, C3786c c3786c3, C3786c c3786c4, C3786c c3786c5, C3786c c3786c6, C3786c c3786c7, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f203002a = null;
            } else {
                this.f203002a = c3786c;
            }
            if ((i14 & 2) == 0) {
                this.f203003b = null;
            } else {
                this.f203003b = c3786c2;
            }
            if ((i14 & 4) == 0) {
                this.f203004c = null;
            } else {
                this.f203004c = c3786c3;
            }
            if ((i14 & 8) == 0) {
                this.f203005d = null;
            } else {
                this.f203005d = c3786c4;
            }
            if ((i14 & 16) == 0) {
                this.f203006e = null;
            } else {
                this.f203006e = c3786c5;
            }
            if ((i14 & 32) == 0) {
                this.f203007f = null;
            } else {
                this.f203007f = c3786c6;
            }
            if ((i14 & 64) == 0) {
                this.f203008g = null;
            } else {
                this.f203008g = c3786c7;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f203002a, cVar.f203002a) && s.g(this.f203003b, cVar.f203003b) && s.g(this.f203004c, cVar.f203004c) && s.g(this.f203005d, cVar.f203005d) && s.g(this.f203006e, cVar.f203006e) && s.g(this.f203007f, cVar.f203007f) && s.g(this.f203008g, cVar.f203008g);
        }

        public final int hashCode() {
            C3786c c3786c = this.f203002a;
            int iHashCode = (c3786c == null ? 0 : c3786c.hashCode()) * 31;
            C3786c c3786c2 = this.f203003b;
            int iHashCode2 = (iHashCode + (c3786c2 == null ? 0 : c3786c2.hashCode())) * 31;
            C3786c c3786c3 = this.f203004c;
            int iHashCode3 = (iHashCode2 + (c3786c3 == null ? 0 : c3786c3.hashCode())) * 31;
            C3786c c3786c4 = this.f203005d;
            int iHashCode4 = (iHashCode3 + (c3786c4 == null ? 0 : c3786c4.hashCode())) * 31;
            C3786c c3786c5 = this.f203006e;
            int iHashCode5 = (iHashCode4 + (c3786c5 == null ? 0 : c3786c5.hashCode())) * 31;
            C3786c c3786c6 = this.f203007f;
            int iHashCode6 = (iHashCode5 + (c3786c6 == null ? 0 : c3786c6.hashCode())) * 31;
            C3786c c3786c7 = this.f203008g;
            return iHashCode6 + (c3786c7 != null ? c3786c7.hashCode() : 0);
        }

        public final String toString() {
            return "DeviceTutorialImages(cableImage=" + this.f203002a + ", defaultWatchFaceBlankImage=" + this.f203003b + ", defaultWatchFaceImage=" + this.f203004c + ", option1Image=" + this.f203005d + ", option2Image=" + this.f203006e + ", option3Image=" + this.f203007f + ", sideProfileImage=" + this.f203008g + ")";
        }

        /* JADX INFO: renamed from: z80.d$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lz80/d$c$c;", "", "", "highResImage", "largeImage", "mediumImage", "smallImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @i63.h
        public static final /* data */ class C3786c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f203010a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f203011b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f203012c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f203013d;

            /* JADX INFO: renamed from: z80.d$c$c$a */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/data/model/DeviceGeneralInfoDTO.DeviceTutorialImages.SkuImage.$serializer", "Lm63/e0;", "Lz80/d$c$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            @o13.e
            public static final /* synthetic */ class a implements e0<C3786c> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f203014a;
                private static final k63.e descriptor;

                static {
                    a aVar = new a();
                    f203014a = aVar;
                    m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.data.model.DeviceGeneralInfoDTO.DeviceTutorialImages.SkuImage", aVar, 4);
                    m1Var.j("highResImage", true);
                    m1Var.j("largeImage", true);
                    m1Var.j("mediumImage", true);
                    m1Var.j("smallImage", true);
                    descriptor = m1Var;
                }

                private a() {
                }

                @Override // m63.e0
                public final i63.c<?>[] childSerializers() {
                    y1 y1Var = y1.f117048a;
                    return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
                }

                @Override // i63.b
                public final Object deserialize(l63.e eVar) {
                    eVar.getClass();
                    k63.e eVar2 = descriptor;
                    l63.c cVarC = eVar.c(eVar2);
                    int i14 = l63.c.f110557a;
                    boolean z14 = true;
                    int i15 = 0;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    while (z14) {
                        int iE = cVarC.e(eVar2);
                        if (iE == -1) {
                            z14 = false;
                        } else if (iE == 0) {
                            str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                            i15 |= 1;
                        } else if (iE == 1) {
                            str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                            i15 |= 2;
                        } else if (iE == 2) {
                            str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                            i15 |= 4;
                        } else {
                            if (iE != 3) {
                                hb.a.o(iE);
                                return null;
                            }
                            str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                            i15 |= 8;
                        }
                    }
                    cVarC.b(eVar2);
                    return new C3786c(i15, str, str2, str3, str4, (u1) null);
                }

                @Override // i63.i, i63.b
                /* JADX INFO: renamed from: getDescriptor */
                public final k63.e getF116202c() {
                    return descriptor;
                }

                @Override // i63.i
                public final void serialize(l63.f fVar, Object obj) {
                    C3786c c3786c = (C3786c) obj;
                    c3786c.getClass();
                    String str = c3786c.f203013d;
                    String str2 = c3786c.f203012c;
                    String str3 = c3786c.f203011b;
                    String str4 = c3786c.f203010a;
                    k63.e eVar = descriptor;
                    l63.d dVarC = fVar.c(eVar);
                    if (dVarC.C(eVar) || str4 != null) {
                        dVarC.d(eVar, 0, y1.f117048a, str4);
                    }
                    if (dVarC.C(eVar) || str3 != null) {
                        dVarC.d(eVar, 1, y1.f117048a, str3);
                    }
                    if (dVarC.C(eVar) || str2 != null) {
                        dVarC.d(eVar, 2, y1.f117048a, str2);
                    }
                    if (dVarC.C(eVar) || str != null) {
                        dVarC.d(eVar, 3, y1.f117048a, str);
                    }
                    dVarC.b(eVar);
                }
            }

            public /* synthetic */ C3786c(int i14, String str, String str2, String str3, String str4, u1 u1Var) {
                if ((i14 & 1) == 0) {
                    this.f203010a = null;
                } else {
                    this.f203010a = str;
                }
                if ((i14 & 2) == 0) {
                    this.f203011b = null;
                } else {
                    this.f203011b = str2;
                }
                if ((i14 & 4) == 0) {
                    this.f203012c = null;
                } else {
                    this.f203012c = str3;
                }
                if ((i14 & 8) == 0) {
                    this.f203013d = null;
                } else {
                    this.f203013d = str4;
                }
            }

            public final String a() {
                String str = this.f203010a;
                if (str != null && !w.J(str)) {
                    return str;
                }
                String str2 = this.f203011b;
                if (str2 != null && !w.J(str2)) {
                    return str2;
                }
                String str3 = this.f203012c;
                if (str3 != null && !w.J(str3)) {
                    return str3;
                }
                String str4 = this.f203013d;
                if (str4 == null || w.J(str4)) {
                    return null;
                }
                return str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3786c)) {
                    return false;
                }
                C3786c c3786c = (C3786c) obj;
                return s.g(this.f203010a, c3786c.f203010a) && s.g(this.f203011b, c3786c.f203011b) && s.g(this.f203012c, c3786c.f203012c) && s.g(this.f203013d, c3786c.f203013d);
            }

            public final int hashCode() {
                String str = this.f203010a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f203011b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f203012c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f203013d;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                return e5.h(p6.b.i("SkuImage(highResImage=", this.f203010a, ", largeImage=", this.f203011b, ", mediumImage="), this.f203012c, ", smallImage=", this.f203013d, ")");
            }

            /* JADX INFO: renamed from: z80.d$c$c$b, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/d$c$c$b;", "", "<init>", "()V", "Li63/c;", "Lz80/d$c$c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                public final i63.c<C3786c> serializer() {
                    return a.f203014a;
                }

                private Companion() {
                }
            }

            public C3786c() {
                this((String) null, (String) null, (String) null, (String) null, 15, (p005kotlin.jvm.internal.j) null);
            }

            public C3786c(String str, String str2, String str3, String str4) {
                this.f203010a = str;
                this.f203011b = str2;
                this.f203012c = str3;
                this.f203013d = str4;
            }

            public /* synthetic */ C3786c(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
            }
        }

        /* JADX INFO: renamed from: z80.d$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/d$c$b;", "", "<init>", "()V", "Li63/c;", "Lz80/d$c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f203009a;
            }

            private Companion() {
            }
        }

        public c() {
            this((C3786c) null, (C3786c) null, (C3786c) null, (C3786c) null, (C3786c) null, (C3786c) null, (C3786c) null, 127, (p005kotlin.jvm.internal.j) null);
        }

        public c(C3786c c3786c, C3786c c3786c2, C3786c c3786c3, C3786c c3786c4, C3786c c3786c5, C3786c c3786c6, C3786c c3786c7) {
            this.f203002a = c3786c;
            this.f203003b = c3786c2;
            this.f203004c = c3786c3;
            this.f203005d = c3786c4;
            this.f203006e = c3786c5;
            this.f203007f = c3786c6;
            this.f203008g = c3786c7;
        }

        public /* synthetic */ c(C3786c c3786c, C3786c c3786c2, C3786c c3786c3, C3786c c3786c4, C3786c c3786c5, C3786c c3786c6, C3786c c3786c7, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : c3786c, (i14 & 2) != 0 ? null : c3786c2, (i14 & 4) != 0 ? null : c3786c3, (i14 & 8) != 0 ? null : c3786c4, (i14 & 16) != 0 ? null : c3786c5, (i14 & 32) != 0 ? null : c3786c6, (i14 & 64) != 0 ? null : c3786c7);
        }
    }

    public /* synthetic */ d(String str, Boolean bool, Boolean bool2, List list, String str2, String str3, c cVar, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : cVar, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : num2, (i14 & 4096) != 0 ? null : num3, (i14 & 8192) != 0 ? null : str7, (i14 & 16384) != 0 ? null : str8, (i14 & 32768) != 0 ? null : str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f202985a, dVar.f202985a) && s.g(this.f202986b, dVar.f202986b) && s.g(this.f202987c, dVar.f202987c) && s.g(this.f202988d, dVar.f202988d) && s.g(this.f202989e, dVar.f202989e) && s.g(this.f202990f, dVar.f202990f) && s.g(this.f202991g, dVar.f202991g) && s.g(this.f202992h, dVar.f202992h) && s.g(this.f202993i, dVar.f202993i) && s.g(this.f202994j, dVar.f202994j) && s.g(this.f202995k, dVar.f202995k) && s.g(this.f202996l, dVar.f202996l) && s.g(this.f202997m, dVar.f202997m) && s.g(this.f202998n, dVar.f202998n) && s.g(this.f202999o, dVar.f202999o) && s.g(this.f203000p, dVar.f203000p);
    }

    public final int hashCode() {
        String str = this.f202985a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f202986b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f202987c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.f202988d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f202989e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f202990f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c cVar = this.f202991g;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str4 = this.f202992h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f202993i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f202994j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f202995k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f202996l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f202997m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f202998n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f202999o;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f203000p;
        return iHashCode15 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceGeneralInfoDTO(applicationKey=");
        sb3.append(this.f202985a);
        sb3.append(", bluetoothClassicDevice=");
        sb3.append(this.f202986b);
        sb3.append(", bluetoothLowEnergyDevice=");
        sb3.append(this.f202987c);
        sb3.append(", deviceCategories=");
        sb3.append(this.f202988d);
        sb3.append(", deviceId=");
        sn.a.t(sb3, this.f202989e, ", deviceName=", this.f202990f, ", deviceTutorialImages=");
        sb3.append(this.f202991g);
        sb3.append(", excludeCountries=");
        sb3.append(this.f202992h);
        sb3.append(", imageURL=");
        sn.a.t(sb3, this.f202993i, ", includeCountries=", this.f202994j, ", minGCMAndroidVersion=");
        x.m(sb3, this.f202995k, ", minGCMHarmonyVersion=", this.f202996l, ", minGCMiOSVersion=");
        p6.b.l(this.f202997m, ", partNumber=", this.f202998n, ", productSKU=", sb3);
        return e5.h(sb3, this.f202999o, ", serialNumber=", this.f203000p, ")");
    }

    /* JADX INFO: renamed from: z80.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/d$b;", "", "<init>", "()V", "Li63/c;", "Lz80/d;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f203001a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(int i14, String str, Boolean bool, Boolean bool2, List list, String str2, String str3, c cVar, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f202985a = null;
        } else {
            this.f202985a = str;
        }
        if ((i14 & 2) == 0) {
            this.f202986b = null;
        } else {
            this.f202986b = bool;
        }
        if ((i14 & 4) == 0) {
            this.f202987c = null;
        } else {
            this.f202987c = bool2;
        }
        if ((i14 & 8) == 0) {
            this.f202988d = null;
        } else {
            this.f202988d = list;
        }
        if ((i14 & 16) == 0) {
            this.f202989e = null;
        } else {
            this.f202989e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f202990f = null;
        } else {
            this.f202990f = str3;
        }
        if ((i14 & 64) == 0) {
            this.f202991g = null;
        } else {
            this.f202991g = cVar;
        }
        if ((i14 & 128) == 0) {
            this.f202992h = null;
        } else {
            this.f202992h = str4;
        }
        if ((i14 & 256) == 0) {
            this.f202993i = null;
        } else {
            this.f202993i = str5;
        }
        if ((i14 & 512) == 0) {
            this.f202994j = null;
        } else {
            this.f202994j = str6;
        }
        if ((i14 & 1024) == 0) {
            this.f202995k = null;
        } else {
            this.f202995k = num;
        }
        if ((i14 & 2048) == 0) {
            this.f202996l = null;
        } else {
            this.f202996l = num2;
        }
        if ((i14 & 4096) == 0) {
            this.f202997m = null;
        } else {
            this.f202997m = num3;
        }
        if ((i14 & 8192) == 0) {
            this.f202998n = null;
        } else {
            this.f202998n = str7;
        }
        if ((i14 & 16384) == 0) {
            this.f202999o = null;
        } else {
            this.f202999o = str8;
        }
        if ((i14 & 32768) == 0) {
            this.f203000p = null;
        } else {
            this.f203000p = str9;
        }
    }

    public d(String str, Boolean bool, Boolean bool2, List<String> list, String str2, String str3, c cVar, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9) {
        this.f202985a = str;
        this.f202986b = bool;
        this.f202987c = bool2;
        this.f202988d = list;
        this.f202989e = str2;
        this.f202990f = str3;
        this.f202991g = cVar;
        this.f202992h = str4;
        this.f202993i = str5;
        this.f202994j = str6;
        this.f202995k = num;
        this.f202996l = num2;
        this.f202997m = num3;
        this.f202998n = str7;
        this.f202999o = str8;
        this.f203000p = str9;
    }

    public d() {
        this((String) null, (Boolean) null, (Boolean) null, (List) null, (String) null, (String) null, (c) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, 65535, (p005kotlin.jvm.internal.j) null);
    }
}
