package com.xiaomi.infra.galaxy.fds.result;

import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class CopyObjectResult extends PutObjectResult {
    public CopyObjectResult fromPutObjectResult(PutObjectResult putObjectResult) {
        setBucketName(putObjectResult.getBucketName());
        setAccessKeyId(putObjectResult.getAccessKeyId());
        setExpires(putObjectResult.getExpires());
        setObjectName(putObjectResult.getObjectName());
        setOutsideAccess(putObjectResult.getOutsideAccess());
        setPreviousVersionId(putObjectResult.getPreviousVersionId());
        setSignature(putObjectResult.getSignature());
        setSSEAlgorithm(putObjectResult.getSSEAlgorithm());
        return this;
    }

    @Override // com.xiaomi.infra.galaxy.fds.result.PutObjectResult
    public String toString() {
        return "CopyObjectResult{bucketName='" + getBucketName() + "', objectName='" + getObjectName() + "', accessKeyId='" + getAccessKeyId() + "', signature='" + getSignature() + "', previousVersionId='" + getPreviousVersionId() + "', expires=" + getExpires() + ", outsideAccess=" + getOutsideAccess() + '}';
    }
}
