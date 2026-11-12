package com.xiaomi.fitness.watch.face.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.FaceBlePhotoFragmentKt;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import defpackage.isi;
import defpackage.noi;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.und;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 82\u00020\u0001:\u00045678B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ\u001c\u0010&\u001a\u00020\u001f2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dJ\"\u0010(\u001a\u00020\u001f2\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010!J\u001c\u0010)\u001a\u00020\u001f2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dJ\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0007J\u0014\u0010,\u001a\u00020\u001f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0.J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0.J\u000e\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u00122\u0006\u00103\u001a\u00020\u0007J\u0006\u00104\u001a\u00020\u001fR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxPhotoSize", "getMaxPhotoSize", "()I", "setMaxPhotoSize", "(I)V", "curImgPath", "", "mAdapter", "Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$VideoBgAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "sizeTv", "Landroid/widget/TextView;", "mPhotoList", "", "Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem;", "mAddBtnClickListener", "Lkotlin/Function1;", "", "", "mItemDelBtnClickListener", "Lkotlin/Function2;", "mItemSelectBtnClickListener", "sizeDesStr", "getSizeDesStr", "()Ljava/lang/String;", "setOnAddBtnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemDelBtnClickListener", "setOnItemSelectBtnClickListener", "refreshMaxSize", "value", "setPhotoList", "list", "", "getPhotoList", "addPhotoBg", "photoBg", "removePhotoBg", "position", "removeAllPhotoBg", "VideoBgAdapter", "PhotoBgViewHolder", "PhotoBgItem", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoBgPicker extends LinearLayout {
    public static final int VIEW_TYPE_ADD_ITEM = 1;
    public static final int VIEW_TYPE_PHOTO_BG = 2;

    @NotNull
    private String curImgPath;

    @NotNull
    private final VideoBgAdapter mAdapter;

    @Nullable
    private Function1<? super Boolean, Unit> mAddBtnClickListener;

    @Nullable
    private Function2<? super Integer, ? super PhotoBgItem, Unit> mItemDelBtnClickListener;

    @Nullable
    private Function1<? super PhotoBgItem, Unit> mItemSelectBtnClickListener;

    @NotNull
    private final List<PhotoBgItem> mPhotoList;
    private int maxPhotoSize;

    @NotNull
    private RecyclerView recyclerView;

    @NotNull
    private TextView sizeTv;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem;", "", "filePath", "", "md5", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getMd5", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoBgItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String filePath;

        @NotNull
        private final String md5;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem$Companion;", "", "<init>", "()V", "of", "Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem;", "filePath", "", "md5", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final PhotoBgItem of(@NotNull String filePath, @NotNull String md5) {
                Intrinsics.checkNotNullParameter(filePath, "filePath");
                Intrinsics.checkNotNullParameter(md5, "md5");
                return new PhotoBgItem(filePath, md5);
            }
        }

        public PhotoBgItem(@NotNull String filePath, @NotNull String md5) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(md5, "md5");
            this.filePath = filePath;
            this.md5 = md5;
        }

        public static /* synthetic */ PhotoBgItem copy$default(PhotoBgItem photoBgItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = photoBgItem.filePath;
            }
            if ((i & 2) != 0) {
                str2 = photoBgItem.md5;
            }
            return photoBgItem.copy(str, str2);
        }

        @JvmStatic
        @NotNull
        public static final PhotoBgItem of(@NotNull String str, @NotNull String str2) {
            return INSTANCE.of(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMd5() {
            return this.md5;
        }

        @NotNull
        public final PhotoBgItem copy(@NotNull String filePath, @NotNull String md5) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(md5, "md5");
            return new PhotoBgItem(filePath, md5);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoBgItem)) {
                return false;
            }
            PhotoBgItem photoBgItem = (PhotoBgItem) other;
            return Intrinsics.areEqual(this.filePath, photoBgItem.filePath) && Intrinsics.areEqual(this.md5, photoBgItem.md5);
        }

        @NotNull
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final String getMd5() {
            return this.md5;
        }

        public int hashCode() {
            return (this.filePath.hashCode() * 31) + this.md5.hashCode();
        }

        @NotNull
        public String toString() {
            return "PhotoBgItem(filePath=" + this.filePath + ", md5=" + this.md5 + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkotlin/Function0;", "", "clickListener", "bindAddBtn", "(Lkotlin/jvm/functions/Function0;)V", "", "curImgPath", "Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem;", "data", "Lkotlin/Function1;", "", "delBtnClickListener", "bindData", "(Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem;Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onSelect", "(Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgItem;Lkotlin/jvm/functions/Function1;)V", "Lund;", "mViewBinding", "Lund;", "<init>", "(Lund;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class PhotoBgViewHolder extends RecyclerView.d0 {

        @NotNull
        private final und mViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoBgViewHolder(@NotNull und mViewBinding) {
            super(mViewBinding.getRoot());
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.mViewBinding = mViewBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindAddBtn$lambda$0(Function0 clickListener, View view) {
            Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
            clickListener.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$1(Function1 delBtnClickListener, PhotoBgViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(delBtnClickListener, "$delBtnClickListener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            delBtnClickListener.invoke2(Integer.valueOf(this$0.getAdapterPosition()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$2(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSelect$lambda$3(Function1 listener, PhotoBgViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            listener.invoke2(Integer.valueOf(this$0.getAdapterPosition()));
        }

        public final void bindAddBtn(@NotNull final Function0<Unit> clickListener) {
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            this.mViewBinding.B.setVisibility(4);
            this.mViewBinding.B.setOnClickListener(null);
            FaceInfoView contentImg = this.mViewBinding.A;
            Intrinsics.checkNotNullExpressionValue(contentImg, "contentImg");
            FaceManager.INSTANCE.loadFaceDrawable(noi.I, contentImg, (52 & 4) != 0 ? false : false, (52 & 8) != 0 ? false : true, (52 & 16) != 0 ? false : false, (52 & 32) != 0 ? false : false);
            contentImg.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.watch.face.widget.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoBgPicker.PhotoBgViewHolder.bindAddBtn$lambda$0(clickListener, view);
                }
            });
        }

        public final void bindData(@NotNull String curImgPath, @NotNull PhotoBgItem data, @NotNull final Function1<? super Integer, Unit> delBtnClickListener) {
            Intrinsics.checkNotNullParameter(curImgPath, "curImgPath");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(delBtnClickListener, "delBtnClickListener");
            this.mViewBinding.B.setVisibility(0);
            this.mViewBinding.B.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.watch.face.widget.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoBgPicker.PhotoBgViewHolder.bindData$lambda$1(delBtnClickListener, this, view);
                }
            });
            FaceInfoView contentImg = this.mViewBinding.A;
            Intrinsics.checkNotNullExpressionValue(contentImg, "contentImg");
            FaceManager.INSTANCE.loadFaceFile(new File(StringsKt__StringsJVMKt.endsWith$default(data.getFilePath(), ".png", false, 2, null) ? data.getFilePath() : FaceBlePhotoFragmentKt.getPngPath(data.getFilePath())), contentImg, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : Intrinsics.areEqual(curImgPath, data.getFilePath()), (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : true, (108 & 64) != 0 ? false : false);
            contentImg.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.watch.face.widget.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoBgPicker.PhotoBgViewHolder.bindData$lambda$2(view);
                }
            });
        }

        public final void onSelect(@NotNull PhotoBgItem data, @NotNull final Function1<? super Integer, Unit> listener) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(listener, "listener");
            FaceInfoView contentImg = this.mViewBinding.A;
            Intrinsics.checkNotNullExpressionValue(contentImg, "contentImg");
            contentImg.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.watch.face.widget.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoBgPicker.PhotoBgViewHolder.onSelect$lambda$3(listener, this, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$VideoBgAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker$PhotoBgViewHolder;", "<init>", "(Lcom/xiaomi/fitness/watch/face/widget/VideoBgPicker;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getRealPosition", "getItemCount", "getItemViewType", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class VideoBgAdapter extends RecyclerView.Adapter<PhotoBgViewHolder> {
        public VideoBgAdapter() {
        }

        private final int getRealPosition(int position) {
            return position - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$0(VideoBgPicker this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.mAddBtnClickListener;
            if (function1 != null) {
                function1.invoke2(Boolean.valueOf(this$0.mPhotoList.size() < this$0.getMaxPhotoSize()));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$1(VideoBgAdapter this$0, VideoBgPicker this$1, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            int realPosition = this$0.getRealPosition(i);
            Function2 function2 = this$1.mItemDelBtnClickListener;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(realPosition), this$1.mPhotoList.get(realPosition));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$2(VideoBgAdapter this$0, VideoBgPicker this$1, int i, int i2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            int realPosition = this$0.getRealPosition(i2);
            Function1 function1 = this$1.mItemSelectBtnClickListener;
            if (function1 != null) {
                function1.invoke2(this$1.mPhotoList.get(realPosition));
            }
            this$1.curImgPath = ((PhotoBgItem) this$1.mPhotoList.get(this$0.getRealPosition(i))).getFilePath();
            this$0.notifyDataSetChanged();
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return VideoBgPicker.this.mPhotoList.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull PhotoBgViewHolder holder, final int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (getItemViewType(position) == 1) {
                final VideoBgPicker videoBgPicker = VideoBgPicker.this;
                holder.bindAddBtn(new Function0() { // from class: com.xiaomi.fitness.watch.face.widget.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VideoBgPicker.VideoBgAdapter.onBindViewHolder$lambda$0(videoBgPicker);
                    }
                });
                return;
            }
            String str = VideoBgPicker.this.curImgPath;
            PhotoBgItem photoBgItem = (PhotoBgItem) VideoBgPicker.this.mPhotoList.get(getRealPosition(position));
            final VideoBgPicker videoBgPicker2 = VideoBgPicker.this;
            holder.bindData(str, photoBgItem, new Function1() { // from class: com.xiaomi.fitness.watch.face.widget.m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VideoBgPicker.VideoBgAdapter.onBindViewHolder$lambda$1(this.f13423a, videoBgPicker2, ((Integer) obj).intValue());
                }
            });
            PhotoBgItem photoBgItem2 = (PhotoBgItem) VideoBgPicker.this.mPhotoList.get(getRealPosition(position));
            final VideoBgPicker videoBgPicker3 = VideoBgPicker.this;
            holder.onSelect(photoBgItem2, new Function1() { // from class: com.xiaomi.fitness.watch.face.widget.n
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VideoBgPicker.VideoBgAdapter.onBindViewHolder$lambda$2(this.f13425a, videoBgPicker3, position, ((Integer) obj).intValue());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public PhotoBgViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            und undVarA0 = und.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(undVarA0, "inflate(...)");
            return new PhotoBgViewHolder(undVarA0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBgPicker(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxPhotoSize = 5;
        this.curImgPath = "";
        VideoBgAdapter videoBgAdapter = new VideoBgAdapter();
        this.mAdapter = videoBgAdapter;
        this.mPhotoList = new ArrayList();
        setOrientation(1);
        LayoutInflater.from(context).inflate(ovi.B0, (ViewGroup) this, true);
        this.recyclerView = (RecyclerView) findViewById(isi.P1);
        this.sizeTv = (TextView) findViewById(isi.b2);
        this.recyclerView.setAdapter(videoBgAdapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.sizeTv.setText(getSizeDesStr());
    }

    private final String getSizeDesStr() {
        String string = getContext().getResources().getString(p1j.g, Integer.valueOf(this.mPhotoList.size()), Integer.valueOf(this.maxPhotoSize));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void addPhotoBg(@NotNull PhotoBgItem photoBg) {
        Intrinsics.checkNotNullParameter(photoBg, "photoBg");
        Logger.i("addPhotoBg : " + photoBg, new Object[0]);
        this.mPhotoList.add(0, photoBg);
        this.curImgPath = photoBg.getFilePath();
        this.sizeTv.setText(getSizeDesStr());
        this.mAdapter.notifyDataSetChanged();
    }

    public final int getMaxPhotoSize() {
        return this.maxPhotoSize;
    }

    @NotNull
    public final List<PhotoBgItem> getPhotoList() {
        return this.mPhotoList;
    }

    public final void refreshMaxSize(int value) {
        this.maxPhotoSize = value;
        this.sizeTv.setText(getSizeDesStr());
    }

    public final void removeAllPhotoBg() {
        this.mPhotoList.clear();
        this.curImgPath = "";
        this.sizeTv.setText(getSizeDesStr());
        this.mAdapter.notifyDataSetChanged();
    }

    @Nullable
    public final String removePhotoBg(int position) {
        this.mPhotoList.remove(position);
        this.sizeTv.setText(getSizeDesStr());
        this.curImgPath = this.mPhotoList.isEmpty() ^ true ? this.mPhotoList.get(0).getFilePath() : "";
        this.mAdapter.notifyDataSetChanged();
        if (!this.mPhotoList.isEmpty()) {
            return this.mPhotoList.get(0).getFilePath();
        }
        return null;
    }

    public final void setMaxPhotoSize(int i) {
        this.maxPhotoSize = i;
    }

    public final void setOnAddBtnClickListener(@Nullable Function1<? super Boolean, Unit> listener) {
        this.mAddBtnClickListener = listener;
    }

    public final void setOnItemDelBtnClickListener(@Nullable Function2<? super Integer, ? super PhotoBgItem, Unit> listener) {
        this.mItemDelBtnClickListener = listener;
    }

    public final void setOnItemSelectBtnClickListener(@Nullable Function1<? super PhotoBgItem, Unit> listener) {
        this.mItemSelectBtnClickListener = listener;
    }

    public final void setPhotoList(@NotNull List<PhotoBgItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mPhotoList.clear();
        this.mPhotoList.addAll(list);
        this.sizeTv.setText(getSizeDesStr());
        this.mAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoBgPicker(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoBgPicker(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
