package com.xiaomi.fitness.watch.face.edit.photo.picker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerAdapter;
import defpackage.dh8;
import defpackage.gyi;
import defpackage.noi;
import defpackage.p1j;
import defpackage.t19;
import defpackage.v19;
import defpackage.xli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003OPNB)\u0012\u0006\u00107\u001a\u00020\u0013\u0012\u0006\u00109\u001a\u00020\u000e\u0012\u0006\u0010<\u001a\u00020;\u0012\b\b\u0002\u0010>\u001a\u00020\u0013¢\u0006\u0004\bL\u0010MJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u000b2\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t0\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000b2\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020\u000b0\u001fj\u0002` ¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u000b2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0$j\u0002`%¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u00020\u000b2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0$j\u0002`(¢\u0006\u0004\b)\u0010'J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R,\u0010?\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00108R$\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001fj\u0004\u0018\u0001` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010$j\u0004\u0018\u0001`%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR*\u0010I\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010$j\u0004\u0018\u0001`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0017\u0010J\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bK\u00104¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "duration", "", "getDurationText", "(J)Ljava/lang/String;", "", "Lkotlin/Pair;", "list", "", "setPhotoList", "(Ljava/util/List;)V", "", "fromPosition", "toPosition", "notifyMoved", "(II)V", "", "editMode", "setEditMode", "(Z)V", "select", "selectAll", "totalCount", "isSelectAll", "(I)Z", "", "getDeleteList", "()Ljava/util/List;", "Lkotlin/Function0;", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/OnPhotoPickerAddListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnPhotoPickerAddListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/OnPhotoPickerSelectListener;", "setOnPhotoPickerSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/OnPhotoPickerCheckedListener;", "setOnPhotoPickerCheckedListener", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "hasMargin", "Z", "columnCount", "I", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "isPickPhoto", "pathList", "Ljava/util/List;", "Landroid/util/SparseBooleanArray;", "checkedState", "Landroid/util/SparseBooleanArray;", "isEditMode", "onPhotoPickerAddListener", "Lkotlin/jvm/functions/Function0;", "onPhotoPickerSelectListener", "Lkotlin/jvm/functions/Function1;", "onPhotoPickerCheckedListener", "margin", "getMargin", "<init>", "(ZILandroidx/recyclerview/widget/l;Z)V", "Companion", "FaceEditPhotoPickerHolder", "FaceEditPhotoPickerAddHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditPhotoPickerAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int PHOTO_PICKER_ADD = 2;
    public static final int PHOTO_PICKER_PHOTO = 1;

    @NotNull
    private SparseBooleanArray checkedState;
    private final int columnCount;
    private final boolean hasMargin;
    private boolean isEditMode;
    private final boolean isPickPhoto;

    @NotNull
    private final l itemTouchHelper;
    private final int margin;

    @Nullable
    private Function0<Unit> onPhotoPickerAddListener;

    @Nullable
    private Function1<? super Integer, Unit> onPhotoPickerCheckedListener;

    @Nullable
    private Function1<? super Integer, Unit> onPhotoPickerSelectListener;

    @NotNull
    private final List<Pair<String, Long>> pathList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter$FaceEditPhotoPickerAddHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "onBind", "(I)V", "onAddPhoto", "()V", "Lt19;", "binding", "Lt19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter;Lt19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditPhotoPickerAddHolder extends RecyclerView.d0 {

        @NotNull
        private final t19 binding;
        final /* synthetic */ FaceEditPhotoPickerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditPhotoPickerAddHolder(@NotNull FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter, t19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditPhotoPickerAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAddPhoto$lambda$0(FaceEditPhotoPickerAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function0 function0 = this$0.onPhotoPickerAddListener;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void onAddPhoto() {
            View root = this.binding.getRoot();
            final FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: zt8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditPhotoPickerAdapter.FaceEditPhotoPickerAddHolder.onAddPhoto$lambda$0(faceEditPhotoPickerAdapter, view);
                }
            });
        }

        public final void onBind(int position) {
            ViewGroup.LayoutParams layoutParams = this.binding.getRoot().getLayoutParams();
            int screenWidth = ((DisplayUtil.getScreenWidth() - this.this$0.getMargin()) - (ExtUtilsKt.getDp(Double.valueOf(1.33d)) * (this.this$0.columnCount - 1))) / this.this$0.columnCount;
            layoutParams.width = screenWidth;
            layoutParams.height = screenWidth;
            this.binding.getRoot().setLayoutParams(layoutParams);
            this.binding.getRoot().setContentDescription(ApplicationExtKt.getApplication().getString(this.this$0.isPickPhoto ? p1j.A0 : p1j.p2));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter$FaceEditPhotoPickerHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkotlin/Pair;", "", "", "data", "", "bindData", "(Lkotlin/Pair;)V", "bindClickListener", "()V", "Lv19;", "binding", "Lv19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter;Lv19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceEditPhotoPickerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoPickerAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter$FaceEditPhotoPickerHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,282:1\n54#2,3:283\n24#2:286\n57#2,6:287\n63#2,2:294\n54#2,3:296\n24#2:299\n57#2,6:300\n63#2,2:307\n57#3:293\n57#3:306\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoPickerAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter$FaceEditPhotoPickerHolder\n*L\n165#1:283,3\n165#1:286\n165#1:287,6\n165#1:294,2\n167#1:296,3\n167#1:299\n167#1:300,6\n167#1:307,2\n165#1:293\n167#1:306\n*E\n"})
    public final class FaceEditPhotoPickerHolder extends RecyclerView.d0 {

        @NotNull
        private final v19 binding;
        final /* synthetic */ FaceEditPhotoPickerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditPhotoPickerHolder(@NotNull FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter, v19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditPhotoPickerAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindClickListener$lambda$3(FaceEditPhotoPickerAdapter this$0, FaceEditPhotoPickerHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (!this$0.isEditMode) {
                Function1 function1 = this$0.onPhotoPickerSelectListener;
                if (function1 != null) {
                    function1.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
                    return;
                }
                return;
            }
            boolean z = !this$0.checkedState.get(this$1.getBindingAdapterPosition(), false);
            this$0.checkedState.put(this$1.getBindingAdapterPosition(), z);
            this$1.binding.A.setSelected(z);
            this$1.binding.A.setContentDescription(z ? "已选中" : "未选中");
            this$1.binding.A.sendAccessibilityEvent(4);
            Function1 function2 = this$0.onPhotoPickerCheckedListener;
            if (function2 != null) {
                function2.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bindClickListener$lambda$4(FaceEditPhotoPickerAdapter this$0, FaceEditPhotoPickerHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.isEditMode) {
                return false;
            }
            this$0.itemTouchHelper.x(this$1);
            return true;
        }

        public final void bindClickListener() {
            View root = this.binding.getRoot();
            final FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: au8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditPhotoPickerAdapter.FaceEditPhotoPickerHolder.bindClickListener$lambda$3(faceEditPhotoPickerAdapter, this, view);
                }
            });
            View root2 = this.binding.getRoot();
            final FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this.this$0;
            root2.setOnLongClickListener(new View.OnLongClickListener() { // from class: bu8
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return FaceEditPhotoPickerAdapter.FaceEditPhotoPickerHolder.bindClickListener$lambda$4(faceEditPhotoPickerAdapter2, this, view);
                }
            });
        }

        public final void bindData(@Nullable Pair<String, Long> data) {
            ViewGroup.LayoutParams layoutParams = this.binding.getRoot().getLayoutParams();
            int screenWidth = ((DisplayUtil.getScreenWidth() - this.this$0.getMargin()) - (ExtUtilsKt.getDp(Double.valueOf(1.33d)) * (this.this$0.columnCount - 1))) / this.this$0.columnCount;
            layoutParams.width = screenWidth;
            layoutParams.height = screenWidth;
            this.binding.getRoot().setLayoutParams(layoutParams);
            this.binding.D.setContentDescription(this.this$0.isPickPhoto ? ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), gyi.f19465a, getBindingAdapterPosition(), Integer.valueOf(getBindingAdapterPosition())) : ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), gyi.f19466b, getBindingAdapterPosition(), Integer.valueOf(getBindingAdapterPosition())));
            if (this.this$0.isEditMode) {
                ImageView checkView = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(checkView, "checkView");
                ViewExtKt.visible(checkView);
                this.binding.A.setSelected(this.this$0.checkedState.get(getBindingAdapterPosition(), false));
                this.binding.A.setContentDescription(this.this$0.checkedState.get(getBindingAdapterPosition(), false) ? ApplicationExtKt.getApplication().getString(p1j.v) : ApplicationExtKt.getApplication().getString(p1j.w));
            } else {
                ImageView checkView2 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(checkView2, "checkView");
                ViewExtKt.gone(checkView2);
            }
            String first = data != null ? data.getFirst() : null;
            if (first == null || first.length() == 0) {
                this.binding.getRoot().setBackgroundResource(noi.f28205k);
                this.binding.D.setImageResource(noi.l);
                Unit unit = Unit.INSTANCE;
            } else {
                this.binding.getRoot().setBackground(null);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int iA = dh8.a(first);
                options.inSampleSize = FaceManager.INSTANCE.getFitInSampleSize(options);
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(first, options);
                if (iA != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(iA);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, false);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                    ImageView preview = this.binding.D;
                    Intrinsics.checkNotNullExpressionValue(preview, "preview");
                    Coil.imageLoader(preview.getContext()).enqueue(new ImageRequest.Builder(preview.getContext()).data(bitmapCreateBitmap).target(preview).build());
                } else {
                    ImageView preview2 = this.binding.D;
                    Intrinsics.checkNotNullExpressionValue(preview2, "preview");
                    Coil.imageLoader(preview2.getContext()).enqueue(new ImageRequest.Builder(preview2.getContext()).data(bitmapDecodeFile).target(preview2).build());
                }
            }
            if ((data != null ? data.getSecond() : null) != null) {
                Long second = data.getSecond();
                Intrinsics.checkNotNull(second);
                if (second.longValue() > 0) {
                    LinearLayout durationLayout = this.binding.C;
                    Intrinsics.checkNotNullExpressionValue(durationLayout, "durationLayout");
                    ExtUtilsKt.setVisible(durationLayout, true);
                    TextView textView = this.binding.B;
                    FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.this$0;
                    Long second2 = data.getSecond();
                    Intrinsics.checkNotNull(second2);
                    textView.setText(faceEditPhotoPickerAdapter.getDurationText(second2.longValue()));
                }
            }
        }
    }

    public /* synthetic */ FaceEditPhotoPickerAdapter(boolean z, int i, l lVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, lVar, (i2 & 8) != 0 ? true : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDurationText(long duration) {
        return "00:0" + (duration / ((long) 1000));
    }

    @NotNull
    public final List<Integer> getDeleteList() {
        ArrayList arrayList = new ArrayList();
        int size = this.checkedState.size();
        for (int i = 0; i < size; i++) {
            if (this.checkedState.valueAt(i)) {
                arrayList.add(Integer.valueOf(this.checkedState.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.pathList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 2 : 1;
    }

    public final int getMargin() {
        return this.margin;
    }

    public final boolean isSelectAll(int totalCount) {
        return getDeleteList().size() == totalCount;
    }

    public final void notifyMoved(int fromPosition, int toPosition) {
        Collections.swap(this.pathList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof FaceEditPhotoPickerAddHolder) {
            FaceEditPhotoPickerAddHolder faceEditPhotoPickerAddHolder = (FaceEditPhotoPickerAddHolder) holder;
            faceEditPhotoPickerAddHolder.onBind(position);
            faceEditPhotoPickerAddHolder.onAddPhoto();
        } else if (holder instanceof FaceEditPhotoPickerHolder) {
            FaceEditPhotoPickerHolder faceEditPhotoPickerHolder = (FaceEditPhotoPickerHolder) holder;
            faceEditPhotoPickerHolder.bindData(this.pathList.get(position));
            faceEditPhotoPickerHolder.bindClickListener();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 2) {
            t19 t19VarA0 = t19.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(t19VarA0, "inflate(...)");
            return new FaceEditPhotoPickerAddHolder(this, t19VarA0);
        }
        v19 v19VarA0 = v19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(v19VarA0, "inflate(...)");
        return new FaceEditPhotoPickerHolder(this, v19VarA0);
    }

    public final void selectAll(boolean select) {
        this.checkedState.clear();
        int size = this.pathList.size();
        for (int i = 1; i < size; i++) {
            this.checkedState.put(i, select);
        }
        notifyDataSetChanged();
    }

    public final void setEditMode(boolean editMode) {
        this.isEditMode = editMode;
        if (!editMode) {
            this.checkedState.clear();
        }
        notifyDataSetChanged();
    }

    public final void setOnPhotoPickerAddListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPhotoPickerAddListener = listener;
    }

    public final void setOnPhotoPickerCheckedListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPhotoPickerCheckedListener = listener;
    }

    public final void setOnPhotoPickerSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPhotoPickerSelectListener = listener;
    }

    public final void setPhotoList(@NotNull List<Pair<String, Long>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.pathList.clear();
        this.pathList.addAll(list);
        notifyDataSetChanged();
    }

    public FaceEditPhotoPickerAdapter(boolean z, int i, @NotNull l itemTouchHelper, boolean z2) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        this.hasMargin = z;
        this.columnCount = i;
        this.itemTouchHelper = itemTouchHelper;
        this.isPickPhoto = z2;
        this.pathList = new ArrayList();
        this.checkedState = new SparseBooleanArray();
        this.margin = z ? ExtUtilsKt.getDimension(xli.e) : 0;
    }
}
