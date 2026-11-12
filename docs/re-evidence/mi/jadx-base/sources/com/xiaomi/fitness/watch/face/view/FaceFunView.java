package com.xiaomi.fitness.watch.face.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBleFragment;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.view.FaceFunView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModelKt;
import com.xiaomi.onetrack.api.b;
import defpackage.av6;
import defpackage.b6r;
import defpackage.fhi;
import defpackage.isi;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.s7r;
import defpackage.v5r;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010#\u001a\u00020$H\u0014J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J7\u0010-\u001a\u00020$2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00101\u001a\u0002022\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u00103J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\bH\u0002R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082.¢\u0006\u0004\n\u0002\u0010\u001dR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b \u0010!¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/FaceFunView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/watch/face/view/FunInfo;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "liveData$delegate", "Lkotlin/Lazy;", "mInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getMInflater", "()Landroid/view/LayoutInflater;", "mInflater$delegate", b.E, "Lcom/xiaomi/fitness/watch/face/FaceInfoBleFragment;", "configList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device$delegate", "onFinishInflate", "", "getMergeIds", "", "funPos", "supportIds", "onClick", "v", "Landroid/view/View;", "getDataList", "setData", "selected", "Ljava/util/ArrayList;", "defaults", "showDivider", "", "(Ljava/util/ArrayList;[Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;ZLcom/xiaomi/fitness/watch/face/FaceInfoBleFragment;)V", "constrainName", "", "id", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceFunView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceFunView.kt\ncom/xiaomi/fitness/watch/face/view/FaceFunView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,178:1\n13402#2,2:179\n*S KotlinDebug\n*F\n+ 1 FaceFunView.kt\ncom/xiaomi/fitness/watch/face/view/FaceFunView\n*L\n61#1:179,2\n*E\n"})
public final class FaceFunView extends LinearLayout implements View.OnClickListener {
    private FaceData.Functions[] configList;

