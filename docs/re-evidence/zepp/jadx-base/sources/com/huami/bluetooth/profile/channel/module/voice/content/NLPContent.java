package com.huami.bluetooth.profile.channel.module.voice.content;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "", "", "a", "", "version", "", "toByteArray", "getBytes", LogUtil.I, "domain", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class NLPContent {
    public static final int ALERT = 2;
    public static final int ARTICLE = 6;
    public static final int LIST = 3;
    public static final int NEWS = 5;
    public static final int OPEN_APP = 4;
    public static final int WEATHER = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int domain;

    public NLPContent(int i) {
        this.domain = i;
    }

    private final short a() {
        return (short) this.domain;
    }

    @NotNull
    public abstract byte[] getBytes(int version);

    @NotNull
    public final byte[] toByteArray(int version) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(GattUtils.shortToBytes(a()));
        byte[] bytes = getBytes(version);
        byteArrayOutputStream.write(GattUtils.intToBytes(bytes.length));
        byteArrayOutputStream.write(bytes);
        return byteArrayOutputStream.toByteArray();
    }
}
