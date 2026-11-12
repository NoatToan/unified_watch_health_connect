package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    public final void a(b bVar, float f14) {
        CardView.a aVar = (CardView.a) bVar;
        d dVar = aVar.f6007a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f14 != dVar.f6013e || dVar.f6014f != useCompatPadding || dVar.f6015g != preventCornerOverlap) {
            dVar.f6013e = f14;
            dVar.f6014f = useCompatPadding;
            dVar.f6015g = preventCornerOverlap;
            dVar.b(null);
            dVar.invalidateSelf();
        }
        b(bVar);
    }

    public final void b(b bVar) {
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        d dVar = aVar.f6007a;
        float f14 = dVar.f6013e;
        float f15 = dVar.f6009a;
        CardView cardView = CardView.this;
        int iCeil = (int) Math.ceil(e.a(f14, f15, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(e.b(f14, f15, cardView.getPreventCornerOverlap()));
        aVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
