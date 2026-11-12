package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateAdapter;
import defpackage.il6;
import defpackage.jni;
import defpackage.kl6;
import defpackage.wzi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,*BG\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050 \u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050 ¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u00052\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050 8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010'¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "selectId", "", "updateSelectId", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateBean;", "Lkotlin/collections/ArrayList;", "list", "updateData", "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "mDataList", "Ljava/util/ArrayList;", "getMDataList", "()Ljava/util/ArrayList;", "Lkotlin/Function1;", "onClick", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "onLongClick", "getOnLongClick", "Ljava/lang/String;", "<init>", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "ViewHolder", "TitleViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VibrateAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    private static final int TYPE_CUSTOM_TITLE = 1;
    private static final int TYPE_DEFAULT_TITLE = 0;
    private static final int TYPE_ITEM = 2;

    @NotNull
    private final ArrayList<VibrateBean> mDataList;

    @NotNull
    private final Function1<VibrateBean, Unit> onClick;

    @NotNull
    private final Function1<VibrateBean, Unit> onLongClick;

    @Nullable
    private String selectId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "onBind", "()V", "", "default", "Z", "getDefault", "()Z", "Lil6;", "binding", "Lil6;", "getBinding", "()Lil6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter;ZLil6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TitleViewHolder extends RecyclerView.d0 {

        @NotNull
        private final il6 binding;
        private final boolean default;
        final /* synthetic */ VibrateAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(VibrateAdapter vibrateAdapter, @NotNull boolean z, il6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = vibrateAdapter;
            this.default = z;
            this.binding = binding;
        }

        @NotNull
        public final il6 getBinding() {
            return this.binding;
        }

        public final boolean getDefault() {
            return this.default;
        }

        public final void onBind() {
            if (this.default) {
                this.binding.A.setText(wzi.Ca);
            } else {
                this.binding.A.setText(wzi.W8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "onBind", "()V", "Lkl6;", "binding", "Lkl6;", "getBinding", "()Lkl6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateAdapter;Lkl6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ViewHolder extends RecyclerView.d0 {

        @NotNull
        private final kl6 binding;
        final /* synthetic */ VibrateAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull VibrateAdapter vibrateAdapter, kl6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = vibrateAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBind$lambda$0(ViewHolder this$0, VibrateAdapter this$1, VibrateBean vibrateBean, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(vibrateBean, "$vibrateBean");
            this$0.binding.A.setImportantForAccessibility(2);
            this$1.getOnClick().invoke2(vibrateBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onBind$lambda$1(VibrateBean vibrateBean, VibrateAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(vibrateBean, "$vibrateBean");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(vibrateBean.getId());
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            if (iIntValue <= 0 || iIntValue >= 250) {
                return true;
            }
            this$0.getOnLongClick().invoke2(vibrateBean);
            return true;
        }

        @NotNull
        public final kl6 getBinding() {
            return this.binding;
        }

        public final void onBind() {
            VibrateBean vibrateBean = this.this$0.getMDataList().get(getBindingAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(vibrateBean, "get(...)");
            final VibrateBean vibrateBean2 = vibrateBean;
            View root = this.binding.getRoot();
            final VibrateAdapter vibrateAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: npq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VibrateAdapter.ViewHolder.onBind$lambda$0(this.f28238a, vibrateAdapter, vibrateBean2, view);
                }
            });
            View root2 = this.binding.getRoot();
            final VibrateAdapter vibrateAdapter2 = this.this$0;
            root2.setOnLongClickListener(new View.OnLongClickListener() { // from class: opq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return VibrateAdapter.ViewHolder.onBind$lambda$1(vibrateBean2, vibrateAdapter2, view);
                }
            });
            VibrateBean vibrateBean3 = this.this$0.getMDataList().get(getBindingAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(vibrateBean3, "get(...)");
            VibrateBean vibrateBean4 = vibrateBean3;
            this.binding.B.setText(vibrateBean4.getName());
            this.binding.A.setImportantForAccessibility(1);
            this.binding.A.setBackgroundResource(Intrinsics.areEqual(vibrateBean4.getId(), this.this$0.selectId) ? jni.f22949b : jni.c);
            this.binding.A.setContentDescription(ResourceExtKt.getString(Intrinsics.areEqual(vibrateBean4.getId(), this.this$0.selectId) ? wzi.z2 : wzi.G2));
            this.binding.A.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateAdapter$ViewHolder$onBind$3
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    Logger.i("adapter", this.this$0.getBindingAdapterPosition() + " -> " + info);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VibrateAdapter(@NotNull ArrayList<VibrateBean> mDataList, @NotNull Function1<? super VibrateBean, Unit> onClick, @NotNull Function1<? super VibrateBean, Unit> onLongClick) {
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        this.mDataList = mDataList;
        this.onClick = onClick;
        this.onLongClick = onLongClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        VibrateBean vibrateBean = this.mDataList.get(position);
        Intrinsics.checkNotNullExpressionValue(vibrateBean, "get(...)");
        VibrateBean vibrateBean2 = vibrateBean;
        if (position == 0) {
            return 0;
        }
        return vibrateBean2.getId().length() == 0 ? 1 : 2;
    }

    @NotNull
    public final ArrayList<VibrateBean> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final Function1<VibrateBean, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Function1<VibrateBean, Unit> getOnLongClick() {
        return this.onLongClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof TitleViewHolder) {
            ((TitleViewHolder) holder).onBind();
        } else if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).onBind();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            il6 il6VarA0 = il6.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(il6VarA0, "inflate(...)");
            return new TitleViewHolder(this, true, il6VarA0);
        }
        if (viewType != 1) {
            kl6 kl6VarA0 = kl6.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(kl6VarA0, "inflate(...)");
            return new ViewHolder(this, kl6VarA0);
        }
        il6 il6VarA1 = il6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(il6VarA1, "inflate(...)");
        return new TitleViewHolder(this, false, il6VarA1);
    }

    public final void updateData(@NotNull ArrayList<VibrateBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mDataList.clear();
        this.mDataList.addAll(list);
        notifyDataSetChanged();
    }

    public final void updateSelectId(@NotNull String selectId) {
        Intrinsics.checkNotNullParameter(selectId, "selectId");
        this.selectId = selectId;
        notifyDataSetChanged();
    }
}
