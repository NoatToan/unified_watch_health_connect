package ro1;

import android.graphics.Bitmap;
import android.net.Uri;
import c22.k3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.share.UCropImageActivity$onImageLoaded$2", f = "UCropImageActivity.kt", l = {182}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UCropImageActivity f154027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f154028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(UCropImageActivity uCropImageActivity, Bitmap bitmap, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f154027c = uCropImageActivity;
        this.f154028d = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f154027c, this.f154028d, dVar);
        u0Var.f154026b = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f154026b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154025a;
        Bitmap bitmap = this.f154028d;
        UCropImageActivity uCropImageActivity = this.f154027c;
        if (i14 == 0) {
            o13.r.b(obj);
            k3 k3Var = k3.f23115a;
            this.f154026b = b0Var;
            this.f154025a = 1;
            obj = k3Var.c(uCropImageActivity, bitmap, this);
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
        Uri uri = (Uri) obj;
        if (uri == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "UCropImageActivity", "uri is null");
            return Unit.INSTANCE;
        }
        uCropImageActivity.f44626c = uri;
        String strE = tn.k.e(bitmap.getWidth(), bitmap.getHeight(), "bitmap size: [width: ", ", height: ");
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, "UCropImageActivity", strE);
        uCropImageActivity.da();
        return Unit.INSTANCE;
    }
}
