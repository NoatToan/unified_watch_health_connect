package com.xiaomi.fitness.electronic.scale.model;

import android.content.res.Resources;
import android.graphics.Path;
import com.xiaomi.fitness.electronic.scale.model.AnalysisDataModel;
import defpackage.j5h;
import defpackage.o4h;
import defpackage.v4h;
import defpackage.xlh;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/AnalysisDataModel;", "", "Landroid/content/res/Resources;", "resources", "", "rawResId", "Lo4h;", "", "Lcom/xiaomi/fitness/electronic/scale/model/FatAnalysisBean;", "getFatAnalysisData", "(Landroid/content/res/Resources;I)Lo4h;", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AnalysisDataModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFatAnalysisData$lambda$0(Resources resources, int i, v4h emitter) {
        Intrinsics.checkNotNullParameter(resources, "$resources");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
        try {
            try {
                try {
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStreamOpenRawResource).getDocumentElement().getElementsByTagName("path");
                    ArrayList arrayList = new ArrayList();
                    int length = elementsByTagName.getLength();
                    for (int i2 = 0; i2 < length; i2++) {
                        Node nodeItem = elementsByTagName.item(i2);
                        Intrinsics.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                        Element element = (Element) nodeItem;
                        Path pathE = xlh.e(element.getAttribute("android:pathData"));
                        Intrinsics.checkNotNullExpressionValue(pathE, "createPathFromPathData(...)");
                        String attribute = element.getAttribute("android:strokeAlpha");
                        String attribute2 = element.getAttribute("android:strokeLineJoin");
                        String attribute3 = element.getAttribute("android:strokeWidth");
                        String attribute4 = element.getAttribute("android:strokeColor");
                        String attribute5 = element.getAttribute("android:strokeLineCap");
                        String attribute6 = element.getAttribute("android:fillColor");
                        String attribute7 = element.getAttribute("android:fillType");
                        String attribute8 = element.getAttribute("android:fillAlpha");
                        String attribute9 = element.getAttribute("android:name");
                        Intrinsics.checkNotNull(attribute);
                        float f = 1.0f;
                        float f2 = StringsKt__StringsKt.isBlank(attribute) ^ true ? Float.parseFloat(attribute) : 1.0f;
                        Intrinsics.checkNotNull(attribute3);
                        float f3 = StringsKt__StringsKt.isBlank(attribute3) ^ true ? Float.parseFloat(attribute3) : 1.0f;
                        Intrinsics.checkNotNull(attribute8);
                        if (!StringsKt__StringsKt.isBlank(attribute8)) {
                            f = Float.parseFloat(attribute8);
                        }
                        arrayList.add(new FatAnalysisBean(pathE, f2, attribute2, f3, attribute4, attribute5, attribute6, attribute7, f, attribute9));
                    }
                    emitter.onNext(arrayList);
                    emitter.onComplete();
                    inputStreamOpenRawResource.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    emitter.onError(e);
                    inputStreamOpenRawResource.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                inputStreamOpenRawResource.close();
                throw th;
            } catch (IOException e3) {
                e3.printStackTrace();
                throw th;
            }
        }
    }

    @NotNull
    public final o4h<List<FatAnalysisBean>> getFatAnalysisData(@NotNull final Resources resources, final int rawResId) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        o4h<List<FatAnalysisBean>> o4hVarF = o4h.f(new j5h() { // from class: h71
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                AnalysisDataModel.getFatAnalysisData$lambda$0(resources, rawResId, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        return o4hVarF;
    }
}
