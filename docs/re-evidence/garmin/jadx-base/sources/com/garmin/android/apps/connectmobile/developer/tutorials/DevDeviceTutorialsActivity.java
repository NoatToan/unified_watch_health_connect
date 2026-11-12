package com.garmin.android.apps.connectmobile.developer.tutorials;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.settings.tutorials.DeviceTutorialsActivity;
import d90.i;
import d90.j;
import e23.l;
import k80.g;
import k80.m;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/DevDeviceTutorialsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "Lk80/g;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevDeviceTutorialsActivity extends com.garmin.android.apps.connectmobile.d implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33700b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f33701a = new w1(s0.f105811a.b(k80.a.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33702a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.GESTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.REVISIT_TUTORIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.SHOW_DEVICE_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f33702a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f33703a;

        public c(l lVar) {
            lVar.getClass();
            this.f33703a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f33703a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33703a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33704a;

        public d(b.g gVar) {
            this.f33704a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f33704a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33705a;

        public e(b.g gVar) {
            this.f33705a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f33705a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f33706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f33707b;

        public f(e23.a aVar, b.g gVar) {
            this.f33706a = aVar;
            this.f33707b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f33706a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f33707b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // k80.g
    public final void B2(l90.b bVar, m mVar) {
        String str = bVar.f111516a;
        String str2 = bVar.f111521f;
        String str3 = bVar.f111522g;
        o90.a aVar = bVar.f111526k;
        d90.d dVar = bVar.f111531p;
        mVar.getClass();
        int i14 = b.f33702a[mVar.ordinal()];
        if (i14 == 1) {
            i iVar = dVar.f58436b;
            j jVar = iVar != null ? iVar.f58474a : null;
            if (jVar == null) {
                Toast.makeText(this, "Pair tutorial not defined for this device", 0).show();
                return;
            }
            com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
            com.garmin.android.apps.connectmobile.developer.tutorials.a.b.c cVar = new com.garmin.android.apps.connectmobile.developer.tutorials.a.b.c(jVar, aVar, iVar);
            c0558a.getClass();
            com.garmin.android.apps.connectmobile.developer.tutorials.a aVarA = com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a.a(cVar, str3, str2, str);
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.l(R.id.content_frame, aVarA, null);
            aVar2.d(null);
            aVar2.e();
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            DeviceTutorialsActivity.f34381b.getClass();
            startActivity(DeviceTutorialsActivity.a.a(this, str3, str2, str, aVar));
            return;
        }
        d90.h hVar = dVar.f58442h;
        if (hVar == null) {
            hVar = dVar.f58443i;
        }
        if (hVar == null) {
            Toast.makeText(this, "Gesture tutorial not defined for this device", 0).show();
            return;
        }
        com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a2 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
        com.garmin.android.apps.connectmobile.developer.tutorials.a.b.C0560b c0560b = new com.garmin.android.apps.connectmobile.developer.tutorials.a.b.C0560b(hVar.f58467a, aVar, -1L, hVar);
        c0558a2.getClass();
        com.garmin.android.apps.connectmobile.developer.tutorials.a aVarA2 = com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a.a(c0560b, str3, str2, str);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
        aVar3.l(R.id.content_frame, aVarA2, null);
        aVar3.d(null);
        aVar3.e();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((k80.a) this.f33701a.getValue()).f103331a.f(this, new c(new iz1.f(this, 20)));
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c.getClass();
        aVar.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.developer.tutorials.c(), null);
        aVar.e();
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        if (i14 == 123) {
            j22.b.f96736a.getClass();
            if (!j22.b.E(iArr)) {
                Toast.makeText(this, j22.b.f(j22.a.f96721j), 0).show();
                finish();
                return;
            }
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c.getClass();
            aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.developer.tutorials.c(), null);
            aVarB.e();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/DevDeviceTutorialsActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_STORAGE_PERMISSION", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
