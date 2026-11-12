package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropStyleAdapter;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import defpackage.isi;
import defpackage.noi;
import defpackage.r19;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0003J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u001c\u0010\u001e\u001a\u00020\u00072\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter$FaceEditPhotoCropStyleHolder;", "onPhotoCropStyleClickListener", "Lcom/xiaomi/fitness/watch/face/edit/photo/crop/OnPhotoCropStyleClickListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "splitStrategy", "styleList", "", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToRecyclerView", "recyclerView", "setStyleList", "list", "", "strategy", "setSplitStrategy", "getDrawableRes", "style", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceEditPhotoCropStyleHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceEditPhotoCropStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoCropStyleAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,137:1\n54#2,3:138\n24#2:141\n57#2,6:142\n63#2,2:149\n54#2,3:151\n24#2:154\n57#2,6:155\n63#2,2:162\n57#3:148\n57#3:161\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoCropStyleAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter\n*L\n40#1:138,3\n40#1:141\n40#1:142,6\n40#1:149,2\n44#1:151,3\n44#1:154\n44#1:155,6\n44#1:162,2\n40#1:148\n44#1:161\n*E\n"})
public final class FaceEditPhotoCropStyleAdapter extends RecyclerView.Adapter<FaceEditPhotoCropStyleHolder> {

    @Nullable
    private RecyclerView mRecyclerView;

    @NotNull
    private final Function1<Integer, Unit> onPhotoCropStyleClickListener;
    private int splitStrategy;

    @NotNull
    private final List<Integer> styleList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter$FaceEditPhotoCropStyleHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "style", "", "bindView", "(I)V", "onClick", "Lr19;", "binding", "Lr19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter;Lr19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceEditPhotoCropStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoCropStyleAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter$FaceEditPhotoCropStyleHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,137:1\n54#2,3:138\n24#2:141\n57#2,6:142\n63#2,2:149\n57#3:148\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoCropStyleAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropStyleAdapter$FaceEditPhotoCropStyleHolder\n*L\n52#1:138,3\n52#1:141\n52#1:142,6\n52#1:149,2\n52#1:148\n*E\n"})
    public final class FaceEditPhotoCropStyleHolder extends RecyclerView.d0 {

        @NotNull
        private final r19 binding;
        final /* synthetic */ FaceEditPhotoCropStyleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditPhotoCropStyleHolder(@NotNull FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter, r19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditPhotoCropStyleAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(FaceEditPhotoCropStyleAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onPhotoCropStyleClickListener.invoke2(Integer.valueOf(i));
        }

        public final void bindView(int style) {
            ImageView preview = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(preview, "preview");
            FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = this.this$0;
            Coil.imageLoader(preview.getContext()).enqueue(new ImageRequest.Builder(preview.getContext()).data(Integer.valueOf(faceEditPhotoCropStyleAdapter.getDrawableRes(style, faceEditPhotoCropStyleAdapter.splitStrategy))).target(preview).build());
        }

        public final void onClick(final int style) {
            View root = this.binding.getRoot();
            final FaceEditPhotoCropStyleAdapter faceEditPhotoCropStyleAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: ut8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditPhotoCropStyleAdapter.FaceEditPhotoCropStyleHolder.onClick$lambda$0(faceEditPhotoCropStyleAdapter, style, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditPhotoCropStyleAdapter(@NotNull Function1<? super Integer, Unit> onPhotoCropStyleClickListener) {
        Intrinsics.checkNotNullParameter(onPhotoCropStyleClickListener, "onPhotoCropStyleClickListener");
        this.onPhotoCropStyleClickListener = onPhotoCropStyleClickListener;
        this.styleList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDrawableRes(int style, int strategy) {
        int currentType = FaceSizeConstant.INSTANCE.getCurrentType();
        if (style == 0) {
            if (strategy != style) {
                if (currentType != 1) {
                    return currentType != 3 ? noi.D : noi.z;
                }
                return noi.B;
            }
            if (currentType != 1) {
                return currentType != 3 ? noi.E : noi.A;
            }
            return noi.C;
        }
        if (style != 2) {
            if (strategy != style) {
                if (currentType != 1) {
                    return currentType != 3 ? noi.f28206r : noi.n;
                }
                return noi.p;
            }
            if (currentType != 1) {
                return currentType != 3 ? noi.s : noi.o;
            }
            return noi.q;
        }
        if (strategy != style) {
            if (currentType != 1) {
                return currentType != 3 ? noi.x : noi.t;
            }
            return noi.v;
        }
        if (currentType != 1) {
            return currentType != 3 ? noi.y : noi.u;
        }
        return noi.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.styleList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    public final void setSplitStrategy(int strategy) {
        ImageView imageView;
        ImageView imageView2;
        int iIndexOf = this.styleList.indexOf(Integer.valueOf(this.splitStrategy));
        int iIndexOf2 = this.styleList.indexOf(Integer.valueOf(strategy));
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        View childAt = recyclerView != null ? recyclerView.getChildAt(iIndexOf) : null;
        if (childAt != null && (imageView2 = (ImageView) childAt.findViewById(isi.B1)) != null) {
            Coil.imageLoader(imageView2.getContext()).enqueue(new ImageRequest.Builder(imageView2.getContext()).data(Integer.valueOf(getDrawableRes(this.styleList.get(iIndexOf).intValue(), strategy))).target(imageView2).build());
        }
        this.splitStrategy = strategy;
        RecyclerView recyclerView2 = this.mRecyclerView;
        View childAt2 = recyclerView2 != null ? recyclerView2.getChildAt(iIndexOf2) : null;
        if (childAt2 == null || (imageView = (ImageView) childAt2.findViewById(isi.B1)) == null) {
            return;
        }
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(Integer.valueOf(getDrawableRes(this.styleList.get(iIndexOf2).intValue(), this.splitStrategy))).target(imageView).build());
    }

    public final void setStyleList(@NotNull List<Integer> list, int strategy) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.splitStrategy = strategy;
        this.styleList.clear();
        this.styleList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditPhotoCropStyleHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int iIntValue = this.styleList.get(position).intValue();
        holder.bindView(iIntValue);
        holder.onClick(iIntValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditPhotoCropStyleHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        r19 r19VarA0 = r19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(r19VarA0, "inflate(...)");
        return new FaceEditPhotoCropStyleHolder(this, r19VarA0);
    }
}
