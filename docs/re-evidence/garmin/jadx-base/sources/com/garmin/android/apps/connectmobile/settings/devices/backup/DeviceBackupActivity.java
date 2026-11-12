package com.garmin.android.apps.connectmobile.settings.devices.backup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.room.a0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import e23.l;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import pg1.d;
import tg1.e;
import tg1.o;
import tg1.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/backup/DeviceBackupActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "Lsg1/a;", "applyBackupUiState", "deleteBackupUiState", "Lsg1/d;", "deviceBackups", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceBackupActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f42558c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42559a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42560b = -1;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<ug1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f42561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f42562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f42563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f42564d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f42561a = gVar;
            this.f42562b = qualifier;
            this.f42563c = aVar;
            this.f42564d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ug1.c] */
        @Override // e23.a
        public final ug1.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f42561a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f42563c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ug1.c.class), viewModelStore, null, defaultViewModelCreationExtras, this.f42562b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f42564d, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ca(e23.a aVar, l lVar, d dVar, p3.m mVar, int i14) {
        o0 o0VarO = a0.o(aVar, lVar, mVar, 891955142);
        int i15 = (o0VarO.r(aVar) ? 4 : 2) | i14 | (o0VarO.r(lVar) ? 32 : 16) | (o0VarO.r(dVar) ? 256 : 128) | (o0VarO.r(this) ? 2048 : 1024);
        int i16 = 0;
        if (o0VarO.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = (i15 << 3) & 112;
            int i18 = i15 << 6;
            e.a((sg1.d) p0.c(ga().f170649f, o0VarO, 0).getF182175a(), aVar, new d(this, i16), lVar, dVar, o0VarO, i17 | (i18 & 7168) | (i18 & 57344));
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) this, (Object) aVar, lVar, (Object) dVar, i14, 20);
        }
    }

    public final void da(sg1.b bVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1515157826);
        int i15 = 2;
        int i16 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            s.b(bVar, new pg1.a(this, i15), aVar, o0VarE, ((i16 << 3) & 896) | (i16 & 14));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(this, bVar, aVar, i14, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ea(e23.a aVar, e23.a aVar2, l lVar, d dVar, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2117966859);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(dVar) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 << 6;
            o.c((sg1.d) p0.c(ga().f170647d, o0VarE, 0).getF182175a(), lVar, aVar, aVar2, dVar, o0VarE, ((i15 >> 3) & 112) | (i16 & 896) | (i16 & 7168) | ((i15 << 3) & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) this, (Object) aVar, (Object) aVar2, (h) lVar, (h) dVar, i14, 9);
        }
    }

    public final void fa(int i14, e23.a aVar, p3.m mVar, d dVar, sg1.b bVar) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-268093218);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            tg1.l.a(((i15 << 3) & 896) | (i15 & 14) | ((i15 >> 3) & 112), aVar, o0VarE, dVar, bVar);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) this, (Object) bVar, (Object) dVar, (Object) aVar, i14, 21);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final ug1.c ga() {
        return (ug1.c) this.f42559a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        this.f42560b = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1724991250, true, new pg1.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/backup/DeviceBackupActivity$a;", "", "<init>", "()V", "", "DEVICE_BACKUPS_NAV_KEY", "Ljava/lang/String;", "ALL_BACKUPS_NAV_KEY", "SINGLE_DEVICE_BACKUP", "VIEW_BACKUP", "BACKUP_ID_KEY", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8) {
            return l2.d(context, DeviceBackupActivity.class, "GCM_deviceUnitID", j8);
        }

        private a() {
        }
    }
}
