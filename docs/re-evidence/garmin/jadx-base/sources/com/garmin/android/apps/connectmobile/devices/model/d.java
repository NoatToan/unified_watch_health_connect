package com.garmin.android.apps.connectmobile.devices.model;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/d;", "", "", "success", "Lcom/garmin/android/apps/connectmobile/devices/model/e;", "result", "<init>", "(ZLcom/garmin/android/apps/connectmobile/devices/model/e;)V", "a", "Z", "getSuccess", "()Z", "b", "Lcom/garmin/android/apps/connectmobile/devices/model/e;", "()Lcom/garmin/android/apps/connectmobile/devices/model/e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("success")
    private final boolean success;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("result")
    private final e result;

    public d(boolean z14, e eVar) {
        this.success = z14;
        this.result = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getResult() {
        return this.result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.success == dVar.success && p005kotlin.jvm.internal.s.g(this.result, dVar.result);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        e eVar = this.result;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "CrossSellDTO(success=" + this.success + ", result=" + this.result + ")";
    }
}
