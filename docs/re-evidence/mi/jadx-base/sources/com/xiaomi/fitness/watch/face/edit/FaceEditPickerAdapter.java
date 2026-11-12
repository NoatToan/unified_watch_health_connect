package com.xiaomi.fitness.watch.face.edit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerAdapter;
import com.xiaomi.fitness.watch.face.edit.color.FaceEditColorGroupListData;
import com.xiaomi.fitness.watch.face.edit.color.FaceEditColorHolder;
import com.xiaomi.fitness.watch.face.edit.entity.EditWidget;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.font.FaceEditFontHolder;
import com.xiaomi.fitness.watch.face.edit.font.FaceEditFontListData;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHolder;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoListData;
import com.xiaomi.fitness.watch.face.edit.position.FaceEditPositionHolder;
import com.xiaomi.fitness.watch.face.edit.position.FaceEditPositionListData;
import com.xiaomi.fitness.watch.face.edit.slot.FaceEditSlotHolder;
import com.xiaomi.fitness.watch.face.edit.slot.FaceEditSlotListData;
import com.xiaomi.fitness.watch.face.edit.style.FaceEditStyleHolder;
import com.xiaomi.fitness.watch.face.edit.style.FaceEditThemeListData;
import com.xiaomi.fitness.watch.face.edit.text.FaceEditTextHolder;
import com.xiaomi.fitness.watch.face.edit.text.FaceEditTextListData;
import com.xiaomi.fitness.watch.face.edit.video.FaceEditVideoHolder;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import defpackage.f19;
import defpackage.h29;
import defpackage.l19;
import defpackage.n29;
import defpackage.p19;
import defpackage.r29;
import defpackage.x19;
import defpackage.z19;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0011\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b<\u0010=J1\u0010\u000b\u001a\u00020\b2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\rj\u0002`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0016¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u0019\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0018¢\u0006\u0004\b\u0019\u0010\u0015J%\u0010\u001b\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u001a¢\u0006\u0004\b\u001b\u0010\u0015J%\u0010\u001d\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u001c¢\u0006\u0004\b\u001d\u0010\u0015J%\u0010\u001f\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u001e¢\u0006\u0004\b\u001f\u0010\u0015J\u001f\u0010!\u001a\u00020\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\rj\u0002` ¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R6\u00100\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004j\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00102\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R*\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R*\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011j\u0004\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R*\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011j\u0004\u0018\u0001`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R*\u00109\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011j\u0004\u0018\u0001`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105R*\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011j\u0004\u0018\u0001`\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0004\u0018\u0001` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "", "", "", "Lcom/xiaomi/fitness/watch/face/edit/text/OnTextChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTextChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "Lcom/xiaomi/fitness/watch/face/edit/photo/OnPhotoClickListener;", "setOnPhotoClickListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/watch/face/edit/style/OnStyleSelectListener;", "setOnStyleSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/watch/face/edit/position/OnPositionSelectListener;", "setOnPositionSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontStyleSelectListener;", "setOnFaceEditFontStyleSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontColorSelectListener;", "setOnFaceEditFontColorSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/color/OnColorGroupSelectListener;", "setOnColorGroupSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/slot/OnFaceEditSlotClickListener;", "setOnFaceEditSlotClickListener", "Lcom/xiaomi/fitness/watch/face/edit/video/OnVideoClickListener;", "setOnVideoClickListener", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;I)V", "getItemViewType", "(I)I", "", "isTablet", "Z", "onTextChangeListener", "Lkotlin/jvm/functions/Function2;", "onPhotoClickListener", "Lkotlin/jvm/functions/Function0;", "onStyleSelectListener", "Lkotlin/jvm/functions/Function1;", "onPositionSelectListener", "onFaceEditFontStyleSelectListener", "onFaceEditFontColorSelectListener", "onColorGroupSelectListener", "onFaceEditSlotClickListener", "onVideoClickListener", "<init>", "(Z)V", "DiffCallback", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditPickerAdapter extends p<FaceEditPickerBaseData, FaceEditPickerBaseHolder> {
    private final boolean isTablet;

    @Nullable
    private Function1<? super Integer, Unit> onColorGroupSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditFontColorSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditFontStyleSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditSlotClickListener;

    @Nullable
    private Function0<Unit> onPhotoClickListener;

    @Nullable
    private Function1<? super Integer, Unit> onPositionSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onStyleSelectListener;

    @Nullable
    private Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> onTextChangeListener;

    @Nullable
    private Function0<Unit> onVideoClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;)Z", "areContentsTheSame", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<FaceEditPickerBaseData> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull FaceEditPickerBaseData oldItem, @NotNull FaceEditPickerBaseData newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof FaceEditTextListData) && (newItem instanceof FaceEditTextListData)) {
                return true;
            }
            if ((oldItem instanceof FaceEditPhotoListData) && (newItem instanceof FaceEditPhotoListData)) {
                return Intrinsics.areEqual(((FaceEditPhotoListData) oldItem).getPhotoBeanList(), ((FaceEditPhotoListData) newItem).getPhotoBeanList());
            }
            if (!(oldItem instanceof FaceEditThemeListData) || !(newItem instanceof FaceEditThemeListData)) {
                if ((oldItem instanceof FaceEditPositionListData) && (newItem instanceof FaceEditPositionListData)) {
                    FaceEditPositionListData faceEditPositionListData = (FaceEditPositionListData) oldItem;
                    FaceEditPositionListData faceEditPositionListData2 = (FaceEditPositionListData) newItem;
                    if (Intrinsics.areEqual(faceEditPositionListData.getPositionList(), faceEditPositionListData2.getPositionList()) && faceEditPositionListData.getSelect() == faceEditPositionListData2.getSelect()) {
                        return true;
                    }
                } else if ((oldItem instanceof FaceEditColorGroupListData) && (newItem instanceof FaceEditColorGroupListData)) {
                    FaceEditColorGroupListData faceEditColorGroupListData = (FaceEditColorGroupListData) oldItem;
                    FaceEditColorGroupListData faceEditColorGroupListData2 = (FaceEditColorGroupListData) newItem;
                    if (Intrinsics.areEqual(faceEditColorGroupListData.getColorGroupList(), faceEditColorGroupListData2.getColorGroupList()) && faceEditColorGroupListData.getSelectIndex() == faceEditColorGroupListData2.getSelectIndex()) {
                        return true;
                    }
                } else if ((oldItem instanceof FaceEditSlotListData) && (newItem instanceof FaceEditSlotListData)) {
                    FaceEditSlotListData faceEditSlotListData = (FaceEditSlotListData) oldItem;
                    FaceEditSlotListData faceEditSlotListData2 = (FaceEditSlotListData) newItem;
                    if (faceEditSlotListData.getSlotWidgetList().size() != faceEditSlotListData2.getSlotWidgetList().size()) {
                        return false;
                    }
                    List<SlotEditItem> slotWidgetList = faceEditSlotListData.getSlotWidgetList();
                    List<SlotEditItem> slotWidgetList2 = faceEditSlotListData2.getSlotWidgetList();
                    int size = slotWidgetList.size();
                    for (int i = 0; i < size; i++) {
                        List<EditWidget> listWidget = slotWidgetList.get(i).getListWidget();
                        List<EditWidget> listWidget2 = slotWidgetList2.get(i).getListWidget();
                        if (slotWidgetList.get(i).getSelectWidgetIndex() != slotWidgetList2.get(i).getSelectWidgetIndex() || listWidget.size() != listWidget2.size()) {
                            return false;
                        }
                        int size2 = listWidget.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (!Intrinsics.areEqual(listWidget.get(i2).getKeyName(), listWidget2.get(i2).getKeyName())) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull FaceEditPickerBaseData oldItem, @NotNull FaceEditPickerBaseData newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getType() == newItem.getType();
        }
    }

    public FaceEditPickerAdapter() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(FaceEditPickerAdapter this$0, FaceEditLiteralBean bean, List textList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(textList, "textList");
        Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> function2 = this$0.onTextChangeListener;
        if (function2 != null) {
            function2.invoke(bean, textList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(FaceEditPickerAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onPhotoClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3(FaceEditPickerAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onStyleSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(FaceEditPickerAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onPositionSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$5(FaceEditPickerAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditFontStyleSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(FaceEditPickerAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditFontColorSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7(FaceEditPickerAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onColorGroupSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$8(FaceEditPickerAdapter this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Integer, Unit> function1 = this$0.onFaceEditSlotClickListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$9(FaceEditPickerAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onVideoClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getType();
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
        this.onTextChangeListener = listener;
    }

    public final void setOnVideoClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onVideoClickListener = listener;
    }

    public /* synthetic */ FaceEditPickerAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditPickerBaseHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof FaceEditTextHolder) {
            FaceEditPickerBaseData item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.text.FaceEditTextListData");
            FaceEditTextHolder faceEditTextHolder = (FaceEditTextHolder) holder;
            faceEditTextHolder.setTextList((FaceEditTextListData) item);
            faceEditTextHolder.setOnTextChangeListener(new Function2() { // from class: av8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$0(this.f3482a, (FaceEditLiteralBean) obj, (List) obj2);
                }
            });
            return;
        }
        if (holder instanceof FaceEditPhotoHolder) {
            FaceEditPickerBaseData item2 = getItem(position);
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoListData");
            FaceEditPhotoListData faceEditPhotoListData = (FaceEditPhotoListData) item2;
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: bv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditPickerAdapter.onBindViewHolder$lambda$1(this.f4635a, view);
                }
            });
            List<FaceEditPhotoBean> photoBeanList = faceEditPhotoListData.getPhotoBeanList();
            if (photoBeanList != null) {
                ((FaceEditPhotoHolder) holder).setPhotoList(faceEditPhotoListData.getPhotoId(), photoBeanList, faceEditPhotoListData.getNeedMergeLocalList());
                return;
            }
            return;
        }
        if (holder instanceof FaceEditStyleHolder) {
            FaceEditPickerBaseData item3 = getItem(position);
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.style.FaceEditThemeListData");
            FaceEditStyleHolder faceEditStyleHolder = (FaceEditStyleHolder) holder;
            faceEditStyleHolder.setStyleList((FaceEditThemeListData) item3);
            faceEditStyleHolder.setOnStyleSelectListener(new Function1() { // from class: cv8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$3(this.f14767a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (holder instanceof FaceEditPositionHolder) {
            FaceEditPickerBaseData item4 = getItem(position);
            Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.position.FaceEditPositionListData");
            FaceEditPositionHolder faceEditPositionHolder = (FaceEditPositionHolder) holder;
            faceEditPositionHolder.setPositionList((FaceEditPositionListData) item4);
            faceEditPositionHolder.setonPositionSelectListener(new Function1() { // from class: dv8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$4(this.f15958a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (holder instanceof FaceEditFontHolder) {
            FaceEditFontHolder faceEditFontHolder = (FaceEditFontHolder) holder;
            faceEditFontHolder.setOnFaceEditFontStyleSelectListener(new Function1() { // from class: ev8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$5(this.f17096a, ((Integer) obj).intValue());
                }
            });
            faceEditFontHolder.setOnFaceEditFontColorSelectListener(new Function1() { // from class: fv8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$6(this.f18283a, ((Integer) obj).intValue());
                }
            });
            FaceEditPickerBaseData item5 = getItem(position);
            Intrinsics.checkNotNull(item5, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.font.FaceEditFontListData");
            faceEditFontHolder.setFontList((FaceEditFontListData) item5);
            return;
        }
        if (holder instanceof FaceEditColorHolder) {
            FaceEditPickerBaseData item6 = getItem(position);
            Intrinsics.checkNotNull(item6, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.color.FaceEditColorGroupListData");
            FaceEditColorHolder faceEditColorHolder = (FaceEditColorHolder) holder;
            faceEditColorHolder.setOnColorGroupSelectListener(new Function1() { // from class: gv8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$7(this.f19363a, ((Integer) obj).intValue());
                }
            });
            faceEditColorHolder.setColorGroupList((FaceEditColorGroupListData) item6);
            return;
        }
        if (holder instanceof FaceEditSlotHolder) {
            FaceEditPickerBaseData item7 = getItem(position);
            Intrinsics.checkNotNull(item7, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.slot.FaceEditSlotListData");
            FaceEditSlotHolder faceEditSlotHolder = (FaceEditSlotHolder) holder;
            faceEditSlotHolder.setSlotList((FaceEditSlotListData) item7);
            faceEditSlotHolder.setOnFaceEditSlotClickListener(new Function1() { // from class: hv8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPickerAdapter.onBindViewHolder$lambda$8(this.f20505a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (holder instanceof FaceEditVideoHolder) {
            FaceEditPickerBaseData item8 = getItem(position);
            Intrinsics.checkNotNull(item8, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoListData");
            FaceEditPhotoListData faceEditPhotoListData2 = (FaceEditPhotoListData) item8;
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: iv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditPickerAdapter.onBindViewHolder$lambda$9(this.f22124a, view);
                }
            });
            List<FaceEditPhotoBean> photoBeanList2 = faceEditPhotoListData2.getPhotoBeanList();
            if (photoBeanList2 != null) {
                ((FaceEditVideoHolder) holder).setVideoList(faceEditPhotoListData2.getPhotoId(), photoBeanList2, faceEditPhotoListData2.getNeedMergeLocalList());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditPickerBaseHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            p19 p19VarA0 = p19.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(p19VarA0, "inflate(...)");
            return new FaceEditPhotoHolder(p19VarA0);
        }
        if (viewType == 4) {
            x19 x19VarA0 = x19.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(x19VarA0, "inflate(...)");
            return new FaceEditPositionHolder(x19VarA0, this.isTablet);
        }
        if (viewType == 5) {
            l19 l19VarA0 = l19.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(l19VarA0, "inflate(...)");
            return new FaceEditFontHolder(l19VarA0);
        }
        if (viewType == 6) {
            f19 f19VarA0 = f19.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(f19VarA0, "inflate(...)");
            return new FaceEditColorHolder(f19VarA0);
        }
        switch (viewType) {
            case 8:
                z19 z19VarA0 = z19.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(z19VarA0, "inflate(...)");
                return new FaceEditSlotHolder(z19VarA0);
            case 9:
                n29 n29VarA0 = n29.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(n29VarA0, "inflate(...)");
                return new FaceEditTextHolder(n29VarA0);
            case 10:
                r29 r29VarA0 = r29.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(r29VarA0, "inflate(...)");
                return new FaceEditVideoHolder(r29VarA0);
            default:
                h29 h29VarA0 = h29.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(h29VarA0, "inflate(...)");
                return new FaceEditStyleHolder(h29VarA0, this.isTablet);
        }
    }

    public FaceEditPickerAdapter(boolean z) {
        super(new DiffCallback());
        this.isTablet = z;
    }
}
