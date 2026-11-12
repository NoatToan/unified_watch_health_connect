package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class d64 extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f15126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f15127b;
    public ImageView c;

    public d64(View view) {
        super(view);
        this.f15126a = (ImageView) view.findViewById(eri.C7);
        this.f15127b = (TextView) view.findViewById(eri.Kn);
        this.c = (ImageView) view.findViewById(eri.u7);
    }

    public void a(int i, String str, int i2) {
        if (i != -1) {
            this.f15126a.setImageResource(i);
        } else {
            this.f15126a.setVisibility(8);
        }
        this.f15127b.setText(str);
        this.c.setVisibility(i2);
    }
}
