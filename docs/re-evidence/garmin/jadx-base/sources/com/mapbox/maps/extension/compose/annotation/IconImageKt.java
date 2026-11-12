package com.mapbox.maps.extension.compose.annotation;

import ch.qos.logback.core.joran.action.Action;
import com.mapbox.maps.extension.compose.style.StyleImageKt;
import n5.c;
import o4.g;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import t4.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"", Action.KEY_ATTRIBUTE, "Lt4/d;", "painter", "Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "rememberIconImage", "(Ljava/lang/Object;Lt4/d;Lp3/m;I)Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "", "resourceId", "(ILp3/m;I)Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class IconImageKt {
    /* JADX WARN: Code duplicated, block: B:6:0x0029  */
    public static final IconImage rememberIconImage(Object obj, d dVar, m mVar, int i14) {
        dVar.getClass();
        mVar.L(184939875);
        x1 x1Var = n.f135158a;
        mVar.L(511388516);
        boolean zB = mVar.B(obj) | mVar.B(dVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new IconImage(g.a(StyleImageKt.drawToBitmap(dVar)));
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new IconImage(g.a(StyleImageKt.drawToBitmap(dVar)));
                mVar.K(objQ);
            }
        }
        mVar.R();
        IconImage iconImage = (IconImage) objQ;
        mVar.R();
        return iconImage;
    }

    public static final IconImage rememberIconImage(int i14, m mVar, int i15) {
        mVar.L(431324831);
        x1 x1Var = n.f135158a;
        int i16 = i15 & 14;
        IconImage iconImageRememberIconImage = rememberIconImage(Integer.valueOf(i14), c.a(i14, mVar, i16), mVar, i16 | 64);
        mVar.R();
        return iconImageRememberIconImage;
    }
}
