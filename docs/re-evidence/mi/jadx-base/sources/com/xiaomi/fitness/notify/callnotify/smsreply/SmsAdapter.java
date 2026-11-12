package com.xiaomi.fitness.notify.callnotify.smsreply;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.notify.callnotify.smsreply.SmsAdapter;
import com.xiaomi.fitness.notify.util.KeyboardUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.kzg;
import defpackage.q0j;
import defpackage.xni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 Q2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004RSTQB\u000f\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\bO\u0010PJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\t2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\t2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u0011J#\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J#\u00100\u001a\u00020\t2\n\u0010/\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0016\u0010>\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bL\u00103R\u0011\u0010N\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bN\u0010K¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$ViewHolder;", "", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "", "deepCopy", "(Ljava/util/List;)Ljava/util/List;", "data", "", "setDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;", "targetMode", "changeEditMode", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;)V", "notifyDataAllChanged", "()V", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemDeleteListener", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Landroid/view/View;", "setOnItemLongClickListener", "(Lkotlin/jvm/functions/Function2;)V", "position", "getItem", "(I)Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "sms", "createItem", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;)V", "editItem", "(I)V", "Lkotlin/Function0;", "delete", "deleteItem", "(ILkotlin/jvm/functions/Function0;)V", "finishEdit", "(Lkotlin/jvm/functions/Function0;)V", "cancelEdit", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$ViewHolder;", "holder", "onBindViewHolder", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$ViewHolder;I)V", "getItemCount", "()I", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "displayMode", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;", "originalList", "editIndex", "I", "editSms", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$TextChangeListener;", "editTextChangeListener", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$TextChangeListener;", "mIconClickListener", "Lkotlin/jvm/functions/Function1;", "mItemLongClickListener", "Lkotlin/jvm/functions/Function2;", "", "isEditMode", "()Z", "getDataSize", "dataSize", "isDataChanged", "<init>", "(Landroidx/recyclerview/widget/l;)V", "Companion", "ViewHolder", "TextChangeListener", "Sms", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SmsAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NotNull
    public static final String TAG = "SmsAdapter";

    @NotNull
    private final List<Sms> dataList;

    @NotNull
    private DisplayMode displayMode;
    private int editIndex;

    @Nullable
    private Sms editSms;

    @Nullable
    private TextChangeListener editTextChangeListener;

    @Nullable
    private Function1<? super Integer, Unit> mIconClickListener;

    @Nullable
    private Function2<? super Integer, ? super View, Unit> mItemLongClickListener;

    @NotNull
    private final l mItemTouchHelper;

    @Nullable
    private List<Sms> originalList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "", "id", "", MiuiCursorConstants.CONTENT, "", "<init>", "(ILjava/lang/String;)V", "(Ljava/lang/String;)V", "getId", "()I", "getContent", "()Ljava/lang/String;", "setContent", "convert2ReplyMsg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sms {

        @NotNull
        private String content;
        private final int id;

        public Sms(int i, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = i;
            this.content = content;
        }

        public static /* synthetic */ Sms copy$default(Sms sms, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = sms.id;
            }
            if ((i2 & 2) != 0) {
                str = sms.content;
            }
            return sms.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final ReplyMsg convert2ReplyMsg() {
            return new ReplyMsg(this.id, this.content);
        }

        @NotNull
        public final Sms copy(int id, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Sms(id, content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sms)) {
                return false;
            }
            Sms sms = (Sms) other;
            return this.id == sms.id && Intrinsics.areEqual(this.content, sms.content);
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + this.content.hashCode();
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }

        @NotNull
        public String toString() {
            return "Sms(id=" + this.id + ", content=" + this.content + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Sms(@NotNull String content) {
            this((int) (System.currentTimeMillis() / ((long) 1000)), content);
            Intrinsics.checkNotNullParameter(content, "content");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J*\u0010\u0011\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0014H\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$TextChangeListener;", "Landroid/text/TextWatcher;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getListener", "()Lkotlin/jvm/functions/Function1;", "beforeTextChanged", "s", "", StatConstants.PARAM_START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextChangeListener implements TextWatcher {

        @Nullable
        private final Function1<String, Unit> listener;

        /* JADX WARN: Multi-variable type inference failed */
        public TextChangeListener(@Nullable Function1<? super String, Unit> function1) {
            this.listener = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
        }

        @Nullable
        public final Function1<String, Unit> getListener() {
            return this.listener;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
            String string;
            Function1<String, Unit> function1 = this.listener;
            if (function1 != null) {
                if (s == null || (string = s.toString()) == null) {
                    string = "";
                }
                function1.invoke2(string);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "dp", "", "dp2px", "(F)I", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "data", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;", "displayMode", "", "bind", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;Lcom/xiaomi/fitness/notify/callnotify/smsreply/DisplayMode;)V", "Lkzg;", "mViewBinding", "Lkzg;", "getMViewBinding", "()Lkzg;", "Landroid/widget/EditText;", "mContentView", "Landroid/widget/EditText;", "getMContentView", "()Landroid/widget/EditText;", "<init>", "(Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter;Lkzg;)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ViewHolder extends RecyclerView.d0 {

        @NotNull
        private final EditText mContentView;

        @NotNull
        private final kzg mViewBinding;
        final /* synthetic */ SmsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull SmsAdapter smsAdapter, kzg mViewBinding) {
            super(mViewBinding.getRoot());
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.this$0 = smsAdapter;
            this.mViewBinding = mViewBinding;
            miuix.androidbasewidget.widget.EditText content = mViewBinding.B;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            this.mContentView = content;
        }

        private final int dp2px(float dp) {
            return (int) TypedValue.applyDimension(1, dp, this.mViewBinding.getRoot().getResources().getDisplayMetrics());
        }

        public final void bind(@NotNull Sms data, @NotNull DisplayMode displayMode) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            boolean z = displayMode == DisplayMode.DELETE_OR_SORT;
            this.mViewBinding.C.setVisibility(z ? 0 : 8);
            this.mViewBinding.D.setVisibility(z ? 0 : 8);
            ImageView imageView = this.mViewBinding.D;
            final SmsAdapter smsAdapter = this.this$0;
            imageView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.SmsAdapter$ViewHolder$bind$1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ResourceExtKt.getString(q0j.g)));
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean performAccessibilityAction(View host, int action, Bundle args) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    if (action == 16) {
                        smsAdapter.mItemTouchHelper.x(this);
                    }
                    return super.performAccessibilityAction(host, action, args);
                }
            });
            int iDp2px = !z ? dp2px(26.6f) : 0;
            this.mContentView.setPadding(iDp2px, 0, iDp2px, 0);
            boolean z2 = displayMode == DisplayMode.CREATE || displayMode == DisplayMode.UPDATE;
            this.mContentView.setFocusable(z2);
            this.mContentView.setFocusableInTouchMode(z2);
            this.mContentView.setCursorVisible(z2);
            this.mContentView.setClickable(z2);
            this.mContentView.setLongClickable(true);
            this.mViewBinding.A.setVisibility(z2 ? 0 : 8);
            this.mContentView.setText(data.getContent(), TextView.BufferType.EDITABLE);
            if (!z2) {
                this.mContentView.setBackgroundResource(xni.g);
            } else {
                this.mContentView.setBackground(null);
                KeyboardUtils.INSTANCE.showKeyboard(this.mContentView);
            }
        }

        @NotNull
        public final EditText getMContentView() {
            return this.mContentView;
        }

        @NotNull
        public final kzg getMViewBinding() {
            return this.mViewBinding;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayMode.values().length];
            try {
                iArr[DisplayMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayMode.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SmsAdapter(@NotNull l mItemTouchHelper) {
        Intrinsics.checkNotNullParameter(mItemTouchHelper, "mItemTouchHelper");
        this.mItemTouchHelper = mItemTouchHelper;
        this.dataList = new ArrayList();
        this.displayMode = DisplayMode.NORMAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createItem$lambda$0(SmsAdapter this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Sms sms = this$0.editSms;
        if (sms != null) {
            sms.setContent(it);
        }
        return Unit.INSTANCE;
    }

    private final List<Sms> deepCopy(List<Sms> list) {
        Gson gson = new Gson();
        Object objFromJson = gson.fromJson(gson.toJson(list), new TypeToken<List<? extends Sms>>() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.SmsAdapter.deepCopy.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit editItem$lambda$1(SmsAdapter this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Sms sms = this$0.editSms;
        if (sms != null) {
            sms.setContent(it);
        }
        return Unit.INSTANCE;
    }

    private final boolean isEditMode() {
        DisplayMode displayMode = this.displayMode;
        return displayMode == DisplayMode.CREATE || displayMode == DisplayMode.UPDATE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(SmsAdapter this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.EditText");
            ((EditText) view).addTextChangedListener(this$0.editTextChangeListener);
        } else {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) view;
            editText.removeTextChangedListener(this$0.editTextChangeListener);
            editText.setOnFocusChangeListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(SmsAdapter this$0, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Function1<? super Integer, Unit> function1 = this$0.mIconClickListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(holder.getBindingAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$6(SmsAdapter this$0, ViewHolder holder, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this$0.mItemTouchHelper.x(holder);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$7(SmsAdapter this$0, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Function2<? super Integer, ? super View, Unit> function2 = this$0.mItemLongClickListener;
        if (function2 == null) {
            return true;
        }
        function2.invoke(Integer.valueOf(holder.getBindingAdapterPosition()), holder.getMContentView());
        return true;
    }

    public final void cancelEdit() {
        List<Sms> list;
        int i = WhenMappings.$EnumSwitchMapping$0[this.displayMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.editIndex < this.dataList.size()) {
                    this.dataList.remove(this.editIndex);
                }
            } else {
                if (Intrinsics.areEqual(this.dataList, this.originalList) || (list = this.originalList) == null) {
                    return;
                }
                this.dataList.clear();
                this.dataList.addAll(list);
            }
        }
    }

    public final void changeEditMode(@NotNull DisplayMode targetMode) {
        Intrinsics.checkNotNullParameter(targetMode, "targetMode");
        Logger.i(TAG, "changeEditMode " + this.displayMode + " " + targetMode + " ");
        if (this.displayMode == targetMode) {
            return;
        }
        this.displayMode = targetMode;
        DisplayMode displayMode = DisplayMode.NORMAL;
        if (targetMode == displayMode || targetMode == DisplayMode.DELETE_OR_SORT) {
            notifyDataAllChanged();
        }
        if (this.displayMode != displayMode) {
            this.originalList = deepCopy(this.dataList);
        }
    }

    public final void createItem(@NotNull Sms sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        this.editIndex = this.dataList.size();
        this.editSms = new Sms(sms.getContent());
        this.editTextChangeListener = new TextChangeListener(new Function1() { // from class: h3n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SmsAdapter.createItem$lambda$0(this.f19656a, (String) obj);
            }
        });
        this.dataList.add(sms);
        notifyItemInserted(this.editIndex);
    }

    public final void deleteItem(int position, @NotNull Function0<Unit> delete) {
        Intrinsics.checkNotNullParameter(delete, "delete");
        Logger.i(TAG, "deleteItem " + position);
        if (position == 0 && this.dataList.size() == 1) {
            delete.invoke();
        } else if (this.dataList.size() > position) {
            this.dataList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public final void editItem(int position) {
        Logger.i(TAG, "editItem " + position);
        this.editIndex = position;
        this.editSms = new Sms(this.dataList.get(position).getContent());
        this.editTextChangeListener = new TextChangeListener(new Function1() { // from class: i3n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SmsAdapter.editItem$lambda$1(this.f20745a, (String) obj);
            }
        });
        notifyItemChanged(this.editIndex);
    }

    public final void finishEdit(@NotNull Function0<Unit> delete) {
        String content;
        Intrinsics.checkNotNullParameter(delete, "delete");
        if (isEditMode()) {
            Sms sms = this.editSms;
            if (sms == null || (content = sms.getContent()) == null) {
                deleteItem(this.editIndex, delete);
                return;
            }
            if (content.length() == 0) {
                deleteItem(this.editIndex, delete);
            } else if (this.editIndex > this.dataList.size() || !TextUtils.equals(this.dataList.get(this.editIndex).getContent(), content)) {
                this.dataList.get(this.editIndex).setContent(content);
            } else {
                cancelEdit();
            }
        }
    }

    @NotNull
    public final List<Sms> getDataList() {
        return this.dataList;
    }

    public final int getDataSize() {
        return this.dataList.size();
    }

    @Nullable
    public final Sms getItem(int position) {
        if (position < 0 || position >= this.dataList.size()) {
            return null;
        }
        return this.dataList.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final boolean isDataChanged() {
        return !Intrinsics.areEqual(this.originalList, this.dataList);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void notifyDataAllChanged() {
        notifyDataSetChanged();
    }

    public final void setDataList(@NotNull List<Sms> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.dataList.clear();
        this.dataList.addAll(data);
        notifyDataAllChanged();
    }

    public final void setOnItemDeleteListener(@Nullable Function1<? super Integer, Unit> listener) {
        this.mIconClickListener = listener;
    }

    public final void setOnItemLongClickListener(@Nullable Function2<? super Integer, ? super View, Unit> listener) {
        this.mItemLongClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@NotNull final ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Sms sms = this.dataList.get(position);
        DisplayMode displayMode = this.displayMode;
        if (isEditMode()) {
            if (position == this.editIndex) {
                holder.getMContentView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: j3n
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        SmsAdapter.onBindViewHolder$lambda$4(this.f22385a, view, z);
                    }
                });
            } else {
                displayMode = DisplayMode.NORMAL;
            }
        }
        holder.getMViewBinding().C.setOnClickListener(new View.OnClickListener() { // from class: k3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmsAdapter.onBindViewHolder$lambda$5(this.f23398a, holder, view);
            }
        });
        holder.getMViewBinding().D.setOnTouchListener(new View.OnTouchListener() { // from class: l3n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SmsAdapter.onBindViewHolder$lambda$6(this.f24608a, holder, view, motionEvent);
            }
        });
        holder.getMContentView().setOnLongClickListener(new View.OnLongClickListener() { // from class: m3n
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return SmsAdapter.onBindViewHolder$lambda$7(this.f25717a, holder, view);
            }
        });
        holder.bind(sms, displayMode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        kzg kzgVarA0 = kzg.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(kzgVarA0, "inflate(...)");
        return new ViewHolder(this, kzgVarA0);
    }
}
