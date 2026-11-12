package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface fz {
    ContentRecord a(ContentRecord contentRecord, int i, long j);

    ContentRecord a(String str);

    ContentRecord a(String str, int i, long j, int i2);

    @Deprecated
    ContentRecord a(String str, String str2);

    ContentRecord a(String str, String str2, String str3);

    ContentRecord a(String str, String str2, String str3, String str4);

    List<ContentRecord> a(int i);

    void a(ContentRecord contentRecord);

    void a(ContentRecord contentRecord, String str);

    void a(ContentRecord contentRecord, List<String> list, String str);

    void a(String str, long j);

    void a(List<ContentRecord> list);

    List<ContentRecord> b(String str);

    List<ContentRecord> b(String str, int i, long j, int i2);

    void b();

    void b(ContentRecord contentRecord);

    void b(ContentRecord contentRecord, List<String> list);

    void b(ContentRecord contentRecord, List<String> list, String str);

    void b(String str, String str2, String str3);

    @Deprecated
    ContentRecord c(String str, String str2, String str3);

    List<ContentRecord> c();

    void c(ContentRecord contentRecord);

    void c(String str);

    long d(String str);

    void d(ContentRecord contentRecord, List<String> list);
}
