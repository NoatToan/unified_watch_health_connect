package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestInfo implements Serializable {
    private final List<RequestLoadingMethodType> loadingMethod;
    private final RequestPriorityType priority;
    private final RequestResourceType resource;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RequestInfo(String str, RequestResourceType requestResourceType, RequestPriorityType requestPriorityType, List<RequestLoadingMethodType> list) {
        this.url = str;
        this.resource = requestResourceType;
        this.priority = requestPriorityType;
        this.loadingMethod = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestInfo.class != obj.getClass()) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) obj;
        return Objects.equals(this.url, requestInfo.url) && Objects.equals(this.resource, requestInfo.resource) && Objects.equals(this.priority, requestInfo.priority) && Objects.equals(this.loadingMethod, requestInfo.loadingMethod);
    }

    public List<RequestLoadingMethodType> getLoadingMethod() {
        return this.loadingMethod;
    }

    public RequestPriorityType getPriority() {
        return this.priority;
    }

    public RequestResourceType getResource() {
        return this.resource;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.resource, this.priority, this.loadingMethod);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[url: ");
        com.google.protobuf.a.k(this.url, ", resource: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.resource));
        sb3.append(", priority: ");
        sb3.append(RecordUtils.fieldToString(this.priority));
        sb3.append(", loadingMethod: ");
        sb3.append(RecordUtils.fieldToString(this.loadingMethod));
        sb3.append("]");
        return sb3.toString();
    }
}
