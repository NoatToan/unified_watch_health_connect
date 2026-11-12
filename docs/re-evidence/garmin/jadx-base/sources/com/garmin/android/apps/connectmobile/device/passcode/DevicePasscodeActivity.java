package com.garmin.android.apps.connectmobile.device.passcode;

import aa2.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import java.util.Iterator;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import s80.f;
import y92.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/passcode/DevicePasscodeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "Laa2/u;", "viewModel", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevicePasscodeActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f33744a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f33745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33748d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33745a = gVar;
            this.f33746b = qualifier;
            this.f33747c = aVar;
            this.f33748d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [aa2.u, androidx.lifecycle.u1] */
        @Override // e23.a
        public final u invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f33745a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33747c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(u.class), f189591b, null, defaultViewModelCreationExtras, this.f33746b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33748d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object next;
        Integer numValueOf;
        Object next2;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        Intent intent = getIntent();
        long longExtra = intent != null ? intent.getLongExtra("EXTRA_DEVICE_UNIT_ID", 0L) : 0L;
        ca2.a.C0407a c0407a = ca2.a.f26595e;
        Intent intent2 = getIntent();
        String stringExtra = intent2 != null ? intent2.getStringExtra("EXTRA_DEVICE_PASSCODE_FLOW") : null;
        c0407a.getClass();
        Iterator<T> it = ca2.a.f26600j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((ca2.a) next).f26601a, stringExtra));
        ca2.a aVar = (ca2.a) next;
        if (aVar == null) {
            aVar = ca2.a.SET_PASSCODE;
        }
        e.a aVar2 = e.f195299b;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            e eVar = e.DEVICE_SETTINGS;
            aVar2.getClass();
            eVar.getClass();
            numValueOf = Integer.valueOf(intent3.getIntExtra("EXTRA_DEVICE_PASSCODE_SOURCE", eVar.f195304a.getNumber()));
        } else {
            numValueOf = null;
        }
        aVar2.getClass();
        Iterator<T> it3 = e.f195303f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            int number = ((e) next2).f195304a.getNumber();
            if (numValueOf != null && number == numValueOf.intValue()) {
                break;
            }
        }
        e eVar2 = (e) next2;
        if (eVar2 == null) {
            eVar2 = e.DEVICE_SETTINGS;
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1936282587, true, new f(this, m.a(n.NONE, new b(this, null, null, new d62.s(longExtra, aVar, eVar2))), 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/passcode/DevicePasscodeActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_UNIT_ID", "Ljava/lang/String;", "EXTRA_DEVICE_PASSCODE_FLOW", "EXTRA_DEVICE_PASSCODE_SOURCE", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, ca2.a aVar, e eVar) {
            context.getClass();
            aVar.getClass();
            eVar.getClass();
            Intent intent = new Intent(context, (Class<?>) DevicePasscodeActivity.class);
            intent.putExtra("EXTRA_DEVICE_UNIT_ID", j8);
            intent.putExtra("EXTRA_DEVICE_PASSCODE_FLOW", aVar.f26601a);
            e.f195299b.getClass();
            intent.putExtra("EXTRA_DEVICE_PASSCODE_SOURCE", eVar.f195304a.getNumber());
            return intent;
        }

        private a() {
        }
    }
}
