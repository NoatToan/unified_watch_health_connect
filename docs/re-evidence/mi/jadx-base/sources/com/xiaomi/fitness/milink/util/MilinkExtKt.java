package com.xiaomi.fitness.milink.util;

import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.milink.bean.ExtraAudioData;
import com.xiaomi.fitness.milink.bean.ExtraHeadsetData;
import com.xiaomi.fitness.milink.circulate.BaseDeviceController;
import defpackage.hdd;
import defpackage.idd;
import defpackage.l0j;
import defpackage.med;
import defpackage.qdd;
import defpackage.s7r;
import defpackage.sed;
import defpackage.tdd;
import defpackage.ted;
import defpackage.udd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "deviceId", "", "code", "", "buildControlResult", "(Ljava/lang/String;I)V", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "deviceInfo", "getTypeByDevice", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)I", "playState", "getPlayState", "(I)I", "Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "wrapper", "updateShareDevice", "(Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;)V", "", "wrapperList", "syncShareDevice", "(Ljava/util/List;)V", "Lmed;", "buildShareDevice", "(Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;)Lmed;", "mode", "getVoiceMode", "(Ljava/lang/Integer;)I", "TAG", "Ljava/lang/String;", "milink_release"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMilinkExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MilinkExt.kt\ncom/xiaomi/fitness/milink/util/MilinkExtKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,183:1\n37#2:184\n36#2,3:185\n*S KotlinDebug\n*F\n+ 1 MilinkExt.kt\ncom/xiaomi/fitness/milink/util/MilinkExtKt\n*L\n92#1:184\n92#1:185,3\n*E\n"})
public final class MilinkExtKt {

    @NotNull
    private static final String TAG = "MilinkHelper+Ext";

