package com.mi.health.message.center.ui.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import coil.util.CoilUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.health.message.center.entity.AbnormalData;
import com.mi.health.message.center.entity.MessageData;
import com.mi.health.message.center.entity.RelativeExtraData;
import com.mi.health.message.center.pref.MessageCenterPreference;
import com.mi.health.message.center.ui.adapter.RelativeCardMessageCenterAdapter;
import com.mi.health.message.center.util.ImageUtils;
import com.mi.health.message.center.util.MessageCenterExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.brf;
import defpackage.fzi;
import defpackage.zmi;
import defpackage.zqf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0004\u001c\u001d\u001e\u001fB\u001b\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnItemClickListener", "(Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$OnItemClickListener;)V", "", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "onItemClickListener", "Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$OnItemClickListener;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/h$f;)V", "Companion", "AgreeOrRejectViewHolder", "MessageDetailViewHolder", "OnItemClickListener", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RelativeCardMessageCenterAdapter extends PagingDataAdapter<MessageData<RelativeExtraData>, RecyclerView.d0> {
    public static final int ITEM_TYPE_DATA_ABNORMAL = 4;
    public static final int ITEM_TYPE_DATA_MODIFY = 3;
    public static final int ITEM_TYPE_DATA_REQUEST = 2;
    public static final int ITEM_TYPE_DATA_REQUEST_FEEDBACK = 8;
    public static final int ITEM_TYPE_DATA_REQUEST_OPPOSITE_FEEDBACK = 6;
    public static final int ITEM_TYPE_FOCUS_OPPOSITE_FEEDBACK = 5;
    public static final int ITEM_TYPE_FOCUS_REQUEST = 1;
    public static final int ITEM_TYPE_FOCUS_REQUEST_FEEDBACK = 7;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$AgreeOrRejectViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "url", "", "loadAvatar", "(Ljava/lang/String;)V", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "messageData", "", "viewType", "bindData", "(Lcom/mi/health/message/center/entity/MessageData;I)V", "Lzqf;", "binding", "Lzqf;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "ivAvatar", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Landroid/widget/TextView;", "tvAgree", "Landroid/widget/TextView;", "getTvAgree", "()Landroid/widget/TextView;", "tvReject", "getTvReject", "<init>", "(Lzqf;)V", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRelativeCardMessageCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeCardMessageCenterAdapter.kt\ncom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$AgreeOrRejectViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,255:1\n71#2,2:256\n*S KotlinDebug\n*F\n+ 1 RelativeCardMessageCenterAdapter.kt\ncom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$AgreeOrRejectViewHolder\n*L\n147#1:256,2\n*E\n"})
    public static final class AgreeOrRejectViewHolder extends RecyclerView.d0 {

        @NotNull
        private final zqf binding;

        @NotNull
        private final RoundImageView ivAvatar;

        @NotNull
        private final TextView tvAgree;

        @NotNull
        private final TextView tvReject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreeOrRejectViewHolder(@NotNull zqf binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
            RoundImageView ivAvatar = binding.B;
            Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
            this.ivAvatar = ivAvatar;
            TextView tvAgree = binding.C;
            Intrinsics.checkNotNullExpressionValue(tvAgree, "tvAgree");
            this.tvAgree = tvAgree;
            TextView tvReject = binding.E;
            Intrinsics.checkNotNullExpressionValue(tvReject, "tvReject");
            this.tvReject = tvReject;
        }

        private final void loadAvatar(String url) {
            if (TextUtils.isEmpty(url)) {
                CoilUtils.dispose(this.ivAvatar);
                this.ivAvatar.setImageResource(zmi.f41464a);
            } else {
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                RoundImageView roundImageView = this.ivAvatar;
                Intrinsics.checkNotNull(url);
                imageUtils.loadAvatar(roundImageView, url);
            }
        }

        public final void bindData(@NotNull MessageData<RelativeExtraData> messageData, int viewType) {
            String nickName;
            Intrinsics.checkNotNullParameter(messageData, "messageData");
            RelativeExtraData relativeExtraData = (RelativeExtraData) messageData.getExtraEntity();
            loadAvatar(relativeExtraData != null ? relativeExtraData.getIcon() : null);
            RelativeExtraData relativeExtraData2 = (RelativeExtraData) messageData.getExtraEntity();
            if (relativeExtraData2 == null || (nickName = relativeExtraData2.getNickName()) == null) {
                nickName = "";
            }
            if (viewType == 1) {
                this.binding.D.setText(ResourceExtKt.getString(fzi.q, nickName));
            } else {
                if (viewType != 2) {
                    return;
                }
                RelativeExtraData relativeExtraData3 = (RelativeExtraData) messageData.getExtraEntity();
                this.binding.D.setText(ResourceExtKt.getString(fzi.l, nickName, MessageCenterExtKt.getAuthDataByList(relativeExtraData3 != null ? relativeExtraData3.getAuthDataList() : null)));
            }
        }

        @NotNull
        public final TextView getTvAgree() {
            return this.tvAgree;
        }

        @NotNull
        public final TextView getTvReject() {
            return this.tvReject;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$MessageDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "url", "", "loadAvatar", "(Ljava/lang/String;)V", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "messageData", "", "viewType", "bindData", "(Lcom/mi/health/message/center/entity/MessageData;I)V", "Lbrf;", "binding", "Lbrf;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "ivAvatar", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "<init>", "(Lbrf;)V", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRelativeCardMessageCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeCardMessageCenterAdapter.kt\ncom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$MessageDetailViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,255:1\n71#2,2:256\n*S KotlinDebug\n*F\n+ 1 RelativeCardMessageCenterAdapter.kt\ncom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$MessageDetailViewHolder\n*L\n242#1:256,2\n*E\n"})
    public static final class MessageDetailViewHolder extends RecyclerView.d0 {

        @NotNull
        private final brf binding;

        @NotNull
        private final RoundImageView ivAvatar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageDetailViewHolder(@NotNull brf binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
            RoundImageView ivAvatar = binding.D;
            Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
            this.ivAvatar = ivAvatar;
        }

        private final void loadAvatar(String url) {
            if (TextUtils.isEmpty(url)) {
                CoilUtils.dispose(this.ivAvatar);
                this.ivAvatar.setImageResource(zmi.f41464a);
            } else {
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                RoundImageView roundImageView = this.ivAvatar;
                Intrinsics.checkNotNull(url);
                imageUtils.loadAvatar(roundImageView, url);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindData(@NotNull MessageData<RelativeExtraData> messageData, int viewType) {
            String nickName;
            Intrinsics.checkNotNullParameter(messageData, "messageData");
            RelativeExtraData relativeExtraData = (RelativeExtraData) messageData.getExtraEntity();
            loadAvatar(relativeExtraData != null ? relativeExtraData.getIcon() : null);
            RelativeExtraData relativeExtraData2 = (RelativeExtraData) messageData.getExtraEntity();
            if (relativeExtraData2 == null || (nickName = relativeExtraData2.getNickName()) == null) {
                nickName = "";
            }
            TextView tvTime = this.binding.H;
            Intrinsics.checkNotNullExpressionValue(tvTime, "tvTime");
            ViewExtKt.setVisible(tvTime, messageData.getLastModifyTime() != null);
            Long lastModifyTime = messageData.getLastModifyTime();
            if (lastModifyTime != null) {
                this.binding.H.setText(MessageCenterExtKt.secondTimeFormat(lastModifyTime.longValue()));
            }
            long latest_pre_message_time = MessageCenterPreference.INSTANCE.getLATEST_PRE_MESSAGE_TIME();
            boolean z = messageData.getLastModifyTime() != null && latest_pre_message_time > 0 && messageData.getLastModifyTime().longValue() >= latest_pre_message_time;
            ImageView ivDot = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(ivDot, "ivDot");
            ViewExtKt.setVisible(ivDot, z);
            switch (viewType) {
                case 3:
                    RelativeExtraData relativeExtraData3 = (RelativeExtraData) messageData.getExtraEntity();
                    this.binding.F.setText(ResourceExtKt.getString(fzi.f18398r, nickName, MessageCenterExtKt.getAuthDataByList(relativeExtraData3 != null ? relativeExtraData3.getAuthDataList() : null)));
                    TextView tvStatus = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                    ViewExtKt.setVisible(tvStatus, false);
                    break;
                case 4:
                    RelativeExtraData relativeExtraData4 = (RelativeExtraData) messageData.getExtraEntity();
                    AbnormalData abnormalData = relativeExtraData4 != null ? relativeExtraData4.getAbnormalData() : null;
                    if ((abnormalData != null ? abnormalData.getKey() : null) != null && abnormalData.getTimeStamp() != null) {
                        this.binding.F.setText(ResourceExtKt.getString(fzi.f18397k, nickName, MessageCenterExtKt.secondTimeFormat(abnormalData.getTimeStamp().longValue()), MessageCenterExtKt.getAbnormalStr(abnormalData.getKey())));
                    }
                    TextView tvStatus2 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(tvStatus2, "tvStatus");
                    ViewExtKt.setVisible(tvStatus2, false);
                    break;
                case 5:
                    Integer dataStatus = messageData.getDataStatus();
                    this.binding.F.setText(ResourceExtKt.getString((dataStatus != null && dataStatus.intValue() == 1) ? fzi.s : fzi.t, nickName));
                    TextView tvStatus3 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(tvStatus3, "tvStatus");
                    ViewExtKt.setVisible(tvStatus3, false);
                    break;
                case 6:
                    Integer dataStatus2 = messageData.getDataStatus();
                    int i = (dataStatus2 != null && dataStatus2.intValue() == 1) ? fzi.m : fzi.n;
                    RelativeExtraData relativeExtraData5 = (RelativeExtraData) messageData.getExtraEntity();
                    this.binding.F.setText(ResourceExtKt.getString(i, nickName, MessageCenterExtKt.getAuthDataByList(relativeExtraData5 != null ? relativeExtraData5.getAuthDataList() : null)));
                    TextView tvStatus4 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(tvStatus4, "tvStatus");
                    ViewExtKt.setVisible(tvStatus4, false);
                    break;
                case 7:
                    Integer dataStatus3 = messageData.getDataStatus();
                    Object[] objArr = dataStatus3 != null && dataStatus3.intValue() == 1;
                    int i2 = objArr != false ? fzi.o : fzi.p;
                    this.binding.F.setText(ResourceExtKt.getString(fzi.q, nickName));
                    this.binding.G.setText(ResourceExtKt.getString(i2));
                    if (objArr == true) {
                        this.binding.G.setCompoundDrawablesWithIntrinsicBounds(zmi.d, 0, 0, 0);
                    } else {
                        this.binding.G.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                    TextView tvStatus5 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(tvStatus5, "tvStatus");
                    ViewExtKt.setVisible(tvStatus5, true);
                    break;
                case 8:
                    RelativeExtraData relativeExtraData6 = (RelativeExtraData) messageData.getExtraEntity();
                    this.binding.F.setText(ResourceExtKt.getString(fzi.l, nickName, MessageCenterExtKt.getAuthDataByList(relativeExtraData6 != null ? relativeExtraData6.getAuthDataList() : null)));
                    Integer dataStatus4 = messageData.getDataStatus();
                    Object[] objArr2 = dataStatus4 != null && dataStatus4.intValue() == 1;
                    this.binding.G.setText(ResourceExtKt.getString(objArr2 != false ? fzi.o : fzi.p));
                    if (objArr2 == true) {
                        this.binding.G.setCompoundDrawablesWithIntrinsicBounds(zmi.d, 0, 0, 0);
                    } else {
                        this.binding.G.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                    TextView tvStatus6 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(tvStatus6, "tvStatus");
                    ViewExtKt.setVisible(tvStatus6, true);
                    break;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\f"}, d2 = {"Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter$OnItemClickListener;", "", "onItemClick", "", "messageData", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "onItemAgree", "tvAgree", "Landroid/widget/TextView;", "onItemReject", "tvReject", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemAgree(@NotNull TextView tvAgree, @NotNull MessageData<RelativeExtraData> messageData);

        void onItemClick(@NotNull MessageData<RelativeExtraData> messageData);

        void onItemReject(@NotNull TextView tvReject, @NotNull MessageData<RelativeExtraData> messageData);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeCardMessageCenterAdapter(@NotNull h.f<MessageData<RelativeExtraData>> diffCallback) {
        super(diffCallback, null, null, 6, null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(RelativeCardMessageCenterAdapter this$0, RecyclerView.d0 holder, MessageData messageData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemAgree(((AgreeOrRejectViewHolder) holder).getTvAgree(), messageData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(RelativeCardMessageCenterAdapter this$0, RecyclerView.d0 holder, MessageData messageData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemReject(((AgreeOrRejectViewHolder) holder).getTvReject(), messageData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(RelativeCardMessageCenterAdapter this$0, MessageData messageData, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(messageData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        MessageData<RelativeExtraData> item = getItem(position);
        Intrinsics.checkNotNull(item);
        switch (item.getType()) {
            case 1:
                Integer dataStatus = item.getDataStatus();
                return (dataStatus != null && dataStatus.intValue() == 0) ? 1 : 7;
            case 2:
                Integer dataStatus2 = item.getDataStatus();
                return (dataStatus2 != null && dataStatus2.intValue() == 0) ? 2 : 8;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return super.getItemViewType(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final MessageData<RelativeExtraData> item = getItem(position);
        if (item == null) {
            return;
        }
        if (holder instanceof AgreeOrRejectViewHolder) {
            AgreeOrRejectViewHolder agreeOrRejectViewHolder = (AgreeOrRejectViewHolder) holder;
            agreeOrRejectViewHolder.bindData(item, getItemViewType(position));
            agreeOrRejectViewHolder.getTvAgree().setOnClickListener(new View.OnClickListener() { // from class: odk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelativeCardMessageCenterAdapter.onBindViewHolder$lambda$0(this.f29037a, holder, item, view);
                }
            });
            agreeOrRejectViewHolder.getTvReject().setOnClickListener(new View.OnClickListener() { // from class: pdk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelativeCardMessageCenterAdapter.onBindViewHolder$lambda$1(this.f30297a, holder, item, view);
                }
            });
            return;
        }
        if (holder instanceof MessageDetailViewHolder) {
            ((MessageDetailViewHolder) holder).bindData(item, getItemViewType(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: qdk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelativeCardMessageCenterAdapter.onBindViewHolder$lambda$2(this.f31414a, item, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1 || viewType == 2) {
            zqf zqfVarA0 = zqf.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(zqfVarA0, "inflate(...)");
            return new AgreeOrRejectViewHolder(zqfVarA0);
        }
        brf brfVarA0 = brf.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(brfVarA0, "inflate(...)");
        return new MessageDetailViewHolder(brfVarA0);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }
}
