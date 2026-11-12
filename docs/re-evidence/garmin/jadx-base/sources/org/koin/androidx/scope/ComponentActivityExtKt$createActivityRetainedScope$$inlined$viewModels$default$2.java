package org.koin.androidx.scope;

import androidx.lifecycle.y1;
import b.g;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2 extends w implements a<y1> {
    final /* synthetic */ g $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2(g gVar) {
        super(0);
        this.$this_viewModels = gVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final y1 invoke() {
        return this.$this_viewModels.getViewModelStore();
    }
}
