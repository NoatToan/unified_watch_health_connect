package qb1;

import android.text.TextUtils;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.n0;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.network.ServerResponseException;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import gw.k0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import o53.i0;
import o53.j0;
import o53.s0;
import okhttp3.internal.http.StatusLine;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lqb1/f;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "c", "d", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {
    public static final /* synthetic */ int D = 0;
    public boolean B;
    public final db1.e C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public op0.c f144065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DeviceSettingsDTO f144066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ww0.j f144067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DeviceSettingsDTO f144068l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<db1.m> f144071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public UserSettingsDTO f144072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DeviceSettingsDTO f144073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<bm2.c> f144074r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f144057a = o13.m.b(new q53.q(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f144058b = o13.m.b(new q53.q(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f144059c = o13.m.b(new q53.q(9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f144060d = o13.m.b(new q53.q(10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f144061e = o13.m.b(new q53.q(11));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f144062f = o13.m.b(new q53.q(12));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f144063g = o13.m.b(new q53.q(13));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f144064h = o13.m.b(new q42.d(this, 6));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<LocalDate> f144069m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f144070n = new LinkedHashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f144075t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f144076v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f144077w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f144078x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f144079y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f144080z = true;
    public boolean A = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqb1/f$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lo53/r;", "deviceSettingCall", "<init>", "(Lqb1/f;Lo53/r;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<DeviceSettingsDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<DeviceSettingsDTO> f144081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DeviceSettingsDTO f144082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f144083c;

        public b(f fVar, o53.r<DeviceSettingsDTO> rVar) {
            rVar.getClass();
            this.f144083c = fVar;
            this.f144081a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f144083c.f144077w = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<DeviceSettingsDTO> rVar = this.f144081a;
            if (cVar == cVar2) {
                rVar.p(this.f144082b);
            } else {
                rVar.O(new Throwable());
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, DeviceSettingsDTO deviceSettingsDTO) {
            DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
            eVar.getClass();
            deviceSettingsDTO2.getClass();
            this.f144082b = deviceSettingsDTO2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqb1/f$c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "Lo53/r;", "mGetSettingsCall", "<init>", "(Lqb1/f;Lo53/r;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<UserSettingsDTO> f144084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UserSettingsDTO f144085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f144086c;

        public c(f fVar, o53.r<UserSettingsDTO> rVar) {
            rVar.getClass();
            this.f144086c = fVar;
            this.f144084a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f144086c.f144076v = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<UserSettingsDTO> rVar = this.f144084a;
            if (cVar == cVar2) {
                rVar.p(this.f144085b);
            } else {
                rVar.O(new Throwable());
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, UserSettingsDTO userSettingsDTO) {
            UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
            eVar.getClass();
            userSettingsDTO2.getClass();
            this.f144085b = userSettingsDTO2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqb1/f$d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "saveSettingsCall", "<init>", "(Lqb1/f;Lo53/r;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<Unit> f144087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f144088b;

        public d(f fVar, o53.r<Unit> rVar) {
            rVar.getClass();
            this.f144088b = fVar;
            this.f144087a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f144088b.f144079y = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<Unit> rVar = this.f144087a;
            if (cVar == cVar2) {
                rVar.p(Unit.INSTANCE);
            } else {
                rVar.O(new Throwable());
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Unit unit) {
            eVar.getClass();
            unit.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$postInitialSetupData$1", f = "PregnancySetupViewModel.kt", l = {300, 306, 313, 314, 315}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f144089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f144090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0 f144091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o13.p f144092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o13.p f144093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f144094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f144095g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$postInitialSetupData$1$1", f = "PregnancySetupViewModel.kt", l = {StatusLine.HTTP_PERM_REDIRECT}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f144097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f144098b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Long f144099c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, Long l14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f144098b = fVar;
                this.f144099c = l14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f144098b, this.f144099c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f144097a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                long jLongValue = this.f144099c.longValue();
                this.f144097a = 1;
                Serializable serializableE4 = f.E4(this.f144098b, jLongValue, this);
                return serializableE4 == aVar ? aVar : serializableE4;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lc83/a0;", "Ldb1/f;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$postInitialSetupData$1$pregnancySetupTask$1", f = "PregnancySetupViewModel.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends c83.a0<db1.f>, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f144100a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f144101b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f144101b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f144101b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends c83.a0<db1.f>, ? extends Throwable>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f144100a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f144100a = 1;
                    Serializable serializableH4 = f.H4(this.f144101b, this);
                    return serializableH4 == aVar ? aVar : serializableH4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$postInitialSetupData$1$updateMoveAlertsTask$1", f = "PregnancySetupViewModel.kt", l = {302}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f144102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f144103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(f fVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f144103b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f144103b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f144102a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f144102a = 1;
                    Serializable serializableF4 = f.F4(this.f144103b, this);
                    return serializableF4 == aVar ? aVar : serializableF4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = f.this.new e(dVar);
            eVar.f144095g = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:101:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:104:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:109:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:111:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:112:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:116:0x020d  */
        /* JADX WARN: Code duplicated, block: B:129:0x0228  */
        /* JADX WARN: Code duplicated, block: B:133:0x0240  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00da A[PHI: r3 r6 r12
          0x00da: PHI (r3v18 java.lang.Object) = (r3v14 java.lang.Object), (r3v29 java.lang.Object) binds: [B:35:0x00d7, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00da: PHI (r6v8 o53.i0) = (r6v3 o53.i0), (r6v25 o53.i0) binds: [B:35:0x00d7, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00da: PHI (r12v11 o53.i0) = (r12v7 o53.i0), (r12v21 o53.i0) binds: [B:35:0x00d7, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ef A[PHI: r3 r5 r6
          0x00ef: PHI (r3v20 o13.p) = (r3v19 o13.p), (r3v30 o13.p) binds: [B:38:0x00ec, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]
          0x00ef: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v14 java.lang.Object) binds: [B:38:0x00ec, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]
          0x00ef: PHI (r6v9 o53.i0) = (r6v8 o53.i0), (r6v26 o53.i0) binds: [B:38:0x00ec, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:45:0x0108  */
        /* JADX WARN: Code duplicated, block: B:47:0x010f  */
        /* JADX WARN: Code duplicated, block: B:50:0x015f  */
        /* JADX WARN: Code duplicated, block: B:55:0x016d  */
        /* JADX WARN: Code duplicated, block: B:58:0x0172  */
        /* JADX WARN: Code duplicated, block: B:60:0x0176  */
        /* JADX WARN: Code duplicated, block: B:62:0x0189  */
        /* JADX WARN: Code duplicated, block: B:63:0x018b  */
        /* JADX WARN: Code duplicated, block: B:65:0x018e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:66:0x0190  */
        /* JADX WARN: Code duplicated, block: B:67:0x0195  */
        /* JADX WARN: Code duplicated, block: B:70:0x0199  */
        /* JADX WARN: Code duplicated, block: B:71:0x019b  */
        /* JADX WARN: Code duplicated, block: B:73:0x019e  */
        /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:79:0x01af  */
        /* JADX WARN: Code duplicated, block: B:82:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:85:0x01c0 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:98:0x01df  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objG4;
            j0 j0VarJ;
            i0 i0VarJ;
            Object objY4;
            j0 j0Var;
            i0 i0Var;
            i0 i0VarJ2;
            Object objAwait;
            Long l14;
            o13.p pVar;
            Object objAwait2;
            o13.p pVar2;
            o13.p pVar3;
            Object objAwait3;
            o13.p pVar4;
            i0 i0Var2;
            qb1.a aVar;
            c83.a0 a0Var;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z24;
            c83.a0 a0Var2;
            Integer updateHydrationGoalResponseCode;
            boolean z25;
            Integer updateWeightGoalResponseCode;
            boolean z26;
            db1.f fVar;
            db1.p setupStepErrorResponseMap;
            db1.f fVar2;
            db1.p setupStepErrorResponseMap2;
            Throwable th3;
            o53.b0 b0Var = (o53.b0) this.f144095g;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144094f;
            f fVar3 = f.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = f.D;
                fVar3.J4().j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                this.f144095g = b0Var;
                this.f144094f = 1;
                objG4 = f.G4(fVar3, this);
                if (objG4 != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objG4 = obj;
            } else {
                if (i14 == 2) {
                    i0Var = this.f144090b;
                    j0 j0Var2 = this.f144089a;
                    o13.r.b(obj);
                    j0Var = j0Var2;
                    objY4 = obj;
                    l14 = (Long) objY4;
                    if (l14 != null) {
                        i0VarJ2 = ge1.b.j(b0Var, null, null, new a(fVar3, l14, null), 3);
                        j0 j0Var3 = j0Var;
                        i0VarJ = i0Var;
                        j0VarJ = j0Var3;
                    } else {
                        j0 j0Var4 = j0Var;
                        i0VarJ = i0Var;
                        j0VarJ = j0Var4;
                        i0VarJ2 = null;
                    }
                    this.f144095g = b0Var;
                    this.f144089a = null;
                    this.f144090b = i0VarJ;
                    this.f144091c = i0VarJ2;
                    this.f144094f = 3;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar2) {
                        pVar = (o13.p) objAwait;
                        this.f144095g = b0Var;
                        this.f144089a = null;
                        this.f144090b = null;
                        this.f144091c = i0VarJ2;
                        this.f144092d = pVar;
                        this.f144094f = 4;
                        objAwait2 = i0VarJ.await(this);
                        if (objAwait2 != aVar2) {
                            pVar2 = (o13.p) objAwait2;
                            if (i0VarJ2 != null) {
                                this.f144095g = b0Var;
                                this.f144089a = null;
                                this.f144090b = null;
                                this.f144091c = i0VarJ2;
                                this.f144092d = pVar;
                                this.f144093e = pVar2;
                                this.f144094f = 5;
                                objAwait3 = i0VarJ2.await(this);
                                if (objAwait3 != aVar2) {
                                    pVar4 = pVar;
                                    i0Var2 = i0VarJ2;
                                }
                            } else {
                                pVar3 = null;
                            }
                            int i16 = f.D;
                            fVar3.getClass();
                            a2 a2Var = a2.PREGNANCY;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var, "PregnancySetupViewModel", "buildPregnancySetUpUIModel() pregnancyResult: " + pVar + ", updateMoveAlertsResult: " + pVar2 + ", weightGainsGoalTask: " + i0VarJ2 + ", weightGainsGoalResult: " + pVar3);
                            aVar = new qb1.a(false, false, false, false, false, false, 63, null);
                            a0Var = (c83.a0) pVar.f128594a;
                            z14 = false;
                            if (a0Var == null) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (pVar2.f128594a == 0) {
                                f12.l.f68084a.getClass();
                                if (f12.l.a.a().s4() == -1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            } else {
                                f12.l.f68084a.getClass();
                                if (f12.l.a.a().s4() == -1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            }
                            if (i0VarJ2 == null) {
                                z17 = true;
                            } else {
                                if (pVar3 != null) {
                                    th3 = (Throwable) pVar3.f128595b;
                                } else {
                                    th3 = null;
                                }
                                if (th3 == null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            if (a0Var == null) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            aVar.f144033e = z18;
                            if (a0Var == null) {
                                z19 = false;
                            } else {
                                z19 = false;
                            }
                            aVar.f144034f = z19;
                            if (!z15) {
                                z24 = true;
                            } else {
                                z24 = true;
                            }
                            aVar.f144030b = z24;
                            if (!z24) {
                                if (a0Var != null) {
                                    updateHydrationGoalResponseCode = null;
                                } else {
                                    updateHydrationGoalResponseCode = null;
                                }
                                if (updateHydrationGoalResponseCode != null) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                aVar.f144031c = z25;
                                if (a0Var != null) {
                                    updateWeightGoalResponseCode = null;
                                } else {
                                    updateWeightGoalResponseCode = null;
                                }
                                if (updateWeightGoalResponseCode != null) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                aVar.f144032d = z26;
                            }
                            i2.a.k(a2Var, "PregnancySetupViewModel", String.valueOf(aVar));
                            if (!aVar.f144030b) {
                                z14 = true;
                            }
                            a0Var2 = (c83.a0) pVar.f128594a;
                            if (a0Var2 == null) {
                                fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                            } else {
                                fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar2;
                }
                if (i14 == 3) {
                    i0 i0Var3 = this.f144091c;
                    i0 i0Var4 = this.f144090b;
                    o13.r.b(obj);
                    i0VarJ = i0Var4;
                    i0VarJ2 = i0Var3;
                    objAwait = obj;
                    pVar = (o13.p) objAwait;
                    this.f144095g = b0Var;
                    this.f144089a = null;
                    this.f144090b = null;
                    this.f144091c = i0VarJ2;
                    this.f144092d = pVar;
                    this.f144094f = 4;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar2) {
                        pVar2 = (o13.p) objAwait2;
                        if (i0VarJ2 != null) {
                            this.f144095g = b0Var;
                            this.f144089a = null;
                            this.f144090b = null;
                            this.f144091c = i0VarJ2;
                            this.f144092d = pVar;
                            this.f144093e = pVar2;
                            this.f144094f = 5;
                            objAwait3 = i0VarJ2.await(this);
                            if (objAwait3 != aVar2) {
                                pVar4 = pVar;
                                i0Var2 = i0VarJ2;
                            }
                        } else {
                            pVar3 = null;
                        }
                        int i17 = f.D;
                        fVar3.getClass();
                        a2 a2Var2 = a2.PREGNANCY;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var2, "PregnancySetupViewModel", "buildPregnancySetUpUIModel() pregnancyResult: " + pVar + ", updateMoveAlertsResult: " + pVar2 + ", weightGainsGoalTask: " + i0VarJ2 + ", weightGainsGoalResult: " + pVar3);
                        aVar = new qb1.a(false, false, false, false, false, false, 63, null);
                        a0Var = (c83.a0) pVar.f128594a;
                        z14 = false;
                        if (a0Var == null) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (pVar2.f128594a == 0) {
                            f12.l.f68084a.getClass();
                            if (f12.l.a.a().s4() == -1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } else {
                            f12.l.f68084a.getClass();
                            if (f12.l.a.a().s4() == -1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                        if (i0VarJ2 == null) {
                            z17 = true;
                        } else {
                            if (pVar3 != null) {
                                th3 = (Throwable) pVar3.f128595b;
                            } else {
                                th3 = null;
                            }
                            if (th3 == null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        if (a0Var == null) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        aVar.f144033e = z18;
                        if (a0Var == null) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        aVar.f144034f = z19;
                        if (!z15) {
                            z24 = true;
                        } else {
                            z24 = true;
                        }
                        aVar.f144030b = z24;
                        if (!z24) {
                            if (a0Var != null) {
                                updateHydrationGoalResponseCode = null;
                            } else {
                                updateHydrationGoalResponseCode = null;
                            }
                            if (updateHydrationGoalResponseCode != null) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            aVar.f144031c = z25;
                            if (a0Var != null) {
                                updateWeightGoalResponseCode = null;
                            } else {
                                updateWeightGoalResponseCode = null;
                            }
                            if (updateWeightGoalResponseCode != null) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            aVar.f144032d = z26;
                        }
                        i2.a.k(a2Var2, "PregnancySetupViewModel", String.valueOf(aVar));
                        if (!aVar.f144030b) {
                            z14 = true;
                        }
                        a0Var2 = (c83.a0) pVar.f128594a;
                        if (a0Var2 == null) {
                            fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                        } else {
                            fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                }
                if (i14 == 4) {
                    pVar = this.f144092d;
                    i0 i0Var5 = this.f144091c;
                    o13.r.b(obj);
                    i0VarJ2 = i0Var5;
                    objAwait2 = obj;
                    pVar2 = (o13.p) objAwait2;
                    if (i0VarJ2 != null) {
                        this.f144095g = b0Var;
                        this.f144089a = null;
                        this.f144090b = null;
                        this.f144091c = i0VarJ2;
                        this.f144092d = pVar;
                        this.f144093e = pVar2;
                        this.f144094f = 5;
                        objAwait3 = i0VarJ2.await(this);
                        if (objAwait3 != aVar2) {
                            pVar4 = pVar;
                            i0Var2 = i0VarJ2;
                        }
                        return aVar2;
                    }
                    pVar3 = null;
                    int i18 = f.D;
                    fVar3.getClass();
                    a2 a2Var3 = a2.PREGNANCY;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var3, "PregnancySetupViewModel", "buildPregnancySetUpUIModel() pregnancyResult: " + pVar + ", updateMoveAlertsResult: " + pVar2 + ", weightGainsGoalTask: " + i0VarJ2 + ", weightGainsGoalResult: " + pVar3);
                    aVar = new qb1.a(false, false, false, false, false, false, 63, null);
                    a0Var = (c83.a0) pVar.f128594a;
                    z14 = false;
                    if (a0Var == null && a0Var.f25745a.isSuccessful() && pVar.f128595b == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (pVar2.f128594a == 0 && pVar2.f128595b == 0) {
                        z16 = true;
                    } else {
                        f12.l.f68084a.getClass();
                        if (f12.l.a.a().s4() == -1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    if (i0VarJ2 == null) {
                        z17 = true;
                    } else {
                        if (pVar3 != null) {
                            th3 = (Throwable) pVar3.f128595b;
                        } else {
                            th3 = null;
                        }
                        if (th3 == null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    }
                    if (a0Var == null && a0Var.f25745a.code() == 409) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    aVar.f144033e = z18;
                    if (a0Var == null && a0Var.f25745a.code() == 412) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    aVar.f144034f = z19;
                    if (!z15 && z16 && z17) {
                        z24 = false;
                    } else {
                        z24 = true;
                    }
                    aVar.f144030b = z24;
                    if (!z24) {
                        if (a0Var != null || (fVar2 = (db1.f) a0Var.f25746b) == null || (setupStepErrorResponseMap2 = fVar2.getSetupStepErrorResponseMap()) == null) {
                            updateHydrationGoalResponseCode = null;
                        } else {
                            updateHydrationGoalResponseCode = setupStepErrorResponseMap2.getUpdateHydrationGoalResponseCode();
                        }
                        if (updateHydrationGoalResponseCode != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        aVar.f144031c = z25;
                        if (a0Var != null || (fVar = (db1.f) a0Var.f25746b) == null || (setupStepErrorResponseMap = fVar.getSetupStepErrorResponseMap()) == null) {
                            updateWeightGoalResponseCode = null;
                        } else {
                            updateWeightGoalResponseCode = setupStepErrorResponseMap.getUpdateWeightGoalResponseCode();
                        }
                        if (updateWeightGoalResponseCode != null) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        aVar.f144032d = z26;
                    }
                    i2.a.k(a2Var3, "PregnancySetupViewModel", String.valueOf(aVar));
                    if (!aVar.f144030b && !aVar.f144031c && !aVar.f144032d && !aVar.f144029a && !aVar.f144033e && !aVar.f144034f) {
                        z14 = true;
                    }
                    a0Var2 = (c83.a0) pVar.f128594a;
                    if (a0Var2 == null && a0Var2.f25745a.isSuccessful() && z14) {
                        fVar3.J4().j(fw.m.a.g(fw.m.f73767e, null, 3));
                    } else {
                        fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.p pVar5 = this.f144093e;
                pVar4 = this.f144092d;
                i0Var2 = this.f144091c;
                o13.r.b(obj);
                pVar2 = pVar5;
                objAwait3 = obj;
            }
            pVar3 = (o13.p) objAwait3;
            i0VarJ2 = i0Var2;
            pVar = pVar4;
            int i19 = f.D;
            fVar3.getClass();
            a2 a2Var4 = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.k(a2Var4, "PregnancySetupViewModel", "buildPregnancySetUpUIModel() pregnancyResult: " + pVar + ", updateMoveAlertsResult: " + pVar2 + ", weightGainsGoalTask: " + i0VarJ2 + ", weightGainsGoalResult: " + pVar3);
            aVar = new qb1.a(false, false, false, false, false, false, 63, null);
            a0Var = (c83.a0) pVar.f128594a;
            z14 = false;
            if (a0Var == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (pVar2.f128594a == 0) {
                f12.l.f68084a.getClass();
                if (f12.l.a.a().s4() == -1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                f12.l.f68084a.getClass();
                if (f12.l.a.a().s4() == -1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            if (i0VarJ2 == null) {
                z17 = true;
            } else {
                if (pVar3 != null) {
                    th3 = (Throwable) pVar3.f128595b;
                } else {
                    th3 = null;
                }
                if (th3 == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            if (a0Var == null) {
                z18 = false;
            } else {
                z18 = false;
            }
            aVar.f144033e = z18;
            if (a0Var == null) {
                z19 = false;
            } else {
                z19 = false;
            }
            aVar.f144034f = z19;
            if (!z15) {
                z24 = true;
            } else {
                z24 = true;
            }
            aVar.f144030b = z24;
            if (!z24) {
                if (a0Var != null) {
                    updateHydrationGoalResponseCode = null;
                } else {
                    updateHydrationGoalResponseCode = null;
                }
                if (updateHydrationGoalResponseCode != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                aVar.f144031c = z25;
                if (a0Var != null) {
                    updateWeightGoalResponseCode = null;
                } else {
                    updateWeightGoalResponseCode = null;
                }
                if (updateWeightGoalResponseCode != null) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                aVar.f144032d = z26;
            }
            i2.a.k(a2Var4, "PregnancySetupViewModel", String.valueOf(aVar));
            if (!aVar.f144030b) {
                z14 = true;
            }
            a0Var2 = (c83.a0) pVar.f128594a;
            if (a0Var2 == null) {
                fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
            } else {
                fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
            }
            return Unit.INSTANCE;
            if (((Boolean) objG4).booleanValue()) {
                j0VarJ = ge1.b.j(b0Var, null, null, new b(fVar3, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new c(fVar3, null), 3);
                if (!fVar3.B || fVar3.f144073q == null) {
                    i0VarJ2 = null;
                    this.f144095g = b0Var;
                    this.f144089a = null;
                    this.f144090b = i0VarJ;
                    this.f144091c = i0VarJ2;
                    this.f144094f = 3;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar2) {
                        pVar = (o13.p) objAwait;
                        this.f144095g = b0Var;
                        this.f144089a = null;
                        this.f144090b = null;
                        this.f144091c = i0VarJ2;
                        this.f144092d = pVar;
                        this.f144094f = 4;
                        objAwait2 = i0VarJ.await(this);
                        if (objAwait2 != aVar2) {
                            pVar2 = (o13.p) objAwait2;
                            if (i0VarJ2 != null) {
                                this.f144095g = b0Var;
                                this.f144089a = null;
                                this.f144090b = null;
                                this.f144091c = i0VarJ2;
                                this.f144092d = pVar;
                                this.f144093e = pVar2;
                                this.f144094f = 5;
                                objAwait3 = i0VarJ2.await(this);
                                if (objAwait3 != aVar2) {
                                    pVar4 = pVar;
                                    i0Var2 = i0VarJ2;
                                    pVar3 = (o13.p) objAwait3;
                                    i0VarJ2 = i0Var2;
                                    pVar = pVar4;
                                }
                            } else {
                                pVar3 = null;
                            }
                            int i110 = f.D;
                            fVar3.getClass();
                            a2 a2Var5 = a2.PREGNANCY;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var5, "PregnancySetupViewModel", "buildPregnancySetUpUIModel() pregnancyResult: " + pVar + ", updateMoveAlertsResult: " + pVar2 + ", weightGainsGoalTask: " + i0VarJ2 + ", weightGainsGoalResult: " + pVar3);
                            aVar = new qb1.a(false, false, false, false, false, false, 63, null);
                            a0Var = (c83.a0) pVar.f128594a;
                            z14 = false;
                            if (a0Var == null) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (pVar2.f128594a == 0) {
                                f12.l.f68084a.getClass();
                                if (f12.l.a.a().s4() == -1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            } else {
                                f12.l.f68084a.getClass();
                                if (f12.l.a.a().s4() == -1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            }
                            if (i0VarJ2 == null) {
                                z17 = true;
                            } else {
                                if (pVar3 != null) {
                                    th3 = (Throwable) pVar3.f128595b;
                                } else {
                                    th3 = null;
                                }
                                if (th3 == null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            if (a0Var == null) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            aVar.f144033e = z18;
                            if (a0Var == null) {
                                z19 = false;
                            } else {
                                z19 = false;
                            }
                            aVar.f144034f = z19;
                            if (!z15) {
                                z24 = true;
                            } else {
                                z24 = true;
                            }
                            aVar.f144030b = z24;
                            if (!z24) {
                                if (a0Var != null) {
                                    updateHydrationGoalResponseCode = null;
                                } else {
                                    updateHydrationGoalResponseCode = null;
                                }
                                if (updateHydrationGoalResponseCode != null) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                aVar.f144031c = z25;
                                if (a0Var != null) {
                                    updateWeightGoalResponseCode = null;
                                } else {
                                    updateWeightGoalResponseCode = null;
                                }
                                if (updateWeightGoalResponseCode != null) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                aVar.f144032d = z26;
                            }
                            i2.a.k(a2Var5, "PregnancySetupViewModel", String.valueOf(aVar));
                            if (!aVar.f144030b) {
                                z14 = true;
                            }
                            a0Var2 = (c83.a0) pVar.f128594a;
                            if (a0Var2 == null) {
                                fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                            } else {
                                fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                            }
                        }
                    }
                } else {
                    this.f144095g = b0Var;
                    this.f144089a = j0VarJ;
                    this.f144090b = i0VarJ;
                    this.f144094f = 2;
                    objY4 = f.y4(fVar3, this);
                    if (objY4 != aVar2) {
                        j0Var = j0VarJ;
                        i0Var = i0VarJ;
                        l14 = (Long) objY4;
                        if (l14 != null) {
                            i0VarJ2 = ge1.b.j(b0Var, null, null, new a(fVar3, l14, null), 3);
                            j0 j0Var5 = j0Var;
                            i0VarJ = i0Var;
                            j0VarJ = j0Var5;
                        } else {
                            j0 j0Var6 = j0Var;
                            i0VarJ = i0Var;
                            j0VarJ = j0Var6;
                            i0VarJ2 = null;
                        }
                        this.f144095g = b0Var;
                        this.f144089a = null;
                        this.f144090b = i0VarJ;
                        this.f144091c = i0VarJ2;
                        this.f144094f = 3;
                        objAwait = j0VarJ.await(this);
                        if (objAwait != aVar2) {
                            pVar = (o13.p) objAwait;
                            this.f144095g = b0Var;
                            this.f144089a = null;
                            this.f144090b = null;
                            this.f144091c = i0VarJ2;
                            this.f144092d = pVar;
                            this.f144094f = 4;
                            objAwait2 = i0VarJ.await(this);
                            if (objAwait2 != aVar2) {
                                pVar2 = (o13.p) objAwait2;
                                if (i0VarJ2 != null) {
                                    this.f144095g = b0Var;
                                    this.f144089a = null;
                                    this.f144090b = null;
                                    this.f144091c = i0VarJ2;
                                    this.f144092d = pVar;
                                    this.f144093e = pVar2;
                                    this.f144094f = 5;
                                    objAwait3 = i0VarJ2.await(this);
                                    if (objAwait3 != aVar2) {
                                        pVar4 = pVar;
                                        i0Var2 = i0VarJ2;
                                        pVar3 = (o13.p) objAwait3;
                                        i0VarJ2 = i0Var2;
                                        pVar = pVar4;
                                    }
                                } else {
                                    pVar3 = null;
                                }
                                int i111 = f.D;
                                fVar3.getClass();
                                a2 a2Var6 = a2.PREGNANCY;
                                i2.f36769a.getClass();
                                i2.a.k(a2Var6, "PregnancySetupViewModel", "buildPregnancySetUpUIModel() pregnancyResult: " + pVar + ", updateMoveAlertsResult: " + pVar2 + ", weightGainsGoalTask: " + i0VarJ2 + ", weightGainsGoalResult: " + pVar3);
                                aVar = new qb1.a(false, false, false, false, false, false, 63, null);
                                a0Var = (c83.a0) pVar.f128594a;
                                z14 = false;
                                if (a0Var == null) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (pVar2.f128594a == 0) {
                                    f12.l.f68084a.getClass();
                                    if (f12.l.a.a().s4() == -1) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    f12.l.f68084a.getClass();
                                    if (f12.l.a.a().s4() == -1) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                }
                                if (i0VarJ2 == null) {
                                    z17 = true;
                                } else {
                                    if (pVar3 != null) {
                                        th3 = (Throwable) pVar3.f128595b;
                                    } else {
                                        th3 = null;
                                    }
                                    if (th3 == null) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                }
                                if (a0Var == null) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                aVar.f144033e = z18;
                                if (a0Var == null) {
                                    z19 = false;
                                } else {
                                    z19 = false;
                                }
                                aVar.f144034f = z19;
                                if (!z15) {
                                    z24 = true;
                                } else {
                                    z24 = true;
                                }
                                aVar.f144030b = z24;
                                if (!z24) {
                                    if (a0Var != null) {
                                        updateHydrationGoalResponseCode = null;
                                    } else {
                                        updateHydrationGoalResponseCode = null;
                                    }
                                    if (updateHydrationGoalResponseCode != null) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    aVar.f144031c = z25;
                                    if (a0Var != null) {
                                        updateWeightGoalResponseCode = null;
                                    } else {
                                        updateWeightGoalResponseCode = null;
                                    }
                                    if (updateWeightGoalResponseCode != null) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    aVar.f144032d = z26;
                                }
                                i2.a.k(a2Var6, "PregnancySetupViewModel", String.valueOf(aVar));
                                if (!aVar.f144030b) {
                                    z14 = true;
                                }
                                a0Var2 = (c83.a0) pVar.f128594a;
                                if (a0Var2 == null) {
                                    fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                                } else {
                                    fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar, 1));
                                }
                            }
                        }
                    }
                }
                return aVar2;
            }
            qb1.a aVar3 = new qb1.a(true, false, false, false, false, false, 62, null);
            a2 a2Var7 = a2.PREGNANCY;
            String strValueOf = String.valueOf(aVar3);
            i2.f36769a.getClass();
            i2.a.k(a2Var7, "PregnancySetupViewModel", strValueOf);
            int i24 = f.D;
            fVar3.J4().j(fw.m.a.b(fw.m.f73767e, new fw.l(), aVar3, 1));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        LocalDate localDate = null;
        String str = null;
        db1.b bVar = null;
        DateTime dateTime = null;
        this.C = new db1.e(Integer.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), localDate, str, bVar, new ArrayList(), new db1.u(false, null, null, null, 15, null), dateTime, 78, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable A4(f fVar, v13.c cVar) {
        k kVar;
        fVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f144119d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f144119d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(fVar, cVar);
            }
        } else {
            kVar = new k(fVar, cVar);
        }
        Object objC = kVar.f144117b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f144119d;
        op0.c cVar2 = null;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                cb1.b bVar = (cb1.b) KoinJavaComponent.get$default(cb1.b.class, null, null, 6, null);
                kVar.f144116a = fVar;
                kVar.f144119d = 1;
                objC = bVar.c(kVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = kVar.f144116a;
                o13.r.b(objC);
            }
            v2 v2Var = (v2) objC;
            fVar.getClass();
            if (v2Var instanceof v2.b) {
                cVar2 = (op0.c) ((v2.b) v2Var).f47386a;
                th = null;
                return new o13.p(cVar2, th);
            }
            if (v2Var instanceof v2.a) {
                throw new ServerResponseException(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable B4(f fVar, v13.c cVar) {
        l lVar;
        fVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f144122c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f144122c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(fVar, cVar);
            }
        } else {
            lVar = new l(fVar, cVar);
        }
        Object objF = lVar.f144120a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f144122c;
        ww0.j jVar = null;
        try {
            if (i15 == 0) {
                o13.r.b(objF);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                tb1.e.f163745a.getClass();
                String string = new LocalDate(Calendar.getInstance()).toString();
                string.getClass();
                lVar.f144122c = 1;
                bVar.getClass();
                objF = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.f(string, lVar);
                if (objF == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objF);
            }
            jVar = (ww0.j) ((c83.a0) objF).f25746b;
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return new o13.p(jVar, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
    public static final Serializable C4(f fVar, v13.c cVar) {
        m mVar;
        r0 r0Var;
        Object th3;
        fVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f144126d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f144126d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(fVar, cVar);
            }
        } else {
            mVar = new m(fVar, cVar);
        }
        Object obj = mVar.f144124b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f144126d;
        if (i15 == 0) {
            r0 r0VarS = wr.g.s(obj);
            try {
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                mVar.f144123a = r0VarS;
                mVar.f144126d = 1;
                bVar.getClass();
                Object objI = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.i(mVar);
                if (objI == aVar) {
                    return aVar;
                }
                r0Var = r0VarS;
                obj = objI;
            } catch (Throwable th4) {
                r0Var = r0VarS;
                th3 = th4;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = mVar.f144123a;
            try {
                o13.r.b(obj);
            } catch (Throwable th5) {
                th3 = th5;
            }
        }
        List list = (List) ((c83.a0) obj).f25746b;
        if (list != null) {
            ?? Z = h0.Z(list);
            i52.a aVar2 = i52.a.f91796a;
            boolean z14 = !list.isEmpty();
            aVar2.getClass();
            i52.a.s(z14);
            r0Var.f105810a = Z;
        }
        th3 = null;
        return new o13.p(r0Var.f105810a, th3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable D4(f fVar, v13.c cVar) {
        p pVar;
        fVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f144166c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f144166c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(fVar, cVar);
            }
        } else {
            pVar = new p(fVar, cVar);
        }
        Object objC = pVar.f144164a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f144166c;
        UserSettingsDTO userSettingsDTO = null;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                o53.s sVarB = gl.b.b();
                fVar.f144076v = ((cb1.b) KoinJavaComponent.get$default(cb1.b.class, null, null, 6, null)).d(new c(fVar, sVarB));
                pVar.f144166c = 1;
                objC = sVarB.C(pVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            th = null;
            userSettingsDTO = (UserSettingsDTO) objC;
        } catch (Throwable th3) {
            th = th3;
        }
        return new o13.p(userSettingsDTO, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable E4(f fVar, long j8, v13.c cVar) {
        r rVar;
        fVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f144172c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f144172c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(fVar, cVar);
            }
        } else {
            rVar = new r(fVar, cVar);
        }
        Object objC = rVar.f144170a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f144172c;
        DeviceSettingsDTO deviceSettingsDTO = null;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                DeviceSettingsDTO deviceSettingsDTO2 = fVar.f144073q;
                JSONObject jSONObjectY1 = deviceSettingsDTO2 != null ? deviceSettingsDTO2.Y1() : null;
                DeviceSettingsDTO deviceSettingsDTO3 = fVar.f144066j;
                String strA = n0.a(jSONObjectY1, deviceSettingsDTO3 != null ? deviceSettingsDTO3.Y1() : null, null);
                if (strA != null) {
                    o53.s sVarB = gl.b.b();
                    cw.k kVar = (cw.k) fVar.f144057a.getValue();
                    b bVar = new b(fVar, sVarB);
                    kVar.getClass();
                    fVar.f144077w = com.garmin.android.library.backgroundtaskmanagement.c.d(new k0(j8, strA, kVar), bVar);
                    rVar.f144172c = 1;
                    objC = sVarB.C(rVar);
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    th = null;
                }
                return new o13.p(deviceSettingsDTO, th);
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
            th = null;
            deviceSettingsDTO = (DeviceSettingsDTO) objC;
        } catch (Throwable th3) {
            th = th3;
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancySetupViewModel", th);
        }
        return new o13.p(deviceSettingsDTO, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Serializable F4(f fVar, v13.c cVar) {
        t tVar;
        fVar.getClass();
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f144178c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f144178c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(fVar, cVar);
            }
        } else {
            tVar = new t(fVar, cVar);
        }
        Object objC = tVar.f144176a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f144178c;
        DeviceSettingsDTO deviceSettingsDTO = null;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                f12.l.f68084a.getClass();
                long jS4 = f12.l.a.a().s4();
                if (jS4 != -1) {
                    DeviceSettingsDTO deviceSettingsDTO2 = new DeviceSettingsDTO();
                    deviceSettingsDTO2.f33885m = new com.garmin.android.apps.connectmobile.devices.model.h(null, null, null, false, 0, false, 0, null, null, null, 0, null, null, 8191, null);
                    deviceSettingsDTO2.S1("activityTracking");
                    com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO2.f33885m;
                    if (hVar != null) {
                        hVar.F(Boolean.valueOf(fVar.f144080z));
                    }
                    String string = deviceSettingsDTO2.Y1().toString();
                    string.getClass();
                    o53.s sVarB = gl.b.b();
                    cw.k kVar = (cw.k) fVar.f144057a.getValue();
                    b bVar = new b(fVar, sVarB);
                    kVar.getClass();
                    fVar.f144078x = com.garmin.android.library.backgroundtaskmanagement.c.d(new k0(jS4, string, kVar), bVar);
                    tVar.f144178c = 1;
                    objC = sVarB.C(tVar);
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    th = null;
                }
                return new o13.p(deviceSettingsDTO, th);
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
            th = null;
            deviceSettingsDTO = (DeviceSettingsDTO) objC;
        } catch (Throwable th3) {
            th = th3;
        }
        return new o13.p(deviceSettingsDTO, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object G4(f fVar, v13.c cVar) {
        u uVar;
        wi1.j jVar;
        ww0.u uVar2;
        fVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f144181c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f144181c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(fVar, cVar);
            }
        } else {
            uVar = new u(fVar, cVar);
        }
        Object objL4 = uVar.f144179a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f144181c;
        boolean zBooleanValue = true;
        if (i15 == 0) {
            o13.r.b(objL4);
            UserSettingsDTO userSettingsDTO = fVar.f144072p;
            ww0.a menstrualCycleType = (userSettingsDTO == null || (uVar2 = userSettingsDTO.f43527e) == null) ? null : uVar2.getMenstrualCycleType();
            ww0.a aVar = ww0.a.PREGNANT;
            if (menstrualCycleType == aVar) {
                a2 a2Var = a2.PREGNANCY;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "PregnancySetupViewModel", "User already pregnant, no need to post cycle type");
            } else {
                a2 a2Var2 = a2.PREGNANCY;
                i2.f36769a.getClass();
                i2.a.k(a2Var2, "PregnancySetupViewModel", "Posting Cycle type = PREGNANT");
                UserSettingsDTO userSettingsDTO2 = fVar.f144072p;
                UserSettingsDTO userSettingsDTOC = userSettingsDTO2 != null ? userSettingsDTO2.C() : null;
                if (userSettingsDTOC != null) {
                    userSettingsDTOC.g0(aVar);
                }
                if (userSettingsDTOC != null) {
                    userSettingsDTOC.z0(true);
                }
                ww0.u uVar3 = userSettingsDTOC != null ? userSettingsDTOC.f43527e : null;
                if (uVar3 != null) {
                    Boolean bool = Boolean.TRUE;
                    uVar3.G(bool);
                    uVar3.C(bool);
                    Boolean bool2 = Boolean.FALSE;
                    uVar3.r(bool2);
                    uVar3.M(bool2);
                    uVar3.I(bool2);
                    uVar3.D(bool2);
                }
                if (fVar.A && userSettingsDTOC != null && (jVar = userSettingsDTOC.f43524b) != null) {
                    jVar.f185557v = c22.j0.b(DateTime.now(), "yyyy-MM-dd", null);
                }
                t3 t3Var = t3.f23255a;
                JSONObject jSONObjectT1 = userSettingsDTOC != null ? userSettingsDTOC.t1() : null;
                UserSettingsDTO userSettingsDTO3 = fVar.f144072p;
                JSONObject jSONObjectT2 = userSettingsDTO3 != null ? userSettingsDTO3.t1() : null;
                tb1.e.f163745a.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add("userMenstrualCycleSettings");
                arrayList.add("menstrualCycleType");
                arrayList.add("pregnancySetup");
                arrayList.add("physicalSymptomsTracking");
                arrayList.add("moodTracking");
                arrayList.add("dischargeTracking");
                arrayList.add("sexualActivityTracking");
                arrayList.add("sexDriveTracking");
                arrayList.add("ovulationDateTracking");
                t3Var.getClass();
                JSONObject jSONObjectC = t3.c(jSONObjectT1, jSONObjectT2, arrayList);
                uVar.f144181c = 1;
                objL4 = fVar.L4(userSettingsDTOC, jSONObjectC, uVar);
                if (objL4 == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objL4);
        o13.p pVar = (o13.p) objL4;
        zBooleanValue = pVar != null ? ((Boolean) pVar.f128594a).booleanValue() : false;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable H4(f fVar, v13.c cVar) {
        v vVar;
        r0 r0VarS;
        r0 r0Var;
        r0 r0Var2;
        T t7;
        db1.e eVar = fVar.C;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f144186e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f144186e = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(fVar, cVar);
            }
        } else {
            vVar = new v(fVar, cVar);
        }
        Object obj = vVar.f144184c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f144186e;
        Throwable th3 = null;
        if (i15 == 0) {
            r0VarS = wr.g.s(obj);
            try {
                LocalDate localDateA = eVar.getDueDate();
                if (localDateA != null) {
                    String string = new LocalDate(Calendar.getInstance()).toString();
                    string.getClass();
                    eVar.f(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getString(R.string.pregnancy_title) + StringUtils.SPACE + localDateA.getYear());
                    tb1.e.f163745a.getClass();
                    eVar.e(tb1.e.a.c());
                    com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                    vVar.f144182a = r0VarS;
                    vVar.f144183b = r0VarS;
                    vVar.f144186e = 1;
                    bVar.getClass();
                    Object objO = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.o(string, eVar, vVar);
                    if (objO == aVar) {
                        return aVar;
                    }
                    r0Var2 = r0VarS;
                    t7 = objO;
                    r0Var = r0Var2;
                }
            } catch (Throwable th4) {
                r0Var = r0VarS;
                th3 = th4;
                a2 a2Var = a2.PREGNANCY;
                i2.f36769a.getClass();
                i2.a.g(a2Var, "PregnancySetupViewModel", th3);
            }
            return new o13.p(r0VarS.f105810a, th3);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r0Var2 = vVar.f144183b;
        r0Var = vVar.f144182a;
        try {
            o13.r.b(obj);
            t7 = obj;
        } catch (Throwable th5) {
            th3 = th5;
            a2 a2Var2 = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var2, "PregnancySetupViewModel", th3);
        }
        r0Var2.f105810a = t7;
        r0VarS = r0Var;
        return new o13.p(r0VarS.f105810a, th3);
    }

    public static final ArrayList I4(f fVar, ArrayList arrayList, LocalDate localDate) {
        fVar.getClass();
        List<db1.n> listN0 = h0.N0(arrayList, new z());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (db1.n nVar : listN0) {
            DateTime dateTimeB = nVar.getDate();
            if (dateTimeB != null) {
                if (dateTimeB.toLocalDate().compareTo((ReadablePartial) localDate) > 0) {
                    arrayList3.add(nVar);
                } else {
                    arrayList2.add(nVar);
                }
            }
        }
        if (arrayList2.size() > 1) {
            p13.c0.u(arrayList2, new y());
        }
        if (arrayList3.size() > 1) {
            p13.c0.u(arrayList3, new x());
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    public static void N4(f fVar, Double d14, Double d15, int i14) {
        if ((i14 & 1) != 0) {
            d14 = null;
        }
        if ((i14 & 2) != 0) {
            d15 = null;
        }
        db1.u uVarC = fVar.C.getWeightGoalUserInputs();
        if (uVarC == null || !uVarC.getWeightGoalRecommendation()) {
            return;
        }
        if (d14 != null) {
            uVarC.k(d14);
        }
        if (d15 != null) {
            uVarC.h(d15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable x4(f fVar, v13.c cVar) {
        g gVar;
        ArrayList arrayList;
        bm2.c cVarD;
        fVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f144107d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f144107d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(fVar, cVar);
            }
        } else {
            gVar = new g(fVar, cVar);
        }
        Object obj = gVar.f144105b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f144107d;
        ArrayList arrayList2 = null;
        try {
            if (i15 == 0) {
                ArrayList arrayListX = v.h.x(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                gVar.f144104a = arrayListX;
                gVar.f144107d = 1;
                bVar.getClass();
                Object objC = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.c(gVar);
                if (objC == aVar) {
                    return aVar;
                }
                arrayList = arrayListX;
                obj = objC;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = gVar.f144104a;
                o13.r.b(obj);
            }
            String str = (String) ((c83.a0) obj).f25746b;
            if (TextUtils.isEmpty(str)) {
                th = null;
                arrayList2 = arrayList;
            } else {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList3 = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i16 = 0; i16 < length; i16++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i16);
                    ed0.a.f63825a.getClass();
                    tm2.a aVar2 = ed0.a.f63834j;
                    jSONObject.getClass();
                    aVar2.getClass();
                    try {
                        cVarD = bm2.c.d(jSONObject);
                    } catch (Exception unused) {
                        cVarD = null;
                    }
                    if (cVarD != null) {
                        arrayList3.add(cVarD);
                    }
                }
                arrayList2 = arrayList3;
                th = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return new o13.p(arrayList2, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(f fVar, v13.c cVar) {
        h hVar;
        r0 r0Var;
        fVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f144111d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f144111d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(fVar, cVar);
            }
        } else {
            hVar = new h(fVar, cVar);
        }
        Object obj = hVar.f144109b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f144111d;
        if (i15 == 0) {
            r0 r0VarS = wr.g.s(obj);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            i iVar = new i(r0VarS, null);
            hVar.f144108a = r0VarS;
            hVar.f144111d = 1;
            if (ge1.b.e0(bVar, iVar, hVar) == aVar) {
                return aVar;
            }
            r0Var = r0VarS;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = hVar.f144108a;
            o13.r.b(obj);
        }
        return r0Var.f105810a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable z4(f fVar, long j8, v13.c cVar) {
        j jVar;
        fVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f144115c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f144115c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(fVar, cVar);
            }
        } else {
            jVar = new j(fVar, cVar);
        }
        Object objC = jVar.f144113a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f144115c;
        DeviceSettingsDTO deviceSettingsDTO = null;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                o53.s sVarB = gl.b.b();
                cw.k kVar = (cw.k) fVar.f144057a.getValue();
                b bVar = new b(fVar, sVarB);
                kVar.getClass();
                fVar.f144077w = com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.m(j8, kVar), bVar);
                jVar.f144115c = 1;
                objC = sVarB.C(jVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            th = null;
            deviceSettingsDTO = (DeviceSettingsDTO) objC;
        } catch (Throwable th3) {
            th = th3;
        }
        return new o13.p(deviceSettingsDTO, th);
    }

    public final y0<fw.m<qb1.a>> J4() {
        return (y0) this.f144060d.getValue();
    }

    public final y0<fw.m<List<db1.n>>> K4() {
        return (y0) this.f144063g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable L4(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f144169c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f144169c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f144167a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f144169c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (jSONObject == null || userSettingsDTO == null) {
                    return null;
                }
                o53.s sVarB = gl.b.b();
                this.f144079y = ((cb1.b) KoinJavaComponent.get$default(cb1.b.class, null, null, 6, null)).a(userSettingsDTO, jSONObject, new d(this, sVarB));
                qVar.f144169c = 1;
                if (sVarB.C(qVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new o13.p(Boolean.TRUE, null);
        } catch (Throwable th3) {
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancySetupViewModel", th3);
            return new o13.p(Boolean.FALSE, th3);
        }
    }

    public final void M4() {
        ge1.b.T(v1.a(this), null, null, new e(null), 3);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        long j8 = this.f144075t;
        if (cVar.e(Long.valueOf(j8))) {
            cVar.a(j8);
        }
        if (cVar.e(Long.valueOf(this.f144076v))) {
            cVar.a(this.f144076v);
        }
        if (cVar.e(Long.valueOf(this.f144077w))) {
            cVar.a(this.f144077w);
        }
        if (cVar.e(Long.valueOf(this.f144078x))) {
            cVar.a(this.f144078x);
        }
        if (cVar.e(Long.valueOf(this.f144079y))) {
            cVar.a(this.f144079y);
        }
        super.onCleared();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqb1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
