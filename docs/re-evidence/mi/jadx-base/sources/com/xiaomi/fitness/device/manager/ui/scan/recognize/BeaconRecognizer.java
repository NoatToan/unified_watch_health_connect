package com.xiaomi.fitness.device.manager.ui.scan.recognize;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.export.scan.beacon.Beacon;
import com.xiaomi.fitness.device.manager.export.scan.beacon.BeaconItem;
import com.xiaomi.fitness.device.manager.export.scan.beacon.PacketReader;
import com.xiaomi.fitness.device.manager.ui.scan.recognize.BeaconRecognizer;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import defpackage.ydl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/BeaconRecognizer;", "Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;", "mProductIdList", "", "", "checkRegistered", "", "<init>", "(Ljava/util/List;Z)V", "getCheckRegistered", "()Z", "tempRssi", "recognize", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "scanResult", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "isAvailable", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BeaconRecognizer implements Recognizer {
    public static final int ADV_TYPE_SERVICE_DATA = 22;
    public static final int MI_WEAR_SERVICE = 65173;

    @NotNull
    private static final String TAG = "BeaconRecognizer";
    private final boolean checkRegistered;

    @Nullable
    private final List<Integer> mProductIdList;
    private int tempRssi;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int productID = -1;

    public BeaconRecognizer(@Nullable List<Integer> list, boolean z) {
        this.mProductIdList = list;
        this.checkRegistered = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean recognize$lambda$0(AdvPacket packet, WearableProduct it) {
        Intrinsics.checkNotNullParameter(packet, "$packet");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == packet.getProductId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean recognize$lambda$1(AdvPacket packet, EcoProduct it) {
        Intrinsics.checkNotNullParameter(packet, "$packet");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == packet.getProductId();
    }

    public final boolean getCheckRegistered() {
        return this.checkRegistered;
    }

    public boolean isAvailable(@NotNull AdvPacket packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        return (this.checkRegistered && packet.isRegistered() && !packet.isBondNew()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.xiaomi.fitness.device.manager.bean.Product, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    @Override // com.xiaomi.fitness.device.manager.ui.scan.recognize.Recognizer
    @Nullable
    public BleDevice recognize(@NotNull ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        ydl ydlVarD = scanResult.d();
        BleDevice bleDevice = null;
        if (ydlVarD != null) {
            Beacon beacon = new Beacon(ydlVarD.c());
            Companion companion = INSTANCE;
            final AdvPacket beacon2 = companion.parseBeacon(beacon);
            if (beacon2 == null) {
                return null;
            }
            boolean zIsAvailable = isAvailable(beacon2);
            ydl ydlVarD2 = scanResult.d();
            Integer numValueOf = ydlVarD2 != null ? Integer.valueOf(ydlVarD2.b()) : null;
            Logger.i(TAG, "recognize() called with: scanResult = " + ydlVarD + ", advertiseFlag = " + numValueOf + ", connectable = " + scanResult.f() + ", packet = " + beacon2 + ", isAvailable " + zIsAvailable);
            if (zIsAvailable) {
                List<Integer> list = this.mProductIdList;
                if (list == null || list.contains(Integer.valueOf(beacon2.getProductId()))) {
                    List<Integer> list2 = this.mProductIdList;
                    Logger.i(TAG, "product list size " + (list2 != null ? Integer.valueOf(list2.size()) : null));
                    Object objFindProduct = DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: bh2
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return Boolean.valueOf(BeaconRecognizer.recognize$lambda$0(beacon2, (WearableProduct) obj));
                        }
                    });
                    ?? deviceProduct = objFindProduct;
                    if (objFindProduct == null) {
                        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: ch2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BeaconRecognizer.recognize$lambda$1(beacon2, (EcoProduct) obj));
                            }
                        });
                        Logger.i(TAG, "recognize tempProduct " + ecoProduct);
                        if (ecoProduct == null) {
                            return null;
                        }
                        deviceProduct = EcoProductExtKt.toDeviceProduct(ecoProduct);
                    }
                    boolean z = (deviceProduct.getStatus() == 0 || deviceProduct.getStatus() == 4 || TextUtils.isEmpty(deviceProduct.getModel())) ? false : true;
                    Logger.i(TAG, "recognize product " + deviceProduct + ", right status " + z);
                    if (z) {
                        String address = scanResult.a().getAddress();
                        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                        bleDevice = new BleDevice(address, beacon2.getMac(), beacon2.getProductId(), deviceProduct.getModel(), beacon2, scanResult.a().getName(), scanResult.c(), false, 128, null);
                        Logger.i(TAG, "recognize device " + bleDevice);
                        if (bleDevice.getName() == null) {
                            try {
                                bleDevice.setName(companion.parseName(ydlVarD.c()));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } else if (this.tempRssi == 0 || scanResult.c() > this.tempRssi) {
                    this.tempRssi = scanResult.c();
                    productID = beacon2.getProductId();
                }
            }
        }
        return bleDevice;
    }

    public /* synthetic */ BeaconRecognizer(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/BeaconRecognizer$Companion;", "", "<init>", "()V", "TAG", "", "productID", "", "getProductID", "()I", "setProductID", "(I)V", "parseBeacon", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "beacon", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/Beacon;", "parseName", "scanRecord", "", "ADV_TYPE_SERVICE_DATA", "MI_WEAR_SERVICE", "parse", "item", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconItem;", "reader", "Lcom/xiaomi/fitness/device/manager/export/scan/beacon/PacketReader;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBeaconRecognizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeaconRecognizer.kt\ncom/xiaomi/fitness/device/manager/ui/scan/recognize/BeaconRecognizer$Companion\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,247:1\n108#2:248\n80#2,22:249\n*S KotlinDebug\n*F\n+ 1 BeaconRecognizer.kt\ncom/xiaomi/fitness/device/manager/ui/scan/recognize/BeaconRecognizer$Companion\n*L\n159#1:248\n159#1:249,22\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AdvPacket parseBeacon(Beacon beacon) {
            AdvPacket advPacket = null;
            try {
                Iterator<BeaconItem> it = beacon.getMItems().iterator();
                while (it.hasNext() && (advPacket = parse(it.next())) == null) {
                }
            } catch (Exception unused) {
            }
            return advPacket;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:43:0x008d A[LOOP:3: B:41:0x0089->B:43:0x008d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:45:0x0098 A[LOOP:4: B:44:0x0096->B:45:0x0098, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:68:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:? A[SYNTHETIC] */
        public final String parseName(byte[] scanRecord) {
            byte b2;
            if (scanRecord == null) {
                return null;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(scanRecord).order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferOrder.remaining() > 2 && (b2 = byteBufferOrder.get()) != 0) {
                byte b3 = byteBufferOrder.get();
                int i = b2 - 1;
                if (b3 == 20) {
                    while (i >= 2) {
                        byteBufferOrder.getShort();
                        i -= 2;
                    }
                } else if (b3 == 21) {
                    while (i >= 16) {
                        byteBufferOrder.getLong();
                        byteBufferOrder.getLong();
                        i -= 16;
                    }
                } else if (b3 != 255) {
                    switch (b3) {
                        case 1:
                            byteBufferOrder.get();
                            break;
                        case 2:
                        case 3:
                            while (i >= 2) {
                                byteBufferOrder.getShort();
                                i -= 2;
                            }
                            break;
                        case 4:
                        case 5:
                            while (i >= 4) {
                                byteBufferOrder.getInt();
                                i -= 4;
                            }
                            break;
                        case 6:
                        case 7:
                            while (i >= 16) {
                                byteBufferOrder.getLong();
                                byteBufferOrder.getLong();
                                i -= 16;
                            }
                            break;
                        case 8:
                        case 9:
                            byte[] bArr = new byte[i];
                            byteBufferOrder.get(bArr, 0, i);
                            String str = new String(bArr, Charsets.UTF_8);
                            int length = str.length() - 1;
                            int i2 = 0;
                            boolean z = false;
                            while (i2 <= length) {
                                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                                if (z) {
                                    if (!z2) {
                                        return str.subSequence(i2, length + 1).toString();
                                    }
                                    length--;
                                } else if (z2) {
                                    i2++;
                                } else {
                                    z = true;
                                }
                            }
                            return str.subSequence(i2, length + 1).toString();
                    }
                } else {
                    byteBufferOrder.getShort();
                    i = b2 - 3;
                }
                if (i > 0) {
                    byteBufferOrder.position(byteBufferOrder.position() + i);
                }
            }
            return null;
        }

        public final int getProductID() {
            return BeaconRecognizer.productID;
        }

        @Nullable
        public final AdvPacket parse(@NotNull BeaconItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getType() != 22) {
                return null;
            }
            PacketReader packetReader = new PacketReader(item);
            if (packetReader.getShort() != 65173) {
                return null;
            }
            try {
                return parse(packetReader);
            } catch (Exception e) {
                Logger.d("beacon parser exception 1: " + e, new Object[0]);
                return null;
            }
        }

        public final void setProductID(int i) {
            BeaconRecognizer.productID = i;
        }

        private final AdvPacket parse(PacketReader reader) {
            AdvPacket advPacket = new AdvPacket(null, 0, 0, null, null, null, null, null, null, null, null, 2047, null);
            AdvPacket.FrameControl frameControl = new AdvPacket.FrameControl(false, false, false, false, false, false, false, false, 0, 0, 1023, null);
            int i = reader.getByte();
            frameControl.setBondNew(reader.getBit(i, 2));
            frameControl.setEncrypted(reader.getBit(i, 3));
            frameControl.setWithMac(reader.getBit(i, 4));
            frameControl.setWithCapability(reader.getBit(i, 5));
            frameControl.setWithEvent(reader.getBit(i, 6));
            frameControl.setWithMesh(reader.getBit(i, 7));
            int i2 = reader.getByte();
            frameControl.setRegistered(reader.getBit(i2, 0));
            frameControl.setBindingCfm(reader.getBit(i2, 1));
            frameControl.setAuthMode(reader.getInt(i2, 2, 3));
            frameControl.setVersion(reader.getInt(i2, 4, 7));
            advPacket.setProductId(reader.getShort());
            advPacket.setFrameCounter(reader.getByte());
            if (frameControl.getWithMac()) {
                advPacket.setMac(reader.getMac());
            }
            if (frameControl.getWithCapability()) {
                int i3 = reader.getByte();
                AdvPacket.Capability capability = new AdvPacket.Capability(false, false, false, 0, false, 31, null);
                capability.setConnectable(reader.getBit(i3, 0));
                capability.setCentralable(reader.getBit(i3, 1));
                capability.setEncryptable(reader.getBit(i3, 2));
                capability.setBindable(reader.getInt(i3, 3, 4));
                capability.setIoCapabilityable(reader.getBit(i3, 5));
                advPacket.setCapability(capability);
            }
            if (advPacket.isComboPacket()) {
                advPacket.setComboKey(reader.getShortString());
            }
            if (frameControl.getWithCapability()) {
                AdvPacket.Capability capability2 = advPacket.getCapability();
                Intrinsics.checkNotNull(capability2);
                if (capability2.getIoCapabilityable()) {
                    int i4 = reader.getByte();
                    AdvPacket.IoCapability ioCapability = new AdvPacket.IoCapability(0, 0, 3, null);
                    ioCapability.setInputCapability(reader.getInt(i4, 0, 3));
                    ioCapability.setOutputCapability(reader.getInt(i4, 4, 7));
                    advPacket.setIoCapability(ioCapability);
                    reader.getByte();
                }
            }
            advPacket.setFrameControl(frameControl);
            return advPacket;
        }
    }
}
