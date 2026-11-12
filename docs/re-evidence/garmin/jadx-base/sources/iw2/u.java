package iw2;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)F"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$readStringVersion$2", f = "RTSPhoneStorageCoordinator.kt", l = {226}, m = "invokeSuspend", v = 1)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Float>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f95526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f95528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(File file, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f95528c = file;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f95528c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Float> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fOptDouble;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95527b;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            wVar.getClass();
            w.f95548b.getClass();
            try {
                File file = this.f95528c;
                this.f95526a = -1.0f;
                this.f95527b = 1;
                obj = w.d(wVar, file, this);
                if (obj == aVar) {
                    return aVar;
                }
                fOptDouble = -1.0f;
            } catch (JSONException e4) {
                e = e4;
                fOptDouble = -1.0f;
                w.f95547a.getClass();
                w.f95548b.d(null, "readStringVersion: Exception - " + e);
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fOptDouble = this.f95526a;
            try {
                o13.r.b(obj);
            } catch (JSONException e14) {
                e = e14;
                w.f95547a.getClass();
                w.f95548b.d(null, "readStringVersion: Exception - " + e);
            }
        }
        String str = (String) obj;
        if (str.length() > 0) {
            fOptDouble = (float) new JSONObject(str).optDouble("version", -1.0d);
        }
        w.f95547a.getClass();
        w.f95548b.getClass();
        return new Float(fOptDouble);
    }
}
