package com.huami.bluetooth.profile.channel.module.binary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BinaryEncoder {
    private static final int b = 1024;
    private static final String c = "BinaryEncoder";
    private ByteBuf a;

    private int a(Field field, Layout layout) throws IllegalAccessException, IOException, NumberFormatException {
        if (field.getModifiers() == 0 || field.getModifiers() == 1) {
            if (field.getType().equals(Byte.TYPE)) {
                this.a.writeByte(((Byte) field.get(layout)).byteValue());
                return 1;
            }
            if (field.getType().equals(Integer.TYPE)) {
                this.a.writeBytes(GattUtils.intToBytes(Integer.parseInt(field.get(layout).toString())));
                return 4;
            }
            if (field.getType().equals(Short.TYPE)) {
                this.a.writeBytes(GattUtils.shortToBytes(Short.parseShort(field.get(layout).toString())));
                return 2;
            }
            if (field.getType().equals(Boolean.TYPE)) {
                if (field.getBoolean(layout)) {
                    this.a.writeByte(1);
                } else {
                    this.a.writeByte(0);
                }
                return 1;
            }
            if (field.getType().equals(byte[].class)) {
                byte[] bArr = (byte[]) field.get(layout);
                this.a.writeBytes(bArr);
                return bArr.length;
            }
            if (field.getType().equals(String.class)) {
                byte[] bytes = ((String) field.get(layout)).getBytes();
                this.a.writeBytes(bytes);
                this.a.writeByte(0);
                return bytes.length + 1;
            }
            if (field.getType().equals(UInt8.class)) {
                this.a.writeBytes(((UInt8) field.get(layout)).toBytes());
                return 1;
            }
            if (field.getType().equals(UInt16.class)) {
                this.a.writeBytes(((UInt16) field.get(layout)).toBytes());
                return 2;
            }
            if (field.getType().equals(UInt32.class)) {
                this.a.writeBytes(((UInt32) field.get(layout)).toBytes());
                return 4;
            }
            if (field.getType().equals(Layout.class)) {
                byte[] bArrEncode = new BinaryEncoder().encode((Layout) field.get(layout));
                this.a.writeBytes(bArrEncode);
                return bArrEncode.length;
            }
        }
        return 0;
    }

    @NonNull
    public byte[] encode(@Nullable Layout layout) throws IllegalAccessException, IOException, NumberFormatException {
        if (layout == null) {
            return new byte[0];
        }
        this.a = Unpooled.buffer(1024);
        int iA = 0;
        for (Field field : FieldsOrder.INSTANCE.sort(layout)) {
            iA += a(field, layout);
        }
        try {
            return this.a.copy(0, iA).array();
        } catch (Exception e) {
            Debug.e(c, "error", e);
            return new byte[0];
        }
    }

    @NonNull
    public byte[] encode(@NonNull List<? extends Layout> layouts) {
        if (layouts.isEmpty()) {
            return new byte[0];
        }
        this.a = Unpooled.buffer(1024);
        Field[] fieldArrSort = FieldsOrder.INSTANCE.sort(layouts.get(0));
        try {
            int iA = 0;
            for (Layout layout : layouts) {
                for (Field field : fieldArrSort) {
                    iA += a(field, layout);
                }
            }
            return this.a.copy(0, iA).array();
        } catch (Exception e) {
            Debug.e(c, "error", e);
            return new byte[0];
        }
    }
}
