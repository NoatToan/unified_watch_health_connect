package com.garmin.android.apps.connectmobile.golf.truswing;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import bs2.bx;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;
import wl0.t;
import wl0.y;

/* JADX INFO: loaded from: classes8.dex */
public class TruSwingRawDataActivity extends Activity implements Observer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35796c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f35797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f35798b;

    public class a extends g22.c<Void, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hc2.b f35799c;

        public a(hc2.b bVar) {
            this.f35799c = bVar;
        }

        @Override // g22.c
        public final String b(Void[] voidArr) throws Throwable {
            t tVarA;
            try {
                hc2.b bVar = this.f35799c;
                tVarA = y.a(bVar.f83281a, bVar.f83282b, bVar.f83283c);
            } catch (Exception unused) {
                a2 a2Var = a2.GOLF;
                int i14 = TruSwingRawDataActivity.f35796c;
                i2.a(a2Var, "TruSwingRawDataActivity", "Error parsing swing data");
                tVarA = null;
            }
            if (tVarA == null) {
                return "Error parsing swing data.";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Club Name: " + tVarA.f185997b);
            sb3.append("\nClub Type Name: " + tVarA.f185998c);
            if (tVarA.f185999d != null) {
                sb3.append("\nSwing Metrics:\n------------------------------------------------------");
                if (tVarA.f185999d.getTimestamp() != null) {
                    sb3.append("\n   Timestamp: ");
                    sb3.append(tVarA.f185999d.getTimestamp().a());
                }
                if (tVarA.f185999d.h(0) != null) {
                    sb3.append("\n   Swing Speed: ");
                    sb3.append(tVarA.f185999d.h(0));
                }
                if (tVarA.f185999d.j(15, 65535) != null) {
                    sb3.append("\n   Club Id Upper: ");
                    sb3.append(tVarA.f185999d.j(15, 65535));
                }
                if (tVarA.f185999d.j(16, 65535) != null) {
                    sb3.append("\n   Club Id Lower: ");
                    sb3.append(tVarA.f185999d.j(16, 65535));
                }
                if (tVarA.f185999d.h(1) != null) {
                    sb3.append("\n   Backswing Time: ");
                    sb3.append(tVarA.f185999d.h(1));
                }
                if (tVarA.f185999d.h(2) != null) {
                    sb3.append("\n   Downswing Time: ");
                    sb3.append(tVarA.f185999d.h(2));
                }
                if (tVarA.f185999d.h(3) != null) {
                    sb3.append("\n   ShaftLeanAtAddress: ");
                    sb3.append(tVarA.f185999d.h(3));
                }
                if (tVarA.f185999d.h(4) != null) {
                    sb3.append("\n   ShaftAngleAtAddress: ");
                    sb3.append(tVarA.f185999d.h(4));
                }
                if (tVarA.f185999d.h(5) != null) {
                    sb3.append("\n   ClubPathAtImpact: ");
                    sb3.append(tVarA.f185999d.h(5));
                }
                if (tVarA.f185999d.h(7) != null) {
                    sb3.append("\n   FaceAngleAtImpact: ");
                    sb3.append(tVarA.f185999d.h(7));
                }
                if (tVarA.f185999d.h(9) != null) {
                    sb3.append("\n   ClubLoftAtImpact: ");
                    sb3.append(tVarA.f185999d.h(9));
                }
                if (tVarA.f185999d.h(10) != null) {
                    sb3.append("\n   ShaftLeanAtImpact: ");
                    sb3.append(tVarA.f185999d.h(10));
                }
                if (tVarA.f185999d.h(11) != null) {
                    sb3.append("\n   ShaftAngleAtImpact: ");
                    sb3.append(tVarA.f185999d.h(11));
                }
                if (tVarA.f185999d.h(12) != null) {
                    sb3.append("\n   FrontVectorNorth: ");
                    sb3.append(tVarA.f185999d.h(12));
                }
                if (tVarA.f185999d.h(13) != null) {
                    sb3.append("\n   FrontVectorEast: ");
                    sb3.append(tVarA.f185999d.h(13));
                }
                if (tVarA.f185999d.h(14) != null) {
                    sb3.append("\n   FrontVectorGround: ");
                    sb3.append(tVarA.f185999d.h(14));
                }
                sb3.append("\n\n");
            }
            sb3.append("Swing Path:");
            for (bx bxVar : tVarA.f186000e) {
                sb3.append("\n------------------------------------------------------");
                if (bxVar.h(0) != null) {
                    sb3.append("\n   Qx: ");
                    sb3.append(bxVar.h(0));
                }
                if (bxVar.h(1) != null) {
                    sb3.append("\n   Qy: ");
                    sb3.append(bxVar.h(1));
                }
                if (bxVar.h(2) != null) {
                    sb3.append("\n   Qz: ");
                    sb3.append(bxVar.h(2));
                }
                if (bxVar.h(3) != null) {
                    sb3.append("\n   Qs: ");
                    sb3.append(bxVar.h(3));
                }
                if (bxVar.h(4) != null) {
                    sb3.append("\n   Sx: ");
                    sb3.append(bxVar.h(4));
                }
                if (bxVar.h(5) != null) {
                    sb3.append("\n   Sy: ");
                    sb3.append(bxVar.h(5));
                }
                if (bxVar.h(6) != null) {
                    sb3.append("\n   Sz: ");
                    sb3.append(bxVar.h(6));
                }
            }
            String string = sb3.toString();
            a2 a2Var2 = a2.GOLF;
            int i15 = TruSwingRawDataActivity.f35796c;
            i2.a(a2Var2, "TruSwingRawDataActivity", "Swing Data:\n".concat(string));
            return string;
        }

        @Override // g22.c
        public final void d(String str) {
            TruSwingRawDataActivity.this.f35797a.setText(str);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_truswing_raw_data);
        this.f35797a = (TextView) findViewById(R.id.raw_swing);
        this.f35798b = new Handler();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        wl0.h.i().deleteObserver(this);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        wl0.h.i().addObserver(this);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        hc2.c.a aVar = (hc2.c.a) obj;
        if (aVar.f83291a != hc2.c.a.EnumC1639a.NEW_SWING_DATA) {
            return;
        }
        hc2.b bVar = (hc2.b) aVar.f83292b;
        i2.a(a2.GOLF, "TruSwingRawDataActivity", "Received data for new swing");
        this.f35798b.post(new vg1.d(12, this, bVar));
    }
}
