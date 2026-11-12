package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15557a = "FileRecordManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w2 f15558b = new w2();

    public void saveToLocalFile(String str) {
    }

    public String getDate() {
        String str = new SimpleDateFormat("yyyy-MM-dd&&HH:mm:ss:SSSS", Locale.ENGLISH).format(new Date());
        Logger.v(f15557a, "the time is : %s", str);
        return str;
    }

    public static w2 getInstance() {
        return f15558b;
    }
}
