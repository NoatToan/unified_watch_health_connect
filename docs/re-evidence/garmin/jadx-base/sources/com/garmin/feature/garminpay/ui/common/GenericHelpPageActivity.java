package com.garmin.feature.garminpay.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import fe2.z;
import hn2.c;
import java.io.Serializable;
import java.util.Arrays;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import w02.b0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/GenericHelpPageActivity;", "Lhn2/c;", "", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GenericHelpPageActivity extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f51857k = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fr2.c f51858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f51859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f51860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f51861j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/GenericHelpPageActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        WATCH_NOT_SHOWN,
        HOW_TO_UPDATE
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        int i14;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("HelpType", b.class) : null;
        } else {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("HelpType") : null;
            if (!(serializableExtra2 instanceof b)) {
                serializableExtra2 = null;
            }
            serializableExtra = (b) serializableExtra2;
        }
        serializableExtra.getClass();
        b bVar = (b) serializableExtra;
        f51857k.getClass();
        int i15 = a.C1081a.f51862a[bVar.ordinal()];
        if (i15 == 1) {
            i14 = R.layout.layout_help_watch_not_shown;
        } else {
            if (i15 != 2) {
                u0.r();
                return;
            }
            i14 = R.layout.layout_help_how_to_update;
        }
        R9(i14, c.a.BACK, getString(R.string.lbl_help));
        b bVar2 = b.HOW_TO_UPDATE;
        if (bVar == bVar2) {
            View viewFindViewById = findViewById(R.id.text_how_to_update_download_express);
            viewFindViewById.getClass();
            this.f51859h = (TextView) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.text_how_to_update_plug_watch);
            viewFindViewById2.getClass();
            this.f51860i = (TextView) viewFindViewById2;
            View viewFindViewById3 = findViewById(R.id.text_how_to_update_download_updates);
            viewFindViewById3.getClass();
            this.f51861j = (TextView) viewFindViewById3;
        }
        this.f51858g = (fr2.c) new x1(this).b(s0.f105811a.b(fr2.c.class));
        if (bVar == bVar2) {
            TextView textView = this.f51859h;
            if (textView == null) {
                s.m("textHowToUpdateDownloadExpress");
                throw null;
            }
            String string = getString(R.string.install_garmin_express);
            string.getClass();
            textView.setText("1. ".concat(String.format(string, Arrays.copyOf(new Object[]{"Garmin.com/express"}, 1))));
            TextView textView2 = this.f51860i;
            if (textView2 == null) {
                s.m("textHowToUpdatePlugWatch");
                throw null;
            }
            textView2.setText("2. " + getString(R.string.plug_watch_into_computer));
            TextView textView3 = this.f51861j;
            if (textView3 == null) {
                s.m("textHowToUpdateDownloadUpdates");
                throw null;
            }
            textView3.setText("3. " + getString(R.string.download_and_install_updates));
            TextView textView4 = this.f51859h;
            if (textView4 == null) {
                s.m("textHowToUpdateDownloadExpress");
                throw null;
            }
            fr2.c cVar = this.f51858g;
            if (cVar == null) {
                s.m("viewModel");
                throw null;
            }
            String string2 = textView4.getText().toString();
            textView4.setText(b0.z(textView4, w.H(string2, "<link>", 0, false, 6), w.H(string2, "</link>", 0, false, 6) - 6, new z(cVar, 4)));
            TextView textView5 = this.f51859h;
            if (textView5 != null) {
                b0.v(textView5);
            } else {
                s.m("textHowToUpdateDownloadExpress");
                throw null;
            }
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        fr2.c cVar = this.f51858g;
        if (cVar != null) {
            cVar.f73324a = this;
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        fr2.c cVar = this.f51858g;
        if (cVar != null) {
            cVar.f73324a = null;
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/GenericHelpPageActivity$a;", "", "<init>", "()V", "", "HELP_TYPE", "Ljava/lang/String;", "GARMIN_EXPRESS_DOWNLOAD_URL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.common.GenericHelpPageActivity$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1081a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51862a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.WATCH_NOT_SHOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.HOW_TO_UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f51862a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context, b bVar) {
            context.getClass();
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) GenericHelpPageActivity.class);
            intent.putExtra("HelpType", bVar);
            intent.setFlags(536870912);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
