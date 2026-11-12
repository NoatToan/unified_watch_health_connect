package com.xiaomi.fitness.nfc.protocol;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import defpackage.grg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\t\b\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolAdapter;", "Landroidx/recyclerview/widget/p;", "Landroid/graphics/Bitmap;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "mutableList", "", "updateCurrentList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Ljava/util/List;", "<init>", "()V", "SongViewHolder", "DiffCallback", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OpenPDFProtocolAdapter extends p<Bitmap, RecyclerView.d0> {

    @NotNull
    private final List<Bitmap> updateCurrentList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Landroid/graphics/Bitmap;", "oldItem", "newItem", "", "areItemsTheSame", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Z", "areContentsTheSame", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<Bitmap> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull Bitmap oldItem, @NotNull Bitmap newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull Bitmap oldItem, @NotNull Bitmap newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolAdapter$SongViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Landroid/graphics/Bitmap;", "bitmap", "", "bind", "(ILandroid/graphics/Bitmap;)V", "Lgrg;", "binding", "Lgrg;", "<init>", "(Lcom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolAdapter;Lgrg;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nOpenPDFProtocolAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenPDFProtocolAdapter.kt\ncom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolAdapter$SongViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,67:1\n54#2,3:68\n24#2:71\n57#2,6:72\n63#2,2:79\n57#3:78\n*S KotlinDebug\n*F\n+ 1 OpenPDFProtocolAdapter.kt\ncom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolAdapter$SongViewHolder\n*L\n50#1:68,3\n50#1:71\n50#1:72,6\n50#1:79,2\n50#1:78\n*E\n"})
    public final class SongViewHolder extends RecyclerView.d0 {

        @NotNull
        private final grg binding;
        final /* synthetic */ OpenPDFProtocolAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SongViewHolder(@NotNull OpenPDFProtocolAdapter openPDFProtocolAdapter, grg binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = openPDFProtocolAdapter;
            this.binding = binding;
        }

        public final void bind(int position, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            AppCompatImageView protocolView = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(protocolView, "protocolView");
            Coil.imageLoader(protocolView.getContext()).enqueue(new ImageRequest.Builder(protocolView.getContext()).data(bitmap).target(protocolView).build());
        }
    }

    public OpenPDFProtocolAdapter() {
        super(new DiffCallback());
        this.updateCurrentList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof SongViewHolder) || getCurrentList().get(position) == null) {
            return;
        }
        Bitmap bitmap = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(bitmap, "get(...)");
        ((SongViewHolder) holder).bind(position, bitmap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        grg grgVarA0 = grg.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(grgVarA0, "inflate(...)");
        return new SongViewHolder(this, grgVarA0);
    }

    public final void updateCurrentList(@NotNull List<Bitmap> mutableList) {
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        this.updateCurrentList.clear();
        this.updateCurrentList.addAll(mutableList);
        submitList(ListExtKt.toArrayList(mutableList));
    }
}
