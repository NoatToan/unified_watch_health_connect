package com.mapbox.common.http_backend;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.ReadStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseData implements Serializable {
    private final int code;
    private final ReadStream dataStream;
    private final HashMap<String, String> headers;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResponseData(HashMap<String, String> map, int i14, ReadStream readStream) {
        this.headers = map;
        this.code = i14;
        this.dataStream = readStream;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseData responseData = (ResponseData) obj;
        return Objects.equals(this.headers, responseData.headers) && this.code == responseData.code && Objects.equals(this.dataStream, responseData.dataStream);
    }

    public int getCode() {
        return this.code;
    }

    public ReadStream getDataStream() {
        return this.dataStream;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return Objects.hash(this.headers, Integer.valueOf(this.code), this.dataStream);
    }

    public String toString() {
        return "[headers: " + RecordUtils.fieldToString(this.headers) + ", code: " + RecordUtils.fieldToString(Integer.valueOf(this.code)) + ", dataStream: " + RecordUtils.fieldToString(this.dataStream) + "]";
    }
}
