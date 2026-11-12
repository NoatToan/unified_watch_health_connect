package com.huami.bluetooth.profile.data;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u0004\u001a\u00020\u000b8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/data/MultiPacketDataParser;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/data/DataParser;", "", "data", "", "append", "parse", "([B)Ljava/lang/Object;", "", "isMultiPacket", "Ljava/io/ByteArrayOutputStream;", "a", "Ljava/io/ByteArrayOutputStream;", "getData", "()Ljava/io/ByteArrayOutputStream;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class MultiPacketDataParser<T> implements DataParser<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ByteArrayOutputStream data = new ByteArrayOutputStream();

    @Override // com.huami.bluetooth.profile.data.DataParser
    public void append(@NotNull byte[] data) {
        this.data.write(data);
    }

    @Override // com.huami.bluetooth.profile.data.DataParser
    @Nullable
    public T get() {
        return (T) DataParser.DefaultImpls.get(this);
    }

    @NotNull
    public final ByteArrayOutputStream getData() {
        return this.data;
    }

    @Override // com.huami.bluetooth.profile.data.DataParser
    public boolean isMultiPacket() {
        return true;
    }

    @Override // com.huami.bluetooth.profile.data.DataParser
    @Nullable
    public T parse(@NotNull byte[] data) {
        return null;
    }
}
