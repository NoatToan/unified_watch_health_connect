package com.xiaomi.fitness.devicesettings.common.contact;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\"\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0013J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "getContactListFromDevice", "", "success", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "", "fail", "Lkotlin/Function0;", "syncContact", "dataList", "", "addContact", "contactBean", "result", "Lkotlin/Function1;", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTopContactViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopContactViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/contact/TopContactViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1872#2,3:116\n*S KotlinDebug\n*F\n+ 1 TopContactViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/contact/TopContactViewModel\n*L\n72#1:116,3\n*E\n"})
public final class TopContactViewModel extends AbsViewModel {

    @NotNull
    public static final String sTag = "TopContactViewModel";

    public final void addContact(@NotNull ContactBean contactBean, @NotNull final Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(contactBean, "contactBean");
        Intrinsics.checkNotNullParameter(result, "result");
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 5;
        dg4 dg4Var = new dg4();
        eg4.a aVar = new eg4.a();
        eg4 eg4Var = new eg4();
        eg4Var.c = contactBean.getName();
        eg4Var.d = contactBean.getPhone();
        aVar.c = new eg4[]{eg4Var};
        dg4Var.u(aVar);
        s7rVar.Q(dg4Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.contact.TopContactViewModel.addContact.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.d(TopContactViewModel.sTag, "addContact onError: " + code);
                result.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result2) {
                Logger.d(TopContactViewModel.sTag, "addContact success");
                result.invoke2(Boolean.TRUE);
            }
        }, 0, 8, null);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getContactListFromDevice(@NotNull final Function2<? super List<ContactBean>, ? super Integer, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 4;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.contact.TopContactViewModel.getContactListFromDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(TopContactViewModel.sTag, "getContactListFromDevice onError");
                AnyExtKt.main$default(null, new TopContactViewModel$getContactListFromDevice$1$onError$1(fail, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                dg4 dg4VarR;
                Logger.i(TopContactViewModel.sTag, "getContactListFromDevice success");
                if (result == null || !result.isSuccess()) {
                    AnyExtKt.main$default(null, new TopContactViewModel$getContactListFromDevice$1$onSuccess$3(fail, null), 1, null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                s7r packet = result.getPacket();
                eg4.a aVarO = (packet == null || (dg4VarR = packet.r()) == null) ? null : dg4VarR.o();
                eg4[] eg4VarArr = aVarO != null ? aVarO.c : null;
                if (eg4VarArr != null) {
                    for (eg4 eg4Var : eg4VarArr) {
                        String name = eg4Var.c;
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        String number = eg4Var.d;
                        Intrinsics.checkNotNullExpressionValue(number, "number");
                        arrayList.add(new ContactBean(name, number));
                    }
                }
                AnyExtKt.main$default(null, new TopContactViewModel$getContactListFromDevice$1$onSuccess$2(success, arrayList, aVarO, null), 1, null);
            }
        }, 0, 8, null);
    }

    public final void syncContact(@NotNull List<ContactBean> dataList, @NotNull Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(success, "success");
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 7;
        dg4 dg4Var = new dg4();
        eg4.a aVar = new eg4.a();
        int size = dataList.size();
        eg4[] eg4VarArr = new eg4[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            eg4VarArr[i2] = new eg4();
        }
        aVar.c = eg4VarArr;
        for (Object obj : dataList) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ContactBean contactBean = (ContactBean) obj;
            eg4 eg4Var = aVar.c[i];
            eg4Var.c = contactBean.getName();
            eg4Var.d = contactBean.getPhone();
            i = i3;
        }
        dg4Var.u(aVar);
        s7rVar.Q(dg4Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
        success.invoke();
    }
}
