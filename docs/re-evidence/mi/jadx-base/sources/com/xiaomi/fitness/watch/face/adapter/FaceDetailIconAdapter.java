package com.xiaomi.fitness.watch.face.adapter;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.adapter.FaceDetailIconAdapter;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import defpackage.d19;
import defpackage.iki;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003 !\"B\u001f\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015j\u0002`\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0015j\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconWrapper;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconHolder;", "", "", "list", "", "current", "", "setIconList", "(Ljava/util/List;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconHolder;", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconHolder;I)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/adapter/OnFaceDetailIconClickListener;", "onFaceDetailIconClickListener", "Lkotlin/jvm/functions/Function1;", "", "currentList", "Ljava/util/List;", "select", "I", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "FaceDetailIconWrapper", "FaceDetailIconHolder", "DiffUtilCallback", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceDetailIconAdapter extends p<FaceDetailIconWrapper, FaceDetailIconHolder> {

    @NotNull
    private final List<FaceDetailIconWrapper> currentList;

    @NotNull
    private final Function1<Integer, Unit> onFaceDetailIconClickListener;
    private int select;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$DiffUtilCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconWrapper;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconWrapper;Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconWrapper;)Z", "areContentsTheSame", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffUtilCallback extends h.f<FaceDetailIconWrapper> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull FaceDetailIconWrapper oldItem, @NotNull FaceDetailIconWrapper newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isCurrent() == newItem.isCurrent();
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull FaceDetailIconWrapper oldItem, @NotNull FaceDetailIconWrapper newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getUrl(), newItem.getUrl());
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "url", "", "isCurrent", "", "bindData", "(Ljava/lang/String;Z)V", "", "position", "onClick", "(I)V", "Ld19;", "binding", "Ld19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter;Ld19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceDetailIconAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDetailIconAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1557#2:101\n1628#2,3:102\n*S KotlinDebug\n*F\n+ 1 FaceDetailIconAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconHolder\n*L\n62#1:101\n62#1:102,3\n*E\n"})
    public final class FaceDetailIconHolder extends RecyclerView.d0 {

        @NotNull
        private final d19 binding;
        final /* synthetic */ FaceDetailIconAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceDetailIconHolder(@NotNull FaceDetailIconAdapter faceDetailIconAdapter, d19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceDetailIconAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$1(FaceDetailIconAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onFaceDetailIconClickListener.invoke2(Integer.valueOf(i));
            List list = this$0.currentList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FaceDetailIconWrapper) it.next()).getUrl());
            }
            this$0.setIconList(arrayList, i);
        }

        public final void bindData(@NotNull String url, boolean isCurrent) {
            Intrinsics.checkNotNullParameter(url, "url");
            int dp = ExtUtilsKt.getDp(67);
            int i = (FaceIcon.INFO_WIDTH * dp) / FaceIcon.INFO_HEIGHT;
            float dp2 = (ExtUtilsKt.getDp(67) * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT;
            ImageLoadUtil imageLoadUtil = ImageLoadUtil.INSTANCE;
            ImageView icon = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            ImageLoadUtil.load$default(imageLoadUtil, icon, url, i, dp, (int) dp2, null, 32, null);
            if (!isCurrent) {
                this.binding.A.setBackground(null);
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(ExtUtilsKt.getDp(2), ApplicationExtKt.getApplication().getColor(iki.e));
            gradientDrawable.setCornerRadius(dp2 + ExtUtilsKt.getDp(4));
            gradientDrawable.setBounds(0, 0, i, dp);
            this.binding.A.setBackground(gradientDrawable);
        }

        public final void onClick(final int position) {
            View root = this.binding.getRoot();
            final FaceDetailIconAdapter faceDetailIconAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: ar8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceDetailIconAdapter.FaceDetailIconHolder.onClick$lambda$1(faceDetailIconAdapter, position, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceDetailIconAdapter$FaceDetailIconWrapper;", "", "url", "", "isCurrent", "", "<init>", "(Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FaceDetailIconWrapper {
        private final boolean isCurrent;

        @NotNull
        private final String url;

        public FaceDetailIconWrapper(@NotNull String url, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.isCurrent = z;
        }

        public static /* synthetic */ FaceDetailIconWrapper copy$default(FaceDetailIconWrapper faceDetailIconWrapper, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = faceDetailIconWrapper.url;
            }
            if ((i & 2) != 0) {
                z = faceDetailIconWrapper.isCurrent;
            }
            return faceDetailIconWrapper.copy(str, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsCurrent() {
            return this.isCurrent;
        }

        @NotNull
        public final FaceDetailIconWrapper copy(@NotNull String url, boolean isCurrent) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new FaceDetailIconWrapper(url, isCurrent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceDetailIconWrapper)) {
                return false;
            }
            FaceDetailIconWrapper faceDetailIconWrapper = (FaceDetailIconWrapper) other;
            return Intrinsics.areEqual(this.url, faceDetailIconWrapper.url) && this.isCurrent == faceDetailIconWrapper.isCurrent;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + Boolean.hashCode(this.isCurrent);
        }

        public final boolean isCurrent() {
            return this.isCurrent;
        }

        @NotNull
        public String toString() {
            return "FaceDetailIconWrapper(url=" + this.url + ", isCurrent=" + this.isCurrent + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceDetailIconAdapter(@NotNull Function1<? super Integer, Unit> onFaceDetailIconClickListener) {
        super(new DiffUtilCallback());
        Intrinsics.checkNotNullParameter(onFaceDetailIconClickListener, "onFaceDetailIconClickListener");
        this.onFaceDetailIconClickListener = onFaceDetailIconClickListener;
        this.currentList = new ArrayList();
    }

    public final void setIconList(@NotNull List<String> list, int current) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.currentList.clear();
        this.select = current;
        int size = list.size();
        int i = 0;
        while (i < size) {
            this.currentList.add(new FaceDetailIconWrapper(list.get(i), i == current));
            i++;
        }
        submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) this.currentList));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceDetailIconHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FaceDetailIconWrapper item = getItem(position);
        holder.bindData(item.getUrl(), item.isCurrent());
        holder.onClick(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceDetailIconHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        d19 d19VarA0 = d19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(d19VarA0, "inflate(...)");
        return new FaceDetailIconHolder(this, d19VarA0);
    }
}
