package org.eclipse.californium.scandium.dtls;

import com.huawei.operation.utils.Constants;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class SupportedPointFormatsExtension extends HelloExtension {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SupportedPointFormatsExtension f44566b;
    private static final List<ECPointFormat> d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ECPointFormat> f44567c;

    static {
        List<ECPointFormat> listSingletonList = Collections.singletonList(ECPointFormat.UNCOMPRESSED);
        d = listSingletonList;
        f44566b = new SupportedPointFormatsExtension(listSingletonList);
    }

    private SupportedPointFormatsExtension(List<ECPointFormat> list) {
        super(HelloExtension.ExtensionType.EC_POINT_FORMATS);
        this.f44567c = list;
    }

    public boolean c(ECPointFormat eCPointFormat) {
        return this.f44567c.contains(eCPointFormat);
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        String strD = zzp.d(i + 1);
        String strD2 = zzp.d(i + 2);
        sb.append(strD);
        sb.append("Elliptic Curves Point Formats (");
        sb.append(this.f44567c.size());
        sb.append(" formats):");
        sb.append(zzp.c());
        for (ECPointFormat eCPointFormat : this.f44567c) {
            sb.append(strD2);
            sb.append("EC point format: ");
            sb.append(eCPointFormat);
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    protected int getExtensionLength() {
        return this.f44567c.size() + 1;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    protected void writeExtensionTo(zzl zzlVar) {
        zzlVar.d(this.f44567c.size(), 8);
        Iterator<ECPointFormat> it = this.f44567c.iterator();
        while (it.hasNext()) {
            zzlVar.d(it.next().getId(), 8);
        }
    }

    public static HelloExtension e(zzf zzfVar) {
        ArrayList arrayList = new ArrayList();
        zzf zzfVarD = zzfVar.d(zzfVar.a(8));
        while (zzfVarD.d()) {
            ECPointFormat eCPointFormatById = ECPointFormat.getECPointFormatById(zzfVarD.a(8));
            if (eCPointFormatById != null) {
                arrayList.add(eCPointFormatById);
            }
        }
        if (arrayList.size() == 1 && arrayList.contains(ECPointFormat.UNCOMPRESSED)) {
            return f44566b;
        }
        return new SupportedPointFormatsExtension(arrayList);
    }

    public enum ECPointFormat {
        UNCOMPRESSED(0),
        ANSIX962_COMPRESSED_PRIME(1),
        ANSIX962_COMPRESSED_CHAR2(2);

        private final int id;

        ECPointFormat(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = this.id;
            if (i == 0) {
                return "uncompressed (" + this.id + Constants.RIGHT_BRACKET_ONLY;
            }
            if (i == 1) {
                return "ansiX962_compressed_prime (" + this.id + Constants.RIGHT_BRACKET_ONLY;
            }
            if (i == 2) {
                return "ansiX962_compressed_char2 (" + this.id + Constants.RIGHT_BRACKET_ONLY;
            }
            return "";
        }

        public static ECPointFormat getECPointFormatById(int i) {
            if (i == 0) {
                return UNCOMPRESSED;
            }
            if (i == 1) {
                return ANSIX962_COMPRESSED_PRIME;
            }
            if (i != 2) {
                return null;
            }
            return ANSIX962_COMPRESSED_CHAR2;
        }
    }
}
