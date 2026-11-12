package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/n0;", "", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/x;", "lapDTOs", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "getLapDTOs", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lapDTOs")
    private final List<x> lapDTOs;

    public /* synthetic */ n0(List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && p005kotlin.jvm.internal.s.g(this.lapDTOs, ((n0) obj).lapDTOs);
    }

    public final int hashCode() {
        List<x> list = this.lapDTOs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("UpdateLapIntensityDTO(lapDTOs=", ")", this.lapDTOs);
    }

    public n0(List<x> list) {
        this.lapDTOs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
