package com.garmin.android.apps.connectmobile;

import android.content.DialogInterface;
import android.widget.Toast;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class z0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f49776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f49777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DatabaseTableBrowserActivity f49778c;

    public z0(DatabaseTableBrowserActivity databaseTableBrowserActivity, long j8, String str) {
        this.f49778c = databaseTableBrowserActivity;
        this.f49776a = j8;
        this.f49777b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        lc0.k kVar = (lc0.k) KoinJavaComponent.get$default(lc0.k.class, null, null, 6, null);
        final int i15 = 0;
        final String str = this.f49777b;
        e23.l lVar = new e23.l(this) { // from class: com.garmin.android.apps.connectmobile.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f49763b;

            {
                this.f49763b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        vm2.h hVar = (vm2.h) obj;
                        DatabaseTableBrowserActivity databaseTableBrowserActivity = this.f49763b.f49778c;
                        boolean z14 = hVar != null ? hVar.f178831a : false;
                        String str2 = str;
                        Toast.makeText(databaseTableBrowserActivity, z14 ? databaseTableBrowserActivity.getResources().getString(R.string.device_action_msg_remove_device_success, str2) : databaseTableBrowserActivity.getResources().getString(R.string.device_action_msg_remove_device_failure, str2), 1).show();
                        break;
                    default:
                        DatabaseTableBrowserActivity databaseTableBrowserActivity2 = this.f49763b.f49778c;
                        Toast.makeText(databaseTableBrowserActivity2, databaseTableBrowserActivity2.getResources().getString(R.string.device_action_msg_remove_device_failure, str), 1).show();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i16 = 1;
        kVar.a(this.f49776a, true, lVar, new e23.l(this) { // from class: com.garmin.android.apps.connectmobile.y0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f49763b;

            {
                this.f49763b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        vm2.h hVar = (vm2.h) obj;
                        DatabaseTableBrowserActivity databaseTableBrowserActivity = this.f49763b.f49778c;
                        boolean z14 = hVar != null ? hVar.f178831a : false;
                        String str2 = str;
                        Toast.makeText(databaseTableBrowserActivity, z14 ? databaseTableBrowserActivity.getResources().getString(R.string.device_action_msg_remove_device_success, str2) : databaseTableBrowserActivity.getResources().getString(R.string.device_action_msg_remove_device_failure, str2), 1).show();
                        break;
                    default:
                        DatabaseTableBrowserActivity databaseTableBrowserActivity2 = this.f49763b.f49778c;
                        Toast.makeText(databaseTableBrowserActivity2, databaseTableBrowserActivity2.getResources().getString(R.string.device_action_msg_remove_device_failure, str), 1).show();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
