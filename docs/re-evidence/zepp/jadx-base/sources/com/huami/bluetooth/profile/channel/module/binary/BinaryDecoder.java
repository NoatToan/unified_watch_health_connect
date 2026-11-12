package com.huami.bluetooth.profile.channel.module.binary;

import androidx.annotation.Keep;
import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class BinaryDecoder {
    private static final String TAG = "BinaryDecoder";

    @Keep
    public interface DecodeEvent {
        void beforeParse(String symbolname, int offset);
    }

    public static class OrderLayout {
        public Field a;
        public int b;

        public OrderLayout(Field f, int order) {
            this.a = f;
            this.b = order;
        }
    }

    public static int conToInt(byte b0, byte b1, byte b2, byte b3) {
        return (b0 << 24) | (b1 << 16) | (b2 << 8) | b3;
    }

    public static int conToInt(byte[] bytes, int offset) {
        return GattUtils.bytesToInt(bytes, offset, 4);
    }

    public static short conToShort(byte b0, byte b1) {
        return (short) ((b0 << 8) | b1);
    }

    public static short conToShort(byte[] bytes, int offset) {
        return (short) GattUtils.bytesToInt(bytes, offset, 2);
    }

    private static Layout createNewInstance(Class<?> c, Layout layout) {
        try {
            return (Layout) c.getDeclaredConstructor(layout.getClass()).newInstance(layout);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int decode(Layout layout, byte[] bytes) {
        return decode(layout, bytes, 0);
    }

    private static Layout getInputField(Field f, Layout layout) {
        Object obj;
        try {
            obj = f.get(layout);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            obj = null;
        }
        return (Layout) obj;
    }

    private static Layout getInputFieldnew(Field f, Layout layout) {
        Layout inputField = getInputField(f, layout);
        if (inputField == null) {
            try {
                Layout layout2 = (Layout) f.getType().getDeclaredConstructor(layout.getClass()).newInstance(layout);
                setField(f, layout, layout2);
                return layout2;
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return inputField;
    }

    private static int getLengthByte(Field f, Layout layout) {
        try {
            return ((byte[]) f.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static int getLengthInt(Field f, Layout layout) {
        try {
            return ((int[]) f.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static int getLengthObject(Field f, Layout layout) {
        try {
            return ((Object[]) f.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static int getLengthShort(Field f, Layout layout) {
        try {
            return ((short[]) f.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static boolean hasEvents(Class<?> c) {
        return false;
    }

    private static boolean hasInterface(Class<?> c) {
        return false;
    }

    private static void setField(Field f, Layout layout, Object o) {
        try {
            f.set(layout, o);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int decode(Layout layout, byte[] bytes, int offset) {
        for (Field field : FieldsOrder.INSTANCE.sort(layout)) {
            if (field.getModifiers() == 0 || field.getModifiers() == 1) {
                if (hasEvents(layout.getClass())) {
                    ((DecodeEvent) layout).beforeParse(field.getName(), offset);
                }
                if (field.getType().equals(Integer.TYPE)) {
                    setField(field, layout, Integer.valueOf(conToInt(bytes, offset)));
                    offset += 4;
                } else if (field.getType().equals(Short.TYPE)) {
                    setField(field, layout, Short.valueOf(conToShort(bytes, offset)));
                    offset += 2;
                } else {
                    if (field.getType().equals(Byte.TYPE)) {
                        setField(field, layout, Byte.valueOf(bytes[offset]));
                    } else if (field.getType().equals(Boolean.TYPE) || Boolean.class.equals(field.getType())) {
                        setField(field, layout, Boolean.valueOf(bytes[offset] == 1));
                    } else if (field.getType().equals(byte[].class)) {
                        int lengthByte = getLengthByte(field, layout);
                        byte[] bArr = new byte[lengthByte];
                        for (int i = 0; i < lengthByte; i++) {
                            bArr[i] = bytes[offset];
                            offset++;
                        }
                        setField(field, layout, bArr);
                    } else if (field.getType().equals(short[].class)) {
                        int lengthShort = getLengthShort(field, layout);
                        short[] sArr = new short[lengthShort];
                        for (int i2 = 0; i2 < lengthShort; i2++) {
                            sArr[i2] = conToShort(bytes, offset);
                            offset += 2;
                        }
                        setField(field, layout, sArr);
                    } else if (field.getType().equals(int[].class)) {
                        int lengthInt = getLengthInt(field, layout);
                        int[] iArr = new int[lengthInt];
                        for (int i3 = 0; i3 < lengthInt; i3++) {
                            iArr[i3] = conToInt(bytes, offset);
                            offset += 4;
                        }
                        setField(field, layout, iArr);
                    } else if (field.getType().equals(String.class)) {
                        int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(bytes, offset);
                        if (iFindStringEndFlag == -1) {
                            setField(field, layout, "");
                        } else {
                            String strSliceString = ModuleUtilsKt.sliceString(bytes, offset);
                            if (strSliceString != null) {
                                offset = iFindStringEndFlag + 1;
                                setField(field, layout, strSliceString);
                            }
                        }
                    } else if (field.getType().equals(UInt8.class)) {
                        UInt8 uInt8 = new UInt8();
                        uInt8.decode(new byte[]{bytes[offset]});
                        offset++;
                        setField(field, layout, uInt8);
                    } else if (field.getType().equals(UInt16.class)) {
                        UInt16 uInt16 = new UInt16();
                        uInt16.decode(new byte[]{bytes[offset], bytes[offset + 1]});
                        offset += 2;
                        setField(field, layout, uInt16);
                    } else if (field.getType().equals(UInt32.class)) {
                        UInt32 uInt32 = new UInt32();
                        uInt32.decode(new byte[]{bytes[offset], bytes[offset + 1], bytes[offset + 2], bytes[offset + 3]});
                        offset += 4;
                        setField(field, layout, uInt32);
                    } else if (field.getType().isArray()) {
                        if (hasInterface(field.getType().getComponentType())) {
                            int lengthObject = getLengthObject(field, layout);
                            Object objNewInstance = Array.newInstance(field.getType().getComponentType(), lengthObject);
                            for (int i4 = 0; i4 < lengthObject; i4++) {
                                Layout layoutCreateNewInstance = createNewInstance(field.getType().getComponentType(), layout);
                                offset = decode(layoutCreateNewInstance, bytes, offset);
                                Array.set(objNewInstance, i4, layoutCreateNewInstance);
                            }
                            setField(field, layout, field.getType().cast(objNewInstance));
                        }
                    } else if (hasInterface(field.getType())) {
                        offset = decode(getInputFieldnew(field, layout), bytes, offset);
                    }
                    offset++;
                }
            }
        }
        return offset;
    }
}
