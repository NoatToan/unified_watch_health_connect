package com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Base64;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import cx2.j;
import e23.p;
import ex2.w;
import g22.n;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.s0;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import sk0.i0;
import sw2.c;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/deeplinking/ScheduledRTSDeeplinkBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScheduledRTSDeeplinkBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31944b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f31945c = m.b(new i0(27));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f31946a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.ScheduledRTSDeeplinkBroadcastReceiver$onReceive$1", f = "ScheduledRTSDeeplinkBroadcastReceiver.kt", l = {46, 67}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f31947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f31948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public sz0.e f31949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f31950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f31951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f31952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Context f31953g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a f31954h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31955i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f31956j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f31957k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Intent f31958l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f31959m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, Context context, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f31958l = intent;
            this.f31959m = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f31958l, this.f31959m, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0120 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:7:0x002e, B:44:0x0196, B:46:0x019c, B:48:0x019f, B:13:0x004b, B:30:0x0105, B:32:0x010b, B:35:0x0124, B:37:0x012a, B:40:0x0143, B:39:0x013f, B:34:0x0120, B:16:0x0053, B:18:0x005b, B:20:0x008c, B:22:0x00a2, B:24:0x00b6, B:26:0x00d4, B:49:0x01a9, B:50:0x01b0), top: B:54:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x013f A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:7:0x002e, B:44:0x0196, B:46:0x019c, B:48:0x019f, B:13:0x004b, B:30:0x0105, B:32:0x010b, B:35:0x0124, B:37:0x012a, B:40:0x0143, B:39:0x013f, B:34:0x0120, B:16:0x0053, B:18:0x005b, B:20:0x008c, B:22:0x00a2, B:24:0x00b6, B:26:0x00d4, B:49:0x01a9, B:50:0x01b0), top: B:54:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x019c A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:7:0x002e, B:44:0x0196, B:46:0x019c, B:48:0x019f, B:13:0x004b, B:30:0x0105, B:32:0x010b, B:35:0x0124, B:37:0x012a, B:40:0x0143, B:39:0x013f, B:34:0x0120, B:16:0x0053, B:18:0x005b, B:20:0x008c, B:22:0x00a2, B:24:0x00b6, B:26:0x00d4, B:49:0x01a9, B:50:0x01b0), top: B:54:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x019f A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:7:0x002e, B:44:0x0196, B:46:0x019c, B:48:0x019f, B:13:0x004b, B:30:0x0105, B:32:0x010b, B:35:0x0124, B:37:0x012a, B:40:0x0143, B:39:0x013f, B:34:0x0120, B:16:0x0053, B:18:0x005b, B:20:0x008c, B:22:0x00a2, B:24:0x00b6, B:26:0x00d4, B:49:0x01a9, B:50:0x01b0), top: B:54:0x0012 }] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Context context;
            long j8;
            int i14;
            c cVar;
            String strO;
            String strK;
            com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a c0518a;
            String strConcat;
            Object objE0;
            String str;
            long j14;
            Context context2;
            sz0.e eVar;
            String str2;
            String str3;
            PendingIntent pendingIntent;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f31957k;
            Intent intent = this.f31958l;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        j8 = this.f31956j;
                        i14 = this.f31955i;
                        cVar = this.f31948b;
                        context = this.f31947a;
                        r.b(obj);
                    } else {
                        if (i15 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j15 = this.f31956j;
                        com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a c0518a2 = this.f31954h;
                        Context context3 = this.f31953g;
                        String str4 = this.f31952f;
                        String str5 = this.f31951e;
                        strConcat = this.f31950d;
                        sz0.e eVar2 = this.f31949c;
                        r.b(obj);
                        c0518a = c0518a2;
                        context2 = context3;
                        str2 = str4;
                        str = str5;
                        eVar = eVar2;
                        j14 = j15;
                        objE0 = obj;
                    }
                    str3 = strConcat;
                    pendingIntent = (PendingIntent) objE0;
                    if (pendingIntent == null) {
                        return Unit.INSTANCE;
                    }
                    c0518a.getClass();
                    com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a.a(context2, str2, str, str3, eVar, pendingIntent, (int) j14);
                    return Unit.INSTANCE;
                }
                r.b(obj);
                Parcelable parcelableExtra = intent.getParcelableExtra("extra.rts_deeplink_uri");
                if (parcelableExtra == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Uri uri = (Uri) parcelableExtra;
                ScheduledRTSDeeplinkBroadcastReceiver.f31944b.getClass();
                a.b().warn("Received RTS deeplink broadcast: " + uri);
                c.f161097o.getClass();
                c cVarA = c.a.a(uri);
                Context context4 = this.f31959m;
                long longExtra = intent.getLongExtra("extra.device_unit_id", -1L);
                if (longExtra == -1) {
                    a.b().warn("Missing device unit ID, ignore this request " + intent);
                    return Unit.INSTANCE;
                }
                String str6 = (String) u.H(da2.d.b().f58886a.f111646e.b(longExtra));
                if (str6 == null) {
                    a.b().warn("Cannot find mac addr for " + longExtra + ", ignore this request " + intent);
                    return Unit.INSTANCE;
                }
                w wVar = w.f67058a;
                String strL0 = d53.w.l0(GCMSettingManager.k().e(), IOUtils.DIR_SEPARATOR_UNIX);
                String strB = c22.b0.b(null);
                this.f31947a = context4;
                this.f31948b = cVarA;
                this.f31955i = 0;
                this.f31956j = longExtra;
                this.f31957k = 1;
                if (wVar.c(context4, longExtra, str6, strL0, strB, this) != aVar) {
                    context = context4;
                    j8 = longExtra;
                    i14 = 0;
                    cVar = cVarA;
                }
                return aVar;
                String strQ = cVar.getNotificationTitleHandle();
                if (strQ != null) {
                    j.a aVar2 = j.f56682a;
                    byte[] bytes = strQ.getBytes(d53.c.f57666b);
                    bytes.getClass();
                    strO = j.a.b(aVar2, context, Base64.encodeToString(bytes, 0));
                    if (strO == null) {
                        strO = cVar.getNotificationTitle();
                    }
                } else {
                    strO = cVar.getNotificationTitle();
                }
                String strM = cVar.getNotificationDescriptionHandle();
                if (strM != null) {
                    j.a aVar3 = j.f56682a;
                    byte[] bytes2 = strM.getBytes(d53.c.f57666b);
                    bytes2.getClass();
                    strK = j.a.b(aVar3, context, Base64.encodeToString(bytes2, 0));
                    if (strK == null) {
                        strK = cVar.getNotificationDescription();
                    }
                } else {
                    strK = cVar.getNotificationDescription();
                }
                c0518a = com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.f31960b;
                String strF = n.f(strO);
                String strF2 = n.f(strK);
                strConcat = "\u200b\u200c\u200b".concat(strK);
                sz0.e eVar3 = sz0.e.I;
                yc0.c cVar2 = yc0.c.f196719a;
                int iB = cVar.getCompositionId();
                this.f31947a = null;
                this.f31948b = null;
                this.f31949c = eVar3;
                this.f31950d = strConcat;
                this.f31951e = strF2;
                this.f31952f = strF;
                this.f31953g = context;
                this.f31954h = c0518a;
                this.f31955i = i14;
                this.f31956j = j8;
                this.f31957k = 2;
                cVar2.getClass();
                x53.c cVar3 = s0.f129406a;
                long j16 = j8;
                Context context5 = context;
                objE0 = ge1.b.e0(x53.b.f189152a, new yc0.b(j16, context5, iB, true, null), this);
                if (objE0 != aVar) {
                    str = strF2;
                    j14 = j16;
                    context2 = context5;
                    eVar = eVar3;
                    str2 = strF;
                    str3 = strConcat;
                    pendingIntent = (PendingIntent) objE0;
                    if (pendingIntent == null) {
                        return Unit.INSTANCE;
                    }
                    c0518a.getClass();
                    com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a.C0518a.a(context2, str2, str, str3, eVar, pendingIntent, (int) j14);
                    return Unit.INSTANCE;
                }
                return aVar;
            } catch (Throwable unused) {
                ScheduledRTSDeeplinkBroadcastReceiver.f31944b.getClass();
                a.b().warn("Failed to handle scheduled intent " + intent);
            }
        }
    }

    public ScheduledRTSDeeplinkBroadcastReceiver() {
        x53.c cVar = s0.f129406a;
        this.f31946a = c0.a(x53.b.f189152a.plus(ge1.b.h()));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ge1.b.T(this.f31946a, null, null, new b(intent, context, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/deeplinking/ScheduledRTSDeeplinkBroadcastReceiver$a;", "", "<init>", "()V", "", "EXTRA_RTS_DEEPLINK_URI", "Ljava/lang/String;", "EXTRA_DEVICE_UNIT_ID", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8) {
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) ScheduledRTSDeeplinkBroadcastReceiver.class);
            intent.setData(new Uri.Builder().authority("scheduled.rts.notification").query("deviceUnitId=" + j8).build());
            return intent;
        }

        public static Logger b() {
            return (Logger) ScheduledRTSDeeplinkBroadcastReceiver.f31945c.getValue();
        }

        private a() {
        }
    }
}
