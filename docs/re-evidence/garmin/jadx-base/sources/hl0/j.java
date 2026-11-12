package hl0;

import android.text.TextUtils;
import android.util.Base64;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o53.b0;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.FetchIntermediateMapTypeCourseImageTask$executeTask$2", f = "FetchIntermediateMapTypeCourseImageTask.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f84296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f84296b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f84296b, dVar);
        jVar.f84295a = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.f84296b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            el0.c cVar = (el0.c) KoinJavaComponent.get$default(el0.c.class, null, null, 6, null);
            String str = iVar.f84291a;
            long j8 = iVar.f84293c;
            int i14 = iVar.f84292b;
            a0<ResponseBody> a0VarB = cVar.b(str, String.valueOf(i14), String.valueOf(j8));
            if (a0VarB.f25745a.isSuccessful()) {
                ResponseBody responseBody = a0VarB.f25746b;
                String strString = responseBody != null ? responseBody.string() : "";
                if (!TextUtils.isEmpty(strString)) {
                    JSONObject jSONObject = new JSONObject(strString);
                    a2 a2Var = a2.GOLF;
                    String string = jSONObject.toString(5);
                    string.getClass();
                    String strC = d53.n.c(string);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "FtchIntrmedteCrsImgTsk", strC);
                    sd2.g gVar = new sd2.g();
                    gVar.f158650a = jSONObject.optLong("UnitId", -1L);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("CourseIdentifier");
                    if (jSONObjectOptJSONObject != null) {
                        gVar.f158651b = jSONObjectOptJSONObject.optInt("GlobalLayoutId", -1);
                        gVar.f158654e = jSONObjectOptJSONObject.optString("PartNumber", "");
                    }
                    String strOptString = jSONObject.optString("Image", "");
                    gVar.f158655f = !TextUtils.isEmpty(strOptString) ? Base64.decode(strOptString, 0) : null;
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("UnlockGma");
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("Gma", "");
                        gVar.f158656g = TextUtils.isEmpty(strOptString2) ? null : Base64.decode(strOptString2, 0);
                        String strOptString3 = jSONObjectOptJSONObject2.optString("Unlock", "");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            strOptString3.getClass();
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            byte[] bytes = strOptString3.getBytes(charset);
                            bytes.getClass();
                            gVar.f158657h = bytes;
                        }
                    }
                    if (i.a(iVar, gVar)) {
                        rd2.k.f().getClass();
                        if (!rd2.k.g(gVar)) {
                            throw new Exception("Database insert failed\n" + gVar);
                        }
                        i2.a.b(a2Var, "FtchIntrmedteCrsImgTsk", "Database insert success\n" + gVar);
                    } else if (!TextUtils.isEmpty(iVar.f84294d)) {
                        i2.a.b(a2Var, "FtchIntrmedteCrsImgTsk", iVar.f84294d + " for mDeviceID [" + j8 + "], mGlobalID [" + i14 + "], mPartNumber [" + iVar.f84291a + "]");
                    }
                }
            }
        } catch (JSONException e4) {
            a2 a2Var2 = a2.GOLF;
            i2.f36769a.getClass();
            i2.a.g(a2Var2, "FtchIntrmedteCrsImgTsk", e4);
        } catch (Exception e14) {
            a2 a2Var3 = a2.GOLF;
            i2.f36769a.getClass();
            i2.a.g(a2Var3, "FtchIntrmedteCrsImgTsk", e14);
        }
        return Unit.INSTANCE;
    }
}
