package com.xiaomi.fitness.watch.face.edit.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.edit.entity.CustomWidget;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.EditWidget;
import com.xiaomi.fitness.watch.face.edit.entity.Image;
import com.xiaomi.fitness.watch.face.edit.entity.Layout;
import com.xiaomi.fitness.watch.face.edit.entity.Slot;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.entity.SlotPosition;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import com.xiaomi.fitness.watch.face.edit.entity.SlotWidgetItem;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.ui.WatchFaceView;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import defpackage.isi;
import defpackage.ovi;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J}\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010)J\u0012\u0010*\u001a\u00020\u0018*\u00020\u00182\u0006\u0010+\u001a\u00020\u0015JD\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180-2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010/\u001a\u0002002\u0006\u0010\"\u001a\u00020\u0015J>\u00101\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010-2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0015J\u0017\u00102\u001a\u0004\u0018\u00010\u001d2\b\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u00104R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/utils/DialEditHelper;", "", "<init>", "()V", "TAG", "", "currentDiaWatchFace", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "getCurrentDiaWatchFace", "()Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "setCurrentDiaWatchFace", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;)V", "getTheme", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "dialWatchFace", "getAodTheme", "watchFaceViewScale", "", "watchFaceView", "Lcom/xiaomi/fitness/watch/face/edit/ui/WatchFaceView;", "scaleX", "", "scaleY", "watchFaceViewToBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "theme", "showWidth", "", "showHeight", "filePath", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "radius", "faceEditPhotoBean", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "onlyForeground", "", "isPortrait", "defaultVideoThumbPath", "(Landroid/content/Context;Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;IILjava/lang/String;Landroid/graphics/Bitmap$Config;Ljava/lang/Float;Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;ZZLjava/lang/String;)Landroid/graphics/Bitmap;", "bimapRound", "originRadius", "getSlotBitmapList", "", "watchFace", "slot", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "getMovableBitmapList", "safeColorParse", "colorStr", "(Ljava/lang/String;)Ljava/lang/Integer;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialEditHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialEditHelper.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialEditHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
public final class DialEditHelper {

    @NotNull
    public static final DialEditHelper INSTANCE = new DialEditHelper();

    @NotNull
    public static final String TAG = "DialEditHelper";

    @Nullable
    private static DialWatchFace currentDiaWatchFace;

    private DialEditHelper() {
    }

