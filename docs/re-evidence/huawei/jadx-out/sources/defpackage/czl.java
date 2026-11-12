package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class czl implements Comparator, Serializable {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (!(obj instanceof dlp) || !(obj2 instanceof dlp)) {
            return 1;
        }
        dlp dlpVar = (dlp) obj;
        dlp dlpVar2 = (dlp) obj2;
        if (TextUtils.isEmpty(dlpVar.r()) || TextUtils.isEmpty(dlpVar2.r())) {
            return 1;
        }
        return Long.compare(c(dlpVar.r()), c(dlpVar2.r()));
    }

    private long c(String str) {
        try {
            return DateFormatUtil.b(str, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT, lsl.d()).getTime();
        } catch (ParseException e) {
            LogUtil.e("PreviewActivityComparator", "格式日期出错:" + e.getMessage());
            return 0L;
        }
    }
}
