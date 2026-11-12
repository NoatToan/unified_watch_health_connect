package defpackage;

import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Comment;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hkf {
    public static String b(Motion motion, String str) {
        if (motion == null) {
            LogUtil.j("Suggestion_LongViewContentHelper", "getContent motion == null");
            return str;
        }
        List<Comment> listAcquireCommentaryGap = motion.acquireCommentaryGap();
        return (listAcquireCommentaryGap == null || listAcquireCommentaryGap.size() <= 0) ? str : listAcquireCommentaryGap.get(0).acquireContent();
    }
}
