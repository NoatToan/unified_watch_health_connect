package defpackage;

import java.util.Arrays;
import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.OptionDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zvc implements Comparable<zvc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f54600a;
    private final OptionDefinition d;

    public zvc() {
        this.d = new zvl(0, "Reserved 0");
        a(zzg.f54809a);
    }

    @Deprecated
    public zvc(int i) {
        OptionDefinition definitionByNumber = zvo.a().getDefinitionByNumber(i);
        this.d = definitionByNumber;
        if (definitionByNumber != null) {
            return;
        }
        throw new IllegalArgumentException("Unkonwn " + i + " not supported!");
    }

    public zvc(OptionDefinition optionDefinition, byte[] bArr) {
        this.d = optionDefinition;
        a(bArr);
    }

    public zvc(zvs zvsVar, String str) {
        this.d = zvsVar;
        e(str);
    }

    public zvc(zvk zvkVar, long j) {
        this.d = zvkVar;
        c(j);
    }

    public OptionDefinition b() {
        return this.d;
    }

    public int d() {
        return this.d.getNumber();
    }

    public byte[] h() {
        byte[] bArr = this.f54600a;
        if (bArr != null) {
            return bArr;
        }
        throw new IllegalStateException(this.d.getName() + " option value must be set before!");
    }

    public String e() {
        return zvs.e(h());
    }

    public int a() {
        return zvk.a(h());
    }

    public long c() {
        return zvk.e(h());
    }

    public void a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException(this.d.getName() + " option value must not be null!");
        }
        this.d.assertValue(bArr);
        this.f54600a = bArr;
    }

    public void e(String str) {
        a(zvs.b(str));
    }

    public void c(long j) {
        a(zvk.b(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(zvc zvcVar) {
        return d() - zvcVar.d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zvc)) {
            return false;
        }
        zvc zvcVar = (zvc) obj;
        return this.d.equals(zvcVar.d) && Arrays.equals(this.f54600a, zvcVar.f54600a);
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + Arrays.hashCode(this.f54600a);
    }

    public String toString() {
        return this.d.getName() + ": " + i();
    }

    public String i() {
        if (this.f54600a == null) {
            return "not available";
        }
        int i = AnonymousClass5.d[this.d.getFormat().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "\"" + e() + "\"";
            }
            if (i == 3) {
                return "";
            }
            return "0x" + zzp.b(this.f54600a);
        }
        if (zvo.d.equals(this.d) || zvo.f54621a.equals(this.d)) {
            return "\"" + new zuv(this.f54600a) + "\"";
        }
        int iA = a();
        if (zvo.f54622b.equals(this.d) || zvo.f54623c.equals(this.d)) {
            return "\"" + zuz.a(iA) + "\"";
        }
        if (zvo.k.equals(this.d)) {
            return "\"" + new zva(iA) + "\"";
        }
        return Long.toString(c());
    }

    /* JADX INFO: renamed from: zvc$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[OptionNumberRegistry.OptionFormat.values().length];
            d = iArr;
            try {
                iArr[OptionNumberRegistry.OptionFormat.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[OptionNumberRegistry.OptionFormat.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[OptionNumberRegistry.OptionFormat.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
