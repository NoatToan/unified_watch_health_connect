package defpackage;

import com.huawei.pluginachievement.report.iterface.PageAccessible;

/* JADX INFO: loaded from: classes13.dex */
public class ows {
    public PageAccessible e(int i) {
        switch (i) {
            case 2018:
            case 2019:
                return new owp();
            case 2020:
                return new own();
            default:
                return new own();
        }
    }
}
