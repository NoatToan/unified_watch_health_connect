package com.garmin.realtimesettings.app.deeplinking;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.deeplinking.ConnectIQAppIntroActivity;
import com.garmin.realtimesettings.app.initialization.b;
import cx2.h;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/realtimesettings/app/deeplinking/ConnectIQAppIntroActivity;", "Lcom/garmin/realtimesettings/app/presentationlayer/a;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectIQAppIntroActivity extends com.garmin.realtimesettings.app.presentationlayer.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f52558r = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f52559t = new h("ConnectIQAppIntroActivity", null, 2, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f52560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f52561q;

    @Override // com.garmin.realtimesettings.app.presentationlayer.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f52559t.getClass();
        super.onCreate(bundle);
        setContentView(R.layout.rts_connectiq_app_intro);
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.g();
        }
        Object value = this.f52614h.getValue();
        value.getClass();
        ((Toolbar) value).setVisibility(8);
        Object value2 = this.f52619m.getValue();
        value2.getClass();
        ((View) value2).setVisibility(8);
        View viewFindViewById = findViewById(R.id.ciq_app_intro_app_store_icon);
        viewFindViewById.getClass();
        this.f52560p = (ImageView) viewFindViewById;
        b.f52589a.getClass();
        int i14 = 2131231125;
        if (b.f52592d != null && b.c().f192457e) {
            i14 = R.drawable.ciq_app_intro_app_store;
        }
        ImageView imageView = this.f52560p;
        if (imageView == null) {
            s.m("ciqAppIntroImage");
            throw null;
        }
        imageView.setImageResource(i14);
        ImageView imageView2 = this.f52560p;
        if (imageView2 == null) {
            s.m("ciqAppIntroImage");
            throw null;
        }
        final int i15 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: sw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppIntroActivity f161095b;

            {
                this.f161095b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        ConnectIQAppIntroActivity connectIQAppIntroActivity = this.f161095b;
                        ConnectIQAppIntroActivity.f52559t.getClass();
                        try {
                            ww2.a.C3491a c3491a = ww2.a.f187896a;
                            ww2.b bVar = ww2.b.GARMIN_TOY_STORE;
                            c3491a.getClass();
                            ww2.a.C3491a.a(connectIQAppIntroActivity, bVar);
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    default:
                        ConnectIQAppIntroActivity.f52559t.getClass();
                        this.f161095b.finish();
                        break;
                }
            }
        });
        View viewFindViewById2 = findViewById(R.id.ciq_close_icon);
        viewFindViewById2.getClass();
        ImageView imageView3 = (ImageView) viewFindViewById2;
        this.f52561q = imageView3;
        final int i16 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: sw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppIntroActivity f161095b;

            {
                this.f161095b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        ConnectIQAppIntroActivity connectIQAppIntroActivity = this.f161095b;
                        ConnectIQAppIntroActivity.f52559t.getClass();
                        try {
                            ww2.a.C3491a c3491a = ww2.a.f187896a;
                            ww2.b bVar = ww2.b.GARMIN_TOY_STORE;
                            c3491a.getClass();
                            ww2.a.C3491a.a(connectIQAppIntroActivity, bVar);
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    default:
                        ConnectIQAppIntroActivity.f52559t.getClass();
                        this.f161095b.finish();
                        break;
                }
            }
        });
        ImageView imageView4 = this.f52561q;
        if (imageView4 == null) {
            s.m("ciqCloseIcon");
            throw null;
        }
        r22.a aVar = new r22.a(this, 16);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(imageView4, aVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/deeplinking/ConnectIQAppIntroActivity$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
