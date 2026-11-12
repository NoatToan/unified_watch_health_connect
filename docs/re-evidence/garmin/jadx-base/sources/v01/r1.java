package v01;

import android.content.Context;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageTooLargeException;
import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import com.garmin.android.apps.connectmobile.v2;
import java.util.concurrent.CancellationException;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lf01/e;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.NutritionPhotoUploadUseCase$invoke$2", f = "NutritionPhotoUploadUseCase.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class r1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends f01.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f174520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f174521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.x f174522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PhotoCategory f174523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f174524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(q1 q1Var, Context context, y22.x xVar, PhotoCategory photoCategory, String str, t13.d<? super r1> dVar) {
        super(2, dVar);
        this.f174520b = q1Var;
        this.f174521c = context;
        this.f174522d = xVar;
        this.f174523e = photoCategory;
        this.f174524f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r1(this.f174520b, this.f174521c, this.f174522d, this.f174523e, this.f174524f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends f01.e>> dVar) {
        return ((r1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objN;
        q1 q1Var = this.f174520b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174519a;
        y22.x xVar = this.f174522d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                bq0.c cVar = q1Var.f174514c;
                Context context = this.f174521c;
                xVar.getClass();
                bq0.k kVar = new bq0.k(xVar.f194329a, "file", "", 0.0d);
                int i15 = bq0.c.f19481c;
                zp0.f fVarA = cVar.a(context, kVar, null);
                MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", "file.".concat(fVarA.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVarA.f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null));
                m01.g gVar = q1Var.f174512a;
                PhotoCategory photoCategory = this.f174523e;
                String str = this.f174524f;
                this.f174519a = 1;
                objN = gVar.N(photoCategory, str, partCreateFormData, this);
                if (objN == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objN = obj;
            }
            v2 v2Var = (v2) objN;
            if ((v2Var instanceof v2.a) && (((v2.a) v2Var).f47383a instanceof CancellationException)) {
                throw ((v2.a) v2Var).f47383a;
            }
            return v2Var;
        } catch (ImageTooLargeException e4) {
            i2.a aVar2 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.NUTRITION;
            String message = e4.getMessage();
            aVar2.getClass();
            i2.a.e(a2Var, message);
            return new v2.a(e4, null, null, 6, null);
        } catch (CancellationException e14) {
            throw e14;
        } catch (Exception e15) {
            i2.a aVar3 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.NUTRITION;
            String str2 = "Something went wrong while processing the image with uri " + xVar.f194329a + "!";
            aVar3.getClass();
            i2.a.e(a2Var2, str2);
            return new v2.a(e15, null, null, 6, null);
        }
    }
}
