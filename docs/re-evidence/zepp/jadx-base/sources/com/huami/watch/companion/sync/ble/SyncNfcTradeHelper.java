package com.huami.watch.companion.sync.ble;

import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.companion.sync.ble.SyncNfcTradeHelper;
import com.huami.watch.transport.ble.connection.BleConnection;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/sync/ble/SyncNfcTradeHelper;", "Lcom/huami/watch/companion/sync/BaseSyncHelper;", "", "c", "release", "", "onStart", "getHelper", "Lcom/huami/watch/transport/ble/connection/BleConnection$DataListener;", "e", "Lcom/huami/watch/transport/ble/connection/BleConnection$DataListener;", "mDataListener", "<init>", "()V", "Config", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SyncNfcTradeHelper extends BaseSyncHelper {

    @NotNull
    public static final String TAG = "SyncNfcTradeHelper";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final BleConnection.DataListener mDataListener;

    /* JADX INFO: renamed from: Config, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static Function0<String> f = a.a;

    /* JADX INFO: renamed from: com.huami.watch.companion.sync.ble.SyncNfcTradeHelper$Config, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/watch/companion/sync/ble/SyncNfcTradeHelper$Config;", "", "Lkotlin/Function0;", "", "cityCode", "Lkotlin/jvm/functions/Function0;", "getCityCode", "()Lkotlin/jvm/functions/Function0;", "setCityCode", "(Lkotlin/jvm/functions/Function0;)V", "TAG", "Ljava/lang/String;", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<String> getCityCode() {
            return SyncNfcTradeHelper.f;
        }

        public final void setCityCode(@NotNull Function0<String> function0) {
            SyncNfcTradeHelper.f = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LfType.values().length];
            iArr[LfType.NFC_TRADE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "010";
        }
    }

    public SyncNfcTradeHelper() {
        BleConnection.DataListener dataListener = new BleConnection.DataListener() { // from class: fj7
            @Override // com.huami.watch.transport.ble.connection.BleConnection.DataListener
            public final void onReceiveData(HMLFEvent hMLFEvent) {
                SyncNfcTradeHelper.b(this.a, hMLFEvent);
            }
        };
        this.mDataListener = dataListener;
        CompanionApplication.get().mBleConnection.addDataListener(dataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SyncNfcTradeHelper syncNfcTradeHelper, HMLFEvent hMLFEvent) {
        HMLog.e(TAG, "event :" + hMLFEvent, new Object[0]);
        if (hMLFEvent != null) {
            LfType lfType = hMLFEvent.getLfType();
            if ((lfType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lfType.ordinal()]) == 1) {
                syncNfcTradeHelper.c();
            }
        }
    }

    private final void c() {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null) {
            return;
        }
        hMSmartWatchDevice.getNfcTradeInfo(new HMCallback<ArrayList<HMNFCTradeInfo>>() { // from class: com.huami.watch.companion.sync.ble.SyncNfcTradeHelper$onNfcTrade$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable ArrayList<HMNFCTradeInfo> hMNFCTradeInfos) {
                super.onFinish(hMNFCTradeInfos);
                HMLog.d(SyncNfcTradeHelper.TAG, "getNfcTradeInfo :" + hMNFCTradeInfos, new Object[0]);
                if (hMNFCTradeInfos == null || hMNFCTradeInfos.isEmpty()) {
                    return;
                }
                EventBus.getDefault().post(hMNFCTradeInfos);
            }
        });
    }

    @Nullable
    public final SyncNfcTradeHelper getHelper() {
        BaseSyncHelper helper = BaseSyncHelper.getHelper(null, null, SyncNfcTradeHelper.class);
        Objects.requireNonNull(helper, "null cannot be cast to non-null type com.huami.watch.companion.sync.ble.SyncNfcTradeHelper");
        return (SyncNfcTradeHelper) helper;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        return false;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void release() {
        super.release();
        CompanionApplication.get().mBleConnection.removeDataListener(this.mDataListener);
    }
}