    /* JADX INFO: renamed from: device$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy device;
    private FaceInfoBleFragment host;

    /* JADX INFO: renamed from: liveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy liveData;

    /* JADX INFO: renamed from: mInflater$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mInflater;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceFunView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String constrainName(int id) {
        String[] stringArray = AppUtil.getApp().getResources().getStringArray(fhi.f17787a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return id >= stringArray.length ? stringArray[0] : stringArray[id];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel device_delegate$lambda$2() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final void getDataList(final View v) {
        if (getDevice() == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
            return;
        }
        FaceInfoBleFragment faceInfoBleFragment = this.host;
        if (faceInfoBleFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException(b.E);
            faceInfoBleFragment = null;
        }
        faceInfoBleFragment.showLoading();
        final String dataId = FaceManager.INSTANCE.getDataId();
        Logger.d(FaceBleInfoViewModelKt.TAG, "getDataList: id = " + dataId);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 10;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.view.FaceFunView.getDataList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FaceBleInfoViewModelKt.TAG, "getDataList FunView error = " + code + "; id = " + dataId);
                if (code == 1) {
                    FaceManager.INSTANCE.setData(dataId, new int[]{0});
                    this.onClick(v);
                } else {
                    Context context2 = this.getContext();
                    if (context2 != null) {
                        ToastExtKt.toastShort(context2, p1j.common_hint_unkonwn_error);
                    }
                }
                FaceInfoBleFragment faceInfoBleFragment2 = this.host;
                if (faceInfoBleFragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(b.E);
                    faceInfoBleFragment2 = null;
                }
                faceInfoBleFragment2.hideLoading();
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                v5r v5rVarG;
                b6r b6rVarW;
                if (result == null || !FaceExtKt.isSuccess(result)) {
                    return;
                }
                s7r packet = result.getPacket();
                FaceInfoBleFragment faceInfoBleFragment2 = null;
                int[] iArr = (packet == null || (v5rVarG = packet.G()) == null || (b6rVarW = v5rVarG.w()) == null) ? null : b6rVarW.c;
                Logger.i(FaceBleInfoViewModelKt.TAG, "getDataList FunView success ret = " + Arrays.toString(iArr) + "; id = " + dataId);
                FaceManager.INSTANCE.setData(dataId, iArr);
                FaceInfoBleFragment faceInfoBleFragment3 = this.host;
                if (faceInfoBleFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(b.E);
                } else {
                    faceInfoBleFragment2 = faceInfoBleFragment3;
                }
                faceInfoBleFragment2.hideLoading();
                this.onClick(v);
            }
        }, 0, 8, null);
    }

    private final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) this.device.getValue();
    }

    private final LayoutInflater getMInflater() {
        return (LayoutInflater) this.mInflater.getValue();
    }

    private final int[] getMergeIds(int funPos, int[] supportIds) {
        Logger.d("FaceFunView", "getMergeIds: funPos = " + funPos);
        FaceData.Functions[] functionsArr = this.configList;
        FaceData.Functions[] functionsArr2 = null;
        if (functionsArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configList");
            functionsArr = null;
        }
        FaceData.IdList[] id_list = functionsArr[funPos].getId_list();
        if (id_list == null || id_list.length == 0) {
            return supportIds;
        }
        FaceData.Functions[] functionsArr3 = this.configList;
        if (functionsArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configList");
        } else {
            functionsArr2 = functionsArr3;
        }
        FaceData.IdList[] id_list2 = functionsArr2[funPos].getId_list();
        ArrayList arrayList = new ArrayList();
        if (id_list2 != null) {
            for (FaceData.IdList idList : id_list2) {
                if (ArraysKt___ArraysKt.contains(supportIds, idList.getId())) {
                    arrayList.add(Integer.valueOf(idList.getId()));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData liveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutInflater mInflater_delegate$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return LayoutInflater.from(context);
    }

    @NotNull
    public final MutableLiveData<FunInfo> getLiveData() {
        return (MutableLiveData) this.liveData.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull final View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int[] dataList = FaceManager.INSTANCE.getDataList();
        if (dataList == null) {
            getDataList(v);
            return;
        }
        if (dataList.length == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ToastExtKt.toastShort(context, p1j.common_not_support);
            return;
        }
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        final int[] mergeIds = getMergeIds(((Integer) tag).intValue(), dataList);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 : mergeIds) {
            arrayList.add(constrainName(i2));
        }
        final TextView textView = (TextView) v.findViewById(isi.V0);
        final TextView textView2 = (TextView) v.findViewById(isi.u0);
        final String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        int length = mergeIds.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = mergeIds[i3];
            Object tag2 = textView.getTag();
            if ((tag2 instanceof Integer) && i4 == ((Number) tag2).intValue()) {
                i = i3;
                break;
            }
        }
        try {
            CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("face_fun").setItems(strArr).setItemsCheckedIndex(i).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.view.FaceFunView.onClick.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    dialog.dismiss();
                    int i5 = mergeIds[which];
                    Object tag3 = v.getTag();
                    Intrinsics.checkNotNull(tag3, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) tag3).intValue();
                    this.getLiveData().setValue(new FunInfo(iIntValue, i5));
                    textView2.setText(strArr[which]);
                    textView.setTag(Integer.valueOf(i5));
                    Logger.d("FaceFunView", "onClick: funId = " + i5 + "; which = " + which + "; funPos = " + iIntValue);
                }
            });
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            commonDialogAddDialogCallback.showIfNeed(((FragmentActivity) currentActivity).getSupportFragmentManager());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        addView(FaceColorPickViewKt.getLabelView(context, p1j.y));
    }

    public final void setData(@NotNull ArrayList<Integer> selected, @NotNull FaceData.Functions[] defaults, boolean showDivider, @NotNull FaceInfoBleFragment host) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.configList = defaults;
        int length = defaults.length;
        int i = 0;
        while (i < length) {
            View viewInflate = getMInflater().inflate(ovi.M, (ViewGroup) this, false);
            TextView textView = (TextView) viewInflate.findViewById(isi.V0);
            TextView textView2 = (TextView) viewInflate.findViewById(isi.u0);
            int i2 = i + 1;
            textView.setText(getContext().getString(p1j.b0, Integer.valueOf(i2)));
            Integer numValueOf = i < selected.size() ? selected.get(i) : Integer.valueOf(defaults[i].getId());
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = numValueOf.intValue();
            textView2.setText(constrainName(iIntValue));
            addView(viewInflate);
            viewInflate.setTag(Integer.valueOf(i));
            textView.setTag(Integer.valueOf(iIntValue));
            viewInflate.setOnClickListener(this);
            i = i2;
        }
        if (showDivider) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            addView(FaceColorPickViewKt.getDivider(context));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceFunView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceFunView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.liveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tx8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceFunView.liveData_delegate$lambda$0();
            }
        });
        this.mInflater = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ux8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceFunView.mInflater_delegate$lambda$1(context);
            }
        });
        this.device = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vx8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceFunView.device_delegate$lambda$2();
            }
        });
    }

    public /* synthetic */ FaceFunView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
