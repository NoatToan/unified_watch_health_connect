package com.garmin.android.apps.connectmobile.settings.devices.index;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import bv2.j;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import fw.p;
import m72.o;
import mh1.q;
import mh1.w;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/InviteByEmailActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InviteByEmailActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43034c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f43035a = m.b(new q(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43036b = new w1(s0.f105811a.b(w.class), new d(this), new c(this), new e(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43037a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43037a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43038a;

        public c(g gVar) {
            this.f43038a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43038a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43039a;

        public d(g gVar) {
            this.f43039a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43039a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43041b;

        public e(e23.a aVar, g gVar) {
            this.f43040a = aVar;
            this.f43041b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43040a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43041b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void ca() {
        f.d(f.f23050a, this, getString(R.string.live_tracking_invalid_address_alert_title), getString(R.string.account_invalid_email_address), new o13.p(getString(R.string.lbl_ok), new o(26)), null, null, false, 112).show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.invite_user_by_email_activity);
        initActionBar(true, R.string.title_invite_by_email);
        String stringExtra = getIntent().getStringExtra("GCM_deviceDisplayName");
        String stringExtra2 = getIntent().getStringExtra("GCM_deviceUnitID");
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            ((Logger) this.f43035a.getValue()).error("DeviceID cannot be null, in order for the invites to work! Finishing...");
            finish();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.enter_email_layout);
        EditText editText = (EditText) findViewById(R.id.email_address_tv);
        TextView textView = (TextView) findViewById(R.id.email_title_tv);
        TextView textView2 = (TextView) findViewById(R.id.invite_by_email_message_tv);
        textView2.setText(R.string.msg_invite_friends_by_email);
        ((TextView) findViewById(R.id.invite_by_email_data_access_tv)).setText(R.string.msg_invite_friends_by_email_description);
        constraintLayout.setVisibility(0);
        textView.setVisibility(0);
        editText.setOnFocusChangeListener(new c32.f(editText, 7));
        editText.setOnEditorActionListener(new mh1.t());
        textView.setOnClickListener(new i20.q(editText, 1));
        textView2.setText(getString(R.string.msg_invite_friends_by_email, stringExtra));
        ((AppCompatButton) findViewById(R.id.btn_send_invite)).setOnClickListener(new j(this, stringExtra2, editText));
        dh.b.L(((w) this.f43036b.getValue()).f118515c, this, new iz1.g(this, 9));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/InviteByEmailActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
