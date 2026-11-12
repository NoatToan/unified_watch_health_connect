package com.huami.bluetooth.profile.channel.module.binary;

import androidx.annotation.Keep;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import defpackage.ql;
import defpackage.tet;
import defpackage.y9;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class BinaryDecoder {
    private static final String TAG = "BinaryDecoder";

    @Keep
    public interface DecodeEvent {
        void beforeParse(String str, int i);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Field f9862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9863b;

        public a(Field field, int i) {
            this.f9862a = field;
            this.f9863b = i;
        }
    }

    public static int conToInt(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | (b3 << 16) | (b4 << 8) | b5;
    }

    public static short conToShort(byte b2, byte b3) {
        return (short) ((b2 << 8) | b3);
    }

    private static Layout createNewInstance(Class<?> cls, Layout layout) {
        try {
            return (Layout) cls.getDeclaredConstructor(layout.getClass()).newInstance(layout);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int decode(Layout layout, byte[] bArr) {
        return decode(layout, bArr, 0);
    }

    private static Layout getInputField(Field field, Layout layout) {
        Object obj;
        try {
            obj = field.get(layout);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            obj = null;
        }
        return (Layout) obj;
    }

    private static Layout getInputFieldnew(Field field, Layout layout) {
        Layout inputField = getInputField(field, layout);
        if (inputField == null) {
            try {
                Layout layout2 = (Layout) field.getType().getDeclaredConstructor(layout.getClass()).newInstance(layout);
                setField(field, layout, layout2);
                return layout2;
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return inputField;
    }

    private static int getLengthByte(Field field, Layout layout) {
        try {
            return ((byte[]) field.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static int getLengthInt(Field field, Layout layout) {
        try {
            return ((int[]) field.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static int getLengthObject(Field field, Layout layout) {
        try {
            return ((Object[]) field.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static int getLengthShort(Field field, Layout layout) {
        try {
            return ((short[]) field.get(layout)).length;
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static boolean hasEvents(Class<?> cls) {
        return false;
    }

    private static boolean hasInterface(Class<?> cls) {
        return false;
    }

    private static void setField(Field field, Layout layout, Object obj) {
        try {
            field.set(layout, obj);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int conToInt(byte[] bArr, int i) {
        return tet.d(bArr, i, 4);
    }

    public static short conToShort(byte[] bArr, int i) {
        return (short) tet.d(bArr, i, 2);
    }

    public static int decode(Layout layout, byte[] bArr, int i) {
        char c;
        char c2 = 3;
        Field[] fieldArrA = y9.f39942a.a(layout);
        int length = fieldArrA.length;
        int iDecode = i;
        int i2 = 0;
        while (i2 < length) {
            Field field = fieldArrA[i2];
            if (field.getModifiers() == 0 || field.getModifiers() == 1) {
                if (hasEvents(layout.getClass())) {
                    ((DecodeEvent) layout).beforeParse(field.getName(), iDecode);
                }
                if (field.getType().equals(Integer.TYPE)) {
                    setField(field, layout, Integer.valueOf(conToInt(bArr, iDecode)));
                    iDecode += 4;
                } else if (field.getType().equals(Short.TYPE)) {
                    setField(field, layout, Short.valueOf(conToShort(bArr, iDecode)));
                    iDecode += 2;
                } else if (field.getType().equals(Byte.TYPE)) {
                    setField(field, layout, Byte.valueOf(bArr[iDecode]));
                    iDecode++;
                } else if (field.getType().equals(Boolean.TYPE) || Boolean.class.equals(field.getType())) {
                    c = c2;
                    setField(field, layout, Boolean.valueOf(bArr[iDecode] == 1));
                    iDecode++;
                } else if (field.getType().equals(byte[].class)) {
                    int lengthByte = getLengthByte(field, layout);
                    byte[] bArr2 = new byte[lengthByte];
                    for (int i3 = 0; i3 < lengthByte; i3++) {
                        bArr2[i3] = bArr[iDecode];
                        iDecode++;
                    }
                    setField(field, layout, bArr2);
                } else if (field.getType().equals(short[].class)) {
                    int lengthShort = getLengthShort(field, layout);
                    short[] sArr = new short[lengthShort];
                    for (int i4 = 0; i4 < lengthShort; i4++) {
                        sArr[i4] = conToShort(bArr, iDecode);
                        iDecode += 2;
                    }
                    setField(field, layout, sArr);
                } else if (field.getType().equals(int[].class)) {
                    int lengthInt = getLengthInt(field, layout);
                    int[] iArr = new int[lengthInt];
                    for (int i5 = 0; i5 < lengthInt; i5++) {
                        iArr[i5] = conToInt(bArr, iDecode);
                        iDecode += 4;
                    }
                    setField(field, layout, iArr);
                } else if (field.getType().equals(String.class)) {
                    int iA = ql.a(bArr, iDecode);
                    if (iA == -1) {
                        setField(field, layout, "");
                    } else {
                        String strB = ql.b(bArr, iDecode);
                        if (strB != null) {
                            setField(field, layout, strB);
                            c = c2;
                            iDecode = iA + 1;
                        }
                    }
                } else if (field.getType().equals(UInt8.class)) {
                    UInt8 uInt8 = new UInt8();
                    uInt8.decode(new byte[]{bArr[iDecode]});
                    iDecode++;
                    setField(field, layout, uInt8);
                } else if (field.getType().equals(UInt16.class)) {
                    UInt16 uInt16 = new UInt16();
                    uInt16.decode(new byte[]{bArr[iDecode], bArr[iDecode + 1]});
                    iDecode += 2;
                    setField(field, layout, uInt16);
                } else if (field.getType().equals(UInt32.class)) {
                    UInt32 uInt32 = new UInt32();
                    c = 3;
                    uInt32.decode(new byte[]{bArr[iDecode], bArr[iDecode + 1], bArr[iDecode + 2], bArr[iDecode + 3]});
                    iDecode += 4;
                    setField(field, layout, uInt32);
                } else {
                    c = c2;
                    if (field.getType().isArray()) {
                        if (hasInterface(field.getType().getComponentType())) {
                            int lengthObject = getLengthObject(field, layout);
                            Object objNewInstance = Array.newInstance(field.getType().getComponentType(), lengthObject);
                            for (int i6 = 0; i6 < lengthObject; i6++) {
                                Layout layoutCreateNewInstance = createNewInstance(field.getType().getComponentType(), layout);
                                iDecode = decode(layoutCreateNewInstance, bArr, iDecode);
                                Array.set(objNewInstance, i6, layoutCreateNewInstance);
                            }
                            setField(field, layout, field.getType().cast(objNewInstance));
                        }
                    } else if (hasInterface(field.getType())) {
                        iDecode = decode(getInputFieldnew(field, layout), bArr, iDecode);
                    }
                }
                c = c2;
            } else {
                c = c2;
            }
            i2++;
            c2 = c;
        }
        return iDecode;
    }
}
