package defpackage;

import com.huawei.operation.jsoperation.JsUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class nuc {
    public static int a(int i) {
        if (i == 2) {
            return 0;
        }
        return i;
    }

    public static int c(int i) {
        if (i == 0) {
            return 10;
        }
        return i;
    }

    public static String e(int i) {
        if (i == 0) {
            return "run_distance";
        }
        if (i == 1) {
            return "run_time";
        }
        if (i == 10) {
            return "beating";
        }
        if (i == 101) {
            return JsUtil.SCORE;
        }
        return "";
    }

    public static int a(String str) {
        if ("beating".equals(str)) {
            return 10;
        }
        if ("timer".equals(str) || "run_time".equals(str)) {
            return 1;
        }
        if ("run_distance".equals(str)) {
            return 0;
        }
        return JsUtil.SCORE.equals(str) ? 101 : -1;
    }
}
