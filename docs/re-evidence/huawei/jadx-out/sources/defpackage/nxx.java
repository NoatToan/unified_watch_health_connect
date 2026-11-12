package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import health.compact.a.LogAnonymous;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nxx implements SportLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43925c;
    private IndoorTvBaseDisplay d;
    private boolean e;
    private IndoorEquipViewModel i;

    private nxx() {
        this.f43923a = 0;
        LogUtil.a("Track_IDEQ_IndoorEquipTvDisplayEngine", "constructor");
    }

    public static nxx d(Context context, boolean z, IndoorEquipViewModel indoorEquipViewModel) {
        nxx nxxVar = e.f43927b;
        nxxVar.b(context, z, indoorEquipViewModel);
        return nxxVar;
    }

    public String d() {
        return "Track_IDEQ_IndoorEquipTvDisplayEngine";
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.onPauseSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.onResumeSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.onStartSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.m825x32b3e3a1();
        }
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final nxx f43927b = new nxx();
    }

    private void b(Context context, boolean z, IndoorEquipViewModel indoorEquipViewModel) {
        this.f43924b = z;
        this.f43925c = context;
        this.i = indoorEquipViewModel;
        if (indoorEquipViewModel != null) {
            if (indoorEquipViewModel.a() != null) {
                LogUtil.a("Track_IDEQ_IndoorEquipTvDisplayEngine", "mViewModel.getSupportDataRange().getMax", Integer.valueOf(this.i.a().getMaxLevel()));
                LogUtil.a("Track_IDEQ_IndoorEquipTvDisplayEngine", "mViewModel.getSupportDataRange().getMin", Integer.valueOf(this.i.a().getMinLevel()));
            }
            this.f43923a = this.i.getSportType();
        }
    }

    public void b(boolean z) {
        this.f43924b = z;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void c() {
        LogUtil.a("Track_IDEQ_IndoorEquipTvDisplayEngine", "tvShow()");
        Context context = this.f43925c;
        if (context == null || !(context.getSystemService("display") instanceof DisplayManager)) {
            LogUtil.e("Track_IDEQ_IndoorEquipTvDisplayEngine", "DisplayManager instant of getSystemService or context is null", this.f43925c);
            return;
        }
        Display[] displays = ((DisplayManager) this.f43925c.getSystemService("display")).getDisplays();
        if (displays.length <= 1 || qrs.ah(this.f43925c)) {
            return;
        }
        if (this.e) {
            a(displays);
        } else if (this.f43923a == 264) {
            d(displays);
        } else {
            e(displays);
        }
    }

    private void d(Display[] displayArr) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay == null || !indoorTvBaseDisplay.isShowing()) {
            this.d = new nyf(this.f43925c, displayArr[1], this.f43924b, this.i);
            nzc.b(this.f43925c, this.i.l());
        }
        this.d.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: nxx.2
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent != null && i == 4 && keyEvent.getAction() == 0) {
                    Toast.makeText(nxx.this.f43925c, nxx.this.f43925c.getString(R.string.ie_back_tips_u_need_press_stop_button), 0).show();
                }
                return false;
            }
        });
        this.d.setCanceledOnTouchOutside(false);
        e();
    }

    private void e(Display[] displayArr) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay == null || !indoorTvBaseDisplay.isShowing()) {
            this.d = new nxy(this.f43925c, displayArr[1], this.f43924b, this.i);
            nzc.b(this.f43925c, this.i.l());
        }
        this.d.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: nyc
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.e.d(dialogInterface, i, keyEvent);
            }
        });
        this.d.setCanceledOnTouchOutside(false);
        e();
    }

    /* synthetic */ boolean d(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent != null && i == 4 && keyEvent.getAction() == 0) {
            Context context = this.f43925c;
            Toast.makeText(context, context.getString(R.string.ie_back_tips_u_need_stop_machine), 0).show();
        }
        return false;
    }

    private void a(Display[] displayArr) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay == null || !indoorTvBaseDisplay.isShowing()) {
            this.d = new nxz(this.f43925c, displayArr[1], this.f43924b, this.i);
            nzc.b(this.f43925c, this.i.l());
        }
        this.d.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: nxx.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent != null && i == 4 && keyEvent.getAction() == 0) {
                    Toast.makeText(nxx.this.f43925c, nxx.this.f43925c.getString(R.string.ie_back_tips_u_need_press_stop_button), 0).show();
                }
                return false;
            }
        });
        this.d.setCanceledOnTouchOutside(false);
        e();
    }

    private void e() {
        try {
            a();
            IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
            if (indoorTvBaseDisplay == null || indoorTvBaseDisplay.isShowing()) {
                return;
            }
            this.d.show();
        } catch (WindowManager.BadTokenException | WindowManager.InvalidDisplayException | IllegalArgumentException | IllegalStateException e2) {
            LogUtil.e("Track_IDEQ_IndoorEquipTvDisplayEngine", "displayShow exception = ", LogAnonymous.b(e2));
        }
    }

    public void b(Map<Integer, Object> map) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.updateUi(map);
        }
    }

    public void d(int i) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.updateProgress(i);
        }
    }

    public void a(String str) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.setBtConnectState(str);
        }
    }

    public void e(Map<String, Object> map) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay == null || !(indoorTvBaseDisplay instanceof nxz)) {
            return;
        }
        ((nxz) indoorTvBaseDisplay).c(map);
    }

    public void c(int i) {
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay == null || !(indoorTvBaseDisplay instanceof nxz)) {
            return;
        }
        ((nxz) indoorTvBaseDisplay).b(i);
    }

    public void a() {
        LogUtil.a("Track_IDEQ_IndoorEquipTvDisplayEngine", "dismiss()");
        IndoorTvBaseDisplay indoorTvBaseDisplay = this.d;
        if (indoorTvBaseDisplay != null) {
            indoorTvBaseDisplay.dismiss();
        } else {
            LogUtil.e("Track_IDEQ_IndoorEquipTvDisplayEngine", "mIndoorTreadmillTvDisplay = null");
        }
    }
}
