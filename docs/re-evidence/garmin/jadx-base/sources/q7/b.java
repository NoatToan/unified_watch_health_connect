package q7;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public class b extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f143211a;

    public interface a {
        void a(Cursor cursor);

        Cursor c(CharSequence charSequence);

        String convertToString(Cursor cursor);
    }

    public b(a aVar) {
        this.f143211a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f143211a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorC = this.f143211a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorC != null) {
            filterResults.count = cursorC.getCount();
            filterResults.values = cursorC;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f143211a;
        Cursor cursor = ((q7.a) aVar).f143203c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        aVar.a((Cursor) obj);
    }
}
