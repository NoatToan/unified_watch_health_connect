package com.mapbox.maps.extension.observable.eventdata;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/SourceRemovedEventData;", "", "begin", "", TtmlNode.END, TtmlNode.ATTR_ID, "", "(JLjava/lang/Long;Ljava/lang/String;)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(JLjava/lang/Long;Ljava/lang/String;)Lcom/mapbox/maps/extension/observable/eventdata/SourceRemovedEventData;", "equals", "", "other", "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SourceRemovedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName(TtmlNode.END)
    private final Long end;

    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    public SourceRemovedEventData(long j8, Long l14, String str) {
        str.getClass();
        this.begin = j8;
        this.end = l14;
        this.id = str;
    }

    public static /* synthetic */ SourceRemovedEventData copy$default(SourceRemovedEventData sourceRemovedEventData, long j8, Long l14, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = sourceRemovedEventData.begin;
        }
        if ((i14 & 2) != 0) {
            l14 = sourceRemovedEventData.end;
        }
        if ((i14 & 4) != 0) {
            str = sourceRemovedEventData.id;
        }
        return sourceRemovedEventData.copy(j8, l14, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final SourceRemovedEventData copy(long begin, Long end, String id3) {
        id3.getClass();
        return new SourceRemovedEventData(begin, end, id3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceRemovedEventData)) {
            return false;
        }
        SourceRemovedEventData sourceRemovedEventData = (SourceRemovedEventData) other;
        return this.begin == sourceRemovedEventData.begin && s.g(this.end, sourceRemovedEventData.end) && s.g(this.id, sourceRemovedEventData.id);
    }

    public final long getBegin() {
        return this.begin;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l14 = this.end;
        return this.id.hashCode() + ((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SourceRemovedEventData(begin=");
        sb3.append(this.begin);
        sb3.append(", end=");
        sb3.append(this.end);
        sb3.append(", id=");
        return a0.m(sb3, this.id, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
