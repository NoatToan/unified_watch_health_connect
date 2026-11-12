package com.garmin.android.apps.connectmobile.devices.settings.tutorials;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import yr.o0;
import z3.e;
import zc0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/tutorials/DeviceTutorialsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceTutorialsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34381b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34382a = m.a(n.NONE, new b(this, null, null, new o0(this, 16)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f34383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34386d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34383a = gVar;
            this.f34384b = qualifier;
            this.f34385c = aVar;
            this.f34386d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, zc0.c] */
        @Override // e23.a
        public final c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f34383a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f34385c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(c.class), f189591b, null, defaultViewModelCreationExtras, this.f34384b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34386d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new e(-1496163365, true, new zc0.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/tutorials/DeviceTutorialsActivity$a;", "", "<init>", "()V", "", "PRODUCT_NUMBER_KEY", "Ljava/lang/String;", "PRODUCT_DISPLAY_NAME_KEY", "APPLICATION_KEY_KEY", "IMAGE_DATA_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, String str, String str2, String str3, o90.a aVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) DeviceTutorialsActivity.class);
            intent.putExtra("product_number", str);
            intent.putExtra("product_display_name", str2);
            intent.putExtra("application_key", str3);
            intent.putExtra("image_data", aVar);
            return intent;
        }

        private a() {
        }
    }
}
