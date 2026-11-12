package defpackage;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class qdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuf f31424a;

    public final int a(Field field, Layout layout) {
        if (field.getModifiers() == 0 || field.getModifiers() == 1) {
            if (field.getType().equals(Byte.TYPE)) {
                this.f31424a.writeByte(((Byte) field.get(layout)).byteValue());
                return 1;
            }
            if (field.getType().equals(Integer.TYPE)) {
                this.f31424a.writeBytes(tet.p(Integer.parseInt(field.get(layout).toString())));
                return 4;
            }
            if (field.getType().equals(Short.TYPE)) {
                this.f31424a.writeBytes(tet.s(Short.parseShort(field.get(layout).toString())));
                return 2;
            }
            if (field.getType().equals(Boolean.TYPE)) {
                if (field.getBoolean(layout)) {
                    this.f31424a.writeByte(1);
                } else {
                    this.f31424a.writeByte(0);
                }
                return 1;
            }
            if (field.getType().equals(byte[].class)) {
                byte[] bArr = (byte[]) field.get(layout);
                this.f31424a.writeBytes(bArr);
                return bArr.length;
            }
            if (field.getType().equals(String.class)) {
                byte[] bytes = ((String) field.get(layout)).getBytes();
                this.f31424a.writeBytes(bytes);
                this.f31424a.writeByte(0);
                return bytes.length + 1;
            }
            if (field.getType().equals(UInt8.class)) {
                this.f31424a.writeBytes(((UInt8) field.get(layout)).toBytes());
                return 1;
            }
            if (field.getType().equals(UInt16.class)) {
                this.f31424a.writeBytes(((UInt16) field.get(layout)).toBytes());
                return 2;
            }
            if (field.getType().equals(UInt32.class)) {
                this.f31424a.writeBytes(((UInt32) field.get(layout)).toBytes());
                return 4;
            }
            if (field.getType().equals(Layout.class)) {
                byte[] bArrB = new qdt().b((Layout) field.get(layout));
                this.f31424a.writeBytes(bArrB);
                return bArrB.length;
            }
        }
        return 0;
    }

    public byte[] b(Layout layout) {
        if (layout == null) {
            return new byte[0];
        }
        this.f31424a = Unpooled.buffer(1024);
        int iA = 0;
        for (Field field : y9.f39942a.a(layout)) {
            iA += a(field, layout);
        }
        try {
            return this.f31424a.copy(0, iA).array();
        } catch (Exception e) {
            t5t.f("BinaryEncoder", "error", e);
            return new byte[0];
        }
    }
}
