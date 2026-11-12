package kotlin;

import a6.t;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.b0;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.protobuf.DescriptorProtos;
import com.nimbusds.jose.jwk.JWKParameterNames;
import h5.c1;
import h5.e0;
import h5.y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import o4.b1;
import o4.f1;
import o4.r1;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p1.g0;
import p1.h0;
import p1.i0;
import p1.j0;
import p1.l1;
import p1.m;
import p1.o;
import p1.p0;
import p1.t0;
import p1.u0;
import p1.z0;
import p5.a0;
import p5.c0;
import p5.d0;
import p5.k0;
import p5.l;
import p5.n;
import p5.o0;
import p5.p;
import p5.q;
import p5.r;
import p5.y;
import s5.a1;
import s5.q0;
import s5.w0;
import w5.f0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005\t\n\u000b\f\rB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Li5/u;", "Landroidx/core/view/a;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Li5/m;", "view", "<init>", "(Li5/m;)V", "c", JWKParameterNames.RSA_EXPONENT, "d", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends androidx.core.view.a implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final h0 H0;
    public final j0 A;
    public final g0 B;
    public final g0 C;
    public final String D;
    public final String E;
    public final t F;
    public final i0<j3> I;
    public j3 P;
    public boolean T;
    public final g0 X;
    public final eh2.b Y;
    public final ArrayList Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f91542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91543b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f91544c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityManager f91545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f91546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<? extends AccessibilityServiceInfo> f91547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f91548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f91549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f91550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f91551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l7.f f91552k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final i f91553k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l7.f f91554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f91555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0<n> f91556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0<n> f91557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1<l1<CharSequence>> f91558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1<p0<CharSequence>> f91559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f91560r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f91561t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p1.b<e0> f91562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q53.b f91563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f91564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f91565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i0 f91566z;

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/u$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f91567a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/u$b;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        static {
            new b();
        }

        private b() {
        }

        public static final void a(l7.f fVar, y yVar) {
            q qVar = yVar.f136098d;
            d0.f135959a.getClass();
            l lVar = (l) r.a(qVar, d0.A);
            if (x.a(yVar)) {
                l.f136032b.getClass();
                int i14 = l.f136040j;
                if (lVar != null && lVar.f136041a == i14) {
                    return;
                }
                p.f136057a.getClass();
                p5.a aVar = (p5.a) r.a(qVar, p.f136082z);
                if (aVar != null) {
                    fVar.b(new l7.f.a(R.id.accessibilityActionPageUp, aVar.f135945a));
                }
                p5.a aVar2 = (p5.a) r.a(qVar, p.B);
                if (aVar2 != null) {
                    fVar.b(new l7.f.a(R.id.accessibilityActionPageDown, aVar2.f135945a));
                }
                p5.a aVar3 = (p5.a) r.a(qVar, p.A);
                if (aVar3 != null) {
                    fVar.b(new l7.f.a(R.id.accessibilityActionPageLeft, aVar3.f135945a));
                }
                p5.a aVar4 = (p5.a) r.a(qVar, p.C);
                if (aVar4 != null) {
                    fVar.b(new l7.f.a(R.id.accessibilityActionPageRight, aVar4.f135945a));
                }
            }
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/u$d;", "Ll7/g;", "<init>", "(Li5/u;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d extends l7.g {
        public d() {
        }

        @Override // l7.g
        public final void a(int i14, l7.f fVar, String str, Bundle bundle) {
            h0 h0Var = u.H0;
            u.this.a(i14, fVar, str, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006b  */
        /* JADX WARN: Code duplicated, block: B:218:0x044d  */
        /* JADX WARN: Code duplicated, block: B:220:0x0451  */
        /* JADX WARN: Code duplicated, block: B:226:0x045b  */
        /* JADX WARN: Code duplicated, block: B:227:0x045d  */
        /* JADX WARN: Code duplicated, block: B:233:0x0467  */
        /* JADX WARN: Code duplicated, block: B:310:0x05e5  */
        /* JADX WARN: Code duplicated, block: B:311:0x05ef  */
        @Override // l7.g
        public final l7.f b(int i14) {
            h0 h0Var;
            e0 e0Var;
            boolean z14;
            int i15;
            e0 e0Var2;
            Resources resources;
            e0 e0Var3;
            Bundle bundle;
            l7.f fVarH;
            p002j6.a aVarB;
            p5.d dVar;
            int i16;
            long j8;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            y yVarL;
            int iB;
            boolean zBooleanValue;
            boolean zG;
            y yVar;
            q qVarK;
            u uVar = u.this;
            m mVar = uVar.f91542a;
            AccessibilityManager accessibilityManager = uVar.f91545d;
            if (mVar.getComposeViewContext().f91445c.getF158016a().getF7973d() != b0.b.DESTROYED) {
                a0 a0VarB = uVar.i().b(i14);
                if (a0VarB != null) {
                    y yVar2 = a0VarB.f135947a;
                    q qVarK2 = yVar2.k();
                    e0 e0Var4 = yVar2.f136097c;
                    q qVar = yVar2.f136098d;
                    d0.f135959a.getClass();
                    boolean zG2 = s.g(r.a(qVarK2, d0.f135974p), Boolean.TRUE);
                    if (zG2) {
                        if (!(Build.VERSION.SDK_INT >= 34 ? l7.c.a(accessibilityManager) : true)) {
                            fVarH = null;
                        }
                    }
                    l7.f fVarH2 = l7.f.h();
                    AccessibilityNodeInfo accessibilityNodeInfo = fVarH2.f110563a;
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 34) {
                        l7.f.d.e(accessibilityNodeInfo, zG2);
                    } else {
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (zG2 ? 64 : 0));
                        }
                    }
                    if (i14 == -1) {
                        Object parentForAccessibility = mVar.getParentForAccessibility();
                        View view2 = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        fVarH2.f110564b = -1;
                        accessibilityNodeInfo.setParent(view2);
                    } else {
                        y yVarL2 = yVar2.l();
                        Integer numValueOf = yVarL2 != null ? Integer.valueOf(yVarL2.f136100f) : null;
                        if (numValueOf == null) {
                            e5.a.c("semanticsNode " + i14 + " has null parent");
                            o2.c.f();
                            return null;
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == mVar.getSemanticsOwner().a().f136100f) {
                            iIntValue = -1;
                        }
                        fVarH2.f110564b = iIntValue;
                        accessibilityNodeInfo.setParent(mVar, iIntValue);
                    }
                    fVarH2.f110565c = i14;
                    accessibilityNodeInfo.setSource(mVar, i14);
                    accessibilityNodeInfo.setBoundsInScreen(uVar.b(a0VarB));
                    h0 h0Var2 = u.H0;
                    g0 g0Var = uVar.X;
                    l1<p0<CharSequence>> l1Var = uVar.f91559q;
                    Resources resources2 = mVar.getContext().getResources();
                    fVarH2.n("android.view.View");
                    if (qVar.f136085a.b(d0.H)) {
                        fVarH2.n("android.widget.EditText");
                    }
                    p5.j0<List<s5.c>> j0Var = d0.D;
                    t0<p5.j0<?>, Object> t0Var = qVar.f136085a;
                    if (t0Var.b(j0Var)) {
                        fVarH2.n("android.widget.TextView");
                    }
                    l lVar = (l) r.a(qVar, d0.A);
                    if (lVar != null) {
                        int i18 = lVar.f136041a;
                        if (yVar2.p()) {
                            h0Var = h0Var2;
                        } else {
                            h0Var = h0Var2;
                            if (!y.j(4, yVar2).isEmpty()) {
                                e0Var = e0Var4;
                            }
                            p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                        }
                        l.f136032b.getClass();
                        e0Var = e0Var4;
                        if (i18 == l.f136036f) {
                            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(com.garmin.android.apps.connectmobile.R.string.tab));
                        } else if (i18 == l.f136034d) {
                            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(com.garmin.android.apps.connectmobile.R.string.switch_role));
                        } else {
                            String strC = k3.c(i18);
                            if (i18 != l.f136037g || yVar2.r() || qVar.f136088d) {
                                fVarH2.n(strC);
                            }
                        }
                        p005kotlin.Unit unit2 = p005kotlin.Unit.INSTANCE;
                    } else {
                        h0Var = h0Var2;
                        e0Var = e0Var4;
                    }
                    accessibilityNodeInfo.setPackageName(mVar.getContext().getPackageName());
                    accessibilityNodeInfo.setImportantForAccessibility(c0.f(yVar2));
                    boolean zA = i17 >= 34 ? l7.c.a(accessibilityManager) : true;
                    List listJ = y.j(4, yVar2);
                    int size = listJ.size();
                    boolean z24 = zA;
                    int i19 = 0;
                    int i24 = 0;
                    while (i24 < size) {
                        int i25 = size;
                        y yVar3 = (y) listJ.get(i24);
                        List list = listJ;
                        p1.n<a0> nVarI = uVar.i();
                        int i26 = i24;
                        int i27 = yVar3.f136100f;
                        if (nVarI.a(i27)) {
                            p002j6.a aVar = mVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(yVar3.f136097c);
                            if (i27 != -1) {
                                if (aVar != null) {
                                    accessibilityNodeInfo.addChild(aVar);
                                } else {
                                    a0 a0VarB2 = uVar.i().b(i27);
                                    if (a0VarB2 == null || (yVar = a0VarB2.f135947a) == null || (qVarK = yVar.k()) == null) {
                                        zG = false;
                                    } else {
                                        d0.f135959a.getClass();
                                        zG = s.g(r.a(qVarK, d0.f135974p), Boolean.TRUE);
                                    }
                                    if (z24 || !zG) {
                                        accessibilityNodeInfo.addChild(mVar, i27);
                                    }
                                }
                                g0Var.f(i27, i19);
                                i19++;
                            }
                        }
                        i24 = i26 + 1;
                        listJ = list;
                        size = i25;
                    }
                    if (i14 == uVar.f91550i) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        fVarH2.b(l7.f.a.f110570i);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        fVarH2.b(l7.f.a.f110569h);
                    }
                    uVar.C(fVarH2, yVar2);
                    d0.f135959a.getClass();
                    p5.j0<String> j0Var2 = d0.N;
                    if (t0Var.b(j0Var2)) {
                        accessibilityNodeInfo.setContentInvalid(true);
                        accessibilityNodeInfo.setError((CharSequence) r.a(qVar, j0Var2));
                    }
                    String strF = x.f(yVar2, resources2);
                    if (Build.VERSION.SDK_INT >= 30) {
                        l7.f.b.c(accessibilityNodeInfo, strF);
                    } else {
                        accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strF);
                    }
                    fVarH2.l(x.e(yVar2));
                    r5.a aVar2 = (r5.a) r.a(qVar, d0.L);
                    if (aVar2 != null) {
                        if (aVar2 == r5.a.On) {
                            fVarH2.m(true);
                        } else if (aVar2 == r5.a.Off) {
                            fVarH2.m(false);
                        }
                        p005kotlin.Unit unit3 = p005kotlin.Unit.INSTANCE;
                    }
                    Boolean bool = (Boolean) r.a(qVar, d0.K);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        l.f136032b.getClass();
                        int i28 = l.f136036f;
                        if (lVar != null && lVar.f136041a == i28) {
                            fVarH2.t(zBooleanValue2);
                        } else {
                            fVarH2.m(zBooleanValue2);
                        }
                        p005kotlin.Unit unit4 = p005kotlin.Unit.INSTANCE;
                    }
                    if (!qVar.f136088d || y.j(4, yVar2).isEmpty()) {
                        List list2 = (List) r.a(qVar, d0.f135960b);
                        fVarH2.r(list2 != null ? (String) p13.h0.d0(list2) : null);
                    }
                    String str = (String) r.a(qVar, d0.B);
                    if (str != null) {
                        y yVarL3 = yVar2;
                        while (true) {
                            if (yVarL3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            q qVar2 = yVarL3.f136098d;
                            p5.e0.f136004a.getClass();
                            p5.j0<Boolean> j0Var3 = p5.e0.f136005b;
                            y yVar4 = yVarL3;
                            if (qVar2.f136085a.b(j0Var3)) {
                                zBooleanValue = ((Boolean) qVar2.c(j0Var3)).booleanValue();
                                break;
                            }
                            yVarL3 = yVar4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo.setViewIdResourceName(str);
                        }
                    }
                    d0.f135959a.getClass();
                    if (((p005kotlin.Unit) r.a(qVar, d0.f135967i)) != null) {
                        accessibilityNodeInfo.setHeading(true);
                        p005kotlin.Unit unit5 = p005kotlin.Unit.INSTANCE;
                    }
                    if (((p005kotlin.Unit) r.a(qVar, d0.f135968j)) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo.setTextEntryKey(true);
                        } else {
                            Bundle extras2 = accessibilityNodeInfo.getExtras();
                            if (extras2 != null) {
                                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-9)) | 8);
                            }
                        }
                        p005kotlin.Unit unit6 = p005kotlin.Unit.INSTANCE;
                    }
                    if (i14 != -1 && (iB = g0Var.b(yVar2.f136100f)) != -1) {
                        accessibilityNodeInfo.setDrawingOrder(iB);
                        p005kotlin.Unit unit7 = p005kotlin.Unit.INSTANCE;
                    }
                    accessibilityNodeInfo.setPassword(t0Var.b(d0.M));
                    Object objA = r.a(qVar, d0.P);
                    Boolean bool2 = Boolean.TRUE;
                    accessibilityNodeInfo.setEditable(s.g(objA, bool2));
                    Integer num = (Integer) r.a(qVar, d0.Q);
                    accessibilityNodeInfo.setMaxTextLength(num != null ? num.intValue() : -1);
                    accessibilityNodeInfo.setEnabled(x.a(yVar2));
                    p5.j0<Boolean> j0Var4 = d0.f135971m;
                    accessibilityNodeInfo.setFocusable(t0Var.b(j0Var4));
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.setFocused(((Boolean) qVar.c(j0Var4)).booleanValue());
                        if (accessibilityNodeInfo.isFocused()) {
                            fVarH2.a(2);
                            uVar.f91551j = i14;
                            z14 = true;
                        } else {
                            z14 = true;
                            fVarH2.a(1);
                        }
                    } else {
                        z14 = true;
                    }
                    accessibilityNodeInfo.setVisibleToUser(!c0.e(yVar2));
                    if (h4.i.f81564f) {
                        if (yVar2.p()) {
                            yVarL = yVar2.l();
                            yVarL.getClass();
                        } else {
                            yVarL = yVar2;
                        }
                        if (yVarL.n().l()) {
                            accessibilityNodeInfo.setVisibleToUser(false);
                        }
                    }
                    p5.i iVar = (p5.i) r.a(qVar, d0.f135970l);
                    if (iVar != null) {
                        int i29 = iVar.f136019a;
                        p5.i.f136017b.getClass();
                        if (!(i29 == 0)) {
                            int i30 = i29 == p5.i.f136018c ? 2 : 1;
                            accessibilityNodeInfo.setLiveRegion(i30);
                            p005kotlin.Unit unit8 = p005kotlin.Unit.INSTANCE;
                        }
                        accessibilityNodeInfo.setLiveRegion(i30);
                        p005kotlin.Unit unit9 = p005kotlin.Unit.INSTANCE;
                    }
                    fVarH2.o(false);
                    p.f136057a.getClass();
                    p5.a aVar3 = (p5.a) r.a(qVar, p.f136059c);
                    if (aVar3 != null) {
                        boolean zG3 = s.g(r.a(qVar, d0.K), bool2);
                        l.f136032b.getClass();
                        int i34 = l.f136036f;
                        if (lVar == null) {
                            i15 = 8;
                        } else {
                            i15 = 8;
                            z16 = lVar.f136041a == i34;
                            if (z16) {
                                z17 = true;
                            } else {
                                int i35 = l.f136035e;
                                if (lVar == null && lVar.f136041a == i35) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            if (z17 || (z17 && !zG3)) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            fVarH2.o(z18);
                            if (x.a(yVar2) && accessibilityNodeInfo.isClickable()) {
                                fVarH2.b(new l7.f.a(16, aVar3.f135945a));
                            }
                            p005kotlin.Unit unit10 = p005kotlin.Unit.INSTANCE;
                        }
                        if (z16) {
                            int i36 = l.f136035e;
                            if (lVar == null) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            if (z19) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        fVarH2.o(z18);
                        if (x.a(yVar2)) {
                            fVarH2.b(new l7.f.a(16, aVar3.f135945a));
                        }
                        p005kotlin.Unit unit11 = p005kotlin.Unit.INSTANCE;
                    } else {
                        i15 = 8;
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    p5.a aVar4 = (p5.a) r.a(qVar, p.f136060d);
                    if (aVar4 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (x.a(yVar2)) {
                            fVarH2.b(new l7.f.a(32, aVar4.f135945a));
                        }
                        p005kotlin.Unit unit12 = p005kotlin.Unit.INSTANCE;
                    }
                    p5.a aVar5 = (p5.a) r.a(qVar, p.f136074r);
                    if (aVar5 != null) {
                        fVarH2.b(new l7.f.a(16384, aVar5.f135945a));
                        p005kotlin.Unit unit13 = p005kotlin.Unit.INSTANCE;
                    }
                    if (x.a(yVar2)) {
                        p5.a aVar6 = (p5.a) r.a(qVar, p.f136068l);
                        if (aVar6 != null) {
                            fVarH2.b(new l7.f.a(2097152, aVar6.f135945a));
                            p005kotlin.Unit unit14 = p005kotlin.Unit.INSTANCE;
                        }
                        p5.a aVar7 = (p5.a) r.a(qVar, p.f136073q);
                        if (aVar7 != null) {
                            fVarH2.b(new l7.f.a(R.id.accessibilityActionImeEnter, aVar7.f135945a));
                            p005kotlin.Unit unit15 = p005kotlin.Unit.INSTANCE;
                        }
                        p5.a aVar8 = (p5.a) r.a(qVar, p.f136075s);
                        if (aVar8 != null) {
                            fVarH2.b(new l7.f.a(65536, aVar8.f135945a));
                            p005kotlin.Unit unit16 = p005kotlin.Unit.INSTANCE;
                        }
                        p5.a aVar9 = (p5.a) r.a(qVar, p.f136076t);
                        if (aVar9 != null) {
                            if (accessibilityNodeInfo.isFocused()) {
                                ClipDescription primaryClipDescription = mVar.getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    fVarH2.b(new l7.f.a(32768, aVar9.f135945a));
                                }
                            }
                            p005kotlin.Unit unit17 = p005kotlin.Unit.INSTANCE;
                        }
                    }
                    String strJ = u.j(yVar2);
                    if (strJ == null || strJ.length() == 0) {
                        e0Var2 = e0Var;
                    } else {
                        accessibilityNodeInfo.setTextSelection(uVar.h(yVar2), uVar.g(yVar2));
                        p5.a aVar10 = (p5.a) r.a(qVar, p.f136067k);
                        fVarH2.b(new l7.f.a(131072, aVar10 != null ? aVar10.f135945a : null));
                        fVarH2.a(256);
                        fVarH2.a(512);
                        accessibilityNodeInfo.setMovementGranularities(11);
                        List list3 = (List) r.a(qVar, d0.f135960b);
                        if ((list3 == null || list3.isEmpty()) && t0Var.b(p.f136058b)) {
                            if (!t0Var.b(d0.H) || s.g(r.a(qVar, j0Var4), bool2)) {
                                e0Var2 = e0Var;
                                e0 e0VarD = x.d(e0Var2, y.f91647a);
                                if (e0VarD != null) {
                                    q qVarY = e0VarD.y();
                                    if (!(qVarY != null ? s.g(r.a(qVarY, j0Var4), bool2) : false)) {
                                    }
                                    if (!z15) {
                                        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
                                    }
                                }
                                z15 = false;
                                if (!z15) {
                                    accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
                                }
                            } else {
                                e0Var2 = e0Var;
                            }
                            z15 = true;
                            if (!z15) {
                                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
                            }
                        } else {
                            e0Var2 = e0Var;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    CharSequence charSequenceG = fVarH2.g();
                    if (!(charSequenceG == null || charSequenceG.length() == 0) && t0Var.b(p.f136058b)) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (t0Var.b(d0.B)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (qVar.f136085a.b(d0.R)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    u0<p5.j0<?>> u0Var = qVar.f136087c;
                    if (u0Var != null) {
                        Object[] objArr = u0Var.f134733b;
                        long[] jArr = u0Var.f134732a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i37 = 0;
                            while (true) {
                                long j14 = jArr[i37];
                                resources = resources2;
                                e0Var3 = e0Var2;
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i38 = 8 - ((~(i37 - length)) >>> 31);
                                    for (int i39 = 0; i39 < i38; i39++) {
                                        if ((j14 & 255) < 128) {
                                            j8 = j14;
                                            String str2 = ((p5.j0) objArr[(i37 << 3) + i39]).f136025d;
                                            if (str2 != null) {
                                                arrayList.add(str2);
                                                p005kotlin.Unit unit18 = p005kotlin.Unit.INSTANCE;
                                            }
                                        } else {
                                            j8 = j14;
                                        }
                                        j14 = j8 >> i15;
                                    }
                                    i16 = i15;
                                    if (i38 != i16) {
                                        break;
                                    }
                                } else {
                                    i16 = i15;
                                }
                                if (i37 == length) {
                                    break;
                                }
                                i37++;
                                i15 = i16;
                                resources2 = resources;
                                e0Var2 = e0Var3;
                            }
                        } else {
                            resources = resources2;
                            e0Var3 = e0Var2;
                        }
                        p005kotlin.Unit unit19 = p005kotlin.Unit.INSTANCE;
                    } else {
                        resources = resources2;
                        e0Var3 = e0Var2;
                    }
                    accessibilityNodeInfo.setAvailableExtraData(arrayList);
                    d0 d0Var = d0.f135959a;
                    d0Var.getClass();
                    p5.k kVar = (p5.k) r.a(qVar, d0.f135962d);
                    if (kVar != null) {
                        float f14 = kVar.f136029a;
                        j23.f<Float> fVar = kVar.f136030b;
                        p.f136057a.getClass();
                        p5.j0<p5.a<e23.l<Float, Boolean>>> j0Var5 = p.f136066j;
                        if (qVar.f136085a.b(j0Var5)) {
                            fVarH2.n("android.widget.SeekBar");
                        } else {
                            fVarH2.n("android.widget.ProgressBar");
                        }
                        p5.k.f136027d.getClass();
                        if (kVar != p5.k.f136028e) {
                            accessibilityNodeInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new l7.f.i(AccessibilityNodeInfo.RangeInfo.obtain(1, fVar.getStart().floatValue(), fVar.b().floatValue(), f14)).f110587a);
                        }
                        if (qVar.f136085a.b(j0Var5) && x.a(yVar2)) {
                            float fFloatValue = fVar.b().floatValue();
                            float fFloatValue2 = fVar.getStart().floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f14 < fFloatValue) {
                                fVarH2.b(l7.f.a.f110571j);
                            }
                            float fFloatValue3 = fVar.getStart().floatValue();
                            float fFloatValue4 = fVar.b().floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f14 > fFloatValue3) {
                                fVarH2.b(l7.f.a.f110572k);
                            }
                        }
                    }
                    int i44 = a.f91567a;
                    if (x.a(yVar2)) {
                        p.f136057a.getClass();
                        p5.a aVar11 = (p5.a) r.a(qVar, p.f136066j);
                        if (aVar11 != null) {
                            fVarH2.b(new l7.f.a(R.id.accessibilityActionSetProgress, aVar11.f135945a));
                        }
                    }
                    q qVarK3 = yVar2.k();
                    d0Var.getClass();
                    p5.d dVar2 = (p5.d) r.a(qVarK3, d0.f135965g);
                    if (dVar2 != null) {
                        fVarH2.p(l7.f.g.a(dVar2.f135957a, dVar2.f135958b, 0, false));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        if (r.a(yVar2.k(), d0.f135964f) != null) {
                            List listJ2 = y.j(4, yVar2);
                            int size2 = listJ2.size();
                            for (int i45 = 0; i45 < size2; i45++) {
                                y yVar5 = (y) listJ2.get(i45);
                                q qVarK4 = yVar5.k();
                                d0.f135959a.getClass();
                                if (qVarK4.f136085a.b(d0.K)) {
                                    arrayList2.add(yVar5);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            boolean zA2 = j5.c.a(arrayList2);
                            fVarH2.p(l7.f.g.a(zA2 ? 1 : arrayList2.size(), zA2 ? arrayList2.size() : 1, 0, false));
                        }
                    }
                    q qVarK5 = yVar2.k();
                    d0.f135959a.getClass();
                    p5.e eVar = (p5.e) r.a(qVarK5, d0.f135966h);
                    if (eVar != null) {
                        fVarH2.q(l7.f.h.a(eVar.f136000a, eVar.f136001b, eVar.f136002c, eVar.f136003d, false, ((Boolean) yVar2.k().d(d0.K, j5.b.f97049a)).booleanValue()));
                    }
                    y yVarL4 = yVar2.l();
                    if (yVarL4 != null && r.a(yVarL4.k(), d0.f135964f) != null && ((dVar = (p5.d) r.a(yVarL4.k(), d0.f135965g)) == null || (dVar.f135957a >= 0 && dVar.f135958b >= 0))) {
                        if (yVar2.k().f136085a.b(d0.K)) {
                            ArrayList arrayList3 = new ArrayList();
                            List listJ3 = y.j(4, yVarL4);
                            int size3 = listJ3.size();
                            int i46 = 0;
                            for (int i47 = 0; i47 < size3; i47++) {
                                y yVar6 = (y) listJ3.get(i47);
                                q qVarK6 = yVar6.k();
                                d0.f135959a.getClass();
                                if (qVarK6.f136085a.b(d0.K)) {
                                    arrayList3.add(yVar6);
                                    if (yVar6.f136097c.L() < e0Var3.L()) {
                                        i46++;
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                boolean zA3 = j5.c.a(arrayList3);
                                int i48 = zA3 ? 0 : i46;
                                int i49 = zA3 ? i46 : 0;
                                q qVarK7 = yVar2.k();
                                d0.f135959a.getClass();
                                fVarH2.q(l7.f.h.a(i48, 1, i49, 1, false, ((Boolean) qVarK7.d(d0.K, j5.a.f97048a)).booleanValue()));
                            }
                        }
                    }
                    n nVar = (n) r.a(yVar2.getF136098d(), d0.f135981w);
                    q f136098d = yVar2.getF136098d();
                    p.f136057a.getClass();
                    p5.a aVar12 = (p5.a) r.a(f136098d, p.f136061e);
                    if (nVar != null && aVar12 != null) {
                        if (!j5.c.b(yVar2)) {
                            fVarH2.n("android.widget.HorizontalScrollView");
                        }
                        if (nVar.f136047b.invoke().floatValue() > 0.0f) {
                            fVarH2.s(true);
                        }
                        if (x.a(yVar2)) {
                            if (u.q(nVar)) {
                                fVarH2.b(l7.f.a.f110571j);
                                fVarH2.b(!x.b(yVar2) ? l7.f.a.f110579r : l7.f.a.f110577p);
                            }
                            if (u.p(nVar)) {
                                fVarH2.b(l7.f.a.f110572k);
                                fVarH2.b(!x.b(yVar2) ? l7.f.a.f110577p : l7.f.a.f110579r);
                            }
                        }
                    }
                    n nVar2 = (n) r.a(yVar2.getF136098d(), d0.f135982x);
                    if (nVar2 != null && aVar12 != null) {
                        if (!j5.c.b(yVar2)) {
                            fVarH2.n("android.widget.ScrollView");
                        }
                        if (nVar2.f136047b.invoke().floatValue() > 0.0f) {
                            fVarH2.s(true);
                        }
                        if (x.a(yVar2)) {
                            if (u.q(nVar2)) {
                                fVarH2.b(l7.f.a.f110571j);
                                fVarH2.b(l7.f.a.f110578q);
                            }
                            if (u.p(nVar2)) {
                                fVarH2.b(l7.f.a.f110572k);
                                fVarH2.b(l7.f.a.f110576o);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        b.a(fVarH2, yVar2);
                    }
                    accessibilityNodeInfo.setPaneTitle((CharSequence) r.a(yVar2.getF136098d(), d0.f135963e));
                    if (x.a(yVar2)) {
                        p5.a aVar13 = (p5.a) r.a(yVar2.getF136098d(), p.f136077u);
                        if (aVar13 != null) {
                            fVarH2.b(new l7.f.a(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, aVar13.f135945a));
                            p005kotlin.Unit unit20 = p005kotlin.Unit.INSTANCE;
                        }
                        p5.a aVar14 = (p5.a) r.a(yVar2.getF136098d(), p.f136078v);
                        if (aVar14 != null) {
                            fVarH2.b(new l7.f.a(524288, aVar14.f135945a));
                            p005kotlin.Unit unit21 = p005kotlin.Unit.INSTANCE;
                        }
                        p5.a aVar15 = (p5.a) r.a(yVar2.getF136098d(), p.f136079w);
                        if (aVar15 != null) {
                            fVarH2.b(new l7.f.a(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, aVar15.f135945a));
                            p005kotlin.Unit unit22 = p005kotlin.Unit.INSTANCE;
                        }
                        q f136098d2 = yVar2.getF136098d();
                        p5.j0<List<p5.g>> j0Var6 = p.f136081y;
                        if (f136098d2.f136085a.b(j0Var6)) {
                            List list4 = (List) yVar2.getF136098d().c(j0Var6);
                            h0 h0Var3 = h0Var;
                            if (list4.size() >= h0Var3.f134763b) {
                                vb.h.z(am.j.q(new StringBuilder("Can't have more than "), h0Var3.f134763b, " custom actions for one widget"));
                                return null;
                            }
                            l1<CharSequence> l1Var2 = new l1<>(0, 1, null);
                            p0<CharSequence> p0VarA = z0.a();
                            if (l1Var.f134764a) {
                                p1.b0.a(l1Var);
                            }
                            if (q1.a.a(l1Var.f134767d, i14, l1Var.f134765b) >= 0) {
                                p0<CharSequence> p0VarC = l1Var.c(i14);
                                h0 h0Var4 = new h0(0, 1, null);
                                int[] iArr = h0Var3.f134762a;
                                int i54 = h0Var3.f134763b;
                                for (int i55 = 0; i55 < i54; i55++) {
                                    h0Var4.d(iArr[i55]);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                int size4 = list4.size();
                                int i56 = 0;
                                while (i56 < size4) {
                                    p5.g gVar = (p5.g) list4.get(i56);
                                    p0VarC.getClass();
                                    int i57 = size4;
                                    if (p0VarC.a(gVar.getF136013a()) >= 0) {
                                        int iB2 = p0VarC.b(gVar.getF136013a());
                                        l1Var2.e(iB2, gVar.getF136013a());
                                        p0VarA.h(gVar.getF136013a(), iB2);
                                        int[] iArr2 = h0Var4.f134762a;
                                        int i58 = h0Var4.f134763b;
                                        int i59 = 0;
                                        while (true) {
                                            if (i59 >= i58) {
                                                i59 = -1;
                                                break;
                                            }
                                            int i64 = i58;
                                            if (iB2 == iArr2[i59]) {
                                                break;
                                            }
                                            i59++;
                                            i58 = i64;
                                        }
                                        if (i59 >= 0) {
                                            h0Var4.f(i59);
                                        }
                                        fVarH2.b(new l7.f.a(iB2, gVar.getF136013a()));
                                        p005kotlin.Unit unit23 = p005kotlin.Unit.INSTANCE;
                                    } else {
                                        arrayList4.add(gVar);
                                    }
                                    i56++;
                                    size4 = i57;
                                    p0VarC = p0VarC;
                                }
                                int size5 = arrayList4.size();
                                for (int i65 = 0; i65 < size5; i65++) {
                                    p5.g gVar2 = (p5.g) arrayList4.get(i65);
                                    int iA = h0Var4.a(i65);
                                    l1Var2.e(iA, gVar2.getF136013a());
                                    p0VarA.h(gVar2.getF136013a(), iA);
                                    fVarH2.b(new l7.f.a(iA, gVar2.getF136013a()));
                                }
                            } else {
                                int size6 = list4.size();
                                for (int i66 = 0; i66 < size6; i66++) {
                                    p5.g gVar3 = (p5.g) list4.get(i66);
                                    int iA2 = h0Var3.a(i66);
                                    l1Var2.e(iA2, gVar3.getF136013a());
                                    p0VarA.h(gVar3.getF136013a(), iA2);
                                    fVarH2.b(new l7.f.a(iA2, gVar3.getF136013a()));
                                }
                            }
                            uVar.f91558p.e(i14, l1Var2);
                            l1Var.e(i14, p0VarA);
                        }
                    }
                    accessibilityNodeInfo.setScreenReaderFocusable(x.c(yVar2, resources));
                    int iB3 = uVar.B.b(i14);
                    if (iB3 != -1) {
                        p002j6.a aVarB2 = k3.b(mVar.getAndroidViewsHandler$ui(), iB3);
                        if (aVarB2 != null) {
                            accessibilityNodeInfo.setTraversalBefore(aVarB2);
                        } else {
                            accessibilityNodeInfo.setTraversalBefore(mVar, iB3);
                        }
                        bundle = null;
                        uVar.a(i14, fVarH2, uVar.D, null);
                    } else {
                        bundle = null;
                    }
                    int iB4 = uVar.C.b(i14);
                    if (iB4 != -1 && (aVarB = k3.b(mVar.getAndroidViewsHandler$ui(), iB4)) != null) {
                        accessibilityNodeInfo.setTraversalAfter(aVarB);
                        uVar.a(i14, fVarH2, uVar.E, bundle);
                    }
                    q f136098d3 = yVar2.getF136098d();
                    p5.e0.f136004a.getClass();
                    String str3 = (String) r.a(f136098d3, p5.e0.f136006c);
                    if (str3 != null) {
                        fVarH2.n(str3);
                        p005kotlin.Unit unit24 = p005kotlin.Unit.INSTANCE;
                    }
                    fVarH = fVarH2;
                } else if (accessibilityManager.isEnabled()) {
                    fVarH = null;
                } else {
                    fVarH = l7.f.h();
                }
            } else if (accessibilityManager.isEnabled()) {
                fVarH = null;
            } else {
                fVarH = l7.f.h();
            }
            if (uVar.f91555m) {
                if (i14 == uVar.f91550i) {
                    uVar.f91552k = fVarH;
                }
                if (i14 == uVar.f91551j) {
                    uVar.f91554l = fVarH;
                }
            }
            return fVarH;
        }

        @Override // l7.g
        public final l7.f c(int i14) {
            u uVar = u.this;
            if (i14 != 1) {
                if (i14 == 2) {
                    return b(uVar.f91550i);
                }
                vb.h.s(am.j.h(i14, "Unknown focus type: "));
                return null;
            }
            int i15 = uVar.f91551j;
            if (i15 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i15);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:324:0x065b  */
        /* JADX WARN: Code duplicated, block: B:326:0x067d  */
        /* JADX WARN: Code duplicated, block: B:331:0x0698  */
        /* JADX WARN: Code duplicated, block: B:335:0x06a5  */
        /* JADX WARN: Code duplicated, block: B:337:0x06b1 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:372:0x0731  */
        /* JADX WARN: Code duplicated, block: B:375:0x073e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:377:0x0742  */
        /* JADX WARN: Code duplicated, block: B:378:0x0747  */
        /* JADX WARN: Code duplicated, block: B:380:0x0750 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:381:0x0752  */
        /* JADX WARN: Code duplicated, block: B:384:0x0757  */
        /* JADX WARN: Code duplicated, block: B:387:0x075e  */
        /* JADX WARN: Code duplicated, block: B:389:0x0766  */
        /* JADX WARN: Code duplicated, block: B:396:0x0783  */
        /* JADX WARN: Code duplicated, block: B:398:0x0787  */
        /* JADX WARN: Code duplicated, block: B:399:0x0790  */
        /* JADX WARN: Code duplicated, block: B:401:0x0798  */
        /* JADX WARN: Code duplicated, block: B:481:0x08d4  */
        /* JADX WARN: Code duplicated, block: B:486:0x08f1  */
        /* JADX WARN: Code duplicated, block: B:493:0x0908  */
        /* JADX WARN: Code duplicated, block: B:495:0x0911  */
        /* JADX WARN: Code duplicated, block: B:497:0x0924  */
        /* JADX WARN: Code duplicated, block: B:499:0x092d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x0395 -> B:172:0x0396). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01c3 -> B:99:0x01c4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:99:0x01c4
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // l7.g
        public final boolean d(int r25, int r26, android.os.Bundle r27) {
            /*
                Method dump skipped, instruction units count: 2736
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.u.d.d(int, int, android.os.Bundle):boolean");
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Li5/u$e;", "", "Lp5/y;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Lp5/y;IIIIJ)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f91569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f91571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f91572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f91573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f91574f;

        public e(y yVar, int i14, int i15, int i16, int i17, long j8) {
            this.f91569a = yVar;
            this.f91570b = i14;
            this.f91571c = i15;
            this.f91572d = i16;
            this.f91573e = i17;
            this.f91574f = j8;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp5/y;", "it", "", "invoke", "(Lp5/y;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends w implements e23.l<y, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f91575a = new f();

        public f() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(y yVar) {
            q qVarK = yVar.k();
            d0.f135959a.getClass();
            return Boolean.valueOf(qVarK.f136085a.b(d0.C));
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/u$g", "Lp5/k0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f91576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r1 f91577b;

        public g(r1 r1Var) {
            this.f91577b = r1Var;
        }

        @Override // p5.k0
        public final <T> void a(p5.j0<T> j0Var, T t7) {
            if (t7 == this.f91577b) {
                this.f91576a = true;
            }
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/accessibility/AccessibilityEvent;", "invoke", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h extends w implements e23.l<AccessibilityEvent, Boolean> {
        public h() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            u uVar = u.this;
            return Boolean.valueOf(uVar.f91542a.getParent().requestSendAccessibilityEvent(uVar.f91542a, accessibilityEvent));
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li5/i3;", "it", "", "invoke", "(Li5/i3;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends w implements e23.l<i3, p005kotlin.Unit> {
        public i() {
            super(1);
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(i3 i3Var) {
            i3 i3Var2 = i3Var;
            h0 h0Var = u.H0;
            u uVar = u.this;
            uVar.getClass();
            if (i3Var2.f91209b.contains(i3Var2)) {
                h5.r1 snapshotObserver = uVar.f91542a.getSnapshotObserver();
                snapshotObserver.f81981a.d(i3Var2, uVar.f91553k0, new w(i3Var2, uVar));
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/e0;", "it", "", "invoke", "(Lh5/e0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends w implements e23.l<e0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f91580a = new j();

        public j() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(e0 e0Var) {
            q qVarY = e0Var.y();
            boolean z14 = false;
            if (qVarY != null && qVarY.f136088d) {
                z14 = true;
            }
            return Boolean.valueOf(z14);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/e0;", "it", "", "invoke", "(Lh5/e0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends w implements e23.l<e0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f91581a = new k();

        public k() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(e0 e0Var) {
            return Boolean.valueOf(e0Var.P.d(8));
        }
    }

    static {
        new c(null);
        H0 = m.a(com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_0, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_1, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_2, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_3, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_4, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_5, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_6, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_7, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_8, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_9, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_10, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_11, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_12, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_13, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_14, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_15, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_16, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_17, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_18, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_19, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_20, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_21, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_22, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_23, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_24, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_25, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_26, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_27, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_28, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_29, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_30, com.garmin.android.apps.connectmobile.R.id.accessibility_custom_action_31);
    }

    public u(m mVar) {
        this.f91542a = mVar;
        Object systemService = mVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f91545d = (AccessibilityManager) systemService;
        this.f91546e = 100L;
        this.f91548g = new Handler(Looper.getMainLooper());
        this.f91549h = new d();
        this.f91550i = Integer.MIN_VALUE;
        this.f91551j = Integer.MIN_VALUE;
        this.f91556n = new i0<>(0, 1, null);
        this.f91557o = new i0<>(0, 1, null);
        this.f91558p = new l1<>(0, 1, null);
        this.f91559q = new l1<>(0, 1, null);
        this.f91560r = -1;
        this.f91562v = new p1.b<>(0, 1, null);
        this.f91563w = q53.l.a(1, 6, null);
        this.f91564x = true;
        i0 i0Var = o.f134780a;
        i0Var.getClass();
        this.f91566z = i0Var;
        this.A = new j0(0, 1, null);
        this.B = new g0(0, 1, null);
        this.C = new g0(0, 1, null);
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new t();
        this.I = o.a();
        this.P = new j3(mVar.getSemanticsOwner().a(), i0Var);
        int i14 = p1.j.f134744a;
        this.X = new g0(0, 1, null);
        mVar.addOnAttachStateChangeListener(this);
        this.Y = new eh2.b(this, 21);
        this.Z = new ArrayList();
        this.f91553k0 = new i();
    }

    public static Rect D(b1 b1Var, float f14, float f15) {
        if (!(b1Var instanceof b1.b) && !(b1Var instanceof b1.c)) {
            return null;
        }
        n4.d f128812a = b1Var.getF128812a();
        return new Rect((int) (f128812a.f123547a + f14), (int) (f128812a.f123548b + f15), (int) (f128812a.f123549c + f14), (int) (f128812a.f123550d + f15));
    }

    public static float[] F(b1 b1Var) {
        if (!(b1Var instanceof b1.c)) {
            return null;
        }
        n4.e eVar = ((b1.c) b1Var).f128813a;
        long j8 = eVar.f123555e;
        long j14 = eVar.f123558h;
        long j15 = eVar.f123557g;
        long j16 = eVar.f123556f;
        return new float[]{Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (eVar.f123555e & 4294967295L)), Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat((int) (j16 & 4294967295L)), Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L))};
    }

    public static Region G(b1 b1Var, float f14, float f15) {
        if (!(b1Var instanceof b1.a)) {
            return null;
        }
        f1 f1Var = ((b1.a) b1Var).f128811a;
        n4.d dVarN = f1Var.getBounds().n(f14, f15);
        Region region = new Region(new Rect((int) (dVarN.f123547a + 0.0f), (int) (dVarN.f123548b + 0.0f), (int) (dVarN.f123549c + 0.0f), (int) (dVarN.f123550d + 0.0f)));
        Region region2 = new Region();
        if (!(f1Var instanceof o4.j)) {
            org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
            return null;
        }
        Path path = ((o4.j) f1Var).f128869b;
        path.offset(f14, f15);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i14 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i14 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i14);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String j(y yVar) {
        s5.c cVar;
        if (yVar != null) {
            q qVar = yVar.f136098d;
            d0.f135959a.getClass();
            p5.j0<List<String>> j0Var = d0.f135960b;
            if (qVar.f136085a.b(j0Var)) {
                return i6.b.b((List) qVar.c(j0Var), ",", null, 62);
            }
            if (qVar.f136085a.b(d0.H)) {
                s5.c cVarL = l(qVar);
                if (cVarL != null) {
                    return cVarL.f157138b;
                }
            } else {
                List list = (List) r.a(qVar, d0.D);
                if (list != null && (cVar = (s5.c) p13.h0.d0(list)) != null) {
                    return cVar.f157138b;
                }
            }
        }
        return null;
    }

    public static s5.c l(q qVar) {
        d0.f135959a.getClass();
        return (s5.c) r.a(qVar, d0.H);
    }

    public static final boolean o(n nVar, float f14) {
        e23.a<Float> aVar = nVar.f136046a;
        if (f14 >= 0.0f || aVar.invoke().floatValue() <= 0.0f) {
            return f14 > 0.0f && aVar.invoke().floatValue() < nVar.f136047b.invoke().floatValue();
        }
        return true;
    }

    public static final boolean p(n nVar) {
        e23.a<Float> aVar = nVar.f136046a;
        boolean z14 = nVar.f136048c;
        if (aVar.invoke().floatValue() <= 0.0f || z14) {
            return aVar.invoke().floatValue() < nVar.f136047b.invoke().floatValue() && z14;
        }
        return true;
    }

    public static final boolean q(n nVar) {
        e23.a<Float> aVar = nVar.f136046a;
        boolean z14 = nVar.f136048c;
        if (aVar.invoke().floatValue() >= nVar.f136047b.invoke().floatValue() || z14) {
            return aVar.invoke().floatValue() > 0.0f && z14;
        }
        return true;
    }

    public static /* synthetic */ void v(u uVar, int i14, int i15, Integer num, int i16) {
        if ((i16 & 4) != 0) {
            num = null;
        }
        uVar.u(i14, i15, num, null);
    }

    public final void A(e0 e0Var) {
        if (e0Var.isAttached() && !this.f91542a.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(e0Var)) {
            int i14 = e0Var.f81761b;
            n nVarB = this.f91556n.b(i14);
            n nVarB2 = this.f91557o.b(i14);
            if (nVarB == null && nVarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(i14, 4096);
            if (nVarB != null) {
                accessibilityEventCreateEvent.setScrollX((int) nVarB.f136046a.invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) nVarB.f136047b.invoke().floatValue());
            }
            if (nVarB2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) nVarB2.f136046a.invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) nVarB2.f136047b.invoke().floatValue());
            }
            t(accessibilityEventCreateEvent);
        }
    }

    public final boolean B(y yVar, int i14, int i15, boolean z14) {
        String strJ;
        q qVar = yVar.f136098d;
        int i16 = yVar.f136100f;
        p.f136057a.getClass();
        p5.j0<p5.a<e23.q<Integer, Integer, Boolean, Boolean>>> j0Var = p.f136067k;
        if (qVar.f136085a.b(j0Var) && x.a(yVar)) {
            e23.q qVar2 = (e23.q) ((p5.a) qVar.c(j0Var)).f135946b;
            if (qVar2 != null) {
                return ((Boolean) qVar2.invoke(Integer.valueOf(i14), Integer.valueOf(i15), Boolean.valueOf(z14))).booleanValue();
            }
        } else if ((i14 != i15 || i15 != this.f91560r) && (strJ = j(yVar)) != null) {
            if (i14 < 0 || i14 != i15 || i15 > strJ.length()) {
                i14 = -1;
            }
            this.f91560r = i14;
            boolean z15 = strJ.length() > 0;
            t(f(r(i16), z15 ? Integer.valueOf(this.f91560r) : null, z15 ? Integer.valueOf(this.f91560r) : null, z15 ? Integer.valueOf(strJ.length()) : null, strJ));
            x(i16);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final void C(l7.f fVar, y yVar) {
        SpannableString spannableString;
        ?? arrayList;
        int i14;
        List list;
        t tVar;
        int i15;
        int i16;
        int i17;
        int i18;
        s5.c cVarG = x.g(yVar);
        if (cVarG != null) {
            m mVar = this.f91542a;
            w5.q.b fontFamilyResolver = mVar.getFontFamilyResolver();
            g6.c density = mVar.getDensity();
            String str = cVarG.f157138b;
            List<s5.c.d<? extends s5.c.a>> list2 = cVarG.f157137a;
            SpannableString spannableString2 = new SpannableString(str);
            ArrayList arrayList2 = cVarG.f157139c;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i19 = 0;
                while (i19 < size) {
                    s5.c.d dVar = (s5.c.d) arrayList2.get(i19);
                    s5.i0 i0Var = (s5.i0) dVar.f157149a;
                    int i24 = dVar.f157150b;
                    int i25 = dVar.f157151c;
                    int i26 = size;
                    s5.i0 i0VarA = s5.i0.a(i0Var, 0L, 65503);
                    d6.l lVar = i0VarA.f157211a;
                    d6.m mVar2 = i0VarA.textGeometricTransform;
                    d6.i iVar = i0VarA.background;
                    w5.q qVar = i0VarA.fontFamily;
                    String str2 = str;
                    w5.b0 b0Var = i0VarA.fontStyle;
                    b6.c.c(spannableString2, lVar.getF57707b(), i24, i25);
                    ArrayList arrayList3 = arrayList2;
                    b6.c.d(spannableString2, i0VarA.fontSize, density, i24, i25);
                    f0 f0Var = i0VarA.fontWeight;
                    if (f0Var == null && b0Var == null) {
                        i17 = 33;
                    } else {
                        if (f0Var == null) {
                            f0.f182097b.getClass();
                            f0Var = f0.f182102g;
                        }
                        if (b0Var != null) {
                            i15 = b0Var.f182072a;
                        } else {
                            w5.b0.f182070b.getClass();
                            i15 = 0;
                        }
                        f0.f182097b.getClass();
                        boolean z14 = f0Var.compareTo(f0.f182100e) >= 0;
                        w5.b0.f182070b.getClass();
                        boolean z15 = i15 == w5.b0.f182071c;
                        if (z15 && z14) {
                            i16 = 3;
                        } else if (z14) {
                            i16 = 1;
                        } else {
                            i16 = z15 ? 2 : 0;
                        }
                        StyleSpan styleSpan = new StyleSpan(i16);
                        i17 = 33;
                        spannableString2.setSpan(styleSpan, i24, i25, 33);
                    }
                    if (qVar != null) {
                        if (qVar instanceof w5.i0) {
                            spannableString2.setSpan(new TypefaceSpan(((w5.i0) qVar).f182124g), i24, i25, i17);
                        } else {
                            w5.c0 c0Var = i0VarA.fontSynthesis;
                            if (c0Var != null) {
                                i18 = c0Var.f182079a;
                            } else {
                                w5.c0.f182075b.getClass();
                                i18 = w5.c0.f182078e;
                            }
                            f0.f182097b.getClass();
                            f0 f0Var2 = f0.f182102g;
                            w5.b0.f182070b.getClass();
                            Object f182175a = fontFamilyResolver.a(qVar, f0Var2, 0, i18).getF182175a();
                            f182175a.getClass();
                            a6.k.f1511a.getClass();
                            TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) f182175a);
                            i17 = 33;
                            spannableString2.setSpan(typefaceSpan, i24, i25, 33);
                        }
                    }
                    if (iVar != null) {
                        d6.i.f57760b.getClass();
                        if (iVar.a(d6.i.f57762d)) {
                            spannableString2.setSpan(new UnderlineSpan(), i24, i25, i17);
                        }
                        if (iVar.a(d6.i.f57763e)) {
                            spannableString2.setSpan(new StrikethroughSpan(), i24, i25, i17);
                        }
                    }
                    if (mVar2 != null) {
                        spannableString2.setSpan(new ScaleXSpan(mVar2.f57777a), i24, i25, i17);
                    }
                    b6.c.e(spannableString2, i0VarA.localeList, i24, i25);
                    long j8 = i0VarA.f157222l;
                    if (j8 != 16) {
                        spannableString2.setSpan(new BackgroundColorSpan(o4.f0.j(j8)), i24, i25, 33);
                    }
                    i19++;
                    size = i26;
                    str = str2;
                    density = density;
                    arrayList2 = arrayList3;
                }
            }
            String str3 = str;
            int length = str3.length();
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    s5.c.d<? extends s5.c.a> dVar2 = list2.get(i27);
                    s5.c.d<? extends s5.c.a> dVar3 = dVar2;
                    if ((dVar3.f157149a instanceof s5.z0) && s5.f.b(0, length, dVar3.f157150b, dVar3.f157151c)) {
                        arrayList.add(dVar2);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
            arrayList.getClass();
            int size3 = ((Collection) arrayList).size();
            for (int i28 = 0; i28 < size3; i28++) {
                s5.c.d dVar4 = (s5.c.d) arrayList.get(i28);
                s5.z0 z0Var = (s5.z0) dVar4.f157149a;
                int i29 = dVar4.f157150b;
                int i30 = dVar4.f157151c;
                if (!(z0Var instanceof s5.b1)) {
                    lc.u0.r();
                    return;
                }
                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(((s5.b1) z0Var).f157136a).build(), i29, i30, 33);
            }
            int length2 = str3.length();
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList(list2.size());
                int size4 = list2.size();
                for (int i34 = 0; i34 < size4; i34++) {
                    s5.c.d<? extends s5.c.a> dVar5 = list2.get(i34);
                    s5.c.d<? extends s5.c.a> dVar6 = dVar5;
                    if ((dVar6.f157149a instanceof a1) && s5.f.b(0, length2, dVar6.f157150b, dVar6.f157151c)) {
                        arrayList4.add(dVar5);
                    }
                }
                i14 = 0;
                list = arrayList4;
            } else {
                i14 = 0;
                list = p13.j0.f134944a;
            }
            list.getClass();
            int size5 = list.size();
            int i35 = i14;
            while (true) {
                tVar = this.F;
                if (i35 >= size5) {
                    break;
                }
                s5.c.d dVar7 = (s5.c.d) list.get(i35);
                a1 a1Var = (a1) dVar7.f157149a;
                int i36 = dVar7.f157150b;
                int i37 = dVar7.f157151c;
                WeakHashMap<a1, URLSpan> weakHashMap = tVar.f1524a;
                URLSpan uRLSpan = weakHashMap.get(a1Var);
                if (uRLSpan == null) {
                    uRLSpan = new URLSpan(a1Var.f157127a);
                    weakHashMap.put(a1Var, uRLSpan);
                }
                spannableString2.setSpan(uRLSpan, i36, i37, 33);
                i35++;
            }
            List listA = cVarG.a(str3.length());
            int size6 = listA.size();
            for (int i38 = i14; i38 < size6; i38++) {
                s5.c.d<s5.m> dVar8 = (s5.c.d) listA.get(i38);
                int i39 = dVar8.f157150b;
                s5.m mVar3 = dVar8.f157149a;
                int i44 = dVar8.f157151c;
                if (i39 != i44) {
                    s5.m mVar4 = mVar3;
                    if ((mVar4 instanceof s5.m.b) && ((s5.m.b) mVar4).f157244c == null) {
                        mVar3.getClass();
                        s5.c.d<s5.m.b> dVar9 = new s5.c.d<>((s5.m.b) mVar3, i39, i44);
                        WeakHashMap<s5.c.d<s5.m.b>, URLSpan> weakHashMap2 = tVar.f1525b;
                        URLSpan uRLSpan2 = weakHashMap2.get(dVar9);
                        if (uRLSpan2 == null) {
                            uRLSpan2 = new URLSpan(dVar9.f157149a.f157242a);
                            weakHashMap2.put(dVar9, uRLSpan2);
                        }
                        spannableString2.setSpan(uRLSpan2, i39, i44, 33);
                    } else {
                        WeakHashMap<s5.c.d<s5.m>, a6.l> weakHashMap3 = tVar.f1526c;
                        a6.l lVar2 = weakHashMap3.get(dVar8);
                        if (lVar2 == null) {
                            lVar2 = new a6.l(mVar4);
                            weakHashMap3.put(dVar8, lVar2);
                        }
                        spannableString2.setSpan(lVar2, i39, i44, 33);
                    }
                }
            }
            spannableString = (SpannableString) H(spannableString2);
        } else {
            spannableString = null;
        }
        fVar.u(spannableString);
    }

    public final Rect E(float f14, float f15, float f16, float f17) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        n4.c.a aVar = n4.c.f123541b;
        m mVar = this.f91542a;
        long jF = mVar.f(jFloatToRawIntBits);
        long jF2 = mVar.f((((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32));
        int i14 = (int) (jF >> 32);
        int i15 = (int) (jF2 >> 32);
        int i16 = (int) (jF & 4294967295L);
        int i17 = (int) (jF2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15))), (int) Math.floor(Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))));
    }

    public final void I() {
        char c14;
        long j8;
        long j14;
        long j15;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i14;
        int[] iArr2;
        long j16;
        int iNumberOfTrailingZeros;
        char c15;
        long j17;
        String str;
        q qVar;
        j0 j0Var = new j0(0, 1, null);
        j0 j0Var2 = this.A;
        int[] iArr3 = j0Var2.f134794b;
        long[] jArr3 = j0Var2.f134793a;
        int length = jArr3.length - 2;
        i0<j3> i0Var = this.I;
        char c16 = 7;
        long j18 = -9187201950435737472L;
        int i15 = 8;
        if (length >= 0) {
            int i16 = 0;
            j14 = 128;
            while (true) {
                long j19 = jArr3[i16];
                j15 = 255;
                if ((((~j19) << c16) & j19 & j18) != j18) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j19 & 255) < 128) {
                            int i19 = iArr3[(i16 << 3) + i18];
                            c15 = c16;
                            a0 a0VarB = i().b(i19);
                            y yVar = a0VarB != null ? a0VarB.f135947a : null;
                            if (yVar != null) {
                                q qVar2 = yVar.f136098d;
                                d0.f135959a.getClass();
                                j17 = j18;
                                if (!qVar2.f136085a.b(d0.f135963e)) {
                                }
                            } else {
                                j17 = j18;
                            }
                            j0Var.b(i19);
                            j3 j3VarB = i0Var.b(i19);
                            if (j3VarB == null || (qVar = j3VarB.f91234a) == null) {
                                str = null;
                            } else {
                                d0.f135959a.getClass();
                                str = (String) r.a(qVar, d0.f135963e);
                            }
                            w(i19, 32, str);
                        } else {
                            c15 = c16;
                            j17 = j18;
                        }
                        j19 >>= 8;
                        i18++;
                        c16 = c15;
                        j18 = j17;
                    }
                    c14 = c16;
                    j8 = j18;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    c14 = c16;
                    j8 = j18;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                c16 = c14;
                j18 = j8;
            }
        } else {
            c14 = 7;
            j8 = -9187201950435737472L;
            j14 = 128;
            j15 = 255;
        }
        int[] iArr4 = j0Var.f134794b;
        long[] jArr4 = j0Var.f134793a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j24 = jArr4[i24];
                if ((((~j24) << c14) & j24 & j8) != j8) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j24 & j15) < j14) {
                            int i27 = iArr4[(i24 << 3) + i26];
                            int iHashCode = Integer.hashCode(i27) * (-862048943);
                            int i28 = iHashCode ^ (iHashCode << 16);
                            int i29 = i28 & 127;
                            int i30 = j0Var2.f134795c;
                            int i34 = (i28 >>> 7) & i30;
                            i14 = i15;
                            int i35 = 0;
                            while (true) {
                                long[] jArr5 = j0Var2.f134793a;
                                int i36 = i34 >> 3;
                                jArr2 = jArr4;
                                int i37 = (i34 & 7) << 3;
                                long j25 = (jArr5[i36] >>> i37) | ((jArr5[i36 + 1] << (64 - i37)) & ((-i37) >> 63));
                                j16 = j24;
                                long j26 = (((long) i29) * 72340172838076673L) ^ j25;
                                long j27 = (j26 - 72340172838076673L) & (~j26) & j8;
                                while (j27 != 0) {
                                    iNumberOfTrailingZeros = (i34 + (Long.numberOfTrailingZeros(j27) >> 3)) & i30;
                                    iArr2 = iArr4;
                                    if (j0Var2.f134794b[iNumberOfTrailingZeros] == i27) {
                                        break;
                                    }
                                    j27 &= j27 - 1;
                                    iArr4 = iArr2;
                                }
                                iArr2 = iArr4;
                                if ((j25 & ((~j25) << 6) & j8) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i35 += 8;
                                i34 = (i34 + i35) & i30;
                                j24 = j16;
                                jArr4 = jArr2;
                                iArr4 = iArr2;
                            }
                            int i38 = iNumberOfTrailingZeros;
                            if (i38 >= 0) {
                                j0Var2.h(i38);
                            }
                        } else {
                            jArr2 = jArr4;
                            i14 = i15;
                            iArr2 = iArr4;
                            j16 = j24;
                        }
                        j24 = j16 >> i14;
                        i26++;
                        i15 = i14;
                        jArr4 = jArr2;
                        iArr4 = iArr2;
                    }
                    jArr = jArr4;
                    iArr = iArr4;
                    if (i25 != i15) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i24 == length2) {
                    break;
                }
                i24++;
                jArr4 = jArr;
                iArr4 = iArr;
                i15 = 8;
            }
        }
        i0Var.c();
        p1.n<a0> nVarI = i();
        int[] iArr5 = nVarI.f134773b;
        Object[] objArr = nVarI.f134774c;
        long[] jArr6 = nVarI.f134772a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i39 = 0;
            while (true) {
                long j28 = jArr6[i39];
                if ((((~j28) << c14) & j28 & j8) != j8) {
                    int i44 = 8 - ((~(i39 - length3)) >>> 31);
                    for (int i45 = 0; i45 < i44; i45++) {
                        if ((j28 & j15) < j14) {
                            int i46 = (i39 << 3) + i45;
                            int i47 = iArr5[i46];
                            y yVar2 = ((a0) objArr[i46]).f135947a;
                            q qVar3 = yVar2.f136098d;
                            d0.f135959a.getClass();
                            p5.j0<String> j0Var3 = d0.f135963e;
                            if (qVar3.f136085a.b(j0Var3) && j0Var2.b(i47)) {
                                w(i47, 16, (String) yVar2.f136098d.c(j0Var3));
                            }
                            i0Var.i(i47, new j3(yVar2, i()));
                        }
                        j28 >>= 8;
                    }
                    if (i44 != 8) {
                        break;
                    }
                }
                if (i39 == length3) {
                    break;
                } else {
                    i39++;
                }
            }
        }
        this.P = new j3(this.f91542a.getSemanticsOwner().a(), i());
    }

    public final void a(int i14, l7.f fVar, String str, Bundle bundle) {
        y yVar;
        q0 q0VarA;
        m mVar;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f110563a;
        a0 a0VarB = i().b(i14);
        if (a0VarB == null || (yVar = a0VarB.f135947a) == null) {
            return;
        }
        e0 e0Var = yVar.f136097c;
        q qVar = yVar.f136098d;
        String strJ = j(yVar);
        if (s.g(str, this.D)) {
            int iB = this.B.b(i14);
            if (iB != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB);
                return;
            }
            return;
        }
        if (s.g(str, this.E)) {
            int iB2 = this.C.b(i14);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        p.f136057a.getClass();
        boolean zB = qVar.f136085a.b(p.f136058b);
        m mVar2 = this.f91542a;
        if (zB && bundle != null && s.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i15 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i16 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i16 <= 0 || i15 < 0) {
                return;
            }
            if (i15 < (strJ != null ? strJ.length() : Integer.MAX_VALUE) && (q0VarA = k3.a(qVar)) != null) {
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                while (i17 < i16) {
                    int i18 = i15 + i17;
                    RectF rectF = null;
                    if (i18 >= q0VarA.f157280a.f157265a.f157138b.length()) {
                        arrayList.add(null);
                        i17 = i17;
                        mVar = mVar2;
                    } else {
                        n4.d dVarO = q0VarA.b(i18).o(yVar.m());
                        n4.d dVarG = yVar.g();
                        n4.d dVarK = dVarO.m(dVarG) ? dVarO.k(dVarG) : null;
                        if (dVarK != null) {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dVarK.f123548b)) & 4294967295L) | (((long) Float.floatToRawIntBits(dVarK.f123547a)) << 32);
                            n4.c.a aVar = n4.c.f123541b;
                            long jF = mVar2.f(jFloatToRawIntBits);
                            long jF2 = mVar2.f((((long) Float.floatToRawIntBits(dVarK.f123550d)) & 4294967295L) | (((long) Float.floatToRawIntBits(dVarK.f123549c)) << 32));
                            int i19 = (int) (jF >> 32);
                            int i24 = (int) (jF2 >> 32);
                            int i25 = (int) (jF & 4294967295L);
                            mVar = mVar2;
                            int i26 = (int) (jF2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i19), Float.intBitsToFloat(i24)), Math.min(Float.intBitsToFloat(i25), Float.intBitsToFloat(i26)), Math.max(Float.intBitsToFloat(i19), Float.intBitsToFloat(i24)), Math.max(Float.intBitsToFloat(i25), Float.intBitsToFloat(i26)));
                        } else {
                            mVar = mVar2;
                        }
                        arrayList.add(rectF);
                    }
                    i17++;
                    mVar2 = mVar;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        d0.f135959a.getClass();
        p5.j0<String> j0Var = d0.B;
        if (qVar.f136085a.b(j0Var) && bundle != null && s.g(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) r.a(qVar, j0Var);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (s.g(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, yVar.f136100f);
            return;
        }
        if (s.g(str, "androidx.compose.ui.semantics.shapeType")) {
            r1 r1Var = (r1) r.a(qVar, d0.R);
            if (r1Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                n4.d dVarK2 = k(yVar, rect, r1Var);
                long jG = dVarK2.g();
                float f14 = dVarK2.f123548b;
                float f15 = dVarK2.f123547a;
                b1 b1VarA = r1Var.a(jG, e0Var.B, mVar2.getDensity());
                if (b1VarA instanceof b1.b) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(b1VarA, f15, f14));
                    return;
                } else if (b1VarA instanceof b1.c) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(b1VarA, f15, f14));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F(b1VarA));
                    return;
                } else if (!(b1VarA instanceof b1.a)) {
                    lc.u0.r();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G(b1VarA, f15, f14));
                    return;
                }
            }
            return;
        }
        int i27 = 0;
        if (s.g(str, "androidx.compose.ui.semantics.shapeRect")) {
            r1 r1Var2 = (r1) r.a(qVar, d0.R);
            if (r1Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                n4.d dVarK3 = k(yVar, rect2, r1Var2);
                Rect rectD = D(r1Var2.a(dVarK3.g(), e0Var.B, mVar2.getDensity()), dVarK3.f123547a, dVarK3.f123548b);
                if (rectD != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectD);
                    return;
                }
                return;
            }
            return;
        }
        if (s.g(str, "androidx.compose.ui.semantics.shapeCorners")) {
            r1 r1Var3 = (r1) r.a(qVar, d0.R);
            if (r1Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrF = F(r1Var3.a(k(yVar, rect3, r1Var3).g(), e0Var.B, mVar2.getDensity()));
                if (fArrF != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrF);
                    return;
                }
                return;
            }
            return;
        }
        if (s.g(str, "androidx.compose.ui.semantics.shapeRegion")) {
            r1 r1Var4 = (r1) r.a(qVar, d0.R);
            if (r1Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                n4.d dVarK4 = k(yVar, rect4, r1Var4);
                Region regionG = G(r1Var4.a(dVarK4.g(), e0Var.B, mVar2.getDensity()), dVarK4.f123547a, dVarK4.f123548b);
                if (regionG != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionG);
                    return;
                }
                return;
            }
            return;
        }
        u0<p5.j0<?>> u0Var = qVar.f136087c;
        if (u0Var == null) {
            return;
        }
        Object[] objArr = u0Var.f134733b;
        long[] jArr = u0Var.f134732a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i28 = 0;
        while (true) {
            long j8 = jArr[i28];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i29 = 8 - ((~(i28 - length)) >>> 31);
                long j14 = j8;
                for (int i30 = i27; i30 < i29; i30++) {
                    if ((255 & j14) < 128) {
                        p5.j0 j0Var2 = (p5.j0) objArr[(i28 << 3) + i30];
                        String str3 = j0Var2.f136025d;
                        if (s.g(str3, str)) {
                            Object objA = r.a(qVar, j0Var2);
                            if (objA instanceof Serializable) {
                                accessibilityNodeInfo.getExtras().putSerializable(str3, (Serializable) objA);
                            } else {
                                if (!(objA instanceof Parcelable)) {
                                    vb.h.z("Accessibility extra values must be either Serializable or Parcelable.");
                                    return;
                                }
                                accessibilityNodeInfo.getExtras().putParcelable(str3, (Parcelable) objA);
                            }
                        } else {
                            continue;
                        }
                    }
                    j14 >>= 8;
                }
                if (i29 != 8) {
                    return;
                }
            }
            if (i28 == length) {
                return;
            }
            i28++;
            i27 = 0;
        }
    }

    public final Rect b(a0 a0Var) {
        g6.l lVar = a0Var.f135948b;
        return E(lVar.f76008a, lVar.f76009b, lVar.f76010c, lVar.f76011d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x007f, B:35:0x008e, B:37:0x0095, B:39:0x009e, B:42:0x00a4, B:38:0x009c, B:43:0x00ab, B:20:0x0041, B:23:0x0048), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x007f, B:35:0x008e, B:37:0x0095, B:39:0x009e, B:42:0x00a4, B:38:0x009c, B:43:0x00ab, B:20:0x0041, B:23:0x0048), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[Catch: all -> 0x0033, LOOP:0: B:33:0x007d->B:34:0x007f, LOOP_END, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x007f, B:35:0x008e, B:37:0x0095, B:39:0x009e, B:42:0x00a4, B:38:0x009c, B:43:0x00ab, B:20:0x0041, B:23:0x0048), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x007f, B:35:0x008e, B:37:0x0095, B:39:0x009e, B:42:0x00a4, B:38:0x009c, B:43:0x00ab, B:20:0x0041, B:23:0x0048), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:24:0x0058, B:28:0x0069, B:30:0x0071, B:32:0x007a, B:34:0x007f, B:35:0x008e, B:37:0x0095, B:39:0x009e, B:42:0x00a4, B:38:0x009c, B:43:0x00ab, B:20:0x0041, B:23:0x0048), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (o53.m0.b(r8, r0) == r1) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c4 -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v13.c cVar) {
        v vVar;
        j0 j0Var;
        q53.k aVar;
        j0 j0Var2;
        q53.k kVar;
        int i14;
        int i15;
        Handler handler;
        Object objA;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i16 = vVar.f91597e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                vVar.f91597e = i16 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f91595c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = vVar.f91597e;
        int i18 = 0;
        p1.b<e0> bVar = this.f91562v;
        int i19 = 1;
        try {
            if (i17 == 0) {
                o13.r.b(obj);
                j0Var = new j0(i18, i19, null);
                q53.b bVar2 = this.f91563w;
                bVar2.getClass();
                aVar = new q53.b.a();
                vVar.f91593a = j0Var;
                vVar.f91594b = aVar;
                vVar.f91597e = 1;
                objA = aVar.a(vVar);
                if (objA == aVar2) {
                    q53.k kVar2 = aVar;
                    j0Var2 = j0Var;
                    obj = objA;
                    kVar = kVar2;
                    if (!((Boolean) obj).booleanValue()) {
                        bVar.clear();
                        return p005kotlin.Unit.INSTANCE;
                    }
                    kVar.next();
                    if (m()) {
                        i14 = bVar.f134672c;
                        for (i15 = 0; i15 < i14; i15++) {
                            e0 e0Var = (e0) bVar.f134671b[i15];
                            z(e0Var, j0Var2);
                            A(e0Var);
                        }
                        j0Var2.c();
                        if (h4.e.f81547i) {
                            handler = this.f91542a.getHandler();
                        } else {
                            handler = this.f91548g;
                        }
                        if (!this.T) {
                            this.T = true;
                            handler.post(this.Y);
                        }
                    }
                    bVar.clear();
                    this.f91556n.c();
                    this.f91557o.c();
                    long j8 = this.f91546e;
                    vVar.f91593a = j0Var2;
                    vVar.f91594b = kVar;
                    vVar.f91597e = 2;
                }
                return aVar2;
            }
            if (i17 == 1) {
                kVar = vVar.f91594b;
                j0Var2 = vVar.f91593a;
                o13.r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    bVar.clear();
                    return p005kotlin.Unit.INSTANCE;
                }
                kVar.next();
                if (m()) {
                    i14 = bVar.f134672c;
                    while (i15 < i14) {
                        e0 e0Var2 = (e0) bVar.f134671b[i15];
                        z(e0Var2, j0Var2);
                        A(e0Var2);
                    }
                    j0Var2.c();
                    if (h4.e.f81547i) {
                        handler = this.f91542a.getHandler();
                    } else {
                        handler = this.f91548g;
                    }
                    if (!this.T && handler != null) {
                        this.T = true;
                        handler.post(this.Y);
                    }
                }
                bVar.clear();
                this.f91556n.c();
                this.f91557o.c();
                long j14 = this.f91546e;
                vVar.f91593a = j0Var2;
                vVar.f91594b = kVar;
                vVar.f91597e = 2;
            } else {
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kVar = vVar.f91594b;
                j0Var2 = vVar.f91593a;
                o13.r.b(obj);
            }
            j0Var = j0Var2;
            aVar = kVar;
            vVar.f91593a = j0Var;
            vVar.f91594b = aVar;
            vVar.f91597e = 1;
            objA = aVar.a(vVar);
            if (objA == aVar2) {
                q53.k kVar3 = aVar;
                j0Var2 = j0Var;
                obj = objA;
                kVar = kVar3;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.clear();
                    return p005kotlin.Unit.INSTANCE;
                }
                kVar.next();
                if (m()) {
                    i14 = bVar.f134672c;
                    while (i15 < i14) {
                        e0 e0Var3 = (e0) bVar.f134671b[i15];
                        z(e0Var3, j0Var2);
                        A(e0Var3);
                    }
                    j0Var2.c();
                    if (h4.e.f81547i) {
                        handler = this.f91542a.getHandler();
                    } else {
                        handler = this.f91548g;
                    }
                    if (!this.T) {
                        this.T = true;
                        handler.post(this.Y);
                    }
                }
                bVar.clear();
                this.f91556n.c();
                this.f91557o.c();
                long j15 = this.f91546e;
                vVar.f91593a = j0Var2;
                vVar.f91594b = kVar;
                vVar.f91597e = 2;
            }
            return aVar2;
        } catch (Throwable th3) {
            bVar.clear();
            throw th3;
        }
    }

    public final AccessibilityEvent createEvent(int i14, int i15) {
        a0 a0VarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i15);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        m mVar = this.f91542a;
        accessibilityEventObtain.setPackageName(mVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(mVar, i14);
        if (m() && (a0VarB = i().b(i14)) != null) {
            y yVar = a0VarB.f135947a;
            q qVar = yVar.f136098d;
            d0.f135959a.getClass();
            accessibilityEventObtain.setPassword(qVar.f136085a.b(d0.M));
            boolean zG = s.g(r.a(yVar.f136098d, d0.f135974p), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                l7.b.a(accessibilityEventObtain, zG);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    public final boolean d(long j8, int i14, boolean z14) {
        p5.j0<n> j0Var;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i15;
        n nVar;
        if (!s.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        p1.n<a0> nVarI = i();
        n4.c.f123541b.getClass();
        if (n4.c.d(j8, n4.c.f123543d) || (((9223372034707292159L & j8) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z14) {
            d0.f135959a.getClass();
            j0Var = d0.f135982x;
        } else {
            if (z14) {
                lc.u0.r();
                return false;
            }
            d0.f135959a.getClass();
            j0Var = d0.f135981w;
        }
        Object[] objArr3 = nVarI.f134774c;
        long[] jArr3 = nVarI.f134772a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return false;
        }
        int i16 = 0;
        boolean z15 = false;
        while (true) {
            long j14 = jArr3[i16];
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j14 & 255) < 128) {
                        a0 a0Var = (a0) objArr3[(i16 << 3) + i19];
                        g6.l lVar = a0Var.f135948b;
                        i15 = i17;
                        jArr2 = jArr3;
                        objArr2 = objArr3;
                        boolean z16 = z15;
                        if (new n4.d(lVar.f76008a, lVar.f76009b, lVar.f76010c, lVar.f76011d).a(j8) && (nVar = (n) r.a(a0Var.f135947a.f136098d, j0Var)) != null) {
                            boolean z17 = nVar.f136048c;
                            int i24 = z17 ? -i14 : i14;
                            if (i14 == 0 && z17) {
                                i24 = -1;
                            }
                            e23.a<Float> aVar = nVar.f136046a;
                            if (i24 >= 0 ? aVar.invoke().floatValue() >= nVar.f136047b.invoke().floatValue() : aVar.invoke().floatValue() <= 0.0f) {
                                z15 = z16;
                            } else {
                                z15 = true;
                            }
                        } else {
                            z15 = z16;
                        }
                    } else {
                        jArr2 = jArr3;
                        objArr2 = objArr3;
                        i15 = i17;
                    }
                    j14 >>= i15;
                    i19++;
                    i17 = i15;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                }
                jArr = jArr3;
                objArr = objArr3;
                boolean z18 = z15;
                if (i18 != i17) {
                    return z18;
                }
                z15 = z18;
            } else {
                jArr = jArr3;
                objArr = objArr3;
            }
            if (i16 == length) {
                return z15;
            }
            i16++;
            jArr3 = jArr;
            objArr3 = objArr;
        }
    }

    public final void e() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m()) {
                s(this.f91542a.getSemanticsOwner().a(), this.P);
            }
            p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                y(i());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final AccessibilityEvent f(int i14, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i14, 8192);
        if (num != null) {
            accessibilityEventCreateEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventCreateEvent.getText().add(charSequence);
        }
        return accessibilityEventCreateEvent;
    }

    public final int g(y yVar) {
        q qVar = yVar.f136098d;
        d0.f135959a.getClass();
        if (!qVar.f136085a.b(d0.f135960b)) {
            p5.j0<w0> j0Var = d0.I;
            if (qVar.f136085a.b(j0Var)) {
                return (int) (((w0) qVar.c(j0Var)).f157317a & 4294967295L);
            }
        }
        return this.f91560r;
    }

    @Override // androidx.core.view.a
    public final l7.g getAccessibilityNodeProvider(View view2) {
        return this.f91549h;
    }

    public final int h(y yVar) {
        q qVar = yVar.f136098d;
        d0.f135959a.getClass();
        if (!qVar.f136085a.b(d0.f135960b)) {
            p5.j0<w0> j0Var = d0.I;
            if (qVar.f136085a.b(j0Var)) {
                return (int) (((w0) qVar.c(j0Var)).f157317a >> 32);
            }
        }
        return this.f91560r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p1.n<a0> i() {
        if (this.f91564x) {
            this.f91564x = false;
            m mVar = this.f91542a;
            this.f91566z = c0.a(mVar.getSemanticsOwner(), f.f91575a);
            if (m()) {
                i0 i0Var = this.f91566z;
                Resources resources = mVar.getContext().getResources();
                g0 g0Var = this.B;
                g0Var.c();
                g0 g0Var2 = this.C;
                g0Var2.c();
                a0 a0Var = (a0) i0Var.b(-1);
                y yVar = a0Var != null ? a0Var.f135947a : null;
                yVar.getClass();
                ArrayList arrayListB = o0.b(yVar, new z(i0Var), new a0(resources), p13.w.c(yVar));
                int i14 = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i15 = ((y) arrayListB.get(i14 - 1)).f136100f;
                        int i16 = ((y) arrayListB.get(i14)).f136100f;
                        g0Var.f(i15, i16);
                        g0Var2.f(i16, i15);
                        if (i14 == size) {
                            break;
                        }
                        i14++;
                    }
                }
            }
        }
        return this.f91566z;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[LOOP:0: B:5:0x0018->B:37:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0086 A[EDGE_INSN: B:50:0x0086->B:38:0x0086 BREAK  A[LOOP:0: B:5:0x0018->B:37:0x0081], SYNTHETIC] */
    public final n4.d k(y yVar, Rect rect, r1 r1Var) {
        h4.r.c node;
        g gVar = new g(r1Var);
        e0 e0Var = yVar.f136097c;
        h5.a1 a1Var = e0Var.P;
        Object obj = null;
        if ((a1Var.f81685f.getAggregateChildKindSet() & 8) != 0) {
            loop0: for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                if ((child.getKindSet() & 8) == 0) {
                    if ((child.getAggregateChildKindSet() & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    h4.r.c cVarB = child;
                    q3.c cVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof y1) {
                            ((y1) cVarB).D1(gVar);
                            if (gVar.f91576a) {
                                obj = cVarB;
                                break loop0;
                            }
                        } else if ((cVarB.getKindSet() & 8) != 0 && (cVarB instanceof h5.m)) {
                            int i14 = 0;
                            for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                if ((child2.getKindSet() & 8) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        cVarB = child2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new q3.c(new h4.r.c[16], 0);
                                        }
                                        if (cVarB != null) {
                                            cVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        cVar.b(child2);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        cVarB = h5.k.b(cVar);
                    }
                    if ((child.getAggregateChildKindSet() & 8) != 0) {
                        break;
                    }
                }
            }
        }
        y1 y1Var = (y1) obj;
        if (y1Var == null || (node = y1Var.getNode()) == null || !node.getIsAttached()) {
            return f5.d0.b(e0Var.P.f81683d, false);
        }
        c1 c1VarF = h5.k.f(y1Var);
        n4.d dVarJ0 = f5.d0.c(c1VarF).j0(c1VarF, false);
        Rect rectE = E(dVarJ0.f123547a, dVarJ0.f123548b, dVarJ0.f123549c, dVarJ0.f123550d);
        float f14 = rectE.left - rect.left;
        float f15 = rectE.top - rect.top;
        return new n4.d(f14, f15, rectE.width() + f14, rectE.height() + f15);
    }

    public final boolean m() {
        List<? extends AccessibilityServiceInfo> list;
        AccessibilityManager accessibilityManager = this.f91545d;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<? extends AccessibilityServiceInfo> list2 = this.f91547f;
        if (list2 == null) {
            list = list2;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f91547f = enabledAccessibilityServiceList;
            list = enabledAccessibilityServiceList;
        }
        list = list2;
        return !list.isEmpty();
    }

    public final void n(e0 e0Var) {
        if (this.f91562v.add(e0Var)) {
            this.f91563w.i(p005kotlin.Unit.INSTANCE);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z14) {
        this.f91547f = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z14) {
        this.f91547f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        AccessibilityManager accessibilityManager = this.f91545d;
        if (accessibilityManager.isEnabled()) {
            this.f91547f = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        Handler handler = h4.e.f81547i ? this.f91542a.getHandler() : this.f91548g;
        handler.getClass();
        handler.removeCallbacks(this.Y);
        AccessibilityManager accessibilityManager = this.f91545d;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int r(int i14) {
        if (i14 == this.f91542a.getSemanticsOwner().a().f136100f) {
            return -1;
        }
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[LOOP:1: B:15:0x004e->B:28:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[EDGE_INSN: B:44:0x008d->B:29:0x008d BREAK  A[LOOP:1: B:15:0x004e->B:28:0x008a], SYNTHETIC] */
    public final void s(y yVar, j3 j3Var) {
        int[] iArr = p1.q.f134798a;
        int i14 = 0;
        j0 j0Var = new j0(i14, 1, null);
        List listJ = y.j(4, yVar);
        e0 e0Var = yVar.f136097c;
        int size = listJ.size();
        for (int i15 = 0; i15 < size; i15++) {
            y yVar2 = (y) listJ.get(i15);
            p1.n<a0> nVarI = i();
            int i16 = yVar2.f136100f;
            if (nVarI.a(i16)) {
                if (!j3Var.f91235b.a(i16)) {
                    n(e0Var);
                    return;
                }
                j0Var.b(i16);
            }
        }
        j0 j0Var2 = j3Var.f91235b;
        int[] iArr2 = j0Var2.f134794b;
        long[] jArr = j0Var2.f134793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j8 = jArr[i17];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((255 & j8) < 128 && !j0Var.a(iArr2[(i17 << 3) + i19])) {
                            n(e0Var);
                            return;
                        }
                        j8 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        List listJ2 = y.j(4, yVar);
        int size2 = listJ2.size();
        while (i14 < size2) {
            y yVar3 = (y) listJ2.get(i14);
            j3 j3VarB = this.I.b(yVar3.f136100f);
            if (j3VarB != null && i().a(yVar3.f136100f)) {
                s(yVar3, j3VarB);
            }
            i14++;
        }
    }

    public final boolean t(AccessibilityEvent accessibilityEvent) {
        if (!m()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f91555m = true;
        }
        try {
            return ((Boolean) this.f91544c.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f91555m = false;
        }
    }

    public final boolean u(int i14, int i15, Integer num, List<String> list) {
        if (i14 == Integer.MIN_VALUE || !m()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i14, i15);
        if (num != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventCreateEvent.setContentDescription(i6.b.b(list, ",", null, 62));
        }
        return t(accessibilityEventCreateEvent);
    }

    public final void w(int i14, int i15, String str) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(r(i14), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(i15);
        if (str != null) {
            accessibilityEventCreateEvent.getText().add(str);
        }
        t(accessibilityEventCreateEvent);
    }

    public final void x(int i14) {
        e eVar = this.f91565y;
        if (eVar != null) {
            y yVar = eVar.f91569a;
            if (i14 != yVar.f136100f) {
                return;
            }
            if (SystemClock.uptimeMillis() - eVar.f91574f <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(r(yVar.f136100f), 131072);
                accessibilityEventCreateEvent.setFromIndex(eVar.f91572d);
                accessibilityEventCreateEvent.setToIndex(eVar.f91573e);
                accessibilityEventCreateEvent.setAction(eVar.f91570b);
                accessibilityEventCreateEvent.setMovementGranularity(eVar.f91571c);
                accessibilityEventCreateEvent.getText().add(j(yVar));
                t(accessibilityEventCreateEvent);
            }
        }
        this.f91565y = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0303  */
    /* JADX WARN: Code duplicated, block: B:103:0x0312  */
    /* JADX WARN: Code duplicated, block: B:106:0x0319  */
    /* JADX WARN: Code duplicated, block: B:109:0x0320  */
    /* JADX WARN: Code duplicated, block: B:112:0x0331  */
    /* JADX WARN: Code duplicated, block: B:113:0x0333  */
    /* JADX WARN: Code duplicated, block: B:117:0x033c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0349 A[LOOP:4: B:115:0x0338->B:120:0x0349, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0358  */
    /* JADX WARN: Code duplicated, block: B:128:0x036c A[LOOP:5: B:123:0x0354->B:128:0x036c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0394 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x039a  */
    /* JADX WARN: Code duplicated, block: B:137:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:148:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0406  */
    /* JADX WARN: Code duplicated, block: B:152:0x0428  */
    /* JADX WARN: Code duplicated, block: B:153:0x0449  */
    /* JADX WARN: Code duplicated, block: B:155:0x0466  */
    /* JADX WARN: Code duplicated, block: B:157:0x046c  */
    /* JADX WARN: Code duplicated, block: B:163:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:165:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:167:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:210:0x059b  */
    /* JADX WARN: Code duplicated, block: B:212:0x059f  */
    /* JADX WARN: Code duplicated, block: B:217:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:220:0x05c3 A[LOOP:8: B:216:0x05b0->B:220:0x05c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:270:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0352 A[EDGE_INSN: B:271:0x0352->B:122:0x0352 BREAK  A[LOOP:4: B:115:0x0338->B:120:0x0349], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0371 A[EDGE_INSN: B:273:0x0371->B:130:0x0371 BREAK  A[LOOP:5: B:123:0x0354->B:128:0x036c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x019d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01db  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0207  */
    /* JADX WARN: Code duplicated, block: B:68:0x020f  */
    /* JADX WARN: Code duplicated, block: B:69:0x021f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0228  */
    /* JADX WARN: Code duplicated, block: B:73:0x0239  */
    /* JADX WARN: Code duplicated, block: B:74:0x023c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0243  */
    /* JADX WARN: Code duplicated, block: B:80:0x024f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0274  */
    /* JADX WARN: Code duplicated, block: B:83:0x0279  */
    /* JADX WARN: Code duplicated, block: B:86:0x0288  */
    /* JADX WARN: Code duplicated, block: B:87:0x028d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0290  */
    /* JADX WARN: Code duplicated, block: B:91:0x0297  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f4  */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void y(p1.n<p5.a0> r56) {
        /*
            Method dump skipped, instruction units count: 1879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.u.y(p1.n):void");
    }

    public final void z(e0 e0Var, j0 j0Var) {
        q qVarY;
        e0 e0VarD;
        if (e0Var.isAttached() && !this.f91542a.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(e0Var)) {
            if (!e0Var.P.d(8)) {
                e0Var = x.d(e0Var, k.f91581a);
            }
            if (e0Var == null || (qVarY = e0Var.y()) == null) {
                return;
            }
            if (!qVarY.f136088d && (e0VarD = x.d(e0Var, j.f91580a)) != null) {
                e0Var = e0VarD;
            }
            int i14 = e0Var.f81761b;
            if (j0Var.b(i14)) {
                v(this, r(i14), 2048, 1, 8);
            }
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Li5/u$c;", "", "<init>", "()V", "", "InvalidId", "I", "", "ClassName", "Ljava/lang/String;", "TextFieldClassName", "TextClassName", "LogTag", "ExtraDataTestTagKey", "ExtraDataIdKey", "ExtraDataShapeTypeKey", "ExtraDataShapeTypeRectangle", "ExtraDataShapeTypeRounded", "ExtraDataShapeTypeGeneric", "ExtraDataShapeRectKey", "ExtraDataShapeRectCornersKey", "ExtraDataShapeRegionKey", "ParcelSafeTextLength", "AccessibilityCursorPositionUndefined", "AccessibilitySliderStepsCount", "CONTENT_CHANGE_TYPE_CHECKED", "", "TextTraversedEventTimeoutMillis", "J", "Lp1/l;", "AccessibilityActionsResourceIds", "Lp1/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
