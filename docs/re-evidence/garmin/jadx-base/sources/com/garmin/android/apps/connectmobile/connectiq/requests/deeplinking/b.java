package com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import cx2.j;
import e23.l;
import e23.p;
import e23.s;
import ex2.w;
import g22.n;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.u;
import rs2.c;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.RTSDeviceDeepLinkHandler$handleDeepLink$1", f = "RTSDeviceDeepLinkHandler.kt", l = {73, 86, 106}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t10.i f31963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f31964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f31965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sw2.c f31966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sz0.e f31967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f31970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f31971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f31975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t10.i f31976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f31977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f31978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s<String, String, String, sz0.e, PendingIntent, Unit> f31979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l<Intent, Unit> f31980r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Uri uri, t10.i iVar, c cVar, boolean z14, s<? super String, ? super String, ? super String, ? super sz0.e, ? super PendingIntent, Unit> sVar, l<? super Intent, Unit> lVar, d<? super b> dVar) {
        super(2, dVar);
        this.f31975m = uri;
        this.f31976n = iVar;
        this.f31977o = cVar;
        this.f31978p = z14;
        this.f31979q = sVar;
        this.f31980r = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f31975m, this.f31976n, this.f31977o, this.f31978p, this.f31979q, this.f31980r, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0313  */
    /* JADX WARN: Code duplicated, block: B:84:0x0369  */
    /* JADX WARN: Code duplicated, block: B:87:0x0374  */
    /* JADX WARN: Code duplicated, block: B:89:0x0377  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0224, code lost:
    
        if (r0 == r8) goto L83;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        s<String, String, String, sz0.e, PendingIntent, Unit> sVar;
        int i15;
        sw2.c cVar;
        t10.i iVar;
        c cVar2;
        String strH;
        String strF;
        l<Intent, Unit> lVar;
        Object objE0;
        String strQ;
        String strO;
        String strM;
        String strK;
        String strF2;
        String strF3;
        String strConcat;
        sz0.e eVar;
        Object objE1;
        String str;
        sz0.e eVar2;
        String str2;
        String str3;
        s<String, String, String, sz0.e, PendingIntent, Unit> sVar2;
        PendingIntent pendingIntent;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f31974l;
        if (i16 == 0) {
            r.b(obj);
            sw2.c.f161097o.getClass();
            Uri uri = this.f31975m;
            sw2.c cVarA = sw2.c.a.a(uri);
            i14 = cVarA.getScheduledTimestamp() != null ? 1 : 0;
            t10.i iVar2 = this.f31976n;
            c cVar3 = this.f31977o;
            if (i14 == 0) {
                if (this.f31978p) {
                    Long l14 = new Long(cVarA.getVersionId());
                    long jLongValue = new Long(cVarA.getGlobalId()).longValue();
                    long jLongValue2 = l14.longValue();
                    String strI = cVarA.getDialogTitleHandle();
                    if (strI != null) {
                        j.a aVar2 = j.f56682a;
                        Context context = iVar2.f161688a;
                        byte[] bytes = strI.getBytes(d53.c.f57666b);
                        bytes.getClass();
                        String strEncodeToString = Base64.encodeToString(bytes, 0);
                        aVar2.getClass();
                        strH = j.a.a(context, strEncodeToString, null, null, null);
                        if (strH == null) {
                            strH = cVarA.getDialogTitle();
                        }
                    } else {
                        strH = cVarA.getDialogTitle();
                    }
                    String str4 = strH;
                    String strG = cVarA.getDialogDescriptionHandle();
                    if (strG != null) {
                        j.a aVar3 = j.f56682a;
                        Context context2 = iVar2.f161688a;
                        byte[] bytes2 = strG.getBytes(d53.c.f57666b);
                        bytes2.getClass();
                        String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                        aVar3.getClass();
                        strF = j.a.a(context2, strEncodeToString2, null, null, null);
                        if (strF == null) {
                            strF = cVarA.getDialogDescription();
                        }
                    } else {
                        strF = cVarA.getDialogDescription();
                    }
                    String str5 = strF;
                    rw2.e eVar3 = new rw2.e(jLongValue, jLongValue2);
                    List<Integer> listD = cVarA.d();
                    if (listD == null) {
                        listD = j0.f134944a;
                    }
                    sw2.d dVar = sw2.d.f161112a;
                    sw2.e eVar4 = new sw2.e(cVarA.getCompositionId(), eVar3);
                    dVar.getClass();
                    listD.getClass();
                    List<sw2.e> list = sw2.d.f161113b;
                    list.getClass();
                    if (!h0.b1(h0.f1(list)).contains(eVar4)) {
                        if (!list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (listD.contains(Integer.valueOf(((sw2.e) it.next()).f161114a))) {
                                    }
                                }
                            }
                        }
                        t10.i.f161687b.trace("Destination page is not existed: compositionId:" + cVarA.getCompositionId() + ", subPages:" + listD);
                        yc0.c cVar4 = yc0.c.f196719a;
                        Context context3 = iVar2.f161688a;
                        long f92746j = cVar3.getF92746j();
                        int iB = cVarA.getCompositionId();
                        this.f31963a = null;
                        this.f31964b = null;
                        this.f31965c = null;
                        this.f31966d = null;
                        this.f31967e = null;
                        this.f31968f = null;
                        this.f31969g = null;
                        lVar = this.f31980r;
                        this.f31970h = lVar;
                        this.f31972j = 0;
                        this.f31973k = i14;
                        this.f31974l = 1;
                        cVar4.getClass();
                        x53.c cVar5 = s0.f129406a;
                        objE0 = ge1.b.e0(x53.b.f189152a, new yc0.a(f92746j, context3, iB, true, str4, str5, null), this);
                    }
                    t10.i.f161687b.trace("Destination page is existed: compositionId:" + cVarA.getCompositionId() + ", subPages:" + listD);
                } else {
                    String str6 = (String) u.H(da2.d.b().f58886a.f111646e.b(cVar3.getF92746j()));
                    if (str6 == null) {
                        t10.i.f161687b.warn("Cannot find mac addr for " + cVar3.getF92746j());
                        return Unit.INSTANCE;
                    }
                    w wVar = w.f67058a;
                    Context context4 = iVar2.f161688a;
                    long f92746j2 = cVar3.getF92746j();
                    String strL0 = d53.w.l0(GCMSettingManager.k().e(), IOUtils.DIR_SEPARATOR_UNIX);
                    String strB = c22.b0.b(null);
                    this.f31963a = iVar2;
                    this.f31964b = cVar3;
                    s<String, String, String, sz0.e, PendingIntent, Unit> sVar3 = this.f31979q;
                    this.f31965c = sVar3;
                    this.f31966d = cVarA;
                    this.f31967e = null;
                    this.f31972j = 0;
                    this.f31973k = i14;
                    this.f31974l = 2;
                    if (wVar.c(context4, f92746j2, str6, strL0, strB, this) != aVar) {
                        sVar = sVar3;
                        i15 = 0;
                        cVar = cVarA;
                        iVar = iVar2;
                        cVar2 = cVar3;
                        strQ = cVar.getNotificationTitleHandle();
                        if (strQ != null) {
                            j.a aVar4 = j.f56682a;
                            Context context5 = iVar.f161688a;
                            byte[] bytes3 = strQ.getBytes(d53.c.f57666b);
                            bytes3.getClass();
                            String strEncodeToString3 = Base64.encodeToString(bytes3, 0);
                            aVar4.getClass();
                            strO = j.a.a(context5, strEncodeToString3, null, null, null);
                            if (strO == null) {
                                strO = cVar.getNotificationTitle();
                            }
                        } else {
                            strO = cVar.getNotificationTitle();
                        }
                        strM = cVar.getNotificationDescriptionHandle();
                        if (strM != null) {
                            j.a aVar5 = j.f56682a;
                            Context context6 = iVar.f161688a;
                            byte[] bytes4 = strM.getBytes(d53.c.f57666b);
                            bytes4.getClass();
                            String strEncodeToString4 = Base64.encodeToString(bytes4, 0);
                            aVar5.getClass();
                            strK = j.a.a(context6, strEncodeToString4, null, null, null);
                            if (strK == null) {
                                strK = cVar.getNotificationDescription();
                            }
                        } else {
                            strK = cVar.getNotificationDescription();
                        }
                        strF2 = n.f(strO);
                        strF3 = n.f(strK);
                        strConcat = "\u200b\u200c\u200b".concat(strK);
                        eVar = sz0.e.I;
                        yc0.c cVar6 = yc0.c.f196719a;
                        Context context7 = iVar.f161688a;
                        long f92746j3 = cVar2.getF92746j();
                        int iB2 = cVar.getCompositionId();
                        this.f31963a = null;
                        this.f31964b = null;
                        this.f31965c = null;
                        this.f31966d = null;
                        this.f31967e = eVar;
                        this.f31968f = strConcat;
                        this.f31969g = strF3;
                        this.f31970h = strF2;
                        this.f31971i = sVar;
                        this.f31972j = i15;
                        this.f31973k = i14;
                        this.f31974l = 3;
                        cVar6.getClass();
                        x53.c cVar7 = s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new yc0.b(f92746j3, context7, iB2, true, null), this);
                        if (objE1 != aVar) {
                            str = strConcat;
                            eVar2 = eVar;
                            str2 = strF3;
                            str3 = strF2;
                            sVar2 = sVar;
                            pendingIntent = (PendingIntent) objE1;
                            if (pendingIntent == null) {
                                return Unit.INSTANCE;
                            }
                            sVar2.invoke(str3, str2, str, eVar2, pendingIntent);
                        }
                    }
                }
                return aVar;
            }
            Object systemService = iVar2.f161688a.getSystemService("alarm");
            systemService.getClass();
            AlarmManager alarmManager = (AlarmManager) systemService;
            DateTime dateTimeR = cVarA.getScheduledTimestamp();
            if (dateTimeR == null) {
                t10.i.f161687b.error("ScheduledTimestamp should never be null here");
                return Unit.INSTANCE;
            }
            long millis = dateTimeR.getMillis();
            t10.i.f161687b.info("Try scheduling a notification at " + new DateTime().withMillis(millis));
            ScheduledRTSDeeplinkBroadcastReceiver.a aVar6 = ScheduledRTSDeeplinkBroadcastReceiver.f31944b;
            Context context8 = iVar2.f161688a;
            long f92746j4 = cVar3.getF92746j();
            aVar6.getClass();
            Context applicationContext = context8.getApplicationContext();
            Intent intentA = ScheduledRTSDeeplinkBroadcastReceiver.a.a(context8, f92746j4);
            intentA.putExtra("extra.rts_deeplink_uri", uri);
            intentA.putExtra("extra.device_unit_id", f92746j4);
            Unit unit = Unit.INSTANCE;
            PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, 0, intentA, 67108864);
            broadcast.getClass();
            alarmManager.setAndAllowWhileIdle(0, millis, broadcast);
        } else if (i16 != 1) {
            if (i16 == 2) {
                int i17 = this.f31973k;
                i15 = this.f31972j;
                cVar = this.f31966d;
                s<String, String, String, sz0.e, PendingIntent, Unit> sVar4 = this.f31965c;
                cVar2 = this.f31964b;
                iVar = this.f31963a;
                r.b(obj);
                i14 = i17;
                sVar = sVar4;
                strQ = cVar.getNotificationTitleHandle();
                if (strQ != null) {
                    j.a aVar7 = j.f56682a;
                    Context context9 = iVar.f161688a;
                    byte[] bytes5 = strQ.getBytes(d53.c.f57666b);
                    bytes5.getClass();
                    String strEncodeToString5 = Base64.encodeToString(bytes5, 0);
                    aVar7.getClass();
                    strO = j.a.a(context9, strEncodeToString5, null, null, null);
                    if (strO == null) {
                        strO = cVar.getNotificationTitle();
                    }
                } else {
                    strO = cVar.getNotificationTitle();
                }
                strM = cVar.getNotificationDescriptionHandle();
                if (strM != null) {
                    j.a aVar8 = j.f56682a;
                    Context context10 = iVar.f161688a;
                    byte[] bytes6 = strM.getBytes(d53.c.f57666b);
                    bytes6.getClass();
                    String strEncodeToString6 = Base64.encodeToString(bytes6, 0);
                    aVar8.getClass();
                    strK = j.a.a(context10, strEncodeToString6, null, null, null);
                    if (strK == null) {
                        strK = cVar.getNotificationDescription();
                    }
                } else {
                    strK = cVar.getNotificationDescription();
                }
                strF2 = n.f(strO);
                strF3 = n.f(strK);
                strConcat = "\u200b\u200c\u200b".concat(strK);
                eVar = sz0.e.I;
                yc0.c cVar8 = yc0.c.f196719a;
                Context context11 = iVar.f161688a;
                long f92746j5 = cVar2.getF92746j();
                int iB3 = cVar.getCompositionId();
                this.f31963a = null;
                this.f31964b = null;
                this.f31965c = null;
                this.f31966d = null;
                this.f31967e = eVar;
                this.f31968f = strConcat;
                this.f31969g = strF3;
                this.f31970h = strF2;
                this.f31971i = sVar;
                this.f31972j = i15;
                this.f31973k = i14;
                this.f31974l = 3;
                cVar8.getClass();
                x53.c cVar9 = s0.f129406a;
                objE1 = ge1.b.e0(x53.b.f189152a, new yc0.b(f92746j5, context11, iB3, true, null), this);
                if (objE1 != aVar) {
                    str = strConcat;
                    eVar2 = eVar;
                    str2 = strF3;
                    str3 = strF2;
                }
                return aVar;
            }
            if (i16 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sVar = this.f31971i;
            String str7 = (String) this.f31970h;
            String str8 = this.f31969g;
            String str9 = this.f31968f;
            sz0.e eVar5 = this.f31967e;
            r.b(obj);
            str3 = str7;
            str2 = str8;
            str = str9;
            eVar2 = eVar5;
            objE1 = obj;
            sVar2 = sVar;
            pendingIntent = (PendingIntent) objE1;
            if (pendingIntent == null) {
                return Unit.INSTANCE;
            }
            sVar2.invoke(str3, str2, str, eVar2, pendingIntent);
        } else {
            l<Intent, Unit> lVar2 = (l) this.f31970h;
            r.b(obj);
            lVar = lVar2;
            objE0 = obj;
            Intent intent = (Intent) objE0;
            if (intent == null) {
                return Unit.INSTANCE;
            }
            lVar.invoke(intent);
        }
        return Unit.INSTANCE;
    }
}
