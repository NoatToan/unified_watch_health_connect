package com.xiaomi.fitness.devicesettings.bluttooth.shortcut;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutViewModel;
import com.xiaomi.fitness.devicesettings.utils.SportInfoUtil;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.pxo;
import defpackage.w2a;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b)\u0010\u001eJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\u00062\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel;", "Lw2a;", "Lpxo$a;", "shortcutList", "", "onGetSupportList", "(Lpxo$a;)V", "", "Landroid/util/Pair;", "", "pairs", "showSelector", "([Landroid/util/Pair;)V", "value", "change", "(Landroid/util/Pair;)V", "code", "Lpxo;", "result", "setResult", "(ILpxo;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "()V", "mCurrentShortcut", "Lpxo;", "shortcutSubType", "I", "getShortcutSubType", "()I", "setShortcutSubType", "(I)V", "getLayoutId", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleShortcutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleShortcutFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,125:1\n54#2,3:126\n24#2:129\n59#2,6:130\n*S KotlinDebug\n*F\n+ 1 BleShortcutFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutFragment\n*L\n35#1:126,3\n35#1:129\n35#1:130,6\n*E\n"})
public final class BleShortcutFragment extends BaseBindingFragment<BleShortcutViewModel, w2a> {

    @Nullable
    private pxo mCurrentShortcut;
    private int shortcutSubType = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void change(Pair<Integer, Integer> value) {
        Integer num;
        if (value == null) {
            return;
        }
        if (value.second != null && (num = (Integer) value.first) != null && num.intValue() == 3) {
            this.shortcutSubType = ((Number) value.second).intValue();
        }
        ((BleShortcutViewModel) getMViewModel()).setDownButton(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$5(final BleShortcutFragment this$0, int i, pxo pxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0 && pxoVar != null) {
            this$0.mCurrentShortcut = pxoVar;
            this$0.getMBinding().A.post(new Runnable() { // from class: nt2
                @Override // java.lang.Runnable
                public final void run() {
                    BleShortcutFragment.loadData$lambda$5$lambda$4(this.f28345a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadData$lambda$5$lambda$4(BleShortcutFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RightArrowSingleLineTextView rightArrowSingleLineTextView = this$0.getMBinding().A;
        SportInfoUtil sportInfoUtil = SportInfoUtil.INSTANCE;
        pxo pxoVar = this$0.mCurrentShortcut;
        Intrinsics.checkNotNull(pxoVar);
        int i = pxoVar.c;
        pxo pxoVar2 = this$0.mCurrentShortcut;
        Intrinsics.checkNotNull(pxoVar2);
        rightArrowSingleLineTextView.setRemindText(sportInfoUtil.getName(i, pxoVar2.d));
    }

    private final void onGetSupportList(pxo.a shortcutList) {
        pxo[] pxoVarArr = shortcutList != null ? shortcutList.c : null;
        if (pxoVarArr == null) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.i2);
                return;
            }
            return;
        }
        Pair<Integer, Integer>[] pairArr = new Pair[pxoVarArr.length];
        int length = pxoVarArr.length;
        for (int i = 0; i < length; i++) {
            pairArr[i] = new Pair<>(Integer.valueOf(pxoVarArr[i].c), Integer.valueOf(pxoVarArr[i].d));
        }
        showSelector(pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(BleShortcutFragment this$0, BleShortcutViewModel.SupportShortcutList supportShortcutList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.onGetSupportList(supportShortcutList.getShortcuts());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(BleShortcutFragment this$0, BleShortcutViewModel.SetResult setResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.setResult(setResult.getCode(), setResult.getResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$3(BleShortcutFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading();
        ((BleShortcutViewModel) this$0.getMViewModel()).m270getSupportShortcutList();
    }

    private final void setResult(int code, final pxo result) {
        if (code != 0 || result == null) {
            return;
        }
        this.mCurrentShortcut = result;
        getMBinding().A.post(new Runnable() { // from class: jt2
            @Override // java.lang.Runnable
            public final void run() {
                BleShortcutFragment.setResult$lambda$6(this.f23104a, result);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setResult$lambda$6(BleShortcutFragment this$0, pxo pxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().A.setRemindText(SportInfoUtil.INSTANCE.getName(pxoVar.c, pxoVar.d));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    private final void showSelector(final Pair<Integer, Integer>[] pairs) {
        if (pairs == null || pairs.length == 0) {
            return;
        }
        String[] strArr = new String[pairs.length];
        pxo pxoVar = this.mCurrentShortcut;
        Integer numValueOf = pxoVar != null ? Integer.valueOf(pxoVar.c) : null;
        pxo pxoVar2 = this.mCurrentShortcut;
        Logger.i("current shortcut " + numValueOf + " " + (pxoVar2 != null ? Integer.valueOf(pxoVar2.d) : null), new Object[0]);
        int length = pairs.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            SportInfoUtil sportInfoUtil = SportInfoUtil.INSTANCE;
            Pair<Integer, Integer> pair = pairs[i2];
            Intrinsics.checkNotNull(pair);
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            int iIntValue = ((Number) first).intValue();
            Pair<Integer, Integer> pair2 = pairs[i2];
            Intrinsics.checkNotNull(pair2);
            Object second = pair2.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            strArr[i2] = sportInfoUtil.getName(iIntValue, ((Number) second).intValue());
            if (this.mCurrentShortcut != null) {
                Pair<Integer, Integer> pair3 = pairs[i2];
                Intrinsics.checkNotNull(pair3);
                Integer num = (Integer) pair3.first;
                pxo pxoVar3 = this.mCurrentShortcut;
                Intrinsics.checkNotNull(pxoVar3);
                int i3 = pxoVar3.c;
                if (num != null && num.intValue() == i3) {
                    Pair<Integer, Integer> pair4 = pairs[i2];
                    Intrinsics.checkNotNull(pair4);
                    if (pair4.second != null) {
                        Pair<Integer, Integer> pair5 = pairs[i2];
                        Intrinsics.checkNotNull(pair5);
                        Integer num2 = (Integer) pair5.second;
                        pxo pxoVar4 = this.mCurrentShortcut;
                        Intrinsics.checkNotNull(pxoVar4);
                        int i4 = pxoVar4.d;
                        if (num2 != null && num2.intValue() == i4) {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                }
            }
        }
        new CommonDialog.c("shortcut selector").setDialogTitle(wzi.r3).setItems(strArr).setItemsCheckedIndex(i).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutFragment.showSelector.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                BleShortcutFragment.this.change(pairs[which]);
            }
        }).showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.q2;
    }

    public final int getShortcutSubType() {
        return this.shortcutSubType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        ((BleShortcutViewModel) getMViewModel()).loadData(new Function2() { // from class: ot2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BleShortcutFragment.loadData$lambda$5(this.f29662a, ((Integer) obj).intValue(), (pxo) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.r3);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            String deviceIconUrl = DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 3);
            int i = DeviceModelExtKt.isBandType(wearableDeviceModel) ? jni.g1 : jni.h1;
            ImageView watchIcon = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(watchIcon, "watchIcon");
            ImageLoader imageLoader = Coil.imageLoader(watchIcon.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(watchIcon.getContext()).data(deviceIconUrl).target(watchIcon);
            builderTarget.placeholder(i);
            imageLoader.enqueue(builderTarget.build());
        }
        ((BleShortcutViewModel) getMViewModel()).getSupportShortcutList().observe(getViewLifecycleOwner(), new BleShortcutFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kt2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleShortcutFragment.onViewCreated$lambda$1(this.f24271a, (BleShortcutViewModel.SupportShortcutList) obj);
            }
        }));
        ((BleShortcutViewModel) getMViewModel()).getSetResult().observe(getViewLifecycleOwner(), new BleShortcutFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lt2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleShortcutFragment.onViewCreated$lambda$2(this.f25410a, (BleShortcutViewModel.SetResult) obj);
            }
        }));
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: mt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BleShortcutFragment.onViewCreated$lambda$3(this.f27172a, view2);
            }
        });
    }

    public final void setShortcutSubType(int i) {
        this.shortcutSubType = i;
    }
}
