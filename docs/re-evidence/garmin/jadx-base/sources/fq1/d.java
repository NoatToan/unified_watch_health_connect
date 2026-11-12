package fq1;

import android.content.Context;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq1/d;", "Lfq1/s;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements s {
    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        Logger logger = yj2.b.f197581a;
        context.getClass();
        try {
            String[] strArrFileList = context.fileList();
            if (strArrFileList == null || strArrFileList.length == 0) {
                yj2.b.a(context);
            } else {
                p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(strArrFileList);
                while (bVar.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g((String) bVar.next(), "connectiq_devices.xml")) {
                    }
                }
                yj2.b.a(context);
            }
        } catch (Exception e4) {
            yj2.b.f197581a.error("devicesXmlFileExists", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
