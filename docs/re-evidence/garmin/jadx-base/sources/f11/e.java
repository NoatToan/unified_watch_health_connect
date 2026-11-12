package f11;

import android.content.Context;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.p2;
import v01.f2;
import v01.g2;
import y22.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateEditRecipeViewModel$onSaveRecipe$2", f = "CreateEditRecipeViewModel.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 247}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f67911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f67912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d11.i f67913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f67914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f67915f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Context context, d11.i iVar, String str, String str2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f67911b = fVar;
        this.f67912c = context;
        this.f67913d = iVar;
        this.f67914e = str;
        this.f67915f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f67911b, this.f67912c, this.f67913d, this.f67914e, this.f67915f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r2 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (r2 == r1) goto L34;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objE0;
        Object objE1;
        q01.b bVar;
        Object value2;
        d11.i iVar;
        Object value3;
        d11.i iVar2;
        Object value4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67910a;
        f fVar = this.f67911b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = fVar.f67921f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d11.i.a((d11.i) value, null, null, null, null, null, null, false, true, false, false, null, 3839)));
            String str = fVar.f67916a;
            String str2 = this.f67915f;
            String str3 = this.f67914e;
            d11.i iVar3 = this.f67913d;
            if (str == null) {
                v01.j jVar = fVar.f67918c;
                q01.h hVarT = zf.b.T(iVar3.f57080b, str3, str2);
                i53.c<d11.f> cVar = iVar3.f57082d;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                Iterator<d11.f> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f57067a);
                }
                x xVar = iVar3.f57085g;
                this.f67910a = 1;
                objE1 = ge1.b.e0(jVar.f174416c, new v01.i(hVarT, arrayList, jVar, xVar, this.f67912c, null), this);
            } else {
                g2 g2Var = fVar.f67919d;
                q01.h hVarT2 = zf.b.T(iVar3.f57080b, str3, str2);
                ?? r14 = fVar.f67925j;
                ArrayList arrayList2 = new ArrayList(y.r(r14, 10));
                Iterator it3 = r14.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((d11.f) it3.next()).f57067a);
                }
                i53.c<d11.f> cVar2 = iVar3.f57082d;
                ArrayList arrayList3 = new ArrayList(y.r(cVar2, 10));
                Iterator<d11.f> it4 = cVar2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(it4.next().f57067a);
                }
                x xVar2 = iVar3.f57085g;
                x xVar3 = fVar.f67924i;
                this.f67910a = 2;
                objE0 = ge1.b.e0(g2Var.f174387c, new f2(hVarT2, g2Var, arrayList2, arrayList3, str, xVar2, xVar3, this.f67912c, null), this);
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objE1 = obj;
            bVar = (q01.b) objE1;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objE0 = obj;
            bVar = (q01.b) objE0;
        }
        if (bVar instanceof q01.b.c) {
            p2 p2Var2 = fVar.f67921f;
            do {
                value4 = p2Var2.getValue();
            } while (!p2Var2.b(value4, d11.i.a((d11.i) value4, null, null, null, null, null, null, false, false, false, true, null, 2815)));
        } else if (bVar instanceof q01.b.a) {
            p2 p2Var3 = fVar.f67921f;
            do {
                value3 = p2Var3.getValue();
                iVar2 = (d11.i) value3;
            } while (!p2Var3.b(value3, d11.i.a(iVar2, null, null, null, null, d11.e.a(iVar2.f57084f, false, false, false, false, false, true, false, 95), null, false, false, false, false, null, 3807)));
        } else {
            if (!(bVar instanceof q01.b.C2663b)) {
                u0.r();
                return null;
            }
            p2 p2Var4 = fVar.f67921f;
            do {
                value2 = p2Var4.getValue();
                iVar = (d11.i) value2;
            } while (!p2Var4.b(value2, d11.i.a(iVar, null, null, null, null, d11.e.a(iVar.f57084f, false, false, false, false, true, false, false, 111), null, false, false, false, false, null, 3807)));
        }
        return Unit.INSTANCE;
    }
}
