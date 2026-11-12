package c22;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.UCropImageUtil$storeBitmapToUri$2", f = "UCropImageUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f23110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Uri> f23111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(Context context, Bitmap bitmap, p005kotlin.jvm.internal.r0<Uri> r0Var, t13.d<? super j3> dVar) {
        super(2, dVar);
        this.f23109b = context;
        this.f23110c = bitmap;
        this.f23111d = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j3 j3Var = new j3(this.f23109b, this.f23110c, this.f23111d, dVar);
        j3Var.f23108a = obj;
        return j3Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.net.Uri] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        k3 k3Var = k3.f23115a;
        Context context = this.f23109b;
        context.getClass();
        ?? A = k3.a(context, "crop_input.png");
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(A);
        if (outputStreamOpenOutputStream == null) {
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "UCropImageUtil", "Output stream is null");
            return Unit.INSTANCE;
        }
        this.f23110c.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
        outputStreamOpenOutputStream.flush();
        outputStreamOpenOutputStream.close();
        this.f23111d.f105810a = A;
        return Unit.INSTANCE;
    }
}
