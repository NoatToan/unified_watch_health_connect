package com.huawei.agconnect.apms;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes22.dex */
public final class s0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return TextUtils.isDigitsOnly(str);
    }
}
