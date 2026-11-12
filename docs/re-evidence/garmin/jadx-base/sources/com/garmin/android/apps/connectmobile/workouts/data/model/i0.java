package com.garmin.android.apps.connectmobile.workouts.data.model;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/i0;", "", "", "sportTypeId", "", "sportTypeKey", "displayOrder", "<init>", "(ILjava/lang/String;I)V", "a", "I", "getSportTypeId", "()I", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypeId")
    private final int sportTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypeKey")
    private final String sportTypeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayOrder")
    private final int displayOrder;

    public i0(int i14, String str, int i15) {
        str.getClass();
        this.sportTypeId = i14;
        this.sportTypeKey = str;
        this.displayOrder = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final m52.k b() {
        m52.k.a aVar = m52.k.f116753m;
        String str = this.sportTypeKey;
        aVar.getClass();
        return m52.k.a.c(str);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSportTypeKey() {
        return this.sportTypeKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.sportTypeId == i0Var.sportTypeId && p005kotlin.jvm.internal.s.g(this.sportTypeKey, i0Var.sportTypeKey) && this.displayOrder == i0Var.displayOrder;
    }

    public final int hashCode() {
        return Integer.hashCode(this.displayOrder) + wr.g.j(Integer.hashCode(this.sportTypeId) * 31, 31, this.sportTypeKey);
    }

    public final String toString() {
        int i14 = this.sportTypeId;
        String str = this.sportTypeKey;
        return am.j.q(wr.g.r(i14, "WorkoutSportTypeDTO(sportTypeId=", ", sportTypeKey=", str, ", displayOrder="), this.displayOrder, ")");
    }
}
