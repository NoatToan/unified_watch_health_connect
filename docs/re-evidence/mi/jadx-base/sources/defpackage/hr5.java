package defpackage;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class hr5 extends BaseAdapter {
    public static final int d = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f20364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20365b;
    public final int c;

    public hr5() {
        Calendar calendarL = mlq.l();
        this.f20364a = calendarL;
        this.f20365b = calendarL.getMaximum(7);
        this.c = calendarL.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f20365b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.c;
        int i3 = this.f20365b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f20365b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(kwi.x, viewGroup, false);
        }
        this.f20364a.set(7, b(i));
        textView.setText(this.f20364a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(h2j.z), this.f20364a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
