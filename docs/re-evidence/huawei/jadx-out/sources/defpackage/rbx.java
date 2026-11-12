package defpackage;

import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbx extends rbn {
    private static final long serialVersionUID = 6236452322340363024L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<rcb> f47108b = new ArrayList(8);
    protected DeclarationConstants.PartType d;

    public void b(DeclarationConstants.PartType partType) {
        this.d = partType;
    }

    public List<rcb> e() {
        return this.f47108b;
    }

    public void d(rcb rcbVar) {
        this.f47108b.add(rcbVar);
    }
}
