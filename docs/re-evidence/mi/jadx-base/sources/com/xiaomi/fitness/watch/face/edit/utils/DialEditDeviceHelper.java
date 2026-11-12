package com.xiaomi.fitness.watch.face.edit.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.watch.face.edit.entity.CustomWidget;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.EditWidget;
import com.xiaomi.fitness.watch.face.edit.entity.Slot;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import com.xiaomi.fitness.watch.face.edit.entity.SlotWidgetItem;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceSlotItem;
import defpackage.a6r;
import defpackage.z5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J5\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e*\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010&\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/utils/DialEditDeviceHelper;", "", "", "slotType", "", "nameIdMap", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "watchFace", "La6r;", "getDeviceSlotItem", "(Ljava/lang/String;Ljava/util/Map;Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)La6r;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceSlotItem;", "Lkotlin/collections/ArrayList;", "", "castToPB", "(Ljava/util/ArrayList;)Ljava/util/List;", "source", "", "getSourceId", "(Ljava/lang/String;)I", "getDeviceStyleColorIndex", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)Ljava/lang/Integer;", "getDeviceStyleStr", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)Ljava/lang/String;", "buildDeviceWatchFaceSlotList", "(Ljava/util/Map;Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)Ljava/util/List;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "mInfo", "", "updateEditEntityWithDeviceConfig", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;Ljava/util/Map;Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;)V", "Ljava/io/File;", "fontFile", "dialWatchFace", "", "fontFileChange", "Lz5r;", "buildWatchFaceLiteral", "(Ljava/io/File;Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;Ljava/util/Map;Z)Lz5r;", "getTextList", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)Ljava/util/List;", "TAG", "Ljava/lang/String;", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDialEditDeviceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialEditDeviceHelper.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialEditDeviceHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,317:1\n360#2,7:318\n1863#2,2:325\n360#2,7:327\n360#2,7:334\n360#2,7:341\n360#2,7:362\n360#2,7:369\n360#2,7:376\n360#2,7:384\n1863#2:391\n1864#2:396\n535#3:348\n520#3,6:349\n535#3:355\n520#3,6:356\n1#4:383\n37#5:392\n36#5,3:393\n37#5:397\n36#5,3:398\n*S KotlinDebug\n*F\n+ 1 DialEditDeviceHelper.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialEditDeviceHelper\n*L\n37#1:318,7\n99#1:325,2\n177#1:327,7\n190#1:334,7\n197#1:341,7\n214#1:362,7\n227#1:369,7\n240#1:376,7\n253#1:384,7\n298#1:391\n298#1:396\n207#1:348\n207#1:349,6\n209#1:355\n209#1:356,6\n301#1:392\n301#1:393,3\n305#1:397\n305#1:398,3\n*E\n"})
public final class DialEditDeviceHelper {

    @NotNull
    public static final DialEditDeviceHelper INSTANCE = new DialEditDeviceHelper();

    @NotNull
    public static final String TAG = "DialEditDeviceHelper";

    private DialEditDeviceHelper() {
    }

    public static /* synthetic */ z5r buildWatchFaceLiteral$default(DialEditDeviceHelper dialEditDeviceHelper, File file, DialWatchFace dialWatchFace, Map map, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return dialEditDeviceHelper.buildWatchFaceLiteral(file, dialWatchFace, map, z);
    }

