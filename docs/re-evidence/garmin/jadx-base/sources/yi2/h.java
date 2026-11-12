package yi2;

import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import android.text.TextUtils;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDICalendarExtension;
import com.garmin.proto.generated.GDICalendarProto;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDISmartProto;
import com.google.mlkit.common.MlKitException;
import com.google.protobuf.ByteString;
import d53.t;
import ds.e0;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendars$1", f = "CalendarController.kt", l = {187}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f197387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDICalendarProto.CalendarRequest f197388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.k f197389d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendars$1$1", f = "CalendarController.kt", l = {190, 194, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 230}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f197390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f197391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yi2.b f197392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GDICalendarProto.CalendarRequest f197393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ dt2.k f197394e;

        /* JADX INFO: renamed from: yi2.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyi2/m;", "<anonymous>", "(Lo53/b0;)Lyi2/m;"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendars$1$1$responseSmart$calendarResult$1", f = "CalendarController.kt", l = {}, m = "invokeSuspend")
        public static final class C3699a extends v13.i implements e23.p<b0, t13.d<? super m>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yi2.b f197395a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3699a(yi2.b bVar, t13.d<? super C3699a> dVar) {
                super(2, dVar);
                this.f197395a = bVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3699a(this.f197395a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super m> dVar) {
                return ((C3699a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                m mVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                Context context = this.f197395a.f197360d;
                context.getClass();
                l lVar = new l(context);
                byte b14 = (byte) 0;
                synchronized (b14) {
                    try {
                        try {
                            try {
                                Cursor cursorQuery = lVar.f197434a.query(CalendarContract.Calendars.CONTENT_URI, lVar.f197421b, null, null);
                                if (cursorQuery != null) {
                                    m mVar2 = new m(null, l.d(cursorQuery), null, 5, null);
                                    o.a(cursorQuery);
                                    return mVar2;
                                }
                                m mVar3 = new m("DATABASE_CURSOR_NULL", null, null, 6, null);
                                o.a(cursorQuery);
                                return mVar3;
                            } catch (SecurityException e4) {
                                mVar = new m("SECURITY_EXCEPTION", null, e4.getMessage(), 2, null);
                                o.a(null);
                                return mVar;
                            }
                        } catch (RuntimeException e14) {
                            mVar = new m("SQL_EXCEPTION", null, e14.getMessage(), 2, null);
                            o.a(null);
                            return mVar;
                        }
                    } catch (Throwable th3) {
                        o.a(null);
                        throw th3;
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyi2/p;", "<anonymous>", "(Lo53/b0;)Lyi2/p;"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "com.garmin.calendar.os.CalendarController$processCalendars$1$1$responseSmart$eventsResult$1", f = "CalendarController.kt", l = {}, m = "invokeSuspend")
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super p>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yi2.b f197396a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GDICalendarProto.CalendarRequest f197397b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(yi2.b bVar, GDICalendarProto.CalendarRequest calendarRequest, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f197396a = bVar;
                this.f197397b = calendarRequest;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f197396a, this.f197397b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super p> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                j jVar = new j(this.f197396a.f197360d);
                GDICalendarProto.CalendarRequest calendarRequest = this.f197397b;
                long j8 = 1000;
                return jVar.e(calendarRequest.getMaxEvents(), calendarRequest.getMaxAttendees(), calendarRequest.getStartDate() * j8, calendarRequest.getEndDate() * j8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yi2.b bVar, GDICalendarProto.CalendarRequest calendarRequest, dt2.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f197392c = bVar;
            this.f197393d = calendarRequest;
            this.f197394e = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f197392c, this.f197393d, this.f197394e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:188:0x046f  */
        /* JADX WARN: Code duplicated, block: B:191:0x0477  */
        /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0092  */
        /* JADX WARN: Code duplicated, block: B:37:0x0096  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
        
            if (r11 == r0) goto L21;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x0096, please report this as an issue */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            Object objE0;
            GDISmartProto.Smart smartD;
            m mVar;
            Object objE1;
            Logger logger;
            u13.a aVar;
            String str;
            m mVar2;
            Object objA;
            u13.a aVar2;
            zj2.e eVarInvoke;
            GDICalendarProto.CalendarResponse.Builder builder;
            GDICalendarProto.Attendee.AttendeeStatus attendeeStatus;
            Integer numI;
            Logger logger2;
            a aVar3 = this;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i14 = aVar3.f197391b;
            GDICalendarProto.CalendarRequest calendarRequest = aVar3.f197393d;
            String str2 = "logger";
            yi2.b bVar = aVar3.f197392c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    Logger logger3 = bVar.f197361e;
                    if (logger3 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger3.debug("Calendars requested");
                    aVar3.f197391b = 1;
                    objC = yi2.b.c(bVar, aVar3);
                    if (objC != aVar4) {
                    }
                    return aVar4;
                }
                if (i14 == 1) {
                    r.b(obj);
                    objC = obj;
                } else if (i14 == 2) {
                    r.b(obj);
                    objE0 = obj;
                    mVar = (m) objE0;
                    if (mVar.f197422a != null) {
                        logger = bVar.f197361e;
                        if (logger != null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.error("Failed to get calendar results: " + mVar.f197422a);
                        smartD = yi2.b.d(bVar, GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
                    } else {
                        x53.c cVar = s0.f129406a;
                        x53.b bVar2 = x53.b.f189152a;
                        b bVar3 = new b(bVar, calendarRequest, null);
                        aVar3.f197390a = mVar;
                        aVar3.f197391b = 3;
                        objE1 = ge1.b.e0(bVar2, bVar3, aVar3);
                    }
                    aVar = aVar4;
                    str = "logger";
                    mVar2 = null;
                    dt2.k kVar = aVar3.f197394e;
                    aVar3.f197390a = mVar2;
                    aVar3.f197391b = 4;
                    objA = kVar.a(smartD, aVar3);
                    aVar2 = aVar;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else if (i14 == 3) {
                    mVar = aVar3.f197390a;
                    r.b(obj);
                    objE1 = obj;
                    objE1.getClass();
                    p pVar = (p) objE1;
                    String str3 = pVar.f197436b;
                    if (TextUtils.isEmpty(str3)) {
                        Logger logger4 = bVar.f197361e;
                        if (logger4 == null) {
                            s.m("logger");
                            throw null;
                        }
                        StringBuilder sb3 = new StringBuilder("Calendars received : ");
                        List<yi2.a> list = mVar.f197423b;
                        sb3.append(list != null ? list.size() : 0);
                        logger4.debug(sb3.toString());
                        List<yi2.a> list2 = mVar.f197423b;
                        List<i> list3 = pVar.f197435a;
                        List<ByteString> calHashesList = calendarRequest.getCalHashesList();
                        List<ByteString> eventHashesList = calendarRequest.getEventHashesList();
                        j0 j0Var = j0.f134944a;
                        ArrayList arrayListD1 = h0.d1(j0Var);
                        mVar2 = null;
                        ArrayList arrayList = new ArrayList(j0Var);
                        GDICalendarProto.CalendarResponse.Builder builderNewBuilder = GDICalendarProto.CalendarResponse.newBuilder();
                        builderNewBuilder.setStatus(GDICalendarProto.CalendarResponse.ResponseStatus.OK);
                        GDICalendarProto.CalendarFile.Builder builderNewBuilder2 = GDICalendarProto.CalendarFile.newBuilder();
                        if (list2 == null) {
                            list2 = j0Var;
                        }
                        Iterator<yi2.a> it = list2.iterator();
                        while (it.hasNext()) {
                            yi2.a next = it.next();
                            StringBuilder sb4 = new StringBuilder("Calendar(id=");
                            String str4 = next.f197353a;
                            Iterator<yi2.a> it3 = it;
                            String str5 = next.f197355c;
                            GDICalendarProto.CalendarRequest calendarRequest2 = calendarRequest;
                            String str6 = next.f197354b;
                            String str7 = str2;
                            List<i> list4 = list3;
                            sn.a.t(sb4, str4, ", name=", str6, ", color=");
                            String strM = a0.m(sb4, str5, CoreConstants.RIGHT_PARENTHESIS_CHAR);
                            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                            byte[] bytes = strM.getBytes(d53.c.f57666b);
                            bytes.getClass();
                            byte[] bArrDigest = messageDigest.digest(bytes);
                            bArrDigest.getClass();
                            ByteString byteStringCopyFrom = ByteString.copyFrom(bArrDigest);
                            if (calHashesList.contains(byteStringCopyFrom)) {
                                Logger logger5 = bVar.f197361e;
                                if (logger5 == null) {
                                    s.m(str7);
                                    throw null;
                                }
                                logger5.debug("Calendar with hash {} for {} already exists on device, skipping", byteStringCopyFrom, str6);
                                byteStringCopyFrom.getClass();
                                arrayListD1.add(byteStringCopyFrom);
                            } else {
                                GDICalendarProto.Calendar.Builder builderNewBuilder3 = GDICalendarProto.Calendar.newBuilder();
                                builderNewBuilder3.setHash(byteStringCopyFrom);
                                builderNewBuilder3.setCalendarId(next.f197353a);
                                builderNewBuilder3.setName(str6);
                                builderNewBuilder3.setColor((str5 == null || (numI = t.i(str5)) == null) ? 0 : numI.intValue());
                                builderNewBuilder2.addCalendars(builderNewBuilder3);
                                byteStringCopyFrom.getClass();
                                arrayListD1.add(byteStringCopyFrom);
                            }
                            it = it3;
                            calendarRequest = calendarRequest2;
                            str2 = str7;
                            list3 = list4;
                        }
                        GDICalendarProto.CalendarRequest calendarRequest3 = calendarRequest;
                        str = str2;
                        List<i> list5 = list3;
                        Iterator<i> it4 = (list5 == null ? j0.f134944a : list5).iterator();
                        while (it4.hasNext()) {
                            i next2 = it4.next();
                            next2.getClass();
                            List<n> list6 = next2.f197407j;
                            Long l14 = next2.f197406i;
                            Boolean bool = next2.f197404g;
                            Long l15 = next2.f197403f;
                            Long l16 = next2.f197402e;
                            it4 = it4;
                            String str8 = next2.f197401d;
                            String str9 = next2.f197400c;
                            calHashesList = calHashesList;
                            String str10 = next2.f197398a;
                            aVar4 = aVar4;
                            MessageDigest messageDigest2 = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                            builderNewBuilder = builderNewBuilder;
                            StringBuilder sbL = hb.a.l("CalendarEvent(title=", str10, ", organizer=");
                            arrayListD1 = arrayListD1;
                            GDICalendarProto.CalendarFile.Builder builder2 = builderNewBuilder2;
                            sn.a.t(sbL, next2.f197399b, ", description=", str9, ", location=");
                            n23.j.q(l16, str8, ", start=", ", end=", sbL);
                            sbL.append(l15);
                            sbL.append(", allDay=");
                            sbL.append(bool);
                            sbL.append(", eventId=");
                            kg.f.s(sbL, next2.f197405h, ", calendarId=", l14, ", attendees=");
                            sbL.append(list6 != null ? Integer.valueOf(list6.size()) : null);
                            sbL.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                            byte[] bytes2 = sbL.toString().getBytes(d53.c.f57666b);
                            bytes2.getClass();
                            byte[] bArrDigest2 = messageDigest2.digest(bytes2);
                            bArrDigest2.getClass();
                            ByteString byteStringCopyFrom2 = ByteString.copyFrom(bArrDigest2);
                            if (eventHashesList.contains(byteStringCopyFrom2)) {
                                Logger logger6 = bVar.f197361e;
                                if (logger6 == null) {
                                    s.m(str);
                                    throw null;
                                }
                                logger6.debug("Event with hash {} for {} already exists on device, skipping", byteStringCopyFrom2, str10);
                                byteStringCopyFrom2.getClass();
                                arrayList.add(byteStringCopyFrom2);
                                builderNewBuilder2 = builder2;
                            } else {
                                GDICalendarProto.Event.Builder builderNewBuilder4 = GDICalendarProto.Event.newBuilder();
                                builderNewBuilder4.setHash(byteStringCopyFrom2);
                                if (calendarRequest3.hasIncludeTitle() && calendarRequest3.getIncludeTitle()) {
                                    builderNewBuilder4.setTitle(str10);
                                }
                                builderNewBuilder4.setStartDate(l16 != null ? l16.longValue() : 0L);
                                builderNewBuilder4.setEndDate(l15 != null ? l15.longValue() : 0L);
                                builderNewBuilder4.setCalendarId(String.valueOf(l14));
                                if (calendarRequest3.hasIncludeLocation() && calendarRequest3.getIncludeLocation()) {
                                    builderNewBuilder4.setLocation(str8);
                                }
                                if (calendarRequest3.hasIncludeDescription() && calendarRequest3.getIncludeDescription()) {
                                    builderNewBuilder4.setDescription(str9);
                                }
                                builderNewBuilder4.setAllDay(bool != null ? bool.booleanValue() : false);
                                if (calendarRequest3.hasIncludeAttendees() && calendarRequest3.getIncludeAttendees() && list6 != null) {
                                    for (n nVar : list6) {
                                        GDICalendarProto.Attendee.Builder builderNewBuilder5 = GDICalendarProto.Attendee.newBuilder();
                                        builderNewBuilder5.setName(nVar.f197425a);
                                        n.a aVar5 = nVar.f197426b;
                                        int i15 = aVar5 == null ? -1 : yi2.b.a.f197364a[aVar5.ordinal()];
                                        if (i15 == 1) {
                                            attendeeStatus = GDICalendarProto.Attendee.AttendeeStatus.ACCEPTED;
                                        } else if (i15 == 2) {
                                            attendeeStatus = GDICalendarProto.Attendee.AttendeeStatus.DECLINED;
                                        } else if (i15 != 3) {
                                            attendeeStatus = i15 != 4 ? GDICalendarProto.Attendee.AttendeeStatus.PENDING : GDICalendarProto.Attendee.AttendeeStatus.PENDING;
                                        } else {
                                            attendeeStatus = GDICalendarProto.Attendee.AttendeeStatus.TENTATIVE;
                                        }
                                        builderNewBuilder5.setStatus(attendeeStatus);
                                        builderNewBuilder4.addAttendees(builderNewBuilder5);
                                    }
                                }
                                builder2.addEvents(builderNewBuilder4);
                                byteStringCopyFrom2.getClass();
                                arrayList.add(byteStringCopyFrom2);
                                builderNewBuilder2 = builder2;
                            }
                        }
                        aVar = aVar4;
                        GDICalendarProto.CalendarResponse.Builder builder3 = builderNewBuilder;
                        GDICalendarProto.CalendarFile.Builder builder4 = builderNewBuilder2;
                        List<ByteString> list7 = calHashesList;
                        ArrayList arrayList2 = arrayListD1;
                        ArrayList arrayListL = androidx.core.view.j.l(list7);
                        for (Object obj2 : list7) {
                            ArrayList arrayList3 = arrayList2;
                            if (!arrayList3.contains((ByteString) obj2)) {
                                arrayListL.add(obj2);
                            }
                            arrayList2 = arrayList3;
                        }
                        builder4.addAllDeletedCalHashes(arrayListL);
                        eventHashesList.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : eventHashesList) {
                            if (!arrayList.contains((ByteString) obj3)) {
                                arrayList4.add(obj3);
                            }
                        }
                        builder4.addAllDeletedEventHashes(arrayList4);
                        byte[] byteArray = builder4.build().toByteArray();
                        byteArray.getClass();
                        if (byteArray.length == 0) {
                            Logger logger7 = bVar.f197361e;
                            if (logger7 == null) {
                                s.m(str);
                                throw null;
                            }
                            logger7.debug("No calendar data to transfer, skipping DataTransferService");
                            builder = builder3;
                        } else {
                            e23.l<String, zj2.e> lVar = bVar.f197359c;
                            if (lVar != null) {
                                String str11 = bVar.f197363g;
                                str11.getClass();
                                eVarInvoke = lVar.invoke(str11);
                            } else {
                                eVarInvoke = null;
                            }
                            if (eVarInvoke != null) {
                                int iD = eVarInvoke.d(byteArray, new f(bVar), new e(bVar), "Calendar File");
                                Logger logger8 = bVar.f197361e;
                                if (logger8 == null) {
                                    s.m(str);
                                    throw null;
                                }
                                StringBuilder sbI = b71.i.i(iD, "sendFile -> transferId is ", " and file size is ");
                                sbI.append(byteArray.length);
                                sbI.append(" bytes");
                                logger8.debug(sbI.toString());
                                GDIDataTypes.DataTransferItem.Builder builderNewBuilder6 = GDIDataTypes.DataTransferItem.newBuilder();
                                builderNewBuilder6.setId(iD);
                                builderNewBuilder6.setSize(byteArray.length);
                                builder = builder3;
                                builder.setXferData(builderNewBuilder6);
                            } else {
                                builder = builder3;
                                Logger logger9 = bVar.f197361e;
                                if (logger9 == null) {
                                    s.m(str);
                                    throw null;
                                }
                                logger9.error("DataTransferService is not available, cannot send calendar file");
                            }
                        }
                        GDICalendarProto.CalendarService calendarServiceBuild = GDICalendarProto.CalendarService.newBuilder().setCalendarResponse(builder).build();
                        GDISmartProto.Smart.Builder builderNewBuilder7 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder7.setExtension(GDICalendarExtension.calendarEventsService, calendarServiceBuild);
                        smartD = builderNewBuilder7.build();
                        smartD.getClass();
                        aVar3 = this;
                    } else {
                        Logger logger10 = bVar.f197361e;
                        if (logger10 == null) {
                            s.m("logger");
                            throw null;
                        }
                        e0.v("Failed to get calendar events: ", str3, logger10);
                        smartD = yi2.b.d(bVar, GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
                        aVar = aVar4;
                        str = "logger";
                        mVar2 = null;
                    }
                    dt2.k kVar2 = aVar3.f197394e;
                    aVar3.f197390a = mVar2;
                    aVar3.f197391b = 4;
                    objA = kVar2.a(smartD, aVar3);
                    aVar2 = aVar;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        r.b(obj);
                    } catch (ProtobufException e4) {
                        e = e4;
                        str = "logger";
                        logger2 = bVar.f197361e;
                        if (logger2 != null) {
                            s.m(str);
                            throw null;
                        }
                        logger2.error("Failed to send response", (Throwable) e);
                    }
                }
                return Unit.INSTANCE;
                dt2.k kVar3 = aVar3.f197394e;
                aVar3.f197390a = mVar2;
                aVar3.f197391b = 4;
                objA = kVar3.a(smartD, aVar3);
                aVar2 = aVar;
                if (objA == aVar2) {
                    return aVar2;
                }
            } catch (ProtobufException e14) {
                e = e14;
                logger2 = bVar.f197361e;
                if (logger2 != null) {
                    s.m(str);
                    throw null;
                }
                logger2.error("Failed to send response", (Throwable) e);
            }
            if (((Boolean) objC).booleanValue()) {
                x53.c cVar2 = s0.f129406a;
                x53.b bVar4 = x53.b.f189152a;
                C3699a c3699a = new C3699a(bVar, null);
                aVar3.f197391b = 2;
                objE0 = ge1.b.e0(bVar4, c3699a, aVar3);
                if (objE0 != aVar4) {
                    mVar = (m) objE0;
                    if (mVar.f197422a != null) {
                        logger = bVar.f197361e;
                        if (logger != null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.error("Failed to get calendar results: " + mVar.f197422a);
                        smartD = yi2.b.d(bVar, GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
                    } else {
                        x53.c cVar3 = s0.f129406a;
                        x53.b bVar5 = x53.b.f189152a;
                        b bVar6 = new b(bVar, calendarRequest, null);
                        aVar3.f197390a = mVar;
                        aVar3.f197391b = 3;
                        objE1 = ge1.b.e0(bVar5, bVar6, aVar3);
                    }
                }
                return aVar4;
            }
            Logger logger11 = bVar.f197361e;
            if (logger11 == null) {
                s.m("logger");
                throw null;
            }
            logger11.error("Failed to get calendar results: Permission Denied");
            smartD = yi2.b.d(bVar, GDICalendarProto.CalendarEventsResponse.ResponseStatus.OK);
            aVar = aVar4;
            str = "logger";
            mVar2 = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, GDICalendarProto.CalendarRequest calendarRequest, dt2.k kVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f197387b = bVar;
        this.f197388c = calendarRequest;
        this.f197389d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f197387b, this.f197388c, this.f197389d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197386a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f197387b, this.f197388c, this.f197389d, null);
            this.f197386a = 1;
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
