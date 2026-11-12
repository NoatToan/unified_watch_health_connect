package yf;

import android.graphics.Canvas;
import hf.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import p005kotlin.Metadata;
import tj.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyf/f;", "Lhf/h;", "Ltj/g;", "svg", "Ltj/f;", "renderOptions", "", "width", "height", "<init>", "(Ltj/g;Ltj/f;II)V", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f196856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj.f f196857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f196858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f196859d;

    public f(g gVar, tj.f fVar, int i14, int i15) {
        this.f196856a = gVar;
        this.f196857b = fVar;
        this.f196858c = i14;
        this.f196859d = i15;
    }

    @Override // hf.h
    /* JADX INFO: renamed from: a */
    public final boolean getF83538b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    @Override // hf.h
    public final void draw(Canvas canvas) {
        boolean z14;
        boolean z15;
        g gVar = this.f196856a;
        gVar.getClass();
        tj.b.q qVar = gVar.f164762b;
        tj.f fVar = this.f196857b;
        if (fVar == null) {
            fVar = new tj.f();
        }
        if (fVar.f164760b == null) {
            fVar.f164760b = new g.b(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        tj.h hVar = new tj.h(canvas, 96.0f);
        hVar.f164963c = gVar;
        g.f0 f0Var = gVar.f164761a;
        if (f0Var == null) {
            return;
        }
        g.b bVar = f0Var.f164932o;
        tj.e eVar = f0Var.f164916n;
        tj.b.q qVar2 = fVar.f164759a;
        if (qVar2 == null) {
            z14 = false;
        } else {
            ArrayList arrayList = qVar2.f164726a;
            if ((arrayList != null ? arrayList.size() : 0) > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        if (z14) {
            qVar.b(fVar.f164759a);
        }
        hVar.f164964d = new tj.h.C3095h(hVar);
        hVar.f164965e = new Stack<>();
        hVar.Q(hVar.f164964d, g.e0.a());
        tj.h.C3095h c3095h = hVar.f164964d;
        c3095h.f165002f = null;
        c3095h.f165004h = false;
        hVar.f164965e.push(new tj.h.C3095h(hVar, c3095h));
        hVar.f164967g = new Stack<>();
        hVar.f164966f = new Stack<>();
        Boolean bool = f0Var.f164897d;
        if (bool != null) {
            hVar.f164964d.f165004h = bool.booleanValue();
        }
        hVar.N();
        g.b bVar2 = new g.b(fVar.f164760b);
        g.p pVar = f0Var.f164869r;
        if (pVar != null) {
            bVar2.f164771c = pVar.c(hVar, bVar2.f164771c);
        }
        g.p pVar2 = f0Var.f164870s;
        if (pVar2 != null) {
            bVar2.f164772d = pVar2.c(hVar, bVar2.f164772d);
        }
        hVar.E(f0Var, bVar2, bVar, eVar);
        hVar.M();
        tj.b.q qVar3 = fVar.f164759a;
        if (qVar3 != null) {
            ArrayList arrayList2 = qVar3.f164726a;
            z15 = (arrayList2 != null ? arrayList2.size() : 0) > 0;
        }
        if (z15) {
            tj.b.t tVar = tj.b.t.RenderOptions;
            ArrayList arrayList3 = qVar.f164726a;
            if (arrayList3 == null) {
                return;
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                if (((tj.b.p) it.next()).f164725c == tVar) {
                    it.remove();
                }
            }
        }
    }

    @Override // hf.h
    /* JADX INFO: renamed from: getHeight, reason: from getter */
    public final int getF196859d() {
        return this.f196859d;
    }

    @Override // hf.h
    public final long getSize() {
        return 2048L;
    }

    @Override // hf.h
    /* JADX INFO: renamed from: getWidth, reason: from getter */
    public final int getF196858c() {
        return this.f196858c;
    }
}
