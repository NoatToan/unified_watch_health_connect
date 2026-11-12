package com.xiaomi.hm.health.lab.adapter;

import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaomi.hm.health.lab.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NmeaLogAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private static final int b = 1000;
    private static final int c = 100;
    private StringBuilder a;

    public NmeaLogAdapter() {
        super(R.layout.item_nmea_log, new LinkedList());
        this.a = new StringBuilder();
    }

    public void addNmeaData(@NonNull String str) {
        if (!str.contains("\r\n")) {
            this.a.append(str);
            return;
        }
        String[] strArrSplit = str.split("\r\n");
        if (strArrSplit.length > 0) {
            this.a.append(strArrSplit[0]);
            String string = this.a.toString();
            List<String> data = getData();
            data.add(string);
            if (data.size() > 1000) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 100; i++) {
                    arrayList.add(data.get(i));
                }
                ((LinkedList) data).removeAll(arrayList);
            }
            notifyDataSetChanged();
            StringBuilder sb = this.a;
            sb.delete(0, sb.length());
            if (strArrSplit.length > 1) {
                this.a.append(strArrSplit[1]);
            }
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, String str) {
        baseViewHolder.setText(R.id.tx_mark_times, str);
    }
}
