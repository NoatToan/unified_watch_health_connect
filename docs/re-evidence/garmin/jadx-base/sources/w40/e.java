package w40;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.u0;
import e23.l;
import fw.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j61.i;
import o13.m;
import o4.m1;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p5.h0;
import p5.k0;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lw40/e;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f181932h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f181933g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181934a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f181934a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f181935a;

        public c(l lVar) {
            lVar.getClass();
            this.f181935a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f181935a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f181935a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f181936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f181936a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f181936a;
        }
    }

    /* JADX INFO: renamed from: w40.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C3386e extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f181937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3386e(e23.a aVar) {
            super(0);
            this.f181937a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f181937a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f181938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o13.l lVar) {
            super(0);
            this.f181938a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f181938a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f181939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f181940b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f181939a = aVar;
            this.f181940b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f181939a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f181940b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f181941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f181942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f181941a = fragment;
            this.f181942b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f181942b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f181941a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public e() {
        super(R.layout.course_demands_content, false, true, 0, 10, null);
        o13.l lVarA = m.a(o13.n.NONE, new C3386e(new d(this)));
        this.f181933g = new w1(s0.f105811a.b(w40.g.class), new f(lVarA), new h(this, lVarA), new g(null, lVarA));
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("COURSE_ID", null) : null;
        if (string != null) {
            f0.N(new w40.f((w40.g) this.f181933g.getValue(), string, null)).f(this, new c(new w02.b(8, view2, this)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.lbl_course_demands);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0385  */
    /* JADX WARN: Code duplicated, block: B:104:0x0397  */
    /* JADX WARN: Code duplicated, block: B:107:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:109:0x03af  */
    /* JADX WARN: Code duplicated, block: B:113:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x045b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0465  */
    /* JADX WARN: Code duplicated, block: B:121:0x0468  */
    /* JADX WARN: Code duplicated, block: B:124:0x0474  */
    /* JADX WARN: Code duplicated, block: B:127:0x049b  */
    /* JADX WARN: Code duplicated, block: B:130:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:141:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:143:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x050a  */
    /* JADX WARN: Code duplicated, block: B:150:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:152:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x026a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0311  */
    /* JADX WARN: Code duplicated, block: B:87:0x0320  */
    /* JADX WARN: Code duplicated, block: B:90:0x0345  */
    /* JADX WARN: Code duplicated, block: B:93:0x034a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0374  */
    /* JADX WARN: Code duplicated, block: B:99:0x037b  */
    public final void z6(j61.e eVar, p3.m mVar, int i14) {
        final int i15;
        e0.a aVar;
        String str;
        h5.g.a.b bVar;
        Object objQ;
        p3.m.a.C2565a c2565a;
        x0 x0Var;
        e0.a aVar2;
        h5.g.a.b bVar2;
        final String strQ;
        final int iIntValue;
        final int iIntValue2;
        boolean zB;
        Object objQ2;
        p3.m.a.C2565a c2565a2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        String str2;
        h5.g.a.b bVar3;
        Object objQ3;
        p3.m.a.C2565a c2565a3;
        e0.a aVar4;
        h5.g.a.b bVar4;
        final String strQ2;
        final int iIntValue3;
        final int iIntValue4;
        boolean zB2;
        Object objQ4;
        p3.m.a.C2565a c2565a4;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        Object objQ5;
        Integer aerobicEndurance;
        Integer num;
        Integer aerobicCapacity;
        Integer num2;
        Integer anaerobicCapacity;
        Integer num3;
        j61.g feedbackPhraseKey;
        o0 o0VarE = mVar.E(1663541962);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(eVar) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            r.a aVar5 = r.S;
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            m1.a aVar6 = m1.f128891a;
            r rVarE = u1.n.e(aVar5, jF, aVar6);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81536n;
            z zVarA3 = c2.y.a(kVar, aVar7, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar5);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            float f15 = eVar3.f97920e;
            float f16 = eVar3.f97917b;
            c2.l.f(x2.h(aVar5, f14), o0VarE);
            r rVarE2 = u1.n.e(aVar5, d92.b.a(o0VarE).c().c(), aVar6);
            bVar6.getClass();
            float f17 = eVar3.f97920e;
            bVar6.getClass();
            r rVarC4 = c2.l.C(rVarE2, f17, 0.0f, eVar3.f97920e, 0.0f, 10);
            z zVarA4 = c2.y.a(kVar, aVar7, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC5 = k.c(rVarC4, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA4, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar5);
            }
            b4.c(fVar, rVarC5, o0VarE);
            j61.d dVar = eVar.f97323b;
            i iVar = eVar.f97322a;
            String strQ3 = gl1.y.Q(o0VarE, (dVar == null || (feedbackPhraseKey = dVar.getFeedbackPhraseKey()) == null) ? j61.g.INVALID.f97340a : feedbackPhraseKey.f97340a);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar6.getClass();
            mh.c(strQ3, c2.l.A(aVar5, 0.0f, f15, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            final String strQ4 = gl1.y.Q(o0VarE, R.string.activities_training_effect_anaerobic_capacity);
            final int iIntValue5 = (iVar == null || (num3 = iVar.f97350d) == null) ? 0 : num3.intValue();
            final int iIntValue6 = (dVar == null || (anaerobicCapacity = dVar.getAnaerobicCapacity()) == null) ? 0 : anaerobicCapacity.intValue();
            bVar6.getClass();
            r rVarC6 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
            boolean zB3 = o0VarE.B(strQ4) | o0VarE.k(iIntValue5) | o0VarE.k(iIntValue6);
            Object objQ6 = o0VarE.q();
            p3.m.a aVar9 = p3.m.f135153a;
            if (zB3) {
                i15 = 0;
                objQ6 = new l() { // from class: w40.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i17 = i15;
                        int i18 = iIntValue6;
                        int i19 = iIntValue5;
                        String str3 = strQ4;
                        k0 k0Var = (k0) obj;
                        switch (i17) {
                            case 0:
                                e.a aVar10 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i19 + " / " + i18);
                                break;
                            case 1:
                                e.a aVar11 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i19 + " / " + i18);
                                break;
                            default:
                                e.a aVar12 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i19 + " / " + i18);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ6);
            } else {
                aVar9.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    i15 = 0;
                    objQ6 = new l() { // from class: w40.c
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i17 = i15;
                            int i18 = iIntValue6;
                            int i19 = iIntValue5;
                            String str3 = strQ4;
                            k0 k0Var = (k0) obj;
                            switch (i17) {
                                case 0:
                                    e.a aVar10 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i19 + " / " + i18);
                                    break;
                                case 1:
                                    e.a aVar11 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i19 + " / " + i18);
                                    break;
                                default:
                                    e.a aVar12 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i19 + " / " + i18);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ6);
                } else {
                    i15 = 0;
                }
            }
            r rVarB = v.b(rVarC6, (l) objQ6);
            z zVarA5 = c2.y.a(kVar, aVar7, o0VarE, i15);
            int iHashCode5 = Long.hashCode(o0VarE.U);
            i2 i2VarA4 = o0VarE.a0();
            r rVarC7 = k.c(rVarB, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar = aVar8;
                o0VarE.M(aVar);
            } else {
                aVar = aVar8;
                o0VarE.c();
            }
            b4.c(eVar2, zVarA5, o0VarE);
            b4.c(c1623g, i2VarA4, o0VarE);
            if (o0VarE.T) {
                str = strQ4;
            } else {
                str = strQ4;
                if (s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                    bVar = bVar5;
                }
                b4.c(fVar, rVarC7, o0VarE);
                objQ = o0VarE.q();
                aVar9.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new w40.d(0);
                    o0VarE.K(objQ);
                }
                r rVarB2 = v.b(aVar5, (l) objQ);
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                int i17 = iIntValue6;
                aVar2 = aVar;
                bVar2 = bVar;
                mh.c(str, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                gl.c.f77766a.getClass();
                long jK = gl.c.a(o0VarE).k();
                bVar6.getClass();
                r20.d.a(iIntValue5, i17, jK, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                strQ = gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity);
                if (iVar != null || (num2 = iVar.f97352f) == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = num2.intValue();
                }
                if (dVar != null || (aerobicCapacity = dVar.getAerobicCapacity()) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = aerobicCapacity.intValue();
                }
                bVar6.getClass();
                r rVarC8 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                zB = o0VarE.B(strQ) | o0VarE.k(iIntValue) | o0VarE.k(iIntValue2);
                objQ2 = o0VarE.q();
                if (zB) {
                    c2565a2 = c2565a;
                } else {
                    c2565a2 = c2565a;
                    if (objQ2 == c2565a2) {
                    }
                    r rVarB3 = v.b(rVarC8, (l) objQ2);
                    zVarA = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarB3, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        aVar3 = aVar2;
                        o0VarE.M(aVar3);
                    } else {
                        aVar3 = aVar2;
                        o0VarE.c();
                    }
                    int i18 = iIntValue2;
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T) {
                        str2 = strQ;
                    } else {
                        str2 = strQ;
                        if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            bVar3 = bVar2;
                        }
                        b4.c(fVar, rVarC, o0VarE);
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a2) {
                            objQ3 = new w40.d(1);
                            o0VarE.K(objQ3);
                        }
                        r rVarB4 = v.b(aVar5, (l) objQ3);
                        fVar2.getClass();
                        c2565a3 = c2565a2;
                        aVar4 = aVar3;
                        bVar4 = bVar3;
                        mh.c(str2, rVarB4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                        long jI = gl.c.a(o0VarE).i();
                        bVar6.getClass();
                        r20.d.a(iIntValue, i18, jI, c2.l.y(aVar5, f16), o0VarE, 0);
                        o0VarE.g0(true);
                        strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                        if (iVar != null || (num = iVar.f97354h) == null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = num.intValue();
                        }
                        if (dVar != null || (aerobicEndurance = dVar.getAerobicEndurance()) == null) {
                            iIntValue4 = 0;
                        } else {
                            iIntValue4 = aerobicEndurance.intValue();
                        }
                        bVar6.getClass();
                        r rVarC9 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                        zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                        objQ4 = o0VarE.q();
                        if (zB2) {
                            c2565a4 = c2565a3;
                        } else {
                            c2565a4 = c2565a3;
                            if (objQ4 == c2565a4) {
                            }
                            r rVarB5 = v.b(rVarC9, (l) objQ4);
                            zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                            iHashCode2 = Long.hashCode(o0VarE.U);
                            i2VarA1 = o0VarE.a0();
                            rVarC2 = k.c(rVarB5, o0VarE);
                            if (cVar != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar4);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar2, zVarA2, o0VarE);
                            b4.c(c1623g, i2VarA1, o0VarE);
                            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                            }
                            b4.c(fVar, rVarC2, o0VarE);
                            objQ5 = o0VarE.q();
                            if (objQ5 == c2565a4) {
                                objQ5 = new w40.d(2);
                                o0VarE.K(objQ5);
                            }
                            r rVarB6 = v.b(aVar5, (l) objQ5);
                            fVar2.getClass();
                            mh.c(strQ2, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                            long jO = gl.c.a(o0VarE).o();
                            bVar6.getClass();
                            r20.d.a(iIntValue3, iIntValue4, jO, c2.l.y(aVar5, f16), o0VarE, 0);
                            o0VarE.g0(true);
                            o0VarE.g0(true);
                            bVar6.getClass();
                            r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                            bVar6.getClass();
                            r rVarY = c2.l.y(aVar5, f15);
                            String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                            fVar2.getClass();
                            mh.c(strQ5, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                            o0VarE = o0VarE;
                            o0VarE.g0(true);
                        }
                        final int i19 = 2;
                        objQ4 = new l() { // from class: w40.c
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i110 = i19;
                                int i111 = iIntValue4;
                                int i112 = iIntValue3;
                                String str3 = strQ2;
                                k0 k0Var = (k0) obj;
                                switch (i110) {
                                    case 0:
                                        e.a aVar10 = e.f181932h;
                                        k0Var.getClass();
                                        h0.n(k0Var, str3 + StringUtils.SPACE + i112 + " / " + i111);
                                        break;
                                    case 1:
                                        e.a aVar11 = e.f181932h;
                                        k0Var.getClass();
                                        h0.n(k0Var, str3 + StringUtils.SPACE + i112 + " / " + i111);
                                        break;
                                    default:
                                        e.a aVar12 = e.f181932h;
                                        k0Var.getClass();
                                        h0.n(k0Var, str3 + StringUtils.SPACE + i112 + " / " + i111);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ4);
                        r rVarB7 = v.b(rVarC9, (l) objQ4);
                        zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(rVarB7, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a4) {
                            objQ5 = new w40.d(2);
                            o0VarE.K(objQ5);
                        }
                        r rVarB8 = v.b(aVar5, (l) objQ5);
                        fVar2.getClass();
                        mh.c(strQ2, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                        long jO2 = gl.c.a(o0VarE).o();
                        bVar6.getClass();
                        r20.d.a(iIntValue3, iIntValue4, jO2, c2.l.y(aVar5, f16), o0VarE, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        bVar6.getClass();
                        r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                        bVar6.getClass();
                        r rVarY2 = c2.l.y(aVar5, f15);
                        String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                        fVar2.getClass();
                        mh.c(strQ6, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(true);
                    }
                    bVar3 = bVar2;
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    b4.c(fVar, rVarC, o0VarE);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a2) {
                        objQ3 = new w40.d(1);
                        o0VarE.K(objQ3);
                    }
                    r rVarB9 = v.b(aVar5, (l) objQ3);
                    fVar2.getClass();
                    c2565a3 = c2565a2;
                    aVar4 = aVar3;
                    bVar4 = bVar3;
                    mh.c(str2, rVarB9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jI2 = gl.c.a(o0VarE).i();
                    bVar6.getClass();
                    r20.d.a(iIntValue, i18, jI2, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                    if (iVar != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    if (dVar != null) {
                        iIntValue4 = 0;
                    } else {
                        iIntValue4 = 0;
                    }
                    bVar6.getClass();
                    r rVarC10 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                    zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                    objQ4 = o0VarE.q();
                    if (zB2) {
                        c2565a4 = c2565a3;
                        if (objQ4 == c2565a4) {
                        }
                        r rVarB10 = v.b(rVarC10, (l) objQ4);
                        zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(rVarB10, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a4) {
                            objQ5 = new w40.d(2);
                            o0VarE.K(objQ5);
                        }
                        r rVarB11 = v.b(aVar5, (l) objQ5);
                        fVar2.getClass();
                        mh.c(strQ2, rVarB11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                        long jO3 = gl.c.a(o0VarE).o();
                        bVar6.getClass();
                        r20.d.a(iIntValue3, iIntValue4, jO3, c2.l.y(aVar5, f16), o0VarE, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        bVar6.getClass();
                        r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                        bVar6.getClass();
                        r rVarY3 = c2.l.y(aVar5, f15);
                        String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                        fVar2.getClass();
                        mh.c(strQ7, rVarY3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(true);
                    } else {
                        c2565a4 = c2565a3;
                    }
                    final int i110 = 2;
                    objQ4 = new l() { // from class: w40.c
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i111 = i110;
                            int i112 = iIntValue4;
                            int i113 = iIntValue3;
                            String str3 = strQ2;
                            k0 k0Var = (k0) obj;
                            switch (i111) {
                                case 0:
                                    e.a aVar10 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i113 + " / " + i112);
                                    break;
                                case 1:
                                    e.a aVar11 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i113 + " / " + i112);
                                    break;
                                default:
                                    e.a aVar12 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i113 + " / " + i112);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                    r rVarB12 = v.b(rVarC10, (l) objQ4);
                    zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarB12, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a4) {
                        objQ5 = new w40.d(2);
                        o0VarE.K(objQ5);
                    }
                    r rVarB13 = v.b(aVar5, (l) objQ5);
                    fVar2.getClass();
                    mh.c(strQ2, rVarB13, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jO4 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue4, jO4, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    bVar6.getClass();
                    r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                    bVar6.getClass();
                    r rVarY4 = c2.l.y(aVar5, f15);
                    String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                    fVar2.getClass();
                    mh.c(strQ8, rVarY4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                }
                final int i24 = 1;
                objQ2 = new l() { // from class: w40.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i111 = i24;
                        int i112 = iIntValue2;
                        int i113 = iIntValue;
                        String str3 = strQ;
                        k0 k0Var = (k0) obj;
                        switch (i111) {
                            case 0:
                                e.a aVar10 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i113 + " / " + i112);
                                break;
                            case 1:
                                e.a aVar11 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i113 + " / " + i112);
                                break;
                            default:
                                e.a aVar12 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i113 + " / " + i112);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
                r rVarB14 = v.b(rVarC8, (l) objQ2);
                zVarA = c2.y.a(kVar, aVar7, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarB14, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar3 = aVar2;
                    o0VarE.M(aVar3);
                } else {
                    aVar3 = aVar2;
                    o0VarE.c();
                }
                int i111 = iIntValue2;
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    str2 = strQ;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        bVar3 = bVar2;
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a2) {
                        objQ3 = new w40.d(1);
                        o0VarE.K(objQ3);
                    }
                    r rVarB15 = v.b(aVar5, (l) objQ3);
                    fVar2.getClass();
                    c2565a3 = c2565a2;
                    aVar4 = aVar3;
                    bVar4 = bVar3;
                    mh.c(str2, rVarB15, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jI3 = gl.c.a(o0VarE).i();
                    bVar6.getClass();
                    r20.d.a(iIntValue, i111, jI3, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                    if (iVar != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    if (dVar != null) {
                        iIntValue4 = 0;
                    } else {
                        iIntValue4 = 0;
                    }
                    bVar6.getClass();
                    r rVarC11 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                    zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                    objQ4 = o0VarE.q();
                    if (zB2) {
                        c2565a4 = c2565a3;
                        if (objQ4 == c2565a4) {
                        }
                        r rVarB16 = v.b(rVarC11, (l) objQ4);
                        zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(rVarB16, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a4) {
                            objQ5 = new w40.d(2);
                            o0VarE.K(objQ5);
                        }
                        r rVarB17 = v.b(aVar5, (l) objQ5);
                        fVar2.getClass();
                        mh.c(strQ2, rVarB17, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                        long jO5 = gl.c.a(o0VarE).o();
                        bVar6.getClass();
                        r20.d.a(iIntValue3, iIntValue4, jO5, c2.l.y(aVar5, f16), o0VarE, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        bVar6.getClass();
                        r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                        bVar6.getClass();
                        r rVarY5 = c2.l.y(aVar5, f15);
                        String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                        fVar2.getClass();
                        mh.c(strQ9, rVarY5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(true);
                    } else {
                        c2565a4 = c2565a3;
                    }
                    final int i112 = 2;
                    objQ4 = new l() { // from class: w40.c
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i113 = i112;
                            int i114 = iIntValue4;
                            int i115 = iIntValue3;
                            String str3 = strQ2;
                            k0 k0Var = (k0) obj;
                            switch (i113) {
                                case 0:
                                    e.a aVar10 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i115 + " / " + i114);
                                    break;
                                case 1:
                                    e.a aVar11 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i115 + " / " + i114);
                                    break;
                                default:
                                    e.a aVar12 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i115 + " / " + i114);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                    r rVarB18 = v.b(rVarC11, (l) objQ4);
                    zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarB18, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a4) {
                        objQ5 = new w40.d(2);
                        o0VarE.K(objQ5);
                    }
                    r rVarB19 = v.b(aVar5, (l) objQ5);
                    fVar2.getClass();
                    mh.c(strQ2, rVarB19, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jO6 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue4, jO6, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    bVar6.getClass();
                    r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                    bVar6.getClass();
                    r rVarY6 = c2.l.y(aVar5, f15);
                    String strQ10 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                    fVar2.getClass();
                    mh.c(strQ10, rVarY6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                } else {
                    str2 = strQ;
                }
                bVar3 = bVar2;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                b4.c(fVar, rVarC, o0VarE);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a2) {
                    objQ3 = new w40.d(1);
                    o0VarE.K(objQ3);
                }
                r rVarB110 = v.b(aVar5, (l) objQ3);
                fVar2.getClass();
                c2565a3 = c2565a2;
                aVar4 = aVar3;
                bVar4 = bVar3;
                mh.c(str2, rVarB110, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jI4 = gl.c.a(o0VarE).i();
                bVar6.getClass();
                r20.d.a(iIntValue, i111, jI4, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                if (iVar != null) {
                    iIntValue3 = 0;
                } else {
                    iIntValue3 = 0;
                }
                if (dVar != null) {
                    iIntValue4 = 0;
                } else {
                    iIntValue4 = 0;
                }
                bVar6.getClass();
                r rVarC12 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                objQ4 = o0VarE.q();
                if (zB2) {
                    c2565a4 = c2565a3;
                    if (objQ4 == c2565a4) {
                    }
                    r rVarB111 = v.b(rVarC12, (l) objQ4);
                    zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarB111, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a4) {
                        objQ5 = new w40.d(2);
                        o0VarE.K(objQ5);
                    }
                    r rVarB112 = v.b(aVar5, (l) objQ5);
                    fVar2.getClass();
                    mh.c(strQ2, rVarB112, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jO7 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue4, jO7, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    bVar6.getClass();
                    r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                    bVar6.getClass();
                    r rVarY7 = c2.l.y(aVar5, f15);
                    String strQ11 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                    fVar2.getClass();
                    mh.c(strQ11, rVarY7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                } else {
                    c2565a4 = c2565a3;
                }
                final int i113 = 2;
                objQ4 = new l() { // from class: w40.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i114 = i113;
                        int i115 = iIntValue4;
                        int i116 = iIntValue3;
                        String str3 = strQ2;
                        k0 k0Var = (k0) obj;
                        switch (i114) {
                            case 0:
                                e.a aVar10 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i116 + " / " + i115);
                                break;
                            case 1:
                                e.a aVar11 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i116 + " / " + i115);
                                break;
                            default:
                                e.a aVar12 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i116 + " / " + i115);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
                r rVarB113 = v.b(rVarC12, (l) objQ4);
                zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarB113, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0VarE);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a4) {
                    objQ5 = new w40.d(2);
                    o0VarE.K(objQ5);
                }
                r rVarB114 = v.b(aVar5, (l) objQ5);
                fVar2.getClass();
                mh.c(strQ2, rVarB114, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jO8 = gl.c.a(o0VarE).o();
                bVar6.getClass();
                r20.d.a(iIntValue3, iIntValue4, jO8, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                bVar6.getClass();
                r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                bVar6.getClass();
                r rVarY8 = c2.l.y(aVar5, f15);
                String strQ12 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                fVar2.getClass();
                mh.c(strQ12, rVarY8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            bVar = bVar5;
            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
            b4.c(fVar, rVarC7, o0VarE);
            objQ = o0VarE.q();
            aVar9.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new w40.d(0);
                o0VarE.K(objQ);
            }
            r rVarB20 = v.b(aVar5, (l) objQ);
            fVar2.getClass();
            x0Var = j92.f.f97932i;
            int i114 = iIntValue6;
            aVar2 = aVar;
            bVar2 = bVar;
            mh.c(str, rVarB20, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            gl.c.f77766a.getClass();
            long jK2 = gl.c.a(o0VarE).k();
            bVar6.getClass();
            r20.d.a(iIntValue5, i114, jK2, c2.l.y(aVar5, f16), o0VarE, 0);
            o0VarE.g0(true);
            strQ = gl1.y.Q(o0VarE, R.string.lbl_aerobic_capacity);
            if (iVar != null) {
                iIntValue = 0;
            } else {
                iIntValue = 0;
            }
            if (dVar != null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = 0;
            }
            bVar6.getClass();
            r rVarC13 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
            zB = o0VarE.B(strQ) | o0VarE.k(iIntValue) | o0VarE.k(iIntValue2);
            objQ2 = o0VarE.q();
            if (zB) {
                c2565a2 = c2565a;
                if (objQ2 == c2565a2) {
                }
                r rVarB115 = v.b(rVarC13, (l) objQ2);
                zVarA = c2.y.a(kVar, aVar7, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarB115, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar3 = aVar2;
                    o0VarE.M(aVar3);
                } else {
                    aVar3 = aVar2;
                    o0VarE.c();
                }
                int i115 = iIntValue2;
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    str2 = strQ;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        bVar3 = bVar2;
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a2) {
                        objQ3 = new w40.d(1);
                        o0VarE.K(objQ3);
                    }
                    r rVarB116 = v.b(aVar5, (l) objQ3);
                    fVar2.getClass();
                    c2565a3 = c2565a2;
                    aVar4 = aVar3;
                    bVar4 = bVar3;
                    mh.c(str2, rVarB116, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jI5 = gl.c.a(o0VarE).i();
                    bVar6.getClass();
                    r20.d.a(iIntValue, i115, jI5, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                    if (iVar != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    if (dVar != null) {
                        iIntValue4 = 0;
                    } else {
                        iIntValue4 = 0;
                    }
                    bVar6.getClass();
                    r rVarC14 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                    zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                    objQ4 = o0VarE.q();
                    if (zB2) {
                        c2565a4 = c2565a3;
                        if (objQ4 == c2565a4) {
                        }
                        r rVarB117 = v.b(rVarC14, (l) objQ4);
                        zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(rVarB117, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar2, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        objQ5 = o0VarE.q();
                        if (objQ5 == c2565a4) {
                            objQ5 = new w40.d(2);
                            o0VarE.K(objQ5);
                        }
                        r rVarB118 = v.b(aVar5, (l) objQ5);
                        fVar2.getClass();
                        mh.c(strQ2, rVarB118, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                        long jO9 = gl.c.a(o0VarE).o();
                        bVar6.getClass();
                        r20.d.a(iIntValue3, iIntValue4, jO9, c2.l.y(aVar5, f16), o0VarE, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        bVar6.getClass();
                        r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                        bVar6.getClass();
                        r rVarY9 = c2.l.y(aVar5, f15);
                        String strQ13 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                        fVar2.getClass();
                        mh.c(strQ13, rVarY9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(true);
                    } else {
                        c2565a4 = c2565a3;
                    }
                    final int i116 = 2;
                    objQ4 = new l() { // from class: w40.c
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i117 = i116;
                            int i118 = iIntValue4;
                            int i119 = iIntValue3;
                            String str3 = strQ2;
                            k0 k0Var = (k0) obj;
                            switch (i117) {
                                case 0:
                                    e.a aVar10 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i119 + " / " + i118);
                                    break;
                                case 1:
                                    e.a aVar11 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i119 + " / " + i118);
                                    break;
                                default:
                                    e.a aVar12 = e.f181932h;
                                    k0Var.getClass();
                                    h0.n(k0Var, str3 + StringUtils.SPACE + i119 + " / " + i118);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                    r rVarB119 = v.b(rVarC14, (l) objQ4);
                    zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarB119, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a4) {
                        objQ5 = new w40.d(2);
                        o0VarE.K(objQ5);
                    }
                    r rVarB1110 = v.b(aVar5, (l) objQ5);
                    fVar2.getClass();
                    mh.c(strQ2, rVarB1110, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jO10 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue4, jO10, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    bVar6.getClass();
                    r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                    bVar6.getClass();
                    r rVarY10 = c2.l.y(aVar5, f15);
                    String strQ14 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                    fVar2.getClass();
                    mh.c(strQ14, rVarY10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                } else {
                    str2 = strQ;
                }
                bVar3 = bVar2;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                b4.c(fVar, rVarC, o0VarE);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a2) {
                    objQ3 = new w40.d(1);
                    o0VarE.K(objQ3);
                }
                r rVarB1111 = v.b(aVar5, (l) objQ3);
                fVar2.getClass();
                c2565a3 = c2565a2;
                aVar4 = aVar3;
                bVar4 = bVar3;
                mh.c(str2, rVarB1111, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jI6 = gl.c.a(o0VarE).i();
                bVar6.getClass();
                r20.d.a(iIntValue, i115, jI6, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                if (iVar != null) {
                    iIntValue3 = 0;
                } else {
                    iIntValue3 = 0;
                }
                if (dVar != null) {
                    iIntValue4 = 0;
                } else {
                    iIntValue4 = 0;
                }
                bVar6.getClass();
                r rVarC15 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                objQ4 = o0VarE.q();
                if (zB2) {
                    c2565a4 = c2565a3;
                    if (objQ4 == c2565a4) {
                    }
                    r rVarB1112 = v.b(rVarC15, (l) objQ4);
                    zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarB1112, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a4) {
                        objQ5 = new w40.d(2);
                        o0VarE.K(objQ5);
                    }
                    r rVarB1113 = v.b(aVar5, (l) objQ5);
                    fVar2.getClass();
                    mh.c(strQ2, rVarB1113, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jO11 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue4, jO11, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    bVar6.getClass();
                    r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                    bVar6.getClass();
                    r rVarY11 = c2.l.y(aVar5, f15);
                    String strQ15 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                    fVar2.getClass();
                    mh.c(strQ15, rVarY11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                } else {
                    c2565a4 = c2565a3;
                }
                final int i117 = 2;
                objQ4 = new l() { // from class: w40.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i118 = i117;
                        int i119 = iIntValue4;
                        int i1110 = iIntValue3;
                        String str3 = strQ2;
                        k0 k0Var = (k0) obj;
                        switch (i118) {
                            case 0:
                                e.a aVar10 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i1110 + " / " + i119);
                                break;
                            case 1:
                                e.a aVar11 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i1110 + " / " + i119);
                                break;
                            default:
                                e.a aVar12 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i1110 + " / " + i119);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
                r rVarB1114 = v.b(rVarC15, (l) objQ4);
                zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarB1114, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0VarE);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a4) {
                    objQ5 = new w40.d(2);
                    o0VarE.K(objQ5);
                }
                r rVarB1115 = v.b(aVar5, (l) objQ5);
                fVar2.getClass();
                mh.c(strQ2, rVarB1115, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jO12 = gl.c.a(o0VarE).o();
                bVar6.getClass();
                r20.d.a(iIntValue3, iIntValue4, jO12, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                bVar6.getClass();
                r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                bVar6.getClass();
                r rVarY12 = c2.l.y(aVar5, f15);
                String strQ16 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                fVar2.getClass();
                mh.c(strQ16, rVarY12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            } else {
                c2565a2 = c2565a;
            }
            final int i25 = 1;
            objQ2 = new l() { // from class: w40.c
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i118 = i25;
                    int i119 = iIntValue2;
                    int i1110 = iIntValue;
                    String str3 = strQ;
                    k0 k0Var = (k0) obj;
                    switch (i118) {
                        case 0:
                            e.a aVar10 = e.f181932h;
                            k0Var.getClass();
                            h0.n(k0Var, str3 + StringUtils.SPACE + i1110 + " / " + i119);
                            break;
                        case 1:
                            e.a aVar11 = e.f181932h;
                            k0Var.getClass();
                            h0.n(k0Var, str3 + StringUtils.SPACE + i1110 + " / " + i119);
                            break;
                        default:
                            e.a aVar12 = e.f181932h;
                            k0Var.getClass();
                            h0.n(k0Var, str3 + StringUtils.SPACE + i1110 + " / " + i119);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            o0VarE.K(objQ2);
            r rVarB1116 = v.b(rVarC13, (l) objQ2);
            zVarA = c2.y.a(kVar, aVar7, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarB1116, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar3 = aVar2;
                o0VarE.M(aVar3);
            } else {
                aVar3 = aVar2;
                o0VarE.c();
            }
            int i118 = iIntValue2;
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                str2 = strQ;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    bVar3 = bVar2;
                }
                b4.c(fVar, rVarC, o0VarE);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a2) {
                    objQ3 = new w40.d(1);
                    o0VarE.K(objQ3);
                }
                r rVarB1117 = v.b(aVar5, (l) objQ3);
                fVar2.getClass();
                c2565a3 = c2565a2;
                aVar4 = aVar3;
                bVar4 = bVar3;
                mh.c(str2, rVarB1117, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jI7 = gl.c.a(o0VarE).i();
                bVar6.getClass();
                r20.d.a(iIntValue, i118, jI7, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
                if (iVar != null) {
                    iIntValue3 = 0;
                } else {
                    iIntValue3 = 0;
                }
                if (dVar != null) {
                    iIntValue4 = 0;
                } else {
                    iIntValue4 = 0;
                }
                bVar6.getClass();
                r rVarC16 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
                objQ4 = o0VarE.q();
                if (zB2) {
                    c2565a4 = c2565a3;
                    if (objQ4 == c2565a4) {
                    }
                    r rVarB1118 = v.b(rVarC16, (l) objQ4);
                    zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarB1118, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a4) {
                        objQ5 = new w40.d(2);
                        o0VarE.K(objQ5);
                    }
                    r rVarB1119 = v.b(aVar5, (l) objQ5);
                    fVar2.getClass();
                    mh.c(strQ2, rVarB1119, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                    long jO13 = gl.c.a(o0VarE).o();
                    bVar6.getClass();
                    r20.d.a(iIntValue3, iIntValue4, jO13, c2.l.y(aVar5, f16), o0VarE, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    bVar6.getClass();
                    r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                    bVar6.getClass();
                    r rVarY13 = c2.l.y(aVar5, f15);
                    String strQ17 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                    fVar2.getClass();
                    mh.c(strQ17, rVarY13, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                } else {
                    c2565a4 = c2565a3;
                }
                final int i119 = 2;
                objQ4 = new l() { // from class: w40.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i1110 = i119;
                        int i1111 = iIntValue4;
                        int i1112 = iIntValue3;
                        String str3 = strQ2;
                        k0 k0Var = (k0) obj;
                        switch (i1110) {
                            case 0:
                                e.a aVar10 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i1112 + " / " + i1111);
                                break;
                            case 1:
                                e.a aVar11 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i1112 + " / " + i1111);
                                break;
                            default:
                                e.a aVar12 = e.f181932h;
                                k0Var.getClass();
                                h0.n(k0Var, str3 + StringUtils.SPACE + i1112 + " / " + i1111);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
                r rVarB11110 = v.b(rVarC16, (l) objQ4);
                zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarB11110, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0VarE);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a4) {
                    objQ5 = new w40.d(2);
                    o0VarE.K(objQ5);
                }
                r rVarB11111 = v.b(aVar5, (l) objQ5);
                fVar2.getClass();
                mh.c(strQ2, rVarB11111, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jO14 = gl.c.a(o0VarE).o();
                bVar6.getClass();
                r20.d.a(iIntValue3, iIntValue4, jO14, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                bVar6.getClass();
                r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                bVar6.getClass();
                r rVarY14 = c2.l.y(aVar5, f15);
                String strQ18 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                fVar2.getClass();
                mh.c(strQ18, rVarY14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            } else {
                str2 = strQ;
            }
            bVar3 = bVar2;
            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            b4.c(fVar, rVarC, o0VarE);
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = new w40.d(1);
                o0VarE.K(objQ3);
            }
            r rVarB11112 = v.b(aVar5, (l) objQ3);
            fVar2.getClass();
            c2565a3 = c2565a2;
            aVar4 = aVar3;
            bVar4 = bVar3;
            mh.c(str2, rVarB11112, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            long jI8 = gl.c.a(o0VarE).i();
            bVar6.getClass();
            r20.d.a(iIntValue, i118, jI8, c2.l.y(aVar5, f16), o0VarE, 0);
            o0VarE.g0(true);
            strQ2 = gl1.y.Q(o0VarE, R.string.lbl_aerobic_endurance);
            if (iVar != null) {
                iIntValue3 = 0;
            } else {
                iIntValue3 = 0;
            }
            if (dVar != null) {
                iIntValue4 = 0;
            } else {
                iIntValue4 = 0;
            }
            bVar6.getClass();
            r rVarC17 = c2.l.C(aVar5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
            zB2 = o0VarE.B(strQ2) | o0VarE.k(iIntValue3) | o0VarE.k(iIntValue4);
            objQ4 = o0VarE.q();
            if (zB2) {
                c2565a4 = c2565a3;
                if (objQ4 == c2565a4) {
                }
                r rVarB11113 = v.b(rVarC17, (l) objQ4);
                zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarB11113, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0VarE);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a4) {
                    objQ5 = new w40.d(2);
                    o0VarE.K(objQ5);
                }
                r rVarB11114 = v.b(aVar5, (l) objQ5);
                fVar2.getClass();
                mh.c(strQ2, rVarB11114, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                long jO15 = gl.c.a(o0VarE).o();
                bVar6.getClass();
                r20.d.a(iIntValue3, iIntValue4, jO15, c2.l.y(aVar5, f16), o0VarE, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                bVar6.getClass();
                r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
                bVar6.getClass();
                r rVarY15 = c2.l.y(aVar5, f15);
                String strQ19 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
                fVar2.getClass();
                mh.c(strQ19, rVarY15, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            } else {
                c2565a4 = c2565a3;
            }
            final int i1110 = 2;
            objQ4 = new l() { // from class: w40.c
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i1111 = i1110;
                    int i1112 = iIntValue4;
                    int i1113 = iIntValue3;
                    String str3 = strQ2;
                    k0 k0Var = (k0) obj;
                    switch (i1111) {
                        case 0:
                            e.a aVar10 = e.f181932h;
                            k0Var.getClass();
                            h0.n(k0Var, str3 + StringUtils.SPACE + i1113 + " / " + i1112);
                            break;
                        case 1:
                            e.a aVar11 = e.f181932h;
                            k0Var.getClass();
                            h0.n(k0Var, str3 + StringUtils.SPACE + i1113 + " / " + i1112);
                            break;
                        default:
                            e.a aVar12 = e.f181932h;
                            k0Var.getClass();
                            h0.n(k0Var, str3 + StringUtils.SPACE + i1113 + " / " + i1112);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            o0VarE.K(objQ4);
            r rVarB11115 = v.b(rVarC17, (l) objQ4);
            zVarA2 = c2.y.a(kVar, aVar7, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarB11115, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC2, o0VarE);
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a4) {
                objQ5 = new w40.d(2);
                o0VarE.K(objQ5);
            }
            r rVarB11116 = v.b(aVar5, (l) objQ5);
            fVar2.getClass();
            mh.c(strQ2, rVarB11116, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            long jO16 = gl.c.a(o0VarE).o();
            bVar6.getClass();
            r20.d.a(iIntValue3, iIntValue4, jO16, c2.l.y(aVar5, f16), o0VarE, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
            bVar6.getClass();
            r20.a.a(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), o0VarE, 0);
            bVar6.getClass();
            r rVarY16 = c2.l.y(aVar5, f15);
            String strQ110 = gl1.y.Q(o0VarE, R.string.lbl_course_demands_footer_message);
            fVar2.getClass();
            mh.c(strQ110, rVarY16, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w40.b(this, eVar, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lw40/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "COURSE_ID", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
