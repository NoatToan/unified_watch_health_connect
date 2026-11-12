package eh1;

import android.view.View;
import com.mapbox.maps.renderer.e;
import fb2.b0;
import fb2.f;
import vb.h;
import xg1.c;
import xg1.r;
import xg1.s;

/* JADX INFO: loaded from: classes10.dex */
public class b<RT> extends b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<RT> f64040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<RT> f64041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.c f64042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j32.b f64043e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(View view2, i.c cVar, b0.a aVar, c<RT> cVar2, r<RT> rVar) {
        super(aVar);
        f.a(cVar, "Activity is required");
        f.a(view2, "Button not found");
        this.f64042d = cVar;
        this.f64040b = rVar;
        this.f64041c = cVar2;
        try {
            j32.b bVar = (j32.b) view2;
            this.f64043e = bVar;
            bVar.setOnClickListener(this);
        } catch (ClassCastException unused) {
            h.s("Button of ValueFieldButton type is required");
            throw null;
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        j32.b bVar = this.f64043e;
        return bVar != null && bVar.isEnabled();
    }

    @Override // fb2.b0
    public final boolean d() {
        j32.b bVar = this.f64043e;
        return bVar != null && bVar.isVisible();
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        j32.b bVar = this.f64043e;
        if (bVar != null) {
            bVar.setEnabled(z14);
        }
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        j32.b bVar = this.f64043e;
        if (bVar != null) {
            bVar.setVisible(z14);
        }
    }

    public final void k(RT rt3) {
        j32.b bVar = this.f64043e;
        if (bVar != null) {
            r<RT> rVar = this.f64040b;
            bVar.a(rVar.a(rt3), rVar.b(this.f64042d, rt3));
            int iC = rVar.c(rt3);
            if (iC > 0) {
                bVar.setFieldValueColor(iC);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        s<RT> sVarL = this.f64041c.l();
        if (sVarL != null) {
            sVarL.X4(new e(this, 11));
            sVarL.g(this.f64042d.getSupportFragmentManager());
        }
    }

    public b(View view2, i.c cVar, b0.a aVar, int i14, RT rt3, c<RT> cVar2, r<RT> rVar) {
        this(view2, cVar, aVar, cVar2, rVar);
        j32.b bVar = this.f64043e;
        if (bVar instanceof j32.a) {
            j32.a aVar2 = (j32.a) bVar;
            aVar2.setSecondActionOnClickListener(new cw2.b(10, this, rt3));
            aVar2.setSecondActionText(i14);
        }
    }
}
