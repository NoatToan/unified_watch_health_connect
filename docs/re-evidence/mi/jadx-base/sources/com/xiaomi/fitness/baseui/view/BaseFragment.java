package com.xiaomi.fitness.baseui.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.ViewCreator;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.widget.state.StatusPage;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.wc0;
import defpackage.yzd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import miuix.appcompat.app.Fragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\n\b&\u0018\u0000 \u0098\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004\u0098\u0001\u0099\u0001B\u0013\u0012\b\b\u0002\u0010Y\u001a\u000206¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010\tJ!\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010)J\u000f\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010)Jn\u0010<\u001a\u00020\u00072\n\u00100\u001a\u0006\u0012\u0002\b\u00030/2\u0019\b\u0002\u00104\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000701¢\u0006\u0002\b328\u0010;\u001a4\u0012\u0013\u0012\u001106¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0015\u0012\u0013\u0018\u000102¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u000705¢\u0006\u0004\b<\u0010=JO\u0010<\u001a\u00020\u00072\u0006\u0010>\u001a\u00020228\u0010;\u001a4\u0012\u0013\u0012\u001106¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0015\u0012\u0013\u0018\u000102¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u000705¢\u0006\u0004\b<\u0010?J\u0011\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ+\u0010L\u001a\u00020\u00072\u001c\u0010K\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070I\u0012\u0006\u0012\u0004\u0018\u00010J01¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020U¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020U¢\u0006\u0004\bX\u0010WR\u0014\u0010Y\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\"\u0010_\u001a\u00020[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010]\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u0004\u0018\u00010d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bk\u0010)\"\u0004\bm\u0010\rR\"\u0010n\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bn\u0010l\u001a\u0004\bn\u0010)\"\u0004\bo\u0010\rR\"\u0010p\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bp\u0010l\u001a\u0004\bp\u0010)\"\u0004\bq\u0010\rR\"\u0010r\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\br\u0010)\"\u0004\bs\u0010\rR\"\u0010t\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bt\u0010l\u001a\u0004\bt\u0010)\"\u0004\bu\u0010\rR\"\u0010v\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bv\u0010l\u001a\u0004\bv\u0010)\"\u0004\bw\u0010\rR\"\u0010x\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001a\u0010~\u001a\u00020\n8\u0014X\u0094D¢\u0006\f\n\u0004\b~\u0010l\u001a\u0004\b~\u0010)R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0087\u0001\u001a\u00030\u0082\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R3\u0010\u008a\u0001\u001a\f\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u0088\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020U0\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0095\u0001\u001a\u0002068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lmiuix/appcompat/app/Fragment;", "Lcom/xiaomi/fitness/baseui/view/IActionBar;", "Lcom/xiaomi/fitness/baseui/view/OperateActivityActionBar;", "Lcom/xiaomi/fitness/baseui/ViewCreator;", "Lcom/xiaomi/fitness/baseui/view/PageState;", "Lcom/xiaomi/fitness/baseui/view/BackPressHandler;", "", "invisible", "()V", "", "visible", "visibleCallback", "(Z)V", "loadData", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "finish", "isVisibleToUser", "setUserVisibleHint", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_RESUME, "onVisibilityChanged", LifecycleConstantKt.ON_STOP, "onVisible", "firstVisible", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onInvisible", "isNeedPageStat", "()Z", SdkContants.KEY_BUNDLE, "onNewIntent", "(Landroid/os/Bundle;)V", "onBackPressed", "isInvalid", "Ljava/lang/Class;", "cls", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "resultCode", "data", "callBack", "startForActivityResult", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "intent", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function2;)V", "Lwc0;", "getMiuiActionBar", "()Lwc0;", "getHostActivity", "()Lcom/xiaomi/fitness/baseui/view/IActionBar;", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/coroutines/Continuation;", "", "execute", "launchOnLifecycleScope", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "pageName", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment$FragmentVisibleCallback;", "addVisibleCallback", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment$FragmentVisibleCallback;)V", "removeVisibleCallback", "mContentLayoutId", "I", "", "beginShowTime", "J", "endShowTime", "durationSec", "getDurationSec", "()J", "setDurationSec", "(J)V", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "getMActivity", "()Landroidx/fragment/app/FragmentActivity;", "setMActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "isPrepared", "Z", "setPrepared", "isFragmentVisible", "setFragmentVisible", "isFirstVisible", "setFirstVisible", "isNeedAwaysToRefresh", "setNeedAwaysToRefresh", "isStatusBarFontBlack", "setStatusBarFontBlack", "isStatusBarFontNeedSet", "setStatusBarFontNeedSet", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "isAdaptActionBar", "Lcom/xiaomi/fitness/baseui/view/ActionBarStateProvider;", "mActionBarStateProvider", "Lcom/xiaomi/fitness/baseui/view/ActionBarStateProvider;", "Lcom/xiaomi/fitness/widget/state/StatusPage;", "mStatusPage$delegate", "Lkotlin/Lazy;", "getMStatusPage", "()Lcom/xiaomi/fitness/widget/state/StatusPage;", "mStatusPage", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "mLoadingDialog", "Ljava/lang/ref/WeakReference;", "getMLoadingDialog", "()Ljava/lang/ref/WeakReference;", "setMLoadingDialog", "(Ljava/lang/ref/WeakReference;)V", "", "visibleCallbackList", "Ljava/util/Set;", "getLayoutId", "()I", "layoutId", "<init>", "(I)V", "Companion", "FragmentVisibleCallback", "ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/xiaomi/fitness/baseui/view/BaseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1863#2,2:296\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/xiaomi/fitness/baseui/view/BaseFragment\n*L\n287#1:296,2\n*E\n"})
public abstract class BaseFragment extends Fragment implements IActionBar, OperateActivityActionBar, ViewCreator, PageState, BackPressHandler {

