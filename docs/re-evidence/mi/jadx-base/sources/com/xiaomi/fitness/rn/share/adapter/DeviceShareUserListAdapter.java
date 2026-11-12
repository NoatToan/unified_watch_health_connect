package com.xiaomi.fitness.rn.share.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.rn.share.adapter.DeviceShareUserListAdapter;
import com.xiaomi.fitness.rn.share.bean.UserListBean;
import defpackage.avi;
import defpackage.coi;
import defpackage.tri;
import defpackage.w0j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001'B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u00020\n2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter$DeviceShareUserListHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "onDeleteClick", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getOnDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setOnDeleteClick", "(Lkotlin/jvm/functions/Function1;)V", "isEditMode", "", "()Z", "setEditMode", "(Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "DeviceShareUserListHolder", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceShareUserListAdapter extends RecyclerView.Adapter<DeviceShareUserListHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<UserListBean> dataList;
    private boolean isEditMode;

    @Nullable
    private Function1<? super UserListBean, Unit> onDeleteClick;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u001a\u001a\n \u000f*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\n \u000f*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR*\u0010#\u001a\n \u000f*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR*\u0010&\u001a\n \u000f*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001f¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter$DeviceShareUserListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "userListBean", "", "bind", "(Lcom/xiaomi/fitness/rn/share/bean/UserListBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "deleteView", "Landroid/widget/ImageView;", "getDeleteView", "()Landroid/widget/ImageView;", "setDeleteView", "(Landroid/widget/ImageView;)V", "iconView", "getIconView", "setIconView", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "idView", "getIdView", "setIdView", "statusView", "getStatusView", "setStatusView", "dateView", "getDateView", "setDateView", "<init>", "(Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter;Landroid/view/View;)V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nDeviceShareUserListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceShareUserListAdapter.kt\ncom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter$DeviceShareUserListHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,72:1\n1#2:73\n54#3,3:74\n24#3:77\n59#3,6:78\n*S KotlinDebug\n*F\n+ 1 DeviceShareUserListAdapter.kt\ncom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter$DeviceShareUserListHolder\n*L\n37#1:74,3\n37#1:77\n37#1:78,6\n*E\n"})
    public final class DeviceShareUserListHolder extends RecyclerView.d0 {
        private TextView dateView;
        private ImageView deleteView;
        private ImageView iconView;
        private TextView idView;
        private TextView nameView;
        private TextView statusView;
        final /* synthetic */ DeviceShareUserListAdapter this$0;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceShareUserListHolder(@NotNull DeviceShareUserListAdapter deviceShareUserListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = deviceShareUserListAdapter;
            this.view = view;
            this.deleteView = (ImageView) view.findViewById(tri.d);
            this.iconView = (ImageView) this.view.findViewById(tri.i);
            this.nameView = (TextView) this.view.findViewById(tri.n);
            this.idView = (TextView) this.view.findViewById(tri.j);
            this.statusView = (TextView) this.view.findViewById(tri.t);
            this.dateView = (TextView) this.view.findViewById(tri.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(DeviceShareUserListAdapter this$0, UserListBean userListBean, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(userListBean, "$userListBean");
            Function1<UserListBean, Unit> onDeleteClick = this$0.getOnDeleteClick();
            if (onDeleteClick != null) {
                onDeleteClick.invoke2(userListBean);
            }
        }

        public final void bind(@NotNull final UserListBean userListBean) {
            Intrinsics.checkNotNullParameter(userListBean, "userListBean");
            TextView textView = this.nameView;
            String nickname = userListBean.getNickname();
            if (nickname.length() == 0) {
                nickname = userListBean.getUserid();
            }
            textView.setText(nickname);
            ImageView iconView = this.iconView;
            Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
            String icon = userListBean.getIcon();
            ImageLoader imageLoader = Coil.imageLoader(iconView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(iconView.getContext()).data(icon).target(iconView);
            builderTarget.placeholder(coi.e);
            builderTarget.error(coi.e);
            builderTarget.transformations(new CircleCropTransformation());
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            imageLoader.enqueue(builderTarget.build());
            this.idView.setText(userListBean.getUserid());
            if (userListBean.getStatus() == 1) {
                this.statusView.setText(w0j.h);
            } else {
                this.statusView.setText(w0j.i);
            }
            this.dateView.setText(new SimpleDateFormat(ResourceExtKt.getString(w0j.d), Locale.getDefault()).format(new Date(userListBean.getSharetime() * ((long) 1000))));
            if (this.this$0.getIsEditMode()) {
                this.deleteView.setVisibility(0);
            } else {
                this.deleteView.setVisibility(8);
            }
            ImageView imageView = this.deleteView;
            final DeviceShareUserListAdapter deviceShareUserListAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: fp6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceShareUserListAdapter.DeviceShareUserListHolder.bind$lambda$2(deviceShareUserListAdapter, userListBean, view);
                }
            });
        }

        public final TextView getDateView() {
            return this.dateView;
        }

        public final ImageView getDeleteView() {
            return this.deleteView;
        }

        public final ImageView getIconView() {
            return this.iconView;
        }

        public final TextView getIdView() {
            return this.idView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }

        public final TextView getStatusView() {
            return this.statusView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setDateView(TextView textView) {
            this.dateView = textView;
        }

        public final void setDeleteView(ImageView imageView) {
            this.deleteView = imageView;
        }

        public final void setIconView(ImageView imageView) {
            this.iconView = imageView;
        }

        public final void setIdView(TextView textView) {
            this.idView = textView;
        }

        public final void setNameView(TextView textView) {
            this.nameView = textView;
        }

        public final void setStatusView(TextView textView) {
            this.statusView = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public /* synthetic */ DeviceShareUserListAdapter(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : function1);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<UserListBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<UserListBean, Unit> getOnDeleteClick() {
        return this.onDeleteClick;
    }

    /* JADX INFO: renamed from: isEditMode, reason: from getter */
    public final boolean getIsEditMode() {
        return this.isEditMode;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<UserListBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setEditMode(boolean z) {
        this.isEditMode = z;
    }

    public final void setOnDeleteClick(@Nullable Function1<? super UserListBean, Unit> function1) {
        this.onDeleteClick = function1;
    }

    public DeviceShareUserListAdapter(@NotNull Context context, @NotNull List<UserListBean> dataList, @Nullable Function1<? super UserListBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.onDeleteClick = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DeviceShareUserListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceShareUserListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(avi.g, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new DeviceShareUserListHolder(this, viewInflate);
    }
}
