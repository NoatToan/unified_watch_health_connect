package ud2;

import com.garmin.android.library.geolocationrestapi.HttpResponseException;
import e23.p;
import java.net.URL;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lo53/b0;)Ljava/util/ArrayList;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.geolocationrestapi.GeoLocationServiceKt$getCountries$2", f = "GeoLocationService.kt", l = {}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super ArrayList<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ve2.e f170021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ve2.e eVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f170021a = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f170021a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super ArrayList<String>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b.f170019a.getClass();
        nd2.b bVarD = nd2.e.d(new URL(b.b(this.f170021a).concat("/geolocation/countries")));
        byte[] bArr = bVarD.f125411c;
        int i14 = bVarD.f125409a;
        if (i14 != 200) {
            throw new HttpResponseException(i14, bArr);
        }
        bArr.getClass();
        JSONArray jSONArray = new JSONObject(new String(bArr, d53.c.f57666b)).getJSONArray("countries");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(jSONArray.length());
        int length = jSONArray.length();
        for (int i15 = 0; i15 < length; i15++) {
            arrayList.add(jSONArray.getString(i15));
        }
        return arrayList;
    }
}
