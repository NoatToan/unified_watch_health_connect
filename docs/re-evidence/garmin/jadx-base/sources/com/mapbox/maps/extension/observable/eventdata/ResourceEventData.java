package com.mapbox.maps.extension.observable.eventdata;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.DataSourceType;
import com.mapbox.maps.extension.observable.model.Request;
import com.mapbox.maps.extension.observable.model.Response;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/ResourceEventData;", "", "begin", "", TtmlNode.END, "dataSource", "Lcom/mapbox/maps/extension/observable/model/DataSourceType;", "request", "Lcom/mapbox/maps/extension/observable/model/Request;", "response", "Lcom/mapbox/maps/extension/observable/model/Response;", "cancelled", "", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/DataSourceType;Lcom/mapbox/maps/extension/observable/model/Request;Lcom/mapbox/maps/extension/observable/model/Response;Z)V", "getBegin", "()J", "getCancelled", "()Z", "getDataSource", "()Lcom/mapbox/maps/extension/observable/model/DataSourceType;", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRequest", "()Lcom/mapbox/maps/extension/observable/model/Request;", "getResponse", "()Lcom/mapbox/maps/extension/observable/model/Response;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/DataSourceType;Lcom/mapbox/maps/extension/observable/model/Request;Lcom/mapbox/maps/extension/observable/model/Response;Z)Lcom/mapbox/maps/extension/observable/eventdata/ResourceEventData;", "equals", "other", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ResourceEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("cancelled")
    private final boolean cancelled;

    @SerializedName("data-source")
    private final DataSourceType dataSource;

    @SerializedName(TtmlNode.END)
    private final Long end;

    @SerializedName("request")
    private final Request request;

    @SerializedName("response")
    private final Response response;

    public ResourceEventData(long j8, Long l14, DataSourceType dataSourceType, Request request, Response response, boolean z14) {
        dataSourceType.getClass();
        request.getClass();
        this.begin = j8;
        this.end = l14;
        this.dataSource = dataSourceType;
        this.request = request;
        this.response = response;
        this.cancelled = z14;
    }

    public static /* synthetic */ ResourceEventData copy$default(ResourceEventData resourceEventData, long j8, Long l14, DataSourceType dataSourceType, Request request, Response response, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = resourceEventData.begin;
        }
        long j14 = j8;
        if ((i14 & 2) != 0) {
            l14 = resourceEventData.end;
        }
        Long l15 = l14;
        if ((i14 & 4) != 0) {
            dataSourceType = resourceEventData.dataSource;
        }
        DataSourceType dataSourceType2 = dataSourceType;
        if ((i14 & 8) != 0) {
            request = resourceEventData.request;
        }
        Request request2 = request;
        if ((i14 & 16) != 0) {
            response = resourceEventData.response;
        }
        Response response2 = response;
        if ((i14 & 32) != 0) {
            z14 = resourceEventData.cancelled;
        }
        return resourceEventData.copy(j14, l15, dataSourceType2, request2, response2, z14);
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
    public final DataSourceType getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final ResourceEventData copy(long begin, Long end, DataSourceType dataSource, Request request, Response response, boolean cancelled) {
        dataSource.getClass();
        request.getClass();
        return new ResourceEventData(begin, end, dataSource, request, response, cancelled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceEventData)) {
            return false;
        }
        ResourceEventData resourceEventData = (ResourceEventData) other;
        return this.begin == resourceEventData.begin && s.g(this.end, resourceEventData.end) && this.dataSource == resourceEventData.dataSource && s.g(this.request, resourceEventData.request) && s.g(this.response, resourceEventData.response) && this.cancelled == resourceEventData.cancelled;
    }

    public final long getBegin() {
        return this.begin;
    }

    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final DataSourceType getDataSource() {
        return this.dataSource;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final Response getResponse() {
        return this.response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.begin) * 31;
        Long l14 = this.end;
        int iHashCode2 = (this.request.hashCode() + ((this.dataSource.hashCode() + ((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31)) * 31;
        Response response = this.response;
        int iHashCode3 = (iHashCode2 + (response != null ? response.hashCode() : 0)) * 31;
        boolean z14 = this.cancelled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return iHashCode3 + r14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ResourceEventData(begin=");
        sb3.append(this.begin);
        sb3.append(", end=");
        sb3.append(this.end);
        sb3.append(", dataSource=");
        sb3.append(this.dataSource);
        sb3.append(", request=");
        sb3.append(this.request);
        sb3.append(", response=");
        sb3.append(this.response);
        sb3.append(", cancelled=");
        return j.t(sb3, this.cancelled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
