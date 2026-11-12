package v01;

import android.graphics.Bitmap;
import android.util.Base64;
import com.garmin.android.apps.connectmobile.v2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/s;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetFoodsFromImageRecognitionUseCase$invoke$2", f = "GetFoodsFromImageRecognitionUseCase.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.s>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f174458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f174459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f174460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f174461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Bitmap bitmap, String str, String str2, m0 m0Var, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f174458b = bitmap;
        this.f174459c = str;
        this.f174460d = str2;
        this.f174461e = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f174458b, this.f174459c, this.f174460d, this.f174461e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.s>> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        String strEncodeToString;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174457a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        v21.f.f175333a.getClass();
        Bitmap bitmap = this.f174458b;
        bitmap.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i15 = 100;
        do {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i15, byteArrayOutputStream);
            strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            strEncodeToString.getClass();
            i15 -= 5;
            byte[] bytes = strEncodeToString.getBytes(d53.c.f57666b);
            bytes.getClass();
            if (bytes.length <= 1048576) {
                break;
            }
        } while (i15 > 0);
        byteArrayOutputStream.close();
        if (i15 <= 0) {
            strEncodeToString = null;
        }
        if (strEncodeToString == null) {
            return new v2.a(new IllegalStateException("Failed to encode image"), null, null, 6, null);
        }
        f01.c cVar = new f01.c(strEncodeToString, this.f174459c, this.f174460d);
        m01.g gVar = this.f174461e.f174469a;
        this.f174457a = 1;
        Object objG0 = gVar.G0(cVar, this);
        return objG0 == aVar ? aVar : objG0;
    }
}
