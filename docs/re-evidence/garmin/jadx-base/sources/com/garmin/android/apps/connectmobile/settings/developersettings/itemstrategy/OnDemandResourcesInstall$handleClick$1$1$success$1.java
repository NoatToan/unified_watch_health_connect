package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import c22.d2;
import c22.u0;
import e23.p;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$1$1$success$1", f = "OnDemandResourcesInstall.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class OnDemandResourcesInstall$handleClick$1$1$success$1 extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {
    final /* synthetic */ d2 $installer;
    final /* synthetic */ List<u0> $notInstalledYetTags;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandResourcesInstall$handleClick$1$1$success$1(List<? extends u0> list, d2 d2Var, t13.d<? super OnDemandResourcesInstall$handleClick$1$1$success$1> dVar) {
        super(2, dVar);
        this.$notInstalledYetTags = list;
        this.$installer = d2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new OnDemandResourcesInstall$handleClick$1$1$success$1(this.$notInstalledYetTags, this.$installer, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((OnDemandResourcesInstall$handleClick$1$1$success$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007f -> B:16:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r1 = r10.I$1
            int r4 = r10.I$0
            java.lang.Object r5 = r10.L$7
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r10.L$6
            c22.u0 r6 = (c22.u0) r6
            java.lang.Object r6 = r10.L$4
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r10.L$3
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r8 = r10.L$2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r10.L$1
            c22.d2 r8 = (c22.d2) r8
            java.lang.Object r9 = r10.L$0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            o13.r.b(r11)
            goto L80
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
        L33:
            r11 = 0
            return r11
        L35:
            o13.r.b(r11)
            java.util.List<c22.u0> r11 = r10.$notInstalledYetTags
            c22.d2 r1 = r10.$installer
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p13.y.r(r11, r5)
            r4.<init>(r5)
            java.util.Iterator r11 = r11.iterator()
            r6 = r11
            r8 = r1
            r1 = r3
            r5 = r4
            r4 = r1
        L50:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L8a
            java.lang.Object r11 = r6.next()
            c22.u0 r11 = (c22.u0) r11
            r7 = r8
            c22.h1 r7 = (c22.h1) r7
            r9 = 0
            r10.L$0 = r9
            r10.L$1 = r8
            r10.L$2 = r9
            r10.L$3 = r5
            r10.L$4 = r6
            r10.L$5 = r9
            r10.L$6 = r9
            r10.L$7 = r5
            r10.I$0 = r4
            r10.I$1 = r1
            r10.I$2 = r3
            r10.label = r2
            java.lang.Object r11 = r7.b(r11, r10)
            if (r11 != r0) goto L7f
            return r0
        L7f:
            r7 = r5
        L80:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.booleanValue()
            r5.add(r11)
            r5 = r7
            goto L50
        L8a:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r11 = r5.iterator()
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r11.next()
        L9a:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r11.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 & r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L9a
        Lb6:
            return r0
        Lb7:
            java.lang.String r11 = "Empty collection can't be reduced."
            org.apache.commons.lang3.e.w(r11)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$1$1$success$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
