package b32;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends b32.a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15677b;

    public class a extends RecyclerView.f0 {
        public a(g gVar, View view2) {
            super(view2);
        }
    }

    public g(int i14) {
        this.f15677b = i14;
    }

    @Override // b32.d
    public RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(this.f15677b, viewGroup, false));
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final e c(c cVar, int i14) {
        return this;
    }

    @Override // b32.e
    public void d(RecyclerView.f0 f0Var, int i14) {
    }

    @Override // b32.a, b32.d
    public final void e(c cVar) {
    }

    @Override // b32.d
    public int getItemCount() {
        return 1;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }

    @Override // b32.a, b32.d
    public boolean isVisible() {
        return true;
    }
}
