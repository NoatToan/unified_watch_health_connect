package com.xiaomi.fitness.device.manager.ui.tab;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.SportConstants;
import defpackage.av6;
import defpackage.bji;
import defpackage.d2m;
import defpackage.dui;
import defpackage.n56;
import defpackage.uzi;
import defpackage.zv1;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListViewModel;", "Ln56;", "", "showUnbindConfirmDialog", "()V", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "tabContentItem", "Lkotlin/Function0;", "callback", "checkNeedConnect", "(Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "", "TAG", "Ljava/lang/String;", "", "type", "I", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSettingListFragment extends Hilt_DeviceSettingListFragment<DeviceSettingListViewModel, n56> {

    @NotNull
    public static final String DEVICE_TAB_TYPE = "device_tab_type";

    @NotNull
    private String TAG;
    private int type;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$checkNeedConnect$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$checkNeedConnect$1", f = "DeviceSettingListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callback;
        final /* synthetic */ TabContentItem $tabContentItem;
        int label;
        final /* synthetic */ DeviceSettingListFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$checkNeedConnect$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$checkNeedConnect$1$1", f = "DeviceSettingListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DeviceSettingListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04351(DeviceSettingListFragment deviceSettingListFragment, Continuation<? super C04351> continuation) {
                super(2, continuation);
                this.this$0 = deviceSettingListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04351(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Context context = this.this$0.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, uzi.o1);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$checkNeedConnect$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$checkNeedConnect$1$2", f = "DeviceSettingListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$callback = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$callback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TabContentItem tabContentItem, DeviceSettingListFragment deviceSettingListFragment, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$tabContentItem = tabContentItem;
            this.this$0 = deviceSettingListFragment;
            this.$callback = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$tabContentItem, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            if (!this.$tabContentItem.getNeedConnect((WearableDeviceModel) deviceManagerExtKt.getCurrentDeviceModel()) || deviceManagerExtKt.isConnected()) {
                AnyExtKt.main$default(null, new AnonymousClass2(this.$callback, null), 1, null);
            } else {
                AnyExtKt.main$default(null, new C04351(this.this$0, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment$showUnbindConfirmDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/device/manager/ui/tab/DeviceSettingListFragment$showUnbindConfirmDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C19731 extends av6 {
        final /* synthetic */ WearableDeviceModel $device;

        public C19731(WearableDeviceModel wearableDeviceModel) {
            this.$device = wearableDeviceModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(DeviceSettingListFragment this$0, int i) {
            Context context;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.hideLoading();
            if (i == 0) {
                this$0.finish();
            } else if (i == 604 && (context = this$0.getContext()) != null) {
                ToastExtKt.toastShort(context, uzi.common_network_error_retry_later);
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                if (!NetworkExtKt.isNetworkAvailable()) {
                    Context context = DeviceSettingListFragment.this.getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, uzi.common_hint_network_unavailable);
                        return;
                    }
                    return;
                }
                PageState.DefaultImpls.showLoading$default(DeviceSettingListFragment.this, uzi.Z1, false, 2, null);
                DeviceSettingListViewModel deviceSettingListViewModelAccess$getMViewModel = DeviceSettingListFragment.access$getMViewModel(DeviceSettingListFragment.this);
                String did = this.$device.getDid();
                final DeviceSettingListFragment deviceSettingListFragment = DeviceSettingListFragment.this;
                deviceSettingListViewModelAccess$getMViewModel.unbind(did, new Function1() { // from class: jc6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceSettingListFragment.C19731.onDialogClick$lambda$0(deviceSettingListFragment, ((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    public DeviceSettingListFragment() {
        super(dui.f15943r, zv1.f41707k);
        this.TAG = "DeviceSettingListFragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DeviceSettingListViewModel access$getMViewModel(DeviceSettingListFragment deviceSettingListFragment) {
        return (DeviceSettingListViewModel) deviceSettingListFragment.getMViewModel();
    }

    private final void checkNeedConnect(TabContentItem tabContentItem, Function0<Unit> callback) {
        AnyExtKt.io$default(null, new AnonymousClass1(tabContentItem, this, callback, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(final DeviceSettingListFragment this$0, final TabContentItem tabContentItem, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tabContentItem, "tabContentItem");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (tabContentItem.getType() != 212) {
            this$0.checkNeedConnect(tabContentItem, new Function0() { // from class: gc6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceSettingListFragment.onViewCreated$lambda$1$lambda$0(tabContentItem, this$0);
                }
            });
            return Unit.INSTANCE;
        }
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tabContentItem.handleItemClicked(contextRequireContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(TabContentItem tabContentItem, DeviceSettingListFragment this$0) {
        Intrinsics.checkNotNullParameter(tabContentItem, "$tabContentItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tabContentItem.handleItemClicked(contextRequireContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(DeviceSettingListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showUnbindConfirmDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onVisible$lambda$3(TabContentItem tabContentItem) {
        return tabContentItem.getType() == 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onVisible$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke2(obj)).booleanValue();
    }

    private final void showUnbindConfirmDialog() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.29510"), "name", "unbind", SportConstants.KEY_TIMESTAMP, String.valueOf(System.currentTimeMillis()), "model", DeviceModelExtKt.getModel(wearableDeviceModel));
        new CommonDialog.c("unbind").setDialogTitle(new DialogParams.DialogDescriptionString(uzi.j0, DeviceModelExtKt.getName(wearableDeviceModel))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(uzi.i0, DeviceModelExtKt.getName(wearableDeviceModel))).setPositiveText(uzi.d).setNegativeText(uzi.c).create().addDialogCallback(new C19731(wearableDeviceModel)).showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (((DeviceSettingListViewModel) getMViewModel()).getMDeviceModel() == null) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, uzi.common_hint_unkonwn_error);
            }
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                mActivity2.finish();
                return;
            }
            return;
        }
        setTitleBackground(bji.c);
        Bundle arguments = getArguments();
        this.type = arguments != null ? arguments.getInt(DEVICE_TAB_TYPE) : 0;
        setTitle(((DeviceSettingListViewModel) getMViewModel()).getMModel().buildTabTitle(this.type));
        setActionBarResizeable(false);
        setActionBarExpandState(1);
        ((DeviceSettingListViewModel) getMViewModel()).createSettingItems(this.type);
        ((DeviceSettingListViewModel) getMViewModel()).setOnClickListener(new Function3() { // from class: ec6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceSettingListFragment.onViewCreated$lambda$1(this.f16479a, (TabContentItem) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        View root = ((n56) getMBinding()).B.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.setVisible(root, this.type == 11);
        ((n56) getMBinding()).B.getRoot().setOnClickListener(new View.OnClickListener() { // from class: fc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceSettingListFragment.onViewCreated$lambda$2(this.f17644a, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        Logger.i(this.TAG, "onVisible enter mViewModel.settingTabItems.size = " + ((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems().size());
        if (((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems().size() > 0) {
            Stream<TabContentItem> stream = ((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems().stream();
            final Function1 function1 = new Function1() { // from class: hc6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeviceSettingListFragment.onVisible$lambda$3((TabContentItem) obj));
                }
            };
            Object objCollect = stream.filter(new Predicate() { // from class: ic6
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return DeviceSettingListFragment.onVisible$lambda$4(function1, obj);
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(objCollect, "collect(...)");
            List list = (List) objCollect;
            Logger.i(this.TAG, "onVisible enter tabList.size = " + list.size() + " mViewModel.settingTabItems=" + ((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems().get(0));
            if (list.size() > 0) {
                TabContentItem tabContentItem = (TabContentItem) list.get(0);
                int iIndexOf = ((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems().indexOf(tabContentItem);
                MutableLiveData<String> rightTextWithDot = tabContentItem.getRightTextWithDot();
                if (rightTextWithDot != null) {
                    rightTextWithDot.setValue(!d2m.y(getContext()) ? " " : "");
                }
                ((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems().set(iIndexOf, tabContentItem);
                Logger.i(this.TAG, "onVisible index=" + iIndexOf + " resultItem=" + tabContentItem + " mViewModel.settingTabItems =" + ((DeviceSettingListViewModel) getMViewModel()).getSettingTabItems());
            }
        }
    }
}
