package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.nfc.widget.RecordListItemView;

/* JADX INFO: loaded from: classes9.dex */
public class gq3 extends s82<OrderData.OrderRecord> {
    public gq3(Context context) {
        super(context);
    }

    @Override // defpackage.s82
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(View view, int i, OrderData.OrderRecord orderRecord) {
        ((RecordListItemView) view).d(orderRecord);
    }

    @Override // defpackage.s82
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public View b(Context context, OrderData.OrderRecord orderRecord, ViewGroup viewGroup) {
        return new RecordListItemView(context);
    }
}
