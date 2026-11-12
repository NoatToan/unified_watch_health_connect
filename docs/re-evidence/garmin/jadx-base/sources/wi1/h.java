package wi1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import bs2.in;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import d53.u;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\f\r\u000e\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lwi1/h;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "in", "<init>", "(Landroid/os/Parcel;)V", "()V", "", "f", "Ljava/lang/String;", "privacyModeKey", "b", "d", "c", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h extends s1 implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f185500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f185501h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f185502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f185503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f185504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f185505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f185506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNotificationPrivacyMode")
    private String privacyModeKey;

    static {
        new a(null);
        f185500g = "ACTION";
        f185501h = "OFF";
    }

    public h(Parcel parcel) {
        parcel.getClass();
        this.f185505d = new int[]{R.string.device_settings_all_notifications, R.string.device_settings_calls_only};
        this.f185506e = new int[]{R.string.device_settings_tones, R.string.device_settings_tones_and_vibration, R.string.device_settings_vibration};
        i0(parcel.readString());
        this.f185503b = parcel.readString();
        this.privacyModeKey = parcel.readString();
        this.f185504c = parcel.readString();
    }

    public static CharSequence[] M(Context context) {
        context.getClass();
        w13.c cVar = b.f185513g;
        CharSequence[] charSequenceArr = new CharSequence[cVar.getF134922d()];
        cVar.getClass();
        int length = p005kotlin.jvm.internal.i.d(cVar, new b[0]).length;
        for (int i14 = 0; i14 < length; i14++) {
            b.f185508b.getClass();
            charSequenceArr[i14] = context.getString(b.a.a(i14));
        }
        return charSequenceArr;
    }

    public final int C() {
        String str = this.f185502a;
        if (str == null) {
            return 0;
        }
        if (s.g(str, "SHOW_CALLS_ONLY")) {
            return 1;
        }
        return s.g(this.f185502a, "SHOW_CALLS_AND_TEXTS") ? 2 : 0;
    }

    public final String D(Context context) {
        context.getClass();
        String string = context.getString(this.f185505d[C()]);
        string.getClass();
        return string;
    }

    public final String F(Context context) {
        context.getClass();
        b.a aVar = b.f185508b;
        int iC = C();
        aVar.getClass();
        String string = context.getString(b.a.a(iC));
        string.getClass();
        return string;
    }

    public final int G() {
        int length = this.f185506e.length - 1;
        String str = this.f185503b;
        if (str != null && s.g(str, "TONE")) {
            return 0;
        }
        String str2 = this.f185503b;
        if (str2 == null || !s.g(str2, "TONE_AND_VIBRATION")) {
            return length;
        }
        return 1;
    }

    public final String H(Context context) {
        context.getClass();
        String string = context.getString(this.f185506e[G()]);
        string.getClass();
        return string;
    }

    public final CharSequence[] I(Context context) {
        context.getClass();
        int[] iArr = this.f185505d;
        CharSequence[] charSequenceArr = new CharSequence[iArr.length];
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            charSequenceArr[i14] = context.getString(iArr[i14]);
        }
        return charSequenceArr;
    }

    public final CharSequence[] Z(Context context) {
        context.getClass();
        int[] iArr = this.f185506e;
        CharSequence[] charSequenceArr = new CharSequence[iArr.length];
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            charSequenceArr[i14] = context.getString(iArr[i14]);
        }
        return charSequenceArr;
    }

    public final in a0() {
        if (!f0()) {
            return null;
        }
        String str = this.privacyModeKey;
        str.getClass();
        return in.valueOf(str);
    }

    public final boolean c0() {
        return this.f185503b != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e0() {
        return this.f185502a != null;
    }

    public final boolean f0() {
        return this.privacyModeKey != null;
    }

    public final boolean g0() {
        return e0() || c0();
    }

    public final boolean h0() {
        return u.q(f185500g, this.privacyModeKey, true);
    }

    public final void i0(String str) {
        this.f185502a = str;
        d.f185523d.getClass();
        if (d.a.a(str) == null || d.a.a(this.f185502a) == d.OFF) {
            return;
        }
        this.f185504c = this.f185502a;
    }

    public final void j0(in inVar) {
        this.privacyModeKey = inVar != null ? inVar.name() : null;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public void k(JSONObject jSONObject) {
        i0(s1.u(jSONObject, "smartNotificationsStatus"));
        this.f185503b = s1.u(jSONObject, "smartNotificationsSound");
        this.privacyModeKey = s1.u(jSONObject, "phoneNotificationPrivacyMode");
    }

    public final void k0(boolean z14) {
        this.privacyModeKey = z14 ? f185500g : f185501h;
    }

    public final JSONObject n0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smartNotificationsStatus", this.f185502a);
            jSONObject.put("smartNotificationsSound", this.f185503b);
            String str = this.privacyModeKey;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("phoneNotificationPrivacyMode", str);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, wi1.c.class.getSimpleName(), "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    public void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f185502a);
        parcel.writeString(this.f185503b);
        parcel.writeString(this.privacyModeKey);
        parcel.writeString(this.f185504c);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wi1.h$b[], still in use, count: 1, list:
      (r0v1 wi1.h$b[]) from 0x002f: CONSTRUCTOR (r0v1 wi1.h$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwi1/h$b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        SHOW_ALL(R.string.device_settings_all_notifications),
        SHOW_CALLS_ONLY(R.string.device_settings_calls_only),
        SHOW_CALLS_AND_TEXTS(R.string.device_settings_show_calls_and_texts);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f185508b = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f185513g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f185514a;

        static {
            f185513g = new w13.c(new b[]{r0, r1, r2});
        }

        private b(int i14) {
            super(str, i);
            this.f185514a = i14;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f185512f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi1/h$b$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static int a(int i14) {
                w13.c cVar = b.f185513g;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    b bVar = (b) bVarN.next();
                    if (bVar.ordinal() == i14) {
                        return bVar.f185514a;
                    }
                }
                return b.SHOW_ALL.f185514a;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wi1.h$c[], still in use, count: 1, list:
      (r0v1 wi1.h$c[]) from 0x0033: CONSTRUCTOR (r0v1 wi1.h$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwi1/h$c;", "", "", Action.KEY_ATTRIBUTE, "", "displayStringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        TONES("TONE", R.string.device_settings_tones),
        VIBRATION("VIBRATION", R.string.device_settings_vibration),
        TONES_AND_VIBRATION("TONE_AND_VIBRATION", R.string.device_settings_tones_and_vibration);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f185515c = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f185520h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f185521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f185522b;

        static {
            f185520h = new w13.c(new c[]{r0, r1, r2});
        }

        private c(String str, int i14) {
            super(str, i);
            this.f185521a = str;
            this.f185522b = i14;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f185519g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi1/h$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wi1.h$d[], still in use, count: 1, list:
      (r0v1 wi1.h$d[]) from 0x0050: CONSTRUCTOR (r0v1 wi1.h$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lwi1/h$d;", "", "", Action.KEY_ATTRIBUTE, "", "displayStringResId", "valueStringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        SHOW_ALL("SHOW_ALL", R.string.device_settings_show_all, R.string.common_all),
        SHOW_CALLS_ONLY("SHOW_CALLS_ONLY", R.string.device_settings_calls_only, R.string.device_settings_calls_only),
        SHOW_CALLS_AND_TEXTS_ONLY("SHOW_CALLS_AND_TEXTS", R.string.device_settings_calls_and_texts_only, R.string.device_settings_calls_and_texts_only),
        OFF("OFF", R.string.lbl_off, R.string.lbl_off);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f185523d = new a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ w13.c f185529j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f185530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f185531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f185532c;

        static {
            f185529j = new w13.c(new d[]{r0, r1, r2, r3});
        }

        private d(String str, int i14, int i15) {
            super(str, i);
            this.f185530a = str;
            this.f185531b = i14;
            this.f185532c = i15;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f185528i.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi1/h$d$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static d a(String str) {
                if (str == null) {
                    return null;
                }
                w13.c cVar = d.f185529j;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    d dVar = (d) bVarN.next();
                    if (u.q(dVar.f185530a, str, true)) {
                        return dVar;
                    }
                }
                return null;
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lwi1/h$a;", "", "<init>", "()V", "", "PRIVACY_MODE", "Ljava/lang/String;", "PRIVACY_MODE_ON_VALUE", "PRIVACY_MODE_OFF_VALUE", "NOTIFICATIONS_STATUS_KEY", "NOTIFICATIONS_SOUND_KEY", "NOTIFICATIONS_STATUS_SHOW_NONE", "NOTIFICATIONS_STATUS_SHOW_ALL", "NOTIFICATIONS_STATUS_SHOW_CALLS_ONLY", "NOTIFICATIONS_STATUS_SHOW_CALLS_AND_TEXTS", "NOTIFICATIONS_SOUND_VIBRATION", "NOTIFICATIONS_STATUS_SOUND_TONES", "NOTIFICATIONS_SOUND_TONES_AND_VIBRATION", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h() {
        this.f185505d = new int[]{R.string.device_settings_all_notifications, R.string.device_settings_calls_only};
        this.f185506e = new int[]{R.string.device_settings_tones, R.string.device_settings_tones_and_vibration, R.string.device_settings_vibration};
    }
}
