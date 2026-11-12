package defpackage;

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
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class wc5 extends BaseAdapter implements Filterable, xc5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f37829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f37830b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context d;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int e;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public a f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DataSetObserver g;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public xc5 h;

    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            wc5.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            wc5 wc5Var = wc5.this;
            wc5Var.f37829a = true;
            wc5Var.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            wc5 wc5Var = wc5.this;
            wc5Var.f37829a = false;
            wc5Var.notifyDataSetInvalidated();
        }
    }

    public wc5(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // xc5.a
    public Cursor b() {
        return this.c;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f37830b = true;
        } else {
            this.f37830b = false;
        }
        boolean z = cursor != null;
        this.c = cursor;
        this.f37829a = z;
        this.d = context;
        this.e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f = new a();
            this.g = new b();
        } else {
            this.f = null;
            this.g = null;
        }
        if (z) {
            a aVar = this.f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f37829a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f37829a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            view = g(this.d, this.c, viewGroup);
        }
        e(view, this.d, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new xc5(this);
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f37829a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f37829a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f37829a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = h(this.d, this.c, viewGroup);
            }
            e(view, this.d, this.c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f37830b || (cursor = this.c) == null || cursor.isClosed()) {
            return;
        }
        this.f37829a = this.c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = cursor;
        if (cursor != null) {
            a aVar2 = this.f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.e = cursor.getColumnIndexOrThrow("_id");
            this.f37829a = true;
            notifyDataSetChanged();
        } else {
            this.e = -1;
            this.f37829a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
