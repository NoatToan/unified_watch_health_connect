package uk1;

import android.text.TextUtils;
import c22.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.apache.commons.codec.language.bm.Rule;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luk1/e;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lj0.j f171888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f171889j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uk1/e$a", "Llj0/k;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements lj0.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f171891b;

        public a(c cVar) {
            this.f171891b = cVar;
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            bVar.getClass();
            sn.a.s("getSupportedSportsTask.onError: ", bVar.f112957a.name(), i2.f36769a, a2.SETTINGS, "GetHRZonesConfigOperation");
            e.this.c(y0.b(bVar));
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            c cVar = this.f171891b;
            aVar.getClass();
            Object obj = aVar.f112977a;
            e eVar = e.this;
            if (obj == null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                aVar2.getClass();
                i2.a.f(a2Var, "GetHRZonesConfigOperation", "getSupportedSportsTask: GCApiCaller.GCResponse data null.");
                eVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject((String) obj);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supportedHrZones");
                if (jSONArrayOptJSONArray == null) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.SETTINGS;
                    aVar3.getClass();
                    i2.a.f(a2Var2, "GetHRZonesConfigOperation", "getSupportedSportsTask: JSON key 'supportedHrZones' either doesn't exist or is not an array.");
                    eVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                    return;
                }
                vk1.b bVar = cVar.f171880n;
                vk1.b bVar2 = cVar.f171880n;
                bVar.f178589i = jSONObject.optBoolean("runningHeartRateZoneCapable");
                bVar2.f178590j = jSONObject.optBoolean("cyclingHeartRateZoneCapable");
                bVar2.f178591k = jSONObject.optBoolean("swimmingHeartRateZoneCapable");
                bVar2.f178592l = jSONObject.optBoolean("defaultHeartRateZoneCapable");
                StringBuilder sb3 = new StringBuilder("Sports supported by device " + cVar.f171878l + ":");
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i14);
                    if (!TextUtils.isEmpty(strOptString)) {
                        if (strOptString != null) {
                            switch (strOptString.hashCode()) {
                                case -2026200673:
                                    if (strOptString.equals("RUNNING")) {
                                        bVar2.f178581a = true;
                                        sb3.append(" [RUNNING]");
                                    } else {
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    break;
                                case 64897:
                                    if (strOptString.equals(Rule.ALL)) {
                                        bVar2.f178584d = true;
                                        sb3.append(" [ALL]");
                                    } else {
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    break;
                                case 691184349:
                                    if (strOptString.equals("SWIMMING")) {
                                        bVar2.f178583c = true;
                                        sb3.append(" [SWIMMING]");
                                    } else {
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    break;
                                case 1945411587:
                                    if (strOptString.equals("CYCLING")) {
                                        bVar2.f178582b = true;
                                        sb3.append(" [CYCLING]");
                                    } else {
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    break;
                                default:
                                    Unit unit5 = Unit.INSTANCE;
                                    break;
                            }
                        } else {
                            Unit unit6 = Unit.INSTANCE;
                        }
                    }
                }
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.SETTINGS;
                String string = sb3.toString();
                aVar4.getClass();
                i2.a.b(a2Var3, "GetHRZonesConfigOperation", string);
                cVar.b(new f(cVar));
                eVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            } catch (JSONException e4) {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.SETTINGS;
                aVar5.getClass();
                i2.a.g(a2Var4, "GetHRZonesConfigOperation", e4);
                eVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(cVar);
        this.f171889j = cVar;
        this.f171888i = new lj0.j(new a(cVar));
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        this.f171888i.b(new lj0.i(lj0.f.f112996x, new Object[]{String.valueOf(this.f171889j.f171878l)}));
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        this.f171888i.a();
    }
}
