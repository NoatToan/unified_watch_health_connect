package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\b5\u0010-\"\u0004\b<\u0010/R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b;\u0010-\"\u0004\b>\u0010/R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001a\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\b2\u0010-\"\u0004\bF\u0010/R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010,\u001a\u0004\bH\u0010-\"\u0004\bI\u0010/¨\u0006J"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/o;", "Landroid/os/Parcelable;", "", "bodyParts", "description", "difficulty", "equipment", "exerciseCategory", "exerciseName", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/g;", "exerciseSteps", "focuses", "locale", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/x;", "sportType", "tips", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/d0;", "videos", "exerciseSourceId", "heroImage", "primaryMuscles", "secondaryMuscles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/x;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setBodyParts", "(Ljava/lang/String;)V", "getDescription", "setDescription", "c", "d", "setDifficulty", "f", "setEquipment", JWKParameterNames.RSA_EXPONENT, "getExerciseCategory", "setExerciseCategory", "getExerciseName", "setExerciseName", "g", "Ljava/util/List;", "()Ljava/util/List;", "setExerciseSteps", "(Ljava/util/List;)V", "h", "setFocuses", IntegerTokenConverter.CONVERTER_KEY, "getLocale", "setLocale", "j", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/x;", "getSportType", "()Lcom/garmin/android/apps/connectmobile/workouts/data/model/x;", "setSportType", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/x;)V", JWKParameterNames.OCT_KEY_VALUE, "setTips", "l", "setVideos", "m", "getExerciseSourceId", "setExerciseSourceId", JWKParameterNames.RSA_MODULUS, "getHeroImage", "setHeroImage", "o", "setPrimaryMuscles", "p", "getSecondaryMuscles", "setSecondaryMuscles", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyParts")
    private String bodyParts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("difficulty")
    private String difficulty;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("equipment")
    private String equipment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseCategory")
    private String exerciseCategory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseName")
    private String exerciseName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSteps")
    private List<g> exerciseSteps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("focuses")
    private String focuses;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private String locale;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportType")
    private x sportType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tips")
    private List<String> tips;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videos")
    private List<d0> videos;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSourceId")
    private String exerciseSourceId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heroImage")
    private String heroImage;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryMuscles")
    private List<String> primaryMuscles;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryMuscles")
    private List<String> secondaryMuscles;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(g.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            String string7 = parcel.readString();
            int iA2 = 0;
            String string8 = parcel.readString();
            x xVarCreateFromParcel = parcel.readInt() == 0 ? null : x.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                while (iA2 != i15) {
                    iA2 = kg.f.a(d0.CREATOR, parcel, arrayList4, iA2, 1);
                    string = string;
                }
                arrayList2 = arrayList4;
            }
            return new o(string, string2, string3, string4, string5, string6, arrayList, string7, string8, xVarCreateFromParcel, arrayListCreateStringArrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, x xVar, List list2, List list3, String str9, String str10, List list4, List list5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : xVar, (i14 & 1024) != 0 ? null : list2, (i14 & 2048) != 0 ? null : list3, (i14 & 4096) != 0 ? null : str9, (i14 & 8192) != 0 ? null : str10, (i14 & 16384) != 0 ? null : list4, (i14 & 32768) != 0 ? null : list5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBodyParts() {
        return this.bodyParts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDifficulty() {
        return this.difficulty;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.bodyParts, oVar.bodyParts) && p005kotlin.jvm.internal.s.g(this.description, oVar.description) && p005kotlin.jvm.internal.s.g(this.difficulty, oVar.difficulty) && p005kotlin.jvm.internal.s.g(this.equipment, oVar.equipment) && p005kotlin.jvm.internal.s.g(this.exerciseCategory, oVar.exerciseCategory) && p005kotlin.jvm.internal.s.g(this.exerciseName, oVar.exerciseName) && p005kotlin.jvm.internal.s.g(this.exerciseSteps, oVar.exerciseSteps) && p005kotlin.jvm.internal.s.g(this.focuses, oVar.focuses) && p005kotlin.jvm.internal.s.g(this.locale, oVar.locale) && p005kotlin.jvm.internal.s.g(this.sportType, oVar.sportType) && p005kotlin.jvm.internal.s.g(this.tips, oVar.tips) && p005kotlin.jvm.internal.s.g(this.videos, oVar.videos) && p005kotlin.jvm.internal.s.g(this.exerciseSourceId, oVar.exerciseSourceId) && p005kotlin.jvm.internal.s.g(this.heroImage, oVar.heroImage) && p005kotlin.jvm.internal.s.g(this.primaryMuscles, oVar.primaryMuscles) && p005kotlin.jvm.internal.s.g(this.secondaryMuscles, oVar.secondaryMuscles);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    public final List<g> g() {
        return this.exerciseSteps;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFocuses() {
        return this.focuses;
    }

    public final int hashCode() {
        String str = this.bodyParts;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.difficulty;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.equipment;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exerciseCategory;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.exerciseName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<g> list = this.exerciseSteps;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.focuses;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locale;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        x xVar = this.sportType;
        int iHashCode10 = (iHashCode9 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        List<String> list2 = this.tips;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<d0> list3 = this.videos;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str9 = this.exerciseSourceId;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.heroImage;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list4 = this.primaryMuscles;
        int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.secondaryMuscles;
        return iHashCode15 + (list5 != null ? list5.hashCode() : 0);
    }

    public final List<String> i() {
        return this.primaryMuscles;
    }

    public final List<String> j() {
        return this.tips;
    }

    public final List<d0> k() {
        return this.videos;
    }

    public final String toString() {
        String str = this.bodyParts;
        String str2 = this.description;
        String str3 = this.difficulty;
        String str4 = this.equipment;
        String str5 = this.exerciseCategory;
        String str6 = this.exerciseName;
        List<g> list = this.exerciseSteps;
        String str7 = this.focuses;
        String str8 = this.locale;
        x xVar = this.sportType;
        List<String> list2 = this.tips;
        List<d0> list3 = this.videos;
        String str9 = this.exerciseSourceId;
        String str10 = this.heroImage;
        List<String> list4 = this.primaryMuscles;
        List<String> list5 = this.secondaryMuscles;
        StringBuilder sbI = p6.b.i("MSNWorkoutExerciseDTO(bodyParts=", str, ", description=", str2, ", difficulty=");
        sn.a.t(sbI, str3, ", equipment=", str4, ", exerciseCategory=");
        sn.a.t(sbI, str5, ", exerciseName=", str6, ", exerciseSteps=");
        o2.c.n(", focuses=", str7, ", locale=", sbI, list);
        sbI.append(str8);
        sbI.append(", sportType=");
        sbI.append(xVar);
        sbI.append(", tips=");
        n23.j.z(sbI, list2, ", videos=", list3, ", exerciseSourceId=");
        sn.a.t(sbI, str9, ", heroImage=", str10, ", primaryMuscles=");
        return n23.j.j(sbI, list4, ", secondaryMuscles=", list5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.bodyParts);
        parcel.writeString(this.description);
        parcel.writeString(this.difficulty);
        parcel.writeString(this.equipment);
        parcel.writeString(this.exerciseCategory);
        parcel.writeString(this.exerciseName);
        List<g> list = this.exerciseSteps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((g) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.focuses);
        parcel.writeString(this.locale);
        x xVar = this.sportType;
        if (xVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xVar.writeToParcel(parcel, i14);
        }
        parcel.writeStringList(this.tips);
        List<d0> list2 = this.videos;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((d0) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.exerciseSourceId);
        parcel.writeString(this.heroImage);
        parcel.writeStringList(this.primaryMuscles);
        parcel.writeStringList(this.secondaryMuscles);
    }

    public o(String str, String str2, String str3, String str4, String str5, String str6, List<g> list, String str7, String str8, x xVar, List<String> list2, List<d0> list3, String str9, String str10, List<String> list4, List<String> list5) {
        this.bodyParts = str;
        this.description = str2;
        this.difficulty = str3;
        this.equipment = str4;
        this.exerciseCategory = str5;
        this.exerciseName = str6;
        this.exerciseSteps = list;
        this.focuses = str7;
        this.locale = str8;
        this.sportType = xVar;
        this.tips = list2;
        this.videos = list3;
        this.exerciseSourceId = str9;
        this.heroImage = str10;
        this.primaryMuscles = list4;
        this.secondaryMuscles = list5;
    }

    public o() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
