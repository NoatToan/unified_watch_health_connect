package yg1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007BO\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\n\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lyg1/g;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.INDEX, "drawable", "itemText", "", "alwaysRequiredInControlMenu", "rank", "drawableTint", "drawableTintOnColor", "(Ljava/lang/String;IIIZIII)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends s1 implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f196919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f196920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f196921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f196923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f196924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f196925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f196926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f196927i;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"yg1/g$a", "Landroid/os/Parcelable$Creator;", "Lyg1/g;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public g(Parcel parcel) {
        parcel.getClass();
        this.f196919a = parcel.readString();
        this.f196920b = parcel.readInt();
        this.f196921c = (Boolean) parcel.readValue(Boolean.TYPE.getClassLoader());
        this.f196922d = parcel.readInt();
        this.f196923e = parcel.readInt();
        this.f196924f = parcel.readInt();
        this.f196925g = parcel.readInt();
        this.f196926h = parcel.readInt();
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f196919a);
            int i14 = this.f196920b;
            if (i14 != 255) {
                jSONObject.put(FirebaseAnalytics.Param.INDEX, i14);
            } else {
                jSONObject.put(FirebaseAnalytics.Param.INDEX, (Object) null);
            }
            Boolean bool = this.f196921c;
            if (bool == null || !bool.equals(Boolean.TRUE)) {
                jSONObject.put("required", (Object) null);
                return jSONObject;
            }
            jSONObject.put("required", this.f196921c);
            return jSONObject;
        } catch (JSONException e4) {
            sn.a.s("Error converting to JSON: ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "ControlsMenuEachItemDTO");
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x032a  */
    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        h hVar;
        if (jSONObject != null) {
            this.f196919a = jSONObject.optString(TtmlNode.ATTR_ID, "");
            this.f196920b = jSONObject.optInt(FirebaseAnalytics.Param.INDEX, 255);
            this.f196921c = Boolean.valueOf(jSONObject.optBoolean("required", false));
            String str = this.f196919a;
            if (str != null) {
                switch (str) {
                    case "PAYMENTS":
                        hVar = new h(R.string.wallet_concept, 2131233569, 0, 0);
                        break;
                    case "SET_TIME":
                        hVar = new h(R.string.controls_menu_set_time_with_gps, R.drawable.set_time_with_gps, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "VOLUME":
                        hVar = new h(R.string.lbl_sound_volume, 2131231422, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "BROADCAST_HR":
                        hVar = new h(R.string.lbl_broadcast_hr, 2131231395, 0, 0);
                        break;
                    case "VOICE_ASSISTANT":
                        hVar = new h(R.string.lbl_voice_assistant, R.drawable.voice_assistant, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "BATTERY_SAVER":
                        hVar = new h(R.string.help_solar_charging_title_6, 2131233557, 0, 0);
                        break;
                    case "AIRPLANE_MODE":
                        hVar = new h(R.string.device_settings_controls_menu_airplane_mode, R.drawable.airplane_mode, R.color.gcm_icon_secondary, R.color.gcm_icon_secondary);
                        break;
                    case "SAVE_LOCATION":
                        hVar = new h(R.string.controls_menu_save_my_location, 2131233571, 0, 0);
                        break;
                    case "HANDS_FREE_CALL":
                        hVar = new h(R.string.contact_management_label_phone, 2131231420, 0, 0);
                        break;
                    case "FLASHLIGHT":
                        hVar = new h(R.string.controls_menu_flashlight, R.drawable.flashlight, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "POWER_OFF":
                        hVar = new h(R.string.lbl_power_cap, R.drawable.power, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "LOCK_DEVICE":
                        hVar = new h(R.string.controls_menu_lock, R.drawable.lock, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "DO_NOT_DISTURB":
                        hVar = new h(R.string.device_settings_do_not_disturb, 2131233565, 0, 0);
                        break;
                    case "FIND_MY_PHONE":
                        hVar = new h(R.string.fmp_notification_title, 2131233567, 0, 0);
                        break;
                    case "SOS":
                        hVar = new h(R.string.incident_detection_assistance, R.drawable.safety, R.color.gcm_icon_danger, R.color.gcm_icon_danger);
                        break;
                    case "SYNC":
                        hVar = new h(R.string.app_tour_sync_title, R.drawable.sync, R.color.gcm_icon_primary_action, R.color.gcm_icon_primary_action);
                        break;
                    case "VIRB":
                        hVar = new h(R.string.device_screen_virb_remote, 2131233576, 0, 0);
                        break;
                    case "EASYCARD":
                        hVar = new h(R.string.controls_menu_easycard, 2131233566, 0, 0);
                        break;
                    case "IPASS":
                        hVar = new h(R.string.controls_menu_ipass, R.drawable.va3_control_icons_ipass, 0, 0);
                        break;
                    case "METAR":
                        hVar = new h(R.string.controls_menu_metar, 2131231487, 0, 0);
                        break;
                    case "TIMER":
                        hVar = new h(R.string.run_options_timer, 2131233575, 0, 0);
                        break;
                    case "STOPWATCH":
                        hVar = new h(R.string.controls_menu_stopwatch, 2131233574, 0, 0);
                        break;
                    case "CONTACTS":
                        hVar = new h(R.string.contact_management_title_contacts, R.drawable.contacts, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "MUSIC_CONTROLS":
                        hVar = new h(R.string.controls_menu_music_control, 2131233572, 0, 0);
                        break;
                    case "BLUETOOTH":
                        hVar = new h(R.string.controls_menu_phone_control, 2131233573, 0, 0);
                        break;
                    case "DIAL_PAD":
                        hVar = new h(R.string.lbl_dial_pad, R.drawable.dial_pad, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                    case "BRIGHTNESS":
                        hVar = new h(R.string.controls_menu_brightness, 2131233561, 0, 0);
                        break;
                    case "WAYPOINT":
                        hVar = new h(R.string.controls_menu_waypoint, 2131231488, 0, 0);
                        break;
                    case "ALTIMETER":
                        hVar = new h(R.string.controls_menu_altimeter, 2131231485, 0, 0);
                        break;
                    case "DIRECT_TO":
                        hVar = new h(R.string.controls_menu_direct_to, 2131231486, 0, 0);
                        break;
                    case "ALARMS":
                        hVar = new h(R.string.controls_menu_alarm_clock, R.drawable.alarms_solid, R.color.gcm_icon_primary_action, R.color.gcm_icon_primary_action);
                        break;
                    case "ALIPAY":
                        hVar = new h(R.string.controls_menu_alipay, 2131233560, 0, 0);
                        break;
                    case "WECHAT_PAY":
                        hVar = new h(R.string.controls_menu_wechat, 2131233577, 0, 0);
                        break;
                    default:
                        hVar = new h(R.string.common_button_add, R.drawable.plus, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
                        break;
                }
            } else {
                hVar = new h(R.string.common_button_add, R.drawable.plus, R.color.gcm_icon_primary, R.color.gcm_icon_on_color);
            }
            this.f196922d = hVar.f196929b;
            this.f196923e = hVar.f196930c;
            this.f196924f = hVar.f196931d;
            this.f196925g = hVar.f196928a;
            int i14 = this.f196927i;
            this.f196926h = i14;
            this.f196927i = i14 + 1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f196919a);
        parcel.writeInt(this.f196920b);
        parcel.writeValue(this.f196921c);
        parcel.writeInt(this.f196922d);
        parcel.writeInt(this.f196923e);
        parcel.writeInt(this.f196924f);
        parcel.writeInt(this.f196925g);
        parcel.writeInt(this.f196926h);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\n¨\u00063"}, d2 = {"Lyg1/g$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lyg1/g;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "TAG", "Ljava/lang/String;", "ID", "INDEX", "REQUIRED", "CONTROLTEXT", "CONTROLDRAWABLE", "RANK", "POWER_OFF", "DO_NOT_DISTURB", "SAVE_LOCATION", "LOCK_DEVICE", "FLASHLIGHT", "FIND_MY_PHONE", "SYNC", "BLUETOOTH", "MUSIC_CONTROLS", "VIRB", "SET_TIME", "ALARMS", "TIMER", "BRIGHTNESS", "STOPWATCH", "PAYMENTS", "PAYMENT_IPASS", "INVALID", "SOS", "AIRPLANE_MODE", "PAYMENT_EASYCARD", "PAYMENT_ALIPAY", "DIRECT_TO", "ALTIMETER", "METAR", "WAYPOINT", "BATTERY_SAVER", "WECHAT_PAY", "VOICE_ASSISTANT", "HANDS_FREE_CALL", "CONTACTS", "DIAL_PAD", "VOLUME", "BROADCAST_HR", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public g() {
    }

    public g(String str, int i14, int i15, int i16, boolean z14, int i17, int i18, int i19) {
        this.f196919a = str;
        this.f196920b = i14;
        this.f196921c = Boolean.valueOf(z14);
        this.f196922d = i15;
        this.f196923e = i18;
        this.f196924f = i19;
        this.f196925g = i16;
        this.f196926h = i17;
    }
}
