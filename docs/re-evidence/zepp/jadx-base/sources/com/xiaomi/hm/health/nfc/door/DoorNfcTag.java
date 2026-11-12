package com.xiaomi.hm.health.nfc.door;

import com.huami.nfc.applet.Hex;
import com.huami.nfc.door.Block;
import com.huami.nfc.door.INfcTag;
import com.huami.nfc.door.NfcTag;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCBlockInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/nfc/door/DoorNfcTag;", "Lcom/huami/nfc/door/INfcTag;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCBlockInfo;", "Lkotlin/collections/ArrayList;", "lists", "", "Lcom/huami/nfc/door/Block;", "a", "Lcom/huami/nfc/door/NfcTag;", "getTag", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DoorNfcTag implements INfcTag {

    @NotNull
    public static final String TAG = "DoorNfcTag";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "openNfcChannel Start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "this device is not support NFC.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device not connected.";
        }
    }

    private final List<Block> a(ArrayList<HMNFCBlockInfo> lists) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(lists, 10));
        for (HMNFCBlockInfo hMNFCBlockInfo : lists) {
            arrayList.add(new Block(hMNFCBlockInfo.getHeader(), hMNFCBlockInfo.getIndex(), hMNFCBlockInfo.getFlag(), Hex.bytesToHexString(hMNFCBlockInfo.getData())));
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    @Override // com.huami.nfc.door.INfcTag
    @NotNull
    public NfcTag getTag() {
        HMLog.info(TAG, a.a);
        if (!NfcDeviceConfigKt.hasFeatureNfc()) {
            HMLog.error$default(TAG, null, null, b.a, 6, null);
            throw new IllegalStateException("this device is not support NFC.");
        }
        HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
        if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
            HMLog.error$default(TAG, null, null, c.a, 6, null);
            throw new IllegalStateException("device not connected.");
        }
        HMNFCCardInfo nfcCardInfoSync = ((HMMiLiProDevice) hMBaseBleDevice).getNfcCardInfoSync();
        Objects.requireNonNull(nfcCardInfoSync, "not find nfc tag");
        return new NfcTag(nfcCardInfoSync.getHeader(), nfcCardInfoSync.getResult(), nfcCardInfoSync.getUid(), nfcCardInfoSync.getUidLen(), nfcCardInfoSync.getSak(), nfcCardInfoSync.getAtqa(), a(nfcCardInfoSync.getBlockInfos()), nfcCardInfoSync.getBlockData(), null, 256, null);
    }
}
