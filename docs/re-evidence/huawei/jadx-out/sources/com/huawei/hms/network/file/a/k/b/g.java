package com.huawei.hms.network.file.a.k.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.exoplayer.offline.DownloadService;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.file.api.RequestConfig;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.file.download.api.GetRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class g extends c<com.huawei.hms.network.file.core.e<GetRequest>> {
    List<com.huawei.hms.network.file.core.e<GetRequest>> c(String str) {
        return b("manager=?", new String[]{str});
    }

    String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            FLogger.i("DBDao", "encodeUrlString UnsupportedEncodingException", new Object[0]);
            return str;
        }
    }

    @Override // com.huawei.hms.network.file.a.k.b.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContentValues a(com.huawei.hms.network.file.core.e<GetRequest> eVar, String str) {
        return a2(eVar, str);
    }

    public void a(GetRequest getRequest, com.huawei.hms.network.file.core.task.e.a aVar, String str) {
        a(a2(new com.huawei.hms.network.file.core.e<>(getRequest, aVar.ordinal()), str), "requestId=? and manager=?", new String[]{String.valueOf(getRequest.getId()), str});
    }

    void a(ContentValues contentValues, String str, String str2, List<String> list) {
        byte[] bArrStr2Byte;
        if (Utils.isBlank(str2)) {
            bArrStr2Byte = null;
        } else {
            if (!Utils.isEmpty(list)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                arrayList.addAll(list);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i != 0) {
                        sb.append(";");
                    }
                    sb.append(b((String) arrayList.get(i)));
                }
                str2 = sb.toString();
            }
            bArrStr2Byte = StringUtils.str2Byte(str2);
        }
        if (bArrStr2Byte != null) {
            c.a(contentValues, str, bArrStr2Byte);
        }
    }

    void a(ContentValues contentValues, String str, Object obj) {
        if (obj != null) {
            c.a(contentValues, str, f.a(obj));
        }
    }

    public void a(long j, com.huawei.hms.network.file.core.task.e.a aVar, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        a(contentValues, "requestId=? and manager=?", new String[]{String.valueOf(j), str});
    }

    public Set<Long> a(String str, int i) {
        String str2;
        if (i >= 0) {
            str2 = "0," + i;
        } else {
            str2 = null;
        }
        return a("requestId", "manager=?", new String[]{str}, str2);
    }

    String a(String str) {
        if (!Utils.isBlank(str)) {
            try {
                return URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                FLogger.i("DBDao", "decodeUrlString UnsupportedEncodingException", new Object[0]);
            }
        }
        return str;
    }

    public String a(long j, String str) {
        com.huawei.hms.network.file.core.e<GetRequest> eVarA = a(j);
        if (eVarA == null) {
            return null;
        }
        a("requestId=? and manager=?", new String[]{String.valueOf(j), str});
        return ((GetRequest) eVarA.a()).getFilePath();
    }

    @Override // com.huawei.hms.network.file.a.k.b.c
    public String a() {
        return DownloadService.KEY_DOWNLOAD_REQUEST;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.file.a.k.b.c
    public com.huawei.hms.network.file.core.e<GetRequest> a(Cursor cursor) {
        GetRequest.Builder builder = new GetRequest.Builder();
        return new com.huawei.hms.network.file.core.e<>(builder.build(), a(cursor, builder));
    }

    com.huawei.hms.network.file.core.e<GetRequest> a(long j) {
        return c("requestId=?", new String[]{String.valueOf(j)});
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    ContentValues a2(com.huawei.hms.network.file.core.e<GetRequest> eVar, String str) {
        ContentValues contentValues = new ContentValues();
        GetRequest getRequest = (GetRequest) eVar.a();
        c.a(contentValues, "filePath", StringUtils.str2Byte(Utils.nullStrToEmpty(getRequest.getFilePath())));
        contentValues.put("fileSha256", Utils.nullStrToEmpty(getRequest.getSha256()));
        contentValues.put("fileSize", Long.valueOf(getRequest.getFileSize()));
        contentValues.put("manager", str);
        contentValues.put("name", Utils.nullStrToEmpty(getRequest.getName()));
        contentValues.put("requestId", Long.valueOf(getRequest.getId()));
        contentValues.put("startPosition", Long.valueOf(getRequest.getOffset()));
        contentValues.put("status", Integer.valueOf(eVar.b()));
        a(contentValues, "headers", getRequest.getHeaders());
        a(contentValues, com.alipay.sdk.m.s.e.n, getRequest.getParams());
        a(contentValues, "logInfos", getRequest.getReportInfos());
        a(contentValues, "configs", getRequest.getConfig());
        a(contentValues, com.huawei.hms.kit.awareness.b.a.a.f13879b, getRequest.getUrl(), getRequest.getBackupUrls());
        return contentValues;
    }

    public int a(Cursor cursor, GetRequest.Builder builder) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        builder.name(cursor.getString(cursor.getColumnIndex("name")));
        builder.fileSize(cursor.getLong(cursor.getColumnIndex("fileSize")));
        byte[] bArrA = a(cursor, "filePath");
        builder.filePath(bArrA != null ? StringUtils.byte2Str(bArrA) : "");
        builder.sha256(cursor.getString(cursor.getColumnIndex("fileSha256")));
        builder.offset(cursor.getLong(cursor.getColumnIndex("startPosition")));
        builder.id(cursor.getLong(cursor.getColumnIndex("requestId")));
        byte[] bArrA2 = a(cursor, "headers");
        if (bArrA2 != null && (objA4 = f.a(bArrA2)) != null) {
            builder.headers((Map) objA4);
        }
        byte[] bArrA3 = a(cursor, com.alipay.sdk.m.s.e.n);
        if (bArrA3 != null && (objA3 = f.a(bArrA3)) != null) {
            builder.params((Map) objA3);
        }
        byte[] bArrA4 = a(cursor, "logInfos");
        if (bArrA4 != null && (objA2 = f.a(bArrA4)) != null) {
            builder.reportInfos((Map) objA2);
        }
        byte[] bArrA5 = a(cursor, "configs");
        if (bArrA5 != null && (objA = f.a(bArrA5)) != null) {
            builder.config((RequestConfig) objA);
        }
        byte[] bArrA6 = a(cursor, com.huawei.hms.kit.awareness.b.a.a.f13879b);
        if (bArrA6 != null) {
            String strByte2Str = StringUtils.byte2Str(bArrA6);
            if (!Utils.isBlank(strByte2Str)) {
                if (strByte2Str.contains(";")) {
                    String[] strArrSplit = strByte2Str.split(";");
                    if (strArrSplit.length > 0) {
                        builder.url(a(strArrSplit[0]));
                        ArrayList arrayList = new ArrayList();
                        if (strArrSplit.length > 1) {
                            for (int i = 1; i < strArrSplit.length; i++) {
                                arrayList.add(a(strArrSplit[i]));
                            }
                        }
                        builder.backupUrls(arrayList);
                    }
                } else {
                    builder.url(strByte2Str);
                }
            }
        }
        return cursor.getInt(cursor.getColumnIndex("status"));
    }

    public g(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }
}
