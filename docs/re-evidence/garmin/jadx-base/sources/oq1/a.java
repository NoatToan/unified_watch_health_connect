package oq1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.model.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import d53.u;
import ds.e0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kg.f;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zk0.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Loq1/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends s1 implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f133285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f133286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f133287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f133288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f133289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f133290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f133291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f133292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f133293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f133294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f133295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f133296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public mo1.d f133297m;

    /* JADX INFO: renamed from: oq1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"oq1/a$a", "Landroid/os/Parcelable$Creator;", "Loq1/a;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2531a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new C2531a();
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.f133285a = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        ClassLoader classLoader = a.class.getClassLoader();
        this.f133286b = parcel.readString();
        this.f133287c = parcel.readString();
        this.f133288d = (c) parcel.readParcelable(classLoader);
        this.f133289e = parcel.readString();
        this.f133290f = parcel.readInt();
        this.f133291g = parcel.readInt();
        this.f133292h = parcel.readString();
        this.f133293i = parcel.readInt() == 1;
        this.f133294j = parcel.readInt() == 1;
        this.f133295k = (d) d.f205059b.get(parcel.readInt());
        this.f133296l = parcel.readString();
        this.f133297m = (mo1.d) parcel.readParcelable(classLoader);
        C();
    }

    public final void C() {
        String str = this.f133292h;
        if (str != null) {
            try {
                this.f133285a.parse(str);
            } catch (ParseException e4) {
                sn.a.s("Date conversion failed: ", e4.getMessage(), i2.f36769a, a2.CONNECTIONS, "ConnectionsStepsNewsFeedDTO");
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.f133286b = s1.u(jSONObject, "displayName");
        this.f133289e = s1.u(jSONObject, "uuid");
        this.f133296l = s1.u(jSONObject, "userGoalTypePK");
        this.f133293i = jSONObject.optBoolean("goalMet");
        this.f133294j = jSONObject.optBoolean("goalExceeded");
        this.f133290f = jSONObject.optInt("goalValue");
        this.f133291g = jSONObject.optInt("recordedValue");
        this.f133292h = s1.u(jSONObject, "calendarDate");
        C();
        if (jSONObject.has("userInfo") && !jSONObject.isNull("userInfo")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("userInfo");
            c cVar = new c();
            this.f133288d = cVar;
            cVar.k(jSONObject2);
        }
        if (jSONObject.has("conversationDTO") && !jSONObject.isNull("conversationDTO")) {
            this.f133297m = (mo1.d) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("conversationDTO").toString(), mo1.d.class);
        }
        if (!jSONObject.has("userGoalCategoryPK") || jSONObject.isNull("userGoalCategoryPK")) {
            return;
        }
        String string = jSONObject.getString("userGoalCategoryPK");
        string.getClass();
        this.f133295k = d.valueOf(u.v(string, "-", "_", false));
    }

    public final String toString() {
        String str;
        String str2 = this.f133289e;
        String str3 = this.f133292h;
        boolean z14 = this.f133293i;
        boolean z15 = this.f133294j;
        int i14 = this.f133290f;
        int i15 = this.f133291g;
        String str4 = this.f133286b;
        c cVar = this.f133288d;
        if (cVar == null) {
            str = "";
        } else {
            cVar.getClass();
            str = cVar.f31700f;
        }
        mo1.d dVar = this.f133297m;
        String str5 = this.f133296l;
        d dVar2 = this.f133295k;
        StringBuilder sbI = p6.b.i("DailyGoalDTO [uuid=", str2, ", calendarDate=", str3, ", goalMet=");
        f.q(", goalExceeded=", ", goalValue=", sbI, z14, z15);
        e0.m(i14, i15, ", recordedValue=", ", displayName=", sbI);
        sn.a.t(sbI, str4, ", profilePk=", str, ", conversationDTO=");
        sbI.append(dVar);
        sbI.append(", goalType=");
        sbI.append(str5);
        sbI.append(", uerGoalCategory=");
        sbI.append(dVar2);
        sbI.append("]");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f133286b);
        parcel.writeString(this.f133287c);
        parcel.writeParcelable(this.f133288d, 0);
        parcel.writeString(this.f133289e);
        parcel.writeInt(this.f133290f);
        parcel.writeInt(this.f133291g);
        parcel.writeString(this.f133292h);
        parcel.writeInt(this.f133293i ? 1 : 0);
        parcel.writeInt(this.f133294j ? 1 : 0);
        d dVar = this.f133295k;
        dVar.getClass();
        parcel.writeInt(dVar.ordinal());
        parcel.writeString(this.f133296l);
        parcel.writeParcelable(this.f133297m, 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Loq1/a$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Loq1/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "TAG", "Ljava/lang/String;", "KEY_CALENDAR_DATE", "KEY_USER_GOAL_CATEGORY", "KEY_USER_GOAL_TYPE", "KEY_GOAL_VALUE", "KEY_RECORDED_VALUE", "KEY_GOAL_MET", "KEY_GOAL_EXCEEDED", "KEY_CONVERSATION_DTO", "KEY_UUID", "KEY_DISPLAY_NAME", "KEY_USER_INFO", "DATE_TEMPLATE", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a() {
        this.f133285a = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    }
}
