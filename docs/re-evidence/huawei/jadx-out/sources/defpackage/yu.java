package defpackage;

import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class yu implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f53881c = CoercionInputShape.values().length;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final CoercionAction[] f53883b = new CoercionAction[f53881c];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f53882a = false;

    public CoercionAction d(CoercionInputShape coercionInputShape) {
        return this.f53883b[coercionInputShape.ordinal()];
    }

    public Boolean b() {
        return this.f53882a;
    }
}
