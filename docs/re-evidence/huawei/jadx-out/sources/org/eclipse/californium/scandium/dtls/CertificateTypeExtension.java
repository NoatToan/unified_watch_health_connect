package org.eclipse.californium.scandium.dtls;

import defpackage.aacx;
import defpackage.aaex;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CertificateTypeExtension extends HelloExtension {
    protected static final int EXTENSION_TYPE_BITS = 8;
    protected static final int LIST_FIELD_LENGTH_BITS = 8;
    protected final List<CertificateType> certificateTypes;
    private final boolean isClientExtension;
    private static final Logger LOG = aaex.a((Class<?>) CertificateTypeExtension.class);
    public static final List<CertificateType> EMPTY = Collections.EMPTY_LIST;
    public static final List<CertificateType> DEFAULT_X509 = asList(CertificateType.X_509);

    public CertificateTypeExtension(HelloExtension.ExtensionType extensionType, zzf zzfVar) {
        List listAsList;
        super(extensionType);
        if (zzfVar == null) {
            throw new NullPointerException("extension data must not be null!");
        }
        if (!zzfVar.d()) {
            throw new IllegalArgumentException("extension data must not be empty!");
        }
        boolean z = zzfVar.b() > 8;
        this.isClientExtension = z;
        if (z) {
            int iA = zzfVar.a(8);
            listAsList = new ArrayList(iA);
            zzf zzfVarD = zzfVar.d(iA);
            while (zzfVarD.d()) {
                int iA2 = zzfVarD.a(8);
                CertificateType typeFromCode = CertificateType.getTypeFromCode(iA2);
                if (typeFromCode != null) {
                    listAsList.add(typeFromCode);
                } else {
                    LOG.debug("Client indicated preference for unknown {} certificate type code [{}]", getType().equals(HelloExtension.ExtensionType.CLIENT_CERT_TYPE) ? "client" : "server", Integer.valueOf(iA2));
                }
            }
            if (listAsList.isEmpty()) {
                throw new IllegalArgumentException("Empyt client certificate types!");
            }
        } else {
            int iA3 = zzfVar.a(8);
            CertificateType typeFromCode2 = CertificateType.getTypeFromCode(iA3);
            if (typeFromCode2 != null) {
                listAsList = asList(typeFromCode2);
            } else {
                LOG.debug("Server selected an unknown {} certificate type code [{}]", getType().equals(HelloExtension.ExtensionType.CLIENT_CERT_TYPE) ? "client" : "server", Integer.valueOf(iA3));
                throw new IllegalArgumentException("unknown certificate type code " + iA3 + "!");
            }
        }
        this.certificateTypes = aacx.e(listAsList);
    }

    public CertificateTypeExtension(HelloExtension.ExtensionType extensionType, List<CertificateType> list) {
        super(extensionType);
        if (list == null) {
            throw new NullPointerException("certificate types must not be null!");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("certificate types data must not be empty!");
        }
        this.isClientExtension = true;
        this.certificateTypes = list;
    }

    public CertificateTypeExtension(HelloExtension.ExtensionType extensionType, CertificateType certificateType) {
        super(extensionType);
        if (certificateType == null) {
            throw new NullPointerException("certificate type must not be null!");
        }
        this.isClientExtension = false;
        this.certificateTypes = asList(certificateType);
    }

    public boolean isClientExtension() {
        return this.isClientExtension;
    }

    public List<CertificateType> getCertificateTypes() {
        return this.certificateTypes;
    }

    public CertificateType getCertificateType() {
        return this.certificateTypes.get(0);
    }

    public boolean contains(CertificateType certificateType) {
        return this.certificateTypes.contains(certificateType);
    }

    public List<CertificateType> getCommonCertificateTypes(List<CertificateType> list) {
        ArrayList arrayList = new ArrayList();
        for (CertificateType certificateType : this.certificateTypes) {
            if (list.contains(certificateType)) {
                arrayList.add(certificateType);
            }
        }
        return arrayList;
    }

    public String toString(int i, String str) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        String strD = zzp.d(i + 1);
        if (isClientExtension()) {
            sb.append(strD);
            sb.append(str);
            sb.append(" certificate types: (");
            sb.append(getCertificateTypes().size());
            sb.append(" types)");
            sb.append(zzp.c());
            String strD2 = zzp.d(i + 2);
            for (CertificateType certificateType : getCertificateTypes()) {
                sb.append(strD2);
                sb.append(str);
                sb.append(" certificate type: ");
                sb.append(certificateType);
                sb.append(zzp.c());
            }
        } else {
            sb.append(strD);
            sb.append(str);
            sb.append(" certificate type: ");
            sb.append(getCertificateType());
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    protected int getExtensionLength() {
        if (this.isClientExtension) {
            return this.certificateTypes.size() + 1;
        }
        return 1;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    protected void writeExtensionTo(zzl zzlVar) {
        if (this.isClientExtension) {
            zzlVar.d(this.certificateTypes.size(), 8);
            Iterator<CertificateType> it = this.certificateTypes.iterator();
            while (it.hasNext()) {
                zzlVar.d(it.next().getCode(), 8);
            }
            return;
        }
        zzlVar.d(this.certificateTypes.get(0).getCode(), 8);
    }

    private static List<CertificateType> asList(CertificateType certificateType) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(certificateType);
        return arrayList;
    }
}
