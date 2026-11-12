package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import e23.p;
import java.util.Iterator;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel$getUserPace$1", f = "MultiSportViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f49157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f49158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map.Entry f49159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f49162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f49162f = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f49162f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:14:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
