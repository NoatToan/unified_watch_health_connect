package com.mapbox.maps.extension.observable.eventdata;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.SourceDataType;
import com.mapbox.maps.extension.observable.model.TileID;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/SourceDataLoadedEventData;", "", "begin", "", TtmlNode.END, TtmlNode.ATTR_ID, "", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/maps/extension/observable/model/SourceDataType;", "loaded", "", "tileID", "Lcom/mapbox/maps/extension/observable/model/TileID;", "(JLjava/lang/Long;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/SourceDataType;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/observable/model/TileID;)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "getLoaded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTileID", "()Lcom/mapbox/maps/extension/observable/model/TileID;", "getType", "()Lcom/mapbox/maps/extension/observable/model/SourceDataType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/SourceDataType;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/observable/model/TileID;)Lcom/mapbox/maps/extension/observable/eventdata/SourceDataLoadedEventData;", "equals", "other", "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SourceDataLoadedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName(TtmlNode.END)
    private final Long end;

    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    @SerializedName("loaded")
    private final Boolean loaded;

    @SerializedName("tile-id")
    private final TileID tileID;

    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final SourceDataType type;

    public SourceDataLoadedEventData(long j8, Long l14, String str, SourceDataType sourceDataType, Boolean bool, TileID tileID) {
        str.getClass();
        sourceDataType.getClass();
        this.begin = j8;
        this.end = l14;
        this.id = str;
        this.type = sourceDataType;
        this.loaded = bool;
        this.tileID = tileID;
    }

    public static /* synthetic */ SourceDataLoadedEventData copy$default(SourceDataLoadedEventData sourceDataLoadedEventData, long j8, Long l14, String str, SourceDataType sourceDataType, Boolean bool, TileID tileID, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = sourceDataLoadedEventData.begin;
        }
        long j14 = j8;
        if ((i14 & 2) != 0) {
            l14 = sourceDataLoadedEventData.end;
        }
        Long l15 = l14;
        if ((i14 & 4) != 0) {
            str = sourceDataLoadedEventData.id;
        }
        String str2 = str;
        if ((i14 & 8) != 0) {
            sourceDataType = sourceDataLoadedEventData.type;
        }
        SourceDataType sourceDataType2 = sourceDataType;
        if ((i14 & 16) != 0) {
            bool = sourceDataLoadedEventData.loaded;
        }
        Boolean bool2 = bool;
        if ((i14 & 32) != 0) {
            tileID = sourceDataLoadedEventData.tileID;
        }
        return sourceDataLoadedEventData.copy(j14, l15, str2, sourceDataType2, bool2, tileID);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SourceDataType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLoaded() {
        return this.loaded;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TileID getTileID() {
        return this.tileID;
    }

    public final SourceDataLoadedEventData copy(long begin, Long end, String id3, SourceDataType type, Boolean loaded, TileID tileID) {
        id3.getClass();
        type.getClass();
        return new SourceDataLoadedEventData(begin, end, id3, type, loaded, tileID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceDataLoadedEventData)) {
            return false;
        }
        SourceDataLoadedEventData sourceDataLoadedEventData = (SourceDataLoadedEventData) other;
        return this.begin == sourceDataLoadedEventData.begin && s.g(this.end, sourceDataLoadedEventData.end) && s.g(this.id, sourceDataLoadedEventData.id) && this.type == sourceDataLoadedEventData.type && s.g(this.loaded, sourceDataLoadedEventData.loaded) && s.g(this.tileID, sourceDataLoadedEventData.tileID);
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

    public final Boolean getLoaded() {
        return this.loaded;
    }

    public final TileID getTileID() {
        return this.tileID;
    }

    public final SourceDataType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l14 = this.end;
        int iHashCode2 = (this.type.hashCode() + g.j((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.id)) * 31;
        Boolean bool = this.loaded;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        TileID tileID = this.tileID;
        return iHashCode3 + (tileID != null ? tileID.hashCode() : 0);
    }

    public String toString() {
        return "SourceDataLoadedEventData(begin=" + this.begin + ", end=" + this.end + ", id=" + this.id + ", type=" + this.type + ", loaded=" + this.loaded + ", tileID=" + this.tileID + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
