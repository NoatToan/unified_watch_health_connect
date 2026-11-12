package com.xiaomi.fitness.feedback.bugreport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceAdapter;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import defpackage.a0j;
import defpackage.cri;
import defpackage.hui;
import defpackage.nuf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004:;<=B\u001f\u0012\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b8\u00109J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R*\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$BottomHolder;", "bottomHolder", "", "bindBottomHolder", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$BottomHolder;)V", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$DeviceHolder;", "holder", "", "position", "bindDeviceHolder", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$DeviceHolder;I)V", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$AppHolder;", "bindAppHolder", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$AppHolder;I)V", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$LableHolder;", "bindLableHolder", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$LableHolder;I)V", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickListener;", "itemClickListener", "setItemClickListener", "(Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickListener;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "getItemViewType", "(I)I", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mItemClickListener", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickListener;", "<init>", "(Ljava/util/List;Landroid/content/Context;)V", "LableHolder", "DeviceHolder", "AppHolder", "BottomHolder", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeedBackDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedBackDeviceAdapter.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,166:1\n54#2,3:167\n24#2:170\n57#2,6:171\n63#2,2:178\n57#3:177\n*S KotlinDebug\n*F\n+ 1 FeedBackDeviceAdapter.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter\n*L\n124#1:167,3\n124#1:170\n124#1:171,6\n124#1:178,2\n124#1:177\n*E\n"})
public final class FeedBackDeviceAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private Context context;

    @NotNull
    private List<FeedbackDeviceInfo> dataList;

    @Nullable
    private OnItemClickListener mItemClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$AppHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/widget/RightArrowBindingSingleLineTextView;", "appNameTv", "Lcom/xiaomi/fitness/widget/RightArrowBindingSingleLineTextView;", "getAppNameTv", "()Lcom/xiaomi/fitness/widget/RightArrowBindingSingleLineTextView;", "setAppNameTv", "(Lcom/xiaomi/fitness/widget/RightArrowBindingSingleLineTextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AppHolder extends RecyclerView.d0 {

        @NotNull
        private RightArrowBindingSingleLineTextView appNameTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(cri.f14642a);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.appNameTv = (RightArrowBindingSingleLineTextView) viewFindViewById;
        }

        @NotNull
        public final RightArrowBindingSingleLineTextView getAppNameTv() {
            return this.appNameTv;
        }

        public final void setAppNameTv(@NotNull RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView) {
            Intrinsics.checkNotNullParameter(rightArrowBindingSingleLineTextView, "<set-?>");
            this.appNameTv = rightArrowBindingSingleLineTextView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$BottomHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "tvTel", "Landroid/widget/TextView;", "getTvTel", "()Landroid/widget/TextView;", "setTvTel", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class BottomHolder extends RecyclerView.d0 {

        @NotNull
        private TextView tvTel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(cri.G);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvTel = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getTvTel() {
            return this.tvTel;
        }

        public final void setTvTel(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvTel = textView;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$DeviceHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "deviceNameTv", "Landroid/widget/TextView;", "getDeviceNameTv", "()Landroid/widget/TextView;", "setDeviceNameTv", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "deviceIconTv", "Landroid/widget/ImageView;", "getDeviceIconTv", "()Landroid/widget/ImageView;", "setDeviceIconTv", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DeviceHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView deviceIconTv;

        @NotNull
        private TextView deviceNameTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(cri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.deviceNameTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(cri.e);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.deviceIconTv = (ImageView) viewFindViewById2;
        }

        @NotNull
        public final ImageView getDeviceIconTv() {
            return this.deviceIconTv;
        }

        @NotNull
        public final TextView getDeviceNameTv() {
            return this.deviceNameTv;
        }

        public final void setDeviceIconTv(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.deviceIconTv = imageView;
        }

        public final void setDeviceNameTv(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.deviceNameTv = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter$LableHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LableHolder extends RecyclerView.d0 {

        @NotNull
        private TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LableHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(cri.g);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.textView = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }

        public final void setTextView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.textView = textView;
        }
    }

    public FeedBackDeviceAdapter(@NotNull List<FeedbackDeviceInfo> dataList, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = dataList;
        this.context = context;
    }

    private final void bindAppHolder(AppHolder holder, int position) {
        FeedbackDeviceInfo feedbackDeviceInfo = this.dataList.get(position);
        if (feedbackDeviceInfo != null) {
            Logger.d("FeedBackDeviceAdapter", "type is APP");
            holder.getAppNameTv().setTitle(feedbackDeviceInfo.getAppName());
        }
    }

    private final void bindBottomHolder(BottomHolder bottomHolder) {
        bottomHolder.getTvTel().setText(a0j.m);
    }

    private final void bindDeviceHolder(DeviceHolder holder, int position) {
        String name;
        FeedbackDeviceInfo feedbackDeviceInfo = this.dataList.get(position);
        if (feedbackDeviceInfo != null) {
            Logger.d("FeedBackDeviceAdapter", "deviceInfo=" + feedbackDeviceInfo);
            TextView deviceNameTv = holder.getDeviceNameTv();
            DeviceData deviceData = feedbackDeviceInfo.getDeviceData();
            if (deviceData == null || (name = deviceData.getName()) == null) {
                name = "";
            }
            deviceNameTv.setText(name);
            ImageView deviceIconTv = holder.getDeviceIconTv();
            DeviceData deviceData2 = feedbackDeviceInfo.getDeviceData();
            Coil.imageLoader(deviceIconTv.getContext()).enqueue(new ImageRequest.Builder(deviceIconTv.getContext()).data(deviceData2 != null ? deviceData2.getBigIcon() : null).target(deviceIconTv).build());
        }
    }

    private final void bindLableHolder(LableHolder holder, int position) {
        if (position != 0) {
            holder.getTextView().setText(this.context.getString(a0j.f486b));
            return;
        }
        FeedbackDeviceInfo feedbackDeviceInfo = this.dataList.get(position);
        if (StringsKt__StringsJVMKt.equals$default(feedbackDeviceInfo != null ? feedbackDeviceInfo.getAppName() : null, FeedBackDeviceAdapterKt.APP_LABLE_NAME, false, 2, null)) {
            holder.getTextView().setText(this.context.getString(a0j.f486b));
        } else {
            holder.getTextView().setText(this.context.getString(a0j.p));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreateViewHolder$lambda$0(FeedBackDeviceAdapter this$0, Ref.ObjectRef view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        OnItemClickListener onItemClickListener = this$0.mItemClickListener;
        if (onItemClickListener != null) {
            T t = view.element;
            View view3 = (View) t;
            Object tag = ((View) t).getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            onItemClickListener.onItemClick(view3, ((Integer) tag).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreateViewHolder$lambda$1(FeedBackDeviceAdapter this$0, Ref.ObjectRef view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        OnItemClickListener onItemClickListener = this$0.mItemClickListener;
        if (onItemClickListener != null) {
            T t = view.element;
            View view3 = (View) t;
            Object tag = ((View) t).getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            onItemClickListener.onItemClick(view3, ((Integer) tag).intValue());
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<FeedbackDeviceInfo> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        DeviceData deviceData;
        DeviceData deviceData2;
        FeedbackDeviceInfo feedbackDeviceInfo = this.dataList.get(position);
        if ((feedbackDeviceInfo != null ? feedbackDeviceInfo.getDeviceData() : null) != null) {
            FeedbackDeviceInfo feedbackDeviceInfo2 = this.dataList.get(position);
            if (((feedbackDeviceInfo2 == null || (deviceData2 = feedbackDeviceInfo2.getDeviceData()) == null) ? null : deviceData2.getModel()) != null) {
                return 2;
            }
        }
        if (this.dataList.get(position) == null && position == getCount() - 1 && !AppUtil.INSTANCE.isPlayChannel()) {
            return 4;
        }
        if (this.dataList.get(position) != null) {
            FeedbackDeviceInfo feedbackDeviceInfo3 = this.dataList.get(position);
            if (!StringsKt__StringsJVMKt.equals$default(feedbackDeviceInfo3 != null ? feedbackDeviceInfo3.getAppName() : null, FeedBackDeviceAdapterKt.APP_LABLE_NAME, false, 2, null)) {
                if (position != 0) {
                    FeedbackDeviceInfo feedbackDeviceInfo4 = this.dataList.get(position);
                    if ((feedbackDeviceInfo4 != null ? feedbackDeviceInfo4.getDeviceData() : null) == null) {
                        return 3;
                    }
                }
                return 2;
            }
        }
        FeedbackDeviceInfo feedbackDeviceInfo5 = this.dataList.get(position);
        String model = (feedbackDeviceInfo5 == null || (deviceData = feedbackDeviceInfo5.getDeviceData()) == null) ? null : deviceData.getModel();
        FeedbackDeviceInfo feedbackDeviceInfo6 = this.dataList.get(position);
        Logger.d("FeedBackDeviceAdapter", "TYPE_LABLE " + model + ", position is " + position + ", dataList[position]?.deviceData " + (feedbackDeviceInfo6 != null ? feedbackDeviceInfo6.getDeviceData() : null));
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setTag(Integer.valueOf(position));
        Logger.d("FeedBackDeviceAdapter", "position is " + position + " datalist is " + this.dataList.get(position));
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            bindLableHolder((LableHolder) holder, position);
            return;
        }
        if (itemViewType == 2) {
            bindDeviceHolder((DeviceHolder) holder, position);
        } else if (itemViewType == 3) {
            bindAppHolder((AppHolder) holder, position);
        } else {
            if (itemViewType != 4) {
                return;
            }
            bindBottomHolder((BottomHolder) holder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, android.view.View] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Logger.d("FeedBackDeviceAdapter", "onCreateViewHolder " + viewType + " ");
        if (viewType == 2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? Inflate = LayoutInflater.from(this.context).inflate(hui.h, parent, false);
            objectRef.element = Inflate;
            nuf.f(Inflate);
            ((View) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: qh9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedBackDeviceAdapter.onCreateViewHolder$lambda$0(this.f31517a, objectRef, view);
                }
            });
            T element = objectRef.element;
            Intrinsics.checkNotNullExpressionValue(element, "element");
            return new DeviceHolder((View) element);
        }
        if (viewType != 3) {
            if (viewType != 4) {
                View viewInflate = LayoutInflater.from(this.context).inflate(hui.t, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                return new LableHolder(viewInflate);
            }
            View viewInflate2 = LayoutInflater.from(this.context).inflate(hui.u, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new BottomHolder(viewInflate2);
        }
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? Inflate2 = LayoutInflater.from(this.context).inflate(hui.f, parent, false);
        objectRef2.element = Inflate2;
        Inflate2.setOnClickListener(new View.OnClickListener() { // from class: rh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedBackDeviceAdapter.onCreateViewHolder$lambda$1(this.f32542a, objectRef2, view);
            }
        });
        T element2 = objectRef2.element;
        Intrinsics.checkNotNullExpressionValue(element2, "element");
        return new AppHolder((View) element2);
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<FeedbackDeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setItemClickListener(@NotNull OnItemClickListener itemClickListener) {
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.mItemClickListener = itemClickListener;
    }
}
