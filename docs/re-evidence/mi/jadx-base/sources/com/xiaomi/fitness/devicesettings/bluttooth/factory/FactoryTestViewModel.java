package com.xiaomi.fitness.devicesettings.bluttooth.factory;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.s7r;
import defpackage.x69;
import defpackage.xc6;
import defpackage.z69;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/factory/FactoryTestViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "nfcConfig", "fileName", "", "callback", "Lkotlin/Function1;", "", "getNfcConfig", "", "getFromFile", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFactoryTestViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FactoryTestViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/factory/FactoryTestViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class FactoryTestViewModel extends AbsViewModel {
    private final String getFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            ToastUtil.showToast("Please place nfc-config.json in /sdcard");
            return null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String str = "";
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            CloseableKt.closeFinally(bufferedReader, null);
                            CloseableKt.closeFinally(inputStreamReader, null);
                            return str;
                        }
                        str = str + ((Object) line);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(bufferedReader, th);
                            throw th2;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(inputStreamReader, th);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Map<String, String> getNfcConfig(String fileName) {
        String strReplace$default;
        String fromFile = getFromFile(fileName);
        if (TextUtils.isEmpty(fromFile)) {
            return null;
        }
        if (fromFile != null && (strReplace$default = StringsKt__StringsJVMKt.replace$default(fromFile, "\n", "", false, 4, (Object) null)) != null) {
            StringsKt__StringsJVMKt.replace$default(strReplace$default, "\r", "", false, 4, (Object) null);
        }
        try {
            return (Map) new Gson().fromJson(fromFile, (Type) Map.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void nfcConfig(@NotNull String fileName, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 13;
        s7rVar.f = 1;
        x69 x69Var = new x69();
        Map<String, String> nfcConfig = getNfcConfig(fileName);
        if (nfcConfig == null || nfcConfig.isEmpty()) {
            return;
        }
        z69.a aVar = new z69.a();
        aVar.c = new z69[nfcConfig.size()];
        int i = 0;
        for (String str : nfcConfig.keySet()) {
            String str2 = nfcConfig.get(str);
            Intrinsics.checkNotNull(str2);
            String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str2, ",", "", false, 4, (Object) null), " ", "", false, 4, (Object) null), "0x", "", false, 4, (Object) null);
            xc6.a(str + ":" + strReplace$default);
            z69 z69Var = new z69();
            z69Var.c = str;
            z69Var.d = ByteUtil.stringToBytes(strReplace$default);
            aVar.c[i] = z69Var;
            i++;
        }
        x69Var.t(aVar);
        s7rVar.R(x69Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestViewModel.nfcConfig.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                AnyExtKt.main$default(null, new FactoryTestViewModel$nfcConfig$1$onError$1(callback, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                AnyExtKt.main$default(null, new FactoryTestViewModel$nfcConfig$1$onSuccess$1(result, callback, null), 1, null);
            }
        }, 0, 8, null);
    }
}