    public static final void buildControlResult(@NotNull String deviceId, int i) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Logger.i(TAG, "control " + deviceId + " result: " + i);
        udd uddVar = new udd();
        qdd qddVar = new qdd();
        qddVar.c = deviceId;
        qddVar.d = i;
        uddVar.v(qddVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 23;
        s7rVar.f = 8;
        try {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:48:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00b1, please report this as an issue */
    @NotNull
    public static final med buildShareDevice(@NotNull BaseDeviceController wrapper) {
        String string;
        idd iddVar;
        String strA;
        String strC;
        long j;
        int iD;
        int position;
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        CirculateDeviceInfo deviceInfo = wrapper.getDeviceInfo();
        Logger.i(TAG, "buildShareDevice: " + deviceInfo.c + " hash: " + System.identityHashCode(wrapper));
        MediaMetaData mediaMetaData = wrapper.getMediaMetaData();
        ExtraAudioData extraAudioData = wrapper.getExtraAudioData();
        ExtraHeadsetData extraHeadsetData = wrapper.getExtraHeadsetData();
        int typeByDevice = getTypeByDevice(deviceInfo);
        med medVar = new med();
        medVar.e = typeByDevice;
        medVar.f = deviceInfo.f10301a;
        if (typeByDevice == 1) {
            string = ResourceExtKt.getString(l0j.f24483a);
        } else {
            string = deviceInfo.c;
            if (string == null) {
                string = "";
            }
        }
        medVar.g = string;
        if (typeByDevice == 1) {
            iddVar = new idd();
            iddVar.e = wrapper.getOutputId();
            Logger.i(TAG, "buildAudioDevice: " + deviceInfo.f10301a + " outputId: " + wrapper.getOutputId());
            iddVar.c = getPlayState(wrapper.getPlayState());
            if (mediaMetaData != null && extraAudioData != null) {
                Logger.i(TAG, "buildShareDevice " + deviceInfo.f10301a + ", mediaMetaData: " + mediaMetaData.e() + " mediaExtraData: " + extraAudioData);
                hdd hddVar = new hdd();
                strA = mediaMetaData.a();
                if (strA == null) {
                    strA = "";
                }
                hddVar.h = strA;
                strC = mediaMetaData.c();
                if (strC == null) {
                    strC = "";
                }
                hddVar.g = strC;
                String strE = mediaMetaData.e();
                hddVar.c = strE != null ? strE : "";
                j = 1000;
                if (((int) (mediaMetaData.d() / j)) < 0) {
                    iD = 0;
                } else {
                    iD = (int) (mediaMetaData.d() / j);
                }
                hddVar.e = iD;
                if (((int) (extraAudioData.getPosition() / j)) < 0) {
                    position = 0;
                } else {
                    position = (int) (extraAudioData.getPosition() / j);
                }
                hddVar.d = position;
                hddVar.f = extraAudioData.getVolume() >= 0 ? extraAudioData.getVolume() : 0;
                iddVar.d = hddVar;
            }
            medVar.q(iddVar);
        } else if (typeByDevice == 3) {
            ted tedVar = new ted();
            tedVar.c = getPlayState(wrapper.getPlayState());
            if (mediaMetaData != null) {
                sed sedVar = new sed();
                String strE2 = mediaMetaData.e();
                sedVar.c = strE2 != null ? strE2 : "";
                tedVar.d = sedVar;
            }
            medVar.s(tedVar);
        } else if (typeByDevice == 5 || typeByDevice == 6) {
            iddVar = new idd();
            iddVar.e = wrapper.getOutputId();
            Logger.i(TAG, "buildAudioDevice: " + deviceInfo.f10301a + " outputId: " + wrapper.getOutputId());
            iddVar.c = getPlayState(wrapper.getPlayState());
            if (mediaMetaData != null) {
                Logger.i(TAG, "buildShareDevice " + deviceInfo.f10301a + ", mediaMetaData: " + mediaMetaData.e() + " mediaExtraData: " + extraAudioData);
                hdd hddVar2 = new hdd();
                strA = mediaMetaData.a();
                if (strA == null) {
                    strA = "";
                }
                hddVar2.h = strA;
                strC = mediaMetaData.c();
                if (strC == null) {
                    strC = "";
                }
                hddVar2.g = strC;
                String strE3 = mediaMetaData.e();
                hddVar2.c = strE3 != null ? strE3 : "";
                j = 1000;
                if (((int) (mediaMetaData.d() / j)) < 0) {
                    iD = 0;
                } else {
                    iD = (int) (mediaMetaData.d() / j);
                }
                hddVar2.e = iD;
                if (((int) (extraAudioData.getPosition() / j)) < 0) {
                    position = 0;
                } else {
                    position = (int) (extraAudioData.getPosition() / j);
                }
                hddVar2.d = position;
                hddVar2.f = extraAudioData.getVolume() >= 0 ? extraAudioData.getVolume() : 0;
                iddVar.d = hddVar2;
            }
            medVar.q(iddVar);
        } else if (typeByDevice == 7) {
            tdd tddVar = new tdd();
            tddVar.c = getVoiceMode(extraHeadsetData != null ? Integer.valueOf(extraHeadsetData.getVoiceMode()) : null);
            tddVar.d = 0;
            medVar.r(tddVar);
        }
        return medVar;
    }

    private static final int getPlayState(int i) {
        if (i != 0) {
            return i != 2 ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int getTypeByDevice(CirculateDeviceInfo circulateDeviceInfo) {
        Logger.i(TAG, "getTypeByDevice: " + circulateDeviceInfo.d);
        String str = circulateDeviceInfo.d;
        if (str != null) {
            switch (str.hashCode()) {
                case -1834993054:
                    if (str.equals("Headset")) {
                        return 7;
                    }
                    break;
                case -1578527804:
                    if (str.equals(Constant.DeviceType.ANDROID_PAD)) {
                        return 2;
                    }
                    break;
                case -1280820637:
                    if (str.equals(Constant.DeviceType.WINDOWS_PC)) {
                        return 4;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        return 3;
                    }
                    break;
                case 80074991:
                    if (str.equals("Sound")) {
                        return 5;
                    }
                    break;
                case 1613571043:
                    if (str.equals(Constant.DeviceType.SCREEN_SOUND)) {
                        return 6;
                    }
                    break;
            }
        }
        return 1;
    }

    private static final int getVoiceMode(Integer num) {
        if (num != null && num.intValue() == 0) {
            return 1;
        }
        if (num != null && num.intValue() == 1) {
            return 2;
        }
        return (num != null && num.intValue() == 2) ? 3 : 0;
    }

    public static final void syncShareDevice(@NotNull final List<BaseDeviceController> wrapperList) {
        Intrinsics.checkNotNullParameter(wrapperList, "wrapperList");
        udd uddVar = new udd();
        ArrayList arrayList = new ArrayList();
        med.a aVar = new med.a();
        Iterator<BaseDeviceController> it = wrapperList.iterator();
        while (it.hasNext()) {
            arrayList.add(buildShareDevice(it.next()));
        }
        aVar.c = (med[]) arrayList.toArray(new med[0]);
        uddVar.D(aVar);
        s7r s7rVar = new s7r();
        s7rVar.U(uddVar);
        s7rVar.e = 23;
        s7rVar.f = 3;
        Logger.d(TAG, "syncShareDevice: " + s7rVar);
        try {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.milink.util.MilinkExtKt.syncShareDevice.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(MilinkExtKt.TAG, "syncShareDevice: " + wrapperList.size() + " fail: " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(MilinkExtKt.TAG, "syncShareDevice: " + wrapperList.size() + " success");
                }
            }, 0, 8, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void updateShareDevice(@NotNull final BaseDeviceController wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        final CirculateDeviceInfo deviceInfo = wrapper.getDeviceInfo();
        med medVarBuildShareDevice = buildShareDevice(wrapper);
        udd uddVar = new udd();
        uddVar.C(medVarBuildShareDevice);
        s7r s7rVar = new s7r();
        s7rVar.U(uddVar);
        s7rVar.e = 23;
        s7rVar.f = 4;
        Logger.d(TAG, "updateShareDevice: " + s7rVar);
        try {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.milink.util.MilinkExtKt.updateShareDevice.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(MilinkExtKt.TAG, "updateShareDevice: " + deviceInfo.c + " fail: " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(MilinkExtKt.TAG, "updateShareDevice success: " + System.identityHashCode(wrapper));
                }
            }, 0, 8, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
