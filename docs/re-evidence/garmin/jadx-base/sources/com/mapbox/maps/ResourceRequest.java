package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ResourceRequest implements Serializable {
    private final boolean cancelled;
    private final RequestInfo request;
    private final ResponseInfo response;
    private final RequestDataSourceType source;
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResourceRequest(RequestDataSourceType requestDataSourceType, RequestInfo requestInfo, ResponseInfo responseInfo, boolean z14, EventTimeInterval eventTimeInterval) {
        this.source = requestDataSourceType;
        this.request = requestInfo;
        this.response = responseInfo;
        this.cancelled = z14;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequest.class != obj.getClass()) {
            return false;
        }
        ResourceRequest resourceRequest = (ResourceRequest) obj;
        return Objects.equals(this.source, resourceRequest.source) && Objects.equals(this.request, resourceRequest.request) && Objects.equals(this.response, resourceRequest.response) && this.cancelled == resourceRequest.cancelled && Objects.equals(this.timeInterval, resourceRequest.timeInterval);
    }

    public boolean getCancelled() {
        return this.cancelled;
    }

    public RequestInfo getRequest() {
        return this.request;
    }

    public ResponseInfo getResponse() {
        return this.response;
    }

    public RequestDataSourceType getSource() {
        return this.source;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.source, this.request, this.response, Boolean.valueOf(this.cancelled), this.timeInterval);
    }

    public String toString() {
        return "[source: " + RecordUtils.fieldToString(this.source) + ", request: " + RecordUtils.fieldToString(this.request) + ", response: " + RecordUtils.fieldToString(this.response) + ", cancelled: " + RecordUtils.fieldToString(Boolean.valueOf(this.cancelled)) + ", timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + "]";
    }
}
