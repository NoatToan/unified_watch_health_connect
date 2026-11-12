package com.google.android.gms.dynamic;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class zac implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ DeferredLifecycleHelper zarj;
    private final /* synthetic */ Bundle zarl;

    zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.zarj = deferredLifecycleHelper;
        this.zarl = bundle;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.dynamic.DeferredLifecycleHelper.zab(com.google.android.gms.dynamic.DeferredLifecycleHelper):com.google.android.gms.dynamic.LifecycleDelegate
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:80)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 97 out of bounds for length 96
        	at java.base/java.util.ArrayList.add(ArrayList.java:485)
        	at java.base/java.util.ArrayList.add(ArrayList.java:497)
        	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:150)
        	at jadx.core.dex.visitors.InlineMethods.replaceClsUsage(InlineMethods.java:193)
        	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:185)
        	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:301)
        	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:164)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:93)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
        	... 1 more
        */
    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(com.google.android.gms.dynamic.LifecycleDelegate r2) {
        /*
            r1 = this;
            com.google.android.gms.dynamic.DeferredLifecycleHelper r2 = r1.zarj
            com.google.android.gms.dynamic.LifecycleDelegate r2 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zab(r2)
            android.os.Bundle r0 = r1.zarl
            r2.onCreate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.zac.zaa(com.google.android.gms.dynamic.LifecycleDelegate):void");
    }
}
