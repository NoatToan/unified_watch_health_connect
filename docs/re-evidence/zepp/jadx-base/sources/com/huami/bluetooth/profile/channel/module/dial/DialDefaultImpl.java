package com.huami.bluetooth.profile.channel.module.dial;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.huami.bluetooth.profile.ecf.EcfCommand;
import com.huami.bluetooth.profile.ecf.TwoWayCmd;
import com.huami.bluetooth.profile.ecf.data.DialReplacement;
import com.huami.bluetooth.profile.ecf.data.DialsInfo;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0011\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/dial/DialDefaultImpl;", "Lcom/huami/bluetooth/profile/channel/module/dial/DialApi;", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", AbstractJSONTokenResponse.RESPONSE, "", "a", "(Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;)Ljava/lang/Integer;", "dialId", "", "setDialId", "getDialId", "()Ljava/lang/Integer;", "srcId", "dest", "", "size", "replaceDial", "", "dialIds", "deleteDial", "imageSize", "getStorageState", "getAllWatchFaceIds", "colorId", "setDialDefaultColor", "Lcom/huami/bluetooth/profile/channel/module/settings/EcfCmdProvider;", "Lcom/huami/bluetooth/profile/channel/module/settings/EcfCmdProvider;", "ecfCmdProvider", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/EcfCmdProvider;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DialDefaultImpl implements DialApi {

    @NotNull
    public static final String TAG = "DialDefaultImpl";
    private static final byte b = -2;
    private static final int c = 0;
    private static final int d = 3;
    private static final int e = 63;
    private static final int f = 36;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EcfCmdProvider ecfCmdProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setDialDefaultColor not support";
        }
    }

    public DialDefaultImpl(@NotNull EcfCmdProvider ecfCmdProvider) {
        this.ecfCmdProvider = ecfCmdProvider;
    }

    private final Integer a(HMNotifyResponse response) {
        Debug.fi(TAG, Intrinsics.stringPlus("skinId response: ", response));
        if (response != null && response.isSuccess() && response.getData() != null) {
            byte[] data = response.getData();
            if (data.length == 4) {
                return Integer.valueOf(ByteUtilsKt.toInt(data, 4, 0));
            }
            if (data.length == 5) {
                return Integer.valueOf(ByteUtilsKt.toInt(data, 4, 1));
            }
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean deleteDial(@NotNull List<Integer> dialIds) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(63);
            byteArrayOutputStream.write(new DialsInfo(dialIds).getBytes());
        } catch (IOException e2) {
            e2.printStackTrace();
            Debug.fi(TAG, Intrinsics.stringPlus("deleteDial:Exception:", e2));
        }
        return this.ecfCmdProvider.patchWriteEcf(byteArrayOutputStream.toByteArray(), 2);
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    @NotNull
    public List<Integer> getAllWatchFaceIds() {
        ArrayList arrayList = new ArrayList();
        HMGenericResponse hMGenericResponseSendGenericCommand = this.ecfCmdProvider.sendGenericCommand(new HMGenericCommand(3));
        byte[] bArrCommandResponseData = (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) ? null : hMGenericResponseSendGenericCommand.commandResponseData();
        Debug.fi(TAG, Intrinsics.stringPlus("getAllWatchFaceIds:ResponseData:", BytesUtil.log(bArrCommandResponseData)));
        int length = bArrCommandResponseData == null ? 0 : bArrCommandResponseData.length;
        if (length <= 1) {
            return arrayList;
        }
        int i = length - 1;
        byte[] bArr = new byte[i];
        System.arraycopy(bArrCommandResponseData, 1, bArr, 0, i);
        int i2 = i / 4;
        if (i2 > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i3++;
                int i5 = i4 + 4;
                if (i5 > i) {
                    break;
                }
                arrayList.add(Integer.valueOf(ByteUtilsKt.toInt$default(bArr, 0, i4, 1, null)));
                if (i3 >= i2) {
                    break;
                }
                i4 = i5;
            }
        }
        return arrayList;
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    @Nullable
    public Integer getDialId() {
        EcfCommand.TwoWay twoWay = new EcfCommand.TwoWay(TwoWayCmd.Dial.INSTANCE, true);
        Debug.fi(TAG, "get dial id by ecf commond");
        return a(this.ecfCmdProvider.sendECFCommand(twoWay.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), twoWay.getLength()));
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean getStorageState(int dialId, long imageSize) {
        StringBuilder sb = new StringBuilder();
        sb.append("getStorageState:");
        sb.append(dialId);
        sb.append(",imageSize:");
        sb.append(imageSize);
        sb.append(',');
        int i = (int) imageSize;
        sb.append(i);
        Debug.fi(TAG, sb.toString());
        byte[] bArr = new byte[10];
        bArr[0] = 57;
        bArr[1] = 0;
        System.arraycopy(GattUtils.intToBytes(i), 0, bArr, 2, 4);
        System.arraycopy(GattUtils.intToBytes(dialId), 0, bArr, 6, 4);
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.ecfCmdProvider.sendECFCommand(bArr);
        if (hMNotifyResponseSendECFCommand != null) {
            Debug.fi(TAG, hMNotifyResponseSendECFCommand.toString());
        }
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 57);
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public int replaceDial(int srcId, int dest, long size) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DialReplacement dialReplacement = new DialReplacement(srcId, dest, (int) size);
            Debug.fi(TAG, Intrinsics.stringPlus("replaceDial:", dialReplacement));
            byteArrayOutputStream.write(6);
            byteArrayOutputStream.write(36);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(dialReplacement.getBytes());
        } catch (IOException e2) {
            e2.printStackTrace();
            Debug.fi(TAG, Intrinsics.stringPlus("replaceDial:Exception:", e2));
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.ecfCmdProvider.sendECFCommand(byteArrayOutputStream.toByteArray(), 3);
        Debug.fi(TAG, Intrinsics.stringPlus("replaceDial response:", hMNotifyResponseSendECFCommand));
        if (hMNotifyResponseSendECFCommand == null) {
            return -1;
        }
        return hMNotifyResponseSendECFCommand.getCode();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean setDialDefaultColor(int colorId) {
        HMLog.info(TAG, a.a);
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean setDialId(int dialId) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = this.ecfCmdProvider.sendECFCommand(new byte[]{-2, 0, 0, (byte) (dialId & 255), (byte) ((dialId >> 8) & 255), (byte) ((dialId >> 16) & 255), (byte) ((dialId >> 24) & 255)}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess();
    }
}
