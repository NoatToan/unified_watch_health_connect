package x11;

import b11.s;
import b11.t;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g01.o;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionAndBarcodeScannerViewModel$onBarcodeReceived$1", f = "ImageRecognitionAndBarcodeScannerViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f188391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f188392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f188393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f188392b = eVar;
        this.f188393c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f188392b, this.f188393c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objV0;
        Object value2;
        b11.e eVar;
        Object value3;
        Object value4;
        Object value5;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f188391a;
        e eVar2 = this.f188392b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = eVar2.f188402f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, b.a((b) value, null, true, false, false, false, false, false, null, null, 955)));
            eVar2.f188399c.t(a.BARCODE);
            m01.g gVar = eVar2.f188397a;
            String str = eVar2.f188400d;
            String str2 = eVar2.f188401e;
            this.f188391a = 1;
            objV0 = gVar.v0(this.f188393c, str, str2, this);
            if (objV0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objV0 = obj;
        }
        v2 v2Var = (v2) objV0;
        if (v2Var instanceof v2.a) {
            p2 p2Var2 = eVar2.f188402f;
            do {
                value5 = p2Var2.getValue();
            } while (!p2Var2.b(value5, b.a((b) value5, null, false, false, true, false, false, false, null, null, 1003)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            g01.i iVar = (g01.i) ((v2.b) v2Var).f47386a;
            o oVar = iVar.f74195a;
            if (oVar == null || oVar.f74228a == null) {
                p2 p2Var3 = eVar2.f188402f;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, b.a((b) value2, null, false, false, true, false, false, false, null, null, 1003)));
            } else {
                b11.e eVarA = iVar.a();
                if (eVarA != null) {
                    b11.d dVar = eVarA.f14261a;
                    i53.c<s> cVar = eVarA.f14262b;
                    t tVar = eVarA.f14263c;
                    boolean z14 = eVarA.f14264d;
                    dVar.getClass();
                    cVar.getClass();
                    tVar.getClass();
                    eVar = new b11.e(dVar, cVar, tVar, z14, this.f188393c);
                } else {
                    eVar = null;
                }
                b11.e eVar3 = eVar;
                if (eVar3 != null) {
                    p2 p2Var4 = eVar2.f188402f;
                    do {
                        value4 = p2Var4.getValue();
                    } while (!p2Var4.b(value4, b.a((b) value4, null, false, false, false, false, false, false, eVar3, null, 747)));
                } else {
                    p2 p2Var5 = eVar2.f188402f;
                    do {
                        value3 = p2Var5.getValue();
                    } while (!p2Var5.b(value3, b.a((b) value3, null, false, false, true, false, false, false, null, null, 1003)));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
