package b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14122a;

    public /* synthetic */ y0(int i14) {
        this.f14122a = i14;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v50 androidx.camera.core.impl.i2, still in use, count: 2, list:
          (r2v50 androidx.camera.core.impl.i2) from 0x0096: MOVE (r18v8 androidx.camera.core.impl.i2) = (r2v50 androidx.camera.core.impl.i2)
          (r2v50 androidx.camera.core.impl.i2) from 0x008a: MOVE (r18v12 androidx.camera.core.impl.i2) = (r2v50 androidx.camera.core.impl.i2)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // k7.b
    public final void accept(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.y0.accept(java.lang.Object):void");
    }
}
