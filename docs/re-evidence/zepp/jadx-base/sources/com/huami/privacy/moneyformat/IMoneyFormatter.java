package com.huami.privacy.moneyformat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\n\u001a\u00020\u0004H&R\u001c\u0010\u000f\u001a\u00020\u00048\u0004@\u0004X\u0084D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/privacy/moneyformat/IMoneyFormatter;", "", "", "money", "", "getMoney", "", "", "", "(Ljava/lang/Float;)Ljava/lang/String;", "getSymbol", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public abstract class IMoneyFormatter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "IMoneyFormatter";

    @NotNull
    public abstract String getMoney(double money);

    @NotNull
    public abstract String getMoney(int money);

    @NotNull
    public abstract String getMoney(long money);

    @NotNull
    public abstract String getMoney(@Nullable Float money);

    @NotNull
    public abstract String getSymbol();

    @NotNull
    public final String getTag() {
        return this.tag;
    }
}
