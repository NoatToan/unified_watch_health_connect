package com.xiaomi.fitness.watch.face.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.watch.face.adapter.FaceEditTabAdapter;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerAdapter;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseData;
import com.xiaomi.fitness.watch.face.edit.color.FaceEditColorGroupListData;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.Slot;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.entity.SlotPosition;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.font.FaceEditFontListData;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoListData;
import com.xiaomi.fitness.watch.face.edit.position.FaceEditPositionListData;
import com.xiaomi.fitness.watch.face.edit.slot.FaceEditSlotListData;
import com.xiaomi.fitness.watch.face.edit.style.FaceEditThemeListData;
import com.xiaomi.fitness.watch.face.edit.text.FaceEditTextListData;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditHelper;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.widget.FaceEditPicker;
import defpackage.isi;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.xli;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 h2\u00020\u0001:\u0001hB#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJX\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\b\b\u0002\u0010E\u001a\u00020\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010!J(\u0010G\u001a\u00020H2\u0006\u0010=\u001a\u00020!2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0006\u0010@\u001a\u00020AH\u0002J(\u0010I\u001a\u00020H2\u0006\u0010=\u001a\u00020!2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0006\u0010@\u001a\u00020AH\u0002J\"\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020M2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020!H\u0002J0\u0010N\u001a\u00020O2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020M0C2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020!2\b\u0010F\u001a\u0004\u0018\u00010!H\u0002J \u0010Q\u001a\u00020R2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u0010T\u001a\u00020\u0007H\u0002J(\u0010U\u001a\u00020V2\u0006\u0010L\u001a\u00020M2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020!2\u0006\u0010W\u001a\u00020XH\u0002J#\u0010Y\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u0018¢\u0006\u0002\u0010[J/\u0010\\\u001a\u00020\u001a2\"\u0010Z\u001a\u001e\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u001a0\u001ej\u0002`\u001d¢\u0006\u0002\u0010]J\u001d\u0010^\u001a\u00020\u001a2\u0010\u0010Z\u001a\f\u0012\u0004\u0012\u00020\u001a0'j\u0002`&¢\u0006\u0002\u0010_J#\u0010`\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`$¢\u0006\u0002\u0010[J#\u0010a\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`*¢\u0006\u0002\u0010[J#\u0010b\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`,¢\u0006\u0002\u0010[J#\u0010c\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`.¢\u0006\u0002\u0010[J#\u0010d\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`0¢\u0006\u0002\u0010[J#\u0010e\u001a\u00020\u001a2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`2¢\u0006\u0002\u0010[J\u001d\u0010f\u001a\u00020\u001a2\u0010\u0010Z\u001a\f\u0012\u0004\u0012\u00020\u001a0'j\u0002`4¢\u0006\u0002\u0010_J\b\u0010g\u001a\u00020\u001aH\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR0\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001ej\u0004\u0018\u0001`\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R$\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`$X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0018\u00010'j\u0004\u0018\u0001`&X\u0082\u000e¢\u0006\u0004\n\u0002\u0010(R$\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`*X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR$\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`,X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR$\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`.X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR$\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`0X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR$\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0004\u0018\u0001`2X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0018\u00010'j\u0004\u0018\u0001`4X\u0082\u000e¢\u0006\u0004\n\u0002\u0010(R\u000e\u00105\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/FaceEditPicker;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tabRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTabRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "contentRecyclerView", "contentScrollView", "Landroidx/core/widget/NestedScrollView;", "getContentScrollView", "()Landroidx/core/widget/NestedScrollView;", "typeAdapter", "Lcom/xiaomi/fitness/watch/face/adapter/FaceEditTabAdapter;", "contentAdapter", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerAdapter;", "onFaceEditTypeChooseListener", "Lcom/xiaomi/fitness/watch/face/widget/OnFaceEditTypeChooseListener;", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "onFaceEditTextChangeListener", "Lcom/xiaomi/fitness/watch/face/edit/text/OnTextChangeListener;", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "", "", "Lkotlin/jvm/functions/Function2;", "onStyleSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/style/OnStyleSelectListener;", "onPhotoClickListener", "Lcom/xiaomi/fitness/watch/face/edit/photo/OnPhotoClickListener;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onPositionSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/position/OnPositionSelectListener;", "onFaceEditFontStyleSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontStyleSelectListener;", "onFaceEditFontColorSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontColorSelectListener;", "onColorGroupSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/color/OnColorGroupSelectListener;", "onFaceEditSlotClickListener", "Lcom/xiaomi/fitness/watch/face/edit/slot/OnFaceEditSlotClickListener;", "onVideoClickListener", "Lcom/xiaomi/fitness/watch/face/edit/video/OnVideoClickListener;", "commonEditItemWidth", "commonEditItemHeight", "commonEditItemRadius", "", "setData", "editingWatchFace", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "unzipPath", "photoId", Feature.WATCHFACE, "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "needMerge", "", "photoBeanList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "refreshType", "defaultVideoThumbPath", "addIfContainsAlbum", "Lcom/xiaomi/fitness/watch/face/edit/photo/FaceEditPhotoListData;", "addIfContainsVideo", "addIfContainsPosition", "Lcom/xiaomi/fitness/watch/face/edit/position/FaceEditPositionListData;", "theme", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "addIfContainsTheme", "Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditThemeListData;", "normalThemeList", "addIfContainsColorGroup", "Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorGroupListData;", "list", "index", "addIfContainsFont", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontListData;", "dialEditEntity", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialEditEntity;", "setOnTypeChooseListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function1;)V", "setOnTextChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "setOnPhotoClickListener", "(Lkotlin/jvm/functions/Function0;)V", "setOnStyleSelectListener", "setOnPositionSelectListener", "setOnFaceEditFontStyleSelectListener", "setOnFaceEditFontColorSelectListener", "setOnColorGroupSelectListener", "setOnFaceEditSlotClickListener", "setOnVideoClickListener", "addListener", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceEditPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPicker.kt\ncom/xiaomi/fitness/watch/face/widget/FaceEditPicker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n1872#2,3:448\n*S KotlinDebug\n*F\n+ 1 FaceEditPicker.kt\ncom/xiaomi/fitness/watch/face/widget/FaceEditPicker\n*L\n305#1:448,3\n*E\n"})
public final class FaceEditPicker extends LinearLayout {

