package iw2;

import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<anonymous>", "(Lo53/b0;)Ljava/util/HashMap;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$readLocalizedStringsFileData$2", f = "RTSPhoneStorageCoordinator.kt", l = {253}, m = "invokeSuspend", v = 1)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super HashMap<String, String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f95521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(File file, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f95521b = file;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f95521b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super HashMap<String, String>> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95520a;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            wVar.getClass();
            w.f95548b.getClass();
            this.f95520a = 1;
            obj = w.d(wVar, this.f95521b, this);
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
        String str = (String) obj;
        if (str.length() <= 0) {
            w.f95547a.getClass();
            w.f95548b.d(null, "readLocalizedStringsFileData: Unable to get localized string.");
            return new HashMap();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("translations");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i15 = 0; i15 < length; i15++) {
                    Object obj2 = jSONArrayOptJSONArray.get(i15);
                    obj2.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    String string = jSONObject2.getString("handle");
                    String string2 = jSONObject2.getString("string");
                    string.getClass();
                    if (string.length() > 0) {
                        map.put(string, string2);
                    }
                }
            }
            w.f95547a.getClass();
            w.f95548b.getClass();
            return map;
        } catch (JSONException e4) {
            w.f95547a.getClass();
            w.f95548b.d(null, "readLocalizedStringsFileData: Exception - " + e4);
            return new HashMap();
        }
    }
}
