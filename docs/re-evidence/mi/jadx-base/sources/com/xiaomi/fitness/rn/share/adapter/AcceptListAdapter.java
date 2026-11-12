package com.xiaomi.fitness.rn.share.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.share.adapter.AcceptListAdapter;
import com.xiaomi.fitness.rn.share.bean.AcceptItemBean;
import defpackage.avi;
import defpackage.coi;
import defpackage.tri;
import defpackage.w0j;
import defpackage.xji;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001*BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001c\u0010&\u001a\u00020\n2\n\u0010'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter$AcceptListListHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", "onDeleteClick", "Lkotlin/Function1;", "", "onItemClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getOnDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setOnDeleteClick", "(Lkotlin/jvm/functions/Function1;)V", "getOnItemClick", "setOnItemClick", "isEditMode", "", "()Z", "setEditMode", "(Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "AcceptListListHolder", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AcceptListAdapter extends RecyclerView.Adapter<AcceptListListHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<AcceptItemBean> dataList;
    private boolean isEditMode;

    @Nullable
    private Function1<? super AcceptItemBean, Unit> onDeleteClick;

    @Nullable
    private Function1<? super AcceptItemBean, Unit> onItemClick;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00070\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR*\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\n \u000e*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\n \u000e*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR*\u0010#\u001a\n \u000e*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter$AcceptListListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", "acceptItemBean", "", "bind", "(Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "kotlin.jvm.PlatformType", "deleteView", "getDeleteView", "setDeleteView", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "setIconView", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "sendNameView", "getSendNameView", "setSendNameView", "acceptView", "getAcceptView", "setAcceptView", "<init>", "(Lcom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter;Landroid/view/View;)V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nAcceptListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptListAdapter.kt\ncom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter$AcceptListListHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,84:1\n54#2,3:85\n24#2:88\n57#2,6:89\n63#2,2:96\n57#3:95\n*S KotlinDebug\n*F\n+ 1 AcceptListAdapter.kt\ncom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter$AcceptListListHolder\n*L\n41#1:85,3\n41#1:88\n41#1:89,6\n41#1:96,2\n41#1:95\n*E\n"})
    public final class AcceptListListHolder extends RecyclerView.d0 {
        private TextView acceptView;
        private View deleteView;
        private ImageView iconView;
        private TextView nameView;
        private TextView sendNameView;
        final /* synthetic */ AcceptListAdapter this$0;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcceptListListHolder(@NotNull AcceptListAdapter acceptListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = acceptListAdapter;
            this.view = view;
            this.deleteView = view.findViewById(tri.d);
            this.iconView = (ImageView) this.view.findViewById(tri.i);
            this.nameView = (TextView) this.view.findViewById(tri.n);
            this.sendNameView = (TextView) this.view.findViewById(tri.p);
            this.acceptView = (TextView) this.view.findViewById(tri.f34965a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(AcceptListAdapter this$0, AcceptItemBean acceptItemBean, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(acceptItemBean, "$acceptItemBean");
            Function1<AcceptItemBean, Unit> onDeleteClick = this$0.getOnDeleteClick();
            if (onDeleteClick != null) {
                onDeleteClick.invoke2(acceptItemBean);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$3(AcceptListAdapter this$0, AcceptItemBean acceptItemBean, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(acceptItemBean, "$acceptItemBean");
            if (this$0.getIsEditMode()) {
                ToastUtil.INSTANCE.showToast(w0j.s);
                return;
            }
            Function1<AcceptItemBean, Unit> onItemClick = this$0.getOnItemClick();
            if (onItemClick != null) {
                onItemClick.invoke2(acceptItemBean);
            }
        }

        public final void bind(@NotNull final AcceptItemBean acceptItemBean) {
            RNProduct productByModel;
            String smallIcon;
            Intrinsics.checkNotNullParameter(acceptItemBean, "acceptItemBean");
            try {
                productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(acceptItemBean.getModel());
            } catch (Exception e) {
                e.printStackTrace();
                productByModel = null;
            }
            if (productByModel != null && (smallIcon = productByModel.getSmallIcon()) != null) {
                ImageView iconView = this.iconView;
                Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
                Coil.imageLoader(iconView.getContext()).enqueue(new ImageRequest.Builder(iconView.getContext()).data(smallIcon).target(iconView).build());
            }
            if (this.this$0.getIsEditMode()) {
                this.deleteView.setVisibility(0);
            } else {
                this.deleteView.setVisibility(8);
            }
            View view = this.deleteView;
            final AcceptListAdapter acceptListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: k20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AcceptListAdapter.AcceptListListHolder.bind$lambda$1(acceptListAdapter, acceptItemBean, view2);
                }
            });
            this.nameView.setText(acceptItemBean.getDevice_name());
            this.sendNameView.setText(ResourceExtKt.getString(w0j.g, acceptItemBean.getSender_name()));
            if (acceptItemBean.isAccepted()) {
                this.acceptView.setOnClickListener(new View.OnClickListener() { // from class: l20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AcceptListAdapter.AcceptListListHolder.bind$lambda$2(view2);
                    }
                });
                this.acceptView.setText(w0j.l);
                this.acceptView.setBackgroundResource(coi.f);
                this.acceptView.setTextColor(ExtUtilsKt.getColor(xji.f39190b));
                return;
            }
            this.acceptView.setText(w0j.f);
            this.acceptView.setBackgroundResource(coi.d);
            this.acceptView.setTextColor(ExtUtilsKt.getColor(xji.c));
            TextView textView = this.acceptView;
            final AcceptListAdapter acceptListAdapter2 = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: m20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AcceptListAdapter.AcceptListListHolder.bind$lambda$3(acceptListAdapter2, acceptItemBean, view2);
                }
            });
        }

        public final TextView getAcceptView() {
            return this.acceptView;
        }

        public final View getDeleteView() {
            return this.deleteView;
        }

        public final ImageView getIconView() {
            return this.iconView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }

        public final TextView getSendNameView() {
            return this.sendNameView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setAcceptView(TextView textView) {
            this.acceptView = textView;
        }

        public final void setDeleteView(View view) {
            this.deleteView = view;
        }

        public final void setIconView(ImageView imageView) {
            this.iconView = imageView;
        }

        public final void setNameView(TextView textView) {
            this.nameView = textView;
        }

        public final void setSendNameView(TextView textView) {
            this.sendNameView = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public /* synthetic */ AcceptListAdapter(Context context, List list, Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function2);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<AcceptItemBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<AcceptItemBean, Unit> getOnDeleteClick() {
        return this.onDeleteClick;
    }

    @Nullable
    public final Function1<AcceptItemBean, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    /* JADX INFO: renamed from: isEditMode, reason: from getter */
    public final boolean getIsEditMode() {
        return this.isEditMode;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<AcceptItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setEditMode(boolean z) {
        this.isEditMode = z;
    }

    public final void setOnDeleteClick(@Nullable Function1<? super AcceptItemBean, Unit> function1) {
        this.onDeleteClick = function1;
    }

    public final void setOnItemClick(@Nullable Function1<? super AcceptItemBean, Unit> function1) {
        this.onItemClick = function1;
    }

    public AcceptListAdapter(@NotNull Context context, @NotNull List<AcceptItemBean> dataList, @Nullable Function1<? super AcceptItemBean, Unit> function1, @Nullable Function1<? super AcceptItemBean, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.onDeleteClick = function1;
        this.onItemClick = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AcceptListListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AcceptListListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(avi.e, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new AcceptListListHolder(this, viewInflate);
    }
}
