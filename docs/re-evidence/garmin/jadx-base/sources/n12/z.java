package n12;

import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewHolder$onImageLoaded$2", f = "EditProfileImageViewHolder.kt", l = {215, 218}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f122349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f122350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.c f122351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f122352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar, Bitmap bitmap, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f122351c = cVar;
        this.f122352d = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f122351c, this.f122352d, dVar);
        zVar.f122350b = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f122350b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f122349a;
        Bitmap bitmap = this.f122352d;
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = this.f122351c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f122350b = b0Var;
            this.f122349a = 1;
            if (com.garmin.android.apps.connectmobile.userprofile.editimage.c.a(cVar, bitmap, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        String strE = tn.k.e(bitmap.getWidth(), bitmap.getHeight(), "bitmap size: [width: ", ", height: ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "EditProfileImageViewHolder", strE);
        int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
        cVar.c();
        p2 p2Var = cVar.f46677v;
        Boolean bool = Boolean.TRUE;
        this.f122350b = null;
        this.f122349a = 2;
        p2Var.k(null, bool);
    }
}
