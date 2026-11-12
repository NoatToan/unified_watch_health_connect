package com.xiaomi.fitness.active.pk.ui.recyclerview;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.ui.recyclerview.FriendRecommendedAdapter;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.bui;
import defpackage.fni;
import defpackage.of1;
import defpackage.wqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00152\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u0015\u0016\u0017B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0011\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$FriendRecommendedViewHolder;", "friendList", "", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "<init>", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onItemClickListener", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$OnItemClickListener;", "setOnItemClickListener", "", "getItemCount", "onBindViewHolder", "holder", "position", "Companion", "FriendRecommendedViewHolder", "OnItemClickListener", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFriendRecommendedAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRecommendedAdapter.kt\ncom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,94:1\n54#2,3:95\n24#2:98\n59#2,4:99\n63#2,2:112\n844#3,9:103\n*S KotlinDebug\n*F\n+ 1 FriendRecommendedAdapter.kt\ncom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter\n*L\n71#1:95,3\n71#1:98\n71#1:99,4\n71#1:112,2\n73#1:103,9\n*E\n"})
public final class FriendRecommendedAdapter extends RecyclerView.Adapter<FriendRecommendedViewHolder> {

    @NotNull
    public static final String TAG = "FriendRecommendedAdapter";

    @Nullable
    private List<UserInfo> friendList;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$FriendRecommendedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "avatarView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getAvatarView", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Landroid/widget/TextView;", "nickNameTv", "Landroid/widget/TextView;", "getNickNameTv", "()Landroid/widget/TextView;", "sentTv", "getSentTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter;Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FriendRecommendedViewHolder extends RecyclerView.d0 {

        @NotNull
        private final RoundImageView avatarView;

        @NotNull
        private final TextView nickNameTv;

        @NotNull
        private final TextView sentTv;
        final /* synthetic */ FriendRecommendedAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FriendRecommendedViewHolder(@NotNull FriendRecommendedAdapter friendRecommendedAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = friendRecommendedAdapter;
            View viewFindViewById = itemView.findViewById(wqi.f38256b);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.avatarView = (RoundImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(wqi.d1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.nickNameTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(wqi.u1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.sentTv = (TextView) viewFindViewById3;
        }

        @NotNull
        public final RoundImageView getAvatarView() {
            return this.avatarView;
        }

        @NotNull
        public final TextView getNickNameTv() {
            return this.nickNameTv;
        }

        @NotNull
        public final TextView getSentTv() {
            return this.sentTv;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$OnItemClickListener;", "", "onClick", "", "userInfo", "Lcom/xiaomi/fitness/active/pk/net/model/UserInfo;", "itemViewHolder", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter$FriendRecommendedViewHolder;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/FriendRecommendedAdapter;", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull UserInfo userInfo, @NotNull FriendRecommendedViewHolder itemViewHolder);
    }

    public FriendRecommendedAdapter(@Nullable List<UserInfo> list) {
        this.friendList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(FriendRecommendedAdapter this$0, UserInfo userinfo, FriendRecommendedViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userinfo, "$userinfo");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener == null || onItemClickListener == null) {
            return;
        }
        onItemClickListener.onClick(userinfo, holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<UserInfo> list = this.friendList;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        if (list.size() >= 5) {
            return 5;
        }
        List<UserInfo> list2 = this.friendList;
        Intrinsics.checkNotNull(list2);
        return list2.size();
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        if (onItemClickListener != null) {
            this.onItemClickListener = onItemClickListener;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final FriendRecommendedViewHolder holder, int position) {
        final UserInfo userInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<UserInfo> list = this.friendList;
        if (list == null || (userInfo = list.get(position)) == null) {
            return;
        }
        RoundImageView avatarView = holder.getAvatarView();
        String icon = userInfo.getIcon();
        ImageLoader imageLoader = Coil.imageLoader(avatarView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(avatarView.getContext()).data(icon).target(avatarView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.active.pk.ui.recyclerview.FriendRecommendedAdapter$onBindViewHolder$lambda$2$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                holder.getAvatarView().setImageDrawable(of1.b(ApplicationExtKt.getApplication(), fni.i));
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                holder.getAvatarView().setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        imageLoader.enqueue(builderTarget.build());
        holder.getNickNameTv().setText(userInfo.getNickName());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: fpa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendRecommendedAdapter.onBindViewHolder$lambda$3(this.f18053a, userInfo, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FriendRecommendedViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(bui.f, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new FriendRecommendedViewHolder(this, viewInflate);
    }
}
