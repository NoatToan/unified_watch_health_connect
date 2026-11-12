package i90;

import android.content.Context;
import bs2.sw;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISportProfileSetup;
import com.garmin.proto.generated.GDISportProfileSetupExtension;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.l0;
import p13.y;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li90/f;", "Ldt2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements dt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f92289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dt2.g f92290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f92291d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92292a;

        static {
            int[] iArr = new int[sw.values().length];
            try {
                iArr[sw.ROAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sw.INDOOR_CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sw.MOUNTAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sw.GRAVEL_CYCLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sw.CYCLOCROSS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sw.COMMUTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[sw.MIXED_SURFACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[sw.E_BIKE_FITNESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[sw.E_BIKE_MOUNTAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[sw.DOWNHILL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[sw.ENDURO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[sw.E_BIKE_ENDURO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f92292a = iArr;
        }
    }

    static {
        new a(null);
    }

    public f(Context context) {
        context.getClass();
        this.f92289b = context;
        this.f92291d = l0.f134950a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f92295c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f92295c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objB = gVar.f92293a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f92295c;
        try {
            if (i15 == 0) {
                r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISportProfileSetupExtension.sportProfileSetupService, GDISportProfileSetup.SportProfileSetupService.newBuilder().setSupportedSportListRequest(GDISportProfileSetup.SupportedSportListRequest.newBuilder()).build()).build();
                a2 a2Var = a2.BIC;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SportProfileDataHandler", "fetchSupportedSportList: sending request");
                dt2.g gVar2 = this.f92290c;
                if (gVar2 == null) {
                    throw new IllegalStateException("Messenger is null, handler not started");
                }
                smartBuild.getClass();
                gVar.f92295c = 1;
                objB = gVar2.b(smartBuild, gVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            return d((GDISmartProto.Smart) objB);
        } catch (Exception e4) {
            a2 a2Var2 = a2.BIC;
            String strN = fb1.c.n("fetchSupportedSportList: request failed - ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SportProfileDataHandler", strN);
            throw e4;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        this.f92290c = null;
        a2 a2Var = a2.BIC;
        String strConcat = "close: ".concat(str);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SportProfileDataHandler", strConcat);
    }

    public final p<List<j90.n>, Boolean> d(GDISmartProto.Smart smart) {
        String string;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISportProfileSetup.SportProfileSetupService> generatedExtension = GDISportProfileSetupExtension.sportProfileSetupService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            a2 a2Var = a2.BIC;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SportProfileDataHandler", "parseSportListResponse: extension missing in response");
            return new p<>(j0.f134944a, Boolean.FALSE);
        }
        GDISportProfileSetup.SportProfileSetupService sportProfileSetupService = (GDISportProfileSetup.SportProfileSetupService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (!sportProfileSetupService.hasSupportedSportListResponse()) {
            a2 a2Var2 = a2.BIC;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SportProfileDataHandler", "parseSportListResponse: no SupportedSportListResponse in service");
            return new p<>(j0.f134944a, Boolean.FALSE);
        }
        GDISportProfileSetup.SupportedSportListResponse supportedSportListResponse = sportProfileSetupService.getSupportedSportListResponse();
        boolean profileSetupComplete = supportedSportListResponse.hasProfileSetupComplete() ? supportedSportListResponse.getProfileSetupComplete() : false;
        List<GDISportProfileSetup.Sport> sportList = supportedSportListResponse.getSportList();
        ArrayList<GDISportProfileSetup.Sport> arrayListL = androidx.core.view.j.l(sportList);
        for (Object obj : sportList) {
            GDISportProfileSetup.Sport sport = (GDISportProfileSetup.Sport) obj;
            if (sport.hasSportFitType() && sport.hasSportFitSubType() && sport.hasEnabled()) {
                arrayListL.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(y.r(arrayListL, 10));
        for (GDISportProfileSetup.Sport sport2 : arrayListL) {
            int sportFitType = sport2.getSportFitType();
            int sportFitSubType = sport2.getSportFitSubType();
            sw swVarA = sw.a(Short.valueOf((short) sport2.getSportFitSubType()));
            int i14 = swVarA == null ? -1 : b.f92292a[swVarA.ordinal()];
            Context context = this.f92289b;
            switch (i14) {
                case 1:
                    string = context.getString(R.string.lbl_road);
                    string.getClass();
                    break;
                case 2:
                    string = context.getString(R.string.activity_options_indoor_title);
                    string.getClass();
                    break;
                case 3:
                    string = context.getString(R.string.lbl_mountain);
                    string.getClass();
                    break;
                case 4:
                    string = context.getString(R.string.lbl_surface_type_gravel);
                    string.getClass();
                    break;
                case 5:
                    string = context.getString(R.string.lbl_cyclocross);
                    string.getClass();
                    break;
                case 6:
                    string = context.getString(R.string.lbl_commute);
                    string.getClass();
                    break;
                case 7:
                    string = context.getString(R.string.lbl_tour);
                    string.getClass();
                    break;
                case 8:
                    string = context.getString(R.string.startup_activity_profile_type_ebike);
                    string.getClass();
                    break;
                case 9:
                    string = context.getString(R.string.startup_activity_profile_type_emountain);
                    string.getClass();
                    break;
                case 10:
                    string = context.getString(R.string.lbl_downhill_mtb);
                    string.getClass();
                    break;
                case 11:
                    string = context.getString(R.string.lbl_enduro_mtb);
                    string.getClass();
                    break;
                case 12:
                    string = context.getString(R.string.lbl_e_enduro_mtb);
                    string.getClass();
                    break;
                default:
                    string = swVarA.name();
                    string.getClass();
                    break;
            }
            arrayList.add(new j90.n(sportFitType, sportFitSubType, string, sport2.getEnabled()));
        }
        a2 a2Var3 = a2.BIC;
        String str = "parseSportListResponse: " + arrayList.size() + " sports, profileSetupComplete=" + profileSetupComplete;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "SportProfileDataHandler", str);
        return new p<>(arrayList, Boolean.valueOf(profileSetupComplete));
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f92291d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(List list, v13.c cVar) throws Exception {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f92298c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f92298c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f92296a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f92298c;
        try {
            if (i15 == 0) {
                r.b(obj);
                GDISportProfileSetup.SelectedSportListNotification.Builder builderNewBuilder = GDISportProfileSetup.SelectedSportListNotification.newBuilder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j90.n nVar = (j90.n) it.next();
                    builderNewBuilder.addSport(GDISportProfileSetup.Sport.newBuilder().setEnabled(nVar.f97843d).setSportFitType(nVar.f97840a).setSportFitSubType(nVar.f97841b));
                }
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISportProfileSetupExtension.sportProfileSetupService, GDISportProfileSetup.SportProfileSetupService.newBuilder().setSelectedSportListNotification(builderNewBuilder).build()).build();
                a2 a2Var = a2.BIC;
                String strF = e0.f(list.size(), "sendSelectedSportList: sending ", " sports");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SportProfileDataHandler", strF);
                dt2.g gVar = this.f92290c;
                if (gVar == null) {
                    throw new IllegalStateException("Messenger is null, handler not started");
                }
                smartBuild.getClass();
                hVar.f92298c = 1;
                if (gVar.c(smartBuild, hVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            a2 a2Var2 = a2.BIC;
            String strN = fb1.c.n("sendSelectedSportList: failed - ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SportProfileDataHandler", strN);
            throw e4;
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f92290c = gVar;
        extensionRegistryLite.add(GDISportProfileSetupExtension.sportProfileSetupService);
        i2.f36769a.getClass();
        i2.a.b(a2.BIC, "SportProfileDataHandler", "start: " + cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
