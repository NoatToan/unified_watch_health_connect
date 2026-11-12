package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: loaded from: classes.dex */
public class b extends CursorAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f4650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController f4651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f4652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlertController.b bVar, Context context, Cursor cursor, boolean z14, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, z14);
        this.f4652e = bVar;
        this.f4650c = recycleListView;
        this.f4651d = alertController;
        Cursor cursor2 = getCursor();
        this.f4648a = cursor2.getColumnIndexOrThrow(bVar.K);
        this.f4649b = cursor2.getColumnIndexOrThrow(bVar.L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view2, Context context, Cursor cursor) {
        ((CheckedTextView) view2.findViewById(R.id.text1)).setText(cursor.getString(this.f4648a));
        this.f4650c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f4649b) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4652e.f4620b.inflate(this.f4651d.L, viewGroup, false);
    }
}
