package pf;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import dg.u;
import hf.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wf.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpf/a;", "Lpf/c;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c<y> {
    @Override // pf.c
    public final String a(y yVar, m mVar) {
        y yVar2 = yVar;
        if (!s.g(yVar2.f83620c, "android.resource")) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(yVar2);
        sb3.append(CoreConstants.COLON_CHAR);
        Configuration configuration = mVar.f184996a.getResources().getConfiguration();
        Bitmap.Config[] configArr = u.f59504a;
        sb3.append(configuration.uiMode & 48);
        return sb3.toString();
    }
}