    @NotNull
    private static final String TAG = "FaceEditPicker";
    private final int commonEditItemHeight;
    private final float commonEditItemRadius;
    private final int commonEditItemWidth;

    @NotNull
    private final FaceEditPickerAdapter contentAdapter;

    @NotNull
    private final RecyclerView contentRecyclerView;

    @NotNull
    private final NestedScrollView contentScrollView;

    @Nullable
    private Function1<? super Integer, Unit> onColorGroupSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditFontColorSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditFontStyleSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditSlotClickListener;

    @Nullable
    private Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> onFaceEditTextChangeListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditTypeChooseListener;

    @Nullable
    private Function0<Unit> onPhotoClickListener;

    @Nullable
    private Function1<? super Integer, Unit> onPositionSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onStyleSelectListener;

    @Nullable
    private Function0<Unit> onVideoClickListener;

    @NotNull
    private final RecyclerView tabRecyclerView;

    @NotNull
    private final FaceEditTabAdapter typeAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceEditPicker(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final FaceEditPhotoListData addIfContainsAlbum(String photoId, List<FaceEditPhotoBean> photoBeanList, boolean needMerge) {
        FaceEditPhotoListData faceEditPhotoListData = new FaceEditPhotoListData(1, p1j.U);
        faceEditPhotoListData.setPhotoId(photoId);
        faceEditPhotoListData.setPhotoBeanList(photoBeanList);
        faceEditPhotoListData.setNeedMergeLocalList(needMerge);
        return faceEditPhotoListData;
    }

    private final FaceEditColorGroupListData addIfContainsColorGroup(List<String> list, int index) {
        FaceEditColorGroupListData faceEditColorGroupListData = new FaceEditColorGroupListData(6, p1j.S);
        faceEditColorGroupListData.setColorGroupList(list);
        faceEditColorGroupListData.setSelectIndex(index);
        return faceEditColorGroupListData;
    }

    private final FaceEditFontListData addIfContainsFont(Theme theme, DialWatchFace editingWatchFace, String unzipPath, DialEditEntity dialEditEntity) {
        FaceEditFontListData faceEditFontListData = new FaceEditFontListData(5, p1j.T);
        DialEditHelper dialEditHelper = DialEditHelper.INSTANCE;
        int i = this.commonEditItemWidth;
        int i2 = this.commonEditItemHeight;
        SlotEditItem fontSlotEditItem = dialEditEntity.getFontSlotEditItem();
        Intrinsics.checkNotNull(fontSlotEditItem);
        faceEditFontListData.setFontList(dialEditHelper.getSlotBitmapList(theme, editingWatchFace, i, i2, unzipPath, fontSlotEditItem, this.commonEditItemRadius));
        SlotEditItem fontSlotEditItem2 = dialEditEntity.getFontSlotEditItem();
        Intrinsics.checkNotNull(fontSlotEditItem2);
        faceEditFontListData.setSelect(fontSlotEditItem2.getSelectWidgetIndex());
        return faceEditFontListData;
    }

    private final FaceEditPositionListData addIfContainsPosition(Theme theme, DialWatchFace editingWatchFace, String unzipPath) {
        List<Bitmap> movableBitmapList = DialEditHelper.INSTANCE.getMovableBitmapList(theme, editingWatchFace, this.commonEditItemWidth, this.commonEditItemHeight, unzipPath, this.commonEditItemRadius);
        List<Bitmap> list = movableBitmapList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        FaceEditPositionListData faceEditPositionListData = new FaceEditPositionListData(4, p1j.V);
        faceEditPositionListData.setPositionList(movableBitmapList);
        DialEditEntity dialEditEntity = theme.getDialEditEntity();
        faceEditPositionListData.setSelect(dialEditEntity != null ? dialEditEntity.getPositionIndex() : 0);
        return faceEditPositionListData;
    }

    private final FaceEditThemeListData addIfContainsTheme(List<Theme> normalThemeList, DialWatchFace editingWatchFace, String unzipPath, String defaultVideoThumbPath) {
        FaceEditThemeListData faceEditThemeListData = new FaceEditThemeListData(2, p1j.Y);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : normalThemeList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DialEditHelper dialEditHelper = DialEditHelper.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(dialEditHelper.watchFaceViewToBitmap(context, normalThemeList.get(i), editingWatchFace, this.commonEditItemWidth, this.commonEditItemHeight, unzipPath, (3392 & 64) != 0 ? Bitmap.Config.ARGB_8888 : null, (3392 & 128) != 0 ? null : Float.valueOf(this.commonEditItemRadius), (3392 & 256) != 0 ? null : null, (3392 & 512) != 0 ? false : false, (3392 & 1024) != 0 ? false : false, (3392 & 2048) != 0 ? null : defaultVideoThumbPath));
            i = i2;
        }
        faceEditThemeListData.setThemeList(arrayList);
        faceEditThemeListData.setSelect(editingWatchFace.getThemeIndex());
        faceEditThemeListData.setVideoBg(defaultVideoThumbPath);
        return faceEditThemeListData;
    }

