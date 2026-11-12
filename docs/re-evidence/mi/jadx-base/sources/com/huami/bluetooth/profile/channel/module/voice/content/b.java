package com.huami.bluetooth.profile.channel.module.voice.content;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\b&\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/b;", "", "", "getDomain", "", "version", "", "toByteArray", "getBytes", "domain", "I", "<init>", "(I)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class b {
    public static final int ALERT = 2;
    public static final int ARTICLE = 6;
    public static final int LIST = 3;
    public static final int NEWS = 5;
    public static final int OPEN_APP = 4;
    public static final int WEATHER = 1;
    private final int domain;

    public b(int i) {
        this.domain = i;
    }

    private final short getDomain() {
        return (short) this.domain;
    }

    @NotNull
    public abstract byte[] getBytes(int version);

    @NotNull
    public final byte[] toByteArray(int version) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(tet.s(getDomain()));
        byte[] bytes = getBytes(version);
        byteArrayOutputStream.write(tet.p(bytes.length));
        byteArrayOutputStream.write(bytes);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }
}
