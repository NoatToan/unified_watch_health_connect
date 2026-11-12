package com.huami.watchfacesstore.util;

import com.huami.privacy.moneyformat.IMoneyFormatter;
import com.huami.tools.log.HMLog;
import java.text.NumberFormat;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/watchfacesstore/util/MoneyFormatter;", "Lcom/huami/privacy/moneyformat/IMoneyFormatter;", "", "money", "", "getMoney", "", "", "", "(Ljava/lang/Float;)Ljava/lang/String;", "getSymbol", "Ljava/lang/ThreadLocal;", "Ljava/text/NumberFormat;", "b", "Ljava/lang/ThreadLocal;", "cache", "countryCode", "<init>", "(Ljava/lang/String;)V", "Companion", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class MoneyFormatter extends IMoneyFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ThreadLocal<NumberFormat> cache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/util/MoneyFormatter$Companion;", "", "", "countryCode", "Lcom/huami/watchfacesstore/util/MoneyFormatter;", "newInstance", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MoneyFormatter newInstance(@NotNull String countryCode) {
            return new MoneyFormatter(countryCode, null);
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

    private MoneyFormatter(String str) {
        ThreadLocal<NumberFormat> threadLocal = new ThreadLocal<NumberFormat>() { // from class: com.huami.watchfacesstore.util.MoneyFormatter$cache$1
            @Override // java.lang.ThreadLocal
            @NotNull
            public NumberFormat initialValue() {
                return NumberFormat.getCurrencyInstance();
            }
        };
        this.cache = threadLocal;
        try {
            Currency currency = Currency.getInstance(str);
            NumberFormat numberFormat = threadLocal.get();
            if (numberFormat == null) {
                return;
            }
            numberFormat.setCurrency(currency);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new a(e2), 6, null);
        }
    }

    public /* synthetic */ MoneyFormatter(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(long money) {
        try {
            return this.cache.get().format(money);
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
            NumberFormat numberFormat = this.cache.get();
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
            return this.cache.get().format(money);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new c(e2), 6, null);
            return "";
        }
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(int money) {
        try {
            return this.cache.get().format(Integer.valueOf(money));
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new d(e2), 6, null);
            return "";
        }
    }

    @Override // com.huami.privacy.moneyformat.IMoneyFormatter
    @NotNull
    public String getMoney(@Nullable Float money) {
        try {
            return this.cache.get().format(money);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, null, new e(e2), 6, null);
            return "";
        }
    }
}
