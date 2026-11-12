package defpackage;

import com.huawei.factory.MedalTypeAccessible;

/* JADX INFO: loaded from: classes23.dex */
public class crh {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 1, list:
      (r0v0 int) from 0x000c: IF  (r0v0 int) != (65 int)  -> B:4:0x000e A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public MedalTypeAccessible e(String str) {
        byte b2;
        str.hashCode();
        if (str.hashCode() != 65) {
            switch (str) {
                case "A2":
                    b2 = 1;
                    break;
                case "A3":
                    b2 = 2;
                    break;
                case "A4":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else if (str.equals("A")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            return new cri();
        }
        if (b2 == 3) {
            return new crq();
        }
        return new cri();
    }
}
