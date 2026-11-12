package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tsmclient.smartcard.model.TradeLog;
import com.xiaomi.fitness.nfc.widget.RecordListItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class qei extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31438b;
    public List<TradeLog> c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecordListItemView f31439a;
    }

    public qei(Context context, boolean z) {
        this.f31437a = context;
        this.f31438b = z;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TradeLog getItem(int i) {
        return this.c.get(i);
    }

    public void b(List<TradeLog> list) {
        if (list == null) {
            return;
        }
        this.c.clear();
        if (this.f31438b) {
            for (TradeLog tradeLog : list) {
                if (tradeLog.getTradeType() == 1) {
                    this.c.add(tradeLog);
                }
            }
        } else {
            this.c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            aVar = new a();
            RecordListItemView recordListItemView = new RecordListItemView(this.f31437a);
            aVar.f31439a = recordListItemView;
            recordListItemView.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f31439a.d(this.c.get(i));
        return aVar.f31439a;
    }
}
