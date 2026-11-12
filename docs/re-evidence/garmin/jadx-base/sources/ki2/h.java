package ki2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lki2/h;", "Lki2/e;", "", "isMusicCapable", "isSolarIntensityCapable", "<init>", "(ZZ)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi2.d f104924c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104926b;

    static {
        new a(null);
        f104924c = new hi2.d("DSL-DeviceSettingsDataTransform", null, 2, null);
    }

    public h(boolean z14, boolean z15) {
        this.f104925a = z14;
        this.f104926b = z15;
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("supportedLanguages");
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObjectOptJSONObject.getString(next);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TtmlNode.ATTR_ID, string);
                jSONObject2.put("name", next);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("supportedLanguages", jSONArray);
        }
    }

    public static void b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supportedAudioPromptDialects");
        if (jSONArrayOptJSONArray != null) {
            JSONObject jSONObject2 = new JSONObject();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                String string = jSONArrayOptJSONArray.getString(i14);
                if (string != null) {
                    jSONObject2.put(string, string);
                }
            }
            jSONObject.put("keyedSupportedAudioPromptDialects", jSONObject2);
        }
    }

    public static void c(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supportedLanguages");
        if (jSONArrayOptJSONArray != null) {
            JSONObject jSONObject2 = new JSONObject();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i14);
                jSONObject2.put(jSONObject3.getString("name"), jSONObject3.getString(TtmlNode.ATTR_ID));
            }
            jSONObject.put("supportedLanguages", jSONObject2);
        }
    }

    @Override // ki2.e
    public final String decode(String str) {
        hi2.d dVar = f104924c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("isFeatureSetupComplete");
            jSONObject.remove("isDeviceMusicCapable");
            jSONObject.remove("solarIntensityCapable");
            a(jSONObject);
            dVar.getClass();
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (ConcurrentModificationException e4) {
            e4.toString();
            dVar.getClass();
            return str;
        } catch (JSONException e14) {
            e14.toString();
            dVar.getClass();
            return str;
        }
    }

    @Override // ki2.e
    public final String encode(String str) {
        hi2.d dVar = f104924c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("isFeatureSetupComplete", false);
            jSONObject.put("isDeviceMusicCapable", this.f104925a);
            jSONObject.put("solarIntensityCapable", this.f104926b);
            c(jSONObject);
            b(jSONObject);
            dVar.getClass();
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (ConcurrentModificationException e4) {
            e4.toString();
            dVar.getClass();
            return str;
        } catch (JSONException e14) {
            e14.toString();
            dVar.getClass();
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lki2/h$a;", "", "<init>", "()V", "", "DEVICE", "Ljava/lang/String;", "IS_DEVICE_MUSIC_CAPABLE", "IS_DEVICE_SOLAR_INTENSITY_CAPABLE", "IS_FEATURE_SETUP_COMPLETE", "KEYED_SUPPORTED_AUDIO_PROMPT_DIALECTS", "LANGUAGE_ID", "LANGUAGE_NAME", "SUPPORTED_AUDIO_PROMPT_DIALECTS", "SUPPORTED_LANGUAGES", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
