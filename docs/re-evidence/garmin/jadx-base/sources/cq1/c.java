package cq1;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcq1/c;", "Lcq1/o;", "Lrd2/f;", "deviceDAO", "Lhu/a;", "audioPromptsBizManager", "Lht/a;", "analyticsLogger", "<init>", "(Lrd2/f;Lhu/a;Lht/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd2.f f55186a;

    public c(rd2.f fVar, hu.a aVar, ht.a aVar2) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f55186a = fVar;
    }

    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) {
        boolean zH = km2.a.h(km2.a.b());
        String str = BooleanUtils.FALSE;
        ht.a.c("hasAudioPromptsDevice", zH ? BooleanUtils.TRUE : BooleanUtils.FALSE);
        this.f55186a.f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        boolean z14 = false;
        if (arrayListD != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                if (hu.a.W(((sd2.f) it.next()).getUnitID())) {
                    z14 = true;
                    break;
                }
            }
        }
        if (z14) {
            str = BooleanUtils.TRUE;
        }
        ht.a.c("hasAudioPromptsEnabled", str);
        return Unit.INSTANCE;
    }
}
