package q7;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f143212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f143213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f143214k;

    @Deprecated
    public c(Context context, int i14, Cursor cursor) {
        super(context, cursor);
        this.f143213j = i14;
        this.f143212i = i14;
        this.f143214k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // q7.a
    public final View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f143214k.inflate(this.f143213j, viewGroup, false);
    }

    @Override // q7.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f143214k.inflate(this.f143212i, viewGroup, false);
    }

    @Deprecated
    public c(Context context, int i14, Cursor cursor, boolean z14) {
        super(context, cursor, z14);
        this.f143213j = i14;
        this.f143212i = i14;
        this.f143214k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i14, Cursor cursor, int i15) {
        super(context, cursor, i15);
        this.f143213j = i14;
        this.f143212i = i14;
        this.f143214k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
