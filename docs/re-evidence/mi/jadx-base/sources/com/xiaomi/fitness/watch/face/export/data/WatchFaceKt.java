package com.xiaomi.fitness.watch.face.export.data;

import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import defpackage.a6r;
import defpackage.w5r;
import defpackage.y5r;
import defpackage.z5r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly5r;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "getBean", "(Ly5r;)Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "", FaceInfoBase.FACE_ID, "getTemplateId", "(Ljava/lang/String;)Ljava/lang/String;", "watch-face-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class WatchFaceKt {
    @NotNull
    public static final WatchFace getBean(@NotNull y5r y5rVar) {
        w5r.b bVar;
        Intrinsics.checkNotNullParameter(y5rVar, "<this>");
        String id = y5rVar.c;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        String name = y5rVar.d;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        boolean z = y5rVar.e;
        boolean z2 = y5rVar.f;
        boolean z3 = y5rVar.h;
        String str = y5rVar.s;
        long j = y5rVar.g;
        String str2 = y5rVar.i;
        int i = y5rVar.f39821k;
        String str3 = y5rVar.m;
        String[] backgroundImageList = y5rVar.n;
        Intrinsics.checkNotNullExpressionValue(backgroundImageList, "backgroundImageList");
        WatchFace watchFace = new WatchFace(id, name, z, z2, z3, false, str, j, str2, i, str3, backgroundImageList, y5rVar.q, y5rVar.o, null, 0, y5rVar.t, null, y5rVar.u, null, null, y5rVar.l, 1753088, null);
        watchFace.setForegroundColor(y5rVar.j);
        ArrayList<WatchFaceSlotItem> arrayList = new ArrayList<>();
        Iterator it = ArrayIteratorKt.iterator(y5rVar.f39822r);
        while (it.hasNext()) {
            a6r a6rVar = (a6r) it.next();
            arrayList.add(new WatchFaceSlotItem(a6rVar.c, a6rVar.d, a6rVar.e));
        }
        watchFace.setSlotItems(arrayList);
        if (y5rVar.o) {
            ArrayList<FaceEditPhotoBean> arrayList2 = new ArrayList<>();
            w5r.b bVar2 = y5rVar.p;
            int i2 = 8;
            if ((bVar2 != null ? Integer.valueOf(bVar2.d) : null) != null && (((bVar = y5rVar.p) == null || bVar.d != 0) && bVar != null)) {
                i2 = bVar.d;
            }
            watchFace.setSupportMaxCount(i2);
            w5r.b bVar3 = y5rVar.p;
            w5r.a[] aVarArr = bVar3 != null ? bVar3.c : null;
            if (aVarArr == null || aVarArr.length == 0) {
                String[] strArr = y5rVar.n;
                if (strArr != null) {
                    Iterator it2 = ArrayIteratorKt.iterator(strArr);
                    while (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        Intrinsics.checkNotNull(str4);
                        arrayList2.add(new FaceEditPhotoBean(0, new WatchFaceImage(str4, null, null, null, null, null, null, null, 254, null), null, 4, null));
                    }
                }
            } else {
                Iterator it3 = ArrayIteratorKt.iterator(bVar3.c);
                while (it3.hasNext()) {
                    w5r.a aVar = (w5r.a) it3.next();
                    Intrinsics.checkNotNull(aVar);
                    arrayList2.add(FaceEditPhotoBeanKt.toBean(aVar));
                }
            }
            watchFace.setImageGroupList(arrayList2);
            if (watchFace.getId().length() > 4 && watchFace.getId().charAt(4) == '4') {
                watchFace.setTemplateId(getTemplateId(watchFace.getId()));
            }
        }
        z5r.a.C1163a c1163a = y5rVar.v;
        if ((c1163a != null ? c1163a.c : null) != null) {
            watchFace.setTextList(new ArrayList<>());
            ArrayList<FaceEditLiteralBean> arrayList3 = new ArrayList<>();
            Iterator it4 = ArrayIteratorKt.iterator(y5rVar.v.c);
            while (it4.hasNext()) {
                z5r.a aVar2 = (z5r.a) it4.next();
                ArrayList<String> textList = watchFace.getTextList();
                Intrinsics.checkNotNull(textList);
                String[] textList2 = aVar2.d;
                Intrinsics.checkNotNullExpressionValue(textList2, "textList");
                textList.addAll(ArraysKt___ArraysKt.toMutableList(textList2));
                String id2 = aVar2.c;
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                arrayList3.add(new FaceEditLiteralBean(id2, new ArrayList(), 0, 0, null, Source.DATE_WEEK, 24, null));
            }
            watchFace.setLiteralBeanList(arrayList3);
        }
        return watchFace;
    }

    private static final String getTemplateId(String str) {
        if (str.length() <= 0 || str.length() != 9 || str.charAt(4) != '4') {
            return str;
        }
        String strSubstring = str.substring(0, 7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + "00";
    }
}
