package defpackage;

import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;

/* JADX INFO: loaded from: classes8.dex */
public class vfs extends a6t {
    public vfs(jet jetVar) {
        super(jetVar);
    }

    public boolean a(HMMusicControl hMMusicControl) {
        if (hMMusicControl == null) {
            return false;
        }
        byte[] bleBytes = hMMusicControl.toBleBytes();
        t5t.d("HMAMCProfile", "cmd: " + tet.x(bleBytes));
        if (bleBytes == null || bleBytes.length == 0 || !isSupportPatchWrite()) {
            return false;
        }
        return patchWrite(bleBytes, 3);
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return false;
    }

    @Override // defpackage.a6t
    public boolean init() {
        return false;
    }
}
