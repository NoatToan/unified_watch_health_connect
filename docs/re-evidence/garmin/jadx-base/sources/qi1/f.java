package qi1;

import android.net.Uri;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m20.z;
import o53.b0;
import o53.s0;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pj1.d0;
import ui1.f0;
import ui1.g0;
import ui1.h0;
import ui1.k0;
import ui1.o0;
import ui1.w0;
import ui1.z0;
import v.e0;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqi1/f;", "Landroidx/lifecycle/u1;", "", "deviceId", "Ll22/b;", "resourceResolver", "<init>", "(JLl22/b;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f144858o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f144859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f144860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<String> f144861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<g3<u>> f144862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<g3<t>> f144863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<g3<String>> f144864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<w61.f<Unit>> f144865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<Map<Object, String>> f144866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f144867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.t f144868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f144869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.t f144870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f144871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public sd2.f f144872n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel$1", f = "LTESubscriptionViewModel.kt", l = {101, 102}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f144873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f144874b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        
            if (r5.B4(false, r8) == r0) goto L16;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            f fVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144874b;
            f fVar2 = f.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    fVar = this.f144873a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            pc0.j.a.a(pc0.j.f137223i);
            long j8 = fVar2.f144859a;
            this.f144873a = fVar2;
            this.f144874b = 1;
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new pc0.q(j8, null), this);
            if (obj != aVar) {
                fVar = fVar2;
            }
            return aVar;
            fVar.f144872n = (sd2.f) obj;
            this.f144873a = null;
            this.f144874b = 2;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144876a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.GENESIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.TRANSFER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.NO_THANKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.OTHER_OPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f144876a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel$handleTransferSubscription$1", f = "LTESubscriptionViewModel.kt", l = {396}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f144878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f144879c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel$handleTransferSubscription$1$1", f = "LTESubscriptionViewModel.kt", l = {402}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f144880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f144881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f144882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8, f fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f144881b = j8;
                this.f144882c = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f144881b, this.f144882c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f144880a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    f0 f0Var = new f0(null, String.valueOf(this.f144881b), 1, null);
                    f fVar = this.f144882c;
                    g0 g0Var = new g0(f0Var, new f0(null, String.valueOf(fVar.f144859a), 1, null), null, null, null, null, 60, null);
                    this.f144880a = 1;
                    if (fVar.G4(g0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, f fVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f144878b = j8;
            this.f144879c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f144878b, this.f144879c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144877a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f144878b, this.f144879c, null);
                this.f144877a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public f(long j8, l22.b bVar) {
        bVar.getClass();
        this.f144859a = j8;
        this.f144860b = bVar;
        this.f144861c = new y0<>();
        this.f144862d = new y0<>();
        this.f144863e = new y0<>();
        this.f144864f = new y0<>();
        this.f144865g = new y0<>();
        this.f144866h = new y0<>();
        this.f144867i = o13.m.b(new q53.q(17));
        this.f144868j = o13.m.b(new q53.q(18));
        this.f144869k = o13.m.b(new q53.q(19));
        this.f144870l = o13.m.b(new q53.q(20));
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(f fVar, v13.c cVar) {
        k kVar;
        int i14;
        v2 v2Var;
        fVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f144899d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f144899d = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(fVar, cVar);
            }
        } else {
            kVar = new k(fVar, cVar);
        }
        Object objB = kVar.f144897b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar.f144899d;
        if (i16 == 0) {
            o13.r.b(objB);
            tj1.h hVar = (tj1.h) fVar.f144869k.getValue();
            kVar.f144899d = 1;
            objB = hVar.b(kVar);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(objB);
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = kVar.f144896a;
            o13.r.b(objB);
        }
        v2Var = (v2) objB;
        String strF = b71.i.f("handleActiveSubscription() eccContacts. ", v2Var);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "LTESubscriptionViewModel", strF);
        if (v2Var instanceof v2.b) {
            p005kotlin.jvm.internal.s.g(((tj1.e) ((v2.b) v2Var).f47386a).getAssistancePlusEnabled(), Boolean.FALSE);
        }
        fVar.C4().m(Boolean.valueOf(i14 != 0));
        fVar.f144861c.j("LTESubscriptionStatusFragment");
        y0<g3<u>> y0Var = fVar.f144862d;
        g3.a aVar3 = g3.f35298f;
        u uVar = u.PROCESSING;
        aVar3.getClass();
        y0Var.j(g3.a.d(uVar));
        return Unit.INSTANCE;
        boolean z14 = objB instanceof v2.b;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("handleActiveSubscription() supportGEOS. ", z14);
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var2, "LTESubscriptionViewModel", strH);
        if (z14) {
            z zVar = (z) fVar.f144870l.getValue();
            kVar.f144896a = z14 ? 1 : 0;
            kVar.f144899d = 2;
            zVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(zVar, new m20.o(zVar, null), kVar);
            if (objJ != aVar) {
                i14 = z14 ? 1 : 0;
                objB = objJ;
                v2Var = (v2) objB;
                String strF2 = b71.i.f("handleActiveSubscription() eccContacts. ", v2Var);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var3, "LTESubscriptionViewModel", strF2);
                if (v2Var instanceof v2.b) {
                    p005kotlin.jvm.internal.s.g(((tj1.e) ((v2.b) v2Var).f47386a).getAssistancePlusEnabled(), Boolean.FALSE);
                }
                fVar.C4().m(Boolean.valueOf(i14 != 0));
            }
            return aVar;
        }
        fVar.f144861c.j("LTESubscriptionStatusFragment");
        y0<g3<u>> y0Var2 = fVar.f144862d;
        g3.a aVar6 = g3.f35298f;
        u uVar2 = u.PROCESSING;
        aVar6.getClass();
        y0Var2.j(g3.a.d(uVar2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(f fVar, boolean z14, boolean z15, z0 z0Var, v13.c cVar) {
        l lVar;
        int i14;
        z0 z0Var2;
        boolean z16;
        boolean z17;
        boolean z18;
        String string;
        String string2;
        Boolean boolValueOf;
        List<l20.a> listF;
        long j8 = fVar.f144859a;
        l22.b bVar = fVar.f144860b;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i15 = lVar.f144906g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lVar.f144906g = i15 - Integer.MIN_VALUE;
            } else {
                lVar = new l(fVar, cVar);
            }
        } else {
            lVar = new l(fVar, cVar);
        }
        Object objB = lVar.f144904e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = lVar.f144906g;
        boolean z19 = true;
        if (i16 == 0) {
            o13.r.b(objB);
            if (z14 || z15) {
                GDILTEProto.LTESubscriptionInfo lTESubscriptionInfoC = ui1.y0.c(z0Var, j8);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "LTESubscriptionViewModel", "notifyDevice()");
                GDILTEProto.LTEService.Builder lteSubscriptionInfoNotification = GDILTEProto.LTEService.newBuilder().setLteSubscriptionInfoNotification(GDILTEProto.LTESubscriptionInfoNotification.newBuilder().setInfo(lTESubscriptionInfoC));
                GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                builderNewBuilder.getClass();
                lteSubscriptionInfoNotification.getClass();
                builderNewBuilder.setExtension(GDILTEExtension.lteService, lteSubscriptionInfoNotification.build());
                ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
                GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                smartBuild.getClass();
                protobufRequestManager.initiateNotification(smartBuild, j8);
            }
            tj1.h hVar = (tj1.h) fVar.f144869k.getValue();
            lVar.f144902c = z0Var;
            lVar.f144900a = z14;
            lVar.f144901b = z15;
            lVar.f144906g = 1;
            objB = hVar.b(lVar);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            z15 = lVar.f144901b;
            z14 = lVar.f144900a;
            z0Var = lVar.f144902c;
            o13.r.b(objB);
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = lVar.f144903d;
            z0Var2 = lVar.f144902c;
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        z16 = false;
        if (i14 != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        String strH = com.airbnb.lottie.animation.keyframe.a.h("handleActiveSubscription() supportGEOS. ", z17);
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "LTESubscriptionViewModel", strH);
        i2.a.b(a2Var2, "LTESubscriptionViewModel", "handleActiveSubscription() eccContacts. " + v2Var);
        if (i14 == 0 && (v2Var instanceof v2.b)) {
            string = p005kotlin.jvm.internal.s.g(((tj1.e) ((v2.b) v2Var).f47386a).getAssistancePlusEnabled(), Boolean.TRUE) ? bVar.getString(R.string.lbl_assistance_plus_enabled) : bVar.getString(R.string.lbl_assistance_plus_not_enabled);
            fVar.C4().m(Boolean.valueOf(i14 != 0));
            z18 = true;
        } else {
            z18 = false;
            string = null;
        }
        if (i14 == 0 || !(v2Var instanceof v2.b)) {
            z16 = z18;
        } else {
            l20.r userContactsDTO = ((tj1.e) ((v2.b) v2Var).f47386a).getUserContactsDTO();
            if (userContactsDTO != null) {
                l20.q selfUserContactDTO = userContactsDTO.getSelfUserContactDTO();
                if (selfUserContactDTO != null && d0.k(selfUserContactDTO) && (listF = userContactsDTO.f()) != null && !listF.isEmpty()) {
                    Iterator<T> it = listF.iterator();
                    do {
                        if (!it.hasNext()) {
                            z19 = false;
                            break;
                        }
                    } while (!ge1.b.Q((l20.a) it.next()));
                } else {
                    z19 = false;
                    break;
                }
                boolValueOf = Boolean.valueOf(z19);
            } else {
                boolValueOf = null;
            }
            string = p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE) ? bVar.getString(R.string.lbl_enabled) : bVar.getString(R.string.not_enabled_on_watch_lbl);
            fVar.C4().m(null);
        }
        y0<g3<t>> y0Var = fVar.f144863e;
        g3.a aVar4 = g3.f35298f;
        if (z0Var2.getGarminPartNumber() == k0.WRSLTE_MONTHLY_P) {
            string2 = bVar.getString(R.string.lte_monthly_plan);
        } else {
            string2 = bVar.getString(R.string.lte_yearly_plan);
        }
        t tVar = new t(string2, string, z16);
        aVar4.getClass();
        y0Var.j(g3.a.d(tVar));
        return Unit.INSTANCE;
        boolean z24 = objB instanceof v2.b;
        z zVar = (z) fVar.f144870l.getValue();
        lVar.f144902c = z0Var;
        lVar.f144900a = z14;
        lVar.f144901b = z15;
        lVar.f144903d = z24 ? 1 : 0;
        lVar.f144906g = 2;
        zVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(zVar, new m20.o(zVar, null), lVar);
        if (objJ != aVar) {
            objB = objJ;
            i14 = z24 ? 1 : 0;
            z0Var2 = z0Var;
            v2 v2Var2 = (v2) objB;
            z16 = false;
            if (i14 != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            String strH2 = com.airbnb.lottie.animation.keyframe.a.h("handleActiveSubscription() supportGEOS. ", z17);
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var3, "LTESubscriptionViewModel", strH2);
            i2.a.b(a2Var3, "LTESubscriptionViewModel", "handleActiveSubscription() eccContacts. " + v2Var2);
            if (i14 == 0) {
                z18 = false;
                string = null;
            } else {
                z18 = false;
                string = null;
            }
            if (i14 == 0) {
                z16 = z18;
            } else {
                z16 = z18;
            }
            y0<g3<t>> y0Var2 = fVar.f144863e;
            g3.a aVar6 = g3.f35298f;
            if (z0Var2.getGarminPartNumber() == k0.WRSLTE_MONTHLY_P) {
                string2 = bVar.getString(R.string.lte_monthly_plan);
            } else {
                string2 = bVar.getString(R.string.lte_yearly_plan);
            }
            t tVar2 = new t(string2, string, z16);
            aVar6.getClass();
            y0Var2.j(g3.a.d(tVar2));
            return Unit.INSTANCE;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object z4(f fVar, v13.c cVar) {
        n nVar;
        y0<g3<String>> y0Var = fVar.f144864f;
        l22.b bVar = fVar.f144860b;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f144913c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f144913c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(fVar, cVar);
            }
        } else {
            nVar = new n(fVar, cVar);
        }
        Object objA = nVar.f144911a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f144913c;
        if (i15 == 0) {
            o13.r.b(objA);
            String strConcat = ("https://" + GCMSettingManager.k().f77354v).concat("/uac/start");
            String strConcat2 = GCMSettingManager.k().b().concat("/web-data/uac/styles/uacv2.css");
            String strConcat3 = GCMSettingManager.k().b().concat("/web-data/uac/styles/upc.css");
            Locale locale = Locale.getDefault();
            Map<u0, vg1.t> map = n0.f203577a;
            String string = Uri.parse(strConcat).buildUpon().appendQueryParameter("unitId", String.valueOf(fVar.f144859a)).appendQueryParameter("returnUrl", bVar.getString(R.string.lte_activation_ended_callback)).appendQueryParameter("failedReturnUrl", bVar.getString(R.string.lte_activation_error_callback)).appendQueryParameter("flow", "ActivationV2").appendQueryParameter("exitFlowUrl", bVar.getString(R.string.lte_activation_exit_flow_callback)).appendQueryParameter("cultureCode", s1.b(locale)).appendQueryParameter("cssUrl", strConcat2).appendQueryParameter("timestamp", String.valueOf(DateTime.now().getMillis())).appendQueryParameter("upcCssUrl", strConcat3).appendQueryParameter("timestamp", String.valueOf(DateTime.now().getMillis())).appendQueryParameter("upcStylingJsonName", "gcmTheme").appendQueryParameter("showHeader", BooleanUtils.FALSE).appendQueryParameter("showFooter", BooleanUtils.FALSE).appendQueryParameter("clientName", "gcm").build().toString();
            string.getClass();
            nVar.f144913c = 1;
            t13.i iVar = new t13.i(u13.f.b(nVar));
            cw.c cVarM = cw.c.M();
            i iVar2 = new i(iVar);
            cVarM.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.d0(string, cVarM), iVar2);
            objA = iVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        String str = (String) objA;
        if (str == null || str.length() == 0) {
            y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        } else {
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A4(String str, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f144885c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f144885c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objB = gVar.f144883a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f144885c;
        if (i15 == 0) {
            o13.r.b(objB);
            o0 o0VarD4 = D4();
            gVar.f144885c = 1;
            objB = o0VarD4.b(str, gVar);
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
        v2 v2Var = (v2) objB;
        boolean z14 = v2Var instanceof v2.b;
        long j8 = this.f144859a;
        y0<g3<u>> y0Var = this.f144862d;
        if (z14) {
            C4().q(String.valueOf(j8));
            this.f144861c.j("LTESubscriptionStatusFragment");
            g3.a aVar2 = g3.f35298f;
            u uVar = u.TRANSFER_COMPLETE;
            aVar2.getClass();
            y0Var.j(g3.a.d(uVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            Integer num = ((v2.a) v2Var).f47384b;
            if (num != null && num.intValue() == 6) {
                g3.a aVar3 = g3.f35298f;
                u uVar2 = u.TRANSFER_TIMEOUT;
                aVar3.getClass();
                y0Var.j(g3.a.d(uVar2));
            } else {
                C4().q(String.valueOf(j8));
                y0Var.j(g3.a.a(g3.f35298f, null, null, u.ERROR, null, 11));
            }
        }
        return Unit.INSTANCE;
    }

    public final Object B4(boolean z14, v13.i iVar) throws Throwable {
        this.f144861c.m("LTESubscriptionManagerFragment");
        this.f144863e.m(g3.a.c(g3.f35298f));
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new h(this, z14, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final vi1.b C4() {
        return (vi1.b) this.f144868j.getValue();
    }

    public final o0 D4() {
        return (o0) this.f144867i.getValue();
    }

    public final void E4(s sVar) {
        sVar.getClass();
        int i14 = c.f144876a[sVar.ordinal()];
        y0<g3<u>> y0Var = this.f144862d;
        y0<String> y0Var2 = this.f144861c;
        if (i14 == 1) {
            y0Var2.j("LTESubscriptionStatusFragment");
            g3.a aVar = g3.f35298f;
            u uVar = u.GENESIS;
            aVar.getClass();
            y0Var.j(g3.a.d(uVar));
            return;
        }
        if (i14 == 2) {
            y0Var2.m("LTESubscriptionWebViewFragment");
            this.f144864f.m(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(this), null, null, new p(this, null), 3);
            return;
        }
        if (i14 == 3) {
            y0Var2.m("LTESubscriptionManagerFragment");
            this.f144863e.m(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(this), null, null, new m(this, null), 3);
            return;
        }
        if (i14 == 4) {
            y0Var2.j("LTESubscriptionStatusFragment");
            g3.a aVar2 = g3.f35298f;
            u uVar2 = u.GENESIS;
            aVar2.getClass();
            y0Var.j(g3.a.d(uVar2));
            return;
        }
        if (i14 == 5) {
            y0Var2.j("LTESubscriptionStatusFragment");
            g3.a aVar3 = g3.f35298f;
            u uVar3 = u.TRANSFER;
            aVar3.getClass();
            y0Var.j(g3.a.d(uVar3));
            return;
        }
        i2.a aVar4 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var, "LTESubscriptionViewModel", "handleAction: " + sVar + " not handled");
    }

    public final void F4(long j8) {
        g3.a aVar = g3.f35298f;
        u uVar = u.TRANSFER_PROCESSING;
        aVar.getClass();
        this.f144862d.j(g3.a.d(uVar));
        ge1.b.T(v1.a(this), null, null, new d(j8, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (A4(r13, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        if (G4(r13, r0) == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G4(g0 g0Var, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f144923d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f144923d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objJ = qVar.f144921b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f144923d;
        if (i15 == 0) {
            o13.r.b(objJ);
            f0 oldDevice = g0Var.getOldDevice();
            String value = oldDevice != null ? oldDevice.getValue() : null;
            f0 newDevice = g0Var.getNewDevice();
            String strG = e0.g("subscription transfer oldDevice = ", value, " - newDevice = ", newDevice != null ? newDevice.getValue() : null, StringUtils.SPACE);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LTESubscriptionViewModel", strG);
            o0 o0VarD4 = D4();
            qVar.f144920a = g0Var;
            qVar.f144923d = 1;
            o0VarD4.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(o0VarD4, new w0(o0VarD4, g0Var, null), qVar);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                o13.r.b(objJ);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g0Var = qVar.f144920a;
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        boolean z14 = v2Var instanceof v2.b;
        y0<g3<u>> y0Var = this.f144862d;
        if (z14) {
            v2.b bVar = (v2.b) v2Var;
            int i16 = bVar.f47387b;
            if (i16 == 200) {
                g0Var.c();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "LTESubscriptionViewModel", " transfer validation success ");
                qVar.f144920a = null;
                qVar.f144923d = 2;
            } else if (i16 == 202) {
                h0 h0Var = (h0) new Gson().fromJson((String) bVar.f47386a, h0.class);
                if (h0Var != null) {
                    f0 oldDevice2 = g0Var.getOldDevice();
                    String value2 = oldDevice2 != null ? oldDevice2.getValue() : null;
                    f0 newDevice2 = g0Var.getNewDevice();
                    String value3 = newDevice2 != null ? newDevice2.getValue() : null;
                    if (value2 != null && value3 != null) {
                        C4().f(value3, value2);
                    }
                    String strN = fb1.c.n("validateThenTransfer()- have a job id ", h0Var.getJobId());
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var3, "LTESubscriptionViewModel", strN);
                    String strA = h0Var.getJobId();
                    qVar.f144920a = null;
                    qVar.f144923d = 3;
                } else {
                    this.f144861c.j("LTESubscriptionStatusFragment");
                    y0Var.j(g3.a.a(g3.f35298f, null, null, u.ERROR_EXIT, null, 11));
                }
            }
            return obj;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        Integer num = ((v2.a) v2Var).f47384b;
        if (num != null) {
            if (num.intValue() >= 500) {
                y0Var.j(g3.a.a(g3.f35298f, null, null, u.ERROR_RETRY, null, 11));
            } else {
                y0Var.j(g3.a.a(g3.f35298f, null, null, u.ERROR, null, 11));
            }
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lqi1/f$b;", "", "<init>", "()V", "", "RETURN_URL", "Ljava/lang/String;", "FAILED_RETURN_URL", "FLOW", "EXIT_FLOW_URL", "CULTURE_CODE", "CSS_URL", "UPC_CSS_URL", "UPC_CSS_STYLING_KEY", "UPC_CSS_STYLING_VALUE", "FLOW_ACTIVATION_V2", "SHOW_HEADER", "SHOW_FOOTER", "TIMESTAMP", "CLIENT_NAME_KEY", "CLIENT_NAME_VALUE", "SUBSCRIPTION_PATH", "CSS_PATH", "UPC_CSS_PATH", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
