package p002j6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.core.view.l1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.x;
import androidx.core.view.y;
import androidx.core.view.z;
import androidx.lifecycle.n0;
import b5.i0;
import b5.o0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import f5.a1;
import f5.b1;
import f5.c0;
import f5.d0;
import f5.g0;
import f5.v1;
import f5.z0;
import h5.e0;
import h5.o1;
import h5.p1;
import h5.r1;
import h5.w;
import j23.t;
import java.util.HashMap;
import java.util.List;
import kotlin.s4;
import kotlin.x2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p1.t0;
import p5.k0;
import p5.v;
import r53.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001oB9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R6\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R6\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R6\u00103\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R*\u0010;\u001a\u0002042\u0006\u0010$\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R0\u0010C\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020#\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010K\u001a\u00020D2\u0006\u0010$\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR0\u0010O\u001a\u0010\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020#\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR.\u0010W\u001a\u0004\u0018\u00010P2\b\u0010$\u001a\u0004\u0018\u00010P8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR.\u0010_\u001a\u0004\u0018\u00010X2\b\u0010$\u001a\u0004\u0018\u00010X8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R0\u0010d\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020#\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010>\u001a\u0004\bb\u0010@\"\u0004\bc\u0010BR\u0017\u0010j\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006p"}, d2 = {"Lj6/a;", "Landroid/view/ViewGroup;", "Landroidx/core/view/x;", "Lp3/i;", "Lh5/p1;", "Landroidx/core/view/z;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lp3/p;", "parentContext", "", "compositeKeyHash", "La5/b;", "dispatcher", "Landroid/view/View;", "view", "Lh5/o1;", "owner", "<init>", "(Landroid/content/Context;Lp3/p;ILa5/b;Landroid/view/View;Lh5/o1;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "getNestedScrollAxes", "()I", "b", "Landroid/view/View;", "getView", "Lkotlin/Function0;", "", "value", "d", "Le23/a;", "getUpdate", "()Le23/a;", "setUpdate", "(Le23/a;)V", "update", "f", "getReset", "setReset", "reset", "g", "getRelease", "setRelease", "release", "Lh4/r;", "h", "Lh4/r;", "getModifier", "()Lh4/r;", "setModifier", "(Lh4/r;)V", "modifier", "Lkotlin/Function1;", IntegerTokenConverter.CONVERTER_KEY, "Le23/l;", "getOnModifierChanged$ui", "()Le23/l;", "setOnModifierChanged$ui", "(Le23/l;)V", "onModifierChanged", "Lg6/c;", "j", "Lg6/c;", "getDensity", "()Lg6/c;", "setDensity", "(Lg6/c;)V", "density", JWKParameterNames.OCT_KEY_VALUE, "getOnDensityChanged$ui", "setOnDensityChanged$ui", "onDensityChanged", "Landroidx/lifecycle/n0;", "l", "Landroidx/lifecycle/n0;", "getLifecycleOwner", "()Landroidx/lifecycle/n0;", "setLifecycleOwner", "(Landroidx/lifecycle/n0;)V", "lifecycleOwner", "Lnd/e;", "m", "Lnd/e;", "getSavedStateRegistryOwner", "()Lnd/e;", "setSavedStateRegistryOwner", "(Lnd/e;)V", "savedStateRegistryOwner", "", "v", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "onRequestDisallowInterceptTouchEvent", "Lh5/e0;", "B", "Lh5/e0;", "getLayoutNode", "()Lh5/e0;", "layoutNode", "Lh5/r1;", "getSnapshotObserver", "()Lh5/r1;", "snapshotObserver", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends ViewGroup implements x, p3.i, p1, z {
    public static final b C;
    public boolean A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final e0 layoutNode;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.b f97138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f97140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> update;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f97142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> reset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> release;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public h4.r modifier;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public l<? super h4.r, Unit> onModifierChanged;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public g6.c density;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public l<? super g6.c, Unit> onDensityChanged;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public n0 lifecycleOwner;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public nd.e savedStateRegistryOwner;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f97151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f97152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m1 f97153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l<? super n4.d, Unit> f97154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f97155r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f97156t;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public l<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f97158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f97159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f97160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y f97161z;

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"j6/a$a", "Landroidx/core/view/l1$b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1856a extends l1.b {
        public C1856a() {
            super(1);
        }

        @Override // androidx.core.view.l1.b
        public final m1 onProgress(m1 m1Var, List<l1> list) {
            b bVar = a.C;
            return a.this.f(m1Var);
        }

        @Override // androidx.core.view.l1.b
        public final l1.a onStart(l1 l1Var, l1.a aVar) {
            w wVar = a.this.layoutNode.P.f81682c;
            if (wVar.isAttached()) {
                long jN = jg.b.N(d0.e(wVar));
                g6.k.a aVar2 = g6.k.f76003b;
                int i14 = (int) (jN >> 32);
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = (int) (jN & 4294967295L);
                if (i15 < 0) {
                    i15 = 0;
                }
                long jA = d0.c(wVar).a();
                int i16 = (int) (jA >> 32);
                int i17 = (int) (jA & 4294967295L);
                long j8 = wVar.f69146c;
                long jN2 = jg.b.N(wVar.B((((long) Float.floatToRawIntBits((int) (j8 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L)));
                int i18 = i16 - ((int) (jN2 >> 32));
                if (i18 < 0) {
                    i18 = 0;
                }
                int i19 = i17 - ((int) (4294967295L & jN2));
                int i24 = i19 >= 0 ? i19 : 0;
                if (i14 != 0 || i15 != 0 || i18 != 0 || i24 != 0) {
                    return new l1.a(a.d(aVar.f6473a, i14, i15, i18, i24), a.d(aVar.f6474b, i14, i15, i18, i24));
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj6/a;", "it", "", "invoke", "(Lj6/a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements l<a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f97163a = new b();

        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(a aVar) {
            a aVar2 = aVar;
            aVar2.getHandler().post(new com.garmin.android.music.c(aVar2.f97155r, 5));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh4/r;", "it", "", "invoke", "(Lh4/r;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements l<h4.r, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f97164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r f97165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var, h4.r rVar) {
            super(1);
            this.f97164a = e0Var;
            this.f97165b = rVar;
        }

        @Override // e23.l
        public final Unit invoke(h4.r rVar) {
            this.f97164a.f(rVar.then(this.f97165b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg6/c;", "it", "", "invoke", "(Lg6/c;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements l<g6.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f97166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var) {
            super(1);
            this.f97166a = e0Var;
        }

        @Override // e23.l
        public final Unit invoke(g6.c cVar) {
            this.f97166a.m(cVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/o1;", "owner", "", "invoke", "(Lh5/o1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements l<o1, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f97168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e0 e0Var) {
            super(1);
            this.f97168b = e0Var;
        }

        @Override // e23.l
        public final Unit invoke(o1 o1Var) {
            o1 o1Var2 = o1Var;
            kotlin.m mVar = o1Var2 instanceof kotlin.m ? (kotlin.m) o1Var2 : null;
            a aVar = a.this;
            if (mVar != null) {
                HashMap<a, e0> holderToLayoutNode = mVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                e0 e0Var = this.f97168b;
                holderToLayoutNode.put(aVar, e0Var);
                mVar.getAndroidViewsHandler$ui().addView(aVar);
                mVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(e0Var, aVar);
                aVar.setImportantForAccessibility(1);
                s0.r(aVar, new kotlin.n(mVar, e0Var, mVar));
            }
            if (aVar.getView().getParent() != aVar) {
                aVar.addView(aVar.getView());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/o1;", "owner", "", "invoke", "(Lh5/o1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements l<o1, Unit> {
        public g() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(o1 o1Var) {
            o1 o1Var2 = o1Var;
            boolean z14 = h4.i.f81559a;
            kotlin.m mVar = o1Var2 instanceof kotlin.m ? (kotlin.m) o1Var2 : null;
            a aVar = a.this;
            if (mVar != null) {
                mVar.getAndroidViewsHandler$ui().removeViewInLayout(aVar);
                y0.c(mVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(mVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(aVar));
                aVar.setImportantForAccessibility(0);
            }
            aVar.removeAllViewsInLayout();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"j6/a$h", "Lf5/z0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f97171b;

        /* JADX INFO: renamed from: j6.a$h$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class C1857a extends p005kotlin.jvm.internal.w implements l<v1.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1857a f97172a = new C1857a();

            public C1857a() {
                super(1);
            }

            @Override // e23.l
            public final /* bridge */ /* synthetic */ Unit invoke(v1.a aVar) {
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class b extends p005kotlin.jvm.internal.w implements l<v1.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f97173a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f97174b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, e0 e0Var) {
                super(1);
                this.f97173a = aVar;
                this.f97174b = e0Var;
            }

            @Override // e23.l
            public final Unit invoke(v1.a aVar) {
                p002j6.b.a(this.f97173a, this.f97174b);
                return Unit.INSTANCE;
            }
        }

        public h(e0 e0Var) {
            this.f97171b = e0Var;
        }

        @Override // f5.z0
        public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar = a.this;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            layoutParams.getClass();
            aVar.measure(iMakeMeasureSpec, a.c(aVar, 0, i14, layoutParams.height));
            return aVar.getMeasuredWidth();
        }

        @Override // f5.z0
        public final a1 f(b1 b1Var, List<? extends f5.y0> list, long j8) {
            a aVar = a.this;
            if (aVar.getChildCount() == 0) {
                return b1.h0(b1Var, g6.a.l(j8), g6.a.k(j8), C1857a.f97172a);
            }
            if (g6.a.l(j8) != 0) {
                aVar.getChildAt(0).setMinimumWidth(g6.a.l(j8));
            }
            if (g6.a.k(j8) != 0) {
                aVar.getChildAt(0).setMinimumHeight(g6.a.k(j8));
            }
            int iL = g6.a.l(j8);
            int iJ = g6.a.j(j8);
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            layoutParams.getClass();
            int iC = a.c(aVar, iL, iJ, layoutParams.width);
            int iK = g6.a.k(j8);
            int i14 = g6.a.i(j8);
            ViewGroup.LayoutParams layoutParams2 = aVar.getLayoutParams();
            layoutParams2.getClass();
            aVar.measure(iC, a.c(aVar, iK, i14, layoutParams2.height));
            return b1.h0(b1Var, aVar.getMeasuredWidth(), aVar.getMeasuredHeight(), new b(aVar, this.f97171b));
        }

        @Override // f5.z0
        public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
            a aVar = a.this;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            layoutParams.getClass();
            aVar.measure(a.c(aVar, 0, i14, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return aVar.getMeasuredHeight();
        }

        @Override // f5.z0
        public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
            a aVar = a.this;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            layoutParams.getClass();
            aVar.measure(a.c(aVar, 0, i14, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return aVar.getMeasuredHeight();
        }

        @Override // f5.z0
        public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar = a.this;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            layoutParams.getClass();
            aVar.measure(iMakeMeasureSpec, a.c(aVar, 0, i14, layoutParams.height));
            return aVar.getMeasuredWidth();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp5/k0;", "", "invoke", "(Lp5/k0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements l<k0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f97175a = new i();

        public i() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Unit invoke(k0 k0Var) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements l<q4.f, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f97177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f97178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e0 e0Var, a aVar) {
            super(1);
            this.f97177b = e0Var;
            this.f97178c = aVar;
        }

        @Override // e23.l
        public final Unit invoke(q4.f fVar) {
            o4.y yVarA = fVar.getF142543b().a();
            a aVar = a.this;
            if (aVar.getView().getVisibility() != 8) {
                aVar.A = true;
                o1 o1Var = this.f97177b.f81774n;
                kotlin.m mVar = o1Var instanceof kotlin.m ? (kotlin.m) o1Var : null;
                if (mVar != null) {
                    Canvas canvasA = o4.d.a(yVarA);
                    mVar.getAndroidViewsHandler$ui().getClass();
                    this.f97178c.draw(canvasA);
                }
                aVar.A = false;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf5/c0;", "it", "", "invoke", "(Lf5/c0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements l<c0, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f97180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e0 e0Var) {
            super(1);
            this.f97180b = e0Var;
        }

        @Override // e23.l
        public final Unit invoke(c0 c0Var) {
            WindowInsets windowInsetsF;
            e0 e0Var = this.f97180b;
            a aVar = a.this;
            p002j6.b.a(aVar, e0Var);
            aVar.f97140c.r();
            int[] iArr = aVar.f97151n;
            int i14 = iArr[0];
            int i15 = iArr[1];
            aVar.getView().getLocationOnScreen(iArr);
            long j8 = aVar.f97152o;
            long jA = c0Var.a();
            aVar.f97152o = jA;
            m1 m1Var = aVar.f97153p;
            if (m1Var != null && ((i14 != iArr[0] || i15 != iArr[1] || !g6.m.c(j8, jA)) && (windowInsetsF = aVar.f(m1Var).f()) != null)) {
                aVar.getView().dispatchApplyWindowInsets(windowInsetsF);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: j6.a$l, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Ln4/d;", "", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "it", "invoke", "(Le23/l;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class Function1 extends p005kotlin.jvm.internal.w implements l<l<? super n4.d, ? extends Unit>, Unit> {
        public Function1() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(l<? super n4.d, ? extends Unit> lVar) {
            a.this.f97154q = lVar;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
    public static final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f97183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f97184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f97185d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z14, a aVar, long j8, t13.d<? super m> dVar) {
            super(2, dVar);
            this.f97183b = z14;
            this.f97184c = aVar;
            this.f97185d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new m(this.f97183b, this.f97184c, this.f97185d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97182a;
            if (i14 == 0) {
                o13.r.b(obj);
                boolean z14 = this.f97183b;
                a aVar2 = this.f97184c;
                if (z14) {
                    a5.b bVar = aVar2.f97138a;
                    g6.s.f76026b.getClass();
                    this.f97182a = 2;
                    obj = bVar.a(this.f97185d, 0L, this);
                } else {
                    a5.b bVar2 = aVar2.f97138a;
                    g6.s.f76026b.getClass();
                    this.f97182a = 1;
                    obj = bVar2.a(0L, this.f97185d, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                ((g6.s) obj).getClass();
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ((g6.s) obj).getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {645}, m = "invokeSuspend", v = 1)
    public static final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f97188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j8, t13.d<? super n> dVar) {
            super(2, dVar);
            this.f97188c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new n(this.f97188c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97186a;
            if (i14 == 0) {
                o13.r.b(obj);
                a5.b bVar = a.this.f97138a;
                this.f97186a = 1;
                if (bVar.c(this.f97188c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class o extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f97189a = new o();

        public o() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class p extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f97190a = new p();

        public p() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class q extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public q() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            a.this.getLayoutNode().R();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class r extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public r() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            a aVar = a.this;
            if (aVar.f97142e && aVar.isAttachedToWindow() && aVar.getView().getParent() == aVar) {
                r1 snapshotObserver = aVar.getSnapshotObserver();
                snapshotObserver.f81981a.d(aVar, a.C, aVar.getUpdate());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class s extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f97193a = new s();

        public s() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    static {
        new c(null);
        C = b.f97163a;
    }

    public a(Context context, p3.p pVar, int i14, a5.b bVar, View view2, o1 o1Var) {
        super(context);
        this.f97138a = bVar;
        this.view = view2;
        this.f97140c = o1Var;
        if (pVar != null) {
            t0<Context, o2<Float>> t0Var = s4.f91480a;
            setTag(R.id.androidx_compose_ui_view_composition_context, pVar);
        }
        setSaveFromParentEnabled(false);
        addView(view2);
        s0.t(this, new C1856a());
        s0.d.c(this, this);
        this.update = s.f97193a;
        this.reset = p.f97190a;
        this.release = o.f97189a;
        h4.r.a aVar = h4.r.S;
        this.modifier = aVar;
        this.density = zf.b.c();
        this.f97151n = new int[2];
        g6.m.f76012b.getClass();
        this.f97152o = 0L;
        this.f97155r = new r();
        this.f97156t = new q();
        this.f97158w = new int[2];
        this.f97159x = Integer.MIN_VALUE;
        this.f97160y = Integer.MIN_VALUE;
        this.f97161z = new y(this);
        e0 e0Var = new e0(false, 0, 3, null);
        e0Var.f81775o = this;
        h4.r rVarC = v.c(i.f97175a, a5.f.a(aVar, p002j6.b.f97194a, bVar), true);
        i0 i0Var = new i0();
        i0Var.f15816a = new b5.k0(this);
        o0 o0Var = new o0();
        o0 o0Var2 = i0Var.f15817b;
        if (o0Var2 != null) {
            o0Var2.f15864a = null;
        }
        i0Var.f15817b = o0Var;
        o0Var.f15864a = i0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(o0Var);
        h4.r rVarThen = g0.f(l4.k.d(rVarC.then(i0Var), new j(e0Var, this)), new k(e0Var)).then(new p002j6.d(new Function1()));
        e0Var.f(this.modifier.then(rVarThen));
        this.onModifierChanged = new d(e0Var, rVarThen);
        e0Var.m(this.density);
        this.onDensityChanged = new e(e0Var);
        e0Var.I0 = new f(e0Var);
        e0Var.J0 = new g();
        e0Var.i(new h(e0Var));
        this.layoutNode = e0Var;
    }

    public static final int c(a aVar, int i14, int i15, int i16) {
        aVar.getClass();
        if (i16 >= 0 || i14 == i15) {
            return View.MeasureSpec.makeMeasureSpec(t.e(i16, i14, i15), 1073741824);
        }
        if (i16 != -2 || i15 == Integer.MAX_VALUE) {
            return (i16 != -1 || i15 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
    }

    public static c7.e d(c7.e eVar, int i14, int i15, int i16, int i17) {
        int i18 = eVar.f25190a - i14;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = eVar.f25191b - i15;
        if (i19 < 0) {
            i19 = 0;
        }
        int i24 = eVar.f25192c - i16;
        if (i24 < 0) {
            i24 = 0;
        }
        int i25 = eVar.f25193d - i17;
        return c7.e.c(i18, i19, i24, i25 >= 0 ? i25 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            e5.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f97140c.getSnapshotObserver();
    }

    @Override // h5.p1
    public final boolean X0() {
        return isAttachedToWindow();
    }

    @Override // p3.i
    public final void a() {
        this.release.invoke();
    }

    @Override // p3.i
    public final void e() {
        View view2 = this.view;
        if (view2.getParent() != this) {
            addView(view2);
        } else {
            this.reset.invoke();
        }
    }

    public final m1 f(m1 m1Var) {
        m1.r rVar = m1Var.f6508a;
        c7.e eVarI = rVar.i(-1);
        c7.e eVar = c7.e.f25189e;
        if (eVarI.equals(eVar) && rVar.j(-9).equals(eVar) && rVar.h() == null) {
            return m1Var;
        }
        w wVar = this.layoutNode.P.f81682c;
        if (wVar.isAttached()) {
            long jN = jg.b.N(d0.e(wVar));
            g6.k.a aVar = g6.k.f76003b;
            int i14 = (int) (jN >> 32);
            if (i14 < 0) {
                i14 = 0;
            }
            int i15 = (int) (jN & 4294967295L);
            if (i15 < 0) {
                i15 = 0;
            }
            long jA = d0.c(wVar).a();
            int i16 = (int) (jA >> 32);
            int i17 = (int) (jA & 4294967295L);
            long j8 = wVar.f69146c;
            long jN2 = jg.b.N(wVar.B((((long) Float.floatToRawIntBits((int) (j8 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L)));
            int i18 = i16 - ((int) (jN2 >> 32));
            if (i18 < 0) {
                i18 = 0;
            }
            int i19 = i17 - ((int) (4294967295L & jN2));
            int i24 = i19 >= 0 ? i19 : 0;
            if (i14 != 0 || i15 != 0 || i18 != 0 || i24 != 0) {
                return m1Var.f6508a.r(i14, i15, i18, i24);
            }
        }
        return m1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f97158w;
        getLocationInWindow(iArr);
        int i14 = iArr[0];
        region.op(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final g6.c getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final e0 getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final n0 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final h4.r getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        y yVar = this.f97161z;
        return yVar.f6588b | yVar.f6587a;
    }

    public final l<g6.c, Unit> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final l<h4.r, Unit> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final l<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final e23.a<Unit> getRelease() {
        return this.release;
    }

    public final e23.a<Unit> getReset() {
        return this.reset;
    }

    public final nd.e getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final e23.a<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @o13.e
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.A) {
            this.layoutNode.R();
            return null;
        }
        this.view.postOnAnimation(new com.garmin.android.music.c(this.f97156t, 4));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // p3.i
    public final void k() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.core.view.z
    public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
        this.f97153p = new m1(m1Var);
        return f(m1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f97155r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view2, View view3) {
        super.onDescendantInvalidated(view2, view3);
        if (!this.A) {
            this.layoutNode.R();
        } else {
            this.view.postOnAnimation(new com.garmin.android.music.c(this.f97156t, 4));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f81981a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        this.view.layout(0, 0, i16 - i14, i17 - i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        View view2 = this.view;
        if (view2.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i14), View.MeasureSpec.getSize(i15));
            return;
        }
        if (view2.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view2.measure(i14, i15);
        setMeasuredDimension(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        this.f97159x = i14;
        this.f97160y = i15;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        j6.b.a aVar = p002j6.b.f97194a;
        ge1.b.T(this.f97138a.d(), null, null, new m(z14, this, xy2.b.h(f14 * (-1.0f), f15 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view2, float f14, float f15) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        j6.b.a aVar = p002j6.b.f97194a;
        ge1.b.T(this.f97138a.d(), null, null, new n(xy2.b.h(f14 * (-1.0f), f15 * (-1.0f)), null), 3);
        return false;
    }

    @Override // androidx.core.view.w
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16) {
        long jMo4onPreScrollOzD1aCk;
        if (this.view.isNestedScrollingEnabled()) {
            j6.b.a aVar = p002j6.b.f97194a;
            float f14 = i14;
            float f15 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14 * f15)) << 32) | (((long) Float.floatToRawIntBits(i15 * f15)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            int iB = p002j6.b.b(i16);
            a5.g gVar = this.f97138a.f1205a;
            a5.g gVar2 = null;
            if (gVar != null && gVar.getIsAttached()) {
                gVar2 = (a5.g) gl1.d.u(gVar);
            }
            if (gVar2 != null) {
                jMo4onPreScrollOzD1aCk = gVar2.mo4onPreScrollOzD1aCk(jFloatToRawIntBits, iB);
            } else {
                n4.c.f123541b.getClass();
                jMo4onPreScrollOzD1aCk = 0;
            }
            iArr[0] = x2.d(Float.intBitsToFloat((int) (jMo4onPreScrollOzD1aCk >> 32)));
            iArr[1] = x2.d(Float.intBitsToFloat((int) (jMo4onPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // androidx.core.view.x
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        if (this.view.isNestedScrollingEnabled()) {
            j6.b.a aVar = p002j6.b.f97194a;
            float f14 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i14 * f14)) << 32) | (((long) Float.floatToRawIntBits(i15 * f14)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(i16 * f14);
            long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(i17 * f14)) & 4294967295L;
            long jB = this.f97138a.b(p002j6.b.b(i18), jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
            iArr[0] = x2.d(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = x2.d(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedScrollAccepted(View view2, View view3, int i14, int i15) {
        y yVar = this.f97161z;
        if (i15 == 1) {
            yVar.f6588b = i14;
        } else {
            yVar.f6587a = i14;
        }
    }

    @Override // androidx.core.view.w
    public final boolean onStartNestedScroll(View view2, View view3, int i14, int i15) {
        return ((i14 & 2) == 0 && (i14 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.w
    public final void onStopNestedScroll(View view2, int i14) {
        y yVar = this.f97161z;
        if (i14 == 1) {
            yVar.f6588b = 0;
        } else {
            yVar.f6587a = 0;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i14) {
        super.onWindowVisibilityChanged(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z14) {
        l<? super n4.d, Unit> lVar = this.f97154q;
        if (lVar == null) {
            return true;
        }
        lVar.invoke(rect != null ? o4.l1.j(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z14) {
        l<? super Boolean, Unit> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z14));
        }
        super.requestDisallowInterceptTouchEvent(z14);
    }

    public final void setDensity(g6.c cVar) {
        if (cVar != this.density) {
            this.density = cVar;
            l<? super g6.c, Unit> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(n0 n0Var) {
        if (n0Var != this.lifecycleOwner) {
            this.lifecycleOwner = n0Var;
            setTag(R.id.view_tree_lifecycle_owner, n0Var);
        }
    }

    public final void setModifier(h4.r rVar) {
        if (rVar != this.modifier) {
            this.modifier = rVar;
            l<? super h4.r, Unit> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(rVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(l<? super g6.c, Unit> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui(l<? super h4.r, Unit> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(l<? super Boolean, Unit> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    public final void setRelease(e23.a<Unit> aVar) {
        this.release = aVar;
    }

    public final void setReset(e23.a<Unit> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(nd.e eVar) {
        if (eVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(e23.a<Unit> aVar) {
        this.update = aVar;
        this.f97142e = true;
        this.f97155r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj6/a$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Lj6/a;", "", "OnCommitAffectingUpdate", "Le23/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18) {
        if (this.view.isNestedScrollingEnabled()) {
            j6.b.a aVar = p002j6.b.f97194a;
            float f14 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i14 * f14)) << 32) | (((long) Float.floatToRawIntBits(i15 * f14)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            this.f97138a.b(p002j6.b.b(i18), jFloatToRawIntBits, (Float.floatToRawIntBits(i16 * f14) << 32) | (((long) Float.floatToRawIntBits(i17 * f14)) & 4294967295L));
        }
    }
}
