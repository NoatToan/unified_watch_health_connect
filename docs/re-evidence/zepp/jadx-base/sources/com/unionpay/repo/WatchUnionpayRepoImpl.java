package com.unionpay.repo;

import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi;
import com.huami.nfc.watch.unionpay.entity.BankCardBindStatus;
import com.huami.nfc.web.NfcDevice;
import com.huami.wallet.common.config.NavigationConfig;
import com.huami.wallet.common.config.WebConfig;
import com.tekartik.sqflite.Constant;
import com.unionpay.api.WatchUnionpayDeviceApi;
import com.unionpay.entity.SimpleChannel;
import com.unionpay.entity.WatchBankCardInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\u0016\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/unionpay/repo/WatchUnionpayRepoImpl;", "Lcom/unionpay/repo/WatchUnionpayRepo;", "", "getWebHost", "url", "Landroid/os/Bundle;", "extras", "", "goToWeb", "", "Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "getBindCards", "aidList", "deleteCards", "aid", "", "bindCard", "getTsmDownloadUrl", "getCplc", "getDeviceModel", "queryPwd", "verifyPwd", "", "Lcom/unionpay/entity/SimpleChannel;", "openLogicChannel", "", "channelId", "closeLogicChannel", Constant.h, "transmit", "syncDeleteResultToDevice", "info", "syncCardInfoToDevice", "", "Lcom/unionpay/entity/WatchBankCardInfo;", "cardList", "syncCardListToDevice", "syncIssueResultToDevice", "Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "a", "Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "webApi", "Lcom/unionpay/api/WatchUnionpayDeviceApi;", "b", "Lcom/unionpay/api/WatchUnionpayDeviceApi;", "unionpayDeviceApi", "Lcom/huami/nfc/applet/api/SeInfoApi;", "c", "Lcom/huami/nfc/applet/api/SeInfoApi;", "seInfoApi", "Lcom/huami/wallet/common/config/WebConfig;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/common/config/WebConfig;", "webConfig", "Lcom/huami/nfc/web/NfcDevice;", "e", "Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "Lcom/huami/wallet/common/config/NavigationConfig;", "f", "Lcom/huami/wallet/common/config/NavigationConfig;", "navigationConfig", "<init>", "(Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;Lcom/unionpay/api/WatchUnionpayDeviceApi;Lcom/huami/nfc/applet/api/SeInfoApi;Lcom/huami/wallet/common/config/WebConfig;Lcom/huami/nfc/web/NfcDevice;Lcom/huami/wallet/common/config/NavigationConfig;)V", "watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public final class WatchUnionpayRepoImpl implements WatchUnionpayRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchUnionpayWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WatchUnionpayDeviceApi unionpayDeviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SeInfoApi seInfoApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final WebConfig webConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice nfcDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final NavigationConfig navigationConfig;

    public WatchUnionpayRepoImpl(@NotNull WatchUnionpayWebApi watchUnionpayWebApi, @NotNull WatchUnionpayDeviceApi watchUnionpayDeviceApi, @NotNull SeInfoApi seInfoApi, @NotNull WebConfig webConfig, @NotNull NfcDevice nfcDevice, @NotNull NavigationConfig navigationConfig) {
        this.webApi = watchUnionpayWebApi;
        this.unionpayDeviceApi = watchUnionpayDeviceApi;
        this.seInfoApi = seInfoApi;
        this.webConfig = webConfig;
        this.nfcDevice = nfcDevice;
        this.navigationConfig = navigationConfig;
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public boolean bindCard(@NotNull String aid) {
        return this.webApi.bindCard(aid).isSuccessful();
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public int closeLogicChannel(int channelId) {
        Integer data;
        PayResponse<Integer> payResponseCloseLogicChannel = this.unionpayDeviceApi.closeLogicChannel(channelId);
        if (!payResponseCloseLogicChannel.isSuccessful() || (data = payResponseCloseLogicChannel.getData()) == null) {
            return -1;
        }
        return data.intValue();
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public void deleteCards(@NotNull List<String> aidList) {
        this.webApi.deleteCards(aidList);
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @Nullable
    public List<BankCardBindStatus> getBindCards() {
        PayResponse<List<BankCardBindStatus>> bindCards = this.webApi.getBindCards();
        if (bindCards.isSuccessful()) {
            return bindCards.getData();
        }
        return null;
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @NotNull
    public String getCplc() {
        String data;
        PayResponse<String> cplc = this.seInfoApi.getCplc(this.nfcDevice.getSn());
        return (!cplc.isSuccessful() || (data = cplc.getData()) == null) ? "" : data;
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @NotNull
    public String getDeviceModel() {
        return this.nfcDevice.getDeviceModel().getModel();
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @NotNull
    public String getTsmDownloadUrl() {
        String data;
        PayResponse<String> tsmDownloadUrl = this.webApi.getTsmDownloadUrl(this.webConfig.getWebAppName());
        return (!tsmDownloadUrl.isSuccessful() || (data = tsmDownloadUrl.getData()) == null) ? "" : data;
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @NotNull
    public String getWebHost() {
        return this.webConfig.getWebHost();
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public void goToWeb(@NotNull String url, @Nullable Bundle extras) {
        this.navigationConfig.goToWeb(url, extras);
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @Nullable
    public SimpleChannel openLogicChannel(@NotNull byte[] aid) {
        PayResponse<SimpleChannel> payResponseOpenLogicChannel = this.unionpayDeviceApi.openLogicChannel(aid);
        if (payResponseOpenLogicChannel.isSuccessful()) {
            return payResponseOpenLogicChannel.getData();
        }
        return null;
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public boolean queryPwd() {
        Boolean data;
        PayResponse<Boolean> payResponseQueryPwd = this.unionpayDeviceApi.queryPwd();
        if (!payResponseQueryPwd.isSuccessful() || (data = payResponseQueryPwd.getData()) == null) {
            return false;
        }
        return data.booleanValue();
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public void syncCardInfoToDevice(@NotNull String aid, @NotNull String info) {
        this.unionpayDeviceApi.syncCardInfoToDevice(aid, info);
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public void syncCardListToDevice(@NotNull List<WatchBankCardInfo> cardList) {
        this.unionpayDeviceApi.syncCardListToDevice(cardList);
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public void syncDeleteResultToDevice(@NotNull String aid) {
        this.unionpayDeviceApi.syncDeleteResultToDevice(aid);
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public void syncIssueResultToDevice(@NotNull String aid) {
        this.unionpayDeviceApi.syncIssueResultToDevice(aid);
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    @Nullable
    public byte[] transmit(@NotNull byte[] cmd) {
        PayResponse<byte[]> payResponseTransmit = this.unionpayDeviceApi.transmit(cmd);
        if (payResponseTransmit.isSuccessful()) {
            return payResponseTransmit.getData();
        }
        return null;
    }

    @Override // com.unionpay.repo.WatchUnionpayRepo
    public boolean verifyPwd() {
        Boolean data;
        PayResponse<Boolean> payResponseVerifyPwd = this.unionpayDeviceApi.verifyPwd();
        if (!payResponseVerifyPwd.isSuccessful() || (data = payResponseVerifyPwd.getData()) == null) {
            return false;
        }
        return data.booleanValue();
    }
}
