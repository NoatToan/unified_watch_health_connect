package wf;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import java.util.List;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwf/a;", "Lwf/o;", "Lhf/j;", "imageLoader", "Ldg/q;", "systemCallbacks", "Ldg/l;", "logger", "<init>", "(Lhf/j;Ldg/q;Ldg/l;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.j f184891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg.h f184892b = new dg.h(true);

    public a(hf.j jVar, dg.q qVar, dg.l lVar) {
        this.f184891a = jVar;
    }

    public static b0 d(f fVar) {
        ag.a aVar = fVar.f184904c;
        Object context = aVar instanceof ag.b ? ((ag.b) aVar).getView().getContext() : fVar.f184902a;
        while (!(context instanceof n0)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((n0) context).getF158016a();
    }

    public static boolean e(f fVar, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!((Boolean) hf.g.a(fVar, h.f184990f)).booleanValue()) {
                return false;
            }
            ag.a aVar = fVar.f184904c;
            if (aVar instanceof ag.b) {
                View view2 = ((ag.b) aVar).getView();
                if (view2.isAttachedToWindow() && !view2.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    @Override // wf.o
    public final m a(f fVar, xf.g gVar) {
        Context context;
        boolean z14;
        boolean z15;
        boolean z16;
        hf.f.a aVar;
        Context context2 = fVar.f184902a;
        xf.f fVar2 = fVar.f184923v;
        xf.c cVar = fVar.f184924w;
        String str = fVar.f184908g;
        w63.l lVar = fVar.f184909h;
        c cVar2 = fVar.f184915n;
        c cVar3 = fVar.f184916o;
        c cVar4 = fVar.f184917p;
        hf.f.c<Bitmap.Config> cVar5 = h.f184986b;
        Bitmap.Config config = (Bitmap.Config) hf.g.a(fVar, cVar5);
        hf.f.c<Boolean> cVar6 = h.f184991g;
        boolean zBooleanValue = ((Boolean) hf.g.a(fVar, cVar6)).booleanValue();
        hf.f.c<List<bg.a>> cVar7 = g.f184981a;
        if (!((List) hf.g.a(fVar, cVar7)).isEmpty()) {
            context = context2;
            if (!p13.u.z(dg.u.f59504a, (Bitmap.Config) hf.g.a(fVar, cVar5))) {
                z14 = false;
            }
            z15 = z14;
            boolean z17 = ((Bitmap.Config) hf.g.a(fVar, cVar5)) == Bitmap.Config.HARDWARE || (e(fVar, (Bitmap.Config) hf.g.a(fVar, cVar5)) && this.f184892b.f59477a);
            if (z15 || !z17) {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue || !((List) hf.g.a(fVar, cVar7)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                z16 = false;
            } else {
                z16 = true;
            }
            aVar = new hf.f.a(u0.h(fVar.f184927z.f184967n.f83559a, fVar.f184925x.f83559a));
            if (config != ((Bitmap.Config) hf.g.a(fVar, cVar5))) {
                int i14 = hf.f.c.f83561b;
                aVar.b(cVar5, config);
            }
            if (z16 != ((Boolean) hf.g.a(fVar, cVar6)).booleanValue()) {
                int i15 = hf.f.c.f83561b;
                aVar.b(cVar6, Boolean.valueOf(z16));
            }
            return new m(context, gVar, fVar2, cVar, str, lVar, cVar2, cVar3, cVar4, aVar.a());
        }
        context = context2;
        z14 = true;
        z15 = z14;
        if (((Bitmap.Config) hf.g.a(fVar, cVar5)) == Bitmap.Config.HARDWARE) {
        }
        if (z15) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z16 = false;
        } else {
            z16 = false;
        }
        aVar = new hf.f.a(u0.h(fVar.f184927z.f184967n.f83559a, fVar.f184925x.f83559a));
        if (config != ((Bitmap.Config) hf.g.a(fVar, cVar5))) {
            int i16 = hf.f.c.f83561b;
            aVar.b(cVar5, config);
        }
        if (z16 != ((Boolean) hf.g.a(fVar, cVar6)).booleanValue()) {
            int i17 = hf.f.c.f83561b;
            aVar.b(cVar6, Boolean.valueOf(z16));
        }
        return new m(context, gVar, fVar2, cVar, str, lVar, cVar2, cVar3, cVar4, aVar.a());
    }

    @Override // wf.o
    public final boolean b(f fVar, rf.b.c cVar) {
        hf.h hVar = cVar.f152367a;
        hf.a aVar = hVar instanceof hf.a ? (hf.a) hVar : null;
        if (aVar == null) {
            return true;
        }
        Bitmap.Config config = aVar.f83537a.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return e(fVar, config);
    }

    @Override // wf.o
    public final m c(m mVar) {
        boolean z14;
        hf.f fVarA = mVar.f185005j;
        hf.f.c<Bitmap.Config> cVar = h.f184986b;
        if (((Bitmap.Config) hf.g.b(mVar, cVar)) != Bitmap.Config.HARDWARE || this.f184892b.f59477a) {
            z14 = false;
        } else {
            fVarA.getClass();
            hf.f.a aVar = new hf.f.a(fVarA);
            int i14 = hf.f.c.f83561b;
            aVar.b(cVar, Bitmap.Config.ARGB_8888);
            fVarA = aVar.a();
            z14 = true;
        }
        return z14 ? new m(mVar.f184996a, mVar.f184997b, mVar.f184998c, mVar.f184999d, mVar.f185000e, mVar.f185001f, mVar.f185002g, mVar.f185003h, mVar.f185004i, fVarA) : mVar;
    }
}