    @NotNull
    public static final String TAG = "BaseFragment";
    private long beginShowTime;
    private long durationSec;
    private long endShowTime;
    private final boolean isAdaptActionBar;
    private boolean isFirstVisible;
    private boolean isFragmentVisible;
    private boolean isNeedAwaysToRefresh;
    private boolean isPrepared;
    private boolean isStatusBarFontBlack;
    private boolean isStatusBarFontNeedSet;

    @Nullable
    private ActionBarStateProvider mActionBarStateProvider;

    @Nullable
    private FragmentActivity mActivity;
    private final int mContentLayoutId;

    @Nullable
    private WeakReference<CircleProgressDialog> mLoadingDialog;

    /* JADX INFO: renamed from: mStatusPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStatusPage;
    public View rootView;

    @NotNull
    private final Set<FragmentVisibleCallback> visibleCallbackList;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseFragment$FragmentVisibleCallback;", "", "onFragmentVisibleChanged", "", "fragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "visible", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FragmentVisibleCallback {
        void onFragmentVisibleChanged(@NotNull BaseFragment fragment, boolean visible);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.view.BaseFragment$launchOnLifecycleScope$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.baseui.view.BaseFragment$launchOnLifecycleScope$1", f = "BaseFragment.kt", i = {}, l = {SportSummary.VERSION_105}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $execute;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$execute = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$execute, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.$execute;
                this.label = 1;
                if (function1.invoke2(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BaseFragment() {
        this(0, 1, null);
    }

    private final void invisible() {
        if (this.isFragmentVisible && this.isPrepared) {
            this.isFragmentVisible = false;
            onInvisible();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StatusPage mStatusPage_delegate$lambda$1(BaseFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StatusPage(this$0.getRootView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startForActivityResult$default(BaseFragment baseFragment, Class cls, Function1 function1, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startForActivityResult");
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: t72
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BaseFragment.startForActivityResult$lambda$0((Intent) obj2);
                }
            };
        }
        baseFragment.startForActivityResult(cls, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startForActivityResult$lambda$0(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return Unit.INSTANCE;
    }

    private final void visibleCallback(boolean visible) {
        Iterator<T> it = this.visibleCallbackList.iterator();
        while (it.hasNext()) {
            ((FragmentVisibleCallback) it.next()).onFragmentVisibleChanged(this, visible);
        }
    }

    public final void addVisibleCallback(@NotNull FragmentVisibleCallback visibleCallback) {
        Intrinsics.checkNotNullParameter(visibleCallback, "visibleCallback");
        this.visibleCallbackList.add(visibleCallback);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void applyEditModeActionBar(int i, int i2, @Nullable Function1<? super View, Unit> function1, @Nullable Function1<? super View, Unit> function2) {
        IActionBar.DefaultImpls.applyEditModeActionBar(this, i, i2, function1, function2);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void dismissDialog() {
        PageState.DefaultImpls.dismissDialog(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void dismissDialogForce() {
        PageState.DefaultImpls.dismissDialogForce(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void displayOptions(int i) {
        IActionBar.DefaultImpls.displayOptions(this, i);
    }

    public void finish() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
    }

    public void firstVisible() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("firstVisible: ");
        sb.append(simpleName);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View getActionModeButton(@Nullable Window window, int i) {
        return IActionBar.DefaultImpls.getActionModeButton(this, window, i);
    }

    public final long getDurationSec() {
        return this.durationSec;
    }

    @Override // com.xiaomi.fitness.baseui.view.OperateActivityActionBar
    @Nullable
    public IActionBar getHostActivity() {
        yzd.a appCompatActivity = getAppCompatActivity();
        if (appCompatActivity instanceof IActionBar) {
            return (IActionBar) appCompatActivity;
        }
        return null;
    }

    public int getLayoutId() {
        return this.mContentLayoutId;
    }

    @Nullable
    public FragmentActivity getMActivity() {
        return this.mActivity;
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    @Nullable
    public WeakReference<CircleProgressDialog> getMLoadingDialog() {
        return this.mLoadingDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    @NotNull
    public StatusPage getMStatusPage() {
        return (StatusPage) this.mStatusPage.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public wc0 getMiuiActionBar() {
        return getActionBar();
    }

    @NotNull
    public final View getRootView() {
        View view = this.rootView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rootView");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void hideBack() {
        IActionBar.DefaultImpls.hideBack(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void hideLoading() {
        PageState.DefaultImpls.hideLoading(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public boolean isActionBarBigTitleMode() {
        return IActionBar.DefaultImpls.isActionBarBigTitleMode(this);
    }

    /* JADX INFO: renamed from: isAdaptActionBar, reason: from getter */
    public boolean getIsAdaptActionBar() {
        return this.isAdaptActionBar;
    }

