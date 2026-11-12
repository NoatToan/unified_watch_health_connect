package w11;

import android.content.Context;
import android.graphics.RectF;
import b0.g0;
import b0.i0;
import b0.i1;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import j0.u;
import java.util.concurrent.ExecutorService;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.screen.ImageRecognitionAndBarcodeScannerScreenKt$FoodAndBarcodeTabs$1$1", f = "ImageRecognitionAndBarcodeScannerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.d f181212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<x11.a> f181213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f181214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f181215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BarcodeScanner f181216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f181217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<RectF> f181218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<String, Unit> f181219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(j1.d dVar, x3<? extends x11.a> x3Var, p1<Boolean> p1Var, ExecutorService executorService, BarcodeScanner barcodeScanner, Context context, p1<RectF> p1Var2, e23.l<? super String, Unit> lVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f181212a = dVar;
        this.f181213b = x3Var;
        this.f181214c = p1Var;
        this.f181215d = executorService;
        this.f181216e = barcodeScanner;
        this.f181217f = context;
        this.f181218g = p1Var2;
        this.f181219h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f181212a, this.f181213b, this.f181214c, this.f181215d, this.f181216e, this.f181217f, this.f181218g, this.f181219h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f181213b.getF182175a() == x11.a.FOOD) {
            j1.d dVar = this.f181212a;
            dVar.getClass();
            u.a();
            y0.b bVar = dVar.f96207f;
            dVar.f96206e = null;
            dVar.f96207f = null;
            g0 g0Var = dVar.f96208g;
            synchronized (g0Var.f13893r) {
                try {
                    i0 i0Var = g0Var.f13894s;
                    if (i0Var != null) {
                        i0Var.i(null, null);
                    }
                    if (g0Var.f13896u != null) {
                        g0Var.f13965d = i1.b.INACTIVE;
                        g0Var.r();
                    }
                    g0Var.f13895t = null;
                    g0Var.f13896u = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            dVar.l(bVar, null);
            dVar.m(1);
            u.a();
            dVar.f96222u = true;
        } else {
            this.f181214c.setValue(Boolean.FALSE);
            j1.d dVar2 = this.f181212a;
            ExecutorService executorService = this.f181215d;
            BarcodeScanner barcodeScanner = this.f181216e;
            Context context = this.f181217f;
            p1<RectF> p1Var = this.f181218g;
            e23.l<String, Unit> lVar = this.f181219h;
            p1<Boolean> p1Var2 = this.f181214c;
            dVar2.m(2);
            y0.b bVar2 = new y0.b(w.c(barcodeScanner), 1, a7.b.getMainExecutor(context), new r0.d(barcodeScanner, p1Var, lVar, p1Var2, 1));
            u.a();
            y0.b bVar3 = dVar2.f96207f;
            if (bVar3 != bVar2 || dVar2.f96206e != executorService) {
                dVar2.f96206e = executorService;
                dVar2.f96207f = bVar2;
                dVar2.f96208g.J(executorService, bVar2);
                dVar2.l(bVar3, bVar2);
            }
        }
        return Unit.INSTANCE;
    }
}
