package com.huami.tools.crashreport;

import kotlin.Metadata;
import org.acra.ReportField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/tools/crashreport/HuamiReportFields;", "", "", HuamiReportFields.CRASH_SDK_VERSION_NAME, "Ljava/lang/String;", HuamiReportFields.IS_ANR, "ANONYMOUS_ID", "HUAMI_ID", "", "Lorg/acra/ReportField;", "a", "[Lorg/acra/ReportField;", "getREPORT_FIELDS", "()[Lorg/acra/ReportField;", "REPORT_FIELDS", "<init>", "()V", "crash-report_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiReportFields {

    @NotNull
    public static final String ANONYMOUS_ID = "hmCrashDeviceID";

    @NotNull
    public static final String CRASH_SDK_VERSION_NAME = "CRASH_SDK_VERSION_NAME";

    @NotNull
    public static final String HUAMI_ID = "huamiID";

    @NotNull
    public static final String IS_ANR = "IS_ANR";
    public static final HuamiReportFields INSTANCE = new HuamiReportFields();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ReportField[] REPORT_FIELDS = {ReportField.REPORT_ID, ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.PACKAGE_NAME, ReportField.PHONE_MODEL, ReportField.ANDROID_VERSION, ReportField.BUILD, ReportField.BRAND, ReportField.PRODUCT, ReportField.TOTAL_MEM_SIZE, ReportField.AVAILABLE_MEM_SIZE, ReportField.BUILD_CONFIG, ReportField.CUSTOM_DATA, ReportField.STACK_TRACE, ReportField.STACK_TRACE_HASH, ReportField.DISPLAY, ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE, ReportField.INSTALLATION_ID, ReportField.THREAD_DETAILS};

    private HuamiReportFields() {
    }

    @NotNull
    public final ReportField[] getREPORT_FIELDS() {
        return REPORT_FIELDS;
    }
}
