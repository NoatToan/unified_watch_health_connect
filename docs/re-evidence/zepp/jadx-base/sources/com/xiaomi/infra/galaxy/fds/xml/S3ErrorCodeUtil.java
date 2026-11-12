package com.xiaomi.infra.galaxy.fds.xml;

import com.xiaomi.infra.galaxy.fds.FDSError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class S3ErrorCodeUtil {
    private static Map<FDSError, S3ErrorCode> a = new HashMap();

    static {
        registerErrorCodeMapping(FDSError.ObjectNotFound, S3ErrorCode.NoSuchKey);
        registerErrorCodeMapping(FDSError.BucketNotFound, S3ErrorCode.NoSuchBucket);
        FDSError fDSError = FDSError.ObjectAccessDenied;
        S3ErrorCode s3ErrorCode = S3ErrorCode.AccessDenied;
        registerErrorCodeMapping(fDSError, s3ErrorCode);
        registerErrorCodeMapping(FDSError.BucketAccessDenied, s3ErrorCode);
        registerErrorCodeMapping(FDSError.ChecksumDoesNotMatch, S3ErrorCode.BadDigest);
        registerErrorCodeMapping(FDSError.BucketAlreadyExists, S3ErrorCode.BucketAlreadyExists);
    }

    public static S3Error getS3Error(FDSError fDSError, String str, String str2) {
        S3ErrorCode s3ErrorCode = getS3ErrorCode(fDSError);
        return s3ErrorCode != null ? new S3Error(s3ErrorCode.name(), s3ErrorCode.getDescription(), str2) : new S3Error(fDSError.description(), str, str2);
    }

    public static S3ErrorCode getS3ErrorCode(FDSError fDSError) {
        return a.get(fDSError);
    }

    public static void registerErrorCodeMapping(FDSError fDSError, S3ErrorCode s3ErrorCode) {
        a.put(fDSError, s3ErrorCode);
    }
}
