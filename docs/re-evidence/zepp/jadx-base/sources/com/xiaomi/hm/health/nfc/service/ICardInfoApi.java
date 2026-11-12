package com.xiaomi.hm.health.nfc.service;

import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.base.PayResponse;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi;", "", "", "aid", "Lcom/huami/nfc/base/PayResponse;", "getCardNumber", "number", "getCardNumberFromWeb", "", "getBalance", "getValidityDate", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/xiaomi/hm/health/nfc/service/Record;", "getTradeRecords", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ICardInfoApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final byte TYPE_ALL = 15;
    public static final byte TYPE_BALANCE = 2;
    public static final byte TYPE_DATE = 4;
    public static final byte TYPE_NUMBER = 1;
    public static final byte TYPE_RECORDS = 8;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi$Companion;", "", "", "TYPE_NUMBER", "B", "TYPE_BALANCE", "TYPE_DATE", "TYPE_RECORDS", "TYPE_ALL", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final byte TYPE_ALL = 15;
        public static final byte TYPE_BALANCE = 2;
        public static final byte TYPE_DATE = 4;
        public static final byte TYPE_NUMBER = 1;
        public static final byte TYPE_RECORDS = 8;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    PayResponse<Integer> getBalance(@NotNull String aid);

    @NotNull
    PayResponse<CardInfo> getCardInfo(@NotNull String aid);

    @NotNull
    PayResponse<String> getCardNumber(@NotNull String aid);

    @NotNull
    PayResponse<String> getCardNumberFromWeb(@NotNull String aid, @NotNull String number);

    @NotNull
    PayResponse<List<Record>> getTradeRecords(@NotNull String aid);

    @NotNull
    PayResponse<String> getValidityDate(@NotNull String aid);
}
