package com.garmin.android.apps.connectmobile.calendar.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.roomorama.caldroid.CaldroidFragment;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(CalendarDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0002\t\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "CREATOR", "CalendarDeserializer", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalendarDTO extends s1 implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f30966f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO$CalendarDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "<init>", "()V", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CalendarDeserializer implements JsonDeserializer<CalendarDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final CalendarDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            a.p(jsonElement, type, jsonDeserializationContext);
            try {
                CalendarDTO calendarDTO = new CalendarDTO();
                calendarDTO.m(jsonElement.toString());
                return calendarDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public CalendarDTO(Parcel parcel) {
        parcel.getClass();
        this.f30966f = new ArrayList();
        this.f30961a = parcel.readInt();
        this.f30962b = parcel.readInt();
        this.f30963c = parcel.readInt();
        this.f30964d = parcel.readInt();
        this.f30965e = parcel.readInt();
        parcel.readTypedList(this.f30966f, CalendarItemDTO.INSTANCE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.f30961a = jSONObject.optInt("startDayOfMonth");
        this.f30962b = jSONObject.optInt("numOfDaysInMonth");
        this.f30963c = jSONObject.optInt("numOfDaysInPrevMonth");
        this.f30964d = jSONObject.optInt(CaldroidFragment.MONTH) + 1;
        this.f30965e = jSONObject.optInt(CaldroidFragment.YEAR);
        if (!jSONObject.has("calendarItems") || jSONObject.isNull("calendarItems")) {
            return;
        }
        this.f30966f = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("calendarItems");
        int length = jSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
            jSONObject2.getClass();
            calendarItemDTO.k(jSONObject2);
            this.f30966f.add(calendarItemDTO);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f30961a);
        parcel.writeInt(this.f30962b);
        parcel.writeInt(this.f30963c);
        parcel.writeInt(this.f30964d);
        parcel.writeInt(this.f30965e);
        parcel.writeTypedList(this.f30966f);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO$a;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "<init>", "()V", "", "START_OF_DAY_PK", "Ljava/lang/String;", "NUM_OF_DAYS_IN_MONTH_PK", "NUM_OF_DAYS_IN_PREV_MONTH_PK", "MONTH_PK", "YEAR_PK", "CALENDAR_ITEMS_PK", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalendarDTO> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CalendarDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarDTO[] newArray(int i14) {
            return new CalendarDTO[i14];
        }

        private Companion() {
        }
    }

    public CalendarDTO() {
        this.f30966f = new ArrayList();
    }
}
