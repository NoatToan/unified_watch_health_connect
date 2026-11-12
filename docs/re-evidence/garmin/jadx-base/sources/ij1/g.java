package ij1;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.j0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import j20.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lc.u0;
import o13.t;
import o13.u;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p92.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lij1/g;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f93833m = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f93837d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f93839f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f93841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f93842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f93843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f93844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f93845l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fj1.b f93834a = fj1.b.a.a(fj1.b.f71828c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ej1.b f93835b = ej1.b.WEARABLE_DEVICE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f93836c = o13.m.b(new i31.e(23));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f93838e = o13.m.b(new i31.e(27));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f93840g = o13.m.b(new i31.e(28));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93846a;

        static {
            int[] iArr = new int[ej1.b.values().length];
            try {
                iArr[ej1.b.WEARABLE_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f93846a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel$updatePrimaryWearable$1", f = "PrimaryDeviceViewModel.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93848b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f93850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f93851e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f93850d = j8;
            this.f93851e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = g.this.new c(this.f93850d, this.f93851e, dVar);
            cVar.f93848b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f93848b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93847a;
            long j8 = this.f93850d;
            g gVar = g.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = g.f93833m;
                gVar.z4().j(g3.a.c(g3.f35298f));
                fj1.b bVar = gVar.f93834a;
                this.f93848b = b0Var;
                this.f93847a = 1;
                obj = bVar.c(j8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).k(j8);
                boolean z14 = this.f93851e;
                if (z14) {
                    gj1.d dVar = new gj1.d(new Long(j8));
                    gVar.getClass();
                    ge1.b.T(v1.a(gVar), null, null, new n(gVar, dVar, true, null), 3);
                } else {
                    int i16 = g.f93833m;
                    y0<g3<u<Long, Boolean, Boolean>>> y0VarZ4 = gVar.z4();
                    g3.a aVar2 = g3.f35298f;
                    u uVar = new u(new Long(j8), Boolean.valueOf(z14), Boolean.TRUE);
                    aVar2.getClass();
                    y0VarZ4.j(g3.a.d(uVar));
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String string = ((v2.a) v2Var).f47383a.toString();
                y.f136664a.getClass();
                y.a.c("GCMSettingsViewModel", string);
                int i17 = g.f93833m;
                gVar.z4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g() {
        final int i14 = 1;
        this.f93837d = o13.m.b(new e23.a(this) { // from class: ij1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f93832b;

            {
                this.f93832b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                g gVar = this.f93832b;
                switch (i15) {
                    case 0:
                        return (y0) gVar.f93842i.getValue();
                    case 1:
                        int i16 = g.f93833m;
                        return gVar.y4();
                    case 2:
                        int i17 = g.f93833m;
                        return gVar.z4();
                    case 3:
                        int i18 = g.f93833m;
                        return (y0) gVar.f93840g.getValue();
                    default:
                        return (y0) gVar.f93841h.getValue();
                }
            }
        });
        final int i15 = 2;
        this.f93839f = o13.m.b(new e23.a(this) { // from class: ij1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f93832b;

            {
                this.f93832b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                g gVar = this.f93832b;
                switch (i16) {
                    case 0:
                        return (y0) gVar.f93842i.getValue();
                    case 1:
                        int i17 = g.f93833m;
                        return gVar.y4();
                    case 2:
                        int i18 = g.f93833m;
                        return gVar.z4();
                    case 3:
                        int i19 = g.f93833m;
                        return (y0) gVar.f93840g.getValue();
                    default:
                        return (y0) gVar.f93841h.getValue();
                }
            }
        });
        final int i16 = 3;
        o13.m.b(new e23.a(this) { // from class: ij1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f93832b;

            {
                this.f93832b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                g gVar = this.f93832b;
                switch (i17) {
                    case 0:
                        return (y0) gVar.f93842i.getValue();
                    case 1:
                        int i18 = g.f93833m;
                        return gVar.y4();
                    case 2:
                        int i19 = g.f93833m;
                        return gVar.z4();
                    case 3:
                        int i110 = g.f93833m;
                        return (y0) gVar.f93840g.getValue();
                    default:
                        return (y0) gVar.f93841h.getValue();
                }
            }
        });
        this.f93841h = o13.m.b(new i31.e(29));
        final int i17 = 4;
        o13.m.b(new e23.a(this) { // from class: ij1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f93832b;

            {
                this.f93832b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                g gVar = this.f93832b;
                switch (i18) {
                    case 0:
                        return (y0) gVar.f93842i.getValue();
                    case 1:
                        int i19 = g.f93833m;
                        return gVar.y4();
                    case 2:
                        int i110 = g.f93833m;
                        return gVar.z4();
                    case 3:
                        int i111 = g.f93833m;
                        return (y0) gVar.f93840g.getValue();
                    default:
                        return (y0) gVar.f93841h.getValue();
                }
            }
        });
        this.f93842i = o13.m.b(new i31.e(24));
        final int i18 = 0;
        o13.m.b(new e23.a(this) { // from class: ij1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f93832b;

            {
                this.f93832b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                g gVar = this.f93832b;
                switch (i19) {
                    case 0:
                        return (y0) gVar.f93842i.getValue();
                    case 1:
                        int i110 = g.f93833m;
                        return gVar.y4();
                    case 2:
                        int i111 = g.f93833m;
                        return gVar.z4();
                    case 3:
                        int i112 = g.f93833m;
                        return (y0) gVar.f93840g.getValue();
                    default:
                        return (y0) gVar.f93841h.getValue();
                }
            }
        });
        t tVarB = o13.m.b(new i31.e(25));
        this.f93843j = tVarB;
        this.f93844k = (y0) tVarB.getValue();
        this.f93845l = (y0) o13.m.b(new i31.e(26)).getValue();
    }

    public static String B4(gj1.h hVar) {
        String displayName;
        String string;
        String displayName2;
        String lastUploadTimestamp = hVar.getLastUploadTimestamp();
        String str = "";
        if (lastUploadTimestamp == null) {
            gj1.b bVar = hVar.f77674i;
            return (bVar == null || (displayName = bVar.getDisplayName()) == null) ? "" : displayName;
        }
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        DateTime dateTime = new DateTime(Long.parseLong(lastUploadTimestamp));
        DateTimeFormatter dateTimeFormatter = j0.f23102d;
        dateTimeFormatter.getClass();
        DateTime dateTime2 = new DateTime(j0.h(dateTime, dateTimeFormatter));
        if (s.g(dateTime2.toString("MM/dd/yy"), DateTime.now().toString("MM/dd/yy"))) {
            String string2 = contextA.getString(R.string.mct_lbl_today);
            string2.getClass();
            Locale locale = Locale.ROOT;
            String strF = x.f(locale, string2, locale);
            j0.f23099a.getClass();
            string = contextA.getString(R.string.device_last_synced_date, strF, dateTime2.toString(j0.z()));
        } else {
            j0.f23099a.getClass();
            string = j0.D() ? contextA.getString(R.string.device_last_synced_date, dateTime2.toString("MMM d, yyyy"), dateTime2.toString("HH:mm")) : contextA.getString(R.string.device_last_synced_date, dateTime2.toString("MMM d, yyyy"), dateTime2.toString("hh:mm a"));
        }
        String strN = fb1.c.n(" - ", string);
        gj1.b bVar2 = hVar.f77674i;
        if (bVar2 != null && (displayName2 = bVar2.getDisplayName()) != null) {
            str = displayName2;
        }
        return str.concat(strN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(g gVar, long j8, boolean z14, gj1.b bVar, v13.c cVar) {
        j jVar;
        gVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f93862e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f93862e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(gVar, cVar);
            }
        } else {
            jVar = new j(gVar, cVar);
        }
        Object objJ = jVar.f93860c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f93862e;
        if (i15 == 0) {
            o13.r.b(objJ);
            fj1.b bVar2 = gVar.f93834a;
            jVar.f93859b = bVar;
            jVar.f93858a = z14;
            jVar.f93862e = 1;
            bVar2.getClass();
            objJ = f0.J(bVar2, new fj1.c(bVar2, j8, null), jVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = jVar.f93858a;
            bVar = jVar.f93859b;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            gj1.h hVar = (gj1.h) ((v2.b) v2Var).f47386a;
            hVar.f77673h = z14;
            hVar.f77674i = bVar;
            return hVar;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String string = ((v2.a) v2Var).f47383a.toString();
        y.f136664a.getClass();
        y.a.c("GCMSettingsViewModel", string);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, gj1.b] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, gj1.b] */
    public final Object A4(gj1.f fVar, v13.c cVar) {
        k kVar;
        List<gj1.b> arrayList;
        List<gj1.b> list;
        List<gj1.b> arrayList2;
        List<gj1.b> list2;
        r0 r0Var;
        r0 r0Var2;
        o53.j0 j0VarJ;
        String str;
        o53.j0 j0Var;
        gj1.e primaryTrainingDevices;
        gj1.i wearableDevices;
        r0 r0Var3;
        r0 r0Var4;
        List<gj1.b> list3;
        List<gj1.b> list4;
        T t7;
        boolean z14;
        boolean z15;
        boolean z16;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f93871i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f93871i = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objAwait = kVar.f93869g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f93871i;
        t tVar = this.f93840g;
        String str2 = null;
        if (i15 != 0) {
            if (i15 == 1) {
                j0Var = kVar.f93867e;
                r0Var2 = kVar.f93866d;
                r0Var = kVar.f93865c;
                list2 = kVar.f93864b;
                list = kVar.f93863a;
                o13.r.b(objAwait);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = kVar.f93868f;
                r0Var3 = kVar.f93866d;
                r0Var4 = kVar.f93865c;
                list3 = kVar.f93864b;
                list4 = kVar.f93863a;
                o13.r.b(objAwait);
            }
            str2 = (String) objAwait;
            list = list4;
            r0Var = r0Var4;
            list2 = list3;
            r0Var2 = r0Var3;
            String str3 = str;
            String str4 = str2;
            y0 y0Var = (y0) tVar.getValue();
            g3.a aVar2 = g3.f35298f;
            t7 = r0Var.f105810a;
            if (t7 == 0 || r0Var2.f105810a != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            List<gj1.b> list5 = list;
            gj1.b bVar = (gj1.b) t7;
            gj1.b bVar2 = (gj1.b) r0Var2.f105810a;
            if (t7 != 0 || list5.size() <= 1) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (r0Var2.f105810a != 0 || list2.size() <= 1) {
                z16 = false;
            } else {
                z16 = true;
            }
            lj1.a aVar3 = new lj1.a(z14, bVar, str3, bVar2, str4, z15, z16);
            aVar2.getClass();
            y0Var.j(g3.a.d(aVar3));
            return Unit.INSTANCE;
        }
        o13.r.b(objAwait);
        if (fVar == null || (wearableDevices = fVar.getWearableDevices()) == null || (arrayList = wearableDevices.b()) == null) {
            arrayList = new ArrayList<>();
        }
        list = arrayList;
        if (fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (arrayList2 = primaryTrainingDevices.b()) == null) {
            arrayList2 = new ArrayList<>();
        }
        list2 = arrayList2;
        if (list.size() > 1 || list2.size() > 1) {
            r0Var = new r0();
            r0Var.f105810a = gl.b.u(fVar);
            r0Var2 = new r0();
            gj1.d primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
            ?? D = gl.b.D(fVar, primaryTrainingDeviceDTO != null ? primaryTrainingDeviceDTO.getDeviceId() : null);
            r0Var2.f105810a = D;
            T t14 = r0Var.f105810a;
            if (t14 != 0 || D != 0) {
                gj1.b bVar3 = (gj1.b) t14;
                Long deviceId = bVar3 != null ? bVar3.getDeviceId() : null;
                gj1.b bVar4 = (gj1.b) r0Var2.f105810a;
                Long deviceId2 = bVar4 != null ? bVar4.getDeviceId() : null;
                o53.j0 j0VarJ2 = (deviceId == null || r0Var.f105810a == 0) ? null : ge1.b.j(v1.a(this), null, null, new l(this, deviceId, r0Var, null), 3);
                j0VarJ = (deviceId2 == null || r0Var2.f105810a == 0) ? null : ge1.b.j(v1.a(this), null, null, new m(this, deviceId2, r0Var2, null), 3);
                if (j0VarJ2 != null) {
                    kVar.f93863a = list;
                    kVar.f93864b = list2;
                    kVar.f93865c = r0Var;
                    kVar.f93866d = r0Var2;
                    kVar.f93867e = j0VarJ;
                    kVar.f93871i = 1;
                    Object objC = j0VarJ2.C(kVar);
                    if (objC != aVar) {
                        o53.j0 j0Var2 = j0VarJ;
                        objAwait = objC;
                        j0Var = j0Var2;
                    }
                } else {
                    str = null;
                    if (j0VarJ != null) {
                        kVar.f93863a = list;
                        kVar.f93864b = list2;
                        kVar.f93865c = r0Var;
                        kVar.f93866d = r0Var2;
                        kVar.f93867e = null;
                        kVar.f93868f = str;
                        kVar.f93871i = 2;
                        objAwait = j0VarJ.await(kVar);
                        if (objAwait != aVar) {
                            r0Var3 = r0Var2;
                            r0Var4 = r0Var;
                            list3 = list2;
                            list4 = list;
                            str2 = (String) objAwait;
                            list = list4;
                            r0Var = r0Var4;
                            list2 = list3;
                            r0Var2 = r0Var3;
                        }
                    }
                    String str5 = str;
                    String str6 = str2;
                    y0 y0Var2 = (y0) tVar.getValue();
                    g3.a aVar4 = g3.f35298f;
                    t7 = r0Var.f105810a;
                    if (t7 == 0) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    List<gj1.b> list6 = list;
                    gj1.b bVar5 = (gj1.b) t7;
                    gj1.b bVar6 = (gj1.b) r0Var2.f105810a;
                    if (t7 != 0) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (r0Var2.f105810a != 0) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    lj1.a aVar5 = new lj1.a(z14, bVar5, str5, bVar6, str6, z15, z16);
                    aVar4.getClass();
                    y0Var2.j(g3.a.d(aVar5));
                }
                return aVar;
            }
            y0 y0Var3 = (y0) tVar.getValue();
            g3.a aVar6 = g3.f35298f;
            lj1.a aVar7 = new lj1.a(false, null, null, null, null, false, false, 126, null);
            aVar6.getClass();
            y0Var3.j(g3.a.d(aVar7));
        } else {
            y0 y0Var4 = (y0) tVar.getValue();
            g3.a aVar8 = g3.f35298f;
            lj1.a aVar9 = new lj1.a(false, null, null, null, null, false, false, 126, null);
            aVar8.getClass();
            y0Var4.j(g3.a.d(aVar9));
        }
        return Unit.INSTANCE;
        String str7 = (String) objAwait;
        j0VarJ = j0Var;
        str = str7;
        if (j0VarJ != null) {
            kVar.f93863a = list;
            kVar.f93864b = list2;
            kVar.f93865c = r0Var;
            kVar.f93866d = r0Var2;
            kVar.f93867e = null;
            kVar.f93868f = str;
            kVar.f93871i = 2;
            objAwait = j0VarJ.await(kVar);
            if (objAwait != aVar) {
                r0Var3 = r0Var2;
                r0Var4 = r0Var;
                list3 = list2;
                list4 = list;
                str2 = (String) objAwait;
                list = list4;
                r0Var = r0Var4;
                list2 = list3;
                r0Var2 = r0Var3;
            }
            return aVar;
        }
        String str8 = str;
        String str9 = str2;
        y0 y0Var5 = (y0) tVar.getValue();
        g3.a aVar10 = g3.f35298f;
        t7 = r0Var.f105810a;
        if (t7 == 0) {
            z14 = true;
        } else {
            z14 = true;
        }
        List<gj1.b> list7 = list;
        gj1.b bVar7 = (gj1.b) t7;
        gj1.b bVar8 = (gj1.b) r0Var2.f105810a;
        if (t7 != 0) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (r0Var2.f105810a != 0) {
            z16 = false;
        } else {
            z16 = false;
        }
        lj1.a aVar11 = new lj1.a(z14, bVar7, str8, bVar8, str9, z15, z16);
        aVar10.getClass();
        y0Var5.j(g3.a.d(aVar11));
        return Unit.INSTANCE;
    }

    public final void C4(long j8, boolean z14) {
        ge1.b.T(v1.a(this), null, null, new c(j8, z14, null), 3);
    }

    public final y0<g3<gj1.f>> y4() {
        return (y0) this.f93836c.getValue();
    }

    public final y0<g3<u<Long, Boolean, Boolean>>> z4() {
        return (y0) this.f93838e.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lij1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LAST_SYNC_PRE_FIX", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
