package com.huawei.hms.update.download;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes34.dex */
class DownloadRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16689c;
    private int d;

    private void a(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0).edit();
        editorEdit.putString("mUri", this.f16687a);
        editorEdit.putInt("mSize", this.f16688b);
        editorEdit.putString("mHash", this.f16689c);
        editorEdit.putInt("mReceived", this.d);
        editorEdit.commit();
    }

    public int getSize() {
        return this.f16688b;
    }

    public void init(String str, int i, String str2) {
        this.f16687a = str;
        this.f16688b = i;
        this.f16689c = str2;
        this.d = 0;
    }

    public boolean isValid(String str, int i, String str2) {
        String str3;
        String str4 = this.f16687a;
        return str4 != null && str4.equals(str) && this.f16688b == i && (str3 = this.f16689c) != null && str3.equals(str2) && this.d <= this.f16688b;
    }

    public void load(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0);
        this.f16687a = sharedPreferences.getString("mUri", "");
        this.f16688b = sharedPreferences.getInt("mSize", 0);
        this.f16689c = sharedPreferences.getString("mHash", "");
        this.d = sharedPreferences.getInt("mReceived", 0);
    }

    public void update(Context context, int i, String str) {
        this.d = i;
        a(context, str);
    }

    int a() {
        return this.d;
    }

    DownloadRecord() {
    }
}
