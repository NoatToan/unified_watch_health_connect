package defpackage;

import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import miuix.appcompat.internal.view.menu.f;

/* JADX INFO: loaded from: classes3.dex */
public class eoc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16875b;

    public eoc(f fVar, int i) {
        this.f16874a = fVar;
        this.f16875b = i;
    }

    public int a() {
        return this.f16875b;
    }

    public f b() {
        return this.f16874a;
    }

    public eoc(f fVar) {
        this.f16874a = fVar;
        if (fVar != null) {
            this.f16875b = fVar.getItemId();
        } else {
            this.f16875b = OTAErrorCode.READ_FRIMWARE_VERSION_FAIL;
        }
    }
}
