package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class gzm extends RecyclerView.d0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f19502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f19503b;
    public final ImageView c;
    public final Context d;
    public final View e;
    public final View f;
    public final ImageView g;
    public final AppCompatSeekBar h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public yym f19504k;
    public azm.e l;
    public azm.d m;
    public boolean n;

    public gzm(View view) {
        super(view);
        this.d = view.getContext();
        this.e = view.findViewById(eri.me);
        this.f = view.findViewById(eri.N);
        this.g = (ImageView) view.findViewById(eri.z8);
        this.f19502a = (TextView) view.findViewById(eri.bn);
        this.f19503b = (TextView) view.findViewById(eri.Mm);
        this.c = (ImageView) view.findViewById(eri.b9);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) view.findViewById(eri.Re);
        this.h = appCompatSeekBar;
        this.i = (TextView) view.findViewById(eri.Gm);
        this.j = (TextView) view.findViewById(eri.al);
        appCompatSeekBar.setOnTouchListener(new View.OnTouchListener() { // from class: dzm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return gzm.k(view2, motionEvent);
            }
        });
        initView();
    }

    private void initView() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: fzm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18400a.j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean k(View view, MotionEvent motionEvent) {
        return true;
    }

    public void f(yym yymVar) {
        this.f19504k = yymVar;
        String dateStr = TimeDateUtil.getDateStr(yymVar.c(), TimeUtils.FORMAT_H_M);
        this.f19502a.setText(yymVar.b() == 1 ? String.format(Locale.US, "%s %s", this.d.getString(c0j.nk), dateStr) : String.format(Locale.US, "%s %s", this.d.getString(c0j.zf), dateStr));
        this.f19503b.setText(TimeDateUtil.getZNTimeWithSec(yymVar.d()));
        if (yymVar.e) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: bzm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4753a.h(view);
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: czm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14892a.i(view);
            }
        });
    }

    public final String g(long j) {
        return j > 0 ? TimeUtils.formatDate("mm:ss", Long.valueOf(j)) : "";
    }

    public final /* synthetic */ void h(View view) {
        azm.d dVar = this.m;
        if (dVar == null) {
            return;
        }
        if (this.n) {
            dVar.b();
        } else {
            dVar.c();
        }
    }

    public final /* synthetic */ void j(View view) {
        azm.e eVar = this.l;
        if (eVar != null) {
            yym yymVar = this.f19504k;
            eVar.c(yymVar, !yymVar.e);
        }
    }

    public final /* synthetic */ boolean l(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == eri.eg) {
            n();
            return true;
        }
        if (itemId != eri.dg) {
            return true;
        }
        m();
        return true;
    }

    public final void m() {
        azm.e eVar = this.l;
        if (eVar != null) {
            eVar.a(this.f19504k);
        }
    }

    public final void n() {
        azm.e eVar = this.l;
        if (eVar != null) {
            eVar.b(this.f19504k);
        }
    }

    public void o(azm.e eVar) {
        this.l = eVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        azm.d dVar = this.m;
        if (dVar == null || !z) {
            return;
        }
        dVar.a(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void p(azm.d dVar) {
        this.m = dVar;
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(View view) {
        a4i a4iVar = new a4i(this.d, view);
        a4iVar.f(nwi.i);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: ezm
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f17229a.l(menuItem);
            }
        });
        a4iVar.g();
    }

    public void r(boolean z) {
        this.n = z;
        if (z) {
            this.g.setBackgroundResource(pni.Q1);
        } else {
            this.g.setBackgroundResource(pni.R1);
        }
    }

    public void s(int i, long j) {
        this.h.setMax((int) j);
        this.h.setProgress(i);
        this.i.setText(g(i));
        this.j.setText(g(j));
    }

    public void updateProgress(int i) {
        this.h.setProgress(i);
    }
}
