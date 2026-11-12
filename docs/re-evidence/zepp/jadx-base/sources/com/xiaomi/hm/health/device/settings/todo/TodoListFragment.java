package com.xiaomi.hm.health.device.settings.todo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentTodoListBinding;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.loc.z;
import com.xiaomi.hm.health.baseui.fragment.BaseNavFragment;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.device.settings.todo.TodoListFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.Constants;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import com.zhouyou.recyclerview.divider.HorizontalDividerItemDecoration;
import com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuRecyclerView;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 R2\u00020\u0001:\u0003ST2B\u0007¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0019\u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0082\bJ\b\u0010\t\u001a\u00020\u0002H\u0002J\u0014\u0010\f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\nR\u00020\u0000H\u0002J\u001c\u0010\u000f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\nR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u0010\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\nR\u00020\u0000H\u0002J;\u0010\u0013\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0010\b\n\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\n\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0082\bJ\b\u0010\u0014\u001a\u00020\u0002H\u0002J\f\u0010\u0016\u001a\u00020\u0002*\u00020\u0015H\u0002J\u0014\u0010\u0018\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0014\u0010\u001a\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\rH\u0002J&\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nR\u00020\u00000\u001e0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0012\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J$\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\rH\u0014J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020/H\u0014R\u001d\u00106\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010?\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\r2\u0006\u0010F\u001a\u00020\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bG\u0010D\"\u0004\bH\u0010IR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010L¨\u0006U"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment;", "Lcom/xiaomi/hm/health/baseui/fragment/BaseNavFragment;", "", "H", LogUtil.I, "Lkotlin/Function0;", "action", "Lkotlinx/coroutines/Job;", hl.k, "loadData", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$b;", "item", "F", "", "isDone", "E", LogUtil.D, "success", com.facebook.login.a.K, GoogleApiAvailabilityLight.b, "u", "Lcom/huami/devicex/databinding/FragmentTodoListBinding;", "w", "isEdit", "J", "isEmpty", "K", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todoList", "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Group;", "r", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onBackPressed", "onDestroyView", "", "tag", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "b", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "viewModel", "c", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/devicex/databinding/FragmentTodoListBinding;", "binding", "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter;", "adapter", "e", "Lkotlinx/coroutines/Job;", "updateJob", "f", "Z", "refreshData", "enable", "g", "G", "(Z)V", "isEditEnable", "h", "Lkotlin/jvm/functions/Function0;", "actionSuccess", "i", "actionFailure", "<init>", "()V", z.j, "a", "Group", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoListFragment extends BaseNavFragment {

    @Deprecated
    @NotNull
    public static final String TAG = "TodoListFragment";

    @NotNull
    private static final a j;
    public static final /* synthetic */ KProperty<Object>[] k;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TodoAdapter<b> adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Job updateJob;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean refreshData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isEditEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> actionSuccess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> actionFailure;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u001b\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "", "", "a", LogUtil.I, "getId", "()I", "id", "b", "getNameId", "nameId", "<init>", "(II)V", "Done", "Expired", "Incoming", "NoDate", "Today", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Expired;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Today;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Incoming;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$NoDate;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Done;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static abstract class Group {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int nameId;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Done;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Done extends Group {

            @NotNull
            public static final Done INSTANCE = new Done();

            private Done() {
                super(4, R.string.todo_done, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Expired;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Expired extends Group {

            @NotNull
            public static final Expired INSTANCE = new Expired();

            private Expired() {
                super(0, R.string.todo_expired, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Incoming;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Incoming extends Group {

            @NotNull
            public static final Incoming INSTANCE = new Incoming();

            private Incoming() {
                super(2, R.string.todo_incoming, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$NoDate;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class NoDate extends Group {

            @NotNull
            public static final NoDate INSTANCE = new NoDate();

            private NoDate() {
                super(3, R.string.todo_no_date, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group$Today;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Today extends Group {

            @NotNull
            public static final Today INSTANCE = new Today();

            private Today() {
                super(1, R.string.today, null);
            }
        }

        private Group(int i, @StringRes int i2) {
            this.id = i;
            this.nameId = i2;
        }

        public /* synthetic */ Group(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2);
        }

        public final int getId() {
            return this.id;
        }

        public final int getNameId() {
            return this.nameId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/TodoListFragment$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tR\u00020\nR\u0019\u0010\u0011\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0019\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010!\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u001c\u0010#\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001c\u0010&\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/TodoListFragment$b", "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Item;", "", "currentTime", "", "c", GoogleApiAvailabilityLight.a, "", "f", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$b;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment;", "b", "e", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "a", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "()Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todo", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "content", "Z", "isDone", "()Z", "isEditable", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "()Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Group;", "group", "g", Constants.IS_EXPIRED, "h", "getTime", "time", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment;Lcom/huami/bluetooth/profile/channel/module/todo/Todo;Landroid/content/Context;J)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class b implements TodoAdapter.Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Todo todo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final String content;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isDone;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isEditable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Group group;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean isExpired;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final String time;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "time", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Long, Long> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final long a(long j) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                return calendar.getTimeInMillis();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return Long.valueOf(a(l.longValue()));
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoListFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "time", "current", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0880b extends Lambda implements Function2<Long, Long, Boolean> {
            public final /* synthetic */ Function1<Long, Long> a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoListFragment$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j, long j2, long j3, long j4) {
                    super(0);
                    this.a = j;
                    this.b = j2;
                    this.c = j3;
                    this.d = j4;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "isDateExpired - " + this.a + ": " + this.b + ", " + this.c + ": " + this.d;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0880b(Function1<? super Long, Long> function1) {
                super(2);
                this.a = function1;
            }

            public final boolean a(long j, long j2) {
                HMLog.verbose(TodoListFragment.TAG, new a(j, this.a.invoke(Long.valueOf(j)).longValue(), j2, this.a.invoke(Long.valueOf(j2)).longValue()));
                return this.a.invoke(Long.valueOf(j)).longValue() < this.a.invoke(Long.valueOf(j2)).longValue();
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Long l, Long l2) {
                return Boolean.valueOf(a(l.longValue(), l2.longValue()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "time", "current", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Long, Long, Boolean> {
            public static final c a = new c();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ long a;
                public final /* synthetic */ Calendar b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Calendar d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j, Calendar calendar, long j2, Calendar calendar2) {
                    super(0);
                    this.a = j;
                    this.b = calendar;
                    this.c = j2;
                    this.d = calendar2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "isTimeExpired - " + this.a + ": " + this.b.getTimeInMillis() + ", " + this.c + ": " + this.d.getTimeInMillis();
                }
            }

            public c() {
                super(2);
            }

            public final boolean a(long j, long j2) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(j2);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                calendar.set(1, calendar2.get(1));
                calendar.set(2, calendar2.get(2));
                calendar.set(5, calendar2.get(5));
                HMLog.verbose(TodoListFragment.TAG, new a(j, calendar, j2, calendar2));
                return calendar.getTimeInMillis() < calendar2.getTimeInMillis();
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Long l, Long l2) {
                return Boolean.valueOf(a(l.longValue(), l2.longValue()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "date", "Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<Long, Calendar> {
            public static final d a = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Calendar invoke(@Nullable Long l) {
                if (l == null) {
                    return null;
                }
                if (!(l.longValue() > 0)) {
                    l = null;
                }
                if (l == null) {
                    return null;
                }
                long jLongValue = l.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLongValue);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                return calendar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Integer> {
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b bVar) {
                super(0);
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return Intrinsics.compare(b.this.getTodo().getId(), this.b.getTodo().getId());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "time", "Ljava/util/Calendar;", "dateCal", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Long, Calendar, Calendar> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Calendar invoke(@Nullable Long l, @NotNull Calendar calendar) {
                if (l == null) {
                    return null;
                }
                if (!(l.longValue() > 0)) {
                    l = null;
                }
                if (l == null) {
                    return null;
                }
                long jLongValue = l.longValue();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jLongValue);
                calendar2.set(1, calendar.get(1));
                calendar2.set(2, calendar.get(2));
                calendar2.set(5, calendar.get(5));
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                return calendar2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0046  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:4:0x001a  */
        public b(@NotNull Todo todo, Context context, long j) {
            Group group;
            String desc;
            String dateTime;
            this.todo = todo;
            this.context = context;
            this.content = todo.getContent();
            Long completeTime = todo.getCompleteTime();
            String dateTime2 = null;
            if (completeTime != null) {
                completeTime = (completeTime.longValue() > 0L ? 1 : (completeTime.longValue() == 0L ? 0 : -1)) > 0 ? completeTime : null;
            }
            this.isDone = completeTime != null;
            this.isEditable = !getIsDone();
            if (getIsDone()) {
                group = Group.Done.INSTANCE;
            } else {
                Long date = todo.getDate();
                if (date != null) {
                    date = (date.longValue() > 0L ? 1 : (date.longValue() == 0L ? 0 : -1)) > 0 ? date : null;
                }
                group = date == null ? Group.NoDate.INSTANCE : c(j) ? Group.Expired.INSTANCE : d(j) ? Group.Today.INSTANCE : Group.Incoming.INSTANCE;
            }
            this.group = group;
            this.isExpired = Intrinsics.areEqual(group, Group.Expired.INSTANCE);
            Integer numValueOf = Integer.valueOf(todo.getRepeat());
            int iIntValue = numValueOf.intValue();
            numValueOf = iIntValue != 0 && iIntValue != 1 ? numValueOf : null;
            if (numValueOf == null) {
                desc = null;
            } else {
                numValueOf.intValue();
                desc = TodoRepeat.getDesc(context, todo.getRepeat(), TodoListFragment.this.q().supportWorkdayRepeat());
            }
            Long date2 = todo.getDate();
            if (date2 != null) {
                date2 = (date2.longValue() > 0L ? 1 : (date2.longValue() == 0L ? 0 : -1)) > 0 && !Intrinsics.areEqual(getGroup(), Group.Today.INSTANCE) ? date2 : null;
                if (date2 == null) {
                    dateTime = null;
                } else {
                    long jLongValue = date2.longValue();
                    dateTime = DateUtils.formatDateTime(context, jLongValue, f(j) == f(jLongValue) ? 16 : 20);
                }
            } else {
                dateTime = null;
            }
            Long time = todo.getTime();
            if (time != null) {
                time = (time.longValue() > 0L ? 1 : (time.longValue() == 0L ? 0 : -1)) > 0 ? time : null;
                if (time != null) {
                    dateTime2 = DateUtils.formatDateTime(context, time.longValue(), 129);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String str : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{dateTime, dateTime2, desc})) {
                if (!(str == null || str.length() == 0)) {
                    if (sb.length() > 0) {
                        sb.append(StringUtil.SPACE);
                    }
                    sb.append(str);
                }
            }
            this.time = sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0016  */
        private final boolean c(long currentTime) {
            a aVar = a.a;
            c cVar = c.a;
            C0880b c0880b = new C0880b(aVar);
            Long time = this.todo.getTime();
            Long l = null;
            if (time != null) {
                if (!(time.longValue() > 0)) {
                    time = null;
                }
            } else {
                time = null;
            }
            Long date = this.todo.getDate();
            if (date != null) {
                if (date.longValue() > 0) {
                    l = date;
                }
            }
            if (time == null || l == null) {
                if (time != null) {
                    return cVar.invoke(time, Long.valueOf(currentTime)).booleanValue();
                }
                if (l != null) {
                    return c0880b.invoke(l, Long.valueOf(currentTime)).booleanValue();
                }
            } else {
                if (c0880b.invoke(l, Long.valueOf(currentTime)).booleanValue()) {
                    return true;
                }
                if (TimeUtils.isTheSameDay(currentTime, l.longValue()) && cVar.invoke(time, Long.valueOf(currentTime)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean d(long currentTime) {
            return this.todo.getDate() != null && TimeUtils.isTheSameDay(currentTime, this.todo.getDate().longValue());
        }

        private final int f(long j) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            return calendar.get(1);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Group getGroup() {
            return this.group;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Todo getTodo() {
            return this.todo;
        }

        public final int e(@NotNull b b) {
            if (getIsDone() && b.getIsDone()) {
                return Intrinsics.compare(this.todo.getCompleteTime().longValue(), b.todo.getCompleteTime().longValue());
            }
            e eVar = new e(b);
            d dVar = d.a;
            f fVar = f.a;
            Calendar calendarInvoke = dVar.invoke(this.todo.getDate());
            Calendar calendarInvoke2 = dVar.invoke(b.todo.getDate());
            if (calendarInvoke != null && calendarInvoke2 != null) {
                Calendar calendarInvoke3 = fVar.invoke(this.todo.getTime(), calendarInvoke);
                Calendar calendarInvoke4 = fVar.invoke(b.todo.getTime(), calendarInvoke2);
                if (calendarInvoke3 != null && calendarInvoke4 != null) {
                    return Intrinsics.areEqual(calendarInvoke3, calendarInvoke4) ? eVar.invoke().intValue() : calendarInvoke3.compareTo(calendarInvoke4);
                }
                if (calendarInvoke3 == null) {
                    if (calendarInvoke4 != null) {
                        return 1;
                    }
                    return Intrinsics.areEqual(calendarInvoke, calendarInvoke2) ? eVar.invoke().intValue() : calendarInvoke.compareTo(calendarInvoke2);
                }
            } else if (calendarInvoke == null) {
                if (calendarInvoke2 != null) {
                    return 1;
                }
                return eVar.invoke().intValue();
            }
            return -1;
        }

        @Override // com.xiaomi.hm.health.device.settings.todo.TodoAdapter.Item
        @NotNull
        public String getContent() {
            return this.content;
        }

        @Override // com.xiaomi.hm.health.device.settings.todo.TodoAdapter.Item
        @NotNull
        public String getTime() {
            return this.time;
        }

        @Override // com.xiaomi.hm.health.device.settings.todo.TodoAdapter.Item
        /* JADX INFO: renamed from: isDone, reason: from getter */
        public boolean getIsDone() {
            return this.isDone;
        }

        @Override // com.xiaomi.hm.health.device.settings.todo.TodoAdapter.Item
        /* JADX INFO: renamed from: isEditable, reason: from getter */
        public boolean getIsEditable() {
            return this.isEditable;
        }

        @Override // com.xiaomi.hm.health.device.settings.todo.TodoAdapter.Item
        /* JADX INFO: renamed from: isExpired, reason: from getter */
        public boolean getIsExpired() {
            return this.isExpired;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<b, Unit> {
        public c(TodoListFragment todoListFragment) {
            super(1, todoListFragment, TodoListFragment.class, "onEdit", "onEdit(Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Item;)V", 0);
        }

        public final void a(@NotNull b bVar) {
            ((TodoListFragment) this.receiver).F(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            a(bVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function2<b, Boolean, Unit> {
        public d(TodoListFragment todoListFragment) {
            super(2, todoListFragment, TodoListFragment.class, "onDone", "onDone(Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Item;Z)V", 0);
        }

        public final void a(@NotNull b bVar, boolean z) {
            ((TodoListFragment) this.receiver).E(bVar, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(b bVar, Boolean bool) {
            a(bVar, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<b, Unit> {
        public e(TodoListFragment todoListFragment) {
            super(1, todoListFragment, TodoListFragment.class, "onDelete", "onDelete(Lcom/xiaomi/hm/health/device/settings/todo/TodoListFragment$Item;)V", 0);
        }

        public final void a(@NotNull b bVar) {
            ((TodoListFragment) this.receiver).D(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            a(bVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LoadingDialog loadingDialog) {
            super(0);
            this.a = loadingDialog;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ TodoListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LoadingDialog loadingDialog, TodoListFragment todoListFragment) {
            super(0);
            this.a = loadingDialog;
            this.b = todoListFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setFailed(this.b.getString(R.string.loading_error));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDelete: " + this.a.getTodo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ TodoListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LoadingDialog loadingDialog, TodoListFragment todoListFragment) {
            super(0);
            this.a = loadingDialog;
            this.b = todoListFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setSuccess(this.b.getString(R.string.delete_alarm_success));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ TodoListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LoadingDialog loadingDialog, TodoListFragment todoListFragment) {
            super(0);
            this.a = loadingDialog;
            this.b = todoListFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setFailed(this.b.getString(R.string.alarm_delete_failed));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Todo a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Todo todo, boolean z) {
            super(0);
            this.a = todo;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDone: " + this.a + " - " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(LoadingDialog loadingDialog) {
            super(0);
            this.a = loadingDialog;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ TodoListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(LoadingDialog loadingDialog, TodoListFragment todoListFragment) {
            super(0);
            this.a = loadingDialog;
            this.b = todoListFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setFailed(this.b.getString(R.string.alarm_save_failed));
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TodoListFragment.class), "binding", "getBinding()Lcom/huami/devicex/databinding/FragmentTodoListBinding;"));
        k = kPropertyArr;
        j = new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TodoListFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoListFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TodoListViewModel>() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoListFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.device.settings.todo.TodoListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TodoListViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TodoListViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new TodoListFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentTodoListBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(TodoListFragment todoListFragment, View view) {
        todoListFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(TodoListFragment todoListFragment, List list) {
        List<TodoAdapter.Group<b>> listR = todoListFragment.r(list);
        todoListFragment.K(todoListFragment.p(), listR == null || listR.isEmpty());
        TodoAdapter<b> todoAdapter = todoListFragment.adapter;
        Objects.requireNonNull(todoAdapter);
        todoAdapter.setGroups(listR);
        todoListFragment.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(TodoListFragment todoListFragment, Boolean bool) {
        Function0<Unit> function0 = bool.booleanValue() ? todoListFragment.actionSuccess : todoListFragment.actionFailure;
        if (function0 != null) {
            function0.invoke();
        }
        todoListFragment.actionSuccess = null;
        todoListFragment.actionFailure = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(b item) {
        HMLog.info(TAG, new h(item));
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext(), getString(R.string.delete_alarm));
        i iVar = new i(loadingDialogShowDialog, this);
        j jVar = new j(loadingDialogShowDialog, this);
        this.actionSuccess = iVar;
        this.actionFailure = jVar;
        q().delete(item.getTodo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(b item, boolean isDone) {
        Todo todo = item.getTodo();
        HMLog.info(TAG, new k(todo, isDone));
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext(), getString(R.string.wait));
        l lVar = new l(loadingDialogShowDialog);
        m mVar = new m(loadingDialogShowDialog, this);
        this.actionSuccess = lVar;
        this.actionFailure = mVar;
        if (isDone) {
            q().done(todo);
        } else {
            q().addOrUpdate(todo.copy((158 & 1) != 0 ? todo.id : 0L, (158 & 2) != 0 ? todo.content : null, (158 & 4) != 0 ? todo.source : null, (158 & 8) != 0 ? todo.date : null, (158 & 16) != 0 ? todo.time : null, (158 & 32) != 0 ? todo.repeat : 0, (158 & 64) != 0 ? todo.completeTime : null, (158 & 128) != 0 ? todo.firstRemind : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(b item) {
        NavController navControllerFindNavController = FragmentKt.findNavController(this);
        int i2 = R.id.action_to_editTodo;
        Bundle bundle = new Bundle();
        TodoEditFragment.INSTANCE.initArguments(bundle, item.getTodo());
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.navigate(i2, bundle);
    }

    private final void G(boolean z) {
        if (z == this.isEditEnable) {
            return;
        }
        J(p(), z);
        TodoAdapter<b> todoAdapter = this.adapter;
        Objects.requireNonNull(todoAdapter);
        todoAdapter.setEditEnable(z);
        this.isEditEnable = z;
    }

    private final void H() {
        TodoAdapter<b> todoAdapter = this.adapter;
        Objects.requireNonNull(todoAdapter);
        if (todoAdapter.getGroups().isEmpty()) {
            return;
        }
        Job job = this.updateJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.updateJob = kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getUnconfined(), null, new TodoListFragment$startDataUpdateJob$$inlined$actionWhenMinuteUpdate$1(null, this), 2, null);
    }

    private final void I() {
        Job job = this.updateJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.updateJob = null;
    }

    private final void J(FragmentTodoListBinding fragmentTodoListBinding, boolean z) {
        if (z) {
            fragmentTodoListBinding.btnEdit.setVisibility(8);
            fragmentTodoListBinding.btnAdd.setVisibility(8);
            fragmentTodoListBinding.btnDone.setVisibility(0);
        } else {
            fragmentTodoListBinding.btnEdit.setVisibility(0);
            fragmentTodoListBinding.btnAdd.setVisibility(0);
            fragmentTodoListBinding.btnDone.setVisibility(8);
        }
    }

    private final void K(FragmentTodoListBinding fragmentTodoListBinding, boolean z) {
        if (!z) {
            fragmentTodoListBinding.btnEdit.setEnabled(true);
            fragmentTodoListBinding.tips.setVisibility(8);
            return;
        }
        fragmentTodoListBinding.btnEdit.setEnabled(false);
        fragmentTodoListBinding.tips.setVisibility(0);
        if (this.isEditEnable) {
            G(false);
        }
    }

    private final Job k(Function0<Unit> action) {
        return kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getUnconfined(), null, new TodoListFragment$actionWhenMinuteUpdate$1(action, null), 2, null);
    }

    private final boolean l() {
        if (!q().isFull()) {
            return true;
        }
        new AlertDialogFragment.Builder(requireContext()).setMessage(getResources().getQuantityString(R.plurals.todo_list_tips_max, q().getMaxCount(), Integer.valueOf(q().getMaxCount()))).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: qq7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TodoListFragment.m(dialogInterface, i2);
            }
        }).create().show(getChildFragmentManager());
        return false;
    }

    private final void loadData() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext(), getString(R.string.wait));
        f fVar = new f(loadingDialogShowDialog);
        g gVar = new g(loadingDialogShowDialog, this);
        this.actionSuccess = fVar;
        this.actionFailure = gVar;
        q().loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void n(Function0<Unit> action, Function0<Unit> success, Function0<Unit> failure) {
        this.actionSuccess = success;
        this.actionFailure = failure;
        action.invoke();
    }

    public static /* synthetic */ void o(TodoListFragment todoListFragment, Function0 function0, Function0 function1, Function0 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        todoListFragment.actionSuccess = function1;
        todoListFragment.actionFailure = function2;
        function0.invoke();
    }

    private final FragmentTodoListBinding p() {
        return (FragmentTodoListBinding) this.binding.getValue(this, k[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TodoListViewModel q() {
        return (TodoListViewModel) this.viewModel.getValue();
    }

    private final List<TodoAdapter.Group<b>> r(List<Todo> todoList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(todoList, 10));
        Iterator<T> it2 = todoList.iterator();
        while (it2.hasNext()) {
            arrayList.add(new b((Todo) it2.next(), requireContext(), jCurrentTimeMillis));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Group group = ((b) obj).getGroup();
            Object arrayList2 = linkedHashMap.get(group);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(group, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        SortedMap sortedMap = q.toSortedMap(linkedHashMap, new Comparator() { // from class: com.xiaomi.hm.health.device.settings.todo.a
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return TodoListFragment.s((TodoListFragment.Group) obj2, (TodoListFragment.Group) obj3);
            }
        });
        ArrayList arrayList3 = new ArrayList(sortedMap.size());
        for (Map.Entry entry : sortedMap.entrySet()) {
            arrayList3.add(new TodoAdapter.Group(getString(((Group) entry.getKey()).getNameId()), CollectionsKt___CollectionsKt.sortedWith((Iterable) entry.getValue(), new Comparator() { // from class: com.xiaomi.hm.health.device.settings.todo.b
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return TodoListFragment.t((TodoListFragment.b) obj2, (TodoListFragment.b) obj3);
                }
            })));
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(Group group, Group group2) {
        return group.getId() - group2.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(b bVar, b bVar2) {
        return bVar.e(bVar2);
    }

    private final void u() {
        TodoAdapter<b> todoAdapter = new TodoAdapter<>(requireContext(), new c(this), new d(this), new e(this));
        this.adapter = todoAdapter;
        Objects.requireNonNull(todoAdapter);
        todoAdapter.setOnChildClickListener(new GroupedRecyclerViewAdapter.OnChildClickListener() { // from class: xq7
            @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter.OnChildClickListener
            public final void onChildClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, HelperRecyclerViewHolder helperRecyclerViewHolder, int i2, int i3, Object obj) {
                TodoListFragment.v(this.a, groupedRecyclerViewAdapter, helperRecyclerViewHolder, i2, i3, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TodoListFragment todoListFragment, GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, HelperRecyclerViewHolder helperRecyclerViewHolder, int i2, int i3, Object obj) {
        TodoAdapter<b> todoAdapter = todoListFragment.adapter;
        Objects.requireNonNull(todoAdapter);
        if (!todoAdapter.getIsEditEnable() && (obj instanceof b)) {
            b bVar = (b) obj;
            if (bVar.getIsEditable()) {
                todoListFragment.F(bVar);
            }
        }
    }

    private final void w(final FragmentTodoListBinding fragmentTodoListBinding) {
        fragmentTodoListBinding.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoListFragment.A(this.a, view);
            }
        });
        fragmentTodoListBinding.btnEdit.setOnClickListener(new View.OnClickListener() { // from class: rq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoListFragment.x(fragmentTodoListBinding, this, view);
            }
        });
        fragmentTodoListBinding.btnAdd.setOnClickListener(new View.OnClickListener() { // from class: sq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoListFragment.y(fragmentTodoListBinding, this, view);
            }
        });
        fragmentTodoListBinding.btnDone.setOnClickListener(new View.OnClickListener() { // from class: uq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoListFragment.z(this.a, view);
            }
        });
        fragmentTodoListBinding.contentLayout.setPullRefreshEnabled(false);
        fragmentTodoListBinding.contentLayout.setLoadingMoreEnabled(false);
        fragmentTodoListBinding.contentLayout.setNestedScrollingEnabled(false);
        SwipeMenuRecyclerView swipeMenuRecyclerView = fragmentTodoListBinding.contentLayout;
        TodoAdapter<b> todoAdapter = this.adapter;
        Objects.requireNonNull(todoAdapter);
        swipeMenuRecyclerView.setAdapter(todoAdapter);
        SwipeMenuRecyclerView swipeMenuRecyclerView2 = fragmentTodoListBinding.contentLayout;
        HorizontalDividerItemDecoration.Builder builderColor = new HorizontalDividerItemDecoration.Builder(requireContext()).sizeResId(R.dimen.size_15dp).color(0);
        TodoAdapter<b> todoAdapter2 = this.adapter;
        Objects.requireNonNull(todoAdapter2);
        swipeMenuRecyclerView2.addItemDecoration(builderColor.visibilityProvider(todoAdapter2).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FragmentTodoListBinding fragmentTodoListBinding, TodoListFragment todoListFragment, View view) {
        fragmentTodoListBinding.contentLayout.smoothCloseMenu();
        todoListFragment.G(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(FragmentTodoListBinding fragmentTodoListBinding, TodoListFragment todoListFragment, View view) {
        fragmentTodoListBinding.contentLayout.smoothCloseMenu();
        if (todoListFragment.l()) {
            FragmentKt.findNavController(todoListFragment).navigate(R.id.action_to_editTodo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(TodoListFragment todoListFragment, View view) {
        todoListFragment.G(false);
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public boolean onBackPressed() {
        if (!this.isEditEnable) {
            return super.onBackPressed();
        }
        G(false);
        return true;
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        u();
        q().getTodoListLiveData().observe(this, new Observer() { // from class: wq7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TodoListFragment.B(this.a, (List) obj);
            }
        });
        q().getResultLiveData().observe(this, new Observer() { // from class: vq7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TodoListFragment.C(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return p().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        I();
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

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        w(p());
        if (this.refreshData) {
            J(p(), this.isEditEnable);
            FragmentTodoListBinding fragmentTodoListBindingP = p();
            TodoAdapter<b> todoAdapter = this.adapter;
            Objects.requireNonNull(todoAdapter);
            List<b> groups = todoAdapter.getGroups();
            K(fragmentTodoListBindingP, groups == null || groups.isEmpty());
            H();
        }
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    @NotNull
    public String tag() {
        return TAG;
    }
}
