package androidx.room;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/room/FtsOptions;", "", "<init>", "()V", "TOKENIZER_SIMPLE", "", "TOKENIZER_PORTER", "TOKENIZER_ICU", "TOKENIZER_UNICODE61", "MatchInfo", "Order", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtsOptions {

    @NotNull
    public static final FtsOptions INSTANCE = new FtsOptions();

    @NotNull
    public static final String TOKENIZER_ICU = "icu";

    @NotNull
    public static final String TOKENIZER_PORTER = "porter";

    @NotNull
    public static final String TOKENIZER_SIMPLE = "simple";

    @RequiresApi(21)
    @NotNull
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "<init>", "(Ljava/lang/String;I)V", "FTS3", "FTS4", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum MatchInfo {
        FTS3,
        FTS4;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<MatchInfo> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "<init>", "(Ljava/lang/String;I)V", "ASC", "DESC", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Order {
        ASC,
        DESC;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Order> getEntries() {
            return $ENTRIES;
        }
    }

    private FtsOptions() {
    }
}
