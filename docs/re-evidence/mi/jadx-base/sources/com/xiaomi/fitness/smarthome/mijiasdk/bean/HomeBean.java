package com.xiaomi.fitness.smarthome.mijiasdk.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/smarthome/mijiasdk/bean/HomeBean;", "", "id", "", "name", "", "uid", "<init>", "(JLjava/lang/String;J)V", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUid", "setUid", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeBean {
    private long id;

    @NotNull
    private String name;
    private long uid;

    public HomeBean(long j, @NotNull String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.name = name;
        this.uid = j2;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setUid(long j) {
        this.uid = j;
    }
}
