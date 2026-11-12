package com.xiaomi.fitness.mine.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.widget.MineAssetsView;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.m0j;
import defpackage.myf;
import defpackage.nuf;
import defpackage.pyf;
import defpackage.vni;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001b\u001c\u001d\u001aB'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineAssetsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", MediaStoreUtil.MediaInfo.SIZE, "", "setLayoutManager", "(I)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnItemClickListen", "(Lkotlin/jvm/functions/Function1;)V", "Lpyf;", "mRootView", "Lpyf;", "onClickListener", "Lkotlin/jvm/functions/Function1;", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "MineAssetsItem", "TabAdapter", "DiffCallback", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MineAssetsView extends ConstraintLayout {

    @NotNull
    private final pyf mRootView;

    @Nullable
    private Function1<? super Integer, Unit> onClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineAssetsView$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;)Z", "areContentsTheSame", "<init>", "()V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<MineAssetsItem> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull MineAssetsItem oldItem, @NotNull MineAssetsItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return false;
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull MineAssetsItem oldItem, @NotNull MineAssetsItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return false;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;", "", "name", "", "drawable", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getDrawable", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MineAssetsItem {
        private final int drawable;

        @NotNull
        private final String name;

        public MineAssetsItem(@NotNull String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.drawable = i;
        }

        public static /* synthetic */ MineAssetsItem copy$default(MineAssetsItem mineAssetsItem, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = mineAssetsItem.name;
            }
            if ((i2 & 2) != 0) {
                i = mineAssetsItem.drawable;
            }
            return mineAssetsItem.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDrawable() {
            return this.drawable;
        }

        @NotNull
        public final MineAssetsItem copy(@NotNull String name, int drawable) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new MineAssetsItem(name, drawable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MineAssetsItem)) {
                return false;
            }
            MineAssetsItem mineAssetsItem = (MineAssetsItem) other;
            return Intrinsics.areEqual(this.name, mineAssetsItem.name) && this.drawable == mineAssetsItem.drawable;
        }

        public final int getDrawable() {
            return this.drawable;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.drawable);
        }

        @NotNull
        public String toString() {
            return "MineAssetsItem(name=" + this.name + ", drawable=" + this.drawable + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineAssetsView$TabAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "items", "<init>", "(Lcom/xiaomi/fitness/mine/widget/MineAssetsView;Ljava/util/List;)V", "TabAdapterViewHolder", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TabAdapter extends p<MineAssetsItem, RecyclerView.d0> {
        final /* synthetic */ MineAssetsView this$0;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineAssetsView$TabAdapter$TabAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;", "item", "", "bind", "(Lcom/xiaomi/fitness/mine/widget/MineAssetsView$MineAssetsItem;)V", "Lmyf;", "binding", "Lmyf;", "<init>", "(Lcom/xiaomi/fitness/mine/widget/MineAssetsView$TabAdapter;Lmyf;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nMineAssetsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineAssetsView.kt\ncom/xiaomi/fitness/mine/widget/MineAssetsView$TabAdapter$TabAdapterViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,123:1\n54#2,3:124\n24#2:127\n57#2,6:128\n63#2,2:135\n57#3:134\n*S KotlinDebug\n*F\n+ 1 MineAssetsView.kt\ncom/xiaomi/fitness/mine/widget/MineAssetsView$TabAdapter$TabAdapterViewHolder\n*L\n84#1:124,3\n84#1:127\n84#1:128,6\n84#1:135,2\n84#1:134\n*E\n"})
        public final class TabAdapterViewHolder extends RecyclerView.d0 {

            @NotNull
            private final myf binding;
            final /* synthetic */ TabAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TabAdapterViewHolder(@NotNull TabAdapter tabAdapter, myf binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.this$0 = tabAdapter;
                this.binding = binding;
                nuf.f(binding.getRoot());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit bind$lambda$0(MineAssetsView this$0, TabAdapterViewHolder this$1, View it) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<Integer, Unit> onClickListener = this$0.getOnClickListener();
                if (onClickListener != null) {
                    onClickListener.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
                }
                return Unit.INSTANCE;
            }

            public final void bind(@NotNull MineAssetsItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                AppCompatImageView assetsIcon = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(assetsIcon, "assetsIcon");
                Coil.imageLoader(assetsIcon.getContext()).enqueue(new ImageRequest.Builder(assetsIcon.getContext()).data(Integer.valueOf(item.getDrawable())).target(assetsIcon).build());
                this.binding.B.setText(item.getName());
                View root = this.binding.getRoot();
                final MineAssetsView mineAssetsView = this.this$0.this$0;
                ViewExtKt.clickWithTrigger$default(root, 0L, new Function1() { // from class: oyf
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MineAssetsView.TabAdapter.TabAdapterViewHolder.bind$lambda$0(mineAssetsView, this, (View) obj);
                    }
                }, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabAdapter(@NotNull MineAssetsView mineAssetsView, List<MineAssetsItem> items) {
            super(new DiffCallback());
            Intrinsics.checkNotNullParameter(items, "items");
            this.this$0 = mineAssetsView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            MineAssetsItem mineAssetsItem = getCurrentList().get(position);
            if (holder instanceof TabAdapterViewHolder) {
                Intrinsics.checkNotNull(mineAssetsItem);
                ((TabAdapterViewHolder) holder).bind(mineAssetsItem);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            myf myfVarA0 = myf.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(myfVarA0, "inflate(...)");
            return new TabAdapterViewHolder(this, myfVarA0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineAssetsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setLayoutManager(int size) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), size);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.mine.widget.MineAssetsView.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        this.mRootView.A.setLayoutManager(gridLayoutManager);
    }

    public final void addOnItemClickListen(@Nullable Function1<? super Integer, Unit> listener) {
        this.onClickListener = listener;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnClickListener() {
        return this.onClickListener;
    }

    public final void setOnClickListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.onClickListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineAssetsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MineAssetsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineAssetsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        pyf pyfVarA0 = pyf.A0(LayoutInflater.from(context), this, true);
        this.mRootView = pyfVarA0;
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new MineAssetsItem(ResourceExtKt.getString(m0j.j), vni.i), new MineAssetsItem(ResourceExtKt.getString(m0j.f25624k), vni.j), new MineAssetsItem(ResourceExtKt.getString(m0j.m), vni.l), new MineAssetsItem(ResourceExtKt.getString(m0j.l), vni.f37066k));
        TabAdapter tabAdapter = new TabAdapter(this, listMutableListOf);
        pyfVarA0.A.setAdapter(tabAdapter);
        setLayoutManager(listMutableListOf.size());
        tabAdapter.submitList(listMutableListOf);
    }
}
