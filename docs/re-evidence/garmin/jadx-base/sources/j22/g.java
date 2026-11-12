package j22;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.stats.CodePackage;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.w;
import p13.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002Bm\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj22/g;", "Landroid/os/Parcelable;", "", "", "displayNameResId", "individualPageTitle", "individualPageDescription", "settingsPageDescription", "individualPageAllowButtonText", "individualPageIconResId", "managePageIconResId", "requestId", "", "Lj22/a;", "permissionList", "", "constructRoundedIcon", "<init>", "(Ljava/lang/String;IIIIIIIIILjava/util/List;Z)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f96759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f96760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f96761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f96762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f96763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f96764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f96765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f96766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f96767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f96768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f96769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f96770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ g[] f96771p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j22.a> f96774c;

    static {
        ArrayList arrayList = new ArrayList();
        b.f96736a.getClass();
        if (b.n()) {
            arrayList.add(j22.a.f96729r);
            arrayList.add(j22.a.f96728q);
        }
        Unit unit = Unit.INSTANCE;
        g gVar = new g("BLUETOOTH", 0, R.string.permission_nearby_devices, R.string.permission_nearby_devices, R.string.permission_nearby_devices_description, R.string.permission_nearby_devices_description, R.string.lbl_allow_access, R.drawable.bluetooth_controls_on, R.drawable.bluetooth_controls_on, 8, arrayList, false);
        f96759d = gVar;
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList2.add(j22.a.f96731v);
        }
        g gVar2 = new g("NOTIFICATIONS", 1, R.string.concept_notifications, R.string.concept_notifications, R.string.notifications_permission_description_settings, R.string.notifications_permission_description_settings, R.string.lbl_allow_access, R.drawable.notification, R.drawable.notification, 9, arrayList2, true);
        f96760e = gVar2;
        g gVar3 = new g("CALENDAR", 2, R.string.permission_calendar, R.string.title_calendar_access, R.string.calendar_permission_bic_description, R.string.read_calendar_permission_description, R.string.label_allow_calendar_access, R.drawable.calendar, R.drawable.calendar, 10, w.c(j22.a.f96715d), true);
        f96761f = gVar3;
        g gVar4 = new g("CALL_LOG", 3, R.string.permission_call_logs, R.string.title_call_log_access, R.string.call_log_permission_description, R.string.read_call_log_permission_description, R.string.label_allow_call_log_access, R.drawable.icon_call_log_access_trans, R.drawable.icon_call_log_access_blue, 11, w.c(j22.a.f96726o), false);
        f96762g = gVar4;
        g gVar5 = new g("CAMERA", 4, R.string.permission_camera, R.string.title_camera_access, R.string.camera_permission_bic_description, R.string.settings_camera_permission_description, R.string.label_allow_camera_access, R.drawable.picture, R.drawable.picture, 12, w.c(j22.a.f96716e), true);
        f96763h = gVar5;
        g gVar6 = new g("CONTACTS", 5, R.string.permission_contacts, R.string.title_contacts_access, R.string.contacts_permission_bic_description, R.string.settings_contacts_permission_description, R.string.label_allow_contacts_access, R.drawable.icon_contacts_access_trans, R.drawable.icon_contact_access_blue, 13, w.c(j22.a.f96717f), false);
        f96764i = gVar6;
        ArrayList arrayListD = x.d(j22.a.f96718g, j22.a.f96719h);
        if (b.t()) {
            arrayListD.add(j22.a.f96720i);
        }
        g gVar7 = new g(CodePackage.LOCATION, 6, R.string.permission_location, R.string.title_location_permission, R.string.location_permission_bic_description_with_background, R.string.settings_location_permission_description_with_background, R.string.label_allow_location_access, R.drawable.pin, R.drawable.pin, 14, h0.b1(arrayListD), true);
        f96765j = gVar7;
        g gVar8 = new g("PHONE", 7, R.string.permission_phone_calls_title, R.string.title_phone_call_access, R.string.phone_permission_bic_description, R.string.phone_calls_permission_description, R.string.label_allow_phone_call_access, R.drawable.phone_controls_on, R.drawable.phone_controls_on, 15, x.k(j22.a.f96723l, j22.a.f96725n, j22.a.f96727p), true);
        f96766k = gVar8;
        g gVar9 = new g("SCHEDULE_EXACT_ALARM", 8, R.string.lbl_alarms_and_reminders, -1, -1, R.string.lbl_allows_you_to_set_alarms_and_reminders_in_app, -1, -1, -1, -1, w.c(j22.a.f96730t), false);
        f96767l = gVar9;
        g gVar10 = new g("SMS", 9, R.string.permission_sms_messages_title, R.string.title_sms_access, R.string.sms_permission_bic_description, R.string.text_messaging_permission_description, R.string.label_allow_sms_access, R.drawable.icon_sms_access_trans, R.drawable.icon_sms_access_blue, 16, w.c(j22.a.f96724m), false);
        f96768m = gVar10;
        g gVar11 = new g("STORAGE", 10, R.string.settings_external_storage_permission_title, R.string.title_storage_access, R.string.storage_permission_bic_description, R.string.settings_storage_permission_description, R.string.label_allow_storage_access, R.drawable.icon_storage_access_trans, R.drawable.icon_storage_access_blue, 17, x.k(j22.a.f96721j, j22.a.f96722k), false);
        f96769n = gVar11;
        g gVar12 = new g("MICROPHONE", 11, R.string.lbl_microphone, 0, 0, R.string.audio_note_microphone_permission, 0, 0, 0, 0, w.c(j22.a.f96732w), false);
        f96770o = gVar12;
        f96771p = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12};
        CREATOR = new Parcelable.Creator<g>() { // from class: j22.g.a
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                return g.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        };
    }

    private g(String str, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, List list, boolean z14) {
        super(str, i14);
        this.f96772a = i15;
        this.f96773b = i18;
        this.f96774c = list;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f96771p.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
