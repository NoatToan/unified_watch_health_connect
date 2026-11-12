package kd0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.UserDevicesActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsOrientation;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesConfigActivity;
import com.garmin.android.apps.connectmobile.smartscale.IndexScaleTellUSMoreActivity;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import com.google.common.collect.ImmutableList;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkd0/l1;", "Ll80/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzd0/j1;", "subscriptionProvider", "<init>", "(Landroid/content/Context;Lzd0/j1;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l1 implements l80.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd0.j1 f104187b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl$navigateToHeartRateZones$1", f = "DeviceDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f104188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f104189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f104190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f104191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, long j8, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104189b = context;
            this.f104190c = j8;
            this.f104191d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f104189b, this.f104190c, this.f104191d, dVar);
            aVar.f104188a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            long j8 = this.f104190c;
            try {
                int i15 = o13.q.f128596b;
                rd2.f.a().f152045a.getClass();
                bVar = rd2.j.i(j8, null);
            } catch (Throwable th3) {
                int i16 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            sd2.f fVar = (sd2.f) (bVar instanceof o13.q.b ? null : bVar);
            Context context = this.f104189b;
            if (fVar != null) {
                HRZonesConfigActivity.a aVar2 = HRZonesConfigActivity.f44028j;
                String productNumber = fVar.getProductNumber();
                productNumber.getClass();
                am.z0 z0Var = am.z0.f4390a;
                am.x0 x0Var = am.x0.f4308n;
                String str = this.f104191d;
                if (am.z0.b(x0Var, str)) {
                    i14 = 1;
                } else if (am.z0.b(am.x0.f4312o, str)) {
                    i14 = 2;
                } else {
                    i14 = am.z0.b(am.x0.f4324r, str) ? 3 : 0;
                }
                aVar2.getClass();
                HRZonesConfigActivity.a.a(context, j8, productNumber, i14);
            } else {
                androidx.room.a0.r(context, UserDevicesActivity.class);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl$navigateToPowerZones$1", f = "DeviceDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f104192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f104193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f104194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f104195d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f104193b = context;
            this.f104194c = str;
            this.f104195d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f104193b, this.f104194c, this.f104195d, dVar);
            bVar.f104192a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            vk1.e eVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            long j8 = this.f104195d;
            try {
                int i14 = o13.q.f128596b;
                rd2.f.a().f152045a.getClass();
                bVar = rd2.j.i(j8, null);
            } catch (Throwable th3) {
                int i15 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            sd2.f fVar = (sd2.f) (bVar instanceof o13.q.b ? null : bVar);
            Context context = this.f104193b;
            if (fVar != null) {
                PowerZonesConfigActivity.a aVar2 = PowerZonesConfigActivity.f44055i;
                am.z0 z0Var = am.z0.f4390a;
                am.x0 x0Var = am.x0.f4308n;
                String str = this.f104194c;
                if (am.z0.b(x0Var, str)) {
                    eVar = vk1.e.RUNNING;
                } else if (am.z0.b(am.x0.f4312o, str)) {
                    eVar = vk1.e.CYCLING;
                } else if (am.z0.b(am.x0.U1, str)) {
                    eVar = vk1.e.CROSS_COUNTRY_SKIING;
                } else {
                    eVar = (am.z0.Q(str) || am.z0.b(am.x0.f4297k1, str)) ? vk1.e.ROWING : vk1.e.RUNNING;
                }
                String strName = eVar.name();
                aVar2.getClass();
                PowerZonesConfigActivity.a.a(context, 200, strName);
            } else {
                androidx.room.a0.r(context, UserDevicesActivity.class);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/l1$c", "Lxf1/g;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xf1.g {
        @Override // xf1.g
        public final void a() {
            sz0.d.a();
            sz0.d.b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl$onDeviceNeedsBond$1", f = "DeviceDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f104196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedDeviceInfo f104197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, SharedDeviceInfo sharedDeviceInfo, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f104196a = str;
            this.f104197b = sharedDeviceInfo;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f104196a, this.f104197b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            bb2.j jVarG = CacheDatabase.i().g();
            bb2.i.f17360g.getClass();
            String str = this.f104196a;
            str.getClass();
            SharedDeviceInfo sharedDeviceInfo = this.f104197b;
            sharedDeviceInfo.getClass();
            jVarG.d(new bb2.i(sharedDeviceInfo.getUnitID(), str, sharedDeviceInfo.getProductNumber(), sharedDeviceInfo.getProductDisplayName(), sharedDeviceInfo.getImageURL(), false));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl$overrideCustomerGUID$1", f = "DeviceDelegateImpl.kt", l = {309, 316, 321}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jf0.a f104198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f104199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f104202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ rs2.t f104203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f104204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(rs2.t tVar, long j8, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f104203f = tVar;
            this.f104204g = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = new e(this.f104203f, this.f104204g, dVar);
            eVar.f104202e = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00b5 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0017, B:43:0x00e3, B:14:0x002c, B:38:0x00ad, B:40:0x00b5, B:17:0x0036, B:32:0x007e, B:34:0x0099, B:20:0x0041, B:22:0x005b, B:26:0x0062, B:28:0x006e, B:27:0x006c), top: B:54:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:51:0x010a  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
        
            if (r8.k(r9, r11, r14) == r0) goto L42;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Throwable thB;
            long j8;
            byte[] bytes;
            int i14;
            long j14;
            jf0.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f104201d;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    rs2.t tVar = this.f104203f;
                    j8 = this.f104204g;
                    int i16 = o13.q.f128596b;
                    com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICES;
                    aVar3.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "overwriteCustomerGUID");
                    ve2.d dVarK = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).k();
                    String str = dVarK != null ? dVarK.f177691b : null;
                    if (str != null) {
                        bytes = str.getBytes(d53.c.f57666b);
                        bytes.getClass();
                    } else {
                        bytes = new byte[0];
                    }
                    this.f104202e = null;
                    this.f104199b = j8;
                    this.f104200c = 0;
                    this.f104201d = 1;
                    if (tVar.b(bytes, this) != aVar2) {
                        i14 = 0;
                    }
                    return aVar2;
                }
                if (i15 == 1) {
                    i14 = this.f104200c;
                    j8 = this.f104199b;
                    o13.r.b(obj);
                } else if (i15 == 2) {
                    i14 = this.f104200c;
                    long j15 = this.f104199b;
                    aVar = this.f104198a;
                    o13.r.b(obj);
                    j14 = j15;
                    if (((Boolean) obj).booleanValue()) {
                        com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "overwriteCustomerGUID: ECG onboarding item reset required");
                        long userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "overwriteCustomerGUID: reset ECG onboarding item");
                        this.f104202e = null;
                        this.f104198a = null;
                        this.f104200c = i14;
                        this.f104199b = userProfilePk;
                        this.f104201d = 3;
                    }
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                bVar = Unit.INSTANCE;
                int i17 = o13.q.f128596b;
                if (!(bVar instanceof o13.q.b)) {
                    com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                    aVar5.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(a2Var3, "overwriteCustomerGUID: success");
                }
                thB = o13.q.b(bVar);
                if (thB != null) {
                    com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                    aVar6.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.g(a2Var4, "overwriteCustomerGUID: failure ", thB);
                }
                return Unit.INSTANCE;
                ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).e(j8);
                jf0.a aVar7 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                if (com.garmin.android.apps.connectmobile.k1.f37122a.W()) {
                    this.f104202e = null;
                    this.f104198a = aVar7;
                    this.f104199b = j8;
                    this.f104200c = i14;
                    this.f104201d = 2;
                    Object objI = aVar7.i(j8, this);
                    if (objI != aVar2) {
                        j14 = j8;
                        aVar = aVar7;
                        obj = objI;
                        if (((Boolean) obj).booleanValue()) {
                            com.garmin.android.apps.connectmobile.i2.a aVar8 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                            aVar8.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(a2Var5, "overwriteCustomerGUID: ECG onboarding item reset required");
                            long userProfilePk2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                            com.garmin.android.apps.connectmobile.i2.a.a(a2Var5, "overwriteCustomerGUID: reset ECG onboarding item");
                            this.f104202e = null;
                            this.f104198a = null;
                            this.f104200c = i14;
                            this.f104199b = userProfilePk2;
                            this.f104201d = 3;
                        }
                    }
                    return aVar2;
                }
                bVar = Unit.INSTANCE;
                int i18 = o13.q.f128596b;
            } catch (Throwable th3) {
                int i19 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            if (!(bVar instanceof o13.q.b)) {
                com.garmin.android.apps.connectmobile.i2.a aVar9 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                aVar9.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var6, "overwriteCustomerGUID: success");
            }
            thB = o13.q.b(bVar);
            if (thB != null) {
                com.garmin.android.apps.connectmobile.i2.a aVar10 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                aVar10.getClass();
                com.garmin.android.apps.connectmobile.i2.a.g(a2Var7, "overwriteCustomerGUID: failure ", thB);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/l1$f", "Lxf1/g;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xf1.g {
        @Override // xf1.g
        public final void a() {
            sz0.d.a();
            sz0.d.b();
        }
    }

    public l1(Context context, zd0.j1 j1Var) {
        context.getClass();
        j1Var.getClass();
        this.f104186a = context;
        this.f104187b = j1Var;
    }

    @Override // l80.a
    public final void A(long j8) {
        EventSharingSubscriptionHandler.askDeviceForLTSupportedFeatures$default(j8, null, 2, null);
    }

    @Override // l80.a
    public final void B(int i14) {
        com.garmin.android.apps.connectmobile.segments.presentation.g gVarA;
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(String.valueOf(i14));
        zb0.u0 u0Var2 = zb0.u0.E1;
        if ((u0Var == u0Var2 ? sz0.b.a.VIVOFIT_VIDEO : null) != null) {
            sz0.c.b().a(sz0.b.a(u0Var == u0Var2 ? sz0.b.a.VIVOFIT_VIDEO : null));
        }
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                if (km2.a.d(((sd2.f) it.next()).getUnitID(), km2.a.c())) {
                    sz0.c.b().a(sz0.b.a(sz0.b.a.CONNECT_IQ));
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.segments.presentation.g.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b;
            synchronized (com.garmin.android.apps.connectmobile.segments.presentation.g.class) {
                gVarA = com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b.a();
            }
            if (!gVarA.a().isEmpty()) {
                sz0.c.b().a(sz0.b.a(sz0.b.a.STRAVA_PROMO));
            }
        }
        if (com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b.a() != null) {
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).l(new c());
        }
    }

    @Override // l80.a
    public final PendingIntent C(long j8) {
        Context context = this.f104186a;
        Intent intentMa = DeviceDetailsActivity.ma(context, j8);
        intentMa.setFlags(335544320);
        intentMa.putExtra("GCM_requireNewInstance", false);
        PendingIntent activity = PendingIntent.getActivity(context, 40, intentMa, 201326592);
        activity.getClass();
        return activity;
    }

    @Override // l80.a
    public final Object D(long j8, s80.i.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new wr2.a0(j8, null), cVar);
    }

    @Override // l80.a
    public final void E() {
        GCMSettingManager.f41536b.edit().putString(lg1.d.DEVICE_SOFTWARE_UPDATE_MODE.f112244a, "Normal").apply();
    }

    @Override // l80.a
    public final void F(bm2.d dVar) {
        tv.s.b(this.f104186a, dVar.getF92746j()).e(String.valueOf(dVar.getF92745i()));
    }

    @Override // l80.a
    public final void G() {
        u(null);
    }

    @Override // l80.a
    public final void H(long j8) {
        EventSharingSubscriptionHandler.fetchDeviceSupportedEvents$default(j8, null, 2, null);
    }

    @Override // l80.a
    public final void I(bm2.d dVar, byte[] bArr) {
        dVar.getClass();
        bArr.getClass();
        new Thread(new uj2.b(this.f104186a, dVar, bArr)).start();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l80.a
    public final Comparable J(v13.c cVar) throws UnsupportedEncodingException {
        k1 k1Var;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i14 = k1Var.f104165c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k1Var.f104165c = i14 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        Object objR = k1Var.f104163a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k1Var.f104165c;
        if (i15 == 0) {
            o13.r.b(objR);
            k1Var.f104165c = 1;
            objR = R(k1Var);
            if (objR == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objR);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objR;
        pu.k kVar = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b ? (pu.k) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a : null;
        gg1.v0.a aVar2 = gg1.v0.T;
        String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
        aVar2.getClass();
        String str = gg1.v0.a.a(strName).f77335a.f204880a;
        String strEncode = URLEncoder.encode("https://www.garmin.com/account/subscriptions", "UTF-8");
        if (kVar == null || kVar.a() == null) {
            return null;
        }
        StringBuilder sbI = p6.b.i("https://", str, "/sso/login?logintoken=", kVar.a(), "&mobile=true&service=");
        sbI.append(strEncode);
        return Uri.parse(sbI.toString());
    }

    @Override // l80.a
    public final al2.a K(long j8) {
        Map<Long, al2.a> map;
        yr1.m.f199104a.getClass();
        yr1.g gVar = yr1.m.f199105b.get();
        if (gVar == null || (map = gVar.f199085f) == null) {
            return null;
        }
        return map.get(Long.valueOf(j8));
    }

    @Override // l80.a
    public final ImmutableList L() {
        ImmutableList<String> immutableList = zb0.n0.f203578b;
        immutableList.getClass();
        return immutableList;
    }

    @Override // l80.a
    public final void M(SharedDeviceInfo sharedDeviceInfo) {
        sharedDeviceInfo.getClass();
        String macAddress = sharedDeviceInfo.getMacAddress();
        if (macAddress != null && p005kotlin.jvm.internal.s.g(sharedDeviceInfo.getWasSavedLocally(), Boolean.TRUE)) {
            zb0.l1 l1Var = zb0.l1.f203565a;
            long unitID = sharedDeviceInfo.getUnitID();
            l1Var.getClass();
            f12.l.f68084a.getClass();
            if (f12.l.a.a().L1("SystemBondingLostDeviceIds").contains(String.valueOf(unitID))) {
                com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceDelegate", "onDeviceNeedsBond device already saved by SystemBondingLostEventHandler ignoring " + sharedDeviceInfo);
                return;
            }
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "DeviceDelegate", "onDeviceNeedsBond save device DeviceNeedsBond cache " + sharedDeviceInfo);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a.plus(new o53.a0("DeviceDelegate.onDeviceNeedsBond"))), null, null, new d(macAddress, sharedDeviceInfo, null), 3);
        }
    }

    @Override // l80.a
    public final bm2.c N(String str) {
        return zb0.b.c(str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0092, please report this as an issue */
    @Override // l80.a
    public final Object O(v13.c cVar) throws Throwable {
        m1 m1Var;
        Set set;
        Set<Long> setD;
        com.garmin.android.apps.connectmobile.a2 a2Var;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i14 = m1Var.f104221d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m1Var.f104221d = i14 - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(this, cVar);
            }
        } else {
            m1Var = new m1(this, cVar);
        }
        Object objE0 = m1Var.f104219b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = m1Var.f104221d;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            n1 n1Var = new n1(null);
            m1Var.f104221d = 1;
            objE0 = ge1.b.e0(bVar, n1Var, m1Var);
            if (objE0 != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = m1Var.f104218a;
            o13.r.b(objE0);
        }
        setD = ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).d();
        a2Var = com.garmin.android.apps.connectmobile.a2.DEVICES;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "onDevicesReconciled: cachedOnboardingDevices=" + setD + ", newPairedDevices=" + set);
        if (!p005kotlin.jvm.internal.s.g(setD, set)) {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "onDevicesReconciled: new paired devices, fetching device onboarding items for " + set);
            FetchDevicesOnboardingWorker.f39672j.getClass();
            FetchDevicesOnboardingWorker.a.a(this.f104186a);
        }
        return Unit.INSTANCE;
        Set set2 = (Set) objE0;
        m1Var.f104218a = set2;
        m1Var.f104221d = 2;
        if (a(set2, m1Var) != obj) {
            set = set2;
            setD = ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).d();
            a2Var = com.garmin.android.apps.connectmobile.a2.DEVICES;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "onDevicesReconciled: cachedOnboardingDevices=" + setD + ", newPairedDevices=" + set);
            if (!p005kotlin.jvm.internal.s.g(setD, set)) {
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "onDevicesReconciled: new paired devices, fetching device onboarding items for " + set);
                FetchDevicesOnboardingWorker.f39672j.getClass();
                FetchDevicesOnboardingWorker.a.a(this.f104186a);
            }
            return Unit.INSTANCE;
        }
        return obj;
    }

    @Override // l80.a
    public final Object P(long j8, ed0.a.b.C1350a c1350a) {
        b31.f fVar = (b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null);
        fVar.j();
        fVar.g(j8);
        Object objG = ((b31.a) KoinJavaComponent.get$default(b31.a.class, null, null, 6, null)).g(j8, c1350a);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }

    @Override // l80.a
    public final void Q() {
        if (com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b.a() != null) {
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).l(new f());
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object R(v13.c cVar) {
        j1 j1Var;
        String strQ2;
        String str;
        String str2;
        Object objJ;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i14 = j1Var.f104143e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j1Var.f104143e = i14 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object objI = j1Var.f104141c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j1Var.f104143e;
        if (i15 == 0) {
            o13.r.b(objI);
            f12.l.f68084a.getClass();
            strQ2 = f12.l.a.a().Q2();
            str = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).d().f158514a;
            if (strQ2.length() == 0) {
                k12.d dVarA = k12.d.a.a(k12.d.f102315g);
                j1Var.f104139a = "https://www.garmin.com/account/subscriptions";
                j1Var.f104140b = str;
                j1Var.f104143e = 1;
                objI = dVarA.i(j1Var);
                if (objI != aVar) {
                    str2 = "https://www.garmin.com/account/subscriptions";
                }
            } else {
                str2 = "https://www.garmin.com/account/subscriptions";
                String str3 = str;
                k12.b bVarA = k12.b.a.a(k12.b.f102303b);
                j1Var.f104139a = null;
                j1Var.f104140b = null;
                j1Var.f104143e = 2;
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVarA, new k12.c(bVarA, str2, strQ2, str3, null), j1Var);
                if (objJ != aVar) {
                    return objJ;
                }
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objI);
                return objI;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = j1Var.f104140b;
        str2 = j1Var.f104139a;
        o13.r.b(objI);
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objI;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return new com.garmin.android.apps.connectmobile.v2.a(new Exception("Invalid customerGUID"), null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        strQ2 = ((j12.l) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).getGarminGUID();
        if (strQ2 == null) {
            strQ2 = "";
        }
        String str4 = str;
        k12.b bVarA2 = k12.b.a.a(k12.b.f102303b);
        j1Var.f104139a = null;
        j1Var.f104140b = null;
        j1Var.f104143e = 2;
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVarA2, new k12.c(bVarA2, str2, strQ2, str4, null), j1Var);
        if (objJ != aVar) {
            return aVar;
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015c  */
    /* JADX WARN: Code duplicated, block: B:48:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0177  */
    /* JADX WARN: Code duplicated, block: B:54:0x0181  */
    /* JADX WARN: Code duplicated, block: B:65:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:44:0x0156->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:1: B:52:0x017b->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e1 -> B:32:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01c5 -> B:61:0x01c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l80.a
    public final java.lang.Object a(java.util.Set r18, v13.c r19) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.l1.a(java.util.Set, v13.c):java.lang.Object");
    }

    @Override // l80.a
    public final void b(long j8, boolean z14) {
        if (z14) {
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.STORED_WIFI_NETWORK);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc A[LOOP:2: B:42:0x00b6->B:44:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6 A[LOOP:3: B:48:0x00f0->B:50:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x014e A[LOOP:4: B:52:0x0148->B:54:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // l80.a
    public final Object c(long j8, v13.c cVar) {
        o1 o1Var;
        ArrayList arrayListD;
        long j14;
        ?? arrayList;
        Iterable iterable;
        Iterator it;
        List<yx2.d> list;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        Iterator it4;
        ArrayList arrayList4;
        Iterator it5;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f104265d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f104265d = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object obj = o1Var.f104263b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var.f104265d;
        if (i15 == 0) {
            o13.r.b(obj);
            try {
                arrayListD = xx2.b.d();
            } catch (IllegalStateException unused) {
                o1Var.f104262a = j8;
                o1Var.f104265d = 1;
                if (this.f104187b.d(o1Var) == aVar) {
                    return aVar;
                }
                arrayListD = xx2.b.d();
            } catch (Exception unused2) {
                com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.i2.a.e(a2Var, "no customer/customer oauth data, cannot check inReach subscription info");
                return Unit.INSTANCE;
            }
            j14 = j8;
            if (arrayListD != null) {
                arrayList = new ArrayList();
                for (Object obj2 : arrayListD) {
                    if (p005kotlin.jvm.internal.s.g(((yx2.c) obj2).f200057j, "OUT_INRSMP_C_META_P")) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            iterable = (Iterable) arrayList;
            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                it = iterable.iterator();
                while (it.hasNext()) {
                    list = ((yx2.c) it.next()).f200068w;
                    if (list != null) {
                        arrayList2 = new ArrayList(p13.y.r(list, 10));
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((yx2.d) it3.next()).f200072c);
                        }
                        if (arrayList2.contains(String.valueOf(j14))) {
                            f12.l.f68084a.getClass();
                            Set<String> setL1 = f12.l.a.a().L1("DISMISSED_BANNER_DEVICES");
                            arrayList3 = new ArrayList(p13.y.r(setL1, 10));
                            it4 = setL1.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add((vb0.e) GsonUtil.f47253b.fromJson((String) it4.next(), vb0.e.class));
                            }
                            Set setF1 = p13.h0.f1(arrayList3);
                            setF1.removeIf(new a73.n(new j82.d(j14, 4), 15));
                            setF1.add(new vb0.e(j14, b63.a.C0229a.f16171a.a().c(), -1L));
                            f12.l.f68084a.getClass();
                            f12.l lVarA = f12.l.a.a();
                            arrayList4 = new ArrayList(p13.y.r(setF1, 10));
                            it5 = setF1.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(GsonUtil.a((vb0.e) it5.next()));
                            }
                            lVarA.X1("DISMISSED_BANNER_DEVICES", p13.h0.g1(arrayList4));
                            break;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = o1Var.f104262a;
        o13.r.b(obj);
        arrayListD = xx2.b.d();
        j14 = j8;
        if (arrayListD != null) {
            arrayList = new ArrayList();
            while (r13.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((yx2.c) obj2).f200057j, "OUT_INRSMP_C_META_P")) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        iterable = (Iterable) arrayList;
        if (iterable instanceof Collection) {
            it = iterable.iterator();
            while (it.hasNext()) {
                list = ((yx2.c) it.next()).f200068w;
                if (list != null) {
                    arrayList2 = new ArrayList(p13.y.r(list, 10));
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((yx2.d) it3.next()).f200072c);
                    }
                    if (arrayList2.contains(String.valueOf(j14))) {
                        f12.l.f68084a.getClass();
                        Set<String> setL2 = f12.l.a.a().L1("DISMISSED_BANNER_DEVICES");
                        arrayList3 = new ArrayList(p13.y.r(setL2, 10));
                        it4 = setL2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add((vb0.e) GsonUtil.f47253b.fromJson((String) it4.next(), vb0.e.class));
                        }
                        Set setF2 = p13.h0.f1(arrayList3);
                        setF2.removeIf(new a73.n(new j82.d(j14, 4), 15));
                        setF2.add(new vb0.e(j14, b63.a.C0229a.f16171a.a().c(), -1L));
                        f12.l.f68084a.getClass();
                        f12.l lVarA2 = f12.l.a.a();
                        arrayList4 = new ArrayList(p13.y.r(setF2, 10));
                        it5 = setF2.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(GsonUtil.a((vb0.e) it5.next()));
                        }
                        lVarA2.X1("DISMISSED_BANNER_DEVICES", p13.h0.g1(arrayList4));
                        break;
                    }
                }
            }
        } else {
            it = iterable.iterator();
            while (it.hasNext()) {
                list = ((yx2.c) it.next()).f200068w;
                if (list != null) {
                    arrayList2 = new ArrayList(p13.y.r(list, 10));
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((yx2.d) it3.next()).f200072c);
                    }
                    if (arrayList2.contains(String.valueOf(j14))) {
                        f12.l.f68084a.getClass();
                        Set<String> setL3 = f12.l.a.a().L1("DISMISSED_BANNER_DEVICES");
                        arrayList3 = new ArrayList(p13.y.r(setL3, 10));
                        it4 = setL3.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add((vb0.e) GsonUtil.f47253b.fromJson((String) it4.next(), vb0.e.class));
                        }
                        Set setF3 = p13.h0.f1(arrayList3);
                        setF3.removeIf(new a73.n(new j82.d(j14, 4), 15));
                        setF3.add(new vb0.e(j14, b63.a.C0229a.f16171a.a().c(), -1L));
                        f12.l.f68084a.getClass();
                        f12.l lVarA3 = f12.l.a.a();
                        arrayList4 = new ArrayList(p13.y.r(setF3, 10));
                        it5 = setF3.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(GsonUtil.a((vb0.e) it5.next()));
                        }
                        lVarA3.X1("DISMISSED_BANNER_DEVICES", p13.h0.g1(arrayList4));
                        break;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // l80.a
    public final void d(Context context, long j8, String str) {
        context.getClass();
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(context, str, j8, null), 3);
    }

    @Override // l80.a
    public final Map<String, al2.k> e() {
        Map<String, al2.k> map;
        yr1.m.f199104a.getClass();
        yr1.g gVar = yr1.m.f199105b.get();
        if (gVar != null && (map = gVar.f199083d) != null) {
            return map;
        }
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }

    @Override // l80.a
    public final boolean f(String str) {
        str.getClass();
        return VoiceAssistantProtobufRequestHandler.INSTANCE.isVoiceAssistantSupported(str, null);
    }

    @Override // l80.a
    public final void g() {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_paired_successful_at_least_once, GCMSettingManager.f41536b.edit(), true);
    }

    @Override // l80.a
    public final int h(bm2.d dVar) {
        tv.s sVarB = tv.s.b(this.f104186a, dVar.getF92746j());
        sVarB.getClass();
        try {
            String strValueOf = String.valueOf(sVarB.f166538a);
            return Integer.valueOf(GCMSettingManager.f41537c.getString(strValueOf + "sw_version", "")).intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // l80.a
    public final void i(Context context, long j8, String str) {
        context.getClass();
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new a(context, j8, str, null), 3);
    }

    @Override // l80.a
    public final boolean j(long j8) {
        return wd2.m.d(this.f104186a, j8);
    }

    @Override // l80.a
    public final void k(long j8) {
        f12.l.f68084a.getClass();
        f12.l.a.a().s1(j8);
        hd1.t.f83397a.getClass();
        long j14 = hd1.t.f83399c;
        if (j14 != j8) {
            hd1.t.f83399c = j8;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICES;
            String strI = am.j.i(j8, "]", ds.e0.k(j14, "RealTimeDataProvider switchDevicePAT previousPATUnitId[", "] newPATUnitId["));
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strI);
            String strC = hd1.t.c(j14);
            if (strC != null) {
                hd1.t.e(strC);
            }
            String strC2 = hd1.t.c(j8);
            if (strC2 != null) {
                hd1.t.b(strC2, true);
            }
        }
    }

    @Override // l80.a
    public final boolean l() {
        return GarminDeviceWakefulService.f33825e;
    }

    @Override // l80.a
    public final com.garmin.android.apps.connectmobile.devices.setup.wizard.c m(com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        lVar.getClass();
        Context context = this.f104186a;
        String string = context.getString(R.string.lbl_setting_time);
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        String string2 = context.getString(R.string.msg_vivomove_setup_set_time);
        string2.getClass();
        String str = String.format(string2, Arrays.copyOf(new Object[]{lVar.getF143516f()}, 1));
        com.garmin.android.apps.connectmobile.devices.setup.wizard.c cVar = new com.garmin.android.apps.connectmobile.devices.setup.wizard.c();
        Bundle bundle = new Bundle();
        bundle.putInt("DEVICE_IMAGE_RES_ID", 2131231815);
        bundle.putString("TITLE_MESSAGE", string);
        bundle.putString("INFO_MESSAGE", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // l80.a
    public final boolean n(int i14, long j8) {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        rd2.f.a().f152045a.getClass();
        byte[] bArrJ = rd2.j.j(j8);
        return bArrJ == null || vm2.e.b(bArrJ, i14, j8);
    }

    @Override // l80.a
    public final void o(Activity activity, com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        activity.getClass();
        lVar.getClass();
        Bundle bundleA = h7.c.a(new o13.p("GCM_deviceUnitID", Long.valueOf(lVar.getF143511a())), new o13.p("GCM_deviceName", lVar.getDeviceName()), new o13.p("extra_primary_flow", Boolean.TRUE), new o13.p("GCM_deviceDTO", lVar));
        IndexScaleTellUSMoreActivity.f44359h.getClass();
        Intent intent = new Intent(activity, (Class<?>) IndexScaleTellUSMoreActivity.class);
        intent.putExtras(bundleA);
        activity.startActivity(intent);
    }

    @Override // l80.a
    public final void p(String str, boolean z14) {
        GarminDeviceWakefulService.g(str, z14);
    }

    @Override // l80.a
    public final void q(Activity activity) {
        activity.getClass();
        DeviceSetupActivity.f33758b.b(activity, ca0.o1.ADD_DEVICE, 0);
    }

    @Override // l80.a
    public final void r(long j8) {
        ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).d(j8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // l80.a
    public final Object s(boolean z14, v13.c cVar) {
        i1 i1Var;
        ?? arrayList;
        ArrayList arrayList2;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i14 = i1Var.f104116c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i1Var.f104116c = i14 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objB = i1Var.f104114a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i1Var.f104116c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                i1Var.f104116c = 1;
                objB = xx2.b.b(z14, i1Var);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            List list = (List) ((xx2.e) objB).f192598a;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (p005kotlin.jvm.internal.s.g(((yx2.c) obj).f200057j, "OUT_INRSMP_C_META_P")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList3 = new ArrayList(p13.y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                List<yx2.d> list2 = ((yx2.c) it.next()).f200068w;
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str = ((yx2.d) it3.next()).f200072c;
                        Long lJ = str != null ? d53.t.j(str) : null;
                        if (lJ != null) {
                            arrayList2.add(lJ);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                arrayList3.add(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                return p13.j0.f134944a;
            }
            Iterator it4 = arrayList3.iterator();
            if (!it4.hasNext()) {
                org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                return null;
            }
            ?? next = it4.next();
            while (it4.hasNext()) {
                List list3 = (List) it4.next();
                next = (List) next;
                if (list3 != null) {
                    ArrayList arrayListC0 = next != 0 ? p13.h0.C0(next, list3) : null;
                    if (arrayListC0 != null) {
                        next = arrayListC0;
                    }
                }
            }
            List list4 = (List) next;
            return list4 == null ? p13.j0.f134944a : list4;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l80.a
    public final void t(long j8) {
        wd2.m.f(this.f104186a, Long.valueOf(j8));
        wd2.m.h(j8, com.garmin.android.library.livetrack.i.a.f50228a);
    }

    @Override // l80.a
    public final void u(p90.e.c cVar) {
        ik0.a aVar;
        da2.d dVarB = da2.d.b();
        dVarB.getClass();
        hk0.f fVar = dVarB.f58887b;
        if (fVar == null) {
            fVar = null;
        }
        if (fVar == null || (aVar = fVar.f84068f) == null) {
            return;
        }
        aVar.f93900c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l80.a
    public final Object v(boolean z14, v13.c cVar) {
        h1 h1Var;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i14 = h1Var.f104098c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h1Var.f104098c = i14 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object objS = h1Var.f104096a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = h1Var.f104098c;
        if (i15 == 0) {
            o13.r.b(objS);
            h1Var.f104098c = 1;
            objS = s(z14, h1Var);
            if (objS == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objS);
        }
        List list = (List) objS;
        return list == null ? p13.j0.f134944a : list;
    }

    @Override // l80.a
    public final void w(long j8, rs2.t tVar) {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a.plus(new o53.a0("DeviceDelegate.overwriteCustomerGUID"))), null, null, new e(tVar, j8, null), 3);
    }

    @Override // l80.a
    public final Object x(long j8, v13.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new wr2.z(this.f104186a, j8, null), cVar);
    }

    @Override // l80.a
    public final al2.k y(String str) {
        Map<String, al2.k> map;
        if (str != null) {
            yr1.m.f199104a.getClass();
            yr1.g gVar = yr1.m.f199105b.get();
            if (gVar != null && (map = gVar.f199083d) != null) {
                return map.get(str);
            }
        }
        return null;
    }

    @Override // l80.a
    public final Intent z(Activity activity, long j8) {
        activity.getClass();
        Intent intent = new Intent(activity, (Class<?>) VivosmartDeviceSettingsOrientation.class);
        intent.putExtra("GCM_deviceSetupFollowedByIntent", true);
        intent.putExtra("GCM_deviceUnitID", j8);
        return intent;
    }
}
