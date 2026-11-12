package com.garmin.android.apps.connectmobile.live.activity;

import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/e;", "", "", "category", "categoryTranslation", "counterPart", "", "isBodyWeight", "exerciseTypeKey", "exerciseTranslation", "", "primaryMuscleList", "secondaryMuscleList", "equipmentList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f38406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<String> f38407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f38408i;

    public e(String str, String str2, String str3, boolean z14, String str4, String str5, List<String> list, List<String> list2, List<String> list3) {
        this.f38400a = str;
        this.f38401b = str2;
        this.f38402c = str3;
        this.f38403d = z14;
        this.f38404e = str4;
        this.f38405f = str5;
        this.f38406g = list;
        this.f38407h = list2;
        this.f38408i = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f38400a, eVar.f38400a) && p005kotlin.jvm.internal.s.g(this.f38401b, eVar.f38401b) && p005kotlin.jvm.internal.s.g(this.f38402c, eVar.f38402c) && this.f38403d == eVar.f38403d && p005kotlin.jvm.internal.s.g(this.f38404e, eVar.f38404e) && p005kotlin.jvm.internal.s.g(this.f38405f, eVar.f38405f) && p005kotlin.jvm.internal.s.g(this.f38406g, eVar.f38406g) && p005kotlin.jvm.internal.s.g(this.f38407h, eVar.f38407h) && p005kotlin.jvm.internal.s.g(this.f38408i, eVar.f38408i);
    }

    public final int hashCode() {
        String str = this.f38400a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38401b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38402c;
        int iG = q6.f.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f38403d);
        String str4 = this.f38404e;
        int iHashCode3 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f38405f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.f38406g;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f38407h;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f38408i;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ExerciseDTO(category=", this.f38400a, ", categoryTranslation=", this.f38401b, ", counterPart=");
        v.h.C(this.f38402c, ", isBodyWeight=", ", exerciseTypeKey=", sbI, this.f38403d);
        sn.a.t(sbI, this.f38404e, ", exerciseTranslation=", this.f38405f, ", primaryMuscleList=");
        n23.j.z(sbI, this.f38406g, ", secondaryMuscleList=", this.f38407h, ", equipmentList=");
        return z.c(sbI, this.f38408i, ")");
    }
}
