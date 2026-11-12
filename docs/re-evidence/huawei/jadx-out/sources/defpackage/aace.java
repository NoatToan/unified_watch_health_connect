package defpackage;

import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.scandium.dtls.HelloExtension;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public final class aace extends HelloExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<XECDHECryptography.SupportedGroup> f120a;

    public aace(List<XECDHECryptography.SupportedGroup> list) {
        super(HelloExtension.ExtensionType.ELLIPTIC_CURVES);
        this.f120a = list;
    }

    public List<XECDHECryptography.SupportedGroup> d() {
        return this.f120a;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public String toString(int i) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        String strD = zzp.d(i + 1);
        String strD2 = zzp.d(i + 2);
        sb.append(strD);
        sb.append("Elliptic Curves (");
        sb.append(this.f120a.size());
        sb.append(" curves):");
        sb.append(zzp.c());
        for (XECDHECryptography.SupportedGroup supportedGroup : this.f120a) {
            sb.append(strD2);
            sb.append("Elliptic Curve: ");
            sb.append(supportedGroup.name());
            sb.append(" (");
            sb.append(supportedGroup.getId());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public int getExtensionLength() {
        return (this.f120a.size() * 2) + 2;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloExtension
    public void writeExtensionTo(zzl zzlVar) {
        zzlVar.d(this.f120a.size() * 2, 16);
        Iterator<XECDHECryptography.SupportedGroup> it = this.f120a.iterator();
        while (it.hasNext()) {
            zzlVar.d(it.next().getId(), 16);
        }
    }

    public static aace a(zzf zzfVar) {
        ArrayList arrayList = new ArrayList();
        zzf zzfVarD = zzfVar.d(zzfVar.a(16));
        while (zzfVarD.d()) {
            XECDHECryptography.SupportedGroup supportedGroupFromId = XECDHECryptography.SupportedGroup.fromId(zzfVarD.a(16));
            if (supportedGroupFromId != null) {
                arrayList.add(supportedGroupFromId);
            }
        }
        return new aace(Collections.unmodifiableList(arrayList));
    }
}
