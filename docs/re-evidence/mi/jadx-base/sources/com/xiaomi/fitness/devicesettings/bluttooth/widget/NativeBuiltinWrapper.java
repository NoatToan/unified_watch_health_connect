package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import com.xiaomi.onetrack.c.q;
import defpackage.lyo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001f\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "", "Llyo$a;", "phraseNativeBuiltin", "()Llyo$a;", "", "toString", "()Ljava/lang/String;", "", "id", "I", "getId", "()I", "type", "getType", q.f13858b, "getAppId", "kotlin.jvm.PlatformType", "name", "Ljava/lang/String;", "getName", "nativeBuiltin", "<init>", "(Llyo$a;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NativeBuiltinWrapper {
    private final int appId;
    private final int id;
    private final String name;
    private final int type;

    public NativeBuiltinWrapper(@NotNull lyo.a nativeBuiltin) {
        Intrinsics.checkNotNullParameter(nativeBuiltin, "nativeBuiltin");
        int i = nativeBuiltin.c;
        this.id = i;
        this.type = 65535 & i;
        this.appId = i >> 16;
        this.name = nativeBuiltin.d;
    }

    public final int getAppId() {
        return this.appId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final lyo.a phraseNativeBuiltin() {
        lyo.a aVar = new lyo.a();
        aVar.c = this.id;
        return aVar;
    }

    @NotNull
    public String toString() {
        return "[NativeBuiltinWrapper id = " + this.id + ", type = " + this.type + ", appId = " + this.appId + ", name = " + this.name + "]";
    }
}
