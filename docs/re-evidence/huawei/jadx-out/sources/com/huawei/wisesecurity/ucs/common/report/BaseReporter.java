package com.huawei.wisesecurity.ucs.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.wisesecurity.kfs.log.ILogKfs;
import defpackage.yog;
import defpackage.yqi;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseReporter {
    private static final String TAG = "BaseReporter";
    public String haUrl;
    public ReportOption option;

    public abstract String getLogTag();

    public abstract String getReporterTag();

    public static class b implements ILogKfs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30827a;

        @Override // com.huawei.wisesecurity.kfs.log.ILogKfs
        public void w(String str, String str2) {
            yqi.b(a(str), str2, new Object[0]);
        }

        @Override // com.huawei.wisesecurity.kfs.log.ILogKfs
        public void i(String str, String str2) {
            yqi.a(a(str), str2, new Object[0]);
        }

        public String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.f30827a;
            }
            return this.f30827a + Constants.LINK + str;
        }

        @Override // com.huawei.wisesecurity.kfs.log.ILogKfs
        public void e(String str, String str2) {
            yqi.e(a(str), str2, new Object[0]);
        }

        @Override // com.huawei.wisesecurity.kfs.log.ILogKfs
        public void d(String str, String str2) {
            yqi.c(a(str), str2, new Object[0]);
        }

        public b(String str) {
            this.f30827a = str;
        }
    }

    public void setOobeCheck(yog yogVar) {
        if (ReportOption.REPORT_ALWAYS != this.option || yogVar == null) {
            return;
        }
        yqi.a(TAG, "set OobeCheckOff.", new Object[0]);
        yogVar.a();
    }

    public yog getInstance(Context context, String str, String str2) {
        return new yog(context, str, this.haUrl, new b(str2));
    }

    public BaseReporter(String str, ReportOption reportOption) {
        this.option = reportOption;
        this.haUrl = str;
    }
}
