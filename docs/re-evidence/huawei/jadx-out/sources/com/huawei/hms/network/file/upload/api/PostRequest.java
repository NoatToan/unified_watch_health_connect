package com.huawei.hms.network.file.upload.api;

import com.huawei.hms.network.file.api.Request;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class PostRequest extends BodyRequest {

    /* JADX INFO: loaded from: classes34.dex */
    public static final class Builder extends BodyRequest.Builder<Builder> {
        @Override // com.huawei.hms.network.file.upload.api.BodyRequest.Builder
        public Builder fileParams(String str, FileEntity... fileEntityArr) {
            return (Builder) super.fileParams(str, fileEntityArr);
        }

        @Override // com.huawei.hms.network.file.upload.api.BodyRequest.Builder
        public Builder fileParams(String str, List<FileEntity> list) {
            return (Builder) super.fileParams(str, list);
        }

        @Override // com.huawei.hms.network.file.upload.api.BodyRequest.Builder
        public /* bridge */ /* synthetic */ Request.Builder fileParams(String str, List list) {
            return fileParams(str, (List<FileEntity>) list);
        }

        @Override // com.huawei.hms.network.file.api.Request.Builder
        public PostRequest build() {
            return new PostRequest(this);
        }

        public Builder(PostRequest postRequest) {
            super(postRequest);
        }

        public Builder() {
        }
    }

    @Override // com.huawei.hms.network.file.api.Request
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // com.huawei.hms.network.file.upload.api.BodyRequest
    public Map<String, List<FileEntity>> getFileEntityMap() {
        return super.getFileEntityMap();
    }

    PostRequest(Builder builder) {
        super(builder);
    }
}
