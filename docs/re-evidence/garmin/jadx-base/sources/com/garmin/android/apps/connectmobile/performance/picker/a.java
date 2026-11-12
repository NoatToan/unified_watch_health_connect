package com.garmin.android.apps.connectmobile.performance.picker;

import c53.l;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc53/l;", "Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$b;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$Adapter$getItems$1", f = "ItemPickerActivity.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class a extends h implements p<l<? super ItemPickerActivity.a.b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ItemPickerActivity.a f39994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ItemPickerActivity.a aVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f39994e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f39994e, dVar);
        aVar.f39993d = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(l<? super ItemPickerActivity.a.b> lVar, t13.d<? super Unit> dVar) {
        return ((a) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:13:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f39993d
            c53.l r0 = (c53.l) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r6.f39992c
            com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$a r3 = r6.f39994e
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 != r4) goto L17
            int r2 = r6.f39991b
            int r5 = r6.f39990a
            o13.r.b(r7)
            goto L41
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L1e:
            o13.r.b(r7)
            int r7 = r3.getItemCount()
            r2 = 0
            r5 = r2
            r2 = r7
        L28:
            if (r5 >= r2) goto L43
            int r7 = com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity.a.f39975d
            java.lang.Object r7 = r3.r(r5)
            com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$a$b r7 = (com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity.a.b) r7
            r6.f39993d = r0
            r6.f39990a = r5
            r6.f39991b = r2
            r6.f39992c = r4
            u13.a r7 = r0.a(r7, r6)
            if (r7 != r1) goto L41
            return r1
        L41:
            int r5 = r5 + r4
            goto L28
        L43:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.performance.picker.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
