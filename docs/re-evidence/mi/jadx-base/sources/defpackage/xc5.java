package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public class xc5 extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f38964a;

    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public xc5(a aVar) {
        this.f38964a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f38964a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorD = this.f38964a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorD != null) {
            filterResults.count = cursorD.getCount();
            filterResults.values = cursorD;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorB = this.f38964a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.f38964a.a((Cursor) obj);
    }
}
