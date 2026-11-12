package defpackage;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class ob4 extends h00 implements Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28951b;

    public ob4(jc4 jc4Var, boolean z) {
        super(jc4Var);
        this.f28951b = z;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.h00
    public String c0() {
        return this.f28951b ? "true" : "false";
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public ob4 T(jc4 jc4Var) {
        return new ob4(jc4Var, this.f28951b);
    }

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Boolean x() {
        return Boolean.valueOf(this.f28951b);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.BOOLEAN;
    }
}
