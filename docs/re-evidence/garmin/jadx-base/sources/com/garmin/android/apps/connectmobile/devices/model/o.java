package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/o;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "c", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f34280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f34279b = new b(null);
    public static final Parcelable.Creator<o> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/o$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/o;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/o$c;", "", "", Action.KEY_ATTRIBUTE, "", "screenType", "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;I)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public static final c A;
        public static final c B;
        public static final c C;
        public static final c D;
        public static final c E;
        public static final c F;
        public static final c I;
        public static final /* synthetic */ c[] P;
        public static final /* synthetic */ w13.c T;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f34281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f34282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f34283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f34284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f34285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f34286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f34287j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final c f34288k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final c f34289l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c f34290m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final c f34291n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final c f34292o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final c f34293p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final c f34294q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f34295r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final c f34296t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final c f34297v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final c f34298w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final c f34299x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final c f34300y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final c f34301z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f34303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f34304c;

        static {
            b bVar = o.f34279b;
            c cVar = new c("LAST_DISPLAYED", 0, "page_none", null, R.string.device_screen_last_displayed);
            f34281d = cVar;
            Boolean bool = Boolean.TRUE;
            c cVar2 = new c("TIME", 1, "page_time", bool, R.string.lbl_time);
            f34282e = cVar2;
            c cVar3 = new c("DATE", 2, "page_date", bool, R.string.txt_date);
            f34283f = cVar3;
            c cVar4 = new c("STEPS", 3, "page_steps", bool, R.string.steps_steps);
            f34284g = cVar4;
            c cVar5 = new c("STEPS_GOAL", 4, "page_steps_goal", bool, R.string.steps_steps_goal);
            f34285h = cVar5;
            c cVar6 = new c("DISTANCE", 5, "page_distance", bool, R.string.lbl_distance);
            f34286i = cVar6;
            c cVar7 = new c("CALORIES", 6, "page_calories", bool, R.string.lbl_calories);
            f34287j = cVar7;
            c cVar8 = new c("INTENSITY_MINUTES", 7, "page_intensity_minutes", bool, R.string.title_intensity_minutes);
            f34288k = cVar8;
            c cVar9 = new c("HEART_RATE", 8, "page_heartrate", bool, R.string.device_screen_heart_rate);
            f34289l = cVar9;
            c cVar10 = new c("TIME_DATE", 9, "page_time_date", bool, R.string.device_screen_time_date);
            f34290m = cVar10;
            c cVar11 = new c("MOVE_BAR", 10, "page_move_bar", bool, R.string.device_screen_move_bar);
            f34291n = cVar11;
            c cVar12 = new c("BIKE_SPEED", 11, "page_bike_speed", bool, R.string.device_screen_bike_speed);
            f34292o = cVar12;
            c cVar13 = new c("VIRB_REMOTE", 12, "page_virb_remote", bool, R.string.device_screen_virb_remote);
            f34293p = cVar13;
            c cVar14 = new c("MUSIC_CONTROL", 13, "page_music", bool, R.string.title_activity_music_control);
            f34294q = cVar14;
            c cVar15 = new c("NOTIFICATIONS", 14, "page_notifications", bool, R.string.device_screen_notifications);
            f34295r = cVar15;
            c cVar16 = new c("FLOORS_CLIMBED", 15, "page_floors_climbed", bool, R.string.floors_climbed_lbl);
            f34296t = cVar16;
            c cVar17 = new c("WEATHER", 16, "page_weather", bool, R.string.title_weather_on_off);
            f34297v = cVar17;
            c cVar18 = new c("LAST_ACTIVITY", 17, "page_last_activity", bool, R.string.activity_options_title);
            f34298w = cVar18;
            c cVar19 = new c("CALENDAR", 18, "page_calendar", bool, R.string.calendar);
            f34299x = cVar19;
            c cVar20 = new c("STRESS", 19, "page_stress", bool, R.string.title_stress);
            f34300y = cVar20;
            Boolean bool2 = Boolean.FALSE;
            c cVar21 = new c("ACTIVITY", 20, "page_activity", bool2, R.string.device_screen_activity);
            c cVar22 = new c("ACTIVITY_STEPS", 21, "page_activity_steps", bool2, R.string.lbl_activity_steps);
            f34301z = cVar22;
            c cVar23 = new c("ACTIVITY_CALORIES", 22, "page_activity_calories", bool2, R.string.lbl_activity_calories);
            A = cVar23;
            c cVar24 = new c("ACTIVITY_DISTANCE", 23, "page_activity_distance", bool2, R.string.lbl_activity_distance);
            B = cVar24;
            c cVar25 = new c("ACTIVITY_TIMER", 24, "page_activity_timer", bool2, R.string.lbl_activity_timer);
            C = cVar25;
            c cVar26 = new c("ACTIVITY_STEPS_GOAL", 25, "page_steps_goal", bool2, R.string.steps_steps_goal);
            D = cVar26;
            c cVar27 = new c("ACTIVITY_HEART_RATE", 26, "page_heartrate", bool2, R.string.device_screen_heart_rate);
            E = cVar27;
            c cVar28 = new c("ACTIVITY_TIME", 27, "page_time", bool2, R.string.lbl_time);
            F = cVar28;
            c cVar29 = new c("ACTIVITY_DATE", 28, "page_date", bool2, R.string.txt_date);
            I = cVar29;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29};
            P = cVarArr;
            T = new w13.c(cVarArr);
        }

        private c(String str, int i14, String str2, Boolean bool, int i15) {
            super(str, i14);
            this.f34302a = str2;
            this.f34303b = bool;
            this.f34304c = i15;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) P.clone();
        }
    }

    public o(Parcel parcel) {
        this.f34280a = new HashMap();
        Class cls = Boolean.TYPE;
        x0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        j0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_steps", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        w0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        i0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        k0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        n0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_time_date", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_move_bar", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_bike_speed", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_virb_remote", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        o0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        p0((Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_activity", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_activity_steps", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_activity_distance", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_activity_calories", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_activity_timer", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_floors_climbed", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_intensity_minutes", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_weather", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_last_activity", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_calendar", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
        h0("page_stress", (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null));
    }

    public final ArrayList C(boolean z14) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f34280a.keySet()) {
            obj.getClass();
            String str = (String) obj;
            b bVar = f34279b;
            if (z14) {
                bVar.getClass();
                c cVarA = b.a(str, null);
                if (cVarA != null && !arrayList.contains(cVarA)) {
                    arrayList.add(cVarA);
                }
            } else {
                bVar.getClass();
                c cVarB = b.b(str, null);
                if (cVarB != null && !arrayList.contains(cVarB)) {
                    arrayList.add(cVarB);
                }
            }
        }
        return arrayList;
    }

    public final boolean D(String str) {
        if (str != null) {
            return this.f34280a.containsKey(str);
        }
        return false;
    }

    public final Boolean F() {
        return Boolean.valueOf(I("page_calories"));
    }

    public final Boolean G() {
        return Boolean.valueOf(I("page_date"));
    }

    public final Boolean H() {
        return Boolean.valueOf(I("page_distance"));
    }

    public final boolean I(String str) {
        if (str == null || !D(str)) {
            return false;
        }
        Object obj = this.f34280a.get(str);
        obj.getClass();
        return ((Boolean) obj).booleanValue();
    }

    public final Boolean M() {
        return Boolean.valueOf(I("page_heartrate"));
    }

    public final Boolean Z() {
        return Boolean.valueOf(I("page_music"));
    }

    public final Boolean a0() {
        return Boolean.valueOf(I("page_notifications"));
    }

    public final Boolean c0() {
        return Boolean.valueOf(I("page_steps_goal"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e0() {
        return Boolean.valueOf(I("page_time"));
    }

    public final Boolean f0() {
        return Boolean.valueOf(I("page_virb_remote"));
    }

    public final Boolean g0() {
        return Boolean.valueOf(I("page_weather"));
    }

    public final void h0(String str, Boolean bool) {
        if (bool != null) {
            this.f34280a.put(str, bool);
        }
    }

    public final void i0(Boolean bool) {
        h0("page_calories", bool);
    }

    public final void j0(Boolean bool) {
        h0("page_date", bool);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            x0(s1.o(jSONObject, "page_time"));
            j0(s1.o(jSONObject, "page_date"));
            h0("page_steps", s1.o(jSONObject, "page_steps"));
            w0(s1.o(jSONObject, "page_steps_goal"));
            i0(s1.o(jSONObject, "page_calories"));
            k0(s1.o(jSONObject, "page_distance"));
            n0(s1.o(jSONObject, "page_heartrate"));
            h0("page_time_date", s1.o(jSONObject, "page_time_date"));
            h0("page_move_bar", s1.o(jSONObject, "page_move_bar"));
            h0("page_bike_speed", s1.o(jSONObject, "page_bike_speed"));
            h0("page_virb_remote", s1.o(jSONObject, "page_virb_remote"));
            o0(s1.o(jSONObject, "page_music"));
            p0(s1.o(jSONObject, "page_notifications"));
            h0("page_activity", s1.o(jSONObject, "page_activity"));
            h0("page_activity_steps", s1.o(jSONObject, "page_activity_steps"));
            h0("page_activity_distance", s1.o(jSONObject, "page_activity_distance"));
            h0("page_activity_calories", s1.o(jSONObject, "page_activity_calories"));
            h0("page_activity_timer", s1.o(jSONObject, "page_activity_timer"));
            h0("page_floors_climbed", s1.o(jSONObject, "page_floors_climbed"));
            h0("page_intensity_minutes", s1.o(jSONObject, "page_intensity_minutes"));
            h0("page_weather", s1.o(jSONObject, "page_weather"));
            h0("page_last_activity", s1.o(jSONObject, "page_last_activity"));
            h0("page_calendar", s1.o(jSONObject, "page_calendar"));
            h0("page_stress", s1.o(jSONObject, "page_stress"));
        }
    }

    public final void k0(Boolean bool) {
        h0("page_distance", bool);
    }

    public final void n0(Boolean bool) {
        h0("page_heartrate", bool);
    }

    public final void o0(Boolean bool) {
        h0("page_music", bool);
    }

    public final void p0(Boolean bool) {
        h0("page_notifications", bool);
    }

    public final void w0(Boolean bool) {
        h0("page_steps_goal", bool);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeValue(!D("page_time") ? null : e0());
        parcel.writeValue(!D("page_date") ? null : G());
        parcel.writeValue(!D("page_steps") ? null : Boolean.valueOf(I("page_steps")));
        parcel.writeValue(!D("page_steps_goal") ? null : c0());
        parcel.writeValue(!D("page_calories") ? null : F());
        parcel.writeValue(!D("page_distance") ? null : H());
        parcel.writeValue(!D("page_heartrate") ? null : M());
        parcel.writeValue(!D("page_time_date") ? null : Boolean.valueOf(I("page_time_date")));
        parcel.writeValue(!D("page_move_bar") ? null : Boolean.valueOf(I("page_move_bar")));
        parcel.writeValue(!D("page_bike_speed") ? null : Boolean.valueOf(I("page_bike_speed")));
        parcel.writeValue(!D("page_virb_remote") ? null : f0());
        parcel.writeValue(!D("page_music") ? null : Z());
        parcel.writeValue(!D("page_notifications") ? null : a0());
        parcel.writeValue(!D("page_activity") ? null : Boolean.valueOf(I("page_activity")));
        parcel.writeValue(!D("page_activity_steps") ? null : Boolean.valueOf(I("page_activity_steps")));
        parcel.writeValue(!D("page_activity_distance") ? null : Boolean.valueOf(I("page_activity_distance")));
        parcel.writeValue(!D("page_activity_calories") ? null : Boolean.valueOf(I("page_activity_calories")));
        parcel.writeValue(!D("page_activity_timer") ? null : Boolean.valueOf(I("page_activity_timer")));
        parcel.writeValue(!D("page_floors_climbed") ? null : Boolean.valueOf(I("page_floors_climbed")));
        parcel.writeValue(!D("page_intensity_minutes") ? null : Boolean.valueOf(I("page_intensity_minutes")));
        parcel.writeValue(!D("page_weather") ? null : g0());
        parcel.writeValue(!D("page_last_activity") ? null : Boolean.valueOf(I("page_last_activity")));
        parcel.writeValue(!D("page_calendar") ? null : Boolean.valueOf(I("page_calendar")));
        parcel.writeValue(D("page_stress") ? Boolean.valueOf(I("page_stress")) : null);
    }

    public final void x0(Boolean bool) {
        h0("page_time", bool);
    }

    public final JSONObject z0() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(this.f34280a.keySet());
        if (arrayList.size() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : arrayList) {
                if (D(str)) {
                    jSONObject.put(str, I(str));
                }
            }
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.DEVICES, "DeviceScreensDTO", "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0014\u0010 \u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u0014\u0010\"\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0014\u0010#\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0014\u0010$\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0010R\u0014\u0010%\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0014\u0010&\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0014\u0010'\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u0014\u0010(\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/o$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/o;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "NONE", "Ljava/lang/Boolean;", "DEFAULT_SCREEN", "Z", "DURING_ACTIVITY_SCREEN", "", "PAGE_NONE", "Ljava/lang/String;", "PAGE_TIME", "PAGE_DATE", "PAGE_STEPS", "PAGE_STEPS_GOAL", "PAGE_CALORIES", "PAGE_DISTANCE", "PAGE_HEART_RATE", "PAGE_TIME_DATE", "PAGE_MOVE_BAR", "PAGE_BIKE_SPEED", "PAGE_VIRB_REMOTE", "PAGE_MUSIC", "PAGE_NOTIFICATIONS", "PAGE_ACTIVITY", "PAGE_ACTIVITY_STEPS", "PAGE_ACTIVITY_DISTANCE", "PAGE_ACTIVITY_CALORIES", "PAGE_ACTIVITY_TIMER", "PAGE_FLOOR_CLIMBED", "PAGE_INTENSITY_MINUTES", "PAGE_WEATHER", "PAGE_LAST_ACTIVITY", "PAGE_CALENDAR", "PAGE_STRESS", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(String str, c cVar) {
            if (str != null) {
                w13.c cVar2 = c.T;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                while (bVarN.hasNext()) {
                    c cVar3 = (c) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(cVar3.f34302a, str) && cVar3.f34303b == Boolean.TRUE) {
                        return cVar3;
                    }
                }
            }
            return cVar;
        }

        public static c b(String str, c cVar) {
            if (str != null) {
                w13.c cVar2 = c.T;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                while (bVarN.hasNext()) {
                    c cVar3 = (c) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(cVar3.f34302a, str) && cVar3.f34303b == Boolean.FALSE) {
                        return cVar3;
                    }
                }
            }
            return cVar;
        }

        private b() {
        }
    }

    public o() {
        HashMap map = new HashMap();
        this.f34280a = map;
        map.clear();
    }
}
