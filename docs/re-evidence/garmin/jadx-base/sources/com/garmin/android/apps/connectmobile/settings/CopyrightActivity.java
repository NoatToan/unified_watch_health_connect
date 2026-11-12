package com.garmin.android.apps.connectmobile.settings;

import am.j;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.m1;
import com.google.android.flexbox.FlexItem;
import d53.u;
import f20.i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/CopyrightActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lgg1/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CopyrightActivity extends com.garmin.android.apps.connectmobile.c implements gg1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41511a = 0;

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0039: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:8:0x0038 */
    @Override // gg1.f
    public final void o4(gg1.e eVar) throws Throwable {
        Throwable th3;
        BufferedReader bufferedReader;
        Reader reader;
        int i14 = eVar.f77227b;
        m1 m1Var = m1.f23143a;
        Resources resources = getResources();
        resources.getClass();
        m1Var.getClass();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i14);
        inputStreamOpenRawResource.getClass();
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        Reader reader2 = null;
        string = null;
        string = null;
        string = null;
        String string = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "UTF-8"));
                while (true) {
                    try {
                        int i15 = bufferedReader.read(cArr);
                        if (i15 == -1) {
                            break;
                        } else {
                            stringWriter.write(cArr, 0, i15);
                        }
                    } catch (UnsupportedEncodingException e4) {
                        e = e4;
                        e.getMessage();
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException e14) {
                            e14.getMessage();
                        }
                        if (bufferedReader != null) {
                        }
                        if (string != null) {
                            int color = a7.b.getColor(this, R.color.transparent);
                            if (eVar == gg1.e.GARMIN) {
                                x0 x0Var = x0.f105818a;
                                Locale locale = Locale.US;
                                string = String.format(locale, string, Arrays.copyOf(new Object[]{String.valueOf(Calendar.getInstance(locale).get(1))}, 1));
                            }
                            ScrollView scrollView = new ScrollView(this);
                            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            x0 x0Var2 = x0.f105818a;
                            String strV = u.v(string, "text=\"white\"", j.m("text=\"", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a7.b.getColor(this, com.garmin.android.apps.connectmobile.R.color.gcm_text_primary) & FlexItem.MAX_SIZE)}, 1)), "\""), true);
                            scrollView.setBackgroundColor(color);
                            WebView webView = new WebView(this);
                            webView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                            webView.loadDataWithBaseURL(null, strV.toString(), "text/html", "utf-8", null);
                            webView.setBackgroundColor(color);
                            scrollView.addView(webView);
                            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this).setCancelable(true).setView(scrollView).setNeutralButton(com.garmin.android.apps.connectmobile.R.string.lbl_ok, new i(14)).create();
                            eVarCreate.getClass();
                            eVarCreate.requestWindowFeature(1);
                            eVarCreate.show();
                        }
                    } catch (IOException e15) {
                        e = e15;
                        e.getMessage();
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException e16) {
                            e16.getMessage();
                        }
                        if (bufferedReader != null) {
                        }
                        if (string != null) {
                            int color2 = a7.b.getColor(this, R.color.transparent);
                            if (eVar == gg1.e.GARMIN) {
                                x0 x0Var3 = x0.f105818a;
                                Locale locale2 = Locale.US;
                                string = String.format(locale2, string, Arrays.copyOf(new Object[]{String.valueOf(Calendar.getInstance(locale2).get(1))}, 1));
                            }
                            ScrollView scrollView2 = new ScrollView(this);
                            scrollView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            x0 x0Var4 = x0.f105818a;
                            String strV2 = u.v(string, "text=\"white\"", j.m("text=\"", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a7.b.getColor(this, com.garmin.android.apps.connectmobile.R.color.gcm_text_primary) & FlexItem.MAX_SIZE)}, 1)), "\""), true);
                            scrollView2.setBackgroundColor(color2);
                            WebView webView2 = new WebView(this);
                            webView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                            webView2.loadDataWithBaseURL(null, strV2.toString(), "text/html", "utf-8", null);
                            webView2.setBackgroundColor(color2);
                            scrollView2.addView(webView2);
                            androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(this).setCancelable(true).setView(scrollView2).setNeutralButton(com.garmin.android.apps.connectmobile.R.string.lbl_ok, new i(14)).create();
                            eVarCreate2.getClass();
                            eVarCreate2.requestWindowFeature(1);
                            eVarCreate2.show();
                        }
                    }
                }
                string = stringWriter.toString();
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException e17) {
                    e17.getMessage();
                }
            } catch (Throwable th4) {
                th3 = th4;
                reader2 = reader;
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException e18) {
                    e18.getMessage();
                }
                if (reader2 != null) {
                    throw th3;
                }
                try {
                    reader2.close();
                    throw th3;
                } catch (IOException e19) {
                    e19.getMessage();
                    throw th3;
                }
            }
        } catch (UnsupportedEncodingException e24) {
            e = e24;
            bufferedReader = null;
        } catch (IOException e25) {
            e = e25;
            bufferedReader = null;
        } catch (Throwable th5) {
            th3 = th5;
            inputStreamOpenRawResource.close();
            if (reader2 != null) {
                throw th3;
            }
            reader2.close();
            throw th3;
        }
        try {
            bufferedReader.close();
        } catch (IOException e26) {
            e26.getMessage();
        }
        if (string != null) {
            int color3 = a7.b.getColor(this, R.color.transparent);
            if (eVar == gg1.e.GARMIN) {
                x0 x0Var5 = x0.f105818a;
                Locale locale3 = Locale.US;
                string = String.format(locale3, string, Arrays.copyOf(new Object[]{String.valueOf(Calendar.getInstance(locale3).get(1))}, 1));
            }
            ScrollView scrollView3 = new ScrollView(this);
            scrollView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            x0 x0Var6 = x0.f105818a;
            String strV3 = u.v(string, "text=\"white\"", j.m("text=\"", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a7.b.getColor(this, com.garmin.android.apps.connectmobile.R.color.gcm_text_primary) & FlexItem.MAX_SIZE)}, 1)), "\""), true);
            scrollView3.setBackgroundColor(color3);
            WebView webView3 = new WebView(this);
            webView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            webView3.loadDataWithBaseURL(null, strV3.toString(), "text/html", "utf-8", null);
            webView3.setBackgroundColor(color3);
            scrollView3.addView(webView3);
            androidx.appcompat.app.e eVarCreate3 = new androidx.appcompat.app.e.a(this).setCancelable(true).setView(scrollView3).setNeutralButton(com.garmin.android.apps.connectmobile.R.string.lbl_ok, new i(14)).create();
            eVarCreate3.getClass();
            eVarCreate3.requestWindowFeature(1);
            eVarCreate3.show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.garmin.android.apps.connectmobile.R.layout.gcm_simple_recycler_view_layout);
        initActionBar(true, com.garmin.android.apps.connectmobile.R.string.setting_copyright);
        List listK = x.k(gg1.e.GARMIN, gg1.e.APP_INSIGHTS, gg1.e.BODY_MOVIN, gg1.e.EXO_PLAYER, gg1.e.FLEXBOX_LAYOUT, gg1.e.UCROP, gg1.e.LOTTIE, gg1.e.LUCASFILM_MARVEL_DISNEY, gg1.e.MARKWON, gg1.e.MATERIAL_CALENDAR_VIEW, gg1.e.MP_ANDROID_CHART, gg1.e.OPENCV, gg1.e.PHOTO_VIEW, gg1.e.WEATHER, gg1.e.AMPLITUDA, gg1.e.OPENSTREETMAP);
        RecyclerView recyclerView = (RecyclerView) findViewById(com.garmin.android.apps.connectmobile.R.id.simple_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new gg1.d(this, listK, this));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/CopyrightActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
