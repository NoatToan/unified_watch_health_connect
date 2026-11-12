package com.mapbox.maps.extension.observable.eventdata;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/CameraChangedEventData;", "", "begin", "", TtmlNode.END, "(JLjava/lang/Long;)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(JLjava/lang/Long;)Lcom/mapbox/maps/extension/observable/eventdata/CameraChangedEventData;", "equals", "", "other", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CameraChangedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName(TtmlNode.END)
    private final Long end;

    public CameraChangedEventData(long j8, Long l14) {
        this.begin = j8;
        this.end = l14;
    }

    public static /* synthetic */ CameraChangedEventData copy$default(CameraChangedEventData cameraChangedEventData, long j8, Long l14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = cameraChangedEventData.begin;
        }
        if ((i14 & 2) != 0) {
            l14 = cameraChangedEventData.end;
        }
        return cameraChangedEventData.copy(j8, l14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    public final CameraChangedEventData copy(long begin, Long end) {
        return new CameraChangedEventData(begin, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChangedEventData)) {
            return false;
        }
        CameraChangedEventData cameraChangedEventData = (CameraChangedEventData) other;
        return this.begin == cameraChangedEventData.begin && s.g(this.end, cameraChangedEventData.end);
    }

    public final long getBegin() {
        return this.begin;
    }

    public final Long getEnd() {
        return this.end;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l14 = this.end;
        return iHashCode + (l14 == null ? 0 : l14.hashCode());
    }

    public String toString() {
        return "CameraChangedEventData(begin=" + this.begin + ", end=" + this.end + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
