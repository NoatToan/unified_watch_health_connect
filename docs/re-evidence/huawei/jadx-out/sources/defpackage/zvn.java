package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.Arrays;
import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.OptionDefinition;
import org.eclipse.californium.core.coap.option.OptionRegistry;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class zvn extends zvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54615a = aaex.a((Class<?>) zvn.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f54616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OptionNumberRegistry.CustomOptionNumberRegistry f54617c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvn(boolean z, int[] iArr, OptionRegistry... optionRegistryArr) {
        super(new OptionDefinition[0]);
        this.d = z;
        OptionNumberRegistry.CustomOptionNumberRegistry customOptionNumberRegistryB = b(optionRegistryArr);
        this.f54617c = customOptionNumberRegistryB;
        if (customOptionNumberRegistryB != null && iArr == null) {
            iArr = customOptionNumberRegistryB.getCriticalCustomOptions();
        }
        if (iArr != null) {
            int[] iArr2 = (int[]) iArr.clone();
            this.f54616b = iArr2;
            Arrays.sort(iArr2);
        } else {
            this.f54616b = null;
        }
        for (OptionRegistry optionRegistry : optionRegistryArr) {
            b(optionRegistry);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvn(boolean z, OptionNumberRegistry.CustomOptionNumberRegistry customOptionNumberRegistry, OptionRegistry... optionRegistryArr) {
        int[] criticalCustomOptions;
        super(new OptionDefinition[0]);
        this.d = z;
        if (customOptionNumberRegistry != null) {
            this.f54617c = customOptionNumberRegistry;
            criticalCustomOptions = customOptionNumberRegistry.getCriticalCustomOptions();
        } else {
            OptionNumberRegistry.CustomOptionNumberRegistry customOptionNumberRegistryB = b(optionRegistryArr);
            this.f54617c = customOptionNumberRegistryB;
            criticalCustomOptions = customOptionNumberRegistryB != null ? customOptionNumberRegistryB.getCriticalCustomOptions() : null;
        }
        if (criticalCustomOptions != null) {
            int[] iArr = (int[]) criticalCustomOptions.clone();
            this.f54616b = iArr;
            Arrays.sort(iArr);
        } else {
            this.f54616b = null;
        }
        for (OptionRegistry optionRegistry : optionRegistryArr) {
            b(optionRegistry);
        }
    }

    private boolean c(int i) {
        int[] iArr = this.f54616b;
        return iArr == null || Arrays.binarySearch(iArr, i) >= 0;
    }

    @Override // defpackage.zvm
    public void b(OptionRegistry optionRegistry) {
        super.b(optionRegistry);
    }

    @Override // defpackage.zvm
    public void a(OptionDefinition optionDefinition) {
        super.a(optionDefinition);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zvm
    protected OptionDefinition d(int i) {
        boolean z;
        OptionNumberRegistry.CustomOptionNumberRegistry customOptionNumberRegistry = this.f54617c;
        d dVar = null;
        Object[] objArr = 0;
        if (customOptionNumberRegistry != null) {
            if (this.f54617c.toNumber(customOptionNumberRegistry.toString(i)) != -1) {
                dVar = new e(i, this.f54617c);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (dVar == null && this.d && (!OptionNumberRegistry.c(i) || c(i))) {
            dVar = new d(i);
        }
        if (!z) {
            return dVar;
        }
        try {
            a(dVar);
            f54615a.debug("{}/{} added.", Integer.valueOf(dVar.getNumber()), dVar.getName());
            return dVar;
        } catch (IllegalArgumentException unused) {
            return super.a(i);
        }
    }

    @Override // defpackage.zvm, org.eclipse.californium.core.coap.option.OptionRegistry
    public boolean contains(OptionDefinition optionDefinition) {
        if (super.contains(optionDefinition)) {
            return true;
        }
        if (this.d) {
            return optionDefinition instanceof d;
        }
        return false;
    }

    private static OptionNumberRegistry.CustomOptionNumberRegistry b(OptionRegistry... optionRegistryArr) {
        OptionNumberRegistry.CustomOptionNumberRegistry customOptionNumberRegistry = null;
        for (OptionRegistry optionRegistry : optionRegistryArr) {
            if (optionRegistry instanceof zvn) {
                if (customOptionNumberRegistry == null) {
                    customOptionNumberRegistry = ((zvn) optionRegistry).f54617c;
                } else if (customOptionNumberRegistry != ((zvn) optionRegistry).f54617c) {
                    throw new IllegalArgumentException("Ambiguous custom registry");
                }
            }
        }
        return customOptionNumberRegistry;
    }

    static class d implements OptionDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f54618a = {0, 65804};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54619c;
        private final String d;

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public boolean isSingleValue() {
            return true;
        }

        protected d(int i) {
            this(i, String.format("Unknown (%d)", Integer.valueOf(i)));
        }

        protected d(int i, String str) {
            this.f54619c = i;
            this.d = str;
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public OptionNumberRegistry.OptionFormat getFormat() {
            return OptionNumberRegistry.OptionFormat.UNKNOWN;
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public void assertValue(byte[] bArr) {
            int length = bArr.length;
            int[] valueLengths = getValueLengths();
            int i = valueLengths[0];
            int i2 = valueLengths.length == 1 ? i : valueLengths[1];
            if (length < i || length > i2) {
                if (i != i2) {
                    throw new IllegalArgumentException("Option " + getName() + " value of " + length + " bytes must be in range of [" + i + Constants.LINK + i2 + "] bytes.");
                }
                if (i == 0) {
                    throw new IllegalArgumentException("Option " + getName() + " value of " + length + " bytes must be empty.");
                }
                throw new IllegalArgumentException("Option " + getName() + " value of " + length + " bytes must be " + i + " bytes.");
            }
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public int[] getValueLengths() {
            return f54618a;
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public int getNumber() {
            return this.f54619c;
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public String getName() {
            return this.d;
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public zvc create(byte[] bArr) {
            return new zvc(this, bArr);
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public zvc create(String str) {
            return create(zvs.b(str));
        }

        @Override // org.eclipse.californium.core.coap.option.OptionDefinition
        public zvc create(long j) {
            return create(zvk.b(j));
        }

        public int hashCode() {
            return getNumber() + 16777216;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return getNumber() == dVar.getNumber() && getName().equals(dVar.getName());
        }
    }

    static class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OptionNumberRegistry.CustomOptionNumberRegistry f54620a;

        private e(int i, OptionNumberRegistry.CustomOptionNumberRegistry customOptionNumberRegistry) {
            super(i, customOptionNumberRegistry.toString(i));
            this.f54620a = customOptionNumberRegistry;
        }

        @Override // zvn.d, org.eclipse.californium.core.coap.option.OptionDefinition
        public OptionNumberRegistry.OptionFormat getFormat() {
            return this.f54620a.getFormatByNr(getNumber());
        }

        @Override // zvn.d, org.eclipse.californium.core.coap.option.OptionDefinition
        public boolean isSingleValue() {
            return this.f54620a.isSingleValue(getNumber());
        }

        @Override // zvn.d, org.eclipse.californium.core.coap.option.OptionDefinition
        public void assertValue(byte[] bArr) {
            super.assertValue(bArr);
            if (getFormat() == OptionNumberRegistry.OptionFormat.INTEGER) {
                this.f54620a.assertValue(getNumber(), zvk.e(bArr));
            }
        }

        @Override // zvn.d, org.eclipse.californium.core.coap.option.OptionDefinition
        public int[] getValueLengths() {
            int[] valueLengths = this.f54620a.getValueLengths(getNumber());
            return valueLengths == null ? super.getValueLengths() : valueLengths;
        }

        @Override // zvn.d, org.eclipse.californium.core.coap.option.OptionDefinition
        public String getName() {
            return this.f54620a.toString(getNumber());
        }
    }
}
