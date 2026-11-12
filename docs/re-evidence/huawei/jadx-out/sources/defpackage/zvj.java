package defpackage;

import org.eclipse.californium.core.coap.OptionNumberRegistry;
import org.eclipse.californium.core.coap.option.BaseOptionDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zvj extends BaseOptionDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f54611a = {0, 0};

    public zvj(int i, String str) {
        super(i, str, OptionNumberRegistry.OptionFormat.EMPTY, true, f54611a);
    }

    @Override // org.eclipse.californium.core.coap.option.BaseOptionDefinition, org.eclipse.californium.core.coap.option.OptionDefinition
    public zvc create(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Option " + getName() + " value must not be null.");
        }
        if (bArr.length > 0) {
            throw new IllegalArgumentException("Option " + getName() + " value must be empty.");
        }
        return new zvc(this, zzg.f54809a);
    }
}