    private final List<a6r> castToPB(ArrayList<WatchFaceSlotItem> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<WatchFaceSlotItem> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WatchFaceSlotItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            WatchFaceSlotItem watchFaceSlotItem = next;
            a6r a6rVar = new a6r();
            a6rVar.d = watchFaceSlotItem.getWidgetId();
            a6rVar.c = watchFaceSlotItem.getSlotId();
            a6rVar.e = watchFaceSlotItem.getPositionIndex();
            arrayList2.add(a6rVar);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    private final a6r getDeviceSlotItem(String slotType, Map<String, String> nameIdMap, DialWatchFace watchFace) {
        Theme theme;
        Map<String, List<Slot>> slotMap;
        DialEditEntity dialEditEntity;
        int selectWidgetIndex;
        String str;
        a6r a6rVar = null;
        if ((!Intrinsics.areEqual(slotType, SlotType.DIAL) && !Intrinsics.areEqual(slotType, "time") && !Intrinsics.areEqual(slotType, SlotType.FONT)) || (theme = DialEditHelper.INSTANCE.getTheme(watchFace)) == null || (slotMap = theme.getSlotMap()) == null || (dialEditEntity = theme.getDialEditEntity()) == null) {
            return null;
        }
        List<Slot> list = slotMap.get(slotType);
        List<Slot> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            if (Intrinsics.areEqual(slotType, SlotType.DIAL)) {
                SlotEditItem dialSlotEditItem = dialEditEntity.getDialSlotEditItem();
                Intrinsics.checkNotNull(dialSlotEditItem);
                selectWidgetIndex = dialSlotEditItem.getSelectWidgetIndex();
            } else if (Intrinsics.areEqual(slotType, SlotType.FONT)) {
                SlotEditItem fontSlotEditItem = dialEditEntity.getFontSlotEditItem();
                Intrinsics.checkNotNull(fontSlotEditItem);
                selectWidgetIndex = fontSlotEditItem.getSelectWidgetIndex();
            } else {
                SlotEditItem timeSlotEditItem = dialEditEntity.getTimeSlotEditItem();
                Intrinsics.checkNotNull(timeSlotEditItem);
                selectWidgetIndex = timeSlotEditItem.getSelectWidgetIndex();
            }
            Slot slot = list.get(0);
            List<SlotWidgetItem> itemList = slot.getItemList();
            if (itemList == null) {
                return null;
            }
            String str2 = nameIdMap.get(slot.getName());
            if (selectWidgetIndex < 0 || selectWidgetIndex >= itemList.size()) {
                str = null;
            } else {
                String ref = itemList.get(selectWidgetIndex).getRef();
                Map<String, Object> resourceMap = watchFace.getResourceMap();
                Object obj = resourceMap != null ? resourceMap.get(ref) : null;
                if (obj instanceof CustomWidget) {
                    str = nameIdMap.get(((CustomWidget) obj).getName());
                } else {
                    str = null;
                }
            }
            Integer numValueOf = (!slot.getMovable() || dialEditEntity.getPositionIndex() < 0) ? null : Integer.valueOf(dialEditEntity.getPositionIndex());
            if (str2 != null && !StringsKt__StringsKt.isBlank(str2) && str != null && !StringsKt__StringsKt.isBlank(str)) {
                a6rVar = new a6r();
                a6rVar.c = str2;
                a6rVar.d = str;
                if (numValueOf != null) {
                    a6rVar.e = numValueOf.intValue();
                }
            }
        }
        return a6rVar;
    }

    private final int getSourceId(String source) {
        return (source == null || source.length() == 0) ? 0 : 4640;
    }

