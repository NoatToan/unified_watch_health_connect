package com.garmin.android.exportablereports.views;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.AppCompatImageView;
import com.garmin.android.apps.connectmobile.R;
import java.io.File;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ra2.h;
import sa2.p;
import ua2.c;
import wa2.b;
import xa2.f;
import xa2.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/exportablereports/views/ReportsViewActivity;", "Lya2/a;", "Landroid/view/View$OnClickListener;", "Lua2/c;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReportsViewActivity extends ya2.a implements View.OnClickListener, c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f49847l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f49848m = new b("ReportsViewActivity", null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f49849n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f49850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f49852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f49853g = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AppCompatImageView f49854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppCompatImageView f49855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppCompatImageView f49856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sa2.a f49857k;

    @Override // ua2.c
    public final void E1(Bitmap bitmap, String str) {
        pa2.b.f136781a.getClass();
        String str2 = pa2.b.a.a().f136780l;
        if (str2 != null) {
            str = str2;
        }
        P9(null, str);
        AppCompatImageView appCompatImageView = this.f49854h;
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(bitmap);
        } else {
            s.m("pdfPreview");
            throw null;
        }
    }

    public final void Q9() {
        if (O9()) {
            new e.a(this).setTitle(R.string.download_failure_title).setMessage(R.string.download_report_not_available_message).setNeutralButton(R.string.lbl_ok, new f(this, 0)).show();
        }
    }

    @Override // ua2.c
    public final void Z4() {
        new e.a(this).setTitle(R.string.download_failure_title).setMessage(R.string.technical_challenge_message).setNeutralButton(R.string.lbl_ok, new f(this, 1)).show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v14) {
        if (v14 != null) {
            int id3 = v14.getId();
            if (id3 == R.id.previous) {
                sa2.a aVar = this.f49857k;
                if (aVar == null) {
                    s.m("pdfRenderer");
                    throw null;
                }
                PdfRenderer.Page page = aVar.f158321d;
                aVar.a((page != null ? page.getIndex() : 1) - 1);
                return;
            }
            if (id3 == R.id.next) {
                sa2.a aVar2 = this.f49857k;
                if (aVar2 == null) {
                    s.m("pdfRenderer");
                    throw null;
                }
                PdfRenderer.Page page2 = aVar2.f158321d;
                aVar2.a((page2 != null ? page2.getIndex() : 0) + 1);
            }
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f49848m.getClass();
        super.onCreate(bundle);
        setContentView(R.layout.er_view_report);
        pa2.b.f136781a.getClass();
        String string = pa2.b.a.a().f136780l;
        if (string == null) {
            string = getString(R.string.download_report_title);
            string.getClass();
        }
        P9(null, string);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string2 = extras.getString("REPORT_NAME_KEY", "");
            string2.getClass();
            this.f49850d = string2;
            String string3 = extras.getString("REPORT_START_DATE_KEY", string2);
            string3.getClass();
            this.f49851e = string3;
            String str = this.f49850d;
            if (str == null) {
                s.m("reportName");
                throw null;
            }
            String string4 = extras.getString("REPORT_END_DATE_KEY", str);
            string4.getClass();
            this.f49852f = string4;
        } else {
            Q9();
        }
        String str2 = this.f49850d;
        if (str2 == null) {
            s.m("reportName");
            throw null;
        }
        if (str2.length() == 0) {
            Q9();
        }
        String str3 = this.f49850d;
        if (str3 == null) {
            s.m("reportName");
            throw null;
        }
        this.f49857k = new sa2.a(this, str3);
        View viewFindViewById = findViewById(R.id.pdf_preview);
        viewFindViewById.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById;
        this.f49854h = appCompatImageView;
        v22.e.n(appCompatImageView, new g(this, 0));
        View viewFindViewById2 = findViewById(R.id.previous);
        viewFindViewById2.getClass();
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewFindViewById2;
        this.f49855i = appCompatImageView2;
        appCompatImageView2.setOnClickListener(this);
        View viewFindViewById3 = findViewById(R.id.next);
        viewFindViewById3.getClass();
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) viewFindViewById3;
        this.f49856j = appCompatImageView3;
        appCompatImageView3.setOnClickListener(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.er_menu_share_download_report, menu);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        f49848m.getClass();
        String str = this.f49850d;
        if (str == null) {
            s.m("reportName");
            throw null;
        }
        this.f49853g.getClass();
        b bVar = p.f158386b;
        bVar.getClass();
        try {
            new File(new ContextWrapper(this).getDir("Garmin_Reports", 0), str).delete();
            h.f151495a.getClass();
            h.f151497c = null;
        } catch (NullPointerException unused) {
            bVar.a("Deleting report: null pointer could not find the report.");
        } catch (SecurityException unused2) {
            bVar.a("Security exception when deleting report.");
        }
        super.onDestroy();
    }

    @Override // ya2.a, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.er_menu_share_report) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (SystemClock.elapsedRealtime() - f49849n < 1000) {
            return false;
        }
        String str = this.f49851e;
        if (str == null) {
            s.m("reportStartDate");
            throw null;
        }
        String str2 = this.f49852f;
        if (str2 == null) {
            s.m("reportEndDate");
            throw null;
        }
        String str3 = this.f49850d;
        if (str3 == null) {
            s.m("reportName");
            throw null;
        }
        this.f49853g.a(this, str, str2, str3);
        f49849n = SystemClock.elapsedRealtime();
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            sa2.a aVar = this.f49857k;
            if (aVar != null) {
                aVar.b();
            } else {
                s.m("pdfRenderer");
                throw null;
            }
        } catch (IOException e4) {
            f49848m.a("Exception opening document " + e4);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        try {
            sa2.a aVar = this.f49857k;
            if (aVar == null) {
                s.m("pdfRenderer");
                throw null;
            }
            PdfRenderer.Page page = aVar.f158321d;
            if (page != null) {
                page.close();
            }
            PdfRenderer pdfRenderer = aVar.f158320c;
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
        } catch (IOException e4) {
            f49848m.a("Exception closing document " + e4);
        }
    }

    @Override // ua2.c
    public final void u6(boolean z14, boolean z15) {
        AppCompatImageView appCompatImageView = this.f49855i;
        if (appCompatImageView == null) {
            s.m("previous");
            throw null;
        }
        appCompatImageView.setEnabled(z14);
        AppCompatImageView appCompatImageView2 = this.f49855i;
        if (z14) {
            if (appCompatImageView2 == null) {
                s.m("previous");
                throw null;
            }
            appCompatImageView2.setAlpha(1.0f);
        } else {
            if (appCompatImageView2 == null) {
                s.m("previous");
                throw null;
            }
            appCompatImageView2.setAlpha(0.5f);
        }
        AppCompatImageView appCompatImageView3 = this.f49856j;
        if (appCompatImageView3 == null) {
            s.m("next");
            throw null;
        }
        appCompatImageView3.setEnabled(z15);
        AppCompatImageView appCompatImageView4 = this.f49856j;
        if (z15) {
            if (appCompatImageView4 != null) {
                appCompatImageView4.setAlpha(1.0f);
                return;
            } else {
                s.m("next");
                throw null;
            }
        }
        if (appCompatImageView4 != null) {
            appCompatImageView4.setAlpha(0.5f);
        } else {
            s.m("next");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/exportablereports/views/ReportsViewActivity$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "", "REPORT_NAME_BUNDLE_KEY", "Ljava/lang/String;", "REPORT_START_DATE_KEY", "REPORT_END_DATE_KEY", "", "INTERVAL_MILLIS", "I", "", "lastClickTime", "J", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
