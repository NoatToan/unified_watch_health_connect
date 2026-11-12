package x11;

import android.graphics.Bitmap;
import b11.v;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g01.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p13.x;
import r53.p2;
import v01.l0;
import v01.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionAndBarcodeScannerViewModel$onImageCaptured$1", f = "ImageRecognitionAndBarcodeScannerViewModel.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f188394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f188395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f188396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Bitmap bitmap, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f188395b = eVar;
        this.f188396c = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f188395b, this.f188396c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objE0;
        Object value2;
        Object value3;
        b bVar;
        ArrayList arrayList;
        Object value4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f188394a;
        e eVar = this.f188395b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = eVar.f188402f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, b.a((b) value, null, true, false, false, false, false, false, null, null, 955)));
            eVar.f188399c.t(a.FOOD);
            b01.a.f14162a.getClass();
            zk.c.f205034a.a(x.k("GCS", "FIREBASE")).a(new zk.a("PARTNER_ONBOARDING", w.c(new zk.e("partnerOnboardingEvent", new b01.a.C0198a("FAT_SECRET", "IMAGE_RECOGNITION"))), false, 0L, 12, null));
            m0 m0Var = eVar.f188398b;
            String str = eVar.f188400d;
            String str2 = eVar.f188401e;
            this.f188394a = 1;
            objE0 = ge1.b.e0(m0Var.f174470b, new l0(this.f188396c, str, str2, m0Var, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            p2 p2Var2 = eVar.f188402f;
            do {
                value4 = p2Var2.getValue();
            } while (!p2Var2.b(value4, b.a((b) value4, null, false, false, false, true, false, false, null, null, 987)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            s sVar = (s) ((v2.b) v2Var).f47386a;
            List<g01.r> list = sVar.f74252a;
            if (list == null || list.isEmpty()) {
                p2 p2Var3 = eVar.f188402f;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, b.a((b) value2, null, false, false, false, true, false, false, null, null, 987)));
            } else {
                p2 p2Var4 = eVar.f188402f;
                do {
                    value3 = p2Var4.getValue();
                    bVar = (b) value3;
                    List<g01.r> list2 = sVar.f74252a;
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            v vVarB = ((g01.r) it.next()).b();
                            if (vVarB != null) {
                                arrayList.add(vVarB);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!p2Var4.b(value3, b.a(bVar, null, false, false, false, false, false, false, null, arrayList, 475)));
            }
        }
        return Unit.INSTANCE;
    }
}
