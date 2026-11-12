package com.example.statistics.export;

import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.DoorCardConstants;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.passport.snscorelib.internal.utils.SNSType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/example/statistics/export/AccountType;", "", "<init>", "(Ljava/lang/String;I)V", DoorCardConstants.PARTNER_ID, "PHONE_NUMBERl", SNSType.WEIXIN, "WEIBO", AIApiConstants.QQ.NAME, DKFRequestService.a.d, "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AccountType {
    XIAOMI,
    PHONE_NUMBERl,
    WEIXIN,
    WEIBO,
    QQ,
    OTHER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<AccountType> getEntries() {
        return $ENTRIES;
    }
}
