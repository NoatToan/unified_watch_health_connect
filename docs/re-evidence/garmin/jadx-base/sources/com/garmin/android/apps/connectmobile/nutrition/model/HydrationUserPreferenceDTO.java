package com.garmin.android.apps.connectmobile.nutrition.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(HydrationUserPreferenceDTOAdapter.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/model/HydrationUserPreferenceDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "Lq22/b;", "unit", "(Lq22/b;)V", "HydrationUserPreferenceDTOAdapter", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HydrationUserPreferenceDTO extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q22.b f39577a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/model/HydrationUserPreferenceDTO$HydrationUserPreferenceDTOAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/nutrition/model/HydrationUserPreferenceDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HydrationUserPreferenceDTOAdapter implements JsonDeserializer<HydrationUserPreferenceDTO>, JsonSerializer<HydrationUserPreferenceDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final HydrationUserPreferenceDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                HydrationUserPreferenceDTO hydrationUserPreferenceDTO = new HydrationUserPreferenceDTO();
                hydrationUserPreferenceDTO.k(new JSONObject(jsonElement.toString()));
                return hydrationUserPreferenceDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(HydrationUserPreferenceDTO hydrationUserPreferenceDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            HydrationUserPreferenceDTO hydrationUserPreferenceDTO2 = hydrationUserPreferenceDTO;
            hydrationUserPreferenceDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(hydrationUserPreferenceDTO2.C(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39578a;

        static {
            int[] iArr = new int[q22.b.values().length];
            try {
                iArr[q22.b.MILLILITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q22.b.FLUID_OUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39578a = iArr;
        }
    }

    static {
        new a(null);
    }

    public HydrationUserPreferenceDTO(q22.b bVar) {
        this.f39577a = bVar;
    }

    public final String C() throws JSONException {
        String str;
        q22.b bVar = this.f39577a;
        int i14 = bVar == null ? -1 : b.f39578a[bVar.ordinal()];
        if (i14 != 1) {
            str = i14 != 2 ? null : "ounce";
        } else {
            str = "milliliter";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Action.KEY_ATTRIBUTE, "nutritionAndHydrationRecommendation.hydrationUnit");
        jSONObject.put("value", str);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        q22.b bVar;
        if (jSONObject != null) {
            String strU = s1.u(jSONObject, "value");
            if (s.g(strU, "milliliter")) {
                bVar = q22.b.MILLILITER;
            } else {
                bVar = s.g(strU, "ounce") ? q22.b.FLUID_OUNCE : null;
            }
            this.f39577a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/model/HydrationUserPreferenceDTO$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "HYDRATION_UNIT_KEY", "VALUE", "MILLILITER_VALUE", "OUNCE_VALUE", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public HydrationUserPreferenceDTO() {
    }
}
