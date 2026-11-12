package com.huami.userproperty.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B)\b\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/userproperty/entity/AbsFetchParams;", "", "", "", "a", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "keys", "b", "Ljava/lang/String;", "getMode", "()Ljava/lang/String;", "mode", "c", "getApi", "api", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/huami/userproperty/entity/FetchParams;", "Lcom/huami/userproperty/entity/BatchFetchParams;", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsFetchParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> keys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String api;

    private AbsFetchParams(List<String> list, String str, String str2) {
        this.keys = list;
        this.mode = str;
        this.api = str2;
    }

    public /* synthetic */ AbsFetchParams(List list, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2);
    }

    @Nullable
    public String getApi() {
        return this.api;
    }

    @NotNull
    public List<String> getKeys() {
        return this.keys;
    }

    @NotNull
    public String getMode() {
        return this.mode;
    }
}
