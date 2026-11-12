package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.n3;
import ch1.o3;
import ch1.p3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.cannedtextreply.CannedTextReplyActivity;
import com.garmin.proto.generated.GDISmsNotificationProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import lc.u0;
import ng1.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/CannedTextResponsesActivity;", "Lng1/p;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CannedTextResponsesActivity extends p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f41931o = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f41932m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f41933n = new ArrayList();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41934a;

        static {
            int[] iArr = new int[GDISmsNotificationProto.CannedListType.values().length];
            try {
                iArr[GDISmsNotificationProto.CannedListType.SMS_MESSAGE_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDISmsNotificationProto.CannedListType.PHONE_CALL_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDISmsNotificationProto.CannedListType.GROUP_TRACK_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41934a = iArr;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (ca()) {
            super.onBackPressed();
        } else {
            da();
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        Intent intent = getIntent();
        this.f41932m = intent.getStringExtra("GCM_deviceDisplayName");
        String stringExtra = intent.getStringExtra("GCM_macAddress");
        super.initActionBar(true, R.string.device_settings_canned_text_responses);
        stringExtra.getClass();
        ArrayList<fb2.e> arrayList = this.f41933n;
        arrayList.clear();
        com.garmin.android.apps.connectmobile.cannedtextreply.b bVar = (com.garmin.android.apps.connectmobile.cannedtextreply.b) da2.d.b().getCapability(stringExtra, com.garmin.android.apps.connectmobile.cannedtextreply.b.class);
        if (bVar != null) {
            GDISmsNotificationProto.CapabilitiesResponse capabilitiesResponse = bVar.f31297h;
            if (capabilitiesResponse != null) {
                Iterator<GDISmsNotificationProto.CannedListType> it = capabilitiesResponse.getTypeList().iterator();
                while (it.hasNext()) {
                    GDISmsNotificationProto.CannedListType next = it.next();
                    int i14 = next == null ? -1 : b.f41934a[next.ordinal()];
                    if (i14 == 1) {
                        arrayList.add(new p3(this));
                    } else if (i14 == 2) {
                        arrayList.add(new o3(this));
                    } else {
                        if (i14 != 3) {
                            u0.r();
                            return;
                        }
                        arrayList.add(new n3(this));
                    }
                }
            } else {
                arrayList.add(new p3(this));
                arrayList.add(new o3(this));
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            linearLayout.addView(((fb2.e) it3.next()).a());
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, "");
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (observable instanceof p3) {
            CannedTextReplyActivity.a aVar = CannedTextReplyActivity.f31264o;
            String string = getString(R.string.device_settings_canned_text_response);
            long j8 = this.f125976b;
            String str = this.f41932m;
            String str2 = this.f125978d;
            aVar.getClass();
            CannedTextReplyActivity.a.a(this, string, j8, str, str2, 0);
        }
        if (observable instanceof o3) {
            CannedTextReplyActivity.a aVar2 = CannedTextReplyActivity.f31264o;
            String string2 = getString(R.string.device_settings_incoming_call_response);
            long j14 = this.f125976b;
            String str3 = this.f41932m;
            String str4 = this.f125978d;
            aVar2.getClass();
            CannedTextReplyActivity.a.a(this, string2, j14, str3, str4, 1);
        }
        if (observable instanceof n3) {
            CannedTextReplyActivity.a aVar3 = CannedTextReplyActivity.f31264o;
            String string3 = getString(R.string.group_ride_messages);
            long j15 = this.f125976b;
            String str5 = this.f41932m;
            String str6 = this.f125978d;
            aVar3.getClass();
            CannedTextReplyActivity.a.a(this, string3, j15, str5, str6, 3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/CannedTextResponsesActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            Intent intent = new Intent(context, (Class<?>) CannedTextResponsesActivity.class);
            intent.putExtra("GCM_deviceUnitID", j8);
            intent.putExtra("GCM_deviceProductNbr", str);
            intent.putExtra("GCM_deviceDisplayName", str2);
            intent.putExtra("GCM_macAddress", str3);
            intent.putExtra("GCM_extra_device_image_url", str4);
            return intent;
        }

        private a() {
        }
    }
}
