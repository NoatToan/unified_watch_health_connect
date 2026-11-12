package zu1;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import h5.e0;
import h73.v;
import i03.q;
import i03.s;
import i3.mh;
import j03.r;
import jv1.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.y3;
import vu1.o;
import vu1.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzu1/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f207108c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f207109d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f207110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f207111b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zu1/i$a", "Li03/a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i03.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f207112a;

        public a(Context context) {
            this.f207112a = context;
        }

        @Override // i03.a, i03.i
        public final void b(i03.j.a aVar) {
            final int i14 = 0;
            final Context context = this.f207112a;
            aVar.a(v.class, new s() { // from class: zu1.h
                @Override // i03.s
                public final Object a(i03.g gVar, q qVar) {
                    switch (i14) {
                        case 0:
                            gVar.getClass();
                            qVar.getClass();
                            return new ForegroundColorSpan[]{new ForegroundColorSpan(context.getColor(R.color.gcm_text_primary))};
                        default:
                            gVar.getClass();
                            qVar.getClass();
                            return new ForegroundColorSpan[]{new ForegroundColorSpan(context.getColor(R.color.gcm_text_primary))};
                    }
                }
            });
            final int i15 = 1;
            aVar.a(h73.i.class, new s() { // from class: zu1.h
                @Override // i03.s
                public final Object a(i03.g gVar, q qVar) {
                    switch (i15) {
                        case 0:
                            gVar.getClass();
                            qVar.getClass();
                            return new ForegroundColorSpan[]{new ForegroundColorSpan(context.getColor(R.color.gcm_text_primary))};
                        default:
                            gVar.getClass();
                            qVar.getClass();
                            return new ForegroundColorSpan[]{new ForegroundColorSpan(context.getColor(R.color.gcm_text_primary))};
                    }
                }
            });
        }

        @Override // i03.a, i03.i
        public final void f(r.a aVar) {
            aVar.f96199e = 0;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207113a;

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
            f207113a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zu1/i$d", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            i iVar = i.this;
            iVar.f207111b.f(false);
            iVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f207115a;

        public e(l lVar) {
            lVar.getClass();
            this.f207115a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f207115a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f207115a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207116a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f207116a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f207116a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f207117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f207118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f207117a = aVar;
            this.f207118b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f207117a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f207118b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f207119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f207119a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f207119a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f207109d = 212;
    }

    public i() {
        super(R.layout.composable_container);
        this.f207110a = new w1(s0.f105811a.b(o.class), new f(this), new h(this), new g(null, this));
        this.f207111b = new d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new tu1.c(), getViewLifecycleOwner(), b0.b.RESUMED);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_content_ref_url") : null;
        if (string == null || string.length() == 0) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "FBTTrainingGuidanceArticleFrag", "article content url is null");
            g22.e.a(this, null);
            return;
        }
        m mVarRequireActivity2 = requireActivity();
        mVarRequireActivity2.setTitle(R.string.training_guidance);
        u onBackPressedDispatcher = mVarRequireActivity2.getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f207111b, viewLifecycleOwner);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        o oVar = (o) this.f207110a.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(oVar), null, null, new t(y0Var, oVar, string, null), 3);
        y0Var.f(getViewLifecycleOwner(), new e(new yt.f(20, this, composeView)));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0269  */
    public final void u6(c0 c0Var, p3.m mVar, int i14) {
        c0 c0Var2;
        int i15;
        c2.j.k kVar;
        h4.r.a aVar;
        h5.g.a.e eVar;
        Context context;
        c0Var.getClass();
        o0 o0VarE = mVar.E(1676493780);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(c0Var) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context2 = (Context) o0VarE.A(y3Var);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarB = u1.a2.b(x2.d(aVar2, 1.0f), u1.a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = y.a(kVar2, aVar3, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String headerImageUrl = c0Var.getHeaderImageUrl();
            if (headerImageUrl == null) {
                o0VarE.C(1940051501);
                o0VarE.g0(false);
                context = context2;
                aVar = aVar2;
                kVar = kVar2;
                i15 = 0;
                eVar = eVar2;
            } else {
                o0VarE.C(1940051502);
                wf.f.a aVar5 = new wf.f.a((Context) o0VarE.A(y3Var));
                aVar5.f184930c = headerImageUrl;
                wf.f fVarA = aVar5.a();
                h4.r rVarH = x2.h(x2.f(aVar2, 1.0f), f207109d);
                f5.k.f68985a.getClass();
                i15 = 0;
                kVar = kVar2;
                aVar = aVar2;
                eVar = eVar2;
                context = context2;
                jf.r.a(fVarA, "", rVarH, null, null, f5.k.a.f68993h, null, o0VarE, 1573296, 1976);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar3.f97920e, 0.0f, 2);
            z zVarA2 = y.a(kVar, aVar3, o0VarE, i15);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
            String string = Html.fromHtml(c0Var.getArticleTitle(), 63).toString();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            o0 o0Var = o0VarE;
            int i17 = i15;
            mh.c(string, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0Var, 0, 0, 131068);
            String articleDuration = c0Var.getArticleDuration();
            fVar2.getClass();
            mh.c(articleDuration, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131070);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(aVar, 0.0f, eVar3.f97920e, 1);
            String articleDeck = c0Var.getArticleDeck();
            fVar2.getClass();
            mh.c(articleDeck, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0Var), o0Var, 0, 0, 131068);
            o0VarE = o0Var;
            h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
            Context context3 = context;
            int i18 = (o0VarE.r(context3) ? 1 : 0) | ((i16 & 14) == 4 ? 1 : i17);
            Object objQ = o0VarE.q();
            if (i18 == 0) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    c0Var2 = c0Var;
                    objQ = new yt.f(21, context3, c0Var2);
                    o0VarE.K(objQ);
                } else {
                    c0Var2 = c0Var;
                }
            } else {
                c0Var2 = c0Var;
                objQ = new yt.f(21, context3, c0Var2);
                o0VarE.K(objQ);
            }
            p002j6.c.b((l) objQ, rVarC4, null, o0VarE, 0, 4);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            c0Var2 = c0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zu1.g(this, c0Var2, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzu1/i$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