    @Nullable
    public final List<a6r> buildDeviceWatchFaceSlotList(@NotNull Map<String, String> nameIdMap, @NotNull DialWatchFace watchFace) {
        DialEditEntity dialEditEntity;
        Intrinsics.checkNotNullParameter(nameIdMap, "nameIdMap");
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Theme theme = DialEditHelper.INSTANCE.getTheme(watchFace);
        if (theme == null || (dialEditEntity = theme.getDialEditEntity()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a6r deviceSlotItem = getDeviceSlotItem(SlotType.DIAL, nameIdMap, watchFace);
        if (deviceSlotItem != null) {
            arrayList.add(deviceSlotItem);
        }
        a6r deviceSlotItem2 = getDeviceSlotItem("time", nameIdMap, watchFace);
        if (deviceSlotItem2 != null) {
            arrayList.add(deviceSlotItem2);
        }
        a6r deviceSlotItem3 = getDeviceSlotItem(SlotType.FONT, nameIdMap, watchFace);
        if (deviceSlotItem3 != null) {
            arrayList.add(deviceSlotItem3);
        }
        for (SlotEditItem slotEditItem : dialEditEntity.getSlotItemList()) {
            String str = nameIdMap.get(slotEditItem.getKeyName());
            String str2 = nameIdMap.get(slotEditItem.getListWidget().get(slotEditItem.getSelectWidgetIndex()).getKeyName());
            Integer numValueOf = (!slotEditItem.getMovable() || slotEditItem.getPositionList() == null) ? null : Integer.valueOf(RangesKt___RangesKt.coerceAtMost(dialEditEntity.getPositionIndex(), slotEditItem.getPositionList().size() - 1));
            if (str != null && !StringsKt__StringsKt.isBlank(str) && str2 != null && !StringsKt__StringsKt.isBlank(str2)) {
                a6r a6rVar = new a6r();
                a6rVar.c = str;
                a6rVar.d = str2;
                if (numValueOf != null) {
                    a6rVar.e = numValueOf.intValue();
                }
                arrayList.add(a6rVar);
            }
        }
        return arrayList;
    }

    @NotNull
    public final z5r buildWatchFaceLiteral(@Nullable File fontFile, @NotNull DialWatchFace dialWatchFace, @NotNull Map<String, String> nameIdMap, boolean fontFileChange) {
        DialEditEntity dialEditEntity;
        Intrinsics.checkNotNullParameter(dialWatchFace, "dialWatchFace");
        Intrinsics.checkNotNullParameter(nameIdMap, "nameIdMap");
        List<Theme> normalThemeList = dialWatchFace.getNormalThemeList();
        List<FaceEditLiteralBean> textItemList = null;
        Theme theme = normalThemeList != null ? normalThemeList.get(dialWatchFace.getThemeIndex()) : null;
        if (theme != null && (dialEditEntity = theme.getDialEditEntity()) != null) {
            textItemList = dialEditEntity.getTextItemList();
        }
        List<String> textList = dialWatchFace.getTextList();
        if (textList == null) {
            textList = new ArrayList<>();
        }
        z5r z5rVar = new z5r();
        if (fontFile != null && fontFileChange) {
            z5rVar.d = MD5Util.getFileMD5(fontFile);
            z5rVar.e = (int) fontFile.length();
        }
        z5r.a.C1163a c1163a = new z5r.a.C1163a();
        ArrayList arrayList = new ArrayList();
        if (textItemList != null) {
            for (FaceEditLiteralBean faceEditLiteralBean : textItemList) {
                z5r.a aVar = new z5r.a();
                aVar.c = nameIdMap.get(faceEditLiteralBean.getName());
                aVar.d = (String[]) textList.toArray(new String[0]);
                aVar.e = INSTANCE.getSourceId(faceEditLiteralBean.getSource());
                arrayList.add(aVar);
            }
        }
        c1163a.c = (z5r.a[]) arrayList.toArray(new z5r.a[0]);
        z5rVar.c = c1163a;
        return z5rVar;
    }

    @Nullable
    public final Integer getDeviceStyleColorIndex(@NotNull DialWatchFace watchFace) {
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Theme theme = DialEditHelper.INSTANCE.getTheme(watchFace);
        Integer numValueOf = null;
        if (theme == null) {
            return null;
        }
        List<String> colorGroupTable = watchFace.getColorGroupTable();
        if (colorGroupTable == null) {
            colorGroupTable = CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> colorGroupTable2 = theme.getColorGroupTable();
        if (colorGroupTable2 == null) {
            colorGroupTable2 = CollectionsKt__CollectionsKt.emptyList();
        }
        DialEditEntity dialEditEntity = theme.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity);
        int colorGroupIndex = dialEditEntity.getColorGroupIndex();
        DialEditEntity dialEditEntity2 = theme.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity2);
        int recolorIndex = dialEditEntity2.getRecolorIndex();
        List<String> recolorTable = watchFace.getRecolorTable();
        if (colorGroupIndex < 0 || colorGroupIndex >= colorGroupTable2.size()) {
            List<String> listEmptyList = recolorTable == null ? CollectionsKt__CollectionsKt.emptyList() : recolorTable;
            if (recolorIndex >= 0 && recolorIndex < listEmptyList.size()) {
                numValueOf = Integer.valueOf(recolorIndex);
            }
        } else {
            String str = colorGroupTable2.get(colorGroupIndex);
            Iterator<String> it = colorGroupTable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(str, it.next())) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                numValueOf = Integer.valueOf(i);
            }
        }
        DialEditEntity dialEditEntity3 = theme.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity3);
        Logger.i(TAG, "getDeviceStyleColorIndex entity" + dialEditEntity3 + ";watchFaceColorGroupTable " + colorGroupTable + ";watchFaceRecolorTable " + recolorTable + ";result " + numValueOf);
        return numValueOf;
    }

    @Nullable
    public final String getDeviceStyleStr(@NotNull DialWatchFace watchFace) {
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Theme theme = DialEditHelper.INSTANCE.getTheme(watchFace);
        if (theme == null) {
            return null;
        }
        String name = theme.getName();
        Logger.i(TAG, "getDeviceStyleStr result:" + name);
        return name;
    }

    @NotNull
    public final List<String> getTextList(@NotNull DialWatchFace dialWatchFace) {
        List<String> mutableList;
        Intrinsics.checkNotNullParameter(dialWatchFace, "dialWatchFace");
        List<String> textList = dialWatchFace.getTextList();
        return (textList == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) textList)) == null) ? new ArrayList() : mutableList;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    public final void updateEditEntityWithDeviceConfig(@NotNull DialWatchFace watchFace, @NotNull Map<String, String> nameIdMap, @NotNull WatchFace mInfo) {
        List<a6r> arrayList;
        Object obj;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Intrinsics.checkNotNullParameter(nameIdMap, "nameIdMap");
        Intrinsics.checkNotNullParameter(mInfo, "mInfo");
        String style = mInfo.getStyle();
        if (style == null) {
            style = "";
        }
        int styleColorIndex = mInfo.getStyleColorIndex();
        ArrayList<WatchFaceSlotItem> slotItems = mInfo.getSlotItems();
        if (slotItems == null || (arrayList = castToPB(slotItems)) == null) {
            arrayList = new ArrayList<>();
        }
        Logger.i(TAG, "updateEditEntityWithDeviceConfig themeStyle " + style + ";styleColorIndex " + styleColorIndex + ";slotList " + arrayList);
        List<Theme> normalThemeList = watchFace.getNormalThemeList();
        if (normalThemeList != null) {
            Iterator<Theme> it = normalThemeList.iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getName(), style)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                i4 = 0;
            }
            watchFace.setThemeIndex(i4);
            Theme theme = DialEditHelper.INSTANCE.getTheme(watchFace);
            if (theme == null) {
                return;
            }
            DialEditEntity dialEditEntity = theme.getDialEditEntity();
            Intrinsics.checkNotNull(dialEditEntity);
            List<String> colorGroupTable = watchFace.getColorGroupTable();
            List<String> colorGroupTable2 = theme.getColorGroupTable();
            if (colorGroupTable != null && (!colorGroupTable.isEmpty()) && colorGroupTable2 != null && (!colorGroupTable2.isEmpty()) && DialXmlParser.INSTANCE.checkColorTableAllEffective(colorGroupTable2) && styleColorIndex >= 0 && styleColorIndex < colorGroupTable.size()) {
                String str = colorGroupTable.get(styleColorIndex);
                Iterator<String> it2 = colorGroupTable2.iterator();
                int i5 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (Intrinsics.areEqual(str, it2.next())) {
                        break;
                    } else {
                        i5++;
                    }
                }
                dialEditEntity.setColorGroupIndex(i5);
            }
            List<String> recolorTable = watchFace.getRecolorTable();
            if (recolorTable != null && (!recolorTable.isEmpty()) && DialXmlParser.INSTANCE.checkColorTableAllEffective(recolorTable) && styleColorIndex >= 0 && styleColorIndex < recolorTable.size()) {
                String str2 = recolorTable.get(styleColorIndex);
                Iterator<String> it3 = recolorTable.iterator();
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (Intrinsics.areEqual(str2, it3.next())) {
                        break;
                    } else {
                        i6++;
                    }
                }
                dialEditEntity.setRecolorIndex(i6);
            }
            int iMax = -1;
            for (a6r a6rVar : arrayList) {
                String str3 = a6rVar.c;
                String str4 = a6rVar.d;
                iMax = Math.max(iMax, a6rVar.e);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : nameIdMap.entrySet()) {
                    if (Intrinsics.areEqual(str3, entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String str5 = (String) CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap.keySet());
                if (str5 == null) {
                    i = i3;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, String> entry2 : nameIdMap.entrySet()) {
                        if (Intrinsics.areEqual(str4, entry2.getValue())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    String str6 = (String) CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap2.keySet());
                    if (str6 != null) {
                        SlotEditItem dialSlotEditItem = dialEditEntity.getDialSlotEditItem();
                        if (dialSlotEditItem == null || !Intrinsics.areEqual(str5, dialSlotEditItem.getKeyName())) {
                            SlotEditItem timeSlotEditItem = dialEditEntity.getTimeSlotEditItem();
                            if (timeSlotEditItem == null || !Intrinsics.areEqual(str5, timeSlotEditItem.getKeyName())) {
                                SlotEditItem fontSlotEditItem = dialEditEntity.getFontSlotEditItem();
                                if (fontSlotEditItem == null || !Intrinsics.areEqual(str5, fontSlotEditItem.getKeyName())) {
                                    Iterator<T> it4 = dialEditEntity.getSlotItemList().iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        Object next = it4.next();
                                        if (Intrinsics.areEqual(((SlotEditItem) next).getKeyName(), str5)) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                    SlotEditItem slotEditItem = (SlotEditItem) obj;
                                    if (slotEditItem != null) {
                                        Iterator<EditWidget> it5 = slotEditItem.getListWidget().iterator();
                                        int i7 = 0;
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                i7 = -1;
                                                break;
                                            } else if (Intrinsics.areEqual(it5.next().getKeyName(), str6)) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                        if (i7 < 0) {
                                            Logger.e(TAG, str5 + " not contain " + str6 + "!");
                                            i = 0;
                                            slotEditItem.setSelectWidgetIndex(0);
                                        } else {
                                            i = 0;
                                            slotEditItem.setSelectWidgetIndex(i7);
                                        }
                                    }
                                } else {
                                    Iterator<EditWidget> it6 = fontSlotEditItem.getListWidget().iterator();
                                    int i8 = 0;
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            i8 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(it6.next().getKeyName(), str6)) {
                                            break;
                                        } else {
                                            i8++;
                                        }
                                    }
                                    if (i8 < 0) {
                                        Logger.e(TAG, str5 + " not contain " + str6 + "!");
                                        fontSlotEditItem.setSelectWidgetIndex(0);
                                    } else {
                                        fontSlotEditItem.setSelectWidgetIndex(i8);
                                    }
                                }
                            } else {
                                Iterator<EditWidget> it7 = timeSlotEditItem.getListWidget().iterator();
                                int i9 = i3;
                                while (true) {
                                    if (!it7.hasNext()) {
                                        i9 = -1;
                                        break;
                                    } else if (Intrinsics.areEqual(it7.next().getKeyName(), str6)) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                if (i9 < 0) {
                                    Logger.e(TAG, str5 + " not contain " + str6 + "!");
                                    timeSlotEditItem.setSelectWidgetIndex(0);
                                } else {
                                    timeSlotEditItem.setSelectWidgetIndex(i9);
                                }
                            }
                            i = 0;
                        } else {
                            Iterator<EditWidget> it8 = dialSlotEditItem.getListWidget().iterator();
                            int i10 = i3;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i2 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(it8.next().getKeyName(), str6)) {
                                        i2 = i10;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            if (i2 < 0) {
                                Logger.e(TAG, str5 + " not contain " + str6 + "!");
                                dialSlotEditItem.setSelectWidgetIndex(i3);
                            } else {
                                dialSlotEditItem.setSelectWidgetIndex(i2);
                            }
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                }
                i3 = i;
            }
            int i11 = i3;
            if (mInfo.getTextList() != null) {
                ArrayList<String> textList = mInfo.getTextList();
                watchFace.setTextList(textList != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) textList) : null);
            }
            dialEditEntity.setPositionIndex(iMax < 0 ? i11 : iMax);
            Logger.i(TAG, "updateEditEntityWithDeviceConfig result " + dialEditEntity);
        }
    }
}
