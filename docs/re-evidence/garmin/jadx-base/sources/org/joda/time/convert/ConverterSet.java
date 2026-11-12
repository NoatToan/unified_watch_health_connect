package org.joda.time.convert;

import androidx.core.view.j;
import o2.c;

/* JADX INFO: loaded from: classes3.dex */
class ConverterSet {
    private final Converter[] iConverters;
    private Entry[] iSelectEntries = new Entry[16];

    public static class Entry {
        final Converter iConverter;
        final Class<?> iType;

        public Entry(Class<?> cls, Converter converter) {
            this.iType = cls;
            this.iConverter = converter;
        }
    }

    public ConverterSet(Converter[] converterArr) {
        this.iConverters = converterArr;
    }

    private static Converter selectSlow(ConverterSet converterSet, Class<?> cls) {
        Converter[] converterArr = converterSet.iConverters;
        int length = converterArr.length;
        int length2 = length;
        while (true) {
            length--;
            if (length < 0) {
                if (cls == null || length2 == 0) {
                    return null;
                }
                if (length2 == 1) {
                    return converterArr[0];
                }
                int i14 = length2;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    Class<?> supportedType = converterArr[length2].getSupportedType();
                    int length3 = i14;
                    while (true) {
                        i14--;
                        if (i14 >= 0) {
                            if (i14 != length2 && converterArr[i14].getSupportedType().isAssignableFrom(supportedType)) {
                                converterSet = converterSet.remove(i14, (Converter[]) null);
                                converterArr = converterSet.iConverters;
                                length3 = converterArr.length;
                                length2 = length3 - 1;
                            }
                        }
                    }
                    i14 = length3;
                }
                if (i14 == 1) {
                    return converterArr[0];
                }
                StringBuilder sb3 = new StringBuilder("Unable to find best converter for type \"");
                j.o(cls, sb3, "\" from remaining set: ");
                for (int i15 = 0; i15 < i14; i15++) {
                    Converter converter = converterArr[i15];
                    Class<?> supportedType2 = converter.getSupportedType();
                    sb3.append(converter.getClass().getName());
                    sb3.append('[');
                    sb3.append(supportedType2 == null ? null : supportedType2.getName());
                    sb3.append("], ");
                }
                throw new IllegalStateException(sb3.toString());
            }
            Converter converter2 = converterArr[length];
            Class<?> supportedType3 = converter2.getSupportedType();
            if (supportedType3 == cls) {
                return converter2;
            }
            if (supportedType3 == null || (cls != null && !supportedType3.isAssignableFrom(cls))) {
                converterSet = converterSet.remove(length, (Converter[]) null);
                converterArr = converterSet.iConverters;
                length2 = converterArr.length;
            }
        }
    }

    public ConverterSet add(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i14 = 0; i14 < length; i14++) {
            Converter converter2 = converterArr2[i14];
            if (converter.equals(converter2)) {
                if (converterArr != null) {
                    converterArr[0] = null;
                }
                return this;
            }
            if (converter.getSupportedType() == converter2.getSupportedType()) {
                Converter[] converterArr3 = new Converter[length];
                for (int i15 = 0; i15 < length; i15++) {
                    if (i15 != i14) {
                        converterArr3[i15] = converterArr2[i15];
                    } else {
                        converterArr3[i15] = converter;
                    }
                }
                if (converterArr != null) {
                    converterArr[0] = converter2;
                }
                return new ConverterSet(converterArr3);
            }
        }
        Converter[] converterArr4 = new Converter[length + 1];
        System.arraycopy(converterArr2, 0, converterArr4, 0, length);
        converterArr4[length] = converter;
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return new ConverterSet(converterArr4);
    }

    public void copyInto(Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        System.arraycopy(converterArr2, 0, converterArr, 0, converterArr2.length);
    }

    public ConverterSet remove(int i14, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        if (i14 >= length) {
            c.q();
            return null;
        }
        if (converterArr != null) {
            converterArr[0] = converterArr2[i14];
        }
        Converter[] converterArr3 = new Converter[length - 1];
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (i16 != i14) {
                converterArr3[i15] = converterArr2[i16];
                i15++;
            }
        }
        return new ConverterSet(converterArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x000e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Converter select(Class<?> cls) {
        int iHashCode;
        int iHashCode2;
        Entry[] entryArr = this.iSelectEntries;
        int length = entryArr.length;
        if (cls == null) {
            iHashCode = 0;
        } else {
            iHashCode = cls.hashCode() & (length - 1);
            while (true) {
                Entry entry = entryArr[iHashCode];
                if (entry == null) {
                    Converter converterSelectSlow = selectSlow(this, cls);
                    Entry entry2 = new Entry(cls, converterSelectSlow);
                    Entry[] entryArr2 = (Entry[]) entryArr.clone();
                    entryArr2[iHashCode] = entry2;
                    for (int i14 = 0; i14 < length; i14++) {
                        if (entryArr2[i14] == null) {
                            this.iSelectEntries = entryArr2;
                            return converterSelectSlow;
                        }
                    }
                    int i15 = length << 1;
                    Entry[] entryArr3 = new Entry[i15];
                    for (int i16 = 0; i16 < length; i16++) {
                        Entry entry3 = entryArr2[i16];
                        Class<?> cls2 = entry3.iType;
                        if (cls2 == null) {
                            iHashCode2 = 0;
                        } else {
                            iHashCode2 = cls2.hashCode() & (i15 - 1);
                            while (entryArr3[iHashCode2] != null) {
                                iHashCode2++;
                                if (iHashCode2 >= i15) {
                                    iHashCode2 = 0;
                                }
                            }
                            entryArr3[iHashCode2] = entry3;
                        }
                    }
                    this.iSelectEntries = entryArr3;
                    return converterSelectSlow;
                }
                if (entry.iType == cls) {
                    return entry.iConverter;
                }
                iHashCode++;
                if (iHashCode >= length) {
                    iHashCode = 0;
                }
            }
        }
    }

    public int size() {
        return this.iConverters.length;
    }

    public ConverterSet remove(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (converter.equals(converterArr2[i14])) {
                return remove(i14, converterArr);
            }
        }
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return this;
    }
}
