package com.xiaomi.infra.galaxy.fds;

/* JADX INFO: loaded from: classes22.dex */
public enum FDSError {
    QuotaApplyDenied("Quota Apply Denied", 403),
    BucketAccessDenied("Bucket Access Denied", 403),
    BucketAlreadyExists("Bucket Already Exists", Common.HTTP_STATUS_CONFLICT),
    BucketNotFound("Bucket Not Found", 404),
    ObjectAccessDenied("Object Access Denied", 403),
    ObjectAlreadyExists("Object Already Exists", Common.HTTP_STATUS_CONFLICT),
    ObjectNotFound("Object Not Found", 404),
    BrokenObject("Object Data Broken", 500),
    InternalServerError("Internal Server Error", 500),
    RequestTimeout("Request Timeout", 400),
    InvalidRequest("Invalid Request", 400),
    SignatureDoesNotMatch("Signature Does Not Match", 403),
    RequestTimeTooSkewed("Request Time Too Skewed", 403),
    RequestExpired("Request Expired", 403),
    InvalidOAuthParameters("Invalid OAuth Parameters", 400),
    VerifyOAuthAccessTokenError("Verify OAuth Access Token Error", 400),
    QuotaExceeded("Quota Exceeded", 400),
    ChecksumDoesNotMatch("Checksum Does Not Match", 400),
    RequestNotSupported("Request Not Supported", Common.HTTP_STATUS_METHOD_NOT_ALLOWED),
    InvalidRequestRange("Request Out of Range", 416),
    AuthenticationFailed("Authentication Failed", 400),
    ServerTooBusy("Server Too Busy", 500),
    TooManyRequests("Too Many Requests, Try Later", 429),
    InvalidBucketName("Invalid Bucket Name", 400),
    InvalidTrashObjectName("Invalid Trash Object Name", 400),
    KerberosAuthenticationFail("kerberos authentication failed", 401),
    DomainMappingAccessDenied("Domain Mapping Access Denied", 403),
    InvalidPartNumberOrSize("Invalid Part Number or Size", 400),
    DDLDisabled("DDL is Disabled", 403),
    ConvertingMultimedia("Converting Multimedia Now", 102),
    MirrorFailed("Mirror Source Unavailable", 424),
    MultipartUploadExpired("Multipart Upload Expired", 400),
    OperationDenied("Operation Denied", 403),
    CannotSetWriteRelatedPermission("Cannot Set Write Related Permission", 403),
    UpstreamServiceError("Upstream Service Error", 502),
    Unknown("Unknown", 400),
    Success("Success", 200);

    private final String description;
    private final int status;

    FDSError(String str, int i) {
        this.description = str;
        this.status = i;
    }

    public String description() {
        return this.description;
    }

    public int status() {
        return this.status;
    }
}
