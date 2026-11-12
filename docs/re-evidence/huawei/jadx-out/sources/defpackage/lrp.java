package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class lrp {
    public static final boolean h = CompileParameterUtil.c("IS_SUPPORT_NYX", false);
    public static final boolean d = CompileParameterUtil.c("IS_SUPPORT_GRUS", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f40729b = CompileParameterUtil.c("IS_SUPPORT_JANUS", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f40728a = CompileParameterUtil.c("IS_SUPPORT_ERIS", false);
    public static final boolean e = CompileParameterUtil.c("SUPPORT_A1", false);
    public static final boolean i = CompileParameterUtil.c("SUPPORT_METIS", false);
    public static final boolean f = CompileParameterUtil.c("SUPPORT_R1", false);
    public static final String g = a() + "/Huawei/Health/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40730c = BaseApplication.getAppPackage() + ".fileprovider";

    private static String a() {
        try {
            return CommonUtil.f((Context) null).getCanonicalPath();
        } catch (IOException unused) {
            LogUtil.e("BTDialogActivity", "getCanonicalPath Failed");
            return "";
        }
    }
}
