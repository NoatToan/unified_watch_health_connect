package xu2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import b82.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.g;
import cx2.h;
import e23.l;
import g6.f;
import gw2.i;
import gw2.j;
import java.util.Map;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import u4.e;
import v.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxu2/c;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lxu2/d;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lxu2/d;Ldx2/c;Ljava/util/Map;)V", "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRowContainerView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rowContainerView", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends fw2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f192256h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f192257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ConstraintLayout rowContainerView;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f192260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StyledTextView f192261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StyledTextView f192262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComposeView f192263g;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f192264a;

        public a(l lVar) {
            lVar.getClass();
            this.f192264a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f192264a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f192264a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f192257a = new h("BatteryStatusView", null, 2, null);
        View viewInflate = View.inflate(context, R.layout.rts_battery_status_view, this);
        viewInflate.getClass();
        this.view = viewInflate;
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.rowContainerView = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.battery_status_view_title_text);
        viewFindViewById2.getClass();
        this.f192260d = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.battery_status_view_subtitle_text);
        viewFindViewById3.getClass();
        this.f192261e = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.battery_status_percentage_text);
        viewFindViewById4.getClass();
        this.f192262f = (StyledTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.battery_status_icon);
        viewFindViewById5.getClass();
        this.f192263g = (ComposeView) viewFindViewById5;
    }

    public final ConstraintLayout getRowContainerView() {
        return this.rowContainerView;
    }

    public final View getView() {
        return this.view;
    }

    public final void k(d dVar, dx2.c cVar, Map<String, ? extends Object> map) {
        b bVar;
        b bVar2;
        int i14;
        u4.d dVarA;
        View view2 = this.view;
        g.g(this.f192260d, view2.getContext().getString(R.string.lbl_device_battery));
        int i15 = Integer.parseInt(String.valueOf(map.get(i.ROW_ID.f79975a)));
        rw2.a aVar = cVar.f61484a;
        Object objF = aVar.f(j.BATTERY_STATUS, map, i15);
        try {
            if (!(objF instanceof b)) {
                objF = null;
            }
            bVar = (b) objF;
        } catch (ClassCastException unused) {
            bVar = null;
        }
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.f192254a) : null;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        h hVar = this.f192257a;
        StyledTextView styledTextView = this.f192261e;
        if (zBooleanValue) {
            hVar.getClass();
            styledTextView.setVisibility(0);
            g.g(styledTextView, view2.getContext().getString(R.string.lbl_device_battery));
        } else {
            styledTextView.setVisibility(8);
            hVar.getClass();
        }
        Object objF2 = aVar.f(j.BATTERY_STATUS, map, Integer.parseInt(String.valueOf(map.get(i.ROW_ID.f79975a))));
        try {
            if (!(objF2 instanceof b)) {
                objF2 = null;
            }
            bVar2 = (b) objF2;
        } catch (ClassCastException unused2) {
            bVar2 = null;
        }
        Integer numValueOf = bVar2 != null ? Integer.valueOf(bVar2.f192255b) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        g.g(this.f192262f, iIntValue + "%");
        if (zBooleanValue) {
            if (iIntValue >= 0 && iIntValue < 100) {
                dVarA = yu2.g.f199799a;
                if (dVarA == null) {
                    float f14 = (float) 24.0d;
                    f.a aVar2 = f.f75994b;
                    u4.d.a aVar3 = new u4.d.a("ChargingOutline", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
                    t1 t1Var = new t1(f0.d(4278190080L), null);
                    u1.f129010b.getClass();
                    v1.f129019b.getClass();
                    h1.f128863b.getClass();
                    int i16 = h1.f128864c;
                    e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(20.5f, 14.5f, 22.0f, 14.5f);
                    hb.a.t(eVarM, 22.0f, 9.0f, -1.5f, 5.5f);
                    eVarM.k(18.5f, 6.0f);
                    eVarM.i(3.0f, 6.0f);
                    eVarM.b(1.0f, 1.0f, -1.0f, false, false, 1.0f);
                    eVarM.p(9.5f);
                    eVarM.b(1.0f, 1.0f, 1.0f, false, false, 1.0f);
                    eVarM.h(15.5f);
                    eVarM.b(1.0f, 1.0f, 1.0f, false, false, -1.0f);
                    eVarM.i(19.5f, 7.0f);
                    eVarM.b(1.0f, 1.0f, -1.0f, false, false, -1.0f);
                    eVarM.c();
                    eVarM.k(4.0f, 16.0f);
                    eVarM.b(0.5f, 0.5f, -0.5f, false, true, -0.5f);
                    eVarM.i(3.5f, 8.0f);
                    eVarM.b(0.5f, 0.5f, 0.5f, false, true, -0.5f);
                    eVarM.h(5.5f);
                    eVarM.j(-2.0f, 4.5f);
                    eVarM.h(3.0f);
                    com.nimbusds.jose.shaded.gson.internal.a.B(eVarM, -1.2f, 4.0f, 4.0f, 16.0f);
                    eVarM.k(18.0f, 15.5f);
                    eVarM.b(0.5f, 0.5f, -0.5f, false, true, 0.5f);
                    eVarM.i(9.65f, 16.0f);
                    eVarM.j(3.85f, -6.0f);
                    eVarM.i(11.0f, 10.0f);
                    eVarM.j(1.5f, -2.5f);
                    eVarM.h(5.0f);
                    eVarM.b(0.5f, 0.5f, 0.5f, false, true, 0.5f);
                    eVarM.p(7.5f);
                    eVarM.c();
                    u4.d.a.b(aVar3, eVarM.f168407a, i16, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
                    dVarA = aVar3.c();
                    yu2.g.f199799a = dVarA;
                }
            } else if (iIntValue == 100) {
                dVarA = yu2.h.f199800a;
                if (dVarA == null) {
                    float f15 = (float) 24.0d;
                    f.a aVar4 = f.f75994b;
                    u4.d.a aVar5 = new u4.d.a("ChargingSolid", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
                    t1 t1Var2 = new t1(f0.d(4278190080L), null);
                    u1.f129010b.getClass();
                    v1.f129019b.getClass();
                    h1.f128863b.getClass();
                    int i17 = h1.f128864c;
                    e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(18.5f, 6.0f, 3.0f, 6.0f);
                    eVarM2.b(1.0f, 1.0f, -1.0f, false, false, 1.0f);
                    eVarM2.p(9.5f);
                    eVarM2.b(1.0f, 1.0f, 1.0f, false, false, 1.0f);
                    eVarM2.h(15.5f);
                    eVarM2.b(1.0f, 1.0f, 1.0f, false, false, -1.0f);
                    eVarM2.i(19.5f, 7.0f);
                    eVarM2.b(1.0f, 1.0f, -1.0f, false, false, -1.0f);
                    e0.q(eVarM2, 13.5f, 10.0f, -2.45f);
                    eVarM2.j(1.6f, -2.5f);
                    eVarM2.h(-3.1f);
                    eVarM2.i(7.45f, 12.0f);
                    eVarM2.h(3.0f);
                    com.nimbusds.jose.shaded.gson.internal.a.B(eVarM2, -1.0f, 4.1f, 13.5f, 10.0f);
                    eVarM2.k(20.5f, 14.5f);
                    eVarM2.i(22.0f, 14.5f);
                    hb.a.t(eVarM2, 22.0f, 9.0f, -1.5f, 5.5f);
                    u4.d.a.b(aVar5, eVarM2.f168407a, i17, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
                    dVarA = aVar5.c();
                    yu2.h.f199800a = dVarA;
                }
            } else {
                dVarA = yu2.f.a();
            }
        } else if (iIntValue >= 0 && iIntValue < 11) {
            dVarA = yu2.a.f199793a;
            if (dVarA == null) {
                float f16 = (float) 24.0d;
                f.a aVar6 = f.f75994b;
                u4.d.a aVar7 = new u4.d.a("Battery0", f16, f16, 24.0f, 24.0f, 0L, 0, false, 96, null);
                t1 t1Var3 = new t1(f0.d(4278190080L), null);
                u1.f129010b.getClass();
                v1.f129019b.getClass();
                h1.f128863b.getClass();
                int i18 = h1.f128864c;
                e eVarM3 = com.nimbusds.jose.shaded.gson.internal.a.m(18.5f, 6.0f, 3.0f, 6.0f);
                eVarM3.b(1.0f, 1.0f, -1.0f, false, false, 1.0f);
                eVarM3.p(9.5f);
                eVarM3.b(1.0f, 1.0f, 1.0f, false, false, 1.0f);
                eVarM3.h(15.5f);
                eVarM3.b(1.0f, 1.0f, 1.0f, false, false, -1.0f);
                eVarM3.i(19.5f, 7.0f);
                eVarM3.b(1.0f, 1.0f, -1.0f, false, false, -1.0f);
                eVarM3.c();
                eVarM3.k(18.0f, 15.5f);
                eVarM3.b(0.5f, 0.5f, -0.5f, false, true, 0.5f);
                eVarM3.i(4.0f, 16.0f);
                eVarM3.b(0.5f, 0.5f, -0.5f, false, true, -0.5f);
                eVarM3.i(3.5f, 8.0f);
                eVarM3.b(0.5f, 0.5f, 0.5f, false, true, -0.5f);
                eVarM3.h(13.5f);
                eVarM3.b(0.5f, 0.5f, 0.5f, false, true, 0.5f);
                eVarM3.p(7.5f);
                eVarM3.c();
                eVarM3.k(22.0f, 9.0f);
                eVarM3.h(-1.5f);
                eVarM3.p(5.5f);
                com.nimbusds.jose.shaded.gson.internal.a.z(eVarM3, 22.0f, 14.5f, 22.0f, 9.0f);
                u4.d.a.b(aVar7, eVarM3.f168407a, i18, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
                dVarA = aVar7.c();
                yu2.a.f199793a = dVarA;
            }
        } else if (11 <= iIntValue && iIntValue < 40) {
            dVarA = yu2.c.f199795a;
            if (dVarA == null) {
                float f17 = (float) 24.0d;
                f.a aVar8 = f.f75994b;
                u4.d.a aVar9 = new u4.d.a("Battery25", f17, f17, 24.0f, 24.0f, 0L, 0, false, 96, null);
                t1 t1Var4 = new t1(f0.d(4278190080L), null);
                u1.f129010b.getClass();
                v1.f129019b.getClass();
                h1.f128863b.getClass();
                int i19 = h1.f128864c;
                e eVar = new e();
                eVar.k(3.0f, 6.0f);
                eVar.h(15.5f);
                eVar.b(1.0f, 1.0f, 1.0f, false, true, 1.0f);
                eVar.p(9.5f);
                eVar.b(1.0f, 1.0f, -1.0f, false, true, 1.0f);
                eVar.i(3.0f, 17.5f);
                eVar.b(1.0f, 1.0f, -1.0f, false, true, -1.0f);
                eVar.i(2.0f, 7.0f);
                eVar.b(1.0f, 1.0f, 1.0f, false, true, -1.0f);
                eVar.c();
                eVar.k(17.854f, 15.854f);
                eVar.a(0.5f, 0.5f, 18.0f, false, false, 15.5f);
                eVar.i(18.0f, 8.0f);
                eVar.b(0.5f, 0.5f, -0.5f, false, false, -0.5f);
                eVar.i(7.0f, 7.5f);
                eVar.i(7.0f, 16.0f);
                eVar.h(10.5f);
                eVar.b(0.5f, 0.5f, 0.354f, false, false, -0.146f);
                eVar.c();
                u4.d.a.b(aVar9, eVar.f168407a, i19, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
                t1 t1Var5 = new t1(f0.d(4278190080L), null);
                e eVar2 = new e();
                eVar2.k(20.5f, 9.0f);
                eVar2.g(22.0f);
                eVar2.p(5.5f);
                eVar2.h(-1.5f);
                eVar2.o(9.0f);
                eVar2.c();
                u4.d.a.b(aVar9, eVar2.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
                dVarA = aVar9.c();
                yu2.c.f199795a = dVarA;
            }
        } else if (40 > iIntValue || iIntValue >= 75) {
            if (75 <= iIntValue) {
                i14 = 100;
                if (iIntValue < 100) {
                    dVarA = yu2.e.f199797a;
                    if (dVarA == null) {
                        float f18 = (float) 24.0d;
                        f.a aVar10 = f.f75994b;
                        u4.d.a aVar11 = new u4.d.a("Battery75", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
                        t1 t1Var6 = new t1(f0.d(4278190080L), null);
                        u1.f129010b.getClass();
                        v1.f129019b.getClass();
                        h1.f128863b.getClass();
                        int i24 = h1.f128864c;
                        e eVar3 = new e();
                        eVar3.k(3.0f, 6.0f);
                        eVar3.h(15.5f);
                        eVar3.b(1.0f, 1.0f, 1.0f, false, true, 1.0f);
                        eVar3.p(9.5f);
                        eVar3.b(1.0f, 1.0f, -1.0f, false, true, 1.0f);
                        eVar3.i(3.0f, 17.5f);
                        eVar3.b(1.0f, 1.0f, -1.0f, false, true, -1.0f);
                        eVar3.i(2.0f, 7.0f);
                        eVar3.b(1.0f, 1.0f, 1.0f, false, true, -1.0f);
                        eVar3.c();
                        eVar3.k(17.854f, 15.854f);
                        eVar3.a(0.5f, 0.5f, 18.0f, false, false, 15.5f);
                        eVar3.i(18.0f, 8.0f);
                        eVar3.b(0.5f, 0.5f, -0.5f, false, false, -0.5f);
                        eVar3.i(15.0f, 7.5f);
                        eVar3.i(15.0f, 16.0f);
                        eVar3.h(2.5f);
                        eVar3.b(0.5f, 0.5f, 0.354f, false, false, -0.146f);
                        eVar3.c();
                        u4.d.a.b(aVar11, eVar3.f168407a, i24, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
                        t1 t1Var7 = new t1(f0.d(4278190080L), null);
                        e eVar4 = new e();
                        eVar4.k(20.5f, 9.0f);
                        eVar4.g(22.0f);
                        eVar4.p(5.5f);
                        eVar4.h(-1.5f);
                        eVar4.o(9.0f);
                        eVar4.c();
                        u4.d.a.b(aVar11, eVar4.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
                        dVarA = aVar11.c();
                        yu2.e.f199797a = dVarA;
                    }
                }
            } else {
                i14 = 100;
            }
            if (iIntValue == i14) {
                dVarA = yu2.b.f199794a;
                if (dVarA == null) {
                    float f19 = (float) 24.0d;
                    f.a aVar12 = f.f75994b;
                    u4.d.a aVar13 = new u4.d.a("Battery100", f19, f19, 24.0f, 24.0f, 0L, 0, false, 96, null);
                    t1 t1Var8 = new t1(f0.d(4278190080L), null);
                    u1.f129010b.getClass();
                    v1.f129019b.getClass();
                    h1.f128863b.getClass();
                    int i25 = h1.f128864c;
                    e eVarM4 = com.nimbusds.jose.shaded.gson.internal.a.m(18.5f, 6.0f, 3.0f, 6.0f);
                    eVarM4.b(1.0f, 1.0f, -1.0f, false, false, 1.0f);
                    eVarM4.p(9.5f);
                    eVarM4.b(1.0f, 1.0f, 1.0f, false, false, 1.0f);
                    eVarM4.h(15.5f);
                    eVarM4.b(1.0f, 1.0f, 1.0f, false, false, -1.0f);
                    eVarM4.i(19.5f, 7.0f);
                    eVarM4.b(1.0f, 1.0f, -1.0f, false, false, -1.0f);
                    hb.a.r(eVarM4, 20.5f, 14.5f, 22.0f, 14.5f);
                    hb.a.t(eVarM4, 22.0f, 9.0f, -1.5f, 5.5f);
                    u4.d.a.b(aVar13, eVarM4.f168407a, i25, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
                    dVarA = aVar13.c();
                    yu2.b.f199794a = dVarA;
                }
            } else {
                dVarA = yu2.f.a();
            }
        } else {
            dVarA = yu2.d.f199796a;
            if (dVarA == null) {
                float f22 = (float) 24.0d;
                f.a aVar14 = f.f75994b;
                u4.d.a aVar15 = new u4.d.a("Battery50", f22, f22, 24.0f, 24.0f, 0L, 0, false, 96, null);
                t1 t1Var9 = new t1(f0.d(4278190080L), null);
                u1.f129010b.getClass();
                v1.f129019b.getClass();
                h1.f128863b.getClass();
                int i26 = h1.f128864c;
                e eVar5 = new e();
                eVar5.k(3.0f, 6.0f);
                eVar5.h(15.5f);
                eVar5.b(1.0f, 1.0f, 1.0f, false, true, 1.0f);
                eVar5.p(9.5f);
                eVar5.b(1.0f, 1.0f, -1.0f, false, true, 1.0f);
                eVar5.i(3.0f, 17.5f);
                eVar5.b(1.0f, 1.0f, -1.0f, false, true, -1.0f);
                eVar5.i(2.0f, 7.0f);
                eVar5.b(1.0f, 1.0f, 1.0f, false, true, -1.0f);
                eVar5.c();
                eVar5.k(17.854f, 15.854f);
                eVar5.a(0.5f, 0.5f, 18.0f, false, false, 15.5f);
                eVar5.i(18.0f, 8.0f);
                eVar5.b(0.5f, 0.5f, -0.5f, false, false, -0.5f);
                eVar5.i(11.0f, 7.5f);
                eVar5.i(11.0f, 16.0f);
                eVar5.h(6.5f);
                eVar5.b(0.5f, 0.5f, 0.354f, false, false, -0.146f);
                eVar5.c();
                u4.d.a.b(aVar15, eVar5.f168407a, i26, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
                t1 t1Var10 = new t1(f0.d(4278190080L), null);
                e eVar6 = new e();
                eVar6.k(20.5f, 9.0f);
                eVar6.g(22.0f);
                eVar6.p(5.5f);
                eVar6.h(-1.5f);
                eVar6.o(9.0f);
                eVar6.c();
                u4.d.a.b(aVar15, eVar6.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
                dVarA = aVar15.c();
                yu2.d.f199796a = dVarA;
            }
        }
        this.f192263g.setContent(new z3.e(-1586664847, true, new k(dVarA, 18)));
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Fragment fragment, d dVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        dVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        k(dVar, cVar, map);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new a(new wv0.h(this, dVar, cVar, map, 5)));
    }
}
