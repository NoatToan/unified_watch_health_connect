package com.garmin.android.apps.connectmobile.help.heartrate;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.legal.d;
import d53.k;
import d53.u;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/help/heartrate/HeartRateHelpActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HeartRateHelpActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36655a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Collection collectionS0;
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, R.string.title_additional_info);
        so0.a aVar = so0.a.values()[getIntent().getIntExtra("args_heart_rate_help", 0)];
        d.a aVar2 = d.f49991k;
        Locale locale = Locale.getDefault();
        locale.getClass();
        aVar2.getClass();
        String str = d.a.a(locale).f50046a;
        x0 x0Var = x0.f105818a;
        aVar.getClass();
        str.getClass();
        String str2 = aVar.f160433a;
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        try {
            String path = URI.create(str3).getPath();
            path.getClass();
            List listG = new k("/").g(0, path);
            if (listG.isEmpty()) {
                collectionS0 = j0.f134944a;
                break;
            }
            ListIterator listIterator = listG.listIterator(listG.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    collectionS0 = j0.f134944a;
                    break;
                }
            }
            String[] strArr = (String[]) collectionS0.toArray(new String[0]);
            String str4 = "";
            int length = strArr.length;
            int i14 = length - 1;
            int i15 = length - 2;
            for (int i16 = 0; i16 < i14; i16++) {
                String str5 = strArr[i16];
                if (!TextUtils.isEmpty(str5) && !u.q(str5, "android_asset", true)) {
                    str4 = str4 + strArr[i16];
                    if (i16 != i15) {
                        str4 = str4 + File.pathSeparator;
                    }
                }
            }
            String[] list = getResources().getAssets().list(str4);
            if (list != null && !p13.u.z(list, strArr[i14])) {
                String str6 = d.US.f50046a;
                x0 x0Var2 = x0.f105818a;
                str3 = String.format(str2, Arrays.copyOf(new Object[]{str6}, 1));
            }
        } catch (IOException e4) {
            gt2.c.b(aVar.name()).error(e4.toString());
        }
        String str7 = String.format(str3, Arrays.copyOf(new Object[]{str}, 1));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_frame);
        WebView webView = new WebView(this);
        if (je.c.a("FORCE_DARK")) {
            int i17 = getResources().getConfiguration().uiMode & 48;
            if (i17 == 0 || i17 == 16) {
                je.a.b(webView.getSettings(), 0);
            } else if (i17 != 32) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.a(a2Var, "initViews: No defined configuration for the web view. Use default.");
            } else {
                je.a.b(webView.getSettings(), 2);
            }
        }
        viewGroup.addView(webView);
        webView.loadUrl(str7);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/help/heartrate/HeartRateHelpActivity$a;", "", "<init>", "()V", "", "ARGS_HEART_RATE_HELP_ITEM", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