    /* JADX INFO: renamed from: isFirstVisible, reason: from getter */
    public final boolean getIsFirstVisible() {
        return this.isFirstVisible;
    }

    /* JADX INFO: renamed from: isFragmentVisible, reason: from getter */
    public final boolean getIsFragmentVisible() {
        return this.isFragmentVisible;
    }

    public boolean isInvalid() {
        if (!isDetached() && getActivity() != null) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            if (!mActivity.isFinishing()) {
                FragmentActivity mActivity2 = getMActivity();
                Intrinsics.checkNotNull(mActivity2);
                if (!mActivity2.isDestroyed()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public boolean isLoadingShowing() {
        return PageState.DefaultImpls.isLoadingShowing(this);
    }

    /* JADX INFO: renamed from: isNeedAwaysToRefresh, reason: from getter */
    public final boolean getIsNeedAwaysToRefresh() {
        return this.isNeedAwaysToRefresh;
    }

    public boolean isNeedPageStat() {
        return true;
    }

    /* JADX INFO: renamed from: isPrepared, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    /* JADX INFO: renamed from: isStatusBarFontBlack, reason: from getter */
    public final boolean getIsStatusBarFontBlack() {
        return this.isStatusBarFontBlack;
    }

    /* JADX INFO: renamed from: isStatusBarFontNeedSet, reason: from getter */
    public final boolean getIsStatusBarFontNeedSet() {
        return this.isStatusBarFontNeedSet;
    }

    public final void launchOnLifecycleScope(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> execute) {
        Intrinsics.checkNotNullParameter(execute, "execute");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenCreated(new AnonymousClass1(execute, null));
    }

    public void loadData() {
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setMActivity(getActivity());
        if (getIsAdaptActionBar()) {
            this.mActionBarStateProvider = new ActionBarStateProvider(context, this, null, 4, null);
        }
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ActionBarStateProvider actionBarStateProvider = this.mActionBarStateProvider;
        if (actionBarStateProvider != null) {
            actionBarStateProvider.onConfigurationChanged(newConfig);
        }
    }

    @Override // miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getLayoutId() == -1) {
            throw new IllegalArgumentException("The layoutId must be passed in the constructor or override layoutId");
        }
        View viewInflate = inflater != null ? inflater.inflate(getLayoutId(), container, false) : null;
        Intrinsics.checkNotNull(viewInflate);
        setRootView(viewInflate);
        return getRootView();
    }

    public void onInvisible() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("onInvisible: ");
        sb.append(simpleName);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.endShowTime = jCurrentTimeMillis;
        this.durationSec = (jCurrentTimeMillis - this.beginShowTime) / ((long) 1000);
        this.beginShowTime = -1L;
        this.endShowTime = -1L;
        visibleCallback(false);
    }

