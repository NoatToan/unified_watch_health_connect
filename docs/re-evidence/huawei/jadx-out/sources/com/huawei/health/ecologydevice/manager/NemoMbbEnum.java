package com.huawei.health.ecologydevice.manager;

import com.huawei.health.ecologydevice.util.ProtocolUtils;
import defpackage.elf;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TYPE02' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes27.dex */
public abstract class NemoMbbEnum {
    private static final char F_F = 255;
    public static final NemoMbbEnum TYPE02;
    public static final NemoMbbEnum TYPE03;
    public static final NemoMbbEnum TYPE07;
    public static final NemoMbbEnum TYPE09;
    private final int type;
    public static final NemoMbbEnum TYPE0A = new NemoMbbEnum("TYPE0A", 4, 10) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.5
        @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
        public void onParseDeviceInfo(elf elfVar, int i, byte[] bArr) {
            elfVar.e(new String(bArr, StandardCharsets.UTF_8));
        }
    };
    public static final NemoMbbEnum TYPE0F = new NemoMbbEnum("TYPE0F", 5, 15) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.6
        @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
        public void onParseDeviceInfo(elf elfVar, int i, byte[] bArr) {
            elfVar.a(new String(bArr, StandardCharsets.UTF_8));
        }
    };
    public static final NemoMbbEnum TYPE19 = new NemoMbbEnum("TYPE19", 6, 25) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.7
        @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
        public void onParseDeviceInfo(elf elfVar, int i, byte[] bArr) {
            if (i != 1) {
                return;
            }
            elfVar.b(ProtocolUtils.a(bArr[0]));
        }
    };
    private static final /* synthetic */ NemoMbbEnum[] $VALUES = $values();

    public abstract void onParseDeviceInfo(elf elfVar, int i, byte[] bArr);

    private static /* synthetic */ NemoMbbEnum[] $values() {
        return new NemoMbbEnum[]{TYPE02, TYPE03, TYPE07, TYPE09, TYPE0A, TYPE0F, TYPE19};
    }

    public static NemoMbbEnum valueOf(String str) {
        return (NemoMbbEnum) Enum.valueOf(NemoMbbEnum.class, str);
    }

    public static NemoMbbEnum[] values() {
        return (NemoMbbEnum[]) $VALUES.clone();
    }

    static {
        int i = 2;
        TYPE02 = new NemoMbbEnum("TYPE02", 0, i) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.1
            @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
            public void onParseDeviceInfo(elf elfVar, int i2, byte[] bArr) {
                if (i2 == 1) {
                    elfVar.d(bArr[0] & 255);
                }
            }
        };
        int i2 = 3;
        TYPE03 = new NemoMbbEnum("TYPE03", 1, i2) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.2
            @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
            public void onParseDeviceInfo(elf elfVar, int i3, byte[] bArr) {
                elfVar.g(new String(bArr, StandardCharsets.UTF_8));
            }
        };
        TYPE07 = new NemoMbbEnum("TYPE07", i, 7) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.3
            @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
            public void onParseDeviceInfo(elf elfVar, int i3, byte[] bArr) {
                elfVar.c(new String(bArr, StandardCharsets.UTF_8));
            }
        };
        TYPE09 = new NemoMbbEnum("TYPE09", i2, 9) { // from class: com.huawei.health.ecologydevice.manager.NemoMbbEnum.4
            @Override // com.huawei.health.ecologydevice.manager.NemoMbbEnum
            public void onParseDeviceInfo(elf elfVar, int i3, byte[] bArr) {
                elfVar.d(new String(bArr, StandardCharsets.UTF_8));
            }
        };
    }

    private NemoMbbEnum(String str, int i, int i2) {
        super(str, i);
        this.type = i2;
    }

    public static NemoMbbEnum valueOf(int i) {
        NemoMbbEnum nemoMbbEnum = null;
        for (NemoMbbEnum nemoMbbEnum2 : values()) {
            if (nemoMbbEnum2.type == i) {
                nemoMbbEnum = nemoMbbEnum2;
            }
        }
        return nemoMbbEnum;
    }
}
