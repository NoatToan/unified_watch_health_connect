package com.roomorama.caldroid;

import android.view.View;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CaldroidListener {
    public void onCaldroidViewCreated() {
    }

    public void onChangeMonth(int i14, int i15) {
    }

    public void onLongClickDate(Date date, View view2) {
    }

    public abstract void onSelectDate(Date date, View view2);
}
