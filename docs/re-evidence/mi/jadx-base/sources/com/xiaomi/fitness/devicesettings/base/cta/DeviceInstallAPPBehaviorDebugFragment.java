package com.xiaomi.fitness.devicesettings.base.cta;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.devicesettings.base.cta.CTABehaviorApp;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.av6;
import defpackage.ee6;
import defpackage.eui;
import defpackage.q64;
import defpackage.s7r;
import defpackage.v69;
import defpackage.w69;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001!\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0007¢\u0006\u0004\b$\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorDebugFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugViewModel;", "Lee6;", "Lv69;", "appBehavior", "", "handleAppBehavior", "(Lv69;)V", "showLimitDialog", "()V", "downloadCTAFile", "showAppSelectDialog", "bindView", "(Lee6;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter;", "mDeviceInstallAPPBehaviorAdapter", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter;", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectAdapter;", "mDeviceInstallAPPSelectAdapter", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectAdapter;", "", "Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;", "selectInstallAppList", "Ljava/util/List;", "ctaAppBehaviorList", "com/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorDebugFragment$ctaBehaviorHandle$1", "ctaBehaviorHandle", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorDebugFragment$ctaBehaviorHandle$1;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceInstallAPPBehaviorDebugFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInstallAPPBehaviorDebugFragment.kt\ncom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorDebugFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,301:1\n1#2:302\n1863#3,2:303\n1863#3,2:305\n1863#3,2:307\n1863#3,2:317\n1863#3,2:319\n37#4:309\n36#4,3:310\n37#4:313\n36#4,3:314\n*S KotlinDebug\n*F\n+ 1 DeviceInstallAPPBehaviorDebugFragment.kt\ncom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorDebugFragment\n*L\n75#1:303,2\n80#1:305,2\n246#1:307,2\n205#1:317,2\n261#1:319,2\n169#1:309\n169#1:310,3\n183#1:313\n183#1:314,3\n*E\n"})
public final class DeviceInstallAPPBehaviorDebugFragment extends Hilt_DeviceInstallAPPBehaviorDebugFragment<DeviceInstallAPPInfoDebugViewModel, ee6> {

    @NotNull
    public static final String TAG = "DeviceInstallAPPBehaviorDebugFragment";

    @NotNull
    private final List<v69> ctaAppBehaviorList;

    @NotNull
    private final DeviceInstallAPPBehaviorDebugFragment$ctaBehaviorHandle$1 ctaBehaviorHandle;

    @NotNull
    private final DeviceInstallAPPBehaviorAdapter mDeviceInstallAPPBehaviorAdapter;
    private DeviceInstallAPPSelectAdapter mDeviceInstallAPPSelectAdapter;

    @NotNull
    private final List<CTABehaviorApp> selectInstallAppList;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment$handleAppBehavior$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment$handleAppBehavior$4", f = "DeviceInstallAPPBehaviorDebugFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<v69> $updateCtaAppBehaviorList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(List<v69> list, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$updateCtaAppBehaviorList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceInstallAPPBehaviorDebugFragment.this.new AnonymousClass4(this.$updateCtaAppBehaviorList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceInstallAPPBehaviorDebugFragment.this.mDeviceInstallAPPBehaviorAdapter.submitList(this.$updateCtaAppBehaviorList);
            DeviceInstallAPPBehaviorDebugFragment.access$getMBinding(DeviceInstallAPPBehaviorDebugFragment.this).A.scrollToPosition(0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment$ctaBehaviorHandle$1] */
    public DeviceInstallAPPBehaviorDebugFragment() {
        super(eui.f17080r);
        this.mDeviceInstallAPPBehaviorAdapter = new DeviceInstallAPPBehaviorAdapter();
        this.selectInstallAppList = new ArrayList();
        this.ctaAppBehaviorList = new ArrayList();
        this.ctaBehaviorHandle = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment$ctaBehaviorHandle$1
            @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
            public boolean handlePacket(String did, int type, s7r packet) {
                Intrinsics.checkNotNullParameter(did, "did");
                if (packet == null) {
                    return false;
                }
                DeviceInstallAPPBehaviorDebugFragment deviceInstallAPPBehaviorDebugFragment = this.this$0;
                if (packet.f != 14) {
                    return false;
                }
                v69 v69VarO = packet.t().o();
                if (v69VarO == null) {
                    return true;
                }
                deviceInstallAPPBehaviorDebugFragment.handleAppBehavior(v69VarO);
                return true;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ee6 access$getMBinding(DeviceInstallAPPBehaviorDebugFragment deviceInstallAPPBehaviorDebugFragment) {
        return (ee6) deviceInstallAPPBehaviorDebugFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$14(DeviceInstallAPPBehaviorDebugFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        q64 q64Var = new q64();
        q64Var.c = "时间";
        q64Var.d = "2024.06.21 08:55:23\n";
        q64 q64Var2 = new q64();
        q64Var2.c = "进程号";
        q64Var2.d = "p-1";
        q64 q64Var3 = new q64();
        q64Var3.c = "敏感行为";
        q64Var3.d = "定位";
        q64 q64Var4 = new q64();
        q64Var4.c = "api";
        q64Var4.d = "api";
        q64 q64Var5 = new q64();
        q64Var5.c = "包名";
        q64Var5.d = "com.mi.health";
        ArrayList arrayList = new ArrayList();
        arrayList.add(q64Var);
        arrayList.add(q64Var2);
        arrayList.add(q64Var3);
        arrayList.add(q64Var4);
        arrayList.add(q64Var5);
        v69 v69Var = new v69();
        v69Var.c = "好轻";
        v69Var.d = (q64[]) arrayList.toArray(new q64[0]);
        q64 q64Var6 = new q64();
        q64Var6.c = "敏感行为";
        q64Var6.d = "蓝牙";
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(q64Var);
        arrayList2.add(q64Var2);
        arrayList2.add(q64Var6);
        arrayList2.add(q64Var4);
        arrayList2.add(q64Var5);
        v69 v69Var2 = new v69();
        v69Var2.c = "好轻";
        v69Var2.d = (q64[]) arrayList2.toArray(new q64[0]);
        this$0.handleAppBehavior(v69Var);
        this$0.handleAppBehavior(v69Var2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(DeviceInstallAPPBehaviorDebugFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showAppSelectDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(DeviceInstallAPPBehaviorDebugFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.downloadCTAFile();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void downloadCTAFile() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).downloadCTAFile(this.ctaAppBehaviorList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAppBehavior(v69 appBehavior) {
        Object next;
        Object next2;
        ArrayList arrayList = new ArrayList();
        if (this.ctaAppBehaviorList.size() >= 1800) {
            showLimitDialog();
            return;
        }
        if (appBehavior != null) {
            Logger.i("CTA_APP", "handleAppBehavior: " + appBehavior);
            this.ctaAppBehaviorList.add(0, appBehavior);
        }
        Iterator<T> it = this.selectInstallAppList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!((CTABehaviorApp) next).isSelect()));
        if (next == null) {
            arrayList.addAll(this.ctaAppBehaviorList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (CTABehaviorApp cTABehaviorApp : this.selectInstallAppList) {
                if (cTABehaviorApp.isSelect()) {
                    arrayList2.add(cTABehaviorApp);
                }
            }
            for (v69 v69Var : this.ctaAppBehaviorList) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(((CTABehaviorApp) next2).getAppInfo().d, v69Var.c));
                if (next2 != null) {
                    arrayList.add(v69Var);
                }
            }
        }
        AnyExtKt.main$default(null, new AnonymousClass4(arrayList, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$16(DeviceInstallAPPBehaviorDebugFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this$0.selectInstallAppList.add(new CTABehaviorApp(true, (w69) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$17(DeviceInstallAPPBehaviorDebugFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this$0.ctaAppBehaviorList.clear();
            DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter = this$0.mDeviceInstallAPPSelectAdapter;
            if (deviceInstallAPPSelectAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPSelectAdapter");
                deviceInstallAPPSelectAdapter = null;
            }
            deviceInstallAPPSelectAdapter.submitList(new ArrayList());
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, "下载完成");
        }
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(DeviceInstallAPPBehaviorDebugFragment this$0, int i, CTABehaviorApp app) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app, "app");
        this$0.selectInstallAppList.set(i, app);
        DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter = this$0.mDeviceInstallAPPSelectAdapter;
        if (deviceInstallAPPSelectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPSelectAdapter");
            deviceInstallAPPSelectAdapter = null;
        }
        deviceInstallAPPSelectAdapter.notifyItemChanged(i);
        return Unit.INSTANCE;
    }

    private final void showAppSelectDialog() {
        Object next;
        DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter = null;
        View viewInflate = getLayoutInflater().inflate(eui.p, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(zqi.X1);
        final TextView textView = (TextView) viewInflate.findViewById(zqi.T7);
        final ImageButton imageButton = (ImageButton) viewInflate.findViewById(zqi.R7);
        Iterator<T> it = this.selectInstallAppList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!((CTABehaviorApp) next).isSelect()));
        if (next == null) {
            textView.setText(wzi.F5);
            imageButton.setSelected(true);
        } else {
            textView.setText(wzi.J5);
            imageButton.setSelected(false);
        }
        DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter2 = this.mDeviceInstallAPPSelectAdapter;
        if (deviceInstallAPPSelectAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPSelectAdapter");
            deviceInstallAPPSelectAdapter2 = null;
        }
        recyclerView.setAdapter(deviceInstallAPPSelectAdapter2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.selectInstallAppList.iterator();
        while (it2.hasNext()) {
            arrayList.add((CTABehaviorApp) it2.next());
        }
        DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter3 = this.mDeviceInstallAPPSelectAdapter;
        if (deviceInstallAPPSelectAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPSelectAdapter");
        } else {
            deviceInstallAPPSelectAdapter = deviceInstallAPPSelectAdapter3;
        }
        deviceInstallAPPSelectAdapter.submitList(arrayList);
        ViewExtKt.clickWithTrigger$default(imageButton, 0L, new Function1() { // from class: r66
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInstallAPPBehaviorDebugFragment.showAppSelectDialog$lambda$22(imageButton, textView, this, (ImageButton) obj);
            }
        }, 1, null);
        new CommonDialog.c("commonDialog").setCustomView(viewInflate).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment.showAppSelectDialog.4
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    DeviceInstallAPPBehaviorDebugFragment.this.handleAppBehavior(null);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAppSelectDialog$lambda$22(ImageButton imageButton, TextView textView, DeviceInstallAPPBehaviorDebugFragment this$0, ImageButton imageButton2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = new ArrayList();
        imageButton.setSelected(!imageButton.isSelected());
        if (imageButton.isSelected()) {
            textView.setText(wzi.F5);
            imageButton.setSelected(true);
        } else {
            imageButton.setSelected(false);
            textView.setText(wzi.F5);
        }
        for (CTABehaviorApp cTABehaviorApp : this$0.selectInstallAppList) {
            cTABehaviorApp.setSelect(imageButton.isSelected());
            arrayList.add(cTABehaviorApp);
        }
        this$0.selectInstallAppList.clear();
        this$0.selectInstallAppList.addAll(arrayList);
        DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter = this$0.mDeviceInstallAPPSelectAdapter;
        if (deviceInstallAPPSelectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInstallAPPSelectAdapter");
            deviceInstallAPPSelectAdapter = null;
        }
        deviceInstallAPPSelectAdapter.submitList(arrayList);
        return Unit.INSTANCE;
    }

    private final void showLimitDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(new DialogParams.DialogDescriptionString("容量不足")).setDialogDescriptionString(new DialogParams.DialogDescriptionString("即将清空历史监控，请及时下载备份")).setPositiveText(wzi.qf).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment.showLimitDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    DeviceInstallAPPBehaviorDebugFragment.this.downloadCTAFile();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ee6 ee6Var) {
        Intrinsics.checkNotNullParameter(ee6Var, "<this>");
        setTitle("监控信息");
        ViewExtKt.clickWithTrigger$default(ee6Var.D, 0L, new Function1() { // from class: o66
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInstallAPPBehaviorDebugFragment.bindView$lambda$4(this.f28784a, (Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(ee6Var.B, 0L, new Function1() { // from class: p66
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInstallAPPBehaviorDebugFragment.bindView$lambda$5(this.f30053a, (Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(ee6Var.C, 0L, new Function1() { // from class: q66
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInstallAPPBehaviorDebugFragment.bindView$lambda$14(this.f31160a, (Button) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).unSubscribeAppBehavior();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(13, this.ctaBehaviorHandle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((ee6) getMBinding()).A.setAdapter(this.mDeviceInstallAPPBehaviorAdapter);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(13, this.ctaBehaviorHandle);
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).getDeviceCTAAppList().observe(getViewLifecycleOwner(), new Observer() { // from class: l66
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceInstallAPPBehaviorDebugFragment.onViewCreated$lambda$16(this.f24713a, (List) obj);
            }
        });
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).getDownloadSaveResult().observe(getViewLifecycleOwner(), new Observer() { // from class: m66
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceInstallAPPBehaviorDebugFragment.onViewCreated$lambda$17(this.f25801a, (Boolean) obj);
            }
        });
        this.mDeviceInstallAPPSelectAdapter = new DeviceInstallAPPSelectAdapter(new Function2() { // from class: n66
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceInstallAPPBehaviorDebugFragment.onViewCreated$lambda$18(this.f27588a, ((Integer) obj).intValue(), (CTABehaviorApp) obj2);
            }
        });
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).subscribeAppBehavior();
        ((DeviceInstallAPPInfoDebugViewModel) getMViewModel()).getCTAAppList();
    }
}
