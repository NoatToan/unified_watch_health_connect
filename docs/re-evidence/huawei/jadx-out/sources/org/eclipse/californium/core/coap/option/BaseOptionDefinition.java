package org.eclipse.californium.core.coap.option;

import com.huawei.openalliance.ad.constant.Constants;
import defpackage.zvc;
import java.util.Arrays;
import org.eclipse.californium.core.coap.OptionNumberRegistry;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseOptionDefinition implements OptionDefinition {
    private static final int[] LENGTHS = {0, 65804};
    private final OptionNumberRegistry.OptionFormat format;
    private final int[] lengths;
    private final String name;
    private final int number;
    private final boolean singleValue;

    public BaseOptionDefinition(int i, String str, OptionNumberRegistry.OptionFormat optionFormat, boolean z, int[] iArr) {
        if (i > 65535 || i < 0) {
            throw new IllegalArgumentException(i + " invalid option number!");
        }
        this.number = i;
        this.name = str;
        this.format = optionFormat;
        this.singleValue = z;
        if (iArr == null || iArr.length == 0) {
            this.lengths = LENGTHS;
        } else if (iArr.length == 1) {
            this.lengths = new int[]{iArr[0], iArr[0]};
        } else {
            this.lengths = Arrays.copyOf(iArr, 2);
        }
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public OptionNumberRegistry.OptionFormat getFormat() {
        return this.format;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public boolean isSingleValue() {
        return this.singleValue;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public final int[] getValueLengths() {
        return this.lengths;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public void assertValue(byte[] bArr) {
        int[] iArr = this.lengths;
        int i = iArr[0];
        int i2 = iArr[1];
        int length = bArr.length;
        if (getFormat() == OptionNumberRegistry.OptionFormat.INTEGER) {
            int length2 = bArr.length;
            for (int i3 = 0; i3 < length2 && bArr[i3] == 0; i3++) {
                length--;
            }
        }
        if (length < i || length > i2) {
            if (i != i2) {
                throw new IllegalArgumentException("Option " + this.name + " value of " + length + " bytes must be in range of [" + i + Constants.LINK + i2 + "] bytes.");
            }
            if (i == 0) {
                throw new IllegalArgumentException("Option " + this.name + " value of " + length + " bytes must be empty.");
            }
            throw new IllegalArgumentException("Option " + this.name + " value of " + length + " bytes must be " + i + " bytes.");
        }
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public String toString() {
        return this.name + "/" + this.format;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public int getNumber() {
        return this.number;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public String getName() {
        return this.name;
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public zvc create(byte[] bArr) {
        return new zvc(this, bArr);
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public zvc create(String str) {
        throw new IllegalArgumentException(getClass().getSimpleName() + " doesn't support string-values!");
    }

    @Override // org.eclipse.californium.core.coap.option.OptionDefinition
    public zvc create(long j) {
        throw new IllegalArgumentException(getClass().getSimpleName() + " doesn't support integer-values!");
    }
}
