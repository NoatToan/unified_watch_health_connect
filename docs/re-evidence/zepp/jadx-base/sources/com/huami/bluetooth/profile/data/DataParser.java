package com.huami.bluetooth.profile.data;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0011\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/data/DataParser;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "data", "parse", "([B)Ljava/lang/Object;", "", "isMultiPacket", "", "append", "get", "()Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface DataParser<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static <T> void append(@NotNull DataParser<? extends T> dataParser, @NotNull byte[] bArr) {
        }

        @Nullable
        public static <T> T get(@NotNull DataParser<? extends T> dataParser) {
            return null;
        }

        public static <T> boolean isMultiPacket(@NotNull DataParser<? extends T> dataParser) {
            return false;
        }
    }

    void append(@NotNull byte[] data);

    @Nullable
    T get();

    boolean isMultiPacket();

    @Nullable
    T parse(@NotNull byte[] data);
}
