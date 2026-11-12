package kotlin;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import gl1.d;
import gl1.y;
import h5.o1;
import java.lang.ref.WeakReference;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p1.t0;
import p3.m;
import p3.n;
import p3.o;
import p3.p;
import p3.s2;
import p3.x1;
import r53.o2;
import vb.h;
import xy2.b;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0010¢\u0006\u0004\b \u0010\u001fJ7\u0010(\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0004¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0010¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u00108J)\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010;J#\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b5\u0010>J+\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b5\u0010?J+\u0010@\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ3\u0010@\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010B\u001a\u00020\"H\u0014¢\u0006\u0004\b@\u0010CJ\u000f\u0010D\u001a\u00020\"H\u0016¢\u0006\u0004\bD\u00100J\u000f\u0010E\u001a\u00020\fH\u0002¢\u0006\u0004\bE\u0010\u0016J\u0013\u0010F\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u0010\u0016J\u000f\u0010K\u001a\u00020\u0017H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020\u00172\u0006\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020\u0017H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010\u0016R\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR(\u0010W\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R(\u0010^\u001a\u0004\u0018\u00010\n2\b\u0010V\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010_\"\u0004\b`\u0010\u000eR4\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010V\u001a\u0004\u0018\u00010\u00178\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010a\u0012\u0004\bd\u0010\u0016\u001a\u0004\bb\u0010L\"\u0004\bc\u0010\u0019R$\u0010f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bf\u0010g\u0012\u0004\bh\u0010\u0016R0\u0010i\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bm\u0010\u0016\u001a\u0004\bk\u00100\"\u0004\bl\u00102R\u0016\u0010n\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010o\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010jR\u0014\u0010q\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bp\u00100R$\u0010v\u001a\u00020r2\u0006\u0010V\u001a\u00020r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010.R\u0011\u0010x\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bw\u00100R\u0018\u0010y\u001a\u00020\"*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006{"}, d2 = {"Li5/a;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp3/p;", "parent", "", "setParentCompositionContext", "(Lp3/p;)V", "Li5/w3;", "strategy", "setViewCompositionStrategy", "(Li5/w3;)V", "Content", "(Lp3/m;I)V", "createComposition", "()V", "Li5/s1;", "composeViewContext", "(Li5/s1;)V", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui", "internalOnMeasure", "", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "(ZIIII)V", "internalOnLayout$ui", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", FirebaseAnalytics.Param.INDEX, "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "checkAddView", "cacheIfAlive", "(Lp3/p;)Lp3/p;", "resolveParentCompositionContext", "()Lp3/p;", "ensureCompositionCreated", "resolveComposeViewContext", "()Li5/s1;", "contextView", "existingContext", "updateAutoCreatedComposeViewContext", "(Landroid/view/View;Li5/s1;)Li5/s1;", "attachedToWindow", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "value", "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "Lp3/o;", "composition", "Lp3/o;", "parentContext", "Lp3/p;", "setParentContext", "Li5/s1;", "getComposeViewContext$ui", "setComposeViewContext$ui", "getComposeViewContext$ui$annotations", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Le23/a;", "getDisposeViewCompositionStrategy$annotations", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "Li5/c1;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "autoClearFocusBehavior", "getHasComposition", "hasComposition", "isAlive", "(Lp3/p;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<p> cachedViewTreeCompositionContext;
    private s1 composeViewContext;
    private o composition;
    private boolean creatingComposition;
    private e23.a<p005kotlin.Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private p parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: i5.a$a, reason: collision with other inner class name */
    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C1748a extends w implements e23.p<m, Integer, p005kotlin.Unit> {
        public C1748a() {
            super(2);
        }

        @Override // e23.p
        public final p005kotlin.Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                a.this.Content(mVar2, 0);
            } else {
                mVar2.e();
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        w3.f91617a.getClass();
        this.disposeViewCompositionStrategy = w3.c.f91623b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachedToWindow() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                m mVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof m) {
                        mVar = (m) childAt;
                    }
                }
                if (mVar != null) {
                    mVar.setComposeViewContext(updateAutoCreatedComposeViewContext(androidx.compose.ui.platform.a.b(this), mVar.getComposeViewContext()));
                }
            }
            if (getF121f()) {
                ensureCompositionCreated();
            }
        }
    }

    private final p cacheIfAlive(p pVar) {
        p pVar2 = isAlive(pVar) ? pVar : null;
        if (pVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(pVar2);
        }
        return pVar;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        com.mapbox.maps.p.o("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    s1 s1VarResolveComposeViewContext = this.composeViewContext;
                    if (s1VarResolveComposeViewContext == null) {
                        s1VarResolveComposeViewContext = resolveComposeViewContext();
                    }
                    this.composition = z4.a(this, s1VarResolveComposeViewContext, new e(1003123809, true, new C1748a()));
                    p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                    Trace.endSection();
                    this.creatingComposition = false;
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            } catch (Throwable th4) {
                this.creatingComposition = false;
                throw th4;
            }
        }
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(p pVar) {
        return !(pVar instanceof s2) || ((s2.d) ((s2) pVar).f135294u.getValue()).compareTo(s2.d.ShuttingDown) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final s1 resolveComposeViewContext() {
        s1 composeViewContext;
        ViewModelStoreOwner viewModelStoreOwner;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            m mVar = childAt instanceof m ? (m) childAt : null;
            if (mVar != null) {
                composeViewContext = mVar.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewB = androidx.compose.ui.platform.a.b(this);
        s1 s1VarC = androidx.compose.ui.platform.a.c(viewB);
        if (s1VarC != null) {
            return updateAutoCreatedComposeViewContext(viewB, s1VarC);
        }
        p pVarResolveParentCompositionContext = resolveParentCompositionContext();
        n0 n0VarR = b.r(viewB);
        if (n0VarR == null) {
            n0VarR = composeViewContext != null ? composeViewContext.f91445c : null;
            if (n0VarR == null) {
                h.z("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        n0 n0Var = n0VarR;
        nd.e eVarP = y.p(viewB);
        if (eVarP == null) {
            eVarP = composeViewContext != null ? composeViewContext.f91446d : null;
            if (eVarP == null) {
                h.z("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        nd.e eVar = eVarP;
        ViewModelStoreOwner viewModelStoreOwnerS = zf.b.s(viewB);
        if (viewModelStoreOwnerS == null) {
            viewModelStoreOwner = composeViewContext != null ? composeViewContext.f91447e : null;
        } else {
            viewModelStoreOwner = viewModelStoreOwnerS;
        }
        s1 s1Var = new s1(viewB, pVarResolveParentCompositionContext, n0Var, eVar, viewModelStoreOwner);
        viewB.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(s1Var));
        return s1Var;
    }

    private final p resolveParentCompositionContext() {
        p pVar;
        p pVarCacheIfAlive = this.parentContext;
        if (pVarCacheIfAlive == null) {
            p pVarA = s4.a(this);
            if (pVarA == null) {
                Object parent = getParent();
                while (pVarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    pVarA = s4.a(view2);
                    parent = d.A(view2);
                }
            }
            p pVar2 = null;
            pVarCacheIfAlive = pVarA != null ? cacheIfAlive(pVarA) : null;
            if (pVarCacheIfAlive == null) {
                WeakReference<p> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (pVar = weakReference.get()) != null && isAlive(pVar)) {
                    pVar2 = pVar;
                }
                return pVar2 == null ? cacheIfAlive(s4.b(this)) : pVar2;
            }
        }
        return pVarCacheIfAlive;
    }

    private final void setParentContext(p pVar) {
        if (this.parentContext != pVar) {
            this.parentContext = pVar;
            if (pVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            o oVar = this.composition;
            if (oVar != null) {
                oVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final s1 updateAutoCreatedComposeViewContext(View contextView, s1 existingContext) {
        p pVarResolveParentCompositionContext = resolveParentCompositionContext();
        n0 n0VarR = b.r(contextView);
        ViewModelStoreOwner viewModelStoreOwnerS = zf.b.s(contextView);
        nd.e eVarP = y.p(contextView);
        p pVar = existingContext.f91444b;
        nd.e eVar = existingContext.f91446d;
        n0 n0Var = existingContext.f91445c;
        if (pVarResolveParentCompositionContext == pVar && n0VarR == n0Var && viewModelStoreOwnerS == existingContext.f91447e && eVarP == eVar) {
            return existingContext;
        }
        if (pVarResolveParentCompositionContext.getF135297x() != existingContext.f91444b.getF135297x()) {
            disposeComposition();
        }
        if (n0VarR == null) {
            n0VarR = n0Var;
        }
        s1 s1Var = new s1(existingContext, contextView, pVarResolveParentCompositionContext, n0VarR, eVarP == null ? eVar : eVarP, viewModelStoreOwnerS, false, 64, null);
        contextView.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(s1Var));
        return s1Var;
    }

    public abstract void Content(m mVar, int i14);

    @Override // android.view.ViewGroup
    public void addView(View child) {
        checkAddView();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        return super.addViewInLayout(child, index, params);
    }

    public final void createComposition() {
        s1 s1Var;
        View view2;
        if (this.parentContext == null && !isAttachedToWindow() && ((s1Var = this.composeViewContext) == null || s1Var == null || (view2 = s1Var.f91443a) == null || !view2.isAttachedToWindow())) {
            h.z("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            ensureCompositionCreated();
        }
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        m mVar = childAt instanceof m ? (m) childAt : null;
        if (mVar != null && mVar.composeViewContextIncrementedDuringInit) {
            mVar.getComposeViewContext().b();
            mVar.composeViewContextIncrementedDuringInit = false;
        }
        o oVar = this.composition;
        if (oVar != null) {
            oVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m323getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        c1 c1Var = tag instanceof c1 ? (c1) tag : null;
        if (c1Var != null) {
            return c1Var.f91123a;
        }
        c1.f91121b.getClass();
        return c1.f91122c;
    }

    /* JADX INFO: renamed from: getComposeViewContext$ui, reason: from getter */
    public final s1 getComposeViewContext() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    /* JADX INFO: renamed from: getShouldCreateCompositionOnAttachedToWindow */
    public boolean getF121f() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t0<Context, o2<Float>> t0Var = s4.f91480a;
        Object objA = d.A(this);
        View view2 = this;
        while (objA instanceof View) {
            View view3 = (View) objA;
            if (view3.getId() == 16908290) {
                break;
            }
            view2 = view3;
            objA = view3.getParent();
        }
        if (view2.getParent() == null) {
            getHandler().postAtFrontOfQueue(new eh2.b(this, 20));
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ensureCompositionCreated();
        internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(layoutDirection);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m324setAutoClearFocusBehavior17tfJxM(int i14) {
        setTag(R.id.auto_clear_focus_behavior_tag, c1.a(i14));
    }

    public final void setComposeViewContext$ui(s1 s1Var) {
        if (this.composeViewContext != s1Var) {
            if (s1Var == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                m mVar = childAt instanceof m ? (m) childAt : null;
                if (mVar != null) {
                    if (mVar.getCoroutineContext() != s1Var.f91444b.getF135297x()) {
                        disposeComposition();
                    }
                    mVar.setComposeViewContext(s1Var);
                }
            }
            this.composeViewContext = s1Var;
        }
    }

    public final void setParentCompositionContext(p parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z14) {
        this.showLayoutBounds = z14;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((o1) childAt).setShowLayoutBounds(z14);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(w3 strategy) {
        e23.a<p005kotlin.Unit> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        checkAddView();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        checkAddView();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        checkAddView();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, index, params);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public a(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    public final void createComposition(s1 composeViewContext) {
        if (composeViewContext.f91443a.isAttachedToWindow()) {
            setComposeViewContext$ui(composeViewContext);
            ensureCompositionCreated();
        } else {
            h.z("createComposition requires the ComposeViewContext's view to be attached to a window.");
        }
    }
}
