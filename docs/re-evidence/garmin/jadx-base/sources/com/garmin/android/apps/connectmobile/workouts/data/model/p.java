package com.garmin.android.apps.connectmobile.workouts.data.model;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/p;", "", "", "title", "levels", "imageUrl", NotificationConstants.KEY_DATA_MIME_TYPE, "goal", "muscles", "", "durationInMinute", "equipment", "", "showKeyFeatures", "", "primaryMuscles", "sportTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<String> f48293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<String> f48294k;

    public p(String str, String str2, String str3, String str4, String str5, String str6, int i14, String str7, boolean z14, List<String> list, List<String> list2) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        this.f48284a = str;
        this.f48285b = str2;
        this.f48286c = str3;
        this.f48287d = str4;
        this.f48288e = str5;
        this.f48289f = str6;
        this.f48290g = i14;
        this.f48291h = str7;
        this.f48292i = z14;
        this.f48293j = list;
        this.f48294k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f48284a, pVar.f48284a) && p005kotlin.jvm.internal.s.g(this.f48285b, pVar.f48285b) && p005kotlin.jvm.internal.s.g(this.f48286c, pVar.f48286c) && p005kotlin.jvm.internal.s.g(this.f48287d, pVar.f48287d) && p005kotlin.jvm.internal.s.g(this.f48288e, pVar.f48288e) && p005kotlin.jvm.internal.s.g(this.f48289f, pVar.f48289f) && this.f48290g == pVar.f48290g && p005kotlin.jvm.internal.s.g(this.f48291h, pVar.f48291h) && this.f48292i == pVar.f48292i && p005kotlin.jvm.internal.s.g(this.f48293j, pVar.f48293j) && p005kotlin.jvm.internal.s.g(this.f48294k, pVar.f48294k);
    }

    public final int hashCode() {
        int iHashCode = this.f48284a.hashCode() * 31;
        String str = this.f48285b;
        int iJ = wr.g.j(wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f48286c), 31, this.f48287d);
        String str2 = this.f48288e;
        int iHashCode2 = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48289f;
        int iD = q2.d(this.f48290g, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f48291h;
        int iG = q6.f.g((iD + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f48292i);
        List<String> list = this.f48293j;
        int iHashCode3 = (iG + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f48294k;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("MSNWorkoutHeaderItem(title=", this.f48284a, ", levels=", this.f48285b, ", imageUrl=");
        sn.a.t(sbI, this.f48286c, ", type=", this.f48287d, ", goal=");
        sn.a.t(sbI, this.f48288e, ", muscles=", this.f48289f, ", durationInMinute=");
        wr.g.t(this.f48290g, ", equipment=", this.f48291h, ", showKeyFeatures=", sbI);
        sbI.append(this.f48292i);
        sbI.append(", primaryMuscles=");
        sbI.append(this.f48293j);
        sbI.append(", sportTypes=");
        return u62.z.c(sbI, this.f48294k, ")");
    }

    public /* synthetic */ p(String str, String str2, String str3, String str4, String str5, String str6, int i14, String str7, boolean z14, List list, List list2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, str5, str6, i14, str7, z14, (i15 & 512) != 0 ? null : list, (i15 & 1024) != 0 ? null : list2);
    }
}
