package ot;

import android.content.Context;
import android.graphics.Bitmap;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.ActivityDistanceChapter$setupMapImageAndFunFact$2", f = "ActivityDistanceChapter.kt", l = {305}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f133602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f133603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f133604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Marker> f133605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, f fVar, LottieDrawable lottieDrawable, List<Marker> list, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f133602c = context;
        this.f133603d = fVar;
        this.f133604e = lottieDrawable;
        this.f133605f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f133602c, this.f133603d, this.f133604e, this.f133605f, dVar);
        iVar.f133601b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:1: B:27:0x00bb->B:42:?, LOOP_END, SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f133601b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133600a;
        f fVar = this.f133603d;
        Object obj2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            xt.a aVar2 = (xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null);
            String str = fVar.f133589u;
            this.f133601b = b0Var;
            this.f133600a = 1;
            aVar2.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new xt.c(aVar2, this.f133602c, str, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        String str2 = f.f133585v;
        String strR = fVar.r();
        ArrayList arrayList = fVar.f133650d;
        StringBuilder sbI = p6.b.i("setupMapImage at ", strR, ", filename = ", fVar.f133589u, ", mapImageBitmap = ");
        sbI.append(bitmap);
        String string = sbI.toString();
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var, str2, string);
        LottieDrawable lottieDrawable = this.f133604e;
        if (bitmap != null) {
            if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) == null) {
                pt.i.f140571a.getClass();
                if (lottieDrawable != null) {
                    lottieDrawable.addValueCallback(new KeyPath("Map_IMG"), LottieProperty.TRANSFORM_OPACITY, new pt.m(0));
                }
                while (r10.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((Marker) obj).getName(), "Show_Map_View")) {
                        obj2 = obj;
                        break;
                    }
                }
            } else {
                lottieDrawable.updateBitmap("image_0", bitmap);
                for (Object obj3 : arrayList) {
                    if (p005kotlin.jvm.internal.s.g(((Marker) obj3).getName(), "Hide_Map_View")) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
        } else {
            pt.i.f140571a.getClass();
            if (lottieDrawable != null) {
                lottieDrawable.addValueCallback(new KeyPath("Map_IMG"), LottieProperty.TRANSFORM_OPACITY, new pt.m(0));
            }
            for (Object obj4 : arrayList) {
                if (p005kotlin.jvm.internal.s.g(((Marker) obj4).getName(), "Show_Map_View")) {
                    obj2 = obj4;
                    break;
                }
            }
        }
        Marker marker = (Marker) obj2;
        List<? extends Marker> list = this.f133605f;
        if (marker != null) {
            list.add(obj2);
        }
        fVar.a(lottieDrawable, list);
        return Unit.INSTANCE;
    }
}
