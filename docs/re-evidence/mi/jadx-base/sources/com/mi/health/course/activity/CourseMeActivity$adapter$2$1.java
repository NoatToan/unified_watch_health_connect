package com.mi.health.course.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class CourseMeActivity$adapter$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public CourseMeActivity$adapter$2$1(Object obj) {
        super(0, obj, CourseMeActivity.class, "onSelectChange", "onSelectChange()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CourseMeActivity) this.receiver).onSelectChange();
    }
}
