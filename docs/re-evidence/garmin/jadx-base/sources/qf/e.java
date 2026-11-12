package qf;

import android.content.Context;
import android.content.res.Resources;
import hf.y;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import wf.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqf/e;", "Lqf/c;", "", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements c<Integer, y> {
    @Override // qf.c
    public final y a(Object obj, m mVar) {
        int iIntValue = ((Number) obj).intValue();
        Context context = mVar.f184996a;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return gg.b.S("android.resource://" + context.getPackageName() + IOUtils.DIR_SEPARATOR_UNIX + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
