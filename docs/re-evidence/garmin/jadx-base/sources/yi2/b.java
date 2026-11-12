package yi2;

import android.content.Context;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDICalendarExtension;
import com.garmin.proto.generated.GDICalendarProto;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.Set;
import o13.r;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.a1;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyi2/b;", "Ldt2/a;", "Ldt2/h;", "Ldt2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyi2/k;", "delegate", "Lkotlin/Function1;", "", "Lzj2/e;", "dataTransferServiceDelegate", "<init>", "(Landroid/content/Context;Lyi2/k;Le23/l;)V", "calendar-device_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements dt2.a, dt2.h, dt2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f197358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<String, zj2.e> f197359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f197360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Logger f197361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u53.d f197362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f197363g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197364a;

        static {
            int[] iArr = new int[n.a.values().length];
            try {
                iArr[n.a.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.a.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.a.TENTATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.a.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f197364a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, k kVar, e23.l<? super String, zj2.e> lVar) {
        context.getClass();
        kVar.getClass();
        this.f197358b = kVar;
        this.f197359c = lVar;
        this.f197360d = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(b bVar, v13.c cVar) {
        c cVar2;
        bVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f197368d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f197368d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(bVar, cVar);
            }
        } else {
            cVar2 = new c(bVar, cVar);
        }
        Object objP = cVar2.f197366b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f197368d;
        if (i15 == 0) {
            r.b(objP);
            if (a7.b.checkSelfPermission(bVar.f197360d, "android.permission.READ_CALENDAR") == 0) {
                return Boolean.TRUE;
            }
            Logger logger = bVar.f197361e;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.debug("Requesting calendar permission");
            cVar2.f197365a = bVar;
            cVar2.f197368d = 1;
            o53.k kVar = new o53.k(u13.f.b(cVar2), 1);
            kVar.q();
            bVar.f197358b.requestCalendarPermission(new d(kVar));
            objP = kVar.p();
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = cVar2.f197365a;
            r.b(objP);
        }
        return Boolean.valueOf(((Boolean) objP).booleanValue() && a7.b.checkSelfPermission(bVar.f197360d, "android.permission.READ_CALENDAR") == 0);
    }

    public static final GDISmartProto.Smart d(b bVar, GDICalendarProto.CalendarEventsResponse.ResponseStatus responseStatus) {
        bVar.getClass();
        GDICalendarProto.CalendarService calendarServiceBuild = GDICalendarProto.CalendarService.newBuilder().setCalendarEventsResponse(GDICalendarProto.CalendarEventsResponse.newBuilder().setStatus(responseStatus)).build();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDICalendarExtension.calendarEventsService, calendarServiceBuild);
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        smartBuild.getClass();
        return smartBuild;
    }

    public static String l(int i14, String str) {
        int i15;
        int i16;
        if (str != null && i14 != 0) {
            byte[] bytes = str.getBytes(d53.c.f57666b);
            bytes.getClass();
            if (bytes.length > i14) {
                int i17 = 0;
                int i18 = 0;
                while (i17 < str.length()) {
                    char cCharAt = str.charAt(i17);
                    if (cCharAt <= 127) {
                        i16 = 0;
                        i15 = 1;
                    } else if (cCharAt <= 2047) {
                        i15 = 2;
                        i16 = 0;
                    } else if (cCharAt > 55295 && cCharAt <= 57343) {
                        i15 = 4;
                        i16 = 1;
                    } else {
                        i16 = 0;
                        i15 = 3;
                    }
                    i18 += i15;
                    if (i18 > i14) {
                        return str.substring(0, i17);
                    }
                    i17 = i17 + i16 + 1;
                }
            }
        }
        return str;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f197362f;
        if (dVar == null) {
            s.m("coroutineScope");
            throw null;
        }
        c0.d(dVar, "CalendarController[" + str + "] closed");
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        GDICalendarExtension.registerAllExtensions(extensionRegistryLite);
        GDICalendarProto.registerAllExtensions(extensionRegistryLite);
        GDICalendarProto.CapabilitiesRequest.Builder builderNewBuilder = GDICalendarProto.CapabilitiesRequest.newBuilder();
        builderNewBuilder.setCalendarFeaturesVersion(1);
        builder.setExtension(GDICalendarProto.CapabilitiesRequest.expandedCalendarRequest, builderNewBuilder.build());
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return a1.b(49);
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        GDICalendarProto.CalendarRequest calendarRequest;
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICalendarProto.CalendarService> generatedExtension = GDICalendarExtension.calendarEventsService;
        GDICalendarProto.CalendarService calendarService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDICalendarProto.CalendarService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (calendarService == null) {
            return false;
        }
        if (!calendarService.hasCalendarEventsRequest() && !calendarService.hasCalendarRequest()) {
            return false;
        }
        if (calendarService.hasCalendarRequest() && (calendarRequest = calendarService.getCalendarRequest()) != null) {
            u53.d dVar = this.f197362f;
            if (dVar != null) {
                ge1.b.T(dVar, null, null, new h(this, calendarRequest, kVar, null), 3);
                return true;
            }
            s.m("coroutineScope");
            throw null;
        }
        GDICalendarProto.CalendarEventsRequest calendarEventsRequest = calendarService.getCalendarEventsRequest();
        if (!calendarEventsRequest.hasStartDate() || !calendarEventsRequest.hasEndDate()) {
            return false;
        }
        u53.d dVar2 = this.f197362f;
        if (dVar2 != null) {
            ge1.b.T(dVar2, null, null, new g(calendarEventsRequest, this, kVar, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDICalendarProto.CapabilitiesResponse> generatedExtension = GDICalendarProto.CapabilitiesResponse.expandedCalendarResponse;
        if (featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        GDICalendarExtension.registerAllExtensions(extensionRegistryLite);
        GDICalendarProto.registerAllExtensions(extensionRegistryLite);
        StringBuilder sb3 = new StringBuilder("CalendarController[");
        String str = ((us2.f) cVar).f172493a;
        String strM = a0.m(sb3, str, ']');
        Logger logger = LoggerFactory.getLogger(strM);
        logger.getClass();
        this.f197361e = logger;
        this.f197362f = q2.l(strM);
        this.f197363g = str;
        ((dt2.d) gVar).f61154i.add(this);
    }

    public /* synthetic */ b(Context context, k kVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? null : lVar);
    }
}
