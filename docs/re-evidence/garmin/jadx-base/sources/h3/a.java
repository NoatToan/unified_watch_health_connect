package h3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import fe2.z;
import h5.h0;
import h5.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o4.j0;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.d0;
import p13.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh3/a;", "Lh3/i;", "Lh3/e;", "La2/i;", "interactionSource", "", "bounded", "Lg6/f;", "radius", "Lo4/j0;", TtmlNode.ATTR_TTS_COLOR, "Lkotlin/Function0;", "Lh3/b;", "rippleAlpha", "<init>", "(La2/i;ZFLo4/j0;Le23/a;Lkotlin/jvm/internal/j;)V", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends i implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f81224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f81225l;

    private a(a2.i iVar, boolean z14, float f14, j0 j0Var, e23.a<b> aVar) {
        super(iVar, z14, f14, j0Var, aVar, null);
    }

    @Override // h3.i
    public final void U1(a2.l.b bVar, long j8, float f14) {
        d dVar = this.f81224k;
        if (dVar == null) {
            Object obj = (View) h5.i.a(this, AndroidCompositionLocals_androidKt.f6046f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    vb.h.x(org.apache.commons.lang3.e.f("Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", obj));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i14);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i14++;
                }
            }
            this.f81224k = dVar;
        }
        ArrayList arrayList = dVar.f81232b;
        f fVar = dVar.f81234d;
        LinkedHashMap linkedHashMap = fVar.f81236a;
        LinkedHashMap linkedHashMap2 = fVar.f81236a;
        LinkedHashMap linkedHashMap3 = fVar.f81237b;
        g gVar = (g) linkedHashMap.get(this);
        if (gVar == null) {
            gVar = (g) d0.E(dVar.f81233c);
            if (gVar == null) {
                if (dVar.f81235e > x.j(arrayList)) {
                    gVar = new g(dVar.getContext());
                    dVar.addView(gVar);
                    arrayList.add(gVar);
                } else {
                    gVar = (g) arrayList.get(dVar.f81235e);
                    e eVar = (e) linkedHashMap3.get(gVar);
                    if (eVar != null) {
                        eVar.n0();
                        g gVar2 = (g) linkedHashMap2.get(eVar);
                        if (gVar2 != null) {
                        }
                        linkedHashMap2.remove(eVar);
                        gVar.c();
                    }
                }
                int i15 = dVar.f81235e;
                if (i15 < dVar.f81231a - 1) {
                    dVar.f81235e = i15 + 1;
                } else {
                    dVar.f81235e = 0;
                }
            }
            linkedHashMap2.put(this, gVar);
            linkedHashMap3.put(gVar, this);
        }
        g gVar3 = gVar;
        gVar3.b(bVar, this.f81247b, j8, MathKt.c(f14), this.f81249d.a(), this.f81250e.invoke().f81229d, new z(this, 27));
        this.f81225l = gVar3;
        t.a(this);
    }

    @Override // h3.i
    public final void V1(h0 h0Var) {
        y yVarA = h0Var.f81825a.f142543b.a();
        g gVar = this.f81225l;
        if (gVar != null) {
            long j8 = this.f81253h;
            gVar.e(MathKt.c(this.f81252g), j8, this.f81250e.invoke().f81229d, this.f81249d.a());
            gVar.draw(o4.d.a(yVarA));
        }
    }

    @Override // h3.i
    public final void X1() {
        g gVar = this.f81225l;
        if (gVar != null) {
            gVar.d();
        }
    }

    @Override // h3.e
    public final void n0() {
        this.f81225l = null;
        t.a(this);
    }

    @Override // h4.r.c
    public final void onDetach() {
        d dVar = this.f81224k;
        if (dVar != null) {
            n0();
            f fVar = dVar.f81234d;
            g gVar = (g) fVar.f81236a.get(this);
            if (gVar != null) {
                gVar.c();
                LinkedHashMap linkedHashMap = fVar.f81236a;
                g gVar2 = (g) linkedHashMap.get(this);
                if (gVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f81233c.add(gVar);
            }
        }
    }

    public /* synthetic */ a(a2.i iVar, boolean z14, float f14, j0 j0Var, e23.a aVar, p005kotlin.jvm.internal.j jVar) {
        this(iVar, z14, f14, j0Var, aVar);
    }
}
