package hc0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import c22.e1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import org.koin.java.KoinJavaComponent;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83202a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f83205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f83206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f83207f;

    public /* synthetic */ a(b bVar, b.d dVar, gc0.e eVar, sd2.f fVar, int i14) {
        this.f83204c = bVar;
        this.f83205d = dVar;
        this.f83206e = eVar;
        this.f83207f = fVar;
        this.f83203b = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        switch (this.f83202a) {
            case 0:
                b bVar = (b) this.f83204c;
                b.d dVar = (b.d) this.f83205d;
                gc0.e eVar = (gc0.e) this.f83206e;
                sd2.f fVar = (sd2.f) this.f83207f;
                Drawable drawable = bVar.f83214g;
                TextView textView = dVar.f83221b;
                sd2.f fVar2 = eVar.f76845a;
                textView.setText(!TextUtils.isEmpty(fVar2.getDisplayName()) ? fVar2.getDisplayName() : fVar2.getProductDisplayName());
                j22.b bVar2 = j22.b.f96736a;
                Context context = dVar.f83220a.getContext();
                bVar2.getClass();
                boolean zB = j22.b.b(context);
                boolean zE = km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, fVar2.getUnitID());
                String productNumber = fVar2.getProductNumber();
                u0 u0Var = u0.H0;
                u0 u0Var2 = u0.P5;
                u0 u0Var3 = u0.S5;
                boolean zN = u0.n(productNumber, u0Var, u0Var2, u0Var3);
                String productNumber2 = fVar2.getProductNumber();
                u0 u0Var4 = u0.Y5;
                boolean zN2 = u0.n(productNumber2, u0Var4);
                int i19 = gc0.e.a.f76854a[eVar.f76847c.ordinal()];
                int i24 = R.drawable.sync;
                switch (i19) {
                    case 1:
                        z14 = zE;
                        z15 = zN;
                        i14 = -1;
                        i15 = 4;
                        i16 = 0;
                        iArr = new int[]{-1, -1, -1, -1};
                        break;
                    case 2:
                    case 3:
                        z14 = zE;
                        z15 = zN;
                        i14 = -1;
                        i15 = 4;
                        i16 = 0;
                        iArr = new int[]{R.string.devices_sync_in_progress, -1, -1, -1};
                        break;
                    case 4:
                        z14 = zE;
                        z15 = zN;
                        i16 = 0;
                        if (z14) {
                            i14 = -1;
                            i17 = R.drawable.sync;
                        } else {
                            i17 = -1;
                            i14 = -1;
                        }
                        iArr = new int[]{R.string.devices_sync_sending_software_update, i14, i17, i14};
                        i15 = 4;
                        break;
                    case 5:
                    case 6:
                        z14 = zE;
                        z15 = zN;
                        if ((((eVar.f76848d == -1 || eVar.f76847c != gc0.f.FINISHED_FAILURE) && eVar.f76847c != gc0.f.FINISHED_SUCCESS) ? -1.0d : (System.currentTimeMillis() - eVar.f76848d) / 1000.0d) >= 8.0d) {
                            i16 = 0;
                            i14 = -1;
                            i15 = 4;
                            iArr = null;
                        } else {
                            iArr = new int[4];
                            i16 = 0;
                            if (eVar.f76847c == gc0.f.FINISHED_SUCCESS) {
                                iArr[0] = R.string.devices_sync_complete;
                                iArr[1] = -1;
                                iArr[2] = z14 ? R.drawable.sync : -1;
                            } else {
                                iArr[0] = R.string.devices_sync_failed;
                                iArr[1] = 2131231971;
                                iArr[2] = -1;
                            }
                            iArr[3] = -1;
                            i14 = -1;
                            i15 = 4;
                        }
                        break;
                    default:
                        z14 = zE;
                        z15 = zN;
                        i16 = 0;
                        i14 = -1;
                        i15 = 4;
                        iArr = null;
                        break;
                }
                int i25 = i14;
                boolean zE2 = ((l80.b) KoinJavaComponent.get(l80.b.class)).e(fVar2);
                if (iArr == null) {
                    iArr = new int[i15];
                    iArr[3] = i25;
                    if (z15) {
                        if (fVar2.T()) {
                            iArr[i16] = i25;
                            iArr[1] = 2131231972;
                            iArr[2] = i25;
                        } else {
                            iArr[i16] = i25;
                            iArr[1] = i25;
                            iArr[2] = i25;
                        }
                    } else if (zN2 && !zE2) {
                        iArr[i16] = i25;
                        iArr[1] = 2131231972;
                        iArr[2] = i25;
                    } else if (!fVar2.S()) {
                        iArr[i16] = R.string.device_settings_ready_to_use;
                        iArr[1] = 2131231971;
                        iArr[2] = i25;
                    } else if (zE2) {
                        iArr[i16] = R.string.txt_garmin_device_connected;
                        iArr[1] = i25;
                        if (!z14) {
                            i24 = -1;
                        }
                        iArr[2] = i24;
                    } else if (eVar.f76850f) {
                        iArr[i16] = R.string.devices_ready_to_sync;
                        if (eVar.b()) {
                            iArr[1] = R.drawable.exterior_link;
                            iArr[3] = R.color.gds_data_viz_neutral_primary;
                        } else {
                            iArr[1] = 2131231972;
                        }
                        iArr[2] = -1;
                    } else {
                        iArr[i16] = R.string.devices_not_connected;
                        if (eVar.b()) {
                            iArr[1] = R.drawable.exterior_link;
                            iArr[3] = R.color.gds_data_viz_neutral_primary;
                        } else {
                            iArr[1] = 2131231972;
                        }
                        iArr[2] = -1;
                    }
                }
                if (!z15 || fVar2.T()) {
                    if (!zB) {
                        iArr[i16] = R.string.permission_nearby_devices_not_granted;
                    } else if (!e1.a()) {
                        iArr[i16] = R.string.devices_bluetooth_turned_off;
                    }
                }
                int i26 = iArr[i16];
                int i27 = iArr[1];
                int i28 = iArr[3];
                int i29 = iArr[2];
                if (i29 == -1) {
                    dVar.f83227h.setVisibility(4);
                } else {
                    dVar.f83224e.setImageResource(i29);
                    dVar.f83227h.setVisibility(i16);
                }
                gc0.f fVar3 = eVar.f76847c;
                gc0.f fVar4 = gc0.f.INITIATED;
                ProgressBar progressBar = dVar.f83228i;
                if (fVar3 == fVar4) {
                    progressBar.setVisibility(0);
                } else {
                    progressBar.setVisibility(8);
                }
                boolean zN3 = u0.n(fVar2.getProductNumber(), u0Var, u0Var2, u0Var3);
                boolean zN4 = u0.n(fVar2.getProductNumber(), u0Var4);
                if (i26 == -1 && ((zN3 || zN4) && fVar2.T())) {
                    dVar.f83222c.setText(new gc0.d(new l22.a(bVar.f83211d.getContext())).a(eVar.f76853i));
                    i18 = 0;
                    dVar.f83222c.setVisibility(0);
                } else {
                    TextView textView2 = dVar.f83222c;
                    if (i26 == -1) {
                        textView2.setText("");
                        dVar.f83222c.setVisibility(4);
                        i18 = 0;
                    } else {
                        textView2.setText(i26);
                        i18 = 0;
                        dVar.f83222c.setVisibility(0);
                    }
                }
                ProgressBar progressBar2 = dVar.f83226g;
                if (i26 == R.string.devices_sync_in_progress) {
                    progressBar2.setProgress(eVar.f76849e);
                    dVar.f83226g.setProgressDrawable(drawable);
                    dVar.f83226g.setVisibility(i18);
                    dVar.f83228i.setVisibility(8);
                    fVar2.getProductDisplayName();
                } else if (i26 == R.string.devices_sync_sending_software_update) {
                    progressBar2.setProgress(eVar.f76849e);
                    dVar.f83226g.setProgressDrawable(drawable);
                    dVar.f83226g.setVisibility(i18);
                    fVar2.getProductDisplayName();
                } else if (i26 == R.string.devices_sync_complete) {
                    progressBar2.setProgress(eVar.f76849e);
                    dVar.f83226g.setProgressDrawable(bVar.f83215h);
                    dVar.f83226g.setVisibility(i18);
                    k kVar = (k) bVar.f83213f;
                    kVar.D.postDelayed(new com.google.android.exoplayer2.audio.d(kVar, fVar2.getUnitID(), 2), 6000L);
                    fVar2.getProductDisplayName();
                } else if (i26 == R.string.devices_sync_failed) {
                    progressBar2.setVisibility(8);
                    fVar2.getProductDisplayName();
                } else {
                    progressBar2.setVisibility(8);
                }
                if (!fVar.S() && zB && oa2.a.c(fVar.d0())) {
                    i27 = -1;
                }
                if (i27 == -1) {
                    dVar.f83223d.setVisibility(4);
                    dVar.f83223d.setOnClickListener(null);
                    dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_listview_position, null);
                    dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_resource_id, null);
                } else {
                    Rect rect = new Rect();
                    dVar.f83223d.setVisibility(0);
                    dVar.f83223d.setImageResource(i27);
                    if (i28 != -1) {
                        dVar.f83223d.setImageTintList(a7.b.getColorStateList(dVar.f83220a.getContext(), i28));
                    }
                    dVar.f83223d.setOnClickListener(bVar.f83216i);
                    dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_listview_position, Integer.valueOf(this.f83203b));
                    dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_resource_id, Integer.valueOf(i27));
                    dVar.f83223d.getHitRect(rect);
                    int i30 = rect.top;
                    int i34 = bVar.f83212e;
                    rect.top = i30 - i34;
                    rect.bottom += i34;
                    rect.left -= i34;
                    rect.right += i34;
                    ((View) dVar.f83223d.getParent()).setTouchDelegate(new TouchDelegate(rect, dVar.f83223d));
                }
                break;
            default:
                la2.e.a aVar = (la2.e.a) this.f83204c;
                la2.a aVar2 = (la2.a) this.f83205d;
                DeviceProfile deviceProfile = (DeviceProfile) this.f83206e;
                int i35 = this.f83203b;
                String str = (String) this.f83207f;
                try {
                    aVar2.onDeviceDisconnected(new la2.h(deviceProfile, i35, null));
                } catch (Throwable th3) {
                    la2.e.this.f111648g.error("onDeviceDisconnected callback failed: " + str, th3);
                }
                break;
        }
    }

    public /* synthetic */ a(la2.e.a aVar, la2.a aVar2, DeviceProfile deviceProfile, int i14, String str) {
        this.f83204c = aVar;
        this.f83205d = aVar2;
        this.f83206e = deviceProfile;
        this.f83203b = i14;
        this.f83207f = str;
    }
}
