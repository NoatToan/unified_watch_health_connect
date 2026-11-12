package com.xiaomi.fitness.aivs.bluetooth;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import defpackage.m01;
import defpackage.p01;
import defpackage.s7r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSender;", "", "", "did", "Lp01$a;", "aivsInstructionList", "", "sendAivsInstructions", "(Ljava/lang/String;Lp01$a;)V", "<init>", "()V", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBluetoothSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothSender.kt\ncom/xiaomi/fitness/aivs/bluetooth/BluetoothSender\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,26:1\n11158#2:27\n11493#2,3:28\n*S KotlinDebug\n*F\n+ 1 BluetoothSender.kt\ncom/xiaomi/fitness/aivs/bluetooth/BluetoothSender\n*L\n21#1:27\n21#1:28,3\n*E\n"})
public final class BluetoothSender {
    public final void sendAivsInstructions(@NotNull String did, @NotNull p01.a aivsInstructionList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(aivsInstructionList, "aivsInstructionList");
        s7r s7rVar = new s7r();
        s7rVar.e = 14;
        s7rVar.f = 0;
        m01 m01Var = new m01();
        m01Var.q(aivsInstructionList);
        s7rVar.N(m01Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
        p01[] list = aivsInstructionList.c;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ArrayList arrayList = new ArrayList(list.length);
        for (p01 p01Var : list) {
            Logger.i("sendAivsInstructions " + p01Var.c, new Object[0]);
            arrayList.add(Unit.INSTANCE);
        }
    }
}
