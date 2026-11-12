package q7;

import am.j;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.q0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, q7.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f143201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f143202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f143203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f143204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f143205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2693a f143206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f143207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q7.b f143208h;

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    public class C2693a extends ContentObserver {
        public C2693a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z14) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f143202b || (cursor = aVar.f143203c) == null || cursor.isClosed()) {
                return;
            }
            aVar.f143201a = aVar.f143203c.requery();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f143201a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f143201a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z14) {
        e(context, cursor, z14 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursor2 = this.f143203c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C2693a c2693a = this.f143206f;
                if (c2693a != null) {
                    cursor2.unregisterContentObserver(c2693a);
                }
                b bVar = this.f143207g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f143203c = cursor;
            if (cursor != null) {
                C2693a c2693a2 = this.f143206f;
                if (c2693a2 != null) {
                    cursor.registerContentObserver(c2693a2);
                }
                b bVar2 = this.f143207g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f143205e = cursor.getColumnIndexOrThrow("_id");
                this.f143201a = true;
                notifyDataSetChanged();
            } else {
                this.f143205e = -1;
                this.f143201a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public Cursor c(CharSequence charSequence) {
        return this.f143203c;
    }

    public String convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view2, Cursor cursor);

    public final void e(Context context, Cursor cursor, int i14) {
        if ((i14 & 1) == 1) {
            i14 |= 2;
            this.f143202b = true;
        } else {
            this.f143202b = false;
        }
        boolean z14 = cursor != null;
        this.f143203c = cursor;
        this.f143201a = z14;
        this.f143204d = context;
        this.f143205e = z14 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i14 & 2) == 2) {
            this.f143206f = new C2693a();
            this.f143207g = new b();
        } else {
            this.f143206f = null;
            this.f143207g = null;
        }
        if (z14) {
            C2693a c2693a = this.f143206f;
            if (c2693a != null) {
                cursor.registerContentObserver(c2693a);
            }
            b bVar = this.f143207g;
            if (bVar != null) {
                cursor.registerDataSetObserver(bVar);
            }
        }
    }

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return g(context, cursor, viewGroup);
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f143201a || (cursor = this.f143203c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i14, View view2, ViewGroup viewGroup) {
        if (!this.f143201a) {
            return null;
        }
        this.f143203c.moveToPosition(i14);
        if (view2 == null) {
            view2 = f(this.f143204d, this.f143203c, viewGroup);
        }
        d(view2, this.f143203c);
        return view2;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f143208h == null) {
            this.f143208h = new q7.b(this);
        }
        return this.f143208h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i14) {
        Cursor cursor;
        if (!this.f143201a || (cursor = this.f143203c) == null) {
            return null;
        }
        cursor.moveToPosition(i14);
        return this.f143203c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        Cursor cursor;
        if (this.f143201a && (cursor = this.f143203c) != null && cursor.moveToPosition(i14)) {
            return this.f143203c.getLong(this.f143205e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        if (!this.f143201a) {
            h.z("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f143203c.moveToPosition(i14)) {
            h.z(j.h(i14, "couldn't move cursor to position "));
            return null;
        }
        if (view2 == null) {
            view2 = g(this.f143204d, this.f143203c, viewGroup);
        }
        d(view2, this.f143203c);
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return !(this instanceof q0);
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        e(context, cursor, 1);
    }

    public a(Context context, Cursor cursor, int i14) {
        e(context, cursor, i14);
    }
}
