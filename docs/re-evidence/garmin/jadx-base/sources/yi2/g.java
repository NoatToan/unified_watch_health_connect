package yi2;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDICalendarExtension;
import com.garmin.proto.generated.GDICalendarProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendarEvents$1", f = "CalendarController.kt", l = {127}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GDICalendarProto.CalendarEventsRequest f197373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f197374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.k f197375d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendarEvents$1$1", f = "CalendarController.kt", l = {150, ModuleDescriptor.MODULE_VERSION, SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f197376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f197377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f197378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GDICalendarProto.CalendarEventsRequest f197379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f197380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ dt2.k f197381f;

        /* JADX INFO: renamed from: yi2.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lyi2/p;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lyi2/p;"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendarEvents$1$1$responseSmart$result$1", f = "CalendarController.kt", l = {}, m = "invokeSuspend")
        public static final class C3698a extends v13.i implements e23.p<b0, t13.d<? super p>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f197382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f197383b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f197384c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ GDICalendarProto.CalendarEventsRequest f197385d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3698a(b bVar, long j8, long j14, GDICalendarProto.CalendarEventsRequest calendarEventsRequest, t13.d<? super C3698a> dVar) {
                super(2, dVar);
                this.f197382a = bVar;
                this.f197383b = j8;
                this.f197384c = j14;
                this.f197385d = calendarEventsRequest;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3698a(this.f197382a, this.f197383b, this.f197384c, this.f197385d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super p> dVar) {
                return ((C3698a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new j(this.f197382a.f197360d).e(this.f197385d.getMaxEvents(), 0, this.f197383b, this.f197384c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GDICalendarProto.CalendarEventsRequest calendarEventsRequest, b bVar, dt2.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f197379d = calendarEventsRequest;
            this.f197380e = bVar;
            this.f197381f = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f197379d, this.f197380e, this.f197381f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:94:0x0204  */
        /* JADX WARN: Code duplicated, block: B:97:0x020c  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
        
            if (r2 == r0) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x01fc, code lost:
        
            if (r3.a(r2, r25) == r0) goto L90;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th3;
            Object objC;
            long j8;
            long j14;
            Object objE0;
            GDISmartProto.Smart smartD;
            Logger logger;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f197378c;
            GDICalendarProto.CalendarEventsRequest calendarEventsRequest = this.f197379d;
            b bVar = this.f197380e;
            if (i14 == 0) {
                r.b(obj);
                long j15 = 1000;
                long startDate = calendarEventsRequest.getStartDate() * j15;
                long endDate = j15 * calendarEventsRequest.getEndDate();
                DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
                String str = dateTimeInstance.format(new Date(startDate));
                String str2 = dateTimeInstance.format(new Date(endDate));
                Logger logger2 = bVar.f197361e;
                th3 = null;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.debug("Calendar events requested for " + str + " to " + str2);
                this.f197376a = startDate;
                this.f197377b = endDate;
                this.f197378c = 1;
                objC = b.c(bVar, this);
                if (objC != aVar) {
                    j8 = startDate;
                    j14 = endDate;
                }
                return aVar;
            }
            if (i14 == 1) {
                long j16 = this.f197377b;
                long j17 = this.f197376a;
                r.b(obj);
                objC = obj;
                th3 = null;
                j14 = j16;
                j8 = j17;
            } else if (i14 == 2) {
                r.b(obj);
                objE0 = obj;
                th3 = null;
                p pVar = (p) objE0;
                boolean zIsEmpty = TextUtils.isEmpty(pVar.f197436b);
                List<i> list = pVar.f197435a;
                String str3 = pVar.f197436b;
                if (zIsEmpty) {
                    Logger logger3 = bVar.f197361e;
                    if (logger3 == null) {
                        s.m("logger");
                        throw th3;
                    }
                    StringBuilder sb3 = new StringBuilder("Calendar events received : ");
                    sb3.append(list != null ? list.size() : 0);
                    logger3.debug(sb3.toString());
                    GDICalendarProto.CalendarEventsResponse.Builder builderNewBuilder = GDICalendarProto.CalendarEventsResponse.newBuilder();
                    builderNewBuilder.setStatus(GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
                    if (list == null) {
                        list = j0.f134944a;
                    }
                    for (i iVar : list) {
                        GDICalendarProto.CalendarEvent.Builder builderNewBuilder2 = GDICalendarProto.CalendarEvent.newBuilder();
                        if (calendarEventsRequest.getIncludeOrganizer()) {
                            builderNewBuilder2.setOrganizer(b.l(calendarEventsRequest.getMaxOrganizerLength(), iVar.f197399b));
                        }
                        if (calendarEventsRequest.getIncludeTitle()) {
                            builderNewBuilder2.setTitle(b.l(calendarEventsRequest.getMaxTitleLength(), iVar.f197398a));
                        }
                        if (calendarEventsRequest.getIncludeLocation()) {
                            builderNewBuilder2.setLocation(b.l(calendarEventsRequest.getMaxLocationLength(), iVar.f197401d));
                        }
                        if (calendarEventsRequest.getIncludeDescription()) {
                            builderNewBuilder2.setDescription(b.l(calendarEventsRequest.getMaxDescriptionLength(), iVar.f197400c));
                        }
                        if (calendarEventsRequest.getIncludeAllDay()) {
                            Boolean bool = iVar.f197404g;
                            builderNewBuilder2.setAllDay(bool != null ? bool.booleanValue() : false);
                        }
                        if (calendarEventsRequest.getIncludeStartDate()) {
                            Long l14 = iVar.f197402e;
                            builderNewBuilder2.setStartDate(l14 != null ? l14.longValue() : 0L);
                        }
                        if (calendarEventsRequest.getIncludeEndDate()) {
                            Long l15 = iVar.f197403f;
                            builderNewBuilder2.setEndDate(l15 != null ? l15.longValue() : 0L);
                        }
                        builderNewBuilder.addEvents(builderNewBuilder2);
                    }
                    GDICalendarProto.CalendarService calendarServiceBuild = GDICalendarProto.CalendarService.newBuilder().setCalendarEventsResponse(builderNewBuilder).build();
                    GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder3.setExtension(GDICalendarExtension.calendarEventsService, calendarServiceBuild);
                    smartD = builderNewBuilder3.build();
                    smartD.getClass();
                } else {
                    Logger logger4 = bVar.f197361e;
                    if (logger4 == null) {
                        s.m("logger");
                        throw th3;
                    }
                    logger4.error("Failed to get calendar results: " + str3);
                    smartD = b.d(bVar, s.g(str3, "INVALID_DATE_RANGE") ? GDICalendarProto.CalendarEventsResponse.ResponseStatus.INVALID_DATE_RANGE : GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
                }
                try {
                    dt2.k kVar = this.f197381f;
                    this.f197378c = 3;
                } catch (ProtobufException e4) {
                    e = e4;
                    logger = bVar.f197361e;
                    if (logger != null) {
                        s.m("logger");
                        throw th3;
                    }
                    logger.error("Failed to send response", (Throwable) e);
                }
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    r.b(obj);
                } catch (ProtobufException e14) {
                    e = e14;
                    th3 = null;
                    logger = bVar.f197361e;
                    if (logger != null) {
                        s.m("logger");
                        throw th3;
                    }
                    logger.error("Failed to send response", (Throwable) e);
                }
            }
            return Unit.INSTANCE;
            if (((Boolean) objC).booleanValue()) {
                x53.c cVar = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                C3698a c3698a = new C3698a(this.f197380e, j8, j14, this.f197379d, null);
                this.f197378c = 2;
                objE0 = ge1.b.e0(bVar2, c3698a, this);
            } else {
                Logger logger5 = bVar.f197361e;
                if (logger5 == null) {
                    s.m("logger");
                    throw th3;
                }
                logger5.error("Failed to get calendar results: Permission Denied");
                smartD = b.d(bVar, GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
                dt2.k kVar2 = this.f197381f;
                this.f197378c = 3;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GDICalendarProto.CalendarEventsRequest calendarEventsRequest, b bVar, dt2.k kVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f197373b = calendarEventsRequest;
        this.f197374c = bVar;
        this.f197375d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f197373b, this.f197374c, this.f197375d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197372a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f197373b, this.f197374c, this.f197375d, null);
            this.f197372a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
