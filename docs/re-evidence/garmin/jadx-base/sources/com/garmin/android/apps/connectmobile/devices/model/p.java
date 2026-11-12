package com.garmin.android.apps.connectmobile.devices.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/p;", "", "", "", "fitProductNumbers", "partNumbers", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "getFitProductNumbers", "()Ljava/util/List;", "b", "getPartNumbers", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitProductNumbers")
    private final List<Long> fitProductNumbers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("partNumbers")
    private final List<Long> partNumbers;

    public p(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.fitProductNumbers, pVar.fitProductNumbers) && p005kotlin.jvm.internal.s.g(this.partNumbers, pVar.partNumbers);
    }

    public final int hashCode() {
        return this.partNumbers.hashCode() + (this.fitProductNumbers.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("DeviceSearchDTO(fitProductNumbers=", ", partNumbers=", ")", this.fitProductNumbers, this.partNumbers);
    }

    public p(List<Long> list, List<Long> list2) {
        list.getClass();
        list2.getClass();
        this.fitProductNumbers = list;
        this.partNumbers = list2;
    }

    public p() {
        this(null, null, 3, null);
    }
}
