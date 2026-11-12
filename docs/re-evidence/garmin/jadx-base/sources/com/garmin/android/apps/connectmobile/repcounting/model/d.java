package com.garmin.android.apps.connectmobile.repcounting.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import d53.k;
import d53.n;
import d53.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0012B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bBC\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "category", "categoryTranslation", "counterpart", "", "isBodyWeight", "exerciseTypeKey", "exerciseTranslation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends s1 implements Parcelable, Comparable<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f41108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<String> f41109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<String> f41110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f41101j = new b(null);
    public static final Parcelable.Creator<d> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/repcounting/model/d$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(Parcel parcel) {
        parcel.getClass();
        this.f41102a = parcel.readString();
        this.f41103b = parcel.readString();
        this.f41104c = parcel.readString();
        this.f41105d = parcel.readInt() == 1;
        this.f41106e = parcel.readString();
        this.f41107f = parcel.readString();
        this.f41108g = parcel.createStringArrayList();
        this.f41109h = parcel.createStringArrayList();
        this.f41110i = parcel.createStringArrayList();
    }

    public final void C(JSONObject jSONObject) {
        try {
            this.f41102a = jSONObject.optString("category", null);
            this.f41103b = jSONObject.optString("categoryTranslation", null);
            this.f41104c = jSONObject.optString("counterpart", null);
            this.f41105d = jSONObject.optBoolean("isBodyWeight", false);
            this.f41106e = jSONObject.getString("exercise");
            this.f41107f = jSONObject.optString("exerciseTranslation", null);
        } catch (JSONException e4) {
            i2.a.j(i2.f36769a, "ExerciseListItemDTO", "fromJson: " + e4.getMessage());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        dVar2.getClass();
        String str = dVar2.f41107f;
        String str2 = this.f41107f;
        if (str2 == null) {
            return str != null ? -1 : 0;
        }
        if (str == null) {
            return 1;
        }
        String strI = hb.a.i(str2);
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return strI.compareTo(lowerCase);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(dVar.f41106e, this.f41106e) && s.g(dVar.f41102a, this.f41102a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41102a, this.f41106e);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f41104c = jSONObject.optString("counterpart", "");
        this.f41106e = jSONObject.getString("exercise");
        this.f41105d = jSONObject.optBoolean("isBodyWeight", false);
    }

    public final String toString() {
        String str = this.f41102a;
        String str2 = this.f41103b;
        String str3 = this.f41106e;
        String str4 = this.f41107f;
        StringBuilder sbI = p6.b.i("{category: ", str, ", categoryTranslation: ", str2, ", exerciseTypeKey: ");
        sbI.append(str3);
        sbI.append(", exerciseTranslation: ");
        sbI.append(str4);
        sbI.append(StringSubstitutor.DEFAULT_VAR_END);
        return n.c(sbI.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f41102a);
        parcel.writeString(this.f41103b);
        parcel.writeString(this.f41104c);
        parcel.writeInt(this.f41105d ? 1 : 0);
        parcel.writeString(this.f41106e);
        parcel.writeString(this.f41107f);
        parcel.writeStringList(this.f41108g);
        parcel.writeStringList(this.f41109h);
        parcel.writeStringList(this.f41110i);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/d$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "CREATOR", "Landroid/os/Parcelable$Creator;", "EXERCISE_LIST_CATEGORY", "EXERCISE_LIST_CATEGORY_TRANSLATION", "EXERCISE_TYPE_KEY", "EXERCISE_TRANSLATION", "EXERCISE_COUNTERPART", "IS_BODY_WEIGHT", "CATEGORY_TYPE", "EXERCISE_TYPE", "MUSCLE_TYPE", "EQUAL_SIGN", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static String[] a(int i14, String str) {
            Collection collectionS0;
            List listG = new k("=").g(0, str.substring(i14));
            if (listG.isEmpty()) {
                collectionS0 = j0.f134944a;
            } else {
                ListIterator listIterator = listG.listIterator(listG.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                    }
                }
                collectionS0 = j0.f134944a;
            }
            return (String[]) collectionS0.toArray(new String[0]);
        }

        public static f b(String str) {
            String string;
            String string2;
            String string3;
            String string4;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            if (str != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new StringReader(StringEscapeUtils.unescapeJava(str)));
                    while (true) {
                        String line = bufferedReader.readLine();
                        String str2 = line == null ? "" : line;
                        if (line == null) {
                            break;
                        }
                        if (str2.length() > 0) {
                            int length = str2.length() - 1;
                            int i14 = 0;
                            boolean z14 = false;
                            while (i14 <= length) {
                                boolean z15 = s.h(str2.charAt(!z14 ? i14 : length), 32) <= 0;
                                if (z14) {
                                    if (!z15) {
                                        break;
                                    }
                                    length--;
                                } else if (z15) {
                                    i14++;
                                } else {
                                    z14 = true;
                                }
                            }
                            String string5 = str2.subSequence(i14, length + 1).toString();
                            String string6 = null;
                            if (w.z(string5, "category_type_", false)) {
                                String[] strArrA = a(14, string5);
                                String str3 = (String) u.L(0, strArrA);
                                if (str3 != null) {
                                    int length2 = str3.length() - 1;
                                    int i15 = 0;
                                    boolean z16 = false;
                                    while (i15 <= length2) {
                                        boolean z17 = s.h(str3.charAt(!z16 ? i15 : length2), 32) <= 0;
                                        if (z16) {
                                            if (!z17) {
                                                break;
                                            }
                                            length2--;
                                        } else if (z17) {
                                            i15++;
                                        } else {
                                            z16 = true;
                                        }
                                    }
                                    string = str3.subSequence(i15, length2 + 1).toString();
                                } else {
                                    string = null;
                                }
                                String str4 = (String) u.L(1, strArrA);
                                if (str4 != null) {
                                    int length3 = str4.length() - 1;
                                    int i16 = 0;
                                    boolean z18 = false;
                                    while (i16 <= length3) {
                                        boolean z19 = s.h(str4.charAt(!z18 ? i16 : length3), 32) <= 0;
                                        if (z18) {
                                            if (!z19) {
                                                break;
                                            }
                                            length3--;
                                        } else if (z19) {
                                            i16++;
                                        } else {
                                            z18 = true;
                                        }
                                    }
                                    string6 = str4.subSequence(i16, length3 + 1).toString();
                                }
                                if (string != null && string6 != null) {
                                    map2.put(string, string6);
                                }
                            } else if (w.z(string5, "exercise_type_", false)) {
                                String[] strArrA2 = a(14, string5);
                                String str5 = (String) u.L(0, strArrA2);
                                if (str5 != null) {
                                    int length4 = str5.length() - 1;
                                    int i17 = 0;
                                    boolean z24 = false;
                                    while (i17 <= length4) {
                                        boolean z25 = s.h(str5.charAt(!z24 ? i17 : length4), 32) <= 0;
                                        if (z24) {
                                            if (!z25) {
                                                break;
                                            }
                                            length4--;
                                        } else if (z25) {
                                            i17++;
                                        } else {
                                            z24 = true;
                                        }
                                    }
                                    string2 = str5.subSequence(i17, length4 + 1).toString();
                                } else {
                                    string2 = null;
                                }
                                String str6 = (String) u.L(1, strArrA2);
                                if (str6 != null) {
                                    int length5 = str6.length() - 1;
                                    int i18 = 0;
                                    boolean z26 = false;
                                    while (i18 <= length5) {
                                        boolean z27 = s.h(str6.charAt(!z26 ? i18 : length5), 32) <= 0;
                                        if (z26) {
                                            if (!z27) {
                                                break;
                                            }
                                            length5--;
                                        } else if (z27) {
                                            i18++;
                                        } else {
                                            z26 = true;
                                        }
                                    }
                                    string6 = str6.subSequence(i18, length5 + 1).toString();
                                }
                                if (string2 != null && string6 != null) {
                                    map.put(string2, string6);
                                }
                            } else if (w.z(string5, "muscle_type_", false)) {
                                String[] strArrA3 = a(12, string5);
                                String str7 = (String) u.L(0, strArrA3);
                                if (str7 != null) {
                                    int length6 = str7.length() - 1;
                                    int i19 = 0;
                                    boolean z28 = false;
                                    while (i19 <= length6) {
                                        boolean z29 = s.h(str7.charAt(!z28 ? i19 : length6), 32) <= 0;
                                        if (z28) {
                                            if (!z29) {
                                                break;
                                            }
                                            length6--;
                                        } else if (z29) {
                                            i19++;
                                        } else {
                                            z28 = true;
                                        }
                                    }
                                    string3 = str7.subSequence(i19, length6 + 1).toString();
                                } else {
                                    string3 = null;
                                }
                                String str8 = (String) u.L(1, strArrA3);
                                if (str8 != null) {
                                    int length7 = str8.length() - 1;
                                    int i24 = 0;
                                    boolean z34 = false;
                                    while (i24 <= length7) {
                                        boolean z35 = s.h(str8.charAt(!z34 ? i24 : length7), 32) <= 0;
                                        if (z34) {
                                            if (!z35) {
                                                break;
                                            }
                                            length7--;
                                        } else if (z35) {
                                            i24++;
                                        } else {
                                            z34 = true;
                                        }
                                    }
                                    string6 = str8.subSequence(i24, length7 + 1).toString();
                                }
                                if (string3 != null && string6 != null) {
                                    map3.put(string3, string6);
                                }
                            } else {
                                String[] strArrA4 = a(0, string5);
                                String str9 = (String) u.L(0, strArrA4);
                                if (str9 != null) {
                                    int length8 = str9.length() - 1;
                                    int i25 = 0;
                                    boolean z36 = false;
                                    while (i25 <= length8) {
                                        boolean z37 = s.h(str9.charAt(!z36 ? i25 : length8), 32) <= 0;
                                        if (z36) {
                                            if (!z37) {
                                                break;
                                            }
                                            length8--;
                                        } else if (z37) {
                                            i25++;
                                        } else {
                                            z36 = true;
                                        }
                                    }
                                    string4 = str9.subSequence(i25, length8 + 1).toString();
                                } else {
                                    string4 = null;
                                }
                                String str10 = (String) u.L(1, strArrA4);
                                if (str10 != null) {
                                    int length9 = str10.length() - 1;
                                    int i26 = 0;
                                    boolean z38 = false;
                                    while (i26 <= length9) {
                                        boolean z39 = s.h(str10.charAt(!z38 ? i26 : length9), 32) <= 0;
                                        if (z38) {
                                            if (!z39) {
                                                break;
                                            }
                                            length9--;
                                        } else if (z39) {
                                            i26++;
                                        } else {
                                            z38 = true;
                                        }
                                    }
                                    string6 = str10.subSequence(i26, length9 + 1).toString();
                                }
                                if (string4 != null && string6 != null) {
                                    map.put(string4, string6);
                                }
                            }
                        }
                    }
                } catch (IOException e4) {
                    i2.a.j(i2.f36769a, "ExerciseListItemDTO", e4.getMessage());
                }
            }
            return new f(map2, map, map3);
        }

        public static void c(d[] dVarArr, String str) {
            f fVarB = b(str);
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    String str2 = dVar.f41102a;
                    String str3 = dVar.f41106e;
                    str2.getClass();
                    String str4 = fVarB.f41126a.get(str2);
                    String strV = zf.b.v(fVarB, str2, str3);
                    if (str4 != null && str4.length() != 0) {
                        dVar.f41103b = str4;
                    }
                    if (strV != null && strV.length() != 0) {
                        dVar.f41107f = strV;
                    }
                }
            }
        }

        private b() {
        }
    }

    public d() {
    }

    public d(String str, String str2, String str3, boolean z14, String str4, String str5) {
        this.f41102a = str;
        this.f41103b = str2;
        this.f41104c = str3;
        this.f41105d = z14;
        this.f41106e = str4;
        this.f41107f = str5;
    }
}
