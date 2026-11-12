package ya2;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import i.c;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wa2.b;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lya2/a;", "Li/c;", "<init>", "()V", "Landroid/view/View;", "view", "", "applyTopInsets", "(Landroid/view/View;)V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f195635c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f195636a = new b("ExportableReportsBaseActivity", null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f195637b;

    public final boolean O9() {
        this.f195636a.getClass();
        return !isFinishing();
    }

    public final void P9(Integer num, String str) {
        this.f195636a.getClass();
        i.a supportActionBar = getSupportActionBar();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        View viewFindViewById = findViewById(R.id.action_bar_divider);
        if (supportActionBar == null) {
            setSupportActionBar(toolbar);
            supportActionBar = getSupportActionBar();
        }
        pa2.b.f136781a.getClass();
        if (pa2.b.a.a().f136774f) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        ((AppCompatTextView) toolbar.findViewById(R.id.toolbar_title_text_view)).setText(str);
        if (supportActionBar != null) {
            supportActionBar.r(16);
            supportActionBar.q(true);
            if (num != null) {
                supportActionBar.v(num.intValue());
            }
            supportActionBar.E();
        }
        applyTopInsets(toolbar);
        invalidateOptionsMenu();
    }

    public void applyTopInsets(View view2) {
        if (view2 == null) {
            return;
        }
        g gVar = new g(24);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(view2, gVar);
        view2.requestApplyInsets();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        this.f195636a.getClass();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        this.f195636a.getClass();
        super.setContentView(R.layout.er_generic_layout_app_bar);
        View viewFindViewById = findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        this.f195637b = (FrameLayout) viewFindViewById;
        View viewInflate = LayoutInflater.from(this).inflate(i14, (ViewGroup) null);
        FrameLayout frameLayout = this.f195637b;
        if (frameLayout == null) {
            s.m("contentFrame");
            throw null;
        }
        frameLayout.addView(viewInflate);
        FrameLayout frameLayout2 = this.f195637b;
        if (frameLayout2 == null) {
            s.m("contentFrame");
            throw null;
        }
        g gVar = new g(25);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(frameLayout2, gVar);
    }
}
