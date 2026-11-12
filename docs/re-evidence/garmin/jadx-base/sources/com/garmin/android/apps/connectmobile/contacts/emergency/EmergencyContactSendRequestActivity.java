package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import f20.i;
import fw.p;
import j20.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import n23.j;
import o13.h;
import o13.m;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import tn.k;
import v.e0;
import z10.p3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/EmergencyContactSendRequestActivity;", "Lz10/p3;", "Lcom/garmin/android/apps/connectmobile/contacts/emergency/a$b;", "<init>", "()V", "a", "b", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmergencyContactSendRequestActivity extends p3 implements com.garmin.android.apps.connectmobile.contacts.emergency.a.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f32570v = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l20.a f32575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l20.c f32576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f32577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32579k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.c<Intent> f32585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<Intent> f32586r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f32587t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz1.g f32571c = new iz1.g(this, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f32572d = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32580l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32581m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32582n = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/EmergencyContactSendRequestActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        INVALID_PHONE_NUMBER,
        COULD_NOT_SEND_SMS,
        COULD_NOT_SEND_EMAIL,
        UNKNOWN
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32594b;

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
            f32593a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.INVALID_PHONE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.COULD_NOT_SEND_SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.COULD_NOT_SEND_EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f32594b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32595a;

        public d(l lVar) {
            lVar.getClass();
            this.f32595a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32595a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32595a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/contacts/emergency/EmergencyContactSendRequestActivity$e", "Landroid/content/BroadcastReceiver;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f32596a;

        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[smsBroadcastReceiver] Received intent in onReceive");
            EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = EmergencyContactSendRequestActivity.this;
            emergencyContactSendRequestActivity.hideProgressOverlay();
            int i14 = emergencyContactSendRequestActivity.f32581m;
            int i15 = emergencyContactSendRequestActivity.f32580l;
            if (i14 != i15) {
                i2.a.b(a2Var, "EmergencyContactSendRequestActivity", k.e(i14, i15, "[smsBroadcastReceiver] This intent is intent #", ", skipping because it's not #"));
                emergencyContactSendRequestActivity.f32581m++;
                return;
            }
            emergencyContactSendRequestActivity.f32581m = 1;
            int resultCode = getResultCode();
            if (resultCode == -1) {
                i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[smsBroadcastReceiver] Message sent successfully; closing activity");
                emergencyContactSendRequestActivity.f32579k = true;
                e eVar = emergencyContactSendRequestActivity.f32572d;
                if (eVar.f32596a) {
                    emergencyContactSendRequestActivity.unregisterReceiver(eVar);
                    eVar.f32596a = false;
                }
                emergencyContactSendRequestActivity.ka().K4();
                return;
            }
            if (resultCode == 0 || resultCode == 1 || resultCode == 11 || resultCode == 14 || resultCode == 32 || resultCode == 23 || resultCode == 24) {
                i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[smsBroadcastReceiver] Message failed; showing generic dialog to user: " + getResultCode());
                emergencyContactSendRequestActivity.f32579k = false;
                emergencyContactSendRequestActivity.ma();
                return;
            }
            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[smsBroadcastReceiver] Message failed; showing network error dialog to user: " + getResultCode());
            emergencyContactSendRequestActivity.f32579k = false;
            emergencyContactSendRequestActivity.ma();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f32598a;

        public f(b.g gVar) {
            this.f32598a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32598a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f32600b;

        public g(e23.a aVar, b.g gVar) {
            this.f32599a = aVar;
            this.f32600b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32599a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32600b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public EmergencyContactSendRequestActivity() {
        final int i14 = 1;
        this.f32573e = m.b(new e23.a(this) { // from class: j20.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96559b;

            {
                this.f96559b = this;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0070  */
            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                ArrayList parcelableArrayListExtra;
                Parcelable parcelable2;
                int i15 = i14;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96559b;
                Parcelable parcelable3 = null;
                switch (i15) {
                    case 0:
                        EmergencyContactSendRequestActivity.a aVar = EmergencyContactSendRequestActivity.f32570v;
                        Intent intent = emergencyContactSendRequestActivity.getIntent();
                        int i16 = Build.VERSION.SDK_INT;
                        if (i16 >= 33) {
                            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_SEND_REQUEST_KEY", l20.a.class) : null;
                        } else {
                            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_SEND_REQUEST_KEY") : null;
                            if (!(parcelableExtra instanceof l20.a)) {
                                parcelableExtra = null;
                            }
                            parcelable = (l20.a) parcelableExtra;
                        }
                        l20.a aVar2 = (l20.a) parcelable;
                        if (aVar2 == null) {
                            vb.h.s("No contact data provided");
                            return null;
                        }
                        Intent intent2 = emergencyContactSendRequestActivity.getIntent();
                        if (i16 >= 33) {
                            if (intent2 != null) {
                                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("EXTRA_CONTACT_METHOD_LIST_PRESELECTION", l20.c.class);
                            } else {
                                parcelableArrayListExtra = null;
                            }
                        } else if (intent2 != null) {
                            parcelableArrayListExtra = intent2.getParcelableArrayListExtra("EXTRA_CONTACT_METHOD_LIST_PRESELECTION");
                        } else {
                            parcelableArrayListExtra = null;
                        }
                        Intent intent3 = emergencyContactSendRequestActivity.getIntent();
                        if (i16 < 33) {
                            Parcelable parcelableExtra2 = intent3 != null ? intent3.getParcelableExtra("EXTRA_CONTACT_METHOD_PRESELECTION") : null;
                            parcelable3 = (l20.c) (parcelableExtra2 instanceof l20.c ? parcelableExtra2 : null);
                        } else if (intent3 != null) {
                            parcelable3 = (Parcelable) intent3.getParcelableExtra("EXTRA_CONTACT_METHOD_PRESELECTION", l20.c.class);
                        }
                        return new s(aVar2, parcelableArrayListExtra, (l20.c) parcelable3, emergencyContactSendRequestActivity.getIntent().getBooleanExtra("EXTRA_IS_FROM_EMERGENCY_CONTACT_DETAILS", false), emergencyContactSendRequestActivity.getIntent().getBooleanExtra("EXTRA_IS_LIVE_TRACK_SETUP", false), emergencyContactSendRequestActivity.getIntent().getBooleanExtra("EXTRA_IS_LIVE_TRACK_AND_EC_SETUP", false), (hl.a) emergencyContactSendRequestActivity.f32573e.getValue());
                    default:
                        EmergencyContactSendRequestActivity.a aVar3 = EmergencyContactSendRequestActivity.f32570v;
                        Bundle extras = emergencyContactSendRequestActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable4 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable2 = (hl.a) (parcelable4 instanceof hl.a ? parcelable4 : null);
                            }
                            hl.a aVar4 = (hl.a) parcelable2;
                            if (aVar4 != null) {
                                return aVar4;
                            }
                        }
                        return hl.a.c.f84256b;
                }
            }
        });
        final int i15 = 0;
        this.f32577i = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.emergency.d.class), new f(this), new e23.a(this) { // from class: j20.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96559b;

            {
                this.f96559b = this;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0070  */
            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                ArrayList parcelableArrayListExtra;
                Parcelable parcelable2;
                int i16 = i15;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96559b;
                Parcelable parcelable3 = null;
                switch (i16) {
                    case 0:
                        EmergencyContactSendRequestActivity.a aVar = EmergencyContactSendRequestActivity.f32570v;
                        Intent intent = emergencyContactSendRequestActivity.getIntent();
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 33) {
                            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_SEND_REQUEST_KEY", l20.a.class) : null;
                        } else {
                            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_SEND_REQUEST_KEY") : null;
                            if (!(parcelableExtra instanceof l20.a)) {
                                parcelableExtra = null;
                            }
                            parcelable = (l20.a) parcelableExtra;
                        }
                        l20.a aVar2 = (l20.a) parcelable;
                        if (aVar2 == null) {
                            vb.h.s("No contact data provided");
                            return null;
                        }
                        Intent intent2 = emergencyContactSendRequestActivity.getIntent();
                        if (i17 >= 33) {
                            if (intent2 != null) {
                                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("EXTRA_CONTACT_METHOD_LIST_PRESELECTION", l20.c.class);
                            } else {
                                parcelableArrayListExtra = null;
                            }
                        } else if (intent2 != null) {
                            parcelableArrayListExtra = intent2.getParcelableArrayListExtra("EXTRA_CONTACT_METHOD_LIST_PRESELECTION");
                        } else {
                            parcelableArrayListExtra = null;
                        }
                        Intent intent3 = emergencyContactSendRequestActivity.getIntent();
                        if (i17 < 33) {
                            Parcelable parcelableExtra2 = intent3 != null ? intent3.getParcelableExtra("EXTRA_CONTACT_METHOD_PRESELECTION") : null;
                            parcelable3 = (l20.c) (parcelableExtra2 instanceof l20.c ? parcelableExtra2 : null);
                        } else if (intent3 != null) {
                            parcelable3 = (Parcelable) intent3.getParcelableExtra("EXTRA_CONTACT_METHOD_PRESELECTION", l20.c.class);
                        }
                        return new s(aVar2, parcelableArrayListExtra, (l20.c) parcelable3, emergencyContactSendRequestActivity.getIntent().getBooleanExtra("EXTRA_IS_FROM_EMERGENCY_CONTACT_DETAILS", false), emergencyContactSendRequestActivity.getIntent().getBooleanExtra("EXTRA_IS_LIVE_TRACK_SETUP", false), emergencyContactSendRequestActivity.getIntent().getBooleanExtra("EXTRA_IS_LIVE_TRACK_AND_EC_SETUP", false), (hl.a) emergencyContactSendRequestActivity.f32573e.getValue());
                    default:
                        EmergencyContactSendRequestActivity.a aVar3 = EmergencyContactSendRequestActivity.f32570v;
                        Bundle extras = emergencyContactSendRequestActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable4 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable2 = (hl.a) (parcelable4 instanceof hl.a ? parcelable4 : null);
                            }
                            hl.a aVar4 = (hl.a) parcelable2;
                            if (aVar4 != null) {
                                return aVar4;
                            }
                        }
                        return hl.a.c.f84256b;
                }
            }
        }, new g(null, this));
        final int i16 = 0;
        this.f32585q = registerForActivityResult(new g.h(), new f.b(this) { // from class: j20.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96561b;

            {
                this.f96561b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v2, types: [com.garmin.android.apps.connectmobile.contacts.emergency.d] */
            /* JADX WARN: Type inference failed for: r13v0, types: [com.garmin.android.apps.connectmobile.contacts.emergency.d] */
            /* JADX WARN: Type inference failed for: r16v3, types: [l20.d] */
            /* JADX WARN: Type inference failed for: r17v0, types: [l20.d] */
            @Override // f.b
            public final void a(Object obj) {
                Serializable serializableExtra;
                Serializable serializableExtra2;
                int i17 = i16;
                Serializable serializable = null;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96561b;
                switch (i17) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        int i18 = aVar.f67585a;
                        if (i18 != -1) {
                            a2 a2Var = a2.SAFETY_FEATURES;
                            String strF = e0.f(i18, "Warning! result.resultCode is ", ", not Activity.RESULT_OK (-1). This might only mean that the user did not edit the phone number, which is fine.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", strF);
                        } else {
                            String stringExtra = intent != null ? intent.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra2 = intent != null ? intent.getStringExtra("EXTRA_RESULT") : null;
                            String stringExtra3 = intent != null ? intent.getStringExtra("RESULT_PHONE_UUID") : null;
                            Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("RESULT_PHONE_ISVALID", true)) : null;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent.getSerializableExtra("EXTRA_LABEL", l20.p.class);
                                } else {
                                    Serializable serializableExtra3 = intent.getSerializableExtra("EXTRA_LABEL");
                                    serializableExtra = (l20.p) (serializableExtra3 instanceof l20.p ? serializableExtra3 : null);
                                }
                                serializable = (l20.p) serializableExtra;
                            }
                            ?? r17 = serializable;
                            if (stringExtra2 == null || d53.w.J(stringExtra2)) {
                                a2 a2Var2 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var2, "EmergencyContactSendRequestActivity", "Error! newNumber is null or blank.");
                                emergencyContactSendRequestActivity.displayFailedMessage();
                            } else {
                                emergencyContactSendRequestActivity.ka().F4(false, stringExtra, stringExtra2, r17, stringExtra3, boolValueOf);
                            }
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i19 = aVar3.f67585a;
                        if (i19 != -1) {
                            a2 a2Var3 = a2.SAFETY_FEATURES;
                            String strF2 = e0.f(i19, "Warning! result.resultCode is ", ", not Activity.RESULT_OK (-1). This might only mean that the user did not edit the email address, which is fine.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "EmergencyContactSendRequestActivity", strF2);
                        } else {
                            String stringExtra4 = intent2 != null ? intent2.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra5 = intent2 != null ? intent2.getStringExtra("EXTRA_RESULT") : null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra2 = intent2.getSerializableExtra("EXTRA_LABEL", l20.k.class);
                                } else {
                                    Serializable serializableExtra4 = intent2.getSerializableExtra("EXTRA_LABEL");
                                    serializableExtra2 = (l20.k) (serializableExtra4 instanceof l20.k ? serializableExtra4 : null);
                                }
                                serializable = (l20.k) serializableExtra2;
                            }
                            ?? r16 = serializable;
                            if (stringExtra5 == null || d53.w.J(stringExtra5)) {
                                a2 a2Var4 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "EmergencyContactSendRequestActivity", "Error! newAddress is null or blank.");
                                emergencyContactSendRequestActivity.displayFailedMessage();
                            } else {
                                ?? Ka = emergencyContactSendRequestActivity.ka();
                                int i24 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                                Ka.F4(true, stringExtra4, stringExtra5, r16, null, null);
                            }
                        }
                        break;
                    default:
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        ((f.a) obj).getClass();
                        emergencyContactSendRequestActivity.f32579k = true;
                        emergencyContactSendRequestActivity.ka().K4();
                        break;
                }
            }
        });
        final int i17 = 1;
        this.f32586r = registerForActivityResult(new g.h(), new f.b(this) { // from class: j20.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96561b;

            {
                this.f96561b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v2, types: [com.garmin.android.apps.connectmobile.contacts.emergency.d] */
            /* JADX WARN: Type inference failed for: r13v0, types: [com.garmin.android.apps.connectmobile.contacts.emergency.d] */
            /* JADX WARN: Type inference failed for: r16v3, types: [l20.d] */
            /* JADX WARN: Type inference failed for: r17v0, types: [l20.d] */
            @Override // f.b
            public final void a(Object obj) {
                Serializable serializableExtra;
                Serializable serializableExtra2;
                int i18 = i17;
                Serializable serializable = null;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96561b;
                switch (i18) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        int i19 = aVar.f67585a;
                        if (i19 != -1) {
                            a2 a2Var = a2.SAFETY_FEATURES;
                            String strF = e0.f(i19, "Warning! result.resultCode is ", ", not Activity.RESULT_OK (-1). This might only mean that the user did not edit the phone number, which is fine.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", strF);
                        } else {
                            String stringExtra = intent != null ? intent.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra2 = intent != null ? intent.getStringExtra("EXTRA_RESULT") : null;
                            String stringExtra3 = intent != null ? intent.getStringExtra("RESULT_PHONE_UUID") : null;
                            Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("RESULT_PHONE_ISVALID", true)) : null;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent.getSerializableExtra("EXTRA_LABEL", l20.p.class);
                                } else {
                                    Serializable serializableExtra3 = intent.getSerializableExtra("EXTRA_LABEL");
                                    serializableExtra = (l20.p) (serializableExtra3 instanceof l20.p ? serializableExtra3 : null);
                                }
                                serializable = (l20.p) serializableExtra;
                            }
                            ?? r17 = serializable;
                            if (stringExtra2 == null || d53.w.J(stringExtra2)) {
                                a2 a2Var2 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var2, "EmergencyContactSendRequestActivity", "Error! newNumber is null or blank.");
                                emergencyContactSendRequestActivity.displayFailedMessage();
                            } else {
                                emergencyContactSendRequestActivity.ka().F4(false, stringExtra, stringExtra2, r17, stringExtra3, boolValueOf);
                            }
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i110 = aVar3.f67585a;
                        if (i110 != -1) {
                            a2 a2Var3 = a2.SAFETY_FEATURES;
                            String strF2 = e0.f(i110, "Warning! result.resultCode is ", ", not Activity.RESULT_OK (-1). This might only mean that the user did not edit the email address, which is fine.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "EmergencyContactSendRequestActivity", strF2);
                        } else {
                            String stringExtra4 = intent2 != null ? intent2.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra5 = intent2 != null ? intent2.getStringExtra("EXTRA_RESULT") : null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra2 = intent2.getSerializableExtra("EXTRA_LABEL", l20.k.class);
                                } else {
                                    Serializable serializableExtra4 = intent2.getSerializableExtra("EXTRA_LABEL");
                                    serializableExtra2 = (l20.k) (serializableExtra4 instanceof l20.k ? serializableExtra4 : null);
                                }
                                serializable = (l20.k) serializableExtra2;
                            }
                            ?? r16 = serializable;
                            if (stringExtra5 == null || d53.w.J(stringExtra5)) {
                                a2 a2Var4 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "EmergencyContactSendRequestActivity", "Error! newAddress is null or blank.");
                                emergencyContactSendRequestActivity.displayFailedMessage();
                            } else {
                                ?? Ka = emergencyContactSendRequestActivity.ka();
                                int i24 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                                Ka.F4(true, stringExtra4, stringExtra5, r16, null, null);
                            }
                        }
                        break;
                    default:
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        ((f.a) obj).getClass();
                        emergencyContactSendRequestActivity.f32579k = true;
                        emergencyContactSendRequestActivity.ka().K4();
                        break;
                }
            }
        });
        final int i18 = 2;
        this.f32587t = registerForActivityResult(new g.h(), new f.b(this) { // from class: j20.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96561b;

            {
                this.f96561b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v2, types: [com.garmin.android.apps.connectmobile.contacts.emergency.d] */
            /* JADX WARN: Type inference failed for: r13v0, types: [com.garmin.android.apps.connectmobile.contacts.emergency.d] */
            /* JADX WARN: Type inference failed for: r16v3, types: [l20.d] */
            /* JADX WARN: Type inference failed for: r17v0, types: [l20.d] */
            @Override // f.b
            public final void a(Object obj) {
                Serializable serializableExtra;
                Serializable serializableExtra2;
                int i19 = i18;
                Serializable serializable = null;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96561b;
                switch (i19) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        int i110 = aVar.f67585a;
                        if (i110 != -1) {
                            a2 a2Var = a2.SAFETY_FEATURES;
                            String strF = e0.f(i110, "Warning! result.resultCode is ", ", not Activity.RESULT_OK (-1). This might only mean that the user did not edit the phone number, which is fine.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", strF);
                        } else {
                            String stringExtra = intent != null ? intent.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra2 = intent != null ? intent.getStringExtra("EXTRA_RESULT") : null;
                            String stringExtra3 = intent != null ? intent.getStringExtra("RESULT_PHONE_UUID") : null;
                            Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("RESULT_PHONE_ISVALID", true)) : null;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent.getSerializableExtra("EXTRA_LABEL", l20.p.class);
                                } else {
                                    Serializable serializableExtra3 = intent.getSerializableExtra("EXTRA_LABEL");
                                    serializableExtra = (l20.p) (serializableExtra3 instanceof l20.p ? serializableExtra3 : null);
                                }
                                serializable = (l20.p) serializableExtra;
                            }
                            ?? r17 = serializable;
                            if (stringExtra2 == null || d53.w.J(stringExtra2)) {
                                a2 a2Var2 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var2, "EmergencyContactSendRequestActivity", "Error! newNumber is null or blank.");
                                emergencyContactSendRequestActivity.displayFailedMessage();
                            } else {
                                emergencyContactSendRequestActivity.ka().F4(false, stringExtra, stringExtra2, r17, stringExtra3, boolValueOf);
                            }
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        int i111 = aVar3.f67585a;
                        if (i111 != -1) {
                            a2 a2Var3 = a2.SAFETY_FEATURES;
                            String strF2 = e0.f(i111, "Warning! result.resultCode is ", ", not Activity.RESULT_OK (-1). This might only mean that the user did not edit the email address, which is fine.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "EmergencyContactSendRequestActivity", strF2);
                        } else {
                            String stringExtra4 = intent2 != null ? intent2.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra5 = intent2 != null ? intent2.getStringExtra("EXTRA_RESULT") : null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra2 = intent2.getSerializableExtra("EXTRA_LABEL", l20.k.class);
                                } else {
                                    Serializable serializableExtra4 = intent2.getSerializableExtra("EXTRA_LABEL");
                                    serializableExtra2 = (l20.k) (serializableExtra4 instanceof l20.k ? serializableExtra4 : null);
                                }
                                serializable = (l20.k) serializableExtra2;
                            }
                            ?? r16 = serializable;
                            if (stringExtra5 == null || d53.w.J(stringExtra5)) {
                                a2 a2Var4 = a2.SAFETY_FEATURES;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "EmergencyContactSendRequestActivity", "Error! newAddress is null or blank.");
                                emergencyContactSendRequestActivity.displayFailedMessage();
                            } else {
                                ?? Ka = emergencyContactSendRequestActivity.ka();
                                int i24 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                                Ka.F4(true, stringExtra4, stringExtra5, r16, null, null);
                            }
                        }
                        break;
                    default:
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        ((f.a) obj).getClass();
                        emergencyContactSendRequestActivity.f32579k = true;
                        emergencyContactSendRequestActivity.ka().K4();
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.emergency.a.b
    public final void L4(l20.a aVar, l20.c cVar) {
        l20.p pVarU;
        aVar.getClass();
        EditContactMethodActivity.a aVar2 = EditContactMethodActivity.f32519d;
        String str = cVar != null ? cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null;
        Boolean isEmsValue = cVar != null ? cVar.getIsEmsValue() : null;
        if (cVar == null || (pVarU = cVar.u()) == null) {
            l20.p.f109036d.getClass();
            pVarU = l20.p.MOBILE;
        }
        l20.p pVar = pVarU;
        List<l20.c> listY = aVar.y();
        boolean z14 = false;
        if (listY != null && !listY.isEmpty()) {
            Iterator<T> it = listY.iterator();
            while (it.hasNext()) {
                if (s.g(((l20.c) it.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar != null ? cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                    z14 = true;
                    break;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z14);
        aVar2.getClass();
        this.f32585q.a(EditContactMethodActivity.a.a(this, aVar, str, isEmsValue, pVar, boolValueOf, true), null);
    }

    @Override // z10.p3
    public final Fragment ca() {
        com.garmin.android.apps.connectmobile.contacts.emergency.c.f32628f.getClass();
        return new com.garmin.android.apps.connectmobile.contacts.emergency.c();
    }

    @Override // z10.p3
    public final String da() {
        String str = this.f32574f;
        if (str != null) {
            return str;
        }
        String string = getString(R.string.contacts_validation_assistance_contact_request);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.emergency.a.b
    public final void j4(l20.a aVar, l20.c cVar) {
        l20.k kVarM;
        aVar.getClass();
        EditContactMethodActivity.a aVar2 = EditContactMethodActivity.f32519d;
        String str = cVar != null ? cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null;
        if (cVar == null || (kVarM = cVar.m()) == null) {
            l20.k.f109008d.getClass();
            kVarM = l20.k.HOME;
        }
        this.f32586r.a(EditContactMethodActivity.a.b(aVar2, this, aVar, str, null, kVarM, null, 32), null);
    }

    public final com.garmin.android.apps.connectmobile.contacts.emergency.d ka() {
        return (com.garmin.android.apps.connectmobile.contacts.emergency.d) this.f32577i.getValue();
    }

    public final void la(Fragment fragment, String str, boolean z14) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        if (z14) {
            aVarC.d(str);
        }
        aVarC.e();
    }

    public final void ma() {
        if (Telephony.Sms.getDefaultSmsPackage(getApplicationContext()) == null || this.f32583o == null || this.f32584p == null) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EmergencyContactSendRequestActivity", "Unable to send SMS! No default SMS Package available.");
            pa(false);
            return;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + this.f32584p));
        intent.putExtra("sms_body", this.f32583o);
        intent.putExtra("exit_on_sent", true);
        this.f32587t.a(intent, null);
    }

    public final void na() {
        Intent intentPutExtra = new Intent().putExtra("IS_CONTACT_UPDATED", this.f32578j).putExtra("HAS_MADE_SMS_OPT_IN_REQUEST", this.f32579k).putExtra("GCM_RESULT_HAS_MADE_LIVE_TRACK_SMS_OPT_IN_REQUEST", ka().f32644c ? ka().E4(l20.l.LIVETRACK) : this.f32579k).putExtra("RESULT_CONTACT_DTO", ka().f32646e);
        intentPutExtra.getClass();
        setResult(-1, intentPutExtra);
    }

    public final void oa(l20.a aVar) {
        String string;
        if (ka().f32644c) {
            string = getString(R.string.lbl_dont_send_request_message_format, aVar != null ? aVar.j() : null, x.d(getString(R.string.lbl_dont_send_emergency_contact_fragment), StringUtils.SPACE, getString(R.string.lbl_and), StringUtils.SPACE, getString(R.string.lbl_dont_send_livetrack_combined_fragment)));
        } else if (ka().f32643b || ka().f32650i) {
            string = getString(R.string.lbl_dont_send_request_message_format, aVar != null ? aVar.j() : null, getString(R.string.lbl_dont_send_livetrack_combined_fragment));
        } else {
            string = getString(R.string.lbl_dont_send_request_message_format, aVar != null ? aVar.j() : null, getString(R.string.lbl_dont_send_emergency_contact_fragment));
        }
        string.getClass();
        new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_dont_send_request).setMessage(string).setNegativeButton(R.string.lbl_cancel, new i(28)).setPositiveButton(R.string.lbl_dont_send, new j20.i(this, 1)).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        String string;
        boolean z14 = true;
        if (!ka().f32651j ? !((ka().f32644c || ka().f32650i) && !ka().D4()) : ka().C4()) {
            z14 = false;
        }
        String str = (String) ka().F.d();
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1917392332) {
                if (iHashCode != -217491618) {
                    if (iHashCode == 2012525505 && str.equals("EmergencyContactConfirmFragment")) {
                        if (ka().f32651j) {
                            super.onBackPressed();
                            return;
                        }
                        if (!z14) {
                            na();
                            finish();
                            return;
                        }
                        l20.a aVar = this.f32575g;
                        if (aVar != null) {
                            oa(aVar);
                            return;
                        } else {
                            s.m("contactDTO");
                            throw null;
                        }
                    }
                } else if (str.equals("SendMultipleSMSRequestFragment")) {
                    if (!z14) {
                        na();
                        finish();
                        return;
                    }
                    l20.a aVar2 = this.f32575g;
                    if (aVar2 != null) {
                        oa(aVar2);
                        return;
                    } else {
                        s.m("contactDTO");
                        throw null;
                    }
                }
            } else if (str.equals("SendFeatureSMSRequestFragment")) {
                if (ka().D4()) {
                    if (ka().f32651j) {
                        super.onBackPressed();
                        return;
                    } else {
                        na();
                        finish();
                        return;
                    }
                }
                if (!z14) {
                    super.onBackPressed();
                    return;
                }
                l20.a aVar3 = this.f32575g;
                if (aVar3 == null) {
                    s.m("contactDTO");
                    throw null;
                }
                boolean zE4 = ka().E4(l20.l.EMERGENCY_CONTACT);
                boolean zE5 = ka().E4(l20.l.LIVETRACK);
                if (zE4 || zE5) {
                    string = !zE5 ? getString(R.string.lbl_dont_send_request_message_format, aVar3.j(), getString(R.string.lbl_dont_send_livetrack_combined_fragment)) : getString(R.string.lbl_dont_send_request_message_format, aVar3.j(), getString(R.string.lbl_dont_send_emergency_contact_fragment));
                } else {
                    string = getString(R.string.lbl_dont_send_request_message_format, aVar3.j(), x.d(getString(R.string.lbl_dont_send_emergency_contact_fragment), StringUtils.SPACE, getString(R.string.lbl_and), StringUtils.SPACE, getString(R.string.lbl_dont_send_livetrack_combined_fragment)));
                }
                string.getClass();
                new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_dont_send_request).setMessage(string).setNegativeButton(R.string.lbl_cancel, new i(27)).setPositiveButton(R.string.lbl_dont_send, new j20.i(this, 0)).show();
                return;
            }
        }
        if (getSupportFragmentManager().M() != 0) {
            super.onBackPressed();
            return;
        }
        if (!z14) {
            na();
            finish();
            return;
        }
        l20.a aVar4 = this.f32575g;
        if (aVar4 != null) {
            oa(aVar4);
        } else {
            s.m("contactDTO");
            throw null;
        }
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        Parcelable parcelable;
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().hasExtra("EXTRA_SEND_REQUEST_KEY")) {
            Intent intent = getIntent();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                obj = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_SEND_REQUEST_KEY", l20.a.class) : null;
            } else {
                Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_SEND_REQUEST_KEY") : null;
                if (!(parcelableExtra instanceof l20.a)) {
                    parcelableExtra = null;
                }
                obj = (l20.a) parcelableExtra;
            }
            obj.getClass();
            this.f32575g = (l20.a) obj;
            Intent intent2 = getIntent();
            if (i14 >= 33) {
                parcelable = intent2 != null ? (Parcelable) intent2.getParcelableExtra("EXTRA_CONTACT_METHOD_PRESELECTION", l20.c.class) : null;
            } else {
                Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("EXTRA_CONTACT_METHOD_PRESELECTION") : null;
                if (!(parcelableExtra2 instanceof l20.c)) {
                    parcelableExtra2 = null;
                }
                parcelable = (l20.c) parcelableExtra2;
            }
            this.f32582n = parcelable == null;
            l20.a aVar = this.f32575g;
            if (aVar == null) {
                s.m("contactDTO");
                throw null;
            }
            this.f32574f = aVar.j();
        }
        if (((hl.a) this.f32573e.getValue()) instanceof hl.a.b) {
            showProgressOverlay();
        }
        ka().f32663x.f(this, this.f32571c);
        final int i15 = 0;
        ka().f32653l.f(this, new d(new l(this) { // from class: j20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96563b;

            {
                this.f96563b = this;
            }

            /* JADX WARN: Code duplicated, block: B:58:0x0190  */
            /* JADX WARN: Code duplicated, block: B:87:0x023b  */
            /* JADX WARN: Code duplicated, block: B:89:0x0248  */
            /* JADX WARN: Code duplicated, block: B:91:0x0256  */
            /* JADX WARN: Code duplicated, block: B:92:0x025b  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                l20.c cVar;
                String str;
                Integer numValueOf;
                SmsManager smsManager;
                SmsManager smsManagerForSubscriptionId;
                int i16 = i15;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96563b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj2;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i17 = EmergencyContactSendRequestActivity.c.f32593a[pVar.ordinal()];
                        if (i17 == 1) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            l20.a aVar3 = emergencyContactSendRequestActivity.f32575g;
                            if (aVar3 == null) {
                                p005kotlin.jvm.internal.s.m("contactDTO");
                                throw null;
                            }
                            t7.getClass();
                            o13.u uVar = (o13.u) t7;
                            Object obj3 = uVar.f128605a;
                            if (!aVar3.equals(obj3)) {
                                emergencyContactSendRequestActivity.f32578j = true;
                                emergencyContactSendRequestActivity.f32575g = (l20.a) obj3;
                            }
                            emergencyContactSendRequestActivity.f32576h = (l20.c) uVar.f128606b;
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            if (((Boolean) uVar.f128607c).booleanValue()) {
                                if (emergencyContactSendRequestActivity.ka().f32658q) {
                                    emergencyContactSendRequestActivity.f32579k = true;
                                }
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            o13.u uVar2 = (o13.u) t7;
                            if (uVar2 != null && ((Boolean) uVar2.f128607c).booleanValue()) {
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = (String) obj2;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1917392332:
                                    if (str2.equals("SendFeatureSMSRequestFragment")) {
                                        j22.b bVar = j22.b.f96736a;
                                        j22.a aVar5 = j22.a.f96724m;
                                        j22.a aVar6 = j22.a.f96723l;
                                        bVar.getClass();
                                        if (j22.b.k(aVar5, aVar6)) {
                                            a2 a2Var = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM has SMS Permissions; now sending user to Send  fragment");
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b.getClass();
                                            emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.e(), "EmergencyContactConfirmFragment", true);
                                        } else {
                                            a2 a2Var2 = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM does not have SMS permissions; possibly asking user for them");
                                            j22.b.x(emergencyContactSendRequestActivity, 1, aVar5, aVar6);
                                        }
                                    }
                                    break;
                                case -217491618:
                                    if (str2.equals("SendMultipleSMSRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.f(), str2, false);
                                    }
                                    break;
                                case 43596295:
                                    if (str2.equals("SendNewRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.g.f32695h.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.g(), str2, true);
                                    }
                                    break;
                                case 1107954766:
                                    if (str2.equals("EmergencyContactMethodPickerFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.c.f32628f.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.c(), str2, false);
                                    }
                                    break;
                                case 2012525505:
                                    if (str2.equals("EmergencyContactConfirmFragment")) {
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        if (emergencyContactSendRequestActivity.ka().f32647f == null) {
                                            l20.a aVar7 = emergencyContactSendRequestActivity.f32575g;
                                            if (aVar7 == null) {
                                                p005kotlin.jvm.internal.s.m("contactDTO");
                                                throw null;
                                            }
                                            if (aVar7.k().size() != 1) {
                                                a2 a2Var3 = a2.SAFETY_FEATURES;
                                                l20.a aVar8 = emergencyContactSendRequestActivity.f32575g;
                                                if (aVar8 == null) {
                                                    p005kotlin.jvm.internal.s.m("contactDTO");
                                                    throw null;
                                                }
                                                String strF = e0.f(aVar8.k().size(), "[replaceFragment observer] Error! There is no contact method selected and there are ", " contact methods on the contact! This should not be possible.");
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var3, "EmergencyContactSendRequestActivity", strF);
                                                emergencyContactSendRequestActivity.hideProgressOverlay();
                                                emergencyContactSendRequestActivity.displayFailedMessage();
                                            } else {
                                                emergencyContactSendRequestActivity.qa();
                                            }
                                        } else {
                                            emergencyContactSendRequestActivity.qa();
                                        }
                                    }
                                    break;
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        EmergencyContactSendRequestActivity.a aVar9 = EmergencyContactSendRequestActivity.f32570v;
                        if (((Boolean) obj2).booleanValue()) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                            if (emergencyContactSendRequestActivity.ka().f32657p.length() <= 0) {
                                a2 a2Var4 = a2.SAFETY_FEATURES;
                                String str3 = emergencyContactSendRequestActivity.ka().f32657p;
                                cVar = emergencyContactSendRequestActivity.f32576h;
                                if (cVar != null) {
                                    str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                } else {
                                    str = null;
                                }
                                String strG = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str3, " and the phone number is ", str, "!");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "EmergencyContactSendRequestActivity", strG);
                                emergencyContactSendRequestActivity.pa(false);
                            } else {
                                l20.c cVar2 = emergencyContactSendRequestActivity.f32576h;
                                if (g22.n.d(cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                                    a2 a2Var5 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is true and message contents are filled; sending SMS");
                                    emergencyContactSendRequestActivity.f32583o = emergencyContactSendRequestActivity.ka().f32657p;
                                    l20.c cVar3 = emergencyContactSendRequestActivity.f32576h;
                                    emergencyContactSendRequestActivity.f32584p = cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null;
                                    j22.b bVar2 = j22.b.f96736a;
                                    j22.a[] aVarArr = {j22.a.f96724m, j22.a.f96723l};
                                    bVar2.getClass();
                                    if (j22.b.k(aVarArr)) {
                                        EmergencyContactSendRequestActivity.e eVar = emergencyContactSendRequestActivity.f32572d;
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        Context f104108a = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
                                        PendingIntent broadcast = PendingIntent.getBroadcast(emergencyContactSendRequestActivity, 1, new Intent("BROADCAST_SMS_SENT").setPackage(emergencyContactSendRequestActivity.getPackageName()), 201326592);
                                        int i18 = Build.VERSION.SDK_INT;
                                        if (i18 >= 31) {
                                            SmsManager smsManager2 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                            if (smsManager2 != null) {
                                                numValueOf = Integer.valueOf(smsManager2.getSubscriptionId());
                                            } else {
                                                numValueOf = null;
                                                smsManager = null;
                                            }
                                            wx2.b bVar3 = new wx2.b(f104108a);
                                            if (numValueOf != null || numValueOf.intValue() == -1) {
                                                i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                                numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                            }
                                            Object systemService = emergencyContactSendRequestActivity.getSystemService("phone");
                                            systemService.getClass();
                                            int simState = ((TelephonyManager) systemService).getSimState();
                                            if (numValueOf.intValue() != -1 || simState == 1) {
                                                i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                                emergencyContactSendRequestActivity.ma();
                                            } else {
                                                if (i18 >= 31) {
                                                    SmsManager smsManager3 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                                    smsManagerForSubscriptionId = smsManager3 != null ? smsManager3.createForSubscriptionId(numValueOf.intValue()) : smsManager;
                                                } else {
                                                    smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(numValueOf.intValue());
                                                }
                                                String str4 = emergencyContactSendRequestActivity.f32583o;
                                                String str5 = emergencyContactSendRequestActivity.f32584p;
                                                if (smsManagerForSubscriptionId == null || str4 == null || str5 == null) {
                                                    i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSUsingNativePermission] Sending text message failed because SmsManager was null!");
                                                    emergencyContactSendRequestActivity.pa(true);
                                                } else {
                                                    if (!eVar.f32596a) {
                                                        a7.b.registerReceiver(emergencyContactSendRequestActivity, eVar, new IntentFilter("BROADCAST_SMS_SENT"), 2);
                                                        eVar.f32596a = true;
                                                    }
                                                    int size = smsManagerForSubscriptionId.divideMessage(str4).size();
                                                    emergencyContactSendRequestActivity.f32580l = size;
                                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", sn.a.e(size, "[sendSMSUsingNativePermission] Sending SMS with message size ", " to ", str5));
                                                    if (emergencyContactSendRequestActivity.f32580l > 1) {
                                                        ArrayList arrayList = new ArrayList(emergencyContactSendRequestActivity.f32580l);
                                                        int i19 = emergencyContactSendRequestActivity.f32580l;
                                                        for (int i24 = 0; i24 < i19; i24++) {
                                                            arrayList.add(broadcast);
                                                        }
                                                        try {
                                                            bVar3.b(str5, str4, arrayList);
                                                        } catch (SecurityException e4) {
                                                            a2 a2Var6 = a2.SAFETY_FEATURES;
                                                            i2.f36769a.getClass();
                                                            i2.a.g(a2Var6, "EmergencyContactSendRequestActivity", e4);
                                                            emergencyContactSendRequestActivity.pa(false);
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                    } else {
                                                        bVar3.c(str5, str4, broadcast);
                                                    }
                                                }
                                            }
                                        } else {
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        smsManager = null;
                                        wx2.b bVar4 = new wx2.b(f104108a);
                                        if (numValueOf != null) {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        } else {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        Object systemService2 = emergencyContactSendRequestActivity.getSystemService("phone");
                                        systemService2.getClass();
                                        int simState2 = ((TelephonyManager) systemService2).getSimState();
                                        if (numValueOf.intValue() != -1) {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        } else {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        }
                                    } else {
                                        emergencyContactSendRequestActivity.ma();
                                    }
                                } else {
                                    a2 a2Var7 = a2.SAFETY_FEATURES;
                                    String str6 = emergencyContactSendRequestActivity.ka().f32657p;
                                    cVar = emergencyContactSendRequestActivity.f32576h;
                                    if (cVar != null) {
                                        str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    } else {
                                        str = null;
                                    }
                                    String strG2 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str6, " and the phone number is ", str, "!");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var7, "EmergencyContactSendRequestActivity", strG2);
                                    emergencyContactSendRequestActivity.pa(false);
                                }
                            }
                            break;
                        } else {
                            a2 a2Var8 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var8, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is false; doing nothing");
                        }
                        return Unit.INSTANCE;
                    default:
                        EmergencyContactSendRequestActivity.b bVar5 = (EmergencyContactSendRequestActivity.b) obj2;
                        EmergencyContactSendRequestActivity.a aVar10 = EmergencyContactSendRequestActivity.f32570v;
                        EmergencyContactSendRequestActivity emergencyContactSendRequestActivity2 = this.f96563b;
                        emergencyContactSendRequestActivity2.hideProgressOverlay();
                        int i25 = bVar5 == null ? -1 : EmergencyContactSendRequestActivity.c.f32594b[bVar5.ordinal()];
                        if (i25 == -1) {
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else if (i25 == 1) {
                            c22.f fVar = c22.f.f23050a;
                            l20.l lVar = emergencyContactSendRequestActivity2.ka().f32659r;
                            l20.l lVar2 = l20.l.LIVETRACK;
                            c22.f.d(fVar, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(lVar == lVar2 ? R.string.cannot_send_request : R.string.lbl_invalid_mobile_number_title), emergencyContactSendRequestActivity2.getString(emergencyContactSendRequestActivity2.ka().f32659r == lVar2 ? R.string.msg_invalid_phone_number : R.string.msg_contacts_validation_invalid_mobile_phone_number), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_ok), new in2.e((byte) 0, 11)), null, null, false, 112).show();
                        } else if (i25 == 2) {
                            emergencyContactSendRequestActivity2.pa(false);
                        } else if (i25 != 3) {
                            if (i25 != 4) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else {
                            c22.f.d(c22.f.f23050a, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_title), emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_message), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_retry), new h(emergencyContactSendRequestActivity2, 0)), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_cancel), new h(emergencyContactSendRequestActivity2, 1)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 1;
        ka().F.f(this, new d(new l(this) { // from class: j20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96563b;

            {
                this.f96563b = this;
            }

            /* JADX WARN: Code duplicated, block: B:58:0x0190  */
            /* JADX WARN: Code duplicated, block: B:87:0x023b  */
            /* JADX WARN: Code duplicated, block: B:89:0x0248  */
            /* JADX WARN: Code duplicated, block: B:91:0x0256  */
            /* JADX WARN: Code duplicated, block: B:92:0x025b  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                l20.c cVar;
                String str;
                Integer numValueOf;
                SmsManager smsManager;
                SmsManager smsManagerForSubscriptionId;
                int i17 = i16;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96563b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj2;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i18 = EmergencyContactSendRequestActivity.c.f32593a[pVar.ordinal()];
                        if (i18 == 1) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                        } else if (i18 == 2) {
                            l20.a aVar3 = emergencyContactSendRequestActivity.f32575g;
                            if (aVar3 == null) {
                                p005kotlin.jvm.internal.s.m("contactDTO");
                                throw null;
                            }
                            t7.getClass();
                            o13.u uVar = (o13.u) t7;
                            Object obj3 = uVar.f128605a;
                            if (!aVar3.equals(obj3)) {
                                emergencyContactSendRequestActivity.f32578j = true;
                                emergencyContactSendRequestActivity.f32575g = (l20.a) obj3;
                            }
                            emergencyContactSendRequestActivity.f32576h = (l20.c) uVar.f128606b;
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            if (((Boolean) uVar.f128607c).booleanValue()) {
                                if (emergencyContactSendRequestActivity.ka().f32658q) {
                                    emergencyContactSendRequestActivity.f32579k = true;
                                }
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            o13.u uVar2 = (o13.u) t7;
                            if (uVar2 != null && ((Boolean) uVar2.f128607c).booleanValue()) {
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = (String) obj2;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1917392332:
                                    if (str2.equals("SendFeatureSMSRequestFragment")) {
                                        j22.b bVar = j22.b.f96736a;
                                        j22.a aVar5 = j22.a.f96724m;
                                        j22.a aVar6 = j22.a.f96723l;
                                        bVar.getClass();
                                        if (j22.b.k(aVar5, aVar6)) {
                                            a2 a2Var = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM has SMS Permissions; now sending user to Send  fragment");
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b.getClass();
                                            emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.e(), "EmergencyContactConfirmFragment", true);
                                        } else {
                                            a2 a2Var2 = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM does not have SMS permissions; possibly asking user for them");
                                            j22.b.x(emergencyContactSendRequestActivity, 1, aVar5, aVar6);
                                        }
                                    }
                                    break;
                                case -217491618:
                                    if (str2.equals("SendMultipleSMSRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.f(), str2, false);
                                    }
                                    break;
                                case 43596295:
                                    if (str2.equals("SendNewRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.g.f32695h.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.g(), str2, true);
                                    }
                                    break;
                                case 1107954766:
                                    if (str2.equals("EmergencyContactMethodPickerFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.c.f32628f.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.c(), str2, false);
                                    }
                                    break;
                                case 2012525505:
                                    if (str2.equals("EmergencyContactConfirmFragment")) {
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        if (emergencyContactSendRequestActivity.ka().f32647f == null) {
                                            l20.a aVar7 = emergencyContactSendRequestActivity.f32575g;
                                            if (aVar7 == null) {
                                                p005kotlin.jvm.internal.s.m("contactDTO");
                                                throw null;
                                            }
                                            if (aVar7.k().size() != 1) {
                                                a2 a2Var3 = a2.SAFETY_FEATURES;
                                                l20.a aVar8 = emergencyContactSendRequestActivity.f32575g;
                                                if (aVar8 == null) {
                                                    p005kotlin.jvm.internal.s.m("contactDTO");
                                                    throw null;
                                                }
                                                String strF = e0.f(aVar8.k().size(), "[replaceFragment observer] Error! There is no contact method selected and there are ", " contact methods on the contact! This should not be possible.");
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var3, "EmergencyContactSendRequestActivity", strF);
                                                emergencyContactSendRequestActivity.hideProgressOverlay();
                                                emergencyContactSendRequestActivity.displayFailedMessage();
                                            } else {
                                                emergencyContactSendRequestActivity.qa();
                                            }
                                        } else {
                                            emergencyContactSendRequestActivity.qa();
                                        }
                                    }
                                    break;
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        EmergencyContactSendRequestActivity.a aVar9 = EmergencyContactSendRequestActivity.f32570v;
                        if (((Boolean) obj2).booleanValue()) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                            if (emergencyContactSendRequestActivity.ka().f32657p.length() <= 0) {
                                a2 a2Var7 = a2.SAFETY_FEATURES;
                                String str6 = emergencyContactSendRequestActivity.ka().f32657p;
                                cVar = emergencyContactSendRequestActivity.f32576h;
                                if (cVar != null) {
                                    str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                } else {
                                    str = null;
                                }
                                String strG2 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str6, " and the phone number is ", str, "!");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var7, "EmergencyContactSendRequestActivity", strG2);
                                emergencyContactSendRequestActivity.pa(false);
                            } else {
                                l20.c cVar2 = emergencyContactSendRequestActivity.f32576h;
                                if (g22.n.d(cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                                    a2 a2Var5 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is true and message contents are filled; sending SMS");
                                    emergencyContactSendRequestActivity.f32583o = emergencyContactSendRequestActivity.ka().f32657p;
                                    l20.c cVar3 = emergencyContactSendRequestActivity.f32576h;
                                    emergencyContactSendRequestActivity.f32584p = cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null;
                                    j22.b bVar2 = j22.b.f96736a;
                                    j22.a[] aVarArr = {j22.a.f96724m, j22.a.f96723l};
                                    bVar2.getClass();
                                    if (j22.b.k(aVarArr)) {
                                        EmergencyContactSendRequestActivity.e eVar = emergencyContactSendRequestActivity.f32572d;
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        Context f104108a = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
                                        PendingIntent broadcast = PendingIntent.getBroadcast(emergencyContactSendRequestActivity, 1, new Intent("BROADCAST_SMS_SENT").setPackage(emergencyContactSendRequestActivity.getPackageName()), 201326592);
                                        int i19 = Build.VERSION.SDK_INT;
                                        if (i19 >= 31) {
                                            SmsManager smsManager2 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                            if (smsManager2 != null) {
                                                numValueOf = Integer.valueOf(smsManager2.getSubscriptionId());
                                            } else {
                                                numValueOf = null;
                                                smsManager = null;
                                            }
                                            wx2.b bVar4 = new wx2.b(f104108a);
                                            if (numValueOf != null || numValueOf.intValue() == -1) {
                                                i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                                numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                            }
                                            Object systemService2 = emergencyContactSendRequestActivity.getSystemService("phone");
                                            systemService2.getClass();
                                            int simState2 = ((TelephonyManager) systemService2).getSimState();
                                            if (numValueOf.intValue() != -1 || simState2 == 1) {
                                                i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                                emergencyContactSendRequestActivity.ma();
                                            } else {
                                                if (i19 >= 31) {
                                                    SmsManager smsManager3 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                                    smsManagerForSubscriptionId = smsManager3 != null ? smsManager3.createForSubscriptionId(numValueOf.intValue()) : smsManager;
                                                } else {
                                                    smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(numValueOf.intValue());
                                                }
                                                String str4 = emergencyContactSendRequestActivity.f32583o;
                                                String str5 = emergencyContactSendRequestActivity.f32584p;
                                                if (smsManagerForSubscriptionId == null || str4 == null || str5 == null) {
                                                    i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSUsingNativePermission] Sending text message failed because SmsManager was null!");
                                                    emergencyContactSendRequestActivity.pa(true);
                                                } else {
                                                    if (!eVar.f32596a) {
                                                        a7.b.registerReceiver(emergencyContactSendRequestActivity, eVar, new IntentFilter("BROADCAST_SMS_SENT"), 2);
                                                        eVar.f32596a = true;
                                                    }
                                                    int size = smsManagerForSubscriptionId.divideMessage(str4).size();
                                                    emergencyContactSendRequestActivity.f32580l = size;
                                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", sn.a.e(size, "[sendSMSUsingNativePermission] Sending SMS with message size ", " to ", str5));
                                                    if (emergencyContactSendRequestActivity.f32580l > 1) {
                                                        ArrayList arrayList = new ArrayList(emergencyContactSendRequestActivity.f32580l);
                                                        int i110 = emergencyContactSendRequestActivity.f32580l;
                                                        for (int i24 = 0; i24 < i110; i24++) {
                                                            arrayList.add(broadcast);
                                                        }
                                                        try {
                                                            bVar4.b(str5, str4, arrayList);
                                                        } catch (SecurityException e4) {
                                                            a2 a2Var6 = a2.SAFETY_FEATURES;
                                                            i2.f36769a.getClass();
                                                            i2.a.g(a2Var6, "EmergencyContactSendRequestActivity", e4);
                                                            emergencyContactSendRequestActivity.pa(false);
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                    } else {
                                                        bVar4.c(str5, str4, broadcast);
                                                    }
                                                }
                                            }
                                        } else {
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        smsManager = null;
                                        wx2.b bVar5 = new wx2.b(f104108a);
                                        if (numValueOf != null) {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        } else {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        Object systemService3 = emergencyContactSendRequestActivity.getSystemService("phone");
                                        systemService3.getClass();
                                        int simState3 = ((TelephonyManager) systemService3).getSimState();
                                        if (numValueOf.intValue() != -1) {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        } else {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        }
                                    } else {
                                        emergencyContactSendRequestActivity.ma();
                                    }
                                } else {
                                    a2 a2Var8 = a2.SAFETY_FEATURES;
                                    String str7 = emergencyContactSendRequestActivity.ka().f32657p;
                                    cVar = emergencyContactSendRequestActivity.f32576h;
                                    if (cVar != null) {
                                        str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    } else {
                                        str = null;
                                    }
                                    String strG3 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str7, " and the phone number is ", str, "!");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var8, "EmergencyContactSendRequestActivity", strG3);
                                    emergencyContactSendRequestActivity.pa(false);
                                }
                            }
                            break;
                        } else {
                            a2 a2Var9 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var9, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is false; doing nothing");
                        }
                        return Unit.INSTANCE;
                    default:
                        EmergencyContactSendRequestActivity.b bVar6 = (EmergencyContactSendRequestActivity.b) obj2;
                        EmergencyContactSendRequestActivity.a aVar10 = EmergencyContactSendRequestActivity.f32570v;
                        EmergencyContactSendRequestActivity emergencyContactSendRequestActivity2 = this.f96563b;
                        emergencyContactSendRequestActivity2.hideProgressOverlay();
                        int i25 = bVar6 == null ? -1 : EmergencyContactSendRequestActivity.c.f32594b[bVar6.ordinal()];
                        if (i25 == -1) {
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else if (i25 == 1) {
                            c22.f fVar = c22.f.f23050a;
                            l20.l lVar = emergencyContactSendRequestActivity2.ka().f32659r;
                            l20.l lVar2 = l20.l.LIVETRACK;
                            c22.f.d(fVar, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(lVar == lVar2 ? R.string.cannot_send_request : R.string.lbl_invalid_mobile_number_title), emergencyContactSendRequestActivity2.getString(emergencyContactSendRequestActivity2.ka().f32659r == lVar2 ? R.string.msg_invalid_phone_number : R.string.msg_contacts_validation_invalid_mobile_phone_number), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_ok), new in2.e((byte) 0, 11)), null, null, false, 112).show();
                        } else if (i25 == 2) {
                            emergencyContactSendRequestActivity2.pa(false);
                        } else if (i25 != 3) {
                            if (i25 != 4) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else {
                            c22.f.d(c22.f.f23050a, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_title), emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_message), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_retry), new h(emergencyContactSendRequestActivity2, 0)), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_cancel), new h(emergencyContactSendRequestActivity2, 1)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 2;
        ka().B.f(this, new d(new l(this) { // from class: j20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96563b;

            {
                this.f96563b = this;
            }

            /* JADX WARN: Code duplicated, block: B:58:0x0190  */
            /* JADX WARN: Code duplicated, block: B:87:0x023b  */
            /* JADX WARN: Code duplicated, block: B:89:0x0248  */
            /* JADX WARN: Code duplicated, block: B:91:0x0256  */
            /* JADX WARN: Code duplicated, block: B:92:0x025b  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                l20.c cVar;
                String str;
                Integer numValueOf;
                SmsManager smsManager;
                SmsManager smsManagerForSubscriptionId;
                int i18 = i17;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96563b;
                switch (i18) {
                    case 0:
                        g3 g3Var = (g3) obj2;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i19 = EmergencyContactSendRequestActivity.c.f32593a[pVar.ordinal()];
                        if (i19 == 1) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            l20.a aVar3 = emergencyContactSendRequestActivity.f32575g;
                            if (aVar3 == null) {
                                p005kotlin.jvm.internal.s.m("contactDTO");
                                throw null;
                            }
                            t7.getClass();
                            o13.u uVar = (o13.u) t7;
                            Object obj3 = uVar.f128605a;
                            if (!aVar3.equals(obj3)) {
                                emergencyContactSendRequestActivity.f32578j = true;
                                emergencyContactSendRequestActivity.f32575g = (l20.a) obj3;
                            }
                            emergencyContactSendRequestActivity.f32576h = (l20.c) uVar.f128606b;
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            if (((Boolean) uVar.f128607c).booleanValue()) {
                                if (emergencyContactSendRequestActivity.ka().f32658q) {
                                    emergencyContactSendRequestActivity.f32579k = true;
                                }
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            o13.u uVar2 = (o13.u) t7;
                            if (uVar2 != null && ((Boolean) uVar2.f128607c).booleanValue()) {
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = (String) obj2;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1917392332:
                                    if (str2.equals("SendFeatureSMSRequestFragment")) {
                                        j22.b bVar = j22.b.f96736a;
                                        j22.a aVar5 = j22.a.f96724m;
                                        j22.a aVar6 = j22.a.f96723l;
                                        bVar.getClass();
                                        if (j22.b.k(aVar5, aVar6)) {
                                            a2 a2Var = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM has SMS Permissions; now sending user to Send  fragment");
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b.getClass();
                                            emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.e(), "EmergencyContactConfirmFragment", true);
                                        } else {
                                            a2 a2Var2 = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM does not have SMS permissions; possibly asking user for them");
                                            j22.b.x(emergencyContactSendRequestActivity, 1, aVar5, aVar6);
                                        }
                                    }
                                    break;
                                case -217491618:
                                    if (str2.equals("SendMultipleSMSRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.f(), str2, false);
                                    }
                                    break;
                                case 43596295:
                                    if (str2.equals("SendNewRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.g.f32695h.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.g(), str2, true);
                                    }
                                    break;
                                case 1107954766:
                                    if (str2.equals("EmergencyContactMethodPickerFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.c.f32628f.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.c(), str2, false);
                                    }
                                    break;
                                case 2012525505:
                                    if (str2.equals("EmergencyContactConfirmFragment")) {
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        if (emergencyContactSendRequestActivity.ka().f32647f == null) {
                                            l20.a aVar7 = emergencyContactSendRequestActivity.f32575g;
                                            if (aVar7 == null) {
                                                p005kotlin.jvm.internal.s.m("contactDTO");
                                                throw null;
                                            }
                                            if (aVar7.k().size() != 1) {
                                                a2 a2Var3 = a2.SAFETY_FEATURES;
                                                l20.a aVar8 = emergencyContactSendRequestActivity.f32575g;
                                                if (aVar8 == null) {
                                                    p005kotlin.jvm.internal.s.m("contactDTO");
                                                    throw null;
                                                }
                                                String strF = e0.f(aVar8.k().size(), "[replaceFragment observer] Error! There is no contact method selected and there are ", " contact methods on the contact! This should not be possible.");
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var3, "EmergencyContactSendRequestActivity", strF);
                                                emergencyContactSendRequestActivity.hideProgressOverlay();
                                                emergencyContactSendRequestActivity.displayFailedMessage();
                                            } else {
                                                emergencyContactSendRequestActivity.qa();
                                            }
                                        } else {
                                            emergencyContactSendRequestActivity.qa();
                                        }
                                    }
                                    break;
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        EmergencyContactSendRequestActivity.a aVar9 = EmergencyContactSendRequestActivity.f32570v;
                        if (((Boolean) obj2).booleanValue()) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                            if (emergencyContactSendRequestActivity.ka().f32657p.length() <= 0) {
                                a2 a2Var8 = a2.SAFETY_FEATURES;
                                String str7 = emergencyContactSendRequestActivity.ka().f32657p;
                                cVar = emergencyContactSendRequestActivity.f32576h;
                                if (cVar != null) {
                                    str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                } else {
                                    str = null;
                                }
                                String strG3 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str7, " and the phone number is ", str, "!");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var8, "EmergencyContactSendRequestActivity", strG3);
                                emergencyContactSendRequestActivity.pa(false);
                            } else {
                                l20.c cVar2 = emergencyContactSendRequestActivity.f32576h;
                                if (g22.n.d(cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                                    a2 a2Var5 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is true and message contents are filled; sending SMS");
                                    emergencyContactSendRequestActivity.f32583o = emergencyContactSendRequestActivity.ka().f32657p;
                                    l20.c cVar3 = emergencyContactSendRequestActivity.f32576h;
                                    emergencyContactSendRequestActivity.f32584p = cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null;
                                    j22.b bVar2 = j22.b.f96736a;
                                    j22.a[] aVarArr = {j22.a.f96724m, j22.a.f96723l};
                                    bVar2.getClass();
                                    if (j22.b.k(aVarArr)) {
                                        EmergencyContactSendRequestActivity.e eVar = emergencyContactSendRequestActivity.f32572d;
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        Context f104108a = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
                                        PendingIntent broadcast = PendingIntent.getBroadcast(emergencyContactSendRequestActivity, 1, new Intent("BROADCAST_SMS_SENT").setPackage(emergencyContactSendRequestActivity.getPackageName()), 201326592);
                                        int i110 = Build.VERSION.SDK_INT;
                                        if (i110 >= 31) {
                                            SmsManager smsManager2 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                            if (smsManager2 != null) {
                                                numValueOf = Integer.valueOf(smsManager2.getSubscriptionId());
                                            } else {
                                                numValueOf = null;
                                                smsManager = null;
                                            }
                                            wx2.b bVar5 = new wx2.b(f104108a);
                                            if (numValueOf != null || numValueOf.intValue() == -1) {
                                                i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                                numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                            }
                                            Object systemService3 = emergencyContactSendRequestActivity.getSystemService("phone");
                                            systemService3.getClass();
                                            int simState3 = ((TelephonyManager) systemService3).getSimState();
                                            if (numValueOf.intValue() != -1 || simState3 == 1) {
                                                i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                                emergencyContactSendRequestActivity.ma();
                                            } else {
                                                if (i110 >= 31) {
                                                    SmsManager smsManager3 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                                    smsManagerForSubscriptionId = smsManager3 != null ? smsManager3.createForSubscriptionId(numValueOf.intValue()) : smsManager;
                                                } else {
                                                    smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(numValueOf.intValue());
                                                }
                                                String str4 = emergencyContactSendRequestActivity.f32583o;
                                                String str5 = emergencyContactSendRequestActivity.f32584p;
                                                if (smsManagerForSubscriptionId == null || str4 == null || str5 == null) {
                                                    i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSUsingNativePermission] Sending text message failed because SmsManager was null!");
                                                    emergencyContactSendRequestActivity.pa(true);
                                                } else {
                                                    if (!eVar.f32596a) {
                                                        a7.b.registerReceiver(emergencyContactSendRequestActivity, eVar, new IntentFilter("BROADCAST_SMS_SENT"), 2);
                                                        eVar.f32596a = true;
                                                    }
                                                    int size = smsManagerForSubscriptionId.divideMessage(str4).size();
                                                    emergencyContactSendRequestActivity.f32580l = size;
                                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", sn.a.e(size, "[sendSMSUsingNativePermission] Sending SMS with message size ", " to ", str5));
                                                    if (emergencyContactSendRequestActivity.f32580l > 1) {
                                                        ArrayList arrayList = new ArrayList(emergencyContactSendRequestActivity.f32580l);
                                                        int i111 = emergencyContactSendRequestActivity.f32580l;
                                                        for (int i24 = 0; i24 < i111; i24++) {
                                                            arrayList.add(broadcast);
                                                        }
                                                        try {
                                                            bVar5.b(str5, str4, arrayList);
                                                        } catch (SecurityException e4) {
                                                            a2 a2Var6 = a2.SAFETY_FEATURES;
                                                            i2.f36769a.getClass();
                                                            i2.a.g(a2Var6, "EmergencyContactSendRequestActivity", e4);
                                                            emergencyContactSendRequestActivity.pa(false);
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                    } else {
                                                        bVar5.c(str5, str4, broadcast);
                                                    }
                                                }
                                            }
                                        } else {
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        smsManager = null;
                                        wx2.b bVar6 = new wx2.b(f104108a);
                                        if (numValueOf != null) {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        } else {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        Object systemService4 = emergencyContactSendRequestActivity.getSystemService("phone");
                                        systemService4.getClass();
                                        int simState4 = ((TelephonyManager) systemService4).getSimState();
                                        if (numValueOf.intValue() != -1) {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        } else {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        }
                                    } else {
                                        emergencyContactSendRequestActivity.ma();
                                    }
                                } else {
                                    a2 a2Var9 = a2.SAFETY_FEATURES;
                                    String str8 = emergencyContactSendRequestActivity.ka().f32657p;
                                    cVar = emergencyContactSendRequestActivity.f32576h;
                                    if (cVar != null) {
                                        str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    } else {
                                        str = null;
                                    }
                                    String strG4 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str8, " and the phone number is ", str, "!");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var9, "EmergencyContactSendRequestActivity", strG4);
                                    emergencyContactSendRequestActivity.pa(false);
                                }
                            }
                            break;
                        } else {
                            a2 a2Var10 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var10, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is false; doing nothing");
                        }
                        return Unit.INSTANCE;
                    default:
                        EmergencyContactSendRequestActivity.b bVar7 = (EmergencyContactSendRequestActivity.b) obj2;
                        EmergencyContactSendRequestActivity.a aVar10 = EmergencyContactSendRequestActivity.f32570v;
                        EmergencyContactSendRequestActivity emergencyContactSendRequestActivity2 = this.f96563b;
                        emergencyContactSendRequestActivity2.hideProgressOverlay();
                        int i25 = bVar7 == null ? -1 : EmergencyContactSendRequestActivity.c.f32594b[bVar7.ordinal()];
                        if (i25 == -1) {
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else if (i25 == 1) {
                            c22.f fVar = c22.f.f23050a;
                            l20.l lVar = emergencyContactSendRequestActivity2.ka().f32659r;
                            l20.l lVar2 = l20.l.LIVETRACK;
                            c22.f.d(fVar, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(lVar == lVar2 ? R.string.cannot_send_request : R.string.lbl_invalid_mobile_number_title), emergencyContactSendRequestActivity2.getString(emergencyContactSendRequestActivity2.ka().f32659r == lVar2 ? R.string.msg_invalid_phone_number : R.string.msg_contacts_validation_invalid_mobile_phone_number), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_ok), new in2.e((byte) 0, 11)), null, null, false, 112).show();
                        } else if (i25 == 2) {
                            emergencyContactSendRequestActivity2.pa(false);
                        } else if (i25 != 3) {
                            if (i25 != 4) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else {
                            c22.f.d(c22.f.f23050a, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_title), emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_message), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_retry), new h(emergencyContactSendRequestActivity2, 0)), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_cancel), new h(emergencyContactSendRequestActivity2, 1)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 3;
        ka().P.f(this, new d(new l(this) { // from class: j20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyContactSendRequestActivity f96563b;

            {
                this.f96563b = this;
            }

            /* JADX WARN: Code duplicated, block: B:58:0x0190  */
            /* JADX WARN: Code duplicated, block: B:87:0x023b  */
            /* JADX WARN: Code duplicated, block: B:89:0x0248  */
            /* JADX WARN: Code duplicated, block: B:91:0x0256  */
            /* JADX WARN: Code duplicated, block: B:92:0x025b  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                l20.c cVar;
                String str;
                Integer numValueOf;
                SmsManager smsManager;
                SmsManager smsManagerForSubscriptionId;
                int i19 = i18;
                EmergencyContactSendRequestActivity emergencyContactSendRequestActivity = this.f96563b;
                switch (i19) {
                    case 0:
                        g3 g3Var = (g3) obj2;
                        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i110 = EmergencyContactSendRequestActivity.c.f32593a[pVar.ordinal()];
                        if (i110 == 1) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                        } else if (i110 == 2) {
                            l20.a aVar3 = emergencyContactSendRequestActivity.f32575g;
                            if (aVar3 == null) {
                                p005kotlin.jvm.internal.s.m("contactDTO");
                                throw null;
                            }
                            t7.getClass();
                            o13.u uVar = (o13.u) t7;
                            Object obj3 = uVar.f128605a;
                            if (!aVar3.equals(obj3)) {
                                emergencyContactSendRequestActivity.f32578j = true;
                                emergencyContactSendRequestActivity.f32575g = (l20.a) obj3;
                            }
                            emergencyContactSendRequestActivity.f32576h = (l20.c) uVar.f128606b;
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            if (((Boolean) uVar.f128607c).booleanValue()) {
                                if (emergencyContactSendRequestActivity.ka().f32658q) {
                                    emergencyContactSendRequestActivity.f32579k = true;
                                }
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity.hideProgressOverlay();
                            o13.u uVar2 = (o13.u) t7;
                            if (uVar2 != null && ((Boolean) uVar2.f128607c).booleanValue()) {
                                emergencyContactSendRequestActivity.na();
                                emergencyContactSendRequestActivity.finish();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = (String) obj2;
                        EmergencyContactSendRequestActivity.a aVar4 = EmergencyContactSendRequestActivity.f32570v;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1917392332:
                                    if (str2.equals("SendFeatureSMSRequestFragment")) {
                                        j22.b bVar = j22.b.f96736a;
                                        j22.a aVar5 = j22.a.f96724m;
                                        j22.a aVar6 = j22.a.f96723l;
                                        bVar.getClass();
                                        if (j22.b.k(aVar5, aVar6)) {
                                            a2 a2Var = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM has SMS Permissions; now sending user to Send  fragment");
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b.getClass();
                                            emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.e(), "EmergencyContactConfirmFragment", true);
                                        } else {
                                            a2 a2Var2 = a2.SAFETY_FEATURES;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "EmergencyContactSendRequestActivity", "[startFeatureSMSRequestFragment] GCM does not have SMS permissions; possibly asking user for them");
                                            j22.b.x(emergencyContactSendRequestActivity, 1, aVar5, aVar6);
                                        }
                                    }
                                    break;
                                case -217491618:
                                    if (str2.equals("SendMultipleSMSRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.f(), str2, false);
                                    }
                                    break;
                                case 43596295:
                                    if (str2.equals("SendNewRequestFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.g.f32695h.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.g(), str2, true);
                                    }
                                    break;
                                case 1107954766:
                                    if (str2.equals("EmergencyContactMethodPickerFragment")) {
                                        com.garmin.android.apps.connectmobile.contacts.emergency.c.f32628f.getClass();
                                        emergencyContactSendRequestActivity.la(new com.garmin.android.apps.connectmobile.contacts.emergency.c(), str2, false);
                                    }
                                    break;
                                case 2012525505:
                                    if (str2.equals("EmergencyContactConfirmFragment")) {
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        if (emergencyContactSendRequestActivity.ka().f32647f == null) {
                                            l20.a aVar7 = emergencyContactSendRequestActivity.f32575g;
                                            if (aVar7 == null) {
                                                p005kotlin.jvm.internal.s.m("contactDTO");
                                                throw null;
                                            }
                                            if (aVar7.k().size() != 1) {
                                                a2 a2Var3 = a2.SAFETY_FEATURES;
                                                l20.a aVar8 = emergencyContactSendRequestActivity.f32575g;
                                                if (aVar8 == null) {
                                                    p005kotlin.jvm.internal.s.m("contactDTO");
                                                    throw null;
                                                }
                                                String strF = e0.f(aVar8.k().size(), "[replaceFragment observer] Error! There is no contact method selected and there are ", " contact methods on the contact! This should not be possible.");
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var3, "EmergencyContactSendRequestActivity", strF);
                                                emergencyContactSendRequestActivity.hideProgressOverlay();
                                                emergencyContactSendRequestActivity.displayFailedMessage();
                                            } else {
                                                emergencyContactSendRequestActivity.qa();
                                            }
                                        } else {
                                            emergencyContactSendRequestActivity.qa();
                                        }
                                    }
                                    break;
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        EmergencyContactSendRequestActivity.a aVar9 = EmergencyContactSendRequestActivity.f32570v;
                        if (((Boolean) obj2).booleanValue()) {
                            emergencyContactSendRequestActivity.showProgressOverlay();
                            if (emergencyContactSendRequestActivity.ka().f32657p.length() <= 0) {
                                a2 a2Var9 = a2.SAFETY_FEATURES;
                                String str8 = emergencyContactSendRequestActivity.ka().f32657p;
                                cVar = emergencyContactSendRequestActivity.f32576h;
                                if (cVar != null) {
                                    str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                } else {
                                    str = null;
                                }
                                String strG4 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str8, " and the phone number is ", str, "!");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var9, "EmergencyContactSendRequestActivity", strG4);
                                emergencyContactSendRequestActivity.pa(false);
                            } else {
                                l20.c cVar2 = emergencyContactSendRequestActivity.f32576h;
                                if (g22.n.d(cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                                    a2 a2Var5 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is true and message contents are filled; sending SMS");
                                    emergencyContactSendRequestActivity.f32583o = emergencyContactSendRequestActivity.ka().f32657p;
                                    l20.c cVar3 = emergencyContactSendRequestActivity.f32576h;
                                    emergencyContactSendRequestActivity.f32584p = cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null;
                                    j22.b bVar2 = j22.b.f96736a;
                                    j22.a[] aVarArr = {j22.a.f96724m, j22.a.f96723l};
                                    bVar2.getClass();
                                    if (j22.b.k(aVarArr)) {
                                        EmergencyContactSendRequestActivity.e eVar = emergencyContactSendRequestActivity.f32572d;
                                        emergencyContactSendRequestActivity.showProgressOverlay();
                                        Context f104108a = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
                                        PendingIntent broadcast = PendingIntent.getBroadcast(emergencyContactSendRequestActivity, 1, new Intent("BROADCAST_SMS_SENT").setPackage(emergencyContactSendRequestActivity.getPackageName()), 201326592);
                                        int i111 = Build.VERSION.SDK_INT;
                                        if (i111 >= 31) {
                                            SmsManager smsManager2 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                            if (smsManager2 != null) {
                                                numValueOf = Integer.valueOf(smsManager2.getSubscriptionId());
                                            } else {
                                                numValueOf = null;
                                                smsManager = null;
                                            }
                                            wx2.b bVar6 = new wx2.b(f104108a);
                                            if (numValueOf != null || numValueOf.intValue() == -1) {
                                                i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                                numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                            }
                                            Object systemService4 = emergencyContactSendRequestActivity.getSystemService("phone");
                                            systemService4.getClass();
                                            int simState4 = ((TelephonyManager) systemService4).getSimState();
                                            if (numValueOf.intValue() != -1 || simState4 == 1) {
                                                i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                                emergencyContactSendRequestActivity.ma();
                                            } else {
                                                if (i111 >= 31) {
                                                    SmsManager smsManager3 = (SmsManager) a7.b.getSystemService(f104108a, SmsManager.class);
                                                    smsManagerForSubscriptionId = smsManager3 != null ? smsManager3.createForSubscriptionId(numValueOf.intValue()) : smsManager;
                                                } else {
                                                    smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(numValueOf.intValue());
                                                }
                                                String str4 = emergencyContactSendRequestActivity.f32583o;
                                                String str5 = emergencyContactSendRequestActivity.f32584p;
                                                if (smsManagerForSubscriptionId == null || str4 == null || str5 == null) {
                                                    i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "[sendSMSUsingNativePermission] Sending text message failed because SmsManager was null!");
                                                    emergencyContactSendRequestActivity.pa(true);
                                                } else {
                                                    if (!eVar.f32596a) {
                                                        a7.b.registerReceiver(emergencyContactSendRequestActivity, eVar, new IntentFilter("BROADCAST_SMS_SENT"), 2);
                                                        eVar.f32596a = true;
                                                    }
                                                    int size = smsManagerForSubscriptionId.divideMessage(str4).size();
                                                    emergencyContactSendRequestActivity.f32580l = size;
                                                    i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", sn.a.e(size, "[sendSMSUsingNativePermission] Sending SMS with message size ", " to ", str5));
                                                    if (emergencyContactSendRequestActivity.f32580l > 1) {
                                                        ArrayList arrayList = new ArrayList(emergencyContactSendRequestActivity.f32580l);
                                                        int i112 = emergencyContactSendRequestActivity.f32580l;
                                                        for (int i24 = 0; i24 < i112; i24++) {
                                                            arrayList.add(broadcast);
                                                        }
                                                        try {
                                                            bVar6.b(str5, str4, arrayList);
                                                        } catch (SecurityException e4) {
                                                            a2 a2Var6 = a2.SAFETY_FEATURES;
                                                            i2.f36769a.getClass();
                                                            i2.a.g(a2Var6, "EmergencyContactSendRequestActivity", e4);
                                                            emergencyContactSendRequestActivity.pa(false);
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                    } else {
                                                        bVar6.c(str5, str4, broadcast);
                                                    }
                                                }
                                            }
                                        } else {
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        smsManager = null;
                                        wx2.b bVar7 = new wx2.b(f104108a);
                                        if (numValueOf != null) {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        } else {
                                            i2.a.b(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                                            numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
                                        }
                                        Object systemService5 = emergencyContactSendRequestActivity.getSystemService("phone");
                                        systemService5.getClass();
                                        int simState5 = ((TelephonyManager) systemService5).getSimState();
                                        if (numValueOf.intValue() != -1) {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        } else {
                                            i2.a.f(a2Var5, "EmergencyContactSendRequestActivity", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
                                            emergencyContactSendRequestActivity.ma();
                                        }
                                    } else {
                                        emergencyContactSendRequestActivity.ma();
                                    }
                                } else {
                                    a2 a2Var10 = a2.SAFETY_FEATURES;
                                    String str9 = emergencyContactSendRequestActivity.ka().f32657p;
                                    cVar = emergencyContactSendRequestActivity.f32576h;
                                    if (cVar != null) {
                                        str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    } else {
                                        str = null;
                                    }
                                    String strG5 = e0.g("[sendSMSLiveData observer] Error! shouldSend is true but the message body is ", str9, " and the phone number is ", str, "!");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var10, "EmergencyContactSendRequestActivity", strG5);
                                    emergencyContactSendRequestActivity.pa(false);
                                }
                            }
                            break;
                        } else {
                            a2 a2Var11 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var11, "EmergencyContactSendRequestActivity", "[sendSMSLiveData observer] shouldSend is false; doing nothing");
                        }
                        return Unit.INSTANCE;
                    default:
                        EmergencyContactSendRequestActivity.b bVar8 = (EmergencyContactSendRequestActivity.b) obj2;
                        EmergencyContactSendRequestActivity.a aVar10 = EmergencyContactSendRequestActivity.f32570v;
                        EmergencyContactSendRequestActivity emergencyContactSendRequestActivity2 = this.f96563b;
                        emergencyContactSendRequestActivity2.hideProgressOverlay();
                        int i25 = bVar8 == null ? -1 : EmergencyContactSendRequestActivity.c.f32594b[bVar8.ordinal()];
                        if (i25 == -1) {
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else if (i25 == 1) {
                            c22.f fVar = c22.f.f23050a;
                            l20.l lVar = emergencyContactSendRequestActivity2.ka().f32659r;
                            l20.l lVar2 = l20.l.LIVETRACK;
                            c22.f.d(fVar, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(lVar == lVar2 ? R.string.cannot_send_request : R.string.lbl_invalid_mobile_number_title), emergencyContactSendRequestActivity2.getString(emergencyContactSendRequestActivity2.ka().f32659r == lVar2 ? R.string.msg_invalid_phone_number : R.string.msg_contacts_validation_invalid_mobile_phone_number), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_ok), new in2.e((byte) 0, 11)), null, null, false, 112).show();
                        } else if (i25 == 2) {
                            emergencyContactSendRequestActivity2.pa(false);
                        } else if (i25 != 3) {
                            if (i25 != 4) {
                                u0.r();
                                return null;
                            }
                            emergencyContactSendRequestActivity2.displayFailedMessage();
                        } else {
                            c22.f.d(c22.f.f23050a, emergencyContactSendRequestActivity2, emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_title), emergencyContactSendRequestActivity2.getString(R.string.failed_to_send_request_alert_message), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_retry), new h(emergencyContactSendRequestActivity2, 0)), new o13.p(emergencyContactSendRequestActivity2.getString(R.string.lbl_cancel), new h(emergencyContactSendRequestActivity2, 1)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    @o13.e
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        if (ka().f32644c || ka().f32650i) {
            j22.b.f96736a.getClass();
            if (j22.b.E(iArr)) {
                com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b.getClass();
                la(new com.garmin.android.apps.connectmobile.contacts.emergency.e(), "SendFeatureSMSRequestFragment", true);
                return;
            } else {
                com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b.getClass();
                la(new com.garmin.android.apps.connectmobile.contacts.emergency.e(), "SendFeatureSMSRequestFragment", true);
                return;
            }
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m.getClass();
            la(com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a.a(true), "EmergencyContactConfirmFragment", this.f32582n);
        } else {
            com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m.getClass();
            la(com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a.a(false), "EmergencyContactConfirmFragment", this.f32582n);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        e eVar = this.f32572d;
        if (eVar.f32596a) {
            unregisterReceiver(eVar);
            eVar.f32596a = false;
        }
    }

    public final void pa(boolean z14) {
        c22.f.d(c22.f.f23050a, this, getString(R.string.failed_to_send_request_alert_title), getString(z14 ? R.string.msg_network_unavilable : R.string.failed_to_send_sms_request_alert_message), new o13.p(getString(R.string.lbl_retry), new j20.h(this, 2)), new o13.p(getString(R.string.lbl_cancel), new j20.h(this, 3)), null, false, 96).show();
    }

    public final void qa() {
        l20.c cVar = ka().f32647f;
        if (cVar != null && cVar.F()) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EmergencyContactSendRequestActivity", "[startEmergencyContactConfirmFragment] Current contact method is Live Track and Emergency Contact; sending user to confirmation fragment");
            com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m.getClass();
            la(com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a.a(false), "EmergencyContactConfirmFragment", this.f32582n);
            return;
        }
        if (ka().f32658q) {
            a2 a2Var2 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "EmergencyContactSendRequestActivity", "[startEmergencyContactConfirmFragment] Current contact method is an email; sending user to confirmation fragment");
            com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m.getClass();
            la(com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a.a(false), "EmergencyContactConfirmFragment", this.f32582n);
            return;
        }
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96724m;
        j22.a aVar2 = j22.a.f96723l;
        bVar.getClass();
        if (!j22.b.k(aVar, aVar2)) {
            a2 a2Var3 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "EmergencyContactSendRequestActivity", "[startEmergencyContactConfirmFragment] GCM does not have SMS permissions; possibly asking user for them");
            j22.b.x(this, 1, aVar, aVar2);
            return;
        }
        a2 a2Var4 = a2.SAFETY_FEATURES;
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "EmergencyContactSendRequestActivity", "[startEmergencyContactConfirmFragment] GCM has SMS Permissions; now sending user to confirmation fragment");
        com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m.getClass();
        la(com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a.a(true), "EmergencyContactConfirmFragment", this.f32582n);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/EmergencyContactSendRequestActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_SEND_REQUEST_KEY", "EXTRA_CONTACT_METHOD_PRESELECTION", "EXTRA_CONTACT_METHOD_LIST_PRESELECTION", "EXTRA_IS_FROM_EMERGENCY_CONTACT_DETAILS", "EXTRA_IS_LIVE_TRACK_SETUP", "EXTRA_IS_LIVE_TRACK_AND_EC_SETUP", "", "REQUEST_CODE_SMS", "I", "BROADCAST_SMS_SENT", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Activity activity, l20.a aVar, List list, boolean z14, boolean z15, boolean z16, hl.a aVar2) {
            activity.getClass();
            aVar.getClass();
            list.getClass();
            aVar2.getClass();
            Intent intent = new Intent(activity, (Class<?>) EmergencyContactSendRequestActivity.class);
            intent.putExtra("EXTRA_SEND_REQUEST_KEY", aVar);
            if (list.isEmpty()) {
                if (aVar.k().size() == 1) {
                    intent.putExtra("EXTRA_CONTACT_METHOD_PRESELECTION", aVar.k().get(0));
                } else if (z14) {
                    List<l20.c> listK = aVar.k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        if (!((l20.c) obj).D()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() == 1) {
                        List<l20.c> listK2 = aVar.k();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listK2) {
                            if (!((l20.c) obj2).D()) {
                                arrayList2.add(obj2);
                            }
                        }
                        intent.putExtra("EXTRA_CONTACT_METHOD_PRESELECTION", (Parcelable) arrayList2.get(0));
                    }
                }
            } else if (list.size() > 1) {
                intent.putParcelableArrayListExtra("EXTRA_CONTACT_METHOD_LIST_PRESELECTION", new ArrayList<>(list));
            } else {
                intent.putExtra("EXTRA_CONTACT_METHOD_PRESELECTION", (Parcelable) h0.b0(list));
            }
            intent.putExtra("EXTRA_IS_FROM_EMERGENCY_CONTACT_DETAILS", z14);
            intent.putExtra("EXTRA_IS_LIVE_TRACK_SETUP", z15);
            intent.putExtra("EXTRA_IS_LIVE_TRACK_AND_EC_SETUP", z16);
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            return intent;
        }

        public static Intent b(a aVar, Activity activity, l20.a aVar2, List list, boolean z14, boolean z15, hl.a aVar3, int i14) {
            if ((i14 & 32) != 0) {
                z15 = false;
            }
            boolean z16 = z15;
            if ((i14 & 64) != 0) {
                aVar3 = hl.a.c.f84256b;
            }
            aVar.getClass();
            return a(activity, aVar2, list, z14, false, z16, aVar3);
        }

        private a() {
        }
    }
}
