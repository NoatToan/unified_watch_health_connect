package com.xiaomi.infra.galaxy.fds.model;

import com.google.common.collect.LinkedListMultimap;
import com.xiaomi.infra.galaxy.fds.Common;
import com.xiaomi.infra.galaxy.fds.auth.signature.Utils;
import com.xmlywind.sdk.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class FDSObjectMetadata {
    public static final String AMZ_USER_DEFINED_META_PREFIX = "x-amz-meta-";
    public static final String USER_DEFINED_META_PREFIX = "x-xiaomi-meta-";
    private static final SimpleDateFormat b = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
    private final Map<String, String> a = new HashMap();

    public enum PredefinedMetadata {
        CacheControl(Common.CACHE_CONTROL),
        ContentEncoding(Common.CONTENT_ENCODING),
        ContentLength(Common.CONTENT_LENGTH),
        ContentRange(Common.CONTENT_RANGE),
        LastModified(Common.LAST_MODIFIED),
        ContentMD5(Common.CONTENT_MD5),
        ContentType("content-type"),
        LastChecked(Common.LAST_CHECKED),
        UploadTime(Common.UPLOAD_TIME),
        ExpirationTime(Common.EXPIRATION_TIME),
        ObjectOwnerId(Common.OBJECT_OWNER_ID),
        FileMode(Common.FILE_MODE),
        MultipartUploadMode(Common.MULITPART_UPLOAD_MODE),
        PreviousVersionId(Common.PREVIOUS_VERSION_ID),
        ServerSideEncryption(Common.SERVER_SIDE_ENCRYPTION),
        StorageClass("x-xiaomi-storage-class"),
        OngoingRestore(Common.ONGOING_RESTORE),
        RestoreExpiryDate(Common.RESTORE_EXPIRY_DATE),
        ETag("ETag"),
        Crc64Ecma(Common.CRC64_ECMA);

        private final String header;

        PredefinedMetadata(String str) {
            this.header = str;
        }

        public String getHeader() {
            return this.header;
        }
    }

    private static void a(String str) {
        boolean zStartsWith = str.startsWith("x-xiaomi-meta-");
        if (!zStartsWith) {
            for (PredefinedMetadata predefinedMetadata : PredefinedMetadata.values()) {
                if (str.equals(predefinedMetadata.getHeader())) {
                    zStartsWith = true;
                    break;
                }
            }
        }
        if (zStartsWith) {
            return;
        }
        throw new RuntimeException("Invalid metadata: " + str, null);
    }

    private static String b(Date date) {
        String str;
        SimpleDateFormat simpleDateFormat = b;
        synchronized (simpleDateFormat) {
            str = simpleDateFormat.format(date);
        }
        return str;
    }

    private static String c(String str) {
        return "x-xiaomi-meta-" + str.substring(11);
    }

    private static Date e(String str) {
        Date date;
        SimpleDateFormat simpleDateFormat = b;
        synchronized (simpleDateFormat) {
            try {
                try {
                    date = simpleDateFormat.parse(str);
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return date;
    }

    public static FDSObjectMetadata parseObjectMetadata(LinkedListMultimap<String, String> linkedListMultimap) {
        FDSObjectMetadata fDSObjectMetadata = new FDSObjectMetadata();
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : linkedListMultimap.entries()) {
            String lowerCase = entry.getKey().toLowerCase();
            String value = entry.getValue();
            if (!map.containsKey(lowerCase)) {
                map.put(lowerCase, value);
                if (lowerCase.startsWith("x-xiaomi-meta-")) {
                    fDSObjectMetadata.addHeader(lowerCase, value);
                } else if (lowerCase.startsWith("x-amz-meta-")) {
                    fDSObjectMetadata.addHeader(c(lowerCase), value);
                }
            }
        }
        for (PredefinedMetadata predefinedMetadata : PredefinedMetadata.values()) {
            String str = (String) map.get(predefinedMetadata.getHeader());
            if (str != null && !str.isEmpty()) {
                fDSObjectMetadata.addHeader(predefinedMetadata.getHeader(), str);
            }
        }
        return fDSObjectMetadata;
    }

    public void addHeader(String str, String str2) {
        a(str);
        this.a.put(str, str2);
    }

    public void addUserMetadata(String str, String str2) {
        a(str);
        this.a.put(str, str2);
    }

    public String d(String str) {
        return this.a.get(str.toLowerCase());
    }

    public String getCacheControl() {
        return this.a.get(Common.CACHE_CONTROL);
    }

    public String getContentEncoding() {
        return this.a.get(Common.CONTENT_ENCODING);
    }

    public long getContentLength() {
        String str = this.a.get(Common.CONTENT_LENGTH);
        if (str != null) {
            return Long.parseLong(str);
        }
        return -1L;
    }

    public String getContentMD5() {
        return this.a.get(Common.CONTENT_MD5);
    }

    public String getContentRange() {
        return this.a.get(Common.CONTENT_RANGE);
    }

    public String getContentType() {
        return this.a.get("content-type");
    }

    public String getLastChecked() {
        return this.a.get(Common.LAST_CHECKED);
    }

    public Date getLastModified() {
        String str = this.a.get(Common.LAST_MODIFIED);
        if (str != null) {
            return Utils.parseDateTimeFromString(str);
        }
        return null;
    }

    public String getMultipartUploadMode() {
        return this.a.get(Common.MULITPART_UPLOAD_MODE);
    }

    public String getObjectOwnerId() {
        return this.a.get(Common.OBJECT_OWNER_ID);
    }

    public String getPreviousVersionId() {
        return this.a.get(Common.PREVIOUS_VERSION_ID);
    }

    public Map<String, String> getRawMetadata() {
        return Collections.unmodifiableMap(this.a);
    }

    public Boolean getRestoreArchiveStatus() {
        String str = this.a.get(Common.ONGOING_RESTORE);
        if (str != null) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        return null;
    }

    public Date getRestoreExpiryDate() {
        String str = this.a.get(Common.RESTORE_EXPIRY_DATE);
        if (str != null) {
            return e(str);
        }
        return null;
    }

    public String getSSEAlgorithm() {
        return this.a.get(Common.SERVER_SIDE_ENCRYPTION);
    }

    public StorageClass getStorageClass() {
        String str = this.a.get("x-xiaomi-storage-class");
        if (str == null || str.isEmpty()) {
            return null;
        }
        return StorageClass.fromValue(str);
    }

    public void removeHeader(String str) {
        if (this.a.containsKey(str)) {
            this.a.remove(str);
        }
    }

    public void setCacheControl(String str) {
        this.a.put(Common.CACHE_CONTROL, str);
    }

    public void setContentEncoding(String str) {
        this.a.put(Common.CONTENT_ENCODING, str);
    }

    public void setContentLength(long j) {
        this.a.put(Common.CONTENT_LENGTH, Long.toString(j));
    }

    public void setContentMD5(String str) {
        this.a.put(Common.CONTENT_MD5, str);
    }

    public void setContentRange(long j, long j2, long j3) {
        this.a.put(Common.CONTENT_RANGE, Constants.CONTENT_RANGE_PARAMS + j + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + j2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + j3);
    }

    public void setContentType(String str) {
        this.a.put("content-type", str);
    }

    public void setLastChecked(String str) {
        this.a.put(Common.LAST_CHECKED, str);
    }

    public void setLastModified(Date date) {
        this.a.put(Common.LAST_MODIFIED, Utils.getGMTDatetime(date));
    }

    public void setMultipartUploadMode(String str) {
        this.a.put(Common.MULITPART_UPLOAD_MODE, str);
    }

    public void setObjectOwnerId(String str) {
        this.a.put(Common.OBJECT_OWNER_ID, str);
    }

    public void setOngoingRestore(Boolean bool) {
        if (bool != null) {
            this.a.put(Common.ONGOING_RESTORE, Boolean.toString(bool.booleanValue()).toLowerCase());
        } else {
            this.a.remove(Common.ONGOING_RESTORE);
        }
    }

    public void setPreviousVersionId(String str) {
        this.a.put(Common.PREVIOUS_VERSION_ID, str);
    }

    public void setRestoreExpiryDate(Date date) {
        if (date != null) {
            this.a.put(Common.RESTORE_EXPIRY_DATE, b(date));
        } else {
            this.a.remove(Common.RESTORE_EXPIRY_DATE);
        }
    }

    public void setSSEAlgorithm(String str) {
        this.a.put(Common.SERVER_SIDE_ENCRYPTION, str);
    }

    public void setStorageClass(StorageClass storageClass) {
        if (storageClass != null) {
            this.a.put("x-xiaomi-storage-class", storageClass.toString());
        } else {
            this.a.remove("x-xiaomi-storage-class");
        }
    }

    public void setUserMetadata(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey());
            this.a.put(entry.getKey(), entry.getValue());
        }
    }

    public void switchToAMZMetaKey() {
        HashSet<String> hashSet = new HashSet();
        for (String str : this.a.keySet()) {
            if (str.startsWith("x-xiaomi-")) {
                hashSet.add(str);
            }
        }
        for (String str2 : hashSet) {
            String str3 = Common.AMZ_HEADER_PREFIX + str2.substring(9);
            Map<String, String> map = this.a;
            map.put(str3, map.remove(str2));
        }
    }
}
