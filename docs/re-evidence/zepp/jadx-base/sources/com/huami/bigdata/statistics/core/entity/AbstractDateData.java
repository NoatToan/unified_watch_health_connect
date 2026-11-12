package com.huami.bigdata.statistics.core.entity;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "", "", "toString", "date", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "<init>", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractDateData {

    @NotNull
    private String date;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractDateData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AbstractDateData(@NotNull String str) {
        this.date = str;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    @NotNull
    public String toString() {
        return new Gson().toJson(this);
    }

    public /* synthetic */ AbstractDateData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
