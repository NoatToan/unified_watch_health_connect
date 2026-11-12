package com.garmin.android.apps.connectmobile.traininginitiative.viewmodels;

import am.x0;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.lifecycle.s0;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c22.l3;
import c22.m3;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import e23.l;
import fg0.k;
import fg0.o;
import fg0.u;
import fg0.x;
import gg0.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import lc.u0;
import m52.i;
import mh1.q;
import o13.m;
import o13.p;
import o13.r;
import o13.t;
import o53.b0;
import o53.c2;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import qs.y;
import u62.z;
import vb.h;
import ww1.v;
import ww1.w;
import zf0.g0;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/viewmodels/AddTIEventViewModel;", "Lzf0/j0;", "", "navigationFromDetails", "<init>", "(Z)V", "a", "GeofenceAutosuggestException", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddTIEventViewModel extends j0 {
    public static final String[] V2;
    public static final String[] W2;
    public static final MediaType[] X2;
    public final t A1;
    public v A2;
    public final t B1;
    public boolean B2;
    public final t C1;
    public boolean C2;
    public final t D1;
    public boolean D2;
    public final t E1;
    public i E2;
    public final t F1;
    public w F2;
    public final t G1;
    public int G2;
    public final t H0;
    public final t H1;
    public int H2;
    public ArrayList I;
    public final t I0;
    public final t I1;
    public boolean I2;
    public final t J0;
    public final t J1;
    public boolean J2;
    public final t K1;
    public my1.d K2;
    public final t L1;
    public final t L2;
    public final t M1;
    public final y0 M2;
    public final t N0;
    public final t N1;
    public final y0<ky1.b<vo0.f>> N2;
    public final t O0;
    public final t O1;
    public final LinkedHashMap<String, vo0.f> O2;
    public boolean P;
    public final t P0;
    public final t P1;
    public final ReentrantLock P2;
    public final t Q0;
    public final t Q1;
    public c2 Q2;
    public final t R0;
    public final t R1;
    public final double R2;
    public final t S0;
    public final t S1;
    public final double S2;
    public final t T1;
    public final double T2;
    public final t U1;
    public final double U2;
    public final t V1;
    public final t W1;
    public final t X0;
    public final t X1;
    public final y0 Y1;
    public final t Z;
    public final t Z0;
    public final t Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public final y0 f46398a2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final t f46399b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public final t f46400b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public final y0 f46402c2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final t f46403d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public final t f46404d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public final t f46406e2;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final t f46407f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public final t f46408f2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public final w0 f46410g2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final t f46411h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public final t f46412h2;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final t f46414i2;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final t f46415j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public final t f46416j2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f46417k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final t f46418k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public final t f46419k2;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final t f46420l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public final t f46421l2;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final t f46422m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public final t f46423m2;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final t f46424n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public final t f46425n2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final t f46426o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public final jy1.b f46427o2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final t f46428p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final d60.b f46429p2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final t f46430q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public final sy1.c f46431q2;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final t f46432r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public final sy1.a f46433r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final t f46434s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public k f46435s2;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final t f46436t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public k f46437t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final y0 f46438u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public boolean f46439u2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final t f46440v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public boolean f46441v2;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final t f46442w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public boolean f46443w2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final t f46444x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public String f46445x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final t f46446y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public p<String, com.garmin.android.library.mapsdkadapter.f> f46447y2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final t f46448z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public boolean f46449z2;
    public final t T = m.b(new q(21));
    public final y0 X = O5();
    public final t Y = m.b(new q(23));
    public final t K0 = m.b(new mz1.c(5));
    public final t L0 = m.b(new mz1.e(this, 4));
    public final t M0 = m.b(new mz1.c(11));
    public final t T0 = m.b(new mz1.e(this, 0));
    public final t U0 = m.b(new mz1.c(12));
    public final t V0 = m.b(new mz1.e(this, 5));
    public final t W0 = m.b(new q(22));
    public final t Y0 = m.b(new q(24));

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final t f46397a1 = m.b(new q(25));

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final t f46401c1 = m.b(new q(26));

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final t f46405e1 = m.b(new q(27));

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final t f46409g1 = m.b(new q(28));

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final t f46413i1 = m.b(new q(29));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/viewmodels/AddTIEventViewModel$GeofenceAutosuggestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GeofenceAutosuggestException extends Exception {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeofenceAutosuggestException(String str) {
            super(str);
            str.getClass();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f46454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f46455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f46456g;

        static {
            int[] iArr = new int[gg0.i.values().length];
            try {
                iArr[gg0.i.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.i.MILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.i.KILOMETER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gg0.i.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46450a = iArr;
            int[] iArr2 = new int[x0.values().length];
            try {
                iArr2[x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x0.J0.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x0.K0.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x0.f4312o.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[x0.Z0.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[x0.V0.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[x0.X0.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f46451b = iArr2;
            int[] iArr3 = new int[zf0.a.values().length];
            try {
                iArr3[zf0.a.CREATE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            f46452c = iArr3;
            int[] iArr4 = new int[gg0.f.values().length];
            try {
                iArr4[gg0.f.f77130f.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[gg0.f.f77131g.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[gg0.f.f77132h.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[gg0.f.f77134j.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[gg0.f.f77133i.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[gg0.f.f77135k.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[gg0.f.f77136l.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            f46453d = iArr4;
            int[] iArr5 = new int[ny1.g.values().length];
            try {
                iArr5[ny1.g.IN_PERSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[ny1.g.VIRTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            f46454e = iArr5;
            int[] iArr6 = new int[xy1.c.values().length];
            try {
                iArr6[xy1.c.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[xy1.c.RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[xy1.c.PARTICIPATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[xy1.c.DURATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[xy1.c.OFFICIAL_EVENTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[xy1.c.VERIFIED_EVENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[xy1.c.GARMIN_USER_EVENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            f46455f = iArr6;
            int[] iArr7 = new int[y.values().length];
            try {
                iArr7[y.UNIT_DISTANCE_METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[y.UNIT_DISTANCE_KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[y.UNIT_DISTANCE_YARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[y.UNIT_DISTANCE_MILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            f46456g = iArr7;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$checkAndGetMatchingEvents$1", f = "AddTIEventViewModel.kt", l = {2985}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46458b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f46461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f46462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ fg0.v f46463g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String[] f46464h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, com.garmin.android.library.mapsdkadapter.f fVar, fg0.v vVar, String[] strArr, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f46460d = str;
            this.f46461e = str2;
            this.f46462f = fVar;
            this.f46463g = vVar;
            this.f46464h = strArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = AddTIEventViewModel.this.new c(this.f46460d, this.f46461e, this.f46462f, this.f46463g, this.f46464h, dVar);
            cVar.f46458b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            b0 b0Var = (b0) this.f46458b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46457a;
            AddTIEventViewModel addTIEventViewModel = AddTIEventViewModel.this;
            if (i14 == 0) {
                r.b(obj);
                String[] strArr = AddTIEventViewModel.V2;
                addTIEventViewModel.c6().j(g3.a.c(g3.f35298f));
                ig0.b bVarH4 = addTIEventViewModel.H4();
                com.garmin.android.library.mapsdkadapter.f fVar = this.f46462f;
                Double d14 = fVar != null ? new Double(fVar.f50283a.latitude) : null;
                Double d15 = fVar != null ? new Double(fVar.f50283a.longitude) : null;
                Integer num = new Integer(32186);
                fg0.v vVar = this.f46463g;
                String str = vVar != null ? vVar.f71359a : null;
                Double d16 = vVar != null ? vVar.f71360b : null;
                Double d17 = vVar != null ? vVar.f71361c : null;
                this.f46458b = b0Var;
                this.f46457a = 1;
                bVarH4.getClass();
                String str2 = this.f46460d;
                String str3 = this.f46461e;
                objJ = f0.J(bVarH4, new ig0.g(bVarH4, str2, null, str3, str3, d14, d15, num, str, d16, d17, this.f46464h, true, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objJ = obj;
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                boolean z14 = (s.g(addTIEventViewModel.f204393j, Boolean.TRUE) || addTIEventViewModel.f204395l) ? false : true;
                Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    o oVar = (o) obj2;
                    Boolean boolS = oVar.getIsOfficial();
                    Boolean bool = Boolean.TRUE;
                    if (s.g(boolS, bool) || oVar.getVerifiedStatus() == j.VERIFIED || (z14 && oVar.getVerifiedStatus() == j.NONE && s.g(oVar.getHasCourse(), bool))) {
                        arrayList.add(obj2);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                List listX4 = arrayList;
                if (!zIsEmpty) {
                    listX4 = j0.x4(arrayList);
                }
                String[] strArr2 = AddTIEventViewModel.V2;
                y0<g3<List<o>>> y0VarC6 = addTIEventViewModel.c6();
                g3.f35298f.getClass();
                y0VarC6.j(g3.a.d(listX4));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String[] strArr3 = AddTIEventViewModel.V2;
                addTIEventViewModel.c6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String string = ((v2.a) v2Var).f47383a.toString();
                p92.y.f136664a.getClass();
                p92.y.a.c("EventDetailsViewModel", string);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getTimeZoneSettings$1", f = "AddTIEventViewModel.kt", l = {1499}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46466b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((my1.g) t7).getGmtOffset(), ((my1.g) t14).getGmtOffset());
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = AddTIEventViewModel.this.new d(dVar);
            dVar2.f46466b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f46466b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46465a;
            AddTIEventViewModel addTIEventViewModel = AddTIEventViewModel.this;
            if (i14 == 0) {
                r.b(obj);
                String[] strArr = AddTIEventViewModel.V2;
                addTIEventViewModel.T5().j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                sy1.c cVar = addTIEventViewModel.f46431q2;
                this.f46466b = b0Var;
                this.f46465a = 1;
                cVar.getClass();
                obj = f0.J(cVar, new sy1.d(cVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                List list = (List) bVar.f47386a;
                if (list != null) {
                    List listN0 = h0.N0(list, new a());
                    if (listN0.isEmpty()) {
                        String strH = am.j.h(bVar.f47387b, "Problem in getting the timezone api result : ");
                        p92.y.f136664a.getClass();
                        p92.y.a.c("AddTIEventViewModel", strH);
                        String[] strArr2 = AddTIEventViewModel.V2;
                        addTIEventViewModel.T5().j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
                    } else {
                        String[] strArr3 = AddTIEventViewModel.V2;
                        ((y0) addTIEventViewModel.f46426o1.getValue()).j(listN0);
                        addTIEventViewModel.T5().j(fw.m.a.g(fw.m.f73767e, list, 1));
                    }
                } else {
                    String[] strArr4 = AddTIEventViewModel.V2;
                    addTIEventViewModel.T5().j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String[] strArr5 = AddTIEventViewModel.V2;
                addTIEventViewModel.T5().j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.k) t7).getLegIndex()), Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.k) t14).getLegIndex()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46468a;

        public f(l lVar) {
            lVar.getClass();
            this.f46468a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46468a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46468a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$validateWebUrl$1", f = "AddTIEventViewModel.kt", l = {2631}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46469a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46471c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f46471c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AddTIEventViewModel.this.new g(this.f46471c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46469a;
            AddTIEventViewModel addTIEventViewModel = AddTIEventViewModel.this;
            if (i14 == 0) {
                r.b(obj);
                zf0.d dVar = addTIEventViewModel.f204384a;
                this.f46469a = 1;
                dVar.getClass();
                obj = f0.J(dVar, new g0(dVar, this.f46471c, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                String[] strArr = AddTIEventViewModel.V2;
                z.h(g3.f35298f, ((v2.b) v2Var).f47386a, addTIEventViewModel.d6());
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String[] strArr2 = AddTIEventViewModel.V2;
                addTIEventViewModel.d6().j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        V2 = new String[]{"file"};
        W2 = new String[]{"file.png"};
        X2 = new MediaType[]{gz0.a.f80404d};
    }

    public AddTIEventViewModel(boolean z14) {
        final int i14 = 6;
        this.Z = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i15) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        this.f46417k0 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i15 = 16;
        this.H0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i16) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i16 = 20;
        this.I0 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i17 = 25;
        this.J0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i18) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i18 = 4;
        this.N0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i19) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i19 = 2;
        this.O0 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i24 = 13;
        this.P0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i24;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i25 = 16;
        this.Q0 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i26 = 23;
        this.R0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i26;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i27 = 29;
        this.S0 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i28 = 0;
        this.X0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i28;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i29 = 1;
        this.Z0 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i29;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i30 = 2;
        this.f46399b1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i30;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i34 = 3;
        this.f46403d1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i34;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i35 = 5;
        this.f46407f1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i35;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i36 = 7;
        this.f46411h1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i36;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i37 = 8;
        this.f46415j1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i37;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i38 = 0;
        this.f46418k1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i39 = 9;
        this.f46420l1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i39;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i44 = 1;
        this.f46422m1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i45 = 10;
        this.f46424n1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i45;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i46 = 3;
        t tVarB = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i46) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        this.f46426o1 = tVarB;
        final int i47 = 4;
        this.f46428p1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i47) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i48 = 5;
        this.f46430q1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i48) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i49 = 7;
        this.f46432r1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i49) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i54 = 8;
        t tVarB2 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i54) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        this.f46434s1 = tVarB2;
        final int i55 = 11;
        this.f46436t1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i55;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        this.f46438u1 = new y0();
        final int i56 = 9;
        this.f46440v1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i56) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i57 = 12;
        this.f46442w1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i57;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i58 = 10;
        this.f46444x1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i58) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i59 = 11;
        this.f46446y1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i64 = 14;
        this.f46448z1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i64;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i65 = 12;
        t tVarB3 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i65) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        this.A1 = tVarB3;
        final int i66 = 15;
        this.B1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i66;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i67 = 13;
        this.C1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i67) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i68 = 17;
        this.D1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i68;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i69 = 14;
        t tVarB4 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i69) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        this.E1 = tVarB4;
        final int i74 = 18;
        this.F1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i74;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i75 = 15;
        this.G1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i75) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i76 = 17;
        m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i76) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i77 = 18;
        this.H1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i77) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i78 = 19;
        this.I1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i78;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        this.J1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i78) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i79 = 20;
        this.K1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i79;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i84 = 21;
        this.L1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i84) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        this.M1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i84;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i85 = 22;
        this.N1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i85) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        this.O1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i85;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i86 = 23;
        this.P1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i86) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i87 = 24;
        this.Q1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i87;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        this.R1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i87) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i88 = 25;
        this.S1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i88) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i89 = 26;
        this.T1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i89) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i93 = 27;
        this.U1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i93) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i94 = 26;
        m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i94;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        final int i95 = 28;
        this.V1 = m.b(new e23.a() { // from class: mz1.b
            @Override // e23.a
            public final Object invoke() {
                switch (i95) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.w0();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 26:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 27:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    case 28:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                    default:
                        String[] strArr30 = AddTIEventViewModel.V2;
                        return new androidx.lifecycle.y0();
                }
            }
        });
        final int i96 = 27;
        this.W1 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i96;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        t tVarB5 = m.b(new mz1.c(0));
        this.X1 = tVarB5;
        this.Y1 = (y0) tVarB5.getValue();
        t tVarB6 = m.b(new mz1.c(1));
        this.Z1 = tVarB6;
        this.f46398a2 = (y0) tVarB6.getValue();
        this.f46400b2 = m.b(new mz1.c(2));
        this.f46402c2 = a6();
        this.f46404d2 = m.b(new mz1.c(3));
        final int i97 = 28;
        this.f46406e2 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i97;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        this.f46408f2 = m.b(new mz1.c(4));
        this.f46410g2 = t1.b(z5(), new mz1.d(this, 0));
        this.f46412h2 = m.b(new mz1.c(6));
        final int i98 = 29;
        this.f46414i2 = m.b(new e23.a(this) { // from class: mz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTIEventViewModel f121647b;

            {
                this.f121647b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i98;
                AddTIEventViewModel addTIEventViewModel = this.f121647b;
                switch (i110) {
                    case 0:
                        String[] strArr = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.W0.getValue();
                    case 1:
                        String[] strArr2 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y0.getValue();
                    case 2:
                        String[] strArr3 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.F5();
                    case 3:
                        String[] strArr4 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.k5();
                    case 4:
                        String[] strArr5 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.E5();
                    case 5:
                        String[] strArr6 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46405e1.getValue();
                    case 6:
                        String[] strArr7 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Y.getValue();
                    case 7:
                        String[] strArr8 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.m5();
                    case 8:
                        String[] strArr9 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue();
                    case 9:
                        String[] strArr10 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.H5();
                    case 10:
                        String[] strArr11 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.M5();
                    case 11:
                        String[] strArr12 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46434s1.getValue();
                    case 12:
                        String[] strArr13 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.r5();
                    case 13:
                        String[] strArr14 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.W5();
                    case 14:
                        String[] strArr15 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46446y1.getValue();
                    case 15:
                        String[] strArr16 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.A1.getValue();
                    case 16:
                        String[] strArr17 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.Q5();
                    case 17:
                        String[] strArr18 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.B5();
                    case 18:
                        String[] strArr19 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.E1.getValue();
                    case 19:
                        String[] strArr20 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.H1.getValue();
                    case 20:
                        String[] strArr21 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.w5();
                    case 21:
                        String[] strArr22 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.L1.getValue();
                    case 22:
                        String[] strArr23 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.N1.getValue();
                    case 23:
                        String[] strArr24 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.Q0.getValue();
                    case 24:
                        String[] strArr25 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.P1.getValue();
                    case 25:
                        String[] strArr26 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.y5();
                    case 26:
                        return (androidx.lifecycle.y0) addTIEventViewModel.U1.getValue();
                    case 27:
                        String[] strArr27 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.d6();
                    case 28:
                        String[] strArr28 = AddTIEventViewModel.V2;
                        return addTIEventViewModel.c6();
                    default:
                        String[] strArr29 = AddTIEventViewModel.V2;
                        return (androidx.lifecycle.y0) addTIEventViewModel.f46412h2.getValue();
                }
            }
        });
        this.f46416j2 = m.b(new mz1.c(7));
        this.f46419k2 = m.b(new mz1.e(this, 1));
        this.f46421l2 = m.b(new mz1.c(8));
        m.b(new mz1.e(this, 2));
        this.f46423m2 = m.b(new mz1.c(9));
        this.f46425n2 = m.b(new mz1.e(this, 3));
        ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).a();
        this.f46427o2 = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
        this.f46429p2 = u0.g(d60.b.f57806c);
        sy1.c.f161291c.getClass();
        this.f46431q2 = new sy1.c();
        sy1.a.C3043a c3043a = sy1.a.f161285b;
        ky1.a aVar = (ky1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ky1.a.class, new c83.h.a[0], null, null, null, 120);
        c3043a.getClass();
        aVar.getClass();
        this.f46433r2 = new sy1.a(aVar);
        this.f46445x2 = "";
        if (!z14) {
            Q5().m(ny1.g.IN_PERSON);
            y0<Boolean> y0VarA5 = A5();
            Boolean bool = Boolean.FALSE;
            y0VarA5.m(bool);
            F5().m(bool);
            m5().m(null);
            H5().m(null);
            ((y0) tVarB.getValue()).m(null);
            R5().m(null);
            ((y0) tVarB2.getValue()).m(bool);
            ((y0) tVarB3.getValue()).m(Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR));
            B5().m(ny1.e.DISTANCE);
            ((y0) tVarB4.getValue()).m(Boolean.TRUE);
        }
        t tVarB7 = m.b(new mz1.c(10));
        this.L2 = tVarB7;
        this.M2 = (y0) tVarB7.getValue();
        y0<ky1.b<vo0.f>> y0Var = new y0<>();
        y0Var.m(null);
        this.N2 = y0Var;
        this.O2 = new LinkedHashMap<>();
        this.P2 = new ReentrantLock();
        this.R2 = 5000.0d;
        this.S2 = 10000.0d;
        this.T2 = 21097.5d;
        this.U2 = 42195.0d;
    }

    public static m3 J5(gg0.i iVar) {
        iVar.getClass();
        int i14 = b.f46450a[iVar.ordinal()];
        if (i14 == 1) {
            return m3.METER;
        }
        if (i14 != 2) {
            return i14 != 4 ? m3.KILOMETER : m3.YARD;
        }
        return m3.MILE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object X4(AddTIEventViewModel addTIEventViewModel, Context context, k kVar, v13.c cVar) throws IOException {
        mz1.s sVar;
        k kVar2;
        addTIEventViewModel.getClass();
        if (cVar instanceof mz1.s) {
            sVar = (mz1.s) cVar;
            int i14 = sVar.f121924d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f121924d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new mz1.s(addTIEventViewModel, cVar);
            }
        } else {
            sVar = new mz1.s(addTIEventViewModel, cVar);
        }
        Object obj = sVar.f121922b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f121924d;
        if (i15 == 0) {
            r.b(obj);
            Long id3 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            id3.getClass();
            long jLongValue = id3.longValue();
            sVar.f121921a = kVar;
            sVar.f121924d = 1;
            Object objR6 = addTIEventViewModel.R6(context, jLongValue, sVar);
            if (objR6 == obj2) {
                return obj2;
            }
            kVar2 = kVar;
            obj = objR6;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k kVar3 = sVar.f121921a;
            r.b(obj);
            kVar2 = kVar3;
        }
        fg0.m mVar = (fg0.m) obj;
        k kVarD = k.d(kVar2, null, null, null, mVar != null ? mVar.getMediaUuid() : null, mVar != null ? mVar.d() : null, null, null, -4325377);
        y0<g3<k>> y0VarW5 = addTIEventViewModel.w5();
        g3.f35298f.getClass();
        y0VarW5.j(g3.a.d(kVarD));
        ((y0) addTIEventViewModel.G1.getValue()).j(g3.a.d(mVar));
        ht.a aVar = ht.a.f85464a;
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("EventImageUploadSuccessful", mVar != null);
        Unit unit = Unit.INSTANCE;
        aVar.getClass();
        ht.a.a(bundle, "EventImageUploadSuccessful");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object Y4(AddTIEventViewModel addTIEventViewModel, Context context, long j8, v13.c cVar) throws IOException {
        mz1.t tVar;
        addTIEventViewModel.getClass();
        if (cVar instanceof mz1.t) {
            tVar = (mz1.t) cVar;
            int i14 = tVar.f121934c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f121934c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new mz1.t(addTIEventViewModel, cVar);
            }
        } else {
            tVar = new mz1.t(addTIEventViewModel, cVar);
        }
        Object objAwait = tVar.f121932a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f121934c;
        if (i15 == 0) {
            r.b(objAwait);
            zf0.d dVar = addTIEventViewModel.f204384a;
            ArrayList arrayListS6 = addTIEventViewModel.s6(context);
            tVar.f121934c = 1;
            objAwait = dVar.f204344a.s(j8, arrayListS6).await(tVar);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objAwait);
        }
        a0 a0Var = (a0) objAwait;
        if (a0Var.f25745a.isSuccessful()) {
            addTIEventViewModel.O4().j(g3.a.e(g3.f35298f));
        } else {
            String strH = am.j.h(a0Var.f25745a.code(), "Problem in uploading new event image in editing ");
            p92.y.f136664a.getClass();
            p92.y.a.c("AddTIEventViewModel", strH);
            addTIEventViewModel.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }

    public static ArrayList Z4(com.garmin.android.apps.connectmobile.courses.model.d dVar, List list) {
        ArrayList arrayList = new ArrayList();
        if (dVar != null && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.garmin.android.apps.connectmobile.workouts.data.model.k kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) it.next();
                arrayList.add(kVar);
                if (kVar.getEventLegActivityType() == f5(dVar)) {
                    String str = dVar.courseId;
                    com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, str != null ? d53.t.i(str) : null, null, null, 62);
                    arrayList.remove(kVar);
                    arrayList.add(kVarB);
                }
            }
        }
        return arrayList;
    }

    public static bg0.a.c b5(com.garmin.android.apps.connectmobile.workouts.data.model.k kVar, gg0.i iVar) {
        gg0.i unit;
        Double value;
        iVar.getClass();
        double dDoubleValue = (kVar == null || (value = kVar.getValue()) == null) ? 0.0d : value.doubleValue();
        if (kVar == null || (unit = kVar.getUnit()) == null) {
            unit = gg0.i.KILOMETER;
        }
        m3 m3VarJ5 = J5(unit);
        m3 m3VarJ6 = J5(iVar);
        l3.f23124b.getClass();
        Double dValueOf = Double.valueOf(l3.a.g(dDoubleValue, m3VarJ5, m3VarJ6));
        bg0.a.b bVarB = iVar.b();
        if (bVarB == null) {
            bVarB = bg0.a.b.KILOMETER;
        }
        return new bg0.a.c(dValueOf, bVarB);
    }

    public static bg0.a.c b6(com.garmin.android.apps.connectmobile.workouts.data.model.k kVar, y yVar) {
        Double dValueOf = Double.valueOf(0.0d);
        if (kVar == null) {
            return new bg0.a.c(dValueOf, bg0.a.b.KILOMETER);
        }
        int i14 = b.f46456g[yVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return (kVar.getEventLegActivityType() == m52.c.SWIMMING || kVar.getEventLegActivityType() == m52.c.OPEN_WATER_SWIMMING || kVar.getEventLegActivityType() == m52.c.LAP_SWIMMING) ? b5(kVar, gg0.i.METER) : b5(kVar, gg0.i.KILOMETER);
        }
        if (i14 == 3) {
            return kVar.getEventLegActivityType() == m52.c.SWIMMING ? b5(kVar, gg0.i.YARD) : b5(kVar, gg0.i.MILE);
        }
        if (i14 != 4) {
            return new bg0.a.c(dValueOf, bg0.a.b.KILOMETER);
        }
        return kVar.getEventLegActivityType() == m52.c.SWIMMING ? b5(kVar, gg0.i.METER) : b5(kVar, gg0.i.MILE);
    }

    public static com.garmin.android.apps.connectmobile.courses.model.d e5(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (am.z0.g0(((com.garmin.android.apps.connectmobile.courses.model.d) obj2).C())) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.courses.model.d) obj;
    }

    public static m52.c f5(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        if (dVar == null) {
            return null;
        }
        switch (b.f46451b[dVar.C().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return m52.c.RUNNING;
            case 4:
            case 5:
            case 6:
            case 7:
                return m52.c.CYCLING;
            default:
                m52.c.a aVar = m52.c.f116667g;
                String str = dVar.C().f4358a;
                aVar.getClass();
                return m52.c.a.a(str);
        }
    }

    public static boolean g6(List list, List list2) {
        Object next;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            return false;
        }
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) it.next();
            Iterator it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(dVar.courseId, ((com.garmin.android.apps.connectmobile.courses.model.d) next).courseId));
            if (next == null) {
                return true;
            }
        }
        return false;
    }

    public static com.garmin.android.apps.connectmobile.courses.model.d h5(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (am.z0.h0(((com.garmin.android.apps.connectmobile.courses.model.d) obj2).C())) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.courses.model.d) obj;
    }

    public final y0<Boolean> A5() {
        return (y0) this.U0.getValue();
    }

    public final void A6(String str) {
        str.getClass();
        ((y0) this.X1.getValue()).m(str);
    }

    public final y0<ny1.e> B5() {
        return (y0) this.C1.getValue();
    }

    public final void B6(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        Object next;
        if (dVar == null) {
            List<com.garmin.android.apps.connectmobile.courses.model.d> listD = m5().d();
            if (listD == null || listD.isEmpty()) {
                m5().m(null);
                return;
            }
            return;
        }
        List<com.garmin.android.apps.connectmobile.courses.model.d> listD2 = m5().d();
        if (listD2 == null) {
            listD2 = new ArrayList<>();
        }
        Iterator<T> it = listD2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m52.c cVarF5 = f5((com.garmin.android.apps.connectmobile.courses.model.d) next);
            m52.c cVarF6 = f5(dVar);
            if (cVarF5 != null && cVarF6 != null && cVarF5 == cVarF6) {
                break;
            }
        }
        com.garmin.android.apps.connectmobile.courses.model.d dVar2 = (com.garmin.android.apps.connectmobile.courses.model.d) next;
        if (dVar2 != null) {
            listD2.remove(dVar2);
        }
        listD2.add(dVar);
        m5().m(listD2);
        if (p6()) {
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = W5().d();
            ArrayList arrayListZ4 = Z4(dVar, fVarD != null ? fVarD.f() : null);
            y0<com.garmin.android.apps.connectmobile.workouts.data.model.f> y0VarW5 = W5();
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD2 = W5().d();
            y0VarW5.m(fVarD2 != null ? com.garmin.android.apps.connectmobile.workouts.data.model.f.b(fVarD2, arrayListZ4) : null);
        }
        double d14 = dVar.distanceInMeters;
        if (d14 > 0.0d) {
            lz1.f.f115404a.getClass();
            bg0.a.c cVarE = lz1.f.a.e(d14);
            ((y0) this.f46446y1.getValue()).m(cVarE);
            r5().m(cVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fg0.r C5() {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!m6() && (S5().d() == null || R5().d() == null)) {
            return null;
        }
        fg0.r rVar = new fg0.r(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        DateTime dateTimeD = S5().d();
        int hourOfDay = dateTimeD != null ? dateTimeD.getHourOfDay() : 8;
        DateTime dateTimeD2 = S5().d();
        int minuteOfHour = dateTimeD2 != null ? dateTimeD2.getMinuteOfHour() : 0;
        l3.f23124b.getClass();
        String strD1 = l3.a.d1((hourOfDay * 60) + minuteOfHour);
        if (strD1 == null) {
            strD1 = "";
        }
        rVar.i(strD1);
        my1.g gVarD = R5().d();
        rVar.j(gVarD != null ? gVarD.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String() : null);
        return rVar;
    }

    public final void C6(bg0.a.c cVar) {
        r5().m(cVar);
    }

    public final s0<gg0.f> D5() {
        return (s0) this.N0.getValue();
    }

    public final void D6(Integer num) {
        ((y0) this.A1.getValue()).m(num);
    }

    public final y0<gg0.f> E5() {
        return (y0) this.M0.getValue();
    }

    public final void E6(boolean z14) {
        A5().m(Boolean.valueOf(z14));
    }

    public final y0<Boolean> F5() {
        return (y0) this.f46397a1.getValue();
    }

    public final void F6(gg0.f fVar) {
        fVar.getClass();
        E5().m(fVar);
        ((y0) this.E1.getValue()).m(Boolean.valueOf(E5().d() != gg0.f.f77140p));
    }

    public final s0<com.garmin.android.library.mapsdkadapter.f> G5() {
        return (s0) this.f46420l1.getValue();
    }

    public final void G6(ny1.e eVar) {
        eVar.getClass();
        B5().m(eVar);
    }

    public final y0<com.garmin.android.library.mapsdkadapter.f> H5() {
        return (y0) this.f46418k1.getValue();
    }

    public final void H6(boolean z14) {
        F5().m(Boolean.valueOf(z14));
    }

    public final com.garmin.android.library.mapsdkadapter.f I5() {
        return G5().d();
    }

    public final void I6(com.garmin.android.library.mapsdkadapter.f fVar) {
        H5().m(fVar);
    }

    public final void J6(String str) {
        M5().m(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K5(com.garmin.android.library.mapsdkadapter.f fVar, v13.c cVar) {
        mz1.l lVar;
        if (cVar instanceof mz1.l) {
            lVar = (mz1.l) cVar;
            int i14 = lVar.f121824c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f121824c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new mz1.l(this, cVar);
            }
        } else {
            lVar = new mz1.l(this, cVar);
        }
        Object objI5 = lVar.f121822a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f121824c;
        if (i15 == 0) {
            r.b(objI5);
            lVar.f121824c = 1;
            objI5 = i5(fVar, lVar);
            if (objI5 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objI5);
        }
        Address address = (Address) objI5;
        if (address != null) {
            String locality = address.getLocality();
            if (locality != null) {
                String adminArea = address.getAdminArea();
                if (adminArea != null) {
                    J6(locality + ", " + adminArea);
                } else {
                    J6(locality);
                }
            } else {
                String adminArea2 = address.getAdminArea();
                if (adminArea2 != null) {
                    J6(adminArea2);
                } else {
                    J6(address.toString());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void K6(String str) {
        str.getClass();
        y5().m(str);
    }

    public final void L5(com.garmin.android.library.mapsdkadapter.f fVar) {
        fVar.getClass();
        ge1.b.T(v1.a(this), null, null, new mz1.m(this, fVar, null), 3);
    }

    public final void L6(DateTime dateTime) {
        DateTime dateTimeWithSecondOfMinute;
        S5().m((dateTime == null || (dateTimeWithSecondOfMinute = dateTime.withSecondOfMinute(0)) == null) ? null : dateTimeWithSecondOfMinute.withMillisOfSecond(0));
    }

    public final y0<String> M5() {
        return (y0) this.f46422m1.getValue();
    }

    public final void M6(my1.g gVar) {
        R5().m(gVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Double] */
    public final y0 N5() {
        y0 y0Var = new y0();
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        com.garmin.android.library.mapsdkadapter.f fVarI5 = I5();
        if (fVarI5 != null) {
            LatLng latLng = fVarI5.f50283a;
            r0Var.f105810a = Double.valueOf(latLng.latitude);
            r0Var2.f105810a = Double.valueOf(latLng.longitude);
        }
        ge1.b.T(v1.a(this), null, null, new mz1.n(y0Var, this, r0Var, r0Var2, null), 3);
        return y0Var;
    }

    public final void N6(bg0.a.c cVar, m52.c cVar2) {
        Object next;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2;
        Number number;
        Object next2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        cVar2.getClass();
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = W5().d();
        Double dValueOf = null;
        i iVarG = fVarD != null ? fVarD.getName() : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD2 = W5().d();
        ArrayList arrayList = (fVarD2 == null || (listF = fVarD2.f()) == null) ? new ArrayList() : new ArrayList(listF);
        if (cVar2 == m52.c.SWIMMING || cVar2 == m52.c.OPEN_WATER_SWIMMING || cVar2 == m52.c.LAP_SWIMMING) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                if (kVar2.getEventLegActivityType() == m52.c.OPEN_WATER_SWIMMING || kVar2.getEventLegActivityType() == m52.c.LAP_SWIMMING) {
                    break;
                }
            } while (kVar2.getEventLegActivityType() != m52.c.SWIMMING);
            kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
        } else {
            Iterator it3 = arrayList.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != cVar2);
            kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
        }
        Integer courseId = kVar != null ? kVar.getCourseId() : null;
        int i14 = cVar2.f116676b;
        lz1.f.f115404a.getClass();
        gg0.i iVarI = lz1.f.a.i(cVar);
        gg0.h hVar = gg0.h.DISTANCE;
        if (cVar != null && (number = cVar.f17834a) != null) {
            dValueOf = Double.valueOf(number.doubleValue());
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3 = new com.garmin.android.apps.connectmobile.workouts.data.model.k(courseId, cVar2, i14, iVarI, hVar, dValueOf);
        p005kotlin.jvm.internal.y0.a(arrayList).remove(kVar);
        arrayList.add(kVar3);
        og0.a.f131967a.getClass();
        W5().m(new com.garmin.android.apps.connectmobile.workouts.data.model.f(arrayList, iVarG, og0.a.f(arrayList)));
    }

    public final y0<String> O5() {
        return (y0) this.T.getValue();
    }

    public final void O6(i iVar) {
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        double dDoubleValue;
        Object next;
        iVar.getClass();
        List list = (List) ((y0) this.Q0.getValue()).d();
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next).getName() != iVar);
            fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next;
        } else {
            fVar = null;
        }
        this.E2 = fVar != null ? fVar.getName() : null;
        ArrayList arrayList = new ArrayList();
        if (fVar != null && (listF = fVar.f()) != null) {
            for (com.garmin.android.apps.connectmobile.workouts.data.model.k kVar : listF) {
                arrayList.add(kVar);
                if (kVar.getEventLegActivityType() == m52.c.RUNNING || kVar.getEventLegActivityType() == m52.c.CYCLING) {
                    gg0.i unit = kVar.getUnit();
                    int i14 = unit == null ? -1 : b.f46450a[unit.ordinal()];
                    if (i14 == 1) {
                        lz1.f.a aVar = lz1.f.f115404a;
                        Double value = kVar.getValue();
                        dDoubleValue = value != null ? value.doubleValue() : 0.0d;
                        aVar.getClass();
                        bg0.a.c cVarE = lz1.f.a.e(dDoubleValue);
                        Number number = cVarE.f17834a;
                        Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                        gg0.i.a aVar2 = gg0.i.f77162b;
                        bg0.a.b bVar = cVarE.f17835b;
                        aVar2.getClass();
                        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, null, gg0.i.a.a(bVar), dValueOf, 23);
                        arrayList.remove(kVar);
                        arrayList.add(kVarB);
                    } else if (i14 == 2) {
                        lz1.f.a aVar3 = lz1.f.f115404a;
                        l3.a aVar4 = l3.f23124b;
                        Double value2 = kVar.getValue();
                        dDoubleValue = value2 != null ? value2.doubleValue() : 0.0d;
                        aVar4.getClass();
                        aVar3.getClass();
                        bg0.a.c cVarE2 = lz1.f.a.e(dDoubleValue * 1609.344d);
                        Number number2 = cVarE2.f17834a;
                        Double dValueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
                        gg0.i.a aVar5 = gg0.i.f77162b;
                        bg0.a.b bVar2 = cVarE2.f17835b;
                        aVar5.getClass();
                        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB2 = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, null, gg0.i.a.a(bVar2), dValueOf2, 23);
                        arrayList.remove(kVar);
                        arrayList.add(kVarB2);
                    } else if (i14 == 3) {
                        lz1.f.a aVar6 = lz1.f.f115404a;
                        l3.a aVar7 = l3.f23124b;
                        Double value3 = kVar.getValue();
                        dDoubleValue = value3 != null ? value3.doubleValue() : 0.0d;
                        aVar7.getClass();
                        aVar6.getClass();
                        bg0.a.c cVarE3 = lz1.f.a.e(dDoubleValue * 1000.0d);
                        Number number3 = cVarE3.f17834a;
                        Double dValueOf3 = number3 != null ? Double.valueOf(number3.doubleValue()) : null;
                        gg0.i.a aVar8 = gg0.i.f77162b;
                        bg0.a.b bVar3 = cVarE3.f17835b;
                        aVar8.getClass();
                        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB3 = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, null, gg0.i.a.a(bVar3), dValueOf3, 23);
                        arrayList.remove(kVar);
                        arrayList.add(kVarB3);
                    } else if (i14 == 4) {
                        lz1.f.a aVar9 = lz1.f.f115404a;
                        l3.a aVar10 = l3.f23124b;
                        Double value4 = kVar.getValue();
                        dDoubleValue = value4 != null ? value4.doubleValue() : 0.0d;
                        aVar10.getClass();
                        aVar9.getClass();
                        bg0.a.c cVarE4 = lz1.f.a.e(dDoubleValue * 0.9144d);
                        Number number4 = cVarE4.f17834a;
                        Double dValueOf4 = number4 != null ? Double.valueOf(number4.doubleValue()) : null;
                        gg0.i.a aVar11 = gg0.i.f77162b;
                        bg0.a.b bVar4 = cVarE4.f17835b;
                        aVar11.getClass();
                        com.garmin.android.apps.connectmobile.workouts.data.model.k kVarB4 = com.garmin.android.apps.connectmobile.workouts.data.model.k.b(kVar, null, gg0.i.a.a(bVar4), dValueOf4, 23);
                        arrayList.remove(kVar);
                        arrayList.add(kVarB4);
                    }
                }
            }
        }
        W5().m(fVar != null ? com.garmin.android.apps.connectmobile.workouts.data.model.f.b(fVar, arrayList) : null);
    }

    public final ny1.g P5() {
        ny1.g gVarD = Q5().d();
        return gVarD == null ? ny1.g.IN_PERSON : gVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P6(Double d14, Double d15, boolean z14) {
        p pVar;
        ez1.d dVar;
        my1.d dVar2;
        my1.d dVar3;
        my1.d dVar4;
        ez1.d dVar5;
        if (d14 == null || d15 == null) {
            I6(null);
            J6(null);
            pVar = null;
        } else {
            com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(d14.doubleValue(), d15.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
            I6(fVar);
            if (z14) {
                L5(fVar);
            }
            pVar = new p(d14, d15);
        }
        xy1.a aVarD = z5().d();
        if (pVar != null) {
            xy1.a aVar = aVarD;
            if (aVar != null && (dVar4 = aVar.f192698e) != null && (dVar5 = dVar4.f121489f) != null && dVar5.w() == ez1.f.WORLD_WIDE.ordinal()) {
                bg0.a.f17827a.getClass();
                dVar = bg0.a.C0255a.e() ? ez1.e.KM_100 : ez1.f.MILES_50;
            } else if (aVar == null || (dVar3 = aVar.f192698e) == null || (dVar = dVar3.f121489f) == null) {
                dVar = ez1.f.WORLD_WIDE;
            }
        } else {
            dVar = ez1.f.WORLD_WIDE;
        }
        ez1.d dVar6 = dVar;
        xy1.a aVar2 = aVarD;
        if (aVar2 == null || (dVar2 = aVar2.f192698e) == null) {
            return;
        }
        z5().m(xy1.a.a(xy1.a.a(aVar2, null, null, null, null, my1.d.b(dVar2, null, null, null, null, null, dVar6, null, false, null, null, null, 0.0d, 0.0d, null, null, Boolean.valueOf(pVar != null), 917471), 15), null, null, pVar != null ? (Double) pVar.f128594a : null, pVar != null ? (Double) pVar.f128595b : null, null, 19));
    }

    public final y0<ny1.g> Q5() {
        return (y0) this.f46417k0.getValue();
    }

    public final void Q6(my1.d dVar) {
        xy1.a aVarD = z5().d();
        z5().m(aVarD != null ? xy1.a.a(aVarD, dVar.f121488e, null, null, null, dVar, 14) : null);
    }

    public final y0<my1.g> R5() {
        return (y0) this.f46428p1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object R6(Context context, long j8, v13.c cVar) throws IOException {
        mz1.a0 a0Var;
        if (cVar instanceof mz1.a0) {
            a0Var = (mz1.a0) cVar;
            int i14 = a0Var.f121650c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f121650c = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new mz1.a0(this, cVar);
            }
        } else {
            a0Var = new mz1.a0(this, cVar);
        }
        Object objJ = a0Var.f121648a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f121650c;
        if (i15 == 0) {
            r.b(objJ);
            ArrayList arrayListS6 = s6(context);
            a0Var.f121650c = 1;
            zf0.d dVar = this.f204384a;
            dVar.getClass();
            objJ = f0.J(dVar, new zf0.f0(dVar, j8, arrayListS6, null), a0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (fg0.m) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "Problem in uploading new event image in editing ");
        p92.y.f136664a.getClass();
        p92.y.a.c("AddTIEventViewModel", strG);
        return null;
    }

    public final y0<DateTime> S5() {
        return (y0) this.f46432r1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void S6() {
        boolean zF;
        boolean z14;
        Number number;
        Double value;
        Double value2;
        Double value3;
        List<com.garmin.android.apps.connectmobile.courses.model.d> listD = l5().d();
        if (listD != null) {
            zF = true;
            for (com.garmin.android.apps.connectmobile.courses.model.d dVar : listD) {
                if (s.g(((s0) this.V0.getValue()).d(), Boolean.TRUE)) {
                    zF = dVar.F();
                }
            }
        } else {
            zF = true;
        }
        boolean z15 = P5() != ny1.g.IN_PERSON || (H5().d() != null && g22.n.d((String) ((s0) this.f46424n1.getValue()).d()));
        boolean z16 = R5().d() != null;
        boolean z17 = ((y0) this.K0.getValue()).d() != 0;
        boolean z18 = S5().d() != null;
        if (!k6()) {
            z14 = true;
        } else if (B5().d() != ny1.e.DISTANCE) {
            Integer num = (Integer) ((y0) this.A1.getValue()).d();
            if (num == null || num.intValue() <= 0) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else if (p6()) {
            com.garmin.android.apps.connectmobile.workouts.data.model.k kVarX5 = X5(m52.c.RUNNING);
            com.garmin.android.apps.connectmobile.workouts.data.model.k kVarX6 = X5(m52.c.CYCLING);
            com.garmin.android.apps.connectmobile.workouts.data.model.k kVarX7 = X5(m52.c.SWIMMING);
            if (kVarX7 == null) {
                kVarX7 = X5(m52.c.OPEN_WATER_SWIMMING);
            }
            if (kVarX7 == null) {
                kVarX7 = X5(m52.c.LAP_SWIMMING);
            }
            if (((kVarX5 == null || (value3 = kVarX5.getValue()) == null) ? 0.0d : value3.doubleValue()) != 0.0d) {
                if (((kVarX6 == null || (value2 = kVarX6.getValue()) == null) ? 0.0d : value2.doubleValue()) != 0.0d) {
                    if (((kVarX7 == null || (value = kVarX7.getValue()) == null) ? 0.0d : value.doubleValue()) != 0.0d) {
                        z14 = true;
                    }
                }
            }
            z14 = false;
        } else {
            bg0.a.c cVarD = r5().d();
            Double dValueOf = (cVarD == null || (number = cVarD.f17834a) == null) ? null : Double.valueOf(number.doubleValue());
            if (dValueOf == null || dValueOf.doubleValue() <= 0.0d) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        boolean z19 = z17 && z14;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Events-validate : isValidCourse -> ", "  isValidTimeZone ", " isValidDate ", zF, z16);
        kg.f.q(" isValidStartTime ", "isValidCompletionDistance -> ", sbM, z17, z18);
        sbM.append(z14);
        sbM.append("isValidLocation ");
        sbM.append(z15);
        String string = sbM.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AddTIEventViewModel", string);
        ny1.g gVarD = Q5().d();
        ny1.g gVar = ny1.g.VIRTUAL;
        t tVar = this.L1;
        if (gVarD == gVar) {
            ((y0) tVar.getValue()).m(Boolean.valueOf(z19));
        } else {
            ((y0) tVar.getValue()).m(Boolean.valueOf(z19 && zF && z15 && z16 && z18 && i6()));
        }
    }

    public final y0<fw.m<List<my1.g>>> T5() {
        return (y0) this.f46430q1.getValue();
    }

    public final void T6(String str) {
        str.getClass();
        if (str.length() == 0) {
            d6().j(g3.a.e(g3.f35298f));
        } else {
            d6().j(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(this), null, null, new g(str, null), 3);
        }
    }

    public final void U5() {
        fw.m<List<my1.g>> mVarD = T5().d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            ge1.b.T(v1.a(this), null, null, new d(null), 3);
        }
    }

    public final s0<com.garmin.android.apps.connectmobile.workouts.data.model.f> V5() {
        return (s0) this.P0.getValue();
    }

    public final y0<com.garmin.android.apps.connectmobile.workouts.data.model.f> W5() {
        return (y0) this.O0.getValue();
    }

    public final com.garmin.android.apps.connectmobile.workouts.data.model.k X5(m52.c cVar) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        cVar.getClass();
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = V5().d();
        Object obj = null;
        if (fVarD == null || (listF = fVarD.f()) == null) {
            return null;
        }
        for (Object obj2 : listF) {
            if (((com.garmin.android.apps.connectmobile.workouts.data.model.k) obj2).getEventLegActivityType() == cVar) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj;
    }

    public final y0 Y5() {
        y0 y0Var = new y0();
        ge1.b.T(v1.a(this), null, null, new mz1.p(y0Var, this, null), 3);
        return y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z5(v13.c cVar) {
        mz1.q qVar;
        if (cVar instanceof mz1.q) {
            qVar = (mz1.q) cVar;
            int i14 = qVar.f121900c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f121900c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new mz1.q(this, cVar);
            }
        } else {
            qVar = new mz1.q(this, cVar);
        }
        Object objJ = qVar.f121898a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f121900c;
        if (i15 == 0) {
            r.b(objJ);
            String string = LocalDate.now().toString("yyyy-MM-dd");
            String string2 = LocalDate.now().plusYears(1).toString("yyyy-MM-dd");
            string.getClass();
            string2.getClass();
            qVar.f121900c = 1;
            zf0.d dVar = this.f204384a;
            dVar.getClass();
            objJ = f0.J(dVar, new zf0.v(dVar, string, string2, null), qVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                gg0.f eventType = ((k) obj).getEventType();
                if (eventType != null && eventType.d()) {
                    arrayList.add(obj);
                }
            }
            this.I = arrayList;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String string3 = ((v2.a) v2Var).f47383a.toString();
            p92.y.f136664a.getClass();
            p92.y.a.c("AddTIEventViewModel", string3);
        }
        return Unit.INSTANCE;
    }

    public final void a5() {
        String str;
        fg0.v vVar;
        fg0.v vVar2;
        bg0.a.b bVarB;
        com.garmin.android.apps.connectmobile.workouts.data.model.z zVarI;
        gg0.i iVarB;
        com.garmin.android.apps.connectmobile.workouts.data.model.z zVarI2;
        Double dF;
        String strValueOf = String.valueOf(u5().d());
        gg0.f fVarD = D5().d();
        if (fVarD == null || (str = fVarD.f77147a) == null) {
            str = "";
        }
        String str2 = str;
        com.garmin.android.library.mapsdkadapter.f fVarI5 = I5();
        w13.c cVar = j.f77179h;
        ArrayList arrayListK = n23.j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            arrayListK.add(((j) bVar.next()).toString());
        }
        String[] strArr = (String[]) arrayListK.toArray(new String[0]);
        if (B5().d() != ny1.e.DISTANCE) {
            String lowerCase = gg0.h.TIME.toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Integer numD = t5().d();
            Double dValueOf = numD != null ? Double.valueOf(numD.intValue()) : null;
            Integer numD2 = t5().d();
            vVar = new fg0.v(lowerCase, dValueOf, numD2 != null ? Double.valueOf(numD2.intValue()) : null);
        } else {
            if (!p6()) {
                bg0.a.c cVarD = r5().d();
                if (cVarD != null) {
                    og0.a aVar = og0.a.f131967a;
                    lz1.f.f115404a.getClass();
                    double d14 = lz1.f.a.d(cVarD);
                    aVar.getClass();
                    vVar = og0.a.l(d14);
                } else {
                    vVar2 = null;
                }
                ge1.b.T(v1.a(this), null, null, new c(str2, strValueOf, fVarI5, vVar2, strArr, null), 3);
            }
            lz1.f.a aVar2 = lz1.f.f115404a;
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD2 = W5().d();
            double dDoubleValue = (fVarD2 == null || (zVarI2 = fVarD2.getTotalTarget()) == null || (dF = zVarI2.getValue()) == null) ? 0.0d : dF.doubleValue();
            aVar2.getClass();
            Double dValueOf2 = Double.valueOf(lz1.f.a.o(dDoubleValue, 2));
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD3 = W5().d();
            if (fVarD3 == null || (zVarI = fVarD3.getTotalTarget()) == null || (iVarB = zVarI.getUnit()) == null || (bVarB = iVarB.b()) == null) {
                bVarB = bg0.a.b.METER;
            }
            bg0.a.c cVar2 = new bg0.a.c(dValueOf2, bVarB);
            og0.a aVar3 = og0.a.f131967a;
            double d15 = lz1.f.a.d(cVar2);
            aVar3.getClass();
            vVar = og0.a.l(d15);
        }
        vVar2 = vVar;
        ge1.b.T(v1.a(this), null, null, new c(str2, strValueOf, fVarI5, vVar2, strArr, null), 3);
    }

    public final y0<Uri> a6() {
        return (y0) this.f46400b2.getValue();
    }

    public final void c5() {
        if (H5().d() != null) {
            fg0.y yVar = new fg0.y(null, null, 3, null);
            com.garmin.android.library.mapsdkadapter.f fVarD = H5().d();
            yVar.f(fVarD != null ? Double.valueOf(fVarD.f50283a.latitude) : null);
            com.garmin.android.library.mapsdkadapter.f fVarD2 = H5().d();
            yVar.g(fVarD2 != null ? Double.valueOf(fVarD2.f50283a.longitude) : null);
            k kVar = this.f46435s2;
            if (kVar != null) {
                kVar.V0(yVar);
            } else {
                s.m("eventDTO");
                throw null;
            }
        }
    }

    public final y0<g3<List<o>>> c6() {
        return (y0) this.f46404d2.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d5(String str, v13.c cVar) {
        mz1.h hVar;
        if (cVar instanceof mz1.h) {
            hVar = (mz1.h) cVar;
            int i14 = hVar.f121771d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f121771d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new mz1.h(this, cVar);
            }
        } else {
            hVar = new mz1.h(this, cVar);
        }
        Object objJ = hVar.f121769b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f121771d;
        Object obj = null;
        if (i15 == 0) {
            r.b(objJ);
            hVar.f121768a = str;
            hVar.f121771d = 1;
            sy1.c cVar2 = this.f46431q2;
            cVar2.getClass();
            objJ = f0.J(cVar2, new sy1.d(cVar2, null), hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hVar.f121768a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strI = androidx.room.a0.i("Events-fetchAndFindTmeZoneDTOByTimeZoneID: failed to get timezone data : ", ((v2.a) v2Var).f47384b, StringUtils.SPACE);
            p92.y.f136664a.getClass();
            p92.y.a.c("EventBaseViewModel", strI);
            return null;
        }
        List list = (List) ((v2.b) v2Var).f47386a;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (s.g(((my1.g) obj2).getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String(), str)) {
                obj = obj2;
                break;
            }
        }
        return (my1.g) obj;
    }

    public final y0<g3<fg0.s>> d6() {
        return (y0) this.V1.getValue();
    }

    public final void e6(List<com.garmin.android.apps.connectmobile.courses.model.d> list) {
        Object next;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = W5().d();
            if (fVarD != null && (listF = fVarD.f()) != null) {
                Iterator<T> it = listF.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.garmin.android.apps.connectmobile.workouts.data.model.k.b((com.garmin.android.apps.connectmobile.workouts.data.model.k) it.next(), null, null, null, 62));
                }
            }
            y0<com.garmin.android.apps.connectmobile.workouts.data.model.f> y0VarW5 = W5();
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD2 = W5().d();
            y0VarW5.m(fVarD2 != null ? com.garmin.android.apps.connectmobile.workouts.data.model.f.b(fVarD2, arrayList) : null);
            ArrayList arrayList2 = new ArrayList();
            List<com.garmin.android.apps.connectmobile.courses.model.d> listD = m5().d();
            if (listD != null) {
                for (com.garmin.android.apps.connectmobile.courses.model.d dVar : listD) {
                    Iterator<T> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!s.g(((com.garmin.android.apps.connectmobile.courses.model.d) next).courseId, dVar.courseId));
                    com.garmin.android.apps.connectmobile.courses.model.d dVar2 = (com.garmin.android.apps.connectmobile.courses.model.d) next;
                    if (dVar2 != null) {
                        arrayList2.add(dVar2);
                        com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD3 = W5().d();
                        ArrayList arrayListZ4 = Z4(dVar2, fVarD3 != null ? fVarD3.f() : null);
                        y0<com.garmin.android.apps.connectmobile.workouts.data.model.f> y0VarW6 = W5();
                        com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD4 = W5().d();
                        y0VarW6.m(fVarD4 != null ? com.garmin.android.apps.connectmobile.workouts.data.model.f.b(fVarD4, arrayListZ4) : null);
                        k kVar = this.f46437t2;
                        if (kVar != null) {
                            kVar.x0(Z4(dVar2, kVar.h()));
                        }
                    }
                }
            }
            m5().m(arrayList2.isEmpty() ? null : arrayList2);
            y0<List<x0>> y0VarK5 = k5();
            lz1.f.a aVar = lz1.f.f115404a;
            gg0.f fVarD5 = E5().d();
            aVar.getClass();
            y0VarK5.m(new ArrayList(h6(list, lz1.f.a.g(fVarD5))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f6(List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list, double d14, y yVar) {
        list.getClass();
        yVar.getClass();
        double dA = k52.g.a(d14, yVar);
        ((y0) this.Q0.getValue()).m(list);
        for (com.garmin.android.apps.connectmobile.workouts.data.model.f fVar : list) {
            gg0.i iVarB = fVar.getTotalTarget().getUnit();
            y yVarD = iVarB != null ? iVarB.d() : null;
            Double dF = fVar.getTotalTarget().getValue();
            double dA2 = k52.g.a(dF != null ? dF.doubleValue() : 0.0d, yVarD);
            og0.a.f131967a.getClass();
            p pVarX = og0.a.x(dA2, 0.01d);
            double dDoubleValue = ((Number) pVarX.f128594a).doubleValue();
            double dDoubleValue2 = ((Number) pVarX.f128595b).doubleValue();
            if (dDoubleValue <= dA && dA <= dDoubleValue2) {
                com.garmin.android.apps.connectmobile.workouts.data.model.k kVarD = fVar.d(m52.c.OPEN_WATER_SWIMMING);
                if (kVarD == null && (kVarD = fVar.d(m52.c.SWIMMING)) == null) {
                    kVarD = fVar.d(m52.c.LAP_SWIMMING);
                }
                N6(b6(kVarD, y.UNIT_DISTANCE_METER), m52.c.LAP_SWIMMING);
                m52.c cVar = m52.c.CYCLING;
                N6(b6(fVar.d(cVar), yVar), cVar);
                m52.c cVar2 = m52.c.RUNNING;
                N6(b6(fVar.d(cVar2), yVar), cVar2);
            }
        }
    }

    public final List<x0> h6(List<com.garmin.android.apps.connectmobile.courses.model.d> list, List<? extends x0> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            for (x0 x0Var : list2) {
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (x0Var == ((com.garmin.android.apps.connectmobile.courses.model.d) obj).C()) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    arrayList2.add(x0Var);
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object i5(com.garmin.android.library.mapsdkadapter.f fVar, v13.c cVar) {
        mz1.i iVar;
        if (cVar instanceof mz1.i) {
            iVar = (mz1.i) cVar;
            int i14 = iVar.f121780c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f121780c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new mz1.i(this, cVar);
            }
        } else {
            iVar = new mz1.i(this, cVar);
        }
        Object objA = iVar.f121778a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f121780c;
        if (i15 == 0) {
            r.b(objA);
            com.garmin.android.library.mapsdkadapter.g gVar = new com.garmin.android.library.mapsdkadapter.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            iVar.f121780c = 1;
            objA = gVar.f50285a.a(fVar, iVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        return h0.d0((List) objA);
    }

    public final boolean i6() {
        fg0.s sVar;
        CharSequence charSequence = (CharSequence) this.Y1.d();
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        g3<fg0.s> g3VarD = d6().d();
        return g22.n.d((g3VarD == null || (sVar = g3VarD.f35301b) == null) ? null : sVar.getNormalizedUrl());
    }

    public final Unit j5(String str) {
        ReentrantLock reentrantLock = this.P2;
        reentrantLock.lock();
        try {
            c2 c2Var = this.Q2;
            if (c2Var != null && c2Var.isActive()) {
                c2 c2Var2 = this.Q2;
                if (c2Var2 != null) {
                    c2Var2.c(null);
                }
                this.Q2 = null;
            }
            y0<ky1.b<vo0.f>> y0Var = this.N2;
            if (str == null || str.length() == 0) {
                y0Var.j(null);
            } else {
                vo0.f fVar = this.O2.get(str);
                if (fVar != null) {
                    y0Var.j(new ky1.b<>(fVar, null, false, false, false, 30, null));
                } else {
                    this.Q2 = ge1.b.T(v1.a(this), o53.s0.f129406a, null, new com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.a(this, str, null), 2);
                }
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean j6() {
        if (u5().d() != null) {
            return new LocalDate().isEqual(u5().d());
        }
        return true;
    }

    public final y0<List<x0>> k5() {
        return (y0) this.f46401c1.getValue();
    }

    public final boolean k6() {
        gg0.f fVarD = E5().d();
        switch (fVarD == null ? -1 : b.f46453d[fVarD.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final s0<List<com.garmin.android.apps.connectmobile.courses.model.d>> l5() {
        return (s0) this.f46411h1.getValue();
    }

    public final y0<List<com.garmin.android.apps.connectmobile.courses.model.d>> m5() {
        return (y0) this.f46409g1.getValue();
    }

    public final boolean m6() {
        return P5() == ny1.g.IN_PERSON;
    }

    public final s0<bg0.a.c> n5() {
        return (s0) this.f46448z1.getValue();
    }

    public final void n6(boolean z14) {
        ((y0) this.R1.getValue()).m(Boolean.valueOf(z14));
    }

    public final s0<zf0.a> o5() {
        return (s0) this.Z.getValue();
    }

    public final boolean o6() {
        return E5().d() == gg0.f.f77130f || E5().d() == gg0.f.f77132h || E5().d() == gg0.f.f77131g || E5().d() == gg0.f.f77134j || E5().d() == gg0.f.f77133i || E5().d() == gg0.f.f77138n || E5().d() == gg0.f.f77136l || E5().d() == gg0.f.f77144v;
    }

    public final DateTime p5() {
        DateTime dateTimeD = S5().d();
        if (dateTimeD != null) {
            return dateTimeD;
        }
        if (m6()) {
            return new DateTime();
        }
        return null;
    }

    public final boolean p6() {
        return E5().d() == gg0.f.f77136l;
    }

    public final s0<bg0.a.c> q5() {
        return (s0) this.f46442w1.getValue();
    }

    public final boolean q6(bg0.a.c cVar) {
        Number number = cVar != null ? cVar.f17834a : null;
        if (!k6()) {
            return true;
        }
        if (number == null) {
            return false;
        }
        double dDoubleValue = number.doubleValue();
        return dDoubleValue >= 0.0d && dDoubleValue <= og0.a.v(cVar.f17835b).doubleValue();
    }

    public final y0<bg0.a.c> r5() {
        return (y0) this.f46440v1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r6() {
        Number number;
        com.garmin.android.apps.connectmobile.workouts.data.model.z zVarI;
        com.garmin.android.apps.connectmobile.workouts.data.model.z zVarI2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF;
        List<com.garmin.android.apps.connectmobile.courses.model.d> listD;
        k kVar = new k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        this.f46435s2 = kVar;
        kVar.L0(y5().d());
        k kVar2 = this.f46435s2;
        if (kVar2 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar2.C0((LocalDate) ((y0) this.K0.getValue()).d());
        k kVar3 = this.f46435s2;
        if (kVar3 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar3.s1((String) ((y0) this.X1.getValue()).d());
        if (!p6() && (listD = m5().d()) != null && !listD.isEmpty()) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar = listD.get(0);
            k kVar4 = this.f46435s2;
            if (kVar4 == null) {
                s.m("eventDTO");
                throw null;
            }
            String str = dVar.courseId;
            kVar4.z0(Long.valueOf(str != null ? Long.parseLong(str) : -1L));
            k kVar5 = this.f46435s2;
            if (kVar5 == null) {
                s.m("eventDTO");
                throw null;
            }
            kVar5.A0(dVar.courseName);
        }
        ny1.e eVarD = B5().d();
        if (eVarD == null) {
            eVarD = ny1.e.DISTANCE;
        }
        fg0.d dVar2 = new fg0.d(null, null, null, 7, null);
        if (eVarD == ny1.e.DISTANCE) {
            dVar2.s(gg0.h.DISTANCE);
            if (p6()) {
                k kVar6 = this.f46435s2;
                if (kVar6 == null) {
                    s.m("eventDTO");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = W5().d();
                kVar6.x0((fVarD == null || (listF = fVarD.f()) == null) ? null : h0.N0(listF, new e()));
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD2 = W5().d();
                dVar2.t((fVarD2 == null || (zVarI2 = fVarD2.getTotalTarget()) == null) ? null : zVarI2.getValue());
                com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD3 = W5().d();
                dVar2.r((fVarD3 == null || (zVarI = fVarD3.getTotalTarget()) == null) ? null : zVarI.getUnit());
            } else {
                bg0.a.c cVarD = r5().d();
                dVar2.t((cVarD == null || (number = cVarD.f17834a) == null) ? null : Double.valueOf(number.doubleValue()));
                lz1.f.a aVar = lz1.f.f115404a;
                bg0.a.c cVarD2 = r5().d();
                aVar.getClass();
                dVar2.r(lz1.f.a.i(cVarD2));
            }
        } else {
            dVar2.s(gg0.h.TIME);
            Integer numD = t5().d();
            dVar2.t(Double.valueOf(numD != null ? numD.intValue() : 0.0d));
            dVar2.r(gg0.i.SECOND);
        }
        if (dVar2.getValue() != null) {
            k kVar7 = this.f46435s2;
            if (kVar7 == null) {
                s.m("eventDTO");
                throw null;
            }
            kVar7.w0(dVar2);
        }
        k kVar8 = this.f46435s2;
        if (kVar8 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar8.Q0(C5());
        k kVar9 = this.f46435s2;
        if (kVar9 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar9.Z0((String) ((y0) this.Z1.getValue()).d());
        k kVar10 = this.f46435s2;
        if (kVar10 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar10.S0(M5().d());
        k kVar11 = this.f46435s2;
        if (kVar11 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar11.R0(E5().d());
        fg0.c cVar = new fg0.c(null, null, null, null, 15, null);
        if (Q5().d() == ny1.g.IN_PERSON) {
            c5();
        }
        Boolean boolD = A5().d();
        Boolean bool = Boolean.TRUE;
        if (s.g(boolD, bool) && s.g(F5().d(), bool)) {
            cVar.g(gg0.a.PUBLIC_SHAREABLE_DISCOVERABLE);
            cVar.h(bool);
            cVar.i(bool);
            cVar.f(bool);
        } else if (!s.g(A5().d(), bool) || s.g(F5().d(), bool)) {
            Boolean boolD2 = A5().d();
            Boolean bool2 = Boolean.FALSE;
            if (s.g(boolD2, bool2) && s.g(F5().d(), bool2)) {
                cVar.g(gg0.a.PRIVATE);
                cVar.h(bool2);
                cVar.i(bool2);
                cVar.f(bool2);
            } else {
                cVar.g(gg0.a.PUBLIC);
                cVar.h(bool);
                cVar.i(bool2);
                cVar.f(bool2);
            }
        } else {
            cVar.g(gg0.a.PUBLIC_SHAREABLE);
            cVar.h(bool);
            cVar.i(bool);
            cVar.f(Boolean.FALSE);
        }
        k kVar12 = this.f46435s2;
        if (kVar12 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar12.P0(cVar);
        k kVar13 = this.f46435s2;
        if (kVar13 == null) {
            s.m("eventDTO");
            throw null;
        }
        fg0.c eventPrivacy = kVar13.getEventPrivacy();
        if (eventPrivacy != null) {
            eventPrivacy.i(A5().d());
        }
        k kVar14 = this.f46435s2;
        if (kVar14 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar14.M0();
        k kVar15 = this.f46435s2;
        if (kVar15 == null) {
            s.m("eventDTO");
            throw null;
        }
        kVar15.c1(Boolean.valueOf(((y0) this.S0.getValue()).d() == ny1.d.YES));
        k kVar16 = this.f46435s2;
        if (kVar16 == null) {
            s.m("eventDTO");
            throw null;
        }
        gg0.f eventType = kVar16.getEventType();
        if (eventType != null && eventType.d()) {
            k kVar17 = this.f46435s2;
            if (kVar17 == null) {
                s.m("eventDTO");
                throw null;
            }
            Boolean bool3 = Boolean.FALSE;
            kVar17.E0(new fg0.j(null, null, bool3, null, null, bool3, null, null, null, null, null, null, null, 8155, null));
        }
        if (s.g(this.f204393j, bool) || this.f204395l) {
            k kVar18 = this.f46435s2;
            if (kVar18 != null) {
                kVar18.e1(a6().d());
            } else {
                s.m("eventDTO");
                throw null;
            }
        }
    }

    public final w0<Boolean> s5() {
        return (w0) this.f46444x1.getValue();
    }

    public final ArrayList s6(Context context) throws IOException {
        Bitmap bitmap;
        ImageDecoder.Source sourceCreateSource;
        ContentResolver contentResolver = context.getContentResolver();
        byte[][] bArr = null;
        if (Build.VERSION.SDK_INT >= 29) {
            Uri uriD = a6().d();
            bitmap = (uriD == null || (sourceCreateSource = ImageDecoder.createSource(contentResolver, uriD)) == null) ? null : ImageDecoder.decodeBitmap(sourceCreateSource);
        } else {
            bitmap = MediaStore.Images.Media.getBitmap(contentResolver, a6().d());
        }
        if (bitmap != null) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 298, 298, false);
            bitmapCreateScaledBitmap.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmapCreateScaledBitmap.recycle();
            byteArray.getClass();
            bArr = new byte[][]{byteArray};
        }
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            String[] strArr = V2;
            int length = strArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                arrayList.add(MultipartBody.Part.INSTANCE.createFormData(strArr[i14], W2[i14], RequestBody.Companion.create$default(RequestBody.INSTANCE, X2[i14], bArr[i14], 0, 0, 12, (Object) null)));
            }
        }
        return arrayList;
    }

    public final s0<Integer> t5() {
        return (s0) this.B1.getValue();
    }

    public final void t6(androidx.fragment.app.m mVar, x0 x0Var) {
        Integer num;
        Double d14;
        Integer num2;
        if (o6()) {
            lz1.f.a aVar = lz1.f.f115404a;
            gg0.f fVarD = E5().d();
            aVar.getClass();
            List listG = lz1.f.a.g(fVarD);
            Integer numValueOf = null;
            if (p6()) {
                num = numValueOf;
            } else {
                x xVar = this.f204394k;
                if (xVar == null || (num2 = xVar.f71368d) == null) {
                    u uVar = this.f204397n;
                    if (uVar != null && (d14 = uVar.f71356h) != null) {
                        numValueOf = Integer.valueOf((int) d14.doubleValue());
                    }
                    num = numValueOf;
                } else {
                    num = num2;
                }
            }
            if (listG != null) {
                if (x0Var == null) {
                    x0Var = (x0) listG.get(0);
                }
                this.f46427o2.g(mVar, x0Var, new ArrayList(listG), A5().d(), p6(), num, W5().d(), H5().d(), this.f204395l || s.g(this.f204393j, Boolean.TRUE));
            }
        }
    }

    public final s0<LocalDate> u5() {
        return (s0) this.L0.getValue();
    }

    public final void u6(androidx.fragment.app.m mVar) {
        boolean z14;
        if (!o6()) {
            v6();
            return;
        }
        lz1.f.a aVar = lz1.f.f115404a;
        gg0.f fVarD = E5().d();
        aVar.getClass();
        List listG = lz1.f.a.g(fVarD);
        if (listG == null) {
            v6();
            return;
        }
        x xVar = this.f204394k;
        Integer num = xVar != null ? xVar.f71368d : null;
        u uVar = this.f204397n;
        Double d14 = uVar != null ? uVar.f71356h : null;
        boolean z15 = false;
        if (s.g(this.f204393j, Boolean.TRUE) && num != null) {
            this.f46427o2.q(mVar, (x0) listG.get(0), A5().d(), p6(), num.intValue());
            return;
        }
        if (this.f204395l && d14 != null && !p6()) {
            this.f46427o2.q(mVar, (x0) listG.get(0), A5().d(), p6(), (int) d14.doubleValue());
            return;
        }
        x0 x0Var = (x0) listG.get(0);
        List<x0> listD = k5().d();
        ArrayList arrayList = new ArrayList();
        if (listD == null || listD.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it = listD.iterator();
            boolean z16 = false;
            while (it.hasNext()) {
                int i14 = b.f46451b[((x0) it.next()).ordinal()];
                if (i14 == 1 || i14 == 2) {
                    z15 = true;
                } else if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                    z16 = true;
                }
            }
            z14 = z15;
            z15 = z16;
        }
        if (z15) {
            arrayList.add(x0.f4312o);
        }
        if (z14) {
            arrayList.add(x0.f4308n);
        }
        this.f46427o2.y(mVar, x0Var, arrayList, A5().d(), p6(), W5().d(), H5().d(), this.f204395l);
    }

    public final y0<g3<my1.b>> v5() {
        return (y0) this.f46423m2.getValue();
    }

    public final void v6() {
        if (P4()) {
            if (P5() == ny1.g.IN_PERSON && G5().d() != null) {
                a5();
                return;
            } else {
                c6().j(null);
                w6();
                return;
            }
        }
        if (!p6()) {
            O5().m("TIAddEventDistanceTimeFragment2");
        } else if (P5() != ny1.g.IN_PERSON || G5().d() == null) {
            c6().j(null);
        } else {
            a5();
        }
    }

    public final y0<g3<k>> w5() {
        return (y0) this.J1.getValue();
    }

    public final void w6() {
        s5().o(q5());
        O5().m("TIAddEventImageFragment");
    }

    public final s0<String> x5() {
        return (s0) this.J0.getValue();
    }

    public final void x6(gg0.f fVar) {
        fVar.getClass();
        F6(fVar);
        zf0.a aVarD = o5().d();
        if ((aVarD == null ? -1 : b.f46452c[aVarD.ordinal()]) == 1) {
            O5().m("TIAddEventRaceFragment");
        } else {
            O5().m("TIFindEventFragment");
        }
    }

    public final y0<String> y5() {
        return (y0) this.I0.getValue();
    }

    public final void y6(my1.d dVar, j jVar) {
        ArrayList arrayList;
        jVar.getClass();
        List<j> list = dVar.f121490g;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j) obj) != jVar) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        Q6(my1.d.b(dVar, null, null, null, null, null, null, arrayList, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048511));
    }

    public final y0<xy1.a> z5() {
        return (y0) this.f46408f2.getValue();
    }

    public final void z6(String str) {
        str.getClass();
        ((y0) this.Z1.getValue()).m(str);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/viewmodels/AddTIEventViewModel$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INT_NUMDAYS", "I", "INT_LIMIT", "TIME_DIFF_IN_MINUTES", "", "NAMES", "[Ljava/lang/String;", "FILE_NAMES", "Lokhttp3/MediaType;", "FILE_TYPES", "[Lokhttp3/MediaType;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
