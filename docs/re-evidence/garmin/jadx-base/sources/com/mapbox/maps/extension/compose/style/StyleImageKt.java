package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.ImageContent;
import com.mapbox.maps.ImageStretches;
import g6.o;
import java.util.List;
import n4.g;
import o4.c;
import o4.f;
import o4.l1;
import o4.v0;
import o4.x0;
import o4.y;
import p005kotlin.Metadata;
import p13.j0;
import p3.m;
import p3.n;
import p3.x1;
import q4.a;
import t4.d;
import zf.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aa\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ak\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0015\u001ac\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0002*\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "imageId", "Lo4/v0;", "imageBitmap", "", "scale", "", "sdf", "", "Lcom/mapbox/maps/ImageStretches;", "stretchX", "stretchY", "Lcom/mapbox/maps/ImageContent;", FirebaseAnalytics.Param.CONTENT, "Lcom/mapbox/maps/extension/compose/style/StyleImage;", "rememberStyleImage", "(Ljava/lang/String;Lo4/v0;Ljava/lang/Float;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/StyleImage;", "", Action.KEY_ATTRIBUTE, "Lt4/d;", "painter", "(Ljava/lang/Object;Ljava/lang/String;Lt4/d;Ljava/lang/Float;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/StyleImage;", "", "resourceId", "(Ljava/lang/String;ILjava/lang/Float;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/StyleImage;", "drawToBitmap", "(Lt4/d;)Lo4/v0;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleImageKt {
    public static final v0 drawToBitmap(d dVar) {
        dVar.getClass();
        a aVar = new a();
        f fVarA = x0.a((int) g.g(dVar.getF162260d()), (int) g.d(dVar.getF162260d()), 0, 28);
        c cVarA = l1.a(fVarA);
        g6.d dVarC = b.c();
        o oVar = o.Ltr;
        long f162260d = dVar.getF162260d();
        a.C2680a c2680a = aVar.f142542a;
        g6.c cVar = c2680a.f142546a;
        o oVar2 = c2680a.f142547b;
        y yVar = c2680a.f142548c;
        long j8 = c2680a.f142549d;
        c2680a.f142546a = dVarC;
        c2680a.f142547b = oVar;
        c2680a.f142548c = cVarA;
        c2680a.f142549d = f162260d;
        cVarA.l();
        d.m500drawx_KDEd0$default(dVar, aVar, dVar.getF162260d(), 0.0f, null, 6, null);
        cVarA.i();
        c2680a.f142546a = cVar;
        c2680a.f142547b = oVar2;
        c2680a.f142548c = yVar;
        c2680a.f142549d = j8;
        return fVarA;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    public static final StyleImage rememberStyleImage(String str, v0 v0Var, Float f14, boolean z14, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent, m mVar, int i14, int i15) {
        str.getClass();
        v0Var.getClass();
        mVar.L(1521624403);
        Float f15 = (i15 & 4) != 0 ? null : f14;
        if ((i15 & 8) != 0) {
            z14 = false;
        }
        if ((i15 & 16) != 0) {
            list = j0.f134944a;
        }
        List<ImageStretches> list3 = list;
        List<ImageStretches> list4 = (i15 & 32) != 0 ? j0.f134944a : list2;
        ImageContent imageContent2 = (i15 & 64) != 0 ? null : imageContent;
        x1 x1Var = n.f135158a;
        Float f16 = f15;
        Object[] objArr = {str, v0Var, f16, Boolean.valueOf(z14), list3, list4, imageContent2};
        mVar.L(-568225417);
        boolean zB = false;
        for (int i16 = 0; i16 < 7; i16++) {
            zB |= mVar.B(objArr[i16]);
        }
        Object objQ = mVar.q();
        if (zB) {
            StyleImage styleImage = new StyleImage(str, ExtensionUtils.toMapboxImage(o4.g.a(v0Var)), f16, z14, list3, list4, imageContent2);
            mVar.K(styleImage);
            objQ = styleImage;
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                StyleImage styleImage2 = new StyleImage(str, ExtensionUtils.toMapboxImage(o4.g.a(v0Var)), f16, z14, list3, list4, imageContent2);
                mVar.K(styleImage2);
                objQ = styleImage2;
            }
        }
        mVar.R();
        StyleImage styleImage3 = (StyleImage) objQ;
        x1 x1Var2 = n.f135158a;
        mVar.R();
        return styleImage3;
    }

    public static final StyleImage rememberStyleImage(String str, int i14, Float f14, boolean z14, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent, m mVar, int i15, int i16) {
        str.getClass();
        mVar.L(-2134754002);
        Float f15 = (i16 & 4) != 0 ? null : f14;
        if ((i16 & 8) != 0) {
            z14 = false;
        }
        boolean z15 = z14;
        if ((i16 & 16) != 0) {
            list = j0.f134944a;
        }
        List<ImageStretches> list3 = list;
        List<ImageStretches> list4 = (i16 & 32) != 0 ? j0.f134944a : list2;
        ImageContent imageContent2 = (i16 & 64) != 0 ? null : imageContent;
        x1 x1Var = n.f135158a;
        Integer numValueOf = Integer.valueOf(i14);
        int i17 = (i15 >> 3) & 14;
        d dVarA = n5.c.a(i14, mVar, i17);
        int i18 = 19137024 | i17;
        int i19 = i15 << 3;
        StyleImage styleImageRememberStyleImage = rememberStyleImage(numValueOf, str, dVarA, f15, z15, list3, list4, imageContent2, mVar, i18 | (i19 & 112) | (i19 & 7168) | (i19 & 57344), 0);
        mVar.R();
        return styleImageRememberStyleImage;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    public static final StyleImage rememberStyleImage(Object obj, String str, d dVar, Float f14, boolean z14, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent, m mVar, int i14, int i15) {
        str.getClass();
        dVar.getClass();
        mVar.L(315778482);
        if ((i15 & 8) != 0) {
            f14 = null;
        }
        boolean z15 = (i15 & 16) != 0 ? false : z14;
        if ((i15 & 32) != 0) {
            list = j0.f134944a;
        }
        if ((i15 & 64) != 0) {
            list2 = j0.f134944a;
        }
        if ((i15 & 128) != 0) {
            imageContent = null;
        }
        x1 x1Var = n.f135158a;
        Object[] objArr = {obj, str, dVar, f14, Boolean.valueOf(z15), list, list2, imageContent};
        mVar.L(-568225417);
        boolean zB = false;
        for (int i16 = 0; i16 < 8; i16++) {
            zB |= mVar.B(objArr[i16]);
        }
        Object objQ = mVar.q();
        if (!zB) {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new StyleImage(str, ExtensionUtils.toMapboxImage(o4.g.a(drawToBitmap(dVar))), f14, z15, list, list2, imageContent);
                mVar.K(objQ);
            }
        } else {
            objQ = new StyleImage(str, ExtensionUtils.toMapboxImage(o4.g.a(drawToBitmap(dVar))), f14, z15, list, list2, imageContent);
            mVar.K(objQ);
        }
        mVar.R();
        StyleImage styleImage = (StyleImage) objQ;
        x1 x1Var2 = n.f135158a;
        mVar.R();
        return styleImage;
    }
}
