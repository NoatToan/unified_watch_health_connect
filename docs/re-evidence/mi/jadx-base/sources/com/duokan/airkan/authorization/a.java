package com.duokan.airkan.authorization;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.duokan.airkan.rc_sdk.airkan.AirkanService;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a1j;
import defpackage.h3j;
import defpackage.ikk;
import defpackage.jpe;
import defpackage.kqc;
import defpackage.qv6;
import defpackage.ryi;
import defpackage.sz0;
import defpackage.tah;
import defpackage.upc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AirkanService f7025b;
    public miuix.appcompat.app.c c;
    public String d;
    public String e;
    public String f;
    public String g;
    public ikk h;
    public qv6 i;
    public VerifyCodeInputView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f7026k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7024a = 120000;
    public CountDownTimer l = new CountDownTimerC0145a(120000, 1000);

    /* JADX INFO: renamed from: com.duokan.airkan.authorization.a$a, reason: collision with other inner class name */
    public class CountDownTimerC0145a extends CountDownTimer {
        public CountDownTimerC0145a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            jpe.f("AuthDiolog", "countDownTimer onFinish");
            a.this.i();
            ikk ikkVar = a.this.h;
            if (ikkVar != null) {
                ikkVar.a(-1000);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            a.this.p(j);
        }
    }

    public class b implements VerifyCodeInputView.OnCodeChangeListener {

        /* JADX INFO: renamed from: com.duokan.airkan.authorization.a$b$a, reason: collision with other inner class name */
        public class C0146a implements kqc {
            public C0146a() {
            }

            @Override // defpackage.kqc
            public void onFail(int i, String str) {
                jpe.f("AuthDiolog", "completeAuthority fail");
                jpe.h("AuthDiolog", "completeAuthority fail tvId:" + a.this.d + " code:" + i + " msg:" + str);
                a.this.m();
            }

            @Override // defpackage.kqc
            public void onSuccess(String str) {
                jpe.f("AuthDiolog", "completeAuthority success");
                jpe.h("AuthDiolog", "completeAuthority success tvId:" + str);
                a.this.f7025b.d(a.this.f, true);
                a.q(a.this.f7025b);
                a.this.i();
            }
        }

        public b() {
        }

        @Override // com.duokan.airkan.authorization.VerifyCodeInputView.OnCodeChangeListener
        public void onComplete(View view, String str) {
            jpe.f("AuthDiolog", "onVerifyComplete:" + str);
            a.this.f7025b.a().f(a.this.d, str, new C0146a());
        }

        @Override // com.duokan.airkan.authorization.VerifyCodeInputView.OnCodeChangeListener
        public void onContentChange(View view, String str) {
        }
    }

    public class c implements upc {
        public c() {
        }

        @Override // defpackage.upc
        public void onFail(int i, String str) {
            jpe.f("AuthDiolog", "cancelAuthority fail:" + i + " " + str);
        }

        @Override // defpackage.upc
        public void onSuccess() {
            jpe.f("AuthDiolog", "cancelAuthority success");
            sz0.o();
            a.this.i();
            ikk ikkVar = a.this.h;
            if (ikkVar != null) {
                ikkVar.a(-1000);
            }
        }
    }

    public a(AirkanService airkanService, String str, String str2, String str3, String str4, ikk ikkVar) {
        this.g = "";
        this.f7025b = airkanService;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = ikkVar;
        j(airkanService);
    }

    public static void h(Context context) {
        HashMap map = new HashMap();
        map.put("page", "remote_control_verification_code_popup");
        map.put("click_content", BroadcastsKt.SILENT_PUSHING_CANCEL);
        tah.a(context).b("31000000683", "circulate", "click", map);
    }

    public static void o(Context context) {
        HashMap map = new HashMap();
        map.put("page", "remote_control_verification_code_popup");
        tah.a(context).b("31000000683", "circulate", "page_show", map);
    }

    public static void q(Context context) {
        HashMap map = new HashMap();
        map.put("page", "remote_control_verification_code_result");
        tah.a(context).b("31000000683", "circulate", "verify", map);
    }

    public void i() {
        jpe.f("AuthDiolog", "dismiss");
        this.l.cancel();
        if (this.c.isShowing()) {
            this.c.dismiss();
            ikk ikkVar = this.h;
            if (ikkVar != null) {
                ikkVar.onAuthenticationChange(false);
            }
        }
    }

    public void j(Context context) {
        String str;
        jpe.f("AuthDiolog", "initAuthDialog");
        qv6 qv6VarC = qv6.c(LayoutInflater.from(context));
        this.i = qv6VarC;
        VerifyCodeInputView verifyCodeInputView = qv6VarC.c;
        this.j = verifyCodeInputView;
        verifyCodeInputView.setOnCodeChangeListener(new b());
        this.j.setOnContentListener(new View.OnClickListener() { // from class: qq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31734a.k(view);
            }
        });
        this.f7026k = this.i.f31875b;
        this.c = new miuix.appcompat.app.c.a(context, h3j.f19652a).A(this.i.getRoot()).y(a1j.f528b).e(false).o(a1j.f527a, new DialogInterface.OnClickListener() { // from class: rq1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f32783a.l(dialogInterface, i);
            }
        }).b();
        jpe.f("AuthDiolog", "entry " + this.g);
        String str2 = this.g;
        int iHashCode = str2.hashCode();
        if (iHashCode != -1628610102) {
            if (iHashCode != -1235774869) {
                str = iHashCode == 1196040283 ? "NewSportsHealth" : "DeviceCenter";
            }
            str2.equals(str);
        } else if (str2.equals("DeviceExposed")) {
            this.c.getWindow().setType(GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK);
            return;
        }
        this.c.getWindow().setType(2038);
    }

    public final /* synthetic */ void k(View view) {
        this.j.showIme(0L);
    }

    public final /* synthetic */ void l(DialogInterface dialogInterface, int i) {
        h(this.f7025b);
        this.f7025b.a().d(new c());
    }

    public void m() {
        if (!this.c.isShowing() || this.j == null) {
            return;
        }
        jpe.f("AuthDiolog", "reInput");
        this.j.cleanInput();
        this.j.setRetryInputEditBackground();
        r();
    }

    public void n() {
        if (this.c != null) {
            jpe.f("AuthDiolog", "showDialog");
            p(120000L);
            this.l.start();
            this.c.show();
            o(this.f7025b);
            ikk ikkVar = this.h;
            if (ikkVar != null) {
                ikkVar.onAuthenticationChange(true);
            }
        }
    }

    public final void p(long j) {
        this.f7026k.setText(this.f7025b.getResources().getQuantityString(ryi.f33067a, 0, this.e, Long.valueOf((j / 1000) + 1)));
    }

    public final void r() {
        jpe.f("AuthDiolog", "vibrateAndShake");
        Vibrator vibrator = (Vibrator) this.f7025b.getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.cancel();
            vibrator.vibrate(300L);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.j, (Property<VerifyCodeInputView, Float>) View.TRANSLATION_X, 0.0f, 35.0f, -35.0f, 35.0f, -35.0f, 20.0f, -20.0f, 10.0f, -10.0f, 6.0f, -6.0f, 0.0f).setDuration(800L);
        duration.setAutoCancel(true);
        duration.start();
    }
}