    private final FaceEditPhotoListData addIfContainsVideo(String photoId, List<FaceEditPhotoBean> photoBeanList, boolean needMerge) {
        FaceEditPhotoListData faceEditPhotoListData = new FaceEditPhotoListData(10, p1j.U);
        faceEditPhotoListData.setPhotoId(photoId);
        faceEditPhotoListData.setPhotoBeanList(photoBeanList);
        faceEditPhotoListData.setNeedMergeLocalList(needMerge);
        return faceEditPhotoListData;
    }

    private final void addListener() {
        this.typeAdapter.setOnTypeSelectListener(new Function1() { // from class: qu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$10(this.f31849a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnTextChangeListener(new Function2() { // from class: ru8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceEditPicker.addListener$lambda$11(this.f32910a, (FaceEditLiteralBean) obj, (List) obj2);
            }
        });
        this.contentAdapter.setOnPhotoClickListener(new Function0() { // from class: su8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditPicker.addListener$lambda$12(this.f33991a);
            }
        });
        this.contentAdapter.setOnStyleSelectListener(new Function1() { // from class: tu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$13(this.f35050a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnPositionSelectListener(new Function1() { // from class: uu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$14(this.f36151a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnFaceEditFontStyleSelectListener(new Function1() { // from class: vu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$15(this.f37231a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnFaceEditFontColorSelectListener(new Function1() { // from class: wu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$16(this.f38360a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnColorGroupSelectListener(new Function1() { // from class: xu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$17(this.f39475a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnFaceEditSlotClickListener(new Function1() { // from class: yu8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceEditPicker.addListener$lambda$18(this.f40563a, ((Integer) obj).intValue());
            }
        });
        this.contentAdapter.setOnVideoClickListener(new Function0() { // from class: zu8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceEditPicker.addListener$lambda$19(this.f41686a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$10(FaceEditPicker this$0, int i) {
        View childAt;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditTypeChooseListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        View childAt2 = this$0.contentRecyclerView.getChildAt(i);
        int y = (int) childAt2.getY();
        RecyclerView.o layoutManager = this$0.contentRecyclerView.getLayoutManager();
        Integer numValueOf = layoutManager != null ? Integer.valueOf(layoutManager.getItemViewType(childAt2)) : null;
        if (numValueOf == null || numValueOf.intValue() != 1) {
            TextView textView = (TextView) childAt2.findViewById(isi.v2);
            int height = textView != null ? textView.getHeight() : 0;
            ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            ViewGroup.LayoutParams layoutParams = (viewGroup == null || (childAt = viewGroup.getChildAt(1)) == null) ? null : childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            y += height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        this$0.contentScrollView.setScrollY(y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$11(FaceEditPicker this$0, FaceEditLiteralBean bean, List textList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(textList, "textList");
        Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> function2 = this$0.onFaceEditTextChangeListener;
        if (function2 != null) {
            function2.invoke(bean, textList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$12(FaceEditPicker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onPhotoClickListener;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$13(FaceEditPicker this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onStyleSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$14(FaceEditPicker this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onPositionSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$15(FaceEditPicker this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditFontStyleSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$16(FaceEditPicker this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditFontColorSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$17(FaceEditPicker this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onColorGroupSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$18(FaceEditPicker this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditSlotClickListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$19(FaceEditPicker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onVideoClickListener;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final NestedScrollView getContentScrollView() {
        return this.contentScrollView;
    }

    @NotNull
    public final RecyclerView getTabRecyclerView() {
        return this.tabRecyclerView;
    }

    public final void setData(@NotNull DialWatchFace editingWatchFace, @NotNull String unzipPath, @NotNull String photoId, @NotNull WatchFace watchface, boolean needMerge, @Nullable List<FaceEditPhotoBean> photoBeanList, int refreshType, @Nullable String defaultVideoThumbPath) {
        List<Slot> movableSlot;
        FaceEditPositionListData faceEditPositionListDataAddIfContainsPosition;
        FaceEditPhotoListData faceEditPhotoListDataAddIfContainsVideo;
        FaceEditPhotoListData faceEditPhotoListDataAddIfContainsAlbum;
        List<FaceEditLiteralBean> textItemList;
        List<String> arrayList;
        Intrinsics.checkNotNullParameter(editingWatchFace, "editingWatchFace");
        Intrinsics.checkNotNullParameter(unzipPath, "unzipPath");
        Intrinsics.checkNotNullParameter(photoId, "photoId");
        Intrinsics.checkNotNullParameter(watchface, "watchface");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<Theme> normalThemeList = editingWatchFace.getNormalThemeList();
        List<Theme> list = normalThemeList;
        if (list == null || list.isEmpty()) {
            return;
        }
        arrayList3.clear();
        arrayList2.clear();
        Theme theme = normalThemeList.get(editingWatchFace.getThemeIndex());
        Logger.i(TAG, "select " + theme + " index: " + editingWatchFace.getThemeIndex());
        DialEditEntity dialEditEntity = theme.getDialEditEntity();
        if (dialEditEntity == null) {
            return;
        }
        if (editingWatchFace.getSupportLiteral() && (textItemList = dialEditEntity.getTextItemList()) != null && !textItemList.isEmpty()) {
            FaceEditTextListData faceEditTextListData = new FaceEditTextListData(9, 0);
            ArrayList arrayList4 = new ArrayList();
            List<FaceEditLiteralBean> textItemList2 = dialEditEntity.getTextItemList();
            Intrinsics.checkNotNull(textItemList2);
            arrayList4.addAll(textItemList2);
            faceEditTextListData.setTextEditBeanList(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4));
            List<String> textList = editingWatchFace.getTextList();
            if (textList == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) textList)) == null) {
                arrayList = new ArrayList<>();
            }
            faceEditTextListData.setTextList(arrayList);
            arrayList2.add(faceEditTextListData);
            arrayList3.add(9);
        }
        if (theme.isPhotoAlbumWatchface()) {
            if (photoBeanList != null) {
                faceEditPhotoListDataAddIfContainsAlbum = addIfContainsAlbum(photoId, photoBeanList, needMerge);
            } else {
                ArrayList<FaceEditPhotoBean> imageGroupList = watchface.getImageGroupList();
                Intrinsics.checkNotNull(imageGroupList);
                faceEditPhotoListDataAddIfContainsAlbum = addIfContainsAlbum(photoId, imageGroupList, needMerge);
            }
            arrayList2.add(faceEditPhotoListDataAddIfContainsAlbum);
            arrayList3.add(1);
        }
        if (theme.isVideoWatchFace()) {
            if (photoBeanList != null) {
                faceEditPhotoListDataAddIfContainsVideo = addIfContainsVideo(photoId, photoBeanList, needMerge);
            } else {
                ArrayList<FaceEditPhotoBean> imageGroupList2 = watchface.getImageGroupList();
                Intrinsics.checkNotNull(imageGroupList2);
                faceEditPhotoListDataAddIfContainsVideo = addIfContainsVideo(photoId, imageGroupList2, needMerge);
            }
            arrayList2.add(faceEditPhotoListDataAddIfContainsVideo);
            arrayList3.add(10);
        }
        arrayList2.add(addIfContainsTheme(normalThemeList, editingWatchFace, unzipPath, defaultVideoThumbPath));
        arrayList3.add(2);
        if (theme.getFg() == null && (movableSlot = theme.getMovableSlot()) != null && !movableSlot.isEmpty() && dialEditEntity.getPositionIndex() >= 0 && (faceEditPositionListDataAddIfContainsPosition = addIfContainsPosition(theme, editingWatchFace, unzipPath)) != null) {
            arrayList2.add(faceEditPositionListDataAddIfContainsPosition);
            arrayList3.add(4);
        }
        if (dialEditEntity.getFontSlotEditItem() != null) {
            arrayList2.add(addIfContainsFont(theme, editingWatchFace, unzipPath, dialEditEntity));
            arrayList3.add(5);
        }
        if (dialEditEntity.getColorGroupIndex() >= 0) {
            arrayList2.add(addIfContainsColorGroup(theme.getColorGroupTable(), dialEditEntity.getColorGroupIndex()));
            arrayList3.add(6);
        } else if (dialEditEntity.getRecolorIndex() >= 0) {
            arrayList2.add(addIfContainsColorGroup(editingWatchFace.getRecolorTable(), dialEditEntity.getRecolorIndex()));
            arrayList3.add(6);
        }
        DialEditEntity dialEditEntity2 = theme.getDialEditEntity();
        List<SlotEditItem> slotItemList = dialEditEntity2 != null ? dialEditEntity2.getSlotItemList() : null;
        List<SlotEditItem> list2 = slotItemList;
        if (list2 != null && !list2.isEmpty()) {
            FaceEditSlotListData faceEditSlotListData = new FaceEditSlotListData(8, p1j.X);
            ArrayList arrayList5 = new ArrayList();
            for (SlotEditItem slotEditItem : slotItemList) {
                if (slotEditItem.getListWidget().size() > 1) {
                    String keyName = slotEditItem.getKeyName();
                    boolean movable = slotEditItem.getMovable();
                    int selectWidgetIndex = slotEditItem.getSelectWidgetIndex();
                    List list3 = CollectionsKt___CollectionsKt.toList(slotEditItem.getListWidget());
                    List<SlotPosition> positionList = slotEditItem.getPositionList();
                    arrayList5.add(new SlotEditItem(keyName, movable, selectWidgetIndex, list3, positionList != null ? CollectionsKt___CollectionsKt.toList(positionList) : null));
                }
            }
            faceEditSlotListData.setSlotWidgetList(CollectionsKt___CollectionsKt.toList(arrayList5));
            if (!faceEditSlotListData.getSlotWidgetList().isEmpty()) {
                arrayList2.add(faceEditSlotListData);
                arrayList3.add(8);
            }
        }
        if (!arrayList2.isEmpty()) {
            ((FaceEditPickerBaseData) arrayList2.get(0)).setFirstData(true);
        }
        this.contentAdapter.submitList(arrayList2);
        this.typeAdapter.setTypeList(arrayList3);
    }

    public final void setOnColorGroupSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onColorGroupSelectListener = listener;
    }

    public final void setOnFaceEditFontColorSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditFontColorSelectListener = listener;
    }

    public final void setOnFaceEditFontStyleSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditFontStyleSelectListener = listener;
    }

    public final void setOnFaceEditSlotClickListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditSlotClickListener = listener;
    }

    public final void setOnPhotoClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPhotoClickListener = listener;
    }

    public final void setOnPositionSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPositionSelectListener = listener;
    }

    public final void setOnStyleSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onStyleSelectListener = listener;
    }

    public final void setOnTextChangeListener(@NotNull Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditTextChangeListener = listener;
    }

    public final void setOnTypeChooseListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditTypeChooseListener = listener;
    }

    public final void setOnVideoClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onVideoClickListener = listener;
    }

    public /* synthetic */ FaceEditPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceEditPicker(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewInflate = LayoutInflater.from(context).inflate(ovi.x, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(isi.t2);
        this.tabRecyclerView = recyclerView;
        this.contentScrollView = (NestedScrollView) viewInflate.findViewById(isi.G);
        FaceEditTabAdapter faceEditTabAdapter = new FaceEditTabAdapter();
        this.typeAdapter = faceEditTabAdapter;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(faceEditTabAdapter);
        recyclerView.addItemDecoration(new FaceEditTypeItemDecoration());
        RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(isi.F);
        this.contentRecyclerView = recyclerView2;
        boolean zIsTabletAndLandscape = UIUtils.INSTANCE.isTabletAndLandscape(context);
        int i2 = zIsTabletAndLandscape ? 6 : 3;
        FaceEditPickerAdapter faceEditPickerAdapter = new FaceEditPickerAdapter(zIsTabletAndLandscape);
        this.contentAdapter = faceEditPickerAdapter;
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView2.setAdapter(faceEditPickerAdapter);
        recyclerView2.setItemAnimator(null);
        addListener();
        int screenWidth = DisplayUtil.getScreenWidth();
        int dp = ((((zIsTabletAndLandscape ? screenWidth - ExtUtilsKt.getDp(432) : screenWidth) - (ApplicationExtKt.getApplication().getResources().getDimensionPixelSize(xli.f39245a) * 2)) - ((i2 - 1) * ApplicationExtKt.getApplication().getResources().getDimensionPixelSize(xli.c))) / i2) - (ExtUtilsKt.getDp(6) * 2);
        this.commonEditItemWidth = dp;
        float f = dp;
        this.commonEditItemHeight = (int) (FaceIcon.SIZE_RATE * f);
        this.commonEditItemRadius = (FaceIcon.ORI_RADIUS / FaceIcon.ORI_WIDTH) * f;
    }
}
