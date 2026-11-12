package com.huami.privacy.moneyformat;

import android.icu.text.NumberFormat;
import android.icu.util.Currency;
import androidx.annotation.RequiresApi;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(24)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\t*\u0001\u000b\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/privacy/moneyformat/MoneyFormatterN;", "Lcom/huami/privacy/moneyformat/IMoneyFormatter;", "", "money", "", "getMoney", "", "", "", "(Ljava/lang/Float;)Ljava/lang/String;", "getSymbol", "com/huami/privacy/moneyformat/MoneyFormatterN$cache$1", "b", "Lcom/huami/privacy/moneyformat/MoneyFormatterN$cache$1;", "cache", "countryCode", "<init>", "(Ljava/lang/String;)V", "Companion", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class MoneyFormatterN extends IMoneyFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MoneyFormatterN$cache$1 cache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/privacy/moneyformat/MoneyFormatterN$Companion;", "", "", "countryCode", "Lcom/huami/privacy/moneyformat/MoneyFormatterN;", "newInstance", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MoneyFormatterN newInstance(@NotNull String countryCode) {
            return new MoneyFormatterN(countryCode, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.privacy.moneyformat.MoneyFormatterN$cache$1, java.lang.ThreadLocal] */
    private MoneyFormatterN(String str) {
        ?? r0 = new ThreadLocal<NumberFormat>() { // from class: com.huami.privacy.moneyformat.MoneyFormatterN$cache$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            @NotNull
            public NumberFormat initialValue() {
                return NumberFormat.getCurrencyInstance();
            }
        };
        this.cache = r0;
        try {
            Currency currency = Currency.getInstance(str);
            NumberFormat numberFormat = (NumberFormat) r0.get();
            if (numberFormat == null) {
                return;
            }
            numberFormat.setCurrency(currency);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new a(e2), 6, null);
        }
    }

    public /* synthetic */ MoneyFormatterN(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(long money) {
        try {
            return get().format(money);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new b(e2), 6, null);
            return "";
        }
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getSymbol() {
        Currency currency;
        String symbol;
        try {
            NumberFormat numberFormat = get();
            return (numberFormat == null || (currency = numberFormat.getCurrency()) == null || (symbol = currency.getSymbol()) == null) ? "" : symbol;
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new f(e2), 6, null);
            return "";
        }
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(double money) {
        try {
            return get().format(money);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new c(e2), 6, null);
            return "";
        }
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(int money) {
        try {
            return get().format(Integer.valueOf(money));
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new d(e2), 6, null);
            return "";
        }
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(@Nullable Float money) {
        try {
            return get().format(money);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new e(e2), 6, null);
            return "";
        }
    }
}
