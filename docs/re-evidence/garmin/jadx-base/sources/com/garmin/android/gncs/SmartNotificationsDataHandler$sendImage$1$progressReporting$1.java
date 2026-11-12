package com.garmin.android.gncs;

import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "progress", "", "total", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SmartNotificationsDataHandler$sendImage$1$progressReporting$1 extends w implements p<Integer, Integer, Unit> {
    final /* synthetic */ SmartNotificationsDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartNotificationsDataHandler$sendImage$1$progressReporting$1(SmartNotificationsDataHandler smartNotificationsDataHandler) {
        super(2);
        this.this$0 = smartNotificationsDataHandler;
    }

    public final void invoke(int i14, int i15) {
        ih2.b.b(this.this$0.mmsLogTag + " sendImage -> progress: " + i14 + " of " + i15);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }
}
