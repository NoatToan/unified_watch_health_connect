package com.huami.phone_call.sms;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.phone_call.sms.PhoneCallReplyMsgFragment;
import com.huami.phone_call.sms.base.BaseNavFragment;
import com.huami.phone_call.sms.ktx.ViewKt;
import com.huami.phone_call.sms.view.FixedSwipeMenuRecyclerView;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter;
import com.zhouyou.recyclerview.listener.ItemDragListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 M2\u00020\u0001:\u0002N)B\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J;\u0010\u0016\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0010\b\n\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0010\b\n\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0082\bJ\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0014\u0010\u001a\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0019\u001a\u00020\rH\u0002J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\rH\u0014J\b\u0010'\u001a\u00020&H\u0014R\u001d\u0010-\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u0005038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010G¨\u0006O"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallReplyMsgFragment;", "Lcom/huami/phone_call/sms/base/BaseNavFragment;", "", "loadData", LogUtil.I, "Lcom/huami/phone_call/sms/PhoneCallReplyMsgFragment$b;", "item", "F", "", "position", "E", "v", "initView", "", "m", "o", "u", "L", "Lkotlin/Function0;", "action", "success", com.facebook.login.a.K, DTransferConstants.SEARCH_KEY, "editable", "G", "visible", "H", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onBackPressed", "", "tag", "Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "b", "Lkotlin/Lazy;", "t", "()Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "viewModel", "Lcom/huami/phone_call/sms/DeviceStatus;", "c", SOAP.XMLNS, "()Lcom/huami/phone_call/sms/DeviceStatus;", "deviceStatus", "Lcom/huami/phone_call/sms/ReplyMsgAdapter;", GoogleApiAvailabilityLight.a, "Lcom/huami/phone_call/sms/ReplyMsgAdapter;", "adapter", "Landroidx/recyclerview/widget/ItemTouchHelper;", "e", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "Lcom/huami/phone_call/sms/view/FixedSwipeMenuRecyclerView;", "f", "Lcom/huami/phone_call/sms/view/FixedSwipeMenuRecyclerView;", "swapMenuRecyclerView", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "g", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loading", "h", "Z", "refreshData", "i", "Lkotlin/jvm/functions/Function0;", "actionSuccess", z.j, "actionFailure", "<init>", "()V", hl.k, "a", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallReplyMsgFragment extends BaseNavFragment {

    @Deprecated
    public static final int MSG_MIN = 1;

    @Deprecated
    @NotNull
    public static final String TAG = "PhoneCallReplyMsgFragment";

    @Deprecated
    public static final float TOP_BOTTOM_MARGIN = 15.0f;

    @NotNull
    private static final a k = new a(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ReplyMsgAdapter<Item> adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ItemTouchHelper itemTouchHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private FixedSwipeMenuRecyclerView swapMenuRecyclerView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean refreshData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> actionSuccess;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> actionFailure;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"com/huami/phone_call/sms/PhoneCallReplyMsgFragment$a", "", "", "MSG_MIN", LogUtil.I, "", "TAG", "Ljava/lang/String;", "", "TOP_BOTTOM_MARGIN", "F", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.huami.phone_call.sms.PhoneCallReplyMsgFragment$b, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"com/huami/phone_call/sms/PhoneCallReplyMsgFragment$b", "Lcom/huami/phone_call/sms/ReplyMsgAdapter$MsgItem;", "", "content", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "a", "msg", "Lcom/huami/phone_call/sms/PhoneCallReplyMsgFragment$b;", "b", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Item implements ReplyMsgAdapter.MsgItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final ReplyMsg msg;

        public Item(@NotNull ReplyMsg replyMsg) {
            this.msg = replyMsg;
        }

        public static /* synthetic */ Item c(Item item, ReplyMsg replyMsg, int i, Object obj) {
            if ((i & 1) != 0) {
                replyMsg = item.msg;
            }
            return item.b(replyMsg);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ReplyMsg getMsg() {
            return this.msg;
        }

        @NotNull
        public final Item b(@NotNull ReplyMsg msg) {
            return new Item(msg);
        }

        @Override // com.huami.phone_call.sms.ReplyMsgAdapter.MsgItem
        @NotNull
        public String content() {
            return this.msg.getContent();
        }

        @NotNull
        public final ReplyMsg d() {
            return this.msg;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Item) && Intrinsics.areEqual(this.msg, ((Item) other).msg);
        }

        public int hashCode() {
            return this.msg.hashCode();
        }

        @NotNull
        public String toString() {
            return "Item(msg=" + this.msg + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Item, Unit> {
        public c(Object obj) {
            super(1, obj, PhoneCallReplyMsgFragment.class, "onEdit", "onEdit(Lcom/huami/phone_call/sms/PhoneCallReplyMsgFragment$Item;)V", 0);
        }

        public final void a(@NotNull Item item) {
            ((PhoneCallReplyMsgFragment) this.receiver).F(item);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Item item) {
            a(item);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function2<Integer, Item, Unit> {
        public d(Object obj) {
            super(2, obj, PhoneCallReplyMsgFragment.class, "onDelete", "onDelete(ILcom/huami/phone_call/sms/PhoneCallReplyMsgFragment$Item;)V", 0);
        }

        public final void a(int i, @NotNull Item item) {
            ((PhoneCallReplyMsgFragment) this.receiver).E(i, item);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Item item) {
            a(num.intValue(), item);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "enable", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ View a;
        public final /* synthetic */ PhoneCallReplyMsgFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, PhoneCallReplyMsgFragment phoneCallReplyMsgFragment) {
            super(1);
            this.a = view;
            this.b = phoneCallReplyMsgFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            View viewFindViewById = this.a.findViewById(R.id.mask_view);
            if (viewFindViewById != null) {
                ViewKt.setVisible(viewFindViewById, !z);
            }
            if (z) {
                this.b.loadData();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialog loadingDialog = PhoneCallReplyMsgFragment.this.loading;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialog loadingDialog = PhoneCallReplyMsgFragment.this.loading;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setFailed(PhoneCallReplyMsgFragment.this.getString(R.string.loading_error));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Item a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Item item) {
            super(0);
            this.a = item;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onDelete: " + this.a.content();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x006c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:34:0x007b  */
        /* JADX WARN: Code duplicated, block: B:37:0x0084  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReplyMsgAdapter replyMsgAdapter;
            ReplyMsgAdapter replyMsgAdapter2 = PhoneCallReplyMsgFragment.this.adapter;
            if (replyMsgAdapter2 == null) {
                replyMsgAdapter2 = null;
            }
            replyMsgAdapter2.getList().remove(this.b);
            ReplyMsgAdapter replyMsgAdapter3 = PhoneCallReplyMsgFragment.this.adapter;
            if (replyMsgAdapter3 == null) {
                replyMsgAdapter3 = null;
            }
            int itemViewHolderPosition = replyMsgAdapter3.getItemViewHolderPosition(this.b);
            ReplyMsgAdapter replyMsgAdapter4 = PhoneCallReplyMsgFragment.this.adapter;
            if (replyMsgAdapter4 == null) {
                replyMsgAdapter4 = null;
            }
            replyMsgAdapter4.notifyItemRemoved(itemViewHolderPosition);
            ReplyMsgAdapter replyMsgAdapter5 = PhoneCallReplyMsgFragment.this.adapter;
            if (replyMsgAdapter5 == null) {
                replyMsgAdapter5 = null;
            }
            if (replyMsgAdapter5.getA() <= 0) {
                replyMsgAdapter = PhoneCallReplyMsgFragment.this.adapter;
                if (replyMsgAdapter == null) {
                    replyMsgAdapter = null;
                }
                if (replyMsgAdapter.getA() > 0) {
                    ReplyMsgAdapter replyMsgAdapter6 = PhoneCallReplyMsgFragment.this.adapter;
                    (replyMsgAdapter6 != null ? replyMsgAdapter6 : null).notifyItemChanged(itemViewHolderPosition - 1);
                }
            } else {
                ReplyMsgAdapter replyMsgAdapter7 = PhoneCallReplyMsgFragment.this.adapter;
                if (replyMsgAdapter7 == null) {
                    replyMsgAdapter7 = null;
                }
                if (replyMsgAdapter7.getA() > this.b) {
                    ReplyMsgAdapter replyMsgAdapter8 = PhoneCallReplyMsgFragment.this.adapter;
                    if (replyMsgAdapter8 == null) {
                        replyMsgAdapter8 = null;
                    }
                    ReplyMsgAdapter replyMsgAdapter9 = PhoneCallReplyMsgFragment.this.adapter;
                    replyMsgAdapter8.notifyItemRangeChanged(itemViewHolderPosition, (replyMsgAdapter9 != null ? replyMsgAdapter9 : null).getA() - this.b);
                } else {
                    replyMsgAdapter = PhoneCallReplyMsgFragment.this.adapter;
                    if (replyMsgAdapter == null) {
                        replyMsgAdapter = null;
                    }
                    if (replyMsgAdapter.getA() > 0) {
                        ReplyMsgAdapter replyMsgAdapter10 = PhoneCallReplyMsgFragment.this.adapter;
                        (replyMsgAdapter10 != null ? replyMsgAdapter10 : null).notifyItemChanged(itemViewHolderPosition - 1);
                    }
                }
            }
            LoadingDialog loadingDialog = PhoneCallReplyMsgFragment.this.loading;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setSuccess(PhoneCallReplyMsgFragment.this.getString(R.string.pcs_delete_success));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialog loadingDialog = PhoneCallReplyMsgFragment.this.loading;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setFailed(PhoneCallReplyMsgFragment.this.getString(R.string.delete_fail));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Item a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Item item) {
            super(0);
            this.a = item;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onEdit: " + this.a.content();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialog loadingDialog = PhoneCallReplyMsgFragment.this.loading;
            if (loadingDialog != null) {
                loadingDialog.setSuccess(PhoneCallReplyMsgFragment.this.getString(R.string.save_success));
            }
            PhoneCallReplyMsgFragment.this.G(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Unit> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialog loadingDialog = PhoneCallReplyMsgFragment.this.loading;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setFailed(PhoneCallReplyMsgFragment.this.getString(R.string.save_failed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneCallReplyMsgFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phone_call.sms.PhoneCallReplyMsgFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PhoneCallReplyMsgViewModel>() { // from class: com.huami.phone_call.sms.PhoneCallReplyMsgFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phone_call.sms.PhoneCallReplyMsgViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PhoneCallReplyMsgViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PhoneCallReplyMsgViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceStatus = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<DeviceStatus>() { // from class: com.huami.phone_call.sms.PhoneCallReplyMsgFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.phone_call.sms.DeviceStatus, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceStatus getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceStatus.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, View view) {
        if (phoneCallReplyMsgFragment.u()) {
            phoneCallReplyMsgFragment.L();
        } else {
            phoneCallReplyMsgFragment.G(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Item((ReplyMsg) it2.next()));
        }
        ReplyMsgAdapter<Item> replyMsgAdapter = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        replyMsgAdapter.setListAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Function0<Unit> function0 = phoneCallReplyMsgFragment.actionSuccess;
            if (function0 != null) {
                function0.getA();
            }
        } else {
            Function0<Unit> function1 = phoneCallReplyMsgFragment.actionFailure;
            if (function1 != null) {
                function1.getA();
            }
        }
        phoneCallReplyMsgFragment.actionSuccess = null;
        phoneCallReplyMsgFragment.actionFailure = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, ReplyMsg replyMsg) {
        ReplyMsgAdapter<Item> replyMsgAdapter = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        List<Item> list = replyMsgAdapter.getList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Item) it2.next()).d());
        }
        Iterator it3 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i2 = -1;
                break;
            } else {
                if (((ReplyMsg) it3.next()).getId() == replyMsg.getId()) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i2 >= 0) {
            ReplyMsgAdapter<Item> replyMsgAdapter2 = phoneCallReplyMsgFragment.adapter;
            if (replyMsgAdapter2 == null) {
                replyMsgAdapter2 = null;
            }
            replyMsgAdapter2.getList().set(i2, new Item(replyMsg));
            ReplyMsgAdapter<Item> replyMsgAdapter3 = phoneCallReplyMsgFragment.adapter;
            if (replyMsgAdapter3 == null) {
                replyMsgAdapter3 = null;
            }
            ReplyMsgAdapter<Item> replyMsgAdapter4 = phoneCallReplyMsgFragment.adapter;
            replyMsgAdapter3.notifyItemChanged((replyMsgAdapter4 != null ? replyMsgAdapter4 : null).getItemViewHolderPosition(i2));
            return;
        }
        ReplyMsgAdapter<Item> replyMsgAdapter5 = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter5 == null) {
            replyMsgAdapter5 = null;
        }
        replyMsgAdapter5.getList().add(new Item(replyMsg));
        ReplyMsgAdapter<Item> replyMsgAdapter6 = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter6 == null) {
            replyMsgAdapter6 = null;
        }
        ReplyMsgAdapter<Item> replyMsgAdapter7 = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter7 == null) {
            replyMsgAdapter7 = null;
        }
        int itemViewHolderPosition = replyMsgAdapter6.getItemViewHolderPosition(replyMsgAdapter7.getA() - 1);
        ReplyMsgAdapter<Item> replyMsgAdapter8 = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter8 == null) {
            replyMsgAdapter8 = null;
        }
        replyMsgAdapter8.notifyItemInserted(itemViewHolderPosition);
        ReplyMsgAdapter<Item> replyMsgAdapter9 = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter9 == null) {
            replyMsgAdapter9 = null;
        }
        if (replyMsgAdapter9.getA() > 1) {
            ReplyMsgAdapter<Item> replyMsgAdapter10 = phoneCallReplyMsgFragment.adapter;
            (replyMsgAdapter10 != null ? replyMsgAdapter10 : null).notifyItemChanged(itemViewHolderPosition - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int position, Item item) {
        HMLog.info(TAG, new h(item));
        if (m()) {
            i iVar = new i(position);
            j jVar = new j();
            this.actionSuccess = iVar;
            this.actionFailure = jVar;
            this.loading = LoadingDialog.showDialog(requireContext(), getString(R.string.deleting));
            t().delete(item.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Item item) {
        HMLog.info(TAG, new k(item));
        NavController navControllerFindNavController = FragmentKt.findNavController(this);
        int i2 = R.id.action_to_editReplyMsg;
        Bundle bundle = new Bundle();
        PhoneCallEditReplyMsgFragment.INSTANCE.initArguments(bundle, item.d());
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.navigate(i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean editable) {
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView == null) {
            fixedSwipeMenuRecyclerView = null;
        }
        fixedSwipeMenuRecyclerView.smoothCloseMenu();
        H(R.id.btn_edit, !editable);
        H(R.id.btn_add, !editable);
        H(R.id.btn_done, editable);
        if (editable) {
            ReplyMsgAdapter<Item> replyMsgAdapter = this.adapter;
            if (replyMsgAdapter == null) {
                replyMsgAdapter = null;
            }
            ItemTouchHelper itemTouchHelper = this.itemTouchHelper;
            if (itemTouchHelper == null) {
                itemTouchHelper = null;
            }
            replyMsgAdapter.enableDragItem(itemTouchHelper, R.id.iv_drag, true);
        } else {
            ReplyMsgAdapter<Item> replyMsgAdapter2 = this.adapter;
            if (replyMsgAdapter2 == null) {
                replyMsgAdapter2 = null;
            }
            replyMsgAdapter2.disableDragItem();
        }
        ReplyMsgAdapter<Item> replyMsgAdapter3 = this.adapter;
        (replyMsgAdapter3 != null ? replyMsgAdapter3 : null).notifyDataSetChanged();
    }

    private final void H(int i2, boolean z) {
        View viewFindViewById;
        View contentView = getContentView();
        if (contentView == null || (viewFindViewById = contentView.findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(z ? 0 : 8);
    }

    private final void I() {
        new AlertDialogFragment.Builder(requireContext()).setMessage(R.string.discard_tips).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: qw5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PhoneCallReplyMsgFragment.K(dialogInterface, i2);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: nw5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PhoneCallReplyMsgFragment.J(this.a, dialogInterface, i2);
            }
        }).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        List<ReplyMsg> value = phoneCallReplyMsgFragment.t().getMsgLiveData().getValue();
        if (value != null) {
            ReplyMsgAdapter<Item> replyMsgAdapter = phoneCallReplyMsgFragment.adapter;
            if (replyMsgAdapter == null) {
                replyMsgAdapter = null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it2 = value.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Item((ReplyMsg) it2.next()));
            }
            replyMsgAdapter.setListAll(arrayList);
        }
        phoneCallReplyMsgFragment.G(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void L() {
        ReplyMsgAdapter<Item> replyMsgAdapter = this.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        List<Item> list = replyMsgAdapter.getList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Item) it2.next()).d());
        }
        l lVar = new l();
        m mVar = new m();
        this.actionSuccess = lVar;
        this.actionFailure = mVar;
        this.loading = LoadingDialog.showDialog(requireContext(), getString(R.string.saving));
        t().sync(arrayList);
    }

    private final void initView() {
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) contentView.findViewById(R.id.title_bar);
        if (rainbowTitleBar != null) {
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tw5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhoneCallReplyMsgFragment.x(this.a, view);
                }
            });
        }
        View viewFindViewById = contentView.findViewById(R.id.btn_edit);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: uw5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhoneCallReplyMsgFragment.y(this.a, view);
                }
            });
        }
        View viewFindViewById2 = contentView.findViewById(R.id.btn_add);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: vw5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhoneCallReplyMsgFragment.z(this.a, view);
                }
            });
        }
        View viewFindViewById3 = contentView.findViewById(R.id.btn_done);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: ww5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhoneCallReplyMsgFragment.A(this.a, view);
                }
            });
        }
        this.swapMenuRecyclerView = (FixedSwipeMenuRecyclerView) contentView.findViewById(R.id.content_layout);
        ReplyMsgAdapter<Item> replyMsgAdapter = this.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView == null) {
            fixedSwipeMenuRecyclerView = null;
        }
        replyMsgAdapter.setRecyclerView(fixedSwipeMenuRecyclerView);
        ReplyMsgAdapter<Item> replyMsgAdapter2 = this.adapter;
        if (replyMsgAdapter2 == null) {
            replyMsgAdapter2 = null;
        }
        ItemDragListener itemDragListener = new ItemDragListener(replyMsgAdapter2);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(itemDragListener);
        this.itemTouchHelper = itemTouchHelper;
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView2 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView2 == null) {
            fixedSwipeMenuRecyclerView2 = null;
        }
        itemTouchHelper.attachToRecyclerView(fixedSwipeMenuRecyclerView2);
        itemDragListener.setDragMoveFlags(3);
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView3 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView3 == null) {
            fixedSwipeMenuRecyclerView3 = null;
        }
        fixedSwipeMenuRecyclerView3.setPullRefreshEnabled(false);
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView4 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView4 == null) {
            fixedSwipeMenuRecyclerView4 = null;
        }
        fixedSwipeMenuRecyclerView4.setLoadingMoreEnabled(false);
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView5 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView5 == null) {
            fixedSwipeMenuRecyclerView5 = null;
        }
        ReplyMsgAdapter<Item> replyMsgAdapter3 = this.adapter;
        if (replyMsgAdapter3 == null) {
            replyMsgAdapter3 = null;
        }
        fixedSwipeMenuRecyclerView5.setAdapter(replyMsgAdapter3);
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView6 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView6 == null) {
            fixedSwipeMenuRecyclerView6 = null;
        }
        View view = new View(requireContext());
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView7 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView7 == null) {
            fixedSwipeMenuRecyclerView7 = null;
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) ViewKt.dp2px(fixedSwipeMenuRecyclerView7, 15.0f)));
        Unit unit = Unit.INSTANCE;
        fixedSwipeMenuRecyclerView6.addHeaderView(view);
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView8 = this.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView8 == null) {
            fixedSwipeMenuRecyclerView8 = null;
        }
        View view2 = new View(requireContext());
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView9 = this.swapMenuRecyclerView;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) ViewKt.dp2px(fixedSwipeMenuRecyclerView9 != null ? fixedSwipeMenuRecyclerView9 : null, 15.0f)));
        fixedSwipeMenuRecyclerView8.addFooterView(view2);
        s().initStatusFragment(R.id.device_status_content, getChildFragmentManager(), new e(contentView, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        f fVar = new f();
        g gVar = new g();
        this.actionSuccess = fVar;
        this.actionFailure = gVar;
        this.loading = LoadingDialog.showDialog(requireContext(), getString(R.string.wait_loading));
        t().queryData();
    }

    private final boolean m() {
        ReplyMsgAdapter<Item> replyMsgAdapter = this.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        if (replyMsgAdapter.getA() > 1) {
            return true;
        }
        new AlertDialogFragment.Builder(requireContext()).setMessage(getResources().getQuantityString(R.plurals.phone_call_reply_msg_min, 1, 1)).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: sw5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PhoneCallReplyMsgFragment.n(dialogInterface, i2);
            }
        }).create().show(getChildFragmentManager());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final boolean o() {
        if (!t().isFull()) {
            return true;
        }
        new AlertDialogFragment.Builder(requireContext()).setMessage(getResources().getQuantityString(R.plurals.phone_call_reply_msg_limited, t().getMaxCount(), Integer.valueOf(t().getMaxCount()))).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: rw5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PhoneCallReplyMsgFragment.p(dialogInterface, i2);
            }
        }).create().show(getChildFragmentManager());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void q(Function0<Unit> action, Function0<Unit> success, Function0<Unit> failure) {
        this.actionSuccess = success;
        this.actionFailure = failure;
        action.getA();
    }

    public static /* synthetic */ void r(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, Function0 function0, Function0 function1, Function0 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        phoneCallReplyMsgFragment.actionSuccess = function1;
        phoneCallReplyMsgFragment.actionFailure = function2;
        function0.getA();
    }

    private final DeviceStatus s() {
        return (DeviceStatus) this.deviceStatus.getValue();
    }

    private final PhoneCallReplyMsgViewModel t() {
        return (PhoneCallReplyMsgViewModel) this.viewModel.getValue();
    }

    private final boolean u() {
        boolean z;
        ReplyMsgAdapter<Item> replyMsgAdapter = this.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        List<Item> list = replyMsgAdapter.getList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Item) it2.next()).d());
        }
        List<ReplyMsg> value = t().getMsgLiveData().getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        if (value.size() == arrayList.size()) {
            if (value.isEmpty()) {
                z = false;
            } else {
                for (ReplyMsg replyMsg : value) {
                    if (!Intrinsics.areEqual(replyMsg, arrayList.get(value.indexOf(replyMsg)))) {
                        z = true;
                    }
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private final void v() {
        ReplyMsgAdapter<Item> replyMsgAdapter = new ReplyMsgAdapter<>(requireContext(), new c(this), new d(this));
        this.adapter = replyMsgAdapter;
        replyMsgAdapter.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener() { // from class: pw5
            @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter.OnItemClickListener
            public final void onItemClick(View view, Object obj, int i2) {
                PhoneCallReplyMsgFragment.w(this.a, view, obj, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, View view, Object obj, int i2) {
        ReplyMsgAdapter<Item> replyMsgAdapter = phoneCallReplyMsgFragment.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        if (replyMsgAdapter.isItemDraggable()) {
            return;
        }
        ReplyMsgAdapter<Item> replyMsgAdapter2 = phoneCallReplyMsgFragment.adapter;
        phoneCallReplyMsgFragment.F((replyMsgAdapter2 != null ? replyMsgAdapter2 : null).getData(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, View view) {
        phoneCallReplyMsgFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, View view) {
        phoneCallReplyMsgFragment.G(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(PhoneCallReplyMsgFragment phoneCallReplyMsgFragment, View view) {
        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView = phoneCallReplyMsgFragment.swapMenuRecyclerView;
        if (fixedSwipeMenuRecyclerView == null) {
            fixedSwipeMenuRecyclerView = null;
        }
        fixedSwipeMenuRecyclerView.smoothCloseMenu();
        if (phoneCallReplyMsgFragment.o()) {
            FragmentKt.findNavController(phoneCallReplyMsgFragment).navigate(R.id.action_to_editReplyMsg);
        }
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment
    public boolean onBackPressed() {
        ReplyMsgAdapter<Item> replyMsgAdapter = this.adapter;
        if (replyMsgAdapter == null) {
            replyMsgAdapter = null;
        }
        if (!replyMsgAdapter.isItemDraggable()) {
            return super.onBackPressed();
        }
        if (u()) {
            I();
            return true;
        }
        G(false);
        return true;
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v();
        t().getMsgLiveData().observe(this, new Observer() { // from class: ow5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneCallReplyMsgFragment.B(this.a, (List) obj);
            }
        });
        t().getResultLiveData().observe(this, new Observer() { // from class: yw5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneCallReplyMsgFragment.C(this.a, (Boolean) obj);
            }
        });
        t().getAddOrUpdateLiveData().observe(this, new Observer() { // from class: xw5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneCallReplyMsgFragment.D(this.a, (ReplyMsg) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = getContentView();
        if (contentView != null) {
            return contentView;
        }
        View viewInflate = inflater.inflate(R.layout.fragment_phone_call_reply_msg, container, false);
        setContentView(viewInflate);
        initView();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.refreshData) {
            return;
        }
        this.refreshData = true;
        loadData();
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment
    @NotNull
    public String tag() {
        return TAG;
    }
}
