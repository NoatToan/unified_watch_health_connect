package com.google.android.exoplayer2.analytics;

import am.x0;
import android.content.Context;
import android.os.IInterface;
import android.view.MenuItem;
import androidx.camera.core.impl.o1;
import androidx.health.platform.client.permission.Permission;
import c22.l3;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import fb2.b0;
import fo1.o0;
import g2.t1;
import h0.d0;
import i3.e5;
import j20.x;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import n9.w;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p13.h0;
import p13.y;
import p3.e3;
import r22.a2;
import r22.c0;
import r53.p2;
import zb0.g0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class q implements ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory, Continuation, q1.a, jw.j.a, l52.u, j9.e, b0.a, a2.d, e3, u20.d.a, gc0.b.InterfaceC1548b, c0.b, OnCompleteListener, OnSuccessListener, jw.g.b, jw.m, jw.t, o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52944c;

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, m52.j jVar, Double d14) {
        this.f52942a = 13;
        this.f52943b = jVar;
        this.f52944c = d14;
    }

    @Override // androidx.camera.core.impl.o1.a
    public void a(o1 o1Var) {
        ((o1.a) this.f52944c).a((d0) this.f52943b);
    }

    @Override // j9.e
    public void b(IInterface iInterface, SettableFuture settableFuture) {
        switch (this.f52942a) {
            case 14:
                f9.e eVar = (f9.e) this.f52943b;
                n9.c cVar = (n9.c) this.f52944c;
                n9.s sVarF = eVar.f();
                settableFuture.getClass();
                ((p9.l) iInterface).h(sVarF, cVar, new f9.b(settableFuture));
                break;
            case 15:
                f9.e eVar2 = (f9.e) this.f52943b;
                Set set = (Set) this.f52944c;
                p9.l lVar = (p9.l) iInterface;
                n9.s sVarF2 = eVar2.f();
                Set set2 = set;
                ArrayList arrayList = new ArrayList(y.r(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Permission((androidx.health.platform.client.proto.o1) it.next()));
                }
                List listB1 = h0.b1(arrayList);
                settableFuture.getClass();
                lVar.R(sVarF2, listB1, new f9.c(settableFuture));
                break;
            case 16:
                f9.e eVar3 = (f9.e) this.f52943b;
                w wVar = (w) this.f52944c;
                n9.s sVarF3 = eVar3.f();
                settableFuture.getClass();
                ((p9.l) iInterface).L(sVarF3, wVar, new f9.d(settableFuture));
                break;
            default:
                f9.e eVar4 = (f9.e) this.f52943b;
                n9.e eVar5 = (n9.e) this.f52944c;
                n9.s sVarF4 = eVar4.f();
                settableFuture.getClass();
                ((p9.l) iInterface).b0(sVarF4, eVar5, new f9.a(settableFuture));
                break;
        }
    }

    @Override // p3.e3
    public boolean c() {
        t1.a aVar = (t1.a) this.f52943b;
        g2.b bVar = (g2.b) this.f52944c;
        if (!aVar.f75237q) {
            aVar.j();
            long jA = g2.b.a(aVar.f75235o, bVar.f75030b);
            bVar.f75030b = jA;
            aVar.f75237q = !aVar.i(aVar.f75234n, jA + bVar.f75031c);
        }
        return aVar.f75237q;
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i14, TrackGroup trackGroup, int[] iArr) {
        switch (this.f52942a) {
            case 5:
                return DefaultTrackSelector.lambda$selectVideoTrack$2((DefaultTrackSelector.Parameters) this.f52943b, (int[]) this.f52944c, i14, trackGroup, iArr);
            default:
                return DefaultTrackSelector.lambda$selectTextTrack$4((DefaultTrackSelector.Parameters) this.f52943b, (String) this.f52944c, i14, trackGroup, iArr);
        }
    }

    @Override // jw.t
    public void d(String str) {
        gw.k kVar = (gw.k) this.f52943b;
        q qVar = (q) this.f52944c;
        kVar.b(new jw.d(kVar, str));
        UserSettingsDTO userSettingsDTO = new UserSettingsDTO();
        userSettingsDTO.m(str);
        kVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, userSettingsDTO);
        String str2 = kVar.f79518m;
        if (str2 != null) {
            kVar.b(new jw.n(kVar, str2, qVar));
        }
    }

    @Override // fb2.b0.a
    public void e(Object obj) {
        fb2.i.p((fb2.i) this.f52943b, this.f52944c, (CharSequence) obj);
    }

    public void f(String str) {
        int i14 = this.f52942a;
        Object obj = this.f52944c;
        Object obj2 = this.f52943b;
        switch (i14) {
            case 11:
                dm.o oVar = (dm.o) obj2;
                x0 x0Var = (x0) obj;
                int i15 = dm.o.f60398p;
                if (str != null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b.getClass();
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVarA = com.garmin.android.apps.connectmobile.repcounting.model.c.b.a(str);
                    if (cVarA != null) {
                        ((aq.d) oVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11881c = cVarA;
                    }
                    oVar.getClass();
                    oVar.b(new jw.k(x0Var, oVar, new dm.p(oVar)));
                }
                break;
            default:
                gw.h hVar = (gw.h) obj2;
                String str2 = (String) obj;
                if (str == null) {
                    i2.i("DeleteActivityImgsOp", "GCApi.Failure on imageId: " + str2);
                } else {
                    ((ArrayList) hVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).add(str);
                }
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        int i14 = this.f52942a;
        int i15 = 1;
        Object obj = this.f52944c;
        Object obj2 = this.f52943b;
        switch (i14) {
            case 10:
                CalendarItemDTO calendarItemDTO = (CalendarItemDTO) obj2;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.a aVar = (com.garmin.android.apps.connectmobile.training.atp.dashboard.a) obj;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.a.C0872a c0872a = com.garmin.android.apps.connectmobile.training.atp.dashboard.a.L0;
                if (z14) {
                    DateTime dateTimeD = calendarItemDTO.D();
                    com.garmin.android.apps.connectmobile.calendar.presentation.d dVarU6 = aVar.u6(dateTimeD.getMonthOfYear(), dateTimeD.getYear());
                    if (dVarU6 != null ? dVarU6.i(null) : false) {
                        com.garmin.android.apps.connectmobile.training.atp.dashboard.a.b bVar = aVar.J0;
                        if (bVar != null) {
                            bVar.j8();
                        }
                        CalendarItemDTO calendarItemDTO2 = aVar.f45397k0;
                        if (calendarItemDTO2 != null) {
                            calendarItemDTO2.H(dateTimeD);
                        }
                        if (dVarU6 != null) {
                            com.garmin.android.apps.connectmobile.calendar.presentation.d.f31148r.getClass();
                            dVarU6.f31160i = h03.a.h(dateTimeD.getMillis(), TimeZone.getDefault());
                            dVarU6.f31167p = true;
                            dVarU6.notifyDataSetChanged();
                        }
                        aVar.z6(dateTimeD);
                    }
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.social.b bVar2 = (com.garmin.android.apps.connectmobile.social.b) obj2;
                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) obj;
                if (!z14) {
                    com.garmin.android.apps.connectmobile.social.b.a aVar2 = com.garmin.android.apps.connectmobile.social.b.T0;
                    break;
                } else {
                    com.garmin.android.apps.connectmobile.social.e eVar = bVar2.F;
                    if (eVar != null) {
                        String str = conversationCommentDTO.f44546a;
                        str.getClass();
                        eVar.d(str);
                    }
                    if (bVar2.isAdded()) {
                        o0 o0VarY6 = bVar2.Y6();
                        String str2 = conversationCommentDTO.f44547b;
                        str2.getClass();
                        String str3 = conversationCommentDTO.f44546a;
                        str3.getClass();
                        String str4 = conversationCommentDTO.f44548c;
                        str4.getClass();
                        dh.b.L(o0VarY6.C4(str2, str3, str4), bVar2, new com.garmin.android.apps.connectmobile.social.b.e(new do1.i(bVar2, conversationCommentDTO, i15)));
                        break;
                    }
                }
                break;
        }
    }

    @Override // r22.c0.b
    public void h(Calendar calendar) {
        Calendar calendar2 = (Calendar) this.f52943b;
        gg1.b bVar = (gg1.b) this.f52944c;
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        f12.l.f68084a.getClass();
        f12.l.a.a().B1(LocalDate.fromCalendarFields(calendar2));
        bVar.f77193b.a(calendar2);
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        Object value;
        Object value2;
        String strH;
        String strH2;
        Object value3;
        Object value4;
        Object value5;
        l22.a aVar;
        int i17;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e) this.f52943b;
        m52.c cVar = (m52.c) this.f52944c;
        long jD = fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
        eVar.f46028d = jD;
        p2 p2Var = eVar.f46036l;
        p2 p2Var2 = eVar.f46035k;
        if (jD <= 0) {
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, null));
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, null));
            return;
        }
        if (i14 == 0) {
            strH = "";
        } else {
            strH = i14 < 10 ? am.j.h(i14, "0") : String.valueOf(i14);
        }
        String strH3 = "00";
        if (i15 == 0) {
            strH2 = "00";
        } else {
            strH2 = i15 < 10 ? am.j.h(i15, "0") : String.valueOf(i15);
        }
        if (i16 != 0) {
            strH3 = i16 < 10 ? am.j.h(i16, "0") : String.valueOf(i16);
        }
        String strG = strH.length() == 0 ? e5.g(strH2, ":", strH3) : x.d(strH, ":", strH2, ":", strH3);
        p2 p2Var3 = eVar.f46037m;
        do {
            value3 = p2Var3.getValue();
        } while (!p2Var3.b(value3, eVar.z6(cVar)));
        do {
            value4 = p2Var2.getValue();
        } while (!p2Var2.b(value4, strG));
        do {
            value5 = p2Var.getValue();
            l3.a aVar2 = l3.f23124b;
            Context contextRequireContext = eVar.requireContext();
            contextRequireContext.getClass();
            aVar = new l22.a(contextRequireContext);
            i17 = (int) eVar.f46028d;
            aVar2.getClass();
        } while (!p2Var.b(value5, l3.a.k1(aVar, true, i17)));
        if (eVar.f46032h != ng0.a.LEG_SCREEN_VIEW) {
            MenuItem menuItem = eVar.f46034j;
            if (menuItem != null) {
                menuItem.setEnabled(eVar.f46028d > 0);
            } else {
                p005kotlin.jvm.internal.s.m("saveMenu");
                throw null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f52942a) {
            case 0:
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.f52943b, (TrackSelectionParameters) this.f52944c);
                break;
            case 1:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f52943b, (List) this.f52944c);
                break;
            case 2:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.f52943b, (DeviceInfo) this.f52944c);
                break;
            case 3:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.f52943b, (Metadata) this.f52944c);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$57((AnalyticsListener.EventTime) this.f52943b, (VideoSize) this.f52944c, (AnalyticsListener) obj);
                break;
        }
    }

    @Override // u20.d.a
    public void k(boolean z14) {
        CoursesActivity coursesActivity = (CoursesActivity) this.f52943b;
        i50.c.k kVar = (i50.c.k) this.f52944c;
        int i14 = CoursesActivity.f33039i;
        if (z14) {
            coursesActivity.ma().B4(new i50.a.b(kVar.f91719a));
        }
    }

    @Override // gc0.b.InterfaceC1548b
    public void n(gc0.b.c cVar) {
        gc0.i iVar = (gc0.i) this.f52943b;
        g0 g0Var = g0.this;
        iVar.getClass();
        int i14 = gc0.i.b.f76875a[cVar.ordinal()];
        if (i14 == 2) {
            g0.u6(g0Var, iVar.f76871d);
        } else {
            if (i14 != 3) {
                return;
            }
            g0Var.f203500k.callOnClick();
        }
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        m52.j jVar = (m52.j) this.f52943b;
        Double d14 = (Double) this.f52944c;
        m52.j jVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.T4((j0) aVar.getData(), jVar, d14);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        gh2.b bVar = (gh2.b) this.f52943b;
        FirebaseRemoteConfigInfo firebaseRemoteConfigInfo = (FirebaseRemoteConfigInfo) this.f52944c;
        Logger logger = gh2.b.f77423c;
        if (!task.isSuccessful()) {
            logger.warn("fetchConfig: 'fetch' unsuccessful ".concat(gh2.b.k(firebaseRemoteConfigInfo.getLastFetchStatus())), (Throwable) task.getException());
        } else {
            logger.debug("fetchConfig: 'fetch' result -> ".concat(gh2.b.k(firebaseRemoteConfigInfo.getLastFetchStatus())));
            bVar.f77424b.activate().addOnCompleteListener(new en0.n(bVar, 27));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        gh2.b.a aVar = (gh2.b.a) this.f52943b;
        for (String str : ((ConfigUpdate) this.f52944c).getUpdatedKeys()) {
            gh2.b.f77423c.debug("Key {} is now: {}", str, gh2.b.this.f77424b.getValue(str).asString());
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f52942a) {
            case 7:
                return ((ConfigFetchHandler) this.f52943b).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) this.f52944c, task);
            case 8:
                return ((ConfigFetchHandler) this.f52943b).lambda$fetchNowWithTypeAndAttemptNumber$1((HashMap) this.f52944c, task);
            default:
                return ((ConfigRealtimeHttpClient) this.f52943b).lambda$beginRealtimeHttpStream$1((Task) this.f52944c, task);
        }
    }

    public /* synthetic */ q(int i14, Object obj, Object obj2) {
        this.f52942a = i14;
        this.f52943b = obj;
        this.f52944c = obj2;
    }
}