    @NotNull
    public final Bitmap bimapRound(@NotNull Bitmap bitmap, float f) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        float f2 = f + 5;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Theme getAodTheme(@NotNull DialWatchFace dialWatchFace) {
        DialEditEntity dialEditEntity;
        Object next;
        Theme theme;
        Intrinsics.checkNotNullParameter(dialWatchFace, "dialWatchFace");
        int themeIndex = dialWatchFace.getThemeIndex();
        List<Theme> normalThemeList = dialWatchFace.getNormalThemeList();
        Intrinsics.checkNotNull(normalThemeList);
        Theme theme2 = normalThemeList.get(themeIndex);
        List<Theme> aodThemeList = dialWatchFace.getAodThemeList();
        List<Theme> list = aodThemeList;
        if (list == null || list.isEmpty()) {
            return theme2;
        }
        Iterator<T> it = aodThemeList.iterator();
        do {
            dialEditEntity = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Theme) next).getName(), theme2.getName()));
        Theme theme3 = (Theme) next;
        if (theme3 != null) {
            theme3.setDialEditEntity(theme2.getDialEditEntity());
        } else {
            theme3 = aodThemeList.get(0);
            List<Theme> normalThemeList2 = dialWatchFace.getNormalThemeList();
            if (normalThemeList2 != null && (theme = normalThemeList2.get(0)) != null) {
                dialEditEntity = theme.getDialEditEntity();
            }
            theme3.setDialEditEntity(dialEditEntity);
        }
        return theme3;
    }

    @Nullable
    public final DialWatchFace getCurrentDiaWatchFace() {
        return currentDiaWatchFace;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140 A[LOOP:2: B:40:0x0122->B:45:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0144 A[EDGE_INSN: B:93:0x0144->B:47:0x0144 BREAK  A[LOOP:2: B:40:0x0122->B:45:0x0140], SYNTHETIC] */
    @Nullable
    public final List<Bitmap> getMovableBitmapList(@NotNull Theme theme, @NotNull DialWatchFace watchFace, int showWidth, int showHeight, @NotNull String filePath, float radius) {
        Map<String, Object> resourceMap;
        int positionCount;
        Iterator<Slot> it;
        int i;
        Matrix matrix;
        int selectWidgetIndex;
        Iterator it2;
        Object next;
        SlotEditItem slotEditItem;
        Iterator it3;
        Object obj;
        Image image;
        String src;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        ArrayList arrayList = new ArrayList();
        List<Slot> movableSlot = theme.getMovableSlot();
        if (movableSlot == null || (resourceMap = watchFace.getResourceMap()) == null || (positionCount = theme.getPositionCount()) <= 0) {
            return null;
        }
        DialEditEntity dialEditEntity = theme.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity);
        int width = (int) watchFace.getWidth();
        int height = (int) watchFace.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        String str = "createBitmap(...)";
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, width, height);
        RectF rectF = new RectF(rect);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect, paint);
        String dialResourceFilePath = DialFileUtils.INSTANCE.getDialResourceFilePath(filePath);
        int color = Color.parseColor("#000000");
        Matrix matrix2 = new Matrix();
        matrix2.setScale((showWidth * 1.0f) / width, (showHeight * 1.0f) / height);
        int i2 = 0;
        while (i2 < positionCount) {
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rectF, paint);
            Iterator<Slot> it4 = movableSlot.iterator();
            while (it4.hasNext()) {
                Slot next2 = it4.next();
                movableSlot = movableSlot;
                List<SlotPosition> positionList = next2.getPositionList();
                if (positionList != null) {
                    if (i2 >= 0) {
                        it = it4;
                        if (i2 < positionList.size()) {
                            SlotPosition slotPosition = positionList.get(i2);
                            String type = next2.getType();
                            i = positionCount;
                            int iHashCode = type.hashCode();
                            matrix = matrix2;
                            if (iHashCode != 3083120) {
                                if (iHashCode != 3148879) {
                                    if (iHashCode == 3560141 && type.equals("time")) {
                                        SlotEditItem timeSlotEditItem = dialEditEntity.getTimeSlotEditItem();
                                        Intrinsics.checkNotNull(timeSlotEditItem);
                                        selectWidgetIndex = timeSlotEditItem.getSelectWidgetIndex();
                                    } else {
                                        it2 = dialEditEntity.getSlotItemList().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                            it3 = it2;
                                            if (Intrinsics.areEqual(next2.getName(), ((SlotEditItem) next).getKeyName())) {
                                                break;
                                            }
                                            it2 = it3;
                                        }
                                        slotEditItem = (SlotEditItem) next;
                                        if (slotEditItem != null) {
                                            selectWidgetIndex = slotEditItem.getSelectWidgetIndex();
                                        } else {
                                            selectWidgetIndex = 0;
                                        }
                                    }
                                } else if (type.equals(SlotType.FONT)) {
                                    SlotEditItem fontSlotEditItem = dialEditEntity.getFontSlotEditItem();
                                    Intrinsics.checkNotNull(fontSlotEditItem);
                                    selectWidgetIndex = fontSlotEditItem.getSelectWidgetIndex();
                                } else {
                                    it2 = dialEditEntity.getSlotItemList().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                        it3 = it2;
                                        if (Intrinsics.areEqual(next2.getName(), ((SlotEditItem) next).getKeyName())) {
                                            break;
                                            break;
                                        }
                                        it2 = it3;
                                    }
                                    slotEditItem = (SlotEditItem) next;
                                    if (slotEditItem != null) {
                                        selectWidgetIndex = slotEditItem.getSelectWidgetIndex();
                                    } else {
                                        selectWidgetIndex = 0;
                                    }
                                }
                            } else if (type.equals(SlotType.DIAL)) {
                                SlotEditItem dialSlotEditItem = dialEditEntity.getDialSlotEditItem();
                                Intrinsics.checkNotNull(dialSlotEditItem);
                                selectWidgetIndex = dialSlotEditItem.getSelectWidgetIndex();
                            } else {
                                it2 = dialEditEntity.getSlotItemList().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    it3 = it2;
                                    if (Intrinsics.areEqual(next2.getName(), ((SlotEditItem) next).getKeyName())) {
                                        break;
                                        break;
                                    }
                                    it2 = it3;
                                }
                                slotEditItem = (SlotEditItem) next;
                                if (slotEditItem != null) {
                                    selectWidgetIndex = slotEditItem.getSelectWidgetIndex();
                                } else {
                                    selectWidgetIndex = 0;
                                }
                            }
                            if (selectWidgetIndex >= 0) {
                                List<SlotWidgetItem> itemList = next2.getItemList();
                                Intrinsics.checkNotNull(itemList);
                                if (selectWidgetIndex < itemList.size()) {
                                    List<SlotWidgetItem> itemList2 = next2.getItemList();
                                    Intrinsics.checkNotNull(itemList2);
                                    String ref = itemList2.get(selectWidgetIndex).getRef();
                                    if (ref != null && (obj = resourceMap.get(ref)) != null && (obj instanceof CustomWidget)) {
                                        String preview = ((CustomWidget) obj).getPreview();
                                        Object obj2 = (preview == null || StringsKt__StringsKt.isBlank(preview)) ? null : resourceMap.get(preview);
                                        if ((obj2 instanceof Image) && (src = (image = (Image) obj2).getSrc()) != null && !StringsKt__StringsKt.isBlank(src)) {
                                            File file = new File(dialResourceFilePath, image.getSrc());
                                            if (file.exists()) {
                                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                                                Matrix matrix3 = new Matrix();
                                                matrix3.postScale(1.83f, 1.83f);
                                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix3, true);
                                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, str);
                                                matrix3.reset();
                                                canvas.drawBitmap(bitmapCreateBitmap2, slotPosition.getX(), slotPosition.getY(), paint);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        it4 = it;
                        matrix2 = matrix;
                        positionCount = i;
                    } else {
                        it = it4;
                    }
                    i = positionCount;
                    matrix = matrix2;
                    it4 = it;
                    matrix2 = matrix;
                    positionCount = i;
                }
            }
            List<Slot> list = movableSlot;
            Matrix matrix4 = matrix2;
            String str2 = str;
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height, matrix4, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap3, str2);
            arrayList.add(bimapRound(bitmapCreateBitmap3, radius));
            i2++;
            str = str2;
            matrix2 = matrix4;
            movableSlot = list;
            paint = paint;
            color = color;
            canvas = canvas;
            bitmapCreateBitmap = bitmapCreateBitmap;
            rectF = rectF;
            positionCount = positionCount;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0199  */
    @NotNull
    public final List<Bitmap> getSlotBitmapList(@NotNull Theme theme, @NotNull DialWatchFace watchFace, int showWidth, int showHeight, @NotNull String filePath, @NotNull SlotEditItem slot, float radius) {
        Rect rect;
        Object next;
        Image image;
        String src;
        List<SlotPosition> list;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(slot, "slot");
        ArrayList arrayList = new ArrayList();
        List<Layout> layoutList = theme.getLayoutList();
        Intrinsics.checkNotNull(layoutList);
        Iterator<T> it = layoutList.iterator();
        do {
            rect = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Layout) next).getRef(), slot.getKeyName()));
        Layout layout = (Layout) next;
        if (layout == null) {
            return arrayList;
        }
        List<EditWidget> listWidget = slot.getListWidget();
        Map<String, Object> resourceMap = watchFace.getResourceMap();
        if (resourceMap == null) {
            return arrayList;
        }
        int width = (int) watchFace.getWidth();
        int height = (int) watchFace.getHeight();
        for (EditWidget editWidget : listWidget) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Rect rect2 = new Rect(0, 0, width, height);
            Paint paint = new Paint(1);
            canvas.drawBitmap(bitmapCreateBitmap, rect, rect2, paint);
            paint.setColor(Color.parseColor("#000000"));
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(new RectF(rect2), paint);
            Object obj = resourceMap.get(editWidget.getKeyName());
            if (obj != null) {
                if (obj instanceof CustomWidget) {
                    String preview = ((CustomWidget) obj).getPreview();
                    Object obj2 = (preview == null || StringsKt__StringsKt.isBlank(preview)) ? rect : resourceMap.get(preview);
                    if ((obj2 instanceof Image) && (src = (image = (Image) obj2).getSrc()) != null && !StringsKt__StringsKt.isBlank(src)) {
                        File file = new File(DialFileUtils.INSTANCE.getDialResourceFilePath(filePath), image.getSrc());
                        if (file.exists()) {
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                            float x = layout.getX();
                            float y = layout.getY();
                            List<SlotPosition> positionList = slot.getPositionList();
                            DialEditEntity dialEditEntity = theme.getDialEditEntity();
                            Integer numValueOf = dialEditEntity != null ? Integer.valueOf(dialEditEntity.getPositionIndex()) : null;
                            if (slot.getMovable() && (list = positionList) != null && !list.isEmpty() && numValueOf != null && numValueOf.intValue() >= 0) {
                                SlotPosition slotPosition = positionList.get(CollectionsKt__CollectionsKt.getIndices(list).contains(numValueOf.intValue()) ? numValueOf.intValue() : 0);
                                x = slotPosition.getX();
                                y = slotPosition.getY();
                            }
                            canvas.drawBitmap(bitmapDecodeFile, x, y, paint);
                            Matrix matrix = new Matrix();
                            matrix.setScale((showWidth * 1.0f) / width, (showHeight * 1.0f) / height);
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height, matrix, true);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
                            arrayList.add(bimapRound(bitmapCreateBitmap2, radius));
                        }
                    }
                }
                rect = null;
            }
        }
        return arrayList;
    }

    @Nullable
    public final Theme getTheme(@NotNull DialWatchFace dialWatchFace) {
        Intrinsics.checkNotNullParameter(dialWatchFace, "dialWatchFace");
        int themeIndex = dialWatchFace.getThemeIndex();
        List<Theme> normalThemeList = dialWatchFace.getNormalThemeList();
        if (normalThemeList != null) {
            return normalThemeList.get(themeIndex);
        }
        return null;
    }

    @Nullable
    public final Integer safeColorParse(@Nullable String colorStr) {
        try {
            return Integer.valueOf(Color.parseColor(colorStr));
        } catch (Exception e) {
            Logger.i(TAG, "color parse exception " + colorStr + ";" + e);
            return null;
        }
    }

    public final void setCurrentDiaWatchFace(@Nullable DialWatchFace dialWatchFace) {
        currentDiaWatchFace = dialWatchFace;
    }

    public final void watchFaceViewScale(@NotNull WatchFaceView watchFaceView, float scaleX, float scaleY) {
        Intrinsics.checkNotNullParameter(watchFaceView, "watchFaceView");
        watchFaceView.setScaleX(scaleX);
        watchFaceView.setScaleY(scaleY);
    }

    @NotNull
    public final Bitmap watchFaceViewToBitmap(@NotNull Context context, @NotNull Theme theme, @NotNull DialWatchFace dialWatchFace, int showWidth, int showHeight, @NotNull String filePath, @NotNull Bitmap.Config bitmapConfig, @Nullable Float radius, @Nullable FaceEditPhotoBean faceEditPhotoBean, boolean onlyForeground, boolean isPortrait, @Nullable String defaultVideoThumbPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(dialWatchFace, "dialWatchFace");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        int width = (int) dialWatchFace.getWidth();
        int height = (int) dialWatchFace.getHeight();
        View viewInflate = LayoutInflater.from(context).inflate(ovi.X, (ViewGroup) null, false);
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
        ((WatchFaceView) viewInflate.findViewById(isi.G2)).fillView(dialWatchFace, theme, filePath, (64 & 8) != 0 ? null : faceEditPhotoBean, (64 & 16) != 0 ? false : onlyForeground, (64 & 32) != 0 ? false : isPortrait, (64 & 64) != 0 ? 1.83f : 0.0f, (64 & 128) != 0 ? null : defaultVideoThumbPath);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmapConfig);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.setScale((showWidth * 1.0f) / width, (showHeight * 1.0f) / height);
        viewInflate.draw(canvas);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
        return radius != null ? bimapRound(bitmapCreateBitmap2, radius.floatValue()) : bitmapCreateBitmap2;
    }
}
