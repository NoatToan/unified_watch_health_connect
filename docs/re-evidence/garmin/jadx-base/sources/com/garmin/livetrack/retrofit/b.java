package com.garmin.livetrack.retrofit;

import android.content.Context;
import c83.a0;
import c83.b0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.s;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import lc.u0;
import o13.t;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/garmin/livetrack/retrofit/b;", "Lmd2/a;", "Lpt2/b;", "credentialsProvider", "<init>", "(Lpt2/b;)V", JWKParameterNames.RSA_EXPONENT, "c", "b", "a", "d", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements md2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt2.b f52430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f52431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n63.o f52432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f52433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f52434e;

    public interface a {
    }

    /* JADX INFO: renamed from: com.garmin.livetrack.retrofit.b$b, reason: collision with other inner class name */
    public interface InterfaceC1117b {
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/livetrack/retrofit/b$c;", "", "Lc83/a0;", "Lst2/d;", "a", "(Lt13/d;)Ljava/lang/Object;", "", "path", "", "b", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "c", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        @i83.f("personal-url")
        Object a(t13.d<? super a0<st2.d>> dVar);

        @i83.g("personal-url/{path}")
        Object b(@s("path") String str, t13.d<? super a0<Unit>> dVar);

        @i83.p("personal-url/{path}")
        Object c(@s("path") String str, t13.d<? super a0<Unit>> dVar);
    }

    public interface d {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bb\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/garmin/livetrack/retrofit/b$e;", "", "Lc83/a0;", "Lst2/g;", "b", "(Lt13/d;)Ljava/lang/Object;", "", "profileSetting", "levels", "", "d", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lst2/e;", "f", "passcode", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "c", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface e {
        @i83.f("v2/user")
        Object b(t13.d<? super a0<st2.g>> dVar);

        @i83.b("v1/profile/privacy/passcode")
        Object c(t13.d<? super a0<Unit>> dVar);

        @i83.n("v2/profile/privacy/{profileSetting}")
        Object d(@s("profileSetting") String str, @i83.t("levels") String str2, t13.d<? super a0<Unit>> dVar);

        @i83.p("v1/profile/privacy/passcode")
        Object e(@i83.a String str, t13.d<? super a0<Unit>> dVar);

        @i83.f("v1/profile/privacy/passcode")
        Object f(t13.d<? super a0<st2.e>> dVar);
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52435a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52435a = iArr;
        }
    }

    public b(pt2.b bVar) {
        bVar.getClass();
        this.f52430a = bVar;
        Logger logger = LoggerFactory.getLogger("LVT#RetrofitManager");
        logger.getClass();
        this.f52431b = logger;
        this.f52432c = n63.p.a(new ch1.f(16));
        final int i14 = 0;
        this.f52433d = o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i14) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i15 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i15 == 1 || i15 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i16 = b.f.f52435a[aVarC2.ordinal()];
                            if (i16 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i16 != 2) {
                                str = i16 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i17 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i17 != 1) {
                                fVar = i17 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
        final int i15 = 1;
        this.f52434e = o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i15) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i16 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i16 == 1 || i16 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i17 = b.f.f52435a[aVarC2.ordinal()];
                            if (i17 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i17 != 2) {
                                str = i17 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i18 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i18 != 1) {
                                fVar = i18 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
        final int i16 = 2;
        o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i16) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i17 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i17 == 1 || i17 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i18 = b.f.f52435a[aVarC2.ordinal()];
                            if (i18 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i18 != 2) {
                                str = i18 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i19 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i19 != 1) {
                                fVar = i19 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
        final int i17 = 3;
        o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i17) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i18 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i18 == 1 || i18 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i19 = b.f.f52435a[aVarC2.ordinal()];
                            if (i19 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i19 != 2) {
                                str = i19 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i110 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i110 != 1) {
                                fVar = i110 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
        final int i18 = 4;
        o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i18) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i19 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i19 == 1 || i19 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i110 = b.f.f52435a[aVarC2.ordinal()];
                            if (i110 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i110 != 2) {
                                str = i110 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i111 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i111 != 1) {
                                fVar = i111 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
        final int i19 = 5;
        o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i19) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i110 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i110 == 1 || i110 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i111 = b.f.f52435a[aVarC2.ordinal()];
                            if (i111 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i111 != 2) {
                                str = i111 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i112 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i112 != 1) {
                                fVar = i112 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
        final int i24 = 6;
        o13.m.b(new e23.a(this) { // from class: com.garmin.livetrack.retrofit.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f52429b;

            {
                this.f52429b = this;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x008a  */
            /* JADX WARN: Code duplicated, block: B:75:0x0135  */
            @Override // e23.a
            public final Object invoke() {
                ad2.a aVarA;
                OkHttpClient okHttpClientC;
                ad2.a aVarA2;
                OkHttpClient okHttpClientC2;
                zi2.a aVarC;
                OkHttpClient okHttpClientC3;
                OkHttpClient okHttpClientC4;
                zi2.a aVarC2;
                String str;
                OkHttpClient okHttpClientC5;
                ad2.f fVar;
                OkHttpClient okHttpClientC6;
                ad2.a aVarA3;
                OkHttpClient okHttpClientC7;
                switch (i24) {
                    case 0:
                        b bVar2 = this.f52429b;
                        pt2.b bVar3 = bVar2.f52430a;
                        ve2.e eVarA = bVar3.a();
                        if (eVarA == null || (aVarA = ad2.b.a(eVarA)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG = b.g(aVarA.f2774a, "tracker/settings/api");
                            pt2.e eVar = bVar3.f141041e;
                            if (eVar != null && (okHttpClientC = eVar.c()) != null) {
                                return (b.e) bVar2.e(strG, okHttpClientC).b(b.e.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 1:
                        b bVar4 = this.f52429b;
                        pt2.b bVar5 = bVar4.f52430a;
                        ve2.e eVarA2 = bVar5.a();
                        if (eVarA2 == null || (aVarA2 = ad2.b.a(eVarA2)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG2 = b.g(aVarA2.f2774a, "tracker/livetrack/api/v1");
                            pt2.e eVar2 = bVar5.f141041e;
                            if (eVar2 != null && (okHttpClientC2 = eVar2.c()) != null) {
                                return (b.c) bVar4.e(strG2, okHttpClientC2).b(b.c.class);
                            }
                            vb.h.s("Cannot make Livetrack Settings API call without valid IT OAuth2 credentials");
                        }
                        return null;
                    case 2:
                        b bVar6 = this.f52429b;
                        pt2.b bVar7 = bVar6.f52430a;
                        ve2.e eVarA3 = bVar7.a();
                        if (eVarA3 == null || (aVarC = ve2.f.c(eVarA3)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG3 = b.g(aVarC.f204881b, "usercontact-service/livetrack-management");
                            pt2.c cVar = bVar7.f141040d;
                            if (cVar != null && (okHttpClientC3 = cVar.c()) != null) {
                                return (b.InterfaceC1117b) bVar6.e(strG3, okHttpClientC3).b(b.InterfaceC1117b.class);
                            }
                            vb.h.s("Cannot make Livetrack Contacts API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 3:
                        b bVar8 = this.f52429b;
                        pt2.b bVar9 = bVar8.f52430a;
                        ve2.e eVarA4 = bVar9.a();
                        if (eVarA4 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i110 = ve2.f.a.f177722a[eVarA4.ordinal()];
                            ad2.c cVar2 = (i110 == 1 || i110 == 2) ? ad2.c.PROD : ad2.c.TEST;
                            if (cVar2 != null) {
                                String strG4 = b.g(cVar2.f2779a, "phone-numbers");
                                pt2.e eVar3 = bVar9.f141041e;
                                if (eVar3 != null && (okHttpClientC4 = eVar3.c()) != null) {
                                    return (b.a) bVar8.e(strG4, okHttpClientC4).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Comms API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    case 4:
                        b bVar10 = this.f52429b;
                        pt2.b bVar11 = bVar10.f52430a;
                        ve2.e eVarA5 = bVar11.a();
                        if (eVarA5 == null || (aVarC2 = ve2.f.c(eVarA5)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i111 = b.f.f52435a[aVarC2.ordinal()];
                            if (i111 == 1) {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204886a;
                            } else if (i111 != 2) {
                                str = i111 != 3 ? zi2.b.GARMIN_ATP_GATEWAY_TEST.f204886a : zi2.b.GARMIN_ATP_GATEWAY_TEST.f204887b;
                            } else {
                                str = zi2.b.GARMIN_ATP_GATEWAY.f204887b;
                            }
                            String strG5 = b.g(str, "services/template/livetrack");
                            pt2.c cVar3 = bVar11.f141040d;
                            if (cVar3 != null && (okHttpClientC5 = cVar3.c()) != null) {
                                return (b.a) bVar10.e(strG5, okHttpClientC5).b(b.a.class);
                            }
                            vb.h.s("Cannot make LConnect Web API call without valid DI OAuth2 credentials");
                        }
                        return null;
                    case 5:
                        b bVar12 = this.f52429b;
                        pt2.b bVar13 = bVar12.f52430a;
                        ve2.e eVarA6 = bVar13.a();
                        if (eVarA6 == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            int i112 = ve2.f.a.f177722a[eVarA6.ordinal()];
                            if (i112 != 1) {
                                fVar = i112 != 2 ? ad2.f.TEST : ad2.f.CHINA;
                            } else {
                                fVar = ad2.f.PROD;
                            }
                            if (fVar != null) {
                                String strG6 = b.g(fVar.f2794a, "shortLinkServices");
                                pt2.e eVar4 = bVar13.f141041e;
                                if (eVar4 != null && (okHttpClientC6 = eVar4.c()) != null) {
                                    return (b.a) bVar12.e(strG6, okHttpClientC6).b(b.a.class);
                                }
                                vb.h.s("Cannot make IT Short URL API call without valid IT OAuth2 credentials");
                            } else {
                                vb.h.s("Garmin environment is not set");
                            }
                        }
                        return null;
                    default:
                        b bVar14 = this.f52429b;
                        pt2.b bVar15 = bVar14.f52430a;
                        ve2.e eVarA7 = bVar15.a();
                        if (eVarA7 == null || (aVarA3 = ad2.b.a(eVarA7)) == null) {
                            vb.h.s("Garmin environment is not set");
                        } else {
                            String strG7 = b.g(aVarA3.f2774a, "tracker/livetrack/api");
                            pt2.e eVar5 = bVar15.f141041e;
                            if (eVar5 != null && (okHttpClientC7 = eVar5.c()) != null) {
                                return (b.d) bVar14.e(strG7, okHttpClientC7).b(b.d.class);
                            }
                            vb.h.s("Cannot make Livetrack Session API call without valid IT or Hermes OAuth2 credentials");
                        }
                        return null;
                }
            }
        });
    }

    public static final e b(b bVar) {
        Object value = bVar.f52433d.getValue();
        value.getClass();
        return (e) value;
    }

    public static String g(String str, String str2) {
        return e0.g("https://", str, "/", str2, "/");
    }

    @Override // md2.a
    public final Object a(String str, md2.c cVar, md2.b bVar) {
        return md2.a.C2243a.b(this, str, cVar, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, v13.c cVar) {
        com.garmin.livetrack.retrofit.c cVar2;
        if (cVar instanceof com.garmin.livetrack.retrofit.c) {
            cVar2 = (com.garmin.livetrack.retrofit.c) cVar;
            int i14 = cVar2.f52438c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f52438c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new com.garmin.livetrack.retrofit.c(this, cVar);
            }
        } else {
            cVar2 = new com.garmin.livetrack.retrofit.c(this, cVar);
        }
        Object objA = cVar2.f52436a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f52438c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Create personal url for path = " + str);
            com.garmin.livetrack.retrofit.d dVar = new com.garmin.livetrack.retrofit.d(this, str, null);
            cVar2.f52438c = 1;
            objA = md2.a.C2243a.a(this, dVar, cVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("createPersonalUrl successful; response = {}", aVar2);
            return new pt2.g(Unit.INSTANCE, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar2;
        Exception exc = c3415a.f184312a;
        Integer num = c3415a.f184313b;
        if ((num == null || num.intValue() != 400) && ((num == null || num.intValue() != 403) && (num == null || num.intValue() != 409))) {
            logger.error("createPersonalUrl error! response = " + aVar2);
            return new pt2.g(null, exc);
        }
        st2.b bVarH = h("createPersonalUrl", c3415a.f184314c);
        Integer num2 = bVarH != null ? bVarH.f160916f : null;
        if (num2 != null && num2.intValue() == 6006) {
            return new pt2.g(null, new Exception("The personal URL is invalid. It must be 3-64 characters long and can only contain letters, numbers, dashes, and underscores."));
        }
        if (num2 != null && num2.intValue() == 6004) {
            return new pt2.g(null, new Exception("User does not have an active subscription that allows a personal url."));
        }
        if (num2 != null && num2.intValue() == 6001) {
            return new pt2.g(null, new Exception("The personal URL is already taken. Please choose a different URL."));
        }
        logger.error("createPersonalUrl error! response = " + aVar2 + ", error = " + bVarH);
        return new pt2.g(null, exc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v13.c cVar) {
        com.garmin.livetrack.retrofit.e eVar;
        if (cVar instanceof com.garmin.livetrack.retrofit.e) {
            eVar = (com.garmin.livetrack.retrofit.e) cVar;
            int i14 = eVar.f52444c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f52444c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new com.garmin.livetrack.retrofit.e(this, cVar);
            }
        } else {
            eVar = new com.garmin.livetrack.retrofit.e(this, cVar);
        }
        Object objA = eVar.f52442a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f52444c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Create profile passcode for the user");
            com.garmin.livetrack.retrofit.f fVar = new com.garmin.livetrack.retrofit.f(this, str, null);
            eVar.f52444c = 1;
            objA = md2.a.C2243a.a(this, fVar, eVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("createProfilePasscode successful; response = {}", aVar2);
            return new pt2.g(Unit.INSTANCE, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("createProfilePasscode error! response = " + aVar2);
        return new pt2.g(null, ((wc2.a.C3415a) aVar2).f184312a);
    }

    public final b0 e(String str, OkHttpClient okHttpClient) {
        Context context = this.f52430a.f141038b;
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        List<Interceptor> listInterceptors = okHttpClient.interceptors();
        if (listInterceptors == null || !listInterceptors.isEmpty()) {
            Iterator<T> it = listInterceptors.iterator();
            while (it.hasNext()) {
                if (((Interceptor) it.next()) instanceof id2.i) {
                    builderNewBuilder.addInterceptor(new id2.o(context, "com.garmin.net.livetrack", "1.1.0"));
                    builderNewBuilder.addInterceptor(new id2.d(context));
                    b0.b bVar = new b0.b();
                    bVar.a(f83.c.a(this.f52432c, MediaType.INSTANCE.get("application/json; charset=UTF-8")));
                    bVar.b(str);
                    bVar.d(builderNewBuilder.build());
                    return bVar.c();
                }
            }
        }
        vb.h.s("Okhttp client must supply OAuth2 credentials interceptor");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f52450c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f52450c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objA = gVar.f52448a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f52450c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Delete profile passcode for the user");
            h hVar = new h(this, null);
            gVar.f52450c = 1;
            objA = md2.a.C2243a.a(this, hVar, gVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("deleteProfilePasscode successful; response = {}", aVar2);
            return new pt2.g(Unit.INSTANCE, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("deleteProfilePasscode error! response = " + aVar2);
        return new pt2.g(null, ((wc2.a.C3415a) aVar2).f184312a);
    }

    @Override // md2.a
    public final String getTag() {
        return "LVT#RetrofitManager";
    }

    public final st2.b h(String str, String str2) {
        st2.c cVar;
        List<st2.b> list;
        Logger logger = this.f52431b;
        if (str2 != null) {
            try {
                cVar = (st2.c) this.f52432c.c(st2.c.INSTANCE.serializer(), str2);
            } catch (SerializationException e4) {
                logger.error(str.concat(" error response deserialization failed"), (Throwable) e4);
            } catch (IllegalArgumentException e14) {
                logger.error(str.concat(" error response deserialization failed"), (Throwable) e14);
                return null;
            }
        } else {
            cVar = null;
        }
        if (cVar != null && (list = cVar.f160920b) != null) {
            return (st2.b) h0.d0(list);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(v13.c cVar) {
        i iVar;
        Integer num;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f52455c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f52455c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objA = iVar.f52453a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f52455c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Get personal url for the user");
            j jVar = new j(this, null);
            iVar.f52455c = 1;
            objA = md2.a.C2243a.a(this, jVar, iVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("getPersonalUrl successful; response = {}", aVar2);
            return new pt2.g(((wc2.a.b) aVar2).f184316a, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("getPersonalUrl error! response = " + aVar2);
        wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar2;
        Exception exc = c3415a.f184312a;
        Integer num2 = c3415a.f184313b;
        if (num2 == null || num2.intValue() != 404) {
            return new pt2.g(null, exc);
        }
        st2.b bVarH = h("getPersonalUrl", c3415a.f184314c);
        if (bVarH != null && (num = bVarH.f160916f) != null && num.intValue() == 6003) {
            return new pt2.g(null, new Exception("User does not have a personal url set"));
        }
        logger.error("getPersonalUrl error! response = " + aVar2 + ", error = " + bVarH);
        return new pt2.g(null, exc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f52460c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f52460c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objA = kVar.f52458a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f52460c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Get profile passcode for the user");
            l lVar = new l(this, null);
            kVar.f52460c = 1;
            objA = md2.a.C2243a.a(this, lVar, kVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("getProfilePasscode successful; response = {}", aVar2);
            wc2.a.b bVar = (wc2.a.b) aVar2;
            return bVar.f184317b == 204 ? new pt2.g(null, null, 2, null) : new pt2.g(bVar.f184316a, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("getProfilePasscode error! response = " + aVar2);
        return new pt2.g(null, ((wc2.a.C3415a) aVar2).f184312a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f52465c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f52465c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objA = mVar.f52463a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f52465c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Get Livetrack settings for the user");
            n nVar = new n(this, null);
            mVar.f52465c = 1;
            objA = md2.a.C2243a.a(this, nVar, mVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("getUserSettings successful; response = {}", aVar2);
            st2.g gVar = (st2.g) ((wc2.a.b) aVar2).f184316a;
            rt2.a.f154563a.getClass();
            gVar.getClass();
            if (rt2.a.f154566d.b() == null) {
                vb.h.z("Customer GUID not set. Call setCustomerGuid() before caching user settings.");
                return null;
            }
            h53.b<st2.g> bVar = rt2.a.f154564b;
            while (!bVar.a(bVar.b(), gVar)) {
            }
            h53.b<String> bVar2 = rt2.a.f154565c;
            while (!bVar2.a(bVar2.b(), "")) {
            }
            return new pt2.g(gVar, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar2;
        Exception exc = c3415a.f184312a;
        Integer num = c3415a.f184313b;
        if (num == null || num.intValue() != 304) {
            logger.error("getUserSettings error! response = " + aVar2);
            return new pt2.g(null, exc);
        }
        rt2.a.f154563a.getClass();
        st2.g gVarB = rt2.a.f154564b.b();
        if (gVarB != null) {
            return new pt2.g(gVarB, null, 2, null);
        }
        logger.error("getUserSettings returned 304 but there are no cached user settings");
        return new pt2.g(null, exc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, v13.c cVar) {
        o oVar;
        Integer num;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f52470c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f52470c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objA = oVar.f52468a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f52470c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Check if personal url is available for path = " + str);
            p pVar = new p(this, str, null);
            oVar.f52470c = 1;
            objA = md2.a.C2243a.a(this, pVar, oVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("isPersonalUrlAvailable successful; response = {}", aVar2);
            return new pt2.g(Boolean.FALSE, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar2;
        Exception exc = c3415a.f184312a;
        Integer num2 = c3415a.f184313b;
        if (num2 != null && num2.intValue() == 404) {
            return new pt2.g(Boolean.TRUE, null, 2, null);
        }
        if (num2 == null || num2.intValue() != 400) {
            logger.error("isPersonalUrlAvailable error! response = " + aVar2);
            return new pt2.g(null, exc);
        }
        st2.b bVarH = h("isPersonalUrlAvailable", c3415a.f184314c);
        if (bVarH != null && (num = bVarH.f160916f) != null && num.intValue() == 6006) {
            return new pt2.g(null, new Exception("The personal URL is invalid. It must be 3-64 characters long and can only contain letters, numbers, dashes, and underscores."));
        }
        logger.error("isPersonalUrlAvailable error! response = " + aVar2 + ", error = " + bVarH);
        return new pt2.g(null, exc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, List list, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f52476c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f52476c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objA = qVar.f52474a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f52476c;
        Logger logger = this.f52431b;
        if (i15 == 0) {
            o13.r.b(objA);
            logger.debug("Update Livetrack profile setting for profileSetting = {}, level = {}", str, list);
            r rVar = new r(this, str, h0.k0(list, ",", null, null, new ch1.f(15), 30), null);
            qVar.f52476c = 1;
            objA = md2.a.C2243a.a(this, rVar, qVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        wc2.a aVar2 = (wc2.a) objA;
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("updateProfilePrivacySetting successful; response = {}", aVar2);
            return new pt2.g(Unit.INSTANCE, null, 2, null);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        logger.error("updateProfilePrivacySetting error! response = " + aVar2);
        return new pt2.g(null, ((wc2.a.C3415a) aVar2).f184312a);
    }
}
