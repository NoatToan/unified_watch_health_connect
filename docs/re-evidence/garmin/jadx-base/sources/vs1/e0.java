package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageTooLargeException;
import com.garmin.android.apps.connectmobile.v2;
import java.util.concurrent.CancellationException;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvs1/e0;", "", "Lss1/a0;", "reviewsRepo", "<init>", "(Lss1/a0;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss1.a0 f179783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bq0.c f179784b;

    static {
        new a(null);
        int i14 = bq0.c.f19481c;
    }

    public e0(ss1.a0 a0Var) {
        a0Var.getClass();
        this.f179783a = a0Var;
        this.f179784b = new bq0.c(5, 0, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final Object a(e0 e0Var, Context context, long j8, int i14, pt1.u uVar, v13.c cVar) {
        f0 f0Var;
        pt1.u uVar2;
        Object objH0;
        v2 v2Var;
        e0Var.getClass();
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i15 = f0Var.f179793d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                f0Var.f179793d = i15 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(e0Var, cVar);
            }
        } else {
            f0Var = new f0(e0Var, cVar);
        }
        f0 f0Var2 = f0Var;
        Object obj = f0Var2.f179791b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = f0Var2.f179793d;
        try {
            if (i16 != 0) {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pt1.u uVar3 = f0Var2.f179790a;
                try {
                    o13.r.b(obj);
                    objH0 = obj;
                    uVar2 = uVar3;
                    v2Var = (v2) objH0;
                    if ((v2Var instanceof v2.a) && (((v2.a) v2Var).f47383a instanceof CancellationException)) {
                        throw ((v2.a) v2Var).f47383a;
                    }
                    return v2Var;
                } catch (Exception e4) {
                    e = e4;
                    uVar2 = uVar3;
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GARMIN_TRAILS;
                    String str = "Something went wrong while processing the image with uri " + uVar2.f140986a + "!";
                    aVar2.getClass();
                    i2.a.e(a2Var, str);
                    return new v2.a(e, null, null, 6, null);
                }
            }
            o13.r.b(obj);
            try {
                bq0.c cVar2 = e0Var.f179784b;
                bq0.k kVarC0 = og.a.c0(uVar);
                int i17 = bq0.c.f19481c;
                zp0.f fVarA = cVar2.a(context, kVarC0, null);
                MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("image", "image.".concat(fVarA.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVarA.f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null));
                ss1.a0 a0Var = e0Var.f179783a;
                uVar2 = uVar;
                try {
                    f0Var2.f179790a = uVar2;
                    f0Var2.f179793d = 1;
                    objH0 = a0Var.h0(j8, i14, partCreateFormData, f0Var2);
                    if (objH0 == aVar) {
                        return aVar;
                    }
                    v2Var = (v2) objH0;
                    if (v2Var instanceof v2.a) {
                        throw ((v2.a) v2Var).f47383a;
                    }
                    return v2Var;
                } catch (Exception e14) {
                    e = e14;
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GARMIN_TRAILS;
                    String str2 = "Something went wrong while processing the image with uri " + uVar2.f140986a + "!";
                    aVar3.getClass();
                    i2.a.e(a2Var2, str2);
                    return new v2.a(e, null, null, 6, null);
                }
            } catch (Exception e15) {
                e = e15;
                uVar2 = uVar;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GARMIN_TRAILS;
                String str3 = "Something went wrong while processing the image with uri " + uVar2.f140986a + "!";
                aVar4.getClass();
                i2.a.e(a2Var3, str3);
                return new v2.a(e, null, null, 6, null);
            }
        } catch (ImageTooLargeException e16) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GARMIN_TRAILS;
            String message = e16.getMessage();
            aVar5.getClass();
            i2.a.e(a2Var4, message);
            return new v2.a(e16, null, null, 6, null);
        } catch (CancellationException e17) {
            throw e17;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvs1/e0$a;", "", "<init>", "()V", "", "MAX_IMAGE_SIZE_MB", "I", "", "IMAGE_NAME", "Ljava/lang/String;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
