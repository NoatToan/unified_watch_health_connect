package com.mapbox.maps.extension.compose;

import com.mapbox.maps.extension.compose.style.standard.MapboxStandardStyleKt;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ComposableSingletons$MapboxMapKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ComposableSingletons$MapboxMapKt$lambda5$1 extends w implements p<m, Integer, Unit> {
    public static final ComposableSingletons$MapboxMapKt$lambda5$1 INSTANCE = new ComposableSingletons$MapboxMapKt$lambda5$1();

    public ComposableSingletons$MapboxMapKt$lambda5$1() {
        super(2);
    }

    public final void invoke(m mVar, int i14) {
        if ((i14 & 11) == 2 && mVar.b()) {
            mVar.e();
        } else {
            x1 x1Var = n.f135158a;
            MapboxStandardStyleKt.MapboxStandardStyle(null, null, null, null, null, mVar, 0, 31);
        }
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
