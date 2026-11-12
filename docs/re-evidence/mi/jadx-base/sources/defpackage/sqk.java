package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class sqk extends wc5 {
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LayoutInflater f33891k;

    @Deprecated
    public sqk(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.j = i;
        this.i = i;
        this.f33891k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.wc5
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f33891k.inflate(this.j, viewGroup, false);
    }

    @Override // defpackage.wc5
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f33891k.inflate(this.i, viewGroup, false);
    }
}
