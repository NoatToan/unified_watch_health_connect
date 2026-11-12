package com.garmin.android.apps.connectmobile.handalignment;

import android.os.Handler;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import e13.t;
import en0.n;
import en0.q;
import en0.r;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q03.s;
import q03.u;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/f;", "", "Lla2/a;", "", "deviceUnitId", "", "deviceName", "", "supportKeepAlive", "<init>", "(JLjava/lang/String;Z)V", "b", "a", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements la2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f36613h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f36614i = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f36618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f36619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eh2.b f36620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m13.a<GDIHandCalibration.RotateNotification.Status> f36621g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        None,
        Manual,
        Camera
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/f$c", "Lcom/garmin/android/apps/connectmobile/handalignment/b$a;", "Lcom/garmin/proto/generated/GDIHandCalibration$CommandResponse$Status;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.handalignment.b.a<GDIHandCalibration.CommandResponse.Status> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q03.c f36626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f36627b;

        public c(q03.c cVar, f fVar) {
            this.f36626a = cVar;
            this.f36627b = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void a(Exception exc) {
            ((z03.c.a) this.f36626a).c(exc);
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void b(Enum r14) {
            GDIHandCalibration.CommandResponse.Status status = (GDIHandCalibration.CommandResponse.Status) r14;
            GDIHandCalibration.CommandResponse.Status status2 = GDIHandCalibration.CommandResponse.Status.SUCCESS;
            f fVar = this.f36627b;
            q03.c cVar = this.f36626a;
            if (status == status2) {
                ((z03.c.a) cVar).a();
                b bVar = b.None;
                a aVar = f.f36613h;
                fVar.d(bVar);
                xy2.b.D("HandAlignmentCancel", fVar.f36616b);
                return;
            }
            ((z03.c.a) cVar).c(new IllegalStateException("Abort failed: " + status));
            b bVar2 = b.None;
            a aVar2 = f.f36613h;
            fVar.d(bVar2);
            xy2.b.D("HandAlignmentError", fVar.f36616b);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/f$d", "Lcom/garmin/android/apps/connectmobile/handalignment/b$a;", "Lcom/garmin/proto/generated/GDIHandCalibration$RotateResponse$Status;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.apps.connectmobile.handalignment.b.a<GDIHandCalibration.RotateResponse.Status> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f36628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f36629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s<Boolean> f36630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f36631d;

        public d(float f14, float f15, s<Boolean> sVar, f fVar) {
            this.f36628a = f14;
            this.f36629b = f15;
            this.f36630c = sVar;
            this.f36631d = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void a(Exception exc) {
            ((e13.a.C1312a) this.f36630c).a(exc);
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void b(Enum r14) {
            GDIHandCalibration.RotateResponse.Status status = (GDIHandCalibration.RotateResponse.Status) r14;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            float f14 = this.f36628a;
            float f15 = this.f36629b;
            StringBuilder sbI = e0.i("rotateDegrees: (", f14, ", ", f15, ") ");
            sbI.append(status);
            String string = sbI.toString();
            aVar.getClass();
            i2.a.a(a2Var, string);
            GDIHandCalibration.RotateResponse.Status status2 = GDIHandCalibration.RotateResponse.Status.SUCCESS;
            s<Boolean> sVar = this.f36630c;
            f fVar = this.f36631d;
            if (status != status2) {
                ((e13.a.C1312a) sVar).c(Boolean.FALSE);
                b bVar = b.None;
                a aVar2 = f.f36613h;
                fVar.d(bVar);
                xy2.b.D("HandAlignmentError", fVar.f36616b);
                return;
            }
            if (f14 != 0.0f || f15 != 0.0f) {
                b bVar2 = b.Camera;
                a aVar3 = f.f36613h;
                fVar.d(bVar2);
            } else {
                ((e13.a.C1312a) sVar).c(Boolean.TRUE);
                b bVar3 = b.Camera;
                a aVar4 = f.f36613h;
                fVar.d(bVar3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/f$e", "Lcom/garmin/android/apps/connectmobile/handalignment/b$a;", "Lcom/garmin/proto/generated/GDIHandCalibration$CommandResponse$Status;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements com.garmin.android.apps.connectmobile.handalignment.b.a<GDIHandCalibration.CommandResponse.Status> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q03.c f36632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f36633b;

        public e(q03.c cVar, f fVar) {
            this.f36632a = cVar;
            this.f36633b = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void a(Exception exc) {
            ((z03.c.a) this.f36632a).c(exc);
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void b(Enum r14) {
            GDIHandCalibration.CommandResponse.Status status = (GDIHandCalibration.CommandResponse.Status) r14;
            GDIHandCalibration.CommandResponse.Status status2 = GDIHandCalibration.CommandResponse.Status.SUCCESS;
            f fVar = this.f36633b;
            q03.c cVar = this.f36632a;
            if (status == status2) {
                ((z03.c.a) cVar).a();
                b bVar = b.None;
                a aVar = f.f36613h;
                fVar.d(bVar);
                xy2.b.D("HandAlignmentSuccess", fVar.f36616b);
                return;
            }
            ((z03.c.a) cVar).c(new IllegalStateException("Save failed: " + status));
            b bVar2 = b.None;
            a aVar2 = f.f36613h;
            fVar.d(bVar2);
            xy2.b.D("HandAlignmentError", fVar.f36616b);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.handalignment.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/f$f", "Lcom/garmin/android/apps/connectmobile/handalignment/b$a;", "Lcom/garmin/proto/generated/GDIHandCalibration$CommandResponse$Status;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0650f implements com.garmin.android.apps.connectmobile.handalignment.b.a<GDIHandCalibration.CommandResponse.Status> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s<Boolean> f36634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f36635b;

        public C0650f(s<Boolean> sVar, f fVar) {
            this.f36634a = sVar;
            this.f36635b = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void a(Exception exc) {
            ((e13.a.C1312a) this.f36634a).a(exc);
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void b(Enum r14) {
            GDIHandCalibration.CommandResponse.Status status = (GDIHandCalibration.CommandResponse.Status) r14;
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.a(a2.GENERAL, "startCamera: " + status);
            GDIHandCalibration.CommandResponse.Status status2 = GDIHandCalibration.CommandResponse.Status.SUCCESS;
            f fVar = this.f36635b;
            s<Boolean> sVar = this.f36634a;
            if (status == status2) {
                ((e13.a.C1312a) sVar).c(Boolean.TRUE);
                b bVar = b.Camera;
                a aVar2 = f.f36613h;
                fVar.d(bVar);
                return;
            }
            ((e13.a.C1312a) sVar).c(Boolean.FALSE);
            b bVar2 = b.None;
            a aVar3 = f.f36613h;
            fVar.d(bVar2);
            xy2.b.D("HandAlignmentError", fVar.f36616b);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/f$g", "Lcom/garmin/android/apps/connectmobile/handalignment/b$a;", "Lcom/garmin/proto/generated/GDIHandCalibration$CommandResponse$Status;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements com.garmin.android.apps.connectmobile.handalignment.b.a<GDIHandCalibration.CommandResponse.Status> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s<Boolean> f36636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f36637b;

        public g(s<Boolean> sVar, f fVar) {
            this.f36636a = sVar;
            this.f36637b = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void a(Exception exc) {
            ((e13.a.C1312a) this.f36636a).a(exc);
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void b(Enum r14) {
            GDIHandCalibration.CommandResponse.Status status = (GDIHandCalibration.CommandResponse.Status) r14;
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.a(a2.GENERAL, "startManual: " + status);
            GDIHandCalibration.CommandResponse.Status status2 = GDIHandCalibration.CommandResponse.Status.SUCCESS;
            f fVar = this.f36637b;
            s<Boolean> sVar = this.f36636a;
            if (status == status2) {
                ((e13.a.C1312a) sVar).c(Boolean.TRUE);
                b bVar = b.Manual;
                a aVar2 = f.f36613h;
                fVar.d(bVar);
                return;
            }
            ((e13.a.C1312a) sVar).c(Boolean.FALSE);
            b bVar2 = b.None;
            a aVar3 = f.f36613h;
            fVar.d(bVar2);
            xy2.b.D("HandAlignmentError", fVar.f36616b);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/f$h", "Lcom/garmin/android/apps/connectmobile/handalignment/b$a;", "Lcom/garmin/proto/generated/GDIHandCalibration$StepResponse$Status;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements com.garmin.android.apps.connectmobile.handalignment.b.a<GDIHandCalibration.StepResponse.Status> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s<Boolean> f36638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f36639b;

        public h(s<Boolean> sVar, f fVar) {
            this.f36638a = sVar;
            this.f36639b = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void a(Exception exc) {
            ((e13.a.C1312a) this.f36638a).a(exc);
        }

        @Override // com.garmin.android.apps.connectmobile.handalignment.b.a
        public final void b(Enum r14) {
            GDIHandCalibration.StepResponse.Status status = (GDIHandCalibration.StepResponse.Status) r14;
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.a(a2.GENERAL, "step: " + status);
            GDIHandCalibration.StepResponse.Status status2 = GDIHandCalibration.StepResponse.Status.SUCCESS;
            f fVar = this.f36639b;
            s<Boolean> sVar = this.f36638a;
            if (status == status2) {
                ((e13.a.C1312a) sVar).c(Boolean.TRUE);
                b bVar = b.Manual;
                a aVar2 = f.f36613h;
                fVar.d(bVar);
                return;
            }
            ((e13.a.C1312a) sVar).c(Boolean.FALSE);
            b bVar2 = b.Manual;
            a aVar3 = f.f36613h;
            fVar.d(bVar2);
            xy2.b.D("HandAlignmentError", fVar.f36616b);
        }
    }

    private f(long j8, String str, boolean z14) {
        this.f36615a = j8;
        this.f36616b = str;
        this.f36617c = z14;
        this.f36618d = b.None;
        this.f36619e = new Handler();
        this.f36620f = new eh2.b(this, 2);
        this.f36621g = new m13.a<>();
    }

    public final q03.b a() {
        if (this.f36618d == b.None) {
            z03.f fVar = z03.f.f200765a;
            fVar.getClass();
            return fVar;
        }
        q qVar = new q(this, 1);
        int i14 = w03.b.f181178a;
        z03.c cVar = new z03.c(qVar);
        q03.q qVar2 = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar2, "scheduler is null");
        z03.q qVar3 = new z03.q(cVar, 3L, timeUnit, qVar2, null);
        n nVar = new n(new r(this, 1), 4);
        w03.a.d dVar = w03.a.f181172c;
        w03.a.c cVar2 = w03.a.f181171b;
        return qVar3.f(dVar, nVar, cVar2, cVar2, cVar2, cVar2);
    }

    public final q03.r<Boolean> b(final float f14, final float f15) {
        if (this.f36618d != b.Camera) {
            return q03.r.f(Boolean.FALSE);
        }
        u uVar = new u() { // from class: en0.s
            @Override // q03.u
            public final void c(e13.a.C1312a c1312a) {
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                com.garmin.android.apps.connectmobile.handalignment.b bVar = com.garmin.android.apps.connectmobile.handalignment.b.f36607a;
                com.garmin.android.apps.connectmobile.handalignment.f fVar = this.f64719a;
                long j8 = fVar.f36615a;
                float f16 = f14;
                float f17 = f15;
                com.garmin.android.apps.connectmobile.handalignment.f.d dVar = new com.garmin.android.apps.connectmobile.handalignment.f.d(f16, f17, c1312a, fVar);
                bVar.getClass();
                wm2.a aVarA = com.garmin.android.apps.connectmobile.handalignment.b.a(j8);
                if (aVarA != null) {
                    GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder.getClass();
                    GDIHandCalibration.HandCalibrationService.Builder builderNewBuilder2 = GDIHandCalibration.HandCalibrationService.newBuilder();
                    GDIHandCalibration.RotateRequest.Builder builderNewBuilder3 = GDIHandCalibration.RotateRequest.newBuilder();
                    builderNewBuilder3.setHrDegrees(f16);
                    builderNewBuilder3.setMinDegrees(f17);
                    builderNewBuilder2.setRotateRequest(builderNewBuilder3.build());
                    GDIHandCalibration.HandCalibrationService handCalibrationServiceBuild = builderNewBuilder2.build();
                    handCalibrationServiceBuild.getClass();
                    builderNewBuilder.setExtension(GDIHandCalibrationExtension.handCalibrationService, handCalibrationServiceBuild);
                    GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                    smartBuild.getClass();
                    aVarA.initiateRequest(smartBuild, j8, new com.garmin.android.apps.connectmobile.handalignment.c(dVar));
                }
                m13.a<GDIHandCalibration.RotateNotification.Status> aVar2 = fVar.f36621g;
                aVar2.getClass();
                d13.g gVar = new d13.g(aVar2, 0L, null);
                q03.q qVar = l13.a.f108326a;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                w03.b.a(timeUnit, "unit is null");
                w03.b.a(qVar, "scheduler is null");
                new t(gVar, 3L, timeUnit, qVar, null).h(new n(new e52.b(2, c1312a, fVar), 8), new n(new e70.a(13), 9));
            }
        };
        int i14 = w03.b.f181178a;
        e13.a aVar = new e13.a(uVar);
        q03.q qVar = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar, "scheduler is null");
        return new e13.e(new t(aVar, 3L, timeUnit, qVar, null), new n(new r(this, 3), 6));
    }

    public final q03.b c() {
        if (this.f36618d == b.None) {
            return q03.b.g(new IllegalStateException("Hand alignment has not started."));
        }
        q qVar = new q(this, 2);
        int i14 = w03.b.f181178a;
        z03.c cVar = new z03.c(qVar);
        q03.q qVar2 = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar2, "scheduler is null");
        z03.q qVar3 = new z03.q(cVar, 3L, timeUnit, qVar2, null);
        n nVar = new n(new r(this, 2), 5);
        w03.a.d dVar = w03.a.f181172c;
        w03.a.c cVar2 = w03.a.f181171b;
        return qVar3.f(dVar, nVar, cVar2, cVar2, cVar2, cVar2);
    }

    public final void d(b bVar) {
        this.f36618d = bVar;
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.a(a2.GENERAL, "onHandAlignmentCommandSent: mode = " + bVar);
        if (this.f36617c) {
            Handler handler = this.f36619e;
            eh2.b bVar2 = this.f36620f;
            handler.removeCallbacks(bVar2);
            if (this.f36618d != b.None) {
                handler.postDelayed(bVar2, 25000L);
            }
        }
    }

    public final q03.r<Boolean> e() {
        if (this.f36618d == b.Camera) {
            return q03.r.f(Boolean.TRUE);
        }
        q qVar = new q(this, 3);
        int i14 = w03.b.f181178a;
        e13.a aVar = new e13.a(qVar);
        q03.q qVar2 = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar2, "scheduler is null");
        return new e13.e(new t(aVar, 3L, timeUnit, qVar2, null), new n(new r(this, 5), 10));
    }

    public final q03.r<Boolean> f() {
        if (this.f36618d == b.Manual) {
            return q03.r.f(Boolean.TRUE);
        }
        q qVar = new q(this, 0);
        int i14 = w03.b.f181178a;
        e13.a aVar = new e13.a(qVar);
        q03.q qVar2 = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar2, "scheduler is null");
        return new e13.e(new t(aVar, 3L, timeUnit, qVar2, null), new n(new r(this, 0), 3));
    }

    public final q03.r<Boolean> g(GDIHandCalibration.HandType handType, int i14) {
        handType.getClass();
        if (this.f36618d != b.Manual) {
            return q03.r.f(Boolean.FALSE);
        }
        androidx.media3.exoplayer.u uVar = new androidx.media3.exoplayer.u(this, handType, i14, 6);
        int i15 = w03.b.f181178a;
        e13.a aVar = new e13.a(uVar);
        q03.q qVar = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar, "scheduler is null");
        return new e13.e(new t(aVar, 3L, timeUnit, qVar, null), new n(new r(this, 4), 7));
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        f fVar = (f) f36614i.remove(Long.valueOf(hVar.f111673a.getF92746j()));
        if (fVar != null) {
            b bVar = this.f36618d;
            b bVar2 = b.None;
            if (bVar != bVar2) {
                d(bVar2);
                xy2.b.D("HandAlignmentError", this.f36616b);
            }
            da2.d.b().f58886a.i(fVar);
        }
    }

    public final String toString() {
        return a0.f(this.f36615a, "WatchHandController (", ")");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/f$a;", "", "<init>", "()V", "", "KEEP_ALIVE_INTERVAL", "J", "HAND_ALIGNMENT_COMMAND_TIMEOUT", "", "Lcom/garmin/android/apps/connectmobile/handalignment/f;", "instances", "Ljava/util/Map;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static f a(long j8, String str) {
            da2.b bVar = da2.d.b().f58886a.f111646e;
            bVar.getClass();
            boolean zC = zf.b.C(bVar, j8, SupportedCapability.HAND_CALIBRATION_IMG_DETECT);
            LinkedHashMap linkedHashMap = f.f36614i;
            f fVar = (f) linkedHashMap.get(Long.valueOf(j8));
            if (fVar != null) {
                return fVar;
            }
            f fVar2 = new f(j8, str, zC, null);
            da2.d.b().f58886a.b(fVar2);
            linkedHashMap.put(Long.valueOf(j8), fVar2);
            return fVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ f(long j8, String str, boolean z14, j jVar) {
        this(j8, str, z14);
    }
}
