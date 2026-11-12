package com.xiaomi.fitness.privacy.permission;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.privacy.permission.PermissionAdapter;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.s0j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fJ\"\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionHolder;", "<init>", "()V", "mDataList", "", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;", "mOnItemClickListener", "Lkotlin/Function2;", "", "", "notifyDataChanged", "submitList", "list", "", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "PermissionHolder", "PermissionItem", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionAdapter.kt\ncom/xiaomi/fitness/privacy/permission/PermissionAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class PermissionAdapter extends RecyclerView.Adapter<PermissionHolder> {

    @NotNull
    private final List<PermissionItem> mDataList = new ArrayList();

    @Nullable
    private Function2<? super PermissionItem, ? super Integer, Unit> mOnItemClickListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;", "item", "", "bindItem", "(Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;)V", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "root", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "getRoot", "()Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "<init>", "(Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;)V", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class PermissionHolder extends RecyclerView.d0 {

        @NotNull
        private final RightArrowTwoLineTextView root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionHolder(@NotNull RightArrowTwoLineTextView root) {
            super(root);
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final void bindItem(@NotNull PermissionItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.root.setTitle(item.getTitle());
            RightArrowTwoLineTextView rightArrowTwoLineTextView = this.root;
            String des = item.getDes();
            if (des == null) {
                des = "";
            }
            rightArrowTwoLineTextView.setSubtitle(des);
            this.root.setRemindText(ResourceExtKt.getString(item.getGranted() ? s0j.H : s0j.I));
        }

        @NotNull
        public final RightArrowTwoLineTextView getRoot() {
            return this.root;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/privacy/permission/PermissionAdapter$PermissionItem;", "", "permission", "Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "<init>", "(Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;)V", "getPermission", "()Lcom/xiaomi/fitness/privacy/permission/PermissionHelper$Permission;", "title", "", "getTitle", "()Ljava/lang/String;", "des", "getDes", "granted", "", "getGranted", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionItem {

        @Nullable
        private final String des;

        @NotNull
        private final PermissionHelper.Permission permission;

        @NotNull
        private final String title;

        public PermissionItem(@NotNull PermissionHelper.Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            this.permission = permission;
            this.title = ResourceExtKt.getString(permission.getTitleRes());
            this.des = permission.getDesRes() > 0 ? ResourceExtKt.getString(permission.getDesRes()) : null;
        }

        public static /* synthetic */ PermissionItem copy$default(PermissionItem permissionItem, PermissionHelper.Permission permission, int i, Object obj) {
            if ((i & 1) != 0) {
                permission = permissionItem.permission;
            }
            return permissionItem.copy(permission);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PermissionHelper.Permission getPermission() {
            return this.permission;
        }

        @NotNull
        public final PermissionItem copy(@NotNull PermissionHelper.Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            return new PermissionItem(permission);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PermissionItem) && Intrinsics.areEqual(this.permission, ((PermissionItem) other).permission);
        }

        @Nullable
        public final String getDes() {
            return this.des;
        }

        public final boolean getGranted() {
            return this.permission.isPermissionsGranted();
        }

        @NotNull
        public final PermissionHelper.Permission getPermission() {
            return this.permission;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.permission.hashCode();
        }

        @NotNull
        public String toString() {
            return "PermissionItem(permission=" + this.permission + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(PermissionAdapter this$0, PermissionItem item, PermissionHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Function2<? super PermissionItem, ? super Integer, Unit> function2 = this$0.mOnItemClickListener;
        if (function2 != null) {
            function2.invoke(item, Integer.valueOf(holder.getBindingAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    public final void notifyDataChanged() {
        notifyItemRangeChanged(0, this.mDataList.size());
    }

    public final void setOnItemClickListener(@Nullable Function2<? super PermissionItem, ? super Integer, Unit> listener) {
        this.mOnItemClickListener = listener;
    }

    public final void submitList(@Nullable List<PermissionItem> list) {
        this.mDataList.clear();
        if (list != null) {
            this.mDataList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final PermissionHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final PermissionItem permissionItem = this.mDataList.get(position);
        holder.bindItem(permissionItem);
        holder.getRoot().setOnClickListener(new View.OnClickListener() { // from class: crh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionAdapter.onBindViewHolder$lambda$2(this.f14640a, permissionItem, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PermissionHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RightArrowTwoLineTextView rightArrowTwoLineTextView = new RightArrowTwoLineTextView(context, null, 0, 6, null);
        rightArrowTwoLineTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rightArrowTwoLineTextView.setSubTitleMaxLines(5);
        return new PermissionHolder(rightArrowTwoLineTextView);
    }
}
