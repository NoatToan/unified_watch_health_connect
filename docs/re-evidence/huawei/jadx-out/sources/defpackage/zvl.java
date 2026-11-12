package defpackage;

import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.BaseOptionDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zvl extends BaseOptionDefinition {
    public zvl(int i, String str) {
        this(i, str, true, null);
    }

    public zvl(int i, String str, boolean z, int... iArr) {
        super(i, str, OptionNumberRegistry.OptionFormat.OPAQUE, z, iArr);
    }
}