    public void onNewIntent(@Nullable Bundle bundle) {
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        requireActivity().lambda$onCreate$0();
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!getUserVisibleHint() || isHidden()) {
            invisible();
        } else {
            visible();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void onRetry() {
        PageState.DefaultImpls.onRetry(this);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        invisible();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.isPrepared = true;
        ActionBarStateProvider actionBarStateProvider = this.mActionBarStateProvider;
        if (actionBarStateProvider != null) {
            actionBarStateProvider.setActionBar(getMiuiActionBar());
        }
    }

    @Override // miuix.appcompat.app.Fragment
    public void onVisibilityChanged(boolean visible) {
        super.onVisibilityChanged(visible);
        if (visible) {
            visible();
        } else {
            invisible();
        }
    }

    public void onVisible() {
        if (this.isStatusBarFontNeedSet) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            DisplayUtil.setStatusBarFontColor(mActivity, this.isStatusBarFontBlack);
        }
        if (isAdded()) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            uIUtils.updateBarColor(fragmentActivityRequireActivity);
        }
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("onVisible: ");
        sb.append(simpleName);
        this.beginShowTime = System.currentTimeMillis();
        visibleCallback(true);
    }

    @NotNull
    public String pageName() {
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final void removeVisibleCallback(@NotNull FragmentVisibleCallback visibleCallback) {
        Intrinsics.checkNotNullParameter(visibleCallback, "visibleCallback");
        this.visibleCallbackList.remove(visibleCallback);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarDisplayable(boolean z) {
        IActionBar.DefaultImpls.setActionBarDisplayable(this, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarExpandState(int i) {
        IActionBar.DefaultImpls.setActionBarExpandState(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarNormalTitleMode() {
        IActionBar.DefaultImpls.setActionBarNormalTitleMode(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarResizeable(boolean z) {
        IActionBar.DefaultImpls.setActionBarResizeable(this, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionModeButton(@NotNull Activity activity, @Nullable ActionMode actionMode, int i, int i2, @Nullable String str, int i3) {
        IActionBar.DefaultImpls.setActionModeButton(this, activity, actionMode, i, i2, str, i3);
    }

    @Override // com.xiaomi.fitness.baseui.view.OperateActivityActionBar
    public void setActivitySubtitle(int i) {
        OperateActivityActionBar.DefaultImpls.setActivitySubtitle(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.OperateActivityActionBar
    public void setActivityTitle(int i) {
        OperateActivityActionBar.DefaultImpls.setActivityTitle(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setCustomView(int i) {
        IActionBar.DefaultImpls.setCustomView(this, i);
    }

    public final void setDurationSec(long j) {
        this.durationSec = j;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View setEndTextView(int i, int i2, @Nullable String str, float f, @NotNull View.OnClickListener onClickListener) {
        return IActionBar.DefaultImpls.setEndTextView(this, i, i2, str, f, onClickListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View setEndView(int i, int i2, @Nullable String str, @NotNull View.OnClickListener onClickListener) {
        return IActionBar.DefaultImpls.setEndView(this, i, i2, str, onClickListener);
    }

    public final void setFirstVisible(boolean z) {
        this.isFirstVisible = z;
    }

    public final void setFragmentVisible(boolean z) {
        this.isFragmentVisible = z;
    }

    public void setMActivity(@Nullable FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void setMLoadingDialog(@Nullable WeakReference<CircleProgressDialog> weakReference) {
        this.mLoadingDialog = weakReference;
    }

    public final void setNeedAwaysToRefresh(boolean z) {
        this.isNeedAwaysToRefresh = z;
    }

    public final void setPrepared(boolean z) {
        this.isPrepared = z;
    }

    public final void setRootView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rootView = view;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View setStartView(int i, int i2, @Nullable String str, @NotNull View.OnClickListener onClickListener) {
        return IActionBar.DefaultImpls.setStartView(this, i, i2, str, onClickListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setStartViewRes(int i, @Nullable String str) {
        IActionBar.DefaultImpls.setStartViewRes(this, i, str);
    }

    public final void setStatusBarFontBlack(boolean z) {
        this.isStatusBarFontBlack = z;
    }

    public final void setStatusBarFontNeedSet(boolean z) {
        this.isStatusBarFontNeedSet = z;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setSubtitle(int i) {
        IActionBar.DefaultImpls.setSubtitle(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setTitle(int i) {
        IActionBar.DefaultImpls.setTitle(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setTitleBackground(int i) {
        IActionBar.DefaultImpls.setTitleBackground(this, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            visible();
        } else {
            invisible();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void showBack() {
        IActionBar.DefaultImpls.showBack(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showContent() {
        PageState.DefaultImpls.showContent(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showEmpty(int i, int i2) {
        PageState.DefaultImpls.showEmpty(this, i, i2);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showError() {
        PageState.DefaultImpls.showError(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState, com.xiaomi.fitness.access.AliPayView
    @Deprecated(message = "尽快修改成kotlin，直接使用带有默认参数的方法", replaceWith = @ReplaceWith(expression = "showLoading(msg : String = getString(R.string.dialog_loanding), progress : Int = 0, isCancelable: Boolean = true)", imports = {}))
    public void showLoading() {
        PageState.DefaultImpls.showLoading(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showNoNetwork() {
        PageState.DefaultImpls.showNoNetwork(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void startActionMode(@NotNull Activity activity, @NotNull ActionMode.Callback callback) {
        IActionBar.DefaultImpls.startActionMode(this, activity, callback);
    }

    public final void startForActivityResult(@NotNull Class<?> cls, @NotNull Function1<? super Intent, Unit> block, @NotNull Function2<? super Integer, ? super Intent, Unit> callBack) {
        Intrinsics.checkNotNullParameter(cls, "cls");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.startForActivityResult(cls, block, callBack);
        }
    }

    public void visible() {
        if (this.isFragmentVisible || !this.isPrepared) {
            return;
        }
        this.isFragmentVisible = true;
        onVisible();
        boolean z = this.isFirstVisible;
        if (z || this.isNeedAwaysToRefresh) {
            if (z) {
                firstVisible();
            }
            this.isFirstVisible = false;
            loadData();
        }
    }

    public BaseFragment(int i) {
        this.mContentLayoutId = i;
        this.beginShowTime = -1L;
        this.endShowTime = -1L;
        this.durationSec = -1L;
        this.isFirstVisible = true;
        this.isStatusBarFontBlack = true;
        this.isStatusBarFontNeedSet = true;
        this.isAdaptActionBar = true;
        this.mStatusPage = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u72
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseFragment.mStatusPage_delegate$lambda$1(this.f35484a);
            }
        });
        this.visibleCallbackList = new LinkedHashSet();
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void applyEditModeActionBar(@NotNull Bundle bundle, @Nullable Function1<? super View, Unit> function1, @Nullable Function1<? super View, Unit> function2, @Nullable String str, @Nullable String str2) {
        IActionBar.DefaultImpls.applyEditModeActionBar(this, bundle, function1, function2, str, str2);
    }

    @Override // com.xiaomi.fitness.baseui.view.OperateActivityActionBar
    public void setActivitySubtitle(@NotNull String str) {
        OperateActivityActionBar.DefaultImpls.setActivitySubtitle(this, str);
    }

    @Override // com.xiaomi.fitness.baseui.view.OperateActivityActionBar
    public void setActivityTitle(@NotNull String str) {
        OperateActivityActionBar.DefaultImpls.setActivityTitle(this, str);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setCustomView(@NotNull View view) {
        IActionBar.DefaultImpls.setCustomView(this, view);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setEndView(@NotNull View view) {
        IActionBar.DefaultImpls.setEndView(this, view);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setStartView(@Nullable View view) {
        IActionBar.DefaultImpls.setStartView(this, view);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setSubtitle(@Nullable String str) {
        IActionBar.DefaultImpls.setSubtitle(this, str);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setTitle(@Nullable String str) {
        IActionBar.DefaultImpls.setTitle(this, str);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showLoading(int i, boolean z) {
        PageState.DefaultImpls.showLoading(this, i, z);
    }

    public final void startForActivityResult(@NotNull Intent intent, @NotNull Function2<? super Integer, ? super Intent, Unit> callBack) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.startForActivityResult(intent, callBack);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setCustomView(@NotNull View view, @NotNull ActionBar.LayoutParams layoutParams) {
        IActionBar.DefaultImpls.setCustomView(this, view, layoutParams);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showLoading(@NotNull String str, int i, boolean z) {
        PageState.DefaultImpls.showLoading(this, str, i, z);
    }

    public /* synthetic */ BaseFragment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
